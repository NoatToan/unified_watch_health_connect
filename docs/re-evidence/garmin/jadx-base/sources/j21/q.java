package j21;

import c2.q2;
import c2.s2;
import c2.u2;
import c2.x2;
import c2.y;
import c2.z;
import com.garmin.android.apps.connectmobile.R;
import com.google.android.exoplayer2.source.ProgressiveMediaSource;
import com.google.firebase.messaging.Constants;
import h5.e0;
import i3.mh;
import java.util.Set;
import l72.l2;
import l72.v2;
import o4.m1;
import o53.b0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p13.a1;
import p3.b4;
import p3.i2;
import p3.l0;
import p3.o0;
import p3.p0;
import p3.p2;
import p3.x1;
import r1.c0;
import u1.w;

/* JADX INFO: loaded from: classes9.dex */
public final class q {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.nutrition.presentation.search.composable.MealFoodItemKt$MealFoodItem$3$3$1$1", f = "MealFoodItem.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class a extends v13.i implements e23.p<b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ e23.a<Unit> f96704a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ e23.a<Unit> f96705b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(e23.a<Unit> aVar, e23.a<Unit> aVar2, t13.d<? super a> dVar) {
            super(2, dVar);
            this.f96704a = aVar;
            this.f96705b = aVar2;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new a(this.f96704a, this.f96705b, dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
            return ((a) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            o13.r.b(obj);
            this.f96704a.invoke();
            this.f96705b.invoke();
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: Code duplicated, block: B:105:0x0143 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:106:0x0145  */
    /* JADX WARN: Code duplicated, block: B:107:0x0148  */
    /* JADX WARN: Code duplicated, block: B:109:0x014c  */
    /* JADX WARN: Code duplicated, block: B:111:0x014f  */
    /* JADX WARN: Code duplicated, block: B:113:0x015a  */
    /* JADX WARN: Code duplicated, block: B:115:0x0165  */
    /* JADX WARN: Code duplicated, block: B:117:0x0168  */
    /* JADX WARN: Code duplicated, block: B:119:0x0173  */
    /* JADX WARN: Code duplicated, block: B:121:0x017f  */
    /* JADX WARN: Code duplicated, block: B:124:0x0185  */
    /* JADX WARN: Code duplicated, block: B:125:0x01a3  */
    /* JADX WARN: Code duplicated, block: B:128:0x01c2  */
    /* JADX WARN: Code duplicated, block: B:131:0x0205  */
    /* JADX WARN: Code duplicated, block: B:133:0x020c  */
    /* JADX WARN: Code duplicated, block: B:134:0x0210  */
    /* JADX WARN: Code duplicated, block: B:137:0x0223  */
    /* JADX WARN: Code duplicated, block: B:139:0x0231  */
    /* JADX WARN: Code duplicated, block: B:142:0x0253  */
    /* JADX WARN: Code duplicated, block: B:144:0x02bf  */
    /* JADX WARN: Code duplicated, block: B:146:0x02c3  */
    /* JADX WARN: Code duplicated, block: B:149:0x02d4  */
    /* JADX WARN: Code duplicated, block: B:151:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:51:0x008b  */
    /* JADX WARN: Code duplicated, block: B:53:0x0093  */
    /* JADX WARN: Code duplicated, block: B:54:0x0096  */
    /* JADX WARN: Code duplicated, block: B:56:0x009a  */
    /* JADX WARN: Code duplicated, block: B:59:0x00a2  */
    /* JADX WARN: Code duplicated, block: B:61:0x00a6  */
    /* JADX WARN: Code duplicated, block: B:63:0x00a9  */
    /* JADX WARN: Code duplicated, block: B:65:0x00b1  */
    /* JADX WARN: Code duplicated, block: B:66:0x00b4  */
    /* JADX WARN: Code duplicated, block: B:70:0x00bd  */
    /* JADX WARN: Code duplicated, block: B:71:0x00c2  */
    /* JADX WARN: Code duplicated, block: B:73:0x00c8  */
    /* JADX WARN: Code duplicated, block: B:75:0x00ce  */
    /* JADX WARN: Code duplicated, block: B:76:0x00d1  */
    /* JADX WARN: Code duplicated, block: B:80:0x00db  */
    /* JADX WARN: Code duplicated, block: B:82:0x00df  */
    /* JADX WARN: Code duplicated, block: B:85:0x00ea A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:88:0x00f1  */
    /* JADX WARN: Code duplicated, block: B:91:0x0100  */
    /* JADX WARN: Code duplicated, block: B:92:0x0102  */
    /* JADX WARN: Code duplicated, block: B:95:0x010b  */
    /* JADX WARN: Code duplicated, block: B:97:0x0119  */
    public static final void a(final String str, final String str2, b92.a aVar, final String str3, boolean z14, final boolean z15, e23.a<Unit> aVar2, e23.a<Unit> aVar3, float f14, p3.m mVar, final int i14, final int i15) {
        int i16;
        String str4;
        boolean z16;
        int i17;
        e23.a<Unit> aVar4;
        int i18;
        int i19;
        int i24;
        int i25;
        boolean z17;
        final b92.a aVar5;
        final e23.a<Unit> aVar6;
        final float f15;
        final boolean z18;
        final e23.a<Unit> aVar7;
        p2 p2VarI0;
        int i26;
        p3.m.a aVar8;
        b92.a aVar9;
        e23.a<Unit> aVar10;
        e23.a<Unit> aVar11;
        Throwable th3;
        int i27;
        float f16;
        Object objQ;
        Object objQ2;
        Object objQ3;
        p3.m.a.C2565a c2565a;
        b0 b0Var;
        Throwable th4;
        z zVarA;
        int iHashCode;
        i2 i2VarA0;
        h4.r rVarC;
        e0.a aVar12;
        int i28;
        h5.g.a.b bVar;
        Object objQ4;
        int i29;
        str.getClass();
        o0 o0VarE = mVar.E(-1420979599);
        if ((i14 & 6) == 0) {
            i16 = (o0VarE.B(str) ? 4 : 2) | i14;
        } else {
            i16 = i14;
        }
        if ((i14 & 48) == 0) {
            i16 |= o0VarE.B(str2) ? 32 : 16;
        }
        int i30 = i15 & 4;
        if (i30 != 0) {
            i16 |= 384;
        } else if ((i14 & 384) == 0) {
            i16 |= (i14 & 512) == 0 ? o0VarE.B(aVar) : o0VarE.r(aVar) ? 256 : 128;
        }
        if ((i14 & 3072) == 0) {
            str4 = str3;
            i16 |= o0VarE.B(str4) ? 2048 : 1024;
        } else {
            str4 = str3;
        }
        int i34 = i15 & 16;
        if (i34 == 0) {
            if ((i14 & 24576) == 0) {
                z16 = z14;
                i16 |= o0VarE.h(z16) ? 16384 : 8192;
            }
            if ((196608 & i14) != 0) {
                if (o0VarE.h(z15)) {
                    i29 = 131072;
                } else {
                    i29 = 65536;
                }
                i16 |= i29;
            }
            i17 = i15 & 64;
            if (i17 != 0) {
                if ((1572864 & i14) == 0) {
                    aVar4 = aVar2;
                    if (o0VarE.r(aVar4)) {
                        i18 = ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES;
                    } else {
                        i18 = 524288;
                    }
                    i16 |= i18;
                }
                i19 = i15 & 128;
                if (i19 != 0) {
                    i16 |= 12582912;
                } else if ((i14 & 12582912) == 0) {
                    if (o0VarE.r(aVar3)) {
                        i24 = 8388608;
                    } else {
                        i24 = 4194304;
                    }
                    i16 |= i24;
                }
                if ((i14 & 100663296) != 0) {
                    i16 |= ((i15 & 256) == 0 || !o0VarE.i(f14)) ? 33554432 : 67108864;
                }
                i25 = i16;
                if ((i16 & 38347923) != 38347922) {
                    z17 = true;
                } else {
                    z17 = false;
                }
                if (o0VarE.n(i25 & 1, z17)) {
                    o0VarE.G0();
                    i26 = i14 & 1;
                    aVar8 = p3.m.f135153a;
                    if (i26 != 0 || o0VarE.o0()) {
                        if (i30 != 0) {
                            aVar9 = null;
                        } else {
                            aVar9 = aVar;
                        }
                        if (i34 != 0) {
                            z16 = false;
                        }
                        if (i17 != 0) {
                            objQ2 = o0VarE.q();
                            aVar8.getClass();
                            if (objQ2 == p3.m.a.f135155b) {
                                objQ2 = new f(1);
                                o0VarE.K(objQ2);
                            }
                            aVar10 = (e23.a) objQ2;
                        } else {
                            aVar10 = aVar4;
                        }
                        if (i19 != 0) {
                            objQ = o0VarE.q();
                            aVar8.getClass();
                            if (objQ == p3.m.a.f135155b) {
                                objQ = new f(2);
                                o0VarE.K(objQ);
                            }
                            aVar3 = (e23.a) objQ;
                        } else {
                            aVar3 = aVar3;
                        }
                        if ((i15 & 256) != 0) {
                            d92.b.f58623a.getClass();
                            d92.b.f58625c.getClass();
                            i27 = i25 & (-234881025);
                            aVar11 = aVar10;
                            th3 = null;
                            aVar = aVar9;
                            z16 = z16;
                            f16 = j92.b.f97899b.f97920e;
                        } else {
                            aVar11 = aVar10;
                            th3 = null;
                            aVar = aVar9;
                            z16 = z16;
                            i27 = i25;
                            f16 = f14;
                        }
                    } else {
                        o0VarE.e();
                        i27 = (i15 & 256) != 0 ? i25 & (-234881025) : i25;
                        th3 = null;
                        f16 = f14;
                        aVar11 = aVar4;
                    }
                    o0VarE.h0();
                    x1 x1Var = p3.n.f135158a;
                    objQ3 = o0VarE.q();
                    aVar8.getClass();
                    c2565a = p3.m.a.f135155b;
                    if (objQ3 == c2565a) {
                        objQ3 = l0.j(t13.h.f161748a, o0VarE);
                        o0VarE.K(objQ3);
                    }
                    b0Var = (b0) objQ3;
                    th4 = th3;
                    h4.r rVarF = x2.f(h4.r.S, 1.0f);
                    c2.j.f22691a.getClass();
                    c2.j.k kVar = c2.j.f22694d;
                    h4.d.f81522a.getClass();
                    zVarA = y.a(kVar, h4.d.a.f81536n, o0VarE, 0);
                    iHashCode = Long.hashCode(o0VarE.U);
                    i2VarA0 = o0VarE.a0();
                    rVarC = h4.k.c(rVarF, o0VarE);
                    h5.g.V.getClass();
                    aVar12 = h5.g.a.f81805b;
                    i28 = i27;
                    if (o0VarE.f135177b != null) {
                        p0.l();
                        throw th4;
                    }
                    o0VarE.z();
                    if (o0VarE.T) {
                        o0VarE.M(aVar12);
                    } else {
                        o0VarE.c();
                    }
                    b4.c(h5.g.a.f81810g, zVarA, o0VarE);
                    b4.c(h5.g.a.f81809f, i2VarA0, o0VarE);
                    bVar = h5.g.a.f81813j;
                    if (o0VarE.T || !p005kotlin.jvm.internal.s.g(o0VarE.q(), Integer.valueOf(iHashCode))) {
                        v.h.A(iHashCode, o0VarE, iHashCode, bVar);
                    }
                    b4.c(h5.g.a.f81807d, rVarC, o0VarE);
                    c2.b0 b0Var2 = c2.b0.f22601a;
                    Set setB = a1.b(new c92.b.a(c92.a.DELETE, gl1.y.Q(o0VarE, R.string.lbl_delete)));
                    objQ4 = o0VarE.q();
                    if (objQ4 == c2565a) {
                        objQ4 = new f(3);
                        o0VarE.K(objQ4);
                    }
                    boolean z19 = z16;
                    int i35 = i28 >> 9;
                    l2.a(setB, b0Var, z15, null, (e23.a) objQ4, z3.f.c(2033210532, new n(str, str2, aVar, str4, z16, f16, aVar11), o0VarE), z3.f.c(-1086248829, new ak0.p(aVar3, 11), o0VarE), o0VarE, 1794048 | (i35 & 896), 8);
                    c.f96639a.getClass();
                    c0.c(b0Var2, z19, null, null, null, null, c.f96640b, o0VarE, 1572870 | (i35 & 112), 30);
                    o0VarE = o0VarE;
                    o0VarE.g0(true);
                    aVar5 = aVar;
                    f15 = f16;
                    z18 = z19;
                    aVar7 = aVar11;
                    aVar6 = aVar3;
                } else {
                    o0VarE.e();
                    aVar5 = aVar;
                    aVar6 = aVar3;
                    f15 = f14;
                    z18 = z16;
                    aVar7 = aVar4;
                }
                p2VarI0 = o0VarE.i0();
                if (p2VarI0 != null) {
                    p2VarI0.f135219d = new e23.p() { // from class: j21.o
                        @Override // e23.p
                        public final Object invoke(Object obj, Object obj2) {
                            ((Integer) obj2).getClass();
                            q.a(str, str2, aVar5, str3, z18, z15, aVar7, aVar6, f15, (p3.m) obj, p0.t(i14 | 1), i15);
                            return Unit.INSTANCE;
                        }
                    };
                }
            }
            i16 |= 1572864;
            aVar4 = aVar2;
            i19 = i15 & 128;
            if (i19 != 0) {
                i16 |= 12582912;
            } else if ((i14 & 12582912) == 0) {
                if (o0VarE.r(aVar3)) {
                    i24 = 8388608;
                } else {
                    i24 = 4194304;
                }
                i16 |= i24;
            }
            if ((i14 & 100663296) != 0) {
                i16 |= ((i15 & 256) == 0 || !o0VarE.i(f14)) ? 33554432 : 67108864;
            }
            i25 = i16;
            if ((i16 & 38347923) != 38347922) {
                z17 = true;
            } else {
                z17 = false;
            }
            if (o0VarE.n(i25 & 1, z17)) {
                o0VarE.G0();
                i26 = i14 & 1;
                aVar8 = p3.m.f135153a;
                if (i26 != 0) {
                    if (i30 != 0) {
                        aVar9 = null;
                    } else {
                        aVar9 = aVar;
                    }
                    if (i34 != 0) {
                        z16 = false;
                    }
                    if (i17 != 0) {
                        objQ2 = o0VarE.q();
                        aVar8.getClass();
                        if (objQ2 == p3.m.a.f135155b) {
                            objQ2 = new f(1);
                            o0VarE.K(objQ2);
                        }
                        aVar10 = (e23.a) objQ2;
                    } else {
                        aVar10 = aVar4;
                    }
                    if (i19 != 0) {
                        objQ = o0VarE.q();
                        aVar8.getClass();
                        if (objQ == p3.m.a.f135155b) {
                            objQ = new f(2);
                            o0VarE.K(objQ);
                        }
                        aVar3 = (e23.a) objQ;
                    } else {
                        aVar3 = aVar3;
                    }
                    if ((i15 & 256) != 0) {
                        d92.b.f58623a.getClass();
                        d92.b.f58625c.getClass();
                        i27 = i25 & (-234881025);
                        aVar11 = aVar10;
                        th3 = null;
                        aVar = aVar9;
                        z16 = z16;
                        f16 = j92.b.f97899b.f97920e;
                    } else {
                        aVar11 = aVar10;
                        th3 = null;
                        aVar = aVar9;
                        z16 = z16;
                        i27 = i25;
                        f16 = f14;
                    }
                } else {
                    if (i30 != 0) {
                        aVar9 = null;
                    } else {
                        aVar9 = aVar;
                    }
                    if (i34 != 0) {
                        z16 = false;
                    }
                    if (i17 != 0) {
                        objQ2 = o0VarE.q();
                        aVar8.getClass();
                        if (objQ2 == p3.m.a.f135155b) {
                            objQ2 = new f(1);
                            o0VarE.K(objQ2);
                        }
                        aVar10 = (e23.a) objQ2;
                    } else {
                        aVar10 = aVar4;
                    }
                    if (i19 != 0) {
                        objQ = o0VarE.q();
                        aVar8.getClass();
                        if (objQ == p3.m.a.f135155b) {
                            objQ = new f(2);
                            o0VarE.K(objQ);
                        }
                        aVar3 = (e23.a) objQ;
                    } else {
                        aVar3 = aVar3;
                    }
                    if ((i15 & 256) != 0) {
                        d92.b.f58623a.getClass();
                        d92.b.f58625c.getClass();
                        i27 = i25 & (-234881025);
                        aVar11 = aVar10;
                        th3 = null;
                        aVar = aVar9;
                        z16 = z16;
                        f16 = j92.b.f97899b.f97920e;
                    } else {
                        aVar11 = aVar10;
                        th3 = null;
                        aVar = aVar9;
                        z16 = z16;
                        i27 = i25;
                        f16 = f14;
                    }
                }
                o0VarE.h0();
                x1 x1Var2 = p3.n.f135158a;
                objQ3 = o0VarE.q();
                aVar8.getClass();
                c2565a = p3.m.a.f135155b;
                if (objQ3 == c2565a) {
                    objQ3 = l0.j(t13.h.f161748a, o0VarE);
                    o0VarE.K(objQ3);
                }
                b0Var = (b0) objQ3;
                th4 = th3;
                h4.r rVarF2 = x2.f(h4.r.S, 1.0f);
                c2.j.f22691a.getClass();
                c2.j.k kVar2 = c2.j.f22694d;
                h4.d.f81522a.getClass();
                zVarA = y.a(kVar2, h4.d.a.f81536n, o0VarE, 0);
                iHashCode = Long.hashCode(o0VarE.U);
                i2VarA0 = o0VarE.a0();
                rVarC = h4.k.c(rVarF2, o0VarE);
                h5.g.V.getClass();
                aVar12 = h5.g.a.f81805b;
                i28 = i27;
                if (o0VarE.f135177b != null) {
                    p0.l();
                    throw th4;
                }
                o0VarE.z();
                if (o0VarE.T) {
                    o0VarE.M(aVar12);
                } else {
                    o0VarE.c();
                }
                b4.c(h5.g.a.f81810g, zVarA, o0VarE);
                b4.c(h5.g.a.f81809f, i2VarA0, o0VarE);
                bVar = h5.g.a.f81813j;
                if (o0VarE.T) {
                    v.h.A(iHashCode, o0VarE, iHashCode, bVar);
                } else {
                    v.h.A(iHashCode, o0VarE, iHashCode, bVar);
                }
                b4.c(h5.g.a.f81807d, rVarC, o0VarE);
                c2.b0 b0Var3 = c2.b0.f22601a;
                Set setB2 = a1.b(new c92.b.a(c92.a.DELETE, gl1.y.Q(o0VarE, R.string.lbl_delete)));
                objQ4 = o0VarE.q();
                if (objQ4 == c2565a) {
                    objQ4 = new f(3);
                    o0VarE.K(objQ4);
                }
                boolean z110 = z16;
                int i36 = i28 >> 9;
                l2.a(setB2, b0Var, z15, null, (e23.a) objQ4, z3.f.c(2033210532, new n(str, str2, aVar, str4, z16, f16, aVar11), o0VarE), z3.f.c(-1086248829, new ak0.p(aVar3, 11), o0VarE), o0VarE, 1794048 | (i36 & 896), 8);
                c.f96639a.getClass();
                c0.c(b0Var3, z110, null, null, null, null, c.f96640b, o0VarE, 1572870 | (i36 & 112), 30);
                o0VarE = o0VarE;
                o0VarE.g0(true);
                aVar5 = aVar;
                f15 = f16;
                z18 = z110;
                aVar7 = aVar11;
                aVar6 = aVar3;
            } else {
                o0VarE.e();
                aVar5 = aVar;
                aVar6 = aVar3;
                f15 = f14;
                z18 = z16;
                aVar7 = aVar4;
            }
            p2VarI0 = o0VarE.i0();
            if (p2VarI0 != null) {
                p2VarI0.f135219d = new e23.p() { // from class: j21.o
                    @Override // e23.p
                    public final Object invoke(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        q.a(str, str2, aVar5, str3, z18, z15, aVar7, aVar6, f15, (p3.m) obj, p0.t(i14 | 1), i15);
                        return Unit.INSTANCE;
                    }
                };
            }
        }
        i16 |= 24576;
        z16 = z14;
        if ((196608 & i14) != 0) {
            if (o0VarE.h(z15)) {
                i29 = 131072;
            } else {
                i29 = 65536;
            }
            i16 |= i29;
        }
        i17 = i15 & 64;
        if (i17 != 0) {
            if ((1572864 & i14) == 0) {
                aVar4 = aVar2;
                if (o0VarE.r(aVar4)) {
                    i18 = ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES;
                } else {
                    i18 = 524288;
                }
                i16 |= i18;
            }
            i19 = i15 & 128;
            if (i19 != 0) {
                i16 |= 12582912;
            } else if ((i14 & 12582912) == 0) {
                if (o0VarE.r(aVar3)) {
                    i24 = 8388608;
                } else {
                    i24 = 4194304;
                }
                i16 |= i24;
            }
            if ((i14 & 100663296) != 0) {
                i16 |= ((i15 & 256) == 0 || !o0VarE.i(f14)) ? 33554432 : 67108864;
            }
            i25 = i16;
            if ((i16 & 38347923) != 38347922) {
                z17 = true;
            } else {
                z17 = false;
            }
            if (o0VarE.n(i25 & 1, z17)) {
                o0VarE.G0();
                i26 = i14 & 1;
                aVar8 = p3.m.f135153a;
                if (i26 != 0) {
                    if (i30 != 0) {
                        aVar9 = null;
                    } else {
                        aVar9 = aVar;
                    }
                    if (i34 != 0) {
                        z16 = false;
                    }
                    if (i17 != 0) {
                        objQ2 = o0VarE.q();
                        aVar8.getClass();
                        if (objQ2 == p3.m.a.f135155b) {
                            objQ2 = new f(1);
                            o0VarE.K(objQ2);
                        }
                        aVar10 = (e23.a) objQ2;
                    } else {
                        aVar10 = aVar4;
                    }
                    if (i19 != 0) {
                        objQ = o0VarE.q();
                        aVar8.getClass();
                        if (objQ == p3.m.a.f135155b) {
                            objQ = new f(2);
                            o0VarE.K(objQ);
                        }
                        aVar3 = (e23.a) objQ;
                    } else {
                        aVar3 = aVar3;
                    }
                    if ((i15 & 256) != 0) {
                        d92.b.f58623a.getClass();
                        d92.b.f58625c.getClass();
                        i27 = i25 & (-234881025);
                        aVar11 = aVar10;
                        th3 = null;
                        aVar = aVar9;
                        z16 = z16;
                        f16 = j92.b.f97899b.f97920e;
                    } else {
                        aVar11 = aVar10;
                        th3 = null;
                        aVar = aVar9;
                        z16 = z16;
                        i27 = i25;
                        f16 = f14;
                    }
                } else {
                    if (i30 != 0) {
                        aVar9 = null;
                    } else {
                        aVar9 = aVar;
                    }
                    if (i34 != 0) {
                        z16 = false;
                    }
                    if (i17 != 0) {
                        objQ2 = o0VarE.q();
                        aVar8.getClass();
                        if (objQ2 == p3.m.a.f135155b) {
                            objQ2 = new f(1);
                            o0VarE.K(objQ2);
                        }
                        aVar10 = (e23.a) objQ2;
                    } else {
                        aVar10 = aVar4;
                    }
                    if (i19 != 0) {
                        objQ = o0VarE.q();
                        aVar8.getClass();
                        if (objQ == p3.m.a.f135155b) {
                            objQ = new f(2);
                            o0VarE.K(objQ);
                        }
                        aVar3 = (e23.a) objQ;
                    } else {
                        aVar3 = aVar3;
                    }
                    if ((i15 & 256) != 0) {
                        d92.b.f58623a.getClass();
                        d92.b.f58625c.getClass();
                        i27 = i25 & (-234881025);
                        aVar11 = aVar10;
                        th3 = null;
                        aVar = aVar9;
                        z16 = z16;
                        f16 = j92.b.f97899b.f97920e;
                    } else {
                        aVar11 = aVar10;
                        th3 = null;
                        aVar = aVar9;
                        z16 = z16;
                        i27 = i25;
                        f16 = f14;
                    }
                }
                o0VarE.h0();
                x1 x1Var3 = p3.n.f135158a;
                objQ3 = o0VarE.q();
                aVar8.getClass();
                c2565a = p3.m.a.f135155b;
                if (objQ3 == c2565a) {
                    objQ3 = l0.j(t13.h.f161748a, o0VarE);
                    o0VarE.K(objQ3);
                }
                b0Var = (b0) objQ3;
                th4 = th3;
                h4.r rVarF3 = x2.f(h4.r.S, 1.0f);
                c2.j.f22691a.getClass();
                c2.j.k kVar3 = c2.j.f22694d;
                h4.d.f81522a.getClass();
                zVarA = y.a(kVar3, h4.d.a.f81536n, o0VarE, 0);
                iHashCode = Long.hashCode(o0VarE.U);
                i2VarA0 = o0VarE.a0();
                rVarC = h4.k.c(rVarF3, o0VarE);
                h5.g.V.getClass();
                aVar12 = h5.g.a.f81805b;
                i28 = i27;
                if (o0VarE.f135177b != null) {
                    p0.l();
                    throw th4;
                }
                o0VarE.z();
                if (o0VarE.T) {
                    o0VarE.M(aVar12);
                } else {
                    o0VarE.c();
                }
                b4.c(h5.g.a.f81810g, zVarA, o0VarE);
                b4.c(h5.g.a.f81809f, i2VarA0, o0VarE);
                bVar = h5.g.a.f81813j;
                if (o0VarE.T) {
                    v.h.A(iHashCode, o0VarE, iHashCode, bVar);
                } else {
                    v.h.A(iHashCode, o0VarE, iHashCode, bVar);
                }
                b4.c(h5.g.a.f81807d, rVarC, o0VarE);
                c2.b0 b0Var4 = c2.b0.f22601a;
                Set setB3 = a1.b(new c92.b.a(c92.a.DELETE, gl1.y.Q(o0VarE, R.string.lbl_delete)));
                objQ4 = o0VarE.q();
                if (objQ4 == c2565a) {
                    objQ4 = new f(3);
                    o0VarE.K(objQ4);
                }
                boolean z111 = z16;
                int i37 = i28 >> 9;
                l2.a(setB3, b0Var, z15, null, (e23.a) objQ4, z3.f.c(2033210532, new n(str, str2, aVar, str4, z16, f16, aVar11), o0VarE), z3.f.c(-1086248829, new ak0.p(aVar3, 11), o0VarE), o0VarE, 1794048 | (i37 & 896), 8);
                c.f96639a.getClass();
                c0.c(b0Var4, z111, null, null, null, null, c.f96640b, o0VarE, 1572870 | (i37 & 112), 30);
                o0VarE = o0VarE;
                o0VarE.g0(true);
                aVar5 = aVar;
                f15 = f16;
                z18 = z111;
                aVar7 = aVar11;
                aVar6 = aVar3;
            } else {
                o0VarE.e();
                aVar5 = aVar;
                aVar6 = aVar3;
                f15 = f14;
                z18 = z16;
                aVar7 = aVar4;
            }
            p2VarI0 = o0VarE.i0();
            if (p2VarI0 != null) {
                p2VarI0.f135219d = new e23.p() { // from class: j21.o
                    @Override // e23.p
                    public final Object invoke(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        q.a(str, str2, aVar5, str3, z18, z15, aVar7, aVar6, f15, (p3.m) obj, p0.t(i14 | 1), i15);
                        return Unit.INSTANCE;
                    }
                };
            }
        }
        i16 |= 1572864;
        aVar4 = aVar2;
        i19 = i15 & 128;
        if (i19 != 0) {
            i16 |= 12582912;
        } else if ((i14 & 12582912) == 0) {
            if (o0VarE.r(aVar3)) {
                i24 = 8388608;
            } else {
                i24 = 4194304;
            }
            i16 |= i24;
        }
        if ((i14 & 100663296) != 0) {
            i16 |= ((i15 & 256) == 0 || !o0VarE.i(f14)) ? 33554432 : 67108864;
        }
        i25 = i16;
        if ((i16 & 38347923) != 38347922) {
            z17 = true;
        } else {
            z17 = false;
        }
        if (o0VarE.n(i25 & 1, z17)) {
            o0VarE.G0();
            i26 = i14 & 1;
            aVar8 = p3.m.f135153a;
            if (i26 != 0) {
                if (i30 != 0) {
                    aVar9 = null;
                } else {
                    aVar9 = aVar;
                }
                if (i34 != 0) {
                    z16 = false;
                }
                if (i17 != 0) {
                    objQ2 = o0VarE.q();
                    aVar8.getClass();
                    if (objQ2 == p3.m.a.f135155b) {
                        objQ2 = new f(1);
                        o0VarE.K(objQ2);
                    }
                    aVar10 = (e23.a) objQ2;
                } else {
                    aVar10 = aVar4;
                }
                if (i19 != 0) {
                    objQ = o0VarE.q();
                    aVar8.getClass();
                    if (objQ == p3.m.a.f135155b) {
                        objQ = new f(2);
                        o0VarE.K(objQ);
                    }
                    aVar3 = (e23.a) objQ;
                } else {
                    aVar3 = aVar3;
                }
                if ((i15 & 256) != 0) {
                    d92.b.f58623a.getClass();
                    d92.b.f58625c.getClass();
                    i27 = i25 & (-234881025);
                    aVar11 = aVar10;
                    th3 = null;
                    aVar = aVar9;
                    z16 = z16;
                    f16 = j92.b.f97899b.f97920e;
                } else {
                    aVar11 = aVar10;
                    th3 = null;
                    aVar = aVar9;
                    z16 = z16;
                    i27 = i25;
                    f16 = f14;
                }
            } else {
                if (i30 != 0) {
                    aVar9 = null;
                } else {
                    aVar9 = aVar;
                }
                if (i34 != 0) {
                    z16 = false;
                }
                if (i17 != 0) {
                    objQ2 = o0VarE.q();
                    aVar8.getClass();
                    if (objQ2 == p3.m.a.f135155b) {
                        objQ2 = new f(1);
                        o0VarE.K(objQ2);
                    }
                    aVar10 = (e23.a) objQ2;
                } else {
                    aVar10 = aVar4;
                }
                if (i19 != 0) {
                    objQ = o0VarE.q();
                    aVar8.getClass();
                    if (objQ == p3.m.a.f135155b) {
                        objQ = new f(2);
                        o0VarE.K(objQ);
                    }
                    aVar3 = (e23.a) objQ;
                } else {
                    aVar3 = aVar3;
                }
                if ((i15 & 256) != 0) {
                    d92.b.f58623a.getClass();
                    d92.b.f58625c.getClass();
                    i27 = i25 & (-234881025);
                    aVar11 = aVar10;
                    th3 = null;
                    aVar = aVar9;
                    z16 = z16;
                    f16 = j92.b.f97899b.f97920e;
                } else {
                    aVar11 = aVar10;
                    th3 = null;
                    aVar = aVar9;
                    z16 = z16;
                    i27 = i25;
                    f16 = f14;
                }
            }
            o0VarE.h0();
            x1 x1Var4 = p3.n.f135158a;
            objQ3 = o0VarE.q();
            aVar8.getClass();
            c2565a = p3.m.a.f135155b;
            if (objQ3 == c2565a) {
                objQ3 = l0.j(t13.h.f161748a, o0VarE);
                o0VarE.K(objQ3);
            }
            b0Var = (b0) objQ3;
            th4 = th3;
            h4.r rVarF4 = x2.f(h4.r.S, 1.0f);
            c2.j.f22691a.getClass();
            c2.j.k kVar4 = c2.j.f22694d;
            h4.d.f81522a.getClass();
            zVarA = y.a(kVar4, h4.d.a.f81536n, o0VarE, 0);
            iHashCode = Long.hashCode(o0VarE.U);
            i2VarA0 = o0VarE.a0();
            rVarC = h4.k.c(rVarF4, o0VarE);
            h5.g.V.getClass();
            aVar12 = h5.g.a.f81805b;
            i28 = i27;
            if (o0VarE.f135177b != null) {
                p0.l();
                throw th4;
            }
            o0VarE.z();
            if (o0VarE.T) {
                o0VarE.M(aVar12);
            } else {
                o0VarE.c();
            }
            b4.c(h5.g.a.f81810g, zVarA, o0VarE);
            b4.c(h5.g.a.f81809f, i2VarA0, o0VarE);
            bVar = h5.g.a.f81813j;
            if (o0VarE.T) {
                v.h.A(iHashCode, o0VarE, iHashCode, bVar);
            } else {
                v.h.A(iHashCode, o0VarE, iHashCode, bVar);
            }
            b4.c(h5.g.a.f81807d, rVarC, o0VarE);
            c2.b0 b0Var5 = c2.b0.f22601a;
            Set setB4 = a1.b(new c92.b.a(c92.a.DELETE, gl1.y.Q(o0VarE, R.string.lbl_delete)));
            objQ4 = o0VarE.q();
            if (objQ4 == c2565a) {
                objQ4 = new f(3);
                o0VarE.K(objQ4);
            }
            boolean z112 = z16;
            int i38 = i28 >> 9;
            l2.a(setB4, b0Var, z15, null, (e23.a) objQ4, z3.f.c(2033210532, new n(str, str2, aVar, str4, z16, f16, aVar11), o0VarE), z3.f.c(-1086248829, new ak0.p(aVar3, 11), o0VarE), o0VarE, 1794048 | (i38 & 896), 8);
            c.f96639a.getClass();
            c0.c(b0Var5, z112, null, null, null, null, c.f96640b, o0VarE, 1572870 | (i38 & 112), 30);
            o0VarE = o0VarE;
            o0VarE.g0(true);
            aVar5 = aVar;
            f15 = f16;
            z18 = z112;
            aVar7 = aVar11;
            aVar6 = aVar3;
        } else {
            o0VarE.e();
            aVar5 = aVar;
            aVar6 = aVar3;
            f15 = f14;
            z18 = z16;
            aVar7 = aVar4;
        }
        p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new e23.p() { // from class: j21.o
                @Override // e23.p
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    q.a(str, str2, aVar5, str3, z18, z15, aVar7, aVar6, f15, (p3.m) obj, p0.t(i14 | 1), i15);
                    return Unit.INSTANCE;
                }
            };
        }
    }

