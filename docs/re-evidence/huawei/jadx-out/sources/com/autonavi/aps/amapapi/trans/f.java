package com.autonavi.aps.amapapi.trans;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import com.amap.api.col.p0003sl.il;
import com.amap.api.col.p0003sl.ip;
import com.amap.api.col.p0003sl.np;
import com.autonavi.aps.amapapi.restruct.g;
import com.autonavi.aps.amapapi.restruct.j;
import com.autonavi.aps.amapapi.utils.k;
import com.huawei.openalliance.ad.constant.OsType;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.zip.CRC32;

/* JADX INFO: loaded from: classes4.dex */
public final class f {
    protected static String I;
    protected static String K;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f3991a = "1";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected short f3992b = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected String f3993c = null;
    protected String d = null;
    protected String e = null;
    protected String f = null;
    protected String g = null;
    public String h = null;
    public String i = null;
    protected String j = null;
    protected String k = null;
    protected String l = null;
    protected String m = null;
    protected String n = null;
    protected String o = null;
    protected String p = null;
    protected String q = null;
    protected String r = null;
    protected String s = null;
    protected String t = null;
    protected String u = null;
    protected String v = null;
    protected String w = null;
    protected String x = null;
    protected String y = null;
    protected int z = 0;
    protected ArrayList<com.autonavi.aps.amapapi.restruct.d> A = new ArrayList<>();
    protected ArrayList<com.autonavi.aps.amapapi.restruct.d> B = new ArrayList<>();
    protected String C = null;
    protected String D = null;
    protected ArrayList<np> E = new ArrayList<>();
    protected String F = null;
    protected String G = null;
    protected byte[] H = null;
    private byte[] Q = null;
    private int R = 0;
    protected String J = null;
    protected String L = null;
    protected String M = null;
    protected String N = null;
    protected int O = 0;
    private List<com.autonavi.aps.amapapi.restruct.f> S = null;
    private List<com.autonavi.aps.amapapi.restruct.d> T = Collections.synchronizedList(new ArrayList());
    final int P = 3;

