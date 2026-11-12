package defpackage;

import java.util.Arrays;

/* JADX INFO: loaded from: classes4.dex */
public final class fw3 implements arl {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f18311a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int[] f18312b;
    public final long[] c;
    public final long[] d;
    public final long[] e;
    public final long f;

    public fw3(int[] iArr, long[] jArr, long[] jArr2, long[] jArr3) {
        this.f18312b = iArr;
        this.c = jArr;
        this.d = jArr2;
        this.e = jArr3;
        int length = iArr.length;
        this.f18311a = length;
        if (length > 0) {
            this.f = jArr2[length - 1] + jArr3[length - 1];
        } else {
            this.f = 0L;
        }
    }

    public int a(long j) {
        return wlq.i(this.e, j, true, true);
    }

    @Override // defpackage.arl
    public arl.a d(long j) {
        int iA = a(j);
        crl crlVar = new crl(this.e[iA], this.c[iA]);
        if (crlVar.f14648a >= j || iA == this.f18311a - 1) {
            return new arl.a(crlVar);
        }
        int i = iA + 1;
        return new arl.a(crlVar, new crl(this.e[i], this.c[i]));
    }

    @Override // defpackage.arl
    public boolean e() {
        return true;
    }

    @Override // defpackage.arl
    public long i() {
        return this.f;
    }

    public String toString() {
        int i = this.f18311a;
        String string = Arrays.toString(this.f18312b);
        String string2 = Arrays.toString(this.c);
        String string3 = Arrays.toString(this.e);
        String string4 = Arrays.toString(this.d);
        StringBuilder sb = new StringBuilder(String.valueOf(string).length() + 71 + String.valueOf(string2).length() + String.valueOf(string3).length() + String.valueOf(string4).length());
        sb.append("ChunkIndex(length=");
        sb.append(i);
        sb.append(", sizes=");
        sb.append(string);
        sb.append(", offsets=");
        sb.append(string2);
        sb.append(", timeUs=");
        sb.append(string3);
        sb.append(", durationsUs=");
        sb.append(string4);
        sb.append(")");
        return sb.toString();
    }
}
