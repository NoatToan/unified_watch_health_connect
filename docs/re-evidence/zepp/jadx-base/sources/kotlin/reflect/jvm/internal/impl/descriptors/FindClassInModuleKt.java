package kotlin.reflect.jvm.internal.impl.descriptors;

import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReference;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KDeclarationContainer;
import kotlin.reflect.jvm.internal.impl.incremental.components.NoLookupLocation;
import kotlin.reflect.jvm.internal.impl.name.ClassId;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.resolve.ResolutionAnchorProviderKt;
import kotlin.sequences.SequencesKt__SequencesKt;
import kotlin.sequences.SequencesKt___SequencesKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes23.dex */
public final class FindClassInModuleKt {

    public /* synthetic */ class a extends FunctionReference implements Function1<ClassId, ClassId> {
        public static final a a = new a();

        public a() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        @Nullable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final ClassId invoke(@NotNull ClassId classId) {
            return classId.getOuterClassId();
        }

        @Override // kotlin.jvm.internal.CallableReference, kotlin.reflect.KCallable
        @NotNull
        public final String getName() {
            return "getOuterClassId";
        }

        @Override // kotlin.jvm.internal.CallableReference
        @NotNull
        public final KDeclarationContainer getOwner() {
            return Reflection.getOrCreateKotlinClass(ClassId.class);
        }

        @Override // kotlin.jvm.internal.CallableReference
        @NotNull
        public final String getSignature() {
            return "getOuterClassId()Lorg/jetbrains/kotlin/name/ClassId;";
        }
    }

    public static final class b extends Lambda implements Function1<ClassId, Integer> {
        public static final b a = new b();

        public b() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Integer invoke(@NotNull ClassId classId) {
            return 0;
        }
    }

    @Nullable
    public static final ClassDescriptor findClassAcrossModuleDependencies(@NotNull ModuleDescriptor moduleDescriptor, @NotNull ClassId classId) {
        ClassifierDescriptor classifierDescriptorFindClassifierAcrossModuleDependencies = findClassifierAcrossModuleDependencies(moduleDescriptor, classId);
        if (classifierDescriptorFindClassifierAcrossModuleDependencies instanceof ClassDescriptor) {
            return (ClassDescriptor) classifierDescriptorFindClassifierAcrossModuleDependencies;
        }
        return null;
    }

