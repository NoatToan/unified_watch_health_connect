package si;

import android.graphics.Bitmap;
import android.util.Log;
import b71.i;
import com.google.common.primitives.UnsignedBytes;
import com.nimbusds.jose.jwk.JWKParameterNames;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Arrays;
import java.util.Iterator;

/* JADX INFO: loaded from: classes7.dex */
public class e implements a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int[] f159340a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int[] f159341b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final a.InterfaceC3018a f159342c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public ByteBuffer f159343d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public byte[] f159344e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public short[] f159345f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public byte[] f159346g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public byte[] f159347h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public byte[] f159348i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final int[] f159349j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f159350k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public c f159351l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public Bitmap f159352m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final boolean f159353n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f159354o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final int f159355p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final int f159356q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final int f159357r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public Boolean f159358s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public Bitmap.Config f159359t;

    public e(a.InterfaceC3018a interfaceC3018a, c cVar, ByteBuffer byteBuffer, int i14) {
        this(interfaceC3018a);
        synchronized (this) {
            try {
                if (i14 <= 0) {
                    throw new IllegalArgumentException("Sample size must be >=0, not: " + i14);
                }
                int iHighestOneBit = Integer.highestOneBit(i14);
                this.f159354o = 0;
                this.f159351l = cVar;
                this.f159350k = -1;
                ByteBuffer byteBufferAsReadOnlyBuffer = byteBuffer.asReadOnlyBuffer();
                this.f159343d = byteBufferAsReadOnlyBuffer;
                byteBufferAsReadOnlyBuffer.position(0);
                this.f159343d.order(ByteOrder.LITTLE_ENDIAN);
                this.f159353n = false;
                Iterator it = cVar.f159329e.iterator();
                while (it.hasNext()) {
                    if (((b) it.next()).f159320g == 3) {
                        this.f159353n = true;
                        break;
                    }
                }
                this.f159355p = iHighestOneBit;
                int i15 = cVar.f159330f;
                this.f159357r = i15 / iHighestOneBit;
                int i16 = cVar.f159331g;
                this.f159356q = i16 / iHighestOneBit;
                int i17 = i15 * i16;
                xi.b bVar = ((hj.b) this.f159342c).f83922b;
                this.f159348i = bVar == null ? new byte[i17] : (byte[]) bVar.c(i17, byte[].class);
                a.InterfaceC3018a interfaceC3018a2 = this.f159342c;
                int i18 = this.f159357r * this.f159356q;
                xi.b bVar2 = ((hj.b) interfaceC3018a2).f83922b;
                this.f159349j = bVar2 == null ? new int[i18] : (int[]) bVar2.c(i18, int[].class);
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    @Override // si.a
    public final int a() {
        return (this.f159349j.length * 4) + this.f159343d.limit() + this.f159348i.length;
    }

    @Override // si.a
    public final synchronized Bitmap b() {
        try {
            if (this.f159351l.f159327c <= 0 || this.f159350k < 0) {
                if (Log.isLoggable(JWKParameterNames.RSA_EXPONENT, 3)) {
                    int i14 = this.f159351l.f159327c;
                }
                this.f159354o = 1;
            }
            int i15 = this.f159354o;
            if (i15 != 1 && i15 != 2) {
                this.f159354o = 0;
                if (this.f159344e == null) {
                    xi.b bVar = ((hj.b) this.f159342c).f83922b;
                    this.f159344e = bVar == null ? new byte[255] : (byte[]) bVar.c(255, byte[].class);
                }
                b bVar2 = (b) this.f159351l.f159329e.get(this.f159350k);
                int i16 = this.f159350k - 1;
                b bVar3 = i16 >= 0 ? (b) this.f159351l.f159329e.get(i16) : null;
                int[] iArr = bVar2.f159324k;
                if (iArr == null) {
                    iArr = this.f159351l.f159325a;
                }
                this.f159340a = iArr;
                if (iArr == null) {
                    this.f159354o = 1;
                    return null;
                }
                if (bVar2.f159319f) {
                    System.arraycopy(iArr, 0, this.f159341b, 0, iArr.length);
                    int[] iArr2 = this.f159341b;
                    this.f159340a = iArr2;
                    iArr2[bVar2.f159321h] = 0;
                    if (bVar2.f159320g == 2 && this.f159350k == 0) {
                        this.f159358s = Boolean.TRUE;
                    }
                }
                return h(bVar2, bVar3);
            }
            return null;
        } catch (Throwable th3) {
            throw th3;
        }
    }

    @Override // si.a
    public final int c() {
        return this.f159351l.f159327c;
    }

    @Override // si.a
    public final void clear() {
        xi.b bVar;
        xi.b bVar2;
        xi.b bVar3;
        this.f159351l = null;
        byte[] bArr = this.f159348i;
        a.InterfaceC3018a interfaceC3018a = this.f159342c;
        if (bArr != null && (bVar3 = ((hj.b) interfaceC3018a).f83922b) != null) {
            bVar3.put(bArr);
        }
        int[] iArr = this.f159349j;
        if (iArr != null && (bVar2 = ((hj.b) interfaceC3018a).f83922b) != null) {
            bVar2.put(iArr);
        }
        Bitmap bitmap = this.f159352m;
        if (bitmap != null) {
            ((hj.b) interfaceC3018a).f83921a.c(bitmap);
        }
        this.f159352m = null;
        this.f159343d = null;
        this.f159358s = null;
        byte[] bArr2 = this.f159344e;
        if (bArr2 == null || (bVar = ((hj.b) interfaceC3018a).f83922b) == null) {
            return;
        }
        bVar.put(bArr2);
    }

    @Override // si.a
    public final int d() {
        int i14;
        c cVar = this.f159351l;
        int i15 = cVar.f159327c;
        if (i15 <= 0 || (i14 = this.f159350k) < 0) {
            return 0;
        }
        if (i14 < 0 || i14 >= i15) {
            return -1;
        }
        return ((b) cVar.f159329e.get(i14)).f159322i;
    }

    @Override // si.a
    public final int e() {
        return this.f159350k;
    }

    @Override // si.a
    public final void f() {
        this.f159350k = (this.f159350k + 1) % this.f159351l.f159327c;
    }

    public final Bitmap g() {
        Boolean bool = this.f159358s;
        Bitmap bitmapD = ((hj.b) this.f159342c).f83921a.d(this.f159357r, this.f159356q, (bool == null || bool.booleanValue()) ? Bitmap.Config.ARGB_8888 : this.f159359t);
        bitmapD.setHasAlpha(true);
        return bitmapD;
    }

    @Override // si.a
    public final ByteBuffer getData() {
        return this.f159343d;
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0048  */
    /* JADX WARN: Code duplicated, block: B:98:0x01dd A[PHI: r5
      0x01dd: PHI (r5v24 int) = (r5v18 int), (r5v26 int), (r5v26 int) binds: [B:93:0x01c9, B:95:0x01d4, B:96:0x01d6] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v22 */
    /* JADX WARN: Type inference failed for: r6v23 */
    /* JADX WARN: Type inference failed for: r6v24 */
    /* JADX WARN: Type inference failed for: r6v31, types: [short] */
    /* JADX WARN: Type inference failed for: r6v33 */
    public final Bitmap h(b bVar, b bVar2) {
        byte b14;
        int i14;
        int i15;
        int i16;
        int[] iArr;
        int i17;
        int i18;
        short s8;
        int i19;
        Bitmap bitmap;
        int i24;
        a.InterfaceC3018a interfaceC3018a = this.f159342c;
        byte b15 = 0;
        int[] iArr2 = this.f159349j;
        if (bVar2 == null) {
            Bitmap bitmap2 = this.f159352m;
            if (bitmap2 != null) {
                ((hj.b) interfaceC3018a).f83921a.c(bitmap2);
            }
            this.f159352m = null;
            Arrays.fill(iArr2, 0);
        }
        if (bVar2 != null && bVar2.f159320g == 3 && this.f159352m == null) {
            Arrays.fill(iArr2, 0);
        }
        if (bVar2 != null && (i19 = bVar2.f159320g) > 0) {
            if (i19 == 2) {
                if (bVar.f159319f) {
                    i24 = 0;
                } else {
                    c cVar = this.f159351l;
                    i24 = cVar.f159335k;
                    if (bVar.f159324k != null && cVar.f159334j == bVar.f159321h) {
                        i24 = 0;
                    }
                }
                int i25 = bVar2.f159317d;
                int i26 = this.f159355p;
                int i27 = i25 / i26;
                int i28 = bVar2.f159315b / i26;
                int i29 = bVar2.f159316c / i26;
                int i30 = bVar2.f159314a / i26;
                int i34 = this.f159357r;
                int i35 = (i28 * i34) + i30;
                int i36 = (i27 * i34) + i35;
                while (i35 < i36) {
                    int i37 = i35 + i29;
                    for (int i38 = i35; i38 < i37; i38++) {
                        iArr2[i38] = i24;
                    }
                    i35 += this.f159357r;
                }
            } else if (i19 == 3 && (bitmap = this.f159352m) != null) {
                int i39 = this.f159356q;
                int i44 = this.f159357r;
                bitmap.getPixels(iArr2, 0, i44, 0, 0, i44, i39);
            }
        }
        this.f159343d.position(bVar.f159323j);
        int i45 = bVar.f159316c * bVar.f159317d;
        byte[] bArr = this.f159348i;
        if (bArr == null || bArr.length < i45) {
            xi.b bVar3 = ((hj.b) interfaceC3018a).f83922b;
            this.f159348i = bVar3 == null ? new byte[i45] : (byte[]) bVar3.c(i45, byte[].class);
        }
        byte[] bArr2 = this.f159348i;
        if (this.f159345f == null) {
            this.f159345f = new short[4096];
        }
        short[] sArr = this.f159345f;
        if (this.f159346g == null) {
            this.f159346g = new byte[4096];
        }
        byte[] bArr3 = this.f159346g;
        if (this.f159347h == null) {
            this.f159347h = new byte[4097];
        }
        byte[] bArr4 = this.f159347h;
        int i46 = this.f159343d.get() & UnsignedBytes.MAX_VALUE;
        int i47 = 1;
        int i48 = 1 << i46;
        int i49 = i48 + 1;
        int i54 = i48 + 2;
        int i55 = i46 + 1;
        int i56 = (1 << i55) - 1;
        int i57 = 0;
        while (i57 < i48) {
            sArr[i57] = 0;
            bArr3[i57] = (byte) i57;
            i57++;
            i47 = i47;
        }
        int i58 = i47;
        byte[] bArr5 = this.f159344e;
        int i59 = 0;
        int i64 = 0;
        int i65 = 0;
        int i66 = 0;
        int i67 = 0;
        int i68 = 0;
        int i69 = 0;
        int i74 = 0;
        int i75 = i55;
        int i76 = i54;
        int i77 = i56;
        int i78 = -1;
        while (true) {
            if (i59 >= i45) {
                iArr2 = iArr2;
                b14 = b15;
                break;
            }
            if (i64 == 0) {
                i18 = -1;
                int i79 = this.f159343d.get() & UnsignedBytes.MAX_VALUE;
                if (i79 > 0) {
                    ByteBuffer byteBuffer = this.f159343d;
                    byteBuffer.get(this.f159344e, 0, Math.min(i79, byteBuffer.remaining()));
                }
                if (i79 <= 0) {
                    this.f159354o = 3;
                    b14 = 0;
                    break;
                }
                i64 = i79;
                i65 = 0;
            } else {
                sArr = sArr;
                iArr2 = iArr2;
                i18 = -1;
            }
            i67 += (bArr5[i65] & UnsignedBytes.MAX_VALUE) << i66;
            i65++;
            i64--;
            i66 += 8;
            i76 = i76;
            int i84 = i75;
            i78 = i78;
            i69 = i69;
            while (true) {
                i66 = i66;
                if (i66 < i84) {
                    i75 = i84;
                    b15 = 0;
                    break;
                }
                int i85 = i67 & i77;
                i67 >>= i84;
                i66 -= i84;
                if (i85 == i48) {
                    i84 = i55;
                    i76 = i54;
                    i77 = i56;
                    i66 = i66;
                    i78 = i18;
                } else {
                    if (i85 == i49) {
                        i75 = i84;
                        b15 = 0;
                        break;
                    }
                    int i86 = i84;
                    if (i78 == i18) {
                        bArr2[i68] = bArr3[i85];
                        i68++;
                        i59++;
                        i78 = i85;
                        i69 = i78;
                        i84 = i86;
                    } else {
                        if (i85 >= i76) {
                            bArr4[i74] = (byte) i69;
                            i74++;
                            s8 = i78;
                        } else {
                            s8 = i85;
                        }
                        while (s8 >= i48) {
                            bArr4[i74] = bArr3[s8];
                            i74++;
                            s8 = sArr[s8];
                        }
                        i69 = bArr3[s8] & UnsignedBytes.MAX_VALUE;
                        byte b16 = (byte) i69;
                        bArr2[i68] = b16;
                        while (true) {
                            i68++;
                            i59++;
                            if (i74 <= 0) {
                                break;
                            }
                            i74--;
                            bArr2[i68] = bArr4[i74];
                        }
                        if (i76 < 4096) {
                            sArr[i76] = (short) i78;
                            bArr3[i76] = b16;
                            i76++;
                            if ((i76 & i77) != 0 || i76 >= 4096) {
                                i84 = i86;
                            } else {
                                i84 = i86 + 1;
                                i77 += i76;
                            }
                        } else {
                            i84 = i86;
                        }
                        i78 = i85;
                    }
                    i18 = -1;
                }
            }
        }
        Arrays.fill(bArr2, i68, i45, b14);
        if (bVar.f159318e || this.f159355p != i58) {
            int i87 = bVar.f159317d;
            int i88 = this.f159355p;
            int i89 = i87 / i88;
            int i93 = bVar.f159315b / i88;
            int i94 = bVar.f159316c / i88;
            int i95 = bVar.f159314a / i88;
            boolean z14 = this.f159350k == 0;
            byte[] bArr6 = this.f159348i;
            int[] iArr3 = this.f159340a;
            Boolean bool = this.f159358s;
            int i96 = 8;
            int i97 = 0;
            int i98 = 1;
            int i99 = 0;
            while (i99 < i89) {
                if (bVar.f159318e) {
                    if (i97 >= i89) {
                        i98++;
                        if (i98 == 2) {
                            i97 = 4;
                        } else if (i98 == 3) {
                            i96 = 4;
                            i97 = 2;
                        } else if (i98 == 4) {
                            i97 = 1;
                            i96 = 2;
                        }
                    }
                    i14 = i97 + i96;
                } else {
                    i14 = i97;
                    i97 = i99;
                }
                int i100 = i97 + i93;
                int i101 = i89;
                boolean z15 = i88 == 1;
                if (i100 < this.f159356q) {
                    int i102 = this.f159357r;
                    int i103 = i100 * i102;
                    int i104 = i103 + i95;
                    int i105 = i104 + i94;
                    int i106 = i103 + i102;
                    if (i106 < i105) {
                        i105 = i106;
                    }
                    int i107 = i99 * i88 * bVar.f159316c;
                    int[] iArr4 = this.f159349j;
                    if (z15) {
                        while (i104 < i105) {
                            int i108 = i104;
                            int i109 = iArr3[bArr6[i107] & UnsignedBytes.MAX_VALUE];
                            if (i109 != 0) {
                                iArr4[i108] = i109;
                            } else if (z14 && bool == null) {
                                bool = Boolean.TRUE;
                            }
                            i107 += i88;
                            i104 = i108 + 1;
                        }
                    } else {
                        int iB = i.b(i105, i104, i88, i107);
                        while (i104 < i105) {
                            int i110 = i104;
                            int i111 = bVar.f159316c;
                            int i112 = i88;
                            int i113 = i107;
                            int i114 = 0;
                            int i115 = 0;
                            int i116 = 0;
                            int i117 = 0;
                            int i118 = 0;
                            while (true) {
                                if (i113 >= this.f159355p + i107) {
                                    i16 = i105;
                                    break;
                                }
                                byte[] bArr7 = this.f159348i;
                                i16 = i105;
                                if (i113 >= bArr7.length || i113 >= iB) {
                                    break;
                                }
                                int i119 = this.f159340a[bArr7[i113] & UnsignedBytes.MAX_VALUE];
                                if (i119 != 0) {
                                    i114 += (i119 >> 24) & 255;
                                    i115 += (i119 >> 16) & 255;
                                    i116 += (i119 >> 8) & 255;
                                    i117 += i119 & 255;
                                    i118++;
                                }
                                i113++;
                                i105 = i16;
                            }
                            int i120 = i107 + i111;
                            int i121 = i120;
                            while (i121 < this.f159355p + i120) {
                                byte[] bArr8 = this.f159348i;
                                int i122 = i120;
                                if (i121 >= bArr8.length || i121 >= iB) {
                                    break;
                                }
                                int i123 = this.f159340a[bArr8[i121] & UnsignedBytes.MAX_VALUE];
                                if (i123 != 0) {
                                    i114 += (i123 >> 24) & 255;
                                    i115 += (i123 >> 16) & 255;
                                    i116 += (i123 >> 8) & 255;
                                    i117 += i123 & 255;
                                    i118++;
                                }
                                i121++;
                                i120 = i122;
                            }
                            int i124 = i118 == 0 ? 0 : ((i114 / i118) << 24) | ((i115 / i118) << 16) | ((i116 / i118) << 8) | (i117 / i118);
                            if (i124 != 0) {
                                iArr4[i110] = i124;
                            } else if (z14 && bool == null) {
                                bool = Boolean.TRUE;
                            }
                            i107 += i112;
                            i104 = i110 + 1;
                            i88 = i112;
                            i105 = i16;
                        }
                    }
                    i15 = i88;
                } else {
                    i15 = i88;
                }
                i99++;
                i97 = i14;
                i89 = i101;
                i94 = i94;
                i93 = i93;
                i88 = i15;
            }
            if (this.f159358s == null) {
                this.f159358s = Boolean.valueOf(bool == null ? false : bool.booleanValue());
            }
        } else {
            int i125 = bVar.f159317d;
            int i126 = bVar.f159315b;
            int i127 = bVar.f159316c;
            int i128 = bVar.f159314a;
            byte b17 = this.f159350k == 0 ? (byte) 1 : b14;
            byte[] bArr9 = this.f159348i;
            int[] iArr5 = this.f159340a;
            byte b18 = -1;
            for (int i129 = b14; i129 < i125; i129++) {
                int i130 = this.f159357r;
                int i131 = (i129 + i126) * i130;
                int i132 = i131 + i128;
                int i133 = i132 + i127;
                int i134 = i131 + i130;
                if (i134 < i133) {
                    i133 = i134;
                }
                int i135 = bVar.f159316c * i129;
                while (i132 < i133) {
                    byte b19 = bArr9[i135];
                    int i136 = b19 & UnsignedBytes.MAX_VALUE;
                    if (i136 != b18) {
                        int i137 = iArr5[i136];
                        if (i137 != 0) {
                            this.f159349j[i132] = i137;
                        } else {
                            b18 = b19;
                        }
                    }
                    i135++;
                    i132++;
                }
            }
            Boolean bool2 = this.f159358s;
            this.f159358s = Boolean.valueOf((bool2 != null && bool2.booleanValue()) || !(this.f159358s != null || b17 == 0 || b18 == -1));
        }
        if (this.f159353n && ((i17 = bVar.f159320g) == 0 || i17 == 1)) {
            if (this.f159352m == null) {
                this.f159352m = g();
            }
            Bitmap bitmap3 = this.f159352m;
            int i138 = this.f159356q;
            int i139 = this.f159357r;
            iArr = iArr2;
            bitmap3.setPixels(iArr, 0, i139, 0, 0, i139, i138);
        } else {
            iArr = iArr2;
        }
        Bitmap bitmapG = g();
        int i140 = this.f159356q;
        int i141 = this.f159357r;
        bitmapG.setPixels(iArr, 0, i141, 0, 0, i141, i140);
        return bitmapG;
    }

    public e(a.InterfaceC3018a interfaceC3018a, c cVar, ByteBuffer byteBuffer) {
        this(interfaceC3018a, cVar, byteBuffer, 1);
    }

    public e(a.InterfaceC3018a interfaceC3018a) {
        this.f159341b = new int[256];
        this.f159359t = Bitmap.Config.ARGB_8888;
        this.f159342c = interfaceC3018a;
        this.f159351l = new c();
    }
}
