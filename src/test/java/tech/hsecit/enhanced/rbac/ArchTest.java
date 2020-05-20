package tech.hsecit.enhanced.rbac;

import static com.tngtech.archunit.lang.syntax.ArchRuleDefinition.noClasses;

import com.tngtech.archunit.core.domain.JavaClasses;
import com.tngtech.archunit.core.importer.ClassFileImporter;
import com.tngtech.archunit.core.importer.ImportOption;
import org.junit.jupiter.api.Test;

class ArchTest {

    @Test
    void servicesAndRepositoriesShouldNotDependOnWebLayer() {
        JavaClasses importedClasses = new ClassFileImporter()
            .withImportOption(ImportOption.Predefined.DO_NOT_INCLUDE_TESTS)
            .importPackages("tech.hsecit.enhanced.rbac");

        noClasses()
            .that()
            .resideInAnyPackage("tech.hsecit.enhanced.rbac.service..")
            .or()
            .resideInAnyPackage("tech.hsecit.enhanced.rbac.repository..")
            .should()
            .dependOnClassesThat()
            .resideInAnyPackage("..tech.hsecit.enhanced.rbac.web..")
            .because("Services and repositories should not depend on web layer")
            .check(importedClasses);
    }
}
