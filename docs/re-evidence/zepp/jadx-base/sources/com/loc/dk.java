package com.loc;

/* JADX INFO: loaded from: classes18.dex */
public class dk {
    public static final /* synthetic */ boolean a = true;

    public static abstract class a {
        public byte[] a;
        public int b;
    }

    public static class b extends a {
        private static final int[] c = {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 62, -1, -1, -1, 63, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, -1, -1, -1, -2, -1, -1, -1, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, -1, -1, -1, -1, -1, -1, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50, 51, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1};
        private static final int[] d = {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 62, -1, -1, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, -1, -1, -1, -2, -1, -1, -1, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, -1, -1, -1, -1, 63, -1, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50, 51, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1};
        private int e;
        private int f;
        private final int[] g;

        public b(byte[] bArr) {
            this.a = bArr;
            this.g = c;
            this.e = 0;
            this.f = 0;
        }

        /* JADX WARN: Code duplicated, block: B:48:0x00d2  */
        /* JADX WARN: Code restructure failed: missing block: B:64:0x00f3, code lost:
        
            if (r1 != 4) goto L68;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final boolean a(byte[] bArr, int i) {
            int i2 = this.e;
            if (i2 == 6) {
                return false;
            }
            int i3 = i + 0;
            int i4 = this.f;
            byte[] bArr2 = this.a;
            int[] iArr = this.g;
            int i5 = 0;
            int i6 = 0;
            while (i5 < i3) {
                if (i2 == 0) {
                    while (true) {
                        int i7 = i5 + 4;
                        if (i7 > i3) {
                            break;
                        }
                        i4 = iArr[bArr[i5 + 3] & 255] | (iArr[bArr[i5 + 1] & 255] << 12) | (iArr[bArr[i5] & 255] << 18) | (iArr[bArr[i5 + 2] & 255] << 6);
                        if (i4 < 0) {
                            break;
                        }
                        bArr2[i6 + 2] = (byte) i4;
                        bArr2[i6 + 1] = (byte) (i4 >> 8);
                        bArr2[i6] = (byte) (i4 >> 16);
                        i6 += 3;
                        i5 = i7;
                    }
                    if (i5 >= i3) {
                        break;
                    }
                    this.e = 6;
                    return false;
                }
                i5++;
                int i8 = iArr[bArr[i5] & 255];
                if (i2 != 0) {
                    if (i2 != 1) {
                        if (i2 != 2) {
                            if (i2 != 3) {
                                if (i2 != 4) {
                                    if (i2 == 5 && i8 != -1) {
                                        this.e = 6;
                                        return false;
                                    }
                                } else if (i8 == -2) {
                                    i2++;
                                } else if (i8 != -1) {
                                    this.e = 6;
                                    return false;
                                }
                            } else if (i8 >= 0) {
                                i4 = (i4 << 6) | i8;
                                bArr2[i6 + 2] = (byte) i4;
                                bArr2[i6 + 1] = (byte) (i4 >> 8);
                                bArr2[i6] = (byte) (i4 >> 16);
                                i6 += 3;
                                i2 = 0;
                            } else if (i8 == -2) {
                                bArr2[i6 + 1] = (byte) (i4 >> 2);
                                bArr2[i6] = (byte) (i4 >> 10);
                                i6 += 2;
                                i2 = 5;
                            } else if (i8 != -1) {
                                this.e = 6;
                                return false;
                            }
                        } else if (i8 >= 0) {
                            i4 = (i4 << 6) | i8;
                            i2++;
                        } else if (i8 == -2) {
                            bArr2[i6] = (byte) (i4 >> 4);
                            i6++;
                            i2 = 4;
                        } else if (i8 != -1) {
                            this.e = 6;
                            return false;
                        }
                    } else if (i8 >= 0) {
                        i4 = (i4 << 6) | i8;
                        i2++;
                    } else if (i8 != -1) {
                        this.e = 6;
                        return false;
                    }
                } else if (i8 >= 0) {
                    i2++;
                    i4 = i8;
                } else if (i8 != -1) {
                    this.e = 6;
                    return false;
                }
            }
            if (i2 != 1) {
                if (i2 == 2) {
                    bArr2[i6] = (byte) (i4 >> 4);
                    i6++;
                } else if (i2 == 3) {
                    int i9 = i6 + 1;
                    bArr2[i6] = (byte) (i4 >> 10);
                    i6 = i9 + 1;
                    bArr2[i9] = (byte) (i4 >> 2);
                }
                this.e = i2;
                this.b = i6;
                return true;
            }
            this.e = 6;
            return false;
        }
    }

    private dk() {
    }

    public static byte[] a(byte[] bArr) {
        int length = bArr.length;
        b bVar = new b(new byte[(length * 3) / 4]);
        if (!bVar.a(bArr, length)) {
            throw new IllegalArgumentException("bad base-64");
        }
        int i = bVar.b;
        byte[] bArr2 = bVar.a;
        if (i == bArr2.length) {
            return bArr2;
        }
        byte[] bArr3 = new byte[i];
        System.arraycopy(bArr2, 0, bArr3, 0, i);
        return bArr3;
    }
}
