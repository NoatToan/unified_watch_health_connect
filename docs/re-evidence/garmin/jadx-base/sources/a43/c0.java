package a43;

import java.util.LinkedHashSet;
import java.util.Set;
import p005kotlin.jvm.internal.s0;
import p005kotlin.jvm.internal.t0;
import p13.l0;

/* JADX INFO: loaded from: classes3.dex */
public final class c0 implements y {
    public static final /* synthetic */ k23.l<Object>[] Y;
    public final b0 A;
    public final b0 B;
    public final b0 C;
    public final b0 D;
    public final b0 E;
    public final b0 F;
    public final b0 G;
    public final b0 H;
    public final b0 I;
    public final b0 J;
    public final b0 K;
    public final b0 L;
    public final b0 M;
    public final b0 N;
    public final b0 O;
    public final b0 P;
    public final b0 Q;
    public final b0 R;
    public final b0 S;
    public final b0 T;
    public final b0 U;
    public final b0 V;
    public final b0 W;
    public final b0 X;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f1109a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b0 f1110b = o(b.c.f1106a);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final b0 f1111c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final b0 f1112d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final b0 f1113e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final b0 f1114f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final b0 f1115g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final b0 f1116h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final b0 f1117i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final b0 f1118j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final b0 f1119k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final b0 f1120l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final b0 f1121m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final b0 f1122n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final b0 f1123o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final b0 f1124p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final b0 f1125q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final b0 f1126r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final b0 f1127s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final b0 f1128t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final b0 f1129u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final b0 f1130v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final b0 f1131w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final b0 f1132x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final b0 f1133y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final b0 f1134z;

