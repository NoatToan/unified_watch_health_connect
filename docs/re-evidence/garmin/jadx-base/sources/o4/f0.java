package o4;

import okhttp3.internal.ws.WebSocketProtocol;

/* JADX INFO: loaded from: classes.dex */
public final class f0 {
    /* JADX WARN: Code duplicated, block: B:101:0x0149  */
    /* JADX WARN: Code duplicated, block: B:106:0x0160  */
    /* JADX WARN: Code duplicated, block: B:110:0x0167  */
    /* JADX WARN: Code duplicated, block: B:113:0x0174 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:114:0x0176  */
    /* JADX WARN: Code duplicated, block: B:116:0x017b  */
    /* JADX WARN: Code duplicated, block: B:118:0x017f  */
    /* JADX WARN: Code duplicated, block: B:119:0x0183 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:120:0x0185 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:121:0x0187  */
    /* JADX WARN: Code duplicated, block: B:123:0x0190  */
    /* JADX WARN: Code duplicated, block: B:125:0x0195  */
    /* JADX WARN: Code duplicated, block: B:126:0x0197  */
    /* JADX WARN: Code duplicated, block: B:128:0x019d  */
    /* JADX WARN: Code duplicated, block: B:130:0x01a6  */
    /* JADX WARN: Code duplicated, block: B:135:0x01b4  */
    /* JADX WARN: Code duplicated, block: B:139:0x01bb  */
    /* JADX WARN: Code duplicated, block: B:76:0x00fe  */
    /* JADX WARN: Code duplicated, block: B:80:0x0105  */
    /* JADX WARN: Code duplicated, block: B:83:0x0113 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:84:0x0115  */
    /* JADX WARN: Code duplicated, block: B:85:0x0118  */
    /* JADX WARN: Code duplicated, block: B:87:0x011b  */
    /* JADX WARN: Code duplicated, block: B:89:0x011f  */
    /* JADX WARN: Code duplicated, block: B:90:0x0123 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:91:0x0125 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:92:0x0127  */
    /* JADX WARN: Code duplicated, block: B:94:0x0130  */
    /* JADX WARN: Code duplicated, block: B:96:0x0136  */
    /* JADX WARN: Code duplicated, block: B:97:0x0139  */
    /* JADX WARN: Code duplicated, block: B:99:0x013f  */
    public static final long a(float f14, float f15, float f16, float f17, p4.c cVar) {
        int i14;
        int i15;
        int i16;
        float fC;
        float fB;
        int iFloatToRawIntBits;
        int i17;
        int i18;
        int i19;
        int i24;
        int i25;
        int i26;
        int i27;
        int i28;
        float fC2;
        float fB2;
        int iFloatToRawIntBits2;
        int i29;
        int i30;
        int i34;
        int i35;
        int i36;
        int i37;
        int i38;
        int i39;
        float f18;
        if (cVar.getF135615q()) {
            float f19 = f17 < 0.0f ? 0.0f : f17;
            if (f19 > 1.0f) {
                f19 = 1.0f;
            }
            int i44 = ((int) ((f19 * 255.0f) + 0.5f)) << 24;
            float f22 = f14 < 0.0f ? 0.0f : f14;
            if (f22 > 1.0f) {
                f22 = 1.0f;
            }
            int i45 = i44 | (((int) ((f22 * 255.0f) + 0.5f)) << 16);
            float f24 = f15 < 0.0f ? 0.0f : f15;
            if (f24 > 1.0f) {
                f24 = 1.0f;
            }
            int i46 = i45 | (((int) ((f24 * 255.0f) + 0.5f)) << 8);
            f18 = f16 >= 0.0f ? f16 : 0.0f;
            float f25 = f18 <= 1.0f ? f18 : 1.0f;
            o13.z.a aVar = o13.z.f128618b;
            long j8 = ((long) (i46 | ((int) ((f25 * 255.0f) + 0.5f)))) << 32;
            d0.a aVar2 = d0.f128823b;
            return j8;
        }
        long j14 = cVar.f135542b;
        p4.b.a aVar3 = p4.b.f135535b;
        if (((int) (j14 >> 32)) != 3) {
            y0.a("Color only works with ColorSpaces with 3 components");
        }
        int i47 = cVar.f135543c;
        if (i47 == -1) {
            y0.a("Unknown color space, please use a color space in ColorSpaces");
        }
        int i48 = 0;
        float fC3 = cVar.c(0);
        float fB3 = cVar.b(0);
        if (f14 >= fC3) {
            fC3 = f14;
        }
        if (fC3 <= fB3) {
            fB3 = fC3;
        }
        int iFloatToRawIntBits3 = Float.floatToRawIntBits(fB3);
        int i49 = iFloatToRawIntBits3 >>> 31;
        int i54 = (iFloatToRawIntBits3 >>> 23) & 255;
        int i55 = iFloatToRawIntBits3 & 8388607;
        if (i54 == 255) {
            i15 = i55 != 0 ? 512 : 0;
            i14 = 31;
        } else {
            i14 = i54 - 112;
            if (i14 >= 31) {
                i15 = 0;
                i14 = 49;
            } else {
                if (i14 > 0) {
                    int i56 = i55 >> 13;
                    if ((iFloatToRawIntBits3 & 4096) != 0) {
                        i16 = (((i14 << 10) | i56) + 1) | (i49 << 15);
                    } else {
                        i15 = i56;
                    }
                    short s8 = (short) i16;
                    fC = cVar.c(1);
                    fB = cVar.b(1);
                    if (f15 >= fC) {
                        fC = f15;
                    }
                    if (fC <= fB) {
                        fB = fC;
                    }
                    iFloatToRawIntBits = Float.floatToRawIntBits(fB);
                    i17 = iFloatToRawIntBits >>> 31;
                    i18 = (iFloatToRawIntBits >>> 23) & 255;
                    i19 = iFloatToRawIntBits & 8388607;
                    if (i18 == 255) {
                        if (i19 != 0) {
                            i26 = 512;
                        } else {
                            i26 = 0;
                        }
                        i24 = 31;
                    } else {
                        i24 = i18 - 112;
                        if (i24 >= 31) {
                            i26 = 0;
                            i24 = 49;
                        } else {
                            if (i24 <= 0) {
                                i25 = i19 >> 13;
                                if ((iFloatToRawIntBits & 4096) != 0) {
                                    i27 = (((i24 << 10) | i25) + 1) | (i17 << 15);
                                } else {
                                    i26 = i25;
                                }
                                short s14 = (short) i27;
                                fC2 = cVar.c(2);
                                fB2 = cVar.b(2);
                                if (f16 >= fC2) {
                                    fC2 = f16;
                                }
                                if (fC2 <= fB2) {
                                    fB2 = fC2;
                                }
                                iFloatToRawIntBits2 = Float.floatToRawIntBits(fB2);
                                i29 = iFloatToRawIntBits2 >>> 31;
                                i30 = (iFloatToRawIntBits2 >>> 23) & 255;
                                i34 = 8388607 & iFloatToRawIntBits2;
                                if (i30 == 255) {
                                    i37 = i34 != 0 ? 512 : 0;
                                    i48 = 31;
                                } else {
                                    i35 = i30 - 112;
                                    if (i35 >= 31) {
                                        i37 = 0;
                                        i48 = 49;
                                    } else {
                                        if (i35 <= 0) {
                                            i36 = i34 >> 13;
                                            if ((iFloatToRawIntBits2 & 4096) != 0) {
                                                i38 = (((i35 << 10) | i36) + 1) | (i29 << 15);
                                            } else {
                                                i37 = i36;
                                                i48 = i35;
                                            }
                                            short s15 = (short) i38;
                                            f18 = f17 >= 0.0f ? f17 : 0.0f;
                                            long j15 = (((long) i47) & 63) | ((((long) s8) & WebSocketProtocol.PAYLOAD_SHORT_MAX) << 48) | ((((long) s14) & WebSocketProtocol.PAYLOAD_SHORT_MAX) << 32) | ((WebSocketProtocol.PAYLOAD_SHORT_MAX & ((long) s15)) << 16) | ((((long) ((int) (((f18 <= 1.0f ? f18 : 1.0f) * 1023.0f) + 0.5f))) & 1023) << 6);
                                            o13.z.a aVar4 = o13.z.f128618b;
                                            d0.a aVar5 = d0.f128823b;
                                            return j15;
                                        }
                                        if (i35 >= -10) {
                                            i39 = (i34 | 8388608) >> (1 - i35);
                                            if ((i39 & 4096) != 0) {
                                                i39 += 8192;
                                            }
                                            i37 = i39 >> 13;
                                        } else {
                                            i37 = 0;
                                        }
                                    }
                                }
                                i38 = i37 | (i29 << 15) | (i48 << 10);
                                short s16 = (short) i38;
                                if (f17 >= 0.0f) {
                                }
                                long j16 = (((long) i47) & 63) | ((((long) s8) & WebSocketProtocol.PAYLOAD_SHORT_MAX) << 48) | ((((long) s14) & WebSocketProtocol.PAYLOAD_SHORT_MAX) << 32) | ((WebSocketProtocol.PAYLOAD_SHORT_MAX & ((long) s16)) << 16) | ((((long) ((int) (((f18 <= 1.0f ? f18 : 1.0f) * 1023.0f) + 0.5f))) & 1023) << 6);
                                o13.z.a aVar6 = o13.z.f128618b;
                                d0.a aVar7 = d0.f128823b;
                                return j16;
                            }
                            if (i24 >= -10) {
                                i28 = (i19 | 8388608) >> (1 - i24);
                                if ((i28 & 4096) != 0) {
                                    i28 += 8192;
                                }
                                i26 = i28 >> 13;
                                i24 = 0;
                            } else {
                                i26 = 0;
                                i24 = 0;
                            }
                        }
                    }
                    i27 = i26 | (i17 << 15) | (i24 << 10);
                    short s17 = (short) i27;
                    fC2 = cVar.c(2);
                    fB2 = cVar.b(2);
                    if (f16 >= fC2) {
                        fC2 = f16;
                    }
                    if (fC2 <= fB2) {
                        fB2 = fC2;
                    }
                    iFloatToRawIntBits2 = Float.floatToRawIntBits(fB2);
                    i29 = iFloatToRawIntBits2 >>> 31;
                    i30 = (iFloatToRawIntBits2 >>> 23) & 255;
                    i34 = 8388607 & iFloatToRawIntBits2;
                    if (i30 == 255) {
                        i37 = i34 != 0 ? 512 : 0;
                        i48 = 31;
                    } else {
                        i35 = i30 - 112;
                        if (i35 >= 31) {
                            i37 = 0;
                            i48 = 49;
                        } else {
                            if (i35 <= 0) {
                                i36 = i34 >> 13;
                                if ((iFloatToRawIntBits2 & 4096) != 0) {
                                    i38 = (((i35 << 10) | i36) + 1) | (i29 << 15);
                                } else {
                                    i37 = i36;
                                    i48 = i35;
                                }
                                short s18 = (short) i38;
                                if (f17 >= 0.0f) {
                                }
                                long j17 = (((long) i47) & 63) | ((((long) s8) & WebSocketProtocol.PAYLOAD_SHORT_MAX) << 48) | ((((long) s17) & WebSocketProtocol.PAYLOAD_SHORT_MAX) << 32) | ((WebSocketProtocol.PAYLOAD_SHORT_MAX & ((long) s18)) << 16) | ((((long) ((int) (((f18 <= 1.0f ? f18 : 1.0f) * 1023.0f) + 0.5f))) & 1023) << 6);
                                o13.z.a aVar8 = o13.z.f128618b;
                                d0.a aVar9 = d0.f128823b;
                                return j17;
                            }
                            if (i35 >= -10) {
                                i39 = (i34 | 8388608) >> (1 - i35);
                                if ((i39 & 4096) != 0) {
                                    i39 += 8192;
                                }
                                i37 = i39 >> 13;
                            } else {
                                i37 = 0;
                            }
                        }
                    }
                    i38 = i37 | (i29 << 15) | (i48 << 10);
                    short s19 = (short) i38;
                    if (f17 >= 0.0f) {
                    }
                    long j18 = (((long) i47) & 63) | ((((long) s8) & WebSocketProtocol.PAYLOAD_SHORT_MAX) << 48) | ((((long) s17) & WebSocketProtocol.PAYLOAD_SHORT_MAX) << 32) | ((WebSocketProtocol.PAYLOAD_SHORT_MAX & ((long) s19)) << 16) | ((((long) ((int) (((f18 <= 1.0f ? f18 : 1.0f) * 1023.0f) + 0.5f))) & 1023) << 6);
                    o13.z.a aVar10 = o13.z.f128618b;
                    d0.a aVar11 = d0.f128823b;
                    return j18;
                }
                if (i14 >= -10) {
                    int i57 = (i55 | 8388608) >> (1 - i14);
                    if ((i57 & 4096) != 0) {
                        i57 += 8192;
                    }
                    i15 = i57 >> 13;
                    i14 = 0;
                } else {
                    i15 = 0;
                    i14 = 0;
                }
            }
        }
        i16 = i15 | (i49 << 15) | (i14 << 10);
        short s24 = (short) i16;
        fC = cVar.c(1);
        fB = cVar.b(1);
        if (f15 >= fC) {
            fC = f15;
        }
        if (fC <= fB) {
            fB = fC;
        }
        iFloatToRawIntBits = Float.floatToRawIntBits(fB);
        i17 = iFloatToRawIntBits >>> 31;
        i18 = (iFloatToRawIntBits >>> 23) & 255;
        i19 = iFloatToRawIntBits & 8388607;
        if (i18 == 255) {
            if (i19 != 0) {
                i26 = 512;
            } else {
                i26 = 0;
            }
            i24 = 31;
        } else {
            i24 = i18 - 112;
            if (i24 >= 31) {
                i26 = 0;
                i24 = 49;
            } else {
                if (i24 <= 0) {
                    i25 = i19 >> 13;
                    if ((iFloatToRawIntBits & 4096) != 0) {
                        i27 = (((i24 << 10) | i25) + 1) | (i17 << 15);
                    } else {
                        i26 = i25;
                    }
                    short s110 = (short) i27;
                    fC2 = cVar.c(2);
                    fB2 = cVar.b(2);
                    if (f16 >= fC2) {
                        fC2 = f16;
                    }
                    if (fC2 <= fB2) {
                        fB2 = fC2;
                    }
                    iFloatToRawIntBits2 = Float.floatToRawIntBits(fB2);
                    i29 = iFloatToRawIntBits2 >>> 31;
                    i30 = (iFloatToRawIntBits2 >>> 23) & 255;
                    i34 = 8388607 & iFloatToRawIntBits2;
                    if (i30 == 255) {
                        i37 = i34 != 0 ? 512 : 0;
                        i48 = 31;
                    } else {
                        i35 = i30 - 112;
                        if (i35 >= 31) {
                            i37 = 0;
                            i48 = 49;
                        } else {
                            if (i35 <= 0) {
                                i36 = i34 >> 13;
                                if ((iFloatToRawIntBits2 & 4096) != 0) {
                                    i38 = (((i35 << 10) | i36) + 1) | (i29 << 15);
                                } else {
                                    i37 = i36;
                                    i48 = i35;
                                }
                                short s111 = (short) i38;
                                if (f17 >= 0.0f) {
                                }
                                long j19 = (((long) i47) & 63) | ((((long) s24) & WebSocketProtocol.PAYLOAD_SHORT_MAX) << 48) | ((((long) s110) & WebSocketProtocol.PAYLOAD_SHORT_MAX) << 32) | ((WebSocketProtocol.PAYLOAD_SHORT_MAX & ((long) s111)) << 16) | ((((long) ((int) (((f18 <= 1.0f ? f18 : 1.0f) * 1023.0f) + 0.5f))) & 1023) << 6);
                                o13.z.a aVar12 = o13.z.f128618b;
                                d0.a aVar13 = d0.f128823b;
                                return j19;
                            }
                            if (i35 >= -10) {
                                i39 = (i34 | 8388608) >> (1 - i35);
                                if ((i39 & 4096) != 0) {
                                    i39 += 8192;
                                }
                                i37 = i39 >> 13;
                            } else {
                                i37 = 0;
                            }
                        }
                    }
                    i38 = i37 | (i29 << 15) | (i48 << 10);
                    short s112 = (short) i38;
                    if (f17 >= 0.0f) {
                    }
                    long j110 = (((long) i47) & 63) | ((((long) s24) & WebSocketProtocol.PAYLOAD_SHORT_MAX) << 48) | ((((long) s110) & WebSocketProtocol.PAYLOAD_SHORT_MAX) << 32) | ((WebSocketProtocol.PAYLOAD_SHORT_MAX & ((long) s112)) << 16) | ((((long) ((int) (((f18 <= 1.0f ? f18 : 1.0f) * 1023.0f) + 0.5f))) & 1023) << 6);
                    o13.z.a aVar14 = o13.z.f128618b;
                    d0.a aVar15 = d0.f128823b;
                    return j110;
                }
                if (i24 >= -10) {
                    i28 = (i19 | 8388608) >> (1 - i24);
                    if ((i28 & 4096) != 0) {
                        i28 += 8192;
                    }
                    i26 = i28 >> 13;
                    i24 = 0;
                } else {
                    i26 = 0;
                    i24 = 0;
                }
            }
        }
        i27 = i26 | (i17 << 15) | (i24 << 10);
        short s113 = (short) i27;
        fC2 = cVar.c(2);
        fB2 = cVar.b(2);
        if (f16 >= fC2) {
            fC2 = f16;
        }
        if (fC2 <= fB2) {
            fB2 = fC2;
        }
        iFloatToRawIntBits2 = Float.floatToRawIntBits(fB2);
        i29 = iFloatToRawIntBits2 >>> 31;
        i30 = (iFloatToRawIntBits2 >>> 23) & 255;
        i34 = 8388607 & iFloatToRawIntBits2;
        if (i30 == 255) {
            i37 = i34 != 0 ? 512 : 0;
            i48 = 31;
        } else {
            i35 = i30 - 112;
            if (i35 >= 31) {
                i37 = 0;
                i48 = 49;
            } else {
                if (i35 <= 0) {
                    i36 = i34 >> 13;
                    if ((iFloatToRawIntBits2 & 4096) != 0) {
                        i38 = (((i35 << 10) | i36) + 1) | (i29 << 15);
                    } else {
                        i37 = i36;
                        i48 = i35;
                    }
                    short s114 = (short) i38;
                    if (f17 >= 0.0f) {
                    }
                    long j111 = (((long) i47) & 63) | ((((long) s24) & WebSocketProtocol.PAYLOAD_SHORT_MAX) << 48) | ((((long) s113) & WebSocketProtocol.PAYLOAD_SHORT_MAX) << 32) | ((WebSocketProtocol.PAYLOAD_SHORT_MAX & ((long) s114)) << 16) | ((((long) ((int) (((f18 <= 1.0f ? f18 : 1.0f) * 1023.0f) + 0.5f))) & 1023) << 6);
                    o13.z.a aVar16 = o13.z.f128618b;
                    d0.a aVar17 = d0.f128823b;
                    return j111;
                }
                if (i35 >= -10) {
                    i39 = (i34 | 8388608) >> (1 - i35);
                    if ((i39 & 4096) != 0) {
                        i39 += 8192;
                    }
                    i37 = i39 >> 13;
                } else {
                    i37 = 0;
                }
            }
        }
        i38 = i37 | (i29 << 15) | (i48 << 10);
        short s115 = (short) i38;
        if (f17 >= 0.0f) {
        }
        long j112 = (((long) i47) & 63) | ((((long) s24) & WebSocketProtocol.PAYLOAD_SHORT_MAX) << 48) | ((((long) s113) & WebSocketProtocol.PAYLOAD_SHORT_MAX) << 32) | ((WebSocketProtocol.PAYLOAD_SHORT_MAX & ((long) s115)) << 16) | ((((long) ((int) (((f18 <= 1.0f ? f18 : 1.0f) * 1023.0f) + 0.5f))) & 1023) << 6);
        o13.z.a aVar18 = o13.z.f128618b;
        d0.a aVar19 = d0.f128823b;
        return j112;
    }

