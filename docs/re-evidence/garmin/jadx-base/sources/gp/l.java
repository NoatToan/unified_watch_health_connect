package gp;

import android.content.Context;
import android.content.Intent;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import c2.b0;
import c2.q2;
import c2.s2;
import c2.u2;
import c2.x2;
import c2.y;
import c2.z;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.activities.manual.ActivitiesCreateManualActivity;
import g02.h0;
import h5.e0;
import i3.e5;
import i3.mh;
import i3.u;
import java.util.ArrayList;
import lc.u0;
import m92.w;
import o4.d0;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Unit;
import p3.b4;
import p3.i2;
import p3.o0;
import p3.p0;
import p3.p2;
import p3.x1;
import p5.v;
import s5.x0;

/* JADX INFO: loaded from: classes7.dex */
public final class l {

    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f78390a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int[] f78391b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final /* synthetic */ int[] f78392c;

        static {
            int[] iArr = new int[gp.a.values().length];
            try {
                iArr[gp.a.Add.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[gp.a.Dismiss.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[gp.a.None.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f78390a = iArr;
            int[] iArr2 = new int[o70.n.values().length];
            try {
                iArr2[o70.n.VALID_DATA.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[o70.n.EMPTY.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[o70.n.GENESIS.ordinal()] = 3;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr2[o70.n.PROMPT.ordinal()] = 4;
            } catch (NoSuchFieldError unused7) {
            }
            f78391b = iArr2;
            int[] iArr3 = new int[in.e.values().length];
            try {
                iArr3[in.e.CREATE_MANUAL_ACTIVITY.ordinal()] = 1;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr3[in.e.RECORD_ACTIVITY.ordinal()] = 2;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr3[in.e.ACTIVITY_IN_PROGRESS.ordinal()] = 3;
            } catch (NoSuchFieldError unused10) {
            }
            f78392c = iArr3;
        }
    }

    /* JADX WARN: Code duplicated, block: B:107:0x01b2  */
    /* JADX WARN: Code duplicated, block: B:109:0x01b5 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:110:0x01b7  */
    /* JADX WARN: Code duplicated, block: B:111:0x01ba  */
    /* JADX WARN: Code duplicated, block: B:113:0x01be  */
    /* JADX WARN: Code duplicated, block: B:115:0x01c8  */
    /* JADX WARN: Code duplicated, block: B:118:0x01d9  */
    /* JADX WARN: Code duplicated, block: B:120:0x01dc A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:121:0x01de  */
    /* JADX WARN: Code duplicated, block: B:122:0x01eb  */
    /* JADX WARN: Code duplicated, block: B:124:0x01f4  */
    /* JADX WARN: Code duplicated, block: B:126:0x0216  */
    /* JADX WARN: Code duplicated, block: B:129:0x023a  */
    /* JADX WARN: Code duplicated, block: B:132:0x0241  */
    /* JADX WARN: Code duplicated, block: B:136:0x0249  */
    /* JADX WARN: Code duplicated, block: B:139:0x0250  */
    /* JADX WARN: Code duplicated, block: B:141:0x0259  */
    public static final void a(h4.r rVar, final yz1.d dVar, final o70.n nVar, final String str, final String str2, final u4.d dVar2, final d0 d0Var, final String str3, final i53.c cVar, final i53.c cVar2, final String str4, final String str5, final gp.a aVar, final i53.c cVar3, final String str6, final String str7, final String str8, final String str9, final e23.a aVar2, final e23.a aVar3, final e23.a aVar4, final e23.a aVar5, final e23.p pVar, p3.m mVar, final int i14) {
        o0 o0Var;
        final h4.r rVar2;
        int i15;
        int i16;
        int i17;
        String string;
        String str10;
        int i18;
        boolean z14;
        d0 d0VarA;
        d0 d0Var2;
        boolean z15;
        boolean z16;
        Object objQ;
        str.getClass();
        str2.getClass();
        aVar.getClass();
        cVar3.getClass();
        o0 o0VarE = mVar.E(835323991);
        int i19 = i14 | 6 | (o0VarE.B(dVar) ? 32 : 16) | (o0VarE.k(nVar.ordinal()) ? 256 : 128) | (o0VarE.B(str) ? 2048 : 1024) | (o0VarE.B(str2) ? 16384 : 8192) | (o0VarE.B(dVar2) ? 131072 : 65536) | (o0VarE.B(d0Var) ? 1048576 : 524288) | (o0VarE.B(str3) ? 8388608 : 4194304) | (o0VarE.B(cVar) ? 67108864 : 33554432) | (o0VarE.B(cVar2) ? 536870912 : 268435456);
        int i24 = (o0VarE.B(str4) ? 4 : 2) | (o0VarE.B(str5) ? 32 : 16) | (o0VarE.k(aVar.ordinal()) ? 256 : 128) | (o0VarE.B(cVar3) ? 2048 : 1024) | (o0VarE.B(str6) ? 16384 : 8192) | (o0VarE.B(str7) ? 131072 : 65536) | (o0VarE.B(str8) ? 1048576 : 524288) | (o0VarE.B(str9) ? 8388608 : 4194304) | (o0VarE.r(aVar2) ? 67108864 : 33554432) | (o0VarE.r(aVar3) ? 536870912 : 268435456);
        int i25 = 384 | (o0VarE.r(aVar4) ? (char) 4 : (char) 2) | (o0VarE.r(aVar5) ? 32 : 16);
        if (o0VarE.n(i19 & 1, ((i19 & 306783379) == 306783378 && (i24 & 306783379) == 306783378 && (i25 & 147) == 146) ? false : true)) {
            h4.r.a aVar6 = h4.r.S;
            x1 x1Var = p3.n.f135158a;
            Context context = (Context) o0VarE.A(AndroidCompositionLocals_androidKt.f6042b);
            int[] iArr = a.f78390a;
            int i26 = iArr[aVar.ordinal()];
            if (i26 != 1) {
                if (i26 == 2) {
                    i15 = R.drawable.close_circle;
                } else {
                    if (i26 != 3) {
                        u0.r();
                        return;
                    }
                    i16 = 0;
                }
                i17 = iArr[aVar.ordinal()];
                if (i17 != 1) {
                    if (i17 != 2) {
                        string = context.getString(R.string.lbl_dismiss);
                    } else {
                        if (i17 == 3) {
                            u0.r();
                            return;
                        }
                        str10 = null;
                    }
                    i18 = iArr[aVar.ordinal()];
                    if (i18 != 1) {
                        if (i18 != 2) {
                            z14 = false;
                            o0VarE.C(-412468480);
                            d92.b.f58623a.getClass();
                            long jD = d92.b.a(o0VarE).k().d();
                            o0VarE.g0(false);
                            d0VarA = d0.a(jD);
                        } else {
                            if (i18 == 3) {
                                throw kg.f.h(o0VarE, -412473167, false);
                            }
                            o0VarE.C(98429446);
                            z14 = false;
                            o0VarE.g0(false);
                            d0Var2 = null;
                        }
                        if (nVar != o70.n.GENESIS || nVar == o70.n.PROMPT) {
                            z15 = z14;
                        } else {
                            z15 = true;
                        }
                        z16 = (i25 & 14) != 4 ? z14 : true;
                        objQ = o0VarE.q();
                        if (z16) {
                            objQ = new h0(aVar4, 19);
                            o0VarE.K(objQ);
                        } else {
                            p3.m.f135153a.getClass();
                            if (objQ == p3.m.a.f135155b) {
                                objQ = new h0(aVar4, 19);
                                o0VarE.K(objQ);
                            }
                        }
                        int i27 = i19 >> 3;
                        int i28 = i24 >> 6;
                        o0Var = o0VarE;
                        yz1.s.b(aVar6, dVar, str, str2, dVar2, d0Var, 0.0f, i16, d0Var2, 0.0f, str10, (e23.a) objQ, z3.f.c(1552757549, new c42.d(nVar, str8, str3, cVar, cVar2, str4, str5, str7, aVar5), o0VarE), z3.f.c(1419053486, new g52.d(nVar, cVar3, str6, str9, 3), o0VarE), false, z15, aVar2, aVar3, pVar, o0Var, (i19 & 126) | (i27 & 896) | (i27 & 7168) | (57344 & i27) | (i27 & 458752), (i28 & 29360128) | (3670016 & i28) | 3456 | 100663296, 16960);
                        rVar2 = aVar6;
                    } else {
                        z14 = false;
                        o0VarE.C(-412470627);
                        d92.b.f58623a.getClass();
                        long jA = d92.b.a(o0VarE).f().a();
                        o0VarE.g0(false);
                        d0VarA = d0.a(jA);
                    }
                    d0Var2 = d0VarA;
                    if (nVar != o70.n.GENESIS) {
                        z15 = z14;
                    } else {
                        z15 = z14;
                    }
                    if ((i25 & 14) != 4) {
                    }
                    objQ = o0VarE.q();
                    if (z16) {
                        p3.m.f135153a.getClass();
                        if (objQ == p3.m.a.f135155b) {
                            objQ = new h0(aVar4, 19);
                            o0VarE.K(objQ);
                        }
                    } else {
                        objQ = new h0(aVar4, 19);
                        o0VarE.K(objQ);
                    }
                    int i29 = i19 >> 3;
                    int i210 = i24 >> 6;
                    o0Var = o0VarE;
                    yz1.s.b(aVar6, dVar, str, str2, dVar2, d0Var, 0.0f, i16, d0Var2, 0.0f, str10, (e23.a) objQ, z3.f.c(1552757549, new c42.d(nVar, str8, str3, cVar, cVar2, str4, str5, str7, aVar5), o0VarE), z3.f.c(1419053486, new g52.d(nVar, cVar3, str6, str9, 3), o0VarE), false, z15, aVar2, aVar3, pVar, o0Var, (i19 & 126) | (i29 & 896) | (i29 & 7168) | (57344 & i29) | (i29 & 458752), (i210 & 29360128) | (3670016 & i210) | 3456 | 100663296, 16960);
                    rVar2 = aVar6;
                } else {
                    string = context.getString(R.string.lbl_add);
                }
                str10 = string;
                i18 = iArr[aVar.ordinal()];
                if (i18 != 1) {
                    if (i18 != 2) {
                        z14 = false;
                        o0VarE.C(-412468480);
                        d92.b.f58623a.getClass();
                        long jD2 = d92.b.a(o0VarE).k().d();
                        o0VarE.g0(false);
                        d0VarA = d0.a(jD2);
                    } else {
                        if (i18 == 3) {
                            throw kg.f.h(o0VarE, -412473167, false);
                        }
                        o0VarE.C(98429446);
                        z14 = false;
                        o0VarE.g0(false);
                        d0Var2 = null;
                    }
                    if (nVar != o70.n.GENESIS) {
                        z15 = z14;
                    } else {
                        z15 = z14;
                    }
                    if ((i25 & 14) != 4) {
                    }
                    objQ = o0VarE.q();
                    if (z16) {
                        p3.m.f135153a.getClass();
                        if (objQ == p3.m.a.f135155b) {
                            objQ = new h0(aVar4, 19);
                            o0VarE.K(objQ);
                        }
                    } else {
                        objQ = new h0(aVar4, 19);
                        o0VarE.K(objQ);
                    }
                    int i211 = i19 >> 3;
                    int i212 = i24 >> 6;
                    o0Var = o0VarE;
                    yz1.s.b(aVar6, dVar, str, str2, dVar2, d0Var, 0.0f, i16, d0Var2, 0.0f, str10, (e23.a) objQ, z3.f.c(1552757549, new c42.d(nVar, str8, str3, cVar, cVar2, str4, str5, str7, aVar5), o0VarE), z3.f.c(1419053486, new g52.d(nVar, cVar3, str6, str9, 3), o0VarE), false, z15, aVar2, aVar3, pVar, o0Var, (i19 & 126) | (i211 & 896) | (i211 & 7168) | (57344 & i211) | (i211 & 458752), (i212 & 29360128) | (3670016 & i212) | 3456 | 100663296, 16960);
                    rVar2 = aVar6;
                } else {
                    z14 = false;
                    o0VarE.C(-412470627);
                    d92.b.f58623a.getClass();
                    long jA2 = d92.b.a(o0VarE).f().a();
                    o0VarE.g0(false);
                    d0VarA = d0.a(jA2);
                }
                d0Var2 = d0VarA;
                if (nVar != o70.n.GENESIS) {
                    z15 = z14;
                } else {
                    z15 = z14;
                }
                if ((i25 & 14) != 4) {
                }
                objQ = o0VarE.q();
                if (z16) {
                    p3.m.f135153a.getClass();
                    if (objQ == p3.m.a.f135155b) {
                        objQ = new h0(aVar4, 19);
                        o0VarE.K(objQ);
                    }
                } else {
                    objQ = new h0(aVar4, 19);
                    o0VarE.K(objQ);
                }
                int i213 = i19 >> 3;
                int i214 = i24 >> 6;
                o0Var = o0VarE;
                yz1.s.b(aVar6, dVar, str, str2, dVar2, d0Var, 0.0f, i16, d0Var2, 0.0f, str10, (e23.a) objQ, z3.f.c(1552757549, new c42.d(nVar, str8, str3, cVar, cVar2, str4, str5, str7, aVar5), o0VarE), z3.f.c(1419053486, new g52.d(nVar, cVar3, str6, str9, 3), o0VarE), false, z15, aVar2, aVar3, pVar, o0Var, (i19 & 126) | (i213 & 896) | (i213 & 7168) | (57344 & i213) | (i213 & 458752), (i214 & 29360128) | (3670016 & i214) | 3456 | 100663296, 16960);
                rVar2 = aVar6;
            } else {
                i15 = R.drawable.ic_gcm_add_16;
            }
            i16 = i15;
            i17 = iArr[aVar.ordinal()];
            if (i17 != 1) {
                if (i17 != 2) {
                    string = context.getString(R.string.lbl_dismiss);
                } else {
                    if (i17 == 3) {
                        u0.r();
                        return;
                    }
                    str10 = null;
                }
                i18 = iArr[aVar.ordinal()];
                if (i18 != 1) {
                    if (i18 != 2) {
                        z14 = false;
                        o0VarE.C(-412468480);
                        d92.b.f58623a.getClass();
                        long jD3 = d92.b.a(o0VarE).k().d();
                        o0VarE.g0(false);
                        d0VarA = d0.a(jD3);
                    } else {
                        if (i18 == 3) {
                            throw kg.f.h(o0VarE, -412473167, false);
                        }
                        o0VarE.C(98429446);
                        z14 = false;
                        o0VarE.g0(false);
                        d0Var2 = null;
                    }
                    if (nVar != o70.n.GENESIS) {
                        z15 = z14;
                    } else {
                        z15 = z14;
                    }
                    if ((i25 & 14) != 4) {
                    }
                    objQ = o0VarE.q();
                    if (z16) {
                        p3.m.f135153a.getClass();
                        if (objQ == p3.m.a.f135155b) {
                            objQ = new h0(aVar4, 19);
                            o0VarE.K(objQ);
                        }
                    } else {
                        objQ = new h0(aVar4, 19);
                        o0VarE.K(objQ);
                    }
                    int i215 = i19 >> 3;
                    int i216 = i24 >> 6;
                    o0Var = o0VarE;
                    yz1.s.b(aVar6, dVar, str, str2, dVar2, d0Var, 0.0f, i16, d0Var2, 0.0f, str10, (e23.a) objQ, z3.f.c(1552757549, new c42.d(nVar, str8, str3, cVar, cVar2, str4, str5, str7, aVar5), o0VarE), z3.f.c(1419053486, new g52.d(nVar, cVar3, str6, str9, 3), o0VarE), false, z15, aVar2, aVar3, pVar, o0Var, (i19 & 126) | (i215 & 896) | (i215 & 7168) | (57344 & i215) | (i215 & 458752), (i216 & 29360128) | (3670016 & i216) | 3456 | 100663296, 16960);
                    rVar2 = aVar6;
                } else {
                    z14 = false;
                    o0VarE.C(-412470627);
                    d92.b.f58623a.getClass();
                    long jA3 = d92.b.a(o0VarE).f().a();
                    o0VarE.g0(false);
                    d0VarA = d0.a(jA3);
                }
                d0Var2 = d0VarA;
                if (nVar != o70.n.GENESIS) {
                    z15 = z14;
                } else {
                    z15 = z14;
                }
                if ((i25 & 14) != 4) {
                }
                objQ = o0VarE.q();
                if (z16) {
                    p3.m.f135153a.getClass();
                    if (objQ == p3.m.a.f135155b) {
                        objQ = new h0(aVar4, 19);
                        o0VarE.K(objQ);
                    }
                } else {
                    objQ = new h0(aVar4, 19);
                    o0VarE.K(objQ);
                }
                int i217 = i19 >> 3;
                int i218 = i24 >> 6;
                o0Var = o0VarE;
                yz1.s.b(aVar6, dVar, str, str2, dVar2, d0Var, 0.0f, i16, d0Var2, 0.0f, str10, (e23.a) objQ, z3.f.c(1552757549, new c42.d(nVar, str8, str3, cVar, cVar2, str4, str5, str7, aVar5), o0VarE), z3.f.c(1419053486, new g52.d(nVar, cVar3, str6, str9, 3), o0VarE), false, z15, aVar2, aVar3, pVar, o0Var, (i19 & 126) | (i217 & 896) | (i217 & 7168) | (57344 & i217) | (i217 & 458752), (i218 & 29360128) | (3670016 & i218) | 3456 | 100663296, 16960);
                rVar2 = aVar6;
            } else {
                string = context.getString(R.string.lbl_add);
            }
            str10 = string;
            i18 = iArr[aVar.ordinal()];
            if (i18 != 1) {
                if (i18 != 2) {
                    z14 = false;
                    o0VarE.C(-412468480);
                    d92.b.f58623a.getClass();
                    long jD4 = d92.b.a(o0VarE).k().d();
                    o0VarE.g0(false);
                    d0VarA = d0.a(jD4);
                } else {
                    if (i18 == 3) {
                        throw kg.f.h(o0VarE, -412473167, false);
                    }
                    o0VarE.C(98429446);
                    z14 = false;
                    o0VarE.g0(false);
                    d0Var2 = null;
                }
                if (nVar != o70.n.GENESIS) {
                    z15 = z14;
                } else {
                    z15 = z14;
                }
                if ((i25 & 14) != 4) {
                }
                objQ = o0VarE.q();
                if (z16) {
                    p3.m.f135153a.getClass();
                    if (objQ == p3.m.a.f135155b) {
                        objQ = new h0(aVar4, 19);
                        o0VarE.K(objQ);
                    }
                } else {
                    objQ = new h0(aVar4, 19);
                    o0VarE.K(objQ);
                }
                int i219 = i19 >> 3;
                int i2110 = i24 >> 6;
                o0Var = o0VarE;
                yz1.s.b(aVar6, dVar, str, str2, dVar2, d0Var, 0.0f, i16, d0Var2, 0.0f, str10, (e23.a) objQ, z3.f.c(1552757549, new c42.d(nVar, str8, str3, cVar, cVar2, str4, str5, str7, aVar5), o0VarE), z3.f.c(1419053486, new g52.d(nVar, cVar3, str6, str9, 3), o0VarE), false, z15, aVar2, aVar3, pVar, o0Var, (i19 & 126) | (i219 & 896) | (i219 & 7168) | (57344 & i219) | (i219 & 458752), (i2110 & 29360128) | (3670016 & i2110) | 3456 | 100663296, 16960);
                rVar2 = aVar6;
            } else {
                z14 = false;
                o0VarE.C(-412470627);
                d92.b.f58623a.getClass();
                long jA4 = d92.b.a(o0VarE).f().a();
                o0VarE.g0(false);
                d0VarA = d0.a(jA4);
            }
            d0Var2 = d0VarA;
            if (nVar != o70.n.GENESIS) {
                z15 = z14;
            } else {
                z15 = z14;
            }
            if ((i25 & 14) != 4) {
            }
            objQ = o0VarE.q();
            if (z16) {
                p3.m.f135153a.getClass();
                if (objQ == p3.m.a.f135155b) {
                    objQ = new h0(aVar4, 19);
                    o0VarE.K(objQ);
                }
            } else {
                objQ = new h0(aVar4, 19);
                o0VarE.K(objQ);
            }
            int i2111 = i19 >> 3;
            int i2112 = i24 >> 6;
            o0Var = o0VarE;
            yz1.s.b(aVar6, dVar, str, str2, dVar2, d0Var, 0.0f, i16, d0Var2, 0.0f, str10, (e23.a) objQ, z3.f.c(1552757549, new c42.d(nVar, str8, str3, cVar, cVar2, str4, str5, str7, aVar5), o0VarE), z3.f.c(1419053486, new g52.d(nVar, cVar3, str6, str9, 3), o0VarE), false, z15, aVar2, aVar3, pVar, o0Var, (i19 & 126) | (i2111 & 896) | (i2111 & 7168) | (57344 & i2111) | (i2111 & 458752), (i2112 & 29360128) | (3670016 & i2112) | 3456 | 100663296, 16960);
            rVar2 = aVar6;
        } else {
            o0Var = o0VarE;
            o0Var.e();
            rVar2 = rVar;
        }
        p2 p2VarI0 = o0Var.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new e23.p(dVar, nVar, str, str2, dVar2, d0Var, str3, cVar, cVar2, str4, str5, aVar, cVar3, str6, str7, str8, str9, aVar2, aVar3, aVar4, aVar5, pVar, i14) { // from class: gp.i

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ yz1.d f78362b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                public final /* synthetic */ o70.n f78363c;

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                public final /* synthetic */ String f78364d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                public final /* synthetic */ String f78365e;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                public final /* synthetic */ u4.d f78366f;

                /* JADX INFO: renamed from: g, reason: collision with root package name */
                public final /* synthetic */ d0 f78367g;

                /* JADX INFO: renamed from: h, reason: collision with root package name */
                public final /* synthetic */ String f78368h;

                /* JADX INFO: renamed from: i, reason: collision with root package name */
                public final /* synthetic */ i53.c f78369i;

                /* JADX INFO: renamed from: j, reason: collision with root package name */
                public final /* synthetic */ i53.c f78370j;

                /* JADX INFO: renamed from: k, reason: collision with root package name */
                public final /* synthetic */ String f78371k;

                /* JADX INFO: renamed from: l, reason: collision with root package name */
                public final /* synthetic */ String f78372l;

                /* JADX INFO: renamed from: m, reason: collision with root package name */
                public final /* synthetic */ a f78373m;

                /* JADX INFO: renamed from: n, reason: collision with root package name */
                public final /* synthetic */ i53.c f78374n;

                /* JADX INFO: renamed from: o, reason: collision with root package name */
                public final /* synthetic */ String f78375o;

                /* JADX INFO: renamed from: p, reason: collision with root package name */
                public final /* synthetic */ String f78376p;

                /* JADX INFO: renamed from: q, reason: collision with root package name */
                public final /* synthetic */ String f78377q;

                /* JADX INFO: renamed from: r, reason: collision with root package name */
                public final /* synthetic */ String f78378r;

                /* JADX INFO: renamed from: t, reason: collision with root package name */
                public final /* synthetic */ e23.a f78379t;

                /* JADX INFO: renamed from: v, reason: collision with root package name */
                public final /* synthetic */ e23.a f78380v;

                /* JADX INFO: renamed from: w, reason: collision with root package name */
                public final /* synthetic */ e23.a f78381w;

                /* JADX INFO: renamed from: x, reason: collision with root package name */
                public final /* synthetic */ e23.a f78382x;

                /* JADX INFO: renamed from: y, reason: collision with root package name */
                public final /* synthetic */ e23.p f78383y;

                @Override // e23.p
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iT = p0.t(1);
                    l.a(this.f78361a, this.f78362b, this.f78363c, this.f78364d, this.f78365e, this.f78366f, this.f78367g, this.f78368h, this.f78369i, this.f78370j, this.f78371k, this.f78372l, this.f78373m, this.f78374n, this.f78375o, this.f78376p, this.f78377q, this.f78378r, this.f78379t, this.f78380v, this.f78381w, this.f78382x, this.f78383y, (p3.m) obj, iT);
                    return Unit.INSTANCE;
                }
            };
        }
    }

    /* JADX WARN: Code duplicated, block: B:63:0x026c  */
    public static final void b(i53.c<in.f> cVar, String str, String str2, p3.m mVar, int i14) {
        h4.r.a aVar;
        long jG;
        o0 o0VarE = mVar.E(464036752);
        p3.c<?> cVar2 = o0VarE.f135177b;
        int i15 = i14 | (o0VarE.B(cVar) ? 4 : 2) | (o0VarE.B(str) ? 32 : 16) | (o0VarE.B(str2) ? 256 : 128);
        if (o0VarE.n(i15 & 1, (i15 & 147) != 146)) {
            x1 x1Var = p3.n.f135158a;
            ((Context) o0VarE.A(AndroidCompositionLocals_androidKt.f6042b)).getColor(R.color.gds_data_viz_neutral_secondary);
            h4.r.a aVar2 = h4.r.S;
            c2.j.f22691a.getClass();
            c2.j.k kVar = c2.j.f22694d;
            h4.d.f81522a.getClass();
            z zVarA = y.a(kVar, h4.d.a.f81536n, o0VarE, 0);
            int iHashCode = Long.hashCode(o0VarE.U);
            i2 i2VarA0 = o0VarE.a0();
            h4.r rVarC = h4.k.c(aVar2, o0VarE);
            h5.g.V.getClass();
            e0.a aVar3 = h5.g.a.f81805b;
            if (cVar2 == null) {
                p0.l();
                throw null;
            }
            o0VarE.z();
            if (o0VarE.T) {
                o0VarE.M(aVar3);
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
            b0 b0Var = b0.f22601a;
            d92.b.f58623a.getClass();
            d92.b.f58625c.getClass();
            c2.l.f(x2.h(aVar2, j92.b.f97899b.f97921f), o0VarE);
            h4.r rVarF = x2.f(aVar2, 1.0f);
            ArrayList arrayList = new ArrayList();
            o0VarE.C(-786341453);
            int i16 = 0;
            for (in.f fVar : cVar) {
                o0VarE.C(1393258136);
                int i17 = i16 + 1;
                if (fVar.f94414a) {
                    if (fVar.f94415b) {
                        o0VarE.C(-786336789);
                        gl.c.f77766a.getClass();
                        jG = gl.c.a(o0VarE).f();
                    } else {
                        o0VarE.C(-786335571);
                        gl.c.f77766a.getClass();
                        jG = gl.c.a(o0VarE).g();
                    }
                    o0VarE.g0(false);
                    arrayList.add(new m92.h0.e.d(new m92.h0.e.a(i16, 1.0f), new o92.b(o92.e.CIRCLE, jG, null, 4, null), null, 4, null));
                    o0VarE.g0(false);
                } else {
                    o0VarE.g0(false);
                }
                i16 = i17;
            }
            o0VarE.g0(false);
            i53.c cVarE = i53.a.e(arrayList);
            x1 x1Var2 = p3.n.f135158a;
            Float fValueOf = Float.valueOf(28.0f);
            d92.b.f58623a.getClass();
            j92.b bVar2 = d92.b.f58625c;
            bVar2.getClass();
            j92.c cVar3 = j92.b.f97901d;
            float f14 = cVar3.f97902a;
            m92.h0.e.a aVar4 = new m92.h0.e.a(0.0f, 1.0f);
            o92.e eVar = o92.e.CIRCLE;
            gl.c.f77766a.getClass();
            m92.h0.e.d dVar = new m92.h0.e.d(aVar4, new o92.b(eVar, gl.c.a(o0VarE).g(), null, 4, null), null, 4, null);
            bVar2.getClass();
            w.a(rVarF, cVarE, fValueOf, f14, dVar, g6.f.a(cVar3.f97902a / 4), Float.valueOf(0.0f), Float.valueOf(2.0f), o0VarE, 905970054);
            h4.r.a aVar5 = h4.r.S;
            bVar2.getClass();
            j92.e eVar2 = j92.b.f97899b;
            c2.l.f(x2.h(aVar5, eVar2.f97918c), o0VarE);
            c2.j.f22691a.getClass();
            c2.j.C0343j c0343j = c2.j.f22692b;
            h4.d.f81522a.getClass();
            s2 s2VarA = q2.a(c0343j, h4.d.a.f81533k, o0VarE, 0);
            int iHashCode2 = Long.hashCode(o0VarE.U);
            i2 i2VarA1 = o0VarE.a0();
            h4.r rVarC2 = h4.k.c(aVar5, o0VarE);
            h5.g.V.getClass();
            e0.a aVar6 = h5.g.a.f81805b;
            if (cVar2 == null) {
                p0.l();
                throw null;
            }
            o0VarE.z();
            if (o0VarE.T) {
                o0VarE.M(aVar6);
            } else {
                o0VarE.c();
            }
            b4.c(h5.g.a.f81810g, s2VarA, o0VarE);
            b4.c(h5.g.a.f81809f, i2VarA1, o0VarE);
            h5.g.a.b bVar3 = h5.g.a.f81813j;
            if (o0VarE.T || !p005kotlin.jvm.internal.s.g(o0VarE.q(), Integer.valueOf(iHashCode2))) {
                v.h.A(iHashCode2, o0VarE, iHashCode2, bVar3);
            }
            b4.c(h5.g.a.f81807d, rVarC2, o0VarE);
            u2 u2Var = u2.f22900a;
            String strQ = gl1.y.Q(o0VarE, R.string.label_last_4w);
            j92.f fVar2 = d92.b.f58624b;
            fVar2.getClass();
            x0 x0Var = j92.f.f97933j;
            x0 x0VarF = d92.c.f(x0Var, o0VarE);
            boolean z14 = (i15 & 896) == 256;
            Object objQ = o0VarE.q();
            if (z14) {
                objQ = new j(str2, 0);
                o0VarE.K(objQ);
            } else {
                p3.m.f135153a.getClass();
                if (objQ == p3.m.a.f135155b) {
                    objQ = new j(str2, 0);
                    o0VarE.K(objQ);
                }
            }
            mh.c(strQ, v.c((e23.l) objQ, aVar5, false), 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, x0VarF, o0VarE, 0, 0, 131068);
            o0VarE = o0VarE;
            if (str == null) {
                o0VarE.C(-255208300);
                o0VarE.g0(false);
                aVar = aVar5;
            } else {
                o0VarE.C(-255208299);
                c2.l.f(u2Var.a(aVar5, 1.0f, true), o0VarE);
                fVar2.getClass();
                aVar = aVar5;
                mh.c(str, null, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.f(x0Var, o0VarE), o0VarE, 0, 0, 131070);
                o0VarE = o0VarE;
                Unit unit = Unit.INSTANCE;
                o0VarE.g0(false);
            }
            o0VarE.g0(true);
            bVar2.getClass();
            e5.t(aVar, eVar2.f97920e, o0VarE, true);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new k(cVar, str, str2, i14);
        }
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0040  */
    public static final void c(int i14, e23.a aVar, String str, p3.m mVar) {
        o0 o0VarE = mVar.E(1031599113);
        int i15 = (o0VarE.B(str) ? 4 : 2) | i14;
        if (o0VarE.n(i15 & 1, (i15 & 19) != 18)) {
            x1 x1Var = p3.n.f135158a;
            Context context = (Context) o0VarE.A(AndroidCompositionLocals_androidKt.f6042b);
            boolean zR = o0VarE.r(context);
            Object objQ = o0VarE.q();
            if (zR) {
                objQ = new h(aVar, context, 0);
                o0VarE.K(objQ);
            } else {
                p3.m.f135153a.getClass();
                if (objQ == p3.m.a.f135155b) {
                    objQ = new h(aVar, context, 0);
                    o0VarE.K(objQ);
                }
            }
            w52.u0.b(str, (e23.a) objQ, aVar, o0VarE, (i15 & 14) | 384);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new ao1.g(str, aVar, i14, 11);
        }
    }

    public static final void d(int i14, e23.a aVar, String str, p3.m mVar) {
        e23.a aVar2;
        o0 o0VarE = mVar.E(1520595401);
        int i15 = (o0VarE.B(str) ? 4 : 2) | i14 | (o0VarE.r(aVar) ? 32 : 16);
        if (o0VarE.n(i15 & 1, (i15 & 19) != 18)) {
            x1 x1Var = p3.n.f135158a;
            aVar2 = aVar;
            u.b(z3.f.c(935269369, new fv1.b(str, 7), o0VarE), aVar2, null, null, null, false, null, null, o0VarE, (i15 & 112) | 6, 508);
        } else {
            aVar2 = aVar;
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new ao1.g(str, aVar2, i14, 10);
        }
    }

    public static void e(Context context, in.e eVar, am.x0 x0Var) {
        int i14 = a.f78392c[eVar.ordinal()];
        if (i14 != 1) {
            if (i14 == 2 || i14 == 3) {
                ((am.d) KoinJavaComponent.get$default(am.d.class, null, null, 6, null)).r(context);
                return;
            } else {
                u0.r();
                return;
            }
        }
        ActivitiesCreateManualActivity.f29125c.getClass();
        context.getClass();
        Intent intent = new Intent(context, (Class<?>) ActivitiesCreateManualActivity.class);
        if (x0Var != null) {
            intent.putExtra("ActivityType", x0Var.f4358a);
        }
        context.startActivity(intent);
    }
}
