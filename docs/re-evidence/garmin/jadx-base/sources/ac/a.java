package ac;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.util.SparseArray;
import ch.qos.logback.core.net.SyslogConstants;
import com.google.android.exoplayer2.C;
import com.google.android.exoplayer2.trackselection.AdaptiveTrackSelection;
import com.google.common.base.Ascii;
import com.google.common.collect.ImmutableList;
import fa.k;
import fa.q;
import fa.r;
import fa.z;
import java.util.ArrayList;
import java.util.List;
import yb.n;

/* JADX INFO: loaded from: classes.dex */
public final class a implements n {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final byte[] f2647h = {0, 7, 8, Ascii.SI};

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final byte[] f2648i = {0, 119, -120, -1};

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final byte[] f2649j = {0, 17, 34, 51, 68, 85, 102, 119, -120, -103, -86, -69, -52, -35, -18, -1};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Paint f2650a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Paint f2651b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Canvas f2652c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final b f2653d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final C0036a f2654e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final h f2655f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Bitmap f2656g;

    /* JADX INFO: renamed from: ac.a$a, reason: collision with other inner class name */
    public static final class C0036a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f2657a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int[] f2658b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int[] f2659c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final int[] f2660d;

        public C0036a(int i14, int[] iArr, int[] iArr2, int[] iArr3) {
            this.f2657a = i14;
            this.f2658b = iArr;
            this.f2659c = iArr2;
            this.f2660d = iArr3;
        }
    }

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f2661a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f2662b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f2663c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final int f2664d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final int f2665e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final int f2666f;

        public b(int i14, int i15, int i16, int i17, int i18, int i19) {
            this.f2661a = i14;
            this.f2662b = i15;
            this.f2663c = i16;
            this.f2664d = i17;
            this.f2665e = i18;
            this.f2666f = i19;
        }
    }

    public static final class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f2667a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final boolean f2668b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final byte[] f2669c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final byte[] f2670d;

        public c(int i14, boolean z14, byte[] bArr, byte[] bArr2) {
            this.f2667a = i14;
            this.f2668b = z14;
            this.f2669c = bArr;
            this.f2670d = bArr2;
        }
    }

    public static final class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f2671a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f2672b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final SparseArray<e> f2673c;

        public d(int i14, int i15, int i16, SparseArray<e> sparseArray) {
            this.f2671a = i15;
            this.f2672b = i16;
            this.f2673c = sparseArray;
        }
    }

    public static final class e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f2674a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f2675b;

        public e(int i14, int i15) {
            this.f2674a = i14;
            this.f2675b = i15;
        }
    }

    public static final class f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f2676a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final boolean f2677b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f2678c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final int f2679d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final int f2680e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final int f2681f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final int f2682g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final int f2683h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final int f2684i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final SparseArray<g> f2685j;

        public f(int i14, boolean z14, int i15, int i16, int i17, int i18, int i19, int i24, int i25, int i26, SparseArray<g> sparseArray) {
            this.f2676a = i14;
            this.f2677b = z14;
            this.f2678c = i15;
            this.f2679d = i16;
            this.f2680e = i18;
            this.f2681f = i19;
            this.f2682g = i24;
            this.f2683h = i25;
            this.f2684i = i26;
            this.f2685j = sparseArray;
        }
    }

    public static final class g {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f2686a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f2687b;

        public g(int i14, int i15, int i16, int i17, int i18, int i19) {
            this.f2686a = i16;
            this.f2687b = i17;
        }
    }

    public static final class h {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f2688a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f2689b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final SparseArray<f> f2690c = new SparseArray<>();

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final SparseArray<C0036a> f2691d = new SparseArray<>();

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final SparseArray<c> f2692e = new SparseArray<>();

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final SparseArray<C0036a> f2693f = new SparseArray<>();

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final SparseArray<c> f2694g = new SparseArray<>();

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public b f2695h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public d f2696i;

        public h(int i14, int i15) {
            this.f2688a = i14;
            this.f2689b = i15;
        }
    }

    public a(List<byte[]> list) {
        r rVar = new r(list.get(0));
        int iA = rVar.A();
        int iA2 = rVar.A();
        Paint paint = new Paint();
        this.f2650a = paint;
        paint.setStyle(Paint.Style.FILL_AND_STROKE);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC));
        paint.setPathEffect(null);
        Paint paint2 = new Paint();
        this.f2651b = paint2;
        paint2.setStyle(Paint.Style.FILL);
        paint2.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OVER));
        paint2.setPathEffect(null);
        this.f2652c = new Canvas();
        this.f2653d = new b(AdaptiveTrackSelection.DEFAULT_MAX_HEIGHT_TO_DISCARD, 575, 0, AdaptiveTrackSelection.DEFAULT_MAX_HEIGHT_TO_DISCARD, 0, 575);
        this.f2654e = new C0036a(0, new int[]{0, -1, -16777216, -8421505}, e(), f());
        this.f2655f = new h(iA, iA2);
    }

    public static byte[] d(int i14, int i15, q qVar) {
        byte[] bArr = new byte[i14];
        for (int i16 = 0; i16 < i14; i16++) {
            bArr[i16] = (byte) qVar.g(i15);
        }
        return bArr;
    }

    public static int[] e() {
        int[] iArr = new int[16];
        iArr[0] = 0;
        for (int i14 = 1; i14 < 16; i14++) {
            if (i14 < 8) {
                iArr[i14] = g(255, (i14 & 1) != 0 ? 255 : 0, (i14 & 2) != 0 ? 255 : 0, (i14 & 4) != 0 ? 255 : 0);
            } else {
                iArr[i14] = g(255, (i14 & 1) != 0 ? 127 : 0, (i14 & 2) != 0 ? 127 : 0, (i14 & 4) == 0 ? 0 : 127);
            }
        }
        return iArr;
    }

    public static int[] f() {
        int[] iArr = new int[256];
        iArr[0] = 0;
        for (int i14 = 0; i14 < 256; i14++) {
            if (i14 < 8) {
                iArr[i14] = g(63, (i14 & 1) != 0 ? 255 : 0, (i14 & 2) != 0 ? 255 : 0, (i14 & 4) == 0 ? 0 : 255);
            } else {
                int i15 = i14 & SyslogConstants.LOG_LOCAL1;
                if (i15 == 0) {
                    iArr[i14] = g(255, ((i14 & 1) != 0 ? 85 : 0) + ((i14 & 16) != 0 ? 170 : 0), ((i14 & 2) != 0 ? 85 : 0) + ((i14 & 32) != 0 ? 170 : 0), ((i14 & 4) == 0 ? 0 : 85) + ((i14 & 64) == 0 ? 0 : 170));
                } else if (i15 == 8) {
                    iArr[i14] = g(127, ((i14 & 1) != 0 ? 85 : 0) + ((i14 & 16) != 0 ? 170 : 0), ((i14 & 2) != 0 ? 85 : 0) + ((i14 & 32) != 0 ? 170 : 0), ((i14 & 4) == 0 ? 0 : 85) + ((i14 & 64) == 0 ? 0 : 170));
                } else if (i15 == 128) {
                    iArr[i14] = g(255, ((i14 & 1) != 0 ? 43 : 0) + 127 + ((i14 & 16) != 0 ? 85 : 0), ((i14 & 2) != 0 ? 43 : 0) + 127 + ((i14 & 32) != 0 ? 85 : 0), ((i14 & 4) == 0 ? 0 : 43) + 127 + ((i14 & 64) == 0 ? 0 : 85));
                } else if (i15 == 136) {
                    iArr[i14] = g(255, ((i14 & 1) != 0 ? 43 : 0) + ((i14 & 16) != 0 ? 85 : 0), ((i14 & 2) != 0 ? 43 : 0) + ((i14 & 32) != 0 ? 85 : 0), ((i14 & 4) == 0 ? 0 : 43) + ((i14 & 64) == 0 ? 0 : 85));
                }
            }
        }
        return iArr;
    }

    public static int g(int i14, int i15, int i16, int i17) {
        return (i14 << 24) | (i15 << 16) | (i16 << 8) | i17;
    }

    /* JADX WARN: Code duplicated, block: B:100:0x018b  */
    /* JADX WARN: Code duplicated, block: B:102:0x0191 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:103:0x0193 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:104:0x0195 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:105:0x0197  */
    /* JADX WARN: Code duplicated, block: B:107:0x01a0  */
    /* JADX WARN: Code duplicated, block: B:108:0x01b1  */
    /* JADX WARN: Code duplicated, block: B:109:0x01c5  */
    /* JADX WARN: Code duplicated, block: B:110:0x01cd  */
    /* JADX WARN: Code duplicated, block: B:112:0x01d5 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:116:0x01f5  */
    /* JADX WARN: Code duplicated, block: B:120:0x0203 A[LOOP:3: B:88:0x0156->B:120:0x0203, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:134:0x01ff A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:90:0x015c  */
    /* JADX WARN: Code duplicated, block: B:93:0x0166  */
    /* JADX WARN: Code duplicated, block: B:95:0x016c  */
    /* JADX WARN: Code duplicated, block: B:96:0x017c  */
    /* JADX WARN: Code duplicated, block: B:98:0x0182  */
    public static void h(byte[] bArr, int[] iArr, int i14, int i15, int i16, Paint paint, Canvas canvas) {
        byte[] bArr2;
        byte[] bArr3;
        boolean z14;
        int iG;
        int iG2;
        char c14;
        char c15;
        int iG3;
        int iG4;
        boolean z15;
        int iG5;
        int iG6;
        int iG7;
        int i17;
        int i18;
        boolean z16;
        int iG8;
        q qVar = new q(bArr);
        int i19 = i15;
        int i24 = i16;
        byte[] bArrD = null;
        byte[] bArrD2 = null;
        byte[] bArrD3 = null;
        while (qVar.b() != 0) {
            int i25 = 8;
            int iG9 = qVar.g(8);
            if (iG9 != 240) {
                int i26 = 3;
                int i27 = 2;
                int i28 = 4;
                switch (iG9) {
                    case 16:
                        if (i14 == 3) {
                            bArr3 = bArrD == null ? f2648i : bArrD;
                        } else {
                            if (i14 == 2) {
                                bArr3 = bArrD3 == null ? f2647h : bArrD3;
                            } else {
                                bArr2 = null;
                            }
                            z14 = false;
                            while (true) {
                                iG = qVar.g(2);
                                if (iG != 0) {
                                    iG3 = iG;
                                    iG4 = 1;
                                } else {
                                    if (qVar.f()) {
                                        int iG10 = qVar.g(3) + 3;
                                        iG3 = qVar.g(2);
                                        iG4 = iG10;
                                    } else {
                                        if (qVar.f()) {
                                            iG4 = 1;
                                            c14 = '\b';
                                            c15 = 4;
                                        } else {
                                            iG2 = qVar.g(2);
                                            if (iG2 != 0) {
                                                c14 = '\b';
                                                c15 = 4;
                                                z14 = true;
                                            } else if (iG2 != 1) {
                                                c14 = '\b';
                                                c15 = 4;
                                                iG4 = 2;
                                            } else if (iG2 != 2) {
                                                c14 = '\b';
                                                c15 = 4;
                                                iG4 = qVar.g(4) + 12;
                                                iG3 = qVar.g(2);
                                                z14 = z14;
                                            } else if (iG2 != 3) {
                                                z14 = z14;
                                                c14 = '\b';
                                                c15 = 4;
                                            } else {
                                                c14 = '\b';
                                                int iG11 = qVar.g(8) + 29;
                                                iG3 = qVar.g(2);
                                                z14 = z14;
                                                iG4 = iG11;
                                                c15 = 4;
                                            }
                                            iG3 = 0;
                                            iG4 = 0;
                                        }
                                        iG3 = 0;
                                    }
                                    if (iG4 == 0 && paint != null) {
                                        if (bArr2 != 0) {
                                            iG3 = bArr2[iG3];
                                        }
                                        paint.setColor(iArr[iG3]);
                                        canvas.drawRect(i19, i24, i19 + iG4, i24 + 1, paint);
                                    }
                                    i19 += iG4;
                                    if (z14) {
                                        qVar.c();
                                    } else {
                                        paint = paint;
                                        z14 = z14;
                                    }
                                }
                                c14 = '\b';
                                c15 = 4;
                                if (iG4 == 0) {
                                }
                                i19 += iG4;
                                if (z14) {
                                    qVar.c();
                                } else {
                                    paint = paint;
                                    z14 = z14;
                                }
                            }
                        }
                        bArr2 = bArr3;
                        z14 = false;
                        while (true) {
                            iG = qVar.g(2);
                            if (iG != 0) {
                                iG3 = iG;
                                iG4 = 1;
                            } else {
                                if (qVar.f()) {
                                    int iG12 = qVar.g(3) + 3;
                                    iG3 = qVar.g(2);
                                    iG4 = iG12;
                                } else {
                                    if (qVar.f()) {
                                        iG4 = 1;
                                        c14 = '\b';
                                        c15 = 4;
                                    } else {
                                        iG2 = qVar.g(2);
                                        if (iG2 != 0) {
                                            c14 = '\b';
                                            c15 = 4;
                                            z14 = true;
                                        } else if (iG2 != 1) {
                                            c14 = '\b';
                                            c15 = 4;
                                            iG4 = 2;
                                        } else if (iG2 != 2) {
                                            c14 = '\b';
                                            c15 = 4;
                                            iG4 = qVar.g(4) + 12;
                                            iG3 = qVar.g(2);
                                            z14 = z14;
                                        } else if (iG2 != 3) {
                                            z14 = z14;
                                            c14 = '\b';
                                            c15 = 4;
                                        } else {
                                            c14 = '\b';
                                            int iG13 = qVar.g(8) + 29;
                                            iG3 = qVar.g(2);
                                            z14 = z14;
                                            iG4 = iG13;
                                            c15 = 4;
                                        }
                                        iG3 = 0;
                                        iG4 = 0;
                                    }
                                    iG3 = 0;
                                }
                                if (iG4 == 0) {
                                }
                                i19 += iG4;
                                if (z14) {
                                    qVar.c();
                                } else {
                                    paint = paint;
                                    z14 = z14;
                                }
                            }
                            c14 = '\b';
                            c15 = 4;
                            if (iG4 == 0) {
                            }
                            i19 += iG4;
                            if (z14) {
                                qVar.c();
                            } else {
                                paint = paint;
                                z14 = z14;
                            }
                            break;
                        }
                        break;
                    case 17:
                        byte[] bArr4 = i14 == 3 ? bArrD2 == null ? f2649j : bArrD2 : null;
                        boolean z17 = false;
                        while (true) {
                            int iG14 = qVar.g(i28);
                            if (iG14 != 0) {
                                z15 = z17;
                                iG7 = iG14;
                                iG5 = 1;
                            } else if (qVar.f()) {
                                if (qVar.f()) {
                                    int iG15 = qVar.g(i27);
                                    if (iG15 == 0) {
                                        z15 = z17;
                                        iG5 = 1;
                                    } else if (iG15 != 1) {
                                        if (iG15 == i27) {
                                            iG5 = qVar.g(i28) + 9;
                                            iG6 = qVar.g(i28);
                                        } else if (iG15 != i26) {
                                            z15 = z17;
                                            iG5 = 0;
                                        } else {
                                            iG5 = qVar.g(i25) + 25;
                                            iG6 = qVar.g(i28);
                                        }
                                        iG7 = iG6;
                                    } else {
                                        z15 = z17;
                                        iG5 = i27;
                                    }
                                    iG7 = 0;
                                } else {
                                    iG5 = qVar.g(i27) + 4;
                                    iG7 = qVar.g(i28);
                                }
                                z15 = z17;
                            } else {
                                int iG16 = qVar.g(i26);
                                if (iG16 != 0) {
                                    iG5 = iG16 + 2;
                                    z15 = z17;
                                } else {
                                    z15 = true;
                                    iG5 = 0;
                                }
                                iG7 = 0;
                            }
                            if (iG5 == 0 || paint == 0) {
                                i17 = i26;
                                i18 = i27;
                            } else {
                                if (bArr4 != 0) {
                                    iG7 = bArr4[iG7];
                                }
                                paint.setColor(iArr[iG7]);
                                i17 = i26;
                                i18 = 2;
                                canvas.drawRect(i19, i24, i19 + iG5, i24 + 1, paint);
                            }
                            i19 += iG5;
                            if (z15) {
                                qVar.c();
                            } else {
                                z17 = z15;
                                i26 = i17;
                                i27 = i18;
                                i28 = 4;
                                i25 = 8;
                            }
                            break;
                        }
                        break;
                    case 18:
                        boolean z18 = false;
                        while (true) {
                            int iG17 = qVar.g(8);
                            if (iG17 != 0) {
                                z16 = z18;
                                iG8 = 1;
                            } else if (qVar.f()) {
                                z16 = z18;
                                iG8 = qVar.g(7);
                                iG17 = qVar.g(8);
                            } else {
                                int iG18 = qVar.g(7);
                                if (iG18 != 0) {
                                    z16 = z18;
                                    iG8 = iG18;
                                    iG17 = 0;
                                } else {
                                    z16 = true;
                                    iG17 = 0;
                                    iG8 = 0;
                                }
                            }
                            if (iG8 != 0 && paint != 0) {
                                paint.setColor(iArr[iG17]);
                                canvas.drawRect(i19, i24, i19 + iG8, i24 + 1, paint);
                            }
                            i19 += iG8;
                            if (!z16) {
                                z18 = z16;
                            }
                            break;
                        }
                        break;
                    default:
                        switch (iG9) {
                            case 32:
                                bArrD3 = d(4, 4, qVar);
                                break;
                            case 33:
                                bArrD = d(4, 8, qVar);
                                break;
                            case 34:
                                bArrD2 = d(16, 8, qVar);
                                break;
                        }
                        break;
                }
            } else {
                i24 += 2;
                i19 = i15;
            }
        }
    }

    public static C0036a i(q qVar, int i14) {
        int[] iArr;
        int iG;
        int i15;
        int iG2;
        int iG3;
        int iG4;
        int i16 = 8;
        int iG5 = qVar.g(8);
        qVar.o(8);
        int i17 = 2;
        int i18 = i14 - 2;
        int i19 = 0;
        int[] iArr2 = {0, -1, -16777216, -8421505};
        int[] iArrE = e();
        int[] iArrF = f();
        while (i18 > 0) {
            int iG6 = qVar.g(i16);
            int iG7 = qVar.g(i16);
            if ((iG7 & 128) != 0) {
                iArr = iArr2;
            } else {
                iArr = (iG7 & 64) != 0 ? iArrE : iArrF;
            }
            if ((iG7 & 1) != 0) {
                iG3 = qVar.g(i16);
                iG4 = qVar.g(i16);
                iG = qVar.g(i16);
                iG2 = qVar.g(i16);
                i15 = i18 - 6;
            } else {
                int iG8 = qVar.g(6) << i17;
                int iG9 = qVar.g(4) << 4;
                iG = qVar.g(4) << 4;
                i15 = i18 - 4;
                iG2 = qVar.g(i17) << 6;
                iG3 = iG8;
                iG4 = iG9;
            }
            if (iG3 == 0) {
                iG4 = i19;
                iG = iG4;
                iG2 = 255;
            }
            double d14 = iG3;
            double d15 = iG4 - 128;
            double d16 = iG - 128;
            iArr[iG6] = g((byte) (255 - (iG2 & 255)), z.i((int) ((1.402d * d15) + d14), 0, 255), z.i((int) ((d14 - (0.34414d * d16)) - (d15 * 0.71414d)), 0, 255), z.i((int) ((d16 * 1.772d) + d14), 0, 255));
            i18 = i15;
            i19 = 0;
            iG5 = iG5;
            iArrF = iArrF;
            i16 = 8;
            i17 = 2;
        }
        return new C0036a(iG5, iArr2, iArrE, iArrF);
    }

    public static c j(q qVar) {
        byte[] bArr;
        int iG = qVar.g(16);
        qVar.o(4);
        int iG2 = qVar.g(2);
        boolean zF = qVar.f();
        qVar.o(1);
        byte[] bArr2 = z.f70076f;
        if (iG2 != 1) {
            if (iG2 == 0) {
                int iG3 = qVar.g(16);
                int iG4 = qVar.g(16);
                if (iG3 > 0) {
                    bArr2 = new byte[iG3];
                    qVar.j(iG3, bArr2);
                }
                if (iG4 > 0) {
                    bArr = new byte[iG4];
                    qVar.j(iG4, bArr);
                }
            }
            return new c(iG, zF, bArr2, bArr);
        }
        qVar.o(qVar.g(8) * 16);
        bArr = bArr2;
        return new c(iG, zF, bArr2, bArr);
    }

    @Override // yb.n
    public final int a() {
        return 2;
    }

    @Override // yb.n
    public final void c(byte[] bArr, int i14, int i15, n.b bVar, fa.g<yb.c> gVar) {
        h hVar;
        boolean z14;
        yb.c cVar;
        char c14;
        char c15;
        char c16;
        int i16;
        int i17;
        f fVar;
        int i18;
        f fVar2;
        int iG;
        int iG2;
        int iG3;
        int iG4;
        int i19;
        int iG5;
        q qVar = new q(bArr, i14 + i15);
        qVar.m(i14);
        while (true) {
            int iB = qVar.b();
            hVar = this.f2655f;
            z14 = true;
            if (iB >= 48 && qVar.g(8) == 15) {
                int iG6 = qVar.g(8);
                int iG7 = qVar.g(16);
                int iG8 = qVar.g(16);
                int iD = qVar.d() + iG8;
                if (iG8 * 8 > qVar.b()) {
                    k.g("Data field length exceeds limit");
                    qVar.o(qVar.b());
                } else {
                    switch (iG6) {
                        case 16:
                            if (iG7 == hVar.f2688a) {
                                d dVar = hVar.f2696i;
                                int iG9 = qVar.g(8);
                                int iG10 = qVar.g(4);
                                int iG11 = qVar.g(2);
                                qVar.o(2);
                                int i24 = iG8 - 2;
                                SparseArray sparseArray = new SparseArray();
                                while (i24 > 0) {
                                    int iG12 = qVar.g(8);
                                    qVar.o(8);
                                    i24 -= 6;
                                    sparseArray.put(iG12, new e(qVar.g(16), qVar.g(16)));
                                }
                                d dVar2 = new d(iG9, iG10, iG11, sparseArray);
                                if (dVar2.f2672b != 0) {
                                    hVar.f2696i = dVar2;
                                    hVar.f2690c.clear();
                                    hVar.f2691d.clear();
                                    hVar.f2692e.clear();
                                } else if (dVar != null && dVar.f2671a != dVar2.f2671a) {
                                    hVar.f2696i = dVar2;
                                }
                            }
                            break;
                        case 17:
                            d dVar3 = hVar.f2696i;
                            SparseArray<f> sparseArray2 = hVar.f2690c;
                            if (iG7 == hVar.f2688a && dVar3 != null) {
                                int iG13 = qVar.g(8);
                                qVar.o(4);
                                boolean zF = qVar.f();
                                qVar.o(3);
                                int iG14 = qVar.g(16);
                                int iG15 = qVar.g(16);
                                int iG16 = qVar.g(3);
                                int iG17 = qVar.g(3);
                                qVar.o(2);
                                int iG18 = qVar.g(8);
                                int iG19 = qVar.g(8);
                                int iG20 = qVar.g(4);
                                int iG21 = qVar.g(2);
                                qVar.o(2);
                                int i25 = iG8 - 10;
                                SparseArray sparseArray3 = new SparseArray();
                                while (i25 > 0) {
                                    int iG22 = qVar.g(16);
                                    int iG23 = qVar.g(2);
                                    int iG24 = qVar.g(2);
                                    int iG25 = qVar.g(12);
                                    qVar.o(4);
                                    int iG26 = qVar.g(12);
                                    int i26 = i25 - 6;
                                    if (iG23 == 1 || iG23 == 2) {
                                        i25 -= 8;
                                        iG = qVar.g(8);
                                        iG2 = qVar.g(8);
                                    } else {
                                        i25 = i26;
                                        iG = 0;
                                        iG2 = 0;
                                    }
                                    sparseArray3.put(iG22, new g(iG23, iG24, iG25, iG26, iG, iG2));
                                }
                                f fVar3 = new f(iG13, zF, iG14, iG15, iG16, iG17, iG18, iG19, iG20, iG21, sparseArray3);
                                int i27 = dVar3.f2672b;
                                int i28 = fVar3.f2676a;
                                if (i27 == 0 && (fVar2 = sparseArray2.get(i28)) != null) {
                                    SparseArray<g> sparseArray4 = fVar2.f2685j;
                                    for (int i29 = 0; i29 < sparseArray4.size(); i29++) {
                                        fVar3.f2685j.put(sparseArray4.keyAt(i29), sparseArray4.valueAt(i29));
                                    }
                                }
                                sparseArray2.put(i28, fVar3);
                            }
                            break;
                        case 18:
                            if (iG7 == hVar.f2688a) {
                                C0036a c0036aI = i(qVar, iG8);
                                hVar.f2691d.put(c0036aI.f2657a, c0036aI);
                            } else if (iG7 == hVar.f2689b) {
                                C0036a c0036aI2 = i(qVar, iG8);
                                hVar.f2693f.put(c0036aI2.f2657a, c0036aI2);
                            }
                            break;
                        case 19:
                            if (iG7 == hVar.f2688a) {
                                c cVarJ = j(qVar);
                                hVar.f2692e.put(cVarJ.f2667a, cVarJ);
                            } else if (iG7 == hVar.f2689b) {
                                c cVarJ2 = j(qVar);
                                hVar.f2694g.put(cVarJ2.f2667a, cVarJ2);
                            }
                            break;
                        case 20:
                            if (iG7 == hVar.f2688a) {
                                qVar.o(4);
                                boolean zF2 = qVar.f();
                                qVar.o(3);
                                int iG27 = qVar.g(16);
                                int iG28 = qVar.g(16);
                                if (zF2) {
                                    int iG29 = qVar.g(16);
                                    iG3 = qVar.g(16);
                                    iG5 = qVar.g(16);
                                    iG4 = qVar.g(16);
                                    i19 = iG29;
                                } else {
                                    iG3 = iG27;
                                    iG4 = iG28;
                                    i19 = 0;
                                    iG5 = 0;
                                }
                                hVar.f2695h = new b(iG27, iG28, i19, iG3, iG5, iG4);
                            }
                            break;
                    }
                    qVar.p(iD - qVar.d());
                }
            }
        }
        d dVar4 = hVar.f2696i;
        if (dVar4 == null) {
            cVar = new yb.c(ImmutableList.of(), C.TIME_UNSET, C.TIME_UNSET);
        } else {
            b bVar2 = hVar.f2695h;
            if (bVar2 == null) {
                bVar2 = this.f2653d;
            }
            Bitmap bitmap = this.f2656g;
            Canvas canvas = this.f2652c;
            if (bitmap == null || bVar2.f2661a + 1 != bitmap.getWidth() || bVar2.f2662b + 1 != this.f2656g.getHeight()) {
                Bitmap bitmapCreateBitmap = Bitmap.createBitmap(bVar2.f2661a + 1, bVar2.f2662b + 1, Bitmap.Config.ARGB_8888);
                this.f2656g = bitmapCreateBitmap;
                canvas.setBitmap(bitmapCreateBitmap);
            }
            ArrayList arrayList = new ArrayList();
            SparseArray<e> sparseArray5 = dVar4.f2673c;
            int i30 = 0;
            while (i30 < sparseArray5.size()) {
                canvas.save();
                e eVarValueAt = sparseArray5.valueAt(i30);
                f fVar4 = hVar.f2690c.get(sparseArray5.keyAt(i30));
                int i34 = eVarValueAt.f2674a + bVar2.f2663c;
                int i35 = eVarValueAt.f2675b + bVar2.f2665e;
                int i36 = fVar4.f2678c;
                int i37 = fVar4.f2681f;
                boolean z15 = z14;
                int i38 = fVar4.f2679d;
                int i39 = i34 + i36;
                int i44 = i35 + i38;
                SparseArray<e> sparseArray6 = sparseArray5;
                canvas.clipRect(i34, i35, Math.min(i39, bVar2.f2664d), Math.min(i44, bVar2.f2666f));
                C0036a c0036a = hVar.f2691d.get(i37);
                if (c0036a == null && (c0036a = hVar.f2693f.get(i37)) == null) {
                    c0036a = this.f2654e;
                }
                SparseArray<g> sparseArray7 = fVar4.f2685j;
                int i45 = i30;
                int i46 = 0;
                while (i46 < sparseArray7.size()) {
                    int iKeyAt = sparseArray7.keyAt(i46);
                    SparseArray<g> sparseArray8 = sparseArray7;
                    g gVarValueAt = sparseArray7.valueAt(i46);
                    int i47 = i35;
                    c cVar2 = hVar.f2692e.get(iKeyAt);
                    if (cVar2 == null) {
                        cVar2 = hVar.f2694g.get(iKeyAt);
                    }
                    c cVar3 = cVar2;
                    if (cVar3 != null) {
                        Paint paint = cVar3.f2668b ? null : this.f2650a;
                        f fVar5 = fVar4;
                        int i48 = fVar5.f2680e;
                        int i49 = gVarValueAt.f2686a + i34;
                        int i54 = i47 + gVarValueAt.f2687b;
                        int[] iArr = i48 == 3 ? c0036a.f2660d : i48 == 2 ? c0036a.f2659c : c0036a.f2658b;
                        fVar = fVar5;
                        i17 = i47;
                        int i55 = i46;
                        Paint paint2 = paint;
                        i18 = i55;
                        h(cVar3.f2669c, iArr, i48, i49, i54, paint2, canvas);
                        h(cVar3.f2670d, iArr, i48, i49, i54 + 1, paint2, canvas);
                    } else {
                        i17 = i47;
                        fVar = fVar4;
                        i18 = i46;
                    }
                    i46 = i18 + 1;
                    i35 = i17;
                    i34 = i34;
                    fVar4 = fVar;
                    arrayList = arrayList;
                    sparseArray7 = sparseArray8;
                    hVar = hVar;
                    bVar2 = bVar2;
                    i36 = i36;
                }
                b bVar3 = bVar2;
                ArrayList arrayList2 = arrayList;
                h hVar2 = hVar;
                int i56 = i35;
                f fVar6 = fVar4;
                int i57 = i34;
                int i58 = i36;
                if (fVar6.f2677b) {
                    int i59 = fVar6.f2680e;
                    if (i59 == 3) {
                        i16 = c0036a.f2660d[fVar6.f2682g];
                        c16 = 2;
                    } else {
                        c16 = 2;
                        i16 = i59 == 2 ? c0036a.f2659c[fVar6.f2683h] : c0036a.f2658b[fVar6.f2684i];
                    }
                    Paint paint3 = this.f2651b;
                    paint3.setColor(i16);
                    c15 = c16;
                    c14 = 3;
                    canvas.drawRect(i57, i56, i39, i44, paint3);
                } else {
                    c14 = 3;
                    c15 = 2;
                }
                ea.a.b bVar4 = new ea.a.b();
                bVar4.f63569b = Bitmap.createBitmap(this.f2656g, i57, i56, i58, i38);
                float f14 = bVar3.f2661a;
                bVar4.f63575h = i57 / f14;
                bVar4.f63576i = 0;
                float f15 = bVar3.f2662b;
                bVar4.f63572e = i56 / f15;
                bVar4.f63573f = 0;
                bVar4.f63574g = 0;
                bVar4.f63579l = i58 / f14;
                bVar4.f63580m = i38 / f15;
                arrayList2.add(bVar4.a());
                canvas.drawColor(0, PorterDuff.Mode.CLEAR);
                canvas.restore();
                i30 = i45 + 1;
                z14 = z15;
                bVar2 = bVar3;
                arrayList = arrayList2;
                sparseArray5 = sparseArray6;
                hVar = hVar2;
            }
            cVar = new yb.c(arrayList, C.TIME_UNSET, C.TIME_UNSET);
        }
        gVar.accept(cVar);
    }

    @Override // yb.n
    public final void reset() {
        h hVar = this.f2655f;
        hVar.f2690c.clear();
        hVar.f2691d.clear();
        hVar.f2692e.clear();
        hVar.f2693f.clear();
        hVar.f2694g.clear();
        hVar.f2695h = null;
        hVar.f2696i = null;
    }
}
