package kotlin.reflect.jvm.internal.impl.descriptors;

import kotlin.reflect.jvm.internal.impl.incremental.components.LookupLocation;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes23.dex */
public final class DescriptorUtilKt {
    @Nullable
    public static final ClassifierDescriptor getTopLevelContainingClassifier(@NotNull DeclarationDescriptor declarationDescriptor) {
        DeclarationDescriptor containingDeclaration = declarationDescriptor.getContainingDeclaration();
        if (containingDeclaration == null || (declarationDescriptor instanceof PackageFragmentDescriptor)) {
            return null;
        }
        if (!isTopLevelInPackage(containingDeclaration)) {
            return getTopLevelContainingClassifier(containingDeclaration);
        }
        if (containingDeclaration instanceof ClassifierDescriptor) {
            return (ClassifierDescriptor) containingDeclaration;
        }
        return null;
    }

    public static final boolean isTopLevelInPackage(@NotNull DeclarationDescriptor declarationDescriptor) {
        return declarationDescriptor.getContainingDeclaration() instanceof PackageFragmentDescriptor;
    }

    @Nullable
    public static final ClassDescriptor resolveClassByFqName(@NotNull ModuleDescriptor moduleDescriptor, @NotNull FqName fqName, @NotNull LookupLocation lookupLocation) {
        MemberScope unsubstitutedInnerClassesScope;
        if (fqName.isRoot()) {
            return null;
        }
        ClassifierDescriptor classifierDescriptorMo4299getContributedClassifier = moduleDescriptor.getPackage(fqName.parent()).getMemberScope().mo4299getContributedClassifier(fqName.shortName(), lookupLocation);
        ClassDescriptor classDescriptor = classifierDescriptorMo4299getContributedClassifier instanceof ClassDescriptor ? (ClassDescriptor) classifierDescriptorMo4299getContributedClassifier : null;
        if (classDescriptor != null) {
            return classDescriptor;
        }
        ClassDescriptor classDescriptorResolveClassByFqName = resolveClassByFqName(moduleDescriptor, fqName.parent(), lookupLocation);
        ClassifierDescriptor classifierDescriptorMo4299getContributedClassifier2 = (classDescriptorResolveClassByFqName == null || (unsubstitutedInnerClassesScope = classDescriptorResolveClassByFqName.getUnsubstitutedInnerClassesScope()) == null) ? null : unsubstitutedInnerClassesScope.mo4299getContributedClassifier(fqName.shortName(), lookupLocation);
        if (classifierDescriptorMo4299getContributedClassifier2 instanceof ClassDescriptor) {
            return (ClassDescriptor) classifierDescriptorMo4299getContributedClassifier2;
        }
        return null;
    }
}
