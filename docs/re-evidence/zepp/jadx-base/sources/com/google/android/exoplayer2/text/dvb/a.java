package com.google.android.exoplayer2.text.dvb;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.util.SparseArray;
import androidx.annotation.Nullable;
import com.fasterxml.jackson.core.json.ByteSourceJsonBootstrapper;
import com.google.android.exoplayer2.text.Cue;
import com.google.android.exoplayer2.util.Log;
import com.google.android.exoplayer2.util.ParsableBitArray;
import com.google.android.exoplayer2.util.Util;
import com.xiaomi.hm.health.bt.model.HMDisplaySetting;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
final class a {
    private static final String h = "DvbParser";
    private static final int i = 16;
    private static final int j = 17;
    private static final int k = 18;
    private static final int l = 19;
    private static final int m = 20;
    private static final int n = 0;
    private static final int o = 2;
    private static final int p = 3;
    private static final int q = 0;
    private static final int r = 1;
    private static final int s = 16;
    private static final int t = 17;
    private static final int u = 18;
    private static final int v = 32;
    private static final int w = 33;
    private static final int x = 34;
    private static final int y = 240;
    private final Paint a;
    private final Paint b;
    private final Canvas c;
    private final b d;
    private final C0154a e;
    private final h f;
    private Bitmap g;
    private static final byte[] z = {0, 7, 8, 15};
    private static final byte[] A = {0, 119, -120, -1};
    private static final byte[] B = {0, 17, HMDisplaySetting.TYPE_HAWK_SWK, HMDisplaySetting.TYPE_VENICE, org.threeten.bp.a.n, 85, 102, 119, -120, -103, -86, ByteSourceJsonBootstrapper.UTF8_BOM_2, -52, -35, -18, -1};

    /* JADX INFO: renamed from: com.google.android.exoplayer2.text.dvb.a$a, reason: collision with other inner class name */
    public static final class C0154a {
        public final int a;
        public final int[] b;
        public final int[] c;
        public final int[] d;

        public C0154a(int id, int[] clutEntries2Bit, int[] clutEntries4Bit, int[] clutEntries8bit) {
            this.a = id;
            this.b = clutEntries2Bit;
            this.c = clutEntries4Bit;
            this.d = clutEntries8bit;
        }
    }

    public static final class b {
        public final int a;
        public final int b;
        public final int c;
        public final int d;
        public final int e;
        public final int f;

        public b(int width, int height, int horizontalPositionMinimum, int horizontalPositionMaximum, int verticalPositionMinimum, int verticalPositionMaximum) {
            this.a = width;
            this.b = height;
            this.c = horizontalPositionMinimum;
            this.d = horizontalPositionMaximum;
            this.e = verticalPositionMinimum;
            this.f = verticalPositionMaximum;
        }
    }

    public static final class c {
        public final int a;
        public final boolean b;
        public final byte[] c;
        public final byte[] d;

        public c(int id, boolean nonModifyingColorFlag, byte[] topFieldData, byte[] bottomFieldData) {
            this.a = id;
            this.b = nonModifyingColorFlag;
            this.c = topFieldData;
            this.d = bottomFieldData;
        }
    }

    public static final class d {
        public final int a;
        public final int b;
        public final int c;
        public final SparseArray<e> d;

        public d(int timeoutSecs, int version, int state, SparseArray<e> regions) {
            this.a = timeoutSecs;
            this.b = version;
            this.c = state;
            this.d = regions;
        }
    }

    public static final class e {
        public final int a;
        public final int b;

        public e(int horizontalAddress, int verticalAddress) {
            this.a = horizontalAddress;
            this.b = verticalAddress;
        }
    }

    public static final class f {
        public final int a;
        public final boolean b;
        public final int c;
        public final int d;
        public final int e;
        public final int f;
        public final int g;
        public final int h;
        public final int i;
        public final int j;
        public final SparseArray<g> k;

        public f(int id, boolean fillFlag, int width, int height, int levelOfCompatibility, int depth, int clutId, int pixelCode8Bit, int pixelCode4Bit, int pixelCode2Bit, SparseArray<g> regionObjects) {
            this.a = id;
            this.b = fillFlag;
            this.c = width;
            this.d = height;
            this.e = levelOfCompatibility;
            this.f = depth;
            this.g = clutId;
            this.h = pixelCode8Bit;
            this.i = pixelCode4Bit;
            this.j = pixelCode2Bit;
            this.k = regionObjects;
        }

