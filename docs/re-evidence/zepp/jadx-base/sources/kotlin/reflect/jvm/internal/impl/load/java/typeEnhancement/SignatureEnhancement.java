package kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.FunctionReference;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KDeclarationContainer;
import kotlin.reflect.jvm.internal.impl.builtins.jvm.JavaToKotlinClassMap;
import kotlin.reflect.jvm.internal.impl.builtins.jvm.JavaToKotlinClassMapper;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DescriptorUtilKt;
import kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotated;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationsKt;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.PropertyGetterDescriptorImpl;
import kotlin.reflect.jvm.internal.impl.load.java.AnnotationQualifierApplicabilityType;
import kotlin.reflect.jvm.internal.impl.load.java.AnnotationTypeQualifierResolver;
import kotlin.reflect.jvm.internal.impl.load.java.DeprecationCausedByFunctionN;
import kotlin.reflect.jvm.internal.impl.load.java.JavaDefaultQualifiers;
import kotlin.reflect.jvm.internal.impl.load.java.JavaTypeEnhancementState;
import kotlin.reflect.jvm.internal.impl.load.java.JavaTypeQualifiersByElementType;
import kotlin.reflect.jvm.internal.impl.load.java.JvmAnnotationNamesKt;
import kotlin.reflect.jvm.internal.impl.load.java.ReportLevel;
import kotlin.reflect.jvm.internal.impl.load.java.descriptors.JavaCallableMemberDescriptor;
import kotlin.reflect.jvm.internal.impl.load.java.descriptors.JavaMethodDescriptor;
import kotlin.reflect.jvm.internal.impl.load.java.descriptors.JavaPropertyDescriptor;
import kotlin.reflect.jvm.internal.impl.load.java.descriptors.PossiblyExternalAnnotationDescriptor;
import kotlin.reflect.jvm.internal.impl.load.java.descriptors.ValueParameterData;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.ContextKt;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.LazyJavaResolverContext;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.JavaDescriptorUtilKt;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaAnnotationDescriptor;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaClassDescriptor;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaTypeParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaAnnotation;
import kotlin.reflect.jvm.internal.impl.load.kotlin.MethodSignatureBuildingUtilsKt;
import kotlin.reflect.jvm.internal.impl.load.kotlin.MethodSignatureMappingKt;
import kotlin.reflect.jvm.internal.impl.load.kotlin.SignatureBuildingComponents;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.resolve.constants.ConstantValue;
import kotlin.reflect.jvm.internal.impl.resolve.constants.EnumValue;
import kotlin.reflect.jvm.internal.impl.resolve.deprecation.DeprecationKt;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt;
import kotlin.reflect.jvm.internal.impl.types.FlexibleType;
import kotlin.reflect.jvm.internal.impl.types.FlexibleTypeWithEnhancement;
import kotlin.reflect.jvm.internal.impl.types.FlexibleTypesKt;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.types.KotlinTypeKt;
import kotlin.reflect.jvm.internal.impl.types.RawType;
import kotlin.reflect.jvm.internal.impl.types.TypeProjection;
import kotlin.reflect.jvm.internal.impl.types.TypeUtils;
import kotlin.reflect.jvm.internal.impl.types.TypeWithEnhancementKt;
import kotlin.reflect.jvm.internal.impl.types.UnwrappedType;
import kotlin.reflect.jvm.internal.impl.types.Variance;
import kotlin.reflect.jvm.internal.impl.types.checker.KotlinTypeChecker;
import kotlin.reflect.jvm.internal.impl.types.typeUtil.TypeUtilsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes23.dex */
public final class SignatureEnhancement {

    @NotNull
    private final AnnotationTypeQualifierResolver a;

    @NotNull
    private final JavaTypeEnhancementState b;

    @NotNull
    private final JavaTypeEnhancement c;

    public static class a {

        @NotNull
        private final KotlinType a;
        private final boolean b;
        private final boolean c;

        public a(@NotNull KotlinType kotlinType, boolean z, boolean z2) {
            this.a = kotlinType;
            this.b = z;
            this.c = z2;
        }

        public final boolean a() {
            return this.c;
        }

        @NotNull
        public final KotlinType b() {
            return this.a;
        }

        public final boolean c() {
            return this.b;
        }
    }

    public static final class c extends Lambda implements Function1<CallableMemberDescriptor, KotlinType> {
        public static final c a = new c();

        public c() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final KotlinType invoke(@NotNull CallableMemberDescriptor callableMemberDescriptor) {
            return callableMemberDescriptor.getExtensionReceiverParameter().getType();
        }
    }

    public static final class d extends Lambda implements Function1<CallableMemberDescriptor, KotlinType> {
        public static final d a = new d();

        public d() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final KotlinType invoke(@NotNull CallableMemberDescriptor callableMemberDescriptor) {
            return callableMemberDescriptor.getReturnType();
        }
    }

    public static final class e extends Lambda implements Function1<CallableMemberDescriptor, KotlinType> {
        public final /* synthetic */ ValueParameterDescriptor a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(ValueParameterDescriptor valueParameterDescriptor) {
            super(1);
            this.a = valueParameterDescriptor;
        }

        @Override // kotlin.jvm.functions.Function1
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final KotlinType invoke(@NotNull CallableMemberDescriptor callableMemberDescriptor) {
            return callableMemberDescriptor.getValueParameters().get(this.a.getIndex()).getType();
        }
    }

    public static final class f extends Lambda implements Function1<UnwrappedType, Boolean> {
        public static final f a = new f();

        public f() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(@NotNull UnwrappedType unwrappedType) {
            return Boolean.valueOf(unwrappedType instanceof RawType);
        }
    }

    public SignatureEnhancement(@NotNull AnnotationTypeQualifierResolver annotationTypeQualifierResolver, @NotNull JavaTypeEnhancementState javaTypeEnhancementState, @NotNull JavaTypeEnhancement javaTypeEnhancement) {
        this.a = annotationTypeQualifierResolver;
        this.b = javaTypeEnhancementState;
        this.c = javaTypeEnhancement;
    }

