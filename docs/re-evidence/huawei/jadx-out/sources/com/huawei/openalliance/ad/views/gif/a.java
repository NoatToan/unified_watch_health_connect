package com.huawei.openalliance.ad.views.gif;

import android.graphics.Bitmap;
import com.huawei.openalliance.ad.hw;
import com.huawei.openalliance.ad.utils.as;
import com.huawei.openalliance.ad.utils.df;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: classes12.dex */
public class a {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final String f21218c = "a";
    private int[] C;
    private int D;
    private Bitmap F;
    private int[] G;
    private int I;
    private int J;
    private int K;
    private int L;
    private int M;
    private int N;
    private int O;
    private int P;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f21219a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f21220b;
    private final int d;
    private InputStream e;
    private boolean k;
    private boolean l;
    private boolean m;
    private short[] n;
    private byte[] o;
    private byte[] q;
    private byte[] r;
    private int s;
    private int w;
    private int x;
    private int y;
    private int z;
    private final Object f = new Object();
    private final Object g = new Object();
    private boolean h = false;
    private boolean i = false;
    private boolean j = false;
    private byte[] p = new byte[512];
    private int t = 100;
    private int u = 0;
    private int v = 0;
    private int[] A = null;
    private int[] B = null;
    private int E = 0;
    private int H = 0;
    private int Q = 0;
    private int[] R = null;

    public boolean c() {
        boolean z;
        synchronized (this.f) {
            z = this.h;
        }
        return z;
    }

    public void b() {
        synchronized (this.f) {
            if (!this.h) {
                this.h = true;
                df.a((Closeable) this.e);
            }
        }
    }

    public c a() {
        if (c()) {
            a(true);
            return null;
        }
        while (!t()) {
            if (i()) {
                a(true);
                break;
            }
            int iF = f();
            if (iF != 0) {
                if (iF != 33) {
                    if (iF == 44) {
                        c cVarJ = j();
                        if (cVarJ != null) {
                            return cVarJ;
                        }
                    } else if (iF != 59) {
                        this.v = 1;
                    } else {
                        a(true);
                    }
                } else if (249 == f()) {
                    m();
                } else {
                    n();
                }
            }
        }
        if (t()) {
            b();
        }
        return null;
    }

    private boolean t() {
        boolean z;
        synchronized (this.g) {
            z = this.i;
        }
        return z;
    }

    private void s() {
        if (this.R == null) {
            this.R = new int[this.f21219a * this.f21220b];
        }
        int i = this.E;
        if (i > 0) {
            if (3 == i) {
                this.G = null;
            }
            int[] iArr = this.G;
            if (iArr != null) {
                this.R = iArr;
                if (2 == i) {
                    int i2 = !this.j ? this.s : 0;
                    for (int i3 = 0; i3 < this.P; i3++) {
                        int i4 = ((this.N + i3) * this.f21219a) + this.M;
                        int i5 = this.O;
                        for (int i6 = i4; i6 < i5 + i4; i6++) {
                            this.R[i6] = i2;
                        }
                    }
                }
            }
        }
    }

    private int r() {
        String str;
        String str2;
        int i;
        int iF = f();
        this.Q = iF;
        int i2 = 0;
        if (iF > 0) {
            while (true) {
                try {
                    int i3 = this.Q;
                    if (i2 >= i3 || (i = this.e.read(this.p, i2, i3 - i2)) == -1) {
                        break;
                    }
                    i2 += i;
                } catch (IOException unused) {
                    str = f21218c;
                    str2 = "read block IOException";
                    hw.c(str, str2);
                } catch (Exception unused2) {
                    str = f21218c;
                    str2 = "read block fail";
                    hw.c(str, str2);
                }
            }
            if (i2 < this.Q) {
                this.v = 1;
            }
        }
        return i2;
    }

    private void q() {
        this.E = this.u;
        this.M = this.I;
        this.N = this.J;
        this.O = this.K;
        this.P = this.L;
        this.s = this.z;
        this.G = this.R;
        this.j = false;
        this.u = 0;
        this.B = null;
        this.t = this.d;
    }

    private void p() {
        this.v = 3;
    }

    private void o() {
        int i;
        try {
            s();
            int i2 = 0;
            int i3 = 1;
            int i4 = 8;
            int i5 = 0;
            while (true) {
                int i6 = this.L;
                if (i2 >= i6) {
                    this.F = a(this.R, this.f21219a, this.f21220b, this.F);
                    return;
                }
                if (this.m) {
                    if (i5 >= i6) {
                        i3++;
                        if (i3 == 2) {
                            i5 = 4;
                        } else if (i3 == 3) {
                            i4 = 4;
                            i5 = 2;
                        } else if (i3 == 4) {
                            i5 = 1;
                            i4 = 2;
                        }
                    }
                    i = i5 + i4;
                } else {
                    i = i5;
                    i5 = i2;
                }
                int i7 = i5 + this.J;
                if (i7 < this.f21220b) {
                    int i8 = this.f21219a;
                    int i9 = i7 * i8;
                    int i10 = this.I + i9;
                    int i11 = this.K;
                    int i12 = i10 + i11;
                    int i13 = i9 + i8;
                    if (i13 < i12) {
                        i12 = i13;
                    }
                    int i14 = i11 * i2;
                    while (i10 < i12) {
                        int i15 = this.C[this.r[i14] & 255];
                        if (i15 != 0) {
                            this.R[i10] = i15;
                        }
                        i10++;
                        i14++;
                    }
                }
                i2++;
                i5 = i;
            }
        } catch (Exception | StackOverflowError unused) {
            this.v = 1;
            hw.c(f21218c, "set pixel error");
        }
    }