    static {
        p005kotlin.jvm.internal.b0 b0Var = new p005kotlin.jvm.internal.b0(c0.class, "classifierNamePolicy", "getClassifierNamePolicy()Lorg/jetbrains/kotlin/renderer/ClassifierNamePolicy;", 0);
        t0 t0Var = s0.f105811a;
        Y = new k23.l[]{t0Var.f(b0Var), kg.f.g(c0.class, "withDefinedIn", "getWithDefinedIn()Z", 0, t0Var), kg.f.g(c0.class, "withSourceFileForTopLevel", "getWithSourceFileForTopLevel()Z", 0, t0Var), kg.f.g(c0.class, "modifiers", "getModifiers()Ljava/util/Set;", 0, t0Var), kg.f.g(c0.class, "startFromName", "getStartFromName()Z", 0, t0Var), kg.f.g(c0.class, "startFromDeclarationKeyword", "getStartFromDeclarationKeyword()Z", 0, t0Var), kg.f.g(c0.class, "debugMode", "getDebugMode()Z", 0, t0Var), kg.f.g(c0.class, "classWithPrimaryConstructor", "getClassWithPrimaryConstructor()Z", 0, t0Var), kg.f.g(c0.class, "verbose", "getVerbose()Z", 0, t0Var), kg.f.g(c0.class, "unitReturnType", "getUnitReturnType()Z", 0, t0Var), kg.f.g(c0.class, "withoutReturnType", "getWithoutReturnType()Z", 0, t0Var), kg.f.g(c0.class, "enhancedTypes", "getEnhancedTypes()Z", 0, t0Var), kg.f.g(c0.class, "normalizedVisibilities", "getNormalizedVisibilities()Z", 0, t0Var), kg.f.g(c0.class, "renderDefaultVisibility", "getRenderDefaultVisibility()Z", 0, t0Var), kg.f.g(c0.class, "renderDefaultModality", "getRenderDefaultModality()Z", 0, t0Var), kg.f.g(c0.class, "renderConstructorDelegation", "getRenderConstructorDelegation()Z", 0, t0Var), kg.f.g(c0.class, "renderPrimaryConstructorParametersAsProperties", "getRenderPrimaryConstructorParametersAsProperties()Z", 0, t0Var), kg.f.g(c0.class, "actualPropertiesInPrimaryConstructor", "getActualPropertiesInPrimaryConstructor()Z", 0, t0Var), kg.f.g(c0.class, "uninferredTypeParameterAsName", "getUninferredTypeParameterAsName()Z", 0, t0Var), kg.f.g(c0.class, "includePropertyConstant", "getIncludePropertyConstant()Z", 0, t0Var), kg.f.g(c0.class, "propertyConstantRenderer", "getPropertyConstantRenderer()Lkotlin/jvm/functions/Function1;", 0, t0Var), kg.f.g(c0.class, "withoutTypeParameters", "getWithoutTypeParameters()Z", 0, t0Var), kg.f.g(c0.class, "withoutSuperTypes", "getWithoutSuperTypes()Z", 0, t0Var), kg.f.g(c0.class, "typeNormalizer", "getTypeNormalizer()Lkotlin/jvm/functions/Function1;", 0, t0Var), kg.f.g(c0.class, "defaultParameterValueRenderer", "getDefaultParameterValueRenderer()Lkotlin/jvm/functions/Function1;", 0, t0Var), kg.f.g(c0.class, "secondaryConstructorsAsPrimary", "getSecondaryConstructorsAsPrimary()Z", 0, t0Var), kg.f.g(c0.class, "overrideRenderingPolicy", "getOverrideRenderingPolicy()Lorg/jetbrains/kotlin/renderer/OverrideRenderingPolicy;", 0, t0Var), kg.f.g(c0.class, "valueParametersHandler", "getValueParametersHandler()Lorg/jetbrains/kotlin/renderer/DescriptorRenderer$ValueParametersHandler;", 0, t0Var), kg.f.g(c0.class, "textFormat", "getTextFormat()Lorg/jetbrains/kotlin/renderer/RenderingFormat;", 0, t0Var), kg.f.g(c0.class, "parameterNameRenderingPolicy", "getParameterNameRenderingPolicy()Lorg/jetbrains/kotlin/renderer/ParameterNameRenderingPolicy;", 0, t0Var), kg.f.g(c0.class, "receiverAfterName", "getReceiverAfterName()Z", 0, t0Var), kg.f.g(c0.class, "renderCompanionObjectName", "getRenderCompanionObjectName()Z", 0, t0Var), kg.f.g(c0.class, "propertyAccessorRenderingPolicy", "getPropertyAccessorRenderingPolicy()Lorg/jetbrains/kotlin/renderer/PropertyAccessorRenderingPolicy;", 0, t0Var), kg.f.g(c0.class, "renderDefaultAnnotationArguments", "getRenderDefaultAnnotationArguments()Z", 0, t0Var), kg.f.g(c0.class, "eachAnnotationOnNewLine", "getEachAnnotationOnNewLine()Z", 0, t0Var), kg.f.g(c0.class, "excludedAnnotationClasses", "getExcludedAnnotationClasses()Ljava/util/Set;", 0, t0Var), kg.f.g(c0.class, "excludedTypeAnnotationClasses", "getExcludedTypeAnnotationClasses()Ljava/util/Set;", 0, t0Var), kg.f.g(c0.class, "annotationFilter", "getAnnotationFilter()Lkotlin/jvm/functions/Function1;", 0, t0Var), kg.f.g(c0.class, "annotationArgumentsRenderingPolicy", "getAnnotationArgumentsRenderingPolicy()Lorg/jetbrains/kotlin/renderer/AnnotationArgumentsRenderingPolicy;", 0, t0Var), kg.f.g(c0.class, "alwaysRenderModifiers", "getAlwaysRenderModifiers()Z", 0, t0Var), kg.f.g(c0.class, "renderConstructorKeyword", "getRenderConstructorKeyword()Z", 0, t0Var), kg.f.g(c0.class, "renderUnabbreviatedType", "getRenderUnabbreviatedType()Z", 0, t0Var), kg.f.g(c0.class, "renderTypeExpansions", "getRenderTypeExpansions()Z", 0, t0Var), kg.f.g(c0.class, "renderAbbreviatedTypeComments", "getRenderAbbreviatedTypeComments()Z", 0, t0Var), kg.f.g(c0.class, "includeAdditionalModifiers", "getIncludeAdditionalModifiers()Z", 0, t0Var), kg.f.g(c0.class, "parameterNamesInFunctionalTypes", "getParameterNamesInFunctionalTypes()Z", 0, t0Var), kg.f.g(c0.class, "renderFunctionContracts", "getRenderFunctionContracts()Z", 0, t0Var), kg.f.g(c0.class, "presentableUnresolvedTypes", "getPresentableUnresolvedTypes()Z", 0, t0Var), kg.f.g(c0.class, "boldOnlyForNamesInHtml", "getBoldOnlyForNamesInHtml()Z", 0, t0Var), kg.f.g(c0.class, "informativeErrorType", "getInformativeErrorType()Z", 0, t0Var)};
    }

