package kotlin.reflect.jvm.internal.impl.types;

import java.util.List;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeAliasDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.ModuleAwareClassDescriptorKt;
import kotlin.reflect.jvm.internal.impl.resolve.constants.IntegerLiteralTypeConstructor;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope;
import kotlin.reflect.jvm.internal.impl.types.checker.KotlinTypeRefiner;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes23.dex */
public final class KotlinTypeFactory {

    @NotNull
    public static final KotlinTypeFactory INSTANCE = new KotlinTypeFactory();

    @NotNull
    private static final Function1<KotlinTypeRefiner, SimpleType> a = a.a;

    public static final class a extends Lambda implements Function1 {
        public static final a a = new a();

        public a() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        @Nullable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Void invoke(@NotNull KotlinTypeRefiner kotlinTypeRefiner) {
            return null;
        }
    }

    public static final class b {

        @Nullable
        private final SimpleType a;

        @Nullable
        private final TypeConstructor b;

        public b(@Nullable SimpleType simpleType, @Nullable TypeConstructor typeConstructor) {
            this.a = simpleType;
            this.b = typeConstructor;
        }

        @Nullable
        public final SimpleType a() {
            return this.a;
        }

        @Nullable
        public final TypeConstructor b() {
            return this.b;
        }
    }

    public static final class c extends Lambda implements Function1<KotlinTypeRefiner, SimpleType> {
        public final /* synthetic */ TypeConstructor a;
        public final /* synthetic */ List<TypeProjection> b;
        public final /* synthetic */ Annotations c;
        public final /* synthetic */ boolean d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public c(TypeConstructor typeConstructor, List<? extends TypeProjection> list, Annotations annotations, boolean z) {
            super(1);
            this.a = typeConstructor;
            this.b = list;
            this.c = annotations;
            this.d = z;
        }

        @Override // kotlin.jvm.functions.Function1
        @Nullable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final SimpleType invoke(@NotNull KotlinTypeRefiner kotlinTypeRefiner) {
            b bVarB = KotlinTypeFactory.INSTANCE.b(this.a, kotlinTypeRefiner, this.b);
            if (bVarB == null) {
                return null;
            }
            SimpleType simpleTypeA = bVarB.a();
            return simpleTypeA == null ? KotlinTypeFactory.simpleType(this.c, bVarB.b(), this.b, this.d, kotlinTypeRefiner) : simpleTypeA;
        }
    }

    public static final class d extends Lambda implements Function1<KotlinTypeRefiner, SimpleType> {
        public final /* synthetic */ TypeConstructor a;
        public final /* synthetic */ List<TypeProjection> b;
        public final /* synthetic */ Annotations c;
        public final /* synthetic */ boolean d;
        public final /* synthetic */ MemberScope e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public d(TypeConstructor typeConstructor, List<? extends TypeProjection> list, Annotations annotations, boolean z, MemberScope memberScope) {
            super(1);
            this.a = typeConstructor;
            this.b = list;
            this.c = annotations;
            this.d = z;
            this.e = memberScope;
        }

        @Override // kotlin.jvm.functions.Function1
        @Nullable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final SimpleType invoke(@NotNull KotlinTypeRefiner kotlinTypeRefiner) {
            b bVarB = KotlinTypeFactory.INSTANCE.b(this.a, kotlinTypeRefiner, this.b);
            if (bVarB == null) {
                return null;
            }
            SimpleType simpleTypeA = bVarB.a();
            return simpleTypeA == null ? KotlinTypeFactory.simpleTypeWithNonTrivialMemberScope(this.c, bVarB.b(), this.b, this.d, this.e) : simpleTypeA;
        }
    }

    private KotlinTypeFactory() {
    }