        public void a(f otherRegionComposition) {
            SparseArray<g> sparseArray = otherRegionComposition.k;
            for (int i = 0; i < sparseArray.size(); i++) {
                this.k.put(sparseArray.keyAt(i), sparseArray.valueAt(i));
            }
        }
    }

    public static final class g {
        public final int a;
        public final int b;
        public final int c;
        public final int d;
        public final int e;
        public final int f;

        public g(int type, int provider, int horizontalPosition, int verticalPosition, int foregroundPixelCode, int backgroundPixelCode) {
            this.a = type;
            this.b = provider;
            this.c = horizontalPosition;
            this.d = verticalPosition;
            this.e = foregroundPixelCode;
            this.f = backgroundPixelCode;
        }
    }

    public static final class h {
        public final int a;
        public final int b;
        public final SparseArray<f> c = new SparseArray<>();
        public final SparseArray<C0154a> d = new SparseArray<>();
        public final SparseArray<c> e = new SparseArray<>();
        public final SparseArray<C0154a> f = new SparseArray<>();
        public final SparseArray<c> g = new SparseArray<>();

        @Nullable
        public b h;

        @Nullable
        public d i;

        public h(int subtitlePageId, int ancillaryPageId) {
            this.a = subtitlePageId;
            this.b = ancillaryPageId;
        }

        public void a() {
            this.c.clear();
            this.d.clear();
            this.e.clear();
            this.f.clear();
            this.g.clear();
            this.h = null;
            this.i = null;
        }
    }

