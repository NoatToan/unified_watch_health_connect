package o4;

import ch.qos.logback.core.CoreConstants;
import com.garmin.proto.generated.GDIInReachMessaging;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import r1.q2;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\n\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B©\u0001\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0004\u0012\u0006\u0010\b\u001a\u00020\u0004\u0012\u0006\u0010\t\u001a\u00020\u0004\u0012\u0006\u0010\n\u001a\u00020\u0004\u0012\u0006\u0010\u000b\u001a\u00020\u0004\u0012\u0006\u0010\f\u001a\u00020\u0004\u0012\u0006\u0010\r\u001a\u00020\u0004\u0012\u0006\u0010\u000e\u001a\u00020\u0004\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\u0006\u0010\u0014\u001a\u00020\u0013\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015\u0012\u0006\u0010\u0018\u001a\u00020\u0017\u0012\u0006\u0010\u0019\u001a\u00020\u0017\u0012\b\b\u0002\u0010\u001b\u001a\u00020\u001a\u0012\b\b\u0002\u0010\u001d\u001a\u00020\u001c\u0012\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u001e¢\u0006\u0004\b \u0010!¨\u0006\""}, d2 = {"Lo4/s1;", "Lh5/c0;", "Lh5/y1;", "Lh4/r$c;", "", "scaleX", "scaleY", "alpha", "translationX", "translationY", "shadowElevation", "rotationX", "rotationY", "rotationZ", "cameraDistance", "Lo4/z1;", "transformOrigin", "Lo4/r1;", "shape", "", "clip", "Lo4/n1;", "renderEffect", "Lo4/d0;", "ambientShadowColor", "spotShadowColor", "Lo4/n0;", "compositingStrategy", "Lo4/q;", "blendMode", "Lo4/e0;", "colorFilter", "<init>", "(FFFFFFFFFFJLo4/r1;ZLo4/n1;JJIILo4/e0;Lkotlin/jvm/internal/j;)V", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class s1 extends h4.r.c implements h5.c0, h5.y1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public float f128983a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public float f128984b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public float f128985c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public float f128986d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public float f128987e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public float f128988f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public float f128989g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public float f128990h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public float f128991i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public float f128992j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public long f128993k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public r1 f128994l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean f128995m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public n1 f128996n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public long f128997o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public long f128998p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f128999q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f129000r;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public e0 f129001t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final a f129002v;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo4/t0;", "", "invoke", "(Lo4/t0;)V", "<anonymous>"}, k = 3, mv = {2, 1, 0})
    public static final class a extends p005kotlin.jvm.internal.w implements e23.l<t0, Unit> {
        public a() {
            super(1);
        }

        @Override // e23.l
        public final Unit invoke(t0 t0Var) {
            t0 t0Var2 = t0Var;
            s1 s1Var = s1.this;
            t0Var2.v(s1Var.f128983a);
            t0Var2.w(s1Var.f128984b);
            t0Var2.c(s1Var.f128985c);
            t0Var2.x(s1Var.f128986d);
            t0Var2.q(s1Var.f128987e);
            t0Var2.j(s1Var.f128988f);
            t0Var2.h(s1Var.f128989g);
            t0Var2.i(s1Var.f128990h);
            t0Var2.k(s1Var.f128991i);
            t0Var2.s(s1Var.f128992j);
            t0Var2.T0(s1Var.f128993k);
            t0Var2.e1(s1Var.f128994l);
            t0Var2.g(s1Var.f128995m);
            t0Var2.t(s1Var.f128996n);
            t0Var2.m(s1Var.f128997o);
            t0Var2.n(s1Var.f128998p);
            t0Var2.K0(s1Var.f128999q);
            t0Var2.l(s1Var.f129000r);
            t0Var2.d(s1Var.f129001t);
            return Unit.INSTANCE;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lf5/v1$a;", "", "invoke", "(Lf5/v1$a;)V", "<anonymous>"}, k = 3, mv = {2, 1, 0})
    public static final class b extends p005kotlin.jvm.internal.w implements e23.l<f5.v1.a, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ f5.v1 f129004a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ s1 f129005b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(f5.v1 v1Var, s1 s1Var) {
            super(1);
            this.f129004a = v1Var;
            this.f129005b = s1Var;
        }

        @Override // e23.l
        public final Unit invoke(f5.v1.a aVar) {
            f5.v1.a.K(aVar, this.f129004a, 0, 0, this.f129005b.f129002v, 4);
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public s1(float f14, float f15, float f16, float f17, float f18, float f19, float f22, float f24, float f25, float f26, long j8, r1 r1Var, boolean z14, n1 n1Var, long j14, long j15, int i14, int i15, e0 e0Var, int i16, p005kotlin.jvm.internal.j jVar) {
        int i17;
        int i18;
        if ((i16 & 65536) != 0) {
            n0.f128892b.getClass();
            i17 = 0;
        } else {
            i17 = i14;
        }
        if ((i16 & 131072) != 0) {
            q.f128930b.getClass();
            i18 = q.f128933e;
        } else {
            i18 = i15;
        }
        this(f14, f15, f16, f17, f18, f19, f22, f24, f25, f26, j8, r1Var, z14, n1Var, j14, j15, i17, i18, (i16 & GDIInReachMessaging.Capabilities.MessagingCapability.PLAN_CHANGE_VALUE) != 0 ? null : e0Var, null);
    }

    @Override // h5.y1
    public final void D1(p5.k0 k0Var) {
        if (h4.i.f81562d && this.f128995m) {
            p5.h0.y(k0Var, this.f128994l);
        }
    }

    @Override // h4.r.c
    /* JADX INFO: renamed from: getShouldAutoInvalidate */
    public final boolean getF69013b() {
        return false;
    }

    @Override // h5.c0
    /* JADX INFO: renamed from: measure-3p2s80s */
    public final f5.a1 mo5measure3p2s80s(f5.b1 b1Var, f5.y0 y0Var, long j8) {
        f5.v1 v1VarQ = y0Var.Q(j8);
        return f5.b1.h0(b1Var, v1VarQ.f69144a, v1VarQ.f69145b, new b(v1VarQ, this));
    }

    @Override // h5.y1
    public final boolean o1() {
        return false;
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("SimpleGraphicsLayerModifier(scaleX=");
        sb3.append(this.f128983a);
        sb3.append(", scaleY=");
        sb3.append(this.f128984b);
        sb3.append(", alpha = ");
        sb3.append(this.f128985c);
        sb3.append(", translationX=");
        sb3.append(this.f128986d);
        sb3.append(", translationY=");
        sb3.append(this.f128987e);
        sb3.append(", shadowElevation=");
        sb3.append(this.f128988f);
        sb3.append(", rotationX=");
        sb3.append(this.f128989g);
        sb3.append(", rotationY=");
        sb3.append(this.f128990h);
        sb3.append(", rotationZ=");
        sb3.append(this.f128991i);
        sb3.append(", cameraDistance=");
        sb3.append(this.f128992j);
        sb3.append(", transformOrigin=");
        sb3.append((Object) z1.c(this.f128993k));
        sb3.append(", shape=");
        sb3.append(this.f128994l);
        sb3.append(", clip=");
        sb3.append(this.f128995m);
        sb3.append(", renderEffect=");
        sb3.append(this.f128996n);
        sb3.append(", ambientShadowColor=");
        q2.m(this.f128997o, ", spotShadowColor=", sb3);
        q2.m(this.f128998p, ", compositingStrategy=", sb3);
        sb3.append((Object) n0.b(this.f128999q));
        sb3.append(", blendMode=");
        sb3.append((Object) q.b(this.f129000r));
        sb3.append(", colorFilter=");
        sb3.append(this.f129001t);
        sb3.append(CoreConstants.RIGHT_PARENTHESIS_CHAR);
        return sb3.toString();
    }

    private s1(float f14, float f15, float f16, float f17, float f18, float f19, float f22, float f24, float f25, float f26, long j8, r1 r1Var, boolean z14, n1 n1Var, long j14, long j15, int i14, int i15, e0 e0Var) {
        this.f128983a = f14;
        this.f128984b = f15;
        this.f128985c = f16;
        this.f128986d = f17;
        this.f128987e = f18;
        this.f128988f = f19;
        this.f128989g = f22;
        this.f128990h = f24;
        this.f128991i = f25;
        this.f128992j = f26;
        this.f128993k = j8;
        this.f128994l = r1Var;
        this.f128995m = z14;
        this.f128996n = n1Var;
        this.f128997o = j14;
        this.f128998p = j15;
        this.f128999q = i14;
        this.f129000r = i15;
        this.f129001t = e0Var;
        this.f129002v = new a();
    }

    public /* synthetic */ s1(float f14, float f15, float f16, float f17, float f18, float f19, float f22, float f24, float f25, float f26, long j8, r1 r1Var, boolean z14, n1 n1Var, long j14, long j15, int i14, int i15, e0 e0Var, p005kotlin.jvm.internal.j jVar) {
        this(f14, f15, f16, f17, f18, f19, f22, f24, f25, f26, j8, r1Var, z14, n1Var, j14, j15, i14, i15, e0Var);
    }
}
