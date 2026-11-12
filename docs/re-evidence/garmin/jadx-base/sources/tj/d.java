package tj;

/* JADX INFO: loaded from: classes7.dex */
public class d {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final float[] f164738b = {1.0f, 10.0f, 100.0f, 1000.0f, 10000.0f, 100000.0f, 1000000.0f, 1.0E7f, 1.0E8f, 1.0E9f, 1.0E10f, 1.0E11f, 1.0E12f, 1.0E13f, 1.0E14f, 1.0E15f, 1.0E16f, 1.0E17f, 1.0E18f, 1.0E19f, 1.0E20f, 1.0E21f, 1.0E22f, 1.0E23f, 1.0E24f, 1.0E25f, 1.0E26f, 1.0E27f, 1.0E28f, 1.0E29f, 1.0E30f, 1.0E31f, 1.0E32f, 1.0E33f, 1.0E34f, 1.0E35f, 1.0E36f, 1.0E37f, 1.0E38f};

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final float[] f164739c = {1.0f, 0.1f, 0.01f, 0.001f, 1.0E-4f, 1.0E-5f, 1.0E-6f, 1.0E-7f, 1.0E-8f, 1.0E-9f, 1.0E-10f, 1.0E-11f, 1.0E-12f, 1.0E-13f, 1.0E-14f, 1.0E-15f, 1.0E-16f, 1.0E-17f, 1.0E-18f, 1.0E-19f, 1.0E-20f, 1.0E-21f, 1.0E-22f, 1.0E-23f, 1.0E-24f, 1.0E-25f, 1.0E-26f, 1.0E-27f, 1.0E-28f, 1.0E-29f, 1.0E-30f, 1.0E-31f, 1.0E-32f, 1.0E-33f, 1.0E-34f, 1.0E-35f, 1.0E-36f, 1.0E-37f, 1.0E-38f};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f164740a;

