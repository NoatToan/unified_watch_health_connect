package kotlin.reflect.jvm.internal.impl.types.typesApproximation;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.renderer.ClassifierNamePolicy;
import kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererOptions;
import kotlin.reflect.jvm.internal.impl.resolve.calls.inference.CapturedTypeConstructor;
import kotlin.reflect.jvm.internal.impl.resolve.calls.inference.CapturedTypeConstructorKt;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt;
import kotlin.reflect.jvm.internal.impl.types.FlexibleTypesKt;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.types.KotlinTypeFactory;
import kotlin.reflect.jvm.internal.impl.types.TypeConstructor;
import kotlin.reflect.jvm.internal.impl.types.TypeConstructorSubstitution;
import kotlin.reflect.jvm.internal.impl.types.TypeProjection;
import kotlin.reflect.jvm.internal.impl.types.TypeProjectionImpl;
import kotlin.reflect.jvm.internal.impl.types.TypeSubstitutionKt;
import kotlin.reflect.jvm.internal.impl.types.TypeSubstitutor;
import kotlin.reflect.jvm.internal.impl.types.TypeUtils;
import kotlin.reflect.jvm.internal.impl.types.TypeWithEnhancementKt;
import kotlin.reflect.jvm.internal.impl.types.UnwrappedType;
import kotlin.reflect.jvm.internal.impl.types.Variance;
import kotlin.reflect.jvm.internal.impl.types.typeUtil.TypeUtilsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes23.dex */
public final class CapturedTypeApproximationKt {

    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[Variance.values().length];
            iArr[Variance.INVARIANT.ordinal()] = 1;
            iArr[Variance.IN_VARIANCE.ordinal()] = 2;
            iArr[Variance.OUT_VARIANCE.ordinal()] = 3;
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final class a extends Lambda implements Function1<UnwrappedType, Boolean> {
        public static final a a = new a();

        public a() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(UnwrappedType unwrappedType) {
            return Boolean.valueOf(CapturedTypeConstructorKt.isCaptured(unwrappedType));
        }
    }

    public static final class b extends Lambda implements Function1<DescriptorRendererOptions, Unit> {
        public static final b a = new b();

        public b() {
            super(1);
        }

        public final void a(@NotNull DescriptorRendererOptions descriptorRendererOptions) {
            descriptorRendererOptions.setClassifierNamePolicy(ClassifierNamePolicy.FULLY_QUALIFIED.INSTANCE);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(DescriptorRendererOptions descriptorRendererOptions) {
            a(descriptorRendererOptions);
            return Unit.INSTANCE;
        }
    }

    private static final KotlinType a(KotlinType kotlinType, KotlinType kotlinType2) {
        return TypeUtils.makeNullableIfNeeded(kotlinType, kotlinType2.isMarkedNullable());
    }

