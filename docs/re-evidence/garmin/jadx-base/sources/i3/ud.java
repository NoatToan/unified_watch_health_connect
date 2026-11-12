package i3;

import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0001\rB=\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0003\u0010\u0005\u001a\u00020\u0004\u0012\u0010\b\u0002\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006\u0012\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\t¢\u0006\u0004\b\u000b\u0010\f¨\u0006\u000e"}, d2 = {"Li3/ud;", "Ly1/d1;", "", "value", "", "steps", "Lkotlin/Function0;", "", "onValueChangeFinished", "Lj23/f;", "valueRange", "<init>", "(FILe23/a;Lj23/f;)V", "a", "material3"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class ud implements p008y1.d1 {

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final int f89909t;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f89910a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public e23.a<Unit> f89911b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final j23.f<Float> f89912c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final p3.z1 f89913d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public e23.l<? super Float, Unit> f89914e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f89915f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final float[] f89916g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final p3.a2 f89917h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final p3.a2 f89918i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f89919j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final p3.a2 f89920k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final p3.a2 f89921l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final p008y1.b2 f89922m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final p3.c2 f89923n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final f2 f89924o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final p3.z1 f89925p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final p3.z1 f89926q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final b f89927r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final u1.l1 f89928s;

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"i3/ud$b", "Ly1/v0;", "material3"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class b implements p008y1.v0 {
        public b() {
        }

        @Override // p008y1.v0
        public final void a(float f14) {
            ud.this.b(f14);
        }
    }

    static {
        new a(null);
        f89909t = 8;
    }

    public ud(float f14, int i14, e23.a<Unit> aVar, j23.f<Float> fVar) {
        float[] fArr;
        this.f89910a = i14;
        this.f89911b = aVar;
        this.f89912c = fVar;
        this.f89913d = new p3.z1(f14);
        this.f89915f = true;
        float f15 = kd.f88704a;
        if (i14 == 0) {
            fArr = new float[0];
        } else {
            int i15 = i14 + 2;
            float[] fArr2 = new float[i15];
            for (int i16 = 0; i16 < i15; i16++) {
                fArr2[i16] = i16 / (i14 + 1);
            }
            fArr = fArr2;
        }
        this.f89916g = fArr;
        this.f89917h = new p3.a2(0);
        this.f89918i = new p3.a2(0);
        this.f89920k = new p3.a2(0);
        this.f89921l = new p3.a2(0);
        this.f89922m = p008y1.b2.Horizontal;
        this.f89923n = p3.p0.n(Boolean.FALSE);
        this.f89924o = new f2(this, 3);
        this.f89925p = new p3.z1(kd.m(fVar.getStart().floatValue(), fVar.b().floatValue(), f14, 0.0f, 0.0f));
        this.f89926q = new p3.z1(0.0f);
        this.f89927r = new b();
        this.f89928s = new u1.l1();
    }

    @Override // p008y1.d1
    public final Object a(u1.k1 k1Var, p008y1.b1 b1Var, y1.p0.b bVar) {
        Object objE = o53.c0.e(new vd(this, k1Var, b1Var, null), bVar);
        return objE == u13.a.COROUTINE_SUSPENDED ? objE : Unit.INSTANCE;
    }

    public final void b(float f14) {
        float fMax;
        float fMin;
        if (this.f89922m == p008y1.b2.Vertical) {
            float intValue = this.f89918i.getIntValue();
            p3.a2 a2Var = this.f89921l;
            fMax = Math.max(intValue - (a2Var.getIntValue() / 2.0f), 0.0f);
            fMin = Math.min(a2Var.getIntValue() / 2.0f, fMax);
        } else {
            float intValue2 = this.f89917h.getIntValue();
            p3.a2 a2Var2 = this.f89920k;
            fMax = Math.max(intValue2 - (a2Var2.getIntValue() / 2.0f), 0.0f);
            fMin = Math.min(a2Var2.getIntValue() / 2.0f, fMax);
        }
        p3.z1 z1Var = this.f89925p;
        float floatValue = z1Var.getFloatValue() + f14;
        p3.z1 z1Var2 = this.f89926q;
        z1Var.i(z1Var2.getFloatValue() + floatValue);
        z1Var2.i(0.0f);
        float fJ = kd.j(z1Var.getFloatValue(), this.f89916g, fMin, fMax);
        j23.f<Float> fVar = this.f89912c;
        float fM = kd.m(fMin, fMax, fJ, fVar.getStart().floatValue(), fVar.b().floatValue());
        if (fM == this.f89913d.getFloatValue()) {
            return;
        }
        e23.l<? super Float, Unit> lVar = this.f89914e;
        if (lVar != null) {
            lVar.invoke(Float.valueOf(fM));
        } else {
            d(fM);
        }
    }

    public final float c() {
        j23.f<Float> fVar = this.f89912c;
        return kd.k(fVar.getStart().floatValue(), fVar.b().floatValue(), j23.t.d(this.f89913d.getFloatValue(), fVar.getStart().floatValue(), fVar.b().floatValue()));
    }

    public final void d(float f14) {
        if (this.f89915f) {
            j23.f<Float> fVar = this.f89912c;
            f14 = kd.j(j23.t.d(f14, fVar.getStart().floatValue(), fVar.b().floatValue()), this.f89916g, fVar.getStart().floatValue(), fVar.b().floatValue());
        }
        this.f89913d.i(f14);
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Li3/ud$a;", "", "<init>", "()V", "material3"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }

    public ud(float f14, int i14, e23.a aVar, j23.f fVar, int i15, p005kotlin.jvm.internal.j jVar) {
        this((i15 & 1) != 0 ? 0.0f : f14, (i15 & 2) != 0 ? 0 : i14, (i15 & 4) != 0 ? null : aVar, (i15 & 8) != 0 ? new j23.e(0.0f, 1.0f) : fVar);
    }

    public ud() {
        this(0.0f, 0, null, null, 15, null);
    }
}
