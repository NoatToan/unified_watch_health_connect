package r4;

import android.graphics.Outline;
import android.graphics.RectF;
import android.os.Build;
import java.util.Locale;
import o4.b1;
import o4.c0;
import o4.f1;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.w;
import p1.i1;
import p1.u0;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0006B\u0011\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Lr4/c;", "", "Lr4/d;", "impl", "<init>", "(Lr4/d;)V", "a", "ui-graphics"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d f150141a;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Outline f150146f;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public long f150148h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public long f150149i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public float f150150j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public b1 f150151k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public f1 f150152l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public o4.j f150153m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f150154n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public q4.a f150155o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public o4.h f150156p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f150157q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final r4.a f150158r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public boolean f150159s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public long f150160t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public long f150161u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public long f150162v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public boolean f150163w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public RectF f150164x;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public g6.c f150142b = q4.e.f142554a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public g6.o f150143c = g6.o.Ltr;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public e23.l<? super q4.f, Unit> f150144d = C2823c.f150166a;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final b f150145e = new b();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f150147g = true;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lq4/f;", "", "invoke", "(Lq4/f;)V", "<anonymous>"}, k = 3, mv = {2, 1, 0})
    public static final class b extends w implements e23.l<q4.f, Unit> {
        public b() {
            super(1);
        }

        @Override // e23.l
        public final Unit invoke(q4.f fVar) {
            q4.f fVar2 = fVar;
            c cVar = c.this;
            f1 f1Var = cVar.f150152l;
            if (cVar.f150154n && cVar.f150163w && f1Var != null) {
                c0.f128819b.getClass();
                int i14 = c0.f128820c;
                q4.a.b f142543b = fVar2.getF142543b();
                long jB = f142543b.b();
                f142543b.a().l();
                try {
                    f142543b.f142550a.d(f1Var, i14);
                    cVar.c(fVar2);
                } finally {
                    tn.k.p(f142543b, jB);
                }
            } else {
                cVar.c(fVar2);
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: r4.c$c, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lq4/f;", "", "invoke", "(Lq4/f;)V", "<anonymous>"}, k = 3, mv = {2, 1, 0})
    public static final class C2823c extends w implements e23.l<q4.f, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final C2823c f150166a = new C2823c();

        public C2823c() {
            super(1);
        }

        @Override // e23.l
        public final /* bridge */ /* synthetic */ Unit invoke(q4.f fVar) {
            return Unit.INSTANCE;
        }
    }

    static {
        new a(null);
        String lowerCase = Build.FINGERPRINT.toLowerCase(Locale.ROOT);
        lowerCase.getClass();
        if (lowerCase.equals("robolectric")) {
            j jVar = j.f150246a;
        } else {
            k kVar = k.f150247a;
        }
    }

    public c(d dVar) {
        this.f150141a = dVar;
        n4.c.f123541b.getClass();
        this.f150148h = 0L;
        n4.g.f123559b.getClass();
        this.f150149i = n4.g.f123560c;
        this.f150158r = new r4.a();
        dVar.g(false);
        g6.k.f76003b.getClass();
        this.f150160t = 0L;
        g6.m.f76012b.getClass();
        this.f150161u = 0L;
        this.f150162v = n4.c.f123543d;
    }

    public final void a() {
        Outline outline;
        if (this.f150147g) {
            boolean z14 = this.f150163w;
            Outline outline2 = null;
            d dVar = this.f150141a;
            if (z14 || dVar.u() > 0.0f) {
                f1 f1Var = this.f150152l;
                if (f1Var != null) {
                    RectF rectF = this.f150164x;
                    if (rectF == null) {
                        rectF = new RectF();
                        this.f150164x = rectF;
                    }
                    boolean z15 = f1Var instanceof o4.j;
                    if (!z15) {
                        org.apache.commons.lang3.e.w("Unable to obtain android.graphics.Path");
                        return;
                    }
                    ((o4.j) f1Var).f128869b.computeBounds(rectF, false);
                    int i14 = Build.VERSION.SDK_INT;
                    if (i14 > 28 || f1Var.h()) {
                        outline = this.f150146f;
                        if (outline == null) {
                            outline = new Outline();
                            this.f150146f = outline;
                        }
                        if (i14 >= 30) {
                            m.f150249a.getClass();
                            if (!z15) {
                                org.apache.commons.lang3.e.w("Unable to obtain android.graphics.Path");
                                return;
                            }
                            outline.setPath(((o4.j) f1Var).f128869b);
                        } else {
                            if (!z15) {
                                org.apache.commons.lang3.e.w("Unable to obtain android.graphics.Path");
                                return;
                            }
                            outline.setConvexPath(((o4.j) f1Var).f128869b);
                        }
                        this.f150154n = !outline.canClip();
                    } else {
                        Outline outline3 = this.f150146f;
                        if (outline3 != null) {
                            outline3.setEmpty();
                        }
                        this.f150154n = true;
                        dVar.getClass();
                        outline = null;
                    }
                    this.f150152l = f1Var;
                    if (outline != null) {
                        outline.setAlpha(dVar.a());
                        outline2 = outline;
                    }
                    long jRound = (4294967295L & ((long) Math.round(rectF.height()))) | (((long) Math.round(rectF.width())) << 32);
                    g6.m.a aVar = g6.m.f76012b;
                    dVar.o(outline2, jRound);
                    if (this.f150154n && this.f150163w) {
                        dVar.g(false);
                        dVar.z();
                    } else {
                        dVar.g(this.f150163w);
                    }
                } else {
                    dVar.g(this.f150163w);
                    n4.g.f123559b.getClass();
                    Outline outline4 = this.f150146f;
                    if (outline4 == null) {
                        outline4 = new Outline();
                        this.f150146f = outline4;
                    }
                    Outline outline5 = outline4;
                    long jC = g6.n.c(this.f150161u);
                    long j8 = this.f150148h;
                    long j14 = this.f150149i;
                    if (j14 != 9205357640488583168L) {
                        jC = j14;
                    }
                    int i15 = (int) (j8 >> 32);
                    int i16 = (int) (j8 & 4294967295L);
                    int i17 = (int) (jC >> 32);
                    int i18 = (int) (jC & 4294967295L);
                    outline5.setRoundRect(Math.round(Float.intBitsToFloat(i15)), Math.round(Float.intBitsToFloat(i16)), Math.round(Float.intBitsToFloat(i17) + Float.intBitsToFloat(i15)), Math.round(Float.intBitsToFloat(i18) + Float.intBitsToFloat(i16)), this.f150150j);
                    outline5.setAlpha(dVar.a());
                    long jRound2 = (4294967295L & ((long) Math.round(Float.intBitsToFloat(i18)))) | (((long) Math.round(Float.intBitsToFloat(i17))) << 32);
                    g6.m.a aVar2 = g6.m.f76012b;
                    dVar.o(outline5, jRound2);
                }
            } else {
                dVar.g(false);
                g6.m.f76012b.getClass();
                dVar.o(null, 0L);
            }
        }
        this.f150147g = false;
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0064 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:24:0x0066 A[LOOP:0: B:14:0x0029->B:24:0x0066, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:29:0x0069 A[EDGE_INSN: B:29:0x0069->B:25:0x0069 BREAK  A[LOOP:0: B:14:0x0029->B:24:0x0066], SYNTHETIC] */
    public final void b() {
        if (this.f150159s && this.f150157q == 0) {
            r4.a aVar = this.f150158r;
            c cVar = aVar.f150132a;
            if (cVar != null) {
                cVar.f150157q--;
                cVar.b();
                aVar.f150132a = null;
            }
            u0<c> u0Var = aVar.f150134c;
            if (u0Var != null) {
                Object[] objArr = u0Var.f134733b;
                long[] jArr = u0Var.f134732a;
                int length = jArr.length - 2;
                if (length >= 0) {
                    int i14 = 0;
                    while (true) {
                        long j8 = jArr[i14];
                        if ((((~j8) << 7) & j8 & (-9187201950435737472L)) == -9187201950435737472L) {
                            if (i14 != length) {
                                break;
                                break;
                            }
                            i14++;
                        } else {
                            int i15 = 8 - ((~(i14 - length)) >>> 31);
                            for (int i16 = 0; i16 < i15; i16++) {
                                if ((255 & j8) < 128) {
                                    c cVar2 = (c) objArr[(i14 << 3) + i16];
                                    cVar2.f150157q--;
                                    cVar2.b();
                                }
                                j8 >>= 8;
                            }
                            if (i15 != 8) {
                                break;
                            } else if (i14 != length) {
                                break;
                            } else {
                                i14++;
                            }
                        }
                    }
                }
                u0Var.e();
            }
            this.f150141a.z();
        }
    }

    /* JADX WARN: Code duplicated, block: B:29:0x0087 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:30:0x0089 A[LOOP:0: B:20:0x004c->B:30:0x0089, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:34:0x008c A[EDGE_INSN: B:34:0x008c->B:31:0x008c BREAK  A[LOOP:0: B:20:0x004c->B:30:0x0089], SYNTHETIC] */
    public final void c(q4.f fVar) {
        r4.a aVar = this.f150158r;
        aVar.f150133b = aVar.f150132a;
        u0<c> u0Var = aVar.f150134c;
        if (u0Var != null && u0Var.c()) {
            u0<c> u0VarA = aVar.f150135d;
            if (u0VarA == null) {
                u0VarA = i1.a();
                aVar.f150135d = u0VarA;
            }
            u0VarA.k(u0Var);
            u0Var.e();
        }
        aVar.f150136e = true;
        this.f150144d.invoke(fVar);
        aVar.f150136e = false;
        c cVar = aVar.f150133b;
        if (cVar != null) {
            cVar.f150157q--;
            cVar.b();
        }
        u0<c> u0Var2 = aVar.f150135d;
        if (u0Var2 == null || !u0Var2.c()) {
            return;
        }
        Object[] objArr = u0Var2.f134733b;
        long[] jArr = u0Var2.f134732a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i14 = 0;
            while (true) {
                long j8 = jArr[i14];
                if ((((~j8) << 7) & j8 & (-9187201950435737472L)) == -9187201950435737472L) {
                    if (i14 != length) {
                        break;
                        break;
                    }
                    i14++;
                } else {
                    int i15 = 8 - ((~(i14 - length)) >>> 31);
                    for (int i16 = 0; i16 < i15; i16++) {
                        if ((255 & j8) < 128) {
                            c cVar2 = (c) objArr[(i14 << 3) + i16];
                            cVar2.f150157q--;
                            cVar2.b();
                        }
                        j8 >>= 8;
                    }
                    if (i15 != 8) {
                        break;
                    } else if (i14 != length) {
                        break;
                    } else {
                        i14++;
                    }
                }
            }
        }
        u0Var2.e();
    }

    public final b1 d() {
        b1 bVar;
        b1 b1Var = this.f150151k;
        f1 f1Var = this.f150152l;
        if (b1Var != null) {
            return b1Var;
        }
        if (f1Var != null) {
            b1.a aVar = new b1.a(f1Var);
            this.f150151k = aVar;
            return aVar;
        }
        long jC = g6.n.c(this.f150161u);
        long j8 = this.f150148h;
        long j14 = this.f150149i;
        if (j14 != 9205357640488583168L) {
            jC = j14;
        }
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j8 >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j8 & 4294967295L));
        float fIntBitsToFloat3 = Float.intBitsToFloat((int) (jC >> 32)) + fIntBitsToFloat;
        float fIntBitsToFloat4 = Float.intBitsToFloat((int) (jC & 4294967295L)) + fIntBitsToFloat2;
        float f14 = this.f150150j;
        if (f14 > 0.0f) {
            long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(f14)) << 32) | (4294967295L & ((long) Float.floatToRawIntBits(f14)));
            n4.a.C2318a c2318a = n4.a.f123535b;
            bVar = new b1.c(n4.f.c(fIntBitsToFloat, fIntBitsToFloat2, fIntBitsToFloat3, fIntBitsToFloat4, jFloatToRawIntBits));
        } else {
            bVar = new b1.b(new n4.d(fIntBitsToFloat, fIntBitsToFloat2, fIntBitsToFloat3, fIntBitsToFloat4));
        }
        this.f150151k = bVar;
        return bVar;
    }

    public final void e() {
        this.f150151k = null;
        this.f150152l = null;
        n4.g.f123559b.getClass();
        this.f150149i = n4.g.f123560c;
        n4.c.f123541b.getClass();
        this.f150148h = 0L;
        this.f150150j = 0.0f;
        this.f150147g = true;
        this.f150154n = false;
    }

    public final void f(float f14) {
        d dVar = this.f150141a;
        if (dVar.a() == f14) {
            return;
        }
        dVar.c(f14);
    }

    public final void g(long j8, long j14, float f14) {
        if (n4.c.d(this.f150148h, j8) && n4.g.c(this.f150149i, j14) && this.f150150j == f14 && this.f150152l == null) {
            return;
        }
        e();
        this.f150148h = j8;
        this.f150149i = j14;
        this.f150150j = f14;
        a();
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lr4/c$a;", "", "<init>", "()V", "", "isRobolectric", "Z", "SnapshotImpl", "Ljava/lang/Object;", "ui-graphics"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