    private void n() {
        do {
            r();
            if (this.Q <= 0) {
                return;
            }
        } while (!i());
    }

    private void m() {
        f();
        int iF = f();
        int i = (iF & 28) >> 2;
        this.u = i;
        if (i == 0) {
            this.u = 1;
        }
        this.j = (iF & 1) != 0;
        int iH = h() * 10;
        this.t = iH;
        int i2 = this.d;
        if (i2 > iH) {
            this.t = i2;
        }
        this.D = f();
        f();
    }

    /* JADX WARN: Code duplicated, block: B:30:0x0097  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:30:0x0097 -> B:27:0x0091). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private void l() {
        /*
            Method dump skipped, instruction units count: 252
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.openalliance.ad.views.gif.a.l():void");
    }

    private int k() {
        int[] iArr;
        this.I = h();
        this.J = h();
        this.K = h();
        this.L = h();
        int iF = f();
        int i = 0;
        this.l = (iF & 128) != 0;
        this.m = (iF & 64) != 0;
        int iPow = (int) Math.pow(2.0d, (iF & 7) + 1);
        this.x = iPow;
        if (this.l) {
            int[] iArrA = a(iPow);
            this.B = iArrA;
            this.C = iArrA;
        } else {
            this.C = this.A;
            if (this.y == this.D) {
                this.z = 0;
            }
        }
        if (this.j && (iArr = this.C) != null && iArr.length > 0) {
            int length = iArr.length;
            int i2 = this.D;
            if (length > i2) {
                int i3 = iArr[i2];
                iArr[i2] = 0;
                i = i3;
            }
        }
        if (this.C == null) {
            this.v = 1;
        }
        return i;
    }

    private c j() {
        c cVar = null;
        try {
            int iK = k();
            if (i()) {
                return null;
            }
            l();
            n();
            if (i()) {
                return null;
            }
            o();
            if (i()) {
                return null;
            }
            Bitmap bitmap = this.F;
            if (bitmap != null) {
                int i = this.H + 1;
                this.H = i;
                cVar = new c(i, bitmap, this.t);
            }
            if (this.j) {
                this.C[this.D] = iK;
            }
            q();
            return cVar;
        } catch (Exception | StackOverflowError unused) {
            this.v = 1;
            hw.c(f21218c, "read image error");
            return cVar;
        } catch (OutOfMemoryError unused2) {
            this.v = 1;
            hw.c(f21218c, "run out of memory");
            p();
            return cVar;
        }
    }

    private boolean i() {
        return this.v != 0;
    }

    private int h() {
        return f() | (f() << 8);
    }

    private void g() {
        this.f21219a = h();
        this.f21220b = h();
        int iF = f();
        this.k = (iF & 128) != 0;
        this.w = (int) Math.pow(2.0d, (iF & 7) + 1);
        this.y = f();
        f();
    }

    private int f() {
        try {
            return this.e.read();
        } catch (Exception unused) {
            this.v = 1;
            return 0;
        }
    }

    private void e() {
        StringBuffer stringBuffer = new StringBuffer();
        for (int i = 0; i < 6; i++) {
            stringBuffer.append((char) f());
        }
        if (!stringBuffer.toString().startsWith("GIF")) {
            this.v = 1;
            return;
        }
        g();
        if (!this.k || i()) {
            return;
        }
        int[] iArrA = a(this.w);
        this.A = iArrA;
        this.z = iArrA[this.y];
    }

    private void d() {
        if (this.e == null) {
            a(true);
            return;
        }
        e();
        if (i()) {
            a(true);
            b();
        }
    }

    private void b(int i) {
        byte[] bArr = this.r;
        if (bArr == null || bArr.length < i) {
            this.r = new byte[i];
        }
        if (this.n == null) {
            this.n = new short[4096];
        }
        if (this.o == null) {
            this.o = new byte[4096];
        }
        if (this.q == null) {
            this.q = new byte[4097];
        }
    }

    private int[] a(int i) {
        int i2;
        int[] iArr = new int[256];
        int i3 = i * 3;
        byte[] bArr = new byte[i3];
        int i4 = 0;
        try {
            i2 = this.e.read(bArr);
        } catch (Exception unused) {
            hw.c(f21218c, "read color table fail");
            i2 = 0;
        }
        if (i2 < i3) {
            this.v = 1;
        } else {
            int i5 = 0;
            while (i5 < i) {
                iArr[i5] = (bArr[i4 + 2] & 255) | ((bArr[i4] & 255) << 16) | (-16777216) | ((bArr[i4 + 1] & 255) << 8);
                i5++;
                i4 += 3;
            }
        }
        return iArr;
    }

    private void a(boolean z) {
        synchronized (this.g) {
            this.i = z;
        }
    }

    private Bitmap a(int[] iArr, int i, int i2, Bitmap bitmap) {
        if (bitmap == null) {
            Bitmap.Config config = as.b() > 62914560 ? Bitmap.Config.ARGB_8888 : Bitmap.Config.RGB_565;
            if (hw.a()) {
                hw.a(f21218c, "create image with config %s", config);
            }
            bitmap = Bitmap.createBitmap(i, i2, config);
        }
        bitmap.setPixels(iArr, 0, i, 0, 0, i, i2);
        return bitmap;
    }

    public a(InputStream inputStream, int i) {
        this.e = inputStream;
        this.d = i;
        d();
    }
}
