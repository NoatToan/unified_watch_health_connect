package p007l6;

import com.google.android.exoplayer2.text.ttml.TtmlNode;
import g6.f;
import k23.l;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.b0;
import p005kotlin.jvm.internal.j;
import p005kotlin.jvm.internal.s0;
import p005kotlin.jvm.internal.t0;
import p6.g;
import p6.h;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001:\u0003\u0007\b\tB\u0019\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0001\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\n"}, d2 = {"Ll6/d;", "", TtmlNode.ATTR_ID, "Lp6/g;", "containerObject", "<init>", "(Ljava/lang/Object;Lp6/g;)V", "a", "b", "c", "constraintlayout-compose_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class d {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ l<Object>[] f110447i;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f110448a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final g f110449b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e f110450c = new e("parent");

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final q f110451d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final g f110452e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final q f110453f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final g f110454g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final a f110455h;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0082\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Ll6/d$a;", "Lg23/c;", "Ll6/s;", "initialValue", "<init>", "(Ll6/d;Ll6/s;)V", "constraintlayout-compose_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public final class a extends g23.c<s> {
        public a(s sVar) {
            super(sVar);
        }

        @Override // g23.c
        public final void afterChange(l lVar, s sVar, s sVar2) {
            p6.d dVarA;
            s sVar3 = sVar2;
            g gVar = d.this.f110449b;
            String f122483i = lVar.getF122483i();
            sVar3.getClass();
            t tVar = (t) sVar3;
            u uVar = tVar.f110502b;
            u uVar2 = tVar.f110504d;
            u uVar3 = tVar.f110503c;
            f fVar = uVar3.f110505a;
            String str = uVar3.f110506b;
            if (fVar == null && str == null && uVar2.f110505a == null && uVar2.f110506b == null) {
                dVarA = uVar.a();
            } else {
                g gVar2 = new g(new char[0]);
                if (uVar3.f110505a != null || str != null) {
                    gVar2.u("min", uVar3.a());
                }
                if (uVar2.f110505a != null || uVar2.f110506b != null) {
                    gVar2.u("max", uVar2.a());
                }
                gVar2.u("value", uVar.a());
                dVarA = gVar2;
            }
            gVar.u(f122483i, dVarA);
        }
    }

    /* JADX INFO: renamed from: l6.d$d, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u000f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"l6/d$d", "Lg23/c;", "Ll6/d0;", "constraintlayout-compose_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class C2110d extends g23.c<d0> {
        public C2110d(d0 d0Var) {
            super(d0Var);
        }

        @Override // g23.c
        public final void afterChange(l lVar, d0 d0Var, d0 d0Var2) {
            g gVar = d.this.f110449b;
            String f122483i = lVar.getF122483i();
            String str = d0Var2.f110464a;
            gVar.getClass();
            h hVar = new h(str.toCharArray());
            hVar.f136194b = 0L;
            hVar.f(str.length() - 1);
            gVar.u(f122483i, hVar);
        }
    }

    static {
        b0 b0Var = new b0(d.class, "width", "getWidth()Landroidx/constraintlayout/compose/Dimension;", 0);
        t0 t0Var = s0.f105811a;
        f110447i = new l[]{t0Var.f(b0Var), kg.f.g(d.class, "height", "getHeight()Landroidx/constraintlayout/compose/Dimension;", 0, t0Var), kg.f.g(d.class, "visibility", "getVisibility()Landroidx/constraintlayout/compose/Visibility;", 0, t0Var), kg.f.g(d.class, "scaleX", "getScaleX()F", 0, t0Var), kg.f.g(d.class, "scaleY", "getScaleY()F", 0, t0Var), kg.f.g(d.class, "rotationX", "getRotationX()F", 0, t0Var), kg.f.g(d.class, "rotationY", "getRotationY()F", 0, t0Var), kg.f.g(d.class, "rotationZ", "getRotationZ()F", 0, t0Var), kg.f.g(d.class, "translationX", "getTranslationX-D9Ej5fM()F", 0, t0Var), kg.f.g(d.class, "translationY", "getTranslationY-D9Ej5fM()F", 0, t0Var), kg.f.g(d.class, "translationZ", "getTranslationZ-D9Ej5fM()F", 0, t0Var), kg.f.g(d.class, "pivotX", "getPivotX()F", 0, t0Var), kg.f.g(d.class, "pivotY", "getPivotY()F", 0, t0Var), kg.f.g(d.class, "horizontalChainWeight", "getHorizontalChainWeight()F", 0, t0Var), kg.f.g(d.class, "verticalChainWeight", "getVerticalChainWeight()F", 0, t0Var)};
    }

    public d(Object obj, g gVar) {
        this.f110448a = obj;
        this.f110449b = gVar;
        this.f110451d = new q(-2, gVar);
        new q(0, gVar);
        this.f110452e = new g(0, gVar);
        this.f110453f = new q(-1, gVar);
        new q(1, gVar);
        this.f110454g = new g(1, gVar);
        new f(gVar);
        s.f110500a.getClass();
        this.f110455h = new a(new t("wrap"));
        new a(new t("wrap"));
        d0.f110462b.getClass();
        new C2110d(d0.f110463c);
        new c(this, 1.0f, null, 2, null);
        int i14 = 2;
        j jVar = null;
        String str = null;
        new c(this, 1.0f, str, i14, jVar);
        float f14 = 0.0f;
        new c(this, f14, str, i14, jVar);
        new c(this, f14, str, i14, jVar);
        new c(this, f14, str, i14, jVar);
        float f15 = 0;
        f.a aVar = f.f75994b;
        new b(this, f15, str, i14, jVar);
        new b(this, f15, str, i14, jVar);
        new b(this, f15, str, i14, jVar);
        float f16 = 0.5f;
        new c(this, f16, str, i14, jVar);
        new c(this, f16, str, i14, jVar);
        new c(Float.NaN, "hWeight");
        new c(Float.NaN, "vWeight");
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0082\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u001b\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Ll6/d$b;", "Lg23/c;", "Lg6/f;", "initialValue", "", "nameOverride", "<init>", "(Ll6/d;FLjava/lang/String;Lkotlin/jvm/internal/j;)V", "constraintlayout-compose_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public final class b extends g23.c<f> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f110457a;

        private b(float f14, String str) {
            super(f.a(f14));
            this.f110457a = str;
        }

        @Override // g23.c
        public final void afterChange(l lVar, f fVar, f fVar2) {
            float f14 = fVar.f75997a;
            float f15 = fVar2.f75997a;
            if (Float.isNaN(f15)) {
                return;
            }
            g gVar = d.this.f110449b;
            String f122483i = this.f110457a;
            if (f122483i == null) {
                f122483i = lVar.getF122483i();
            }
            gVar.getClass();
            gVar.u(f122483i, new p6.f(f15));
        }

        public /* synthetic */ b(d dVar, float f14, String str, j jVar) {
            this(f14, str);
        }

        public /* synthetic */ b(d dVar, float f14, String str, int i14, j jVar) {
            this(dVar, f14, (i14 & 2) != 0 ? null : str, null);
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0082\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u001b\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Ll6/d$c;", "Lg23/c;", "", "initialValue", "", "nameOverride", "<init>", "(Ll6/d;FLjava/lang/String;)V", "constraintlayout-compose_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public final class c extends g23.c<Float> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f110459a;

        public c(float f14, String str) {
            super(Float.valueOf(f14));
            this.f110459a = str;
        }

        @Override // g23.c
        public final void afterChange(l lVar, Float f14, Float f15) {
            f14.floatValue();
            float fFloatValue = f15.floatValue();
            if (Float.isNaN(fFloatValue)) {
                return;
            }
            g gVar = d.this.f110449b;
            String f122483i = this.f110459a;
            if (f122483i == null) {
                f122483i = lVar.getF122483i();
            }
            gVar.getClass();
            gVar.u(f122483i, new p6.f(fFloatValue));
        }

        public /* synthetic */ c(d dVar, float f14, String str, int i14, j jVar) {
            this(f14, (i14 & 2) != 0 ? null : str);
        }
    }
}