    public c0() {
        Boolean bool = Boolean.TRUE;
        this.f1111c = o(bool);
        this.f1112d = o(bool);
        this.f1113e = o(x.f1186b);
        Boolean bool2 = Boolean.FALSE;
        this.f1114f = o(bool2);
        this.f1115g = o(bool2);
        this.f1116h = o(bool2);
        this.f1117i = o(bool2);
        this.f1118j = o(bool2);
        this.f1119k = o(bool);
        this.f1120l = o(bool2);
        this.f1121m = o(bool2);
        this.f1122n = o(bool2);
        this.f1123o = o(bool);
        this.f1124p = o(bool);
        this.f1125q = o(bool2);
        this.f1126r = o(bool2);
        this.f1127s = o(bool2);
        this.f1128t = o(bool2);
        this.f1129u = o(bool2);
        this.f1130v = o(null);
        this.f1131w = o(bool2);
        this.f1132x = o(bool2);
        this.f1133y = o(z.f1204a);
        this.f1134z = o(a0.f1103a);
        this.A = o(bool);
        this.B = o(f0.RENDER_OPEN);
        this.C = o(n.b.a.f1168a);
        this.D = o(i0.f1155a);
        this.E = o(g0.ALL);
        this.F = o(bool2);
        this.G = o(bool2);
        this.H = o(h0.DEBUG);
        this.I = o(bool2);
        this.J = o(bool2);
        this.K = o(l0.f134950a);
        d0.f1136a.getClass();
        this.L = o(d0.f1137b);
        this.M = o(null);
        this.N = o(a.NO_ARGUMENTS);
        this.O = o(bool2);
        this.P = o(bool);
        this.Q = o(bool);
        this.R = o(bool2);
        this.S = o(bool2);
        this.T = o(bool);
        this.U = o(bool);
        o(bool2);
        this.V = o(bool2);
        this.W = o(bool2);
        this.X = o(bool);
    }

    @Override // a43.y
    public final void a(b bVar) {
        bVar.getClass();
        this.f1110b.setValue(this, Y[0], bVar);
    }

    @Override // a43.y
    public final void b(LinkedHashSet linkedHashSet) {
        this.L.setValue(this, Y[36], linkedHashSet);
    }

    @Override // a43.y
    public final void c() {
        this.f1111c.setValue(this, Y[1], Boolean.FALSE);
    }

    @Override // a43.y
    public final void d() {
        this.G.setValue(this, Y[31], Boolean.TRUE);
    }

    @Override // a43.y
    public final void e() {
        this.f1132x.setValue(this, Y[22], Boolean.TRUE);
    }

    @Override // a43.y
    public final void f(i0 i0Var) {
        i0Var.getClass();
        this.D.setValue(this, Y[28], i0Var);
    }

    @Override // a43.y
    public final Set<x33.c> g() {
        return (Set) this.L.getValue(this, Y[36]);
    }

    @Override // a43.y
    public final void h() {
        this.f1116h.setValue(this, Y[6], Boolean.TRUE);
    }

    @Override // a43.y
    public final void i(Set<? extends x> set) {
        set.getClass();
        this.f1113e.setValue(this, Y[3], set);
    }

    @Override // a43.y
    public final void j() {
        this.F.setValue(this, Y[30], Boolean.TRUE);
    }

    @Override // a43.y
    public final void k() {
        this.f1131w.setValue(this, Y[21], Boolean.TRUE);
    }

    @Override // a43.y
    public final void l(g0 g0Var) {
        g0Var.getClass();
        this.E.setValue(this, Y[29], g0Var);
    }

    @Override // a43.y
    public final void m() {
        this.f1114f.setValue(this, Y[4], Boolean.TRUE);
    }

    public final boolean n() {
        return ((Boolean) this.f1116h.getValue(this, Y[6])).booleanValue();
    }

    public final b0 o(Object obj) {
        g23.a aVar = g23.a.f75578a;
        return new b0(obj, this);
    }
}
