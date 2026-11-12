package q5;

import com.google.android.exoplayer2.text.ttml.TtmlNode;
import e23.l;
import h5.a1;
import h5.c1;
import h5.e0;
import h5.j;
import h5.k;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p1.i0;
import p1.o;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lq5/g;", "", "<init>", "()V", "a", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class g {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public a f142851b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f142853d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public long f142854e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public long f142855f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public float[] f142856g;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final i0<a> f142850a = o.a();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long f142852c = -1;

    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0086\u0004\u0018\u00002\u00020\u0001B;\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\t¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lq5/g$a;", "", "", TtmlNode.ATTR_ID, "", "throttleMillis", "debounceMillis", "Lh5/j;", "node", "Lkotlin/Function1;", "Lq5/f;", "", "callback", "<init>", "(Lq5/g;IJJLh5/j;Le23/l;)V", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f142857a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final long f142858b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final long f142859c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final j f142860d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final l<f, Unit> f142861e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public a f142862f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public long f142863g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public long f142864h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public long f142865i = Long.MIN_VALUE;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public long f142866j = -1;

        /* JADX WARN: Multi-variable type inference failed */
        public a(int i14, long j8, long j14, j jVar, l<? super f, Unit> lVar) {
            this.f142857a = i14;
            this.f142858b = j8;
            this.f142859c = j14;
            this.f142860d = jVar;
            this.f142861e = lVar;
        }

        public final void a(long j8, long j14, long j15, long j16, float[] fArr) {
            f fVar;
            f fVar2;
            long j17 = g.this.f142855f;
            j jVar = this.f142860d;
            c1 c1VarE = k.e(jVar, 2);
            e0 e0VarG = k.g(jVar);
            boolean zG = e0VarG.g();
            a1 a1Var = e0VarG.P;
            if (zG) {
                if (a1Var.f81683d != c1VarE) {
                    g6.k.a aVar = g6.k.f76003b;
                    long jFloatToRawIntBits = (((long) Float.floatToRawIntBits((int) (j8 & 4294967295L))) & 4294967295L) | (Float.floatToRawIntBits((int) (j8 >> 32)) << 32);
                    n4.c.a aVar2 = n4.c.f123541b;
                    long j18 = c1VarE.f69146c;
                    c1 c1Var = a1Var.f81683d;
                    c1Var.getClass();
                    long jN = jg.b.N(c1Var.X(c1VarE, jFloatToRawIntBits));
                    fVar = new f(jN, (4294967295L & ((long) (((int) (jN & 4294967295L)) + ((int) (j18 & 4294967295L))))) | (((long) (((int) (jN >> 32)) + ((int) (j18 >> 32)))) << 32), j15, j16, j17, fArr, jVar, null);
                } else {
                    fVar = new f(j8, j14, j15, j16, j17, fArr, jVar, null);
                }
                fVar2 = fVar;
            } else {
                fVar2 = null;
            }
            if (fVar2 == null) {
                return;
            }
            this.f142861e.invoke(fVar2);
        }

        public final void b() {
            g gVar = g.this;
            i0<a> i0Var = gVar.f142850a;
            int i14 = this.f142857a;
            a aVarG = i0Var.g(i14);
            if (aVarG != null) {
                if (aVarG.equals(this)) {
                    a aVar = this.f142862f;
                    this.f142862f = null;
                    if (aVar == null) {
                        e0 e0VarG = k.g(this.f142860d.getNode());
                        if (e0VarG.f81766g) {
                            h5.i0.a(e0VarG).getRectManager().f142832b.c(e0VarG.f81761b, false);
                            return;
                        }
                        return;
                    }
                    int iD = i0Var.d(i14);
                    Object[] objArr = i0Var.f134774c;
                    Object obj = objArr[iD];
                    i0Var.f134773b[iD] = i14;
                    objArr[iD] = aVar;
                    return;
                }
                int iD2 = i0Var.d(i14);
                Object[] objArr2 = i0Var.f134774c;
                Object obj2 = objArr2[iD2];
                i0Var.f134773b[iD2] = i14;
                objArr2[iD2] = aVarG;
                while (true) {
                    a aVar2 = aVarG.f142862f;
                    if (aVar2 == null) {
                        break;
                    }
                    if (aVar2 == this) {
                        aVarG.f142862f = this.f142862f;
                        this.f142862f = null;
                        return;
                    }
                    aVarG = aVar2;
                }
            }
            a aVar3 = gVar.f142851b;
            if (aVar3 == this) {
                gVar.f142851b = aVar3.f142862f;
                this.f142862f = null;
                return;
            }
            a aVar4 = aVar3 != null ? aVar3.f142862f : null;
            while (true) {
                a aVar5 = aVar3;
                aVar3 = aVar4;
                if (aVar3 == null) {
                    return;
                }
                if (aVar3 == this) {
                    if (aVar5 != null) {
                        aVar5.f142862f = aVar3.f142862f;
                    }
                    this.f142862f = null;
                    return;
                }
                aVar4 = aVar3.f142862f;
            }
        }
    }

    public g() {
        g6.k.a aVar = g6.k.f76003b;
        aVar.getClass();
        this.f142853d = 0L;
        aVar.getClass();
        this.f142854e = 0L;
    }

    public static long a(a aVar, long j8, long j14, float[] fArr, long j15, long j16) {
        long j17 = aVar.f142859c;
        if (j17 > 0) {
            long j18 = aVar.f142866j;
            if (j18 > 0) {
                if (j15 - j18 < j17) {
                    return Math.min(j16, j18 + j17);
                }
                aVar.f142865i = j15;
                aVar.f142866j = -1L;
                aVar.a(aVar.f142863g, aVar.f142864h, j8, j14, fArr);
                return j16;
            }
        }
        return j16;
    }

    public final void b(a aVar, long j8, long j14, float[] fArr, long j15) {
        long j16 = aVar.f142865i;
        long j17 = aVar.f142859c;
        boolean z14 = j15 - j16 > aVar.f142858b || j16 == Long.MIN_VALUE;
        boolean z15 = j17 == 0;
        aVar.f142866j = j15;
        if (z14 && z15) {
            aVar.f142865i = j15;
            aVar.a(aVar.f142863g, aVar.f142864h, j8, j14, fArr);
        }
        if (z15) {
            return;
        }
        long j18 = this.f142852c;
        long j19 = j15 + j17;
        if (j18 <= 0 || j19 >= j18) {
            return;
        }
        this.f142852c = j18;
    }

    public final boolean c(long j8, long j14, float[] fArr, int i14, int i15) {
        boolean z14;
        if (g6.k.c(j14, this.f142853d)) {
            z14 = false;
        } else {
            this.f142853d = j14;
            z14 = true;
        }
        if (!g6.k.c(j8, this.f142854e)) {
            this.f142854e = j8;
            z14 = true;
        }
        if (fArr != null) {
            this.f142856g = fArr;
            z14 = true;
        }
        long j15 = (((long) i14) << 32) | (((long) i15) & 4294967295L);
        if (j15 == this.f142855f) {
            return z14;
        }
        this.f142855f = j15;
        return true;
    }
}