    /* JADX WARN: Code duplicated, block: B:100:0x02ae  */
    /* JADX WARN: Code duplicated, block: B:101:0x02b9  */
    /* JADX WARN: Code duplicated, block: B:106:0x02c1  */
    /* JADX WARN: Code duplicated, block: B:109:0x02d9  */
    /* JADX WARN: Code duplicated, block: B:111:0x02e1  */
    /* JADX WARN: Code duplicated, block: B:112:0x02f5  */
    /* JADX WARN: Code duplicated, block: B:115:0x02fd  */
    /* JADX WARN: Code duplicated, block: B:118:0x0302  */
    /* JADX WARN: Code duplicated, block: B:120:0x0310  */
    /* JADX WARN: Code duplicated, block: B:122:0x031b  */
    /* JADX WARN: Code duplicated, block: B:124:0x031e  */
    /* JADX WARN: Code duplicated, block: B:126:0x0322  */
    /* JADX WARN: Code duplicated, block: B:279:0x06d4 A[Catch: all -> 0x06f5, TRY_LEAVE, TryCatch #6 {all -> 0x06f5, blocks: (B:277:0x06cc, B:279:0x06d4), top: B:378:0x06cc }] */
    /* JADX WARN: Code duplicated, block: B:295:0x070e  */
    /* JADX WARN: Code duplicated, block: B:296:0x0710  */
    /* JADX WARN: Code duplicated, block: B:299:0x071e  */
    /* JADX WARN: Code duplicated, block: B:302:0x0738  */
    /* JADX WARN: Code duplicated, block: B:304:0x073c  */
    /* JADX WARN: Code duplicated, block: B:305:0x0741  */
    /* JADX WARN: Code duplicated, block: B:311:0x075b A[Catch: all -> 0x0814, TryCatch #5 {all -> 0x0814, blocks: (B:308:0x074e, B:309:0x0755, B:311:0x075b, B:313:0x0766, B:315:0x076b, B:318:0x0771, B:320:0x0776, B:322:0x077d, B:323:0x0780, B:334:0x07fa, B:335:0x07fb, B:324:0x07a8, B:326:0x07ad, B:328:0x07b4, B:329:0x07b7, B:330:0x07d5, B:332:0x07dc, B:333:0x07df), top: B:376:0x074e }] */
    /* JADX WARN: Code duplicated, block: B:330:0x07d5 A[Catch: all -> 0x0814, TryCatch #5 {all -> 0x0814, blocks: (B:308:0x074e, B:309:0x0755, B:311:0x075b, B:313:0x0766, B:315:0x076b, B:318:0x0771, B:320:0x0776, B:322:0x077d, B:323:0x0780, B:334:0x07fa, B:335:0x07fb, B:324:0x07a8, B:326:0x07ad, B:328:0x07b4, B:329:0x07b7, B:330:0x07d5, B:332:0x07dc, B:333:0x07df), top: B:376:0x074e }] */
    /* JADX WARN: Code duplicated, block: B:332:0x07dc A[Catch: all -> 0x0814, TryCatch #5 {all -> 0x0814, blocks: (B:308:0x074e, B:309:0x0755, B:311:0x075b, B:313:0x0766, B:315:0x076b, B:318:0x0771, B:320:0x0776, B:322:0x077d, B:323:0x0780, B:334:0x07fa, B:335:0x07fb, B:324:0x07a8, B:326:0x07ad, B:328:0x07b4, B:329:0x07b7, B:330:0x07d5, B:332:0x07dc, B:333:0x07df), top: B:376:0x074e }] */
    /* JADX WARN: Code duplicated, block: B:342:0x0832  */
    /* JADX WARN: Code duplicated, block: B:344:0x0836  */
    /* JADX WARN: Code duplicated, block: B:345:0x0838  */
    /* JADX WARN: Code duplicated, block: B:348:0x0843  */
    /* JADX WARN: Code duplicated, block: B:351:0x084f  */
    /* JADX WARN: Code duplicated, block: B:353:0x0861  */
    /* JADX WARN: Code duplicated, block: B:356:0x089d  */
    /* JADX WARN: Code duplicated, block: B:360:0x08da  */
    /* JADX WARN: Code duplicated, block: B:368:0x06e5 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:376:0x074e A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:398:0x08a0 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:67:0x0201  */
    /* JADX WARN: Code duplicated, block: B:68:0x020c  */
    /* JADX WARN: Code duplicated, block: B:72:0x0212  */
    /* JADX WARN: Code duplicated, block: B:75:0x021e  */
    /* JADX WARN: Code duplicated, block: B:76:0x0230  */
    /* JADX WARN: Code duplicated, block: B:79:0x0239  */
    /* JADX WARN: Code duplicated, block: B:82:0x023e  */
    /* JADX WARN: Code duplicated, block: B:85:0x024f  */
    /* JADX WARN: Code duplicated, block: B:87:0x0257  */
    /* JADX WARN: Code duplicated, block: B:88:0x025b  */
    /* JADX WARN: Code duplicated, block: B:90:0x0268  */
    /* JADX WARN: Code duplicated, block: B:92:0x0270  */
    /* JADX WARN: Code duplicated, block: B:93:0x027b  */
    /* JADX WARN: Code duplicated, block: B:96:0x028f  */
    /* JADX WARN: Code duplicated, block: B:97:0x029a  */
    public final byte[] a() {
        int length;
        int length2;
        int length3;
        int i;
        long jB;
        int i2;
        int size;
        int i3;
        int i4;
        int i5;
        int i6;
        long jB2;
        int i7;
        byte[] bArr;
        byte b2;
        int length4;
        int i8;
        int length5;
        int length6;
        int i9;
        int length7;
        int i10;
        char c2;
        int length8;
        byte[] bArrA;
        int i11;
        int length9;
        byte[] bArr2;
        int length10;
        int length11;
        byte[] bArr3;
        List<com.autonavi.aps.amapapi.restruct.f> list;
        int size2;
        int iCurrentTimeMillis;
        float f;
        List<com.autonavi.aps.amapapi.restruct.d> list2;
        int size3;
        int i12;
        int length12;
        byte b3;
        int length13;
        int length14;
        boolean zIsEmpty;
        int i13;
        byte[] bArr4;
        int length15;
        int length16;
        b();
        byte[] bArr5 = new byte[2];
        int i14 = 4;
        byte[] bArr6 = new byte[4];
        byte[] bArr7 = this.H;
        int length17 = bArr7 != null ? bArr7.length + 4097 : 4096;
        byte[] bArr8 = this.Q;
        if (bArr8 == null || length17 > this.R) {
            bArr8 = new byte[length17];
            this.Q = bArr8;
            this.R = length17;
        }
        bArr8[0] = k.g(this.f3991a);
        byte[] bArrA2 = k.a(this.f3992b, (byte[]) null);
        int i15 = 1;
        System.arraycopy(bArrA2, 0, bArr8, 1, bArrA2.length);
        int iA = a(this.q, bArr8, a(this.p, bArr8, a(this.h, bArr8, a(this.u, bArr8, a(this.g, bArr8, a(this.f, bArr8, a(this.e, bArr8, a(this.o, bArr8, a(this.d, bArr8, a(this.f3993c, bArr8, bArrA2.length + 1))))))))));
        try {
            if (TextUtils.isEmpty(this.t)) {
                bArr8[iA] = 0;
                length = iA + 1;
            } else {
                byte[] bArrA3 = a(this.t);
                bArr8[iA] = (byte) bArrA3.length;
                int i16 = iA + 1;
                System.arraycopy(bArrA3, 0, bArr8, i16, bArrA3.length);
                length = i16 + bArrA3.length;
            }
        } catch (Throwable th) {
            com.autonavi.aps.amapapi.utils.c.a(th, "Req", "buildV4Dot219");
            bArr8[iA] = 0;
        }
        int iA2 = a(this.x, bArr8, a(K, bArr8, a(I, bArr8, a(this.w, bArr8, a(this.v, bArr8, length)))));
        bArr8[iA2] = Byte.parseByte(this.y);
        bArr8[iA2 + 1] = Byte.parseByte(this.j);
        int i17 = this.z;
        int i18 = i17 & 3;
        bArr8[iA2 + 2] = (byte) i17;
        int length18 = iA2 + 3;
        int i19 = -128;
        if (i18 == 1 || i18 == 2) {
            byte[] bArrA4 = k.a(this.A.size() > 0 ? this.A.get(0).f3947a : 0, (byte[]) null);
            System.arraycopy(bArrA4, 0, bArr8, length18, bArrA4.length);
            int length19 = length18 + bArrA4.length;
            if (i18 == 1) {
                byte[] bArrA5 = k.a(this.A.size() > 0 ? this.A.get(0).f3948b : 0, (byte[]) null);
                System.arraycopy(bArrA5, 0, bArr8, length19, bArrA5.length);
                int length20 = length19 + bArrA5.length;
                byte[] bArrA6 = k.a(this.A.size() > 0 ? this.A.get(0).f3949c : 0, (byte[]) null);
                System.arraycopy(bArrA6, 0, bArr8, length20, bArrA6.length);
                length2 = length20 + bArrA6.length;
                byte[] bArrB = k.b(this.A.size() > 0 ? this.A.get(0).d : 0, (byte[]) null);
                System.arraycopy(bArrB, 0, bArr8, length2, bArrB.length);
                length3 = bArrB.length;
            } else if (i18 == 2) {
                byte[] bArrA7 = k.a(this.A.size() > 0 ? this.A.get(0).h : 0, (byte[]) null);
                System.arraycopy(bArrA7, 0, bArr8, length19, bArrA7.length);
                int length21 = length19 + bArrA7.length;
                byte[] bArrA8 = k.a(this.A.size() > 0 ? this.A.get(0).i : 0, (byte[]) null);
                System.arraycopy(bArrA8, 0, bArr8, length21, bArrA8.length);
                int length22 = length21 + bArrA8.length;
                byte[] bArrA9 = k.a(this.A.size() > 0 ? this.A.get(0).j : 0, (byte[]) null);
                System.arraycopy(bArrA9, 0, bArr8, length22, bArrA9.length);
                int length23 = length22 + bArrA9.length;
                byte[] bArrB2 = k.b(this.A.size() > 0 ? this.A.get(0).g : 0, (byte[]) null);
                System.arraycopy(bArrB2, 0, bArr8, length23, bArrB2.length);
                length2 = length23 + bArrB2.length;
                byte[] bArrB3 = k.b(this.A.size() > 0 ? this.A.get(0).f : 0, (byte[]) null);
                System.arraycopy(bArrB3, 0, bArr8, length2, bArrB3.length);
                length3 = bArrB3.length;
            } else {
                if (this.A.size() > 0) {
                    i = this.A.get(0).k;
                } else {
                    i = 0;
                }
                if (i <= 127 || i < -128) {
                    i = 0;
                }
                bArr8[length19] = (byte) i;
                if (this.A.size() > 0) {
                    jB = (k.b() - this.A.get(0).t) / 1000;
                } else {
                    jB = 0;
                }
                if (jB > 65535) {
                    jB = 65535;
                }
                if (jB < 0) {
                    jB = 0;
                }
                byte[] bArrA10 = k.a((int) jB, bArr5);
                System.arraycopy(bArrA10, 0, bArr8, length19 + 1, bArrA10.length);
                i2 = length19 + 3;
                if (i18 == 1) {
                    if (this.A.size() == 0) {
                        bArr8[i2] = 0;
                        length18 = length19 + 4;
                    } else {
                        size = this.A.size();
                        bArr8[i2] = (byte) size;
                        length18 = length19 + 4;
                        i3 = 0;
                        while (i3 < size) {
                            if (this.A.size() > 0) {
                                i4 = this.A.get(i3).f3949c;
                            } else {
                                i4 = 0;
                            }
                            byte[] bArrA11 = k.a(i4, (byte[]) null);
                            System.arraycopy(bArrA11, 0, bArr8, length18, bArrA11.length);
                            int length24 = length18 + bArrA11.length;
                            if (this.A.size() > 0) {
                                i5 = this.A.get(i3).d;
                            } else {
                                i5 = 0;
                            }
                            byte[] bArrB4 = k.b(i5, (byte[]) null);
                            System.arraycopy(bArrB4, 0, bArr8, length24, bArrB4.length);
                            int length25 = length24 + bArrB4.length;
                            if (this.A.size() > 0) {
                                i6 = this.A.get(i3).k;
                            } else {
                                i6 = 0;
                            }
                            if (i6 <= 127 || i6 < i19) {
                                i6 = 0;
                            }
                            bArr8[length25] = (byte) i6;
                            length18 = length25 + i15;
                            if (Double.valueOf(com.autonavi.aps.amapapi.utils.c.f3998a).doubleValue() >= 5.2d) {
                                if (this.A.size() > 0) {
                                    jB2 = (k.b() - this.A.get(0).t) / 1000;
                                } else {
                                    jB2 = 0;
                                }
                                if (jB2 > 65535) {
                                    jB2 = 65535;
                                }
                                if (jB2 < 0) {
                                    jB2 = 0;
                                }
                                byte[] bArrA12 = k.a((int) jB2, bArr5);
                                System.arraycopy(bArrA12, 0, bArr8, length18, bArrA12.length);
                                length18 += bArrA12.length;
                            } else {
                                size = size;
                            }
                            i3++;
                            size = size;
                            i15 = 1;
                            i19 = -128;
                        }
                    }
                } else if (i18 == 2) {
                    bArr8[i2] = 0;
                    length18 = length19 + 4;
                } else {
                    length18 = i2;
                }
            }
            length19 = length2 + length3;
            if (this.A.size() > 0) {
                i = this.A.get(0).k;
            } else {
                i = 0;
            }
            if (i <= 127) {
                i = 0;
            } else {
                i = 0;
            }
            bArr8[length19] = (byte) i;
            if (this.A.size() > 0) {
                jB = (k.b() - this.A.get(0).t) / 1000;
            } else {
                jB = 0;
            }
            if (jB > 65535) {
                jB = 65535;
            }
            if (jB < 0) {
                jB = 0;
            }
            byte[] bArrA13 = k.a((int) jB, bArr5);
            System.arraycopy(bArrA13, 0, bArr8, length19 + 1, bArrA13.length);
            i2 = length19 + 3;
            if (i18 == 1) {
                if (this.A.size() == 0) {
                    bArr8[i2] = 0;
                    length18 = length19 + 4;
                } else {
                    size = this.A.size();
                    bArr8[i2] = (byte) size;
                    length18 = length19 + 4;
                    i3 = 0;
                    while (i3 < size) {
                        if (this.A.size() > 0) {
                            i4 = this.A.get(i3).f3949c;
                        } else {
                            i4 = 0;
                        }
                        byte[] bArrA14 = k.a(i4, (byte[]) null);
                        System.arraycopy(bArrA14, 0, bArr8, length18, bArrA14.length);
                        int length26 = length18 + bArrA14.length;
                        if (this.A.size() > 0) {
                            i5 = this.A.get(i3).d;
                        } else {
                            i5 = 0;
                        }
                        byte[] bArrB5 = k.b(i5, (byte[]) null);
                        System.arraycopy(bArrB5, 0, bArr8, length26, bArrB5.length);
                        int length27 = length26 + bArrB5.length;
                        if (this.A.size() > 0) {
                            i6 = this.A.get(i3).k;
                        } else {
                            i6 = 0;
                        }
                        if (i6 <= 127) {
                            i6 = 0;
                        } else {
                            i6 = 0;
                        }
                        bArr8[length27] = (byte) i6;
                        length18 = length27 + i15;
                        if (Double.valueOf(com.autonavi.aps.amapapi.utils.c.f3998a).doubleValue() >= 5.2d) {
                            if (this.A.size() > 0) {
                                jB2 = (k.b() - this.A.get(0).t) / 1000;
                            } else {
                                jB2 = 0;
                            }
                            if (jB2 > 65535) {
                                jB2 = 65535;
                            }
                            if (jB2 < 0) {
                                jB2 = 0;
                            }
                            byte[] bArrA15 = k.a((int) jB2, bArr5);
                            System.arraycopy(bArrA15, 0, bArr8, length18, bArrA15.length);
                            length18 += bArrA15.length;
                        } else {
                            size = size;
                        }
                        i3++;
                        size = size;
                        i15 = 1;
                        i19 = -128;
                    }
                }
            } else if (i18 == 2) {
                bArr8[i2] = 0;
                length18 = length19 + 4;
            } else {
                length18 = i2;
            }
        }
        String str = this.C;
        if (str != null && (this.z & 8) == 8) {
            try {
                byte[] bytes = str.getBytes("GBK");
                int iMin = Math.min(bytes.length, 60);
                bArr8[length18] = (byte) iMin;
                length18++;
                System.arraycopy(bytes, 0, bArr8, length18, iMin);
                i7 = length18 + iMin;
            } catch (Exception unused) {
                bArr8[length18] = 0;
                i7 = length18 + 1;
            }
        } else {
            bArr8[length18] = 0;
            i7 = length18 + 1;
        }
        ArrayList<com.autonavi.aps.amapapi.restruct.d> arrayList = this.B;
        int size4 = arrayList.size();
        if ((this.z & 4) == 4 && size4 > 0) {
            arrayList.get(0);
            bArr8[i7] = (byte) size4;
            int i20 = 1;
            length4 = i7 + 1;
            int i21 = 0;
            while (i21 < size4) {
                com.autonavi.aps.amapapi.restruct.d dVar = arrayList.get(i21);
                if (dVar.l == i20 || dVar.l == 3 || dVar.l == i14) {
                    bArr4 = bArr6;
                    byte b4 = (byte) dVar.l;
                    if (dVar.n) {
                        b4 = (byte) (b4 | 8);
                    }
                    bArr8[length4] = b4;
                    int i22 = length4 + 1;
                    byte[] bArrA16 = k.a(dVar.f3947a, bArr5);
                    System.arraycopy(bArrA16, 0, bArr8, i22, bArrA16.length);
                    int length28 = i22 + bArrA16.length;
                    byte[] bArrA17 = k.a(dVar.f3948b, bArr5);
                    System.arraycopy(bArrA17, 0, bArr8, length28, bArrA17.length);
                    int length29 = length28 + bArrA17.length;
                    byte[] bArrA18 = k.a(dVar.f3949c, bArr5);
                    System.arraycopy(bArrA18, 0, bArr8, length29, bArrA18.length);
                    int length30 = length29 + bArrA18.length;
                    byte[] bArrB6 = k.b(dVar.d, bArr4);
                    System.arraycopy(bArrB6, 0, bArr8, length30, bArrB6.length);
                    length4 = length30 + bArrB6.length;
                } else {
                    if (dVar.l == 2) {
                        byte b5 = (byte) dVar.l;
                        if (dVar.n) {
                            b5 = (byte) (b5 | 8);
                        }
                        bArr8[length4] = b5;
                        int i23 = length4 + 1;
                        byte[] bArrA19 = k.a(dVar.f3947a, bArr5);
                        System.arraycopy(bArrA19, 0, bArr8, i23, bArrA19.length);
                        int length31 = i23 + bArrA19.length;
                        byte[] bArrA20 = k.a(dVar.h, bArr5);
                        System.arraycopy(bArrA20, 0, bArr8, length31, bArrA20.length);
                        int length32 = length31 + bArrA20.length;
                        byte[] bArrA21 = k.a(dVar.i, bArr5);
                        System.arraycopy(bArrA21, 0, bArr8, length32, bArrA21.length);
                        int length33 = length32 + bArrA21.length;
                        byte[] bArrA22 = k.a(dVar.j, bArr5);
                        System.arraycopy(bArrA22, 0, bArr8, length33, bArrA22.length);
                        int length34 = length33 + bArrA22.length;
                        byte[] bArrB7 = k.b(dVar.g, bArr6);
                        System.arraycopy(bArrB7, 0, bArr8, length34, bArrB7.length);
                        int length35 = length34 + bArrB7.length;
                        byte[] bArrB8 = k.b(dVar.f, bArr6);
                        System.arraycopy(bArrB8, 0, bArr8, length35, bArrB8.length);
                        length4 = length35 + bArrB8.length;
                    } else if (dVar.l == 5) {
                        byte b6 = (byte) dVar.l;
                        if (dVar.n) {
                            b6 = (byte) (b6 | 8);
                        }
                        bArr8[length4] = b6;
                        int i24 = length4 + 1;
                        byte[] bArrA23 = k.a(dVar.f3947a, bArr5);
                        System.arraycopy(bArrA23, 0, bArr8, i24, bArrA23.length);
                        int length36 = i24 + bArrA23.length;
                        byte[] bArrA24 = k.a(dVar.f3948b, bArr5);
                        System.arraycopy(bArrA24, 0, bArr8, length36, bArrA24.length);
                        int length37 = length36 + bArrA24.length;
                        byte[] bArrA25 = k.a(dVar.f3949c, bArr5);
                        System.arraycopy(bArrA25, 0, bArr8, length37, bArrA25.length);
                        int length38 = length37 + bArrA25.length;
                        bArr4 = bArr6;
                        System.arraycopy(k.a(dVar.e), 0, bArr8, length38, 8);
                        length4 = length38 + 8;
                    }
                    bArr4 = bArr6;
                }
                int i25 = dVar.k;
                if (i25 > 127 || i25 < -128) {
                    i25 = 99;
                }
                bArr8[length4] = (byte) i25;
                int i26 = length4 + 1;
                int i27 = size4;
                byte[] bArrA26 = k.a((short) ((k.b() - dVar.t) / 1000), bArr5);
                System.arraycopy(bArrA26, 0, bArr8, i26, bArrA26.length);
                length4 = i26 + bArrA26.length;
                if (dVar.l == 3 || dVar.l == 4 || dVar.l == 5) {
                    if (Double.valueOf(com.autonavi.aps.amapapi.utils.c.f3998a).doubleValue() >= 5.0d) {
                        int i28 = dVar.o;
                        if (i28 > 32767) {
                            i28 = 32767;
                        }
                        byte[] bArrA27 = k.a(i28 >= 0 ? i28 : 32767, bArr5);
                        System.arraycopy(bArrA27, 0, bArr8, length4, bArrA27.length);
                        length4 += bArrA27.length;
                        if (Double.valueOf(com.autonavi.aps.amapapi.utils.c.f3998a).doubleValue() >= 5.3d) {
                            byte[] bArrB9 = k.b(dVar.p, bArr4);
                            System.arraycopy(bArrB9, 0, bArr8, length4, bArrB9.length);
                            length15 = length4 + bArrB9.length;
                            byte[] bArrB10 = k.b(dVar.q, bArr4);
                            System.arraycopy(bArrB10, 0, bArr8, length15, bArrB10.length);
                            length16 = bArrB10.length;
                            length4 = length15 + length16;
                        }
                    }
                } else if (dVar.l == 1 && Double.valueOf(com.autonavi.aps.amapapi.utils.c.f3998a).doubleValue() >= 5.3d) {
                    int i29 = dVar.o;
                    if (i29 > 32767) {
                        i29 = 32767;
                    }
                    byte[] bArrA28 = k.a(i29 >= 0 ? i29 : 32767, bArr5);
                    System.arraycopy(bArrA28, 0, bArr8, length4, bArrA28.length);
                    int length39 = length4 + bArrA28.length;
                    byte[] bArrB11 = k.b(dVar.p, bArr4);
                    System.arraycopy(bArrB11, 0, bArr8, length39, bArrB11.length);
                    length15 = length39 + bArrB11.length;
                    byte[] bArrB12 = k.b(dVar.q, bArr4);
                    System.arraycopy(bArrB12, 0, bArr8, length15, bArrB12.length);
                    length16 = bArrB12.length;
                    length4 = length15 + length16;
                }
                i21++;
                bArr6 = bArr4;
                size4 = i27;
                i14 = 4;
                i20 = 1;
            }
            bArr = bArr6;
            b2 = 1;
        } else {
            bArr = bArr6;
            bArr8[i7] = 0;
            b2 = 1;
            length4 = i7 + 1;
        }
        if (TextUtils.isEmpty(this.D) || this.D.length() == 0) {
            bArr8[length4] = 0;
            i8 = 1;
            length5 = length4 + 1;
        } else {
            bArr8[length4] = b2;
            length5 = length4 + 1;
            try {
                String[] strArrSplit = this.D.split(",");
                byte[] bArrA29 = a(strArrSplit[0]);
                System.arraycopy(bArrA29, 0, bArr8, length5, bArrA29.length);
                length5 += bArrA29.length;
                try {
                    byte[] bytes2 = strArrSplit[2].getBytes("GBK");
                    int length40 = bytes2.length;
                    if (length40 > 127) {
                        length40 = 127;
                    }
                    bArr8[length5] = (byte) length40;
                    length5++;
                    System.arraycopy(bytes2, 0, bArr8, length5, length40);
                    i13 = length5 + length40;
                } catch (Throwable th2) {
                    com.autonavi.aps.amapapi.utils.c.a(th2, "Req", "buildV4Dot214");
                    bArr8[length5] = 0;
                    i13 = length5 + 1;
                }
                int i30 = Integer.parseInt(strArrSplit[1]);
                if (i30 > 127 || i30 < -128) {
                    i30 = 0;
                }
                bArr8[i13] = Byte.parseByte(String.valueOf(i30));
                length5 = i13 + 1;
                if (Double.valueOf(com.autonavi.aps.amapapi.utils.c.f3998a).doubleValue() >= 5.2d) {
                    byte[] bArrA30 = k.a(this.O, bArr5);
                    System.arraycopy(bArrA30, 0, bArr8, length5, bArrA30.length);
                    length5 += bArrA30.length;
                }
            } catch (Throwable th3) {
                com.autonavi.aps.amapapi.utils.c.a(th3, "Req", "buildV4Dot216");
                byte[] bArrA31 = a("00:00:00:00:00:00");
                System.arraycopy(bArrA31, 0, bArr8, length5, bArrA31.length);
                int length41 = length5 + bArrA31.length;
                bArr8[length41] = 0;
                bArr8[length41 + 1] = Byte.parseByte("0");
                length5 = length41 + 2;
            }
            i8 = 1;
        }
        ArrayList<np> arrayList2 = this.E;
        int iMin2 = Math.min(arrayList2.size(), 25);
        int i31 = 65535;
        if (iMin2 == 0) {
            bArr8[length5] = 0;
            length6 = length5 + i8;
        } else {
            bArr8[length5] = (byte) iMin2;
            int length42 = length5 + i8;
            boolean z = k.c() >= 17;
            long jB3 = z ? k.b() / 1000 : 0L;
            int i32 = 0;
            while (i32 < iMin2) {
                np npVar = arrayList2.get(i32);
                int i33 = i32;
                byte[] bArrA32 = a(np.a(npVar.f3231a));
                System.arraycopy(bArrA32, 0, bArr8, length42, bArrA32.length);
                int length43 = length42 + bArrA32.length;
                try {
                    byte[] bytes3 = npVar.f3232b.getBytes("GBK");
                    bArr8[length43] = (byte) bytes3.length;
                    length43++;
                    System.arraycopy(bytes3, 0, bArr8, length43, bytes3.length);
                    length7 = length43 + bytes3.length;
                    i9 = 1;
                } catch (Exception unused2) {
                    bArr8[length43] = 0;
                    i9 = 1;
                    length7 = length43 + 1;
                }
                int i34 = npVar.f3233c;
                if (i34 > 127 || i34 < -128) {
                    i34 = 0;
                }
                bArr8[length7] = Byte.parseByte(String.valueOf(i34));
                int i35 = length7 + i9;
                if (!z || (i10 = (int) (jB3 - (npVar.f / 1000))) < 0) {
                    i10 = 0;
                }
                if (i10 > 65535) {
                    i10 = 65535;
                }
                byte[] bArrA33 = k.a(i10, bArr5);
                System.arraycopy(bArrA33, 0, bArr8, i35, bArrA33.length);
                int length44 = i35 + bArrA33.length;
                byte[] bArrA34 = k.a(npVar.d, bArr5);
                System.arraycopy(bArrA34, 0, bArr8, length44, bArrA34.length);
                length42 = length44 + bArrA34.length;
                i32 = i33 + 1;
            }
            byte[] bArrA35 = k.a(Integer.parseInt(this.F), bArr5);
            System.arraycopy(bArrA35, 0, bArr8, length42, bArrA35.length);
            length6 = length42 + bArrA35.length;
        }
        bArr8[length6] = 0;
        int i36 = length6 + 1;
        try {
            String str2 = this.G;
            try {
                try {
                    try {
                        try {
                            if (str2 == null) {
                                bArr8[i36] = 0;
                            } else {
                                byte[] bytes4 = str2.getBytes("GBK");
                                if (bytes4.length > 127) {
                                    bytes4 = null;
                                }
                                if (bytes4 == null) {
                                    bArr8[i36] = 0;
                                } else {
                                    bArr8[i36] = (byte) bytes4.length;
                                    int i37 = length6 + 2;
                                    System.arraycopy(bytes4, 0, bArr8, i37, bytes4.length);
                                    length8 = i37 + bytes4.length;
                                }
                                c2 = 1;
                                bArrA = new byte[2];
                                bArrA[0] = 0;
                                bArrA[c2] = 0;
                                zIsEmpty = TextUtils.isEmpty(this.J);
                                if (!zIsEmpty) {
                                    bArrA = k.a(this.J.length(), bArr5);
                                }
                                System.arraycopy(bArrA, 0, bArr8, length8, 2);
                                length9 = length8 + 2;
                                if (!zIsEmpty) {
                                    try {
                                        byte[] bytes5 = this.J.getBytes("GBK");
                                        System.arraycopy(bytes5, 0, bArr8, length9, bytes5.length);
                                        length9 += bytes5.length;
                                    } catch (Throwable unused3) {
                                    }
                                }
                                i11 = 2;
                                System.arraycopy(k.a(0, bArr5), 0, bArr8, length9, i11);
                                byte[] bArr9 = new byte[i11];
                                // fill-array-data instruction
                                bArr9[0] = 0;
                                bArr9[1] = 0;
                                System.arraycopy(bArr9, 0, bArr8, length9 + 2, i11);
                                int i38 = length9 + 4;
                                bArr2 = this.H;
                                if (bArr2 != null) {
                                    length10 = bArr2.length;
                                } else {
                                    length10 = 0;
                                }
                                byte[] bArrA36 = k.a(length10, (byte[]) null);
                                System.arraycopy(bArrA36, 0, bArr8, i38, bArrA36.length);
                                length11 = i38 + bArrA36.length;
                                if (length10 > 0) {
                                    byte[] bArr10 = this.H;
                                    System.arraycopy(bArr10, 0, bArr8, length11, bArr10.length);
                                    length11 += this.H.length;
                                }
                                if (Double.valueOf(com.autonavi.aps.amapapi.utils.c.f3998a).doubleValue() >= 5.0d) {
                                    list2 = this.T;
                                    if (list2 != null) {
                                        size3 = list2.size();
                                    } else {
                                        size3 = 0;
                                    }
                                    bArr8[length11] = (byte) size3;
                                    i12 = length11 + 1;
                                    byte[] bArr11 = new byte[i12];
                                    System.arraycopy(bArr8, 0, bArr11, 0, i12);
                                    if (size3 > 0) {
                                        try {
                                            length12 = i12;
                                            for (com.autonavi.aps.amapapi.restruct.d dVar2 : this.T) {
                                                if (dVar2.l != 1 || dVar2.l == 3 || dVar2.l == 4) {
                                                    b3 = (byte) dVar2.l;
                                                    if (dVar2.n) {
                                                        b3 = (byte) (b3 | 8);
                                                    }
                                                    bArr8[length12] = b3;
                                                    int i39 = length12 + 1;
                                                    byte[] bArrA37 = k.a(dVar2.f3949c, bArr5);
                                                    System.arraycopy(bArrA37, 0, bArr8, i39, bArrA37.length);
                                                    length13 = i39 + bArrA37.length;
                                                    byte[] bArrB13 = k.b(dVar2.d, bArr);
                                                    System.arraycopy(bArrB13, 0, bArr8, length13, bArrB13.length);
                                                    length14 = bArrB13.length;
                                                } else {
                                                    if (dVar2.l == 2) {
                                                        byte b7 = (byte) dVar2.l;
                                                        if (dVar2.n) {
                                                            b7 = (byte) (b7 | 8);
                                                        }
                                                        bArr8[length12] = b7;
                                                        int i40 = length12 + 1;
                                                        byte[] bArrA38 = k.a(dVar2.h, bArr5);
                                                        System.arraycopy(bArrA38, 0, bArr8, i40, bArrA38.length);
                                                        int length45 = i40 + bArrA38.length;
                                                        byte[] bArrA39 = k.a(dVar2.i, bArr5);
                                                        System.arraycopy(bArrA39, 0, bArr8, length45, bArrA39.length);
                                                        length13 = length45 + bArrA39.length;
                                                        byte[] bArrA40 = k.a(dVar2.j, bArr5);
                                                        System.arraycopy(bArrA40, 0, bArr8, length13, bArrA40.length);
                                                        length14 = bArrA40.length;
                                                    } else if (dVar2.l == 5) {
                                                        byte b8 = (byte) dVar2.l;
                                                        if (dVar2.n) {
                                                            b8 = (byte) (b8 | 8);
                                                        }
                                                        bArr8[length12] = b8;
                                                        int i41 = length12 + 1;
                                                        byte[] bArrA41 = k.a(dVar2.f3949c, bArr5);
                                                        System.arraycopy(bArrA41, 0, bArr8, i41, bArrA41.length);
                                                        int length46 = i41 + bArrA41.length;
                                                        System.arraycopy(k.a(dVar2.e), 0, bArr8, length46, 8);
                                                        length12 = length46 + 8;
                                                    }
                                                    byte[] bArrA42 = k.a((short) ((k.b() - dVar2.t) / 1000), bArr5);
                                                    System.arraycopy(bArrA42, 0, bArr8, length12, bArrA42.length);
                                                    length12 += bArrA42.length;
                                                }
                                                length12 = length13 + length14;
                                                byte[] bArrA43 = k.a((short) ((k.b() - dVar2.t) / 1000), bArr5);
                                                System.arraycopy(bArrA43, 0, bArr8, length12, bArrA43.length);
                                                length12 += bArrA43.length;
                                            }
                                            i12 = length12;
                                        } catch (Throwable unused4) {
                                            System.arraycopy(bArr11, 0, bArr8, 0, i12);
                                            bArr8[length11] = 0;
                                        }
                                    }
                                    length11 = a(this.M, bArr8, i12);
                                }
                                if (Double.valueOf(com.autonavi.aps.amapapi.utils.c.f3998a).doubleValue() >= 5.2d) {
                                    list = this.S;
                                    if (list == null) {
                                        size2 = 0;
                                    } else {
                                        size2 = list.size();
                                    }
                                    bArr8[length11] = (byte) size2;
                                    length11++;
                                    if (size2 > 0) {
                                        for (com.autonavi.aps.amapapi.restruct.f fVar : this.S) {
                                            iCurrentTimeMillis = ((int) (System.currentTimeMillis() - fVar.d)) / 1000;
                                            if (iCurrentTimeMillis > i31) {
                                                iCurrentTimeMillis = i31;
                                            }
                                            System.arraycopy(k.a(iCurrentTimeMillis, bArr5), 0, bArr8, length11, 2);
                                            System.arraycopy(k.b((int) Math.round(fVar.f3957c * 1.0E7d), bArr), 0, bArr8, length11 + 2, 4);
                                            byte[] bArr12 = bArr8;
                                            System.arraycopy(k.b((int) Math.round(fVar.f3956b * 1.0E7d), bArr), 0, bArr12, length11 + 6, 4);
                                            f = fVar.e;
                                            if (f > 65535.0f) {
                                                f = 65535.0f;
                                            }
                                            System.arraycopy(k.a((int) f, bArr5), 0, bArr12, length11 + 10, 2);
                                            i31 = 65535;
                                            System.arraycopy(k.a((short) ((fVar.h | (fVar.f3955a << 13) | (fVar.g << 6)) & 65535), bArr5), 0, bArr12, length11 + 12, 2);
                                            length11 += 14;
                                            bArr8 = bArr12;
                                        }
                                    }
                                }
                                bArr3 = bArr8;
                                if (Double.valueOf(com.autonavi.aps.amapapi.utils.c.f3998a).doubleValue() >= 5.3d) {
                                    length11 = a(this.N, bArr3, length11);
                                }
                                byte[] bArr13 = new byte[length11];
                                System.arraycopy(bArr3, 0, bArr13, 0, length11);
                                CRC32 crc32 = new CRC32();
                                crc32.update(bArr13);
                                byte[] bArrA44 = k.a(crc32.getValue());
                                byte[] bArr14 = new byte[length11 + 8];
                                System.arraycopy(bArr13, 0, bArr14, 0, length11);
                                System.arraycopy(bArrA44, 0, bArr14, length11, 8);
                                return bArr14;
                            }
                            System.arraycopy(k.a(0, bArr5), 0, bArr8, length9, i11);
                        } catch (Throwable unused5) {
                        }
                        System.arraycopy(bArr9, 0, bArr8, length9 + 2, i11);
                    } catch (Throwable unused6) {
                    }
                    System.arraycopy(bArrA, 0, bArr8, length8, 2);
                    length9 = length8 + 2;
                    if (!zIsEmpty) {
                        byte[] bytes6 = this.J.getBytes("GBK");
                        System.arraycopy(bytes6, 0, bArr8, length9, bytes6.length);
                        length9 += bytes6.length;
                    }
                    i11 = 2;
                } catch (Throwable unused7) {
                    i11 = 2;
                    length9 = length8 + i11;
                }
                zIsEmpty = TextUtils.isEmpty(this.J);
                if (!zIsEmpty) {
                    bArrA = k.a(this.J.length(), bArr5);
                }
            } catch (Throwable unused8) {
                i11 = 2;
            }
            length8 = length6 + 2;
            c2 = 1;
        } catch (Throwable unused9) {
            bArr8[i36] = 0;
            c2 = 1;
            length8 = i36 + 1;
        }
        bArrA = new byte[2];
        bArrA[0] = 0;
        bArrA[c2] = 0;
        byte[] bArr15 = new byte[i11];
        // fill-array-data instruction
        bArr15[0] = 0;
        bArr15[1] = 0;
        int i310 = length9 + 4;
        bArr2 = this.H;
        if (bArr2 != null) {
            length10 = bArr2.length;
        } else {
            length10 = 0;
        }
        byte[] bArrA310 = k.a(length10, (byte[]) null);
        System.arraycopy(bArrA310, 0, bArr8, i310, bArrA310.length);
        length11 = i310 + bArrA310.length;
        if (length10 > 0) {
            byte[] bArr16 = this.H;
            System.arraycopy(bArr16, 0, bArr8, length11, bArr16.length);
            length11 += this.H.length;
        }
        if (Double.valueOf(com.autonavi.aps.amapapi.utils.c.f3998a).doubleValue() >= 5.0d) {
            list2 = this.T;
            if (list2 != null) {
                size3 = list2.size();
            } else {
                size3 = 0;
            }
            bArr8[length11] = (byte) size3;
            i12 = length11 + 1;
            byte[] bArr17 = new byte[i12];
            System.arraycopy(bArr8, 0, bArr17, 0, i12);
            if (size3 > 0) {
                length12 = i12;
                while (r0.hasNext()) {
                    if (dVar2.l != 1) {
                        b3 = (byte) dVar2.l;
                        if (dVar2.n) {
                            b3 = (byte) (b3 | 8);
                        }
                        bArr8[length12] = b3;
                        int i311 = length12 + 1;
                        byte[] bArrA311 = k.a(dVar2.f3949c, bArr5);
                        System.arraycopy(bArrA311, 0, bArr8, i311, bArrA311.length);
                        length13 = i311 + bArrA311.length;
                        byte[] bArrB14 = k.b(dVar2.d, bArr);
                        System.arraycopy(bArrB14, 0, bArr8, length13, bArrB14.length);
                        length14 = bArrB14.length;
                        length12 = length13 + length14;
                    } else {
                        b3 = (byte) dVar2.l;
                        if (dVar2.n) {
                            b3 = (byte) (b3 | 8);
                        }
                        bArr8[length12] = b3;
                        int i312 = length12 + 1;
                        byte[] bArrA312 = k.a(dVar2.f3949c, bArr5);
                        System.arraycopy(bArrA312, 0, bArr8, i312, bArrA312.length);
                        length13 = i312 + bArrA312.length;
                        byte[] bArrB15 = k.b(dVar2.d, bArr);
                        System.arraycopy(bArrB15, 0, bArr8, length13, bArrB15.length);
                        length14 = bArrB15.length;
                        length12 = length13 + length14;
                    }
                    byte[] bArrA45 = k.a((short) ((k.b() - dVar2.t) / 1000), bArr5);
                    System.arraycopy(bArrA45, 0, bArr8, length12, bArrA45.length);
                    length12 += bArrA45.length;
                }
                i12 = length12;
            }
            length11 = a(this.M, bArr8, i12);
        }
        if (Double.valueOf(com.autonavi.aps.amapapi.utils.c.f3998a).doubleValue() >= 5.2d) {
            list = this.S;
            if (list == null) {
                size2 = 0;
            } else {
                size2 = list.size();
            }
            bArr8[length11] = (byte) size2;
            length11++;
            if (size2 > 0) {
                while (r0.hasNext()) {
                    iCurrentTimeMillis = ((int) (System.currentTimeMillis() - fVar.d)) / 1000;
                    if (iCurrentTimeMillis > i31) {
                        iCurrentTimeMillis = i31;
                    }
                    System.arraycopy(k.a(iCurrentTimeMillis, bArr5), 0, bArr8, length11, 2);
                    System.arraycopy(k.b((int) Math.round(fVar.f3957c * 1.0E7d), bArr), 0, bArr8, length11 + 2, 4);
                    byte[] bArr18 = bArr8;
                    System.arraycopy(k.b((int) Math.round(fVar.f3956b * 1.0E7d), bArr), 0, bArr18, length11 + 6, 4);
                    f = fVar.e;
                    if (f > 65535.0f) {
                        f = 65535.0f;
                    }
                    System.arraycopy(k.a((int) f, bArr5), 0, bArr18, length11 + 10, 2);
                    i31 = 65535;
                    System.arraycopy(k.a((short) ((fVar.h | (fVar.f3955a << 13) | (fVar.g << 6)) & 65535), bArr5), 0, bArr18, length11 + 12, 2);
                    length11 += 14;
                    bArr8 = bArr18;
                }
            }
        }
        bArr3 = bArr8;
        if (Double.valueOf(com.autonavi.aps.amapapi.utils.c.f3998a).doubleValue() >= 5.3d) {
            length11 = a(this.N, bArr3, length11);
        }
        byte[] bArr19 = new byte[length11];
        System.arraycopy(bArr3, 0, bArr19, 0, length11);
        CRC32 crc33 = new CRC32();
        crc33.update(bArr19);
        byte[] bArrA46 = k.a(crc33.getValue());
        byte[] bArr110 = new byte[length11 + 8];
        System.arraycopy(bArr19, 0, bArr110, 0, length11);
        System.arraycopy(bArrA46, 0, bArr110, length11, 8);
        return bArr110;
    }