    private final NullabilityQualifierWithMigrationStatus a(FqName fqName, AnnotationDescriptor annotationDescriptor, boolean z) {
        ReportLevel reportLevelInvoke = this.b.getGetReportLevelForAnnotation().invoke(fqName);
        if (reportLevelInvoke.isIgnore()) {
            return null;
        }
        boolean z2 = reportLevelInvoke.isWarning() || z;
        if (JvmAnnotationNamesKt.getNULLABLE_ANNOTATIONS().contains(fqName)) {
            return new NullabilityQualifierWithMigrationStatus(NullabilityQualifier.NULLABLE, z2);
        }
        if (JvmAnnotationNamesKt.getNOT_NULL_ANNOTATIONS().contains(fqName)) {
            return new NullabilityQualifierWithMigrationStatus(NullabilityQualifier.NOT_NULL, z2);
        }
        if (Intrinsics.areEqual(fqName, JvmAnnotationNamesKt.getJSPECIFY_NULLABLE())) {
            return new NullabilityQualifierWithMigrationStatus(NullabilityQualifier.NULLABLE, z2);
        }
        if (Intrinsics.areEqual(fqName, JvmAnnotationNamesKt.getJSPECIFY_NULLNESS_UNKNOWN())) {
            return new NullabilityQualifierWithMigrationStatus(NullabilityQualifier.FORCE_FLEXIBILITY, z2);
        }
        if (Intrinsics.areEqual(fqName, JvmAnnotationNamesKt.getJAVAX_NONNULL_ANNOTATION())) {
            return d(annotationDescriptor, z2);
        }
        if (Intrinsics.areEqual(fqName, JvmAnnotationNamesKt.getCOMPATQUAL_NULLABLE_ANNOTATION())) {
            return new NullabilityQualifierWithMigrationStatus(NullabilityQualifier.NULLABLE, z2);
        }
        if (Intrinsics.areEqual(fqName, JvmAnnotationNamesKt.getCOMPATQUAL_NONNULL_ANNOTATION())) {
            return new NullabilityQualifierWithMigrationStatus(NullabilityQualifier.NOT_NULL, z2);
        }
        if (Intrinsics.areEqual(fqName, JvmAnnotationNamesKt.getANDROIDX_RECENTLY_NON_NULL_ANNOTATION())) {
            return new NullabilityQualifierWithMigrationStatus(NullabilityQualifier.NOT_NULL, z2);
        }
        if (Intrinsics.areEqual(fqName, JvmAnnotationNamesKt.getANDROIDX_RECENTLY_NULLABLE_ANNOTATION())) {
            return new NullabilityQualifierWithMigrationStatus(NullabilityQualifier.NULLABLE, z2);
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:20:0x004d  */
    /* JADX WARN: Code duplicated, block: B:95:0x016d  */
    private final <D extends CallableMemberDescriptor> D b(D d2, LazyJavaResolverContext lazyJavaResolverContext) {
        D getter;
        a aVarH;
        String strSignature;
        boolean z;
        boolean z2;
        List<TypeEnhancementInfo> parametersInfo;
        if (!(d2 instanceof JavaCallableMemberDescriptor)) {
            return d2;
        }
        JavaCallableMemberDescriptor javaCallableMemberDescriptor = (JavaCallableMemberDescriptor) d2;
        boolean z3 = true;
        if (javaCallableMemberDescriptor.getKind() == CallableMemberDescriptor.Kind.FAKE_OVERRIDE && javaCallableMemberDescriptor.getOriginal().getOverriddenDescriptors().size() == 1) {
            return d2;
        }
        LazyJavaResolverContext lazyJavaResolverContextCopyWithNewDefaultTypeQualifiers = ContextKt.copyWithNewDefaultTypeQualifiers(lazyJavaResolverContext, e(d2, lazyJavaResolverContext));
        if (d2 instanceof JavaPropertyDescriptor) {
            JavaPropertyDescriptor javaPropertyDescriptor = (JavaPropertyDescriptor) d2;
            PropertyGetterDescriptorImpl getter2 = javaPropertyDescriptor.getGetter();
            if ((getter2 == null || getter2.isDefault()) ? false : true) {
                getter = javaPropertyDescriptor.getGetter();
            } else {
                getter = d2;
            }
        } else {
            getter = d2;
        }
        if (javaCallableMemberDescriptor.getExtensionReceiverParameter() != null) {
            FunctionDescriptor functionDescriptor = (FunctionDescriptor) (!(getter instanceof FunctionDescriptor) ? null : getter);
            aVarH = b.h(g(d2, functionDescriptor == null ? null : (ValueParameterDescriptor) functionDescriptor.getUserData(JavaMethodDescriptor.ORIGINAL_VALUE_PARAMETER_FOR_EXTENSION_RECEIVER), lazyJavaResolverContextCopyWithNewDefaultTypeQualifiers, c.a), null, 1, null);
        } else {
            aVarH = null;
        }
        JavaMethodDescriptor javaMethodDescriptor = d2 instanceof JavaMethodDescriptor ? (JavaMethodDescriptor) d2 : null;
        PredefinedFunctionEnhancementInfo predefinedFunctionEnhancementInfo = (javaMethodDescriptor == null || (strSignature = MethodSignatureBuildingUtilsKt.signature(SignatureBuildingComponents.INSTANCE, (ClassDescriptor) javaMethodDescriptor.getContainingDeclaration(), MethodSignatureMappingKt.computeJvmDescriptor$default(javaMethodDescriptor, false, false, 3, null))) == null) ? null : PredefinedEnhancementInfoKt.getPREDEFINED_FUNCTION_ENHANCEMENT_INFO_BY_SIGNATURE().get(strSignature);
        if (predefinedFunctionEnhancementInfo != null) {
            predefinedFunctionEnhancementInfo.getParametersInfo().size();
            javaCallableMemberDescriptor.getValueParameters().size();
        }
        List<ValueParameterDescriptor> valueParameters = getter.getValueParameters();
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(valueParameters, 10));
        for (ValueParameterDescriptor valueParameterDescriptor : valueParameters) {
            arrayList.add(g(d2, valueParameterDescriptor, lazyJavaResolverContextCopyWithNewDefaultTypeQualifiers, new e(valueParameterDescriptor)).f((predefinedFunctionEnhancementInfo == null || (parametersInfo = predefinedFunctionEnhancementInfo.getParametersInfo()) == null) ? null : (TypeEnhancementInfo) CollectionsKt.getOrNull(parametersInfo, valueParameterDescriptor.getIndex())));
        }
        PropertyDescriptor propertyDescriptor = (PropertyDescriptor) (!(d2 instanceof PropertyDescriptor) ? null : d2);
        a aVarF = f(d2, getter, true, lazyJavaResolverContextCopyWithNewDefaultTypeQualifiers, propertyDescriptor != null && JavaDescriptorUtilKt.isJavaField(propertyDescriptor) ? AnnotationQualifierApplicabilityType.FIELD : AnnotationQualifierApplicabilityType.METHOD_RETURN_TYPE, d.a).f(predefinedFunctionEnhancementInfo == null ? null : predefinedFunctionEnhancementInfo.getReturnTypeInfo());
        if ((aVarH != null && aVarH.a()) || aVarF.a()) {
            z = true;
        } else {
            if (arrayList.isEmpty()) {
                z2 = false;
                break;
            }
            Iterator it2 = arrayList.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    z2 = false;
                    break;
                }
                if (((a) it2.next()).a()) {
                    z2 = true;
                    break;
                }
            }
            if (z2) {
                z = true;
            } else {
                z = false;
            }
        }
        if (!(aVarH != null && aVarH.c()) && !aVarF.c()) {
            if (arrayList.isEmpty()) {
                z3 = false;
                break;
            }
            Iterator it3 = arrayList.iterator();
            do {
                if (!it3.hasNext()) {
                    z3 = false;
                    break;
                }
            } while (!((a) it3.next()).c());
            if (!z3 && !z) {
                return d2;
            }
        }
        Pair<CallableDescriptor.UserDataKey<?>, ?> pair = z ? TuplesKt.to(DeprecationKt.getDEPRECATED_FUNCTION_KEY(), new DeprecationCausedByFunctionN(d2)) : null;
        KotlinType kotlinTypeB = aVarH != null ? aVarH.b() : null;
        ArrayList arrayList2 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList, 10));
        int i = 0;
        for (Object obj : arrayList) {
            int i2 = i + 1;
            if (i < 0) {
                CollectionsKt__CollectionsKt.throwIndexOverflow();
            }
            arrayList2.add(new ValueParameterData(((a) obj).b(), getter.getValueParameters().get(i).declaresDefaultValue()));
            i = i2;
        }
        return javaCallableMemberDescriptor.enhance(kotlinTypeB, arrayList2, aVarF.b(), pair);
    }

    private final NullabilityQualifierWithMigrationStatus c(AnnotationDescriptor annotationDescriptor, boolean z, boolean z2) {
        FqName fqName = annotationDescriptor.getFqName();
        if (fqName == null) {
            return null;
        }
        NullabilityQualifierWithMigrationStatus nullabilityQualifierWithMigrationStatusA = a(fqName, annotationDescriptor, (annotationDescriptor instanceof LazyJavaAnnotationDescriptor) && (((LazyJavaAnnotationDescriptor) annotationDescriptor).isFreshlySupportedTypeUseAnnotation() || z2) && !z);
        if (nullabilityQualifierWithMigrationStatusA == null) {
            return null;
        }
        return (!nullabilityQualifierWithMigrationStatusA.isForWarningOnly() && (annotationDescriptor instanceof PossiblyExternalAnnotationDescriptor) && ((PossiblyExternalAnnotationDescriptor) annotationDescriptor).isIdeExternalAnnotation()) ? NullabilityQualifierWithMigrationStatus.copy$default(nullabilityQualifierWithMigrationStatusA, null, true, 1, null) : nullabilityQualifierWithMigrationStatusA;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    private final NullabilityQualifierWithMigrationStatus d(AnnotationDescriptor annotationDescriptor, boolean z) {
        ConstantValue<?> constantValueFirstArgument = DescriptorUtilsKt.firstArgument(annotationDescriptor);
        EnumValue enumValue = constantValueFirstArgument instanceof EnumValue ? (EnumValue) constantValueFirstArgument : null;
        if (enumValue == null) {
            return new NullabilityQualifierWithMigrationStatus(NullabilityQualifier.NOT_NULL, z);
        }
        String strAsString = enumValue.getEnumEntryName().asString();
        switch (strAsString.hashCode()) {
            case 73135176:
                if (!strAsString.equals("MAYBE")) {
                    return null;
                }
                break;
            case 74175084:
                if (!strAsString.equals("NEVER")) {
                    return null;
                }
                break;
            case 433141802:
                if (strAsString.equals("UNKNOWN")) {
                    return new NullabilityQualifierWithMigrationStatus(NullabilityQualifier.FORCE_FLEXIBILITY, z);
                }
                return null;
            case 1933739535:
                if (strAsString.equals("ALWAYS")) {
                    return new NullabilityQualifierWithMigrationStatus(NullabilityQualifier.NOT_NULL, z);
                }
                return null;
            default:
                return null;
        }
        return new NullabilityQualifierWithMigrationStatus(NullabilityQualifier.NULLABLE, z);
    }

    private final <D extends CallableMemberDescriptor> Annotations e(D d2, LazyJavaResolverContext lazyJavaResolverContext) {
        ClassifierDescriptor topLevelContainingClassifier = DescriptorUtilKt.getTopLevelContainingClassifier(d2);
        if (topLevelContainingClassifier == null) {
            return d2.getAnnotations();
        }
        LazyJavaClassDescriptor lazyJavaClassDescriptor = topLevelContainingClassifier instanceof LazyJavaClassDescriptor ? (LazyJavaClassDescriptor) topLevelContainingClassifier : null;
        List<JavaAnnotation> moduleAnnotations = lazyJavaClassDescriptor != null ? lazyJavaClassDescriptor.getModuleAnnotations() : null;
        if (moduleAnnotations == null || moduleAnnotations.isEmpty()) {
            return d2.getAnnotations();
        }
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(moduleAnnotations, 10));
        Iterator<T> it2 = moduleAnnotations.iterator();
        while (it2.hasNext()) {
            arrayList.add(new LazyJavaAnnotationDescriptor(lazyJavaResolverContext, (JavaAnnotation) it2.next(), true));
        }
        return Annotations.Companion.create(CollectionsKt___CollectionsKt.plus((Iterable) d2.getAnnotations(), (Iterable) arrayList));
    }

    private final b f(CallableMemberDescriptor callableMemberDescriptor, Annotated annotated, boolean z, LazyJavaResolverContext lazyJavaResolverContext, AnnotationQualifierApplicabilityType annotationQualifierApplicabilityType, Function1<? super CallableMemberDescriptor, ? extends KotlinType> function1) {
        KotlinType kotlinTypeInvoke = function1.invoke(callableMemberDescriptor);
        Collection<? extends CallableMemberDescriptor> overriddenDescriptors = callableMemberDescriptor.getOverriddenDescriptors();
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(overriddenDescriptors, 10));
        Iterator<T> it2 = overriddenDescriptors.iterator();
        while (it2.hasNext()) {
            arrayList.add(function1.invoke((CallableMemberDescriptor) it2.next()));
        }
        return new b(annotated, kotlinTypeInvoke, arrayList, z, ContextKt.copyWithNewDefaultTypeQualifiers(lazyJavaResolverContext, function1.invoke(callableMemberDescriptor).getAnnotations()), annotationQualifierApplicabilityType, false, false, 192, null);
    }

    private final b g(CallableMemberDescriptor callableMemberDescriptor, ValueParameterDescriptor valueParameterDescriptor, LazyJavaResolverContext lazyJavaResolverContext, Function1<? super CallableMemberDescriptor, ? extends KotlinType> function1) {
        LazyJavaResolverContext lazyJavaResolverContextCopyWithNewDefaultTypeQualifiers;
        return f(callableMemberDescriptor, valueParameterDescriptor, false, (valueParameterDescriptor == null || (lazyJavaResolverContextCopyWithNewDefaultTypeQualifiers = ContextKt.copyWithNewDefaultTypeQualifiers(lazyJavaResolverContext, valueParameterDescriptor.getAnnotations())) == null) ? lazyJavaResolverContext : lazyJavaResolverContextCopyWithNewDefaultTypeQualifiers, AnnotationQualifierApplicabilityType.VALUE_PARAMETER, function1);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @NotNull
    public final <D extends CallableMemberDescriptor> Collection<D> enhanceSignatures(@NotNull LazyJavaResolverContext lazyJavaResolverContext, @NotNull Collection<? extends D> collection) {
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(collection, 10));
        Iterator<T> it2 = collection.iterator();
        while (it2.hasNext()) {
            arrayList.add(b((CallableMemberDescriptor) it2.next(), lazyJavaResolverContext));
        }
        return arrayList;
    }

    @NotNull
    public final KotlinType enhanceSuperType(@NotNull KotlinType kotlinType, @NotNull LazyJavaResolverContext lazyJavaResolverContext) {
        return b.h(new b(null, kotlinType, CollectionsKt__CollectionsKt.emptyList(), false, lazyJavaResolverContext, AnnotationQualifierApplicabilityType.TYPE_USE, false, true, 64, null), null, 1, null).b();
    }

    @NotNull
    public final List<KotlinType> enhanceTypeParameterBounds(@NotNull TypeParameterDescriptor typeParameterDescriptor, @NotNull List<? extends KotlinType> list, @NotNull LazyJavaResolverContext lazyJavaResolverContext) {
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10));
        for (KotlinType kotlinTypeB : list) {
            if (!TypeUtilsKt.contains(kotlinTypeB, f.a)) {
                kotlinTypeB = b.h(new b(typeParameterDescriptor, kotlinTypeB, CollectionsKt__CollectionsKt.emptyList(), false, lazyJavaResolverContext, AnnotationQualifierApplicabilityType.TYPE_PARAMETER_BOUNDS, true, false, 128, null), null, 1, null).b();
            }
            arrayList.add(kotlinTypeB);
        }
        return arrayList;
    }

    @Nullable
    public final NullabilityQualifierWithMigrationStatus extractNullability(@NotNull AnnotationDescriptor annotationDescriptor, boolean z, boolean z2) {
        NullabilityQualifierWithMigrationStatus nullabilityQualifierWithMigrationStatusC;
        NullabilityQualifierWithMigrationStatus nullabilityQualifierWithMigrationStatusC2 = c(annotationDescriptor, z, z2);
        if (nullabilityQualifierWithMigrationStatusC2 != null) {
            return nullabilityQualifierWithMigrationStatusC2;
        }
        AnnotationDescriptor annotationDescriptorResolveTypeQualifierAnnotation = this.a.resolveTypeQualifierAnnotation(annotationDescriptor);
        if (annotationDescriptorResolveTypeQualifierAnnotation == null) {
            return null;
        }
        ReportLevel reportLevelResolveJsr305AnnotationState = this.a.resolveJsr305AnnotationState(annotationDescriptor);
        if (reportLevelResolveJsr305AnnotationState.isIgnore() || (nullabilityQualifierWithMigrationStatusC = c(annotationDescriptorResolveTypeQualifierAnnotation, z, z2)) == null) {
            return null;
        }
        return NullabilityQualifierWithMigrationStatus.copy$default(nullabilityQualifierWithMigrationStatusC, null, reportLevelResolveJsr305AnnotationState.isWarning(), 1, null);
    }

    public final class b {

        @Nullable
        private final Annotated a;

        @NotNull
        private final KotlinType b;

        @NotNull
        private final Collection<KotlinType> c;
        private final boolean d;

        @NotNull
        private final LazyJavaResolverContext e;

        @NotNull
        private final AnnotationQualifierApplicabilityType f;
        private final boolean g;
        private final boolean h;

        public static final class a extends Lambda implements Function1<Integer, JavaTypeQualifiers> {
            public final /* synthetic */ JavaTypeQualifiers[] a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(JavaTypeQualifiers[] javaTypeQualifiersArr) {
                super(1);
                this.a = javaTypeQualifiersArr;
            }

            @NotNull
            public final JavaTypeQualifiers a(int i) {
                JavaTypeQualifiers[] javaTypeQualifiersArr = this.a;
                return (i < 0 || i > ArraysKt___ArraysKt.getLastIndex(javaTypeQualifiersArr)) ? JavaTypeQualifiers.Companion.getNONE() : javaTypeQualifiersArr[i];
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ JavaTypeQualifiers invoke(Integer num) {
                return a(num.intValue());
            }
        }

        /* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.SignatureEnhancement$b$b, reason: collision with other inner class name */
        public /* synthetic */ class C1168b extends FunctionReference implements Function1<UnwrappedType, Boolean> {
            public static final C1168b a = new C1168b();

            public C1168b() {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            @NotNull
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Boolean invoke(@NotNull UnwrappedType unwrappedType) {
                return Boolean.valueOf(b.g(unwrappedType));
            }

            @Override // kotlin.jvm.internal.CallableReference, kotlin.reflect.KCallable
            @NotNull
            public final String getName() {
                return "containsFunctionN";
            }

            @Override // kotlin.jvm.internal.CallableReference
            @NotNull
            public final KDeclarationContainer getOwner() {
                return Reflection.getOrCreateKotlinClass(Intrinsics.Kotlin.class);
            }

            @Override // kotlin.jvm.internal.CallableReference
            @NotNull
            public final String getSignature() {
                return "enhance$containsFunctionN(Lorg/jetbrains/kotlin/types/UnwrappedType;)Z";
            }
        }

        public static final class c extends Lambda implements Function1<KotlinType, Boolean> {
            public static final c a = new c();

            public c() {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Boolean invoke(KotlinType kotlinType) {
                return Boolean.valueOf(kotlinType instanceof RawType);
            }
        }

        public /* synthetic */ class d extends FunctionReference implements Function1<UnwrappedType, Boolean> {
            public static final d a = new d();

            public d() {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            @NotNull
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Boolean invoke(@NotNull UnwrappedType unwrappedType) {
                return Boolean.valueOf(b.g(unwrappedType));
            }

            @Override // kotlin.jvm.internal.CallableReference, kotlin.reflect.KCallable
            @NotNull
            public final String getName() {
                return "containsFunctionN";
            }

            @Override // kotlin.jvm.internal.CallableReference
            @NotNull
            public final KDeclarationContainer getOwner() {
                return Reflection.getOrCreateKotlinClass(Intrinsics.Kotlin.class);
            }

            @Override // kotlin.jvm.internal.CallableReference
            @NotNull
            public final String getSignature() {
                return "enhance$containsFunctionN(Lorg/jetbrains/kotlin/types/UnwrappedType;)Z";
            }
        }

        public static final class e extends Lambda implements Function1<Integer, JavaTypeQualifiers> {
            public final /* synthetic */ TypeEnhancementInfo a;
            public final /* synthetic */ Function1<Integer, JavaTypeQualifiers> b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public e(TypeEnhancementInfo typeEnhancementInfo, Function1<? super Integer, JavaTypeQualifiers> function1) {
                super(1);
                this.a = typeEnhancementInfo;
                this.b = function1;
            }

            @NotNull
            public final JavaTypeQualifiers a(int i) {
                JavaTypeQualifiers javaTypeQualifiers = this.a.getMap().get(Integer.valueOf(i));
                return javaTypeQualifiers == null ? this.b.invoke(Integer.valueOf(i)) : javaTypeQualifiers;
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ JavaTypeQualifiers invoke(Integer num) {
                return a(num.intValue());
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public b(@NotNull Annotated annotated, @NotNull KotlinType kotlinType, Collection<? extends KotlinType> collection, @NotNull boolean z, @NotNull LazyJavaResolverContext lazyJavaResolverContext, AnnotationQualifierApplicabilityType annotationQualifierApplicabilityType, boolean z2, boolean z3) {
            this.a = annotated;
            this.b = kotlinType;
            this.c = collection;
            this.d = z;
            this.e = lazyJavaResolverContext;
            this.f = annotationQualifierApplicabilityType;
            this.g = z2;
            this.h = z3;
        }

        private final NullabilityQualifierWithMigrationStatus b(TypeParameterDescriptor typeParameterDescriptor) {
            boolean z;
            boolean z2;
            boolean z3;
            if (typeParameterDescriptor instanceof LazyJavaTypeParameterDescriptor) {
                LazyJavaTypeParameterDescriptor lazyJavaTypeParameterDescriptor = (LazyJavaTypeParameterDescriptor) typeParameterDescriptor;
                List<KotlinType> upperBounds = lazyJavaTypeParameterDescriptor.getUpperBounds();
                boolean z4 = false;
                boolean z5 = true;
                if (!(upperBounds instanceof Collection) || !upperBounds.isEmpty()) {
                    Iterator<T> it2 = upperBounds.iterator();
                    while (true) {
                        if (!it2.hasNext()) {
                            z = true;
                            break;
                        }
                        if (!KotlinTypeKt.isError((KotlinType) it2.next())) {
                            z = false;
                            break;
                        }
                    }
                } else {
                    z = true;
                    break;
                }
                if (!z) {
                    List<KotlinType> upperBounds2 = lazyJavaTypeParameterDescriptor.getUpperBounds();
                    if (!(upperBounds2 instanceof Collection) || !upperBounds2.isEmpty()) {
                        Iterator<T> it3 = upperBounds2.iterator();
                        while (true) {
                            if (!it3.hasNext()) {
                                z2 = true;
                                break;
                            }
                            if (!SignatureEnhancementKt.a((KotlinType) it3.next())) {
                                z2 = false;
                                break;
                            }
                        }
                    } else {
                        z2 = true;
                        break;
                    }
                    if (!z2) {
                        List<KotlinType> upperBounds3 = lazyJavaTypeParameterDescriptor.getUpperBounds();
                        if (!(upperBounds3 instanceof Collection) || !upperBounds3.isEmpty()) {
                            Iterator<T> it4 = upperBounds3.iterator();
                            do {
                                if (!it4.hasNext()) {
                                    z5 = false;
                                    break;
                                }
                            } while (!(!KotlinTypeKt.isNullable((KotlinType) it4.next())));
                        } else {
                            z5 = false;
                            break;
                        }
                        return new NullabilityQualifierWithMigrationStatus(z5 ? NullabilityQualifier.NOT_NULL : NullabilityQualifier.NULLABLE, false, 2, null);
                    }
                    List<KotlinType> upperBounds4 = lazyJavaTypeParameterDescriptor.getUpperBounds();
                    if (!(upperBounds4 instanceof Collection) || !upperBounds4.isEmpty()) {
                        Iterator<T> it5 = upperBounds4.iterator();
                        while (true) {
                            if (!it5.hasNext()) {
                                z3 = false;
                                break;
                            }
                            KotlinType kotlinType = (KotlinType) it5.next();
                            if ((kotlinType instanceof FlexibleTypeWithEnhancement) && !KotlinTypeKt.isNullable(((FlexibleTypeWithEnhancement) kotlinType).getEnhancement())) {
                                z3 = true;
                                break;
                            }
                        }
                    } else {
                        z3 = false;
                        break;
                    }
                    if (z3) {
                        return new NullabilityQualifierWithMigrationStatus(NullabilityQualifier.NOT_NULL, true);
                    }
                    List<KotlinType> upperBounds5 = lazyJavaTypeParameterDescriptor.getUpperBounds();
                    if (!(upperBounds5 instanceof Collection) || !upperBounds5.isEmpty()) {
                        for (KotlinType kotlinType2 : upperBounds5) {
                            if ((kotlinType2 instanceof FlexibleTypeWithEnhancement) && KotlinTypeKt.isNullable(((FlexibleTypeWithEnhancement) kotlinType2).getEnhancement())) {
                                z4 = true;
                                break;
                            }
                        }
                    }
                    if (z4) {
                        return new NullabilityQualifierWithMigrationStatus(NullabilityQualifier.NULLABLE, true);
                    }
                    return null;
                }
            }
            return null;
        }

        /* JADX WARN: Code duplicated, block: B:21:0x0060  */
        private final Function1<Integer, JavaTypeQualifiers> c() {
            boolean z;
            boolean z2;
            Collection<KotlinType> collection = this.c;
            ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(collection, 10));
            Iterator<T> it2 = collection.iterator();
            while (it2.hasNext()) {
                arrayList.add(q((KotlinType) it2.next()));
            }
            List<kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.d> listQ = q(this.b);
            if (this.d) {
                Collection<KotlinType> collection2 = this.c;
                if (!(collection2 instanceof Collection) || !collection2.isEmpty()) {
                    Iterator<T> it3 = collection2.iterator();
                    while (true) {
                        if (!it3.hasNext()) {
                            z2 = false;
                            break;
                        }
                        if (!KotlinTypeChecker.DEFAULT.equalTypes((KotlinType) it3.next(), this.b)) {
                            z2 = true;
                            break;
                        }
                    }
                } else {
                    z2 = false;
                    break;
                }
                if (z2) {
                    z = true;
                } else {
                    z = false;
                }
            } else {
                z = false;
            }
            int size = z ? 1 : listQ.size();
            JavaTypeQualifiers[] javaTypeQualifiersArr = new JavaTypeQualifiers[size];
            int i = 0;
            while (i < size) {
                boolean z3 = i == 0;
                kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.d dVar = listQ.get(i);
                KotlinType kotlinTypeA = dVar.a();
                JavaDefaultQualifiers javaDefaultQualifiersB = dVar.b();
                TypeParameterDescriptor typeParameterDescriptorC = dVar.c();
                boolean zD = dVar.d();
                ArrayList arrayList2 = new ArrayList();
                Iterator it4 = arrayList.iterator();
                while (it4.hasNext()) {
                    kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.d dVar2 = (kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.d) CollectionsKt.getOrNull((List) it4.next(), i);
                    KotlinType kotlinTypeE = dVar2 == null ? null : dVar2.e();
                    if (kotlinTypeE != null) {
                        arrayList2.add(kotlinTypeE);
                    }
                }
                javaTypeQualifiersArr[i] = e(kotlinTypeA, arrayList2, javaDefaultQualifiersB, z3, typeParameterDescriptorC, zD);
                i++;
            }
            return new a(javaTypeQualifiersArr);
        }

        private final NullabilityQualifierWithMigrationStatus d(NullabilityQualifierWithMigrationStatus nullabilityQualifierWithMigrationStatus, JavaDefaultQualifiers javaDefaultQualifiers, TypeParameterDescriptor typeParameterDescriptor) {
            NullabilityQualifierWithMigrationStatus nullabilityQualifier;
            if (nullabilityQualifierWithMigrationStatus == null) {
                nullabilityQualifierWithMigrationStatus = (javaDefaultQualifiers == null || (nullabilityQualifier = javaDefaultQualifiers.getNullabilityQualifier()) == null) ? null : new NullabilityQualifierWithMigrationStatus(nullabilityQualifier.getQualifier(), nullabilityQualifier.isForWarningOnly());
            }
            NullabilityQualifierWithMigrationStatus nullabilityQualifierWithMigrationStatusB = typeParameterDescriptor != null ? b(typeParameterDescriptor) : null;
            if (nullabilityQualifierWithMigrationStatusB == null) {
                return nullabilityQualifierWithMigrationStatus;
            }
            if (javaDefaultQualifiers == null && nullabilityQualifierWithMigrationStatus == null && nullabilityQualifierWithMigrationStatusB.getQualifier() == NullabilityQualifier.NULLABLE) {
                return new NullabilityQualifierWithMigrationStatus(NullabilityQualifier.FORCE_FLEXIBILITY, nullabilityQualifierWithMigrationStatusB.isForWarningOnly());
            }
            return nullabilityQualifierWithMigrationStatus == null ? nullabilityQualifierWithMigrationStatusB : o(nullabilityQualifierWithMigrationStatusB, nullabilityQualifierWithMigrationStatus);
        }

        /* JADX WARN: Code duplicated, block: B:69:0x011d  */
        private final JavaTypeQualifiers e(KotlinType kotlinType, Collection<? extends KotlinType> collection, JavaDefaultQualifiers javaDefaultQualifiers, boolean z, TypeParameterDescriptor typeParameterDescriptor, boolean z2) {
            boolean z3;
            boolean z4;
            ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(collection, 10));
            Iterator<T> it2 = collection.iterator();
            while (it2.hasNext()) {
                arrayList.add(j((KotlinType) it2.next()));
            }
            ArrayList arrayList2 = new ArrayList();
            Iterator it3 = arrayList.iterator();
            while (it3.hasNext()) {
                MutabilityQualifier mutability = ((JavaTypeQualifiers) it3.next()).getMutability();
                if (mutability != null) {
                    arrayList2.add(mutability);
                }
            }
            Set set = CollectionsKt___CollectionsKt.toSet(arrayList2);
            ArrayList arrayList3 = new ArrayList();
            Iterator it4 = arrayList.iterator();
            while (it4.hasNext()) {
                NullabilityQualifier nullability = ((JavaTypeQualifiers) it4.next()).getNullability();
                if (nullability != null) {
                    arrayList3.add(nullability);
                }
            }
            Set set2 = CollectionsKt___CollectionsKt.toSet(arrayList3);
            ArrayList arrayList4 = new ArrayList();
            Iterator<T> it5 = collection.iterator();
            while (it5.hasNext()) {
                NullabilityQualifier nullability2 = j(TypeWithEnhancementKt.unwrapEnhancement((KotlinType) it5.next())).getNullability();
                if (nullability2 != null) {
                    arrayList4.add(nullability2);
                }
            }
            Set set3 = CollectionsKt___CollectionsKt.toSet(arrayList4);
            JavaTypeQualifiers javaTypeQualifiersK = k(kotlinType, z, javaDefaultQualifiers, typeParameterDescriptor, z2);
            NullabilityQualifier nullabilityQualifier = null;
            JavaTypeQualifiers javaTypeQualifiers = javaTypeQualifiersK.isNullabilityQualifierForWarning() ^ true ? javaTypeQualifiersK : null;
            NullabilityQualifier nullability3 = javaTypeQualifiers == null ? null : javaTypeQualifiers.getNullability();
            NullabilityQualifier nullability4 = javaTypeQualifiersK.getNullability();
            boolean z5 = this.d && z;
            NullabilityQualifier nullabilityQualifierSelect = TypeEnchancementUtilsKt.select(set2, nullability3, z5);
            if (nullabilityQualifierSelect != null) {
                if (!(n() && z && nullabilityQualifierSelect == NullabilityQualifier.NULLABLE)) {
                    nullabilityQualifier = nullabilityQualifierSelect;
                }
            }
            MutabilityQualifier mutabilityQualifier = (MutabilityQualifier) TypeEnchancementUtilsKt.select(set, MutabilityQualifier.MUTABLE, MutabilityQualifier.READ_ONLY, javaTypeQualifiersK.getMutability(), z5);
            boolean z6 = (nullability4 == nullability3 && Intrinsics.areEqual(set3, set2)) ? false : true;
            if (javaTypeQualifiersK.isNotNullTypeParameter()) {
                z3 = true;
            } else {
                if (!arrayList.isEmpty()) {
                    Iterator it6 = arrayList.iterator();
                    while (true) {
                        if (!it6.hasNext()) {
                            z4 = false;
                            break;
                        }
                        if (((JavaTypeQualifiers) it6.next()).isNotNullTypeParameter()) {
                            z4 = true;
                            break;
                        }
                    }
                } else {
                    z4 = false;
                    break;
                }
                if (z4) {
                    z3 = true;
                } else {
                    z3 = false;
                }
            }
            if (nullabilityQualifier == null && z6) {
                return TypeEnchancementUtilsKt.createJavaTypeQualifiers(TypeEnchancementUtilsKt.select(set3, nullability4, z5), mutabilityQualifier, true, z3);
            }
            return TypeEnchancementUtilsKt.createJavaTypeQualifiers(nullabilityQualifier, mutabilityQualifier, nullabilityQualifier == null, z3);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final boolean g(UnwrappedType unwrappedType) {
            ClassifierDescriptor classifierDescriptorMo4298getDeclarationDescriptor = unwrappedType.getConstructor().mo4298getDeclarationDescriptor();
            if (classifierDescriptorMo4298getDeclarationDescriptor == null) {
                return false;
            }
            Name name = classifierDescriptorMo4298getDeclarationDescriptor.getName();
            JavaToKotlinClassMap javaToKotlinClassMap = JavaToKotlinClassMap.INSTANCE;
            return Intrinsics.areEqual(name, javaToKotlinClassMap.getFUNCTION_N_FQ_NAME().shortName()) && Intrinsics.areEqual(DescriptorUtilsKt.fqNameOrNull(classifierDescriptorMo4298getDeclarationDescriptor), javaToKotlinClassMap.getFUNCTION_N_FQ_NAME());
        }

        public static /* synthetic */ a h(b bVar, TypeEnhancementInfo typeEnhancementInfo, int i, Object obj) {
            if ((i & 1) != 0) {
                typeEnhancementInfo = null;
            }
            return bVar.f(typeEnhancementInfo);
        }

        private final NullabilityQualifierWithMigrationStatus i(Annotations annotations, boolean z, boolean z2) {
            SignatureEnhancement signatureEnhancement = SignatureEnhancement.this;
            Iterator<AnnotationDescriptor> it2 = annotations.iterator();
            while (it2.hasNext()) {
                NullabilityQualifierWithMigrationStatus nullabilityQualifierWithMigrationStatusExtractNullability = signatureEnhancement.extractNullability(it2.next(), z, z2);
                if (nullabilityQualifierWithMigrationStatusExtractNullability != null) {
                    return nullabilityQualifierWithMigrationStatusExtractNullability;
                }
            }
            return null;
        }

        /* JADX WARN: Code duplicated, block: B:16:0x0048  */
        /* JADX WARN: Code duplicated, block: B:17:0x004b  */
        /* JADX WARN: Code duplicated, block: B:19:0x0051  */
        /* JADX WARN: Code duplicated, block: B:20:0x0054  */
        private final JavaTypeQualifiers j(KotlinType kotlinType) {
            Pair pair;
            NullabilityQualifier nullabilityQualifier;
            NullabilityQualifier nullabilityQualifier2;
            MutabilityQualifier mutabilityQualifier;
            if (FlexibleTypesKt.isFlexible(kotlinType)) {
                FlexibleType flexibleTypeAsFlexibleType = FlexibleTypesKt.asFlexibleType(kotlinType);
                pair = new Pair(flexibleTypeAsFlexibleType.getLowerBound(), flexibleTypeAsFlexibleType.getUpperBound());
            } else {
                pair = new Pair(kotlinType, kotlinType);
            }
            KotlinType kotlinType2 = (KotlinType) pair.component1();
            KotlinType kotlinType3 = (KotlinType) pair.component2();
            JavaToKotlinClassMapper javaToKotlinClassMapper = JavaToKotlinClassMapper.INSTANCE;
            if (!kotlinType2.isMarkedNullable()) {
                if (kotlinType3.isMarkedNullable()) {
                    nullabilityQualifier = null;
                } else {
                    nullabilityQualifier2 = NullabilityQualifier.NOT_NULL;
                }
                if (javaToKotlinClassMapper.isReadOnly(kotlinType2)) {
                    mutabilityQualifier = MutabilityQualifier.READ_ONLY;
                } else if (javaToKotlinClassMapper.isMutable(kotlinType3)) {
                    mutabilityQualifier = MutabilityQualifier.MUTABLE;
                } else {
                    mutabilityQualifier = null;
                }
                return new JavaTypeQualifiers(nullabilityQualifier, mutabilityQualifier, kotlinType.unwrap() instanceof NotNullTypeParameter, false, 8, null);
            }
            nullabilityQualifier2 = NullabilityQualifier.NULLABLE;
            nullabilityQualifier = nullabilityQualifier2;
            if (javaToKotlinClassMapper.isReadOnly(kotlinType2)) {
                mutabilityQualifier = MutabilityQualifier.READ_ONLY;
            } else if (javaToKotlinClassMapper.isMutable(kotlinType3)) {
                mutabilityQualifier = MutabilityQualifier.MUTABLE;
            } else {
                mutabilityQualifier = null;
            }
            return new JavaTypeQualifiers(nullabilityQualifier, mutabilityQualifier, kotlinType.unwrap() instanceof NotNullTypeParameter, false, 8, null);
        }

        /* JADX WARN: Code duplicated, block: B:42:0x00a8  */
        /* JADX WARN: Code duplicated, block: B:65:0x00f7  */
        private final JavaTypeQualifiers k(KotlinType kotlinType, boolean z, JavaDefaultQualifiers javaDefaultQualifiers, TypeParameterDescriptor typeParameterDescriptor, boolean z2) {
            Annotations annotations;
            Annotated annotated;
            boolean z3;
            Annotated annotated2;
            if (z2) {
                if ((typeParameterDescriptor == null ? null : typeParameterDescriptor.getVariance()) == Variance.IN_VARIANCE) {
                    return JavaTypeQualifiers.Companion.getNONE();
                }
            }
            boolean typeEnhancementImprovementsInStrictMode = this.e.getComponents().getSettings().getTypeEnhancementImprovementsInStrictMode();
            boolean z4 = false;
            if (!z || (annotated2 = this.a) == null || (annotated2 instanceof TypeParameterDescriptor) || !typeEnhancementImprovementsInStrictMode) {
                annotations = (!z || (annotated = this.a) == null) ? kotlinType.getAnnotations() : AnnotationsKt.composeAnnotations(annotated.getAnnotations(), kotlinType.getAnnotations());
            } else {
                Annotations annotations2 = annotated2.getAnnotations();
                SignatureEnhancement signatureEnhancement = SignatureEnhancement.this;
                ArrayList arrayList = new ArrayList();
                for (AnnotationDescriptor annotationDescriptor : annotations2) {
                    AnnotationTypeQualifierResolver.TypeQualifierWithApplicability typeQualifierWithApplicabilityResolveAnnotation = signatureEnhancement.a.resolveAnnotation(annotationDescriptor);
                    if (typeQualifierWithApplicabilityResolveAnnotation == null || !typeQualifierWithApplicabilityResolveAnnotation.component2().contains(AnnotationQualifierApplicabilityType.TYPE_USE)) {
                        arrayList.add(annotationDescriptor);
                    }
                }
                annotations = AnnotationsKt.composeAnnotations(Annotations.Companion.create(arrayList), kotlinType.getAnnotations());
            }
            if (z) {
                JavaTypeQualifiersByElementType defaultTypeQualifiers = this.e.getDefaultTypeQualifiers();
                javaDefaultQualifiers = defaultTypeQualifiers == null ? null : defaultTypeQualifiers.get(this.f);
            }
            if (javaDefaultQualifiers == null) {
                javaDefaultQualifiers = null;
            } else if (!((javaDefaultQualifiers.getAffectsTypeParameterBasedTypes() || !TypeUtilsKt.isTypeParameter(kotlinType)) && (javaDefaultQualifiers.getAffectsStarProjection() || !z2))) {
                javaDefaultQualifiers = null;
            }
            Pair<NullabilityQualifierWithMigrationStatus, Boolean> pairP = p(kotlinType);
            NullabilityQualifierWithMigrationStatus nullabilityQualifierWithMigrationStatusComponent1 = pairP.component1();
            boolean zBooleanValue = pairP.component2().booleanValue();
            NullabilityQualifierWithMigrationStatus nullabilityQualifierWithMigrationStatusI = i(annotations, typeEnhancementImprovementsInStrictMode, this.g);
            if (nullabilityQualifierWithMigrationStatusI == null || z2) {
                nullabilityQualifierWithMigrationStatusI = null;
            }
            NullabilityQualifierWithMigrationStatus nullabilityQualifierWithMigrationStatusD = nullabilityQualifierWithMigrationStatusI == null ? d(nullabilityQualifierWithMigrationStatusComponent1, javaDefaultQualifiers, typeParameterDescriptor) : nullabilityQualifierWithMigrationStatusI;
            if (nullabilityQualifierWithMigrationStatusI == null) {
                if (!zBooleanValue) {
                    if (!(javaDefaultQualifiers != null && javaDefaultQualifiers.getMakesTypeParameterNotNull())) {
                        z3 = false;
                    }
                }
                z3 = true;
            } else if (nullabilityQualifierWithMigrationStatusI.getQualifier() == NullabilityQualifier.NOT_NULL) {
                z3 = true;
            } else {
                z3 = false;
            }
            NullabilityQualifier qualifier = nullabilityQualifierWithMigrationStatusD != null ? nullabilityQualifierWithMigrationStatusD.getQualifier() : null;
            MutabilityQualifier mutabilityQualifier = (MutabilityQualifier) m(l(JvmAnnotationNamesKt.getREAD_ONLY_ANNOTATIONS(), annotations, MutabilityQualifier.READ_ONLY), l(JvmAnnotationNamesKt.getMUTABLE_ANNOTATIONS(), annotations, MutabilityQualifier.MUTABLE));
            boolean z5 = z3 && TypeUtilsKt.isTypeParameter(kotlinType);
            if (nullabilityQualifierWithMigrationStatusD != null && nullabilityQualifierWithMigrationStatusD.isForWarningOnly()) {
                z4 = true;
            }
            return new JavaTypeQualifiers(qualifier, mutabilityQualifier, z5, z4);
        }

        private static final <T> T l(List<FqName> list, Annotations annotations, T t) {
            boolean z = true;
            if ((list instanceof Collection) && list.isEmpty()) {
                z = false;
            } else {
                Iterator<T> it2 = list.iterator();
                while (it2.hasNext()) {
                    if (annotations.mo4294findAnnotation((FqName) it2.next()) != null) {
                    }
                }
                z = false;
            }
            if (z) {
                return t;
            }
            return null;
        }

        private static final <T> T m(T t, T t2) {
            if (t == null || t2 == null || Intrinsics.areEqual(t, t2)) {
                return t == null ? t2 : t;
            }
            return null;
        }

        private final boolean n() {
            Annotated annotated = this.a;
            if (!(annotated instanceof ValueParameterDescriptor)) {
                annotated = null;
            }
            ValueParameterDescriptor valueParameterDescriptor = (ValueParameterDescriptor) annotated;
            return (valueParameterDescriptor != null ? valueParameterDescriptor.getVarargElementType() : null) != null;
        }

        private final NullabilityQualifierWithMigrationStatus o(NullabilityQualifierWithMigrationStatus nullabilityQualifierWithMigrationStatus, NullabilityQualifierWithMigrationStatus nullabilityQualifierWithMigrationStatus2) {
            NullabilityQualifier qualifier = nullabilityQualifierWithMigrationStatus.getQualifier();
            NullabilityQualifier nullabilityQualifier = NullabilityQualifier.FORCE_FLEXIBILITY;
            if (qualifier == nullabilityQualifier) {
                return nullabilityQualifierWithMigrationStatus2;
            }
            if (nullabilityQualifierWithMigrationStatus2.getQualifier() == nullabilityQualifier) {
                return nullabilityQualifierWithMigrationStatus;
            }
            NullabilityQualifier qualifier2 = nullabilityQualifierWithMigrationStatus.getQualifier();
            NullabilityQualifier nullabilityQualifier2 = NullabilityQualifier.NULLABLE;
            if (qualifier2 == nullabilityQualifier2) {
                return nullabilityQualifierWithMigrationStatus2;
            }
            if (nullabilityQualifierWithMigrationStatus2.getQualifier() == nullabilityQualifier2) {
                return nullabilityQualifierWithMigrationStatus;
            }
            if (nullabilityQualifierWithMigrationStatus.getQualifier() == nullabilityQualifierWithMigrationStatus2.getQualifier()) {
                nullabilityQualifierWithMigrationStatus.getQualifier();
                NullabilityQualifier nullabilityQualifier3 = NullabilityQualifier.NOT_NULL;
            }
            return new NullabilityQualifierWithMigrationStatus(NullabilityQualifier.NOT_NULL, false, 2, null);
        }

        private final Pair<NullabilityQualifierWithMigrationStatus, Boolean> p(KotlinType kotlinType) {
            ClassifierDescriptor classifierDescriptorMo4298getDeclarationDescriptor = kotlinType.getConstructor().mo4298getDeclarationDescriptor();
            TypeParameterDescriptor typeParameterDescriptor = classifierDescriptorMo4298getDeclarationDescriptor instanceof TypeParameterDescriptor ? (TypeParameterDescriptor) classifierDescriptorMo4298getDeclarationDescriptor : null;
            NullabilityQualifierWithMigrationStatus nullabilityQualifierWithMigrationStatusB = typeParameterDescriptor == null ? null : b(typeParameterDescriptor);
            if (nullabilityQualifierWithMigrationStatusB == null) {
                return new Pair<>(null, Boolean.FALSE);
            }
            NullabilityQualifier nullabilityQualifier = NullabilityQualifier.NOT_NULL;
            return new Pair<>(new NullabilityQualifierWithMigrationStatus(nullabilityQualifier, nullabilityQualifierWithMigrationStatusB.isForWarningOnly()), Boolean.valueOf(nullabilityQualifierWithMigrationStatusB.getQualifier() == nullabilityQualifier));
        }

        private final List<kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.d> q(KotlinType kotlinType) {
            ArrayList arrayList = new ArrayList(1);
            r(this, arrayList, kotlinType, this.e, null);
            return arrayList;
        }

        private static final void r(b bVar, ArrayList<kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.d> arrayList, KotlinType kotlinType, LazyJavaResolverContext lazyJavaResolverContext, TypeParameterDescriptor typeParameterDescriptor) {
            LazyJavaResolverContext lazyJavaResolverContextCopyWithNewDefaultTypeQualifiers = ContextKt.copyWithNewDefaultTypeQualifiers(lazyJavaResolverContext, kotlinType.getAnnotations());
            JavaTypeQualifiersByElementType defaultTypeQualifiers = lazyJavaResolverContextCopyWithNewDefaultTypeQualifiers.getDefaultTypeQualifiers();
            JavaDefaultQualifiers javaDefaultQualifiers = defaultTypeQualifiers == null ? null : defaultTypeQualifiers.get(bVar.g ? AnnotationQualifierApplicabilityType.TYPE_PARAMETER_BOUNDS : AnnotationQualifierApplicabilityType.TYPE_USE);
            arrayList.add(new kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.d(kotlinType, javaDefaultQualifiers, typeParameterDescriptor, false));
            if (bVar.h && (kotlinType instanceof RawType)) {
                return;
            }
            for (Pair pair : CollectionsKt___CollectionsKt.zip(kotlinType.getArguments(), kotlinType.getConstructor().getParameters())) {
                TypeProjection typeProjection = (TypeProjection) pair.component1();
                TypeParameterDescriptor typeParameterDescriptor2 = (TypeParameterDescriptor) pair.component2();
                if (typeProjection.isStarProjection()) {
                    arrayList.add(new kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.d(typeProjection.getType(), javaDefaultQualifiers, typeParameterDescriptor2, true));
                } else {
                    r(bVar, arrayList, typeProjection.getType(), lazyJavaResolverContextCopyWithNewDefaultTypeQualifiers, typeParameterDescriptor2);
                }
            }
        }

        @NotNull
        public final a f(@Nullable TypeEnhancementInfo typeEnhancementInfo) {
            Function1<Integer, JavaTypeQualifiers> function1C = c();
            e eVar = typeEnhancementInfo == null ? null : new e(typeEnhancementInfo, function1C);
            boolean zContainsStoppingAt = this.h ? TypeUtils.containsStoppingAt(this.b, C1168b.a, c.a) : TypeUtils.contains(this.b, d.a);
            JavaTypeEnhancement javaTypeEnhancement = SignatureEnhancement.this.c;
            KotlinType kotlinType = this.b;
            if (eVar != null) {
                function1C = eVar;
            }
            KotlinType kotlinTypeEnhance = javaTypeEnhancement.enhance(kotlinType, function1C, this.h);
            a aVar = kotlinTypeEnhance != null ? new a(kotlinTypeEnhance, true, zContainsStoppingAt) : null;
            return aVar == null ? new a(this.b, false, zContainsStoppingAt) : aVar;
        }

        public /* synthetic */ b(Annotated annotated, KotlinType kotlinType, Collection collection, boolean z, LazyJavaResolverContext lazyJavaResolverContext, AnnotationQualifierApplicabilityType annotationQualifierApplicabilityType, boolean z2, boolean z3, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(annotated, kotlinType, collection, z, lazyJavaResolverContext, annotationQualifierApplicabilityType, (i & 64) != 0 ? false : z2, (i & 128) != 0 ? false : z3);
        }
    }
}
