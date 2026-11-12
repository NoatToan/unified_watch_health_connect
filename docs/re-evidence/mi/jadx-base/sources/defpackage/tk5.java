package defpackage;

import com.google.zxing.qrcode.decoder.ErrorCorrectionLevel;

/* JADX INFO: loaded from: classes5.dex */
public final class tk5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f34781a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final byte[] f34782b;

    public tk5(int i, byte[] bArr) {
        this.f34781a = i;
        this.f34782b = bArr;
    }

    public static tk5[] b(byte[] bArr, bpq bpqVar, ErrorCorrectionLevel errorCorrectionLevel) {
        if (bArr.length != bpqVar.h()) {
            throw new IllegalArgumentException();
        }
        bpq.b bVarF = bpqVar.f(errorCorrectionLevel);
        bpq.a[] aVarArrA = bVarF.a();
        int iA = 0;
        for (bpq.a aVar : aVarArrA) {
            iA += aVar.a();
        }
        tk5[] tk5VarArr = new tk5[iA];
        int i = 0;
        for (bpq.a aVar2 : aVarArrA) {
            int i2 = 0;
            while (i2 < aVar2.a()) {
                int iB = aVar2.b();
                tk5VarArr[i] = new tk5(iB, new byte[bVarF.b() + iB]);
                i2++;
                i++;
            }
        }
        int length = tk5VarArr[0].f34782b.length;
        int i3 = iA - 1;
        while (i3 >= 0 && tk5VarArr[i3].f34782b.length != length) {
            i3--;
        }
        int i4 = i3 + 1;
        int iB2 = length - bVarF.b();
        int i5 = 0;
        for (int i6 = 0; i6 < iB2; i6++) {
            int i7 = 0;
            while (i7 < i) {
                tk5VarArr[i7].f34782b[i6] = bArr[i5];
                i7++;
                i5++;
            }
        }
        int i8 = i4;
        while (i8 < i) {
            tk5VarArr[i8].f34782b[iB2] = bArr[i5];
            i8++;
            i5++;
        }
        int length2 = tk5VarArr[0].f34782b.length;
        while (iB2 < length2) {
            int i9 = 0;
            while (i9 < i) {
                tk5VarArr[i9].f34782b[i9 < i4 ? iB2 : iB2 + 1] = bArr[i5];
                i9++;
                i5++;
            }
            iB2++;
        }
        return tk5VarArr;
    }

    public byte[] a() {
        return this.f34782b;
    }

    public int c() {
        return this.f34781a;
    }
}
