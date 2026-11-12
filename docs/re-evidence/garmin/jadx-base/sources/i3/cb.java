package i3;

import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0001\u000eBG\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0003\u0010\u0006\u001a\u00020\u0005\u0012\u0010\b\u0002\u0010\t\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007\u0012\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00020\n¢\u0006\u0004\b\f\u0010\r¨\u0006\u000f"}, d2 = {"Li3/cb;", "", "", "activeRangeStart", "activeRangeEnd", "", "steps", "Lkotlin/Function0;", "", "onValueChangeFinished", "Lj23/f;", "valueRange", "<init>", "(FFILe23/a;Lj23/f;)V", "a", "material3"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class cb {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f87740a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public e23.a<Unit> f87741b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final j23.f<Float> f87742c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final p3.z1 f87743d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final p3.z1 f87744e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public e23.l<? super td, Unit> f87745f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final float[] f87746g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final p3.z1 f87747h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final p3.z1 f87748i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final p3.z1 f87749j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final p3.z1 f87750k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final p3.a2 f87751l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final p3.z1 f87752m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final p3.z1 f87753n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final p3.c2 f87754o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final p3.c2 f87755p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final bb f87756q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final p3.z1 f87757r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final p3.z1 f87758s;

    static {
        new a(null);
    }

    public cb(float f14, float f15, int i14, e23.a<Unit> aVar, j23.f<Float> fVar) {
        float[] fArr;
        this.f87740a = i14;
        this.f87741b = aVar;
        this.f87742c = fVar;
        this.f87743d = new p3.z1(f14);
        this.f87744e = new p3.z1(f15);
        float f16 = kd.f88704a;
        int i15 = 0;
        if (i14 == 0) {
            fArr = new float[0];
        } else {
            int i16 = i14 + 2;
            float[] fArr2 = new float[i16];
            for (int i17 = 0; i17 < i16; i17++) {
                fArr2[i17] = i17 / (i14 + 1);
            }
            fArr = fArr2;
        }
        this.f87746g = fArr;
        this.f87747h = new p3.z1(0.0f);
        this.f87748i = new p3.z1(0.0f);
        this.f87749j = new p3.z1(0.0f);
        this.f87750k = new p3.z1(0.0f);
        this.f87751l = new p3.a2(0);
        this.f87752m = new p3.z1(0.0f);
        this.f87753n = new p3.z1(0.0f);
        Boolean bool = Boolean.FALSE;
        this.f87754o = p3.p0.n(bool);
        this.f87755p = p3.p0.n(bool);
        this.f87756q = new bb(this, i15);
        this.f87757r = new p3.z1(0.0f);
        this.f87758s = new p3.z1(0.0f);
    }

    public final float a() {
        j23.f<Float> fVar = this.f87742c;
        return kd.k(fVar.getStart().floatValue(), fVar.b().floatValue(), this.f87744e.getFloatValue());
    }

    public final float b() {
        j23.f<Float> fVar = this.f87742c;
        return kd.k(fVar.getStart().floatValue(), fVar.b().floatValue(), this.f87743d.getFloatValue());
    }

    public final int c() {
        return (int) Math.floor((1.0f - b()) * this.f87740a);
    }

    public final int d() {
        return (int) Math.floor(a() * this.f87740a);
    }

    public final void e(float f14, boolean z14) {
        long jH;
        long jH2;
        p3.z1 z1Var = this.f87743d;
        p3.z1 z1Var2 = this.f87744e;
        float[] fArr = this.f87746g;
        p3.z1 z1Var3 = this.f87753n;
        p3.z1 z1Var4 = this.f87752m;
        p3.z1 z1Var5 = this.f87757r;
        p3.z1 z1Var6 = this.f87758s;
        if (z14) {
            z1Var4.i(z1Var4.getFloatValue() + f14);
            z1Var3.i(f(z1Var6.getFloatValue(), z1Var5.getFloatValue(), z1Var2.getFloatValue()));
            float floatValue = z1Var3.getFloatValue();
            float fJ = kd.j(j23.t.d(z1Var4.getFloatValue(), z1Var6.getFloatValue(), floatValue), fArr, z1Var6.getFloatValue(), z1Var5.getFloatValue());
            if (fJ > floatValue) {
                fJ = floatValue;
            }
            jH = kd.h(fJ, floatValue);
        } else {
            z1Var3.i(z1Var3.getFloatValue() + f14);
            z1Var4.i(f(z1Var6.getFloatValue(), z1Var5.getFloatValue(), z1Var.getFloatValue()));
            float floatValue2 = z1Var4.getFloatValue();
            float fJ2 = kd.j(j23.t.d(z1Var3.getFloatValue(), floatValue2, z1Var5.getFloatValue()), fArr, z1Var6.getFloatValue(), z1Var5.getFloatValue());
            if (fJ2 < floatValue2) {
                fJ2 = floatValue2;
            }
            jH = kd.h(floatValue2, fJ2);
        }
        float floatValue3 = z1Var6.getFloatValue();
        float floatValue4 = z1Var5.getFloatValue();
        j23.f<Float> fVar = this.f87742c;
        float fFloatValue = fVar.getStart().floatValue();
        float fFloatValue2 = fVar.b().floatValue();
        float fM = kd.m(floatValue3, floatValue4, td.c(jH), fFloatValue, fFloatValue2);
        float fM2 = kd.m(floatValue3, floatValue4, td.b(jH), fFloatValue, fFloatValue2);
        if (z14) {
            if (fM > fM2) {
                fM = fM2;
            }
            jH2 = kd.h(fM, fM2);
        } else {
            if (fM2 < fM) {
                fM2 = fM;
            }
            jH2 = kd.h(fM, fM2);
        }
        if (jH2 == kd.h(z1Var.getFloatValue(), z1Var2.getFloatValue())) {
            return;
        }
        e23.l<? super td, Unit> lVar = this.f87745f;
        if (lVar != null) {
            lVar.invoke(td.a(jH2));
        } else {
            h(td.c(jH2));
            g(td.b(jH2));
        }
    }

    public final float f(float f14, float f15, float f16) {
        j23.f<Float> fVar = this.f87742c;
        return kd.m(fVar.getStart().floatValue(), fVar.b().floatValue(), f16, f14, f15);
    }

    public final void g(float f14) {
        float floatValue = this.f87743d.getFloatValue();
        j23.f<Float> fVar = this.f87742c;
        this.f87744e.i(kd.j(j23.t.d(f14, floatValue, fVar.b().floatValue()), this.f87746g, fVar.getStart().floatValue(), fVar.b().floatValue()));
    }

    public final void h(float f14) {
        j23.f<Float> fVar = this.f87742c;
        this.f87743d.i(kd.j(j23.t.d(f14, fVar.getStart().floatValue(), this.f87744e.getFloatValue()), this.f87746g, fVar.getStart().floatValue(), fVar.b().floatValue()));
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Li3/cb$a;", "", "<init>", "()V", "material3"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }

    public cb(float f14, float f15, int i14, e23.a aVar, j23.f fVar, int i15, p005kotlin.jvm.internal.j jVar) {
        this((i15 & 1) != 0 ? 0.0f : f14, (i15 & 2) != 0 ? 1.0f : f15, (i15 & 4) != 0 ? 0 : i14, (i15 & 8) != 0 ? null : aVar, (i15 & 16) != 0 ? new j23.e(0.0f, 1.0f) : fVar);
    }

    public cb() {
        this(0.0f, 0.0f, 0, null, null, 31, null);
    }
}
