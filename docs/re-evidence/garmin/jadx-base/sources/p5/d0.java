package p5;

import java.util.ArrayList;
import java.util.List;
import o4.r1;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import s5.w0;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lp5/d0;", "", "<init>", "()V", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class d0 {
    public static final j0<x5.p> J;
    public static final j0<Boolean> K;
    public static final j0<r5.a> L;
    public static final j0<Unit> M;
    public static final j0<String> N;
    public static final j0<e23.l<Object, Integer>> O;
    public static final j0<Boolean> P;
    public static final j0<Integer> Q;
    public static final j0<r1> R;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final d0 f135959a = new d0();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final j0<List<String>> f135960b = new j0<>("ContentDescription", true, b.f135986a, null, 8, null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final j0<String> f135961c = new j0<>("StateDescription", true);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final j0<p5.k> f135962d = new j0<>("ProgressBarRangeInfo", true);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final j0<String> f135963e = new j0<>("PaneTitle", true, j.f135994a, null, 8, null);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final j0<Unit> f135964f = new j0<>("SelectableGroup", true);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final j0<p5.d> f135965g = new j0<>("CollectionInfo", true);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final j0<p5.e> f135966h = new j0<>("CollectionItemInfo", true);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final j0<Unit> f135967i = new j0<>("Heading", true);

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final j0<Unit> f135968j = new j0<>("TextEntryKey", true);

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final j0<Unit> f135969k = new j0<>("Disabled", true);

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final j0<p5.i> f135970l = new j0<>("LiveRegion", true);

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final j0<Boolean> f135971m = new j0<>("Focused", true);

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final j0<Boolean> f135972n = new j0<>("IsContainer", true);

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final j0<Boolean> f135973o = new j0<>("IsTraversalGroup", (e23.p) null, 2, (p005kotlin.jvm.internal.j) null);

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final j0<Boolean> f135974p = new j0<>("IsSensitiveData", (e23.p) null, 2, (p005kotlin.jvm.internal.j) null);

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final j0<Unit> f135975q = new j0<>("InvisibleToUser", f.f135990a);

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final j0<Unit> f135976r = new j0<>("HideFromAccessibility", e.f135989a);

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final j0<i4.s> f135977s = new j0<>("ContentType", c.f135987a);

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final j0<i4.r> f135978t = new j0<>("ContentDataType", a.f135985a);

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final j0<i4.t> f135979u = new j0<>("FillableData", d.f135988a);

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final j0<Float> f135980v = new j0<>("TraversalIndex", o.f135999a);

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final j0<p5.n> f135981w = new j0<>("HorizontalScrollAxisRange", true);

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final j0<p5.n> f135982x = new j0<>("VerticalScrollAxisRange", true);

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final j0<Unit> f135983y = new j0<>("IsPopup", true, h.f135992a, null, 8, null);

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final j0<Unit> f135984z = new j0<>("IsDialog", true, g.f135991a, null, 8, null);
    public static final j0<p5.l> A = new j0<>("Role", true, k.f135995a, null, 8, null);
    public static final j0<String> B = new j0<>("TestTag", false, m.f135997a, null, 8, null);
    public static final j0<Unit> C = new j0<>("LinkTestMarker", false, i.f135993a, null, 8, null);
    public static final j0<List<s5.c>> D = new j0<>("Text", true, n.f135998a, null, 8, null);
    public static final j0<s5.c> E = new j0<>("TextSubstitution", (e23.p) null, 2, (p005kotlin.jvm.internal.j) null);
    public static final j0<Boolean> F = new j0<>("IsShowingTextSubstitution", (e23.p) null, 2, (p005kotlin.jvm.internal.j) null);
    public static final j0<s5.c> G = new j0<>("InputText", true);
    public static final j0<s5.c> H = new j0<>("EditableText", true);
    public static final j0<w0> I = new j0<>("TextSelectionRange", true);

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0005\u0010\u0005\u001a\u0004\u0018\u00010\u00002\b\u0010\u0001\u001a\u0004\u0018\u00010\u00002\u0006\u0010\u0002\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Li4/r;", "parentValue", "<unused var>", "invoke", "(Li4/r;Li4/r;)Li4/r;", "<anonymous>"}, k = 3, mv = {2, 1, 0})
    public static final class a extends p005kotlin.jvm.internal.w implements e23.p<i4.r, i4.r, i4.r> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f135985a = new a();

        public a() {
            super(2);
        }

        @Override // e23.p
        public final i4.r invoke(i4.r rVar, i4.r rVar2) {
            return rVar;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0003\u0010\u0000\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00012\u000e\u0010\u0003\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "", "parentValue", "childValue", "invoke"}, k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class b extends p005kotlin.jvm.internal.w implements e23.p<List<? extends String>, List<? extends String>, List<? extends String>> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final b f135986a = new b();

        public b() {
            super(2);
        }

        @Override // e23.p
        public final List<? extends String> invoke(List<? extends String> list, List<? extends String> list2) {
            List<? extends String> list3 = list;
            List<? extends String> list4 = list2;
            if (list3 == null) {
                return list4;
            }
            ArrayList arrayList = new ArrayList(list3);
            arrayList.addAll(list4);
            return arrayList;
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0005\u0010\u0005\u001a\u0004\u0018\u00010\u00002\b\u0010\u0001\u001a\u0004\u0018\u00010\u00002\u0006\u0010\u0002\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Li4/s;", "parentValue", "<unused var>", "invoke", "(Li4/s;Li4/s;)Li4/s;", "<anonymous>"}, k = 3, mv = {2, 1, 0})
    public static final class c extends p005kotlin.jvm.internal.w implements e23.p<i4.s, i4.s, i4.s> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final c f135987a = new c();

        public c() {
            super(2);
        }

        @Override // e23.p
        public final i4.s invoke(i4.s sVar, i4.s sVar2) {
            return sVar;
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0005\u0010\u0005\u001a\u0004\u0018\u00010\u00002\b\u0010\u0001\u001a\u0004\u0018\u00010\u00002\u0006\u0010\u0002\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Li4/t;", "parentValue", "<unused var>", "invoke", "(Li4/t;Li4/t;)Li4/t;", "<anonymous>"}, k = 3, mv = {2, 1, 0})
    public static final class d extends p005kotlin.jvm.internal.w implements e23.p<i4.t, i4.t, i4.t> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final d f135988a = new d();

        public d() {
            super(2);
        }

        @Override // e23.p
        public final i4.t invoke(i4.t tVar, i4.t tVar2) {
            return tVar;
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\u0010\u0000\u001a\u0004\u0018\u00010\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0003\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "", "parentValue", "<unused var>", "invoke", "(Lkotlin/Unit;Lkotlin/Unit;)Lkotlin/Unit;"}, k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class e extends p005kotlin.jvm.internal.w implements e23.p<Unit, Unit, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final e f135989a = new e();

        public e() {
            super(2);
        }

        @Override // e23.p
        public final Unit invoke(Unit unit, Unit unit2) {
            return unit;
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\u0010\u0000\u001a\u0004\u0018\u00010\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0003\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "", "parentValue", "<unused var>", "invoke", "(Lkotlin/Unit;Lkotlin/Unit;)Lkotlin/Unit;"}, k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class f extends p005kotlin.jvm.internal.w implements e23.p<Unit, Unit, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final f f135990a = new f();

        public f() {
            super(2);
        }

        @Override // e23.p
        public final Unit invoke(Unit unit, Unit unit2) {
            return unit;
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u0004\u0018\u00010\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"<anonymous>", "", "<unused var>", "invoke", "(Lkotlin/Unit;Lkotlin/Unit;)Lkotlin/Unit;"}, k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class g extends p005kotlin.jvm.internal.w implements e23.p<Unit, Unit, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final g f135991a = new g();

        public g() {
            super(2);
        }

        @Override // e23.p
        public final Unit invoke(Unit unit, Unit unit2) {
            throw new IllegalStateException("merge function called on unmergeable property IsDialog. A dialog should not be a child of a clickable/focusable node.");
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u0004\u0018\u00010\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"<anonymous>", "", "<unused var>", "invoke", "(Lkotlin/Unit;Lkotlin/Unit;)Lkotlin/Unit;"}, k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class h extends p005kotlin.jvm.internal.w implements e23.p<Unit, Unit, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final h f135992a = new h();

        public h() {
            super(2);
        }

        @Override // e23.p
        public final Unit invoke(Unit unit, Unit unit2) {
            throw new IllegalStateException("merge function called on unmergeable property IsPopup. A popup should not be a child of a clickable/focusable node.");
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\u0010\u0000\u001a\u0004\u0018\u00010\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0003\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "", "parentValue", "<unused var>", "invoke", "(Lkotlin/Unit;Lkotlin/Unit;)Lkotlin/Unit;"}, k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class i extends p005kotlin.jvm.internal.w implements e23.p<Unit, Unit, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final i f135993a = new i();

        public i() {
            super(2);
        }

        @Override // e23.p
        public final Unit invoke(Unit unit, Unit unit2) {
            return unit;
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0000\u001a\u0004\u0018\u00010\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "", "<unused var>", "invoke"}, k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class j extends p005kotlin.jvm.internal.w implements e23.p<String, String, String> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final j f135994a = new j();

        public j() {
            super(2);
        }

        @Override // e23.p
        public final String invoke(String str, String str2) {
            throw new IllegalStateException("merge function called on unmergeable property PaneTitle.");
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0005\u0010\u0005\u001a\u0004\u0018\u00010\u00002\b\u0010\u0001\u001a\u0004\u0018\u00010\u00002\u0006\u0010\u0002\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lp5/l;", "parentValue", "<unused var>", "invoke-qtA-w6s", "(Lp5/l;I)Lp5/l;", "<anonymous>"}, k = 3, mv = {2, 1, 0})
    public static final class k extends p005kotlin.jvm.internal.w implements e23.p<p5.l, p5.l, p5.l> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final k f135995a = new k();

        public k() {
            super(2);
        }

        @Override // e23.p
        public final p5.l invoke(p5.l lVar, p5.l lVar2) {
            p5.l lVar3 = lVar;
            int i14 = lVar2.f136041a;
            return lVar3;
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0005\u0010\u0005\u001a\u0004\u0018\u00010\u00002\b\u0010\u0001\u001a\u0004\u0018\u00010\u00002\u0006\u0010\u0002\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lo4/r1;", "parentValue", "<unused var>", "invoke", "(Lo4/r1;Lo4/r1;)Lo4/r1;", "<anonymous>"}, k = 3, mv = {2, 1, 0})
    public static final class l extends p005kotlin.jvm.internal.w implements e23.p<r1, r1, r1> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final l f135996a = new l();

        public l() {
            super(2);
        }

        @Override // e23.p
        public final r1 invoke(r1 r1Var, r1 r1Var2) {
            return r1Var;
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\u0010\u0000\u001a\u0004\u0018\u00010\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0003\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "parentValue", "<unused var>", "invoke"}, k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class m extends p005kotlin.jvm.internal.w implements e23.p<String, String, String> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final m f135997a = new m();

        public m() {
            super(2);
        }

        @Override // e23.p
        public final String invoke(String str, String str2) {
            return str;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00002\u000e\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00002\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"", "Ls5/c;", "parentValue", "childValue", "invoke", "(Ljava/util/List;Ljava/util/List;)Ljava/util/List;", "<anonymous>"}, k = 3, mv = {2, 1, 0})
    public static final class n extends p005kotlin.jvm.internal.w implements e23.p<List<? extends s5.c>, List<? extends s5.c>, List<? extends s5.c>> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final n f135998a = new n();

        public n() {
            super(2);
        }

        @Override // e23.p
        public final List<? extends s5.c> invoke(List<? extends s5.c> list, List<? extends s5.c> list2) {
            List<? extends s5.c> list3 = list;
            List<? extends s5.c> list4 = list2;
            if (list3 == null) {
                return list4;
            }
            ArrayList arrayList = new ArrayList(list3);
            arrayList.addAll(list4);
            return arrayList;
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0004\u0010\u0000\u001a\u0004\u0018\u00010\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0003\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "", "parentValue", "<unused var>", "invoke", "(Ljava/lang/Float;F)Ljava/lang/Float;"}, k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class o extends p005kotlin.jvm.internal.w implements e23.p<Float, Float, Float> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final o f135999a = new o();

        public o() {
            super(2);
        }

        @Override // e23.p
        public final Float invoke(Float f14, Float f15) {
            Float f16 = f14;
            f15.floatValue();
            return f16;
        }
    }

    static {
        new j0("TextCompositionRange", true);
        J = new j0<>("ImeAction", true);
        K = new j0<>("Selected", true);
        L = new j0<>("ToggleableState", true);
        new j0("InputTextSuggestionState", true);
        M = new j0<>("Password", true);
        N = new j0<>("Error", true);
        O = new j0<>("IndexForKey", (e23.p) null, 2, (p005kotlin.jvm.internal.j) null);
        P = new j0<>("IsEditable", (e23.p) null, 2, (p005kotlin.jvm.internal.j) null);
        Q = new j0<>("MaxTextLength", (e23.p) null, 2, (p005kotlin.jvm.internal.j) null);
        R = new j0<>("Shape", false, l.f135996a, null, 8, null);
    }

    private d0() {
    }
}