    public static final long b(int i14) {
        long j8 = i14;
        o13.z.a aVar = o13.z.f128618b;
        long j14 = j8 << 32;
        d0.a aVar2 = d0.f128823b;
        return j14;
    }

    public static final long c(int i14, int i15, int i16) {
        return b(((i14 & 255) << 16) | (-16777216) | ((i15 & 255) << 8) | (i16 & 255));
    }

    public static final long d(long j8) {
        long j14 = j8 << 32;
        o13.z.a aVar = o13.z.f128618b;
        d0.a aVar2 = d0.f128823b;
        return j14;
    }

    public static long e(float f14, float f15, float f16, float f17) {
        p4.e.f135544a.getClass();
        return a(f14, f15, f16, f17, p4.e.f135549f);
    }

    /* JADX WARN: Code duplicated, block: B:30:0x0095 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:31:0x0097  */
    /* JADX WARN: Code duplicated, block: B:32:0x0099  */
    /* JADX WARN: Code duplicated, block: B:34:0x009c  */
    /* JADX WARN: Code duplicated, block: B:36:0x00a0  */
    /* JADX WARN: Code duplicated, block: B:37:0x00a3 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:38:0x00a5 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:39:0x00a7  */
    /* JADX WARN: Code duplicated, block: B:41:0x00b0  */
    /* JADX WARN: Code duplicated, block: B:43:0x00b6  */
    /* JADX WARN: Code duplicated, block: B:44:0x00b9  */
    /* JADX WARN: Code duplicated, block: B:46:0x00bf  */
    /* JADX WARN: Code duplicated, block: B:48:0x00ca  */
    /* JADX WARN: Code duplicated, block: B:52:0x00e1 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:54:0x00e4  */
    /* JADX WARN: Code duplicated, block: B:56:0x00e8  */
    /* JADX WARN: Code duplicated, block: B:59:0x00ed A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:60:0x00ef A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:61:0x00f1  */
    /* JADX WARN: Code duplicated, block: B:63:0x00fb  */
    /* JADX WARN: Code duplicated, block: B:65:0x0102  */
    /* JADX WARN: Code duplicated, block: B:66:0x0104  */
    /* JADX WARN: Code duplicated, block: B:68:0x010a  */
    /* JADX WARN: Code duplicated, block: B:70:0x0114  */
    public static final long f(float f14, float f15, float f16, float f17, p4.c cVar) {
        int i14;
        int i15;
        int i16;
        int iFloatToRawIntBits;
        int i17;
        int i18;
        int i19;
        int i24;
        int i25;
        int i26;
        int i27;
        int i28;
        int iFloatToRawIntBits2;
        int i29;
        int i30;
        int i34;
        int i35;
        int i36;
        int i37;
        if (cVar.getF135615q()) {
            o13.z.a aVar = o13.z.f128618b;
            long j8 = ((long) ((((((int) ((f17 * 255.0f) + 0.5f)) << 24) | (((int) ((f14 * 255.0f) + 0.5f)) << 16)) | (((int) ((f15 * 255.0f) + 0.5f)) << 8)) | ((int) ((255.0f * f16) + 0.5f)))) << 32;
            d0.a aVar2 = d0.f128823b;
            return j8;
        }
        int iFloatToRawIntBits3 = Float.floatToRawIntBits(f14);
        int i38 = iFloatToRawIntBits3 >>> 31;
        int i39 = (iFloatToRawIntBits3 >>> 23) & 255;
        int i44 = iFloatToRawIntBits3 & 8388607;
        int i45 = 49;
        int i46 = 0;
        if (i39 == 255) {
            i15 = i44 != 0 ? 512 : 0;
            i14 = 31;
        } else {
            i14 = i39 - 112;
            if (i14 >= 31) {
                i14 = 49;
                i15 = 0;
            } else {
                if (i14 > 0) {
                    int i47 = i44 >> 13;
                    if ((iFloatToRawIntBits3 & 4096) != 0) {
                        i16 = (((i14 << 10) | i47) + 1) | (i38 << 15);
                    } else {
                        i15 = i47;
                    }
                    short s8 = (short) i16;
                    iFloatToRawIntBits = Float.floatToRawIntBits(f15);
                    i17 = iFloatToRawIntBits >>> 31;
                    i18 = (iFloatToRawIntBits >>> 23) & 255;
                    i19 = iFloatToRawIntBits & 8388607;
                    if (i18 == 255) {
                        if (i19 != 0) {
                            i26 = 512;
                        } else {
                            i26 = 0;
                        }
                        i24 = 31;
                    } else {
                        i24 = i18 - 112;
                        if (i24 >= 31) {
                            i24 = 49;
                            i26 = 0;
                        } else {
                            if (i24 <= 0) {
                                i25 = i19 >> 13;
                                if ((iFloatToRawIntBits & 4096) != 0) {
                                    i27 = (((i24 << 10) | i25) + 1) | (i17 << 15);
                                } else {
                                    i26 = i25;
                                }
                                short s14 = (short) i27;
                                iFloatToRawIntBits2 = Float.floatToRawIntBits(f16);
                                i29 = iFloatToRawIntBits2 >>> 31;
                                i30 = (iFloatToRawIntBits2 >>> 23) & 255;
                                i34 = 8388607 & iFloatToRawIntBits2;
                                if (i30 == 255) {
                                    i35 = i30 - 112;
                                    if (i35 < 31) {
                                        if (i35 <= 0) {
                                            i46 = i34 >> 13;
                                            if ((iFloatToRawIntBits2 & 4096) != 0) {
                                                i36 = (((i35 << 10) | i46) + 1) | (i29 << 15);
                                            } else {
                                                i45 = i35;
                                            }
                                        } else if (i35 >= -10) {
                                            i37 = (i34 | 8388608) >> (1 - i35);
                                            if ((i37 & 4096) != 0) {
                                                i37 += 8192;
                                            }
                                            i45 = 0;
                                            i46 = i37 >> 13;
                                        } else {
                                            i45 = 0;
                                        }
                                    }
                                    long jMax = ((((long) ((short) i36)) & WebSocketProtocol.PAYLOAD_SHORT_MAX) << 16) | ((((long) s8) & WebSocketProtocol.PAYLOAD_SHORT_MAX) << 48) | ((((long) s14) & WebSocketProtocol.PAYLOAD_SHORT_MAX) << 32) | ((((long) ((int) ((Math.max(0.0f, Math.min(f17, 1.0f)) * 1023.0f) + 0.5f))) & 1023) << 6) | (((long) cVar.f135543c) & 63);
                                    o13.z.a aVar3 = o13.z.f128618b;
                                    d0.a aVar4 = d0.f128823b;
                                    return jMax;
                                }
                                i46 = i34 == 0 ? 0 : 512;
                                i45 = 31;
                                i36 = (i29 << 15) | (i45 << 10) | i46;
                                long jMax2 = ((((long) ((short) i36)) & WebSocketProtocol.PAYLOAD_SHORT_MAX) << 16) | ((((long) s8) & WebSocketProtocol.PAYLOAD_SHORT_MAX) << 48) | ((((long) s14) & WebSocketProtocol.PAYLOAD_SHORT_MAX) << 32) | ((((long) ((int) ((Math.max(0.0f, Math.min(f17, 1.0f)) * 1023.0f) + 0.5f))) & 1023) << 6) | (((long) cVar.f135543c) & 63);
                                o13.z.a aVar5 = o13.z.f128618b;
                                d0.a aVar6 = d0.f128823b;
                                return jMax2;
                            }
                            if (i24 >= -10) {
                                i28 = (i19 | 8388608) >> (1 - i24);
                                if ((i28 & 4096) != 0) {
                                    i28 += 8192;
                                }
                                i26 = i28 >> 13;
                                i24 = 0;
                            } else {
                                i26 = 0;
                                i24 = 0;
                            }
                        }
                    }
                    i27 = i26 | (i17 << 15) | (i24 << 10);
                    short s15 = (short) i27;
                    iFloatToRawIntBits2 = Float.floatToRawIntBits(f16);
                    i29 = iFloatToRawIntBits2 >>> 31;
                    i30 = (iFloatToRawIntBits2 >>> 23) & 255;
                    i34 = 8388607 & iFloatToRawIntBits2;
                    if (i30 == 255) {
                        i35 = i30 - 112;
                        if (i35 < 31) {
                            if (i35 <= 0) {
                                i46 = i34 >> 13;
                                if ((iFloatToRawIntBits2 & 4096) != 0) {
                                    i36 = (((i35 << 10) | i46) + 1) | (i29 << 15);
                                } else {
                                    i45 = i35;
                                }
                            } else if (i35 >= -10) {
                                i37 = (i34 | 8388608) >> (1 - i35);
                                if ((i37 & 4096) != 0) {
                                    i37 += 8192;
                                }
                                i45 = 0;
                                i46 = i37 >> 13;
                            } else {
                                i45 = 0;
                            }
                        }
                        long jMax3 = ((((long) ((short) i36)) & WebSocketProtocol.PAYLOAD_SHORT_MAX) << 16) | ((((long) s8) & WebSocketProtocol.PAYLOAD_SHORT_MAX) << 48) | ((((long) s15) & WebSocketProtocol.PAYLOAD_SHORT_MAX) << 32) | ((((long) ((int) ((Math.max(0.0f, Math.min(f17, 1.0f)) * 1023.0f) + 0.5f))) & 1023) << 6) | (((long) cVar.f135543c) & 63);
                        o13.z.a aVar7 = o13.z.f128618b;
                        d0.a aVar8 = d0.f128823b;
                        return jMax3;
                    }
                    i46 = i34 == 0 ? 0 : 512;
                    i45 = 31;
                    i36 = (i29 << 15) | (i45 << 10) | i46;
                    long jMax4 = ((((long) ((short) i36)) & WebSocketProtocol.PAYLOAD_SHORT_MAX) << 16) | ((((long) s8) & WebSocketProtocol.PAYLOAD_SHORT_MAX) << 48) | ((((long) s15) & WebSocketProtocol.PAYLOAD_SHORT_MAX) << 32) | ((((long) ((int) ((Math.max(0.0f, Math.min(f17, 1.0f)) * 1023.0f) + 0.5f))) & 1023) << 6) | (((long) cVar.f135543c) & 63);
                    o13.z.a aVar9 = o13.z.f128618b;
                    d0.a aVar10 = d0.f128823b;
                    return jMax4;
                }
                if (i14 >= -10) {
                    int i48 = (i44 | 8388608) >> (1 - i14);
                    if ((i48 & 4096) != 0) {
                        i48 += 8192;
                    }
                    i15 = i48 >> 13;
                    i14 = 0;
                } else {
                    i15 = 0;
                    i14 = 0;
                }
            }
        }
        i16 = i15 | (i38 << 15) | (i14 << 10);
        short s16 = (short) i16;
        iFloatToRawIntBits = Float.floatToRawIntBits(f15);
        i17 = iFloatToRawIntBits >>> 31;
        i18 = (iFloatToRawIntBits >>> 23) & 255;
        i19 = iFloatToRawIntBits & 8388607;
        if (i18 == 255) {
            if (i19 != 0) {
                i26 = 512;
            } else {
                i26 = 0;
            }
            i24 = 31;
        } else {
            i24 = i18 - 112;
            if (i24 >= 31) {
                i24 = 49;
                i26 = 0;
            } else {
                if (i24 <= 0) {
                    i25 = i19 >> 13;
                    if ((iFloatToRawIntBits & 4096) != 0) {
                        i27 = (((i24 << 10) | i25) + 1) | (i17 << 15);
                    } else {
                        i26 = i25;
                    }
                    short s17 = (short) i27;
                    iFloatToRawIntBits2 = Float.floatToRawIntBits(f16);
                    i29 = iFloatToRawIntBits2 >>> 31;
                    i30 = (iFloatToRawIntBits2 >>> 23) & 255;
                    i34 = 8388607 & iFloatToRawIntBits2;
                    if (i30 == 255) {
                        i35 = i30 - 112;
                        if (i35 < 31) {
                            if (i35 <= 0) {
                                i46 = i34 >> 13;
                                if ((iFloatToRawIntBits2 & 4096) != 0) {
                                    i36 = (((i35 << 10) | i46) + 1) | (i29 << 15);
                                } else {
                                    i45 = i35;
                                }
                            } else if (i35 >= -10) {
                                i37 = (i34 | 8388608) >> (1 - i35);
                                if ((i37 & 4096) != 0) {
                                    i37 += 8192;
                                }
                                i45 = 0;
                                i46 = i37 >> 13;
                            } else {
                                i45 = 0;
                            }
                        }
                        long jMax5 = ((((long) ((short) i36)) & WebSocketProtocol.PAYLOAD_SHORT_MAX) << 16) | ((((long) s16) & WebSocketProtocol.PAYLOAD_SHORT_MAX) << 48) | ((((long) s17) & WebSocketProtocol.PAYLOAD_SHORT_MAX) << 32) | ((((long) ((int) ((Math.max(0.0f, Math.min(f17, 1.0f)) * 1023.0f) + 0.5f))) & 1023) << 6) | (((long) cVar.f135543c) & 63);
                        o13.z.a aVar11 = o13.z.f128618b;
                        d0.a aVar12 = d0.f128823b;
                        return jMax5;
                    }
                    i46 = i34 == 0 ? 0 : 512;
                    i45 = 31;
                    i36 = (i29 << 15) | (i45 << 10) | i46;
                    long jMax6 = ((((long) ((short) i36)) & WebSocketProtocol.PAYLOAD_SHORT_MAX) << 16) | ((((long) s16) & WebSocketProtocol.PAYLOAD_SHORT_MAX) << 48) | ((((long) s17) & WebSocketProtocol.PAYLOAD_SHORT_MAX) << 32) | ((((long) ((int) ((Math.max(0.0f, Math.min(f17, 1.0f)) * 1023.0f) + 0.5f))) & 1023) << 6) | (((long) cVar.f135543c) & 63);
                    o13.z.a aVar13 = o13.z.f128618b;
                    d0.a aVar14 = d0.f128823b;
                    return jMax6;
                }
                if (i24 >= -10) {
                    i28 = (i19 | 8388608) >> (1 - i24);
                    if ((i28 & 4096) != 0) {
                        i28 += 8192;
                    }
                    i26 = i28 >> 13;
                    i24 = 0;
                } else {
                    i26 = 0;
                    i24 = 0;
                }
            }
        }
        i27 = i26 | (i17 << 15) | (i24 << 10);
        short s18 = (short) i27;
        iFloatToRawIntBits2 = Float.floatToRawIntBits(f16);
        i29 = iFloatToRawIntBits2 >>> 31;
        i30 = (iFloatToRawIntBits2 >>> 23) & 255;
        i34 = 8388607 & iFloatToRawIntBits2;
        if (i30 == 255) {
            i35 = i30 - 112;
            if (i35 < 31) {
                if (i35 <= 0) {
                    i46 = i34 >> 13;
                    if ((iFloatToRawIntBits2 & 4096) != 0) {
                        i36 = (((i35 << 10) | i46) + 1) | (i29 << 15);
                    } else {
                        i45 = i35;
                    }
                } else if (i35 >= -10) {
                    i37 = (i34 | 8388608) >> (1 - i35);
                    if ((i37 & 4096) != 0) {
                        i37 += 8192;
                    }
                    i45 = 0;
                    i46 = i37 >> 13;
                } else {
                    i45 = 0;
                }
            }
            long jMax7 = ((((long) ((short) i36)) & WebSocketProtocol.PAYLOAD_SHORT_MAX) << 16) | ((((long) s16) & WebSocketProtocol.PAYLOAD_SHORT_MAX) << 48) | ((((long) s18) & WebSocketProtocol.PAYLOAD_SHORT_MAX) << 32) | ((((long) ((int) ((Math.max(0.0f, Math.min(f17, 1.0f)) * 1023.0f) + 0.5f))) & 1023) << 6) | (((long) cVar.f135543c) & 63);
            o13.z.a aVar15 = o13.z.f128618b;
            d0.a aVar16 = d0.f128823b;
            return jMax7;
        }
        i46 = i34 == 0 ? 0 : 512;
        i45 = 31;
        i36 = (i29 << 15) | (i45 << 10) | i46;
        long jMax8 = ((((long) ((short) i36)) & WebSocketProtocol.PAYLOAD_SHORT_MAX) << 16) | ((((long) s16) & WebSocketProtocol.PAYLOAD_SHORT_MAX) << 48) | ((((long) s18) & WebSocketProtocol.PAYLOAD_SHORT_MAX) << 32) | ((((long) ((int) ((Math.max(0.0f, Math.min(f17, 1.0f)) * 1023.0f) + 0.5f))) & 1023) << 6) | (((long) cVar.f135543c) & 63);
        o13.z.a aVar17 = o13.z.f128618b;
        d0.a aVar18 = d0.f128823b;
        return jMax8;
    }