    @NotNull
    public static final ApproximationBounds<KotlinType> approximateCapturedTypes(@NotNull KotlinType kotlinType) {
        if (FlexibleTypesKt.isFlexible(kotlinType)) {
            ApproximationBounds<KotlinType> approximationBoundsApproximateCapturedTypes = approximateCapturedTypes(FlexibleTypesKt.lowerIfFlexible(kotlinType));
            ApproximationBounds<KotlinType> approximationBoundsApproximateCapturedTypes2 = approximateCapturedTypes(FlexibleTypesKt.upperIfFlexible(kotlinType));
            return new ApproximationBounds<>(TypeWithEnhancementKt.inheritEnhancement(KotlinTypeFactory.flexibleType(FlexibleTypesKt.lowerIfFlexible(approximationBoundsApproximateCapturedTypes.getLower()), FlexibleTypesKt.upperIfFlexible(approximationBoundsApproximateCapturedTypes2.getLower())), kotlinType), TypeWithEnhancementKt.inheritEnhancement(KotlinTypeFactory.flexibleType(FlexibleTypesKt.lowerIfFlexible(approximationBoundsApproximateCapturedTypes.getUpper()), FlexibleTypesKt.upperIfFlexible(approximationBoundsApproximateCapturedTypes2.getUpper())), kotlinType));
        }
        TypeConstructor constructor = kotlinType.getConstructor();
        if (CapturedTypeConstructorKt.isCaptured(kotlinType)) {
            TypeProjection projection = ((CapturedTypeConstructor) constructor).getProjection();
            KotlinType kotlinTypeA = a(projection.getType(), kotlinType);
            int i = WhenMappings.$EnumSwitchMapping$0[projection.getProjectionKind().ordinal()];
            if (i == 2) {
                return new ApproximationBounds<>(kotlinTypeA, TypeUtilsKt.getBuiltIns(kotlinType).getNullableAnyType());
            }
            if (i == 3) {
                return new ApproximationBounds<>(a(TypeUtilsKt.getBuiltIns(kotlinType).getNothingType(), kotlinType), kotlinTypeA);
            }
            throw new AssertionError(Intrinsics.stringPlus("Only nontrivial projections should have been captured, not: ", projection));
        }
        if (kotlinType.getArguments().isEmpty() || kotlinType.getArguments().size() != constructor.getParameters().size()) {
            return new ApproximationBounds<>(kotlinType, kotlinType);
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (Pair pair : CollectionsKt___CollectionsKt.zip(kotlinType.getArguments(), constructor.getParameters())) {
            TypeProjection typeProjection = (TypeProjection) pair.component1();
            kotlin.reflect.jvm.internal.impl.types.typesApproximation.a aVarE = e(typeProjection, (TypeParameterDescriptor) pair.component2());
            if (typeProjection.isStarProjection()) {
                arrayList.add(aVarE);
                arrayList2.add(aVarE);
            } else {
                ApproximationBounds<kotlin.reflect.jvm.internal.impl.types.typesApproximation.a> approximationBoundsB = b(aVarE);
                kotlin.reflect.jvm.internal.impl.types.typesApproximation.a aVarComponent1 = approximationBoundsB.component1();
                kotlin.reflect.jvm.internal.impl.types.typesApproximation.a aVarComponent2 = approximationBoundsB.component2();
                arrayList.add(aVarComponent1);
                arrayList2.add(aVarComponent2);
            }
        }
        boolean z = true;
        if (arrayList.isEmpty()) {
            z = false;
            break;
        }
        Iterator it2 = arrayList.iterator();
        do {
            if (!it2.hasNext()) {
                z = false;
                break;
            }
        } while (!(!((kotlin.reflect.jvm.internal.impl.types.typesApproximation.a) it2.next()).d()));
        return new ApproximationBounds<>(z ? TypeUtilsKt.getBuiltIns(kotlinType).getNothingType() : c(kotlinType, arrayList), c(kotlinType, arrayList2));
    }

    @Nullable
    public static final TypeProjection approximateCapturedTypesIfNecessary(@Nullable TypeProjection typeProjection, boolean z) {
        if (typeProjection == null) {
            return null;
        }
        if (typeProjection.isStarProjection()) {
            return typeProjection;
        }
        KotlinType type = typeProjection.getType();
        if (!TypeUtils.contains(type, a.a)) {
            return typeProjection;
        }
        Variance projectionKind = typeProjection.getProjectionKind();
        if (projectionKind == Variance.OUT_VARIANCE) {
            return new TypeProjectionImpl(projectionKind, approximateCapturedTypes(type).getUpper());
        }
        return z ? new TypeProjectionImpl(projectionKind, approximateCapturedTypes(type).getLower()) : d(typeProjection);
    }

    private static final ApproximationBounds<kotlin.reflect.jvm.internal.impl.types.typesApproximation.a> b(kotlin.reflect.jvm.internal.impl.types.typesApproximation.a aVar) {
        ApproximationBounds<KotlinType> approximationBoundsApproximateCapturedTypes = approximateCapturedTypes(aVar.a());
        KotlinType kotlinTypeComponent1 = approximationBoundsApproximateCapturedTypes.component1();
        KotlinType kotlinTypeComponent2 = approximationBoundsApproximateCapturedTypes.component2();
        ApproximationBounds<KotlinType> approximationBoundsApproximateCapturedTypes2 = approximateCapturedTypes(aVar.b());
        return new ApproximationBounds<>(new kotlin.reflect.jvm.internal.impl.types.typesApproximation.a(aVar.c(), kotlinTypeComponent2, approximationBoundsApproximateCapturedTypes2.component1()), new kotlin.reflect.jvm.internal.impl.types.typesApproximation.a(aVar.c(), kotlinTypeComponent1, approximationBoundsApproximateCapturedTypes2.component2()));
    }

    private static final KotlinType c(KotlinType kotlinType, List<kotlin.reflect.jvm.internal.impl.types.typesApproximation.a> list) {
        kotlinType.getArguments().size();
        list.size();
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10));
        Iterator<T> it2 = list.iterator();
        while (it2.hasNext()) {
            arrayList.add(f((kotlin.reflect.jvm.internal.impl.types.typesApproximation.a) it2.next()));
        }
        return TypeSubstitutionKt.replace$default(kotlinType, arrayList, null, null, 6, null);
    }

