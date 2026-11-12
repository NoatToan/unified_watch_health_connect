package defpackage;

import android.graphics.Bitmap;
import android.util.Log;
import com.miui.tsmclient.service.DKFRequestService;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Arrays;
import java.util.Iterator;

/* JADX INFO: loaded from: classes4.dex */
public class obo implements jza {
    public static final String u = "obo";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int[] f28973a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int[] f28974b;
    public final jza.a c;
    public ByteBuffer d;
    public byte[] e;
    public short[] f;
    public byte[] g;
    public byte[] h;
    public byte[] i;
    public int[] j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f28975k;
    public sza l;
    public Bitmap m;
    public boolean n;
    public int o;
    public int p;
    public int q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f28976r;
    public Boolean s;
    public Bitmap.Config t;

    public obo(jza.a aVar, sza szaVar, ByteBuffer byteBuffer, int i) {
        this(aVar);
        q(szaVar, byteBuffer, i);
    }

    @Override // defpackage.jza
    public void a(Bitmap.Config config) {
        Bitmap.Config config2;
        Bitmap.Config config3 = Bitmap.Config.ARGB_8888;
        if (config == config3 || config == (config2 = Bitmap.Config.RGB_565)) {
            this.t = config;
            return;
        }
        throw new IllegalArgumentException("Unsupported format: " + config + ", must be one of " + config3 + " or " + config2);
    }

    @Override // defpackage.jza
    public void b() {
        this.f28975k = -1;
    }

    @Override // defpackage.jza
    public int c() {
        return this.f28975k;
    }

    @Override // defpackage.jza
    public void clear() {
        this.l = null;
        byte[] bArr = this.i;
        if (bArr != null) {
            this.c.e(bArr);
        }
        int[] iArr = this.j;
        if (iArr != null) {
            this.c.f(iArr);
        }
        Bitmap bitmap = this.m;
        if (bitmap != null) {
            this.c.c(bitmap);
        }
        this.m = null;
        this.d = null;
        this.s = null;
        byte[] bArr2 = this.e;
        if (bArr2 != null) {
            this.c.e(bArr2);
        }
    }

    @Override // defpackage.jza
    public int d() {
        return this.d.limit() + this.i.length + (this.j.length * 4);
    }

