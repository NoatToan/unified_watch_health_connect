package kotlin.reflect.jvm.internal.impl.types;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeAliasDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationsKt;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope;
import kotlin.reflect.jvm.internal.impl.types.typeUtil.TypeUtilsKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes23.dex */
public final class TypeAliasExpander {

    @NotNull
    public static final Companion Companion = new Companion(null);

    @NotNull
    private static final TypeAliasExpander c = new TypeAliasExpander(TypeAliasExpansionReportStrategy.DO_NOTHING.INSTANCE, false);

    @NotNull
    private final TypeAliasExpansionReportStrategy a;
    private final boolean b;

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void a(int i, TypeAliasDescriptor typeAliasDescriptor) {
            if (i > 100) {
                throw new AssertionError(Intrinsics.stringPlus("Too deep recursion while expanding type alias ", typeAliasDescriptor.getName()));
            }
        }
    }

    public TypeAliasExpander(@NotNull TypeAliasExpansionReportStrategy typeAliasExpansionReportStrategy, boolean z) {
        this.a = typeAliasExpansionReportStrategy;
        this.b = z;
    }

    private final void a(Annotations annotations, Annotations annotations2) {
        HashSet hashSet = new HashSet();
        Iterator<AnnotationDescriptor> it2 = annotations.iterator();
        while (it2.hasNext()) {
            hashSet.add(it2.next().getFqName());
        }
        for (AnnotationDescriptor annotationDescriptor : annotations2) {
            if (hashSet.contains(annotationDescriptor.getFqName())) {
                this.a.repeatedAnnotation(annotationDescriptor);
            }
        }
    }

    private final void b(KotlinType kotlinType, KotlinType kotlinType2) {
        TypeSubstitutor typeSubstitutorCreate = TypeSubstitutor.create(kotlinType2);
        int i = 0;
        for (Object obj : kotlinType2.getArguments()) {
            int i2 = i + 1;
            if (i < 0) {
                CollectionsKt__CollectionsKt.throwIndexOverflow();
            }
            TypeProjection typeProjection = (TypeProjection) obj;
            if (!typeProjection.isStarProjection() && !TypeUtilsKt.containsTypeAliasParameters(typeProjection.getType())) {
                TypeProjection typeProjection2 = kotlinType.getArguments().get(i);
                TypeParameterDescriptor typeParameterDescriptor = kotlinType.getConstructor().getParameters().get(i);
                if (this.b) {
                    this.a.boundsViolationInSubstitution(typeSubstitutorCreate, typeProjection2.getType(), typeProjection.getType(), typeParameterDescriptor);
                }
            }
            i = i2;
        }
    }

    private final DynamicType c(DynamicType dynamicType, Annotations annotations) {
        return dynamicType.replaceAnnotations(h(dynamicType, annotations));
    }

    private final SimpleType d(SimpleType simpleType, Annotations annotations) {
        return KotlinTypeKt.isError(simpleType) ? simpleType : TypeSubstitutionKt.replace$default(simpleType, null, h(simpleType, annotations), 1, null);
    }

    private final SimpleType e(SimpleType simpleType, KotlinType kotlinType) {
        return TypeUtils.makeNullableIfNeeded(simpleType, kotlinType.isMarkedNullable());
    }

    private final SimpleType f(SimpleType simpleType, KotlinType kotlinType) {
        return d(e(simpleType, kotlinType), kotlinType.getAnnotations());
    }

    private final SimpleType g(TypeAliasExpansion typeAliasExpansion, Annotations annotations, boolean z) {
        return KotlinTypeFactory.simpleTypeWithNonTrivialMemberScope(annotations, typeAliasExpansion.getDescriptor().getTypeConstructor(), typeAliasExpansion.getArguments(), z, MemberScope.Empty.INSTANCE);
    }

    private final Annotations h(KotlinType kotlinType, Annotations annotations) {
        return KotlinTypeKt.isError(kotlinType) ? kotlinType.getAnnotations() : AnnotationsKt.composeAnnotations(annotations, kotlinType.getAnnotations());
    }

    private final TypeProjection i(TypeProjection typeProjection, TypeAliasExpansion typeAliasExpansion, int i) {
        UnwrappedType unwrappedTypeUnwrap = typeProjection.getType().unwrap();
        if (DynamicTypesKt.isDynamic(unwrappedTypeUnwrap)) {
            return typeProjection;
        }
        SimpleType simpleTypeAsSimpleType = TypeSubstitutionKt.asSimpleType(unwrappedTypeUnwrap);
        if (KotlinTypeKt.isError(simpleTypeAsSimpleType) || !TypeUtilsKt.requiresTypeAliasExpansion(simpleTypeAsSimpleType)) {
            return typeProjection;
        }
        TypeConstructor constructor = simpleTypeAsSimpleType.getConstructor();
        ClassifierDescriptor classifierDescriptorMo4298getDeclarationDescriptor = constructor.mo4298getDeclarationDescriptor();
        constructor.getParameters().size();
        simpleTypeAsSimpleType.getArguments().size();
        if (classifierDescriptorMo4298getDeclarationDescriptor instanceof TypeParameterDescriptor) {
            return typeProjection;
        }
        if (!(classifierDescriptorMo4298getDeclarationDescriptor instanceof TypeAliasDescriptor)) {
            SimpleType simpleTypeL = l(simpleTypeAsSimpleType, typeAliasExpansion, i);
            b(simpleTypeAsSimpleType, simpleTypeL);
            return new TypeProjectionImpl(typeProjection.getProjectionKind(), simpleTypeL);
        }
        TypeAliasDescriptor typeAliasDescriptor = (TypeAliasDescriptor) classifierDescriptorMo4298getDeclarationDescriptor;
        if (typeAliasExpansion.isRecursion(typeAliasDescriptor)) {
            this.a.recursiveTypeAlias(typeAliasDescriptor);
            return new TypeProjectionImpl(Variance.INVARIANT, ErrorUtils.createErrorType(Intrinsics.stringPlus("Recursive type alias: ", typeAliasDescriptor.getName())));
        }
        List<TypeProjection> arguments = simpleTypeAsSimpleType.getArguments();
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(arguments, 10));
        int i2 = 0;
        for (Object obj : arguments) {
            int i3 = i2 + 1;
            if (i2 < 0) {
                CollectionsKt__CollectionsKt.throwIndexOverflow();
            }
            arrayList.add(k((TypeProjection) obj, typeAliasExpansion, constructor.getParameters().get(i2), i + 1));
            i2 = i3;
        }
        SimpleType simpleTypeJ = j(TypeAliasExpansion.Companion.create(typeAliasExpansion, typeAliasDescriptor, arrayList), simpleTypeAsSimpleType.getAnnotations(), simpleTypeAsSimpleType.isMarkedNullable(), i + 1, false);
        SimpleType simpleTypeL2 = l(simpleTypeAsSimpleType, typeAliasExpansion, i);
        if (!DynamicTypesKt.isDynamic(simpleTypeJ)) {
            simpleTypeJ = SpecialTypesKt.withAbbreviation(simpleTypeJ, simpleTypeL2);
        }
        return new TypeProjectionImpl(typeProjection.getProjectionKind(), simpleTypeJ);
    }

    private final SimpleType j(TypeAliasExpansion typeAliasExpansion, Annotations annotations, boolean z, int i, boolean z2) {
        TypeProjection typeProjectionK = k(new TypeProjectionImpl(Variance.INVARIANT, typeAliasExpansion.getDescriptor().getUnderlyingType()), typeAliasExpansion, null, i);
        SimpleType simpleTypeAsSimpleType = TypeSubstitutionKt.asSimpleType(typeProjectionK.getType());
        if (KotlinTypeKt.isError(simpleTypeAsSimpleType)) {
            return simpleTypeAsSimpleType;
        }
        typeProjectionK.getProjectionKind();
        a(simpleTypeAsSimpleType.getAnnotations(), annotations);
        SimpleType simpleTypeMakeNullableIfNeeded = TypeUtils.makeNullableIfNeeded(d(simpleTypeAsSimpleType, annotations), z);
        return z2 ? SpecialTypesKt.withAbbreviation(simpleTypeMakeNullableIfNeeded, g(typeAliasExpansion, annotations, z)) : simpleTypeMakeNullableIfNeeded;
    }

    private final TypeProjection k(TypeProjection typeProjection, TypeAliasExpansion typeAliasExpansion, TypeParameterDescriptor typeParameterDescriptor, int i) {
        Variance variance;
        Variance variance2;
        Companion.a(i, typeAliasExpansion.getDescriptor());
        if (typeProjection.isStarProjection()) {
            return TypeUtils.makeStarProjection(typeParameterDescriptor);
        }
        KotlinType type = typeProjection.getType();
        TypeProjection replacement = typeAliasExpansion.getReplacement(type.getConstructor());
        if (replacement == null) {
            return i(typeProjection, typeAliasExpansion, i);
        }
        if (replacement.isStarProjection()) {
            return TypeUtils.makeStarProjection(typeParameterDescriptor);
        }
        UnwrappedType unwrappedTypeUnwrap = replacement.getType().unwrap();
        Variance projectionKind = replacement.getProjectionKind();
        Variance projectionKind2 = typeProjection.getProjectionKind();
        if (projectionKind2 != projectionKind && projectionKind2 != (variance2 = Variance.INVARIANT)) {
            if (projectionKind == variance2) {
                projectionKind = projectionKind2;
            } else {
                this.a.conflictingProjection(typeAliasExpansion.getDescriptor(), typeParameterDescriptor, unwrappedTypeUnwrap);
            }
        }
        Variance variance3 = typeParameterDescriptor == null ? null : typeParameterDescriptor.getVariance();
        if (variance3 == null) {
            variance3 = Variance.INVARIANT;
        }
        if (variance3 != projectionKind && variance3 != (variance = Variance.INVARIANT)) {
            if (projectionKind == variance) {
                projectionKind = variance;
            } else {
                this.a.conflictingProjection(typeAliasExpansion.getDescriptor(), typeParameterDescriptor, unwrappedTypeUnwrap);
            }
        }
        a(type.getAnnotations(), unwrappedTypeUnwrap.getAnnotations());
        return new TypeProjectionImpl(projectionKind, unwrappedTypeUnwrap instanceof DynamicType ? c((DynamicType) unwrappedTypeUnwrap, type.getAnnotations()) : f(TypeSubstitutionKt.asSimpleType(unwrappedTypeUnwrap), type));
    }

    private final SimpleType l(SimpleType simpleType, TypeAliasExpansion typeAliasExpansion, int i) {
        TypeConstructor constructor = simpleType.getConstructor();
        List<TypeProjection> arguments = simpleType.getArguments();
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(arguments, 10));
        int i2 = 0;
        for (Object obj : arguments) {
            int i3 = i2 + 1;
            if (i2 < 0) {
                CollectionsKt__CollectionsKt.throwIndexOverflow();
            }
            TypeProjection typeProjection = (TypeProjection) obj;
            TypeProjection typeProjectionK = k(typeProjection, typeAliasExpansion, constructor.getParameters().get(i2), i + 1);
            if (!typeProjectionK.isStarProjection()) {
                typeProjectionK = new TypeProjectionImpl(typeProjectionK.getProjectionKind(), TypeUtils.makeNullableIfNeeded(typeProjectionK.getType(), typeProjection.getType().isMarkedNullable()));
            }
            arrayList.add(typeProjectionK);
            i2 = i3;
        }
        return TypeSubstitutionKt.replace$default(simpleType, arrayList, null, 2, null);
    }

    @NotNull
    public final SimpleType expand(@NotNull TypeAliasExpansion typeAliasExpansion, @NotNull Annotations annotations) {
        return j(typeAliasExpansion, annotations, false, 0, true);
    }
}