    /* JADX WARN: Code duplicated, block: B:6:0x000f A[Catch: all -> 0x003f, TryCatch #0 {all -> 0x003f, blocks: (B:4:0x000c, B:10:0x001c, B:12:0x001f, B:14:0x0028, B:15:0x0030, B:6:0x000f, B:8:0x0014), top: B:21:0x000c }] */
    /* JADX WARN: Code duplicated, block: B:8:0x0014 A[Catch: all -> 0x003f, LOOP:0: B:7:0x0012->B:8:0x0014, LOOP_END, TryCatch #0 {all -> 0x003f, blocks: (B:4:0x000c, B:10:0x001c, B:12:0x001f, B:14:0x0028, B:15:0x0030, B:6:0x000f, B:8:0x0014), top: B:21:0x000c }] */
    private byte[] a(String str) {
        int i;
        String[] strArrSplit = str.split(":");
        byte[] bArr = new byte[6];
        if (strArrSplit != null) {
            try {
                if (strArrSplit.length != 6) {
                    strArrSplit = new String[6];
                    for (i = 0; i < 6; i++) {
                        strArrSplit[i] = "0";
                    }
                }
            } catch (Throwable th) {
                com.autonavi.aps.amapapi.utils.c.a(th, "Req", "getMacBa ".concat(String.valueOf(str)));
                return a("00:00:00:00:00:00");
            }
        } else {
            strArrSplit = new String[6];
            while (i < 6) {
                strArrSplit[i] = "0";
            }
        }
        for (int i2 = 0; i2 < strArrSplit.length; i2++) {
            if (strArrSplit[i2].length() > 2) {
                strArrSplit[i2] = strArrSplit[i2].substring(0, 2);
            }
            bArr[i2] = (byte) Integer.parseInt(strArrSplit[i2], 16);
        }
        return bArr;
    }