    public static final long g(long j8, long j14) {
        float f14;
        float f15;
        long jB = d0.b(j8, d0.g(j14));
        float fE = d0.e(j14);
        float fE2 = d0.e(jB);
        float f16 = 1.0f - fE2;
        float f17 = (fE * f16) + fE2;
        float fI = d0.i(jB);
        float fI2 = d0.i(j14);
        float f18 = 0.0f;
        if (f17 == 0.0f) {
            f14 = 0.0f;
        } else {
            f14 = (((fI2 * fE) * f16) + (fI * fE2)) / f17;
        }
        float fH = d0.h(jB);
        float fH2 = d0.h(j14);
        if (f17 == 0.0f) {
            f15 = 0.0f;
        } else {
            f15 = (((fH2 * fE) * f16) + (fH * fE2)) / f17;
        }
        float f19 = d0.f(jB);
        float f22 = d0.f(j14);
        if (f17 != 0.0f) {
            f18 = (((f22 * fE) * f16) + (f19 * fE2)) / f17;
        }
        return f(f14, f15, f18, f17, d0.g(j14));
    }

    public static final long h(long j8, long j14, float f14) {
        p4.e.f135544a.getClass();
        p4.l lVar = p4.e.f135568y;
        long jB = d0.b(j8, lVar);
        long jB2 = d0.b(j14, lVar);
        float fE = d0.e(jB);
        float fI = d0.i(jB);
        float fH = d0.h(jB);
        float f15 = d0.f(jB);
        float fE2 = d0.e(jB2);
        float fI2 = d0.i(jB2);
        float fH2 = d0.h(jB2);
        float f16 = d0.f(jB2);
        if (f14 < 0.0f) {
            f14 = 0.0f;
        }
        if (f14 > 1.0f) {
            f14 = 1.0f;
        }
        return d0.b(f(gl.b.J(fI, fI2, f14), gl.b.J(fH, fH2, f14), gl.b.J(f15, f16, f14), gl.b.J(fE, fE2, f14), lVar), d0.g(j14));
    }

    public static final float i(long j8) {
        p4.c cVarG = d0.g(j8);
        long j14 = cVarG.f135542b;
        p4.b.f135535b.getClass();
        if (!p4.b.a(j14, p4.b.f135536c)) {
            y0.a("The specified color must be encoded in an RGB color space. The supplied color space is " + ((Object) p4.b.b(cVarG.f135542b)));
        }
        p4.n nVar = ((p4.q) cVarG).f135614p;
        double dA = nVar.a(d0.i(j8));
        float fA = (float) ((nVar.a(d0.f(j8)) * 0.0722d) + (nVar.a(d0.h(j8)) * 0.7152d) + (dA * 0.2126d));
        if (fA < 0.0f) {
            fA = 0.0f;
        }
        if (fA > 1.0f) {
            return 1.0f;
        }
        return fA;
    }

    public static final int j(long j8) {
        p4.e.f135544a.getClass();
        long jB = d0.b(j8, p4.e.f135549f) >>> 32;
        o13.z.a aVar = o13.z.f128618b;
        return (int) jB;
    }
}