    @Override // defpackage.jza
    public synchronized Bitmap e() {
        try {
            if (this.l.c <= 0 || this.f28975k < 0) {
                if (Log.isLoggable(u, 3)) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("Unable to decode frame, frameCount=");
                    sb.append(this.l.c);
                    sb.append(", framePointer=");
                    sb.append(this.f28975k);
                }
                this.o = 1;
            }
            int i = this.o;
            if (i != 1 && i != 2) {
                this.o = 0;
                if (this.e == null) {
                    this.e = this.c.a(255);
                }
                pza pzaVar = this.l.e.get(this.f28975k);
                int i2 = this.f28975k - 1;
                pza pzaVar2 = i2 >= 0 ? this.l.e.get(i2) : null;
                int[] iArr = pzaVar.f30933k;
                if (iArr == null) {
                    iArr = this.l.f34125a;
                }
                this.f28973a = iArr;
                if (iArr == null) {
                    if (Log.isLoggable(u, 3)) {
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append("No valid color table found for frame #");
                        sb2.append(this.f28975k);
                    }
                    this.o = 1;
                    return null;
                }
                if (pzaVar.f) {
                    System.arraycopy(iArr, 0, this.f28974b, 0, iArr.length);
                    int[] iArr2 = this.f28974b;
                    this.f28973a = iArr2;
                    iArr2[pzaVar.h] = 0;
                    if (pzaVar.g == 2 && this.f28975k == 0) {
                        this.s = Boolean.TRUE;
                    }
                }
                return r(pzaVar, pzaVar2);
            }
            if (Log.isLoggable(u, 3)) {
                StringBuilder sb3 = new StringBuilder();
                sb3.append("Unable to decode frame, status=");
                sb3.append(this.o);
            }
            return null;
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // defpackage.jza
    public void f() {
        this.f28975k = (this.f28975k + 1) % this.l.c;
    }

    @Override // defpackage.jza
    public int g() {
        return this.l.c;
    }

    @Override // defpackage.jza
    public ByteBuffer getData() {
        return this.d;
    }

    @Override // defpackage.jza
    public int h() {
        int i;
        if (this.l.c <= 0 || (i = this.f28975k) < 0) {
            return 0;
        }
        return m(i);
    }

    public final int i(int i, int i2, int i3) {
        int i4 = 0;
        int i5 = 0;
        int i6 = 0;
        int i7 = 0;
        int i8 = 0;
        for (int i9 = i; i9 < this.p + i; i9++) {
            byte[] bArr = this.i;
            if (i9 >= bArr.length || i9 >= i2) {
                break;
            }
            int i10 = this.f28973a[bArr[i9] & 255];
            if (i10 != 0) {
                i4 += (i10 >> 24) & 255;
                i5 += (i10 >> 16) & 255;
                i6 += (i10 >> 8) & 255;
                i7 += i10 & 255;
                i8++;
            }
        }
        int i11 = i + i3;
        for (int i12 = i11; i12 < this.p + i11; i12++) {
            byte[] bArr2 = this.i;
            if (i12 >= bArr2.length || i12 >= i2) {
                break;
            }
            int i13 = this.f28973a[bArr2[i12] & 255];
            if (i13 != 0) {
                i4 += (i13 >> 24) & 255;
                i5 += (i13 >> 16) & 255;
                i6 += (i13 >> 8) & 255;
                i7 += i13 & 255;
                i8++;
            }
        }
        if (i8 == 0) {
            return 0;
        }
        return ((i4 / i8) << 24) | ((i5 / i8) << 16) | ((i6 / i8) << 8) | (i7 / i8);
    }

    public final void j(pza pzaVar) {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int[] iArr = this.j;
        int i6 = pzaVar.d;
        int i7 = this.p;
        int i8 = i6 / i7;
        int i9 = pzaVar.f30932b / i7;
        int i10 = pzaVar.c / i7;
        int i11 = pzaVar.f30931a / i7;
        boolean z = this.f28975k == 0;
        int i12 = this.f28976r;
        int i13 = this.q;
        byte[] bArr = this.i;
        int[] iArr2 = this.f28973a;
        Boolean bool = this.s;
        int i14 = 8;
        int i15 = 0;
        int i16 = 0;
        int i17 = 1;
        while (i16 < i8) {
            Boolean bool2 = bool;
            if (pzaVar.e) {
                if (i15 >= i8) {
                    int i18 = i17 + 1;
                    i = i8;
                    if (i18 == 2) {
                        i15 = 4;
                    } else if (i18 == 3) {
                        i14 = 4;
                        i17 = i18;
                        i15 = 2;
                    } else if (i18 == 4) {
                        i17 = i18;
                        i15 = 1;
                        i14 = 2;
                    }
                    i17 = i18;
                } else {
                    i = i8;
                }
                i2 = i15 + i14;
            } else {
                i = i8;
                i2 = i15;
                i15 = i16;
            }
            int i19 = i15 + i9;
            boolean z2 = i7 == 1;
            if (i19 < i13) {
                int i20 = i19 * i12;
                int i21 = i20 + i11;
                int i22 = i21 + i10;
                int i23 = i20 + i12;
                if (i23 < i22) {
                    i22 = i23;
                }
                i3 = i2;
                int i24 = i16 * i7 * pzaVar.c;
                if (!z2) {
                    i5 = i9;
                    int i25 = ((i22 - i21) * i7) + i24;
                    int i26 = i21;
                    while (true) {
                        i4 = i10;
                        if (i26 >= i22) {
                            break;
                        }
                        int i27 = i(i24, i25, pzaVar.c);
                        if (i27 != 0) {
                            iArr[i26] = i27;
                        } else if (z && bool2 == null) {
                            bool2 = Boolean.TRUE;
                        }
                        i24 += i7;
                        i26++;
                        i10 = i4;
                    }
                } else {
                    int i28 = i21;
                    while (i28 < i22) {
                        int i29 = i9;
                        int i30 = iArr2[bArr[i24] & 255];
                        if (i30 != 0) {
                            iArr[i28] = i30;
                        } else if (z && bool2 == null) {
                            bool2 = Boolean.TRUE;
                        }
                        i24 += i7;
                        i28++;
                        i9 = i29;
                    }
                }
                bool = bool2;
                i16++;
                i9 = i5;
                i8 = i;
                i10 = i4;
                i15 = i3;
            } else {
                i3 = i2;
            }
            i5 = i9;
            i4 = i10;
            bool = bool2;
            i16++;
            i9 = i5;
            i8 = i;
            i10 = i4;
            i15 = i3;
        }
        Boolean bool3 = bool;
        if (this.s == null) {
            this.s = Boolean.valueOf(bool3 == null ? false : bool3.booleanValue());
        }
    }

    public final void k(pza pzaVar) {
        pza pzaVar2 = pzaVar;
        int[] iArr = this.j;
        int i = pzaVar2.d;
        int i2 = pzaVar2.f30932b;
        int i3 = pzaVar2.c;
        int i4 = pzaVar2.f30931a;
        boolean z = this.f28975k == 0;
        int i5 = this.f28976r;
        byte[] bArr = this.i;
        int[] iArr2 = this.f28973a;
        int i6 = 0;
        byte b2 = -1;
        while (i6 < i) {
            int i7 = (i6 + i2) * i5;
            int i8 = i7 + i4;
            int i9 = i8 + i3;
            int i10 = i7 + i5;
            if (i10 < i9) {
                i9 = i10;
            }
            int i11 = pzaVar2.c * i6;
            int i12 = i8;
            while (i12 < i9) {
                byte b3 = bArr[i11];
                int i13 = i;
                int i14 = b3 & 255;
                if (i14 != b2) {
                    int i15 = iArr2[i14];
                    if (i15 != 0) {
                        iArr[i12] = i15;
                    } else {
                        b2 = b3;
                    }
                }
                i11++;
                i12++;
                i = i13;
            }
            i6++;
            pzaVar2 = pzaVar;
        }
        Boolean bool = this.s;
        this.s = Boolean.valueOf((bool != null && bool.booleanValue()) || (this.s == null && z && b2 != -1));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v10 */
    /* JADX WARN: Type inference failed for: r7v11 */
    /* JADX WARN: Type inference failed for: r7v12 */
    /* JADX WARN: Type inference failed for: r7v15, types: [short] */
    /* JADX WARN: Type inference failed for: r7v17 */
    public final void l(pza pzaVar) {
        int i;
        int i2;
        short s;
        this = this;
        if (pzaVar != null) {
            this.d.position(pzaVar.j);
        }
        if (pzaVar == null) {
            sza szaVar = this.l;
            i = szaVar.f;
            i2 = szaVar.g;
        } else {
            i = pzaVar.c;
            i2 = pzaVar.d;
        }
        int i3 = i * i2;
        byte[] bArr = this.i;
        if (bArr == null || bArr.length < i3) {
            this.i = this.c.a(i3);
        }
        byte[] bArr2 = this.i;
        if (this.f == null) {
            this.f = new short[4096];
        }
        short[] sArr = this.f;
        if (this.g == null) {
            this.g = new byte[4096];
        }
        byte[] bArr3 = this.g;
        if (this.h == null) {
            this.h = new byte[DKFRequestService.s0];
        }
        byte[] bArr4 = this.h;
        int iP = p();
        int i4 = 1 << iP;
        int i5 = i4 + 1;
        int i6 = i4 + 2;
        int i7 = iP + 1;
        int i8 = (1 << i7) - 1;
        int i9 = 0;
        for (int i10 = 0; i10 < i4; i10++) {
            sArr[i10] = 0;
            bArr3[i10] = (byte) i10;
        }
        byte[] bArr5 = this.e;
        int i11 = i7;
        int i12 = i6;
        int i13 = i8;
        int iO = 0;
        int i14 = 0;
        int i15 = 0;
        int i16 = 0;
        int i17 = 0;
        int i18 = 0;
        int i19 = 0;
        int i20 = -1;
        while (i9 < i3) {
            if (iO == 0) {
                iO = o();
                if (iO <= 0) {
                    this.o = 3;
                    break;
                }
                i14 = 0;
            }
            i16 += (bArr5[i14] & 255) << i15;
            i14++;
            iO--;
            int i21 = i15 + 8;
            i12 = i12;
            i11 = i11;
            i20 = i20;
            i7 = i7;
            i18 = i18;
            while (true) {
                if (i21 < i11) {
                    i15 = i21;
                    break;
                }
                int i22 = i6;
                int i23 = i16 & i13;
                i16 >>= i11;
                i21 -= i11;
                if (i23 == i4) {
                    i13 = i8;
                    i11 = i7;
                    i12 = i22;
                    i6 = i12;
                    i20 = -1;
                } else {
                    if (i23 == i5) {
                        i15 = i21;
                        i6 = i22;
                        break;
                    }
                    if (i20 == -1) {
                        bArr2[i17] = bArr3[i23];
                        i17++;
                        i9++;
                        i20 = i23;
                        i18 = i20;
                        i6 = i22;
                        i21 = i21;
                    } else {
                        if (i23 >= i12) {
                            bArr4[i19] = (byte) i18;
                            i19++;
                            s = i20;
                        } else {
                            s = i23;
                        }
                        while (s >= i4) {
                            bArr4[i19] = bArr3[s];
                            i19++;
                            s = sArr[s];
                        }
                        i18 = bArr3[s] & 255;
                        byte b2 = (byte) i18;
                        bArr2[i17] = b2;
                        while (true) {
                            i17++;
                            i9++;
                            if (i19 <= 0) {
                                break;
                            }
                            i19--;
                            bArr2[i17] = bArr4[i19];
                        }
                        byte[] bArr6 = bArr4;
                        if (i12 < 4096) {
                            sArr[i12] = (short) i20;
                            bArr3[i12] = b2;
                            i12++;
                            if ((i12 & i13) == 0 && i12 < 4096) {
                                i11++;
                                i13 += i12;
                            }
                        }
                        i20 = i23;
                        i6 = i22;
                        i21 = i21;
                        bArr4 = bArr6;
                    }
                }
            }
        }
        Arrays.fill(bArr2, i17, i3, (byte) 0);
    }

    public int m(int i) {
        if (i >= 0) {
            sza szaVar = this.l;
            if (i < szaVar.c) {
                return szaVar.e.get(i).i;
            }
        }
        return -1;
    }

    public final Bitmap n() {
        Boolean bool = this.s;
        Bitmap bitmapB = this.c.b(this.f28976r, this.q, (bool == null || bool.booleanValue()) ? Bitmap.Config.ARGB_8888 : this.t);
        bitmapB.setHasAlpha(true);
        return bitmapB;
    }

    public final int o() {
        int iP = p();
        if (iP <= 0) {
            return iP;
        }
        ByteBuffer byteBuffer = this.d;
        byteBuffer.get(this.e, 0, Math.min(iP, byteBuffer.remaining()));
        return iP;
    }

    public final int p() {
        return this.d.get() & 255;
    }

    public synchronized void q(sza szaVar, ByteBuffer byteBuffer, int i) {
        try {
            if (i <= 0) {
                throw new IllegalArgumentException("Sample size must be >=0, not: " + i);
            }
            int iHighestOneBit = Integer.highestOneBit(i);
            this.o = 0;
            this.l = szaVar;
            this.f28975k = -1;
            ByteBuffer byteBufferAsReadOnlyBuffer = byteBuffer.asReadOnlyBuffer();
            this.d = byteBufferAsReadOnlyBuffer;
            byteBufferAsReadOnlyBuffer.position(0);
            this.d.order(ByteOrder.LITTLE_ENDIAN);
            this.n = false;
            Iterator<pza> it = szaVar.e.iterator();
            while (it.hasNext()) {
                if (it.next().g == 3) {
                    this.n = true;
                    break;
                }
            }
            this.p = iHighestOneBit;
            int i2 = szaVar.f;
            this.f28976r = i2 / iHighestOneBit;
            int i3 = szaVar.g;
            this.q = i3 / iHighestOneBit;
            this.i = this.c.a(i2 * i3);
            this.j = this.c.d(this.f28976r * this.q);
        } catch (Throwable th) {
            throw th;
        }
    }

    public final Bitmap r(pza pzaVar, pza pzaVar2) {
        int i;
        int i2;
        Bitmap bitmap;
        int[] iArr = this.j;
        int i3 = 0;
        if (pzaVar2 == null) {
            Bitmap bitmap2 = this.m;
            if (bitmap2 != null) {
                this.c.c(bitmap2);
            }
            this.m = null;
            Arrays.fill(iArr, 0);
        }
        if (pzaVar2 != null && pzaVar2.g == 3 && this.m == null) {
            Arrays.fill(iArr, 0);
        }
        if (pzaVar2 != null && (i2 = pzaVar2.g) > 0) {
            if (i2 == 2) {
                if (!pzaVar.f) {
                    sza szaVar = this.l;
                    int i4 = szaVar.l;
                    if (pzaVar.f30933k == null || szaVar.j != pzaVar.h) {
                        i3 = i4;
                    }
                }
                int i5 = pzaVar2.d;
                int i6 = this.p;
                int i7 = i5 / i6;
                int i8 = pzaVar2.f30932b / i6;
                int i9 = pzaVar2.c / i6;
                int i10 = pzaVar2.f30931a / i6;
                int i11 = this.f28976r;
                int i12 = (i8 * i11) + i10;
                int i13 = (i7 * i11) + i12;
                while (i12 < i13) {
                    int i14 = i12 + i9;
                    for (int i15 = i12; i15 < i14; i15++) {
                        iArr[i15] = i3;
                    }
                    i12 += this.f28976r;
                }
            } else if (i2 == 3 && (bitmap = this.m) != null) {
                int i16 = this.f28976r;
                bitmap.getPixels(iArr, 0, i16, 0, 0, i16, this.q);
            }
        }
        l(pzaVar);
        if (pzaVar.e || this.p != 1) {
            j(pzaVar);
        } else {
            k(pzaVar);
        }
        if (this.n && ((i = pzaVar.g) == 0 || i == 1)) {
            if (this.m == null) {
                this.m = n();
            }
            Bitmap bitmap3 = this.m;
            int i17 = this.f28976r;
            bitmap3.setPixels(iArr, 0, i17, 0, 0, i17, this.q);
        }
        Bitmap bitmapN = n();
        int i18 = this.f28976r;
        bitmapN.setPixels(iArr, 0, i18, 0, 0, i18, this.q);
        return bitmapN;
    }

    public obo(jza.a aVar) {
        this.f28974b = new int[256];
        this.t = Bitmap.Config.ARGB_8888;
        this.c = aVar;
        this.l = new sza();
    }
}
