package kotlin.reflect.jvm.internal.impl.load.java.lazy.types;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.e;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations;
import kotlin.reflect.jvm.internal.impl.load.java.components.TypeUsage;
import kotlin.reflect.jvm.internal.impl.name.ClassId;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope;
import kotlin.reflect.jvm.internal.impl.types.ErrorUtils;
import kotlin.reflect.jvm.internal.impl.types.FlexibleTypesKt;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.types.KotlinTypeFactory;
import kotlin.reflect.jvm.internal.impl.types.KotlinTypeKt;
import kotlin.reflect.jvm.internal.impl.types.SimpleType;
import kotlin.reflect.jvm.internal.impl.types.TypeConstructor;
import kotlin.reflect.jvm.internal.impl.types.TypeProjection;
import kotlin.reflect.jvm.internal.impl.types.TypeProjectionImpl;
import kotlin.reflect.jvm.internal.impl.types.TypeSubstitution;
import kotlin.reflect.jvm.internal.impl.types.Variance;
import kotlin.reflect.jvm.internal.impl.types.checker.KotlinTypeRefiner;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes23.dex */
public final class RawSubstitution extends TypeSubstitution {

    @NotNull
    public static final Companion Companion = new Companion(null);

    @NotNull
    private static final JavaTypeAttributes b;

    @NotNull
    private static final JavaTypeAttributes c;

    @NotNull
    private final TypeParameterUpperBoundEraser a;

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[JavaTypeFlexibility.values().length];
            iArr[JavaTypeFlexibility.FLEXIBLE_LOWER_BOUND.ordinal()] = 1;
            iArr[JavaTypeFlexibility.FLEXIBLE_UPPER_BOUND.ordinal()] = 2;
            iArr[JavaTypeFlexibility.INFLEXIBLE.ordinal()] = 3;
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final class a extends Lambda implements Function1<KotlinTypeRefiner, SimpleType> {
        public final /* synthetic */ ClassDescriptor a;
        public final /* synthetic */ RawSubstitution b;
        public final /* synthetic */ SimpleType c;
        public final /* synthetic */ JavaTypeAttributes d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(ClassDescriptor classDescriptor, RawSubstitution rawSubstitution, SimpleType simpleType, JavaTypeAttributes javaTypeAttributes) {
            super(1);
            this.a = classDescriptor;
            this.b = rawSubstitution;
            this.c = simpleType;
            this.d = javaTypeAttributes;
        }

        @Override // kotlin.jvm.functions.Function1
        @Nullable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final SimpleType invoke(@NotNull KotlinTypeRefiner kotlinTypeRefiner) {
            ClassDescriptor classDescriptorFindClassAcrossModuleDependencies;
            ClassDescriptor classDescriptor = this.a;
            if (!(classDescriptor instanceof ClassDescriptor)) {
                classDescriptor = null;
            }
            ClassId classId = classDescriptor == null ? null : DescriptorUtilsKt.getClassId(classDescriptor);
            if (classId == null || (classDescriptorFindClassAcrossModuleDependencies = kotlinTypeRefiner.findClassAcrossModuleDependencies(classId)) == null || Intrinsics.areEqual(classDescriptorFindClassAcrossModuleDependencies, this.a)) {
                return null;
            }
            return (SimpleType) this.b.a(this.c, classDescriptorFindClassAcrossModuleDependencies, this.d).getFirst();
        }
    }

