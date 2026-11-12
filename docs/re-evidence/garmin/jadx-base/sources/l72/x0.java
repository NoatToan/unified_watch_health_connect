package l72;

import android.annotation.SuppressLint;
import com.google.android.exoplayer2.C;
import com.google.android.exoplayer2.source.ProgressiveMediaSource;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import i3.mh;
import i3.v5;
import java.util.Map;
import org.apache.commons.lang3.StringUtils;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p3.b4;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\bÇ\u0002\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0007"}, d2 = {"Ll72/x0;", "", "<init>", "()V", "c", "a", "b", "components_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class x0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final x0 f111346a = new x0();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Map<String, p006l2.q1> f111347b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f111348c;

    public interface b {
        void a(p3.m mVar, int i14);
    }

    static {
        long jB = o53.f0.B(4);
        long jB2 = o53.f0.B(0);
        s5.z.f157329b.getClass();
        s5.y yVar = new s5.y(jB, jB2, s5.z.f157336i, null);
        q0.f111207a.getClass();
        f111347b = p13.t0.b(new o13.p("spaceBetweenMetricAndUnit", new p006l2.q1(yVar, q0.f111208b)));
        f111348c = 8;
    }

    private x0() {
    }

    /* JADX WARN: Code duplicated, block: B:100:0x0117  */
    /* JADX WARN: Code duplicated, block: B:101:0x011a  */
    /* JADX WARN: Code duplicated, block: B:103:0x011e  */
    /* JADX WARN: Code duplicated, block: B:104:0x0121  */
    /* JADX WARN: Code duplicated, block: B:106:0x0125  */
    /* JADX WARN: Code duplicated, block: B:107:0x012a  */
    /* JADX WARN: Code duplicated, block: B:109:0x012e  */
    /* JADX WARN: Code duplicated, block: B:110:0x0130  */
    /* JADX WARN: Code duplicated, block: B:112:0x0170  */
    /* JADX WARN: Code duplicated, block: B:115:0x0181  */
    /* JADX WARN: Code duplicated, block: B:117:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:52:0x0090  */
    /* JADX WARN: Code duplicated, block: B:54:0x0094  */
    /* JADX WARN: Code duplicated, block: B:56:0x0097  */
    /* JADX WARN: Code duplicated, block: B:58:0x009f  */
    /* JADX WARN: Code duplicated, block: B:59:0x00a2  */
    /* JADX WARN: Code duplicated, block: B:63:0x00ab  */
    /* JADX WARN: Code duplicated, block: B:65:0x00af  */
    /* JADX WARN: Code duplicated, block: B:67:0x00b3  */
    /* JADX WARN: Code duplicated, block: B:69:0x00bb  */
    /* JADX WARN: Code duplicated, block: B:70:0x00be  */
    /* JADX WARN: Code duplicated, block: B:74:0x00c7  */
    /* JADX WARN: Code duplicated, block: B:75:0x00ce  */
    /* JADX WARN: Code duplicated, block: B:77:0x00d6  */
    /* JADX WARN: Code duplicated, block: B:79:0x00dc  */
    /* JADX WARN: Code duplicated, block: B:80:0x00df  */
    /* JADX WARN: Code duplicated, block: B:84:0x00eb  */
    /* JADX WARN: Code duplicated, block: B:86:0x00f1  */
    /* JADX WARN: Code duplicated, block: B:87:0x00f4  */
    /* JADX WARN: Code duplicated, block: B:91:0x0102  */
    /* JADX WARN: Code duplicated, block: B:92:0x0104  */
    /* JADX WARN: Code duplicated, block: B:95:0x010d  */
    /* JADX WARN: Code duplicated, block: B:97:0x0110  */
    /* JADX WARN: Code duplicated, block: B:98:0x0113  */
    public final void a(int i14, int i15, b92.a aVar, c2.t2 t2Var, e23.q qVar, @SuppressLint({"ModifierParameter"}) h4.r rVar, String str, String str2, String str3, b bVar, p3.m mVar) {
        int i16;
        String str4;
        String str5;
        int i17;
        e23.q qVar2;
        int i18;
        int i19;
        h4.r rVar2;
        int i24;
        int i25;
        int i26;
        b92.a aVar2;
        int i27;
        boolean z14;
        p3.o0 o0Var;
        b bVar2;
        String str6;
        e23.q qVar3;
        b92.a aVar3;
        h4.r rVar3;
        p3.p2 p2VarI0;
        b bVar3;
        String str7;
        e23.q qVar4;
        h4.r rVar4;
        b92.a aVar4;
        int i28;
        t2Var.getClass();
        str.getClass();
        p3.o0 o0VarE = mVar.E(1621986879);
        if ((i14 & 6) == 0) {
            i16 = (o0VarE.B(t2Var) ? 4 : 2) | i14;
        } else {
            i16 = i14;
        }
        if ((i14 & 48) == 0) {
            i16 |= o0VarE.B(str) ? 32 : 16;
        }
        if ((i14 & 384) == 0) {
            str4 = str2;
            i16 |= o0VarE.B(str4) ? 256 : 128;
        } else {
            str4 = str2;
        }
        int i29 = i15 & 4;
        if (i29 != 0) {
            i16 |= 3072;
        } else if ((i14 & 3072) == 0) {
            i16 |= (i14 & 4096) == 0 ? o0VarE.B(bVar) : o0VarE.r(bVar) ? 2048 : 1024;
        }
        int i30 = i15 & 8;
        if (i30 == 0) {
            if ((i14 & 24576) == 0) {
                str5 = str3;
                i16 |= o0VarE.B(str5) ? 16384 : 8192;
            }
            i17 = i15 & 16;
            if (i17 != 0) {
                if ((196608 & i14) == 0) {
                    qVar2 = qVar;
                    if (o0VarE.r(qVar2)) {
                        i18 = 131072;
                    } else {
                        i18 = 65536;
                    }
                    i16 |= i18;
                }
                i19 = i15 & 32;
                if (i19 != 0) {
                    if ((i14 & 1572864) == 0) {
                        rVar2 = rVar;
                        if (o0VarE.B(rVar2)) {
                            i24 = ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES;
                        } else {
                            i24 = 524288;
                        }
                        i16 |= i24;
                    }
                    i25 = i15 & 64;
                    if (i25 != 0) {
                        i16 |= 12582912;
                        i26 = 1572864;
                        aVar2 = aVar;
                    } else {
                        i26 = 1572864;
                        aVar2 = aVar;
                        if ((i14 & 12582912) == 0) {
                            if (o0VarE.B(aVar2)) {
                                i27 = 8388608;
                            } else {
                                i27 = 4194304;
                            }
                            i16 |= i27;
                        }
                    }
                    if ((i14 & 100663296) == 0) {
                        if (o0VarE.r(this)) {
                            i28 = 67108864;
                        } else {
                            i28 = 33554432;
                        }
                        i16 |= i28;
                    }
                    if ((i16 & 38347923) != 38347922) {
                        z14 = true;
                    } else {
                        z14 = false;
                    }
                    if (o0VarE.n(i16 & 1, z14)) {
                        if (i29 != 0) {
                            bVar3 = null;
                        } else {
                            bVar3 = bVar;
                        }
                        if (i30 != 0) {
                            str7 = null;
                        } else {
                            str7 = str5;
                        }
                        if (i17 != 0) {
                            qVar4 = null;
                        } else {
                            qVar4 = qVar2;
                        }
                        if (i19 != 0) {
                            rVar4 = h4.r.S;
                        } else {
                            rVar4 = rVar2;
                        }
                        if (i25 != 0) {
                            aVar4 = null;
                        } else {
                            aVar4 = aVar2;
                        }
                        p3.x1 x1Var = p3.n.f135158a;
                        int i34 = (i16 & 14) | i26 | (i16 & 112) | (i16 & 896) | (i16 & 7168) | (57344 & i16) | (458752 & i16);
                        int i35 = i16 << 3;
                        o0Var = o0VarE;
                        b(i34 | (29360128 & i35) | (234881024 & i35) | (i35 & 1879048192), 0, aVar4, t2Var, qVar4, rVar4, str, str4, str7, bVar3, o0Var, true);
                        aVar3 = aVar4;
                        qVar3 = qVar4;
                        rVar3 = rVar4;
                        str6 = str7;
                        bVar2 = bVar3;
                    } else {
                        o0Var = o0VarE;
                        o0Var.e();
                        bVar2 = bVar;
                        str6 = str5;
                        qVar3 = qVar2;
                        aVar3 = aVar2;
                        rVar3 = rVar2;
                    }
                    p2VarI0 = o0Var.i0();
                    if (p2VarI0 != null) {
                        p2VarI0.f135219d = new v0(this, t2Var, str, str2, bVar2, str6, qVar3, rVar3, aVar3, i14, i15);
                    }
                }
                i16 |= 1572864;
                rVar2 = rVar;
                i25 = i15 & 64;
                if (i25 != 0) {
                    i16 |= 12582912;
                    i26 = 1572864;
                    aVar2 = aVar;
                } else {
                    i26 = 1572864;
                    aVar2 = aVar;
                    if ((i14 & 12582912) == 0) {
                        if (o0VarE.B(aVar2)) {
                            i27 = 8388608;
                        } else {
                            i27 = 4194304;
                        }
                        i16 |= i27;
                    }
                }
                if ((i14 & 100663296) == 0) {
                    if (o0VarE.r(this)) {
                        i28 = 67108864;
                    } else {
                        i28 = 33554432;
                    }
                    i16 |= i28;
                }
                if ((i16 & 38347923) != 38347922) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                if (o0VarE.n(i16 & 1, z14)) {
                    if (i29 != 0) {
                        bVar3 = null;
                    } else {
                        bVar3 = bVar;
                    }
                    if (i30 != 0) {
                        str7 = null;
                    } else {
                        str7 = str5;
                    }
                    if (i17 != 0) {
                        qVar4 = null;
                    } else {
                        qVar4 = qVar2;
                    }
                    if (i19 != 0) {
                        rVar4 = h4.r.S;
                    } else {
                        rVar4 = rVar2;
                    }
                    if (i25 != 0) {
                        aVar4 = null;
                    } else {
                        aVar4 = aVar2;
                    }
                    p3.x1 x1Var2 = p3.n.f135158a;
                    int i36 = (i16 & 14) | i26 | (i16 & 112) | (i16 & 896) | (i16 & 7168) | (57344 & i16) | (458752 & i16);
                    int i37 = i16 << 3;
                    o0Var = o0VarE;
                    b(i36 | (29360128 & i37) | (234881024 & i37) | (i37 & 1879048192), 0, aVar4, t2Var, qVar4, rVar4, str, str4, str7, bVar3, o0Var, true);
                    aVar3 = aVar4;
                    qVar3 = qVar4;
                    rVar3 = rVar4;
                    str6 = str7;
                    bVar2 = bVar3;
                } else {
                    o0Var = o0VarE;
                    o0Var.e();
                    bVar2 = bVar;
                    str6 = str5;
                    qVar3 = qVar2;
                    aVar3 = aVar2;
                    rVar3 = rVar2;
                }
                p2VarI0 = o0Var.i0();
                if (p2VarI0 != null) {
                    p2VarI0.f135219d = new v0(this, t2Var, str, str2, bVar2, str6, qVar3, rVar3, aVar3, i14, i15);
                }
            }
            i16 |= 196608;
            qVar2 = qVar;
            i19 = i15 & 32;
            if (i19 != 0) {
                if ((i14 & 1572864) == 0) {
                    rVar2 = rVar;
                    if (o0VarE.B(rVar2)) {
                        i24 = ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES;
                    } else {
                        i24 = 524288;
                    }
                    i16 |= i24;
                }
                i25 = i15 & 64;
                if (i25 != 0) {
                    i16 |= 12582912;
                    i26 = 1572864;
                    aVar2 = aVar;
                } else {
                    i26 = 1572864;
                    aVar2 = aVar;
                    if ((i14 & 12582912) == 0) {
                        if (o0VarE.B(aVar2)) {
                            i27 = 8388608;
                        } else {
                            i27 = 4194304;
                        }
                        i16 |= i27;
                    }
                }
                if ((i14 & 100663296) == 0) {
                    if (o0VarE.r(this)) {
                        i28 = 67108864;
                    } else {
                        i28 = 33554432;
                    }
                    i16 |= i28;
                }
                if ((i16 & 38347923) != 38347922) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                if (o0VarE.n(i16 & 1, z14)) {
                    if (i29 != 0) {
                        bVar3 = null;
                    } else {
                        bVar3 = bVar;
                    }
                    if (i30 != 0) {
                        str7 = null;
                    } else {
                        str7 = str5;
                    }
                    if (i17 != 0) {
                        qVar4 = null;
                    } else {
                        qVar4 = qVar2;
                    }
                    if (i19 != 0) {
                        rVar4 = h4.r.S;
                    } else {
                        rVar4 = rVar2;
                    }
                    if (i25 != 0) {
                        aVar4 = null;
                    } else {
                        aVar4 = aVar2;
                    }
                    p3.x1 x1Var3 = p3.n.f135158a;
                    int i38 = (i16 & 14) | i26 | (i16 & 112) | (i16 & 896) | (i16 & 7168) | (57344 & i16) | (458752 & i16);
                    int i39 = i16 << 3;
                    o0Var = o0VarE;
                    b(i38 | (29360128 & i39) | (234881024 & i39) | (i39 & 1879048192), 0, aVar4, t2Var, qVar4, rVar4, str, str4, str7, bVar3, o0Var, true);
                    aVar3 = aVar4;
                    qVar3 = qVar4;
                    rVar3 = rVar4;
                    str6 = str7;
                    bVar2 = bVar3;
                } else {
                    o0Var = o0VarE;
                    o0Var.e();
                    bVar2 = bVar;
                    str6 = str5;
                    qVar3 = qVar2;
                    aVar3 = aVar2;
                    rVar3 = rVar2;
                }
                p2VarI0 = o0Var.i0();
                if (p2VarI0 != null) {
                    p2VarI0.f135219d = new v0(this, t2Var, str, str2, bVar2, str6, qVar3, rVar3, aVar3, i14, i15);
                }
            }
            i16 |= 1572864;
            rVar2 = rVar;
            i25 = i15 & 64;
            if (i25 != 0) {
                i16 |= 12582912;
                i26 = 1572864;
                aVar2 = aVar;
            } else {
                i26 = 1572864;
                aVar2 = aVar;
                if ((i14 & 12582912) == 0) {
                    if (o0VarE.B(aVar2)) {
                        i27 = 8388608;
                    } else {
                        i27 = 4194304;
                    }
                    i16 |= i27;
                }
            }
            if ((i14 & 100663296) == 0) {
                if (o0VarE.r(this)) {
                    i28 = 67108864;
                } else {
                    i28 = 33554432;
                }
                i16 |= i28;
            }
            if ((i16 & 38347923) != 38347922) {
                z14 = true;
            } else {
                z14 = false;
            }
            if (o0VarE.n(i16 & 1, z14)) {
                if (i29 != 0) {
                    bVar3 = null;
                } else {
                    bVar3 = bVar;
                }
                if (i30 != 0) {
                    str7 = null;
                } else {
                    str7 = str5;
                }
                if (i17 != 0) {
                    qVar4 = null;
                } else {
                    qVar4 = qVar2;
                }
                if (i19 != 0) {
                    rVar4 = h4.r.S;
                } else {
                    rVar4 = rVar2;
                }
                if (i25 != 0) {
                    aVar4 = null;
                } else {
                    aVar4 = aVar2;
                }
                p3.x1 x1Var4 = p3.n.f135158a;
                int i310 = (i16 & 14) | i26 | (i16 & 112) | (i16 & 896) | (i16 & 7168) | (57344 & i16) | (458752 & i16);
                int i311 = i16 << 3;
                o0Var = o0VarE;
                b(i310 | (29360128 & i311) | (234881024 & i311) | (i311 & 1879048192), 0, aVar4, t2Var, qVar4, rVar4, str, str4, str7, bVar3, o0Var, true);
                aVar3 = aVar4;
                qVar3 = qVar4;
                rVar3 = rVar4;
                str6 = str7;
                bVar2 = bVar3;
            } else {
                o0Var = o0VarE;
                o0Var.e();
                bVar2 = bVar;
                str6 = str5;
                qVar3 = qVar2;
                aVar3 = aVar2;
                rVar3 = rVar2;
            }
            p2VarI0 = o0Var.i0();
            if (p2VarI0 != null) {
                p2VarI0.f135219d = new v0(this, t2Var, str, str2, bVar2, str6, qVar3, rVar3, aVar3, i14, i15);
            }
        }
        i16 |= 24576;
        str5 = str3;
        i17 = i15 & 16;
        if (i17 != 0) {
            if ((196608 & i14) == 0) {
                qVar2 = qVar;
                if (o0VarE.r(qVar2)) {
                    i18 = 131072;
                } else {
                    i18 = 65536;
                }
                i16 |= i18;
            }
            i19 = i15 & 32;
            if (i19 != 0) {
                if ((i14 & 1572864) == 0) {
                    rVar2 = rVar;
                    if (o0VarE.B(rVar2)) {
                        i24 = ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES;
                    } else {
                        i24 = 524288;
                    }
                    i16 |= i24;
                }
                i25 = i15 & 64;
                if (i25 != 0) {
                    i16 |= 12582912;
                    i26 = 1572864;
                    aVar2 = aVar;
                } else {
                    i26 = 1572864;
                    aVar2 = aVar;
                    if ((i14 & 12582912) == 0) {
                        if (o0VarE.B(aVar2)) {
                            i27 = 8388608;
                        } else {
                            i27 = 4194304;
                        }
                        i16 |= i27;
                    }
                }
                if ((i14 & 100663296) == 0) {
                    if (o0VarE.r(this)) {
                        i28 = 67108864;
                    } else {
                        i28 = 33554432;
                    }
                    i16 |= i28;
                }
                if ((i16 & 38347923) != 38347922) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                if (o0VarE.n(i16 & 1, z14)) {
                    if (i29 != 0) {
                        bVar3 = null;
                    } else {
                        bVar3 = bVar;
                    }
                    if (i30 != 0) {
                        str7 = null;
                    } else {
                        str7 = str5;
                    }
                    if (i17 != 0) {
                        qVar4 = null;
                    } else {
                        qVar4 = qVar2;
                    }
                    if (i19 != 0) {
                        rVar4 = h4.r.S;
                    } else {
                        rVar4 = rVar2;
                    }
                    if (i25 != 0) {
                        aVar4 = null;
                    } else {
                        aVar4 = aVar2;
                    }
                    p3.x1 x1Var5 = p3.n.f135158a;
                    int i312 = (i16 & 14) | i26 | (i16 & 112) | (i16 & 896) | (i16 & 7168) | (57344 & i16) | (458752 & i16);
                    int i313 = i16 << 3;
                    o0Var = o0VarE;
                    b(i312 | (29360128 & i313) | (234881024 & i313) | (i313 & 1879048192), 0, aVar4, t2Var, qVar4, rVar4, str, str4, str7, bVar3, o0Var, true);
                    aVar3 = aVar4;
                    qVar3 = qVar4;
                    rVar3 = rVar4;
                    str6 = str7;
                    bVar2 = bVar3;
                } else {
                    o0Var = o0VarE;
                    o0Var.e();
                    bVar2 = bVar;
                    str6 = str5;
                    qVar3 = qVar2;
                    aVar3 = aVar2;
                    rVar3 = rVar2;
                }
                p2VarI0 = o0Var.i0();
                if (p2VarI0 != null) {
                    p2VarI0.f135219d = new v0(this, t2Var, str, str2, bVar2, str6, qVar3, rVar3, aVar3, i14, i15);
                }
            }
            i16 |= 1572864;
            rVar2 = rVar;
            i25 = i15 & 64;
            if (i25 != 0) {
                i16 |= 12582912;
                i26 = 1572864;
                aVar2 = aVar;
            } else {
                i26 = 1572864;
                aVar2 = aVar;
                if ((i14 & 12582912) == 0) {
                    if (o0VarE.B(aVar2)) {
                        i27 = 8388608;
                    } else {
                        i27 = 4194304;
                    }
                    i16 |= i27;
                }
            }
            if ((i14 & 100663296) == 0) {
                if (o0VarE.r(this)) {
                    i28 = 67108864;
                } else {
                    i28 = 33554432;
                }
                i16 |= i28;
            }
            if ((i16 & 38347923) != 38347922) {
                z14 = true;
            } else {
                z14 = false;
            }
            if (o0VarE.n(i16 & 1, z14)) {
                if (i29 != 0) {
                    bVar3 = null;
                } else {
                    bVar3 = bVar;
                }
                if (i30 != 0) {
                    str7 = null;
                } else {
                    str7 = str5;
                }
                if (i17 != 0) {
                    qVar4 = null;
                } else {
                    qVar4 = qVar2;
                }
                if (i19 != 0) {
                    rVar4 = h4.r.S;
                } else {
                    rVar4 = rVar2;
                }
                if (i25 != 0) {
                    aVar4 = null;
                } else {
                    aVar4 = aVar2;
                }
                p3.x1 x1Var6 = p3.n.f135158a;
                int i314 = (i16 & 14) | i26 | (i16 & 112) | (i16 & 896) | (i16 & 7168) | (57344 & i16) | (458752 & i16);
                int i315 = i16 << 3;
                o0Var = o0VarE;
                b(i314 | (29360128 & i315) | (234881024 & i315) | (i315 & 1879048192), 0, aVar4, t2Var, qVar4, rVar4, str, str4, str7, bVar3, o0Var, true);
                aVar3 = aVar4;
                qVar3 = qVar4;
                rVar3 = rVar4;
                str6 = str7;
                bVar2 = bVar3;
            } else {
                o0Var = o0VarE;
                o0Var.e();
                bVar2 = bVar;
                str6 = str5;
                qVar3 = qVar2;
                aVar3 = aVar2;
                rVar3 = rVar2;
            }
            p2VarI0 = o0Var.i0();
            if (p2VarI0 != null) {
                p2VarI0.f135219d = new v0(this, t2Var, str, str2, bVar2, str6, qVar3, rVar3, aVar3, i14, i15);
            }
        }
        i16 |= 196608;
        qVar2 = qVar;
        i19 = i15 & 32;
        if (i19 != 0) {
            if ((i14 & 1572864) == 0) {
                rVar2 = rVar;
                if (o0VarE.B(rVar2)) {
                    i24 = ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES;
                } else {
                    i24 = 524288;
                }
                i16 |= i24;
            }
            i25 = i15 & 64;
            if (i25 != 0) {
                i16 |= 12582912;
                i26 = 1572864;
                aVar2 = aVar;
            } else {
                i26 = 1572864;
                aVar2 = aVar;
                if ((i14 & 12582912) == 0) {
                    if (o0VarE.B(aVar2)) {
                        i27 = 8388608;
                    } else {
                        i27 = 4194304;
                    }
                    i16 |= i27;
                }
            }
            if ((i14 & 100663296) == 0) {
                if (o0VarE.r(this)) {
                    i28 = 67108864;
                } else {
                    i28 = 33554432;
                }
                i16 |= i28;
            }
            if ((i16 & 38347923) != 38347922) {
                z14 = true;
            } else {
                z14 = false;
            }
            if (o0VarE.n(i16 & 1, z14)) {
                if (i29 != 0) {
                    bVar3 = null;
                } else {
                    bVar3 = bVar;
                }
                if (i30 != 0) {
                    str7 = null;
                } else {
                    str7 = str5;
                }
                if (i17 != 0) {
                    qVar4 = null;
                } else {
                    qVar4 = qVar2;
                }
                if (i19 != 0) {
                    rVar4 = h4.r.S;
                } else {
                    rVar4 = rVar2;
                }
                if (i25 != 0) {
                    aVar4 = null;
                } else {
                    aVar4 = aVar2;
                }
                p3.x1 x1Var7 = p3.n.f135158a;
                int i316 = (i16 & 14) | i26 | (i16 & 112) | (i16 & 896) | (i16 & 7168) | (57344 & i16) | (458752 & i16);
                int i317 = i16 << 3;
                o0Var = o0VarE;
                b(i316 | (29360128 & i317) | (234881024 & i317) | (i317 & 1879048192), 0, aVar4, t2Var, qVar4, rVar4, str, str4, str7, bVar3, o0Var, true);
                aVar3 = aVar4;
                qVar3 = qVar4;
                rVar3 = rVar4;
                str6 = str7;
                bVar2 = bVar3;
            } else {
                o0Var = o0VarE;
                o0Var.e();
                bVar2 = bVar;
                str6 = str5;
                qVar3 = qVar2;
                aVar3 = aVar2;
                rVar3 = rVar2;
            }
            p2VarI0 = o0Var.i0();
            if (p2VarI0 != null) {
                p2VarI0.f135219d = new v0(this, t2Var, str, str2, bVar2, str6, qVar3, rVar3, aVar3, i14, i15);
            }
        }
        i16 |= 1572864;
        rVar2 = rVar;
        i25 = i15 & 64;
        if (i25 != 0) {
            i16 |= 12582912;
            i26 = 1572864;
            aVar2 = aVar;
        } else {
            i26 = 1572864;
            aVar2 = aVar;
            if ((i14 & 12582912) == 0) {
                if (o0VarE.B(aVar2)) {
                    i27 = 8388608;
                } else {
                    i27 = 4194304;
                }
                i16 |= i27;
            }
        }
        if ((i14 & 100663296) == 0) {
            if (o0VarE.r(this)) {
                i28 = 67108864;
            } else {
                i28 = 33554432;
            }
            i16 |= i28;
        }
        if ((i16 & 38347923) != 38347922) {
            z14 = true;
        } else {
            z14 = false;
        }
        if (o0VarE.n(i16 & 1, z14)) {
            if (i29 != 0) {
                bVar3 = null;
            } else {
                bVar3 = bVar;
            }
            if (i30 != 0) {
                str7 = null;
            } else {
                str7 = str5;
            }
            if (i17 != 0) {
                qVar4 = null;
            } else {
                qVar4 = qVar2;
            }
            if (i19 != 0) {
                rVar4 = h4.r.S;
            } else {
                rVar4 = rVar2;
            }
            if (i25 != 0) {
                aVar4 = null;
            } else {
                aVar4 = aVar2;
            }
            p3.x1 x1Var8 = p3.n.f135158a;
            int i318 = (i16 & 14) | i26 | (i16 & 112) | (i16 & 896) | (i16 & 7168) | (57344 & i16) | (458752 & i16);
            int i319 = i16 << 3;
            o0Var = o0VarE;
            b(i318 | (29360128 & i319) | (234881024 & i319) | (i319 & 1879048192), 0, aVar4, t2Var, qVar4, rVar4, str, str4, str7, bVar3, o0Var, true);
            aVar3 = aVar4;
            qVar3 = qVar4;
            rVar3 = rVar4;
            str6 = str7;
            bVar2 = bVar3;
        } else {
            o0Var = o0VarE;
            o0Var.e();
            bVar2 = bVar;
            str6 = str5;
            qVar3 = qVar2;
            aVar3 = aVar2;
            rVar3 = rVar2;
        }
        p2VarI0 = o0Var.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new v0(this, t2Var, str, str2, bVar2, str6, qVar3, rVar3, aVar3, i14, i15);
        }
    }

    /* JADX WARN: Code duplicated, block: B:100:0x011b  */
    /* JADX WARN: Code duplicated, block: B:102:0x011f  */
    /* JADX WARN: Code duplicated, block: B:103:0x0121  */
    /* JADX WARN: Code duplicated, block: B:105:0x0124  */
    /* JADX WARN: Code duplicated, block: B:107:0x0129  */
    /* JADX WARN: Code duplicated, block: B:108:0x012b  */
    /* JADX WARN: Code duplicated, block: B:111:0x0133  */
    /* JADX WARN: Code duplicated, block: B:114:0x013e  */
    /* JADX WARN: Code duplicated, block: B:116:0x0145  */
    /* JADX WARN: Code duplicated, block: B:119:0x0157  */
    /* JADX WARN: Code duplicated, block: B:122:0x01ac  */
    /* JADX WARN: Code duplicated, block: B:125:0x01bb  */
    /* JADX WARN: Code duplicated, block: B:127:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:57:0x009d  */
    /* JADX WARN: Code duplicated, block: B:59:0x00a5  */
    /* JADX WARN: Code duplicated, block: B:60:0x00a8  */
    /* JADX WARN: Code duplicated, block: B:62:0x00ac  */
    /* JADX WARN: Code duplicated, block: B:65:0x00b4  */
    /* JADX WARN: Code duplicated, block: B:67:0x00b8  */
    /* JADX WARN: Code duplicated, block: B:69:0x00bb  */
    /* JADX WARN: Code duplicated, block: B:71:0x00c3  */
    /* JADX WARN: Code duplicated, block: B:72:0x00c6  */
    /* JADX WARN: Code duplicated, block: B:76:0x00cf  */
    /* JADX WARN: Code duplicated, block: B:77:0x00d4  */
    /* JADX WARN: Code duplicated, block: B:79:0x00da  */
    /* JADX WARN: Code duplicated, block: B:81:0x00e0  */
    /* JADX WARN: Code duplicated, block: B:82:0x00e3  */
    /* JADX WARN: Code duplicated, block: B:86:0x00f1  */
    /* JADX WARN: Code duplicated, block: B:88:0x00f7  */
    /* JADX WARN: Code duplicated, block: B:89:0x00fa  */
    /* JADX WARN: Code duplicated, block: B:93:0x010a  */
    /* JADX WARN: Code duplicated, block: B:94:0x010c  */
    /* JADX WARN: Code duplicated, block: B:97:0x0115  */
    /* JADX WARN: Code duplicated, block: B:99:0x0118  */
    /* JADX WARN: Instruction removed from duplicated block: B:97:0x0115, please report this as an issue */
    public final void b(int i14, int i15, b92.a aVar, c2.t2 t2Var, e23.q qVar, @SuppressLint({"ModifierParameter"}) h4.r rVar, String str, String str2, String str3, b bVar, p3.m mVar, boolean z14) {
        int i16;
        e23.q qVar2;
        boolean z15;
        int i17;
        h4.r rVar2;
        int i18;
        int i19;
        int i24;
        int i25;
        boolean z16;
        b92.a aVar2;
        b bVar2;
        e23.q qVar3;
        h4.r rVar3;
        p3.p2 p2VarI0;
        b bVar3;
        e23.q qVar4;
        b92.a aVar3;
        String string;
        StringBuilder sb3;
        int i26;
        int i27;
        t2Var.getClass();
        str.getClass();
        p3.o0 o0VarE = mVar.E(-2076630885);
        if ((i14 & 6) == 0) {
            i16 = (o0VarE.B(t2Var) ? 4 : 2) | i14;
        } else {
            i16 = i14;
        }
        if ((i14 & 48) == 0) {
            i16 |= o0VarE.B(str) ? 32 : 16;
        }
        if ((i14 & 384) == 0) {
            i16 |= o0VarE.B(str2) ? 256 : 128;
        }
        int i28 = i15 & 4;
        if (i28 != 0) {
            i16 |= 3072;
        } else if ((i14 & 3072) == 0) {
            i16 |= (i14 & 4096) == 0 ? o0VarE.B(bVar) : o0VarE.r(bVar) ? 2048 : 1024;
        }
        if ((i14 & 24576) == 0) {
            i16 |= o0VarE.B(str3) ? 16384 : 8192;
        }
        int i29 = i15 & 16;
        if (i29 == 0) {
            if ((196608 & i14) == 0) {
                qVar2 = qVar;
                i16 |= o0VarE.r(qVar2) ? 131072 : 65536;
            }
            if ((1572864 & i14) == 0) {
                z15 = z14;
                if (o0VarE.h(z15)) {
                    i27 = ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES;
                } else {
                    i27 = 524288;
                }
                i16 |= i27;
            } else {
                z15 = z14;
            }
            i17 = i15 & 64;
            if (i17 != 0) {
                if ((12582912 & i14) == 0) {
                    rVar2 = rVar;
                    if (o0VarE.B(rVar2)) {
                        i18 = 8388608;
                    } else {
                        i18 = 4194304;
                    }
                    i16 |= i18;
                }
                i19 = i15 & 128;
                if (i19 != 0) {
                    i16 |= 100663296;
                } else if ((i14 & 100663296) == 0) {
                    if (o0VarE.B(aVar)) {
                        i24 = 67108864;
                    } else {
                        i24 = 33554432;
                    }
                    i16 |= i24;
                }
                if ((i14 & C.ENCODING_PCM_32BIT) == 0) {
                    if (o0VarE.r(this)) {
                        i26 = 536870912;
                    } else {
                        i26 = 268435456;
                    }
                    i16 |= i26;
                }
                i25 = i16;
                if ((i16 & 306783379) != 306783378) {
                    z16 = true;
                } else {
                    z16 = false;
                }
                if (o0VarE.n(i25 & 1, z16)) {
                    if (i28 != 0) {
                        bVar3 = null;
                    } else {
                        bVar3 = bVar;
                    }
                    if (i29 != 0) {
                        qVar4 = null;
                    } else {
                        qVar4 = qVar2;
                    }
                    if (i17 != 0) {
                        rVar2 = h4.r.S;
                    }
                    if (i19 != 0) {
                        aVar3 = null;
                    } else {
                        aVar3 = aVar;
                    }
                    p3.x1 x1Var = p3.n.f135158a;
                    string = aVar3 != null ? aVar3.f16961a.get("merge") : null;
                    if (string == null) {
                        sb3 = new StringBuilder();
                        if (str2 != null) {
                            sb3.append(str2);
                            sb3.append(", ");
                        }
                        sb3.append(str);
                        sb3.append(StringUtils.SPACE);
                        if (str3 != null) {
                            sb3.append(str3);
                        }
                        string = sb3.toString();
                    }
                    b92.a.C0235a c0235a = new b92.a.C0235a(aVar3);
                    c0235a.f16962a.put("merge", string);
                    int i30 = i25 >> 6;
                    h4.r rVar4 = rVar2;
                    b bVar4 = bVar3;
                    d(t2Var, z3.f.c(-2027197313, new h21.m(z15, qVar4, str3, str, 7), o0VarE), str2, bVar4, z14, rVar4, c0235a.b(), o0VarE, (i25 & 14) | 48 | (i25 & 896) | (i25 & 7168) | (57344 & i30) | (458752 & i30) | (i30 & 29360128));
                    bVar2 = bVar4;
                    rVar3 = rVar4;
                    aVar2 = aVar3;
                    qVar3 = qVar4;
                } else {
                    o0VarE.e();
                    aVar2 = aVar;
                    bVar2 = bVar;
                    qVar3 = qVar2;
                    rVar3 = rVar2;
                }
                p2VarI0 = o0VarE.i0();
                if (p2VarI0 != null) {
                    p2VarI0.f135219d = new w0(this, t2Var, str, str2, bVar2, str3, qVar3, z14, rVar3, aVar2, i14, i15);
                }
            }
            i16 |= 12582912;
            rVar2 = rVar;
            i19 = i15 & 128;
            if (i19 != 0) {
                i16 |= 100663296;
            } else if ((i14 & 100663296) == 0) {
                if (o0VarE.B(aVar)) {
                    i24 = 67108864;
                } else {
                    i24 = 33554432;
                }
                i16 |= i24;
            }
            if ((i14 & C.ENCODING_PCM_32BIT) == 0) {
                if (o0VarE.r(this)) {
                    i26 = 536870912;
                } else {
                    i26 = 268435456;
                }
                i16 |= i26;
            }
            i25 = i16;
            if ((i16 & 306783379) != 306783378) {
                z16 = true;
            } else {
                z16 = false;
            }
            if (o0VarE.n(i25 & 1, z16)) {
                if (i28 != 0) {
                    bVar3 = null;
                } else {
                    bVar3 = bVar;
                }
                if (i29 != 0) {
                    qVar4 = null;
                } else {
                    qVar4 = qVar2;
                }
                if (i17 != 0) {
                    rVar2 = h4.r.S;
                }
                if (i19 != 0) {
                    aVar3 = null;
                } else {
                    aVar3 = aVar;
                }
                p3.x1 x1Var2 = p3.n.f135158a;
                if (aVar3 != null) {
                }
                if (string == null) {
                    sb3 = new StringBuilder();
                    if (str2 != null) {
                        sb3.append(str2);
                        sb3.append(", ");
                    }
                    sb3.append(str);
                    sb3.append(StringUtils.SPACE);
                    if (str3 != null) {
                        sb3.append(str3);
                    }
                    string = sb3.toString();
                }
                b92.a.C0235a c0235a2 = new b92.a.C0235a(aVar3);
                c0235a2.f16962a.put("merge", string);
                int i34 = i25 >> 6;
                h4.r rVar5 = rVar2;
                b bVar5 = bVar3;
                d(t2Var, z3.f.c(-2027197313, new h21.m(z15, qVar4, str3, str, 7), o0VarE), str2, bVar5, z14, rVar5, c0235a2.b(), o0VarE, (i25 & 14) | 48 | (i25 & 896) | (i25 & 7168) | (57344 & i34) | (458752 & i34) | (i34 & 29360128));
                bVar2 = bVar5;
                rVar3 = rVar5;
                aVar2 = aVar3;
                qVar3 = qVar4;
            } else {
                o0VarE.e();
                aVar2 = aVar;
                bVar2 = bVar;
                qVar3 = qVar2;
                rVar3 = rVar2;
            }
            p2VarI0 = o0VarE.i0();
            if (p2VarI0 != null) {
                p2VarI0.f135219d = new w0(this, t2Var, str, str2, bVar2, str3, qVar3, z14, rVar3, aVar2, i14, i15);
            }
        }
        i16 |= 196608;
        qVar2 = qVar;
        if ((1572864 & i14) == 0) {
            z15 = z14;
            if (o0VarE.h(z15)) {
                i27 = ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES;
            } else {
                i27 = 524288;
            }
            i16 |= i27;
        } else {
            z15 = z14;
        }
        i17 = i15 & 64;
        if (i17 != 0) {
            if ((12582912 & i14) == 0) {
                rVar2 = rVar;
                if (o0VarE.B(rVar2)) {
                    i18 = 8388608;
                } else {
                    i18 = 4194304;
                }
                i16 |= i18;
            }
            i19 = i15 & 128;
            if (i19 != 0) {
                i16 |= 100663296;
            } else if ((i14 & 100663296) == 0) {
                if (o0VarE.B(aVar)) {
                    i24 = 67108864;
                } else {
                    i24 = 33554432;
                }
                i16 |= i24;
            }
            if ((i14 & C.ENCODING_PCM_32BIT) == 0) {
                if (o0VarE.r(this)) {
                    i26 = 536870912;
                } else {
                    i26 = 268435456;
                }
                i16 |= i26;
            }
            i25 = i16;
            if ((i16 & 306783379) != 306783378) {
                z16 = true;
            } else {
                z16 = false;
            }
            if (o0VarE.n(i25 & 1, z16)) {
                if (i28 != 0) {
                    bVar3 = null;
                } else {
                    bVar3 = bVar;
                }
                if (i29 != 0) {
                    qVar4 = null;
                } else {
                    qVar4 = qVar2;
                }
                if (i17 != 0) {
                    rVar2 = h4.r.S;
                }
                if (i19 != 0) {
                    aVar3 = null;
                } else {
                    aVar3 = aVar;
                }
                p3.x1 x1Var3 = p3.n.f135158a;
                if (aVar3 != null) {
                }
                if (string == null) {
                    sb3 = new StringBuilder();
                    if (str2 != null) {
                        sb3.append(str2);
                        sb3.append(", ");
                    }
                    sb3.append(str);
                    sb3.append(StringUtils.SPACE);
                    if (str3 != null) {
                        sb3.append(str3);
                    }
                    string = sb3.toString();
                }
                b92.a.C0235a c0235a3 = new b92.a.C0235a(aVar3);
                c0235a3.f16962a.put("merge", string);
                int i35 = i25 >> 6;
                h4.r rVar6 = rVar2;
                b bVar6 = bVar3;
                d(t2Var, z3.f.c(-2027197313, new h21.m(z15, qVar4, str3, str, 7), o0VarE), str2, bVar6, z14, rVar6, c0235a3.b(), o0VarE, (i25 & 14) | 48 | (i25 & 896) | (i25 & 7168) | (57344 & i35) | (458752 & i35) | (i35 & 29360128));
                bVar2 = bVar6;
                rVar3 = rVar6;
                aVar2 = aVar3;
                qVar3 = qVar4;
            } else {
                o0VarE.e();
                aVar2 = aVar;
                bVar2 = bVar;
                qVar3 = qVar2;
                rVar3 = rVar2;
            }
            p2VarI0 = o0VarE.i0();
            if (p2VarI0 != null) {
                p2VarI0.f135219d = new w0(this, t2Var, str, str2, bVar2, str3, qVar3, z14, rVar3, aVar2, i14, i15);
            }
        }
        i16 |= 12582912;
        rVar2 = rVar;
        i19 = i15 & 128;
        if (i19 != 0) {
            i16 |= 100663296;
        } else if ((i14 & 100663296) == 0) {
            if (o0VarE.B(aVar)) {
                i24 = 67108864;
            } else {
                i24 = 33554432;
            }
            i16 |= i24;
        }
        if ((i14 & C.ENCODING_PCM_32BIT) == 0) {
            if (o0VarE.r(this)) {
                i26 = 536870912;
            } else {
                i26 = 268435456;
            }
            i16 |= i26;
        }
        i25 = i16;
        if ((i16 & 306783379) != 306783378) {
            z16 = true;
        } else {
            z16 = false;
        }
        if (o0VarE.n(i25 & 1, z16)) {
            if (i28 != 0) {
                bVar3 = null;
            } else {
                bVar3 = bVar;
            }
            if (i29 != 0) {
                qVar4 = null;
            } else {
                qVar4 = qVar2;
            }
            if (i17 != 0) {
                rVar2 = h4.r.S;
            }
            if (i19 != 0) {
                aVar3 = null;
            } else {
                aVar3 = aVar;
            }
            p3.x1 x1Var4 = p3.n.f135158a;
            if (aVar3 != null) {
            }
            if (string == null) {
                sb3 = new StringBuilder();
                if (str2 != null) {
                    sb3.append(str2);
                    sb3.append(", ");
                }
                sb3.append(str);
                sb3.append(StringUtils.SPACE);
                if (str3 != null) {
                    sb3.append(str3);
                }
                string = sb3.toString();
            }
            b92.a.C0235a c0235a4 = new b92.a.C0235a(aVar3);
            c0235a4.f16962a.put("merge", string);
            int i36 = i25 >> 6;
            h4.r rVar7 = rVar2;
            b bVar7 = bVar3;
            d(t2Var, z3.f.c(-2027197313, new h21.m(z15, qVar4, str3, str, 7), o0VarE), str2, bVar7, z14, rVar7, c0235a4.b(), o0VarE, (i25 & 14) | 48 | (i25 & 896) | (i25 & 7168) | (57344 & i36) | (458752 & i36) | (i36 & 29360128));
            bVar2 = bVar7;
            rVar3 = rVar7;
            aVar2 = aVar3;
            qVar3 = qVar4;
        } else {
            o0VarE.e();
            aVar2 = aVar;
            bVar2 = bVar;
            qVar3 = qVar2;
            rVar3 = rVar2;
        }
        p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new w0(this, t2Var, str, str2, bVar2, str3, qVar3, z14, rVar3, aVar2, i14, i15);
        }
    }

    /* JADX WARN: Code duplicated, block: B:50:0x0090  */
    /* JADX WARN: Code duplicated, block: B:52:0x0096  */
    /* JADX WARN: Code duplicated, block: B:53:0x0099  */
    /* JADX WARN: Code duplicated, block: B:57:0x00a5  */
    /* JADX WARN: Code duplicated, block: B:58:0x00a7  */
    /* JADX WARN: Code duplicated, block: B:61:0x00b0  */
    /* JADX WARN: Code duplicated, block: B:63:0x00b3  */
    /* JADX WARN: Code duplicated, block: B:64:0x00b5  */
    /* JADX WARN: Code duplicated, block: B:67:0x00ba  */
    /* JADX WARN: Code duplicated, block: B:68:0x00bd  */
    /* JADX WARN: Code duplicated, block: B:70:0x00e8  */
    /* JADX WARN: Code duplicated, block: B:73:0x00f7  */
    /* JADX WARN: Code duplicated, block: B:75:? A[RETURN, SYNTHETIC] */
    public final void c(c2.t2 t2Var, e23.q<? super c2.t2, ? super p3.m, ? super Integer, Unit> qVar, String str, b bVar, @SuppressLint({"ModifierParameter"}) h4.r rVar, b92.a aVar, p3.m mVar, int i14, int i15) {
        int i16;
        b92.a aVar2;
        boolean z14;
        p3.o0 o0Var;
        h4.r rVar2;
        b bVar2;
        b92.a aVar3;
        p3.p2 p2VarI0;
        b bVar3;
        b92.a aVar4;
        int i17;
        t2Var.getClass();
        qVar.getClass();
        p3.o0 o0VarE = mVar.E(-1328170959);
        if ((i14 & 6) == 0) {
            i16 = (o0VarE.B(t2Var) ? 4 : 2) | i14;
        } else {
            i16 = i14;
        }
        if ((i14 & 48) == 0) {
            i16 |= o0VarE.r(qVar) ? 32 : 16;
        }
        if ((i14 & 384) == 0) {
            i16 |= o0VarE.B(str) ? 256 : 128;
        }
        int i18 = i15 & 4;
        if (i18 != 0) {
            i16 |= 3072;
        } else if ((i14 & 3072) == 0) {
            i16 |= (i14 & 4096) == 0 ? o0VarE.B(bVar) : o0VarE.r(bVar) ? 2048 : 1024;
        }
        int i19 = i16 | 24576;
        int i24 = i15 & 16;
        if (i24 == 0) {
            if ((196608 & i14) == 0) {
                aVar2 = aVar;
                i19 |= o0VarE.B(aVar2) ? 131072 : 65536;
            }
            if ((1572864 & i14) == 0) {
                if (o0VarE.r(this)) {
                    i17 = ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES;
                } else {
                    i17 = 524288;
                }
                i19 |= i17;
            }
            if ((599187 & i19) != 599186) {
                z14 = true;
            } else {
                z14 = false;
            }
            if (o0VarE.n(i19 & 1, z14)) {
                if (i18 != 0) {
                    bVar3 = null;
                } else {
                    bVar3 = bVar;
                }
                h4.r.a aVar5 = h4.r.S;
                if (i24 != 0) {
                    aVar4 = null;
                } else {
                    aVar4 = aVar2;
                }
                p3.x1 x1Var = p3.n.f135158a;
                int i25 = i19 << 3;
                o0Var = o0VarE;
                d(t2Var, qVar, str, bVar3, true, aVar5, aVar4, o0Var, (i19 & 14) | 24576 | (i19 & 112) | (i19 & 896) | (i19 & 7168) | (458752 & i25) | (3670016 & i25) | (i25 & 29360128));
                bVar2 = bVar3;
                rVar2 = aVar5;
                aVar3 = aVar4;
            } else {
                o0Var = o0VarE;
                o0Var.e();
                rVar2 = rVar;
                bVar2 = bVar;
                aVar3 = aVar2;
            }
            p2VarI0 = o0Var.i0();
            if (p2VarI0 != null) {
                p2VarI0.f135219d = new b82.w0(this, t2Var, qVar, str, bVar2, rVar2, aVar3, i14, i15);
            }
        }
        i19 = 221184 | i16;
        aVar2 = aVar;
        if ((1572864 & i14) == 0) {
            if (o0VarE.r(this)) {
                i17 = ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES;
            } else {
                i17 = 524288;
            }
            i19 |= i17;
        }
        if ((599187 & i19) != 599186) {
            z14 = true;
        } else {
            z14 = false;
        }
        if (o0VarE.n(i19 & 1, z14)) {
            if (i18 != 0) {
                bVar3 = null;
            } else {
                bVar3 = bVar;
            }
            h4.r.a aVar6 = h4.r.S;
            if (i24 != 0) {
                aVar4 = null;
            } else {
                aVar4 = aVar2;
            }
            p3.x1 x1Var2 = p3.n.f135158a;
            int i26 = i19 << 3;
            o0Var = o0VarE;
            d(t2Var, qVar, str, bVar3, true, aVar6, aVar4, o0Var, (i19 & 14) | 24576 | (i19 & 112) | (i19 & 896) | (i19 & 7168) | (458752 & i26) | (3670016 & i26) | (i26 & 29360128));
            bVar2 = bVar3;
            rVar2 = aVar6;
            aVar3 = aVar4;
        } else {
            o0Var = o0VarE;
            o0Var.e();
            rVar2 = rVar;
            bVar2 = bVar;
            aVar3 = aVar2;
        }
        p2VarI0 = o0Var.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new b82.w0(this, t2Var, qVar, str, bVar2, rVar2, aVar3, i14, i15);
        }
    }

    /* JADX WARN: Code duplicated, block: B:74:0x00e8  */
    public final void d(c2.t2 t2Var, e23.q qVar, String str, b bVar, boolean z14, @SuppressLint({"ModifierParameter"}) h4.r rVar, b92.a aVar, p3.m mVar, int i14) {
        int i15;
        p3.o0 o0Var;
        String str2;
        String str3;
        boolean z15;
        t2Var.getClass();
        qVar.getClass();
        p3.o0 o0VarE = mVar.E(1255749773);
        p3.c<?> cVar = o0VarE.f135177b;
        int i16 = 2;
        if ((i14 & 6) == 0) {
            i15 = (o0VarE.B(t2Var) ? 4 : 2) | i14;
        } else {
            i15 = i14;
        }
        if ((i14 & 48) == 0) {
            i15 |= o0VarE.r(qVar) ? 32 : 16;
        }
        if ((i14 & 384) == 0) {
            i15 |= o0VarE.B(str) ? 256 : 128;
        }
        if ((i14 & 3072) == 0) {
            i15 |= (i14 & 4096) == 0 ? o0VarE.B(bVar) : o0VarE.r(bVar) ? 2048 : 1024;
        }
        if ((i14 & 24576) == 0) {
            i15 |= o0VarE.h(z14) ? 16384 : 8192;
        }
        if ((196608 & i14) == 0) {
            i15 |= o0VarE.B(rVar) ? 131072 : 65536;
        }
        if ((1572864 & i14) == 0) {
            i15 |= o0VarE.B(aVar) ? ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES : 524288;
        }
        int i17 = i15;
        if (o0VarE.n(i17 & 1, (i17 & 599187) != 599186)) {
            p3.x1 x1Var = p3.n.f135158a;
            if (aVar == null || (str2 = aVar.f16961a.get("merge")) == null) {
                str2 = "";
            }
            boolean zB = ((i17 & 57344) == 16384) | o0VarE.B(str2);
            Object objQ = o0VarE.q();
            if (zB) {
                objQ = new g02.w(str2, z14, i16);
                o0VarE.K(objQ);
            } else {
                p3.m.f135153a.getClass();
                if (objQ == p3.m.a.f135155b) {
                    objQ = new g02.w(str2, z14, i16);
                    o0VarE.K(objQ);
                }
            }
            h4.r rVarB = p5.v.b(rVar, (e23.l) objQ);
            h4.r.a aVar2 = h4.r.S;
            h4.r rVarThen = rVarB.then(t2Var.a(aVar2, 0.5f, true));
            c2.j.f22691a.getClass();
            c2.j.k kVar = c2.j.f22694d;
            h4.d.f81522a.getClass();
            c2.z zVarA = c2.y.a(kVar, h4.d.a.f81536n, o0VarE, 0);
            int iHashCode = Long.hashCode(o0VarE.U);
            p3.i2 i2VarA0 = o0VarE.a0();
            h4.r rVarC = h4.k.c(rVarThen, o0VarE);
            h5.g.V.getClass();
            h5.e0.a aVar3 = h5.g.a.f81805b;
            if (cVar == null) {
                p3.p0.l();
                throw null;
            }
            o0VarE.z();
            if (o0VarE.T) {
                o0VarE.M(aVar3);
            } else {
                o0VarE.c();
            }
            h5.g.a.e eVar = h5.g.a.f81810g;
            b4.c(eVar, zVarA, o0VarE);
            h5.g.a.C1623g c1623g = h5.g.a.f81809f;
            b4.c(c1623g, i2VarA0, o0VarE);
            h5.g.a.b bVar2 = h5.g.a.f81813j;
            if (o0VarE.T || !p005kotlin.jvm.internal.s.g(o0VarE.q(), Integer.valueOf(iHashCode))) {
                v.h.A(iHashCode, o0VarE, iHashCode, bVar2);
            }
            h5.g.a.f fVar = h5.g.a.f81807d;
            b4.c(fVar, rVarC, o0VarE);
            c2.b0 b0Var = c2.b0.f22601a;
            d92.b.f58623a.getClass();
            v5.a(0.0f, 0, 3, d92.b.a(o0VarE).j().c(), null, o0VarE);
            g6.f.a aVar4 = g6.f.f75994b;
            h4.r rVarC2 = c2.l.C(aVar2, 0.0f, 4, 0.0f, 0.0f, 13);
            c2.j.C0343j c0343j = c2.j.f22692b;
            c2.s2 s2VarA = c2.q2.a(c0343j, h4.d.a.f81533k, o0VarE, 0);
            int iHashCode2 = Long.hashCode(o0VarE.U);
            p3.i2 i2VarA1 = o0VarE.a0();
            h4.r rVarC3 = h4.k.c(rVarC2, o0VarE);
            if (cVar == null) {
                p3.p0.l();
                throw null;
            }
            o0VarE.z();
            if (o0VarE.T) {
                o0VarE.M(aVar3);
            } else {
                o0VarE.c();
            }
            b4.c(eVar, s2VarA, o0VarE);
            b4.c(c1623g, i2VarA1, o0VarE);
            if (o0VarE.T || !p005kotlin.jvm.internal.s.g(o0VarE.q(), Integer.valueOf(iHashCode2))) {
                v.h.A(iHashCode2, o0VarE, iHashCode2, bVar2);
            }
            b4.c(fVar, rVarC3, o0VarE);
            qVar.invoke(c2.u2.f22900a, o0VarE, Integer.valueOf((i17 & 112) | 6));
            o0VarE.g0(true);
            if (bVar == null) {
                o0VarE.C(224893112);
                str3 = str != null ? str : "";
                d92.b.f58624b.getClass();
                mh.c(str3, null, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.f(j92.f.f97933j, o0VarE), o0VarE, 0, 0, 131070);
                o0Var = o0VarE;
                o0Var.g0(false);
                z15 = true;
            } else {
                o0VarE.C(225011656);
                c2.s2 s2VarA2 = c2.q2.a(c0343j, h4.d.a.f81534l, o0VarE, 48);
                int iHashCode3 = Long.hashCode(o0VarE.U);
                p3.i2 i2VarA2 = o0VarE.a0();
                h4.r rVarC4 = h4.k.c(aVar2, o0VarE);
                if (cVar == null) {
                    p3.p0.l();
                    throw null;
                }
                o0VarE.z();
                if (o0VarE.T) {
                    o0VarE.M(aVar3);
                } else {
                    o0VarE.c();
                }
                b4.c(eVar, s2VarA2, o0VarE);
                b4.c(c1623g, i2VarA2, o0VarE);
                if (o0VarE.T || !p005kotlin.jvm.internal.s.g(o0VarE.q(), Integer.valueOf(iHashCode3))) {
                    v.h.A(iHashCode3, o0VarE, iHashCode3, bVar2);
                }
                b4.c(fVar, rVarC4, o0VarE);
                bVar.a(o0VarE, (i17 >> 9) & 14);
                str3 = str != null ? str : "";
                d92.b.f58624b.getClass();
                s5.x0 x0VarF = d92.c.f(j92.f.f97933j, o0VarE);
                d92.b.f58625c.getClass();
                mh.c(str3, c2.l.C(aVar2, j92.b.f97899b.f97918c, 0.0f, 0.0f, 0.0f, 14), 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, x0VarF, o0VarE, 0, 0, 131068);
                o0Var = o0VarE;
                z15 = true;
                o0Var.g0(true);
                o0Var.g0(false);
            }
            o0Var.g0(z15);
        } else {
            o0Var = o0VarE;
            o0Var.e();
        }
        p3.p2 p2VarI0 = o0Var.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new e52.d(this, t2Var, qVar, str, bVar, z14, rVar, aVar, i14);
        }
    }

    public final void e(h4.r rVar, e23.q<? super c2.t2, ? super p3.m, ? super Integer, Unit> qVar, p3.m mVar, int i14, int i15) {
        int i16;
        qVar.getClass();
        p3.o0 o0VarE = mVar.E(-1956105306);
        int i17 = i15 & 1;
        if (i17 != 0) {
            i16 = i14 | 6;
        } else if ((i14 & 6) == 0) {
            i16 = (o0VarE.B(rVar) ? 4 : 2) | i14;
        } else {
            i16 = i14;
        }
        if ((i14 & 48) == 0) {
            i16 |= o0VarE.r(qVar) ? 32 : 16;
        }
        if (o0VarE.n(i16 & 1, (i16 & 19) != 18)) {
            if (i17 != 0) {
                rVar = h4.r.S;
            }
            p3.x1 x1Var = p3.n.f135158a;
            h4.r rVarThen = rVar.then(c2.x2.f(h4.r.S, 1.0f));
            c2.j jVar = c2.j.f22691a;
            g6.f.a aVar = g6.f.f75994b;
            jVar.getClass();
            c2.j.i iVarI = c2.j.i(16);
            h4.d.f81522a.getClass();
            c2.s2 s2VarA = c2.q2.a(iVarI, h4.d.a.f81533k, o0VarE, 6);
            int iHashCode = Long.hashCode(o0VarE.U);
            p3.i2 i2VarA0 = o0VarE.a0();
            h4.r rVarC = h4.k.c(rVarThen, o0VarE);
            h5.g.V.getClass();
            h5.e0.a aVar2 = h5.g.a.f81805b;
            if (o0VarE.f135177b == null) {
                p3.p0.l();
                throw null;
            }
            o0VarE.z();
            if (o0VarE.T) {
                o0VarE.M(aVar2);
            } else {
                o0VarE.c();
            }
            b4.c(h5.g.a.f81810g, s2VarA, o0VarE);
            b4.c(h5.g.a.f81809f, i2VarA0, o0VarE);
            h5.g.a.b bVar = h5.g.a.f81813j;
            if (o0VarE.T || !p005kotlin.jvm.internal.s.g(o0VarE.q(), Integer.valueOf(iHashCode))) {
                v.h.A(iHashCode, o0VarE, iHashCode, bVar);
            }
            b4.c(h5.g.a.f81807d, rVarC, o0VarE);
            qVar.invoke(c2.u2.f22900a, o0VarE, Integer.valueOf((i16 & 112) | 6));
            o0VarE.g0(true);
        } else {
            o0VarE.e();
        }
        h4.r rVar2 = rVar;
        p3.p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new an1.d(this, rVar2, qVar, i14, i15, 18);
        }
    }

    /* JADX WARN: Code duplicated, block: B:100:0x0117  */
    /* JADX WARN: Code duplicated, block: B:101:0x011a  */
    /* JADX WARN: Code duplicated, block: B:103:0x011e  */
    /* JADX WARN: Code duplicated, block: B:104:0x0123  */
    /* JADX WARN: Code duplicated, block: B:106:0x0127  */
    /* JADX WARN: Code duplicated, block: B:107:0x012a  */
    /* JADX WARN: Code duplicated, block: B:109:0x012e  */
    /* JADX WARN: Code duplicated, block: B:110:0x0130  */
    /* JADX WARN: Code duplicated, block: B:112:0x0170  */
    /* JADX WARN: Code duplicated, block: B:115:0x0180  */
    /* JADX WARN: Code duplicated, block: B:117:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:52:0x0090  */
    /* JADX WARN: Code duplicated, block: B:54:0x0094  */
    /* JADX WARN: Code duplicated, block: B:56:0x0098  */
    /* JADX WARN: Code duplicated, block: B:58:0x00a0  */
    /* JADX WARN: Code duplicated, block: B:59:0x00a3  */
    /* JADX WARN: Code duplicated, block: B:63:0x00ac  */
    /* JADX WARN: Code duplicated, block: B:65:0x00b0  */
    /* JADX WARN: Code duplicated, block: B:67:0x00b3  */
    /* JADX WARN: Code duplicated, block: B:69:0x00bb  */
    /* JADX WARN: Code duplicated, block: B:70:0x00be  */
    /* JADX WARN: Code duplicated, block: B:74:0x00c7  */
    /* JADX WARN: Code duplicated, block: B:75:0x00ce  */
    /* JADX WARN: Code duplicated, block: B:77:0x00d6  */
    /* JADX WARN: Code duplicated, block: B:79:0x00dc  */
    /* JADX WARN: Code duplicated, block: B:80:0x00df  */
    /* JADX WARN: Code duplicated, block: B:84:0x00eb  */
    /* JADX WARN: Code duplicated, block: B:86:0x00f1  */
    /* JADX WARN: Code duplicated, block: B:87:0x00f4  */
    /* JADX WARN: Code duplicated, block: B:91:0x0102  */
    /* JADX WARN: Code duplicated, block: B:92:0x0104  */
    /* JADX WARN: Code duplicated, block: B:95:0x010d  */
    /* JADX WARN: Code duplicated, block: B:97:0x0110  */
    /* JADX WARN: Code duplicated, block: B:98:0x0113  */
    public final void f(int i14, int i15, b92.a aVar, c2.t2 t2Var, e23.q qVar, @SuppressLint({"ModifierParameter"}) h4.r rVar, String str, String str2, String str3, b bVar, p3.m mVar) {
        int i16;
        String str4;
        String str5;
        int i17;
        h4.r rVar2;
        int i18;
        int i19;
        e23.q qVar2;
        int i24;
        int i25;
        int i26;
        b92.a aVar2;
        int i27;
        boolean z14;
        p3.o0 o0Var;
        b bVar2;
        String str6;
        h4.r rVar3;
        e23.q qVar3;
        p3.p2 p2VarI0;
        b bVar3;
        String str7;
        h4.r rVar4;
        e23.q qVar4;
        b92.a aVar3;
        int i28;
        t2Var.getClass();
        str.getClass();
        p3.o0 o0VarE = mVar.E(-1101947051);
        if ((i14 & 6) == 0) {
            i16 = (o0VarE.B(t2Var) ? 4 : 2) | i14;
        } else {
            i16 = i14;
        }
        if ((i14 & 48) == 0) {
            i16 |= o0VarE.B(str) ? 32 : 16;
        }
        if ((i14 & 384) == 0) {
            str4 = str2;
            i16 |= o0VarE.B(str4) ? 256 : 128;
        } else {
            str4 = str2;
        }
        int i29 = i15 & 4;
        if (i29 != 0) {
            i16 |= 3072;
        } else if ((i14 & 3072) == 0) {
            i16 |= (i14 & 4096) == 0 ? o0VarE.B(bVar) : o0VarE.r(bVar) ? 2048 : 1024;
        }
        int i30 = i15 & 8;
        if (i30 == 0) {
            if ((i14 & 24576) == 0) {
                str5 = str3;
                i16 |= o0VarE.B(str5) ? 16384 : 8192;
            }
            i17 = i15 & 16;
            if (i17 != 0) {
                if ((i14 & 196608) == 0) {
                    rVar2 = rVar;
                    if (o0VarE.B(rVar2)) {
                        i18 = 131072;
                    } else {
                        i18 = 65536;
                    }
                    i16 |= i18;
                }
                i19 = i15 & 32;
                if (i19 != 0) {
                    if ((1572864 & i14) == 0) {
                        qVar2 = qVar;
                        if (o0VarE.r(qVar2)) {
                            i24 = ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES;
                        } else {
                            i24 = 524288;
                        }
                        i16 |= i24;
                    }
                    i25 = i15 & 64;
                    if (i25 != 0) {
                        i16 |= 12582912;
                        i26 = 196608;
                        aVar2 = aVar;
                    } else {
                        i26 = 196608;
                        aVar2 = aVar;
                        if ((i14 & 12582912) == 0) {
                            if (o0VarE.B(aVar2)) {
                                i27 = 8388608;
                            } else {
                                i27 = 4194304;
                            }
                            i16 |= i27;
                        }
                    }
                    if ((i14 & 100663296) == 0) {
                        if (o0VarE.r(this)) {
                            i28 = 67108864;
                        } else {
                            i28 = 33554432;
                        }
                        i16 |= i28;
                    }
                    if ((i16 & 38347923) != 38347922) {
                        z14 = true;
                    } else {
                        z14 = false;
                    }
                    if (o0VarE.n(i16 & 1, z14)) {
                        if (i29 != 0) {
                            bVar3 = null;
                        } else {
                            bVar3 = bVar;
                        }
                        if (i30 != 0) {
                            str7 = null;
                        } else {
                            str7 = str5;
                        }
                        if (i17 != 0) {
                            rVar4 = h4.r.S;
                        } else {
                            rVar4 = rVar2;
                        }
                        if (i19 != 0) {
                            qVar4 = null;
                        } else {
                            qVar4 = qVar2;
                        }
                        if (i25 != 0) {
                            aVar3 = null;
                        } else {
                            aVar3 = aVar2;
                        }
                        p3.x1 x1Var = p3.n.f135158a;
                        int i34 = (i16 & 14) | i26 | (i16 & 112) | (i16 & 896) | (i16 & 7168) | (57344 & i16);
                        int i35 = i16 << 3;
                        o0Var = o0VarE;
                        g(i34 | (3670016 & i35) | (29360128 & i35) | (234881024 & i35) | (i35 & 1879048192), 0, aVar3, t2Var, qVar4, rVar4, str, str4, str7, bVar3, o0Var, true);
                        aVar2 = aVar3;
                        qVar3 = qVar4;
                        rVar3 = rVar4;
                        str6 = str7;
                        bVar2 = bVar3;
                    } else {
                        o0Var = o0VarE;
                        o0Var.e();
                        bVar2 = bVar;
                        str6 = str5;
                        rVar3 = rVar2;
                        qVar3 = qVar2;
                    }
                    p2VarI0 = o0Var.i0();
                    if (p2VarI0 != null) {
                        p2VarI0.f135219d = new v0(this, t2Var, str, str2, bVar2, str6, rVar3, qVar3, aVar2, i14, i15);
                    }
                }
                i16 |= 1572864;
                qVar2 = qVar;
                i25 = i15 & 64;
                if (i25 != 0) {
                    i16 |= 12582912;
                    i26 = 196608;
                    aVar2 = aVar;
                } else {
                    i26 = 196608;
                    aVar2 = aVar;
                    if ((i14 & 12582912) == 0) {
                        if (o0VarE.B(aVar2)) {
                            i27 = 8388608;
                        } else {
                            i27 = 4194304;
                        }
                        i16 |= i27;
                    }
                }
                if ((i14 & 100663296) == 0) {
                    if (o0VarE.r(this)) {
                        i28 = 67108864;
                    } else {
                        i28 = 33554432;
                    }
                    i16 |= i28;
                }
                if ((i16 & 38347923) != 38347922) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                if (o0VarE.n(i16 & 1, z14)) {
                    if (i29 != 0) {
                        bVar3 = null;
                    } else {
                        bVar3 = bVar;
                    }
                    if (i30 != 0) {
                        str7 = null;
                    } else {
                        str7 = str5;
                    }
                    if (i17 != 0) {
                        rVar4 = h4.r.S;
                    } else {
                        rVar4 = rVar2;
                    }
                    if (i19 != 0) {
                        qVar4 = null;
                    } else {
                        qVar4 = qVar2;
                    }
                    if (i25 != 0) {
                        aVar3 = null;
                    } else {
                        aVar3 = aVar2;
                    }
                    p3.x1 x1Var2 = p3.n.f135158a;
                    int i36 = (i16 & 14) | i26 | (i16 & 112) | (i16 & 896) | (i16 & 7168) | (57344 & i16);
                    int i37 = i16 << 3;
                    o0Var = o0VarE;
                    g(i36 | (3670016 & i37) | (29360128 & i37) | (234881024 & i37) | (i37 & 1879048192), 0, aVar3, t2Var, qVar4, rVar4, str, str4, str7, bVar3, o0Var, true);
                    aVar2 = aVar3;
                    qVar3 = qVar4;
                    rVar3 = rVar4;
                    str6 = str7;
                    bVar2 = bVar3;
                } else {
                    o0Var = o0VarE;
                    o0Var.e();
                    bVar2 = bVar;
                    str6 = str5;
                    rVar3 = rVar2;
                    qVar3 = qVar2;
                }
                p2VarI0 = o0Var.i0();
                if (p2VarI0 != null) {
                    p2VarI0.f135219d = new v0(this, t2Var, str, str2, bVar2, str6, rVar3, qVar3, aVar2, i14, i15);
                }
            }
            i16 |= 196608;
            rVar2 = rVar;
            i19 = i15 & 32;
            if (i19 != 0) {
                if ((1572864 & i14) == 0) {
                    qVar2 = qVar;
                    if (o0VarE.r(qVar2)) {
                        i24 = ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES;
                    } else {
                        i24 = 524288;
                    }
                    i16 |= i24;
                }
                i25 = i15 & 64;
                if (i25 != 0) {
                    i16 |= 12582912;
                    i26 = 196608;
                    aVar2 = aVar;
                } else {
                    i26 = 196608;
                    aVar2 = aVar;
                    if ((i14 & 12582912) == 0) {
                        if (o0VarE.B(aVar2)) {
                            i27 = 8388608;
                        } else {
                            i27 = 4194304;
                        }
                        i16 |= i27;
                    }
                }
                if ((i14 & 100663296) == 0) {
                    if (o0VarE.r(this)) {
                        i28 = 67108864;
                    } else {
                        i28 = 33554432;
                    }
                    i16 |= i28;
                }
                if ((i16 & 38347923) != 38347922) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                if (o0VarE.n(i16 & 1, z14)) {
                    if (i29 != 0) {
                        bVar3 = null;
                    } else {
                        bVar3 = bVar;
                    }
                    if (i30 != 0) {
                        str7 = null;
                    } else {
                        str7 = str5;
                    }
                    if (i17 != 0) {
                        rVar4 = h4.r.S;
                    } else {
                        rVar4 = rVar2;
                    }
                    if (i19 != 0) {
                        qVar4 = null;
                    } else {
                        qVar4 = qVar2;
                    }
                    if (i25 != 0) {
                        aVar3 = null;
                    } else {
                        aVar3 = aVar2;
                    }
                    p3.x1 x1Var3 = p3.n.f135158a;
                    int i38 = (i16 & 14) | i26 | (i16 & 112) | (i16 & 896) | (i16 & 7168) | (57344 & i16);
                    int i39 = i16 << 3;
                    o0Var = o0VarE;
                    g(i38 | (3670016 & i39) | (29360128 & i39) | (234881024 & i39) | (i39 & 1879048192), 0, aVar3, t2Var, qVar4, rVar4, str, str4, str7, bVar3, o0Var, true);
                    aVar2 = aVar3;
                    qVar3 = qVar4;
                    rVar3 = rVar4;
                    str6 = str7;
                    bVar2 = bVar3;
                } else {
                    o0Var = o0VarE;
                    o0Var.e();
                    bVar2 = bVar;
                    str6 = str5;
                    rVar3 = rVar2;
                    qVar3 = qVar2;
                }
                p2VarI0 = o0Var.i0();
                if (p2VarI0 != null) {
                    p2VarI0.f135219d = new v0(this, t2Var, str, str2, bVar2, str6, rVar3, qVar3, aVar2, i14, i15);
                }
            }
            i16 |= 1572864;
            qVar2 = qVar;
            i25 = i15 & 64;
            if (i25 != 0) {
                i16 |= 12582912;
                i26 = 196608;
                aVar2 = aVar;
            } else {
                i26 = 196608;
                aVar2 = aVar;
                if ((i14 & 12582912) == 0) {
                    if (o0VarE.B(aVar2)) {
                        i27 = 8388608;
                    } else {
                        i27 = 4194304;
                    }
                    i16 |= i27;
                }
            }
            if ((i14 & 100663296) == 0) {
                if (o0VarE.r(this)) {
                    i28 = 67108864;
                } else {
                    i28 = 33554432;
                }
                i16 |= i28;
            }
            if ((i16 & 38347923) != 38347922) {
                z14 = true;
            } else {
                z14 = false;
            }
            if (o0VarE.n(i16 & 1, z14)) {
                if (i29 != 0) {
                    bVar3 = null;
                } else {
                    bVar3 = bVar;
                }
                if (i30 != 0) {
                    str7 = null;
                } else {
                    str7 = str5;
                }
                if (i17 != 0) {
                    rVar4 = h4.r.S;
                } else {
                    rVar4 = rVar2;
                }
                if (i19 != 0) {
                    qVar4 = null;
                } else {
                    qVar4 = qVar2;
                }
                if (i25 != 0) {
                    aVar3 = null;
                } else {
                    aVar3 = aVar2;
                }
                p3.x1 x1Var4 = p3.n.f135158a;
                int i310 = (i16 & 14) | i26 | (i16 & 112) | (i16 & 896) | (i16 & 7168) | (57344 & i16);
                int i311 = i16 << 3;
                o0Var = o0VarE;
                g(i310 | (3670016 & i311) | (29360128 & i311) | (234881024 & i311) | (i311 & 1879048192), 0, aVar3, t2Var, qVar4, rVar4, str, str4, str7, bVar3, o0Var, true);
                aVar2 = aVar3;
                qVar3 = qVar4;
                rVar3 = rVar4;
                str6 = str7;
                bVar2 = bVar3;
            } else {
                o0Var = o0VarE;
                o0Var.e();
                bVar2 = bVar;
                str6 = str5;
                rVar3 = rVar2;
                qVar3 = qVar2;
            }
            p2VarI0 = o0Var.i0();
            if (p2VarI0 != null) {
                p2VarI0.f135219d = new v0(this, t2Var, str, str2, bVar2, str6, rVar3, qVar3, aVar2, i14, i15);
            }
        }
        i16 |= 24576;
        str5 = str3;
        i17 = i15 & 16;
        if (i17 != 0) {
            if ((i14 & 196608) == 0) {
                rVar2 = rVar;
                if (o0VarE.B(rVar2)) {
                    i18 = 131072;
                } else {
                    i18 = 65536;
                }
                i16 |= i18;
            }
            i19 = i15 & 32;
            if (i19 != 0) {
                if ((1572864 & i14) == 0) {
                    qVar2 = qVar;
                    if (o0VarE.r(qVar2)) {
                        i24 = ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES;
                    } else {
                        i24 = 524288;
                    }
                    i16 |= i24;
                }
                i25 = i15 & 64;
                if (i25 != 0) {
                    i16 |= 12582912;
                    i26 = 196608;
                    aVar2 = aVar;
                } else {
                    i26 = 196608;
                    aVar2 = aVar;
                    if ((i14 & 12582912) == 0) {
                        if (o0VarE.B(aVar2)) {
                            i27 = 8388608;
                        } else {
                            i27 = 4194304;
                        }
                        i16 |= i27;
                    }
                }
                if ((i14 & 100663296) == 0) {
                    if (o0VarE.r(this)) {
                        i28 = 67108864;
                    } else {
                        i28 = 33554432;
                    }
                    i16 |= i28;
                }
                if ((i16 & 38347923) != 38347922) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                if (o0VarE.n(i16 & 1, z14)) {
                    if (i29 != 0) {
                        bVar3 = null;
                    } else {
                        bVar3 = bVar;
                    }
                    if (i30 != 0) {
                        str7 = null;
                    } else {
                        str7 = str5;
                    }
                    if (i17 != 0) {
                        rVar4 = h4.r.S;
                    } else {
                        rVar4 = rVar2;
                    }
                    if (i19 != 0) {
                        qVar4 = null;
                    } else {
                        qVar4 = qVar2;
                    }
                    if (i25 != 0) {
                        aVar3 = null;
                    } else {
                        aVar3 = aVar2;
                    }
                    p3.x1 x1Var5 = p3.n.f135158a;
                    int i312 = (i16 & 14) | i26 | (i16 & 112) | (i16 & 896) | (i16 & 7168) | (57344 & i16);
                    int i313 = i16 << 3;
                    o0Var = o0VarE;
                    g(i312 | (3670016 & i313) | (29360128 & i313) | (234881024 & i313) | (i313 & 1879048192), 0, aVar3, t2Var, qVar4, rVar4, str, str4, str7, bVar3, o0Var, true);
                    aVar2 = aVar3;
                    qVar3 = qVar4;
                    rVar3 = rVar4;
                    str6 = str7;
                    bVar2 = bVar3;
                } else {
                    o0Var = o0VarE;
                    o0Var.e();
                    bVar2 = bVar;
                    str6 = str5;
                    rVar3 = rVar2;
                    qVar3 = qVar2;
                }
                p2VarI0 = o0Var.i0();
                if (p2VarI0 != null) {
                    p2VarI0.f135219d = new v0(this, t2Var, str, str2, bVar2, str6, rVar3, qVar3, aVar2, i14, i15);
                }
            }
            i16 |= 1572864;
            qVar2 = qVar;
            i25 = i15 & 64;
            if (i25 != 0) {
                i16 |= 12582912;
                i26 = 196608;
                aVar2 = aVar;
            } else {
                i26 = 196608;
                aVar2 = aVar;
                if ((i14 & 12582912) == 0) {
                    if (o0VarE.B(aVar2)) {
                        i27 = 8388608;
                    } else {
                        i27 = 4194304;
                    }
                    i16 |= i27;
                }
            }
            if ((i14 & 100663296) == 0) {
                if (o0VarE.r(this)) {
                    i28 = 67108864;
                } else {
                    i28 = 33554432;
                }
                i16 |= i28;
            }
            if ((i16 & 38347923) != 38347922) {
                z14 = true;
            } else {
                z14 = false;
            }
            if (o0VarE.n(i16 & 1, z14)) {
                if (i29 != 0) {
                    bVar3 = null;
                } else {
                    bVar3 = bVar;
                }
                if (i30 != 0) {
                    str7 = null;
                } else {
                    str7 = str5;
                }
                if (i17 != 0) {
                    rVar4 = h4.r.S;
                } else {
                    rVar4 = rVar2;
                }
                if (i19 != 0) {
                    qVar4 = null;
                } else {
                    qVar4 = qVar2;
                }
                if (i25 != 0) {
                    aVar3 = null;
                } else {
                    aVar3 = aVar2;
                }
                p3.x1 x1Var6 = p3.n.f135158a;
                int i314 = (i16 & 14) | i26 | (i16 & 112) | (i16 & 896) | (i16 & 7168) | (57344 & i16);
                int i315 = i16 << 3;
                o0Var = o0VarE;
                g(i314 | (3670016 & i315) | (29360128 & i315) | (234881024 & i315) | (i315 & 1879048192), 0, aVar3, t2Var, qVar4, rVar4, str, str4, str7, bVar3, o0Var, true);
                aVar2 = aVar3;
                qVar3 = qVar4;
                rVar3 = rVar4;
                str6 = str7;
                bVar2 = bVar3;
            } else {
                o0Var = o0VarE;
                o0Var.e();
                bVar2 = bVar;
                str6 = str5;
                rVar3 = rVar2;
                qVar3 = qVar2;
            }
            p2VarI0 = o0Var.i0();
            if (p2VarI0 != null) {
                p2VarI0.f135219d = new v0(this, t2Var, str, str2, bVar2, str6, rVar3, qVar3, aVar2, i14, i15);
            }
        }
        i16 |= 196608;
        rVar2 = rVar;
        i19 = i15 & 32;
        if (i19 != 0) {
            if ((1572864 & i14) == 0) {
                qVar2 = qVar;
                if (o0VarE.r(qVar2)) {
                    i24 = ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES;
                } else {
                    i24 = 524288;
                }
                i16 |= i24;
            }
            i25 = i15 & 64;
            if (i25 != 0) {
                i16 |= 12582912;
                i26 = 196608;
                aVar2 = aVar;
            } else {
                i26 = 196608;
                aVar2 = aVar;
                if ((i14 & 12582912) == 0) {
                    if (o0VarE.B(aVar2)) {
                        i27 = 8388608;
                    } else {
                        i27 = 4194304;
                    }
                    i16 |= i27;
                }
            }
            if ((i14 & 100663296) == 0) {
                if (o0VarE.r(this)) {
                    i28 = 67108864;
                } else {
                    i28 = 33554432;
                }
                i16 |= i28;
            }
            if ((i16 & 38347923) != 38347922) {
                z14 = true;
            } else {
                z14 = false;
            }
            if (o0VarE.n(i16 & 1, z14)) {
                if (i29 != 0) {
                    bVar3 = null;
                } else {
                    bVar3 = bVar;
                }
                if (i30 != 0) {
                    str7 = null;
                } else {
                    str7 = str5;
                }
                if (i17 != 0) {
                    rVar4 = h4.r.S;
                } else {
                    rVar4 = rVar2;
                }
                if (i19 != 0) {
                    qVar4 = null;
                } else {
                    qVar4 = qVar2;
                }
                if (i25 != 0) {
                    aVar3 = null;
                } else {
                    aVar3 = aVar2;
                }
                p3.x1 x1Var7 = p3.n.f135158a;
                int i316 = (i16 & 14) | i26 | (i16 & 112) | (i16 & 896) | (i16 & 7168) | (57344 & i16);
                int i317 = i16 << 3;
                o0Var = o0VarE;
                g(i316 | (3670016 & i317) | (29360128 & i317) | (234881024 & i317) | (i317 & 1879048192), 0, aVar3, t2Var, qVar4, rVar4, str, str4, str7, bVar3, o0Var, true);
                aVar2 = aVar3;
                qVar3 = qVar4;
                rVar3 = rVar4;
                str6 = str7;
                bVar2 = bVar3;
            } else {
                o0Var = o0VarE;
                o0Var.e();
                bVar2 = bVar;
                str6 = str5;
                rVar3 = rVar2;
                qVar3 = qVar2;
            }
            p2VarI0 = o0Var.i0();
            if (p2VarI0 != null) {
                p2VarI0.f135219d = new v0(this, t2Var, str, str2, bVar2, str6, rVar3, qVar3, aVar2, i14, i15);
            }
        }
        i16 |= 1572864;
        qVar2 = qVar;
        i25 = i15 & 64;
        if (i25 != 0) {
            i16 |= 12582912;
            i26 = 196608;
            aVar2 = aVar;
        } else {
            i26 = 196608;
            aVar2 = aVar;
            if ((i14 & 12582912) == 0) {
                if (o0VarE.B(aVar2)) {
                    i27 = 8388608;
                } else {
                    i27 = 4194304;
                }
                i16 |= i27;
            }
        }
        if ((i14 & 100663296) == 0) {
            if (o0VarE.r(this)) {
                i28 = 67108864;
            } else {
                i28 = 33554432;
            }
            i16 |= i28;
        }
        if ((i16 & 38347923) != 38347922) {
            z14 = true;
        } else {
            z14 = false;
        }
        if (o0VarE.n(i16 & 1, z14)) {
            if (i29 != 0) {
                bVar3 = null;
            } else {
                bVar3 = bVar;
            }
            if (i30 != 0) {
                str7 = null;
            } else {
                str7 = str5;
            }
            if (i17 != 0) {
                rVar4 = h4.r.S;
            } else {
                rVar4 = rVar2;
            }
            if (i19 != 0) {
                qVar4 = null;
            } else {
                qVar4 = qVar2;
            }
            if (i25 != 0) {
                aVar3 = null;
            } else {
                aVar3 = aVar2;
            }
            p3.x1 x1Var8 = p3.n.f135158a;
            int i318 = (i16 & 14) | i26 | (i16 & 112) | (i16 & 896) | (i16 & 7168) | (57344 & i16);
            int i319 = i16 << 3;
            o0Var = o0VarE;
            g(i318 | (3670016 & i319) | (29360128 & i319) | (234881024 & i319) | (i319 & 1879048192), 0, aVar3, t2Var, qVar4, rVar4, str, str4, str7, bVar3, o0Var, true);
            aVar2 = aVar3;
            qVar3 = qVar4;
            rVar3 = rVar4;
            str6 = str7;
            bVar2 = bVar3;
        } else {
            o0Var = o0VarE;
            o0Var.e();
            bVar2 = bVar;
            str6 = str5;
            rVar3 = rVar2;
            qVar3 = qVar2;
        }
        p2VarI0 = o0Var.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new v0(this, t2Var, str, str2, bVar2, str6, rVar3, qVar3, aVar2, i14, i15);
        }
    }

    /* JADX WARN: Code duplicated, block: B:100:0x011b  */
    /* JADX WARN: Code duplicated, block: B:103:0x0121  */
    /* JADX WARN: Code duplicated, block: B:104:0x012c  */
    /* JADX WARN: Code duplicated, block: B:107:0x0130  */
    /* JADX WARN: Code duplicated, block: B:109:0x0137  */
    /* JADX WARN: Code duplicated, block: B:112:0x0149  */
    /* JADX WARN: Code duplicated, block: B:116:0x015c  */
    /* JADX WARN: Code duplicated, block: B:117:0x015e  */
    /* JADX WARN: Code duplicated, block: B:120:0x0166  */
    /* JADX WARN: Code duplicated, block: B:122:0x016f  */
    /* JADX WARN: Code duplicated, block: B:125:0x01b7  */
    /* JADX WARN: Code duplicated, block: B:127:0x01be  */
    /* JADX WARN: Code duplicated, block: B:128:0x01c2  */
    /* JADX WARN: Code duplicated, block: B:131:0x01d7  */
    /* JADX WARN: Code duplicated, block: B:133:0x01e5  */
    /* JADX WARN: Code duplicated, block: B:136:0x020a  */
    /* JADX WARN: Code duplicated, block: B:138:0x0213  */
    /* JADX WARN: Code duplicated, block: B:139:0x0217  */
    /* JADX WARN: Code duplicated, block: B:142:0x0224  */
    /* JADX WARN: Code duplicated, block: B:144:0x0232  */
    /* JADX WARN: Code duplicated, block: B:147:0x023c  */
    /* JADX WARN: Code duplicated, block: B:148:0x025b  */
    /* JADX WARN: Code duplicated, block: B:151:0x0286  */
    /* JADX WARN: Code duplicated, block: B:153:0x02a0  */
    /* JADX WARN: Code duplicated, block: B:158:0x02c7  */
    /* JADX WARN: Code duplicated, block: B:167:0x0330  */
    /* JADX WARN: Code duplicated, block: B:169:0x033b  */
    /* JADX WARN: Code duplicated, block: B:172:0x0356  */
    /* JADX WARN: Code duplicated, block: B:175:0x035f  */
    /* JADX WARN: Code duplicated, block: B:177:0x03a4  */
    /* JADX WARN: Code duplicated, block: B:179:0x03c2  */
    /* JADX WARN: Code duplicated, block: B:181:0x03cb  */
    /* JADX WARN: Code duplicated, block: B:182:0x03cf  */
    /* JADX WARN: Code duplicated, block: B:185:0x03dc  */
    /* JADX WARN: Code duplicated, block: B:187:0x03ea  */
    /* JADX WARN: Code duplicated, block: B:191:0x03fc  */
    /* JADX WARN: Code duplicated, block: B:194:0x0460  */
    /* JADX WARN: Code duplicated, block: B:199:0x046b  */
    /* JADX WARN: Code duplicated, block: B:201:0x0471  */
    /* JADX WARN: Code duplicated, block: B:203:0x0477  */
    /* JADX WARN: Code duplicated, block: B:206:0x0487  */
    /* JADX WARN: Code duplicated, block: B:212:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:64:0x00b3  */
    /* JADX WARN: Code duplicated, block: B:65:0x00b8  */
    /* JADX WARN: Code duplicated, block: B:67:0x00be  */
    /* JADX WARN: Code duplicated, block: B:69:0x00c4  */
    /* JADX WARN: Code duplicated, block: B:70:0x00c7  */
    /* JADX WARN: Code duplicated, block: B:74:0x00d1  */
    /* JADX WARN: Code duplicated, block: B:76:0x00d8  */
    /* JADX WARN: Code duplicated, block: B:78:0x00dc  */
    /* JADX WARN: Code duplicated, block: B:80:0x00e6  */
    /* JADX WARN: Code duplicated, block: B:81:0x00e9  */
    /* JADX WARN: Code duplicated, block: B:85:0x00fb  */
    /* JADX WARN: Code duplicated, block: B:86:0x00fd  */
    /* JADX WARN: Code duplicated, block: B:89:0x0106 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:90:0x0108  */
    /* JADX WARN: Code duplicated, block: B:91:0x010a  */
    /* JADX WARN: Code duplicated, block: B:93:0x010e  */
    /* JADX WARN: Code duplicated, block: B:94:0x0111  */
    /* JADX WARN: Code duplicated, block: B:96:0x0114  */
    /* JADX WARN: Code duplicated, block: B:97:0x0116  */
    /* JADX WARN: Code duplicated, block: B:99:0x0119  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v29, types: [p3.o0] */
    /* JADX WARN: Type inference failed for: r0v32, types: [p3.o0] */
    /* JADX WARN: Type inference failed for: r0v37 */
    /* JADX WARN: Type inference failed for: r0v45 */
    /* JADX WARN: Type inference failed for: r0v46 */
    /* JADX WARN: Type inference failed for: r0v47 */
    /* JADX WARN: Type inference failed for: r0v7, types: [p3.o0] */
    /* JADX WARN: Type inference failed for: r0v8, types: [p3.o0] */
    /* JADX WARN: Type inference failed for: r11v14 */
    /* JADX WARN: Type inference failed for: r11v5 */
    /* JADX WARN: Type inference failed for: r11v6, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, p3.m, p3.o0] */
    /* JADX WARN: Type inference failed for: r1v5, types: [l72.x0$b] */
    /* JADX WARN: Type inference failed for: r1v7 */
    /* JADX WARN: Type inference failed for: r1v8 */
    /* JADX WARN: Type inference failed for: r1v9 */
    /* JADX WARN: Type inference failed for: r5v14 */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r5v5, types: [l72.x0$b] */
    public final void g(int i14, int i15, b92.a aVar, c2.t2 t2Var, e23.q qVar, @SuppressLint({"ModifierParameter"}) h4.r rVar, String str, String str2, String str3, b bVar, p3.m mVar, boolean z14) {
        int i16;
        h4.r rVar2;
        int i17;
        e23.q qVar2;
        int i18;
        int i19;
        int i24;
        boolean z15;
        b92.a aVar2;
        ?? r14;
        e23.q qVar3;
        h4.r rVar3;
        ?? r15;
        p3.p2 p2VarI0;
        b bVar2;
        h4.r rVar4;
        e23.q qVar4;
        b92.a aVar3;
        String string;
        boolean z16;
        boolean z17;
        Object objQ;
        h4.r.a aVar4;
        c2.z zVarA;
        int i25;
        int iHashCode;
        p3.i2 i2VarA0;
        h4.r rVarC;
        h5.e0.a aVar5;
        h5.g.a.e eVar;
        h5.g.a.C1623g c1623g;
        h5.g.a.b bVar3;
        h4.r rVar5;
        h5.g.a.f fVar;
        c2.j.C0343j c0343j;
        c2.s2 s2VarA;
        int iHashCode2;
        p3.i2 i2VarA1;
        b92.a aVar6;
        h4.r rVarC2;
        b bVar4;
        c2.u2 u2Var;
        ?? r16;
        s5.x0 x0VarF;
        s5.c.b bVarH;
        s5.x0 x0VarF2;
        int iJ;
        c2.s2 s2VarA2;
        int iHashCode3;
        p3.i2 i2VarA2;
        h4.r rVarC3;
        String str4;
        boolean z18;
        ?? r17;
        ?? r18;
        int iJ2;
        StringBuilder sb3;
        t2Var.getClass();
        str.getClass();
        ?? E = mVar.E(-1294076495);
        p3.c<?> cVar = E.f135177b;
        if ((i14 & 6) == 0) {
            i16 = (E.B(t2Var) ? 4 : 2) | i14;
        } else {
            i16 = i14;
        }
        if ((i14 & 48) == 0) {
            i16 |= E.B(str) ? 32 : 16;
        }
        if ((i14 & 384) == 0) {
            i16 |= E.B(str2) ? 256 : 128;
        }
        int i26 = i15 & 4;
        if (i26 != 0) {
            i16 |= 3072;
        } else if ((i14 & 3072) == 0) {
            i16 |= (i14 & 4096) == 0 ? E.B(bVar) : E.r(bVar) ? 2048 : 1024;
        }
        if ((i14 & 24576) == 0) {
            i16 |= E.B(str3) ? 16384 : 8192;
        }
        if ((196608 & i14) == 0) {
            i16 |= E.h(z14) ? 131072 : 65536;
        }
        int i27 = i15 & 32;
        if (i27 == 0) {
            if ((1572864 & i14) == 0) {
                rVar2 = rVar;
                i16 |= E.B(rVar2) ? ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES : 524288;
            }
            i17 = i15 & 64;
            if (i17 != 0) {
                i16 |= 12582912;
                qVar2 = qVar;
            } else {
                qVar2 = qVar;
                if ((i14 & 12582912) == 0) {
                    if (E.r(qVar2)) {
                        i18 = 8388608;
                    } else {
                        i18 = 4194304;
                    }
                    i16 |= i18;
                }
            }
            i19 = i15 & 128;
            if (i19 != 0) {
                if ((i14 & 100663296) == 0) {
                    if (E.B(aVar)) {
                        i24 = 67108864;
                    } else {
                        i24 = 33554432;
                    }
                    i16 |= i24;
                }
                if ((i16 & 38347923) != 38347922) {
                    z15 = true;
                } else {
                    z15 = false;
                }
                if (E.n(i16 & 1, z15)) {
                    if (i26 != 0) {
                        bVar2 = null;
                    } else {
                        bVar2 = bVar;
                    }
                    if (i27 != 0) {
                        rVar4 = h4.r.S;
                    } else {
                        rVar4 = rVar2;
                    }
                    if (i17 != 0) {
                        qVar4 = null;
                    } else {
                        qVar4 = qVar2;
                    }
                    if (i19 != 0) {
                        aVar3 = null;
                    } else {
                        aVar3 = aVar;
                    }
                    p3.x1 x1Var = p3.n.f135158a;
                    if (aVar3 != null) {
                        string = aVar3.f16961a.get("merge");
                    } else {
                        string = null;
                    }
                    if (string == null) {
                        sb3 = new StringBuilder();
                        if (str2 != null) {
                            sb3.append(str2);
                            sb3.append(", ");
                        }
                        sb3.append(str);
                        sb3.append(StringUtils.SPACE);
                        if (str3 != null) {
                            sb3.append(str3);
                        }
                        string = sb3.toString();
                    }
                    boolean zB = E.B(string);
                    if ((i16 & 458752) == 131072) {
                        z16 = true;
                    } else {
                        z16 = false;
                    }
                    z17 = z16 | zB;
                    objQ = E.q();
                    if (z17) {
                        objQ = new g02.w(string, z14, 3);
                        E.K(objQ);
                    } else {
                        p3.m.f135153a.getClass();
                        if (objQ == p3.m.a.f135155b) {
                            objQ = new g02.w(string, z14, 3);
                            E.K(objQ);
                        }
                    }
                    h4.r rVarB = p5.v.b(rVar4, (e23.l) objQ);
                    aVar4 = h4.r.S;
                    h4.r rVarThen = rVarB.then(t2Var.a(aVar4, 0.5f, true));
                    c2.j.f22691a.getClass();
                    c2.j.k kVar = c2.j.f22694d;
                    h4.d.f81522a.getClass();
                    zVarA = c2.y.a(kVar, h4.d.a.f81536n, E, 0);
                    i25 = i16;
                    iHashCode = Long.hashCode(E.U);
                    i2VarA0 = E.a0();
                    rVarC = h4.k.c(rVarThen, E);
                    h5.g.V.getClass();
                    aVar5 = h5.g.a.f81805b;
                    if (cVar != null) {
                        p3.p0.l();
                        throw null;
                    }
                    E.z();
                    if (E.T) {
                        E.M(aVar5);
                    } else {
                        E.c();
                    }
                    eVar = h5.g.a.f81810g;
                    b4.c(eVar, zVarA, E);
                    c1623g = h5.g.a.f81809f;
                    b4.c(c1623g, i2VarA0, E);
                    bVar3 = h5.g.a.f81813j;
                    rVar5 = rVar4;
                    if (E.T || !p005kotlin.jvm.internal.s.g(E.q(), Integer.valueOf(iHashCode))) {
                        v.h.A(iHashCode, E, iHashCode, bVar3);
                    }
                    fVar = h5.g.a.f81807d;
                    b4.c(fVar, rVarC, E);
                    c2.b0 b0Var = c2.b0.f22601a;
                    c0343j = c2.j.f22692b;
                    s2VarA = c2.q2.a(c0343j, h4.d.a.f81533k, E, 0);
                    iHashCode2 = Long.hashCode(E.U);
                    i2VarA1 = E.a0();
                    aVar6 = aVar3;
                    rVarC2 = h4.k.c(aVar4, E);
                    if (cVar != null) {
                        p3.p0.l();
                        throw null;
                    }
                    E.z();
                    bVar4 = bVar2;
                    if (E.T) {
                        E.M(aVar5);
                    } else {
                        E.c();
                    }
                    b4.c(eVar, s2VarA, E);
                    b4.c(c1623g, i2VarA1, E);
                    if (E.T || !p005kotlin.jvm.internal.s.g(E.q(), Integer.valueOf(iHashCode2))) {
                        v.h.A(iHashCode2, E, iHashCode2, bVar3);
                    }
                    b4.c(fVar, rVarC2, E);
                    u2Var = c2.u2.f22900a;
                    if (z14) {
                        E.C(621907626);
                        d92.b.f58623a.getClass();
                        d92.b.f58624b.getClass();
                        x0VarF = d92.c.b(d92.c.e(j92.f.f97928e), E);
                        r16 = 0;
                        E.g0(false);
                    } else {
                        r16 = 0;
                        E.C(622041608);
                        d92.b.f58623a.getClass();
                        d92.b.f58624b.getClass();
                        x0VarF = d92.c.f(d92.c.e(j92.f.f97928e), E);
                        E.g0(false);
                    }
                    bVarH = yc.l2.h(E, -257022559, r16, 1, null);
                    if (z14) {
                        E.C(-553104168);
                        d92.b.f58623a.getClass();
                        d92.b.f58624b.getClass();
                        x0VarF2 = d92.c.b(j92.f.f97932i, E);
                    } else {
                        E.C(-553103046);
                        d92.b.f58623a.getClass();
                        d92.b.f58624b.getClass();
                        x0VarF2 = d92.c.f(j92.f.f97932i, E);
                    }
                    E.g0(r16);
                    iJ = bVarH.j(x0VarF.f157322a);
                    try {
                        bVarH.b(str);
                        Unit unit = Unit.INSTANCE;
                        bVarH.f(iJ);
                        if (str3 != null) {
                            p006l2.r1.a(bVarH);
                            iJ2 = bVarH.j(x0VarF2.f157322a);
                            try {
                                bVarH.b(str3);
                                bVarH.f(iJ2);
                            } catch (Throwable th3) {
                                bVarH.f(iJ2);
                                throw th3;
                            }
                        }
                        s5.c cVarK = bVarH.k();
                        E.g0(false);
                        u2Var.getClass();
                        mh.d(cVarK, u2Var.d(aVar4, f5.b.f68892a), 0L, 0L, 0L, null, 0L, 0, false, 0, 0, f111347b, null, x0VarF, E, 0, 0, 196604);
                        if (qVar4 == null) {
                            E.C(622999166);
                        } else {
                            E.C(-256997917);
                            qVar4.invoke(u2Var, E, Integer.valueOf(((i25 >> 18) & 112) | 6));
                        }
                        E.g0(false);
                        E.g0(true);
                        if (bVar4 == null) {
                            E.C(-1682753664);
                            str4 = str2 != null ? str2 : "";
                            d92.b.f58623a.getClass();
                            d92.b.f58624b.getClass();
                            mh.c(str4, null, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.f(j92.f.f97933j, E), E, 0, 0, 131070);
                            E.g0(false);
                            r18 = E;
                            z18 = true;
                            r17 = bVar4;
                        } else {
                            E.C(-1682635120);
                            s2VarA2 = c2.q2.a(c0343j, h4.d.a.f81534l, E, 48);
                            iHashCode3 = Long.hashCode(E.U);
                            i2VarA2 = E.a0();
                            rVarC3 = h4.k.c(aVar4, E);
                            if (cVar != null) {
                                p3.p0.l();
                                throw null;
                            }
                            E.z();
                            if (E.T) {
                                E.M(aVar5);
                            } else {
                                E.c();
                            }
                            b4.c(eVar, s2VarA2, E);
                            b4.c(c1623g, i2VarA2, E);
                            if (E.T || !p005kotlin.jvm.internal.s.g(E.q(), Integer.valueOf(iHashCode3))) {
                                v.h.A(iHashCode3, E, iHashCode3, bVar3);
                            }
                            b4.c(fVar, rVarC3, E);
                            ?? r19 = bVar4;
                            r19.a(E, (i25 >> 9) & 14);
                            str4 = str2 != null ? str2 : "";
                            d92.b.f58623a.getClass();
                            d92.b.f58624b.getClass();
                            s5.x0 x0VarF3 = d92.c.f(j92.f.f97933j, E);
                            d92.b.f58625c.getClass();
                            mh.c(str4, c2.l.C(aVar4, j92.b.f97899b.f97918c, 0.0f, 0.0f, 0.0f, 14), 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, x0VarF3, E, 0, 0, 131068);
                            ?? r24 = E;
                            z18 = true;
                            r24.g0(true);
                            r24.g0(false);
                            r18 = r24;
                            r17 = r19;
                        }
                        r18.g0(z18);
                        rVar3 = rVar5;
                        r14 = r17;
                        qVar3 = qVar4;
                        aVar2 = aVar6;
                        r15 = r18;
                    } catch (Throwable th4) {
                        bVarH.f(iJ);
                        throw th4;
                    }
                } else {
                    ?? r25 = E;
                    r25.e();
                    aVar2 = aVar;
                    r14 = bVar;
                    qVar3 = qVar2;
                    rVar3 = rVar2;
                    r15 = r25;
                }
                p2VarI0 = r15.i0();
                if (p2VarI0 != null) {
                    p2VarI0.f135219d = new w0(this, t2Var, str, str2, (b) r14, str3, z14, rVar3, qVar3, aVar2, i14, i15);
                }
            }
            i16 |= 100663296;
            if ((i16 & 38347923) != 38347922) {
                z15 = true;
            } else {
                z15 = false;
            }
            if (E.n(i16 & 1, z15)) {
                if (i26 != 0) {
                    bVar2 = null;
                } else {
                    bVar2 = bVar;
                }
                if (i27 != 0) {
                    rVar4 = h4.r.S;
                } else {
                    rVar4 = rVar2;
                }
                if (i17 != 0) {
                    qVar4 = null;
                } else {
                    qVar4 = qVar2;
                }
                if (i19 != 0) {
                    aVar3 = null;
                } else {
                    aVar3 = aVar;
                }
                p3.x1 x1Var2 = p3.n.f135158a;
                if (aVar3 != null) {
                    string = aVar3.f16961a.get("merge");
                } else {
                    string = null;
                }
                if (string == null) {
                    sb3 = new StringBuilder();
                    if (str2 != null) {
                        sb3.append(str2);
                        sb3.append(", ");
                    }
                    sb3.append(str);
                    sb3.append(StringUtils.SPACE);
                    if (str3 != null) {
                        sb3.append(str3);
                    }
                    string = sb3.toString();
                }
                boolean zB2 = E.B(string);
                if ((i16 & 458752) == 131072) {
                    z16 = true;
                } else {
                    z16 = false;
                }
                z17 = z16 | zB2;
                objQ = E.q();
                if (z17) {
                    p3.m.f135153a.getClass();
                    if (objQ == p3.m.a.f135155b) {
                        objQ = new g02.w(string, z14, 3);
                        E.K(objQ);
                    }
                } else {
                    objQ = new g02.w(string, z14, 3);
                    E.K(objQ);
                }
                h4.r rVarB2 = p5.v.b(rVar4, (e23.l) objQ);
                aVar4 = h4.r.S;
                h4.r rVarThen2 = rVarB2.then(t2Var.a(aVar4, 0.5f, true));
                c2.j.f22691a.getClass();
                c2.j.k kVar2 = c2.j.f22694d;
                h4.d.f81522a.getClass();
                zVarA = c2.y.a(kVar2, h4.d.a.f81536n, E, 0);
                i25 = i16;
                iHashCode = Long.hashCode(E.U);
                i2VarA0 = E.a0();
                rVarC = h4.k.c(rVarThen2, E);
                h5.g.V.getClass();
                aVar5 = h5.g.a.f81805b;
                if (cVar != null) {
                    p3.p0.l();
                    throw null;
                }
                E.z();
                if (E.T) {
                    E.M(aVar5);
                } else {
                    E.c();
                }
                eVar = h5.g.a.f81810g;
                b4.c(eVar, zVarA, E);
                c1623g = h5.g.a.f81809f;
                b4.c(c1623g, i2VarA0, E);
                bVar3 = h5.g.a.f81813j;
                rVar5 = rVar4;
                if (E.T) {
                    v.h.A(iHashCode, E, iHashCode, bVar3);
                } else {
                    v.h.A(iHashCode, E, iHashCode, bVar3);
                }
                fVar = h5.g.a.f81807d;
                b4.c(fVar, rVarC, E);
                c2.b0 b0Var2 = c2.b0.f22601a;
                c0343j = c2.j.f22692b;
                s2VarA = c2.q2.a(c0343j, h4.d.a.f81533k, E, 0);
                iHashCode2 = Long.hashCode(E.U);
                i2VarA1 = E.a0();
                aVar6 = aVar3;
                rVarC2 = h4.k.c(aVar4, E);
                if (cVar != null) {
                    p3.p0.l();
                    throw null;
                }
                E.z();
                bVar4 = bVar2;
                if (E.T) {
                    E.M(aVar5);
                } else {
                    E.c();
                }
                b4.c(eVar, s2VarA, E);
                b4.c(c1623g, i2VarA1, E);
                if (E.T) {
                    v.h.A(iHashCode2, E, iHashCode2, bVar3);
                } else {
                    v.h.A(iHashCode2, E, iHashCode2, bVar3);
                }
                b4.c(fVar, rVarC2, E);
                u2Var = c2.u2.f22900a;
                if (z14) {
                    E.C(621907626);
                    d92.b.f58623a.getClass();
                    d92.b.f58624b.getClass();
                    x0VarF = d92.c.b(d92.c.e(j92.f.f97928e), E);
                    r16 = 0;
                    E.g0(false);
                } else {
                    r16 = 0;
                    E.C(622041608);
                    d92.b.f58623a.getClass();
                    d92.b.f58624b.getClass();
                    x0VarF = d92.c.f(d92.c.e(j92.f.f97928e), E);
                    E.g0(false);
                }
                bVarH = yc.l2.h(E, -257022559, r16, 1, null);
                if (z14) {
                    E.C(-553104168);
                    d92.b.f58623a.getClass();
                    d92.b.f58624b.getClass();
                    x0VarF2 = d92.c.b(j92.f.f97932i, E);
                } else {
                    E.C(-553103046);
                    d92.b.f58623a.getClass();
                    d92.b.f58624b.getClass();
                    x0VarF2 = d92.c.f(j92.f.f97932i, E);
                }
                E.g0(r16);
                iJ = bVarH.j(x0VarF.f157322a);
                bVarH.b(str);
                Unit unit2 = Unit.INSTANCE;
                bVarH.f(iJ);
                if (str3 != null) {
                    p006l2.r1.a(bVarH);
                    iJ2 = bVarH.j(x0VarF2.f157322a);
                    bVarH.b(str3);
                    bVarH.f(iJ2);
                }
                s5.c cVarK2 = bVarH.k();
                E.g0(false);
                u2Var.getClass();
                mh.d(cVarK2, u2Var.d(aVar4, f5.b.f68892a), 0L, 0L, 0L, null, 0L, 0, false, 0, 0, f111347b, null, x0VarF, E, 0, 0, 196604);
                if (qVar4 == null) {
                    E.C(622999166);
                } else {
                    E.C(-256997917);
                    qVar4.invoke(u2Var, E, Integer.valueOf(((i25 >> 18) & 112) | 6));
                }
                E.g0(false);
                E.g0(true);
                if (bVar4 == null) {
                    E.C(-1682753664);
                    if (str2 != null) {
                    }
                    d92.b.f58623a.getClass();
                    d92.b.f58624b.getClass();
                    mh.c(str4, null, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.f(j92.f.f97933j, E), E, 0, 0, 131070);
                    E.g0(false);
                    r18 = E;
                    z18 = true;
                    r17 = bVar4;
                } else {
                    E.C(-1682635120);
                    s2VarA2 = c2.q2.a(c0343j, h4.d.a.f81534l, E, 48);
                    iHashCode3 = Long.hashCode(E.U);
                    i2VarA2 = E.a0();
                    rVarC3 = h4.k.c(aVar4, E);
                    if (cVar != null) {
                        p3.p0.l();
                        throw null;
                    }
                    E.z();
                    if (E.T) {
                        E.M(aVar5);
                    } else {
                        E.c();
                    }
                    b4.c(eVar, s2VarA2, E);
                    b4.c(c1623g, i2VarA2, E);
                    if (E.T) {
                        v.h.A(iHashCode3, E, iHashCode3, bVar3);
                    } else {
                        v.h.A(iHashCode3, E, iHashCode3, bVar3);
                    }
                    b4.c(fVar, rVarC3, E);
                    ?? r110 = bVar4;
                    r110.a(E, (i25 >> 9) & 14);
                    if (str2 != null) {
                    }
                    d92.b.f58623a.getClass();
                    d92.b.f58624b.getClass();
                    s5.x0 x0VarF4 = d92.c.f(j92.f.f97933j, E);
                    d92.b.f58625c.getClass();
                    mh.c(str4, c2.l.C(aVar4, j92.b.f97899b.f97918c, 0.0f, 0.0f, 0.0f, 14), 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, x0VarF4, E, 0, 0, 131068);
                    ?? r26 = E;
                    z18 = true;
                    r26.g0(true);
                    r26.g0(false);
                    r18 = r26;
                    r17 = r110;
                }
                r18.g0(z18);
                rVar3 = rVar5;
                r14 = r17;
                qVar3 = qVar4;
                aVar2 = aVar6;
                r15 = r18;
            } else {
                ?? r27 = E;
                r27.e();
                aVar2 = aVar;
                r14 = bVar;
                qVar3 = qVar2;
                rVar3 = rVar2;
                r15 = r27;
            }
            p2VarI0 = r15.i0();
            if (p2VarI0 != null) {
                p2VarI0.f135219d = new w0(this, t2Var, str, str2, (b) r14, str3, z14, rVar3, qVar3, aVar2, i14, i15);
            }
        }
        i16 |= 1572864;
        rVar2 = rVar;
        i17 = i15 & 64;
        if (i17 != 0) {
            i16 |= 12582912;
            qVar2 = qVar;
        } else {
            qVar2 = qVar;
            if ((i14 & 12582912) == 0) {
                if (E.r(qVar2)) {
                    i18 = 8388608;
                } else {
                    i18 = 4194304;
                }
                i16 |= i18;
            }
        }
        i19 = i15 & 128;
        if (i19 != 0) {
            if ((i14 & 100663296) == 0) {
                if (E.B(aVar)) {
                    i24 = 67108864;
                } else {
                    i24 = 33554432;
                }
                i16 |= i24;
            }
            if ((i16 & 38347923) != 38347922) {
                z15 = true;
            } else {
                z15 = false;
            }
            if (E.n(i16 & 1, z15)) {
                if (i26 != 0) {
                    bVar2 = null;
                } else {
                    bVar2 = bVar;
                }
                if (i27 != 0) {
                    rVar4 = h4.r.S;
                } else {
                    rVar4 = rVar2;
                }
                if (i17 != 0) {
                    qVar4 = null;
                } else {
                    qVar4 = qVar2;
                }
                if (i19 != 0) {
                    aVar3 = null;
                } else {
                    aVar3 = aVar;
                }
                p3.x1 x1Var3 = p3.n.f135158a;
                if (aVar3 != null) {
                    string = aVar3.f16961a.get("merge");
                } else {
                    string = null;
                }
                if (string == null) {
                    sb3 = new StringBuilder();
                    if (str2 != null) {
                        sb3.append(str2);
                        sb3.append(", ");
                    }
                    sb3.append(str);
                    sb3.append(StringUtils.SPACE);
                    if (str3 != null) {
                        sb3.append(str3);
                    }
                    string = sb3.toString();
                }
                boolean zB3 = E.B(string);
                if ((i16 & 458752) == 131072) {
                    z16 = true;
                } else {
                    z16 = false;
                }
                z17 = z16 | zB3;
                objQ = E.q();
                if (z17) {
                    p3.m.f135153a.getClass();
                    if (objQ == p3.m.a.f135155b) {
                        objQ = new g02.w(string, z14, 3);
                        E.K(objQ);
                    }
                } else {
                    objQ = new g02.w(string, z14, 3);
                    E.K(objQ);
                }
                h4.r rVarB3 = p5.v.b(rVar4, (e23.l) objQ);
                aVar4 = h4.r.S;
                h4.r rVarThen3 = rVarB3.then(t2Var.a(aVar4, 0.5f, true));
                c2.j.f22691a.getClass();
                c2.j.k kVar3 = c2.j.f22694d;
                h4.d.f81522a.getClass();
                zVarA = c2.y.a(kVar3, h4.d.a.f81536n, E, 0);
                i25 = i16;
                iHashCode = Long.hashCode(E.U);
                i2VarA0 = E.a0();
                rVarC = h4.k.c(rVarThen3, E);
                h5.g.V.getClass();
                aVar5 = h5.g.a.f81805b;
                if (cVar != null) {
                    p3.p0.l();
                    throw null;
                }
                E.z();
                if (E.T) {
                    E.M(aVar5);
                } else {
                    E.c();
                }
                eVar = h5.g.a.f81810g;
                b4.c(eVar, zVarA, E);
                c1623g = h5.g.a.f81809f;
                b4.c(c1623g, i2VarA0, E);
                bVar3 = h5.g.a.f81813j;
                rVar5 = rVar4;
                if (E.T) {
                    v.h.A(iHashCode, E, iHashCode, bVar3);
                } else {
                    v.h.A(iHashCode, E, iHashCode, bVar3);
                }
                fVar = h5.g.a.f81807d;
                b4.c(fVar, rVarC, E);
                c2.b0 b0Var3 = c2.b0.f22601a;
                c0343j = c2.j.f22692b;
                s2VarA = c2.q2.a(c0343j, h4.d.a.f81533k, E, 0);
                iHashCode2 = Long.hashCode(E.U);
                i2VarA1 = E.a0();
                aVar6 = aVar3;
                rVarC2 = h4.k.c(aVar4, E);
                if (cVar != null) {
                    p3.p0.l();
                    throw null;
                }
                E.z();
                bVar4 = bVar2;
                if (E.T) {
                    E.M(aVar5);
                } else {
                    E.c();
                }
                b4.c(eVar, s2VarA, E);
                b4.c(c1623g, i2VarA1, E);
                if (E.T) {
                    v.h.A(iHashCode2, E, iHashCode2, bVar3);
                } else {
                    v.h.A(iHashCode2, E, iHashCode2, bVar3);
                }
                b4.c(fVar, rVarC2, E);
                u2Var = c2.u2.f22900a;
                if (z14) {
                    E.C(621907626);
                    d92.b.f58623a.getClass();
                    d92.b.f58624b.getClass();
                    x0VarF = d92.c.b(d92.c.e(j92.f.f97928e), E);
                    r16 = 0;
                    E.g0(false);
                } else {
                    r16 = 0;
                    E.C(622041608);
                    d92.b.f58623a.getClass();
                    d92.b.f58624b.getClass();
                    x0VarF = d92.c.f(d92.c.e(j92.f.f97928e), E);
                    E.g0(false);
                }
                bVarH = yc.l2.h(E, -257022559, r16, 1, null);
                if (z14) {
                    E.C(-553104168);
                    d92.b.f58623a.getClass();
                    d92.b.f58624b.getClass();
                    x0VarF2 = d92.c.b(j92.f.f97932i, E);
                } else {
                    E.C(-553103046);
                    d92.b.f58623a.getClass();
                    d92.b.f58624b.getClass();
                    x0VarF2 = d92.c.f(j92.f.f97932i, E);
                }
                E.g0(r16);
                iJ = bVarH.j(x0VarF.f157322a);
                bVarH.b(str);
                Unit unit3 = Unit.INSTANCE;
                bVarH.f(iJ);
                if (str3 != null) {
                    p006l2.r1.a(bVarH);
                    iJ2 = bVarH.j(x0VarF2.f157322a);
                    bVarH.b(str3);
                    bVarH.f(iJ2);
                }
                s5.c cVarK3 = bVarH.k();
                E.g0(false);
                u2Var.getClass();
                mh.d(cVarK3, u2Var.d(aVar4, f5.b.f68892a), 0L, 0L, 0L, null, 0L, 0, false, 0, 0, f111347b, null, x0VarF, E, 0, 0, 196604);
                if (qVar4 == null) {
                    E.C(622999166);
                } else {
                    E.C(-256997917);
                    qVar4.invoke(u2Var, E, Integer.valueOf(((i25 >> 18) & 112) | 6));
                }
                E.g0(false);
                E.g0(true);
                if (bVar4 == null) {
                    E.C(-1682753664);
                    if (str2 != null) {
                    }
                    d92.b.f58623a.getClass();
                    d92.b.f58624b.getClass();
                    mh.c(str4, null, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.f(j92.f.f97933j, E), E, 0, 0, 131070);
                    E.g0(false);
                    r18 = E;
                    z18 = true;
                    r17 = bVar4;
                } else {
                    E.C(-1682635120);
                    s2VarA2 = c2.q2.a(c0343j, h4.d.a.f81534l, E, 48);
                    iHashCode3 = Long.hashCode(E.U);
                    i2VarA2 = E.a0();
                    rVarC3 = h4.k.c(aVar4, E);
                    if (cVar != null) {
                        p3.p0.l();
                        throw null;
                    }
                    E.z();
                    if (E.T) {
                        E.M(aVar5);
                    } else {
                        E.c();
                    }
                    b4.c(eVar, s2VarA2, E);
                    b4.c(c1623g, i2VarA2, E);
                    if (E.T) {
                        v.h.A(iHashCode3, E, iHashCode3, bVar3);
                    } else {
                        v.h.A(iHashCode3, E, iHashCode3, bVar3);
                    }
                    b4.c(fVar, rVarC3, E);
                    ?? r111 = bVar4;
                    r111.a(E, (i25 >> 9) & 14);
                    if (str2 != null) {
                    }
                    d92.b.f58623a.getClass();
                    d92.b.f58624b.getClass();
                    s5.x0 x0VarF5 = d92.c.f(j92.f.f97933j, E);
                    d92.b.f58625c.getClass();
                    mh.c(str4, c2.l.C(aVar4, j92.b.f97899b.f97918c, 0.0f, 0.0f, 0.0f, 14), 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, x0VarF5, E, 0, 0, 131068);
                    ?? r28 = E;
                    z18 = true;
                    r28.g0(true);
                    r28.g0(false);
                    r18 = r28;
                    r17 = r111;
                }
                r18.g0(z18);
                rVar3 = rVar5;
                r14 = r17;
                qVar3 = qVar4;
                aVar2 = aVar6;
                r15 = r18;
            } else {
                ?? r29 = E;
                r29.e();
                aVar2 = aVar;
                r14 = bVar;
                qVar3 = qVar2;
                rVar3 = rVar2;
                r15 = r29;
            }
            p2VarI0 = r15.i0();
            if (p2VarI0 != null) {
                p2VarI0.f135219d = new w0(this, t2Var, str, str2, (b) r14, str3, z14, rVar3, qVar3, aVar2, i14, i15);
            }
        }
        i16 |= 100663296;
        if ((i16 & 38347923) != 38347922) {
            z15 = true;
        } else {
            z15 = false;
        }
        if (E.n(i16 & 1, z15)) {
            if (i26 != 0) {
                bVar2 = null;
            } else {
                bVar2 = bVar;
            }
            if (i27 != 0) {
                rVar4 = h4.r.S;
            } else {
                rVar4 = rVar2;
            }
            if (i17 != 0) {
                qVar4 = null;
            } else {
                qVar4 = qVar2;
            }
            if (i19 != 0) {
                aVar3 = null;
            } else {
                aVar3 = aVar;
            }
            p3.x1 x1Var4 = p3.n.f135158a;
            if (aVar3 != null) {
                string = aVar3.f16961a.get("merge");
            } else {
                string = null;
            }
            if (string == null) {
                sb3 = new StringBuilder();
                if (str2 != null) {
                    sb3.append(str2);
                    sb3.append(", ");
                }
                sb3.append(str);
                sb3.append(StringUtils.SPACE);
                if (str3 != null) {
                    sb3.append(str3);
                }
                string = sb3.toString();
            }
            boolean zB4 = E.B(string);
            if ((i16 & 458752) == 131072) {
                z16 = true;
            } else {
                z16 = false;
            }
            z17 = z16 | zB4;
            objQ = E.q();
            if (z17) {
                p3.m.f135153a.getClass();
                if (objQ == p3.m.a.f135155b) {
                    objQ = new g02.w(string, z14, 3);
                    E.K(objQ);
                }
            } else {
                objQ = new g02.w(string, z14, 3);
                E.K(objQ);
            }
            h4.r rVarB4 = p5.v.b(rVar4, (e23.l) objQ);
            aVar4 = h4.r.S;
            h4.r rVarThen4 = rVarB4.then(t2Var.a(aVar4, 0.5f, true));
            c2.j.f22691a.getClass();
            c2.j.k kVar4 = c2.j.f22694d;
            h4.d.f81522a.getClass();
            zVarA = c2.y.a(kVar4, h4.d.a.f81536n, E, 0);
            i25 = i16;
            iHashCode = Long.hashCode(E.U);
            i2VarA0 = E.a0();
            rVarC = h4.k.c(rVarThen4, E);
            h5.g.V.getClass();
            aVar5 = h5.g.a.f81805b;
            if (cVar != null) {
                p3.p0.l();
                throw null;
            }
            E.z();
            if (E.T) {
                E.M(aVar5);
            } else {
                E.c();
            }
            eVar = h5.g.a.f81810g;
            b4.c(eVar, zVarA, E);
            c1623g = h5.g.a.f81809f;
            b4.c(c1623g, i2VarA0, E);
            bVar3 = h5.g.a.f81813j;
            rVar5 = rVar4;
            if (E.T) {
                v.h.A(iHashCode, E, iHashCode, bVar3);
            } else {
                v.h.A(iHashCode, E, iHashCode, bVar3);
            }
            fVar = h5.g.a.f81807d;
            b4.c(fVar, rVarC, E);
            c2.b0 b0Var4 = c2.b0.f22601a;
            c0343j = c2.j.f22692b;
            s2VarA = c2.q2.a(c0343j, h4.d.a.f81533k, E, 0);
            iHashCode2 = Long.hashCode(E.U);
            i2VarA1 = E.a0();
            aVar6 = aVar3;
            rVarC2 = h4.k.c(aVar4, E);
            if (cVar != null) {
                p3.p0.l();
                throw null;
            }
            E.z();
            bVar4 = bVar2;
            if (E.T) {
                E.M(aVar5);
            } else {
                E.c();
            }
            b4.c(eVar, s2VarA, E);
            b4.c(c1623g, i2VarA1, E);
            if (E.T) {
                v.h.A(iHashCode2, E, iHashCode2, bVar3);
            } else {
                v.h.A(iHashCode2, E, iHashCode2, bVar3);
            }
            b4.c(fVar, rVarC2, E);
            u2Var = c2.u2.f22900a;
            if (z14) {
                E.C(621907626);
                d92.b.f58623a.getClass();
                d92.b.f58624b.getClass();
                x0VarF = d92.c.b(d92.c.e(j92.f.f97928e), E);
                r16 = 0;
                E.g0(false);
            } else {
                r16 = 0;
                E.C(622041608);
                d92.b.f58623a.getClass();
                d92.b.f58624b.getClass();
                x0VarF = d92.c.f(d92.c.e(j92.f.f97928e), E);
                E.g0(false);
            }
            bVarH = yc.l2.h(E, -257022559, r16, 1, null);
            if (z14) {
                E.C(-553104168);
                d92.b.f58623a.getClass();
                d92.b.f58624b.getClass();
                x0VarF2 = d92.c.b(j92.f.f97932i, E);
            } else {
                E.C(-553103046);
                d92.b.f58623a.getClass();
                d92.b.f58624b.getClass();
                x0VarF2 = d92.c.f(j92.f.f97932i, E);
            }
            E.g0(r16);
            iJ = bVarH.j(x0VarF.f157322a);
            bVarH.b(str);
            Unit unit4 = Unit.INSTANCE;
            bVarH.f(iJ);
            if (str3 != null) {
                p006l2.r1.a(bVarH);
                iJ2 = bVarH.j(x0VarF2.f157322a);
                bVarH.b(str3);
                bVarH.f(iJ2);
            }
            s5.c cVarK4 = bVarH.k();
            E.g0(false);
            u2Var.getClass();
            mh.d(cVarK4, u2Var.d(aVar4, f5.b.f68892a), 0L, 0L, 0L, null, 0L, 0, false, 0, 0, f111347b, null, x0VarF, E, 0, 0, 196604);
            if (qVar4 == null) {
                E.C(622999166);
            } else {
                E.C(-256997917);
                qVar4.invoke(u2Var, E, Integer.valueOf(((i25 >> 18) & 112) | 6));
            }
            E.g0(false);
            E.g0(true);
            if (bVar4 == null) {
                E.C(-1682753664);
                if (str2 != null) {
                }
                d92.b.f58623a.getClass();
                d92.b.f58624b.getClass();
                mh.c(str4, null, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.f(j92.f.f97933j, E), E, 0, 0, 131070);
                E.g0(false);
                r18 = E;
                z18 = true;
                r17 = bVar4;
            } else {
                E.C(-1682635120);
                s2VarA2 = c2.q2.a(c0343j, h4.d.a.f81534l, E, 48);
                iHashCode3 = Long.hashCode(E.U);
                i2VarA2 = E.a0();
                rVarC3 = h4.k.c(aVar4, E);
                if (cVar != null) {
                    p3.p0.l();
                    throw null;
                }
                E.z();
                if (E.T) {
                    E.M(aVar5);
                } else {
                    E.c();
                }
                b4.c(eVar, s2VarA2, E);
                b4.c(c1623g, i2VarA2, E);
                if (E.T) {
                    v.h.A(iHashCode3, E, iHashCode3, bVar3);
                } else {
                    v.h.A(iHashCode3, E, iHashCode3, bVar3);
                }
                b4.c(fVar, rVarC3, E);
                ?? r112 = bVar4;
                r112.a(E, (i25 >> 9) & 14);
                if (str2 != null) {
                }
                d92.b.f58623a.getClass();
                d92.b.f58624b.getClass();
                s5.x0 x0VarF6 = d92.c.f(j92.f.f97933j, E);
                d92.b.f58625c.getClass();
                mh.c(str4, c2.l.C(aVar4, j92.b.f97899b.f97918c, 0.0f, 0.0f, 0.0f, 14), 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, x0VarF6, E, 0, 0, 131068);
                ?? r210 = E;
                z18 = true;
                r210.g0(true);
                r210.g0(false);
                r18 = r210;
                r17 = r112;
            }
            r18.g0(z18);
            rVar3 = rVar5;
            r14 = r17;
            qVar3 = qVar4;
            aVar2 = aVar6;
            r15 = r18;
        } else {
            ?? r211 = E;
            r211.e();
            aVar2 = aVar;
            r14 = bVar;
            qVar3 = qVar2;
            rVar3 = rVar2;
            r15 = r211;
        }
        p2VarI0 = r15.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new w0(this, t2Var, str, str2, (b) r14, str3, z14, rVar3, qVar3, aVar2, i14, i15);
        }
    }

    public final void h(c2.t2 t2Var, p3.m mVar, int i14) {
        int i15;
        t2Var.getClass();
        p3.o0 o0VarE = mVar.E(585949424);
        if ((i14 & 6) == 0) {
            i15 = (o0VarE.B(t2Var) ? 4 : 2) | i14;
        } else {
            i15 = i14;
        }
        if (o0VarE.n(i15 & 1, (i15 & 3) != 2)) {
            p3.x1 x1Var = p3.n.f135158a;
            h4.r rVarA = t2Var.a(h4.r.S, 0.5f, true);
            c2.j.f22691a.getClass();
            c2.j.k kVar = c2.j.f22694d;
            h4.d.f81522a.getClass();
            c2.z zVarA = c2.y.a(kVar, h4.d.a.f81536n, o0VarE, 0);
            int iHashCode = Long.hashCode(o0VarE.U);
            p3.i2 i2VarA0 = o0VarE.a0();
            h4.r rVarC = h4.k.c(rVarA, o0VarE);
            h5.g.V.getClass();
            h5.e0.a aVar = h5.g.a.f81805b;
            if (o0VarE.f135177b == null) {
                p3.p0.l();
                throw null;
            }
            o0VarE.z();
            if (o0VarE.T) {
                o0VarE.M(aVar);
            } else {
                o0VarE.c();
            }
            b4.c(h5.g.a.f81810g, zVarA, o0VarE);
            b4.c(h5.g.a.f81809f, i2VarA0, o0VarE);
            h5.g.a.b bVar = h5.g.a.f81813j;
            if (o0VarE.T || !p005kotlin.jvm.internal.s.g(o0VarE.q(), Integer.valueOf(iHashCode))) {
                v.h.A(iHashCode, o0VarE, iHashCode, bVar);
            }
            b4.c(h5.g.a.f81807d, rVarC, o0VarE);
            c2.b0 b0Var = c2.b0.f22601a;
            o0VarE.g0(true);
        } else {
            o0VarE.e();
        }
        p3.p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new ik1.a(this, t2Var, i14, 21);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Ll72/x0$a;", "Ll72/x0$b;", "Lo4/d0;", TtmlNode.ATTR_TTS_COLOR, "<init>", "(JLkotlin/jvm/internal/j;)V", "components_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a implements b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final long f111349a;

        private a(long j8) {
            this.f111349a = j8;
        }

        @Override // l72.x0.b
        public final void a(p3.m mVar, int i14) {
            int i15;
            p3.o0 o0VarE = mVar.E(173651720);
            if ((i14 & 6) == 0) {
                i15 = (o0VarE.B(this) ? 4 : 2) | i14;
            } else {
                i15 = i14;
            }
            if (o0VarE.n(i15 & 1, (i15 & 3) != 2)) {
                p3.x1 x1Var = p3.n.f135158a;
                g6.f.a aVar = g6.f.f75994b;
                c2.q.a(u1.n.e(l4.k.b(c2.x2.q(h4.r.S, 8), k2.i.f102406a), this.f111349a, o4.m1.f128891a), o0VarE, 0);
            } else {
                o0VarE.e();
            }
            p3.p2 p2VarI0 = o0VarE.i0();
            if (p2VarI0 != null) {
                p2VarI0.f135219d = new hn1.l(this, i14, 29);
            }
        }

        public /* synthetic */ a(long j8, p005kotlin.jvm.internal.j jVar) {
            this(j8);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Ll72/x0$c;", "Ll72/x0$b;", "Lo4/d0;", TtmlNode.ATTR_TTS_COLOR, "<init>", "(JLkotlin/jvm/internal/j;)V", "components_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class c implements b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final long f111350a;

        private c(long j8) {
            this.f111350a = j8;
        }

        @Override // l72.x0.b
        public final void a(p3.m mVar, int i14) {
            int i15;
            p3.o0 o0VarE = mVar.E(-1452379187);
            if ((i14 & 6) == 0) {
                i15 = (o0VarE.B(this) ? 4 : 2) | i14;
            } else {
                i15 = i14;
            }
            int i16 = 0;
            if (o0VarE.n(i15 & 1, (i15 & 3) != 2)) {
                p3.x1 x1Var = p3.n.f135158a;
                g6.f.a aVar = g6.f.f75994b;
                c2.q.a(u1.n.e(c2.x2.q(h4.r.S, 8), this.f111350a, o4.m1.f128891a), o0VarE, 0);
            } else {
                o0VarE.e();
            }
            p3.p2 p2VarI0 = o0VarE.i0();
            if (p2VarI0 != null) {
                p2VarI0.f135219d = new y0(this, i14, i16);
            }
        }

        public /* synthetic */ c(long j8, p005kotlin.jvm.internal.j jVar) {
            this(j8);
        }
    }
}