    private final MemberScope a(TypeConstructor typeConstructor, List<? extends TypeProjection> list, KotlinTypeRefiner kotlinTypeRefiner) {
        ClassifierDescriptor classifierDescriptorMo4298getDeclarationDescriptor = typeConstructor.mo4298getDeclarationDescriptor();
        if (classifierDescriptorMo4298getDeclarationDescriptor instanceof TypeParameterDescriptor) {
            return ((TypeParameterDescriptor) classifierDescriptorMo4298getDeclarationDescriptor).getDefaultType().getMemberScope();
        }
        if (classifierDescriptorMo4298getDeclarationDescriptor instanceof ClassDescriptor) {
            if (kotlinTypeRefiner == null) {
                kotlinTypeRefiner = DescriptorUtilsKt.getKotlinTypeRefiner(DescriptorUtilsKt.getModule(classifierDescriptorMo4298getDeclarationDescriptor));
            }
            return list.isEmpty() ? ModuleAwareClassDescriptorKt.getRefinedUnsubstitutedMemberScopeIfPossible((ClassDescriptor) classifierDescriptorMo4298getDeclarationDescriptor, kotlinTypeRefiner) : ModuleAwareClassDescriptorKt.getRefinedMemberScopeIfPossible((ClassDescriptor) classifierDescriptorMo4298getDeclarationDescriptor, TypeConstructorSubstitution.Companion.create(typeConstructor, list), kotlinTypeRefiner);
        }
        if (classifierDescriptorMo4298getDeclarationDescriptor instanceof TypeAliasDescriptor) {
            return ErrorUtils.createErrorScope(Intrinsics.stringPlus("Scope for abbreviation: ", ((TypeAliasDescriptor) classifierDescriptorMo4298getDeclarationDescriptor).getName()), true);
        }
        if (typeConstructor instanceof IntersectionTypeConstructor) {
            return ((IntersectionTypeConstructor) typeConstructor).createScopeForKotlinType();
        }
        throw new IllegalStateException("Unsupported classifier: " + classifierDescriptorMo4298getDeclarationDescriptor + " for constructor: " + typeConstructor);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final b b(TypeConstructor typeConstructor, KotlinTypeRefiner kotlinTypeRefiner, List<? extends TypeProjection> list) {
        ClassifierDescriptor classifierDescriptorMo4298getDeclarationDescriptor = typeConstructor.mo4298getDeclarationDescriptor();
        ClassifierDescriptor classifierDescriptorRefineDescriptor = classifierDescriptorMo4298getDeclarationDescriptor == null ? null : kotlinTypeRefiner.refineDescriptor(classifierDescriptorMo4298getDeclarationDescriptor);
        if (classifierDescriptorRefineDescriptor == null) {
            return null;
        }
        return classifierDescriptorRefineDescriptor instanceof TypeAliasDescriptor ? new b(computeExpandedType((TypeAliasDescriptor) classifierDescriptorRefineDescriptor, list), null) : new b(null, classifierDescriptorRefineDescriptor.getTypeConstructor().refine(kotlinTypeRefiner));
    }

    @JvmStatic
    @NotNull
    public static final SimpleType computeExpandedType(@NotNull TypeAliasDescriptor typeAliasDescriptor, @NotNull List<? extends TypeProjection> list) {
        return new TypeAliasExpander(TypeAliasExpansionReportStrategy.DO_NOTHING.INSTANCE, false).expand(TypeAliasExpansion.Companion.create(null, typeAliasDescriptor, list), Annotations.Companion.getEMPTY());
    }

    @JvmStatic
    @NotNull
    public static final UnwrappedType flexibleType(@NotNull SimpleType simpleType, @NotNull SimpleType simpleType2) {
        return Intrinsics.areEqual(simpleType, simpleType2) ? simpleType : new FlexibleTypeImpl(simpleType, simpleType2);
    }

    @JvmStatic
    @NotNull
    public static final SimpleType integerLiteralType(@NotNull Annotations annotations, @NotNull IntegerLiteralTypeConstructor integerLiteralTypeConstructor, boolean z) {
        return simpleTypeWithNonTrivialMemberScope(annotations, integerLiteralTypeConstructor, CollectionsKt__CollectionsKt.emptyList(), z, ErrorUtils.createErrorScope("Scope for integer literal type", true));
    }

    @JvmStatic
    @NotNull
    public static final SimpleType simpleNotNullType(@NotNull Annotations annotations, @NotNull ClassDescriptor classDescriptor, @NotNull List<? extends TypeProjection> list) {
        return simpleType$default(annotations, classDescriptor.getTypeConstructor(), list, false, null, 16, null);
    }

    @JvmStatic
    @JvmOverloads
    @NotNull
    public static final SimpleType simpleType(@NotNull Annotations annotations, @NotNull TypeConstructor typeConstructor, @NotNull List<? extends TypeProjection> list, boolean z, @Nullable KotlinTypeRefiner kotlinTypeRefiner) {
        return (!annotations.isEmpty() || !list.isEmpty() || z || typeConstructor.mo4298getDeclarationDescriptor() == null) ? simpleTypeWithNonTrivialMemberScope(annotations, typeConstructor, list, z, INSTANCE.a(typeConstructor, list, kotlinTypeRefiner), new c(typeConstructor, list, annotations, z)) : typeConstructor.mo4298getDeclarationDescriptor().getDefaultType();
    }

    public static /* synthetic */ SimpleType simpleType$default(Annotations annotations, TypeConstructor typeConstructor, List list, boolean z, KotlinTypeRefiner kotlinTypeRefiner, int i, Object obj) {
        if ((i & 16) != 0) {
            kotlinTypeRefiner = null;
        }
        return simpleType(annotations, typeConstructor, list, z, kotlinTypeRefiner);
    }

    @JvmStatic
    @NotNull
    public static final SimpleType simpleTypeWithNonTrivialMemberScope(@NotNull Annotations annotations, @NotNull TypeConstructor typeConstructor, @NotNull List<? extends TypeProjection> list, boolean z, @NotNull MemberScope memberScope) {
        kotlin.reflect.jvm.internal.impl.types.d dVar = new kotlin.reflect.jvm.internal.impl.types.d(typeConstructor, list, z, memberScope, new d(typeConstructor, list, annotations, z, memberScope));
        return annotations.isEmpty() ? dVar : new kotlin.reflect.jvm.internal.impl.types.a(dVar, annotations);
    }

    @JvmStatic
    @NotNull
    public static final SimpleType simpleTypeWithNonTrivialMemberScope(@NotNull Annotations annotations, @NotNull TypeConstructor typeConstructor, @NotNull List<? extends TypeProjection> list, boolean z, @NotNull MemberScope memberScope, @NotNull Function1<? super KotlinTypeRefiner, ? extends SimpleType> function1) {
        kotlin.reflect.jvm.internal.impl.types.d dVar = new kotlin.reflect.jvm.internal.impl.types.d(typeConstructor, list, z, memberScope, function1);
        return annotations.isEmpty() ? dVar : new kotlin.reflect.jvm.internal.impl.types.a(dVar, annotations);
    }
}
