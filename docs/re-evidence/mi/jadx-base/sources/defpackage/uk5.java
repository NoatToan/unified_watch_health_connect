package defpackage;

/* JADX INFO: loaded from: classes5.dex */
public final class uk5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f35860a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final byte[] f35861b;

    public uk5(int i, byte[] bArr) {
        this.f35860a = i;
        this.f35861b = bArr;
    }

    public static uk5[] b(byte[] bArr, apq apqVar) {
        apq.c cVarD = apqVar.d();
        apq.b[] bVarArrA = cVarD.a();
        int iA = 0;
        for (apq.b bVar : bVarArrA) {
            iA += bVar.a();
        }
        uk5[] uk5VarArr = new uk5[iA];
        int i = 0;
        for (apq.b bVar2 : bVarArrA) {
            int i2 = 0;
            while (i2 < bVar2.a()) {
                int iB = bVar2.b();
                uk5VarArr[i] = new uk5(iB, new byte[cVarD.b() + iB]);
                i2++;
                i++;
            }
        }
        int length = uk5VarArr[0].f35861b.length - cVarD.b();
        int i3 = length - 1;
        int i4 = 0;
        for (int i5 = 0; i5 < i3; i5++) {
            int i6 = 0;
            while (i6 < i) {
                uk5VarArr[i6].f35861b[i5] = bArr[i4];
                i6++;
                i4++;
            }
        }
        boolean z = apqVar.i() == 24;
        int i7 = z ? 8 : i;
        int i8 = 0;
        while (i8 < i7) {
            uk5VarArr[i8].f35861b[i3] = bArr[i4];
            i8++;
            i4++;
        }
        int length2 = uk5VarArr[0].f35861b.length;
        while (length < length2) {
            int i9 = 0;
            while (i9 < i) {
                int i10 = z ? (i9 + 8) % i : i9;
                uk5VarArr[i10].f35861b[(!z || i10 <= 7) ? length : length - 1] = bArr[i4];
                i9++;
                i4++;
            }
            length++;
        }
        if (i4 == bArr.length) {
            return uk5VarArr;
        }
        throw new IllegalArgumentException();
    }

    public byte[] a() {
        return this.f35861b;
    }

    public int c() {
        return this.f35860a;
    }
}
