package z02;

import b82.w0;
import ch.qos.logback.core.net.SyslogConstants;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.proto.generated.GDIInReachMessaging;
import com.google.android.exoplayer2.source.ProgressiveMediaSource;
import d3.h;
import e23.l;
import e23.p;
import gl1.y;
import java.util.LinkedHashMap;
import l72.h3;
import l72.i3;
import p005kotlin.Unit;
import p3.m;
import p3.n;
import p3.o0;
import p3.p2;
import p3.x1;
import w52.j0;

/* JADX INFO: loaded from: classes10.dex */
public final class f {
    /* JADX WARN: Code duplicated, block: B:39:0x006b  */
    /* JADX WARN: Code duplicated, block: B:40:0x006e  */
    /* JADX WARN: Code duplicated, block: B:42:0x0072  */
    /* JADX WARN: Code duplicated, block: B:44:0x0078  */
    /* JADX WARN: Code duplicated, block: B:45:0x007b  */
    /* JADX WARN: Code duplicated, block: B:49:0x0082  */
    /* JADX WARN: Code duplicated, block: B:51:0x0087  */
    /* JADX WARN: Code duplicated, block: B:53:0x008b  */
    /* JADX WARN: Code duplicated, block: B:55:0x0093  */
    /* JADX WARN: Code duplicated, block: B:56:0x0096  */
    /* JADX WARN: Code duplicated, block: B:60:0x009f  */
    /* JADX WARN: Code duplicated, block: B:62:0x00a3  */
    /* JADX WARN: Code duplicated, block: B:64:0x00a6  */
    /* JADX WARN: Code duplicated, block: B:66:0x00ae  */
    /* JADX WARN: Code duplicated, block: B:67:0x00b1  */
    /* JADX WARN: Code duplicated, block: B:71:0x00be  */
    /* JADX WARN: Code duplicated, block: B:72:0x00c0  */
    /* JADX WARN: Code duplicated, block: B:75:0x00c9 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:76:0x00cb  */
    /* JADX WARN: Code duplicated, block: B:77:0x00cd  */
    /* JADX WARN: Code duplicated, block: B:79:0x00d0  */
    /* JADX WARN: Code duplicated, block: B:82:0x00d4  */
    /* JADX WARN: Code duplicated, block: B:83:0x00d6  */
    /* JADX WARN: Code duplicated, block: B:85:0x00da  */
    /* JADX WARN: Code duplicated, block: B:86:0x00dd  */
    /* JADX WARN: Code duplicated, block: B:88:0x00e1  */
    /* JADX WARN: Code duplicated, block: B:91:0x00e6  */
    /* JADX WARN: Code duplicated, block: B:92:0x00f5  */
    /* JADX WARN: Code duplicated, block: B:94:0x0122  */
    /* JADX WARN: Code duplicated, block: B:97:0x0131  */
    /* JADX WARN: Code duplicated, block: B:99:? A[RETURN, SYNTHETIC] */
    public static final void a(int i14, int i15, b92.a aVar, e23.a aVar2, p pVar, String str, m mVar, u4.d dVar) {
        u4.d dVar2;
        int i16;
        int i17;
        int i18;
        e23.a aVar3;
        int i19;
        int i24;
        p pVar2;
        int i25;
        boolean z14;
        String str2;
        u4.d dVar3;
        e23.a aVar4;
        p pVar3;
        b92.a aVar5;
        p2 p2VarI0;
        u4.d dVar4;
        String str3;
        e23.a aVar6;
        b92.a aVar7;
        b92.a aVar8 = aVar;
        o0 o0VarE = mVar.E(609576425);
        int i26 = i15 & 1;
        if (i26 != 0) {
            i16 = i14 | 6;
            dVar2 = dVar;
        } else if ((i14 & 6) == 0) {
            dVar2 = dVar;
            i16 = (o0VarE.B(dVar2) ? 4 : 2) | i14;
        } else {
            dVar2 = dVar;
            i16 = i14;
        }
        int i27 = i15 & 2;
        if (i27 != 0) {
            i16 |= 48;
        } else if ((i14 & 48) == 0) {
            i16 |= (i14 & 64) == 0 ? o0VarE.B(aVar8) : o0VarE.r(aVar8) ? 32 : 16;
        }
        int i28 = i15 & 4;
        if (i28 == 0) {
            if ((i14 & 384) == 0) {
                i16 |= o0VarE.B(str) ? 256 : 128;
            }
            if ((i15 & 8) != 0) {
                i16 |= 3072;
            } else if ((i14 & 3072) == 0) {
                if (o0VarE.B(null)) {
                    i17 = 2048;
                } else {
                    i17 = 1024;
                }
                i16 |= i17;
            }
            i18 = i15 & 16;
            if (i18 != 0) {
                if ((i14 & 24576) == 0) {
                    aVar3 = aVar2;
                    if (o0VarE.r(aVar3)) {
                        i19 = 16384;
                    } else {
                        i19 = 8192;
                    }
                    i16 |= i19;
                }
                i24 = i15 & 32;
                if (i24 != 0) {
                    if ((196608 & i14) == 0) {
                        pVar2 = pVar;
                        if (o0VarE.r(pVar2)) {
                            i25 = 131072;
                        } else {
                            i25 = 65536;
                        }
                        i16 |= i25;
                    }
                    if ((74899 & i16) != 74898) {
                        z14 = true;
                    } else {
                        z14 = false;
                    }
                    if (o0VarE.n(i16 & 1, z14)) {
                        if (i26 != 0) {
                            dVar4 = null;
                        } else {
                            dVar4 = dVar2;
                        }
                        if (i27 != 0) {
                            aVar8 = null;
                        }
                        if (i28 != 0) {
                            str3 = null;
                        } else {
                            str3 = str;
                        }
                        if (i18 != 0) {
                            aVar6 = null;
                        } else {
                            aVar6 = aVar3;
                        }
                        if (i24 != 0) {
                            pVar2 = null;
                        }
                        x1 x1Var = n.f135158a;
                        if (aVar8 == null) {
                            o0VarE.C(1687401247);
                            b92.a aVarG = g(o0VarE);
                            o0VarE.g0(false);
                            aVar7 = aVarG;
                        } else {
                            o0VarE.C(1687400813);
                            o0VarE.g0(false);
                            aVar7 = aVar8;
                        }
                        int i29 = i16 >> 3;
                        int i30 = (i16 & 14) | (i29 & 112) | (i29 & 896);
                        int i34 = b92.a.f16960b;
                        h3.e(dVar4, str3, null, aVar7, aVar6, pVar2, null, o0VarE, i30 | (57344 & i16) | (458752 & i16), 64);
                        dVar3 = dVar4;
                        str2 = str3;
                        aVar4 = aVar6;
                        aVar5 = aVar8;
                        pVar3 = pVar2;
                    } else {
                        o0VarE.e();
                        str2 = str;
                        dVar3 = dVar2;
                        aVar4 = aVar3;
                        pVar3 = pVar2;
                        aVar5 = aVar8;
                    }
                    p2VarI0 = o0VarE.i0();
                    if (p2VarI0 != null) {
                        p2VarI0.f135219d = new e(dVar3, aVar5, str2, aVar4, pVar3, i14, i15);
                    }
                }
                i16 |= 196608;
                pVar2 = pVar;
                if ((74899 & i16) != 74898) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                if (o0VarE.n(i16 & 1, z14)) {
                    if (i26 != 0) {
                        dVar4 = null;
                    } else {
                        dVar4 = dVar2;
                    }
                    if (i27 != 0) {
                        aVar8 = null;
                    }
                    if (i28 != 0) {
                        str3 = null;
                    } else {
                        str3 = str;
                    }
                    if (i18 != 0) {
                        aVar6 = null;
                    } else {
                        aVar6 = aVar3;
                    }
                    if (i24 != 0) {
                        pVar2 = null;
                    }
                    x1 x1Var2 = n.f135158a;
                    if (aVar8 == null) {
                        o0VarE.C(1687401247);
                        b92.a aVarG2 = g(o0VarE);
                        o0VarE.g0(false);
                        aVar7 = aVarG2;
                    } else {
                        o0VarE.C(1687400813);
                        o0VarE.g0(false);
                        aVar7 = aVar8;
                    }
                    int i210 = i16 >> 3;
                    int i35 = (i16 & 14) | (i210 & 112) | (i210 & 896);
                    int i36 = b92.a.f16960b;
                    h3.e(dVar4, str3, null, aVar7, aVar6, pVar2, null, o0VarE, i35 | (57344 & i16) | (458752 & i16), 64);
                    dVar3 = dVar4;
                    str2 = str3;
                    aVar4 = aVar6;
                    aVar5 = aVar8;
                    pVar3 = pVar2;
                } else {
                    o0VarE.e();
                    str2 = str;
                    dVar3 = dVar2;
                    aVar4 = aVar3;
                    pVar3 = pVar2;
                    aVar5 = aVar8;
                }
                p2VarI0 = o0VarE.i0();
                if (p2VarI0 != null) {
                    p2VarI0.f135219d = new e(dVar3, aVar5, str2, aVar4, pVar3, i14, i15);
                }
            }
            i16 |= 24576;
            aVar3 = aVar2;
            i24 = i15 & 32;
            if (i24 != 0) {
                if ((196608 & i14) == 0) {
                    pVar2 = pVar;
                    if (o0VarE.r(pVar2)) {
                        i25 = 131072;
                    } else {
                        i25 = 65536;
                    }
                    i16 |= i25;
                }
                if ((74899 & i16) != 74898) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                if (o0VarE.n(i16 & 1, z14)) {
                    if (i26 != 0) {
                        dVar4 = null;
                    } else {
                        dVar4 = dVar2;
                    }
                    if (i27 != 0) {
                        aVar8 = null;
                    }
                    if (i28 != 0) {
                        str3 = null;
                    } else {
                        str3 = str;
                    }
                    if (i18 != 0) {
                        aVar6 = null;
                    } else {
                        aVar6 = aVar3;
                    }
                    if (i24 != 0) {
                        pVar2 = null;
                    }
                    x1 x1Var3 = n.f135158a;
                    if (aVar8 == null) {
                        o0VarE.C(1687401247);
                        b92.a aVarG3 = g(o0VarE);
                        o0VarE.g0(false);
                        aVar7 = aVarG3;
                    } else {
                        o0VarE.C(1687400813);
                        o0VarE.g0(false);
                        aVar7 = aVar8;
                    }
                    int i211 = i16 >> 3;
                    int i37 = (i16 & 14) | (i211 & 112) | (i211 & 896);
                    int i38 = b92.a.f16960b;
                    h3.e(dVar4, str3, null, aVar7, aVar6, pVar2, null, o0VarE, i37 | (57344 & i16) | (458752 & i16), 64);
                    dVar3 = dVar4;
                    str2 = str3;
                    aVar4 = aVar6;
                    aVar5 = aVar8;
                    pVar3 = pVar2;
                } else {
                    o0VarE.e();
                    str2 = str;
                    dVar3 = dVar2;
                    aVar4 = aVar3;
                    pVar3 = pVar2;
                    aVar5 = aVar8;
                }
                p2VarI0 = o0VarE.i0();
                if (p2VarI0 != null) {
                    p2VarI0.f135219d = new e(dVar3, aVar5, str2, aVar4, pVar3, i14, i15);
                }
            }
            i16 |= 196608;
            pVar2 = pVar;
            if ((74899 & i16) != 74898) {
                z14 = true;
            } else {
                z14 = false;
            }
            if (o0VarE.n(i16 & 1, z14)) {
                if (i26 != 0) {
                    dVar4 = null;
                } else {
                    dVar4 = dVar2;
                }
                if (i27 != 0) {
                    aVar8 = null;
                }
                if (i28 != 0) {
                    str3 = null;
                } else {
                    str3 = str;
                }
                if (i18 != 0) {
                    aVar6 = null;
                } else {
                    aVar6 = aVar3;
                }
                if (i24 != 0) {
                    pVar2 = null;
                }
                x1 x1Var4 = n.f135158a;
                if (aVar8 == null) {
                    o0VarE.C(1687401247);
                    b92.a aVarG4 = g(o0VarE);
                    o0VarE.g0(false);
                    aVar7 = aVarG4;
                } else {
                    o0VarE.C(1687400813);
                    o0VarE.g0(false);
                    aVar7 = aVar8;
                }
                int i212 = i16 >> 3;
                int i39 = (i16 & 14) | (i212 & 112) | (i212 & 896);
                int i310 = b92.a.f16960b;
                h3.e(dVar4, str3, null, aVar7, aVar6, pVar2, null, o0VarE, i39 | (57344 & i16) | (458752 & i16), 64);
                dVar3 = dVar4;
                str2 = str3;
                aVar4 = aVar6;
                aVar5 = aVar8;
                pVar3 = pVar2;
            } else {
                o0VarE.e();
                str2 = str;
                dVar3 = dVar2;
                aVar4 = aVar3;
                pVar3 = pVar2;
                aVar5 = aVar8;
            }
            p2VarI0 = o0VarE.i0();
            if (p2VarI0 != null) {
                p2VarI0.f135219d = new e(dVar3, aVar5, str2, aVar4, pVar3, i14, i15);
            }
        }
        i16 |= 384;
        if ((i15 & 8) != 0) {
            i16 |= 3072;
        } else if ((i14 & 3072) == 0) {
            if (o0VarE.B(null)) {
                i17 = 2048;
            } else {
                i17 = 1024;
            }
            i16 |= i17;
        }
        i18 = i15 & 16;
        if (i18 != 0) {
            if ((i14 & 24576) == 0) {
                aVar3 = aVar2;
                if (o0VarE.r(aVar3)) {
                    i19 = 16384;
                } else {
                    i19 = 8192;
                }
                i16 |= i19;
            }
            i24 = i15 & 32;
            if (i24 != 0) {
                if ((196608 & i14) == 0) {
                    pVar2 = pVar;
                    if (o0VarE.r(pVar2)) {
                        i25 = 131072;
                    } else {
                        i25 = 65536;
                    }
                    i16 |= i25;
                }
                if ((74899 & i16) != 74898) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                if (o0VarE.n(i16 & 1, z14)) {
                    if (i26 != 0) {
                        dVar4 = null;
                    } else {
                        dVar4 = dVar2;
                    }
                    if (i27 != 0) {
                        aVar8 = null;
                    }
                    if (i28 != 0) {
                        str3 = null;
                    } else {
                        str3 = str;
                    }
                    if (i18 != 0) {
                        aVar6 = null;
                    } else {
                        aVar6 = aVar3;
                    }
                    if (i24 != 0) {
                        pVar2 = null;
                    }
                    x1 x1Var5 = n.f135158a;
                    if (aVar8 == null) {
                        o0VarE.C(1687401247);
                        b92.a aVarG5 = g(o0VarE);
                        o0VarE.g0(false);
                        aVar7 = aVarG5;
                    } else {
                        o0VarE.C(1687400813);
                        o0VarE.g0(false);
                        aVar7 = aVar8;
                    }
                    int i213 = i16 >> 3;
                    int i311 = (i16 & 14) | (i213 & 112) | (i213 & 896);
                    int i312 = b92.a.f16960b;
                    h3.e(dVar4, str3, null, aVar7, aVar6, pVar2, null, o0VarE, i311 | (57344 & i16) | (458752 & i16), 64);
                    dVar3 = dVar4;
                    str2 = str3;
                    aVar4 = aVar6;
                    aVar5 = aVar8;
                    pVar3 = pVar2;
                } else {
                    o0VarE.e();
                    str2 = str;
                    dVar3 = dVar2;
                    aVar4 = aVar3;
                    pVar3 = pVar2;
                    aVar5 = aVar8;
                }
                p2VarI0 = o0VarE.i0();
                if (p2VarI0 != null) {
                    p2VarI0.f135219d = new e(dVar3, aVar5, str2, aVar4, pVar3, i14, i15);
                }
            }
            i16 |= 196608;
            pVar2 = pVar;
            if ((74899 & i16) != 74898) {
                z14 = true;
            } else {
                z14 = false;
            }
            if (o0VarE.n(i16 & 1, z14)) {
                if (i26 != 0) {
                    dVar4 = null;
                } else {
                    dVar4 = dVar2;
                }
                if (i27 != 0) {
                    aVar8 = null;
                }
                if (i28 != 0) {
                    str3 = null;
                } else {
                    str3 = str;
                }
                if (i18 != 0) {
                    aVar6 = null;
                } else {
                    aVar6 = aVar3;
                }
                if (i24 != 0) {
                    pVar2 = null;
                }
                x1 x1Var6 = n.f135158a;
                if (aVar8 == null) {
                    o0VarE.C(1687401247);
                    b92.a aVarG6 = g(o0VarE);
                    o0VarE.g0(false);
                    aVar7 = aVarG6;
                } else {
                    o0VarE.C(1687400813);
                    o0VarE.g0(false);
                    aVar7 = aVar8;
                }
                int i214 = i16 >> 3;
                int i313 = (i16 & 14) | (i214 & 112) | (i214 & 896);
                int i314 = b92.a.f16960b;
                h3.e(dVar4, str3, null, aVar7, aVar6, pVar2, null, o0VarE, i313 | (57344 & i16) | (458752 & i16), 64);
                dVar3 = dVar4;
                str2 = str3;
                aVar4 = aVar6;
                aVar5 = aVar8;
                pVar3 = pVar2;
            } else {
                o0VarE.e();
                str2 = str;
                dVar3 = dVar2;
                aVar4 = aVar3;
                pVar3 = pVar2;
                aVar5 = aVar8;
            }
            p2VarI0 = o0VarE.i0();
            if (p2VarI0 != null) {
                p2VarI0.f135219d = new e(dVar3, aVar5, str2, aVar4, pVar3, i14, i15);
            }
        }
        i16 |= 24576;
        aVar3 = aVar2;
        i24 = i15 & 32;
        if (i24 != 0) {
            if ((196608 & i14) == 0) {
                pVar2 = pVar;
                if (o0VarE.r(pVar2)) {
                    i25 = 131072;
                } else {
                    i25 = 65536;
                }
                i16 |= i25;
            }
            if ((74899 & i16) != 74898) {
                z14 = true;
            } else {
                z14 = false;
            }
            if (o0VarE.n(i16 & 1, z14)) {
                if (i26 != 0) {
                    dVar4 = null;
                } else {
                    dVar4 = dVar2;
                }
                if (i27 != 0) {
                    aVar8 = null;
                }
                if (i28 != 0) {
                    str3 = null;
                } else {
                    str3 = str;
                }
                if (i18 != 0) {
                    aVar6 = null;
                } else {
                    aVar6 = aVar3;
                }
                if (i24 != 0) {
                    pVar2 = null;
                }
                x1 x1Var7 = n.f135158a;
                if (aVar8 == null) {
                    o0VarE.C(1687401247);
                    b92.a aVarG7 = g(o0VarE);
                    o0VarE.g0(false);
                    aVar7 = aVarG7;
                } else {
                    o0VarE.C(1687400813);
                    o0VarE.g0(false);
                    aVar7 = aVar8;
                }
                int i215 = i16 >> 3;
                int i315 = (i16 & 14) | (i215 & 112) | (i215 & 896);
                int i316 = b92.a.f16960b;
                h3.e(dVar4, str3, null, aVar7, aVar6, pVar2, null, o0VarE, i315 | (57344 & i16) | (458752 & i16), 64);
                dVar3 = dVar4;
                str2 = str3;
                aVar4 = aVar6;
                aVar5 = aVar8;
                pVar3 = pVar2;
            } else {
                o0VarE.e();
                str2 = str;
                dVar3 = dVar2;
                aVar4 = aVar3;
                pVar3 = pVar2;
                aVar5 = aVar8;
            }
            p2VarI0 = o0VarE.i0();
            if (p2VarI0 != null) {
                p2VarI0.f135219d = new e(dVar3, aVar5, str2, aVar4, pVar3, i14, i15);
            }
        }
        i16 |= 196608;
        pVar2 = pVar;
        if ((74899 & i16) != 74898) {
            z14 = true;
        } else {
            z14 = false;
        }
        if (o0VarE.n(i16 & 1, z14)) {
            if (i26 != 0) {
                dVar4 = null;
            } else {
                dVar4 = dVar2;
            }
            if (i27 != 0) {
                aVar8 = null;
            }
            if (i28 != 0) {
                str3 = null;
            } else {
                str3 = str;
            }
            if (i18 != 0) {
                aVar6 = null;
            } else {
                aVar6 = aVar3;
            }
            if (i24 != 0) {
                pVar2 = null;
            }
            x1 x1Var8 = n.f135158a;
            if (aVar8 == null) {
                o0VarE.C(1687401247);
                b92.a aVarG8 = g(o0VarE);
                o0VarE.g0(false);
                aVar7 = aVarG8;
            } else {
                o0VarE.C(1687400813);
                o0VarE.g0(false);
                aVar7 = aVar8;
            }
            int i216 = i16 >> 3;
            int i317 = (i16 & 14) | (i216 & 112) | (i216 & 896);
            int i318 = b92.a.f16960b;
            h3.e(dVar4, str3, null, aVar7, aVar6, pVar2, null, o0VarE, i317 | (57344 & i16) | (458752 & i16), 64);
            dVar3 = dVar4;
            str2 = str3;
            aVar4 = aVar6;
            aVar5 = aVar8;
            pVar3 = pVar2;
        } else {
            o0VarE.e();
            str2 = str;
            dVar3 = dVar2;
            aVar4 = aVar3;
            pVar3 = pVar2;
            aVar5 = aVar8;
        }
        p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new e(dVar3, aVar5, str2, aVar4, pVar3, i14, i15);
        }
    }

    /* JADX WARN: Code duplicated, block: B:101:0x011b  */
    /* JADX WARN: Code duplicated, block: B:102:0x011d  */
    /* JADX WARN: Code duplicated, block: B:104:0x0121  */
    /* JADX WARN: Code duplicated, block: B:105:0x0124  */
    /* JADX WARN: Code duplicated, block: B:107:0x0128  */
    /* JADX WARN: Code duplicated, block: B:108:0x012a  */
    /* JADX WARN: Code duplicated, block: B:110:0x012e  */
    /* JADX WARN: Code duplicated, block: B:111:0x0131  */
    /* JADX WARN: Code duplicated, block: B:114:0x0137  */
    /* JADX WARN: Code duplicated, block: B:115:0x0146  */
    /* JADX WARN: Code duplicated, block: B:117:0x0185  */
    /* JADX WARN: Code duplicated, block: B:120:0x019a  */
    /* JADX WARN: Code duplicated, block: B:122:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:46:0x0080  */
    /* JADX WARN: Code duplicated, block: B:48:0x0085  */
    /* JADX WARN: Code duplicated, block: B:50:0x0089  */
    /* JADX WARN: Code duplicated, block: B:52:0x0091  */
    /* JADX WARN: Code duplicated, block: B:53:0x0094  */
    /* JADX WARN: Code duplicated, block: B:57:0x009f A[PHI: r16
      0x009f: PHI (r16v12 int) = (r16v0 int), (r16v5 int), (r16v6 int) binds: [B:56:0x009d, B:66:0x00b8, B:65:0x00b5] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:58:0x00a2  */
    /* JADX WARN: Code duplicated, block: B:60:0x00a6  */
    /* JADX WARN: Code duplicated, block: B:62:0x00aa  */
    /* JADX WARN: Code duplicated, block: B:63:0x00af  */
    /* JADX WARN: Code duplicated, block: B:65:0x00b5  */
    /* JADX WARN: Code duplicated, block: B:66:0x00b8  */
    /* JADX WARN: Code duplicated, block: B:69:0x00c3 A[PHI: r18
      0x00c3: PHI (r18v16 int) = (r18v0 int), (r18v5 int), (r18v6 int) binds: [B:68:0x00c1, B:78:0x00dc, B:77:0x00d9] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:70:0x00c6  */
    /* JADX WARN: Code duplicated, block: B:72:0x00ca  */
    /* JADX WARN: Code duplicated, block: B:74:0x00ce  */
    /* JADX WARN: Code duplicated, block: B:75:0x00d3  */
    /* JADX WARN: Code duplicated, block: B:77:0x00d9  */
    /* JADX WARN: Code duplicated, block: B:78:0x00dc  */
    /* JADX WARN: Code duplicated, block: B:81:0x00e9  */
    /* JADX WARN: Code duplicated, block: B:83:0x00ef  */
    /* JADX WARN: Code duplicated, block: B:84:0x00f2  */
    /* JADX WARN: Code duplicated, block: B:88:0x0101  */
    /* JADX WARN: Code duplicated, block: B:89:0x0103  */
    /* JADX WARN: Code duplicated, block: B:92:0x010c  */
    /* JADX WARN: Code duplicated, block: B:94:0x010f  */
    /* JADX WARN: Code duplicated, block: B:95:0x0111  */
    /* JADX WARN: Code duplicated, block: B:97:0x0114  */
    /* JADX WARN: Code duplicated, block: B:98:0x0116  */
    public static final void b(u4.d dVar, b92.a aVar, String str, String str2, e23.a<Unit> aVar2, i53.c<i3> cVar, i53.c<i3> cVar2, l<? super i3, Unit> lVar, m mVar, int i14, int i15) {
        u4.d dVar2;
        int i16;
        int i17;
        e23.a<Unit> aVar3;
        int i18;
        int i19;
        int i24;
        boolean zR;
        int i25;
        int i26;
        boolean zR2;
        boolean z14;
        o0 o0Var;
        b92.a aVar4;
        String str3;
        i53.c<i3> cVar3;
        i53.c<i3> cVar4;
        u4.d dVar3;
        e23.a<Unit> aVar5;
        p2 p2VarI0;
        u4.d dVar4;
        b92.a aVar6;
        String str4;
        e23.a<Unit> aVar7;
        i53.c<i3> cVar5;
        i53.c<i3> cVar6;
        b92.a aVar8;
        int i27;
        o0 o0VarE = mVar.E(376243507);
        int i28 = i15 & 1;
        if (i28 != 0) {
            i16 = i14 | 6;
            dVar2 = dVar;
        } else if ((i14 & 6) == 0) {
            dVar2 = dVar;
            i16 = (o0VarE.B(dVar2) ? 4 : 2) | i14;
        } else {
            dVar2 = dVar;
            i16 = i14;
        }
        int i29 = i15 & 2;
        if (i29 != 0) {
            i16 |= 48;
        } else if ((i14 & 48) == 0) {
            i16 |= (i14 & 64) == 0 ? o0VarE.B(aVar) : o0VarE.r(aVar) ? 32 : 16;
        }
        if ((i14 & 384) == 0) {
            i16 |= o0VarE.B(str) ? 256 : 128;
        }
        int i30 = i15 & 8;
        if (i30 == 0) {
            if ((i14 & 3072) == 0) {
                i16 |= o0VarE.B(str2) ? 2048 : 1024;
            }
            i17 = i15 & 16;
            if (i17 != 0) {
                if ((i14 & 24576) == 0) {
                    aVar3 = aVar2;
                    if (o0VarE.r(aVar3)) {
                        i18 = 16384;
                    } else {
                        i18 = 8192;
                    }
                    i16 |= i18;
                }
                i19 = i15 & 32;
                i24 = 196608;
                if (i19 == 0) {
                    i16 |= i24;
                } else if ((i14 & 196608) == 0) {
                    if ((i14 & GDIInReachMessaging.Capabilities.MessagingCapability.PLAN_CHANGE_VALUE) == 0) {
                        zR = o0VarE.B(cVar);
                    } else {
                        zR = o0VarE.r(cVar);
                    }
                    if (zR) {
                        i24 = 131072;
                    } else {
                        i24 = 65536;
                    }
                    i16 |= i24;
                }
                i25 = i15 & 64;
                i26 = 1572864;
                if (i25 == 0) {
                    i16 |= i26;
                } else if ((i14 & 1572864) == 0) {
                    if ((i14 & 2097152) == 0) {
                        zR2 = o0VarE.B(cVar2);
                    } else {
                        zR2 = o0VarE.r(cVar2);
                    }
                    if (zR2) {
                        i26 = ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES;
                    } else {
                        i26 = 524288;
                    }
                    i16 |= i26;
                }
                if ((i14 & 12582912) == 0) {
                    if (o0VarE.r(lVar)) {
                        i27 = 8388608;
                    } else {
                        i27 = 4194304;
                    }
                    i16 |= i27;
                }
                if ((i16 & 4793491) != 4793490) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                if (o0VarE.n(i16 & 1, z14)) {
                    if (i28 != 0) {
                        dVar4 = null;
                    } else {
                        dVar4 = dVar2;
                    }
                    if (i29 != 0) {
                        aVar6 = null;
                    } else {
                        aVar6 = aVar;
                    }
                    if (i30 != 0) {
                        str4 = null;
                    } else {
                        str4 = str2;
                    }
                    if (i17 != 0) {
                        aVar7 = null;
                    } else {
                        aVar7 = aVar3;
                    }
                    if (i19 != 0) {
                        cVar5 = null;
                    } else {
                        cVar5 = cVar;
                    }
                    if (i25 != 0) {
                        cVar6 = null;
                    } else {
                        cVar6 = cVar2;
                    }
                    x1 x1Var = n.f135158a;
                    if (aVar6 == null) {
                        o0VarE.C(792770409);
                        b92.a aVarG = g(o0VarE);
                        o0VarE.g0(false);
                        aVar8 = aVarG;
                    } else {
                        o0VarE.C(792769975);
                        o0VarE.g0(false);
                        aVar8 = aVar6;
                    }
                    int i34 = i16 >> 3;
                    int i35 = (i16 & 14) | (i34 & 112) | (i34 & 896);
                    int i36 = b92.a.f16960b;
                    o0Var = o0VarE;
                    h3.f(dVar4, str, str4, aVar8, aVar7, cVar5, cVar6, lVar, null, o0Var, i35 | (57344 & i16) | GDIInReachMessaging.Capabilities.MessagingCapability.PLAN_CHANGE_VALUE | (458752 & i16) | 2097152 | (3670016 & i16) | (29360128 & i16), 256);
                    aVar4 = aVar6;
                    dVar3 = dVar4;
                    str3 = str4;
                    aVar5 = aVar7;
                    cVar3 = cVar5;
                    cVar4 = cVar6;
                } else {
                    o0Var = o0VarE;
                    o0Var.e();
                    aVar4 = aVar;
                    str3 = str2;
                    cVar3 = cVar;
                    cVar4 = cVar2;
                    dVar3 = dVar2;
                    aVar5 = aVar3;
                }
                p2VarI0 = o0Var.i0();
                if (p2VarI0 != null) {
                    p2VarI0.f135219d = new b82.l(dVar3, aVar4, str, str3, aVar5, cVar3, cVar4, lVar, i14, i15);
                }
            }
            i16 |= 24576;
            aVar3 = aVar2;
            i19 = i15 & 32;
            i24 = 196608;
            if (i19 == 0) {
                i16 |= i24;
            } else if ((i14 & 196608) == 0) {
                if ((i14 & GDIInReachMessaging.Capabilities.MessagingCapability.PLAN_CHANGE_VALUE) == 0) {
                    zR = o0VarE.B(cVar);
                } else {
                    zR = o0VarE.r(cVar);
                }
                if (zR) {
                    i24 = 131072;
                } else {
                    i24 = 65536;
                }
                i16 |= i24;
            }
            i25 = i15 & 64;
            i26 = 1572864;
            if (i25 == 0) {
                i16 |= i26;
            } else if ((i14 & 1572864) == 0) {
                if ((i14 & 2097152) == 0) {
                    zR2 = o0VarE.B(cVar2);
                } else {
                    zR2 = o0VarE.r(cVar2);
                }
                if (zR2) {
                    i26 = ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES;
                } else {
                    i26 = 524288;
                }
                i16 |= i26;
            }
            if ((i14 & 12582912) == 0) {
                if (o0VarE.r(lVar)) {
                    i27 = 8388608;
                } else {
                    i27 = 4194304;
                }
                i16 |= i27;
            }
            if ((i16 & 4793491) != 4793490) {
                z14 = true;
            } else {
                z14 = false;
            }
            if (o0VarE.n(i16 & 1, z14)) {
                if (i28 != 0) {
                    dVar4 = null;
                } else {
                    dVar4 = dVar2;
                }
                if (i29 != 0) {
                    aVar6 = null;
                } else {
                    aVar6 = aVar;
                }
                if (i30 != 0) {
                    str4 = null;
                } else {
                    str4 = str2;
                }
                if (i17 != 0) {
                    aVar7 = null;
                } else {
                    aVar7 = aVar3;
                }
                if (i19 != 0) {
                    cVar5 = null;
                } else {
                    cVar5 = cVar;
                }
                if (i25 != 0) {
                    cVar6 = null;
                } else {
                    cVar6 = cVar2;
                }
                x1 x1Var2 = n.f135158a;
                if (aVar6 == null) {
                    o0VarE.C(792770409);
                    b92.a aVarG2 = g(o0VarE);
                    o0VarE.g0(false);
                    aVar8 = aVarG2;
                } else {
                    o0VarE.C(792769975);
                    o0VarE.g0(false);
                    aVar8 = aVar6;
                }
                int i37 = i16 >> 3;
                int i38 = (i16 & 14) | (i37 & 112) | (i37 & 896);
                int i39 = b92.a.f16960b;
                o0Var = o0VarE;
                h3.f(dVar4, str, str4, aVar8, aVar7, cVar5, cVar6, lVar, null, o0Var, i38 | (57344 & i16) | GDIInReachMessaging.Capabilities.MessagingCapability.PLAN_CHANGE_VALUE | (458752 & i16) | 2097152 | (3670016 & i16) | (29360128 & i16), 256);
                aVar4 = aVar6;
                dVar3 = dVar4;
                str3 = str4;
                aVar5 = aVar7;
                cVar3 = cVar5;
                cVar4 = cVar6;
            } else {
                o0Var = o0VarE;
                o0Var.e();
                aVar4 = aVar;
                str3 = str2;
                cVar3 = cVar;
                cVar4 = cVar2;
                dVar3 = dVar2;
                aVar5 = aVar3;
            }
            p2VarI0 = o0Var.i0();
            if (p2VarI0 != null) {
                p2VarI0.f135219d = new b82.l(dVar3, aVar4, str, str3, aVar5, cVar3, cVar4, lVar, i14, i15);
            }
        }
        i16 |= 3072;
        i17 = i15 & 16;
        if (i17 != 0) {
            if ((i14 & 24576) == 0) {
                aVar3 = aVar2;
                if (o0VarE.r(aVar3)) {
                    i18 = 16384;
                } else {
                    i18 = 8192;
                }
                i16 |= i18;
            }
            i19 = i15 & 32;
            i24 = 196608;
            if (i19 == 0) {
                i16 |= i24;
            } else if ((i14 & 196608) == 0) {
                if ((i14 & GDIInReachMessaging.Capabilities.MessagingCapability.PLAN_CHANGE_VALUE) == 0) {
                    zR = o0VarE.B(cVar);
                } else {
                    zR = o0VarE.r(cVar);
                }
                if (zR) {
                    i24 = 131072;
                } else {
                    i24 = 65536;
                }
                i16 |= i24;
            }
            i25 = i15 & 64;
            i26 = 1572864;
            if (i25 == 0) {
                i16 |= i26;
            } else if ((i14 & 1572864) == 0) {
                if ((i14 & 2097152) == 0) {
                    zR2 = o0VarE.B(cVar2);
                } else {
                    zR2 = o0VarE.r(cVar2);
                }
                if (zR2) {
                    i26 = ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES;
                } else {
                    i26 = 524288;
                }
                i16 |= i26;
            }
            if ((i14 & 12582912) == 0) {
                if (o0VarE.r(lVar)) {
                    i27 = 8388608;
                } else {
                    i27 = 4194304;
                }
                i16 |= i27;
            }
            if ((i16 & 4793491) != 4793490) {
                z14 = true;
            } else {
                z14 = false;
            }
            if (o0VarE.n(i16 & 1, z14)) {
                if (i28 != 0) {
                    dVar4 = null;
                } else {
                    dVar4 = dVar2;
                }
                if (i29 != 0) {
                    aVar6 = null;
                } else {
                    aVar6 = aVar;
                }
                if (i30 != 0) {
                    str4 = null;
                } else {
                    str4 = str2;
                }
                if (i17 != 0) {
                    aVar7 = null;
                } else {
                    aVar7 = aVar3;
                }
                if (i19 != 0) {
                    cVar5 = null;
                } else {
                    cVar5 = cVar;
                }
                if (i25 != 0) {
                    cVar6 = null;
                } else {
                    cVar6 = cVar2;
                }
                x1 x1Var3 = n.f135158a;
                if (aVar6 == null) {
                    o0VarE.C(792770409);
                    b92.a aVarG3 = g(o0VarE);
                    o0VarE.g0(false);
                    aVar8 = aVarG3;
                } else {
                    o0VarE.C(792769975);
                    o0VarE.g0(false);
                    aVar8 = aVar6;
                }
                int i310 = i16 >> 3;
                int i311 = (i16 & 14) | (i310 & 112) | (i310 & 896);
                int i312 = b92.a.f16960b;
                o0Var = o0VarE;
                h3.f(dVar4, str, str4, aVar8, aVar7, cVar5, cVar6, lVar, null, o0Var, i311 | (57344 & i16) | GDIInReachMessaging.Capabilities.MessagingCapability.PLAN_CHANGE_VALUE | (458752 & i16) | 2097152 | (3670016 & i16) | (29360128 & i16), 256);
                aVar4 = aVar6;
                dVar3 = dVar4;
                str3 = str4;
                aVar5 = aVar7;
                cVar3 = cVar5;
                cVar4 = cVar6;
            } else {
                o0Var = o0VarE;
                o0Var.e();
                aVar4 = aVar;
                str3 = str2;
                cVar3 = cVar;
                cVar4 = cVar2;
                dVar3 = dVar2;
                aVar5 = aVar3;
            }
            p2VarI0 = o0Var.i0();
            if (p2VarI0 != null) {
                p2VarI0.f135219d = new b82.l(dVar3, aVar4, str, str3, aVar5, cVar3, cVar4, lVar, i14, i15);
            }
        }
        i16 |= 24576;
        aVar3 = aVar2;
        i19 = i15 & 32;
        i24 = 196608;
        if (i19 == 0) {
            i16 |= i24;
        } else if ((i14 & 196608) == 0) {
            if ((i14 & GDIInReachMessaging.Capabilities.MessagingCapability.PLAN_CHANGE_VALUE) == 0) {
                zR = o0VarE.B(cVar);
            } else {
                zR = o0VarE.r(cVar);
            }
            if (zR) {
                i24 = 131072;
            } else {
                i24 = 65536;
            }
            i16 |= i24;
        }
        i25 = i15 & 64;
        i26 = 1572864;
        if (i25 == 0) {
            i16 |= i26;
        } else if ((i14 & 1572864) == 0) {
            if ((i14 & 2097152) == 0) {
                zR2 = o0VarE.B(cVar2);
            } else {
                zR2 = o0VarE.r(cVar2);
            }
            if (zR2) {
                i26 = ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES;
            } else {
                i26 = 524288;
            }
            i16 |= i26;
        }
        if ((i14 & 12582912) == 0) {
            if (o0VarE.r(lVar)) {
                i27 = 8388608;
            } else {
                i27 = 4194304;
            }
            i16 |= i27;
        }
        if ((i16 & 4793491) != 4793490) {
            z14 = true;
        } else {
            z14 = false;
        }
        if (o0VarE.n(i16 & 1, z14)) {
            if (i28 != 0) {
                dVar4 = null;
            } else {
                dVar4 = dVar2;
            }
            if (i29 != 0) {
                aVar6 = null;
            } else {
                aVar6 = aVar;
            }
            if (i30 != 0) {
                str4 = null;
            } else {
                str4 = str2;
            }
            if (i17 != 0) {
                aVar7 = null;
            } else {
                aVar7 = aVar3;
            }
            if (i19 != 0) {
                cVar5 = null;
            } else {
                cVar5 = cVar;
            }
            if (i25 != 0) {
                cVar6 = null;
            } else {
                cVar6 = cVar2;
            }
            x1 x1Var4 = n.f135158a;
            if (aVar6 == null) {
                o0VarE.C(792770409);
                b92.a aVarG4 = g(o0VarE);
                o0VarE.g0(false);
                aVar8 = aVarG4;
            } else {
                o0VarE.C(792769975);
                o0VarE.g0(false);
                aVar8 = aVar6;
            }
            int i313 = i16 >> 3;
            int i314 = (i16 & 14) | (i313 & 112) | (i313 & 896);
            int i315 = b92.a.f16960b;
            o0Var = o0VarE;
            h3.f(dVar4, str, str4, aVar8, aVar7, cVar5, cVar6, lVar, null, o0Var, i314 | (57344 & i16) | GDIInReachMessaging.Capabilities.MessagingCapability.PLAN_CHANGE_VALUE | (458752 & i16) | 2097152 | (3670016 & i16) | (29360128 & i16), 256);
            aVar4 = aVar6;
            dVar3 = dVar4;
            str3 = str4;
            aVar5 = aVar7;
            cVar3 = cVar5;
            cVar4 = cVar6;
        } else {
            o0Var = o0VarE;
            o0Var.e();
            aVar4 = aVar;
            str3 = str2;
            cVar3 = cVar;
            cVar4 = cVar2;
            dVar3 = dVar2;
            aVar5 = aVar3;
        }
        p2VarI0 = o0Var.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new b82.l(dVar3, aVar4, str, str3, aVar5, cVar3, cVar4, lVar, i14, i15);
        }
    }

    /* JADX WARN: Code duplicated, block: B:41:0x0076  */
    /* JADX WARN: Code duplicated, block: B:42:0x0078  */
    /* JADX WARN: Code duplicated, block: B:45:0x0081  */
    /* JADX WARN: Code duplicated, block: B:51:0x0098 A[PHI: r0 r9 r12 r14
      0x0098: PHI (r0v8 int) = (r0v5 int), (r0v9 int) binds: [B:59:0x00ad, B:50:0x008f] A[DONT_GENERATE, DONT_INLINE]
      0x0098: PHI (r9v4 b92.a) = (r9v2 b92.a), (r9v5 b92.a) binds: [B:59:0x00ad, B:50:0x008f] A[DONT_GENERATE, DONT_INLINE]
      0x0098: PHI (r12v2 java.lang.String) = (r12v0 java.lang.String), (r12v3 java.lang.String) binds: [B:59:0x00ad, B:50:0x008f] A[DONT_GENERATE, DONT_INLINE]
      0x0098: PHI (r14v2 u4.d) = (r14v0 u4.d), (r14v3 u4.d) binds: [B:59:0x00ad, B:50:0x008f] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:52:0x009a  */
    /* JADX WARN: Code duplicated, block: B:54:0x009d  */
    /* JADX WARN: Code duplicated, block: B:57:0x00a8  */
    /* JADX WARN: Code duplicated, block: B:60:0x00af  */
    /* JADX WARN: Code duplicated, block: B:62:0x00d7  */
    /* JADX WARN: Code duplicated, block: B:65:0x00e3  */
    /* JADX WARN: Code duplicated, block: B:67:? A[RETURN, SYNTHETIC] */
    public static final void c(int i14, int i15, b92.a aVar, e23.a aVar2, p pVar, String str, m mVar, u4.d dVar) {
        String str2;
        int i16;
        b92.a aVar3;
        int i17;
        p pVar2;
        boolean z14;
        u4.d dVar2;
        p pVar3;
        p2 p2VarI0;
        u4.d dVar3;
        String str3;
        int i18;
        b92.a aVar4;
        p pVar4;
        o0 o0VarE = mVar.E(-1920517380);
        int i19 = i15 & 1;
        if (i19 != 0) {
            i16 = i14 | 6;
            str2 = str;
        } else if ((i14 & 6) == 0) {
            str2 = str;
            i16 = (o0VarE.B(str2) ? 4 : 2) | i14;
        } else {
            str2 = str;
            i16 = i14;
        }
        int i24 = i16 | SyslogConstants.LOG_LOCAL6;
        if ((i14 & 3072) == 0) {
            i24 |= o0VarE.r(aVar2) ? 2048 : 1024;
        }
        int i25 = i15 & 16;
        if (i25 != 0) {
            i17 = i24 | 24576;
            aVar3 = aVar;
        } else {
            aVar3 = aVar;
            i17 = i24 | (o0VarE.B(aVar3) ? 16384 : 8192);
        }
        int i26 = i15 & 32;
        if (i26 == 0) {
            if ((196608 & i14) == 0) {
                pVar2 = pVar;
                i17 |= o0VarE.r(pVar2) ? 131072 : 65536;
            }
            if ((74899 & i17) != 74898) {
                z14 = true;
            } else {
                z14 = false;
            }
            if (o0VarE.n(i17 & 1, z14)) {
                o0VarE.G0();
                if ((i14 & 1) != 0 || o0VarE.o0()) {
                    if (i19 != 0) {
                        str2 = null;
                    }
                    int i27 = b3.a.f15501a;
                    u4.d dVarA = c3.a.a();
                    int i28 = i17 & (-897);
                    if (i25 != 0) {
                        aVar3 = null;
                    }
                    dVar3 = dVarA;
                    str3 = str2;
                    i18 = i28;
                    aVar4 = aVar3;
                    if (i26 != 0) {
                        pVar4 = null;
                    }
                    o0VarE.h0();
                    x1 x1Var = n.f135158a;
                    int i29 = b92.a.f16960b;
                    a(((i18 >> 9) & 112) | ((i18 << 6) & 896) | 3072 | ((i18 << 3) & 57344) | (i18 & 458752), 0, aVar4, aVar2, pVar4, str3, o0VarE, dVar3);
                    aVar3 = aVar4;
                    pVar3 = pVar4;
                    str2 = str3;
                    dVar2 = dVar3;
                } else {
                    o0VarE.e();
                    i18 = i17 & (-897);
                    dVar3 = dVar;
                    str3 = str2;
                    aVar4 = aVar3;
                }
                pVar4 = pVar2;
                o0VarE.h0();
                x1 x1Var2 = n.f135158a;
                int i210 = b92.a.f16960b;
                a(((i18 >> 9) & 112) | ((i18 << 6) & 896) | 3072 | ((i18 << 3) & 57344) | (i18 & 458752), 0, aVar4, aVar2, pVar4, str3, o0VarE, dVar3);
                aVar3 = aVar4;
                pVar3 = pVar4;
                str2 = str3;
                dVar2 = dVar3;
            } else {
                o0VarE.e();
                dVar2 = dVar;
                pVar3 = pVar2;
            }
            p2VarI0 = o0VarE.i0();
            if (p2VarI0 != null) {
                p2VarI0.f135219d = new e(str2, dVar2, aVar2, aVar3, pVar3, i14, i15);
            }
        }
        i17 |= 196608;
        pVar2 = pVar;
        if ((74899 & i17) != 74898) {
            z14 = true;
        } else {
            z14 = false;
        }
        if (o0VarE.n(i17 & 1, z14)) {
            o0VarE.G0();
            if ((i14 & 1) != 0) {
                if (i19 != 0) {
                    str2 = null;
                }
                int i211 = b3.a.f15501a;
                u4.d dVarA2 = c3.a.a();
                int i212 = i17 & (-897);
                if (i25 != 0) {
                    aVar3 = null;
                }
                dVar3 = dVarA2;
                str3 = str2;
                i18 = i212;
                aVar4 = aVar3;
                if (i26 != 0) {
                    pVar4 = null;
                } else {
                    pVar4 = pVar2;
                }
            } else {
                if (i19 != 0) {
                    str2 = null;
                }
                int i213 = b3.a.f15501a;
                u4.d dVarA3 = c3.a.a();
                int i214 = i17 & (-897);
                if (i25 != 0) {
                    aVar3 = null;
                }
                dVar3 = dVarA3;
                str3 = str2;
                i18 = i214;
                aVar4 = aVar3;
                if (i26 != 0) {
                    pVar4 = null;
                } else {
                    pVar4 = pVar2;
                }
            }
            o0VarE.h0();
            x1 x1Var3 = n.f135158a;
            int i215 = b92.a.f16960b;
            a(((i18 >> 9) & 112) | ((i18 << 6) & 896) | 3072 | ((i18 << 3) & 57344) | (i18 & 458752), 0, aVar4, aVar2, pVar4, str3, o0VarE, dVar3);
            aVar3 = aVar4;
            pVar3 = pVar4;
            str2 = str3;
            dVar2 = dVar3;
        } else {
            o0VarE.e();
            dVar2 = dVar;
            pVar3 = pVar2;
        }
        p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new e(str2, dVar2, aVar2, aVar3, pVar3, i14, i15);
        }
    }

    /* JADX WARN: Code duplicated, block: B:101:0x0183  */
    /* JADX WARN: Code duplicated, block: B:103:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:27:0x0059  */
    /* JADX WARN: Code duplicated, block: B:28:0x005c  */
    /* JADX WARN: Code duplicated, block: B:31:0x0067  */
    /* JADX WARN: Code duplicated, block: B:32:0x006c  */
    /* JADX WARN: Code duplicated, block: B:34:0x0072  */
    /* JADX WARN: Code duplicated, block: B:36:0x0076  */
    /* JADX WARN: Code duplicated, block: B:37:0x007b  */
    /* JADX WARN: Code duplicated, block: B:39:0x0081  */
    /* JADX WARN: Code duplicated, block: B:40:0x0084  */
    /* JADX WARN: Code duplicated, block: B:44:0x008f A[PHI: r15
      0x008f: PHI (r15v14 int) = (r15v0 int), (r15v5 int), (r15v6 int) binds: [B:43:0x008d, B:53:0x00a7, B:52:0x00a4] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:45:0x0091  */
    /* JADX WARN: Code duplicated, block: B:47:0x0095  */
    /* JADX WARN: Code duplicated, block: B:49:0x0099  */
    /* JADX WARN: Code duplicated, block: B:50:0x009e  */
    /* JADX WARN: Code duplicated, block: B:52:0x00a4  */
    /* JADX WARN: Code duplicated, block: B:53:0x00a7  */
    /* JADX WARN: Code duplicated, block: B:56:0x00b0  */
    /* JADX WARN: Code duplicated, block: B:57:0x00b7  */
    /* JADX WARN: Code duplicated, block: B:59:0x00bf  */
    /* JADX WARN: Code duplicated, block: B:61:0x00c5  */
    /* JADX WARN: Code duplicated, block: B:62:0x00c8  */
    /* JADX WARN: Code duplicated, block: B:66:0x00d8  */
    /* JADX WARN: Code duplicated, block: B:67:0x00da  */
    /* JADX WARN: Code duplicated, block: B:70:0x00e3  */
    /* JADX WARN: Code duplicated, block: B:80:0x0107  */
    /* JADX WARN: Code duplicated, block: B:82:0x010a  */
    /* JADX WARN: Code duplicated, block: B:84:0x010d  */
    /* JADX WARN: Code duplicated, block: B:87:0x0112  */
    /* JADX WARN: Code duplicated, block: B:89:0x011d  */
    /* JADX WARN: Code duplicated, block: B:90:0x011f  */
    /* JADX WARN: Code duplicated, block: B:92:0x0123  */
    /* JADX WARN: Code duplicated, block: B:95:0x0128  */
    /* JADX WARN: Code duplicated, block: B:96:0x0132  */
    /* JADX WARN: Code duplicated, block: B:98:0x0171  */
    public static final void d(String str, String str2, u4.d dVar, e23.a aVar, i53.c cVar, i53.c cVar2, l lVar, m mVar, int i14, int i15) {
        String str3;
        int i16;
        String str4;
        int i17;
        u4.d dVarA;
        int i18;
        int i19;
        int i24;
        int i25;
        boolean zR;
        int i26;
        int i27;
        int i28;
        boolean zR2;
        int i29;
        int i30;
        l lVar2;
        int i34;
        boolean z14;
        o0 o0Var;
        i53.c cVar3;
        i53.c cVar4;
        String str5;
        String str6;
        u4.d dVar2;
        l lVar3;
        p2 p2VarI0;
        i53.c cVar5;
        i53.c cVar6;
        i53.c cVar7;
        String str7;
        String str8;
        l lVar4;
        int i35;
        u4.d dVar3;
        i53.c cVar8 = cVar2;
        o0 o0VarE = mVar.E(-61285498);
        int i36 = i15 & 1;
        if (i36 != 0) {
            i16 = i14 | 6;
            str3 = str;
        } else {
            str3 = str;
            i16 = i14 | (o0VarE.B(str3) ? 4 : 2);
        }
        int i37 = i15 & 2;
        if (i37 != 0) {
            i17 = i16 | 48;
            str4 = str2;
        } else {
            str4 = str2;
            i17 = i16 | (o0VarE.B(str4) ? 32 : 16);
        }
        if ((i15 & 4) == 0) {
            dVarA = dVar;
            int i38 = o0VarE.B(dVarA) ? 256 : 128;
            int i39 = i17 | i38;
            if (o0VarE.r(aVar)) {
                i18 = 2048;
            } else {
                i18 = 1024;
            }
            i19 = i39 | i18;
            i24 = i19 | 24576;
            i25 = i15 & 32;
            if (i25 != 0) {
                i24 = 221184 | i19;
            } else if ((i14 & 196608) == 0) {
                if ((i14 & GDIInReachMessaging.Capabilities.MessagingCapability.PLAN_CHANGE_VALUE) == 0) {
                    zR = o0VarE.B(cVar);
                } else {
                    zR = o0VarE.r(cVar);
                }
                if (zR) {
                    i26 = 131072;
                } else {
                    i26 = 65536;
                }
                i24 |= i26;
            }
            i27 = i15 & 64;
            i28 = 1572864;
            if (i27 == 0) {
                i24 |= i28;
            } else if ((i14 & 1572864) == 0) {
                if ((i14 & 2097152) == 0) {
                    zR2 = o0VarE.B(cVar8);
                } else {
                    zR2 = o0VarE.r(cVar8);
                }
                if (zR2) {
                    i28 = ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES;
                } else {
                    i28 = 524288;
                }
                i24 |= i28;
            }
            i29 = i15 & 128;
            if (i29 != 0) {
                i24 |= 12582912;
                i30 = 262144;
                lVar2 = lVar;
            } else {
                i30 = 262144;
                lVar2 = lVar;
                if ((i14 & 12582912) == 0) {
                    if (o0VarE.r(lVar2)) {
                        i34 = 8388608;
                    } else {
                        i34 = 4194304;
                    }
                    i24 |= i34;
                }
            }
            if ((i24 & 4793491) != 4793490) {
                z14 = true;
            } else {
                z14 = false;
            }
            if (o0VarE.n(i24 & 1, z14)) {
                o0VarE.G0();
                if ((i14 & 1) != 0 || o0VarE.o0()) {
                    if (i36 != 0) {
                        str3 = null;
                    }
                    if (i37 != 0) {
                        str4 = null;
                    }
                    if ((i15 & 4) != 0) {
                        int i44 = b3.a.f15501a;
                        i24 &= -897;
                        dVarA = c3.a.a();
                    }
                    if (i25 != 0) {
                        cVar5 = null;
                    } else {
                        cVar5 = cVar;
                    }
                    if (i27 != 0) {
                        cVar8 = null;
                    }
                    cVar6 = cVar8;
                    if (i29 != 0) {
                        cVar7 = cVar5;
                        str7 = str3;
                        str8 = str4;
                        lVar4 = null;
                        i35 = i24;
                        dVar3 = dVarA;
                    } else {
                        cVar7 = cVar5;
                    }
                    o0VarE.h0();
                    x1 x1Var = n.f135158a;
                    int i45 = b92.a.f16960b;
                    int i46 = i35 << 6;
                    o0Var = o0VarE;
                    b(dVar3, null, str7, str8, aVar, cVar7, cVar6, lVar4, o0Var, 2097152 | ((i35 >> 6) & 14) | 48 | (i46 & 896) | (i46 & 7168) | ((i35 << 3) & 57344) | i30 | (458752 & i35) | (3670016 & i35) | (i35 & 29360128), 0);
                    dVar2 = dVar3;
                    str5 = str7;
                    str6 = str8;
                    cVar3 = cVar7;
                    cVar4 = cVar6;
                    lVar3 = lVar4;
                } else {
                    o0VarE.e();
                    if ((i15 & 4) != 0) {
                        i24 &= -897;
                    }
                    cVar7 = cVar;
                    cVar6 = cVar8;
                }
                str8 = str4;
                i35 = i24;
                dVar3 = dVarA;
                lVar4 = lVar2;
                str7 = str3;
                o0VarE.h0();
                x1 x1Var2 = n.f135158a;
                int i47 = b92.a.f16960b;
                int i48 = i35 << 6;
                o0Var = o0VarE;
                b(dVar3, null, str7, str8, aVar, cVar7, cVar6, lVar4, o0Var, 2097152 | ((i35 >> 6) & 14) | 48 | (i48 & 896) | (i48 & 7168) | ((i35 << 3) & 57344) | i30 | (458752 & i35) | (3670016 & i35) | (i35 & 29360128), 0);
                dVar2 = dVar3;
                str5 = str7;
                str6 = str8;
                cVar3 = cVar7;
                cVar4 = cVar6;
                lVar3 = lVar4;
            } else {
                o0Var = o0VarE;
                o0Var.e();
                cVar3 = cVar;
                cVar4 = cVar8;
                str5 = str3;
                str6 = str4;
                dVar2 = dVarA;
                lVar3 = lVar2;
            }
            p2VarI0 = o0Var.i0();
            if (p2VarI0 != null) {
                p2VarI0.f135219d = new w0(str5, str6, dVar2, aVar, cVar3, cVar4, lVar3, i14, i15);
            }
        }
        dVarA = dVar;
        int i310 = i17 | i38;
        if (o0VarE.r(aVar)) {
            i18 = 2048;
        } else {
            i18 = 1024;
        }
        i19 = i310 | i18;
        i24 = i19 | 24576;
        i25 = i15 & 32;
        if (i25 != 0) {
            i24 = 221184 | i19;
        } else if ((i14 & 196608) == 0) {
            if ((i14 & GDIInReachMessaging.Capabilities.MessagingCapability.PLAN_CHANGE_VALUE) == 0) {
                zR = o0VarE.B(cVar);
            } else {
                zR = o0VarE.r(cVar);
            }
            if (zR) {
                i26 = 131072;
            } else {
                i26 = 65536;
            }
            i24 |= i26;
        }
        i27 = i15 & 64;
        i28 = 1572864;
        if (i27 == 0) {
            i24 |= i28;
        } else if ((i14 & 1572864) == 0) {
            if ((i14 & 2097152) == 0) {
                zR2 = o0VarE.B(cVar8);
            } else {
                zR2 = o0VarE.r(cVar8);
            }
            if (zR2) {
                i28 = ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES;
            } else {
                i28 = 524288;
            }
            i24 |= i28;
        }
        i29 = i15 & 128;
        if (i29 != 0) {
            i24 |= 12582912;
            i30 = 262144;
            lVar2 = lVar;
        } else {
            i30 = 262144;
            lVar2 = lVar;
            if ((i14 & 12582912) == 0) {
                if (o0VarE.r(lVar2)) {
                    i34 = 8388608;
                } else {
                    i34 = 4194304;
                }
                i24 |= i34;
            }
        }
        if ((i24 & 4793491) != 4793490) {
            z14 = true;
        } else {
            z14 = false;
        }
        if (o0VarE.n(i24 & 1, z14)) {
            o0VarE.G0();
            if ((i14 & 1) != 0) {
                if (i36 != 0) {
                    str3 = null;
                }
                if (i37 != 0) {
                    str4 = null;
                }
                if ((i15 & 4) != 0) {
                    int i49 = b3.a.f15501a;
                    i24 &= -897;
                    dVarA = c3.a.a();
                }
                if (i25 != 0) {
                    cVar5 = null;
                } else {
                    cVar5 = cVar;
                }
                if (i27 != 0) {
                    cVar8 = null;
                }
                cVar6 = cVar8;
                if (i29 != 0) {
                    cVar7 = cVar5;
                    str7 = str3;
                    str8 = str4;
                    lVar4 = null;
                    i35 = i24;
                    dVar3 = dVarA;
                } else {
                    cVar7 = cVar5;
                    str8 = str4;
                    i35 = i24;
                    dVar3 = dVarA;
                    lVar4 = lVar2;
                    str7 = str3;
                }
            } else {
                if (i36 != 0) {
                    str3 = null;
                }
                if (i37 != 0) {
                    str4 = null;
                }
                if ((i15 & 4) != 0) {
                    int i410 = b3.a.f15501a;
                    i24 &= -897;
                    dVarA = c3.a.a();
                }
                if (i25 != 0) {
                    cVar5 = null;
                } else {
                    cVar5 = cVar;
                }
                if (i27 != 0) {
                    cVar8 = null;
                }
                cVar6 = cVar8;
                if (i29 != 0) {
                    cVar7 = cVar5;
                    str7 = str3;
                    str8 = str4;
                    lVar4 = null;
                    i35 = i24;
                    dVar3 = dVarA;
                } else {
                    cVar7 = cVar5;
                    str8 = str4;
                    i35 = i24;
                    dVar3 = dVarA;
                    lVar4 = lVar2;
                    str7 = str3;
                }
            }
            o0VarE.h0();
            x1 x1Var3 = n.f135158a;
            int i411 = b92.a.f16960b;
            int i412 = i35 << 6;
            o0Var = o0VarE;
            b(dVar3, null, str7, str8, aVar, cVar7, cVar6, lVar4, o0Var, 2097152 | ((i35 >> 6) & 14) | 48 | (i412 & 896) | (i412 & 7168) | ((i35 << 3) & 57344) | i30 | (458752 & i35) | (3670016 & i35) | (i35 & 29360128), 0);
            dVar2 = dVar3;
            str5 = str7;
            str6 = str8;
            cVar3 = cVar7;
            cVar4 = cVar6;
            lVar3 = lVar4;
        } else {
            o0Var = o0VarE;
            o0Var.e();
            cVar3 = cVar;
            cVar4 = cVar8;
            str5 = str3;
            str6 = str4;
            dVar2 = dVarA;
            lVar3 = lVar2;
        }
        p2VarI0 = o0Var.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new w0(str5, str6, dVar2, aVar, cVar3, cVar4, lVar3, i14, i15);
        }
    }

    public static final void e(String str, u4.d dVar, e23.a aVar, i53.c cVar, l lVar, m mVar, int i14) {
        u4.d dVar2;
        int i15;
        u4.d dVarA;
        o0 o0VarE = mVar.E(1074486385);
        int i16 = (o0VarE.B(str) ? 4 : 2) | i14 | SyslogConstants.LOG_LOCAL6;
        if ((i14 & 3072) == 0) {
            i16 |= o0VarE.r(aVar) ? 2048 : 1024;
        }
        int i17 = i16 | 24576 | (o0VarE.r(cVar) ? 131072 : 65536) | 1572864 | (o0VarE.r(lVar) ? 8388608 : 4194304);
        if (o0VarE.n(i17 & 1, (4793491 & i17) != 4793490)) {
            o0VarE.G0();
            if ((i14 & 1) == 0 || o0VarE.o0()) {
                b3.b.f15502a.getClass();
                i15 = i17 & (-897);
                dVarA = h.a();
            } else {
                o0VarE.e();
                i15 = i17 & (-897);
                dVarA = dVar;
            }
            o0VarE.h0();
            x1 x1Var = n.f135158a;
            o0VarE.C(1789282520);
            b92.a.C0235a c0235a = new b92.a.C0235a(null, 1, null);
            c0235a.f16962a.put("navigateIconDescription", y.Q(o0VarE, R.string.lbl_close));
            b92.a aVarB = c0235a.b();
            o0VarE.g0(false);
            int i18 = b92.a.f16960b;
            b(dVarA, aVarB, str, null, aVar, cVar, null, lVar, o0VarE, ((i15 << 6) & 896) | 3072 | ((i15 << 3) & 57344) | GDIInReachMessaging.Capabilities.MessagingCapability.PLAN_CHANGE_VALUE | (458752 & i15) | 3670016 | (i15 & 29360128), 0);
            dVar2 = dVarA;
        } else {
            o0VarE.e();
            dVar2 = dVar;
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new j0(str, dVar2, aVar, cVar, lVar, i14, 9);
        }
    }

    /* JADX WARN: Code duplicated, block: B:25:0x004b  */
    /* JADX WARN: Code duplicated, block: B:26:0x004d  */
    /* JADX WARN: Code duplicated, block: B:29:0x0056  */
    /* JADX WARN: Code duplicated, block: B:38:0x0070  */
    /* JADX WARN: Code duplicated, block: B:40:0x0074  */
    /* JADX WARN: Code duplicated, block: B:42:0x007e  */
    /* JADX WARN: Code duplicated, block: B:44:0x00af  */
    /* JADX WARN: Code duplicated, block: B:47:0x00ba  */
    /* JADX WARN: Code duplicated, block: B:49:? A[RETURN, SYNTHETIC] */
    public static final void f(u4.d dVar, e23.a aVar, p pVar, z3.e eVar, m mVar, int i14, int i15) {
        p pVar2;
        boolean z14;
        u4.d dVar2;
        p pVar3;
        p2 p2VarI0;
        o0 o0VarE = mVar.E(89943346);
        int i16 = (((i15 & 1) == 0 && o0VarE.B(dVar)) ? 4 : 2) | i14 | (o0VarE.r(aVar) ? 32 : 16);
        int i17 = i16 | 384;
        int i18 = i15 & 8;
        if (i18 == 0) {
            if ((i14 & 3072) == 0) {
                pVar2 = pVar;
                i17 |= o0VarE.r(pVar2) ? 2048 : 1024;
            }
            if ((i17 & 9363) != 9362) {
                z14 = true;
            } else {
                z14 = false;
            }
            if (o0VarE.n(i17 & 1, z14)) {
                o0VarE.G0();
                if ((i14 & 1) != 0 || o0VarE.o0()) {
                    if ((i15 & 1) != 0) {
                        int i19 = b3.a.f15501a;
                        dVar = c3.a.a();
                        i17 &= -15;
                    }
                    if (i18 != 0) {
                        pVar2 = null;
                    }
                } else {
                    o0VarE.e();
                    if ((i15 & 1) != 0) {
                        i17 &= -15;
                    }
                }
                u4.d dVar3 = dVar;
                p pVar4 = pVar2;
                o0VarE.h0();
                x1 x1Var = n.f135158a;
                o0VarE.C(536219624);
                b92.a aVarG = g(o0VarE);
                o0VarE.g0(false);
                int i24 = b92.a.f16960b;
                h3.d(dVar3, aVarG, aVar, pVar4, null, eVar, o0VarE, (i17 & 14) | ((i17 << 3) & 896) | (i17 & 7168) | 196608, 16);
                dVar2 = dVar3;
                pVar3 = pVar4;
            } else {
                o0VarE.e();
                dVar2 = dVar;
                pVar3 = pVar2;
            }
            p2VarI0 = o0VarE.i0();
            if (p2VarI0 != null) {
                p2VarI0.f135219d = new ye1.b(dVar2, aVar, pVar3, eVar, i14, i15);
            }
        }
        i17 = i16 | 3456;
        pVar2 = pVar;
        if ((i17 & 9363) != 9362) {
            z14 = true;
        } else {
            z14 = false;
        }
        if (o0VarE.n(i17 & 1, z14)) {
            o0VarE.G0();
            if ((i14 & 1) != 0) {
                if ((i15 & 1) != 0) {
                    int i110 = b3.a.f15501a;
                    dVar = c3.a.a();
                    i17 &= -15;
                }
                if (i18 != 0) {
                    pVar2 = null;
                }
            } else {
                if ((i15 & 1) != 0) {
                    int i111 = b3.a.f15501a;
                    dVar = c3.a.a();
                    i17 &= -15;
                }
                if (i18 != 0) {
                    pVar2 = null;
                }
            }
            u4.d dVar4 = dVar;
            p pVar5 = pVar2;
            o0VarE.h0();
            x1 x1Var2 = n.f135158a;
            o0VarE.C(536219624);
            b92.a aVarG2 = g(o0VarE);
            o0VarE.g0(false);
            int i25 = b92.a.f16960b;
            h3.d(dVar4, aVarG2, aVar, pVar5, null, eVar, o0VarE, (i17 & 14) | ((i17 << 3) & 896) | (i17 & 7168) | 196608, 16);
            dVar2 = dVar4;
            pVar3 = pVar5;
        } else {
            o0VarE.e();
            dVar2 = dVar;
            pVar3 = pVar2;
        }
        p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new ye1.b(dVar2, aVar, pVar3, eVar, i14, i15);
        }
    }

    public static final b92.a g(m mVar) {
        x1 x1Var = n.f135158a;
        b92.a.C0235a c0235a = new b92.a.C0235a(null, 1, null);
        String strQ = y.Q(mVar, R.string.lbl_navigate_up);
        LinkedHashMap linkedHashMap = c0235a.f16962a;
        linkedHashMap.put("navigateIconDescription", strQ);
        linkedHashMap.put("moreIconDescription", y.Q(mVar, R.string.lbl_more));
        return c0235a.b();
    }
}
