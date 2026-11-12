package com.alipay.sdk.m.o0;

import java.io.UnsupportedEncodingException;

/* JADX INFO: loaded from: classes4.dex */
public class b {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ boolean f2117c = true;

    public static abstract class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public byte[] f2118a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f2119b;
    }

    /* JADX INFO: renamed from: com.alipay.sdk.m.o0.b$b, reason: collision with other inner class name */
    public static class C0019b extends a {
        public static final /* synthetic */ boolean d = true;
        public int f;
        public final boolean g;
        public final byte[] h;
        public int i;
        public final boolean j;
        public final byte[] k;
        public final boolean l;
        public static final byte[] e = {65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 43, 47};

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final byte[] f2120c = {65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 45, 95};

        public C0019b(int i, byte[] bArr) {
            this.f2118a = bArr;
            this.j = (i & 1) == 0;
            boolean z = (i & 2) == 0;
            this.g = z;
            this.l = (i & 4) != 0;
            this.k = (i & 8) == 0 ? e : f2120c;
            this.h = new byte[2];
            this.i = 0;
            this.f = z ? 19 : -1;
        }

        /* JADX WARN: Code duplicated, block: B:12:0x004d  */
        /* JADX WARN: Code duplicated, block: B:27:0x0091  */
        /* JADX WARN: Code duplicated, block: B:31:0x00d5  */
        /* JADX WARN: Code duplicated, block: B:32:0x00d9 A[EDGE_INSN: B:32:0x00d9->B:22:0x0087 BREAK  A[LOOP:0: B:25:0x008d->B:33:0x00df]] */
        /* JADX WARN: Code duplicated, block: B:33:0x00df A[LOOP:0: B:25:0x008d->B:33:0x00df, LOOP_END] */
        /* JADX WARN: Code duplicated, block: B:99:0x00d1 A[SYNTHETIC] */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        public boolean d(byte[] r18, int r19, int r20, boolean r21) {
            /*
                Method dump skipped, instruction units count: 488
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.alipay.sdk.m.o0.b.C0019b.d(byte[], int, int, boolean):boolean");
        }
    }

    public static class c extends a {
        public int d;
        public int g;
        public final int[] h;
        public static final int[] e = {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 62, -1, -1, -1, 63, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, -1, -1, -1, -2, -1, -1, -1, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, -1, -1, -1, -1, -1, -1, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50, 51, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1};

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final int[] f2121c = {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 62, -1, -1, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, -1, -1, -1, -2, -1, -1, -1, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, -1, -1, -1, -1, 63, -1, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50, 51, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1};

        public c(int i, byte[] bArr) {
            this.f2118a = bArr;
            this.h = (i & 8) == 0 ? e : f2121c;
            this.d = 0;
            this.g = 0;
        }

        /* JADX WARN: Code duplicated, block: B:49:0x00ce  */
        public boolean d(byte[] bArr, int i, int i2, boolean z) {
            int i3 = this.d;
            if (i3 == 6) {
                return false;
            }
            int i4 = i2 + i;
            int i5 = this.g;
            byte[] bArr2 = this.f2118a;
            int[] iArr = this.h;
            int i6 = 0;
            int i7 = i5;
            int i8 = i3;
            int i9 = i;
            while (i9 < i4) {
                if (i8 == 0) {
                    while (true) {
                        int i10 = i9 + 4;
                        if (i10 > i4 || (i7 = (iArr[bArr[i9] & 255] << 18) | (iArr[bArr[i9 + 1] & 255] << 12) | (iArr[bArr[i9 + 2] & 255] << 6) | iArr[bArr[i9 + 3] & 255]) < 0) {
                            break;
                        }
                        bArr2[i6 + 2] = (byte) i7;
                        bArr2[i6 + 1] = (byte) (i7 >> 8);
                        bArr2[i6] = (byte) (i7 >> 16);
                        i6 += 3;
                        i9 = i10;
                    }
                    if (i9 >= i4) {
                        break;
                    }
                }
                int i11 = iArr[bArr[i9] & 255];
                if (i8 != 0) {
                    if (i8 != 1) {
                        if (i8 != 2) {
                            if (i8 != 3) {
                                if (i8 != 4) {
                                    if (i8 == 5 && i11 != -1) {
                                        this.d = 6;
                                        return false;
                                    }
                                } else if (i11 == -2) {
                                    i8++;
                                } else if (i11 != -1) {
                                    this.d = 6;
                                    return false;
                                }
                            } else if (i11 >= 0) {
                                int i12 = (i7 << 6) | i11;
                                bArr2[i6 + 2] = (byte) i12;
                                bArr2[i6 + 1] = (byte) (i12 >> 8);
                                bArr2[i6] = (byte) (i12 >> 16);
                                i6 += 3;
                                i7 = i12;
                                i8 = 0;
                            } else if (i11 == -2) {
                                bArr2[i6 + 1] = (byte) (i7 >> 2);
                                bArr2[i6] = (byte) (i7 >> 10);
                                i6 += 2;
                                i8 = 5;
                            } else if (i11 != -1) {
                                this.d = 6;
                                return false;
                            }
                        } else if (i11 >= 0) {
                            i7 = (i7 << 6) | i11;
                            i8++;
                        } else if (i11 == -2) {
                            bArr2[i6] = (byte) (i7 >> 4);
                            i6++;
                            i8 = 4;
                        } else if (i11 != -1) {
                            this.d = 6;
                            return false;
                        }
                    } else if (i11 >= 0) {
                        i7 = (i7 << 6) | i11;
                        i8++;
                    } else if (i11 != -1) {
                        this.d = 6;
                        return false;
                    }
                } else if (i11 >= 0) {
                    i8++;
                    i7 = i11;
                } else if (i11 != -1) {
                    this.d = 6;
                    return false;
                }
                i9++;
            }
            if (!z) {
                this.d = i8;
                this.g = i7;
                this.f2119b = i6;
                return true;
            }
            if (i8 == 1) {
                this.d = 6;
                return false;
            }
            if (i8 == 2) {
                bArr2[i6] = (byte) (i7 >> 4);
                i6++;
            } else if (i8 == 3) {
                bArr2[i6] = (byte) (i7 >> 10);
                bArr2[i6 + 1] = (byte) (i7 >> 2);
                i6 += 2;
            } else if (i8 == 4) {
                this.d = 6;
                return false;
            }
            this.d = i8;
            this.f2119b = i6;
            return true;
        }
    }

    public static byte[] b(byte[] bArr, int i) {
        return d(bArr, 0, bArr.length, i);
    }

    public static String c(byte[] bArr, int i) {
        try {
            return new String(b(bArr, i), "US-ASCII");
        } catch (UnsupportedEncodingException e) {
            throw new AssertionError(e);
        }
    }

    public static byte[] e(byte[] bArr, int i) {
        return b(bArr, 0, bArr.length, i);
    }

    public static byte[] b(byte[] bArr, int i, int i2, int i3) {
        c cVar = new c(i3, new byte[(i2 * 3) / 4]);
        if (!cVar.d(bArr, i, i2, true)) {
            throw new IllegalArgumentException("bad base-64");
        }
        int i4 = cVar.f2119b;
        byte[] bArr2 = cVar.f2118a;
        if (i4 == bArr2.length) {
            return bArr2;
        }
        byte[] bArr3 = new byte[i4];
        System.arraycopy(bArr2, 0, bArr3, 0, i4);
        return bArr3;
    }

    public static byte[] d(byte[] bArr, int i, int i2, int i3) {
        C0019b c0019b = new C0019b(i3, null);
        int i4 = (i2 / 3) * 4;
        if (!c0019b.j) {
            int i5 = i2 % 3;
            if (i5 == 1) {
                i4 += 2;
            } else if (i5 == 2) {
                i4 += 3;
            }
        } else if (i2 % 3 > 0) {
            i4 += 4;
        }
        if (c0019b.g && i2 > 0) {
            i4 += (((i2 - 1) / 57) + 1) * (c0019b.l ? 2 : 1);
        }
        c0019b.f2118a = new byte[i4];
        c0019b.d(bArr, i, i2, true);
        if (f2117c || c0019b.f2119b == i4) {
            return c0019b.f2118a;
        }
        throw new AssertionError();
    }
}