    private static final TypeProjection d(TypeProjection typeProjection) {
        return TypeSubstitutor.create(new TypeConstructorSubstitution() { // from class: kotlin.reflect.jvm.internal.impl.types.typesApproximation.CapturedTypeApproximationKt$substituteCapturedTypesWithProjections$typeSubstitutor$1
            @Override // kotlin.reflect.jvm.internal.impl.types.TypeConstructorSubstitution
            @Nullable
            public TypeProjection get(@NotNull TypeConstructor typeConstructor) {
                CapturedTypeConstructor capturedTypeConstructor = typeConstructor instanceof CapturedTypeConstructor ? (CapturedTypeConstructor) typeConstructor : null;
                if (capturedTypeConstructor == null) {
                    return null;
                }
                return capturedTypeConstructor.getProjection().isStarProjection() ? new TypeProjectionImpl(Variance.OUT_VARIANCE, capturedTypeConstructor.getProjection().getType()) : capturedTypeConstructor.getProjection();
            }
        }).substituteWithoutApproximation(typeProjection);
    }

    private static final kotlin.reflect.jvm.internal.impl.types.typesApproximation.a e(TypeProjection typeProjection, TypeParameterDescriptor typeParameterDescriptor) {
        int i = WhenMappings.$EnumSwitchMapping$0[TypeSubstitutor.combine(typeParameterDescriptor.getVariance(), typeProjection).ordinal()];
        if (i == 1) {
            return new kotlin.reflect.jvm.internal.impl.types.typesApproximation.a(typeParameterDescriptor, typeProjection.getType(), typeProjection.getType());
        }
        if (i == 2) {
            return new kotlin.reflect.jvm.internal.impl.types.typesApproximation.a(typeParameterDescriptor, typeProjection.getType(), DescriptorUtilsKt.getBuiltIns(typeParameterDescriptor).getNullableAnyType());
        }
        if (i == 3) {
            return new kotlin.reflect.jvm.internal.impl.types.typesApproximation.a(typeParameterDescriptor, DescriptorUtilsKt.getBuiltIns(typeParameterDescriptor).getNothingType(), typeProjection.getType());
        }
        throw new NoWhenBranchMatchedException();
    }

    private static final TypeProjection f(kotlin.reflect.jvm.internal.impl.types.typesApproximation.a aVar) {
        aVar.d();
        if (!Intrinsics.areEqual(aVar.a(), aVar.b())) {
            Variance variance = aVar.c().getVariance();
            Variance variance2 = Variance.IN_VARIANCE;
            if (variance != variance2) {
                if (!KotlinBuiltIns.isNothing(aVar.a()) || aVar.c().getVariance() == variance2) {
                    return KotlinBuiltIns.isNullableAny(aVar.b()) ? new TypeProjectionImpl(g(aVar, variance2), aVar.a()) : new TypeProjectionImpl(g(aVar, Variance.OUT_VARIANCE), aVar.b());
                }
                return new TypeProjectionImpl(g(aVar, Variance.OUT_VARIANCE), aVar.b());
            }
        }
        return new TypeProjectionImpl(aVar.a());
    }

    private static final Variance g(kotlin.reflect.jvm.internal.impl.types.typesApproximation.a aVar, Variance variance) {
        return variance == aVar.c().getVariance() ? Variance.INVARIANT : variance;
    }
}