    public a(int subtitlePageId, int ancillaryPageId) {
        Paint paint = new Paint();
        this.a = paint;
        paint.setStyle(Paint.Style.FILL_AND_STROKE);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC));
        paint.setPathEffect(null);
        Paint paint2 = new Paint();
        this.b = paint2;
        paint2.setStyle(Paint.Style.FILL);
        paint2.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OVER));
        paint2.setPathEffect(null);
        this.c = new Canvas();
        this.d = new b(719, 575, 0, 719, 0, 575);
        this.e = new C0154a(0, c(), d(), e());
        this.f = new h(subtitlePageId, ancillaryPageId);
    }

    private static byte[] a(int length, int bitsPerEntry, ParsableBitArray data) {
        byte[] bArr = new byte[length];
        for (int i2 = 0; i2 < length; i2++) {
            bArr[i2] = (byte) data.readBits(bitsPerEntry);
        }
        return bArr;
    }

    private static int[] c() {
        return new int[]{0, -1, -16777216, -8421505};
    }

    private static int[] d() {
        int[] iArr = new int[16];
        iArr[0] = 0;
        for (int i2 = 1; i2 < 16; i2++) {
            if (i2 < 8) {
                iArr[i2] = f(255, (i2 & 1) != 0 ? 255 : 0, (i2 & 2) != 0 ? 255 : 0, (i2 & 4) != 0 ? 255 : 0);
            } else {
                iArr[i2] = f(255, (i2 & 1) != 0 ? 127 : 0, (i2 & 2) != 0 ? 127 : 0, (i2 & 4) == 0 ? 0 : 127);
            }
        }
        return iArr;
    }

    private static int[] e() {
        int[] iArr = new int[256];
        iArr[0] = 0;
        for (int i2 = 0; i2 < 256; i2++) {
            if (i2 < 8) {
                iArr[i2] = f(63, (i2 & 1) != 0 ? 255 : 0, (i2 & 2) != 0 ? 255 : 0, (i2 & 4) == 0 ? 0 : 255);
            } else {
                int i3 = i2 & 136;
                if (i3 == 0) {
                    iArr[i2] = f(255, ((i2 & 1) != 0 ? 85 : 0) + ((i2 & 16) != 0 ? 170 : 0), ((i2 & 2) != 0 ? 85 : 0) + ((i2 & 32) != 0 ? 170 : 0), ((i2 & 4) == 0 ? 0 : 85) + ((i2 & 64) == 0 ? 0 : 170));
                } else if (i3 == 8) {
                    iArr[i2] = f(127, ((i2 & 1) != 0 ? 85 : 0) + ((i2 & 16) != 0 ? 170 : 0), ((i2 & 2) != 0 ? 85 : 0) + ((i2 & 32) != 0 ? 170 : 0), ((i2 & 4) == 0 ? 0 : 85) + ((i2 & 64) == 0 ? 0 : 170));
                } else if (i3 == 128) {
                    iArr[i2] = f(255, ((i2 & 1) != 0 ? 43 : 0) + 127 + ((i2 & 16) != 0 ? 85 : 0), ((i2 & 2) != 0 ? 43 : 0) + 127 + ((i2 & 32) != 0 ? 85 : 0), ((i2 & 4) == 0 ? 0 : 43) + 127 + ((i2 & 64) == 0 ? 0 : 85));
                } else if (i3 == 136) {
                    iArr[i2] = f(255, ((i2 & 1) != 0 ? 43 : 0) + ((i2 & 16) != 0 ? 85 : 0), ((i2 & 2) != 0 ? 43 : 0) + ((i2 & 32) != 0 ? 85 : 0), ((i2 & 4) == 0 ? 0 : 43) + ((i2 & 64) == 0 ? 0 : 85));
                }
            }
        }
        return iArr;
    }

    private static int f(int a, int r2, int g2, int b2) {
        return (a << 24) | (r2 << 16) | (g2 << 8) | b2;
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0063 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:28:0x0067  */
    /* JADX WARN: Code duplicated, block: B:33:0x0083 A[LOOP:0: B:3:0x0009->B:33:0x0083, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:34:0x0082 A[SYNTHETIC] */
    private static int g(ParsableBitArray data, int[] clutEntries, @Nullable byte[] clutMapTable, int column, int line, @Nullable Paint paint, Canvas canvas) {
        int i2;
        int bits;
        int bits2;
        int i3 = column;
        boolean z2 = false;
        while (true) {
            int bits3 = data.readBits(2);
            if (bits3 == 0) {
                if (data.readBit()) {
                    bits = data.readBits(3) + 3;
                    bits2 = data.readBits(2);
                } else {
                    if (data.readBit()) {
                        bits3 = 0;
                    } else {
                        int bits4 = data.readBits(2);
                        if (bits4 == 0) {
                            bits3 = 0;
                            z2 = true;
                        } else if (bits4 == 1) {
                            z2 = z2;
                            bits3 = 0;
                            i2 = 2;
                        } else if (bits4 == 2) {
                            bits = data.readBits(4) + 12;
                            bits2 = data.readBits(2);
                        } else if (bits4 != 3) {
                            z2 = z2;
                            bits3 = 0;
                        } else {
                            bits = data.readBits(8) + 29;
                            bits2 = data.readBits(2);
                        }
                        i2 = 0;
                    }
                    if (i2 != 0 && paint != null) {
                        if (clutMapTable != null) {
                            bits3 = clutMapTable[bits3];
                        }
                        paint.setColor(clutEntries[bits3]);
                        canvas.drawRect(i3, line, i3 + i2, line + 1, paint);
                    }
                    i3 += i2;
                    if (z2) {
                        return i3;
                    }
                    z2 = z2;
                }
                z2 = z2;
                i2 = bits;
                bits3 = bits2;
                if (i2 != 0) {
                    if (clutMapTable != null) {
                        bits3 = clutMapTable[bits3];
                    }
                    paint.setColor(clutEntries[bits3]);
                    canvas.drawRect(i3, line, i3 + i2, line + 1, paint);
                }
                i3 += i2;
                if (z2) {
                    return i3;
                }
                z2 = z2;
            }
            i2 = 1;
            if (i2 != 0) {
                if (clutMapTable != null) {
                    bits3 = clutMapTable[bits3];
                }
                paint.setColor(clutEntries[bits3]);
                canvas.drawRect(i3, line, i3 + i2, line + 1, paint);
            }
            i3 += i2;
            if (z2) {
                return i3;
            }
            z2 = z2;
        }
    }

    /* JADX WARN: Code duplicated, block: B:31:0x0074  */
    /* JADX WARN: Code duplicated, block: B:36:0x008e A[LOOP:0: B:3:0x0009->B:36:0x008e, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:37:0x008d A[SYNTHETIC] */
    private static int h(ParsableBitArray data, int[] clutEntries, @Nullable byte[] clutMapTable, int column, int line, @Nullable Paint paint, Canvas canvas) {
        int i2;
        int bits;
        int i3 = column;
        boolean z2 = false;
        while (true) {
            int bits2 = data.readBits(4);
            if (bits2 == 0) {
                if (data.readBit()) {
                    if (data.readBit()) {
                        int bits3 = data.readBits(2);
                        if (bits3 == 0) {
                            bits2 = 0;
                        } else if (bits3 == 1) {
                            z2 = z2;
                            bits2 = 0;
                            i2 = 2;
                        } else if (bits3 == 2) {
                            bits = data.readBits(4) + 9;
                            bits2 = data.readBits(4);
                        } else if (bits3 != 3) {
                            z2 = z2;
                            bits2 = 0;
                            i2 = 0;
                        } else {
                            bits = data.readBits(8) + 25;
                            bits2 = data.readBits(4);
                        }
                    } else {
                        bits = data.readBits(2) + 4;
                        bits2 = data.readBits(4);
                    }
                    z2 = z2;
                    i2 = bits;
                } else {
                    int bits4 = data.readBits(3);
                    if (bits4 != 0) {
                        z2 = z2;
                        i2 = bits4 + 2;
                        bits2 = 0;
                    } else {
                        bits2 = 0;
                        z2 = true;
                        i2 = 0;
                    }
                }
                if (i2 != 0 && paint != null) {
                    if (clutMapTable != null) {
                        bits2 = clutMapTable[bits2];
                    }
                    paint.setColor(clutEntries[bits2]);
                    canvas.drawRect(i3, line, i3 + i2, line + 1, paint);
                }
                i3 += i2;
                if (z2) {
                    return i3;
                }
                z2 = z2;
            }
            i2 = 1;
            if (i2 != 0) {
                if (clutMapTable != null) {
                    bits2 = clutMapTable[bits2];
                }
                paint.setColor(clutEntries[bits2]);
                canvas.drawRect(i3, line, i3 + i2, line + 1, paint);
            }
            i3 += i2;
            if (z2) {
                return i3;
            }
            z2 = z2;
        }
    }

    private static int i(ParsableBitArray data, int[] clutEntries, @Nullable byte[] clutMapTable, int column, int line, @Nullable Paint paint, Canvas canvas) {
        boolean z2;
        int bits;
        int i2 = column;
        boolean z3 = false;
        while (true) {
            int bits2 = data.readBits(8);
            if (bits2 != 0) {
                z2 = z3;
                bits = 1;
            } else if (data.readBit()) {
                z2 = z3;
                bits = data.readBits(7);
                bits2 = data.readBits(8);
            } else {
                int bits3 = data.readBits(7);
                if (bits3 != 0) {
                    z2 = z3;
                    bits = bits3;
                    bits2 = 0;
                } else {
                    bits2 = 0;
                    z2 = true;
                    bits = 0;
                }
            }
            if (bits != 0 && paint != null) {
                if (clutMapTable != null) {
                    bits2 = clutMapTable[bits2];
                }
                paint.setColor(clutEntries[bits2]);
                canvas.drawRect(i2, line, i2 + bits, line + 1, paint);
            }
            i2 += bits;
            if (z2) {
                return i2;
            }
            z3 = z2;
        }
    }

    private static void j(byte[] pixelData, int[] clutEntries, int regionDepth, int horizontalAddress, int verticalAddress, @Nullable Paint paint, Canvas canvas) {
        byte[] bArr;
        byte[] bArr2;
        ParsableBitArray parsableBitArray = new ParsableBitArray(pixelData);
        int iG = horizontalAddress;
        int i2 = verticalAddress;
        byte[] bArrA = null;
        byte[] bArrA2 = null;
        byte[] bArrA3 = null;
        while (parsableBitArray.bitsLeft() != 0) {
            int bits = parsableBitArray.readBits(8);
            if (bits != 240) {
                switch (bits) {
                    case 16:
                        if (regionDepth != 3) {
                            if (regionDepth == 2) {
                                bArr2 = bArrA3 == null ? z : bArrA3;
                            } else {
                                bArr = null;
                            }
                            iG = g(parsableBitArray, clutEntries, bArr, iG, i2, paint, canvas);
                            parsableBitArray.byteAlign();
                        } else {
                            bArr2 = bArrA == null ? A : bArrA;
                        }
                        bArr = bArr2;
                        iG = g(parsableBitArray, clutEntries, bArr, iG, i2, paint, canvas);
                        parsableBitArray.byteAlign();
                        break;
                    case 17:
                        iG = h(parsableBitArray, clutEntries, regionDepth == 3 ? bArrA2 == null ? B : bArrA2 : null, iG, i2, paint, canvas);
                        parsableBitArray.byteAlign();
                        break;
                    case 18:
                        iG = i(parsableBitArray, clutEntries, null, iG, i2, paint, canvas);
                        break;
                    default:
                        switch (bits) {
                            case 32:
                                bArrA3 = a(4, 4, parsableBitArray);
                                break;
                            case 33:
                                bArrA = a(4, 8, parsableBitArray);
                                break;
                            case 34:
                                bArrA2 = a(16, 8, parsableBitArray);
                                break;
                        }
                        break;
                }
            } else {
                i2 += 2;
                iG = horizontalAddress;
            }
        }
    }

    private static void k(c objectData, C0154a clutDefinition, int regionDepth, int horizontalAddress, int verticalAddress, @Nullable Paint paint, Canvas canvas) {
        int[] iArr;
        if (regionDepth == 3) {
            iArr = clutDefinition.d;
        } else {
            iArr = regionDepth == 2 ? clutDefinition.c : clutDefinition.b;
        }
        int[] iArr2 = iArr;
        j(objectData.c, iArr2, regionDepth, horizontalAddress, verticalAddress, paint, canvas);
        j(objectData.d, iArr2, regionDepth, horizontalAddress, verticalAddress + 1, paint, canvas);
    }

    private static C0154a l(ParsableBitArray data, int length) {
        int[] iArr;
        int bits;
        int i2;
        int bits2;
        int bits3;
        int bits4;
        int i3 = 8;
        int bits5 = data.readBits(8);
        data.skipBits(8);
        int i4 = 2;
        int i5 = length - 2;
        int[] iArrC = c();
        int[] iArrD = d();
        int[] iArrE = e();
        while (i5 > 0) {
            int bits6 = data.readBits(i3);
            int bits7 = data.readBits(i3);
            int i6 = i5 - 2;
            if ((bits7 & 128) != 0) {
                iArr = iArrC;
            } else {
                iArr = (bits7 & 64) != 0 ? iArrD : iArrE;
            }
            if ((bits7 & 1) != 0) {
                bits3 = data.readBits(i3);
                bits4 = data.readBits(i3);
                bits = data.readBits(i3);
                bits2 = data.readBits(i3);
                i2 = i6 - 4;
            } else {
                int bits8 = data.readBits(6) << i4;
                int bits9 = data.readBits(4) << 4;
                bits = data.readBits(4) << 4;
                i2 = i6 - 2;
                bits2 = data.readBits(i4) << 6;
                bits3 = bits8;
                bits4 = bits9;
            }
            if (bits3 == 0) {
                bits4 = 0;
                bits = 0;
                bits2 = 255;
            }
            double d2 = bits3;
            double d3 = bits4 + com.alipay.sdk.m.n.a.g;
            double d4 = bits + com.alipay.sdk.m.n.a.g;
            iArr[bits6] = f((byte) (255 - (bits2 & 255)), Util.constrainValue((int) (d2 + (1.402d * d3)), 0, 255), Util.constrainValue((int) ((d2 - (0.34414d * d4)) - (d3 * 0.71414d)), 0, 255), Util.constrainValue((int) (d2 + (d4 * 1.772d)), 0, 255));
            i5 = i2;
            bits5 = bits5;
            i3 = 8;
            i4 = 2;
        }
        return new C0154a(bits5, iArrC, iArrD, iArrE);
    }

    private static b m(ParsableBitArray data) {
        int i2;
        int bits;
        int i3;
        int i4;
        data.skipBits(4);
        boolean bit = data.readBit();
        data.skipBits(3);
        int bits2 = data.readBits(16);
        int bits3 = data.readBits(16);
        if (bit) {
            int bits4 = data.readBits(16);
            int bits5 = data.readBits(16);
            int bits6 = data.readBits(16);
            bits = data.readBits(16);
            i2 = bits5;
            i4 = bits6;
            i3 = bits4;
        } else {
            i2 = bits2;
            bits = bits3;
            i3 = 0;
            i4 = 0;
        }
        return new b(bits2, bits3, i3, i2, i4, bits);
    }

    private static c n(ParsableBitArray data) {
        byte[] bArr;
        int bits = data.readBits(16);
        data.skipBits(4);
        int bits2 = data.readBits(2);
        boolean bit = data.readBit();
        data.skipBits(1);
        byte[] bArr2 = Util.EMPTY_BYTE_ARRAY;
        if (bits2 != 1) {
            if (bits2 == 0) {
                int bits3 = data.readBits(16);
                int bits4 = data.readBits(16);
                if (bits3 > 0) {
                    bArr2 = new byte[bits3];
                    data.readBytes(bArr2, 0, bits3);
                }
                if (bits4 > 0) {
                    bArr = new byte[bits4];
                    data.readBytes(bArr, 0, bits4);
                }
            }
            return new c(bits, bit, bArr2, bArr);
        }
        data.skipBits(data.readBits(8) * 16);
        bArr = bArr2;
        return new c(bits, bit, bArr2, bArr);
    }

    private static d o(ParsableBitArray data, int length) {
        int bits = data.readBits(8);
        int bits2 = data.readBits(4);
        int bits3 = data.readBits(2);
        data.skipBits(2);
        int i2 = length - 2;
        SparseArray sparseArray = new SparseArray();
        while (i2 > 0) {
            int bits4 = data.readBits(8);
            data.skipBits(8);
            i2 -= 6;
            sparseArray.put(bits4, new e(data.readBits(16), data.readBits(16)));
        }
        return new d(bits, bits2, bits3, sparseArray);
    }

    private static f p(ParsableBitArray data, int length) {
        int bits;
        int bits2;
        int bits3 = data.readBits(8);
        data.skipBits(4);
        boolean bit = data.readBit();
        data.skipBits(3);
        int i2 = 16;
        int bits4 = data.readBits(16);
        int bits5 = data.readBits(16);
        int bits6 = data.readBits(3);
        int bits7 = data.readBits(3);
        int i3 = 2;
        data.skipBits(2);
        int bits8 = data.readBits(8);
        int bits9 = data.readBits(8);
        int bits10 = data.readBits(4);
        int bits11 = data.readBits(2);
        data.skipBits(2);
        int i4 = length - 10;
        SparseArray sparseArray = new SparseArray();
        while (i4 > 0) {
            int bits12 = data.readBits(i2);
            int bits13 = data.readBits(i3);
            int bits14 = data.readBits(i3);
            int bits15 = data.readBits(12);
            int i5 = bits11;
            data.skipBits(4);
            int bits16 = data.readBits(12);
            i4 -= 6;
            if (bits13 == 1 || bits13 == 2) {
                i4 -= 2;
                bits = data.readBits(8);
                bits2 = data.readBits(8);
            } else {
                bits = 0;
                bits2 = 0;
            }
            sparseArray.put(bits12, new g(bits13, bits14, bits15, bits16, bits, bits2));
            bits11 = i5;
            i3 = 2;
            i2 = 16;
        }
        return new f(bits3, bit, bits4, bits5, bits6, bits7, bits8, bits9, bits10, bits11, sparseArray);
    }

    private static void q(ParsableBitArray data, h service) {
        f fVar;
        int bits = data.readBits(8);
        int bits2 = data.readBits(16);
        int bits3 = data.readBits(16);
        int bytePosition = data.getBytePosition() + bits3;
        if (bits3 * 8 > data.bitsLeft()) {
            Log.w(h, "Data field length exceeds limit");
            data.skipBits(data.bitsLeft());
            return;
        }
        switch (bits) {
            case 16:
                if (bits2 == service.a) {
                    d dVar = service.i;
                    d dVarO = o(data, bits3);
                    if (dVarO.c != 0) {
                        service.i = dVarO;
                        service.c.clear();
                        service.d.clear();
                        service.e.clear();
                    } else if (dVar != null && dVar.b != dVarO.b) {
                        service.i = dVarO;
                    }
                }
                break;
            case 17:
                d dVar2 = service.i;
                if (bits2 == service.a && dVar2 != null) {
                    f fVarP = p(data, bits3);
                    if (dVar2.c == 0 && (fVar = service.c.get(fVarP.a)) != null) {
                        fVarP.a(fVar);
                    }
                    service.c.put(fVarP.a, fVarP);
                }
                break;
            case 18:
                if (bits2 == service.a) {
                    C0154a c0154aL = l(data, bits3);
                    service.d.put(c0154aL.a, c0154aL);
                } else if (bits2 == service.b) {
                    C0154a c0154aL2 = l(data, bits3);
                    service.f.put(c0154aL2.a, c0154aL2);
                }
                break;
            case 19:
                if (bits2 == service.a) {
                    c cVarN = n(data);
                    service.e.put(cVarN.a, cVarN);
                } else if (bits2 == service.b) {
                    c cVarN2 = n(data);
                    service.g.put(cVarN2.a, cVarN2);
                }
                break;
            case 20:
                if (bits2 == service.a) {
                    service.h = m(data);
                }
                break;
        }
        data.skipBytes(bytePosition - data.getBytePosition());
    }

    public List<Cue> b(byte[] data, int limit) {
        ParsableBitArray parsableBitArray = new ParsableBitArray(data, limit);
        while (parsableBitArray.bitsLeft() >= 48 && parsableBitArray.readBits(8) == 15) {
            q(parsableBitArray, this.f);
        }
        h hVar = this.f;
        d dVar = hVar.i;
        if (dVar == null) {
            return Collections.emptyList();
        }
        b bVar = hVar.h;
        if (bVar == null) {
            bVar = this.d;
        }
        Bitmap bitmap = this.g;
        if (bitmap == null || bVar.a + 1 != bitmap.getWidth() || bVar.b + 1 != this.g.getHeight()) {
            Bitmap bitmapCreateBitmap = Bitmap.createBitmap(bVar.a + 1, bVar.b + 1, Bitmap.Config.ARGB_8888);
            this.g = bitmapCreateBitmap;
            this.c.setBitmap(bitmapCreateBitmap);
        }
        ArrayList arrayList = new ArrayList();
        SparseArray<e> sparseArray = dVar.d;
        for (int i2 = 0; i2 < sparseArray.size(); i2++) {
            this.c.save();
            e eVarValueAt = sparseArray.valueAt(i2);
            f fVar = this.f.c.get(sparseArray.keyAt(i2));
            int i3 = eVarValueAt.a + bVar.c;
            int i4 = eVarValueAt.b + bVar.e;
            this.c.clipRect(i3, i4, Math.min(fVar.c + i3, bVar.d), Math.min(fVar.d + i4, bVar.f));
            C0154a c0154a = this.f.d.get(fVar.g);
            if (c0154a == null && (c0154a = this.f.f.get(fVar.g)) == null) {
                c0154a = this.e;
            }
            int i5 = 0;
            for (SparseArray<g> sparseArray2 = fVar.k; i5 < sparseArray2.size(); sparseArray2 = sparseArray2) {
                int iKeyAt = sparseArray2.keyAt(i5);
                g gVarValueAt = sparseArray2.valueAt(i5);
                c cVar = this.f.e.get(iKeyAt);
                c cVar2 = cVar == null ? this.f.g.get(iKeyAt) : cVar;
                if (cVar2 != null) {
                    k(cVar2, c0154a, fVar.f, gVarValueAt.c + i3, i4 + gVarValueAt.d, cVar2.b ? null : this.a, this.c);
                }
                i5++;
            }
            if (fVar.b) {
                int i6 = fVar.f;
                this.b.setColor(i6 == 3 ? c0154a.d[fVar.h] : i6 == 2 ? c0154a.c[fVar.i] : c0154a.b[fVar.j]);
                this.c.drawRect(i3, i4, fVar.c + i3, fVar.d + i4, this.b);
            }
            arrayList.add(new Cue.Builder().setBitmap(Bitmap.createBitmap(this.g, i3, i4, fVar.c, fVar.d)).setPosition(i3 / bVar.a).setPositionAnchor(0).setLine(i4 / bVar.b, 0).setLineAnchor(0).setSize(fVar.c / bVar.a).setBitmapHeight(fVar.d / bVar.b).build());
            this.c.drawColor(0, PorterDuff.Mode.CLEAR);
            this.c.restore();
        }
        return Collections.unmodifiableList(arrayList);
    }

    public void r() {
        this.f.a();
    }
}