    @Nullable
    public static final ClassifierDescriptor findClassifierAcrossModuleDependencies(@NotNull ModuleDescriptor moduleDescriptor, @NotNull ClassId classId) {
        ClassifierDescriptor classifierDescriptorMo4299getContributedClassifier;
        ModuleDescriptor resolutionAnchorIfAny = ResolutionAnchorProviderKt.getResolutionAnchorIfAny(moduleDescriptor);
        if (resolutionAnchorIfAny == null) {
            PackageViewDescriptor packageViewDescriptor = moduleDescriptor.getPackage(classId.getPackageFqName());
            List<Name> listPathSegments = classId.getRelativeClassName().pathSegments();
            classifierDescriptorMo4299getContributedClassifier = packageViewDescriptor.getMemberScope().mo4299getContributedClassifier((Name) CollectionsKt.first((List) listPathSegments), NoLookupLocation.FROM_DESERIALIZATION);
            if (classifierDescriptorMo4299getContributedClassifier == null) {
                return null;
            }
            for (Name name : listPathSegments.subList(1, listPathSegments.size())) {
                if (!(classifierDescriptorMo4299getContributedClassifier instanceof ClassDescriptor)) {
                    return null;
                }
                ClassifierDescriptor classifierDescriptorMo4299getContributedClassifier2 = ((ClassDescriptor) classifierDescriptorMo4299getContributedClassifier).getUnsubstitutedInnerClassesScope().mo4299getContributedClassifier(name, NoLookupLocation.FROM_DESERIALIZATION);
                classifierDescriptorMo4299getContributedClassifier = classifierDescriptorMo4299getContributedClassifier2 instanceof ClassDescriptor ? (ClassDescriptor) classifierDescriptorMo4299getContributedClassifier2 : null;
                if (classifierDescriptorMo4299getContributedClassifier == null) {
                    return null;
                }
            }
        } else {
            PackageViewDescriptor packageViewDescriptor2 = resolutionAnchorIfAny.getPackage(classId.getPackageFqName());
            List<Name> listPathSegments2 = classId.getRelativeClassName().pathSegments();
            ClassifierDescriptor classifierDescriptorMo4299getContributedClassifier3 = packageViewDescriptor2.getMemberScope().mo4299getContributedClassifier((Name) CollectionsKt.first((List) listPathSegments2), NoLookupLocation.FROM_DESERIALIZATION);
            if (classifierDescriptorMo4299getContributedClassifier3 == null) {
                classifierDescriptorMo4299getContributedClassifier3 = null;
                break;
            }
            for (Name name2 : listPathSegments2.subList(1, listPathSegments2.size())) {
                if (classifierDescriptorMo4299getContributedClassifier3 instanceof ClassDescriptor) {
                    ClassifierDescriptor classifierDescriptorMo4299getContributedClassifier4 = ((ClassDescriptor) classifierDescriptorMo4299getContributedClassifier3).getUnsubstitutedInnerClassesScope().mo4299getContributedClassifier(name2, NoLookupLocation.FROM_DESERIALIZATION);
                    classifierDescriptorMo4299getContributedClassifier3 = classifierDescriptorMo4299getContributedClassifier4 instanceof ClassDescriptor ? (ClassDescriptor) classifierDescriptorMo4299getContributedClassifier4 : null;
                    if (classifierDescriptorMo4299getContributedClassifier3 == null) {
                    }
                }
                classifierDescriptorMo4299getContributedClassifier3 = null;
            }
            if (classifierDescriptorMo4299getContributedClassifier3 != null) {
                return classifierDescriptorMo4299getContributedClassifier3;
            }
            PackageViewDescriptor packageViewDescriptor3 = moduleDescriptor.getPackage(classId.getPackageFqName());
            List<Name> listPathSegments3 = classId.getRelativeClassName().pathSegments();
            classifierDescriptorMo4299getContributedClassifier = packageViewDescriptor3.getMemberScope().mo4299getContributedClassifier((Name) CollectionsKt.first((List) listPathSegments3), NoLookupLocation.FROM_DESERIALIZATION);
            if (classifierDescriptorMo4299getContributedClassifier == null) {
                return null;
            }
            for (Name name3 : listPathSegments3.subList(1, listPathSegments3.size())) {
                if (!(classifierDescriptorMo4299getContributedClassifier instanceof ClassDescriptor)) {
                    return null;
                }
                ClassifierDescriptor classifierDescriptorMo4299getContributedClassifier5 = ((ClassDescriptor) classifierDescriptorMo4299getContributedClassifier).getUnsubstitutedInnerClassesScope().mo4299getContributedClassifier(name3, NoLookupLocation.FROM_DESERIALIZATION);
                classifierDescriptorMo4299getContributedClassifier = classifierDescriptorMo4299getContributedClassifier5 instanceof ClassDescriptor ? (ClassDescriptor) classifierDescriptorMo4299getContributedClassifier5 : null;
                if (classifierDescriptorMo4299getContributedClassifier == null) {
                    return null;
                }
            }
        }
        return classifierDescriptorMo4299getContributedClassifier;
    }

    @NotNull
    public static final ClassDescriptor findNonGenericClassAcrossDependencies(@NotNull ModuleDescriptor moduleDescriptor, @NotNull ClassId classId, @NotNull NotFoundClasses notFoundClasses) {
        ClassDescriptor classDescriptorFindClassAcrossModuleDependencies = findClassAcrossModuleDependencies(moduleDescriptor, classId);
        return classDescriptorFindClassAcrossModuleDependencies != null ? classDescriptorFindClassAcrossModuleDependencies : notFoundClasses.getClass(classId, SequencesKt___SequencesKt.toList(SequencesKt___SequencesKt.map(SequencesKt__SequencesKt.generateSequence(classId, a.a), b.a)));
    }

    @Nullable
    public static final TypeAliasDescriptor findTypeAliasAcrossModuleDependencies(@NotNull ModuleDescriptor moduleDescriptor, @NotNull ClassId classId) {
        ClassifierDescriptor classifierDescriptorFindClassifierAcrossModuleDependencies = findClassifierAcrossModuleDependencies(moduleDescriptor, classId);
        if (classifierDescriptorFindClassifierAcrossModuleDependencies instanceof TypeAliasDescriptor) {
            return (TypeAliasDescriptor) classifierDescriptorFindClassifierAcrossModuleDependencies;
        }
        return null;
    }
}