    private void b() {
        String[] strArr = {this.f3991a, this.f3993c, this.d, this.e, this.f, this.g, this.h, this.i, this.l, this.m, this.n, this.o, this.p, this.q, this.r, this.s, this.t, this.u, this.v, this.w, this.x, this.D, this.F, this.G, I, this.M, this.N};
        for (int i = 0; i < 27; i++) {
            if (TextUtils.isEmpty(strArr[i])) {
                strArr[i] = "";
            }
        }
        if (TextUtils.isEmpty(this.j)) {
            this.j = "0";
        } else if (!"0".equals(this.j) && !"2".equals(this.j)) {
            this.j = "0";
        }
        if (TextUtils.isEmpty(this.k)) {
            this.k = "0";
        } else if (!"0".equals(this.k) && !"1".equals(this.k)) {
            this.k = "0";
        }
        if (TextUtils.isEmpty(this.y)) {
            this.y = "0";
        } else if (!"1".equals(this.y) && !"2".equals(this.y)) {
            this.y = "0";
        }
        if (!com.autonavi.aps.amapapi.restruct.e.a(this.z)) {
            this.z = 0;
        }
        if (this.H == null) {
            this.H = new byte[0];
        }
    }

    public final void a(Context context, boolean z, boolean z2, com.autonavi.aps.amapapi.restruct.e eVar, com.autonavi.aps.amapapi.restruct.k kVar, ConnectivityManager connectivityManager, String str, g gVar) {
        String str2;
        String str3;
        String str4;
        NetworkInfo activeNetworkInfo;
        String strA;
        String str5;
        ArrayList<np> arrayList;
        String strF = il.f(context);
        int iD = k.d();
        this.J = str;
        this.S = null;
        if (z2) {
            str2 = "api_serverSDK_130905";
            str3 = "S128DF1572465B890OE3F7A13167KLEI";
        } else {
            str2 = "UC_nlp_20131029";
            str3 = "BKZCHMBBSSUK7U8GLUKHBB56CCFF78U";
        }
        String str6 = str3;
        String str7 = str2;
        StringBuilder sb = new StringBuilder();
        int iG = eVar.g();
        int iH = eVar.h();
        TelephonyManager telephonyManagerI = eVar.i();
        ArrayList<com.autonavi.aps.amapapi.restruct.d> arrayListC = eVar.c();
        ArrayList<com.autonavi.aps.amapapi.restruct.d> arrayListD = eVar.d();
        ArrayList<np> arrayListE = kVar.e();
        String str8 = iH == 2 ? "1" : "0";
        if (telephonyManagerI == null) {
            str4 = "1";
        } else {
            if (TextUtils.isEmpty(com.autonavi.aps.amapapi.utils.c.g)) {
                try {
                    com.autonavi.aps.amapapi.utils.c.g = ip.k();
                } catch (Throwable th) {
                    com.autonavi.aps.amapapi.utils.c.a(th, "Aps", "getApsReq part4");
                }
            }
            str4 = "1";
            if (TextUtils.isEmpty(com.autonavi.aps.amapapi.utils.c.g) && Build.VERSION.SDK_INT < 29) {
                com.autonavi.aps.amapapi.utils.c.g = "888888888888888";
            }
            if (TextUtils.isEmpty(com.autonavi.aps.amapapi.utils.c.h)) {
                try {
                    com.autonavi.aps.amapapi.utils.c.h = ip.n();
                } catch (SecurityException unused) {
                } catch (Throwable th2) {
                    com.autonavi.aps.amapapi.utils.c.a(th2, "Aps", "getApsReq part2");
                }
            }
            if (TextUtils.isEmpty(com.autonavi.aps.amapapi.utils.c.h) && Build.VERSION.SDK_INT < 29) {
                com.autonavi.aps.amapapi.utils.c.h = "888888888888888";
            }
        }
        try {
            activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
        } catch (Throwable th3) {
            com.autonavi.aps.amapapi.utils.c.a(th3, "Aps", "getApsReq part");
            activeNetworkInfo = null;
        }
        boolean zA = kVar.a(connectivityManager);
        if (k.a(activeNetworkInfo) == -1) {
            strA = "";
            str5 = strA;
        } else {
            strA = k.a(connectivityManager);
            str5 = zA ? "2" : str4;
        }
        if ((iG & 4) == 4 && !arrayListD.isEmpty()) {
            this.B.clear();
            this.B.addAll(arrayListD);
        } else {
            this.B.clear();
        }
        this.A.clear();
        this.A.addAll(arrayListC);
        StringBuilder sb2 = new StringBuilder();
        if (kVar.l()) {
            if (zA) {
                j jVarN = kVar.n();
                if (com.autonavi.aps.amapapi.restruct.k.a(jVarN)) {
                    sb2.append(jVarN.a());
                    sb2.append(",");
                    int iC = jVarN.c();
                    if (iC < -128 || iC > 127) {
                        iC = 0;
                    }
                    sb2.append(iC);
                    sb2.append(",");
                    String strB = jVarN.b();
                    try {
                        if (strB.getBytes("UTF-8").length >= 32) {
                            strB = "unkwn";
                        }
                    } catch (Exception unused2) {
                    }
                    sb2.append(strB.replace("*", "."));
                }
            }
            if (arrayListE != null && (arrayList = this.E) != null) {
                arrayList.clear();
                this.E.addAll(arrayListE);
            }
        } else {
            kVar.g();
            ArrayList<np> arrayList2 = this.E;
            if (arrayList2 != null) {
                arrayList2.clear();
            }
        }
        this.f3992b = (short) 0;
        if (!z) {
            this.f3992b = (short) 2;
        }
        this.f3993c = str7;
        this.d = str6;
        this.f = Build.MODEL;
        this.g = OsType.ANDROID + Build.VERSION.RELEASE;
        this.h = k.b(context);
        this.i = str8;
        this.j = "0";
        this.k = "0";
        this.l = "0";
        this.m = "0";
        this.n = "0";
        this.o = strF;
        this.p = com.autonavi.aps.amapapi.utils.c.g;
        this.q = com.autonavi.aps.amapapi.utils.c.h;
        this.s = String.valueOf(iD);
        this.t = k.i(context);
        this.v = "6.4.9";
        this.w = null;
        this.u = "";
        this.x = strA;
        this.y = str5;
        this.z = iG;
        this.C = eVar.l();
        this.F = com.autonavi.aps.amapapi.restruct.k.q();
        this.D = sb2.toString();
        this.O = (int) ((k.b() - kVar.r()) / 1000);
        try {
            if (TextUtils.isEmpty(I)) {
                I = ip.f(context);
            }
        } catch (Throwable unused3) {
        }
        try {
            if (TextUtils.isEmpty(K)) {
                K = ip.a(context);
            }
        } catch (Throwable unused4) {
        }
        try {
            if (TextUtils.isEmpty(this.M)) {
                this.M = ip.f();
            }
        } catch (Throwable unused5) {
        }
        try {
            if (TextUtils.isEmpty(this.N)) {
                this.N = ip.e(context);
            }
        } catch (Throwable unused6) {
        }
        try {
            this.S = gVar.a(this.B, this.E);
            a(this.A, this.B);
        } catch (Throwable th4) {
            th4.printStackTrace();
        }
        sb.delete(0, sb.length());
        sb2.delete(0, sb2.length());
    }

