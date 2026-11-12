package com.loc;

import android.os.SystemClock;
import java.util.List;

/* JADX INFO: loaded from: classes18.dex */
public final class bt extends bs {
    public bt() {
        super(2048);
    }

    /* JADX WARN: Code duplicated, block: B:100:0x02b0 A[Catch: all -> 0x031b, TryCatch #0 {all -> 0x031b, blocks: (B:3:0x000b, B:5:0x0035, B:7:0x0039, B:9:0x003f, B:11:0x0043, B:14:0x004a, B:15:0x004e, B:17:0x0054, B:19:0x005e, B:20:0x006d, B:21:0x0070, B:23:0x0074, B:24:0x0084, B:26:0x0088, B:27:0x0098, B:29:0x009c, B:30:0x00ac, B:33:0x00b8, B:35:0x00c4, B:37:0x00cb, B:55:0x01bf, B:59:0x01c6, B:63:0x01ce, B:90:0x0286, B:92:0x028c, B:93:0x0290, B:95:0x0296, B:96:0x02a5, B:98:0x02ab, B:100:0x02b0, B:106:0x02cd, B:107:0x02e2, B:108:0x02ef, B:110:0x02fd, B:112:0x0304, B:113:0x0309, B:39:0x00e3, B:40:0x0110, B:42:0x0118, B:43:0x0145, B:45:0x0149, B:47:0x0150, B:49:0x016c, B:50:0x0189, B:52:0x018d, B:64:0x01e4, B:66:0x0200, B:71:0x021f, B:73:0x0223, B:74:0x022b, B:85:0x0265, B:75:0x0233, B:77:0x0237, B:78:0x0240, B:80:0x0244, B:81:0x0256, B:83:0x025a, B:86:0x0271), top: B:118:0x000b }] */
    /* JADX WARN: Code duplicated, block: B:105:0x02cc  */
    /* JADX WARN: Code duplicated, block: B:110:0x02fd A[Catch: all -> 0x031b, TryCatch #0 {all -> 0x031b, blocks: (B:3:0x000b, B:5:0x0035, B:7:0x0039, B:9:0x003f, B:11:0x0043, B:14:0x004a, B:15:0x004e, B:17:0x0054, B:19:0x005e, B:20:0x006d, B:21:0x0070, B:23:0x0074, B:24:0x0084, B:26:0x0088, B:27:0x0098, B:29:0x009c, B:30:0x00ac, B:33:0x00b8, B:35:0x00c4, B:37:0x00cb, B:55:0x01bf, B:59:0x01c6, B:63:0x01ce, B:90:0x0286, B:92:0x028c, B:93:0x0290, B:95:0x0296, B:96:0x02a5, B:98:0x02ab, B:100:0x02b0, B:106:0x02cd, B:107:0x02e2, B:108:0x02ef, B:110:0x02fd, B:112:0x0304, B:113:0x0309, B:39:0x00e3, B:40:0x0110, B:42:0x0118, B:43:0x0145, B:45:0x0149, B:47:0x0150, B:49:0x016c, B:50:0x0189, B:52:0x018d, B:64:0x01e4, B:66:0x0200, B:71:0x021f, B:73:0x0223, B:74:0x022b, B:85:0x0265, B:75:0x0233, B:77:0x0237, B:78:0x0240, B:80:0x0244, B:81:0x0256, B:83:0x025a, B:86:0x0271), top: B:118:0x000b }] */
    /* JADX WARN: Code duplicated, block: B:112:0x0304 A[Catch: all -> 0x031b, TryCatch #0 {all -> 0x031b, blocks: (B:3:0x000b, B:5:0x0035, B:7:0x0039, B:9:0x003f, B:11:0x0043, B:14:0x004a, B:15:0x004e, B:17:0x0054, B:19:0x005e, B:20:0x006d, B:21:0x0070, B:23:0x0074, B:24:0x0084, B:26:0x0088, B:27:0x0098, B:29:0x009c, B:30:0x00ac, B:33:0x00b8, B:35:0x00c4, B:37:0x00cb, B:55:0x01bf, B:59:0x01c6, B:63:0x01ce, B:90:0x0286, B:92:0x028c, B:93:0x0290, B:95:0x0296, B:96:0x02a5, B:98:0x02ab, B:100:0x02b0, B:106:0x02cd, B:107:0x02e2, B:108:0x02ef, B:110:0x02fd, B:112:0x0304, B:113:0x0309, B:39:0x00e3, B:40:0x0110, B:42:0x0118, B:43:0x0145, B:45:0x0149, B:47:0x0150, B:49:0x016c, B:50:0x0189, B:52:0x018d, B:64:0x01e4, B:66:0x0200, B:71:0x021f, B:73:0x0223, B:74:0x022b, B:85:0x0265, B:75:0x0233, B:77:0x0237, B:78:0x0240, B:80:0x0244, B:81:0x0256, B:83:0x025a, B:86:0x0271), top: B:118:0x000b }] */
    /* JADX WARN: Code duplicated, block: B:95:0x0296 A[Catch: all -> 0x031b, LOOP:2: B:93:0x0290->B:95:0x0296, LOOP_END, TryCatch #0 {all -> 0x031b, blocks: (B:3:0x000b, B:5:0x0035, B:7:0x0039, B:9:0x003f, B:11:0x0043, B:14:0x004a, B:15:0x004e, B:17:0x0054, B:19:0x005e, B:20:0x006d, B:21:0x0070, B:23:0x0074, B:24:0x0084, B:26:0x0088, B:27:0x0098, B:29:0x009c, B:30:0x00ac, B:33:0x00b8, B:35:0x00c4, B:37:0x00cb, B:55:0x01bf, B:59:0x01c6, B:63:0x01ce, B:90:0x0286, B:92:0x028c, B:93:0x0290, B:95:0x0296, B:96:0x02a5, B:98:0x02ab, B:100:0x02b0, B:106:0x02cd, B:107:0x02e2, B:108:0x02ef, B:110:0x02fd, B:112:0x0304, B:113:0x0309, B:39:0x00e3, B:40:0x0110, B:42:0x0118, B:43:0x0145, B:45:0x0149, B:47:0x0150, B:49:0x016c, B:50:0x0189, B:52:0x018d, B:64:0x01e4, B:66:0x0200, B:71:0x021f, B:73:0x0223, B:74:0x022b, B:85:0x0265, B:75:0x0233, B:77:0x0237, B:78:0x0240, B:80:0x0244, B:81:0x0256, B:83:0x025a, B:86:0x0271), top: B:118:0x000b }] */
    /* JADX WARN: Code duplicated, block: B:98:0x02ab A[Catch: all -> 0x031b, TryCatch #0 {all -> 0x031b, blocks: (B:3:0x000b, B:5:0x0035, B:7:0x0039, B:9:0x003f, B:11:0x0043, B:14:0x004a, B:15:0x004e, B:17:0x0054, B:19:0x005e, B:20:0x006d, B:21:0x0070, B:23:0x0074, B:24:0x0084, B:26:0x0088, B:27:0x0098, B:29:0x009c, B:30:0x00ac, B:33:0x00b8, B:35:0x00c4, B:37:0x00cb, B:55:0x01bf, B:59:0x01c6, B:63:0x01ce, B:90:0x0286, B:92:0x028c, B:93:0x0290, B:95:0x0296, B:96:0x02a5, B:98:0x02ab, B:100:0x02b0, B:106:0x02cd, B:107:0x02e2, B:108:0x02ef, B:110:0x02fd, B:112:0x0304, B:113:0x0309, B:39:0x00e3, B:40:0x0110, B:42:0x0118, B:43:0x0145, B:45:0x0149, B:47:0x0150, B:49:0x016c, B:50:0x0189, B:52:0x018d, B:64:0x01e4, B:66:0x0200, B:71:0x021f, B:73:0x0223, B:74:0x022b, B:85:0x0265, B:75:0x0233, B:77:0x0237, B:78:0x0240, B:80:0x0244, B:81:0x0256, B:83:0x025a, B:86:0x0271), top: B:118:0x000b }] */
    public final byte[] a(db dbVar, bw.a aVar, long j, List<dc> list) {
        int iA;
        int iA2;
        int size;
        int[] iArr;
        int i;
        long j2;
        boolean z;
        List<cv> list2;
        int iA3;
        int i2;
        bu buVar;
        int i3;
        int i4;
        int iA4;
        byte b;
        short sA;
        super.a();
        try {
            int iA5 = ci.a(this.a, dbVar.c, dbVar.k, (int) (dbVar.e * 1000000.0d), (int) (dbVar.d * 1000000.0d), (int) dbVar.f, (int) dbVar.i, (int) dbVar.g, (short) dbVar.h, dbVar.l);
            if (aVar != null && (list2 = aVar.f) != null && list2.size() > 0) {
                List<cv> list3 = aVar.f;
                if (list3 != null && list3.size() != 0) {
                    for (cv cvVar : list3) {
                        if (cvVar instanceof cx) {
                            cx cxVar = (cx) cvVar;
                            sA = cs.a(cs.a(cxVar.j, cxVar.k));
                        } else if (cvVar instanceof cy) {
                            cy cyVar = (cy) cvVar;
                            sA = cs.a(cs.a(cyVar.j, cyVar.k));
                        } else if (cvVar instanceof cz) {
                            cz czVar = (cz) cvVar;
                            sA = cs.a(cs.a(czVar.j, czVar.k));
                        } else if (cvVar instanceof cw) {
                            cw cwVar = (cw) cvVar;
                            sA = cs.a(cs.a(cwVar.k, cwVar.l));
                        }
                        cvVar.g = sA;
                    }
                }
                int size2 = aVar.f.size();
                int[] iArr2 = new int[size2];
                int i5 = 0;
                while (true) {
                    if (i5 >= size2) {
                        iA5 = iA5;
                        iA = -1;
                        int iA6 = this.a.a(aVar.b);
                        int iA7 = ce.a(this.a, iArr2);
                        int size3 = aVar.g.size();
                        int[] iArr3 = new int[size3];
                        for (int i6 = 0; i6 < size3; i6++) {
                            cv cvVar2 = aVar.g.get(i6);
                            long jElapsedRealtime = (SystemClock.elapsedRealtime() - cvVar2.e) / 1000;
                            if (jElapsedRealtime > 32767 || jElapsedRealtime < 0) {
                                jElapsedRealtime = 32767;
                            }
                            if (cvVar2 instanceof cx) {
                                cx cxVar2 = (cx) cvVar2;
                                buVar = this.a;
                                i3 = cxVar2.j;
                                i4 = cxVar2.k;
                            } else if (cvVar2 instanceof cy) {
                                cy cyVar2 = (cy) cvVar2;
                                buVar = this.a;
                                i3 = cyVar2.j;
                                i4 = cyVar2.k;
                            } else {
                                if (cvVar2 instanceof cw) {
                                    cw cwVar2 = (cw) cvVar2;
                                    iA3 = cl.a(this.a, cwVar2.j, cwVar2.k, cwVar2.l, (short) jElapsedRealtime);
                                    i2 = 2;
                                } else if (cvVar2 instanceof cz) {
                                    cz czVar2 = (cz) cvVar2;
                                    buVar = this.a;
                                    i3 = czVar2.j;
                                    i4 = czVar2.k;
                                } else {
                                    iA3 = 0;
                                    i2 = 0;
                                }
                                iArr3[i6] = cf.a(this.a, (byte) i2, iA3);
                            }
                            iA3 = cm.a(buVar, i3, i4, (short) jElapsedRealtime);
                            i2 = 1;
                            iArr3[i6] = cf.a(this.a, (byte) i2, iA3);
                        }
                        iA2 = ce.a(this.a, iA6, aVar.a, iA7, ce.b(this.a, iArr3));
                        break;
                    }
                    cv cvVar3 = aVar.f.get(i5);
                    if (cvVar3 instanceof cx) {
                        cx cxVar3 = (cx) cvVar3;
                        iA4 = !cxVar3.i ? cj.a(this.a, cxVar3.j, cxVar3.k, cxVar3.c, cxVar3.l) : cj.a(this.a, cxVar3.b(), cxVar3.c(), cxVar3.j, cxVar3.k, cxVar3.c, cxVar3.m, cxVar3.n, cxVar3.d, cxVar3.l);
                        iA = -1;
                        b = 1;
                    } else {
                        iA5 = iA5;
                        size2 = size2;
                        if (cvVar3 instanceof cy) {
                            cy cyVar3 = (cy) cvVar3;
                            iA4 = ck.a(this.a, cyVar3.b(), cyVar3.c(), cyVar3.j, cyVar3.k, cyVar3.l, cyVar3.c, cyVar3.m, cyVar3.d);
                            iA = -1;
                            b = 3;
                        } else if (cvVar3 instanceof cw) {
                            cw cwVar3 = (cw) cvVar3;
                            iA4 = !cwVar3.i ? cd.a(this.a, cwVar3.j, cwVar3.k, cwVar3.l, cwVar3.m, cwVar3.n, cwVar3.c) : cd.a(this.a, cwVar3.j, cwVar3.k, cwVar3.l, cwVar3.m, cwVar3.n, cwVar3.c, cwVar3.d);
                            iA = -1;
                            b = 2;
                        } else if (cvVar3 instanceof cz) {
                            cz czVar3 = (cz) cvVar3;
                            iA4 = cn.a(this.a, czVar3.b(), czVar3.c(), czVar3.j, czVar3.k, czVar3.l, czVar3.c, czVar3.m, czVar3.d);
                            iA = -1;
                            b = 4;
                        } else {
                            iA4 = -1;
                            iA = -1;
                            b = 0;
                        }
                    }
                    if (iA4 != iA) {
                        iArr2[i5] = cg.a(this.a, (byte) (cvVar3.h ? 1 : 0), (byte) (cvVar3.i ? 1 : 0), (short) cvVar3.g, b, iA4);
                        i5++;
                        size2 = size2;
                        iA5 = iA5;
                    }
                }
                if (list != null && list.size() > 0) {
                    for (dc dcVar : list) {
                        dcVar.g = cs.b(dcVar.a);
                    }
                    size = list.size();
                    if (size > 0) {
                        iArr = new int[size];
                        for (i = 0; i < size; i++) {
                            dc dcVar2 = list.get(i);
                            int iA8 = this.a.a(dcVar2.b);
                            j2 = dcVar2.a;
                            if (j2 == j || j2 == -1) {
                                z = false;
                            } else {
                                z = true;
                            }
                            iArr[i] = cp.a(this.a, z, j2, (short) dcVar2.c, iA8, dcVar2.g, (short) dcVar2.d);
                        }
                        iA = co.a(this.a, co.a(this.a, iArr));
                    }
                }
                cb.a(this.a);
                cb.a(this.a, iA5);
                if (iA2 > 0) {
                    cb.c(this.a, iA2);
                }
                if (iA > 0) {
                    cb.b(this.a, iA);
                }
                this.a.c(cb.b(this.a));
                return this.a.c();
            }
            iA5 = iA5;
            iA = -1;
            iA2 = -1;
            if (list != null) {
                while (r2.hasNext()) {
                    dcVar.g = cs.b(dcVar.a);
                }
                size = list.size();
                if (size > 0) {
                    iArr = new int[size];
                    while (i < size) {
                        dc dcVar3 = list.get(i);
                        int iA9 = this.a.a(dcVar3.b);
                        j2 = dcVar3.a;
                        if (j2 == j) {
                            z = false;
                        } else {
                            z = false;
                        }
                        iArr[i] = cp.a(this.a, z, j2, (short) dcVar3.c, iA9, dcVar3.g, (short) dcVar3.d);
                    }
                    iA = co.a(this.a, co.a(this.a, iArr));
                }
            }
            cb.a(this.a);
            cb.a(this.a, iA5);
            if (iA2 > 0) {
                cb.c(this.a, iA2);
            }
            if (iA > 0) {
                cb.b(this.a, iA);
            }
            this.a.c(cb.b(this.a));
            return this.a.c();
        } catch (Throwable th) {
            df.a(th);
            return null;
        }
    }
}
