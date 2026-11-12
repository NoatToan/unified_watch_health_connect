package kotlin.reflect.jvm.internal.impl.load.java.lazy.types;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.collections.IndexedValue;
import kotlin.collections.e;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.jvm.internal.impl.builtins.PrimitiveType;
import kotlin.reflect.jvm.internal.impl.builtins.jvm.JavaToKotlinClassMapper;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations;
import kotlin.reflect.jvm.internal.impl.load.java.components.TypeUsage;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.LazyJavaAnnotations;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.LazyJavaResolverContext;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.TypeParameterResolver;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaArrayType;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaClass;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaClassifier;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaClassifierType;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaPrimitiveType;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaType;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaTypeParameter;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaTypesKt;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaWildcardType;
import kotlin.reflect.jvm.internal.impl.name.ClassId;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import kotlin.reflect.jvm.internal.impl.types.ErrorUtils;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.types.KotlinTypeFactory;
import kotlin.reflect.jvm.internal.impl.types.LazyWrappedType;
import kotlin.reflect.jvm.internal.impl.types.SimpleType;
import kotlin.reflect.jvm.internal.impl.types.TypeConstructor;
import kotlin.reflect.jvm.internal.impl.types.TypeProjection;
import kotlin.reflect.jvm.internal.impl.types.TypeProjectionImpl;
import kotlin.reflect.jvm.internal.impl.types.Variance;
import kotlin.reflect.jvm.internal.impl.types.typeUtil.TypeUtilsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes23.dex */
public final class JavaTypeResolver {

    @NotNull
    private final LazyJavaResolverContext a;

    @NotNull
    private final TypeParameterResolver b;

    @NotNull
    private final TypeParameterUpperBoundEraser c;

    @NotNull
    private final RawSubstitution d;

    public static final class a extends Lambda implements Function0<KotlinType> {
        public final /* synthetic */ TypeParameterDescriptor b;
        public final /* synthetic */ JavaClassifierType c;
        public final /* synthetic */ JavaTypeAttributes d;
        public final /* synthetic */ TypeConstructor e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(TypeParameterDescriptor typeParameterDescriptor, JavaClassifierType javaClassifierType, JavaTypeAttributes javaTypeAttributes, TypeConstructor typeConstructor) {
            super(0);
            this.b = typeParameterDescriptor;
            this.c = javaClassifierType;
            this.d = javaTypeAttributes;
            this.e = typeConstructor;
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final KotlinType getA() {
            TypeParameterUpperBoundEraser typeParameterUpperBoundEraser = JavaTypeResolver.this.c;
            TypeParameterDescriptor typeParameterDescriptor = this.b;
            boolean zIsRaw = this.c.isRaw();
            JavaTypeAttributes javaTypeAttributes = this.d;
            ClassifierDescriptor classifierDescriptorMo4298getDeclarationDescriptor = this.e.mo4298getDeclarationDescriptor();
            return typeParameterUpperBoundEraser.getErasedUpperBound$descriptors_jvm(typeParameterDescriptor, zIsRaw, javaTypeAttributes.withDefaultType(classifierDescriptorMo4298getDeclarationDescriptor == null ? null : classifierDescriptorMo4298getDeclarationDescriptor.getDefaultType()));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public JavaTypeResolver(@NotNull LazyJavaResolverContext lazyJavaResolverContext, @NotNull TypeParameterResolver typeParameterResolver) {
        this.a = lazyJavaResolverContext;
        this.b = typeParameterResolver;
        TypeParameterUpperBoundEraser typeParameterUpperBoundEraser = new TypeParameterUpperBoundEraser(null, 1, 0 == true ? 1 : 0);
        this.c = typeParameterUpperBoundEraser;
        this.d = new RawSubstitution(typeParameterUpperBoundEraser);
    }

    private final boolean a(JavaClassifierType javaClassifierType, ClassDescriptor classDescriptor) {
        if (!JavaTypesKt.isSuperWildcard((JavaType) CollectionsKt.lastOrNull((List) javaClassifierType.getTypeArguments()))) {
            return false;
        }
        TypeParameterDescriptor typeParameterDescriptor = (TypeParameterDescriptor) CollectionsKt.lastOrNull((List) JavaToKotlinClassMapper.INSTANCE.convertReadOnlyToMutable(classDescriptor).getTypeConstructor().getParameters());
        Variance variance = typeParameterDescriptor == null ? null : typeParameterDescriptor.getVariance();
        return (variance == null || variance == Variance.OUT_VARIANCE) ? false : true;
    }

    private final List<TypeProjection> b(JavaClassifierType javaClassifierType, JavaTypeAttributes javaTypeAttributes, TypeConstructor typeConstructor) {
        boolean z = true;
        if (!javaClassifierType.isRaw() && (!javaClassifierType.getTypeArguments().isEmpty() || !(!typeConstructor.getParameters().isEmpty()))) {
            z = false;
        }
        List<TypeParameterDescriptor> parameters = typeConstructor.getParameters();
        if (z) {
            return c(javaClassifierType, parameters, typeConstructor, javaTypeAttributes);
        }
        if (parameters.size() != javaClassifierType.getTypeArguments().size()) {
            ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(parameters, 10));
            Iterator<T> it2 = parameters.iterator();
            while (it2.hasNext()) {
                arrayList.add(new TypeProjectionImpl(ErrorUtils.createErrorType(((TypeParameterDescriptor) it2.next()).getName().asString())));
            }
            return CollectionsKt___CollectionsKt.toList(arrayList);
        }
        Iterable<IndexedValue> iterableWithIndex = CollectionsKt___CollectionsKt.withIndex(javaClassifierType.getTypeArguments());
        ArrayList arrayList2 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(iterableWithIndex, 10));
        for (IndexedValue indexedValue : iterableWithIndex) {
            int iComponent1 = indexedValue.component1();
            JavaType javaType = (JavaType) indexedValue.component2();
            parameters.size();
            arrayList2.add(l(javaType, JavaTypeResolverKt.toAttributes$default(TypeUsage.COMMON, false, null, 3, null), parameters.get(iComponent1)));
        }
        return CollectionsKt___CollectionsKt.toList(arrayList2);
    }

