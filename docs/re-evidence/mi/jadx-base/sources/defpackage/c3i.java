package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public class c3i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public ava f4891a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public a3i f4892b;
    public a3i[] c;
    public a3i[] d;

    public c3i(ava avaVar, a3i a3iVar) {
        this.f4891a = avaVar;
        this.f4892b = a3iVar;
        b();
        a();
    }

    public static void d(a3i[] a3iVarArr, int i, int i2) {
        a3i a3iVar = a3iVarArr[i];
        a3iVarArr[i] = a3iVarArr[i2];
        a3iVarArr[i2] = a3iVar;
    }

    public final void a() {
        int iF;
        int iG = this.f4892b.g();
        a3i[] a3iVarArr = new a3i[iG];
        int i = iG - 1;
        for (int i2 = i; i2 >= 0; i2--) {
            a3iVarArr[i2] = new a3i(this.c[i2]);
        }
        this.d = new a3i[iG];
        while (i >= 0) {
            this.d[i] = new a3i(this.f4891a, i);
            i--;
        }
        for (int i3 = 0; i3 < iG; i3++) {
            if (a3iVarArr[i3].f(i3) == 0) {
                int i4 = i3 + 1;
                boolean z = false;
                while (i4 < iG) {
                    if (a3iVarArr[i4].f(i3) != 0) {
                        d(a3iVarArr, i3, i4);
                        d(this.d, i3, i4);
                        i4 = iG;
                        z = true;
                    }
                    i4++;
                }
                if (!z) {
                    throw new ArithmeticException("Squaring matrix is not invertible.");
                }
            }
            int iF2 = this.f4891a.f(a3iVarArr[i3].f(i3));
            a3iVarArr[i3].m(iF2);
            this.d[i3].m(iF2);
            for (int i5 = 0; i5 < iG; i5++) {
                if (i5 != i3 && (iF = a3iVarArr[i5].f(i3)) != 0) {
                    a3i a3iVarN = a3iVarArr[i3].n(iF);
                    a3i a3iVarN2 = this.d[i3].n(iF);
                    a3iVarArr[i5].b(a3iVarN);
                    this.d[i5].b(a3iVarN2);
                }
            }
        }
    }

    public final void b() {
        int i;
        int iG = this.f4892b.g();
        this.c = new a3i[iG];
        int i2 = 0;
        while (true) {
            i = iG >> 1;
            if (i2 >= i) {
                break;
            }
            int i3 = i2 << 1;
            int[] iArr = new int[i3 + 1];
            iArr[i3] = 1;
            this.c[i2] = new a3i(this.f4891a, iArr);
            i2++;
        }
        while (i < iG) {
            int i4 = i << 1;
            int[] iArr2 = new int[i4 + 1];
            iArr2[i4] = 1;
            this.c[i] = new a3i(this.f4891a, iArr2).k(this.f4892b);
            i++;
        }
    }

    public a3i[] c() {
        return this.d;
    }
}