    static {
        TypeUsage typeUsage = TypeUsage.COMMON;
        b = JavaTypeResolverKt.toAttributes$default(typeUsage, false, null, 3, null).withFlexibility(JavaTypeFlexibility.FLEXIBLE_LOWER_BOUND);
        c = JavaTypeResolverKt.toAttributes$default(typeUsage, false, null, 3, null).withFlexibility(JavaTypeFlexibility.FLEXIBLE_UPPER_BOUND);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public RawSubstitution() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public RawSubstitution(@Nullable TypeParameterUpperBoundEraser typeParameterUpperBoundEraser) {
        this.a = typeParameterUpperBoundEraser == null ? new TypeParameterUpperBoundEraser(this) : typeParameterUpperBoundEraser;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Pair<SimpleType, Boolean> a(SimpleType simpleType, ClassDescriptor classDescriptor, JavaTypeAttributes javaTypeAttributes) {
        if (simpleType.getConstructor().getParameters().isEmpty()) {
            return TuplesKt.to(simpleType, Boolean.FALSE);
        }
        if (KotlinBuiltIns.isArray(simpleType)) {
            TypeProjection typeProjection = simpleType.getArguments().get(0);
            return TuplesKt.to(KotlinTypeFactory.simpleType$default(simpleType.getAnnotations(), simpleType.getConstructor(), e.listOf(new TypeProjectionImpl(typeProjection.getProjectionKind(), b(typeProjection.getType(), javaTypeAttributes))), simpleType.isMarkedNullable(), null, 16, null), Boolean.FALSE);
        }
        if (KotlinTypeKt.isError(simpleType)) {
            return TuplesKt.to(ErrorUtils.createErrorType(Intrinsics.stringPlus("Raw error type: ", simpleType.getConstructor())), Boolean.FALSE);
        }
        MemberScope memberScope = classDescriptor.getMemberScope(this);
        Annotations annotations = simpleType.getAnnotations();
        TypeConstructor typeConstructor = classDescriptor.getTypeConstructor();
        List<TypeParameterDescriptor> parameters = classDescriptor.getTypeConstructor().getParameters();
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(parameters, 10));
        Iterator<T> it2 = parameters.iterator();
        while (it2.hasNext()) {
            arrayList.add(computeProjection$default(this, (TypeParameterDescriptor) it2.next(), javaTypeAttributes, null, 4, null));
        }
        return TuplesKt.to(KotlinTypeFactory.simpleTypeWithNonTrivialMemberScope(annotations, typeConstructor, arrayList, simpleType.isMarkedNullable(), memberScope, new a(classDescriptor, this, simpleType, javaTypeAttributes)), Boolean.TRUE);
    }

    private final KotlinType b(KotlinType kotlinType, JavaTypeAttributes javaTypeAttributes) {
        ClassifierDescriptor classifierDescriptorMo4298getDeclarationDescriptor = kotlinType.getConstructor().mo4298getDeclarationDescriptor();
        if (classifierDescriptorMo4298getDeclarationDescriptor instanceof TypeParameterDescriptor) {
            return b(this.a.getErasedUpperBound$descriptors_jvm((TypeParameterDescriptor) classifierDescriptorMo4298getDeclarationDescriptor, true, javaTypeAttributes), javaTypeAttributes);
        }
        if (!(classifierDescriptorMo4298getDeclarationDescriptor instanceof ClassDescriptor)) {
            throw new IllegalStateException(Intrinsics.stringPlus("Unexpected declaration kind: ", classifierDescriptorMo4298getDeclarationDescriptor).toString());
        }
        ClassifierDescriptor classifierDescriptorMo4298getDeclarationDescriptor2 = FlexibleTypesKt.upperIfFlexible(kotlinType).getConstructor().mo4298getDeclarationDescriptor();
        if (classifierDescriptorMo4298getDeclarationDescriptor2 instanceof ClassDescriptor) {
            Pair<SimpleType, Boolean> pairA = a(FlexibleTypesKt.lowerIfFlexible(kotlinType), (ClassDescriptor) classifierDescriptorMo4298getDeclarationDescriptor, b);
            SimpleType simpleTypeComponent1 = pairA.component1();
            boolean zBooleanValue = pairA.component2().booleanValue();
            Pair<SimpleType, Boolean> pairA2 = a(FlexibleTypesKt.upperIfFlexible(kotlinType), (ClassDescriptor) classifierDescriptorMo4298getDeclarationDescriptor2, c);
            SimpleType simpleTypeComponent2 = pairA2.component1();
            return (zBooleanValue || pairA2.component2().booleanValue()) ? new RawTypeImpl(simpleTypeComponent1, simpleTypeComponent2) : KotlinTypeFactory.flexibleType(simpleTypeComponent1, simpleTypeComponent2);
        }
        throw new IllegalStateException(("For some reason declaration for upper bound is not a class but \"" + classifierDescriptorMo4298getDeclarationDescriptor2 + "\" while for lower it's \"" + classifierDescriptorMo4298getDeclarationDescriptor + '\"').toString());
    }

    public static /* synthetic */ KotlinType c(RawSubstitution rawSubstitution, KotlinType kotlinType, JavaTypeAttributes javaTypeAttributes, int i, Object obj) {
        if ((i & 2) != 0) {
            javaTypeAttributes = new JavaTypeAttributes(TypeUsage.COMMON, null, false, null, null, 30, null);
        }
        return rawSubstitution.b(kotlinType, javaTypeAttributes);
    }

    public static /* synthetic */ TypeProjection computeProjection$default(RawSubstitution rawSubstitution, TypeParameterDescriptor typeParameterDescriptor, JavaTypeAttributes javaTypeAttributes, KotlinType kotlinType, int i, Object obj) {
        if ((i & 4) != 0) {
            kotlinType = rawSubstitution.a.getErasedUpperBound$descriptors_jvm(typeParameterDescriptor, true, javaTypeAttributes);
        }
        return rawSubstitution.computeProjection(typeParameterDescriptor, javaTypeAttributes, kotlinType);
    }

    @NotNull
    public final TypeProjection computeProjection(@NotNull TypeParameterDescriptor typeParameterDescriptor, @NotNull JavaTypeAttributes javaTypeAttributes, @NotNull KotlinType kotlinType) {
        int i = WhenMappings.$EnumSwitchMapping$0[javaTypeAttributes.getFlexibility().ordinal()];
        if (i == 1) {
            return new TypeProjectionImpl(Variance.INVARIANT, kotlinType);
        }
        if (i != 2 && i != 3) {
            throw new NoWhenBranchMatchedException();
        }
        if (typeParameterDescriptor.getVariance().getAllowsOutPosition()) {
            return kotlinType.getConstructor().getParameters().isEmpty() ^ true ? new TypeProjectionImpl(Variance.OUT_VARIANCE, kotlinType) : JavaTypeResolverKt.makeStarProjection(typeParameterDescriptor, javaTypeAttributes);
        }
        return new TypeProjectionImpl(Variance.INVARIANT, DescriptorUtilsKt.getBuiltIns(typeParameterDescriptor).getNothingType());
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.TypeSubstitution
    public boolean isEmpty() {
        return false;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.TypeSubstitution
    @NotNull
    /* JADX INFO: renamed from: get */
    public TypeProjectionImpl mo4302get(@NotNull KotlinType kotlinType) {
        return new TypeProjectionImpl(c(this, kotlinType, null, 2, null));
    }

    public /* synthetic */ RawSubstitution(TypeParameterUpperBoundEraser typeParameterUpperBoundEraser, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : typeParameterUpperBoundEraser);
    }
}
