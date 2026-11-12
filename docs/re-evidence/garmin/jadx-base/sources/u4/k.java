package u4;

import android.graphics.Bitmap;
import o4.d0;
import o4.e0;
import o4.l1;
import o4.r;
import o4.w0;
import o4.x0;
import o4.y;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.w;
import p13.j0;
import p3.c2;
import p3.p0;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lu4/k;", "Lu4/j;", "Lu4/c;", "root", "<init>", "(Lu4/c;)V", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class k extends j {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final u4.c f168493b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f168494c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f168495d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final u4.a f168496e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public e23.a<Unit> f168497f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final c2 f168498g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public r f168499h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final c2 f168500i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public long f168501j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public float f168502k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public float f168503l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final b f168504m;

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lu4/j;", "it", "", "invoke", "(Lu4/j;)V", "<anonymous>"}, k = 3, mv = {2, 1, 0})
    public static final class a extends w implements e23.l<j, Unit> {
        public a() {
            super(1);
        }

        @Override // e23.l
        public final Unit invoke(j jVar) {
            k kVar = k.this;
            kVar.f168495d = true;
            kVar.f168497f.invoke();
            return Unit.INSTANCE;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lq4/f;", "", "invoke", "(Lq4/f;)V", "<anonymous>"}, k = 3, mv = {2, 1, 0})
    public static final class b extends w implements e23.l<q4.f, Unit> {
        public b() {
            super(1);
        }

        @Override // e23.l
        public final Unit invoke(q4.f fVar) {
            q4.f fVar2 = fVar;
            k kVar = k.this;
            u4.c cVar = kVar.f168493b;
            float f14 = kVar.f168502k;
            float f15 = kVar.f168503l;
            n4.c.f123541b.getClass();
            q4.a.b f142543b = fVar2.getF142543b();
            long jB = f142543b.b();
            f142543b.a().l();
            try {
                f142543b.f142550a.g(f14, f15, 0L);
                cVar.a(fVar2);
                return Unit.INSTANCE;
            } finally {
                tn.k.p(f142543b, jB);
            }
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class c extends w implements e23.a<Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final c f168507a = new c();

        public c() {
            super(0);
        }

        @Override // e23.a
        public final /* bridge */ /* synthetic */ Unit invoke() {
            return Unit.INSTANCE;
        }
    }

    public k(u4.c cVar) {
        super(null);
        this.f168493b = cVar;
        cVar.f168361i = new a();
        this.f168494c = "";
        this.f168495d = true;
        this.f168496e = new u4.a();
        this.f168497f = c.f168507a;
        this.f168498g = p0.n(null);
        n4.g.f123559b.getClass();
        this.f168500i = p0.n(n4.g.a(0L));
        this.f168501j = n4.g.f123560c;
        this.f168502k = 1.0f;
        this.f168503l = 1.0f;
        this.f168504m = new b();
    }

    @Override // u4.j
    public final void a(q4.f fVar) {
        e(fVar, 1.0f, null);
    }

    /* JADX WARN: Code duplicated, block: B:22:0x005b  */
    /* JADX WARN: Code duplicated, block: B:24:0x0064  */
    /* JADX WARN: Code duplicated, block: B:27:0x0075  */
    /* JADX WARN: Code duplicated, block: B:29:0x0080  */
    /* JADX WARN: Code duplicated, block: B:32:0x00f8  */
    /* JADX WARN: Code duplicated, block: B:34:0x00fc  */
    /* JADX WARN: Code duplicated, block: B:41:0x0114  */
    /* JADX WARN: Multi-variable type inference failed */
    public final void e(q4.f fVar, float f14, e0 e0Var) {
        int i14;
        r rVarA;
        long jCeil;
        o4.f fVarA;
        o4.c cVarA;
        long j8;
        Bitmap bitmap;
        long jC;
        e0 e0Var2;
        int iB;
        u4.c cVar = this.f168493b;
        boolean z14 = cVar.f168356d;
        c2 c2Var = this.f168498g;
        if (z14 && cVar.f168357e != 16 && m.a((e0) c2Var.getF182175a()) && m.a(e0Var)) {
            w0.f129024b.getClass();
            i14 = w0.f129025c;
        } else {
            w0.f129024b.getClass();
            i14 = 0;
        }
        boolean z15 = this.f168495d;
        u4.a aVar = this.f168496e;
        if (z15 || !n4.g.c(this.f168501j, fVar.b())) {
            w0.f129024b.getClass();
            if (i14 == w0.f129025c) {
                e0.a aVar2 = e0.f128843b;
                jC = cVar.f168357e;
                j0 j0Var = m.f168519a;
                if (d0.e(jC) != 1.0f) {
                    jC = d0.c(1.0f, jC, 14);
                }
                rVarA = e0.a.a(aVar2, jC);
            } else {
                rVarA = null;
            }
            this.f168499h = rVarA;
            float fIntBitsToFloat = Float.intBitsToFloat((int) (fVar.b() >> 32));
            c2 c2Var2 = this.f168500i;
            this.f168502k = fIntBitsToFloat / Float.intBitsToFloat((int) (((n4.g) c2Var2.getF182175a()).f123561a >> 32));
            this.f168503l = Float.intBitsToFloat((int) (fVar.b() & 4294967295L)) / Float.intBitsToFloat((int) (((n4.g) c2Var2.getF182175a()).f123561a & 4294967295L));
            jCeil = (((long) ((int) Math.ceil(Float.intBitsToFloat((int) (fVar.b() >> 32))))) << 32) | (((long) ((int) Math.ceil(Float.intBitsToFloat((int) (fVar.b() & 4294967295L))))) & 4294967295L);
            g6.m.a aVar3 = g6.m.f76012b;
            g6.o layoutDirection = fVar.getLayoutDirection();
            aVar.f168348c = fVar;
            fVarA = aVar.f168346a;
            cVarA = aVar.f168347b;
            if (fVarA != null) {
                bitmap = fVarA.f128848b;
                if (cVarA != null) {
                    j8 = 4294967295L;
                    if (((int) (jCeil >> 32)) <= bitmap.getWidth() || ((int) (jCeil & 4294967295L)) > bitmap.getHeight() || aVar.f168350e != i14) {
                    }
                } else {
                    j8 = 4294967295L;
                }
                fVarA = x0.a((int) (jCeil >> 32), (int) (jCeil & j8), i14, 24);
                cVarA = l1.a(fVarA);
                aVar.f168346a = fVarA;
                aVar.f168347b = cVarA;
                aVar.f168350e = i14;
            } else {
                j8 = 4294967295L;
                fVarA = x0.a((int) (jCeil >> 32), (int) (jCeil & j8), i14, 24);
                cVarA = l1.a(fVarA);
                aVar.f168346a = fVarA;
                aVar.f168347b = cVarA;
                aVar.f168350e = i14;
            }
            aVar.f168349d = jCeil;
            q4.a aVar4 = aVar.f168351f;
            long jC2 = g6.n.c(jCeil);
            q4.a.C2680a c2680a = aVar4.f142542a;
            g6.c cVar2 = c2680a.f142546a;
            g6.o oVar = c2680a.f142547b;
            y yVar = c2680a.f142548c;
            long j14 = c2680a.f142549d;
            c2680a.f142546a = fVar;
            c2680a.f142547b = layoutDirection;
            c2680a.f142548c = cVarA;
            c2680a.f142549d = jC2;
            cVarA.l();
            d0.f128823b.getClass();
            long j15 = d0.f128824c;
            o4.q.f128930b.getClass();
            q4.f.A0(aVar4, j15, 0L, 0L, 0.0f, null, null, 62);
            this.f168504m.invoke(aVar4);
            cVarA.i();
            q4.a.C2680a c2680a2 = aVar4.f142542a;
            c2680a2.f142546a = cVar2;
            c2680a2.f142547b = oVar;
            c2680a2.f142548c = yVar;
            c2680a2.f142549d = j14;
            fVarA.a();
            this.f168495d = false;
            this.f168501j = fVar.b();
        } else {
            o4.f fVar2 = aVar.f168346a;
            if (fVar2 != null) {
                iB = fVar2.b();
            } else {
                w0.f129024b.getClass();
                iB = 0;
            }
            if (i14 != iB) {
                w0.f129024b.getClass();
                if (i14 == w0.f129025c) {
                    e0.a aVar5 = e0.f128843b;
                    jC = cVar.f168357e;
                    j0 j0Var2 = m.f168519a;
                    if (d0.e(jC) != 1.0f) {
                        jC = d0.c(1.0f, jC, 14);
                    }
                    rVarA = e0.a.a(aVar5, jC);
                } else {
                    rVarA = null;
                }
                this.f168499h = rVarA;
                float fIntBitsToFloat2 = Float.intBitsToFloat((int) (fVar.b() >> 32));
                c2 c2Var3 = this.f168500i;
                this.f168502k = fIntBitsToFloat2 / Float.intBitsToFloat((int) (((n4.g) c2Var3.getF182175a()).f123561a >> 32));
                this.f168503l = Float.intBitsToFloat((int) (fVar.b() & 4294967295L)) / Float.intBitsToFloat((int) (((n4.g) c2Var3.getF182175a()).f123561a & 4294967295L));
                jCeil = (((long) ((int) Math.ceil(Float.intBitsToFloat((int) (fVar.b() >> 32))))) << 32) | (((long) ((int) Math.ceil(Float.intBitsToFloat((int) (fVar.b() & 4294967295L))))) & 4294967295L);
                g6.m.a aVar6 = g6.m.f76012b;
                g6.o layoutDirection2 = fVar.getLayoutDirection();
                aVar.f168348c = fVar;
                fVarA = aVar.f168346a;
                cVarA = aVar.f168347b;
                if (fVarA != null) {
                    bitmap = fVarA.f128848b;
                    if (cVarA != null) {
                        j8 = 4294967295L;
                        if (((int) (jCeil >> 32)) <= bitmap.getWidth()) {
                        }
                    } else {
                        j8 = 4294967295L;
                    }
                    fVarA = x0.a((int) (jCeil >> 32), (int) (jCeil & j8), i14, 24);
                    cVarA = l1.a(fVarA);
                    aVar.f168346a = fVarA;
                    aVar.f168347b = cVarA;
                    aVar.f168350e = i14;
                } else {
                    j8 = 4294967295L;
                    fVarA = x0.a((int) (jCeil >> 32), (int) (jCeil & j8), i14, 24);
                    cVarA = l1.a(fVarA);
                    aVar.f168346a = fVarA;
                    aVar.f168347b = cVarA;
                    aVar.f168350e = i14;
                }
                aVar.f168349d = jCeil;
                q4.a aVar7 = aVar.f168351f;
                long jC3 = g6.n.c(jCeil);
                q4.a.C2680a c2680a3 = aVar7.f142542a;
                g6.c cVar3 = c2680a3.f142546a;
                g6.o oVar2 = c2680a3.f142547b;
                y yVar2 = c2680a3.f142548c;
                long j16 = c2680a3.f142549d;
                c2680a3.f142546a = fVar;
                c2680a3.f142547b = layoutDirection2;
                c2680a3.f142548c = cVarA;
                c2680a3.f142549d = jC3;
                cVarA.l();
                d0.f128823b.getClass();
                long j17 = d0.f128824c;
                o4.q.f128930b.getClass();
                q4.f.A0(aVar7, j17, 0L, 0L, 0.0f, null, null, 62);
                this.f168504m.invoke(aVar7);
                cVarA.i();
                q4.a.C2680a c2680a4 = aVar7.f142542a;
                c2680a4.f142546a = cVar3;
                c2680a4.f142547b = oVar2;
                c2680a4.f142548c = yVar2;
                c2680a4.f142549d = j16;
                fVarA.a();
                this.f168495d = false;
                this.f168501j = fVar.b();
            }
        }
        if (e0Var != null) {
            e0Var2 = e0Var;
        } else {
            e0Var2 = ((e0) c2Var.getF182175a()) != null ? (e0) c2Var.getF182175a() : this.f168499h;
        }
        o4.f fVar3 = aVar.f168346a;
        if (fVar3 == null) {
            e5.a.b("drawCachedImage must be invoked first before attempting to draw the result into another destination");
        }
        q4.f.B0(fVar, fVar3, 0L, aVar.f168349d, 0L, 0L, f14, null, e0Var2, 0, 0, 858);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final String toString() {
        StringBuilder sb3 = new StringBuilder("Params: \tname: ");
        sb3.append(this.f168494c);
        sb3.append("\n\tviewportWidth: ");
        c2 c2Var = this.f168500i;
        sb3.append(Float.intBitsToFloat((int) (((n4.g) c2Var.getF182175a()).f123561a >> 32)));
        sb3.append("\n\tviewportHeight: ");
        sb3.append(Float.intBitsToFloat((int) (((n4.g) c2Var.getF182175a()).f123561a & 4294967295L)));
        sb3.append("\n");
        return sb3.toString();
    }
}
