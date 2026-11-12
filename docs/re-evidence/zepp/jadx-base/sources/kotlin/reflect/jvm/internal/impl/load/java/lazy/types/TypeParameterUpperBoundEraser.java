package kotlin.reflect.jvm.internal.impl.load.java.lazy.types;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.q;
import kotlin.collections.x;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.ranges.e;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.storage.LockBasedStorageManager;
import kotlin.reflect.jvm.internal.impl.storage.MemoizedFunctionToNotNull;
import kotlin.reflect.jvm.internal.impl.types.ErrorUtils;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.types.SimpleType;
import kotlin.reflect.jvm.internal.impl.types.TypeConstructorSubstitution;
import kotlin.reflect.jvm.internal.impl.types.TypeSubstitutor;
import kotlin.reflect.jvm.internal.impl.types.Variance;
import kotlin.reflect.jvm.internal.impl.types.typeUtil.TypeUtilsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes23.dex */
public final class TypeParameterUpperBoundEraser {

    @NotNull
    private final LockBasedStorageManager a;

    @NotNull
    private final Lazy b;

    @NotNull
    private final RawSubstitution c;

    @NotNull
    private final MemoizedFunctionToNotNull<a, KotlinType> d;

    public static final class a {

        @NotNull
        private final TypeParameterDescriptor a;
        private final boolean b;

        @NotNull
        private final JavaTypeAttributes c;

        public a(@NotNull TypeParameterDescriptor typeParameterDescriptor, boolean z, @NotNull JavaTypeAttributes javaTypeAttributes) {
            this.a = typeParameterDescriptor;
            this.b = z;
            this.c = javaTypeAttributes;
        }

        @NotNull
        public final JavaTypeAttributes a() {
            return this.c;
        }

        @NotNull
        public final TypeParameterDescriptor b() {
            return this.a;
        }

        public final boolean c() {
            return this.b;
        }

        public boolean equals(@Nullable Object obj) {
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return Intrinsics.areEqual(aVar.a, this.a) && aVar.b == this.b && aVar.c.getFlexibility() == this.c.getFlexibility() && aVar.c.getHowThisTypeIsUsed() == this.c.getHowThisTypeIsUsed() && aVar.c.isForAnnotationParameter() == this.c.isForAnnotationParameter() && Intrinsics.areEqual(aVar.c.getDefaultType(), this.c.getDefaultType());
        }

        public int hashCode() {
            int iHashCode = this.a.hashCode();
            int i = iHashCode + (iHashCode * 31) + (this.b ? 1 : 0);
            int iHashCode2 = i + (i * 31) + this.c.getFlexibility().hashCode();
            int iHashCode3 = iHashCode2 + (iHashCode2 * 31) + this.c.getHowThisTypeIsUsed().hashCode();
            int i2 = iHashCode3 + (iHashCode3 * 31) + (this.c.isForAnnotationParameter() ? 1 : 0);
            int i3 = i2 * 31;
            SimpleType defaultType = this.c.getDefaultType();
            return i2 + i3 + (defaultType != null ? defaultType.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            return "DataToEraseUpperBound(typeParameter=" + this.a + ", isRaw=" + this.b + ", typeAttr=" + this.c + ')';
        }
    }

    public static final class b extends Lambda implements Function0<SimpleType> {
        public b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final SimpleType getA() {
            return ErrorUtils.createErrorType("Can't compute erased upper bound of type parameter `" + TypeParameterUpperBoundEraser.this + '`');
        }
    }

