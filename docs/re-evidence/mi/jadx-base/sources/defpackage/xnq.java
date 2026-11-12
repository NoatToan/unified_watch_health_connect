package defpackage;

import miuix.animation.internal.FolmeCore;

/* JADX INFO: loaded from: classes4.dex */
public final class xnq implements drl {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long[] f39292a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long[] f39293b;
    public final long c;
    public final long d;

    public xnq(long[] jArr, long[] jArr2, long j, long j2) {
        this.f39292a = jArr;
        this.f39293b = jArr2;
        this.c = j;
        this.d = j2;
    }

    public static xnq a(long j, long j2, j9g.a aVar, okh okhVar) {
        int iD;
        okhVar.Q(10);
        int iN = okhVar.n();
        if (iN <= 0) {
            return null;
        }
        int i = aVar.d;
        long jH0 = wlq.H0(iN, ((long) (i >= 32000 ? 1152 : 576)) * FolmeCore.NANOS_TO_MS, i);
        int iJ = okhVar.J();
        int iJ2 = okhVar.J();
        int iJ3 = okhVar.J();
        okhVar.Q(2);
        long j3 = j2 + ((long) aVar.c);
        long[] jArr = new long[iJ];
        long[] jArr2 = new long[iJ];
        int i2 = 0;
        long j4 = j2;
        while (i2 < iJ) {
            int i3 = iJ2;
            long j5 = j3;
            jArr[i2] = (((long) i2) * jH0) / ((long) iJ);
            jArr2[i2] = Math.max(j4, j5);
            if (iJ3 == 1) {
                iD = okhVar.D();
            } else if (iJ3 == 2) {
                iD = okhVar.J();
            } else if (iJ3 == 3) {
                iD = okhVar.G();
            } else {
                if (iJ3 != 4) {
                    return null;
                }
                iD = okhVar.H();
            }
            j4 += (long) (iD * i3);
            i2++;
            j3 = j5;
            iJ2 = i3;
        }
        if (j != -1 && j != j4) {
            StringBuilder sb = new StringBuilder(67);
            sb.append("VBRI data size mismatch: ");
            sb.append(j);
            sb.append(", ");
            sb.append(j4);
            toe.h("VbriSeeker", sb.toString());
        }
        return new xnq(jArr, jArr2, jH0, j4);
    }

    @Override // defpackage.drl
    public long c(long j) {
        return this.f39292a[wlq.i(this.f39293b, j, true, true)];
    }

    @Override // defpackage.arl
    public arl.a d(long j) {
        int i = wlq.i(this.f39292a, j, true, true);
        crl crlVar = new crl(this.f39292a[i], this.f39293b[i]);
        if (crlVar.f14648a >= j || i == this.f39292a.length - 1) {
            return new arl.a(crlVar);
        }
        int i2 = i + 1;
        return new arl.a(crlVar, new crl(this.f39292a[i2], this.f39293b[i2]));
    }

    @Override // defpackage.arl
    public boolean e() {
        return true;
    }

    @Override // defpackage.drl
    public long h() {
        return this.d;
    }

    @Override // defpackage.arl
    public long i() {
        return this.c;
    }
}
