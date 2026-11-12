package defpackage;

import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes6.dex */
public class ycs {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f40056a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f40057b;
    public int c;
    public int d;
    public int e;
    public int f;
    public boolean g;
    public sdt h;

    public ycs() {
        this.f40056a = 0;
        this.f40057b = 0;
        this.c = 0;
        this.d = 0;
        this.e = 0;
        this.f = 0;
        this.g = false;
        this.h = null;
    }

    public static ycs b(byte[] bArr) {
        if (bArr == null) {
            return null;
        }
        int i = 5;
        if (bArr.length < 5) {
            return null;
        }
        byte b2 = bArr[0];
        int i2 = b2 & 255;
        ycs ycsVar = new ycs((bArr[1] & 255) | ((bArr[2] & 255) << 8) | ((bArr[3] & 255) << 16) | ((bArr[4] & 255) << 24), -1);
        boolean z = (b2 & 1) == 1;
        boolean z2 = ((i2 >> 1) & 1) == 1;
        boolean z3 = ((i2 >> 2) & 1) == 1;
        boolean z4 = ((i2 >> 3) & 1) == 1;
        boolean z5 = ((i2 >> 4) & 1) == 1;
        if (z) {
            ycsVar.c((bArr[5] & 255) | ((bArr[6] & 255) << 8) | ((bArr[7] & 255) << 16) | ((bArr[8] & 255) << 24));
            i = 9;
        }
        if (z2) {
            int i3 = i + 3;
            int i4 = ((bArr[i + 1] & 255) << 8) | (bArr[i] & 255) | ((bArr[i + 2] & 255) << 16);
            i += 4;
            ycsVar.j(i4 | ((bArr[i3] & 255) << 24));
        }
        if (z3 && z4) {
            ycsVar.e(true);
            ycsVar.i(((bArr[i + 1] & 255) << 8) | (bArr[i] & 255) | ((bArr[i + 2] & 255) << 16) | ((bArr[i + 3] & 255) << 24));
            int i5 = i + 7;
            int i6 = ((bArr[i + 5] & 255) << 8) | (bArr[i + 4] & 255) | ((bArr[i + 6] & 255) << 16);
            i += 8;
            ycsVar.g(i6 | ((bArr[i5] & 255) << 24));
        }
        if (z5) {
            try {
                sdt sdtVar = new sdt();
                sdtVar.a(bArr[i] & 255);
                sdtVar.b(0, (bArr[i + 1] & 255) | ((bArr[i + 2] & 255) << 8), ((bArr[i + 4] & 255) << 8) | (bArr[i + 3] & 255));
                sdtVar.b(1, ((bArr[i + 6] & 255) << 8) | (bArr[i + 5] & 255), ((bArr[i + 8] & 255) << 8) | (bArr[i + 7] & 255));
                ycsVar.d(sdtVar);
            } catch (Exception unused) {
            }
        }
        return ycsVar;
    }

    public int a() {
        return this.c;
    }

    public void c(int i) {
        this.d = i;
    }

    public void d(sdt sdtVar) {
        this.h = sdtVar;
    }

    public void e(boolean z) {
        this.g = z;
    }

    public int f() {
        return this.f40057b;
    }

    public void g(int i) {
        this.c = i;
    }

    public int h() {
        return this.f40056a;
    }

    public void i(int i) {
        this.f40057b = i;
    }

    public void j(int i) {
        this.e = i;
    }

    public boolean k() {
        return this.g;
    }

    public String toString() {
        return "RealtimeStep{totalStep=" + this.f40056a + ", totalDis=" + this.f40057b + ", totalCal=" + this.c + ", running=" + this.d + ", walking=" + this.e + ", front=" + this.f + ", isSupportStepExtra=" + this.g + ", gaitInfo=" + this.h + AbstractJsonLexerKt.END_OBJ;
    }

    public ycs(int i, int i2) {
        this.f40057b = 0;
        this.c = 0;
        this.d = 0;
        this.e = 0;
        this.g = false;
        this.h = null;
        this.f40056a = i;
        this.f = i2;
    }
}
