package kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement;

import java.util.ArrayList;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.jvm.functions.Function1;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.JavaResolverSettings;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.types.RawTypeImpl;
import kotlin.reflect.jvm.internal.impl.types.FlexibleType;
import kotlin.reflect.jvm.internal.impl.types.FlexibleTypesKt;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.types.KotlinTypeFactory;
import kotlin.reflect.jvm.internal.impl.types.KotlinTypeKt;
import kotlin.reflect.jvm.internal.impl.types.RawType;
import kotlin.reflect.jvm.internal.impl.types.SimpleType;
import kotlin.reflect.jvm.internal.impl.types.SpecialTypesKt;
import kotlin.reflect.jvm.internal.impl.types.TypeConstructor;
import kotlin.reflect.jvm.internal.impl.types.TypeProjection;
import kotlin.reflect.jvm.internal.impl.types.TypeUtils;
import kotlin.reflect.jvm.internal.impl.types.TypeWithEnhancementKt;
import kotlin.reflect.jvm.internal.impl.types.UnwrappedType;
import kotlin.reflect.jvm.internal.impl.types.typeUtil.TypeUtilsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes23.dex */
public final class JavaTypeEnhancement {

    @NotNull
    private final JavaResolverSettings a;

    public static class a {

        @NotNull
        private final KotlinType a;
        private final int b;
        private final boolean c;

        public a(@NotNull KotlinType kotlinType, int i, boolean z) {
            this.a = kotlinType;
            this.b = i;
            this.c = z;
        }

        public final int a() {
            return this.b;
        }

        @NotNull
        public KotlinType b() {
            return this.a;
        }

        @Nullable
        public final KotlinType c() {
            KotlinType kotlinTypeB = b();
            if (d()) {
                return kotlinTypeB;
            }
            return null;
        }

        public final boolean d() {
            return this.c;
        }
    }

    public static final class b extends a {

        @NotNull
        private final SimpleType d;

        public b(@NotNull SimpleType simpleType, int i, boolean z) {
            super(simpleType, i, z);
            this.d = simpleType;
        }

        @Override // kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.JavaTypeEnhancement.a
        @NotNull
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public SimpleType b() {
            return this.d;
        }
    }

    public JavaTypeEnhancement(@NotNull JavaResolverSettings javaResolverSettings) {
        this.a = javaResolverSettings;
    }

    private final KotlinType a(KotlinType kotlinType, KotlinType kotlinType2) {
        KotlinType enhancement = TypeWithEnhancementKt.getEnhancement(kotlinType2);
        KotlinType enhancement2 = TypeWithEnhancementKt.getEnhancement(kotlinType);
        if (enhancement2 == null) {
            if (enhancement == null) {
                return null;
            }
            enhancement2 = enhancement;
        }
        return enhancement == null ? enhancement2 : KotlinTypeFactory.flexibleType(FlexibleTypesKt.lowerIfFlexible(enhancement2), FlexibleTypesKt.upperIfFlexible(enhancement));
    }