    /* JADX WARN: Code duplicated, block: B:57:0x00e9  */
    public static final void b(String str, String str2, b92.a aVar, String str3, boolean z14, float f14, e23.a aVar2, p3.m mVar, int i14) throws Throwable {
        Throwable th3;
        String str4;
        o0 o0VarE = mVar.E(-307805050);
        p3.c<?> cVar = o0VarE.f135177b;
        int i15 = i14 | (o0VarE.B(str) ? 4 : 2) | (o0VarE.B(str2) ? 32 : 16) | (o0VarE.B(aVar) ? 256 : 128) | (o0VarE.B(str3) ? 2048 : 1024) | (o0VarE.h(z14) ? 16384 : 8192) | (o0VarE.i(f14) ? 131072 : 65536) | (o0VarE.r(aVar2) ? 1048576 : 524288);
        if (o0VarE.n(i15 & 1, (599187 & i15) != 599186)) {
            o0VarE.G0();
            if ((i14 & 1) != 0 && !o0VarE.o0()) {
                o0VarE.e();
            }
            o0VarE.h0();
            x1 x1Var = p3.n.f135158a;
            String str5 = aVar != null ? aVar.f16961a.get(Constants.ScionAnalytics.PARAM_LABEL) : null;
            if (aVar != null) {
                th3 = null;
                str4 = aVar.f16961a.get("label_secondary");
            } else {
                th3 = null;
                str4 = null;
            }
            h4.r.a aVar3 = h4.r.S;
            String str6 = str5;
            h4.r rVarE = u1.n.e(x2.f(aVar3, 1.0f), am.j.c(d92.b.f58623a, o0VarE), m1.f128891a);
            boolean z15 = (3670016 & i15) == 1048576;
            Object objQ = o0VarE.q();
            if (z15) {
                objQ = new ii0.h(aVar2, 29);
                o0VarE.K(objQ);
            } else {
                p3.m.f135153a.getClass();
                if (objQ == p3.m.a.f135155b) {
                    objQ = new ii0.h(aVar2, 29);
                    o0VarE.K(objQ);
                }
            }
            h4.r rVarD = w.d(rVarE, false, null, null, (e23.a) objQ, 15);
            j92.b bVar = d92.b.f58625c;
            bVar.getClass();
            j92.e eVar = j92.b.f97899b;
            h4.r rVarA = c2.l.A(rVarD, 0.0f, eVar.f97920e, 1);
            bVar.getClass();
            h4.r rVarC = c2.l.C(rVarA, f14, 0.0f, eVar.f97920e, 0.0f, 10);
            h4.d.f81522a.getClass();
            h4.g.b bVar2 = h4.d.a.f81534l;
            c2.j.f22691a.getClass();
            s2 s2VarA = q2.a(c2.j.f22692b, bVar2, o0VarE, 48);
            int iHashCode = Long.hashCode(o0VarE.U);
            i2 i2VarA0 = o0VarE.a0();
            h4.r rVarC2 = h4.k.c(rVarC, o0VarE);
            h5.g.V.getClass();
            e0.a aVar4 = h5.g.a.f81805b;
            if (cVar == null) {
                p0.l();
                throw th3;
            }
            o0VarE.z();
            if (o0VarE.T) {
                o0VarE.M(aVar4);
            } else {
                o0VarE.c();
            }
            h5.g.a.e eVar2 = h5.g.a.f81810g;
            b4.c(eVar2, s2VarA, o0VarE);
            h5.g.a.C1623g c1623g = h5.g.a.f81809f;
            b4.c(c1623g, i2VarA0, o0VarE);
            h5.g.a.b bVar3 = h5.g.a.f81813j;
            if (o0VarE.T || !p005kotlin.jvm.internal.s.g(o0VarE.q(), Integer.valueOf(iHashCode))) {
                v.h.A(iHashCode, o0VarE, iHashCode, bVar3);
            }
            h5.g.a.f fVar = h5.g.a.f81807d;
            b4.c(fVar, rVarC2, o0VarE);
            u2 u2Var = u2.f22900a;
            bVar.getClass();
            float f15 = j92.b.f97901d.f97906e;
            bVar.getClass();
            int i16 = i15 >> 9;
            y01.h.a(str3, f15, eVar.f97918c, o0VarE, i16 & 14);
            bVar.getClass();
            c2.l.f(x2.u(aVar3, eVar.f97919d), o0VarE);
            h4.r rVarA2 = u2Var.a(aVar3, 1.0f, true);
            z zVarA = y.a(c2.j.f22694d, h4.d.a.f81536n, o0VarE, 0);
            int iHashCode2 = Long.hashCode(o0VarE.U);
            i2 i2VarA1 = o0VarE.a0();
            h4.r rVarC3 = h4.k.c(rVarA2, o0VarE);
            if (cVar == null) {
                p0.l();
                throw th3;
            }
            o0VarE.z();
            if (o0VarE.T) {
                o0VarE.M(aVar4);
            } else {
                o0VarE.c();
            }
            b4.c(eVar2, zVarA, o0VarE);
            b4.c(c1623g, i2VarA1, o0VarE);
            if (o0VarE.T || !p005kotlin.jvm.internal.s.g(o0VarE.q(), Integer.valueOf(iHashCode2))) {
                v.h.A(iHashCode2, o0VarE, iHashCode2, bVar3);
            }
            b4.c(fVar, rVarC3, o0VarE);
            c2.b0 b0Var = c2.b0.f22601a;
            j92.f fVar2 = d92.b.f58624b;
            fVar2.getClass();
            mh.c(str, v2.a(aVar3, str6 != null, new as.s(str6, 29), o0VarE, 6), 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.b(j92.f.f97931h, o0VarE), o0VarE, i15 & 14, 0, 131068);
            fVar2.getClass();
            mh.c(str2, v2.a(aVar3, str4 != null, new p(str4, 0), o0VarE, 6), 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.f(j92.f.f97933j, o0VarE), o0VarE, (i15 >> 3) & 14, 0, 131068);
            o0VarE = o0VarE;
            o0VarE.g0(true);
            c.f96639a.getClass();
            c0.d(u2Var, z14, null, null, null, null, c.f96641c, o0VarE, 1572870 | (i16 & 112), 30);
            o0VarE.g0(true);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new n(str, str2, aVar, str3, z14, f14, aVar2, i14);
        }
    }
}
