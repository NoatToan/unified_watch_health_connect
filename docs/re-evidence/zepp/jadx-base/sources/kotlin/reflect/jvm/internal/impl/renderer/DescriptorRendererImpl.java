package kotlin.reflect.jvm.internal.impl.renderer;

import com.alipay.sdk.m.u.i;
import com.huami.device.feature.notification.statistics.NotificationEvent;
import com.huami.watch.util.AppUtil;
import com.xiaomi.account.openauth.AuthorizeActivityBase;
import io.netty.util.internal.StringUtil;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.collections.z;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.jvm.internal.impl.builtins.FunctionTypesKt;
import kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns;
import kotlin.reflect.jvm.internal.impl.builtins.StandardNames;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassConstructorDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassKind;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptorWithTypeParameters;
import kotlin.reflect.jvm.internal.impl.descriptors.ConstructorDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptorVisitor;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptorWithSource;
import kotlin.reflect.jvm.internal.impl.descriptors.DescriptorVisibilities;
import kotlin.reflect.jvm.internal.impl.descriptors.DescriptorVisibility;
import kotlin.reflect.jvm.internal.impl.descriptors.FieldDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.MemberDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.Modality;
import kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.NotFoundClasses;
import kotlin.reflect.jvm.internal.impl.descriptors.PackageFragmentDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.PackageViewDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.PossiblyInnerType;
import kotlin.reflect.jvm.internal.impl.descriptors.PropertyAccessorDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.PropertyGetterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.PropertySetterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ReceiverParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeAliasDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterUtilsKt;
import kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.VariableDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotated;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationUseSiteTarget;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import kotlin.reflect.jvm.internal.impl.name.FqNameUnsafe;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.name.SpecialNames;
import kotlin.reflect.jvm.internal.impl.resolve.DescriptorUtils;
import kotlin.reflect.jvm.internal.impl.resolve.constants.AnnotationValue;
import kotlin.reflect.jvm.internal.impl.resolve.constants.ArrayValue;
import kotlin.reflect.jvm.internal.impl.resolve.constants.ConstantValue;
import kotlin.reflect.jvm.internal.impl.resolve.constants.KClassValue;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt;
import kotlin.reflect.jvm.internal.impl.types.AbbreviatedType;
import kotlin.reflect.jvm.internal.impl.types.DefinitelyNotNullType;
import kotlin.reflect.jvm.internal.impl.types.ErrorType;
import kotlin.reflect.jvm.internal.impl.types.ErrorUtils;
import kotlin.reflect.jvm.internal.impl.types.FlexibleType;
import kotlin.reflect.jvm.internal.impl.types.IntersectionTypeConstructor;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.types.KotlinTypeKt;
import kotlin.reflect.jvm.internal.impl.types.SimpleType;
import kotlin.reflect.jvm.internal.impl.types.SpecialTypesKt;
import kotlin.reflect.jvm.internal.impl.types.StubTypeForBuilderInference;
import kotlin.reflect.jvm.internal.impl.types.TypeConstructor;
import kotlin.reflect.jvm.internal.impl.types.TypeProjection;
import kotlin.reflect.jvm.internal.impl.types.TypeUtils;
import kotlin.reflect.jvm.internal.impl.types.UnresolvedType;
import kotlin.reflect.jvm.internal.impl.types.UnwrappedType;
import kotlin.reflect.jvm.internal.impl.types.Variance;
import kotlin.reflect.jvm.internal.impl.types.WrappedType;
import kotlin.reflect.jvm.internal.impl.util.capitalizeDecapitalize.CapitalizeDecapitalizeKt;
import kotlin.text.StringsKt__StringsKt;
import kotlin.text.StringsKt___StringsKt;
import kotlin.text.Typography;
import kotlin.text.m;
import org.cybergarage.upnp.std.av.server.object.SearchCriteria;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes23.dex */
public final class DescriptorRendererImpl extends DescriptorRenderer implements DescriptorRendererOptions {

    @NotNull
    private final DescriptorRendererOptionsImpl a;

    @NotNull
    private final Lazy b;

    public final class RenderDeclarationDescriptorVisitor implements DeclarationDescriptorVisitor<Unit, StringBuilder> {

        public /* synthetic */ class WhenMappings {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[PropertyAccessorRenderingPolicy.values().length];
                iArr[PropertyAccessorRenderingPolicy.PRETTY.ordinal()] = 1;
                iArr[PropertyAccessorRenderingPolicy.DEBUG.ordinal()] = 2;
                iArr[PropertyAccessorRenderingPolicy.NONE.ordinal()] = 3;
                $EnumSwitchMapping$0 = iArr;
            }
        }

        public RenderDeclarationDescriptorVisitor() {
        }

        private final void g(PropertyAccessorDescriptor propertyAccessorDescriptor, StringBuilder sb, String str) throws IOException {
            int i = WhenMappings.$EnumSwitchMapping$0[DescriptorRendererImpl.this.getPropertyAccessorRenderingPolicy().ordinal()];
            if (i != 1) {
                if (i != 2) {
                    return;
                }
                c(propertyAccessorDescriptor, sb);
            } else {
                DescriptorRendererImpl.this.n(propertyAccessorDescriptor, sb);
                sb.append(Intrinsics.stringPlus(str, " for "));
                DescriptorRendererImpl.this.S(propertyAccessorDescriptor.getCorrespondingProperty(), sb);
            }
        }

        public void a(@NotNull ClassDescriptor classDescriptor, @NotNull StringBuilder sb) throws IOException {
            DescriptorRendererImpl.this.t(classDescriptor, sb);
        }

        public void b(@NotNull ConstructorDescriptor constructorDescriptor, @NotNull StringBuilder sb) throws IOException {
            DescriptorRendererImpl.this.x(constructorDescriptor, sb);
        }

        public void c(@NotNull FunctionDescriptor functionDescriptor, @NotNull StringBuilder sb) throws IOException {
            DescriptorRendererImpl.this.B(functionDescriptor, sb);
        }

        public void d(@NotNull ModuleDescriptor moduleDescriptor, @NotNull StringBuilder sb) {
            DescriptorRendererImpl.this.K(moduleDescriptor, sb, true);
        }

        public void e(@NotNull PackageFragmentDescriptor packageFragmentDescriptor, @NotNull StringBuilder sb) {
            DescriptorRendererImpl.this.O(packageFragmentDescriptor, sb);
        }

        public void f(@NotNull PackageViewDescriptor packageViewDescriptor, @NotNull StringBuilder sb) {
            DescriptorRendererImpl.this.Q(packageViewDescriptor, sb);
        }

        public void h(@NotNull PropertyDescriptor propertyDescriptor, @NotNull StringBuilder sb) throws IOException {
            DescriptorRendererImpl.this.S(propertyDescriptor, sb);
        }

        public void i(@NotNull PropertyGetterDescriptor propertyGetterDescriptor, @NotNull StringBuilder sb) throws IOException {
            g(propertyGetterDescriptor, sb, "getter");
        }

        public void j(@NotNull PropertySetterDescriptor propertySetterDescriptor, @NotNull StringBuilder sb) throws IOException {
            g(propertySetterDescriptor, sb, "setter");
        }

        public void k(@NotNull ReceiverParameterDescriptor receiverParameterDescriptor, @NotNull StringBuilder sb) {
            sb.append(receiverParameterDescriptor.getName());
        }

        public void l(@NotNull TypeAliasDescriptor typeAliasDescriptor, @NotNull StringBuilder sb) {
            DescriptorRendererImpl.this.a0(typeAliasDescriptor, sb);
        }

        public void m(@NotNull TypeParameterDescriptor typeParameterDescriptor, @NotNull StringBuilder sb) {
            DescriptorRendererImpl.this.d0(typeParameterDescriptor, sb, true);
        }