    private void a(ArrayList<com.autonavi.aps.amapapi.restruct.d> arrayList, ArrayList<com.autonavi.aps.amapapi.restruct.d> arrayList2) {
        if (arrayList2 != null && arrayList2.size() > 0) {
            for (com.autonavi.aps.amapapi.restruct.d dVar : arrayList2) {
                if (dVar.r && dVar.n) {
                    a(dVar, this.T);
                    return;
                }
            }
        }
        if (arrayList == null || arrayList.size() <= 0) {
            return;
        }
        a(arrayList.get(0), this.T);
    }

    private static void a(com.autonavi.aps.amapapi.restruct.d dVar, List<com.autonavi.aps.amapapi.restruct.d> list) {
        if (dVar == null || list == null) {
            return;
        }
        int size = list.size();
        if (size == 0) {
            list.add(dVar);
            return;
        }
        int i = -1;
        long jMin = Long.MAX_VALUE;
        int i2 = 0;
        int i3 = -1;
        while (true) {
            if (i2 >= size) {
                i = i3;
                break;
            }
            com.autonavi.aps.amapapi.restruct.d dVar2 = list.get(i2);
            if (dVar.c() != null && dVar.c().equals(dVar2.c())) {
                if (dVar.s == dVar2.s) {
                    break;
                }
                dVar2.t = dVar.t;
                dVar2.s = dVar.s;
                break;
            }
            jMin = Math.min(jMin, dVar2.t);
            if (jMin == dVar2.t) {
                i3 = i2;
            }
            i2++;
        }
        if (i >= 0) {
            if (size < 3) {
                list.add(dVar);
            } else {
                if (dVar.t <= jMin || i >= size) {
                    return;
                }
                list.remove(i);
                list.add(dVar);
            }
        }
    }

    private static int a(String str, byte[] bArr, int i) {
        try {
            if (TextUtils.isEmpty(str)) {
                bArr[i] = 0;
                return i + 1;
            }
            byte[] bytes = str.getBytes("GBK");
            int length = bytes.length;
            if (length > 127) {
                length = 127;
            }
            bArr[i] = (byte) length;
            int i2 = i + 1;
            System.arraycopy(bytes, 0, bArr, i2, length);
            return i2 + length;
        } catch (Throwable th) {
            com.autonavi.aps.amapapi.utils.c.a(th, "Req", "copyContentWithByteLen");
            bArr[i] = 0;
            return i + 1;
        }
    }
}
