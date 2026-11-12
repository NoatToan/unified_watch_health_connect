package defpackage;

import android.os.SystemClock;
import com.amap.api.col.p0003sl.ni;
import com.amap.api.col.p0003sl.nj;
import com.amap.api.col.p0003sl.nk;
import com.amap.api.col.p0003sl.nl;
import com.amap.api.col.p0003sl.nm;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class k7t extends j7t {
    public k7t() {
        super(2048);
    }

    public static void e(List<ni> list) {
        if (list == null || list.size() == 0) {
            return;
        }
        for (ni niVar : list) {
            if (niVar instanceof nk) {
                nk nkVar = (nk) niVar;
                niVar.g = vat.b(vat.a(nkVar.j, nkVar.f6218k));
            } else if (niVar instanceof nl) {
                nl nlVar = (nl) niVar;
                niVar.g = vat.b(vat.a(nlVar.j, nlVar.f6219k));
            } else if (niVar instanceof nm) {
                nm nmVar = (nm) niVar;
                niVar.g = vat.b(vat.a(nmVar.j, nmVar.f6220k));
            } else if (niVar instanceof nj) {
                nj njVar = (nj) niVar;
                niVar.g = vat.b(vat.a(njVar.f6217k, njVar.l));
            }
        }
    }

    public static void g(List<cbt> list) {
        for (cbt cbtVar : list) {
            cbtVar.g = vat.d(cbtVar.f5174a);
        }
    }

    public final int b(long j, List<cbt> list) {
        g(list);
        int size = list.size();
        if (size <= 0) {
            return -1;
        }
        int[] iArr = new int[size];
        for (int i = 0; i < size; i++) {
            cbt cbtVar = list.get(i);
            int iB = this.f22511a.b(cbtVar.f5175b);
            long j2 = cbtVar.f5174a;
            iArr[i] = z8t.b(this.f22511a, j2 == j && j2 != -1, j2, (short) cbtVar.c, iB, cbtVar.g, (short) cbtVar.d);
        }
        return y8t.b(this.f22511a, y8t.c(this.f22511a, iArr));
    }

    public final int c(o7t.a aVar) {
        int iA;
        int i;
        int i2;
        byte b2;
        int iB;
        int iB2;
        byte b3;
        e(aVar.f);
        int size = aVar.f.size();
        int[] iArr = new int[size];
        for (int i3 = 0; i3 < size; i3++) {
            ni niVar = aVar.f.get(i3);
            if (niVar instanceof nk) {
                nk nkVar = (nk) niVar;
                iB = !nkVar.i ? l8t.b(this.f22511a, nkVar.j, nkVar.f6218k, nkVar.c, nkVar.l) : l8t.c(this.f22511a, nkVar.b(), nkVar.c(), nkVar.j, nkVar.f6218k, nkVar.c, nkVar.m, nkVar.n, nkVar.d, nkVar.l);
                i2 = -1;
                b2 = 1;
            } else {
                if (niVar instanceof nl) {
                    nl nlVar = (nl) niVar;
                    iB2 = m8t.b(this.f22511a, nlVar.b(), nlVar.c(), nlVar.j, nlVar.f6219k, nlVar.l, nlVar.c, nlVar.m, nlVar.d);
                    b3 = 3;
                } else if (niVar instanceof nj) {
                    nj njVar = (nj) niVar;
                    iB = !njVar.i ? c8t.b(this.f22511a, njVar.j, njVar.f6217k, njVar.l, njVar.m, njVar.n, njVar.c) : c8t.c(this.f22511a, njVar.j, njVar.f6217k, njVar.l, njVar.m, njVar.n, njVar.c, njVar.d);
                    b2 = 2;
                    i2 = -1;
                } else if (niVar instanceof nm) {
                    nm nmVar = (nm) niVar;
                    iB2 = p8t.b(this.f22511a, nmVar.b(), nmVar.c(), nmVar.j, nmVar.f6220k, nmVar.l, nmVar.c, nmVar.m, nmVar.d);
                    b3 = 4;
                } else {
                    i2 = -1;
                    b2 = 0;
                    iB = -1;
                }
                b2 = b3;
                iB = iB2;
                i2 = -1;
            }
            if (iB == i2) {
                return i2;
            }
            iArr[i3] = f8t.b(this.f22511a, niVar.h ? (byte) 1 : (byte) 0, niVar.i ? (byte) 1 : (byte) 0, (short) niVar.g, b2, iB);
        }
        int iB3 = this.f22511a.b(aVar.f28838b);
        int iC = d8t.c(this.f22511a, iArr);
        int size2 = aVar.g.size();
        int[] iArr2 = new int[size2];
        for (int i4 = 0; i4 < size2; i4++) {
            ni niVar2 = aVar.g.get(i4);
            long jElapsedRealtime = (SystemClock.elapsedRealtime() - niVar2.e) / 1000;
            if (jElapsedRealtime > 32767 || jElapsedRealtime < 0) {
                jElapsedRealtime = 32767;
            }
            if (niVar2 instanceof nk) {
                nk nkVar2 = (nk) niVar2;
                iA = o8t.a(this.f22511a, nkVar2.j, nkVar2.f6218k, (short) jElapsedRealtime);
            } else if (niVar2 instanceof nl) {
                nl nlVar2 = (nl) niVar2;
                iA = o8t.a(this.f22511a, nlVar2.j, nlVar2.f6219k, (short) jElapsedRealtime);
            } else {
                if (niVar2 instanceof nj) {
                    nj njVar2 = (nj) niVar2;
                    iA = n8t.a(this.f22511a, njVar2.j, njVar2.f6217k, njVar2.l, (short) jElapsedRealtime);
                    i = 2;
                } else if (niVar2 instanceof nm) {
                    nm nmVar2 = (nm) niVar2;
                    iA = o8t.a(this.f22511a, nmVar2.j, nmVar2.f6220k, (short) jElapsedRealtime);
                } else {
                    iA = 0;
                    i = 0;
                }
                iArr2[i4] = e8t.b(this.f22511a, (byte) i, iA);
            }
            i = 1;
            iArr2[i4] = e8t.b(this.f22511a, (byte) i, iA);
        }
        return d8t.b(this.f22511a, iB3, aVar.f28837a, iC, d8t.f(this.f22511a, iArr2));
    }

    public final int d(bbt bbtVar) {
        return j8t.b(this.f22511a, bbtVar.c, bbtVar.f4039k, (int) (bbtVar.e * 1000000.0d), (int) (bbtVar.d * 1000000.0d), (int) bbtVar.f, (int) bbtVar.i, (int) bbtVar.g, (short) bbtVar.h, bbtVar.l);
    }

    public final byte[] f(bbt bbtVar, o7t.a aVar, long j, List<cbt> list) {
        List<ni> list2;
        super.a();
        try {
            int iD = d(bbtVar);
            int iB = -1;
            int iC = (aVar == null || (list2 = aVar.f) == null || list2.size() <= 0) ? -1 : c(aVar);
            if (list != null && list.size() > 0) {
                iB = b(j, list);
            }
            a8t.a(this.f22511a);
            a8t.b(this.f22511a, iD);
            if (iC > 0) {
                a8t.e(this.f22511a, iC);
            }
            if (iB > 0) {
                a8t.d(this.f22511a, iB);
            }
            this.f22511a.w(a8t.c(this.f22511a));
            return this.f22511a.z();
        } catch (Throwable th) {
            fbt.a(th);
            return null;
        }
    }
}
