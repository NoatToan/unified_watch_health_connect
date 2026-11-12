package defpackage;

/* JADX INFO: loaded from: classes5.dex */
public class vnc {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public b[] f37057a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public short[] f37058b;
    public int c;
    public int d;
    public bp2 e;

    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public short f37059a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public short f37060b;
        public short c;
        public short d;
        public int e;

        public b() {
        }
    }

    public vnc(bp2 bp2Var, int i) {
        this.e = bp2Var;
        this.d = i;
        a(i - 1);
        if (i <= 256 || i >= 512) {
            this.c = 0;
        } else {
            this.c = a(i - 257);
        }
        this.f37058b = new short[i];
        int i2 = i * 2;
        this.f37057a = new b[i2];
        for (int i3 = 0; i3 < i2; i3++) {
            this.f37057a[i3] = new b();
        }
        for (int i4 = 2; i4 < i2; i4++) {
            b bVar = this.f37057a[i4];
            bVar.f37059a = (short) (i4 / 2);
            bVar.e = 1;
        }
        for (int i5 = 1; i5 < i; i5++) {
            b bVar2 = this.f37057a[i5];
            int i6 = i5 * 2;
            bVar2.f37060b = (short) i6;
            bVar2.c = (short) (i6 + 1);
        }
        for (int i7 = 0; i7 < i; i7++) {
            b[] bVarArr = this.f37057a;
            bVarArr[i7].d = (short) -1;
            int i8 = i + i7;
            b bVar3 = bVarArr[i8];
            bVar3.d = (short) i7;
            bVar3.f37060b = (short) -1;
            bVar3.c = (short) -1;
            this.f37058b[i7] = (short) i8;
        }
        b(1);
        if (this.c == 0) {
            for (int i9 = 0; i9 < 2; i9++) {
                for (int i10 = 0; i10 < i; i10++) {
                    d(this.f37058b[i10]);
                }
            }
            return;
        }
        d(this.f37058b[256]);
        d(this.f37058b[257]);
        for (int i11 = 0; i11 < 12; i11++) {
            d(this.f37058b[i - 3]);
        }
        for (int i12 = 0; i12 < 6; i12++) {
            d(this.f37058b[i - 2]);
        }
    }

    public static int a(int i) {
        int i2 = 32;
        while (i2 > 1 && ((1 << (i2 - 1)) & i) == 0) {
            i2--;
        }
        return i2;
    }

    public final int b(int i) {
        b bVar = this.f37057a[i];
        if (bVar.d < 0) {
            bVar.e = b(bVar.f37060b) + b(this.f37057a[i].c);
        }
        return this.f37057a[i].e;
    }

    public final void c(int i, int i2) {
        b[] bVarArr = this.f37057a;
        b bVar = bVarArr[i];
        short s = bVar.f37059a;
        b bVar2 = bVarArr[i2];
        short s2 = bVar2.f37059a;
        bVarArr[i] = bVar2;
        bVarArr[i2] = bVar;
        b bVar3 = bVarArr[i];
        bVar3.f37059a = s;
        bVar.f37059a = s2;
        short s3 = bVar3.d;
        if (s3 < 0) {
            short s4 = (short) i;
            bVarArr[bVar3.f37060b].f37059a = s4;
            bVarArr[bVar3.c].f37059a = s4;
        } else {
            this.f37058b[s3] = (short) i;
        }
        short s5 = bVar.d;
        if (s5 >= 0) {
            this.f37058b[s5] = (short) i2;
            return;
        }
        short s6 = (short) i2;
        bVarArr[bVar.f37060b].f37059a = s6;
        bVarArr[bVar.c].f37059a = s6;
    }

    public final void d(int i) {
        while (i != 1) {
            b[] bVarArr = this.f37057a;
            int i2 = bVarArr[i].e;
            int i3 = i - 1;
            if (bVarArr[i3].e == i2) {
                while (true) {
                    int i4 = i3 - 1;
                    if (this.f37057a[i4].e != i2) {
                        break;
                    } else {
                        i3 = i4;
                    }
                }
                if (i3 > 1) {
                    c(i, i3);
                    i = i3;
                }
            }
            b bVar = this.f37057a[i];
            bVar.e = i2 + 1;
            i = bVar.f37059a;
        }
        this.f37057a[i].e++;
    }

    public void e(int i) {
        int i2;
        short s = this.f37058b[i];
        boolean[] zArr = new boolean[50];
        short s2 = s;
        int i3 = 0;
        while (true) {
            b[] bVarArr = this.f37057a;
            short s3 = bVarArr[s2].f37059a;
            i2 = i3 + 1;
            zArr[i3] = bVarArr[s3].c == s2;
            if (s3 == 1) {
                break;
            }
            s2 = s3;
            i3 = i2;
        }
        do {
            i2--;
            this.e.d(zArr[i2]);
        } while (i2 > 0);
        d(s);
    }

    public int f(int i) {
        short s = this.f37058b[i];
        int i2 = 0;
        do {
            i2++;
            s = this.f37057a[s].f37059a;
        } while (s != 1);
        return i2 << 16;
    }
}
