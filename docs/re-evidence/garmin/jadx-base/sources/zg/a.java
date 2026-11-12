package zg;

import com.google.common.primitives.UnsignedBytes;
import java.io.UnsupportedEncodingException;
import vb.h;

/* JADX INFO: loaded from: classes7.dex */
public class a {

    /* JADX INFO: renamed from: zg.a$a, reason: collision with other inner class name */
    public static abstract class AbstractC3814a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public byte[] f204655a;
    }

    public static class b extends AbstractC3814a {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final int[] f204656e = {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 62, -1, -1, -1, 63, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, -1, -1, -1, -2, -1, -1, -1, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, -1, -1, -1, -1, -1, -1, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50, 51, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1};

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final int[] f204657f = {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 62, -1, -1, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, -1, -1, -1, -2, -1, -1, -1, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, -1, -1, -1, -1, 63, -1, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50, 51, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1};

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f204658b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f204659c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final int[] f204660d;

        public b(int i14, byte[] bArr) {
            this.f204655a = bArr;
            this.f204660d = (i14 & 8) == 0 ? f204656e : f204657f;
            this.f204658b = 0;
            this.f204659c = 0;
        }
    }

    public static class c extends AbstractC3814a {

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public static final byte[] f204661i = {65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 43, 47};

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public static final byte[] f204662j = {65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 45, 95};

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final byte[] f204663b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f204664c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f204665d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final boolean f204666e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final boolean f204667f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final boolean f204668g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final byte[] f204669h;

        public c(int i14, byte[] bArr) {
            this.f204655a = bArr;
            this.f204666e = (i14 & 1) == 0;
            boolean z14 = (i14 & 2) == 0;
            this.f204667f = z14;
            this.f204668g = (i14 & 4) != 0;
            this.f204669h = (i14 & 8) == 0 ? f204661i : f204662j;
            this.f204663b = new byte[2];
            this.f204664c = 0;
            this.f204665d = z14 ? 19 : -1;
        }
    }

    /* JADX WARN: Code duplicated, block: B:49:0x00e1  */
    public static byte[] a(byte[] bArr) {
        int length = bArr.length;
        b bVar = new b(2, new byte[(length * 3) / 4]);
        int i14 = bVar.f204658b;
        if (i14 != 6) {
            byte[] bArr2 = bVar.f204655a;
            int i15 = bVar.f204659c;
            int i16 = 0;
            int i17 = 0;
            while (i16 < length) {
                int[] iArr = bVar.f204660d;
                if (i14 == 0) {
                    while (true) {
                        int i18 = i16 + 4;
                        if (i18 > length) {
                            break;
                        }
                        i15 = iArr[bArr[i16 + 3] & UnsignedBytes.MAX_VALUE] | (iArr[bArr[i16 + 1] & UnsignedBytes.MAX_VALUE] << 12) | (iArr[bArr[i16] & UnsignedBytes.MAX_VALUE] << 18) | (iArr[bArr[i16 + 2] & UnsignedBytes.MAX_VALUE] << 6);
                        if (i15 < 0) {
                            break;
                        }
                        bArr2[i17 + 2] = (byte) i15;
                        bArr2[i17 + 1] = (byte) (i15 >> 8);
                        bArr2[i17] = (byte) (i15 >> 16);
                        i17 += 3;
                        i16 = i18;
                    }
                    if (i16 >= length) {
                        break;
                    }
                }
                int i19 = i16 + 1;
                int i24 = iArr[bArr[i16] & UnsignedBytes.MAX_VALUE];
                if (i14 != 0) {
                    if (i14 == 1) {
                        if (i24 >= 0) {
                            i15 = (i15 << 6) | i24;
                        } else if (i24 != -1) {
                            bVar.f204658b = 6;
                        }
                        i16 = i19;
                    } else if (i14 == 2) {
                        if (i24 >= 0) {
                            i15 = (i15 << 6) | i24;
                        } else if (i24 == -2) {
                            bArr2[i17] = (byte) (i15 >> 4);
                            i17++;
                            i14 = 4;
                        } else if (i24 != -1) {
                            bVar.f204658b = 6;
                        }
                        i16 = i19;
                    } else if (i14 == 3) {
                        if (i24 >= 0) {
                            int i25 = (i15 << 6) | i24;
                            bArr2[i17 + 2] = (byte) i25;
                            bArr2[i17 + 1] = (byte) (i25 >> 8);
                            bArr2[i17] = (byte) (i25 >> 16);
                            i17 += 3;
                            i15 = i25;
                            i14 = 0;
                        } else if (i24 == -2) {
                            bArr2[i17 + 1] = (byte) (i15 >> 2);
                            bArr2[i17] = (byte) (i15 >> 10);
                            i17 += 2;
                            i14 = 5;
                        } else if (i24 != -1) {
                            bVar.f204658b = 6;
                        }
                        i16 = i19;
                    } else if (i14 == 4) {
                        if (i24 != -2) {
                            if (i24 != -1) {
                                bVar.f204658b = 6;
                            }
                        }
                        i16 = i19;
                    } else if (i14 == 5 && i24 != -1) {
                        bVar.f204658b = 6;
                    } else {
                        i16 = i19;
                    }
                    i14++;
                    i16 = i19;
                } else {
                    if (i24 >= 0) {
                        i14++;
                        i15 = i24;
                    } else if (i24 != -1) {
                        bVar.f204658b = 6;
                    }
                    i16 = i19;
                }
            }
            if (i14 != 1) {
                if (i14 == 2) {
                    bArr2[i17] = (byte) (i15 >> 4);
                    i17++;
                } else if (i14 == 3) {
                    int i26 = i17 + 1;
                    bArr2[i17] = (byte) (i15 >> 10);
                    i17 += 2;
                    bArr2[i26] = (byte) (i15 >> 2);
                } else if (i14 == 4) {
                    bVar.f204658b = 6;
                }
                bVar.f204658b = i14;
                byte[] bArr3 = bVar.f204655a;
                if (i17 == bArr3.length) {
                    return bArr3;
                }
                byte[] bArr4 = new byte[i17];
                System.arraycopy(bArr3, 0, bArr4, 0, i17);
                return bArr4;
            }
            bVar.f204658b = 6;
        }
        h.s("bad base-64");
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:29:0x0080  */
    /* JADX WARN: Code duplicated, block: B:43:0x00c8  */
    /* JADX WARN: Code duplicated, block: B:46:0x010c  */
    /* JADX WARN: Code duplicated, block: B:47:0x0111 A[EDGE_INSN: B:47:0x0111->B:38:0x00bd BREAK  A[LOOP:0: B:41:0x00c4->B:48:0x0119]] */
    /* JADX WARN: Code duplicated, block: B:48:0x0119 A[LOOP:0: B:41:0x00c4->B:48:0x0119, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:88:0x010a A[SYNTHETIC] */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public static byte[] b(byte[] r23) {
        /*
            Method dump skipped, instruction units count: 467
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: zg.a.b(byte[]):byte[]");
    }

    public static String c(byte[] bArr) {
        try {
            return new String(b(bArr), "US-ASCII");
        } catch (UnsupportedEncodingException e4) {
            h.q(e4);
            return null;
        }
    }
}
