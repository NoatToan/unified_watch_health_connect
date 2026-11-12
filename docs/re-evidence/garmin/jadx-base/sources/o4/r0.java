package o4;

import ch.qos.logback.core.CoreConstants;
import kotlin.m2;
import kotlin.v3;
import p005kotlin.Metadata;
import r1.q2;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\n\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0082\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B£\u0001\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\u0003\u0012\u0006\u0010\n\u001a\u00020\u0003\u0012\u0006\u0010\u000b\u001a\u00020\u0003\u0012\u0006\u0010\f\u001a\u00020\u0003\u0012\u0006\u0010\r\u001a\u00020\u0003\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014\u0012\u0006\u0010\u0017\u001a\u00020\u0016\u0012\u0006\u0010\u0018\u001a\u00020\u0016\u0012\u0006\u0010\u001a\u001a\u00020\u0019\u0012\u0006\u0010\u001c\u001a\u00020\u001b\u0012\b\u0010\u001e\u001a\u0004\u0018\u00010\u001d¢\u0006\u0004\b\u001f\u0010 ¨\u0006!"}, d2 = {"Lo4/r0;", "Lh5/x0;", "Lo4/s1;", "", "scaleX", "scaleY", "alpha", "translationX", "translationY", "shadowElevation", "rotationX", "rotationY", "rotationZ", "cameraDistance", "Lo4/z1;", "transformOrigin", "Lo4/r1;", "shape", "", "clip", "Lo4/n1;", "renderEffect", "Lo4/d0;", "ambientShadowColor", "spotShadowColor", "Lo4/n0;", "compositingStrategy", "Lo4/q;", "blendMode", "Lo4/e0;", "colorFilter", "<init>", "(FFFFFFFFFFJLo4/r1;ZLo4/n1;JJIILo4/e0;Lkotlin/jvm/internal/j;)V", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
final /* data */ class r0 extends h5.x0<s1> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f128963a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f128964b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f128965c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final float f128966d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final float f128967e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final float f128968f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final float f128969g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final float f128970h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final float f128971i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final float f128972j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final long f128973k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final r1 f128974l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final boolean f128975m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final n1 f128976n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final long f128977o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final long f128978p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final int f128979q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final int f128980r;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final e0 f128981t;

    private r0(float f14, float f15, float f16, float f17, float f18, float f19, float f22, float f24, float f25, float f26, long j8, r1 r1Var, boolean z14, n1 n1Var, long j14, long j15, int i14, int i15, e0 e0Var) {
        this.f128963a = f14;
        this.f128964b = f15;
        this.f128965c = f16;
        this.f128966d = f17;
        this.f128967e = f18;
        this.f128968f = f19;
        this.f128969g = f22;
        this.f128970h = f24;
        this.f128971i = f25;
        this.f128972j = f26;
        this.f128973k = j8;
        this.f128974l = r1Var;
        this.f128975m = z14;
        this.f128976n = n1Var;
        this.f128977o = j14;
        this.f128978p = j15;
        this.f128979q = i14;
        this.f128980r = i15;
        this.f128981t = e0Var;
    }

    @Override // h5.x0
    public final h4.r.c create() {
        return new s1(this.f128963a, this.f128964b, this.f128965c, this.f128966d, this.f128967e, this.f128968f, this.f128969g, this.f128970h, this.f128971i, this.f128972j, this.f128973k, this.f128974l, this.f128975m, this.f128976n, this.f128977o, this.f128978p, this.f128979q, this.f128980r, this.f128981t, null);
    }

    @Override // h5.x0
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r0)) {
            return false;
        }
        r0 r0Var = (r0) obj;
        if (Float.compare(this.f128963a, r0Var.f128963a) != 0 || Float.compare(this.f128964b, r0Var.f128964b) != 0 || Float.compare(this.f128965c, r0Var.f128965c) != 0 || Float.compare(this.f128966d, r0Var.f128966d) != 0 || Float.compare(this.f128967e, r0Var.f128967e) != 0 || Float.compare(this.f128968f, r0Var.f128968f) != 0 || Float.compare(this.f128969g, r0Var.f128969g) != 0 || Float.compare(this.f128970h, r0Var.f128970h) != 0 || Float.compare(this.f128971i, r0Var.f128971i) != 0 || Float.compare(this.f128972j, r0Var.f128972j) != 0 || !z1.b(this.f128973k, r0Var.f128973k) || !p005kotlin.jvm.internal.s.g(this.f128974l, r0Var.f128974l) || this.f128975m != r0Var.f128975m || !p005kotlin.jvm.internal.s.g(this.f128976n, r0Var.f128976n) || !d0.d(this.f128977o, r0Var.f128977o) || !d0.d(this.f128978p, r0Var.f128978p)) {
            return false;
        }
        int i14 = r0Var.f128979q;
        n0.a aVar = n0.f128892b;
        if (this.f128979q == i14) {
            int i15 = r0Var.f128980r;
            q.a aVar2 = q.f128930b;
            return this.f128980r == i15 && p005kotlin.jvm.internal.s.g(this.f128981t, r0Var.f128981t);
        }
        return false;
    }

    @Override // h5.x0
    public final int hashCode() {
        int iD = q6.f.d(this.f128972j, q6.f.d(this.f128971i, q6.f.d(this.f128970h, q6.f.d(this.f128969g, q6.f.d(this.f128968f, q6.f.d(this.f128967e, q6.f.d(this.f128966d, q6.f.d(this.f128965c, q6.f.d(this.f128964b, Float.hashCode(this.f128963a) * 31, 31), 31), 31), 31), 31), 31), 31), 31), 31);
        z1.a aVar = z1.f129046b;
        int iG = q6.f.g((this.f128974l.hashCode() + q6.f.e(iD, 31, this.f128973k)) * 31, 31, this.f128975m);
        n1 n1Var = this.f128976n;
        int iHashCode = (iG + (n1Var == null ? 0 : n1Var.hashCode())) * 31;
        d0.a aVar2 = d0.f128823b;
        o13.z.a aVar3 = o13.z.f128618b;
        int iE = q6.f.e(q6.f.e(iHashCode, 31, this.f128977o), 31, this.f128978p);
        n0.a aVar4 = n0.f128892b;
        int iD2 = q2.d(this.f128979q, iE, 31);
        q.a aVar5 = q.f128930b;
        int iD3 = q2.d(this.f128980r, iD2, 31);
        e0 e0Var = this.f128981t;
        return iD3 + (e0Var != null ? e0Var.hashCode() : 0);
    }

    @Override // h5.x0
    public final void inspectableProperties(m2 m2Var) {
        m2Var.f91341a = "graphicsLayer";
        v3 v3Var = m2Var.f91343c;
        v3Var.c(Float.valueOf(this.f128963a), "scaleX");
        v3Var.c(Float.valueOf(this.f128964b), "scaleY");
        v3Var.c(Float.valueOf(this.f128965c), "alpha");
        v3Var.c(Float.valueOf(this.f128966d), "translationX");
        v3Var.c(Float.valueOf(this.f128967e), "translationY");
        v3Var.c(Float.valueOf(this.f128968f), "shadowElevation");
        v3Var.c(Float.valueOf(this.f128969g), "rotationX");
        v3Var.c(Float.valueOf(this.f128970h), "rotationY");
        v3Var.c(Float.valueOf(this.f128971i), "rotationZ");
        v3Var.c(Float.valueOf(this.f128972j), "cameraDistance");
        v3Var.c(z1.a(this.f128973k), "transformOrigin");
        v3Var.c(this.f128974l, "shape");
        v3Var.c(Boolean.valueOf(this.f128975m), "clip");
        v3Var.c(this.f128976n, "renderEffect");
        v3Var.c(d0.a(this.f128977o), "ambientShadowColor");
        v3Var.c(d0.a(this.f128978p), "spotShadowColor");
        v3Var.c(n0.a(this.f128979q), "compositingStrategy");
        v3Var.c(q.a(this.f128980r), "blendMode");
        v3Var.c(this.f128981t, "colorFilter");
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("GraphicsLayerElement(scaleX=");
        sb3.append(this.f128963a);
        sb3.append(", scaleY=");
        sb3.append(this.f128964b);
        sb3.append(", alpha=");
        sb3.append(this.f128965c);
        sb3.append(", translationX=");
        sb3.append(this.f128966d);
        sb3.append(", translationY=");
        sb3.append(this.f128967e);
        sb3.append(", shadowElevation=");
        sb3.append(this.f128968f);
        sb3.append(", rotationX=");
        sb3.append(this.f128969g);
        sb3.append(", rotationY=");
        sb3.append(this.f128970h);
        sb3.append(", rotationZ=");
        sb3.append(this.f128971i);
        sb3.append(", cameraDistance=");
        sb3.append(this.f128972j);
        sb3.append(", transformOrigin=");
        sb3.append((Object) z1.c(this.f128973k));
        sb3.append(", shape=");
        sb3.append(this.f128974l);
        sb3.append(", clip=");
        sb3.append(this.f128975m);
        sb3.append(", renderEffect=");
        sb3.append(this.f128976n);
        sb3.append(", ambientShadowColor=");
        q2.m(this.f128977o, ", spotShadowColor=", sb3);
        q2.m(this.f128978p, ", compositingStrategy=", sb3);
        sb3.append((Object) n0.b(this.f128979q));
        sb3.append(", blendMode=");
        sb3.append((Object) q.b(this.f128980r));
        sb3.append(", colorFilter=");
        sb3.append(this.f128981t);
        sb3.append(CoreConstants.RIGHT_PARENTHESIS_CHAR);
        return sb3.toString();
    }

    @Override // h5.x0
    public final void update(h4.r.c cVar) {
        h5.c1 c1Var;
        s1 s1Var = (s1) cVar;
        s1Var.f128983a = this.f128963a;
        s1Var.f128984b = this.f128964b;
        s1Var.f128985c = this.f128965c;
        s1Var.f128986d = this.f128966d;
        s1Var.f128987e = this.f128967e;
        s1Var.f128988f = this.f128968f;
        s1Var.f128989g = this.f128969g;
        s1Var.f128990h = this.f128970h;
        s1Var.f128991i = this.f128971i;
        s1Var.f128992j = this.f128972j;
        s1Var.f128993k = this.f128973k;
        s1Var.f128994l = this.f128974l;
        s1Var.f128995m = this.f128975m;
        s1Var.f128996n = this.f128976n;
        s1Var.f128997o = this.f128977o;
        s1Var.f128998p = this.f128978p;
        s1Var.f128999q = this.f128979q;
        s1Var.f129000r = this.f128980r;
        s1Var.f129001t = this.f128981t;
        s1.a aVar = s1Var.f129002v;
        if (s1Var.getNode().getIsAttached() && (c1Var = h5.k.e(s1Var, 2).f81714t) != null) {
            c1Var.k2(aVar, true);
        }
    }

    public /* synthetic */ r0(float f14, float f15, float f16, float f17, float f18, float f19, float f22, float f24, float f25, float f26, long j8, r1 r1Var, boolean z14, n1 n1Var, long j14, long j15, int i14, int i15, e0 e0Var, p005kotlin.jvm.internal.j jVar) {
        this(f14, f15, f16, f17, f18, f19, f22, f24, f25, f26, j8, r1Var, z14, n1Var, j14, j15, i14, i15, e0Var);
    }
}
