package com.huawei.hms.scankit.p;

/* JADX INFO: loaded from: classes34.dex */
public final class p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final o f16249a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private s f16250b;

    public p(o oVar) {
        if (oVar != null) {
            this.f16249a = oVar;
            return;
        }
        throw new IllegalArgumentException("Binarizer must be non-null.");
    }

    public int e() {
        return this.f16249a.d();
    }

    private r a(int i, int i2, int[] iArr, int[] iArr2, byte[] bArr, int i3) {
        int i4;
        r rVar = new r(i2);
        for (int i5 = 1; i5 < i2; i5++) {
            int i6 = iArr2[i5 - 1];
            int i7 = bArr[i5] & 255;
            iArr2[i5] = i6 + (i7 * i7);
        }
        int i8 = i3 + 1;
        int i9 = i8;
        while (true) {
            i4 = i2 - i3;
            if (i9 >= i4) {
                break;
            }
            int i10 = i9 + i3;
            int i11 = (i9 - i3) - 1;
            double d = iArr[i10] - iArr[i11];
            double d2 = i;
            if ((bArr[i9] & 255) <= (d / d2) * ((((double) 0.5f) * (Math.sqrt((((double) (iArr2[i10] - iArr2[i11])) - ((d * d) / d2)) / ((double) (i - 1))) / ((double) 127))) + 1.0d)) {
                rVar.g(i9);
            }
            i9++;
        }
        if (rVar.b(i8)) {
            rVar.c(0, i8);
        }
        if (rVar.b(i4 - 1)) {
            rVar.c(i4, i2);
        }
        return rVar;
    }

    public int c() {
        return this.f16249a.b();
    }

    public s b() {
        if (this.f16250b == null) {
            this.f16250b = this.f16249a.a();
        }
        return this.f16250b;
    }

    public byte[] d() {
        return this.f16249a.c().b();
    }

    public p a(int i, int i2, int i3, int i4) {
        return new p(this.f16249a.a(this.f16249a.c().a(i, i2, i3, i4)));
    }

    public r a(int i, int i2) throws a {
        int i3;
        int iE = e();
        if (iE >= 45) {
            r rVar = new r(iE);
            byte[] bArr = new byte[iE];
            a().c().a(i, bArr);
            int[] iArr = new int[iE];
            int[] iArr2 = new int[iE];
            int i4 = bArr[0] & 255;
            iArr[0] = i4;
            iArr2[0] = i4 * i4;
            for (int i5 = 1; i5 < iE; i5++) {
                iArr[i5] = iArr[i5 - 1] + (bArr[i5] & 255);
            }
            if (i2 == 0) {
                int i6 = 23;
                while (true) {
                    i3 = iE - 22;
                    if (i6 >= i3) {
                        break;
                    }
                    if ((bArr[i6] & 255) + 5 < (iArr[i6 + 22] - iArr[i6 - 23]) / 45) {
                        rVar.g(i6);
                    }
                    i6++;
                }
                if (rVar.b(23)) {
                    rVar.c(0, 23);
                }
                if (rVar.b(iE - 23)) {
                    rVar.c(i3, iE);
                }
                return rVar;
            }
            return a(45, iE, iArr, iArr2, bArr, 22);
        }
        throw a.a();
    }

    public o a() {
        return this.f16249a;
    }

    public r a(int i, r rVar) {
        return this.f16249a.a(i, rVar);
    }

    public void a(s sVar) {
        this.f16250b = sVar;
    }
}