    public static final class c extends Lambda implements Function1<a, KotlinType> {
        public c() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final KotlinType invoke(a aVar) {
            return TypeParameterUpperBoundEraser.this.b(aVar.b(), aVar.c(), aVar.a());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public TypeParameterUpperBoundEraser() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public TypeParameterUpperBoundEraser(@Nullable RawSubstitution rawSubstitution) {
        LockBasedStorageManager lockBasedStorageManager = new LockBasedStorageManager("Type parameter upper bound erasion results");
        this.a = lockBasedStorageManager;
        this.b = LazyKt__LazyJVMKt.lazy(new b());
        this.c = rawSubstitution == null ? new RawSubstitution(this) : rawSubstitution;
        this.d = lockBasedStorageManager.createMemoizedFunction(new c());
    }

    private final KotlinType a(JavaTypeAttributes javaTypeAttributes) {
        SimpleType defaultType = javaTypeAttributes.getDefaultType();
        KotlinType kotlinTypeReplaceArgumentsWithStarProjections = defaultType == null ? null : TypeUtilsKt.replaceArgumentsWithStarProjections(defaultType);
        return kotlinTypeReplaceArgumentsWithStarProjections == null ? c() : kotlinTypeReplaceArgumentsWithStarProjections;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final KotlinType b(TypeParameterDescriptor typeParameterDescriptor, boolean z, JavaTypeAttributes javaTypeAttributes) {
        Set<TypeParameterDescriptor> visitedTypeParameters = javaTypeAttributes.getVisitedTypeParameters();
        if (visitedTypeParameters != null && visitedTypeParameters.contains(typeParameterDescriptor.getOriginal())) {
            return a(javaTypeAttributes);
        }
        Set<TypeParameterDescriptor> setExtractTypeParametersFromUpperBounds = TypeUtilsKt.extractTypeParametersFromUpperBounds(typeParameterDescriptor.getDefaultType(), visitedTypeParameters);
        LinkedHashMap linkedHashMap = new LinkedHashMap(e.coerceAtLeast(q.mapCapacity(CollectionsKt__IterablesKt.collectionSizeOrDefault(setExtractTypeParametersFromUpperBounds, 10)), 16));
        for (TypeParameterDescriptor typeParameterDescriptor2 : setExtractTypeParametersFromUpperBounds) {
            Pair pair = TuplesKt.to(typeParameterDescriptor2.getTypeConstructor(), (visitedTypeParameters == null || !visitedTypeParameters.contains(typeParameterDescriptor2)) ? this.c.computeProjection(typeParameterDescriptor2, z ? javaTypeAttributes : javaTypeAttributes.withFlexibility(JavaTypeFlexibility.INFLEXIBLE), getErasedUpperBound$descriptors_jvm(typeParameterDescriptor2, z, javaTypeAttributes.withNewVisitedTypeParameter(typeParameterDescriptor))) : JavaTypeResolverKt.makeStarProjection(typeParameterDescriptor2, javaTypeAttributes));
            linkedHashMap.put(pair.getFirst(), pair.getSecond());
        }
        TypeSubstitutor typeSubstitutorCreate = TypeSubstitutor.create(TypeConstructorSubstitution.Companion.createByConstructorsMap$default(TypeConstructorSubstitution.Companion, linkedHashMap, false, 2, null));
        KotlinType kotlinType = (KotlinType) CollectionsKt.first((List) typeParameterDescriptor.getUpperBounds());
        if (kotlinType.getConstructor().mo4298getDeclarationDescriptor() instanceof ClassDescriptor) {
            return TypeUtilsKt.replaceArgumentsWithStarProjectionOrMapped(kotlinType, typeSubstitutorCreate, linkedHashMap, Variance.OUT_VARIANCE, javaTypeAttributes.getVisitedTypeParameters());
        }
        Set<TypeParameterDescriptor> visitedTypeParameters2 = javaTypeAttributes.getVisitedTypeParameters();
        if (visitedTypeParameters2 == null) {
            visitedTypeParameters2 = x.setOf(this);
        }
        ClassifierDescriptor classifierDescriptorMo4298getDeclarationDescriptor = kotlinType.getConstructor().mo4298getDeclarationDescriptor();
        Objects.requireNonNull(classifierDescriptorMo4298getDeclarationDescriptor, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.TypeParameterDescriptor");
        while (true) {
            TypeParameterDescriptor typeParameterDescriptor3 = (TypeParameterDescriptor) classifierDescriptorMo4298getDeclarationDescriptor;
            if (visitedTypeParameters2.contains(typeParameterDescriptor3)) {
                return a(javaTypeAttributes);
            }
            KotlinType kotlinType2 = (KotlinType) CollectionsKt.first((List) typeParameterDescriptor3.getUpperBounds());
            if (kotlinType2.getConstructor().mo4298getDeclarationDescriptor() instanceof ClassDescriptor) {
                return TypeUtilsKt.replaceArgumentsWithStarProjectionOrMapped(kotlinType2, typeSubstitutorCreate, linkedHashMap, Variance.OUT_VARIANCE, javaTypeAttributes.getVisitedTypeParameters());
            }
            classifierDescriptorMo4298getDeclarationDescriptor = kotlinType2.getConstructor().mo4298getDeclarationDescriptor();
            Objects.requireNonNull(classifierDescriptorMo4298getDeclarationDescriptor, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.TypeParameterDescriptor");
        }
    }

    private final SimpleType c() {
        return (SimpleType) this.b.getValue();
    }

    public final KotlinType getErasedUpperBound$descriptors_jvm(@NotNull TypeParameterDescriptor typeParameterDescriptor, boolean z, @NotNull JavaTypeAttributes javaTypeAttributes) {
        return this.d.invoke(new a(typeParameterDescriptor, z, javaTypeAttributes));
    }

    public /* synthetic */ TypeParameterUpperBoundEraser(RawSubstitution rawSubstitution, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : rawSubstitution);
    }
}