    private final b b(SimpleType simpleType, Function1<? super Integer, JavaTypeQualifiers> function1, int i, TypeComponentPosition typeComponentPosition, boolean z, boolean z2) {
        boolean z3;
        List<TypeProjection> arguments;
        TypeProjection typeProjectionCreateProjection;
        UnwrappedType unwrappedTypeWrapEnhancement;
        Function1<? super Integer, JavaTypeQualifiers> function2 = function1;
        if (!TypeComponentPositionKt.shouldEnhance(typeComponentPosition) && simpleType.getArguments().isEmpty()) {
            return new b(simpleType, 1, false);
        }
        ClassifierDescriptor classifierDescriptorMo4298getDeclarationDescriptor = simpleType.getConstructor().mo4298getDeclarationDescriptor();
        if (classifierDescriptorMo4298getDeclarationDescriptor == null) {
            return new b(simpleType, 1, false);
        }
        JavaTypeQualifiers javaTypeQualifiersInvoke = function2.invoke(Integer.valueOf(i));
        c cVarB = TypeEnhancementKt.b(classifierDescriptorMo4298getDeclarationDescriptor, javaTypeQualifiersInvoke, typeComponentPosition);
        ClassifierDescriptor classifierDescriptor = (ClassifierDescriptor) cVarB.a();
        Annotations annotationsB = cVarB.b();
        TypeConstructor typeConstructor = classifierDescriptor.getTypeConstructor();
        int iA = i + 1;
        boolean z4 = annotationsB != null;
        if (z2 && z) {
            iA += simpleType.getArguments().size();
            boolean z5 = z4;
            arguments = simpleType.getArguments();
            z3 = z5;
        } else {
            List<TypeProjection> arguments2 = simpleType.getArguments();
            ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(arguments2, 10));
            int i2 = 0;
            for (Object obj : arguments2) {
                int i3 = i2 + 1;
                if (i2 < 0) {
                    CollectionsKt__CollectionsKt.throwIndexOverflow();
                }
                TypeProjection typeProjection = (TypeProjection) obj;
                if (typeProjection.isStarProjection()) {
                    JavaTypeQualifiers javaTypeQualifiersInvoke2 = function2.invoke(Integer.valueOf(iA));
                    int i4 = iA + 1;
                    typeProjectionCreateProjection = (javaTypeQualifiersInvoke2.getNullability() != NullabilityQualifier.NOT_NULL || z) ? TypeUtils.makeStarProjection(classifierDescriptor.getTypeConstructor().getParameters().get(i2)) : TypeUtilsKt.createProjection(TypeUtilsKt.makeNotNullable(typeProjection.getType().unwrap()), typeProjection.getProjectionKind(), typeConstructor.getParameters().get(i2));
                    iA = i4;
                } else {
                    a aVarD = d(typeProjection.getType().unwrap(), function2, iA, z2);
                    z4 = z4 || aVarD.d();
                    iA += aVarD.a();
                    typeProjectionCreateProjection = TypeUtilsKt.createProjection(aVarD.b(), typeProjection.getProjectionKind(), typeConstructor.getParameters().get(i2));
                }
                arrayList.add(typeProjectionCreateProjection);
                function2 = function1;
                i2 = i3;
            }
            z3 = z4;
            arguments = arrayList;
        }
        c cVarE = TypeEnhancementKt.e(simpleType, javaTypeQualifiersInvoke, typeComponentPosition);
        boolean zBooleanValue = ((Boolean) cVarE.a()).booleanValue();
        Annotations annotationsB2 = cVarE.b();
        int i5 = iA - i;
        if (!(z3 || annotationsB2 != null)) {
            return new b(simpleType, i5, false);
        }
        boolean z6 = false;
        SimpleType simpleTypeSimpleType$default = KotlinTypeFactory.simpleType$default(TypeEnhancementKt.a(CollectionsKt__CollectionsKt.listOfNotNull((Object[]) new Annotations[]{simpleType.getAnnotations(), annotationsB, annotationsB2})), typeConstructor, arguments, zBooleanValue, null, 16, null);
        if (javaTypeQualifiersInvoke.isNotNullTypeParameter()) {
            unwrappedTypeWrapEnhancement = simpleTypeSimpleType$default;
            unwrappedTypeWrapEnhancement = e(simpleTypeSimpleType$default);
        }
        if (annotationsB2 != null && javaTypeQualifiersInvoke.isNullabilityQualifierForWarning()) {
            z6 = true;
        }
        if (z6) {
            unwrappedTypeWrapEnhancement = TypeWithEnhancementKt.wrapEnhancement(simpleType, unwrappedTypeWrapEnhancement);
        }
        return new b((SimpleType) unwrappedTypeWrapEnhancement, i5, true);
    }

    public static /* synthetic */ b c(JavaTypeEnhancement javaTypeEnhancement, SimpleType simpleType, Function1 function1, int i, TypeComponentPosition typeComponentPosition, boolean z, boolean z2, int i2, Object obj) {
        return javaTypeEnhancement.b(simpleType, function1, i, typeComponentPosition, (i2 & 8) != 0 ? false : z, (i2 & 16) != 0 ? false : z2);
    }

    private final a d(UnwrappedType unwrappedType, Function1<? super Integer, JavaTypeQualifiers> function1, int i, boolean z) {
        UnwrappedType unwrappedTypeWrapEnhancement = unwrappedType;
        if (KotlinTypeKt.isError(unwrappedType)) {
            return new a(unwrappedTypeWrapEnhancement, 1, false);
        }
        if (!(unwrappedTypeWrapEnhancement instanceof FlexibleType)) {
            if (unwrappedTypeWrapEnhancement instanceof SimpleType) {
                return c(this, (SimpleType) unwrappedTypeWrapEnhancement, function1, i, TypeComponentPosition.INFLEXIBLE, false, z, 8, null);
            }
            throw new NoWhenBranchMatchedException();
        }
        boolean z2 = unwrappedTypeWrapEnhancement instanceof RawType;
        FlexibleType flexibleType = (FlexibleType) unwrappedTypeWrapEnhancement;
        b bVarB = b(flexibleType.getLowerBound(), function1, i, TypeComponentPosition.FLEXIBLE_LOWER, z2, z);
        b bVarB2 = b(flexibleType.getUpperBound(), function1, i, TypeComponentPosition.FLEXIBLE_UPPER, z2, z);
        bVarB.a();
        bVarB2.a();
        boolean z3 = bVarB.d() || bVarB2.d();
        KotlinType kotlinTypeA = a(bVarB.b(), bVarB2.b());
        if (z3) {
            unwrappedTypeWrapEnhancement = TypeWithEnhancementKt.wrapEnhancement(unwrappedTypeWrapEnhancement instanceof RawTypeImpl ? new RawTypeImpl(bVarB.b(), bVarB2.b()) : KotlinTypeFactory.flexibleType(bVarB.b(), bVarB2.b()), kotlinTypeA);
        }
        return new a(unwrappedTypeWrapEnhancement, bVarB.a(), z3);
    }

    private final SimpleType e(SimpleType simpleType) {
        return this.a.getCorrectNullabilityForNotNullTypeParameter() ? SpecialTypesKt.makeSimpleTypeDefinitelyNotNullOrNotNull(simpleType, true) : new NotNullTypeParameter(simpleType);
    }

    @Nullable
    public final KotlinType enhance(@NotNull KotlinType kotlinType, @NotNull Function1<? super Integer, JavaTypeQualifiers> function1, boolean z) {
        return d(kotlinType.unwrap(), function1, 0, z).c();
    }
}
