package kotlin.reflect.jvm.internal;

import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.tekartik.sqflite.Constant;
import java.lang.annotation.Annotation;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.WildcardType;
import java.util.ArrayList;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.NotImplementedError;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.jvm.JvmClassMappingKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.KTypeBase;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import kotlin.reflect.KClassifier;
import kotlin.reflect.KProperty;
import kotlin.reflect.KTypeProjection;
import kotlin.reflect.jvm.KTypesJvm;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeAliasDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.ReflectClassUtilKt;
import kotlin.reflect.jvm.internal.impl.types.FlexibleTypesKt;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.types.TypeProjection;
import kotlin.reflect.jvm.internal.impl.types.TypeUtils;
import kotlin.reflect.jvm.internal.impl.types.Variance;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes23.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u001b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0010\b\u0002\u0010\u0017\u001a\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010.¢\u0006\u0004\b/\u00100J\u0012\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0017\u0010\n\u001a\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u0006H\u0000¢\u0006\u0004\b\b\u0010\tJ\u0013\u0010\r\u001a\u00020\u00062\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0096\u0002J\b\u0010\u000f\u001a\u00020\u000eH\u0016J\b\u0010\u0011\u001a\u00020\u0010H\u0016R$\u0010\u0017\u001a\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u00128\u0002@\u0002X\u0082\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0014\u0012\u0004\b\u0015\u0010\u0016R\u001f\u0010\u001b\u001a\u0004\u0018\u00010\u00048V@\u0016X\u0096\u0084\u0002¢\u0006\f\n\u0004\b\u0018\u0010\u0014\u001a\u0004\b\u0019\u0010\u001aR#\u0010!\u001a\b\u0012\u0004\u0012\u00020\u001d0\u001c8V@\u0016X\u0096\u0084\u0002¢\u0006\f\n\u0004\b\u001e\u0010\u0014\u001a\u0004\b\u001f\u0010 R\u0019\u0010\u0003\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%R\u0018\u0010(\u001a\u0004\u0018\u00010\u00138V@\u0016X\u0096\u0004¢\u0006\u0006\u001a\u0004\b&\u0010'R\u0016\u0010)\u001a\u00020\u00068V@\u0016X\u0096\u0004¢\u0006\u0006\u001a\u0004\b)\u0010*R\u001c\u0010-\u001a\b\u0012\u0004\u0012\u00020+0\u001c8V@\u0016X\u0096\u0004¢\u0006\u0006\u001a\u0004\b,\u0010 ¨\u00061"}, d2 = {"Lkotlin/reflect/jvm/internal/KTypeImpl;", "Lkotlin/jvm/internal/KTypeBase;", "Lkotlin/reflect/jvm/internal/impl/types/KotlinType;", "type", "Lkotlin/reflect/KClassifier;", "a", "", "nullable", "makeNullableAsSpecified$kotlin_reflection", "(Z)Lkotlin/reflect/jvm/internal/KTypeImpl;", "makeNullableAsSpecified", "", "other", "equals", "", "hashCode", "", "toString", "Lkotlin/reflect/jvm/internal/ReflectProperties$LazySoftVal;", "Ljava/lang/reflect/Type;", "Lkotlin/reflect/jvm/internal/ReflectProperties$LazySoftVal;", "getComputeJavaType$annotations", "()V", "computeJavaType", "b", "getClassifier", "()Lkotlin/reflect/KClassifier;", "classifier", "", "Lkotlin/reflect/KTypeProjection;", "c", "getArguments", "()Ljava/util/List;", Constant.PARAM_SQL_ARGUMENTS, GoogleApiAvailabilityLight.a, "Lkotlin/reflect/jvm/internal/impl/types/KotlinType;", "getType", "()Lorg/jetbrains/kotlin/types/KotlinType;", "getJavaType", "()Ljava/lang/reflect/Type;", "javaType", "isMarkedNullable", "()Z", "", "getAnnotations", "annotations", "Lkotlin/Function0;", "<init>", "(Lorg/jetbrains/kotlin/types/KotlinType;Lkotlin/jvm/functions/Function0;)V", "kotlin-reflection"}, k = 1, mv = {1, 5, 1})
public final class KTypeImpl implements KTypeBase {
    public static final /* synthetic */ KProperty[] e = {Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(KTypeImpl.class), "classifier", "getClassifier()Lkotlin/reflect/KClassifier;")), Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(KTypeImpl.class), Constant.PARAM_SQL_ARGUMENTS, "getArguments()Ljava/util/List;"))};

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final ReflectProperties.LazySoftVal<Type> computeJavaType;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @Nullable
    private final ReflectProperties.LazySoftVal classifier;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    private final ReflectProperties.LazySoftVal arguments;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    private final KotlinType type;

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    public final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[Variance.values().length];
            $EnumSwitchMapping$0 = iArr;
            iArr[Variance.INVARIANT.ordinal()] = 1;
            iArr[Variance.IN_VARIANCE.ordinal()] = 2;
            iArr[Variance.OUT_VARIANCE.ordinal()] = 3;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0005\u001a\u0016\u0012\u0004\u0012\u00020\u0001 \u0002*\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "Lkotlin/reflect/KTypeProjection;", "kotlin.jvm.PlatformType", "invoke", "()Ljava/util/List;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function0<List<? extends KTypeProjection>> {
        public final /* synthetic */ Function0 b;

        /* JADX INFO: renamed from: kotlin.reflect.jvm.internal.KTypeImpl$a$a, reason: collision with other inner class name */
        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002¨\u0006\u0003"}, d2 = {"Ljava/lang/reflect/Type;", "a", "()Ljava/lang/reflect/Type;", "kotlin/reflect/jvm/internal/KTypeImpl$arguments$2$1$type$1"}, k = 3, mv = {1, 5, 1})
        public static final class C1162a extends Lambda implements Function0<Type> {
            public final /* synthetic */ int a;
            public final /* synthetic */ a b;
            public final /* synthetic */ Lazy c;
            public final /* synthetic */ KProperty d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C1162a(int i, a aVar, Lazy lazy, KProperty kProperty) {
                super(0);
                this.a = i;
                this.b = aVar;
                this.c = lazy;
                this.d = kProperty;
            }

            @Override // kotlin.jvm.functions.Function0
            @NotNull
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Type invoke() {
                Type javaType = KTypeImpl.this.getJavaType();
                if (javaType instanceof Class) {
                    Class cls = (Class) javaType;
                    return cls.isArray() ? cls.getComponentType() : Object.class;
                }
                if (javaType instanceof GenericArrayType) {
                    if (this.a == 0) {
                        return ((GenericArrayType) javaType).getGenericComponentType();
                    }
                    throw new KotlinReflectionInternalError("Array type has been queried for a non-0th argument: " + KTypeImpl.this);
                }
                if (!(javaType instanceof ParameterizedType)) {
                    throw new KotlinReflectionInternalError("Non-generic type has been queried for arguments: " + KTypeImpl.this);
                }
                Type type = (Type) ((List) this.c.getValue()).get(this.a);
                if (!(type instanceof WildcardType)) {
                    return type;
                }
                WildcardType wildcardType = (WildcardType) type;
                Type type2 = (Type) ArraysKt.firstOrNull(wildcardType.getLowerBounds());
                return type2 != null ? type2 : (Type) ArraysKt.first(wildcardType.getUpperBounds());
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"", "Ljava/lang/reflect/Type;", "invoke", "()Ljava/util/List;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class b extends Lambda implements Function0<List<? extends Type>> {
            public b() {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final List<? extends Type> invoke() {
                return ReflectClassUtilKt.getParameterizedTypeArguments(KTypeImpl.this.getJavaType());
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Function0 function0) {
            super(0);
            this.b = function0;
        }

        @Override // kotlin.jvm.functions.Function0
        public final List<? extends KTypeProjection> invoke() {
            KTypeProjection kTypeProjectionInvariant;
            List<TypeProjection> arguments = KTypeImpl.this.getType().getArguments();
            if (arguments.isEmpty()) {
                return CollectionsKt__CollectionsKt.emptyList();
            }
            Lazy lazy = LazyKt__LazyJVMKt.lazy(LazyThreadSafetyMode.PUBLICATION, (Function0) new b());
            ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(arguments, 10));
            int i = 0;
            for (Object obj : arguments) {
                int i2 = i + 1;
                if (i < 0) {
                    CollectionsKt__CollectionsKt.throwIndexOverflow();
                }
                TypeProjection typeProjection = (TypeProjection) obj;
                if (typeProjection.isStarProjection()) {
                    kTypeProjectionInvariant = KTypeProjection.Companion.getSTAR();
                } else {
                    KTypeImpl kTypeImpl = new KTypeImpl(typeProjection.getType(), this.b != null ? new C1162a(i, this, lazy, null) : null);
                    int i3 = WhenMappings.$EnumSwitchMapping$0[typeProjection.getProjectionKind().ordinal()];
                    if (i3 == 1) {
                        kTypeProjectionInvariant = KTypeProjection.Companion.invariant(kTypeImpl);
                    } else if (i3 == 2) {
                        kTypeProjectionInvariant = KTypeProjection.Companion.contravariant(kTypeImpl);
                    } else {
                        if (i3 != 3) {
                            throw new NoWhenBranchMatchedException();
                        }
                        kTypeProjectionInvariant = KTypeProjection.Companion.covariant(kTypeImpl);
                    }
                }
                arrayList.add(kTypeProjectionInvariant);
                i = i2;
            }
            return arrayList;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/reflect/KClassifier;", "a", "()Lkotlin/reflect/KClassifier;"}, k = 3, mv = {1, 5, 1})
    public static final class b extends Lambda implements Function0<KClassifier> {
        public b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final KClassifier invoke() {
            KTypeImpl kTypeImpl = KTypeImpl.this;
            return kTypeImpl.a(kTypeImpl.getType());
        }
    }

    public KTypeImpl(@NotNull KotlinType kotlinType, @Nullable Function0<? extends Type> function0) {
        this.type = kotlinType;
        ReflectProperties.LazySoftVal<Type> lazySoftValLazySoft = null;
        ReflectProperties.LazySoftVal<Type> lazySoftVal = (ReflectProperties.LazySoftVal) (!(function0 instanceof ReflectProperties.LazySoftVal) ? null : function0);
        if (lazySoftVal != null) {
            lazySoftValLazySoft = lazySoftVal;
        } else if (function0 != null) {
            lazySoftValLazySoft = ReflectProperties.lazySoft(function0);
        }
        this.computeJavaType = lazySoftValLazySoft;
        this.classifier = ReflectProperties.lazySoft(new b());
        this.arguments = ReflectProperties.lazySoft(new a(function0));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final KClassifier a(KotlinType type) {
        KotlinType type2;
        ClassifierDescriptor classifierDescriptorMo4298getDeclarationDescriptor = type.getConstructor().mo4298getDeclarationDescriptor();
        if (!(classifierDescriptorMo4298getDeclarationDescriptor instanceof ClassDescriptor)) {
            if (classifierDescriptorMo4298getDeclarationDescriptor instanceof TypeParameterDescriptor) {
                return new KTypeParameterImpl(null, (TypeParameterDescriptor) classifierDescriptorMo4298getDeclarationDescriptor);
            }
            if (!(classifierDescriptorMo4298getDeclarationDescriptor instanceof TypeAliasDescriptor)) {
                return null;
            }
            throw new NotImplementedError("An operation is not implemented: Type alias classifiers are not yet supported");
        }
        Class<?> javaClass = UtilKt.toJavaClass((ClassDescriptor) classifierDescriptorMo4298getDeclarationDescriptor);
        if (javaClass == null) {
            return null;
        }
        if (!javaClass.isArray()) {
            if (TypeUtils.isNullableType(type)) {
                return new KClassImpl(javaClass);
            }
            Class<?> primitiveByWrapper = ReflectClassUtilKt.getPrimitiveByWrapper(javaClass);
            if (primitiveByWrapper != null) {
                javaClass = primitiveByWrapper;
            }
            return new KClassImpl(javaClass);
        }
        TypeProjection typeProjection = (TypeProjection) CollectionsKt.singleOrNull((List) type.getArguments());
        if (typeProjection == null || (type2 = typeProjection.getType()) == null) {
            return new KClassImpl(javaClass);
        }
        KClassifier kClassifierA = a(type2);
        if (kClassifierA != null) {
            return new KClassImpl(UtilKt.createArrayType(JvmClassMappingKt.getJavaClass((KClass) KTypesJvm.getJvmErasure(kClassifierA))));
        }
        throw new KotlinReflectionInternalError("Cannot determine classifier for array element type: " + this);
    }

    public boolean equals(@Nullable Object other) {
        return (other instanceof KTypeImpl) && Intrinsics.areEqual(this.type, ((KTypeImpl) other).type);
    }

    @Override // kotlin.reflect.KAnnotatedElement
    @NotNull
    public List<Annotation> getAnnotations() {
        return UtilKt.computeAnnotations(this.type);
    }

    @Override // kotlin.reflect.KType
    @NotNull
    public List<KTypeProjection> getArguments() {
        return (List) this.arguments.getValue(this, e[1]);
    }

    @Override // kotlin.reflect.KType
    @Nullable
    public KClassifier getClassifier() {
        return (KClassifier) this.classifier.getValue(this, e[0]);
    }

    @Override // kotlin.jvm.internal.KTypeBase
    @Nullable
    public Type getJavaType() {
        ReflectProperties.LazySoftVal<Type> lazySoftVal = this.computeJavaType;
        if (lazySoftVal != null) {
            return lazySoftVal.invoke();
        }
        return null;
    }

    @NotNull
    public final KotlinType getType() {
        return this.type;
    }

    public int hashCode() {
        return this.type.hashCode();
    }

    @Override // kotlin.reflect.KType
    public boolean isMarkedNullable() {
        return this.type.isMarkedNullable();
    }

    @NotNull
    public final KTypeImpl makeNullableAsSpecified$kotlin_reflection(boolean nullable) {
        return (FlexibleTypesKt.isFlexible(this.type) || isMarkedNullable() != nullable) ? new KTypeImpl(TypeUtils.makeNullableAsSpecified(this.type, nullable), this.computeJavaType) : this;
    }

    @NotNull
    public String toString() {
        return ReflectionObjectRenderer.INSTANCE.renderType(this.type);
    }

    public /* synthetic */ KTypeImpl(KotlinType kotlinType, Function0 function0, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(kotlinType, (i & 2) != 0 ? null : function0);
    }
}