        public void n(@NotNull ValueParameterDescriptor valueParameterDescriptor, @NotNull StringBuilder sb) {
            DescriptorRendererImpl.this.i0(valueParameterDescriptor, true, sb, true);
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptorVisitor
        public /* bridge */ /* synthetic */ Unit visitClassDescriptor(ClassDescriptor classDescriptor, StringBuilder sb) throws IOException {
            a(classDescriptor, sb);
            return Unit.INSTANCE;
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptorVisitor
        public /* bridge */ /* synthetic */ Unit visitConstructorDescriptor(ConstructorDescriptor constructorDescriptor, StringBuilder sb) throws IOException {
            b(constructorDescriptor, sb);
            return Unit.INSTANCE;
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptorVisitor
        public /* bridge */ /* synthetic */ Unit visitFunctionDescriptor(FunctionDescriptor functionDescriptor, StringBuilder sb) throws IOException {
            c(functionDescriptor, sb);
            return Unit.INSTANCE;
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptorVisitor
        public /* bridge */ /* synthetic */ Unit visitModuleDeclaration(ModuleDescriptor moduleDescriptor, StringBuilder sb) {
            d(moduleDescriptor, sb);
            return Unit.INSTANCE;
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptorVisitor
        public /* bridge */ /* synthetic */ Unit visitPackageFragmentDescriptor(PackageFragmentDescriptor packageFragmentDescriptor, StringBuilder sb) {
            e(packageFragmentDescriptor, sb);
            return Unit.INSTANCE;
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptorVisitor
        public /* bridge */ /* synthetic */ Unit visitPackageViewDescriptor(PackageViewDescriptor packageViewDescriptor, StringBuilder sb) {
            f(packageViewDescriptor, sb);
            return Unit.INSTANCE;
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptorVisitor
        public /* bridge */ /* synthetic */ Unit visitPropertyDescriptor(PropertyDescriptor propertyDescriptor, StringBuilder sb) throws IOException {
            h(propertyDescriptor, sb);
            return Unit.INSTANCE;
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptorVisitor
        public /* bridge */ /* synthetic */ Unit visitPropertyGetterDescriptor(PropertyGetterDescriptor propertyGetterDescriptor, StringBuilder sb) throws IOException {
            i(propertyGetterDescriptor, sb);
            return Unit.INSTANCE;
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptorVisitor
        public /* bridge */ /* synthetic */ Unit visitPropertySetterDescriptor(PropertySetterDescriptor propertySetterDescriptor, StringBuilder sb) throws IOException {
            j(propertySetterDescriptor, sb);
            return Unit.INSTANCE;
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptorVisitor
        public /* bridge */ /* synthetic */ Unit visitReceiverParameterDescriptor(ReceiverParameterDescriptor receiverParameterDescriptor, StringBuilder sb) {
            k(receiverParameterDescriptor, sb);
            return Unit.INSTANCE;
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptorVisitor
        public /* bridge */ /* synthetic */ Unit visitTypeAliasDescriptor(TypeAliasDescriptor typeAliasDescriptor, StringBuilder sb) {
            l(typeAliasDescriptor, sb);
            return Unit.INSTANCE;
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptorVisitor
        public /* bridge */ /* synthetic */ Unit visitTypeParameterDescriptor(TypeParameterDescriptor typeParameterDescriptor, StringBuilder sb) {
            m(typeParameterDescriptor, sb);
            return Unit.INSTANCE;
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptorVisitor
        public /* bridge */ /* synthetic */ Unit visitValueParameterDescriptor(ValueParameterDescriptor valueParameterDescriptor, StringBuilder sb) {
            n(valueParameterDescriptor, sb);
            return Unit.INSTANCE;
        }
    }

    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[RenderingFormat.values().length];
            iArr[RenderingFormat.PLAIN.ordinal()] = 1;
            iArr[RenderingFormat.HTML.ordinal()] = 2;
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[ParameterNameRenderingPolicy.values().length];
            iArr2[ParameterNameRenderingPolicy.ALL.ordinal()] = 1;
            iArr2[ParameterNameRenderingPolicy.ONLY_NON_SYNTHESIZED.ordinal()] = 2;
            iArr2[ParameterNameRenderingPolicy.NONE.ordinal()] = 3;
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    public static final class a extends Lambda implements Function1<TypeProjection, CharSequence> {
        public a() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final CharSequence invoke(@NotNull TypeProjection typeProjection) {
            if (typeProjection.isStarProjection()) {
                return "*";
            }
            String strRenderType = DescriptorRendererImpl.this.renderType(typeProjection.getType());
            if (typeProjection.getProjectionKind() == Variance.INVARIANT) {
                return strRenderType;
            }
            return typeProjection.getProjectionKind() + StringUtil.SPACE + strRenderType;
        }
    }

    public static final class b extends Lambda implements Function0<DescriptorRendererImpl> {

        public static final class a extends Lambda implements Function1<DescriptorRendererOptions, Unit> {
            public static final a a = new a();

            public a() {
                super(1);
            }

            public final void a(@NotNull DescriptorRendererOptions descriptorRendererOptions) {
                descriptorRendererOptions.setExcludedTypeAnnotationClasses(z.plus((Set) descriptorRendererOptions.getExcludedTypeAnnotationClasses(), (Iterable) kotlin.collections.e.listOf(StandardNames.FqNames.extensionFunctionType)));
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(DescriptorRendererOptions descriptorRendererOptions) {
                a(descriptorRendererOptions);
                return Unit.INSTANCE;
            }
        }

        public b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final DescriptorRendererImpl getA() {
            return (DescriptorRendererImpl) DescriptorRendererImpl.this.withOptions(a.a);
        }
    }

    public static final class c extends Lambda implements Function1<ConstantValue<?>, CharSequence> {
        public c() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final CharSequence invoke(@NotNull ConstantValue<?> constantValue) {
            return DescriptorRendererImpl.this.w(constantValue);
        }
    }

    public static final class d extends Lambda implements Function1<ValueParameterDescriptor, CharSequence> {
        public static final d a = new d();

        public d() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final CharSequence invoke(ValueParameterDescriptor valueParameterDescriptor) {
            return "";
        }
    }

    public static final class e extends Lambda implements Function1<KotlinType, CharSequence> {
        public e() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final CharSequence invoke(KotlinType kotlinType) {
            return DescriptorRendererImpl.this.renderType(kotlinType);
        }
    }

    public static final class f extends Lambda implements Function1<KotlinType, Object> {
        public static final f a = new f();

        public f() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(@NotNull KotlinType kotlinType) {
            return kotlinType instanceof StubTypeForBuilderInference ? ((StubTypeForBuilderInference) kotlinType).getOriginalTypeVariable() : kotlinType;
        }
    }

    public DescriptorRendererImpl(@NotNull DescriptorRendererOptionsImpl descriptorRendererOptionsImpl) {
        this.a = descriptorRendererOptionsImpl;
        descriptorRendererOptionsImpl.isLocked();
        this.b = LazyKt__LazyJVMKt.lazy(new b());
    }

    private final String A(List<Name> list) {
        return e(RenderingUtilsKt.renderFqName(list));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void B(FunctionDescriptor functionDescriptor, StringBuilder sb) throws IOException {
        if (!getStartFromName()) {
            if (!getStartFromDeclarationKeyword()) {
                r(this, sb, functionDescriptor, null, 2, null);
                l0(functionDescriptor.getVisibility(), sb);
                I(functionDescriptor, sb);
                if (getIncludeAdditionalModifiers()) {
                    G(functionDescriptor, sb);
                }
                N(functionDescriptor, sb);
                if (getIncludeAdditionalModifiers()) {
                    o(functionDescriptor, sb);
                } else {
                    Z(functionDescriptor, sb);
                }
                F(functionDescriptor, sb);
                if (getVerbose()) {
                    if (functionDescriptor.isHiddenToOvercomeSignatureClash()) {
                        sb.append("/*isHiddenToOvercomeSignatureClash*/ ");
                    }
                    if (functionDescriptor.isHiddenForResolutionEverywhereBesideSupercalls()) {
                        sb.append("/*isHiddenForResolutionEverywhereBesideSupercalls*/ ");
                    }
                }
            }
            sb.append(E("fun"));
            sb.append(" ");
            f0(functionDescriptor.getTypeParameters(), sb, true);
            U(functionDescriptor, sb);
        }
        K(functionDescriptor, sb, true);
        j0(functionDescriptor.getValueParameters(), functionDescriptor.hasSynthesizedParameterNames(), sb);
        V(functionDescriptor, sb);
        KotlinType returnType = functionDescriptor.getReturnType();
        if (!getWithoutReturnType() && (getUnitReturnType() || returnType == null || !KotlinBuiltIns.isUnit(returnType))) {
            sb.append(": ");
            sb.append(returnType == null ? "[NULL]" : renderType(returnType));
        }
        m0(functionDescriptor.getTypeParameters(), sb);
    }

    private final void C(StringBuilder sb, KotlinType kotlinType) {
        int length = sb.length();
        r(f(), sb, kotlinType, null, 2, null);
        boolean z = true;
        boolean z2 = sb.length() != length;
        boolean zIsSuspendFunctionType = FunctionTypesKt.isSuspendFunctionType(kotlinType);
        boolean zIsMarkedNullable = kotlinType.isMarkedNullable();
        KotlinType receiverTypeFromFunctionType = FunctionTypesKt.getReceiverTypeFromFunctionType(kotlinType);
        boolean z3 = zIsMarkedNullable || (z2 && receiverTypeFromFunctionType != null);
        if (z3) {
            if (zIsSuspendFunctionType) {
                sb.insert(length, '(');
            } else {
                if (z2) {
                    kotlin.text.a.isWhitespace(StringsKt___StringsKt.last(sb));
                    if (sb.charAt(StringsKt__StringsKt.getLastIndex(sb) - 1) != ')') {
                        sb.insert(StringsKt__StringsKt.getLastIndex(sb), "()");
                    }
                }
                sb.append("(");
            }
        }
        J(sb, zIsSuspendFunctionType, "suspend");
        if (receiverTypeFromFunctionType != null) {
            if ((!o0(receiverTypeFromFunctionType) || receiverTypeFromFunctionType.isMarkedNullable()) && !h(receiverTypeFromFunctionType)) {
                z = false;
            }
            if (z) {
                sb.append("(");
            }
            L(sb, receiverTypeFromFunctionType);
            if (z) {
                sb.append(")");
            }
            sb.append(".");
        }
        sb.append("(");
        int i = 0;
        for (TypeProjection typeProjection : FunctionTypesKt.getValueParameterTypesFromFunctionType(kotlinType)) {
            int i2 = i + 1;
            if (i > 0) {
                sb.append(", ");
            }
            Name nameExtractParameterNameFromFunctionTypeArgument = getParameterNamesInFunctionalTypes() ? FunctionTypesKt.extractParameterNameFromFunctionTypeArgument(typeProjection.getType()) : null;
            if (nameExtractParameterNameFromFunctionTypeArgument != null) {
                sb.append(renderName(nameExtractParameterNameFromFunctionTypeArgument, false));
                sb.append(": ");
            }
            sb.append(renderTypeProjection(typeProjection));
            i = i2;
        }
        sb.append(") ");
        sb.append(c());
        sb.append(" ");
        L(sb, FunctionTypesKt.getReturnTypeFromFunctionType(kotlinType));
        if (z3) {
            sb.append(")");
        }
        if (zIsMarkedNullable) {
            sb.append("?");
        }
    }

    private final void D(VariableDescriptor variableDescriptor, StringBuilder sb) {
        ConstantValue<?> constantValueMo4295getCompileTimeInitializer;
        if (!getIncludePropertyConstant() || (constantValueMo4295getCompileTimeInitializer = variableDescriptor.mo4295getCompileTimeInitializer()) == null) {
            return;
        }
        sb.append(" = ");
        sb.append(e(w(constantValueMo4295getCompileTimeInitializer)));
    }

    private final String E(String str) {
        int i = WhenMappings.$EnumSwitchMapping$0[getTextFormat().ordinal()];
        if (i == 1) {
            return str;
        }
        if (i != 2) {
            throw new NoWhenBranchMatchedException();
        }
        if (getBoldOnlyForNamesInHtml()) {
            return str;
        }
        return "<b>" + str + "</b>";
    }

    private final void F(CallableMemberDescriptor callableMemberDescriptor, StringBuilder sb) {
        if (getModifiers().contains(DescriptorRendererModifier.MEMBER_KIND) && getVerbose() && callableMemberDescriptor.getKind() != CallableMemberDescriptor.Kind.DECLARATION) {
            sb.append("/*");
            sb.append(CapitalizeDecapitalizeKt.toLowerCaseAsciiOnly(callableMemberDescriptor.getKind().name()));
            sb.append("*/ ");
        }
    }

    private final void G(MemberDescriptor memberDescriptor, StringBuilder sb) {
        J(sb, memberDescriptor.isExternal(), "external");
        J(sb, getModifiers().contains(DescriptorRendererModifier.EXPECT) && memberDescriptor.isExpect(), "expect");
        J(sb, getModifiers().contains(DescriptorRendererModifier.ACTUAL) && memberDescriptor.isActual(), "actual");
    }

    private final void H(Modality modality, StringBuilder sb, Modality modality2) {
        if (getRenderDefaultModality() || modality != modality2) {
            J(sb, getModifiers().contains(DescriptorRendererModifier.MODALITY), CapitalizeDecapitalizeKt.toLowerCaseAsciiOnly(modality.name()));
        }
    }

    private final void I(CallableMemberDescriptor callableMemberDescriptor, StringBuilder sb) {
        if (DescriptorUtils.isTopLevelDeclaration(callableMemberDescriptor) && callableMemberDescriptor.getModality() == Modality.FINAL) {
            return;
        }
        if (getOverrideRenderingPolicy() == OverrideRenderingPolicy.RENDER_OVERRIDE && callableMemberDescriptor.getModality() == Modality.OPEN && l(callableMemberDescriptor)) {
            return;
        }
        H(callableMemberDescriptor.getModality(), sb, i(callableMemberDescriptor));
    }

    private final void J(StringBuilder sb, boolean z, String str) {
        if (z) {
            sb.append(E(str));
            sb.append(" ");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void K(DeclarationDescriptor declarationDescriptor, StringBuilder sb, boolean z) {
        sb.append(renderName(declarationDescriptor.getName(), z));
    }

    private final void L(StringBuilder sb, KotlinType kotlinType) {
        UnwrappedType unwrappedTypeUnwrap = kotlinType.unwrap();
        AbbreviatedType abbreviatedType = unwrappedTypeUnwrap instanceof AbbreviatedType ? (AbbreviatedType) unwrappedTypeUnwrap : null;
        if (abbreviatedType == null) {
            M(sb, kotlinType);
            return;
        }
        if (getRenderTypeExpansions()) {
            M(sb, abbreviatedType.getExpandedType());
            return;
        }
        M(sb, abbreviatedType.getAbbreviation());
        if (getRenderUnabbreviatedType()) {
            m(sb, abbreviatedType);
        }
    }

    private final void M(StringBuilder sb, KotlinType kotlinType) {
        if ((kotlinType instanceof WrappedType) && getDebugMode() && !((WrappedType) kotlinType).isComputed()) {
            sb.append("<Not computed yet>");
            return;
        }
        UnwrappedType unwrappedTypeUnwrap = kotlinType.unwrap();
        if (unwrappedTypeUnwrap instanceof FlexibleType) {
            sb.append(((FlexibleType) unwrappedTypeUnwrap).render(this, this));
        } else if (unwrappedTypeUnwrap instanceof SimpleType) {
            W(sb, (SimpleType) unwrappedTypeUnwrap);
        }
    }

    private final void N(CallableMemberDescriptor callableMemberDescriptor, StringBuilder sb) {
        if (getModifiers().contains(DescriptorRendererModifier.OVERRIDE) && l(callableMemberDescriptor) && getOverrideRenderingPolicy() != OverrideRenderingPolicy.RENDER_OPEN) {
            J(sb, true, "override");
            if (getVerbose()) {
                sb.append("/*");
                sb.append(callableMemberDescriptor.getOverriddenDescriptors().size());
                sb.append("*/ ");
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void O(PackageFragmentDescriptor packageFragmentDescriptor, StringBuilder sb) {
        P(packageFragmentDescriptor.getFqName(), "package-fragment", sb);
        if (getDebugMode()) {
            sb.append(" in ");
            K(packageFragmentDescriptor.getContainingDeclaration(), sb, false);
        }
    }

    private final void P(FqName fqName, String str, StringBuilder sb) {
        sb.append(E(str));
        String strRenderFqName = renderFqName(fqName.toUnsafe());
        if (strRenderFqName.length() > 0) {
            sb.append(" ");
            sb.append(strRenderFqName);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void Q(PackageViewDescriptor packageViewDescriptor, StringBuilder sb) {
        P(packageViewDescriptor.getFqName(), NotificationEvent.KEY_PACKAGE, sb);
        if (getDebugMode()) {
            sb.append(" in context of ");
            K(packageViewDescriptor.getModule(), sb, false);
        }
    }

    private final void R(StringBuilder sb, PossiblyInnerType possiblyInnerType) {
        StringBuilder sb2;
        PossiblyInnerType outerType = possiblyInnerType.getOuterType();
        if (outerType == null) {
            sb2 = null;
        } else {
            R(sb, outerType);
            sb.append('.');
            sb.append(renderName(possiblyInnerType.getClassifierDescriptor().getName(), false));
            sb2 = sb;
        }
        if (sb2 == null) {
            sb.append(renderTypeConstructor(possiblyInnerType.getClassifierDescriptor().getTypeConstructor()));
        }
        sb.append(renderTypeArguments(possiblyInnerType.getArguments()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void S(PropertyDescriptor propertyDescriptor, StringBuilder sb) throws IOException {
        if (!getStartFromName()) {
            if (!getStartFromDeclarationKeyword()) {
                T(propertyDescriptor, sb);
                l0(propertyDescriptor.getVisibility(), sb);
                boolean z = false;
                J(sb, getModifiers().contains(DescriptorRendererModifier.CONST) && propertyDescriptor.isConst(), "const");
                G(propertyDescriptor, sb);
                I(propertyDescriptor, sb);
                N(propertyDescriptor, sb);
                if (getModifiers().contains(DescriptorRendererModifier.LATEINIT) && propertyDescriptor.isLateInit()) {
                    z = true;
                }
                J(sb, z, "lateinit");
                F(propertyDescriptor, sb);
            }
            h0(this, propertyDescriptor, sb, false, 4, null);
            f0(propertyDescriptor.getTypeParameters(), sb, true);
            U(propertyDescriptor, sb);
        }
        K(propertyDescriptor, sb, true);
        sb.append(": ");
        sb.append(renderType(propertyDescriptor.getType()));
        V(propertyDescriptor, sb);
        D(propertyDescriptor, sb);
        m0(propertyDescriptor.getTypeParameters(), sb);
    }

    private final void T(PropertyDescriptor propertyDescriptor, StringBuilder sb) {
        if (getModifiers().contains(DescriptorRendererModifier.ANNOTATIONS)) {
            r(this, sb, propertyDescriptor, null, 2, null);
            FieldDescriptor backingField = propertyDescriptor.getBackingField();
            if (backingField != null) {
                q(sb, backingField, AnnotationUseSiteTarget.FIELD);
            }
            FieldDescriptor delegateField = propertyDescriptor.getDelegateField();
            if (delegateField != null) {
                q(sb, delegateField, AnnotationUseSiteTarget.PROPERTY_DELEGATE_FIELD);
            }
            if (getPropertyAccessorRenderingPolicy() == PropertyAccessorRenderingPolicy.NONE) {
                PropertyGetterDescriptor getter = propertyDescriptor.getGetter();
                if (getter != null) {
                    q(sb, getter, AnnotationUseSiteTarget.PROPERTY_GETTER);
                }
                PropertySetterDescriptor setter = propertyDescriptor.getSetter();
                if (setter == null) {
                    return;
                }
                q(sb, setter, AnnotationUseSiteTarget.PROPERTY_SETTER);
                q(sb, (ValueParameterDescriptor) CollectionsKt.single((List) setter.getValueParameters()), AnnotationUseSiteTarget.SETTER_PARAMETER);
            }
        }
    }

    private final void U(CallableDescriptor callableDescriptor, StringBuilder sb) {
        ReceiverParameterDescriptor extensionReceiverParameter = callableDescriptor.getExtensionReceiverParameter();
        if (extensionReceiverParameter != null) {
            q(sb, extensionReceiverParameter, AnnotationUseSiteTarget.RECEIVER);
            KotlinType type = extensionReceiverParameter.getType();
            String strRenderType = renderType(type);
            if (o0(type) && !TypeUtils.isNullableType(type)) {
                strRenderType = '(' + strRenderType + ')';
            }
            sb.append(strRenderType);
            sb.append(".");
        }
    }

    private final void V(CallableDescriptor callableDescriptor, StringBuilder sb) {
        ReceiverParameterDescriptor extensionReceiverParameter;
        if (getReceiverAfterName() && (extensionReceiverParameter = callableDescriptor.getExtensionReceiverParameter()) != null) {
            sb.append(" on ");
            sb.append(renderType(extensionReceiverParameter.getType()));
        }
    }

    private final void W(StringBuilder sb, SimpleType simpleType) {
        if (Intrinsics.areEqual(simpleType, TypeUtils.CANT_INFER_FUNCTION_PARAM_TYPE) || TypeUtils.isDontCarePlaceholder(simpleType)) {
            sb.append("???");
            return;
        }
        if (ErrorUtils.isUninferredParameter(simpleType)) {
            if (getUninferredTypeParameterAsName()) {
                sb.append(z(((ErrorUtils.UninferredParameterTypeConstructor) simpleType.getConstructor()).getTypeParameterDescriptor().getName().toString()));
                return;
            } else {
                sb.append("???");
                return;
            }
        }
        if (KotlinTypeKt.isError(simpleType)) {
            y(sb, simpleType);
        } else if (o0(simpleType)) {
            C(sb, simpleType);
        } else {
            y(sb, simpleType);
        }
    }

    private final void X(StringBuilder sb) {
        int length = sb.length();
        if (length == 0 || sb.charAt(length - 1) != ' ') {
            sb.append(StringUtil.SPACE);
        }
    }

    private final void Y(ClassDescriptor classDescriptor, StringBuilder sb) throws IOException {
        if (getWithoutSuperTypes() || KotlinBuiltIns.isNothing(classDescriptor.getDefaultType())) {
            return;
        }
        Collection<KotlinType> supertypes = classDescriptor.getTypeConstructor().getSupertypes();
        if (supertypes.isEmpty()) {
            return;
        }
        if (supertypes.size() == 1 && KotlinBuiltIns.isAnyOrNullableAny(supertypes.iterator().next())) {
            return;
        }
        X(sb);
        sb.append(": ");
        CollectionsKt___CollectionsKt.joinTo(supertypes, sb, (112 & 2) != 0 ? ", " : ", ", (112 & 4) != 0 ? "" : null, (112 & 8) == 0 ? null : "", (112 & 16) != 0 ? -1 : 0, (112 & 32) != 0 ? "..." : null, (112 & 64) != 0 ? null : new e());
    }

    private final void Z(FunctionDescriptor functionDescriptor, StringBuilder sb) {
        J(sb, functionDescriptor.isSuspend(), "suspend");
    }

    private final void a(StringBuilder sb, DeclarationDescriptor declarationDescriptor) {
        DeclarationDescriptor containingDeclaration;
        String name;
        if ((declarationDescriptor instanceof PackageFragmentDescriptor) || (declarationDescriptor instanceof PackageViewDescriptor) || (containingDeclaration = declarationDescriptor.getContainingDeclaration()) == null || (containingDeclaration instanceof ModuleDescriptor)) {
            return;
        }
        sb.append(" ");
        sb.append(renderMessage("defined in"));
        sb.append(" ");
        FqNameUnsafe fqName = DescriptorUtils.getFqName(containingDeclaration);
        sb.append(fqName.isRoot() ? "root package" : renderFqName(fqName));
        if (getWithSourceFileForTopLevel() && (containingDeclaration instanceof PackageFragmentDescriptor) && (declarationDescriptor instanceof DeclarationDescriptorWithSource) && (name = ((DeclarationDescriptorWithSource) declarationDescriptor).getSource().getContainingFile().getName()) != null) {
            sb.append(" ");
            sb.append(renderMessage("in file"));
            sb.append(" ");
            sb.append(name);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void a0(TypeAliasDescriptor typeAliasDescriptor, StringBuilder sb) {
        r(this, sb, typeAliasDescriptor, null, 2, null);
        l0(typeAliasDescriptor.getVisibility(), sb);
        G(typeAliasDescriptor, sb);
        sb.append(E("typealias"));
        sb.append(" ");
        K(typeAliasDescriptor, sb, true);
        f0(typeAliasDescriptor.getDeclaredTypeParameters(), sb, false);
        s(typeAliasDescriptor, sb);
        sb.append(" = ");
        sb.append(renderType(typeAliasDescriptor.getUnderlyingType()));
    }

    private final void b(StringBuilder sb, List<? extends TypeProjection> list) throws IOException {
        CollectionsKt___CollectionsKt.joinTo(list, sb, (112 & 2) != 0 ? ", " : ", ", (112 & 4) != 0 ? "" : null, (112 & 8) == 0 ? null : "", (112 & 16) != 0 ? -1 : 0, (112 & 32) != 0 ? "..." : null, (112 & 64) != 0 ? null : new a());
    }

    private final void b0(StringBuilder sb, KotlinType kotlinType, TypeConstructor typeConstructor) {
        PossiblyInnerType possiblyInnerTypeBuildPossiblyInnerType = TypeParameterUtilsKt.buildPossiblyInnerType(kotlinType);
        if (possiblyInnerTypeBuildPossiblyInnerType != null) {
            R(sb, possiblyInnerTypeBuildPossiblyInnerType);
        } else {
            sb.append(renderTypeConstructor(typeConstructor));
            sb.append(renderTypeArguments(kotlinType.getArguments()));
        }
    }

    private final String c() {
        int i = WhenMappings.$EnumSwitchMapping$0[getTextFormat().ordinal()];
        if (i == 1) {
            return e("->");
        }
        if (i == 2) {
            return "&rarr;";
        }
        throw new NoWhenBranchMatchedException();
    }

    public static /* synthetic */ void c0(DescriptorRendererImpl descriptorRendererImpl, StringBuilder sb, KotlinType kotlinType, TypeConstructor typeConstructor, int i, Object obj) {
        if ((i & 2) != 0) {
            typeConstructor = kotlinType.getConstructor();
        }
        descriptorRendererImpl.b0(sb, kotlinType, typeConstructor);
    }

    private final boolean d(String str, String str2) {
        if (!Intrinsics.areEqual(str, m.replace$default(str2, "?", "", false, 4, (Object) null)) && (!m.endsWith$default(str2, "?", false, 2, null) || !Intrinsics.areEqual(Intrinsics.stringPlus(str, "?"), str2))) {
            if (!Intrinsics.areEqual('(' + str + ")?", str2)) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void d0(TypeParameterDescriptor typeParameterDescriptor, StringBuilder sb, boolean z) {
        if (z) {
            sb.append(k());
        }
        if (getVerbose()) {
            sb.append("/*");
            sb.append(typeParameterDescriptor.getIndex());
            sb.append("*/ ");
        }
        J(sb, typeParameterDescriptor.isReified(), "reified");
        String label = typeParameterDescriptor.getVariance().getLabel();
        boolean z2 = true;
        J(sb, label.length() > 0, label);
        r(this, sb, typeParameterDescriptor, null, 2, null);
        K(typeParameterDescriptor, sb, z);
        int size = typeParameterDescriptor.getUpperBounds().size();
        if ((size > 1 && !z) || size == 1) {
            KotlinType next = typeParameterDescriptor.getUpperBounds().iterator().next();
            if (!KotlinBuiltIns.isDefaultBound(next)) {
                sb.append(" : ");
                sb.append(renderType(next));
            }
        } else if (z) {
            for (KotlinType kotlinType : typeParameterDescriptor.getUpperBounds()) {
                if (!KotlinBuiltIns.isDefaultBound(kotlinType)) {
                    if (z2) {
                        sb.append(" : ");
                    } else {
                        sb.append(" & ");
                    }
                    sb.append(renderType(kotlinType));
                    z2 = false;
                }
            }
        }
        if (z) {
            sb.append(g());
        }
    }

    private final String e(String str) {
        return getTextFormat().escape(str);
    }

    private final void e0(StringBuilder sb, List<? extends TypeParameterDescriptor> list) {
        Iterator<? extends TypeParameterDescriptor> it2 = list.iterator();
        while (it2.hasNext()) {
            d0(it2.next(), sb, false);
            if (it2.hasNext()) {
                sb.append(", ");
            }
        }
    }

    private final DescriptorRendererImpl f() {
        return (DescriptorRendererImpl) this.b.getValue();
    }

    private final void f0(List<? extends TypeParameterDescriptor> list, StringBuilder sb, boolean z) {
        if (!getWithoutTypeParameters() && (!list.isEmpty())) {
            sb.append(k());
            e0(sb, list);
            sb.append(g());
            if (z) {
                sb.append(" ");
            }
        }
    }

    private final String g() {
        return e(SearchCriteria.GT);
    }

    private final void g0(VariableDescriptor variableDescriptor, StringBuilder sb, boolean z) {
        if (z || !(variableDescriptor instanceof ValueParameterDescriptor)) {
            sb.append(E(variableDescriptor.isVar() ? "var" : "val"));
            sb.append(" ");
        }
    }

    private final boolean h(KotlinType kotlinType) {
        return FunctionTypesKt.isSuspendFunctionType(kotlinType) || !kotlinType.getAnnotations().isEmpty();
    }

    public static /* synthetic */ void h0(DescriptorRendererImpl descriptorRendererImpl, VariableDescriptor variableDescriptor, StringBuilder sb, boolean z, int i, Object obj) {
        if ((i & 4) != 0) {
            z = false;
        }
        descriptorRendererImpl.g0(variableDescriptor, sb, z);
    }

    private final Modality i(MemberDescriptor memberDescriptor) {
        if (memberDescriptor instanceof ClassDescriptor) {
            return ((ClassDescriptor) memberDescriptor).getKind() == ClassKind.INTERFACE ? Modality.ABSTRACT : Modality.FINAL;
        }
        DeclarationDescriptor containingDeclaration = memberDescriptor.getContainingDeclaration();
        ClassDescriptor classDescriptor = containingDeclaration instanceof ClassDescriptor ? (ClassDescriptor) containingDeclaration : null;
        if (classDescriptor != null && (memberDescriptor instanceof CallableMemberDescriptor)) {
            CallableMemberDescriptor callableMemberDescriptor = (CallableMemberDescriptor) memberDescriptor;
            if ((!callableMemberDescriptor.getOverriddenDescriptors().isEmpty()) && classDescriptor.getModality() != Modality.FINAL) {
                return Modality.OPEN;
            }
            if (classDescriptor.getKind() != ClassKind.INTERFACE || Intrinsics.areEqual(callableMemberDescriptor.getVisibility(), DescriptorVisibilities.PRIVATE)) {
                return Modality.FINAL;
            }
            Modality modality = callableMemberDescriptor.getModality();
            Modality modality2 = Modality.ABSTRACT;
            return modality == modality2 ? modality2 : Modality.OPEN;
        }
        return Modality.FINAL;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:20:0x0065  */
    /* JADX WARN: Code duplicated, block: B:31:0x0091  */
    public final void i0(ValueParameterDescriptor valueParameterDescriptor, boolean z, StringBuilder sb, boolean z2) {
        boolean z3;
        boolean z4;
        if (z2) {
            sb.append(E("value-parameter"));
            sb.append(" ");
        }
        if (getVerbose()) {
            sb.append("/*");
            sb.append(valueParameterDescriptor.getIndex());
            sb.append("*/ ");
        }
        r(this, sb, valueParameterDescriptor, null, 2, null);
        J(sb, valueParameterDescriptor.isCrossinline(), "crossinline");
        J(sb, valueParameterDescriptor.isNoinline(), "noinline");
        if (getRenderPrimaryConstructorParametersAsProperties()) {
            CallableDescriptor containingDeclaration = valueParameterDescriptor.getContainingDeclaration();
            ClassConstructorDescriptor classConstructorDescriptor = containingDeclaration instanceof ClassConstructorDescriptor ? (ClassConstructorDescriptor) containingDeclaration : null;
            if (classConstructorDescriptor != null && classConstructorDescriptor.isPrimary()) {
                z3 = true;
            } else {
                z3 = false;
            }
        } else {
            z3 = false;
        }
        if (z3) {
            J(sb, getActualPropertiesInPrimaryConstructor(), "actual");
        }
        k0(valueParameterDescriptor, z, sb, z2, z3);
        if (getDefaultParameterValueRenderer() != null) {
            z4 = getDebugMode() ? valueParameterDescriptor.declaresDefaultValue() : DescriptorUtilsKt.declaresOrInheritsDefaultValue(valueParameterDescriptor);
        }
        if (z4) {
            sb.append(Intrinsics.stringPlus(" = ", getDefaultParameterValueRenderer().invoke(valueParameterDescriptor)));
        }
    }

    private final boolean j(AnnotationDescriptor annotationDescriptor) {
        return Intrinsics.areEqual(annotationDescriptor.getFqName(), StandardNames.FqNames.parameterName);
    }

    private final void j0(Collection<? extends ValueParameterDescriptor> collection, boolean z, StringBuilder sb) {
        boolean zP0 = p0(z);
        int size = collection.size();
        getValueParametersHandler().appendBeforeValueParameters(size, sb);
        int i = 0;
        for (ValueParameterDescriptor valueParameterDescriptor : collection) {
            getValueParametersHandler().appendBeforeValueParameter(valueParameterDescriptor, i, size, sb);
            i0(valueParameterDescriptor, zP0, sb, false);
            getValueParametersHandler().appendAfterValueParameter(valueParameterDescriptor, i, size, sb);
            i++;
        }
        getValueParametersHandler().appendAfterValueParameters(size, sb);
    }

    private final String k() {
        return e(SearchCriteria.LT);
    }

    private final void k0(VariableDescriptor variableDescriptor, boolean z, StringBuilder sb, boolean z2, boolean z3) {
        KotlinType type = variableDescriptor.getType();
        ValueParameterDescriptor valueParameterDescriptor = variableDescriptor instanceof ValueParameterDescriptor ? (ValueParameterDescriptor) variableDescriptor : null;
        KotlinType varargElementType = valueParameterDescriptor != null ? valueParameterDescriptor.getVarargElementType() : null;
        KotlinType kotlinType = varargElementType == null ? type : varargElementType;
        J(sb, varargElementType != null, "vararg");
        if (z3 || (z2 && !getStartFromName())) {
            g0(variableDescriptor, sb, z3);
        }
        if (z) {
            K(variableDescriptor, sb, z2);
            sb.append(": ");
        }
        sb.append(renderType(kotlinType));
        D(variableDescriptor, sb);
        if (!getVerbose() || varargElementType == null) {
            return;
        }
        sb.append(" /*");
        sb.append(renderType(type));
        sb.append("*/");
    }

    private final boolean l(CallableMemberDescriptor callableMemberDescriptor) {
        return !callableMemberDescriptor.getOverriddenDescriptors().isEmpty();
    }

    private final boolean l0(DescriptorVisibility descriptorVisibility, StringBuilder sb) {
        if (!getModifiers().contains(DescriptorRendererModifier.VISIBILITY)) {
            return false;
        }
        if (getNormalizedVisibilities()) {
            descriptorVisibility = descriptorVisibility.normalize();
        }
        if (!getRenderDefaultVisibility() && Intrinsics.areEqual(descriptorVisibility, DescriptorVisibilities.DEFAULT_VISIBILITY)) {
            return false;
        }
        sb.append(E(descriptorVisibility.getInternalDisplayName()));
        sb.append(" ");
        return true;
    }

    private final void m(StringBuilder sb, AbbreviatedType abbreviatedType) {
        RenderingFormat textFormat = getTextFormat();
        RenderingFormat renderingFormat = RenderingFormat.HTML;
        if (textFormat == renderingFormat) {
            sb.append("<font color=\"808080\"><i>");
        }
        sb.append(" /* = ");
        M(sb, abbreviatedType.getExpandedType());
        sb.append(" */");
        if (getTextFormat() == renderingFormat) {
            sb.append("</i></font>");
        }
    }

    private final void m0(List<? extends TypeParameterDescriptor> list, StringBuilder sb) throws IOException {
        if (getWithoutTypeParameters()) {
            return;
        }
        ArrayList arrayList = new ArrayList(0);
        for (TypeParameterDescriptor typeParameterDescriptor : list) {
            Iterator it2 = CollectionsKt___CollectionsKt.drop(typeParameterDescriptor.getUpperBounds(), 1).iterator();
            while (it2.hasNext()) {
                arrayList.add(renderName(typeParameterDescriptor.getName(), false) + " : " + renderType((KotlinType) it2.next()));
            }
        }
        if (!arrayList.isEmpty()) {
            sb.append(" ");
            sb.append(E("where"));
            sb.append(" ");
            CollectionsKt___CollectionsKt.joinTo(arrayList, sb, (112 & 2) != 0 ? ", " : ", ", (112 & 4) != 0 ? "" : null, (112 & 8) == 0 ? null : "", (112 & 16) != 0 ? -1 : 0, (112 & 32) != 0 ? "..." : null, (112 & 64) != 0 ? null : null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void n(PropertyAccessorDescriptor propertyAccessorDescriptor, StringBuilder sb) {
        G(propertyAccessorDescriptor, sb);
    }

    private final String n0(String str, String str2, String str3, String str4, String str5) {
        if (m.startsWith$default(str, str2, false, 2, null) && m.startsWith$default(str3, str4, false, 2, null)) {
            int length = str2.length();
            Objects.requireNonNull(str, "null cannot be cast to non-null type java.lang.String");
            String strSubstring = str.substring(length);
            int length2 = str4.length();
            Objects.requireNonNull(str3, "null cannot be cast to non-null type java.lang.String");
            String strSubstring2 = str3.substring(length2);
            String strStringPlus = Intrinsics.stringPlus(str5, strSubstring);
            if (Intrinsics.areEqual(strSubstring, strSubstring2)) {
                return strStringPlus;
            }
            if (d(strSubstring, strSubstring2)) {
                return Intrinsics.stringPlus(strStringPlus, "!");
            }
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0035  */
    private final void o(FunctionDescriptor functionDescriptor, StringBuilder sb) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4 = false;
        if (functionDescriptor.isOperator()) {
            Collection<? extends FunctionDescriptor> overriddenDescriptors = functionDescriptor.getOverriddenDescriptors();
            if (!overriddenDescriptors.isEmpty()) {
                Iterator<T> it2 = overriddenDescriptors.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        z3 = true;
                        break;
                    } else if (((FunctionDescriptor) it2.next()).isOperator()) {
                        z3 = false;
                        break;
                    }
                }
            } else {
                z3 = true;
                break;
            }
            if (z3 || getAlwaysRenderModifiers()) {
                z = true;
            } else {
                z = false;
            }
        } else {
            z = false;
        }
        if (functionDescriptor.isInfix()) {
            Collection<? extends FunctionDescriptor> overriddenDescriptors2 = functionDescriptor.getOverriddenDescriptors();
            if (!overriddenDescriptors2.isEmpty()) {
                Iterator<T> it3 = overriddenDescriptors2.iterator();
                while (true) {
                    if (!it3.hasNext()) {
                        z2 = true;
                        break;
                    } else if (((FunctionDescriptor) it3.next()).isInfix()) {
                        z2 = false;
                        break;
                    }
                }
            } else {
                z2 = true;
                break;
            }
            if (z2 || getAlwaysRenderModifiers()) {
                z4 = true;
            }
        }
        J(sb, functionDescriptor.isTailrec(), "tailrec");
        Z(functionDescriptor, sb);
        J(sb, functionDescriptor.isInline(), "inline");
        J(sb, z4, "infix");
        J(sb, z, AuthorizeActivityBase.KEY_OPERATOR);
    }

    private final boolean o0(KotlinType kotlinType) {
        boolean z;
        if (!FunctionTypesKt.isBuiltinFunctionalType(kotlinType)) {
            return false;
        }
        List<TypeProjection> arguments = kotlinType.getArguments();
        if ((arguments instanceof Collection) && arguments.isEmpty()) {
            z = true;
        } else {
            Iterator<T> it2 = arguments.iterator();
            while (it2.hasNext()) {
                if (((TypeProjection) it2.next()).isStarProjection()) {
                    z = false;
                }
            }
            z = true;
        }
        return z;
    }

    private final List<String> p(AnnotationDescriptor annotationDescriptor) {
        ClassConstructorDescriptor classConstructorDescriptorMo4293getUnsubstitutedPrimaryConstructor;
        List<ValueParameterDescriptor> valueParameters;
        Map<Name, ConstantValue<?>> allValueArguments = annotationDescriptor.getAllValueArguments();
        List listEmptyList = null;
        ClassDescriptor annotationClass = getRenderDefaultAnnotationArguments() ? DescriptorUtilsKt.getAnnotationClass(annotationDescriptor) : null;
        if (annotationClass != null && (classConstructorDescriptorMo4293getUnsubstitutedPrimaryConstructor = annotationClass.mo4293getUnsubstitutedPrimaryConstructor()) != null && (valueParameters = classConstructorDescriptorMo4293getUnsubstitutedPrimaryConstructor.getValueParameters()) != null) {
            ArrayList arrayList = new ArrayList();
            for (Object obj : valueParameters) {
                if (((ValueParameterDescriptor) obj).declaresDefaultValue()) {
                    arrayList.add(obj);
                }
            }
            ArrayList arrayList2 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList, 10));
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                arrayList2.add(((ValueParameterDescriptor) it2.next()).getName());
            }
            listEmptyList = arrayList2;
        }
        if (listEmptyList == null) {
            listEmptyList = CollectionsKt__CollectionsKt.emptyList();
        }
        ArrayList arrayList3 = new ArrayList();
        for (Object obj2 : listEmptyList) {
            if (!allValueArguments.containsKey((Name) obj2)) {
                arrayList3.add(obj2);
            }
        }
        ArrayList arrayList4 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList3, 10));
        Iterator it3 = arrayList3.iterator();
        while (it3.hasNext()) {
            arrayList4.add(Intrinsics.stringPlus(((Name) it3.next()).asString(), " = ..."));
        }
        Set<Map.Entry<Name, ConstantValue<?>>> setEntrySet = allValueArguments.entrySet();
        ArrayList arrayList5 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(setEntrySet, 10));
        Iterator<T> it4 = setEntrySet.iterator();
        while (it4.hasNext()) {
            Map.Entry entry = (Map.Entry) it4.next();
            Name name = (Name) entry.getKey();
            ConstantValue<?> constantValue = (ConstantValue) entry.getValue();
            StringBuilder sb = new StringBuilder();
            sb.append(name.asString());
            sb.append(" = ");
            sb.append(!listEmptyList.contains(name) ? w(constantValue) : "...");
            arrayList5.add(sb.toString());
        }
        return CollectionsKt___CollectionsKt.sorted(CollectionsKt___CollectionsKt.plus((Collection) arrayList4, (Iterable) arrayList5));
    }

    private final boolean p0(boolean z) {
        int i = WhenMappings.$EnumSwitchMapping$1[getParameterNameRenderingPolicy().ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i == 3) {
                    return false;
                }
                throw new NoWhenBranchMatchedException();
            }
            if (z) {
                return false;
            }
        }
        return true;
    }

    private final void q(StringBuilder sb, Annotated annotated, AnnotationUseSiteTarget annotationUseSiteTarget) {
        if (getModifiers().contains(DescriptorRendererModifier.ANNOTATIONS)) {
            Set<FqName> excludedTypeAnnotationClasses = annotated instanceof KotlinType ? getExcludedTypeAnnotationClasses() : getExcludedAnnotationClasses();
            Function1<AnnotationDescriptor, Boolean> annotationFilter = getAnnotationFilter();
            for (AnnotationDescriptor annotationDescriptor : annotated.getAnnotations()) {
                if (!CollectionsKt___CollectionsKt.contains(excludedTypeAnnotationClasses, annotationDescriptor.getFqName()) && !j(annotationDescriptor) && (annotationFilter == null || annotationFilter.invoke(annotationDescriptor).booleanValue())) {
                    sb.append(renderAnnotation(annotationDescriptor, annotationUseSiteTarget));
                    if (getEachAnnotationOnNewLine()) {
                        sb.append('\n');
                    } else {
                        sb.append(" ");
                    }
                }
            }
        }
    }

    public static /* synthetic */ void r(DescriptorRendererImpl descriptorRendererImpl, StringBuilder sb, Annotated annotated, AnnotationUseSiteTarget annotationUseSiteTarget, int i, Object obj) {
        if ((i & 2) != 0) {
            annotationUseSiteTarget = null;
        }
        descriptorRendererImpl.q(sb, annotated, annotationUseSiteTarget);
    }

    private final void s(ClassifierDescriptorWithTypeParameters classifierDescriptorWithTypeParameters, StringBuilder sb) {
        List<TypeParameterDescriptor> declaredTypeParameters = classifierDescriptorWithTypeParameters.getDeclaredTypeParameters();
        List<TypeParameterDescriptor> parameters = classifierDescriptorWithTypeParameters.getTypeConstructor().getParameters();
        if (getVerbose() && classifierDescriptorWithTypeParameters.isInner() && parameters.size() > declaredTypeParameters.size()) {
            sb.append(" /*captured type parameters: ");
            e0(sb, parameters.subList(declaredTypeParameters.size(), parameters.size()));
            sb.append("*/");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void t(ClassDescriptor classDescriptor, StringBuilder sb) throws IOException {
        ClassConstructorDescriptor classConstructorDescriptorMo4293getUnsubstitutedPrimaryConstructor;
        boolean z = classDescriptor.getKind() == ClassKind.ENUM_ENTRY;
        if (!getStartFromName()) {
            r(this, sb, classDescriptor, null, 2, null);
            if (!z) {
                l0(classDescriptor.getVisibility(), sb);
            }
            if ((classDescriptor.getKind() != ClassKind.INTERFACE || classDescriptor.getModality() != Modality.ABSTRACT) && (!classDescriptor.getKind().isSingleton() || classDescriptor.getModality() != Modality.FINAL)) {
                H(classDescriptor.getModality(), sb, i(classDescriptor));
            }
            G(classDescriptor, sb);
            J(sb, getModifiers().contains(DescriptorRendererModifier.INNER) && classDescriptor.isInner(), AppUtil.DEFAULT_CHANNEL);
            J(sb, getModifiers().contains(DescriptorRendererModifier.DATA) && classDescriptor.isData(), "data");
            J(sb, getModifiers().contains(DescriptorRendererModifier.INLINE) && classDescriptor.isInline(), "inline");
            J(sb, getModifiers().contains(DescriptorRendererModifier.VALUE) && classDescriptor.isValue(), "value");
            J(sb, getModifiers().contains(DescriptorRendererModifier.FUN) && classDescriptor.isFun(), "fun");
            u(classDescriptor, sb);
        }
        if (DescriptorUtils.isCompanionObject(classDescriptor)) {
            v(classDescriptor, sb);
        } else {
            if (!getStartFromName()) {
                X(sb);
            }
            K(classDescriptor, sb, true);
        }
        if (z) {
            return;
        }
        List<TypeParameterDescriptor> declaredTypeParameters = classDescriptor.getDeclaredTypeParameters();
        f0(declaredTypeParameters, sb, false);
        s(classDescriptor, sb);
        if (!classDescriptor.getKind().isSingleton() && getClassWithPrimaryConstructor() && (classConstructorDescriptorMo4293getUnsubstitutedPrimaryConstructor = classDescriptor.mo4293getUnsubstitutedPrimaryConstructor()) != null) {
            sb.append(" ");
            r(this, sb, classConstructorDescriptorMo4293getUnsubstitutedPrimaryConstructor, null, 2, null);
            l0(classConstructorDescriptorMo4293getUnsubstitutedPrimaryConstructor.getVisibility(), sb);
            sb.append(E("constructor"));
            j0(classConstructorDescriptorMo4293getUnsubstitutedPrimaryConstructor.getValueParameters(), classConstructorDescriptorMo4293getUnsubstitutedPrimaryConstructor.hasSynthesizedParameterNames(), sb);
        }
        Y(classDescriptor, sb);
        m0(declaredTypeParameters, sb);
    }

    private final void u(ClassDescriptor classDescriptor, StringBuilder sb) {
        sb.append(E(DescriptorRenderer.Companion.getClassifierKindPrefix(classDescriptor)));
    }

    private final void v(DeclarationDescriptor declarationDescriptor, StringBuilder sb) {
        if (getRenderCompanionObjectName()) {
            if (getStartFromName()) {
                sb.append("companion object");
            }
            X(sb);
            DeclarationDescriptor containingDeclaration = declarationDescriptor.getContainingDeclaration();
            if (containingDeclaration != null) {
                sb.append("of ");
                sb.append(renderName(containingDeclaration.getName(), false));
            }
        }
        if (getVerbose() || !Intrinsics.areEqual(declarationDescriptor.getName(), SpecialNames.DEFAULT_NAME_FOR_COMPANION_OBJECT)) {
            if (!getStartFromName()) {
                X(sb);
            }
            sb.append(renderName(declarationDescriptor.getName(), true));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String w(ConstantValue<?> constantValue) {
        if (constantValue instanceof ArrayValue) {
            return CollectionsKt___CollectionsKt.joinToString$default(((ArrayValue) constantValue).getValue(), ", ", "{", i.d, 0, null, new c(), 24, null);
        }
        if (constantValue instanceof AnnotationValue) {
            return StringsKt__StringsKt.removePrefix(DescriptorRenderer.renderAnnotation$default(this, ((AnnotationValue) constantValue).getValue(), null, 2, null), (CharSequence) "@");
        }
        if (!(constantValue instanceof KClassValue)) {
            return constantValue.toString();
        }
        KClassValue.Value value = ((KClassValue) constantValue).getValue();
        if (value instanceof KClassValue.Value.LocalClass) {
            return ((KClassValue.Value.LocalClass) value).getType() + "::class";
        }
        if (!(value instanceof KClassValue.Value.NormalClass)) {
            throw new NoWhenBranchMatchedException();
        }
        KClassValue.Value.NormalClass normalClass = (KClassValue.Value.NormalClass) value;
        String strAsString = normalClass.getClassId().asSingleFqName().asString();
        int arrayDimensions = normalClass.getArrayDimensions();
        for (int i = 0; i < arrayDimensions; i++) {
            strAsString = "kotlin.Array<" + strAsString + Typography.greater;
        }
        return Intrinsics.stringPlus(strAsString, "::class");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void x(ConstructorDescriptor constructorDescriptor, StringBuilder sb) throws IOException {
        ClassConstructorDescriptor classConstructorDescriptorMo4293getUnsubstitutedPrimaryConstructor;
        r(this, sb, constructorDescriptor, null, 2, null);
        boolean z = (this.a.getRenderDefaultVisibility() || constructorDescriptor.getConstructedClass().getModality() != Modality.SEALED) && l0(constructorDescriptor.getVisibility(), sb);
        F(constructorDescriptor, sb);
        boolean z2 = getRenderConstructorKeyword() || !constructorDescriptor.isPrimary() || z;
        if (z2) {
            sb.append(E("constructor"));
        }
        ClassifierDescriptorWithTypeParameters containingDeclaration = constructorDescriptor.getContainingDeclaration();
        if (getSecondaryConstructorsAsPrimary()) {
            if (z2) {
                sb.append(" ");
            }
            K(containingDeclaration, sb, true);
            f0(constructorDescriptor.getTypeParameters(), sb, false);
        }
        j0(constructorDescriptor.getValueParameters(), constructorDescriptor.hasSynthesizedParameterNames(), sb);
        if (getRenderConstructorDelegation() && !constructorDescriptor.isPrimary() && (containingDeclaration instanceof ClassDescriptor) && (classConstructorDescriptorMo4293getUnsubstitutedPrimaryConstructor = ((ClassDescriptor) containingDeclaration).mo4293getUnsubstitutedPrimaryConstructor()) != null) {
            List<ValueParameterDescriptor> valueParameters = classConstructorDescriptorMo4293getUnsubstitutedPrimaryConstructor.getValueParameters();
            ArrayList arrayList = new ArrayList();
            for (Object obj : valueParameters) {
                ValueParameterDescriptor valueParameterDescriptor = (ValueParameterDescriptor) obj;
                if (!valueParameterDescriptor.declaresDefaultValue() && valueParameterDescriptor.getVarargElementType() == null) {
                    arrayList.add(obj);
                }
            }
            if (!arrayList.isEmpty()) {
                sb.append(" : ");
                sb.append(E("this"));
                sb.append(CollectionsKt___CollectionsKt.joinToString$default(arrayList, ", ", "(", ")", 0, null, d.a, 24, null));
            }
        }
        if (getSecondaryConstructorsAsPrimary()) {
            m0(constructorDescriptor.getTypeParameters(), sb);
        }
    }

    private final void y(StringBuilder sb, KotlinType kotlinType) {
        r(this, sb, kotlinType, null, 2, null);
        DefinitelyNotNullType definitelyNotNullType = kotlinType instanceof DefinitelyNotNullType ? (DefinitelyNotNullType) kotlinType : null;
        SimpleType original = definitelyNotNullType != null ? definitelyNotNullType.getOriginal() : null;
        if (KotlinTypeKt.isError(kotlinType)) {
            if ((kotlinType instanceof UnresolvedType) && getPresentableUnresolvedTypes()) {
                sb.append(((UnresolvedType) kotlinType).getPresentableName());
            } else if (!(kotlinType instanceof ErrorType) || getInformativeErrorType()) {
                sb.append(kotlinType.getConstructor().toString());
            } else {
                sb.append(((ErrorType) kotlinType).getPresentableName());
            }
            sb.append(renderTypeArguments(kotlinType.getArguments()));
        } else if (kotlinType instanceof StubTypeForBuilderInference) {
            sb.append(((StubTypeForBuilderInference) kotlinType).getOriginalTypeVariable().toString());
        } else if (original instanceof StubTypeForBuilderInference) {
            sb.append(((StubTypeForBuilderInference) original).getOriginalTypeVariable().toString());
        } else {
            c0(this, sb, kotlinType, null, 2, null);
        }
        if (kotlinType.isMarkedNullable()) {
            sb.append("?");
        }
        if (SpecialTypesKt.isDefinitelyNotNullType(kotlinType)) {
            sb.append("!!");
        }
    }

    private final String z(String str) {
        int i = WhenMappings.$EnumSwitchMapping$0[getTextFormat().ordinal()];
        if (i == 1) {
            return str;
        }
        if (i != 2) {
            throw new NoWhenBranchMatchedException();
        }
        return "<font color=red><b>" + str + "</b></font>";
    }

    public boolean getActualPropertiesInPrimaryConstructor() {
        return this.a.getActualPropertiesInPrimaryConstructor();
    }

    public boolean getAlwaysRenderModifiers() {
        return this.a.getAlwaysRenderModifiers();
    }

    @Override // kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererOptions
    @NotNull
    public AnnotationArgumentsRenderingPolicy getAnnotationArgumentsRenderingPolicy() {
        return this.a.getAnnotationArgumentsRenderingPolicy();
    }

    @Nullable
    public Function1<AnnotationDescriptor, Boolean> getAnnotationFilter() {
        return this.a.getAnnotationFilter();
    }

    public boolean getBoldOnlyForNamesInHtml() {
        return this.a.getBoldOnlyForNamesInHtml();
    }

    public boolean getClassWithPrimaryConstructor() {
        return this.a.getClassWithPrimaryConstructor();
    }

    @NotNull
    public ClassifierNamePolicy getClassifierNamePolicy() {
        return this.a.getClassifierNamePolicy();
    }

    @Override // kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererOptions
    public boolean getDebugMode() {
        return this.a.getDebugMode();
    }

    @Nullable
    public Function1<ValueParameterDescriptor, String> getDefaultParameterValueRenderer() {
        return this.a.getDefaultParameterValueRenderer();
    }

    public boolean getEachAnnotationOnNewLine() {
        return this.a.getEachAnnotationOnNewLine();
    }

    @Override // kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererOptions
    public boolean getEnhancedTypes() {
        return this.a.getEnhancedTypes();
    }

    @NotNull
    public Set<FqName> getExcludedAnnotationClasses() {
        return this.a.getExcludedAnnotationClasses();
    }

    @Override // kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererOptions
    @NotNull
    public Set<FqName> getExcludedTypeAnnotationClasses() {
        return this.a.getExcludedTypeAnnotationClasses();
    }

    public boolean getIncludeAdditionalModifiers() {
        return this.a.getIncludeAdditionalModifiers();
    }

    public boolean getIncludeAnnotationArguments() {
        return this.a.getIncludeAnnotationArguments();
    }

    public boolean getIncludeEmptyAnnotationArguments() {
        return this.a.getIncludeEmptyAnnotationArguments();
    }

    public boolean getIncludePropertyConstant() {
        return this.a.getIncludePropertyConstant();
    }

    public boolean getInformativeErrorType() {
        return this.a.getInformativeErrorType();
    }

    @NotNull
    public Set<DescriptorRendererModifier> getModifiers() {
        return this.a.getModifiers();
    }

    public boolean getNormalizedVisibilities() {
        return this.a.getNormalizedVisibilities();
    }

    @NotNull
    public final DescriptorRendererOptionsImpl getOptions() {
        return this.a;
    }

    @NotNull
    public OverrideRenderingPolicy getOverrideRenderingPolicy() {
        return this.a.getOverrideRenderingPolicy();
    }

    @NotNull
    public ParameterNameRenderingPolicy getParameterNameRenderingPolicy() {
        return this.a.getParameterNameRenderingPolicy();
    }

    public boolean getParameterNamesInFunctionalTypes() {
        return this.a.getParameterNamesInFunctionalTypes();
    }

    public boolean getPresentableUnresolvedTypes() {
        return this.a.getPresentableUnresolvedTypes();
    }

    @NotNull
    public PropertyAccessorRenderingPolicy getPropertyAccessorRenderingPolicy() {
        return this.a.getPropertyAccessorRenderingPolicy();
    }

    public boolean getReceiverAfterName() {
        return this.a.getReceiverAfterName();
    }

    public boolean getRenderCompanionObjectName() {
        return this.a.getRenderCompanionObjectName();
    }

    public boolean getRenderConstructorDelegation() {
        return this.a.getRenderConstructorDelegation();
    }

    public boolean getRenderConstructorKeyword() {
        return this.a.getRenderConstructorKeyword();
    }

    public boolean getRenderDefaultAnnotationArguments() {
        return this.a.getRenderDefaultAnnotationArguments();
    }

    public boolean getRenderDefaultModality() {
        return this.a.getRenderDefaultModality();
    }

    public boolean getRenderDefaultVisibility() {
        return this.a.getRenderDefaultVisibility();
    }

    public boolean getRenderPrimaryConstructorParametersAsProperties() {
        return this.a.getRenderPrimaryConstructorParametersAsProperties();
    }

    public boolean getRenderTypeExpansions() {
        return this.a.getRenderTypeExpansions();
    }

    public boolean getRenderUnabbreviatedType() {
        return this.a.getRenderUnabbreviatedType();
    }

    public boolean getSecondaryConstructorsAsPrimary() {
        return this.a.getSecondaryConstructorsAsPrimary();
    }

    public boolean getStartFromDeclarationKeyword() {
        return this.a.getStartFromDeclarationKeyword();
    }

    public boolean getStartFromName() {
        return this.a.getStartFromName();
    }

    @NotNull
    public RenderingFormat getTextFormat() {
        return this.a.getTextFormat();
    }

    @NotNull
    public Function1<KotlinType, KotlinType> getTypeNormalizer() {
        return this.a.getTypeNormalizer();
    }

    public boolean getUninferredTypeParameterAsName() {
        return this.a.getUninferredTypeParameterAsName();
    }

    public boolean getUnitReturnType() {
        return this.a.getUnitReturnType();
    }

    @NotNull
    public DescriptorRenderer.ValueParametersHandler getValueParametersHandler() {
        return this.a.getValueParametersHandler();
    }

    public boolean getVerbose() {
        return this.a.getVerbose();
    }

    public boolean getWithDefinedIn() {
        return this.a.getWithDefinedIn();
    }

    public boolean getWithSourceFileForTopLevel() {
        return this.a.getWithSourceFileForTopLevel();
    }

    public boolean getWithoutReturnType() {
        return this.a.getWithoutReturnType();
    }

    public boolean getWithoutSuperTypes() {
        return this.a.getWithoutSuperTypes();
    }

    public boolean getWithoutTypeParameters() {
        return this.a.getWithoutTypeParameters();
    }

    @Override // kotlin.reflect.jvm.internal.impl.renderer.DescriptorRenderer
    @NotNull
    public String render(@NotNull DeclarationDescriptor declarationDescriptor) {
        StringBuilder sb = new StringBuilder();
        declarationDescriptor.accept(new RenderDeclarationDescriptorVisitor(), sb);
        if (getWithDefinedIn()) {
            a(sb, declarationDescriptor);
        }
        return sb.toString();
    }

    @Override // kotlin.reflect.jvm.internal.impl.renderer.DescriptorRenderer
    @NotNull
    public String renderAnnotation(@NotNull AnnotationDescriptor annotationDescriptor, @Nullable AnnotationUseSiteTarget annotationUseSiteTarget) throws IOException {
        StringBuilder sb = new StringBuilder();
        sb.append('@');
        if (annotationUseSiteTarget != null) {
            sb.append(Intrinsics.stringPlus(annotationUseSiteTarget.getRenderName(), ":"));
        }
        KotlinType type = annotationDescriptor.getType();
        sb.append(renderType(type));
        if (getIncludeAnnotationArguments()) {
            List<String> listP = p(annotationDescriptor);
            if (getIncludeEmptyAnnotationArguments() || (!listP.isEmpty())) {
                CollectionsKt___CollectionsKt.joinTo(listP, sb, (112 & 2) != 0 ? ", " : ", ", (112 & 4) != 0 ? "" : "(", (112 & 8) == 0 ? ")" : "", (112 & 16) != 0 ? -1 : 0, (112 & 32) != 0 ? "..." : null, (112 & 64) != 0 ? null : null);
            }
        }
        if (getVerbose() && (KotlinTypeKt.isError(type) || (type.getConstructor().mo4298getDeclarationDescriptor() instanceof NotFoundClasses.MockClassDescriptor))) {
            sb.append(" /* annotation class not found */");
        }
        return sb.toString();
    }

    @NotNull
    public String renderClassifierName(@NotNull ClassifierDescriptor classifierDescriptor) {
        return ErrorUtils.isError(classifierDescriptor) ? classifierDescriptor.getTypeConstructor().toString() : getClassifierNamePolicy().renderClassifier(classifierDescriptor, this);
    }

    @Override // kotlin.reflect.jvm.internal.impl.renderer.DescriptorRenderer
    @NotNull
    public String renderFlexibleType(@NotNull String str, @NotNull String str2, @NotNull KotlinBuiltIns kotlinBuiltIns) {
        if (d(str, str2)) {
            if (!m.startsWith$default(str2, "(", false, 2, null)) {
                return Intrinsics.stringPlus(str, "!");
            }
            return '(' + str + ")!";
        }
        String strSubstringBefore$default = StringsKt__StringsKt.substringBefore$default(getClassifierNamePolicy().renderClassifier(kotlinBuiltIns.getCollection(), this), "Collection", (String) null, 2, (Object) null);
        String strN0 = n0(str, Intrinsics.stringPlus(strSubstringBefore$default, "Mutable"), str2, strSubstringBefore$default, strSubstringBefore$default + "(Mutable)");
        if (strN0 != null) {
            return strN0;
        }
        String strN1 = n0(str, Intrinsics.stringPlus(strSubstringBefore$default, "MutableMap.MutableEntry"), str2, Intrinsics.stringPlus(strSubstringBefore$default, "Map.Entry"), Intrinsics.stringPlus(strSubstringBefore$default, "(Mutable)Map.(Mutable)Entry"));
        if (strN1 != null) {
            return strN1;
        }
        String strSubstringBefore$default2 = StringsKt__StringsKt.substringBefore$default(getClassifierNamePolicy().renderClassifier(kotlinBuiltIns.getArray(), this), "Array", (String) null, 2, (Object) null);
        String strN2 = n0(str, Intrinsics.stringPlus(strSubstringBefore$default2, e("Array<")), str2, Intrinsics.stringPlus(strSubstringBefore$default2, e("Array<out ")), Intrinsics.stringPlus(strSubstringBefore$default2, e("Array<(out) ")));
        if (strN2 != null) {
            return strN2;
        }
        return '(' + str + ".." + str2 + ')';
    }

    @Override // kotlin.reflect.jvm.internal.impl.renderer.DescriptorRenderer
    @NotNull
    public String renderFqName(@NotNull FqNameUnsafe fqNameUnsafe) {
        return A(fqNameUnsafe.pathSegments());
    }

    @NotNull
    public String renderMessage(@NotNull String str) {
        int i = WhenMappings.$EnumSwitchMapping$0[getTextFormat().ordinal()];
        if (i == 1) {
            return str;
        }
        if (i != 2) {
            throw new NoWhenBranchMatchedException();
        }
        return "<i>" + str + "</i>";
    }

    @Override // kotlin.reflect.jvm.internal.impl.renderer.DescriptorRenderer
    @NotNull
    public String renderName(@NotNull Name name, boolean z) {
        String strE = e(RenderingUtilsKt.render(name));
        if (!getBoldOnlyForNamesInHtml() || getTextFormat() != RenderingFormat.HTML || !z) {
            return strE;
        }
        return "<b>" + strE + "</b>";
    }

    @Override // kotlin.reflect.jvm.internal.impl.renderer.DescriptorRenderer
    @NotNull
    public String renderType(@NotNull KotlinType kotlinType) {
        StringBuilder sb = new StringBuilder();
        L(sb, getTypeNormalizer().invoke(kotlinType));
        return sb.toString();
    }

    @NotNull
    public String renderTypeArguments(@NotNull List<? extends TypeProjection> list) throws IOException {
        if (list.isEmpty()) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        sb.append(k());
        b(sb, list);
        sb.append(g());
        return sb.toString();
    }

    @NotNull
    public String renderTypeConstructor(@NotNull TypeConstructor typeConstructor) {
        ClassifierDescriptor classifierDescriptorMo4298getDeclarationDescriptor = typeConstructor.mo4298getDeclarationDescriptor();
        if (classifierDescriptorMo4298getDeclarationDescriptor instanceof TypeParameterDescriptor ? true : classifierDescriptorMo4298getDeclarationDescriptor instanceof ClassDescriptor ? true : classifierDescriptorMo4298getDeclarationDescriptor instanceof TypeAliasDescriptor) {
            return renderClassifierName(classifierDescriptorMo4298getDeclarationDescriptor);
        }
        if (classifierDescriptorMo4298getDeclarationDescriptor == null) {
            return typeConstructor instanceof IntersectionTypeConstructor ? ((IntersectionTypeConstructor) typeConstructor).makeDebugNameForIntersectionType(f.a) : typeConstructor.toString();
        }
        throw new IllegalStateException(Intrinsics.stringPlus("Unexpected classifier: ", classifierDescriptorMo4298getDeclarationDescriptor.getClass()).toString());
    }

    @Override // kotlin.reflect.jvm.internal.impl.renderer.DescriptorRenderer
    @NotNull
    public String renderTypeProjection(@NotNull TypeProjection typeProjection) throws IOException {
        StringBuilder sb = new StringBuilder();
        b(sb, kotlin.collections.e.listOf(typeProjection));
        return sb.toString();
    }

    @Override // kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererOptions
    public void setAnnotationArgumentsRenderingPolicy(@NotNull AnnotationArgumentsRenderingPolicy annotationArgumentsRenderingPolicy) {
        this.a.setAnnotationArgumentsRenderingPolicy(annotationArgumentsRenderingPolicy);
    }

    @Override // kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererOptions
    public void setClassifierNamePolicy(@NotNull ClassifierNamePolicy classifierNamePolicy) {
        this.a.setClassifierNamePolicy(classifierNamePolicy);
    }

    @Override // kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererOptions
    public void setDebugMode(boolean z) {
        this.a.setDebugMode(z);
    }

    @Override // kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererOptions
    public void setExcludedTypeAnnotationClasses(@NotNull Set<FqName> set) {
        this.a.setExcludedTypeAnnotationClasses(set);
    }

    @Override // kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererOptions
    public void setModifiers(@NotNull Set<? extends DescriptorRendererModifier> set) {
        this.a.setModifiers(set);
    }

    @Override // kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererOptions
    public void setParameterNameRenderingPolicy(@NotNull ParameterNameRenderingPolicy parameterNameRenderingPolicy) {
        this.a.setParameterNameRenderingPolicy(parameterNameRenderingPolicy);
    }

    @Override // kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererOptions
    public void setReceiverAfterName(boolean z) {
        this.a.setReceiverAfterName(z);
    }

    @Override // kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererOptions
    public void setRenderCompanionObjectName(boolean z) {
        this.a.setRenderCompanionObjectName(z);
    }

    @Override // kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererOptions
    public void setStartFromName(boolean z) {
        this.a.setStartFromName(z);
    }

    @Override // kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererOptions
    public void setTextFormat(@NotNull RenderingFormat renderingFormat) {
        this.a.setTextFormat(renderingFormat);
    }

    @Override // kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererOptions
    public void setVerbose(boolean z) {
        this.a.setVerbose(z);
    }

    @Override // kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererOptions
    public void setWithDefinedIn(boolean z) {
        this.a.setWithDefinedIn(z);
    }

    @Override // kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererOptions
    public void setWithoutSuperTypes(boolean z) {
        this.a.setWithoutSuperTypes(z);
    }

    @Override // kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererOptions
    public void setWithoutTypeParameters(boolean z) {
        this.a.setWithoutTypeParameters(z);
    }
}