    /* JADX WARN: Code duplicated, block: B:108:0x008a A[EDGE_INSN: B:108:0x008a->B:42:0x008a BREAK  A[LOOP:0: B:13:0x0034->B:41:0x0083], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:119:0x0101 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:15:0x0043  */
    /* JADX WARN: Code duplicated, block: B:17:0x0049 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:18:0x004b  */
    /* JADX WARN: Code duplicated, block: B:19:0x004e  */
    /* JADX WARN: Code duplicated, block: B:20:0x0051  */
    /* JADX WARN: Code duplicated, block: B:47:0x0095 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:48:0x0097 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:49:0x0098  */
    /* JADX WARN: Code duplicated, block: B:51:0x009c  */
    /* JADX WARN: Code duplicated, block: B:60:0x00b8 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:61:0x00b9  */
    /* JADX WARN: Code duplicated, block: B:63:0x00bf A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:64:0x00c1  */
    /* JADX WARN: Code duplicated, block: B:65:0x00c4  */
    /* JADX WARN: Code duplicated, block: B:66:0x00ce  */
    /* JADX WARN: Code duplicated, block: B:68:0x00d1  */
    /* JADX WARN: Code duplicated, block: B:69:0x00d4  */
    /* JADX WARN: Code duplicated, block: B:72:0x00de  */
    /* JADX WARN: Code duplicated, block: B:75:0x00e5  */
    /* JADX WARN: Code duplicated, block: B:84:0x0105 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:85:0x0106 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:86:0x0108  */
    /* JADX WARN: Code duplicated, block: B:87:0x010a  */
    public final float a(int i14, int i15, String str) {
        boolean z14;
        int i16;
        int i17;
        int i18;
        boolean z15;
        int i19;
        int i24;
        int i25;
        int i26;
        float f14;
        char cCharAt;
        int i27;
        char cCharAt2;
        boolean z16;
        boolean z17;
        int i28;
        int i29;
        int i30;
        char cCharAt3;
        char cCharAt4;
        this.f164740a = i14;
        if (i14 >= i15) {
            return Float.NaN;
        }
        char cCharAt5 = str.charAt(i14);
        if (cCharAt5 != '+') {
            if (cCharAt5 != '-') {
                z14 = false;
            } else {
                z14 = true;
            }
            int i34 = this.f164740a;
            long j8 = 0;
            i16 = 0;
            i17 = 0;
            i18 = 0;
            z15 = false;
            i19 = 0;
            while (true) {
                i24 = this.f164740a;
                if (i24 >= i15) {
                    break;
                }
                cCharAt4 = str.charAt(i24);
                if (cCharAt4 != '0') {
                    if (i16 == 0) {
                        i18++;
                    } else {
                        i17++;
                    }
                } else if (cCharAt4 < '1' && cCharAt4 <= '9') {
                    int i35 = i16 + i17;
                    while (i17 > 0) {
                        if (j8 > 922337203685477580L) {
                            return Float.NaN;
                        }
                        j8 *= 10;
                        i17--;
                    }
                    if (j8 > 922337203685477580L) {
                        return Float.NaN;
                    }
                    j8 = (j8 * 10) + ((long) (cCharAt4 - '0'));
                    i16 = i35 + 1;
                    if (j8 < 0) {
                        return Float.NaN;
                    }
                } else {
                    if (cCharAt4 != '.' || z15) {
                        break;
                    }
                    i19 = this.f164740a - i34;
                    z15 = true;
                }
                this.f164740a++;
            }
            if (!z15 && this.f164740a == i19 + 1) {
                return Float.NaN;
            }
            if (i16 == 0) {
                if (i18 == 0) {
                    return Float.NaN;
                }
                i16 = 1;
            }
            if (z15) {
                i17 = (i19 - i18) - i16;
            }
            i25 = this.f164740a;
            if (i25 < i15 && ((cCharAt = str.charAt(i25)) == 'E' || cCharAt == 'e')) {
                i27 = this.f164740a + 1;
                this.f164740a = i27;
                if (i27 == i15) {
                    return Float.NaN;
                }
                cCharAt2 = str.charAt(i27);
                if (cCharAt2 != '+') {
                    if (cCharAt2 != '-') {
                        switch (cCharAt2) {
                            case '0':
                            case '1':
                            case '2':
                            case '3':
                            case '4':
                            case '5':
                            case '6':
                            case '7':
                            case '8':
                            case '9':
                                z16 = false;
                                z17 = false;
                                break;
                            default:
                                this.f164740a--;
                                z17 = true;
                                z16 = false;
                                break;
                        }
                    } else {
                        z16 = true;
                    }
                    if (!z17) {
                        i28 = this.f164740a;
                        i29 = 0;
                        while (true) {
                            i30 = this.f164740a;
                            if (i30 >= i15 && (cCharAt3 = str.charAt(i30)) >= '0' && cCharAt3 <= '9') {
                                if (i29 > 922337203685477580L) {
                                    return Float.NaN;
                                }
                                i29 = (i29 * 10) + (cCharAt3 - '0');
                                this.f164740a++;
                            }
                        }
                        if (this.f164740a == i28) {
                            return Float.NaN;
                        }
                        if (z16) {
                            i17 -= i29;
                        } else {
                            i17 += i29;
                        }
                    }
                } else {
                    z16 = false;
                }
                this.f164740a++;
                z17 = false;
                if (!z17) {
                    i28 = this.f164740a;
                    i29 = 0;
                    while (true) {
                        i30 = this.f164740a;
                        if (i30 >= i15) {
                        }
                        i29 = (i29 * 10) + (cCharAt3 - '0');
                        this.f164740a++;
                    }
                    if (this.f164740a == i28) {
                        return Float.NaN;
                    }
                    if (z16) {
                        i17 -= i29;
                    } else {
                        i17 += i29;
                    }
                }
            }
            i26 = i16 + i17;
            if (i26 <= 39 || i26 < -44) {
                return Float.NaN;
            }
            float f15 = j8;
            if (j8 != 0) {
                if (i17 > 0) {
                    f14 = f164738b[i17];
                } else if (i17 < 0) {
                    if (i17 < -38) {
                        f15 = (float) (((double) f15) * 1.0E-20d);
                        i17 += 20;
                    }
                    f14 = f164739c[-i17];
                }
                f15 *= f14;
            }
            return z14 ? -f15 : f15;
        }
        z14 = false;
        this.f164740a++;
        int i36 = this.f164740a;
        long j14 = 0;
        i16 = 0;
        i17 = 0;
        i18 = 0;
        z15 = false;
        i19 = 0;
        while (true) {
            i24 = this.f164740a;
            if (i24 >= i15) {
                break;
                break;
            }
            cCharAt4 = str.charAt(i24);
            if (cCharAt4 != '0') {
                if (cCharAt4 < '1') {
                }
                if (cCharAt4 != '.') {
                    break;
                }
                break;
                break;
            }
            if (i16 == 0) {
                i18++;
            } else {
                i17++;
            }
            this.f164740a++;
        }
        if (!z15) {
        }
        if (i16 == 0) {
            if (i18 == 0) {
                return Float.NaN;
            }
            i16 = 1;
        }
        if (z15) {
            i17 = (i19 - i18) - i16;
        }
        i25 = this.f164740a;
        if (i25 < i15) {
            i27 = this.f164740a + 1;
            this.f164740a = i27;
            if (i27 == i15) {
                return Float.NaN;
            }
            cCharAt2 = str.charAt(i27);
            if (cCharAt2 != '+') {
                if (cCharAt2 != '-') {
                    switch (cCharAt2) {
                        case '0':
                        case '1':
                        case '2':
                        case '3':
                        case '4':
                        case '5':
                        case '6':
                        case '7':
                        case '8':
                        case '9':
                            z16 = false;
                            z17 = false;
                            break;
                        default:
                            this.f164740a--;
                            z17 = true;
                            z16 = false;
                            break;
                    }
                } else {
                    z16 = true;
                }
                if (!z17) {
                    i28 = this.f164740a;
                    i29 = 0;
                    while (true) {
                        i30 = this.f164740a;
                        if (i30 >= i15) {
                        }
                        i29 = (i29 * 10) + (cCharAt3 - '0');
                        this.f164740a++;
                    }
                    if (this.f164740a == i28) {
                        return Float.NaN;
                    }
                    if (z16) {
                        i17 -= i29;
                    } else {
                        i17 += i29;
                    }
                }
            } else {
                z16 = false;
            }
            this.f164740a++;
            z17 = false;
            if (!z17) {
                i28 = this.f164740a;
                i29 = 0;
                while (true) {
                    i30 = this.f164740a;
                    if (i30 >= i15) {
                    }
                    i29 = (i29 * 10) + (cCharAt3 - '0');
                    this.f164740a++;
                }
                if (this.f164740a == i28) {
                    return Float.NaN;
                }
                if (z16) {
                    i17 -= i29;
                } else {
                    i17 += i29;
                }
            }
        }
        i26 = i16 + i17;
        if (i26 <= 39) {
        }
        return Float.NaN;
    }
}
