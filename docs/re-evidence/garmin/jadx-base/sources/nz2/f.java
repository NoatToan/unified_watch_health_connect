package nz2;

import com.google.common.primitives.UnsignedBytes;
import java.io.FilterOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import okhttp3.internal.ws.WebSocketProtocol;

/* JADX INFO: loaded from: classes2.dex */
public class f extends FilterOutputStream {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e f128418a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final byte[] f128419b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f128420c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f128421d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final byte[] f128422e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f128423f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f128424g;

    public f(OutputStream outputStream, e eVar, int i14, boolean z14) {
        super(outputStream);
        this.f128420c = false;
        this.f128421d = false;
        this.f128422e = new byte[1];
        this.f128423f = false;
        this.f128424g = true;
        if (outputStream == null || eVar == null) {
            throw null;
        }
        if (i14 <= 0) {
            vb.h.s("buffer size must be greater than 0");
            throw null;
        }
        this.f128418a = eVar;
        this.f128419b = new byte[i14];
        this.f128424g = z14;
    }

    /* JADX WARN: Code duplicated, block: B:122:0x01d7  */
    /* JADX WARN: Code duplicated, block: B:124:0x01dc  */
    /* JADX WARN: Code duplicated, block: B:125:0x0207  */
    /* JADX WARN: Code duplicated, block: B:158:0x02c8  */
    /* JADX WARN: Code duplicated, block: B:160:0x02d0  */
    /* JADX WARN: Code duplicated, block: B:162:0x02e1  */
    /* JADX WARN: Code duplicated, block: B:168:0x02f9  */
    /* JADX WARN: Code duplicated, block: B:185:0x0333 A[PHI: r16
      0x0333: PHI (r16v5 int) = (r16v1 int), (r16v0 int) binds: [B:230:0x0451, B:184:0x0331] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:187:0x0337 A[PHI: r16
      0x0337: PHI (r16v4 int) = (r16v1 int), (r16v0 int) binds: [B:232:0x0455, B:186:0x0335] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:188:0x0339 A[PHI: r16
      0x0339: PHI (r16v3 int) = (r16v1 int), (r16v0 int) binds: [B:232:0x0455, B:186:0x0335] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:189:0x033b  */
    /* JADX WARN: Code duplicated, block: B:191:0x0340  */
    /* JADX WARN: Code duplicated, block: B:199:0x0383  */
    /* JADX WARN: Code duplicated, block: B:207:0x03dc  */
    /* JADX WARN: Code duplicated, block: B:208:0x03fd  */
    /* JADX WARN: Code duplicated, block: B:234:0x0459  */
    /* JADX WARN: Code duplicated, block: B:237:0x0469  */
    /* JADX WARN: Code duplicated, block: B:240:0x0476  */
    /* JADX WARN: Code duplicated, block: B:242:0x0482  */
    /* JADX WARN: Code duplicated, block: B:277:0x0511  */
    /* JADX WARN: Code duplicated, block: B:280:0x0519  */
    /* JADX WARN: Code duplicated, block: B:282:0x051e  */
    /* JADX WARN: Code duplicated, block: B:283:0x0575  */
    /* JADX WARN: Code duplicated, block: B:286:0x058c  */
    /* JADX WARN: Code duplicated, block: B:313:0x01a4 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:319:0x041a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:322:0x0320 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:324:0x0311 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:325:0x0311 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:328:0x0320 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:329:0x0320 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:332:0x059e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:333:0x059e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:92:0x0179  */
    public final int a(int i14) throws IOException {
        boolean z14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i24;
        boolean zA;
        int i25;
        int i26;
        int i27;
        int i28;
        int i29;
        int i30;
        int i34;
        int iJ;
        int i35;
        c cVar;
        int i36;
        byte[] bArr = this.f128419b;
        int length = bArr.length;
        e eVar = this.f128418a;
        eVar.f128460e = bArr;
        eVar.f128461f = 0;
        eVar.f128462g = length;
        d dVar = eVar.f128464i;
        int i37 = 1;
        int i38 = -2;
        if (dVar == null) {
            z14 = true;
        } else {
            String[] strArr = d.f128386b1;
            k kVar = dVar.f128387a;
            if (i14 > 4 || i14 < 0) {
                z14 = true;
            } else {
                if (kVar.f128460e == null || ((kVar.f128456a == null && kVar.f128458c != 0) || ((i15 = dVar.f128388b) == 666 && i14 != 4))) {
                    kVar.f128463h = strArr[4];
                } else {
                    if (kVar.f128462g == 0) {
                        kVar.f128463h = strArr[7];
                    } else {
                        int i39 = dVar.f128395i;
                        dVar.f128395i = i14;
                        int i44 = 7;
                        long j8 = 0;
                        if (i15 != 42) {
                            j8 = 0;
                        } else if (dVar.f128393g == 2) {
                            g gVarH = dVar.h();
                            int i45 = gVarH.f128425a != null ? 4 : 0;
                            if (gVarH.f128426b != null) {
                                i45 |= 8;
                            }
                            if (gVarH.f128427c != null) {
                                i45 |= 16;
                            }
                            int i46 = dVar.I;
                            int i47 = i46 == 1 ? 4 : i46 == 9 ? 2 : 0;
                            dVar.o(-29921);
                            dVar.m((byte) 8);
                            dVar.m((byte) i45);
                            byte b14 = (byte) 0;
                            dVar.m(b14);
                            dVar.m(b14);
                            dVar.m(b14);
                            dVar.m(b14);
                            dVar.m((byte) i47);
                            dVar.m((byte) 255);
                            byte[] bArr2 = gVarH.f128425a;
                            if (bArr2 != null) {
                                dVar.m((byte) bArr2.length);
                                dVar.m((byte) (gVarH.f128425a.length >> 8));
                                byte[] bArr3 = gVarH.f128425a;
                                dVar.n(0, bArr3.length, bArr3);
                            }
                            byte[] bArr4 = gVarH.f128426b;
                            if (bArr4 != null) {
                                dVar.n(0, bArr4.length, bArr4);
                                dVar.m((byte) 0);
                            }
                            byte[] bArr5 = gVarH.f128427c;
                            if (bArr5 != null) {
                                dVar.n(0, bArr5.length, bArr5);
                                dVar.m((byte) 0);
                            }
                            dVar.f128388b = 113;
                            kVar.f128465j.reset();
                            j8 = 0;
                        } else {
                            int i48 = (((dVar.f128397k - 8) << 4) + 8) << 8;
                            int i49 = ((dVar.I - 1) & 255) >> 1;
                            if (i49 > 3) {
                                i49 = 3;
                            }
                            int i54 = i48 | (i49 << 6);
                            if (dVar.A != 0) {
                                i54 |= 32;
                            }
                            dVar.f128388b = 113;
                            dVar.l((31 - (i54 % 31)) + i54);
                            if (dVar.A != 0) {
                                long value = kVar.f128465j.getValue();
                                dVar.l((int) (value >>> 16));
                                dVar.l((int) (value & WebSocketProtocol.PAYLOAD_SHORT_MAX));
                            }
                            kVar.f128465j.reset();
                        }
                        if (dVar.f128392f != 0) {
                            kVar.a();
                            if (kVar.f128462g == 0) {
                                dVar.f128395i = -1;
                                i38 = 0;
                                z14 = true;
                            }
                        } else if (kVar.f128458c == 0 && i14 <= i39 && i14 != 4) {
                            kVar.f128463h = strArr[7];
                        }
                        int i55 = dVar.f128388b;
                        if (i55 == 666 && kVar.f128458c != 0) {
                            kVar.f128463h = strArr[7];
                        } else if (kVar.f128458c == 0 && dVar.C == 0 && (i14 == 0 || i55 == 666)) {
                            if (i14 == 4) {
                                i35 = dVar.f128393g;
                                if (i35 > 0) {
                                    cVar = kVar.f128465j;
                                    if (i35 == 2) {
                                        long value2 = cVar.getValue();
                                        dVar.m((byte) (value2 & 255));
                                        dVar.m((byte) ((value2 >> 8) & 255));
                                        dVar.m((byte) ((value2 >> 16) & 255));
                                        dVar.m((byte) ((value2 >> 24) & 255));
                                        dVar.m((byte) (kVar.f128459d & 255));
                                        dVar.m((byte) ((kVar.f128459d >> 8) & 255));
                                        dVar.m((byte) ((kVar.f128459d >> 16) & 255));
                                        dVar.m((byte) ((kVar.f128459d >> 24) & 255));
                                        dVar.h().getClass();
                                    } else {
                                        long value3 = cVar.getValue();
                                        dVar.l((int) (value3 >>> 16));
                                        dVar.l((int) (value3 & WebSocketProtocol.PAYLOAD_SHORT_MAX));
                                    }
                                    kVar.a();
                                    i36 = dVar.f128393g;
                                    if (i36 > 0) {
                                        dVar.f128393g = -i36;
                                    }
                                    if (dVar.f128392f != 0) {
                                    }
                                }
                                z14 = true;
                                i38 = 1;
                            }
                            i38 = 0;
                        } else {
                            int i56 = d.f128385a1[dVar.I].f128416e;
                            int i57 = 5;
                            int i58 = 262;
                            short s8 = 65535;
                            if (i56 == 0) {
                                int i59 = dVar.f128390d - 5;
                                int i64 = 65535 > i59 ? i59 : 65535;
                                while (true) {
                                    if (dVar.C <= 1) {
                                        dVar.f();
                                        int i65 = dVar.C;
                                        if (i65 != 0 || i14 != 0) {
                                            if (i65 == 0) {
                                                dVar.g(i14 == 4);
                                                if (kVar.f128462g == 0) {
                                                    if (i14 == 4) {
                                                        i18 = 2;
                                                    }
                                                    i19 = 2;
                                                } else {
                                                    if (i14 == 4) {
                                                        i18 = 3;
                                                    } else {
                                                        i18 = 1;
                                                    }
                                                    i19 = 2;
                                                }
                                            } else {
                                                i16 = dVar.A + dVar.C;
                                                dVar.A = i16;
                                                dVar.C = 0;
                                                i17 = dVar.f128408w + i64;
                                                if (i16 != 0 || i16 >= i17) {
                                                    dVar.C = i16 - i17;
                                                    dVar.A = i17;
                                                    dVar.g(false);
                                                    if (kVar.f128462g != 0) {
                                                        if (dVar.A - dVar.f128408w >= dVar.f128396j - 262) {
                                                            dVar.g(false);
                                                            if (kVar.f128462g == 0) {
                                                            }
                                                        }
                                                        i44 = i44;
                                                    }
                                                } else {
                                                    if (dVar.A - dVar.f128408w >= dVar.f128396j - 262) {
                                                        dVar.g(false);
                                                        if (kVar.f128462g == 0) {
                                                        }
                                                    }
                                                    i44 = i44;
                                                }
                                            }
                                        }
                                    } else {
                                        i16 = dVar.A + dVar.C;
                                        dVar.A = i16;
                                        dVar.C = 0;
                                        i17 = dVar.f128408w + i64;
                                        if (i16 != 0) {
                                            dVar.C = i16 - i17;
                                            dVar.A = i17;
                                            dVar.g(false);
                                            if (kVar.f128462g != 0) {
                                                if (dVar.A - dVar.f128408w >= dVar.f128396j - 262) {
                                                    dVar.g(false);
                                                    if (kVar.f128462g == 0) {
                                                    }
                                                }
                                                i44 = i44;
                                            }
                                        } else {
                                            dVar.C = i16 - i17;
                                            dVar.A = i17;
                                            dVar.g(false);
                                            if (kVar.f128462g != 0) {
                                                if (dVar.A - dVar.f128408w >= dVar.f128396j - 262) {
                                                    dVar.g(false);
                                                    if (kVar.f128462g == 0) {
                                                    }
                                                }
                                                i44 = i44;
                                            }
                                        }
                                    }
                                    i18 = 0;
                                    i19 = 2;
                                }
                            } else if (i56 != 1) {
                                i19 = 2;
                                if (i56 != 2) {
                                    i18 = -1;
                                } else {
                                    int i66 = 0;
                                    while (true) {
                                        if (dVar.C < i58) {
                                            dVar.f();
                                            int i67 = dVar.C;
                                            if (i67 >= i58 || i14 != 0) {
                                                if (i67 == 0) {
                                                    if (dVar.f128411z != 0) {
                                                        dVar.a(0, dVar.f128400m[dVar.A - i37] & UnsignedBytes.MAX_VALUE);
                                                        dVar.f128411z = 0;
                                                    }
                                                    dVar.g(i14 == 4 ? i37 : false);
                                                    if (kVar.f128462g == 0) {
                                                        if (i14 == 4) {
                                                            i37 = 2;
                                                        }
                                                    } else if (i14 == 4) {
                                                        i37 = 3;
                                                    }
                                                } else {
                                                    if (dVar.C >= 3) {
                                                        int i68 = dVar.f128404q << dVar.f128407v;
                                                        byte[] bArr6 = dVar.f128400m;
                                                        int i69 = dVar.A;
                                                        int i74 = (i68 ^ (bArr6[i69 + 2] & UnsignedBytes.MAX_VALUE)) & dVar.f128406t;
                                                        dVar.f128404q = i74;
                                                        short[] sArr = dVar.f128403p;
                                                        short s14 = sArr[i74];
                                                        dVar.f128402o[dVar.f128399l & i69] = s14;
                                                        sArr[i74] = (short) i69;
                                                        i66 = s14 & s8;
                                                    }
                                                    int i75 = dVar.f128409x;
                                                    dVar.D = i75;
                                                    dVar.f128410y = dVar.B;
                                                    dVar.f128409x = 2;
                                                    if (i66 != 0 && i75 < dVar.F && ((dVar.A - i66) & s8) <= dVar.f128396j - i58) {
                                                        iJ = dVar.j(i66);
                                                        dVar.f128409x = iJ;
                                                        if (iJ <= i57 && iJ == 3 && dVar.A - dVar.B > 4096) {
                                                            dVar.f128409x = 2;
                                                        }
                                                    }
                                                    i29 = dVar.D;
                                                    if (i29 >= 3 || dVar.f128409x > i29) {
                                                        i30 = i37;
                                                        int i76 = i57;
                                                        if (dVar.f128411z != 0) {
                                                            if (dVar.a(0, dVar.f128400m[dVar.A - 1] & UnsignedBytes.MAX_VALUE)) {
                                                                dVar.g(false);
                                                            }
                                                            dVar.A++;
                                                            dVar.C--;
                                                            if (kVar.f128462g == 0) {
                                                                i37 = 0;
                                                            }
                                                        } else {
                                                            dVar.f128411z = i30;
                                                            dVar.A += i30;
                                                            dVar.C -= i30;
                                                        }
                                                        i57 = i76;
                                                        i37 = 1;
                                                        i58 = 262;
                                                    } else {
                                                        int i77 = dVar.A;
                                                        int i78 = (dVar.C + i77) - 3;
                                                        boolean zA2 = dVar.a((i77 - i37) - dVar.f128410y, i29 - 3);
                                                        int i79 = dVar.C;
                                                        int i84 = dVar.D;
                                                        dVar.C = i79 - (i84 - 1);
                                                        dVar.D = i84 - 2;
                                                        while (true) {
                                                            i34 = dVar.A;
                                                            int i85 = i34 + 1;
                                                            dVar.A = i85;
                                                            if (i85 <= i78) {
                                                                int i86 = ((dVar.f128404q << dVar.f128407v) ^ (dVar.f128400m[i34 + 3] & UnsignedBytes.MAX_VALUE)) & dVar.f128406t;
                                                                dVar.f128404q = i86;
                                                                short[] sArr2 = dVar.f128403p;
                                                                short s15 = sArr2[i86];
                                                                dVar.f128402o[dVar.f128399l & i85] = s15;
                                                                sArr2[i86] = (short) i85;
                                                                i66 = s15 & s8;
                                                            }
                                                            int i87 = dVar.D - 1;
                                                            dVar.D = i87;
                                                            if (i87 == 0) {
                                                                break;
                                                            }
                                                            i57 = i57;
                                                            i37 = i37;
                                                        }
                                                        dVar.f128411z = 0;
                                                        dVar.f128409x = 2;
                                                        dVar.A = i34 + 2;
                                                        if (zA2) {
                                                            dVar.g(false);
                                                            if (kVar.f128462g == 0) {
                                                                i37 = 0;
                                                            }
                                                        }
                                                        i57 = i57;
                                                        i37 = i37;
                                                        i58 = 262;
                                                    }
                                                }
                                            }
                                            i37 = 0;
                                        } else {
                                            if (dVar.C >= 3) {
                                                int i610 = dVar.f128404q << dVar.f128407v;
                                                byte[] bArr7 = dVar.f128400m;
                                                int i611 = dVar.A;
                                                int i710 = (i610 ^ (bArr7[i611 + 2] & UnsignedBytes.MAX_VALUE)) & dVar.f128406t;
                                                dVar.f128404q = i710;
                                                short[] sArr3 = dVar.f128403p;
                                                short s16 = sArr3[i710];
                                                dVar.f128402o[dVar.f128399l & i611] = s16;
                                                sArr3[i710] = (short) i611;
                                                i66 = s16 & s8;
                                            }
                                            int i711 = dVar.f128409x;
                                            dVar.D = i711;
                                            dVar.f128410y = dVar.B;
                                            dVar.f128409x = 2;
                                            if (i66 != 0) {
                                                iJ = dVar.j(i66);
                                                dVar.f128409x = iJ;
                                                if (iJ <= i57) {
                                                    dVar.f128409x = 2;
                                                }
                                            }
                                            i29 = dVar.D;
                                            if (i29 >= 3) {
                                                i30 = i37;
                                                int i712 = i57;
                                                if (dVar.f128411z != 0) {
                                                    if (dVar.a(0, dVar.f128400m[dVar.A - 1] & UnsignedBytes.MAX_VALUE)) {
                                                        dVar.g(false);
                                                    }
                                                    dVar.A++;
                                                    dVar.C--;
                                                    if (kVar.f128462g == 0) {
                                                        i37 = 0;
                                                    }
                                                } else {
                                                    dVar.f128411z = i30;
                                                    dVar.A += i30;
                                                    dVar.C -= i30;
                                                }
                                                i57 = i712;
                                                i37 = 1;
                                                i58 = 262;
                                            } else {
                                                i30 = i37;
                                                int i713 = i57;
                                                if (dVar.f128411z != 0) {
                                                    if (dVar.a(0, dVar.f128400m[dVar.A - 1] & UnsignedBytes.MAX_VALUE)) {
                                                        dVar.g(false);
                                                    }
                                                    dVar.A++;
                                                    dVar.C--;
                                                    if (kVar.f128462g == 0) {
                                                        i37 = 0;
                                                    }
                                                } else {
                                                    dVar.f128411z = i30;
                                                    dVar.A += i30;
                                                    dVar.C -= i30;
                                                }
                                                i57 = i713;
                                                i37 = 1;
                                                i58 = 262;
                                            }
                                        }
                                        i18 = i37;
                                        i19 = 2;
                                    }
                                }
                            } else {
                                int i88 = 0;
                                while (true) {
                                    if (dVar.C < 262) {
                                        dVar.f();
                                        int i89 = dVar.C;
                                        if (i89 >= 262 || i14 != 0) {
                                            if (i89 == 0) {
                                                dVar.g(i14 == 4);
                                                if (kVar.f128462g == 0) {
                                                    if (i14 == 4) {
                                                        i18 = 2;
                                                    }
                                                    i19 = 2;
                                                } else {
                                                    if (i14 == 4) {
                                                        i18 = 3;
                                                    } else {
                                                        i18 = 1;
                                                    }
                                                    i19 = 2;
                                                }
                                            } else {
                                                if (dVar.C >= 3) {
                                                    int i93 = dVar.f128404q << dVar.f128407v;
                                                    byte[] bArr8 = dVar.f128400m;
                                                    int i94 = dVar.A;
                                                    int i95 = (i93 ^ (bArr8[i94 + 2] & UnsignedBytes.MAX_VALUE)) & dVar.f128406t;
                                                    dVar.f128404q = i95;
                                                    short[] sArr4 = dVar.f128403p;
                                                    short s17 = sArr4[i95];
                                                    dVar.f128402o[dVar.f128399l & i94] = s17;
                                                    sArr4[i95] = (short) i94;
                                                    i88 = s17 & 65535;
                                                }
                                                if (i88 != j8 && ((dVar.A - i88) & 65535) <= dVar.f128396j - 262) {
                                                    dVar.f128409x = dVar.j(i88);
                                                }
                                                i24 = dVar.f128409x;
                                                if (i24 >= 3) {
                                                    zA = dVar.a(dVar.A - dVar.B, i24 - 3);
                                                    int i96 = dVar.C;
                                                    i25 = dVar.f128409x;
                                                    int i97 = i96 - i25;
                                                    dVar.C = i97;
                                                    if (i25 <= dVar.F || i97 < 3) {
                                                        int i98 = dVar.A + i25;
                                                        dVar.A = i98;
                                                        dVar.f128409x = 0;
                                                        byte[] bArr9 = dVar.f128400m;
                                                        int i99 = bArr9[i98] & UnsignedBytes.MAX_VALUE;
                                                        dVar.f128404q = i99;
                                                        dVar.f128404q = ((bArr9[i98 + 1] & UnsignedBytes.MAX_VALUE) ^ (i99 << dVar.f128407v)) & dVar.f128406t;
                                                    } else {
                                                        dVar.f128409x = i25 - 1;
                                                        do {
                                                            i26 = dVar.A;
                                                            int i100 = i26 + 1;
                                                            dVar.A = i100;
                                                            int i101 = ((dVar.f128404q << dVar.f128407v) ^ (dVar.f128400m[i26 + 3] & UnsignedBytes.MAX_VALUE)) & dVar.f128406t;
                                                            dVar.f128404q = i101;
                                                            short[] sArr5 = dVar.f128403p;
                                                            short s18 = sArr5[i101];
                                                            i27 = s18 & 65535;
                                                            dVar.f128402o[dVar.f128399l & i100] = s18;
                                                            sArr5[i101] = (short) i100;
                                                            i28 = dVar.f128409x - 1;
                                                            dVar.f128409x = i28;
                                                        } while (i28 != 0);
                                                        dVar.A = i26 + 2;
                                                        i88 = i27;
                                                    }
                                                } else {
                                                    zA = dVar.a(0, dVar.f128400m[dVar.A] & UnsignedBytes.MAX_VALUE);
                                                    dVar.C--;
                                                    dVar.A++;
                                                }
                                                if (zA) {
                                                    dVar.g(false);
                                                    if (kVar.f128462g == 0) {
                                                    }
                                                }
                                            }
                                        }
                                    } else {
                                        if (dVar.C >= 3) {
                                            int i910 = dVar.f128404q << dVar.f128407v;
                                            byte[] bArr10 = dVar.f128400m;
                                            int i911 = dVar.A;
                                            int i912 = (i910 ^ (bArr10[i911 + 2] & UnsignedBytes.MAX_VALUE)) & dVar.f128406t;
                                            dVar.f128404q = i912;
                                            short[] sArr6 = dVar.f128403p;
                                            short s19 = sArr6[i912];
                                            dVar.f128402o[dVar.f128399l & i911] = s19;
                                            sArr6[i912] = (short) i911;
                                            i88 = s19 & 65535;
                                        }
                                        if (i88 != j8) {
                                            dVar.f128409x = dVar.j(i88);
                                        }
                                        i24 = dVar.f128409x;
                                        if (i24 >= 3) {
                                            zA = dVar.a(dVar.A - dVar.B, i24 - 3);
                                            int i913 = dVar.C;
                                            i25 = dVar.f128409x;
                                            int i914 = i913 - i25;
                                            dVar.C = i914;
                                            if (i25 <= dVar.F) {
                                                int i915 = dVar.A + i25;
                                                dVar.A = i915;
                                                dVar.f128409x = 0;
                                                byte[] bArr11 = dVar.f128400m;
                                                int i916 = bArr11[i915] & UnsignedBytes.MAX_VALUE;
                                                dVar.f128404q = i916;
                                                dVar.f128404q = ((bArr11[i915 + 1] & UnsignedBytes.MAX_VALUE) ^ (i916 << dVar.f128407v)) & dVar.f128406t;
                                            } else {
                                                int i917 = dVar.A + i25;
                                                dVar.A = i917;
                                                dVar.f128409x = 0;
                                                byte[] bArr12 = dVar.f128400m;
                                                int i918 = bArr12[i917] & UnsignedBytes.MAX_VALUE;
                                                dVar.f128404q = i918;
                                                dVar.f128404q = ((bArr12[i917 + 1] & UnsignedBytes.MAX_VALUE) ^ (i918 << dVar.f128407v)) & dVar.f128406t;
                                            }
                                        } else {
                                            zA = dVar.a(0, dVar.f128400m[dVar.A] & UnsignedBytes.MAX_VALUE);
                                            dVar.C--;
                                            dVar.A++;
                                        }
                                        if (zA) {
                                            dVar.g(false);
                                            if (kVar.f128462g == 0) {
                                            }
                                        }
                                    }
                                    i18 = 0;
                                    i19 = 2;
                                }
                            }
                            if (i18 == i19 || i18 == 3) {
                                dVar.f128388b = 666;
                            }
                            if (i18 == 0 || i18 == i19) {
                                if (kVar.f128462g == 0) {
                                    dVar.f128395i = -1;
                                }
                            } else if (i18 == 1) {
                                if (i14 == 1) {
                                    dVar.q(i19, 3);
                                    short[] sArr7 = i.f128435f;
                                    dVar.r(sArr7, 256);
                                    dVar.b();
                                    if ((dVar.W0 + 11) - dVar.Y0 < 9) {
                                        dVar.q(i19, 3);
                                        dVar.r(sArr7, 256);
                                        dVar.b();
                                    }
                                    dVar.W0 = i44;
                                } else {
                                    dVar.q(0, 3);
                                    int i102 = dVar.Y0;
                                    if (i102 > 8) {
                                        dVar.o(dVar.X0);
                                    } else if (i102 > 0) {
                                        dVar.m((byte) dVar.X0);
                                    }
                                    dVar.X0 = (short) 0;
                                    dVar.Y0 = 0;
                                    dVar.W0 = 8;
                                    dVar.o((short) 0);
                                    dVar.o((short) (-1));
                                    dVar.n(0, 0, dVar.f128400m);
                                    if (i14 == 3) {
                                        for (int i103 = 0; i103 < dVar.f128405r; i103++) {
                                            dVar.f128403p[i103] = 0;
                                        }
                                    }
                                }
                                kVar.a();
                                if (kVar.f128462g == 0) {
                                    dVar.f128395i = -1;
                                } else if (i14 == 4) {
                                    i35 = dVar.f128393g;
                                    if (i35 > 0) {
                                        cVar = kVar.f128465j;
                                        if (i35 == 2) {
                                            long value4 = cVar.getValue();
                                            dVar.m((byte) (value4 & 255));
                                            dVar.m((byte) ((value4 >> 8) & 255));
                                            dVar.m((byte) ((value4 >> 16) & 255));
                                            dVar.m((byte) ((value4 >> 24) & 255));
                                            dVar.m((byte) (kVar.f128459d & 255));
                                            dVar.m((byte) ((kVar.f128459d >> 8) & 255));
                                            dVar.m((byte) ((kVar.f128459d >> 16) & 255));
                                            dVar.m((byte) ((kVar.f128459d >> 24) & 255));
                                            dVar.h().getClass();
                                        } else {
                                            long value5 = cVar.getValue();
                                            dVar.l((int) (value5 >>> 16));
                                            dVar.l((int) (value5 & WebSocketProtocol.PAYLOAD_SHORT_MAX));
                                        }
                                        kVar.a();
                                        i36 = dVar.f128393g;
                                        if (i36 > 0) {
                                            dVar.f128393g = -i36;
                                        }
                                        if (dVar.f128392f != 0) {
                                        }
                                    }
                                    z14 = true;
                                    i38 = 1;
                                }
                            } else if (i14 == 4) {
                                i35 = dVar.f128393g;
                                if (i35 > 0) {
                                    cVar = kVar.f128465j;
                                    if (i35 == 2) {
                                        long value6 = cVar.getValue();
                                        dVar.m((byte) (value6 & 255));
                                        dVar.m((byte) ((value6 >> 8) & 255));
                                        dVar.m((byte) ((value6 >> 16) & 255));
                                        dVar.m((byte) ((value6 >> 24) & 255));
                                        dVar.m((byte) (kVar.f128459d & 255));
                                        dVar.m((byte) ((kVar.f128459d >> 8) & 255));
                                        dVar.m((byte) ((kVar.f128459d >> 16) & 255));
                                        dVar.m((byte) ((kVar.f128459d >> 24) & 255));
                                        dVar.h().getClass();
                                    } else {
                                        long value7 = cVar.getValue();
                                        dVar.l((int) (value7 >>> 16));
                                        dVar.l((int) (value7 & WebSocketProtocol.PAYLOAD_SHORT_MAX));
                                    }
                                    kVar.a();
                                    i36 = dVar.f128393g;
                                    if (i36 > 0) {
                                        dVar.f128393g = -i36;
                                    }
                                    if (dVar.f128392f != 0) {
                                    }
                                }
                                z14 = true;
                                i38 = 1;
                            }
                            i38 = 0;
                        }
                    }
                    z14 = true;
                    i38 = -5;
                }
                z14 = true;
            }
            if (i38 == z14) {
                eVar.f128417k = z14;
            }
        }
        if (i38 == -5 ? eVar.f128458c > 0 || i14 == 4 : !(i38 == 0 || i38 == z14)) {
            vb.h.C("failed to deflate");
            return 0;
        }
        int i104 = eVar.f128461f;
        if (i104 > 0) {
            ((FilterOutputStream) this).out.write(bArr, 0, i104);
        }
        return i38;
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        e eVar;
        if (this.f128420c) {
            return;
        }
        while (true) {
            eVar = this.f128418a;
            if (eVar.f128417k) {
                break;
            } else {
                a(4);
            }
        }
        if (this.f128423f) {
            eVar.f128417k = true;
            d dVar = eVar.f128464i;
            if (dVar != null) {
                int i14 = dVar.f128388b;
                if (i14 == 42 || i14 == 113 || i14 == 666) {
                    dVar.f128389c = null;
                    dVar.P0 = null;
                    dVar.f128403p = null;
                    dVar.f128402o = null;
                    dVar.f128400m = null;
                }
                eVar.f128464i = null;
                eVar.f128456a = null;
                eVar.f128460e = null;
                eVar.f128463h = null;
            }
        }
        if (this.f128424g) {
            ((FilterOutputStream) this).out.close();
        }
        this.f128420c = true;
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream, java.io.Flushable
    public final void flush() throws IOException {
        int iA;
        if (this.f128421d) {
            e eVar = this.f128418a;
            if (!eVar.f128417k) {
                do {
                    iA = a(2);
                    if (eVar.f128461f < this.f128419b.length) {
                        break;
                    }
                } while (iA != 1);
            }
        }
        ((FilterOutputStream) this).out.flush();
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public final void write(byte[] bArr, int i14, int i15) throws IOException {
        e eVar = this.f128418a;
        if (eVar.f128417k) {
            vb.h.C("finished");
            return;
        }
        if (((i14 < 0) | (i15 < 0)) || (i14 + i15 > bArr.length)) {
            o2.c.q();
            return;
        }
        if (i15 == 0) {
            return;
        }
        int i16 = this.f128421d ? 2 : 0;
        if (i15 > 0 || eVar.f128456a == null) {
            int i17 = eVar.f128458c;
            if (i17 > 0) {
                byte[] bArr2 = new byte[i17 + i15];
                System.arraycopy(eVar.f128456a, eVar.f128457b, bArr2, 0, i17);
                System.arraycopy(bArr, i14, bArr2, eVar.f128458c, i15);
                eVar.f128456a = bArr2;
                eVar.f128457b = 0;
                eVar.f128458c += i15;
            } else {
                eVar.f128456a = bArr;
                eVar.f128457b = i14;
                eVar.f128458c = i15;
            }
        }
        while (eVar.f128458c > 0 && a(i16) != 1) {
        }
    }

    public f(OutputStream outputStream, e eVar) {
        this(outputStream, eVar, 512, true);
    }

    public f(OutputStream outputStream, e eVar, int i14) {
        this(outputStream, eVar, i14, true);
    }

    public f(OutputStream outputStream) {
        this(outputStream, new e(-1), 512, true);
        this.f128423f = true;
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public final void write(int i14) throws IOException {
        byte[] bArr = this.f128422e;
        bArr[0] = (byte) (i14 & 255);
        write(bArr, 0, 1);
    }
}