    private final List<TypeProjection> c(JavaClassifierType javaClassifierType, List<? extends TypeParameterDescriptor> list, TypeConstructor typeConstructor, JavaTypeAttributes javaTypeAttributes) {
        TypeProjection typeProjectionComputeProjection;
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10));
        for (TypeParameterDescriptor typeParameterDescriptor : list) {
            if (TypeUtilsKt.hasTypeParameterRecursiveBounds(typeParameterDescriptor, null, javaTypeAttributes.getVisitedTypeParameters())) {
                typeProjectionComputeProjection = JavaTypeResolverKt.makeStarProjection(typeParameterDescriptor, javaTypeAttributes);
            } else {
                typeProjectionComputeProjection = this.d.computeProjection(typeParameterDescriptor, javaClassifierType.isRaw() ? javaTypeAttributes : javaTypeAttributes.withFlexibility(JavaTypeFlexibility.INFLEXIBLE), new LazyWrappedType(this.a.getStorageManager(), new a(typeParameterDescriptor, javaClassifierType, javaTypeAttributes, typeConstructor)));
            }
            arrayList.add(typeProjectionComputeProjection);
        }
        return arrayList;
    }

    private final SimpleType d(JavaClassifierType javaClassifierType, JavaTypeAttributes javaTypeAttributes, SimpleType simpleType) {
        Annotations annotations = simpleType == null ? null : simpleType.getAnnotations();
        if (annotations == null) {
            annotations = new LazyJavaAnnotations(this.a, javaClassifierType, false, 4, null);
        }
        Annotations annotations2 = annotations;
        TypeConstructor typeConstructorE = e(javaClassifierType, javaTypeAttributes);
        if (typeConstructorE == null) {
            return null;
        }
        boolean zH = h(javaTypeAttributes);
        return (Intrinsics.areEqual(simpleType != null ? simpleType.getConstructor() : null, typeConstructorE) && !javaClassifierType.isRaw() && zH) ? simpleType.makeNullableAsSpecified(true) : KotlinTypeFactory.simpleType$default(annotations2, typeConstructorE, b(javaClassifierType, javaTypeAttributes, typeConstructorE), zH, null, 16, null);
    }

    private final TypeConstructor e(JavaClassifierType javaClassifierType, JavaTypeAttributes javaTypeAttributes) {
        JavaClassifier classifier = javaClassifierType.getClassifier();
        if (classifier == null) {
            return f(javaClassifierType);
        }
        if (!(classifier instanceof JavaClass)) {
            if (!(classifier instanceof JavaTypeParameter)) {
                throw new IllegalStateException(Intrinsics.stringPlus("Unknown classifier kind: ", classifier));
            }
            TypeParameterDescriptor typeParameterDescriptorResolveTypeParameter = this.b.resolveTypeParameter((JavaTypeParameter) classifier);
            if (typeParameterDescriptorResolveTypeParameter == null) {
                return null;
            }
            return typeParameterDescriptorResolveTypeParameter.getTypeConstructor();
        }
        JavaClass javaClass = (JavaClass) classifier;
        FqName fqName = javaClass.getFqName();
        if (fqName == null) {
            throw new AssertionError(Intrinsics.stringPlus("Class type should have a FQ name: ", classifier));
        }
        ClassDescriptor classDescriptorI = i(javaClassifierType, javaTypeAttributes, fqName);
        if (classDescriptorI == null) {
            classDescriptorI = this.a.getComponents().getModuleClassResolver().resolveClass(javaClass);
        }
        TypeConstructor typeConstructor = classDescriptorI != null ? classDescriptorI.getTypeConstructor() : null;
        return typeConstructor == null ? f(javaClassifierType) : typeConstructor;
    }

    private final TypeConstructor f(JavaClassifierType javaClassifierType) {
        return this.a.getComponents().getDeserializedDescriptorResolver().getComponents().getNotFoundClasses().getClass(ClassId.topLevel(new FqName(javaClassifierType.getClassifierQualifiedName())), e.listOf(0)).getTypeConstructor();
    }

    private final boolean g(Variance variance, TypeParameterDescriptor typeParameterDescriptor) {
        return (typeParameterDescriptor.getVariance() == Variance.INVARIANT || variance == typeParameterDescriptor.getVariance()) ? false : true;
    }

    private final boolean h(JavaTypeAttributes javaTypeAttributes) {
        return (javaTypeAttributes.getFlexibility() == JavaTypeFlexibility.FLEXIBLE_LOWER_BOUND || javaTypeAttributes.isForAnnotationParameter() || javaTypeAttributes.getHowThisTypeIsUsed() == TypeUsage.SUPERTYPE) ? false : true;
    }

    private final ClassDescriptor i(JavaClassifierType javaClassifierType, JavaTypeAttributes javaTypeAttributes, FqName fqName) {
        if (javaTypeAttributes.isForAnnotationParameter() && Intrinsics.areEqual(fqName, JavaTypeResolverKt.a)) {
            return this.a.getComponents().getReflectionTypes().getKClass();
        }
        JavaToKotlinClassMapper javaToKotlinClassMapper = JavaToKotlinClassMapper.INSTANCE;
        ClassDescriptor classDescriptorMapJavaToKotlin$default = JavaToKotlinClassMapper.mapJavaToKotlin$default(javaToKotlinClassMapper, fqName, this.a.getModule().getBuiltIns(), null, 4, null);
        if (classDescriptorMapJavaToKotlin$default == null) {
            return null;
        }
        return (javaToKotlinClassMapper.isReadOnly(classDescriptorMapJavaToKotlin$default) && (javaTypeAttributes.getFlexibility() == JavaTypeFlexibility.FLEXIBLE_LOWER_BOUND || javaTypeAttributes.getHowThisTypeIsUsed() == TypeUsage.SUPERTYPE || a(javaClassifierType, classDescriptorMapJavaToKotlin$default))) ? javaToKotlinClassMapper.convertReadOnlyToMutable(classDescriptorMapJavaToKotlin$default) : classDescriptorMapJavaToKotlin$default;
    }

    private final KotlinType j(JavaClassifierType javaClassifierType, JavaTypeAttributes javaTypeAttributes) {
        boolean z = (javaTypeAttributes.isForAnnotationParameter() || javaTypeAttributes.getHowThisTypeIsUsed() == TypeUsage.SUPERTYPE) ? false : true;
        boolean zIsRaw = javaClassifierType.isRaw();
        if (!zIsRaw && !z) {
            SimpleType simpleTypeD = d(javaClassifierType, javaTypeAttributes, null);
            return simpleTypeD == null ? k(javaClassifierType) : simpleTypeD;
        }
        SimpleType simpleTypeD2 = d(javaClassifierType, javaTypeAttributes.withFlexibility(JavaTypeFlexibility.FLEXIBLE_LOWER_BOUND), null);
        if (simpleTypeD2 == null) {
            return k(javaClassifierType);
        }
        SimpleType simpleTypeD3 = d(javaClassifierType, javaTypeAttributes.withFlexibility(JavaTypeFlexibility.FLEXIBLE_UPPER_BOUND), simpleTypeD2);
        if (simpleTypeD3 == null) {
            return k(javaClassifierType);
        }
        return zIsRaw ? new RawTypeImpl(simpleTypeD2, simpleTypeD3) : KotlinTypeFactory.flexibleType(simpleTypeD2, simpleTypeD3);
    }

    private static final SimpleType k(JavaClassifierType javaClassifierType) {
        return ErrorUtils.createErrorType(Intrinsics.stringPlus("Unresolved java class ", javaClassifierType.getPresentableText()));
    }

    private final TypeProjection l(JavaType javaType, JavaTypeAttributes javaTypeAttributes, TypeParameterDescriptor typeParameterDescriptor) {
        if (!(javaType instanceof JavaWildcardType)) {
            return new TypeProjectionImpl(Variance.INVARIANT, transformJavaType(javaType, javaTypeAttributes));
        }
        JavaWildcardType javaWildcardType = (JavaWildcardType) javaType;
        JavaType bound = javaWildcardType.getBound();
        Variance variance = javaWildcardType.isExtends() ? Variance.OUT_VARIANCE : Variance.IN_VARIANCE;
        return (bound == null || g(variance, typeParameterDescriptor)) ? JavaTypeResolverKt.makeStarProjection(typeParameterDescriptor, javaTypeAttributes) : TypeUtilsKt.createProjection(transformJavaType(bound, JavaTypeResolverKt.toAttributes$default(TypeUsage.COMMON, false, null, 3, null)), variance, typeParameterDescriptor);
    }

    public static /* synthetic */ KotlinType transformArrayType$default(JavaTypeResolver javaTypeResolver, JavaArrayType javaArrayType, JavaTypeAttributes javaTypeAttributes, boolean z, int i, Object obj) {
        if ((i & 4) != 0) {
            z = false;
        }
        return javaTypeResolver.transformArrayType(javaArrayType, javaTypeAttributes, z);
    }

    @NotNull
    public final KotlinType transformArrayType(@NotNull JavaArrayType javaArrayType, @NotNull JavaTypeAttributes javaTypeAttributes, boolean z) {
        JavaType componentType = javaArrayType.getComponentType();
        JavaPrimitiveType javaPrimitiveType = componentType instanceof JavaPrimitiveType ? (JavaPrimitiveType) componentType : null;
        PrimitiveType type = javaPrimitiveType == null ? null : javaPrimitiveType.getType();
        LazyJavaAnnotations lazyJavaAnnotations = new LazyJavaAnnotations(this.a, javaArrayType, true);
        if (type != null) {
            SimpleType primitiveArrayKotlinType = this.a.getModule().getBuiltIns().getPrimitiveArrayKotlinType(type);
            primitiveArrayKotlinType.replaceAnnotations(Annotations.Companion.create(CollectionsKt___CollectionsKt.plus((Iterable) lazyJavaAnnotations, (Iterable) primitiveArrayKotlinType.getAnnotations())));
            return javaTypeAttributes.isForAnnotationParameter() ? primitiveArrayKotlinType : KotlinTypeFactory.flexibleType(primitiveArrayKotlinType, primitiveArrayKotlinType.makeNullableAsSpecified(true));
        }
        KotlinType kotlinTypeTransformJavaType = transformJavaType(componentType, JavaTypeResolverKt.toAttributes$default(TypeUsage.COMMON, javaTypeAttributes.isForAnnotationParameter(), null, 2, null));
        if (javaTypeAttributes.isForAnnotationParameter()) {
            return this.a.getModule().getBuiltIns().getArrayType(z ? Variance.OUT_VARIANCE : Variance.INVARIANT, kotlinTypeTransformJavaType, lazyJavaAnnotations);
        }
        return KotlinTypeFactory.flexibleType(this.a.getModule().getBuiltIns().getArrayType(Variance.INVARIANT, kotlinTypeTransformJavaType, lazyJavaAnnotations), this.a.getModule().getBuiltIns().getArrayType(Variance.OUT_VARIANCE, kotlinTypeTransformJavaType, lazyJavaAnnotations).makeNullableAsSpecified(true));
    }

    @NotNull
    public final KotlinType transformJavaType(@Nullable JavaType javaType, @NotNull JavaTypeAttributes javaTypeAttributes) {
        if (javaType instanceof JavaPrimitiveType) {
            PrimitiveType type = ((JavaPrimitiveType) javaType).getType();
            return type != null ? this.a.getModule().getBuiltIns().getPrimitiveKotlinType(type) : this.a.getModule().getBuiltIns().getUnitType();
        }
        if (javaType instanceof JavaClassifierType) {
            return j((JavaClassifierType) javaType, javaTypeAttributes);
        }
        if (javaType instanceof JavaArrayType) {
            return transformArrayType$default(this, (JavaArrayType) javaType, javaTypeAttributes, false, 4, null);
        }
        if (javaType instanceof JavaWildcardType) {
            JavaType bound = ((JavaWildcardType) javaType).getBound();
            KotlinType kotlinTypeTransformJavaType = bound == null ? null : transformJavaType(bound, javaTypeAttributes);
            return kotlinTypeTransformJavaType == null ? this.a.getModule().getBuiltIns().getDefaultBound() : kotlinTypeTransformJavaType;
        }
        if (javaType == null) {
            return this.a.getModule().getBuiltIns().getDefaultBound();
        }
        throw new UnsupportedOperationException(Intrinsics.stringPlus("Unsupported type: ", javaType));
    }
}
