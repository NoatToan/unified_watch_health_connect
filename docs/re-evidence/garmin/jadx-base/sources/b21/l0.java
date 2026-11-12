package b21;

import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.group.details.about.member.GroupTransferOwnershipActivity;
import com.garmin.android.apps.connectmobile.nutrition.presentation.NutritionActivity;
import com.garmin.device.filetransfer.DataSourceModifiedException;
import com.garmin.proto.generated.GDIInReachMessaging;
import com.google.android.exoplayer2.extractor.ts.PsExtractor;
import i3.fe;
import i3.kb;
import i3.mc;
import i3.mh;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.joda.time.DateTime;
import org.joda.time.DateTimeConstants;
import org.koin.java.KoinJavaComponent;
import org.slf4j.Logger;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class l0 implements e23.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f14816a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f14817b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f14818c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f14819d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f14820e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f14821f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Object f14822g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ Object f14823h;

    public /* synthetic */ l0(e23.p pVar, lk2.a0 a0Var, p005kotlin.jvm.internal.r0 r0Var, dz2.b bVar, com.garmin.device.filetransfer.a aVar, String str, lk2.c0 c0Var) {
        this.f14816a = 19;
        this.f14818c = pVar;
        this.f14819d = a0Var;
        this.f14820e = r0Var;
        this.f14821f = bVar;
        this.f14822g = aVar;
        this.f14817b = str;
        this.f14823h = c0Var;
    }

    /* JADX WARN: Code duplicated, block: B:101:0x040f  */
    /* JADX WARN: Code duplicated, block: B:102:0x0413  */
    /* JADX WARN: Code duplicated, block: B:105:0x041c  */
    /* JADX WARN: Code duplicated, block: B:106:0x0420  */
    /* JADX WARN: Code duplicated, block: B:109:0x043c  */
    /* JADX WARN: Code duplicated, block: B:111:0x0443  */
    /* JADX WARN: Code duplicated, block: B:114:0x045b  */
    /* JADX WARN: Code duplicated, block: B:116:0x0462  */
    /* JADX WARN: Code duplicated, block: B:118:0x0481  */
    /* JADX WARN: Code duplicated, block: B:119:0x048b  */
    /* JADX WARN: Code duplicated, block: B:24:0x0102  */
    /* JADX WARN: Code duplicated, block: B:26:0x010b  */
    /* JADX WARN: Code duplicated, block: B:27:0x010f  */
    /* JADX WARN: Code duplicated, block: B:32:0x012c  */
    /* JADX WARN: Code duplicated, block: B:35:0x01e5  */
    /* JADX WARN: Code duplicated, block: B:38:0x01ef  */
    /* JADX WARN: Code duplicated, block: B:42:0x020a  */
    /* JADX WARN: Code duplicated, block: B:44:0x0211  */
    /* JADX WARN: Code duplicated, block: B:47:0x0258  */
    /* JADX WARN: Code duplicated, block: B:49:0x025f  */
    /* JADX WARN: Code duplicated, block: B:51:0x0264  */
    /* JADX WARN: Code duplicated, block: B:52:0x0267  */
    /* JADX WARN: Code duplicated, block: B:56:0x0292  */
    /* JADX WARN: Code duplicated, block: B:59:0x029a  */
    /* JADX WARN: Code duplicated, block: B:60:0x029d  */
    /* JADX WARN: Code duplicated, block: B:62:0x02a6  */
    /* JADX WARN: Code duplicated, block: B:63:0x02a8  */
    /* JADX WARN: Code duplicated, block: B:67:0x02c0  */
    /* JADX WARN: Code duplicated, block: B:69:0x02c7  */
    /* JADX WARN: Code duplicated, block: B:72:0x032f  */
    /* JADX WARN: Code duplicated, block: B:74:0x0355  */
    /* JADX WARN: Code duplicated, block: B:76:0x035c  */
    /* JADX WARN: Code duplicated, block: B:79:0x0399  */
    /* JADX WARN: Code duplicated, block: B:81:0x03a0  */
    /* JADX WARN: Code duplicated, block: B:84:0x03b8  */
    /* JADX WARN: Code duplicated, block: B:86:0x03bf  */
    /* JADX WARN: Code duplicated, block: B:88:0x03de  */
    /* JADX WARN: Code duplicated, block: B:91:0x03f3  */
    /* JADX WARN: Code duplicated, block: B:93:0x03fd  */
    /* JADX WARN: Code duplicated, block: B:95:0x0401  */
    /* JADX WARN: Code duplicated, block: B:97:0x0406  */
    /* JADX WARN: Code duplicated, block: B:99:0x040a  */
    /* JADX WARN: Multi-variable type inference failed */
    private final Object a(Object obj, Object obj2) {
        e23.l lVar;
        e23.l lVar2;
        h5.g.a.f fVar;
        c2.b0 b0Var;
        c2.z zVarA;
        int iHashCode;
        p3.i2 i2VarX;
        h4.r rVarC;
        int i14;
        int i15;
        n02.g gVar;
        c22.l3.a aVar;
        boolean zK;
        Object objQ;
        p3.m.a aVar2;
        o51.j jVar;
        boolean zB;
        Object objQ2;
        Context context;
        boolean zK2;
        Object objQ3;
        boolean z14;
        Context context2;
        boolean zK3;
        Object objQ4;
        boolean z15;
        boolean zB2;
        Object objQ5;
        p3.m mVar;
        n02.g gVar2;
        int i16;
        int i17;
        int i18;
        int i19;
        e23.l lVar3;
        boolean zB3;
        Object objQ6;
        boolean zB4;
        Object objQ7;
        String strP;
        boolean zB5;
        Object objQ8;
        e23.l lVar4;
        boolean zB6;
        Object objQ9;
        boolean zB7;
        Object objQ10;
        o51.j jVar2 = (o51.j) this.f14818c;
        p3.p1 p1Var = (p3.p1) this.f14819d;
        e23.l lVar5 = (e23.l) this.f14820e;
        p3.p1 p1Var2 = (p3.p1) this.f14821f;
        e23.l lVar6 = (e23.l) this.f14822g;
        e23.a aVar3 = (e23.a) this.f14823h;
        Context context3 = (Context) this.f14817b;
        p3.m mVar2 = (p3.m) obj;
        int iIntValue = ((Integer) obj2).intValue();
        if (mVar2.n(iIntValue & 1, (iIntValue & 3) != 2)) {
            p3.x1 x1Var = p3.n.f135158a;
            h4.r.a aVar4 = h4.r.S;
            h4.r rVarD = c2.x2.d(aVar4, 1.0f);
            h4.d.f81522a.getClass();
            h4.g.a aVar5 = h4.d.a.f81537o;
            c2.j jVar3 = c2.j.f22691a;
            d92.b.f58623a.getClass();
            d92.b.f58625c.getClass();
            j92.e eVar = j92.b.f97899b;
            float f14 = eVar.f97917b;
            jVar3.getClass();
            c2.z zVarA2 = c2.y.a(c2.j.i(f14), aVar5, mVar2, 48);
            int iHashCode2 = Long.hashCode(mVar2.getU());
            p3.i2 i2VarX2 = mVar2.x();
            h4.r rVarC2 = h4.k.c(rVarD, mVar2);
            h5.g.V.getClass();
            h5.e0.a aVar6 = h5.g.a.f81805b;
            if (mVar2.F() == null) {
                p3.p0.l();
                throw null;
            }
            mVar2.z();
            if (mVar2.getT()) {
                mVar2.M(aVar6);
            } else {
                mVar2.c();
            }
            h5.g.a.e eVar2 = h5.g.a.f81810g;
            p3.b4.c(eVar2, zVarA2, mVar2);
            h5.g.a.C1623g c1623g = h5.g.a.f81809f;
            p3.b4.c(c1623g, i2VarX2, mVar2);
            h5.g.a.b bVar = h5.g.a.f81813j;
            if (mVar2.getT()) {
                lVar = lVar5;
                lVar2 = lVar6;
            } else {
                lVar2 = lVar6;
                lVar = lVar5;
                if (!p005kotlin.jvm.internal.s.g(mVar2.q(), Integer.valueOf(iHashCode2))) {
                }
                fVar = h5.g.a.f81807d;
                p3.b4.c(fVar, rVarC2, mVar2);
                b0Var = c2.b0.f22601a;
                h4.r rVarB = u1.a2.b(b0Var.a(aVar4, 1.0f, true), u1.a2.a(mVar2), true);
                zVarA = c2.y.a(c2.j.f22694d, aVar5, mVar2, 48);
                iHashCode = Long.hashCode(mVar2.getU());
                i2VarX = mVar2.x();
                rVarC = h4.k.c(rVarB, mVar2);
                if (mVar2.F() != null) {
                    p3.p0.l();
                    throw null;
                }
                mVar2.z();
                if (mVar2.getT()) {
                    mVar2.M(aVar6);
                } else {
                    mVar2.c();
                }
                p3.b4.c(eVar2, zVarA, mVar2);
                p3.b4.c(c1623g, i2VarX, mVar2);
                if (mVar2.getT() || !p005kotlin.jvm.internal.s.g(mVar2.q(), Integer.valueOf(iHashCode))) {
                    v.h.z(iHashCode, mVar2, iHashCode, bVar);
                }
                p3.b4.c(fVar, rVarC, mVar2);
                h4.r rVarC3 = c2.l.C(c2.l.A(aVar4, eVar.f97921f, 0.0f, 2), 0.0f, eVar.f97921f, 0.0f, 0.0f, 13);
                String strQ = gl1.y.Q(mVar2, R.string.pacepro_time_pace_goals_message);
                d92.b.f58624b.getClass();
                s5.x0 x0VarF = d92.c.f(j92.f.f97931h, mVar2);
                d6.h.f57752b.getClass();
                mh.c(strQ, rVarC3, 0L, null, 0L, null, 0L, d6.h.a(d6.h.f57755e), 0L, 0, false, 0, 0, null, x0VarF, mVar2, 0, 0, 130044);
                c2.l.f(b0Var.a(aVar4, 1.0f, true), mVar2);
                h4.r rVarC4 = c2.l.C(c2.x2.f(aVar4, 0.4f), 0.0f, 0.0f, 0.0f, eVar.f97922g, 7);
                String strQ2 = gl1.y.Q(mVar2, R.string.pacepro_lbl_plan_goal_time);
                jVar2.getClass();
                i14 = jVar2.f129276e;
                i15 = jVar2.f129275d;
                gVar = jVar2.f129274c;
                aVar = c22.l3.f23124b;
                long j8 = i15;
                aVar.getClass();
                String strB1 = c22.l3.a.b1(1000 * j8);
                p3.y3 y3Var = AndroidCompositionLocals_androidKt.f6042b;
                Context context4 = (Context) mVar2.A(y3Var);
                zK = mVar2.k(i15);
                objQ = mVar2.q();
                aVar2 = p3.m.f135153a;
                if (zK) {
                    jVar = jVar2;
                } else {
                    aVar2.getClass();
                    jVar = jVar2;
                    if (objQ == p3.m.a.f135155b) {
                    }
                    String str = (String) objQ;
                    zB = mVar2.B(p1Var);
                    objQ2 = mVar2.q();
                    if (zB) {
                        objQ2 = new i11.i(p1Var, 6);
                        mVar2.K(objQ2);
                    } else {
                        aVar2.getClass();
                        if (objQ2 == p3.m.a.f135155b) {
                            objQ2 = new i11.i(p1Var, 6);
                            mVar2.K(objQ2);
                        }
                    }
                    i51.g.a(0, (e23.a) objQ2, rVarC4, strQ2, strB1, str, mVar2);
                    h4.r rVarF = c2.x2.f(aVar4, 0.4f);
                    String strQ3 = gl1.y.Q(mVar2, R.string.lbl_course_goal_pace);
                    context = (Context) mVar2.A(y3Var);
                    zK2 = mVar2.k(i14) | mVar2.k(gVar.ordinal());
                    objQ3 = mVar2.q();
                    if (zK2) {
                        double d14 = i14;
                        if (gVar == n02.g.KILOMETERS) {
                            z14 = true;
                        } else {
                            z14 = false;
                        }
                        objQ3 = c22.l3.a.y0(aVar, context, d14, z14, true);
                        mVar2.K(objQ3);
                    } else {
                        aVar2.getClass();
                        if (objQ3 == p3.m.a.f135155b) {
                            double d15 = i14;
                            if (gVar == n02.g.KILOMETERS) {
                                z14 = true;
                            } else {
                                z14 = false;
                            }
                            objQ3 = c22.l3.a.y0(aVar, context, d15, z14, true);
                            mVar2.K(objQ3);
                        }
                    }
                    String str2 = (String) objQ3;
                    context2 = (Context) mVar2.A(y3Var);
                    zK3 = mVar2.k(i14) | mVar2.k(gVar.ordinal());
                    objQ4 = mVar2.q();
                    if (zK3) {
                        j51.a aVar7 = j51.a.f97057a;
                        long j14 = i14;
                        if (gVar == n02.g.KILOMETERS) {
                            z15 = true;
                        } else {
                            z15 = false;
                        }
                        aVar7.getClass();
                        objQ4 = j51.a.c(context2, j14, z15);
                        mVar2.K(objQ4);
                    } else {
                        aVar2.getClass();
                        if (objQ4 == p3.m.a.f135155b) {
                            j51.a aVar8 = j51.a.f97057a;
                            long j15 = i14;
                            if (gVar == n02.g.KILOMETERS) {
                                z15 = true;
                            } else {
                                z15 = false;
                            }
                            aVar8.getClass();
                            objQ4 = j51.a.c(context2, j15, z15);
                            mVar2.K(objQ4);
                        }
                    }
                    String str3 = (String) objQ4;
                    zB2 = mVar2.B(p1Var2);
                    objQ5 = mVar2.q();
                    if (zB2) {
                        objQ5 = new i11.i(p1Var2, 7);
                        mVar2.K(objQ5);
                    } else {
                        aVar2.getClass();
                        if (objQ5 == p3.m.a.f135155b) {
                            objQ5 = new i11.i(p1Var2, 7);
                            mVar2.K(objQ5);
                        }
                    }
                    i51.g.a(384, (e23.a) objQ5, rVarF, strQ3, str2, str3, mVar2);
                    mVar = mVar2;
                    c2.l.f(b0Var.a(aVar4, 1.0f, true), mVar);
                    mVar.y();
                    l72.f0.f110999a.d(0, 9, aVar3, c2.l.C(c2.l.A(c2.x2.f(aVar4, 1.0f), eVar.f97920e, 0.0f, 2), 0.0f, 0.0f, 0.0f, eVar.f97918c, 7), gl1.y.Q(mVar, R.string.lbl_next), mVar, null, false);
                    mVar.y();
                    if (((Boolean) p1Var.getF182175a()).booleanValue()) {
                        mVar.C(-1740665676);
                        strP = gl1.y.P(R.string.value_parenthesis_value, new Object[]{gl1.y.Q(mVar, R.string.pacepro_lbl_plan_goal_time), gl1.y.Q(mVar, R.string.hour_minute_second_format)}, mVar);
                        zB5 = mVar.B(strP);
                        objQ8 = mVar.q();
                        if (zB5) {
                            oi0.b bVar2 = new oi0.b(new l22.a(context3), strP);
                            bVar2.o();
                            objQ8 = bVar2.f132238b;
                            mVar.K(objQ8);
                        } else {
                            aVar2.getClass();
                            if (objQ8 == p3.m.a.f135155b) {
                                oi0.b bVar3 = new oi0.b(new l22.a(context3), strP);
                                bVar3.o();
                                objQ8 = bVar3.f132238b;
                                mVar.K(objQ8);
                            }
                        }
                        String str4 = (String) objQ8;
                        int iD = jVar.d();
                        int iC = jVar.c();
                        int iE = j23.t.e(i15, jVar.d(), jVar.c());
                        lVar4 = lVar;
                        zB6 = mVar.B(p1Var) | mVar.B(lVar4);
                        objQ9 = mVar.q();
                        if (zB6) {
                            objQ9 = new a11.b0(lVar4, p1Var, 13);
                            mVar.K(objQ9);
                        } else {
                            aVar2.getClass();
                            if (objQ9 == p3.m.a.f135155b) {
                                objQ9 = new a11.b0(lVar4, p1Var, 13);
                                mVar.K(objQ9);
                            }
                        }
                        e23.l lVar7 = (e23.l) objQ9;
                        zB7 = mVar.B(p1Var);
                        objQ10 = mVar.q();
                        if (zB7) {
                            objQ10 = new i11.i(p1Var, 8);
                            mVar.K(objQ10);
                        } else {
                            aVar2.getClass();
                            if (objQ10 == p3.m.a.f135155b) {
                                objQ10 = new i11.i(p1Var, 8);
                                mVar.K(objQ10);
                            }
                        }
                        n02.j.a(iD, iC, iE, false, strP, str4, null, lVar7, (e23.a) objQ10, mVar, 0);
                        mVar = mVar;
                        mVar.f();
                    } else {
                        mVar.C(-1739483646);
                        mVar.f();
                    }
                    if (((Boolean) p1Var2.getF182175a()).booleanValue()) {
                        mVar.C(-1739398706);
                        gVar2 = n02.g.KILOMETERS;
                        if (gVar == gVar2) {
                            i16 = 149;
                        } else {
                            i16 = PsExtractor.VIDEO_STREAM_MASK;
                        }
                        int i24 = i16;
                        if (gVar == gVar2) {
                            i17 = 2237;
                        } else {
                            i17 = DateTimeConstants.SECONDS_PER_HOUR;
                        }
                        int i25 = i17;
                        if (gVar == gVar2) {
                            i18 = R.string.lbl_minute_per_km;
                        } else {
                            i18 = R.string.lbl_minute_per_mile;
                        }
                        String strQ4 = gl1.y.Q(mVar, i18);
                        if (gVar == gVar2) {
                            i19 = R.string.lbl_minutes_per_kilometer;
                        } else {
                            i19 = R.string.lbl_minutes_per_mile;
                        }
                        String strQ5 = gl1.y.Q(mVar, i19);
                        int iE2 = j23.t.e(i14, i24, i25);
                        lVar3 = lVar2;
                        zB3 = mVar.B(p1Var2) | mVar.B(lVar3);
                        objQ6 = mVar.q();
                        if (zB3) {
                            objQ6 = new a11.b0(lVar3, p1Var2, 14);
                            mVar.K(objQ6);
                        } else {
                            aVar2.getClass();
                            if (objQ6 == p3.m.a.f135155b) {
                                objQ6 = new a11.b0(lVar3, p1Var2, 14);
                                mVar.K(objQ6);
                            }
                        }
                        e23.l lVar8 = (e23.l) objQ6;
                        zB4 = mVar.B(p1Var2);
                        objQ7 = mVar.q();
                        if (zB4) {
                            objQ7 = new i11.i(p1Var2, 9);
                            mVar.K(objQ7);
                        } else {
                            aVar2.getClass();
                            if (objQ7 == p3.m.a.f135155b) {
                                objQ7 = new i11.i(p1Var2, 9);
                                mVar.K(objQ7);
                            }
                        }
                        p3.m mVar3 = mVar;
                        n02.k.a(i24, i25, iE2, false, strQ4, strQ5, null, lVar8, (e23.a) objQ7, mVar3, 0);
                        mVar3.f();
                    } else {
                        mVar.C(-1737811134);
                        mVar.f();
                    }
                }
                objQ = new oi0.h(context4).d(j8, true);
                mVar2.K(objQ);
                String str5 = (String) objQ;
                zB = mVar2.B(p1Var);
                objQ2 = mVar2.q();
                if (zB) {
                    aVar2.getClass();
                    if (objQ2 == p3.m.a.f135155b) {
                        objQ2 = new i11.i(p1Var, 6);
                        mVar2.K(objQ2);
                    }
                } else {
                    objQ2 = new i11.i(p1Var, 6);
                    mVar2.K(objQ2);
                }
                i51.g.a(0, (e23.a) objQ2, rVarC4, strQ2, strB1, str5, mVar2);
                h4.r rVarF2 = c2.x2.f(aVar4, 0.4f);
                String strQ6 = gl1.y.Q(mVar2, R.string.lbl_course_goal_pace);
                context = (Context) mVar2.A(y3Var);
                zK2 = mVar2.k(i14) | mVar2.k(gVar.ordinal());
                objQ3 = mVar2.q();
                if (zK2) {
                    aVar2.getClass();
                    if (objQ3 == p3.m.a.f135155b) {
                        double d16 = i14;
                        if (gVar == n02.g.KILOMETERS) {
                            z14 = true;
                        } else {
                            z14 = false;
                        }
                        objQ3 = c22.l3.a.y0(aVar, context, d16, z14, true);
                        mVar2.K(objQ3);
                    }
                } else {
                    double d17 = i14;
                    if (gVar == n02.g.KILOMETERS) {
                        z14 = true;
                    } else {
                        z14 = false;
                    }
                    objQ3 = c22.l3.a.y0(aVar, context, d17, z14, true);
                    mVar2.K(objQ3);
                }
                String str6 = (String) objQ3;
                context2 = (Context) mVar2.A(y3Var);
                zK3 = mVar2.k(i14) | mVar2.k(gVar.ordinal());
                objQ4 = mVar2.q();
                if (zK3) {
                    aVar2.getClass();
                    if (objQ4 == p3.m.a.f135155b) {
                        j51.a aVar9 = j51.a.f97057a;
                        long j16 = i14;
                        if (gVar == n02.g.KILOMETERS) {
                            z15 = true;
                        } else {
                            z15 = false;
                        }
                        aVar9.getClass();
                        objQ4 = j51.a.c(context2, j16, z15);
                        mVar2.K(objQ4);
                    }
                } else {
                    j51.a aVar10 = j51.a.f97057a;
                    long j17 = i14;
                    if (gVar == n02.g.KILOMETERS) {
                        z15 = true;
                    } else {
                        z15 = false;
                    }
                    aVar10.getClass();
                    objQ4 = j51.a.c(context2, j17, z15);
                    mVar2.K(objQ4);
                }
                String str7 = (String) objQ4;
                zB2 = mVar2.B(p1Var2);
                objQ5 = mVar2.q();
                if (zB2) {
                    aVar2.getClass();
                    if (objQ5 == p3.m.a.f135155b) {
                        objQ5 = new i11.i(p1Var2, 7);
                        mVar2.K(objQ5);
                    }
                } else {
                    objQ5 = new i11.i(p1Var2, 7);
                    mVar2.K(objQ5);
                }
                i51.g.a(384, (e23.a) objQ5, rVarF2, strQ6, str6, str7, mVar2);
                mVar = mVar2;
                c2.l.f(b0Var.a(aVar4, 1.0f, true), mVar);
                mVar.y();
                l72.f0.f110999a.d(0, 9, aVar3, c2.l.C(c2.l.A(c2.x2.f(aVar4, 1.0f), eVar.f97920e, 0.0f, 2), 0.0f, 0.0f, 0.0f, eVar.f97918c, 7), gl1.y.Q(mVar, R.string.lbl_next), mVar, null, false);
                mVar.y();
                if (((Boolean) p1Var.getF182175a()).booleanValue()) {
                    mVar.C(-1740665676);
                    strP = gl1.y.P(R.string.value_parenthesis_value, new Object[]{gl1.y.Q(mVar, R.string.pacepro_lbl_plan_goal_time), gl1.y.Q(mVar, R.string.hour_minute_second_format)}, mVar);
                    zB5 = mVar.B(strP);
                    objQ8 = mVar.q();
                    if (zB5) {
                        aVar2.getClass();
                        if (objQ8 == p3.m.a.f135155b) {
                            oi0.b bVar4 = new oi0.b(new l22.a(context3), strP);
                            bVar4.o();
                            objQ8 = bVar4.f132238b;
                            mVar.K(objQ8);
                        }
                    } else {
                        oi0.b bVar5 = new oi0.b(new l22.a(context3), strP);
                        bVar5.o();
                        objQ8 = bVar5.f132238b;
                        mVar.K(objQ8);
                    }
                    String str8 = (String) objQ8;
                    int iD2 = jVar.d();
                    int iC2 = jVar.c();
                    int iE3 = j23.t.e(i15, jVar.d(), jVar.c());
                    lVar4 = lVar;
                    zB6 = mVar.B(p1Var) | mVar.B(lVar4);
                    objQ9 = mVar.q();
                    if (zB6) {
                        aVar2.getClass();
                        if (objQ9 == p3.m.a.f135155b) {
                            objQ9 = new a11.b0(lVar4, p1Var, 13);
                            mVar.K(objQ9);
                        }
                    } else {
                        objQ9 = new a11.b0(lVar4, p1Var, 13);
                        mVar.K(objQ9);
                    }
                    e23.l lVar9 = (e23.l) objQ9;
                    zB7 = mVar.B(p1Var);
                    objQ10 = mVar.q();
                    if (zB7) {
                        aVar2.getClass();
                        if (objQ10 == p3.m.a.f135155b) {
                            objQ10 = new i11.i(p1Var, 8);
                            mVar.K(objQ10);
                        }
                    } else {
                        objQ10 = new i11.i(p1Var, 8);
                        mVar.K(objQ10);
                    }
                    n02.j.a(iD2, iC2, iE3, false, strP, str8, null, lVar9, (e23.a) objQ10, mVar, 0);
                    mVar = mVar;
                    mVar.f();
                } else {
                    mVar.C(-1739483646);
                    mVar.f();
                }
                if (((Boolean) p1Var2.getF182175a()).booleanValue()) {
                    mVar.C(-1739398706);
                    gVar2 = n02.g.KILOMETERS;
                    if (gVar == gVar2) {
                        i16 = 149;
                    } else {
                        i16 = PsExtractor.VIDEO_STREAM_MASK;
                    }
                    int i26 = i16;
                    if (gVar == gVar2) {
                        i17 = 2237;
                    } else {
                        i17 = DateTimeConstants.SECONDS_PER_HOUR;
                    }
                    int i27 = i17;
                    if (gVar == gVar2) {
                        i18 = R.string.lbl_minute_per_km;
                    } else {
                        i18 = R.string.lbl_minute_per_mile;
                    }
                    String strQ7 = gl1.y.Q(mVar, i18);
                    if (gVar == gVar2) {
                        i19 = R.string.lbl_minutes_per_kilometer;
                    } else {
                        i19 = R.string.lbl_minutes_per_mile;
                    }
                    String strQ8 = gl1.y.Q(mVar, i19);
                    int iE4 = j23.t.e(i14, i26, i27);
                    lVar3 = lVar2;
                    zB3 = mVar.B(p1Var2) | mVar.B(lVar3);
                    objQ6 = mVar.q();
                    if (zB3) {
                        aVar2.getClass();
                        if (objQ6 == p3.m.a.f135155b) {
                            objQ6 = new a11.b0(lVar3, p1Var2, 14);
                            mVar.K(objQ6);
                        }
                    } else {
                        objQ6 = new a11.b0(lVar3, p1Var2, 14);
                        mVar.K(objQ6);
                    }
                    e23.l lVar10 = (e23.l) objQ6;
                    zB4 = mVar.B(p1Var2);
                    objQ7 = mVar.q();
                    if (zB4) {
                        aVar2.getClass();
                        if (objQ7 == p3.m.a.f135155b) {
                            objQ7 = new i11.i(p1Var2, 9);
                            mVar.K(objQ7);
                        }
                    } else {
                        objQ7 = new i11.i(p1Var2, 9);
                        mVar.K(objQ7);
                    }
                    p3.m mVar4 = mVar;
                    n02.k.a(i26, i27, iE4, false, strQ7, strQ8, null, lVar10, (e23.a) objQ7, mVar4, 0);
                    mVar4.f();
                } else {
                    mVar.C(-1737811134);
                    mVar.f();
                }
            }
            v.h.z(iHashCode2, mVar2, iHashCode2, bVar);
            fVar = h5.g.a.f81807d;
            p3.b4.c(fVar, rVarC2, mVar2);
            b0Var = c2.b0.f22601a;
            h4.r rVarB2 = u1.a2.b(b0Var.a(aVar4, 1.0f, true), u1.a2.a(mVar2), true);
            zVarA = c2.y.a(c2.j.f22694d, aVar5, mVar2, 48);
            iHashCode = Long.hashCode(mVar2.getU());
            i2VarX = mVar2.x();
            rVarC = h4.k.c(rVarB2, mVar2);
            if (mVar2.F() != null) {
                p3.p0.l();
                throw null;
            }
            mVar2.z();
            if (mVar2.getT()) {
                mVar2.M(aVar6);
            } else {
                mVar2.c();
            }
            p3.b4.c(eVar2, zVarA, mVar2);
            p3.b4.c(c1623g, i2VarX, mVar2);
            if (mVar2.getT()) {
                v.h.z(iHashCode, mVar2, iHashCode, bVar);
            } else {
                v.h.z(iHashCode, mVar2, iHashCode, bVar);
            }
            p3.b4.c(fVar, rVarC, mVar2);
            h4.r rVarC5 = c2.l.C(c2.l.A(aVar4, eVar.f97921f, 0.0f, 2), 0.0f, eVar.f97921f, 0.0f, 0.0f, 13);
            String strQ9 = gl1.y.Q(mVar2, R.string.pacepro_time_pace_goals_message);
            d92.b.f58624b.getClass();
            s5.x0 x0VarF2 = d92.c.f(j92.f.f97931h, mVar2);
            d6.h.f57752b.getClass();
            mh.c(strQ9, rVarC5, 0L, null, 0L, null, 0L, d6.h.a(d6.h.f57755e), 0L, 0, false, 0, 0, null, x0VarF2, mVar2, 0, 0, 130044);
            c2.l.f(b0Var.a(aVar4, 1.0f, true), mVar2);
            h4.r rVarC6 = c2.l.C(c2.x2.f(aVar4, 0.4f), 0.0f, 0.0f, 0.0f, eVar.f97922g, 7);
            String strQ10 = gl1.y.Q(mVar2, R.string.pacepro_lbl_plan_goal_time);
            jVar2.getClass();
            i14 = jVar2.f129276e;
            i15 = jVar2.f129275d;
            gVar = jVar2.f129274c;
            aVar = c22.l3.f23124b;
            long j18 = i15;
            aVar.getClass();
            String strB2 = c22.l3.a.b1(1000 * j18);
            p3.y3 y3Var2 = AndroidCompositionLocals_androidKt.f6042b;
            Context context5 = (Context) mVar2.A(y3Var2);
            zK = mVar2.k(i15);
            objQ = mVar2.q();
            aVar2 = p3.m.f135153a;
            if (zK) {
                aVar2.getClass();
                jVar = jVar2;
                if (objQ == p3.m.a.f135155b) {
                }
                String str9 = (String) objQ;
                zB = mVar2.B(p1Var);
                objQ2 = mVar2.q();
                if (zB) {
                    aVar2.getClass();
                    if (objQ2 == p3.m.a.f135155b) {
                        objQ2 = new i11.i(p1Var, 6);
                        mVar2.K(objQ2);
                    }
                } else {
                    objQ2 = new i11.i(p1Var, 6);
                    mVar2.K(objQ2);
                }
                i51.g.a(0, (e23.a) objQ2, rVarC6, strQ10, strB2, str9, mVar2);
                h4.r rVarF3 = c2.x2.f(aVar4, 0.4f);
                String strQ11 = gl1.y.Q(mVar2, R.string.lbl_course_goal_pace);
                context = (Context) mVar2.A(y3Var2);
                zK2 = mVar2.k(i14) | mVar2.k(gVar.ordinal());
                objQ3 = mVar2.q();
                if (zK2) {
                    aVar2.getClass();
                    if (objQ3 == p3.m.a.f135155b) {
                        double d18 = i14;
                        if (gVar == n02.g.KILOMETERS) {
                            z14 = true;
                        } else {
                            z14 = false;
                        }
                        objQ3 = c22.l3.a.y0(aVar, context, d18, z14, true);
                        mVar2.K(objQ3);
                    }
                } else {
                    double d19 = i14;
                    if (gVar == n02.g.KILOMETERS) {
                        z14 = true;
                    } else {
                        z14 = false;
                    }
                    objQ3 = c22.l3.a.y0(aVar, context, d19, z14, true);
                    mVar2.K(objQ3);
                }
                String str10 = (String) objQ3;
                context2 = (Context) mVar2.A(y3Var2);
                zK3 = mVar2.k(i14) | mVar2.k(gVar.ordinal());
                objQ4 = mVar2.q();
                if (zK3) {
                    aVar2.getClass();
                    if (objQ4 == p3.m.a.f135155b) {
                        j51.a aVar11 = j51.a.f97057a;
                        long j19 = i14;
                        if (gVar == n02.g.KILOMETERS) {
                            z15 = true;
                        } else {
                            z15 = false;
                        }
                        aVar11.getClass();
                        objQ4 = j51.a.c(context2, j19, z15);
                        mVar2.K(objQ4);
                    }
                } else {
                    j51.a aVar12 = j51.a.f97057a;
                    long j110 = i14;
                    if (gVar == n02.g.KILOMETERS) {
                        z15 = true;
                    } else {
                        z15 = false;
                    }
                    aVar12.getClass();
                    objQ4 = j51.a.c(context2, j110, z15);
                    mVar2.K(objQ4);
                }
                String str11 = (String) objQ4;
                zB2 = mVar2.B(p1Var2);
                objQ5 = mVar2.q();
                if (zB2) {
                    aVar2.getClass();
                    if (objQ5 == p3.m.a.f135155b) {
                        objQ5 = new i11.i(p1Var2, 7);
                        mVar2.K(objQ5);
                    }
                } else {
                    objQ5 = new i11.i(p1Var2, 7);
                    mVar2.K(objQ5);
                }
                i51.g.a(384, (e23.a) objQ5, rVarF3, strQ11, str10, str11, mVar2);
                mVar = mVar2;
                c2.l.f(b0Var.a(aVar4, 1.0f, true), mVar);
                mVar.y();
                l72.f0.f110999a.d(0, 9, aVar3, c2.l.C(c2.l.A(c2.x2.f(aVar4, 1.0f), eVar.f97920e, 0.0f, 2), 0.0f, 0.0f, 0.0f, eVar.f97918c, 7), gl1.y.Q(mVar, R.string.lbl_next), mVar, null, false);
                mVar.y();
                if (((Boolean) p1Var.getF182175a()).booleanValue()) {
                    mVar.C(-1740665676);
                    strP = gl1.y.P(R.string.value_parenthesis_value, new Object[]{gl1.y.Q(mVar, R.string.pacepro_lbl_plan_goal_time), gl1.y.Q(mVar, R.string.hour_minute_second_format)}, mVar);
                    zB5 = mVar.B(strP);
                    objQ8 = mVar.q();
                    if (zB5) {
                        aVar2.getClass();
                        if (objQ8 == p3.m.a.f135155b) {
                            oi0.b bVar6 = new oi0.b(new l22.a(context3), strP);
                            bVar6.o();
                            objQ8 = bVar6.f132238b;
                            mVar.K(objQ8);
                        }
                    } else {
                        oi0.b bVar7 = new oi0.b(new l22.a(context3), strP);
                        bVar7.o();
                        objQ8 = bVar7.f132238b;
                        mVar.K(objQ8);
                    }
                    String str12 = (String) objQ8;
                    int iD3 = jVar.d();
                    int iC3 = jVar.c();
                    int iE5 = j23.t.e(i15, jVar.d(), jVar.c());
                    lVar4 = lVar;
                    zB6 = mVar.B(p1Var) | mVar.B(lVar4);
                    objQ9 = mVar.q();
                    if (zB6) {
                        aVar2.getClass();
                        if (objQ9 == p3.m.a.f135155b) {
                            objQ9 = new a11.b0(lVar4, p1Var, 13);
                            mVar.K(objQ9);
                        }
                    } else {
                        objQ9 = new a11.b0(lVar4, p1Var, 13);
                        mVar.K(objQ9);
                    }
                    e23.l lVar11 = (e23.l) objQ9;
                    zB7 = mVar.B(p1Var);
                    objQ10 = mVar.q();
                    if (zB7) {
                        aVar2.getClass();
                        if (objQ10 == p3.m.a.f135155b) {
                            objQ10 = new i11.i(p1Var, 8);
                            mVar.K(objQ10);
                        }
                    } else {
                        objQ10 = new i11.i(p1Var, 8);
                        mVar.K(objQ10);
                    }
                    n02.j.a(iD3, iC3, iE5, false, strP, str12, null, lVar11, (e23.a) objQ10, mVar, 0);
                    mVar = mVar;
                    mVar.f();
                } else {
                    mVar.C(-1739483646);
                    mVar.f();
                }
                if (((Boolean) p1Var2.getF182175a()).booleanValue()) {
                    mVar.C(-1739398706);
                    gVar2 = n02.g.KILOMETERS;
                    if (gVar == gVar2) {
                        i16 = 149;
                    } else {
                        i16 = PsExtractor.VIDEO_STREAM_MASK;
                    }
                    int i28 = i16;
                    if (gVar == gVar2) {
                        i17 = 2237;
                    } else {
                        i17 = DateTimeConstants.SECONDS_PER_HOUR;
                    }
                    int i29 = i17;
                    if (gVar == gVar2) {
                        i18 = R.string.lbl_minute_per_km;
                    } else {
                        i18 = R.string.lbl_minute_per_mile;
                    }
                    String strQ12 = gl1.y.Q(mVar, i18);
                    if (gVar == gVar2) {
                        i19 = R.string.lbl_minutes_per_kilometer;
                    } else {
                        i19 = R.string.lbl_minutes_per_mile;
                    }
                    String strQ13 = gl1.y.Q(mVar, i19);
                    int iE6 = j23.t.e(i14, i28, i29);
                    lVar3 = lVar2;
                    zB3 = mVar.B(p1Var2) | mVar.B(lVar3);
                    objQ6 = mVar.q();
                    if (zB3) {
                        aVar2.getClass();
                        if (objQ6 == p3.m.a.f135155b) {
                            objQ6 = new a11.b0(lVar3, p1Var2, 14);
                            mVar.K(objQ6);
                        }
                    } else {
                        objQ6 = new a11.b0(lVar3, p1Var2, 14);
                        mVar.K(objQ6);
                    }
                    e23.l lVar12 = (e23.l) objQ6;
                    zB4 = mVar.B(p1Var2);
                    objQ7 = mVar.q();
                    if (zB4) {
                        aVar2.getClass();
                        if (objQ7 == p3.m.a.f135155b) {
                            objQ7 = new i11.i(p1Var2, 9);
                            mVar.K(objQ7);
                        }
                    } else {
                        objQ7 = new i11.i(p1Var2, 9);
                        mVar.K(objQ7);
                    }
                    p3.m mVar5 = mVar;
                    n02.k.a(i28, i29, iE6, false, strQ12, strQ13, null, lVar12, (e23.a) objQ7, mVar5, 0);
                    mVar5.f();
                } else {
                    mVar.C(-1737811134);
                    mVar.f();
                }
            } else {
                jVar = jVar2;
            }
            objQ = new oi0.h(context5).d(j18, true);
            mVar2.K(objQ);
            String str13 = (String) objQ;
            zB = mVar2.B(p1Var);
            objQ2 = mVar2.q();
            if (zB) {
                aVar2.getClass();
                if (objQ2 == p3.m.a.f135155b) {
                    objQ2 = new i11.i(p1Var, 6);
                    mVar2.K(objQ2);
                }
            } else {
                objQ2 = new i11.i(p1Var, 6);
                mVar2.K(objQ2);
            }
            i51.g.a(0, (e23.a) objQ2, rVarC6, strQ10, strB2, str13, mVar2);
            h4.r rVarF4 = c2.x2.f(aVar4, 0.4f);
            String strQ14 = gl1.y.Q(mVar2, R.string.lbl_course_goal_pace);
            context = (Context) mVar2.A(y3Var2);
            zK2 = mVar2.k(i14) | mVar2.k(gVar.ordinal());
            objQ3 = mVar2.q();
            if (zK2) {
                aVar2.getClass();
                if (objQ3 == p3.m.a.f135155b) {
                    double d110 = i14;
                    if (gVar == n02.g.KILOMETERS) {
                        z14 = true;
                    } else {
                        z14 = false;
                    }
                    objQ3 = c22.l3.a.y0(aVar, context, d110, z14, true);
                    mVar2.K(objQ3);
                }
            } else {
                double d111 = i14;
                if (gVar == n02.g.KILOMETERS) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                objQ3 = c22.l3.a.y0(aVar, context, d111, z14, true);
                mVar2.K(objQ3);
            }
            String str14 = (String) objQ3;
            context2 = (Context) mVar2.A(y3Var2);
            zK3 = mVar2.k(i14) | mVar2.k(gVar.ordinal());
            objQ4 = mVar2.q();
            if (zK3) {
                aVar2.getClass();
                if (objQ4 == p3.m.a.f135155b) {
                    j51.a aVar13 = j51.a.f97057a;
                    long j111 = i14;
                    if (gVar == n02.g.KILOMETERS) {
                        z15 = true;
                    } else {
                        z15 = false;
                    }
                    aVar13.getClass();
                    objQ4 = j51.a.c(context2, j111, z15);
                    mVar2.K(objQ4);
                }
            } else {
                j51.a aVar14 = j51.a.f97057a;
                long j112 = i14;
                if (gVar == n02.g.KILOMETERS) {
                    z15 = true;
                } else {
                    z15 = false;
                }
                aVar14.getClass();
                objQ4 = j51.a.c(context2, j112, z15);
                mVar2.K(objQ4);
            }
            String str15 = (String) objQ4;
            zB2 = mVar2.B(p1Var2);
            objQ5 = mVar2.q();
            if (zB2) {
                aVar2.getClass();
                if (objQ5 == p3.m.a.f135155b) {
                    objQ5 = new i11.i(p1Var2, 7);
                    mVar2.K(objQ5);
                }
            } else {
                objQ5 = new i11.i(p1Var2, 7);
                mVar2.K(objQ5);
            }
            i51.g.a(384, (e23.a) objQ5, rVarF4, strQ14, str14, str15, mVar2);
            mVar = mVar2;
            c2.l.f(b0Var.a(aVar4, 1.0f, true), mVar);
            mVar.y();
            l72.f0.f110999a.d(0, 9, aVar3, c2.l.C(c2.l.A(c2.x2.f(aVar4, 1.0f), eVar.f97920e, 0.0f, 2), 0.0f, 0.0f, 0.0f, eVar.f97918c, 7), gl1.y.Q(mVar, R.string.lbl_next), mVar, null, false);
            mVar.y();
            if (((Boolean) p1Var.getF182175a()).booleanValue()) {
                mVar.C(-1740665676);
                strP = gl1.y.P(R.string.value_parenthesis_value, new Object[]{gl1.y.Q(mVar, R.string.pacepro_lbl_plan_goal_time), gl1.y.Q(mVar, R.string.hour_minute_second_format)}, mVar);
                zB5 = mVar.B(strP);
                objQ8 = mVar.q();
                if (zB5) {
                    aVar2.getClass();
                    if (objQ8 == p3.m.a.f135155b) {
                        oi0.b bVar8 = new oi0.b(new l22.a(context3), strP);
                        bVar8.o();
                        objQ8 = bVar8.f132238b;
                        mVar.K(objQ8);
                    }
                } else {
                    oi0.b bVar9 = new oi0.b(new l22.a(context3), strP);
                    bVar9.o();
                    objQ8 = bVar9.f132238b;
                    mVar.K(objQ8);
                }
                String str16 = (String) objQ8;
                int iD4 = jVar.d();
                int iC4 = jVar.c();
                int iE7 = j23.t.e(i15, jVar.d(), jVar.c());
                lVar4 = lVar;
                zB6 = mVar.B(p1Var) | mVar.B(lVar4);
                objQ9 = mVar.q();
                if (zB6) {
                    aVar2.getClass();
                    if (objQ9 == p3.m.a.f135155b) {
                        objQ9 = new a11.b0(lVar4, p1Var, 13);
                        mVar.K(objQ9);
                    }
                } else {
                    objQ9 = new a11.b0(lVar4, p1Var, 13);
                    mVar.K(objQ9);
                }
                e23.l lVar13 = (e23.l) objQ9;
                zB7 = mVar.B(p1Var);
                objQ10 = mVar.q();
                if (zB7) {
                    aVar2.getClass();
                    if (objQ10 == p3.m.a.f135155b) {
                        objQ10 = new i11.i(p1Var, 8);
                        mVar.K(objQ10);
                    }
                } else {
                    objQ10 = new i11.i(p1Var, 8);
                    mVar.K(objQ10);
                }
                n02.j.a(iD4, iC4, iE7, false, strP, str16, null, lVar13, (e23.a) objQ10, mVar, 0);
                mVar = mVar;
                mVar.f();
            } else {
                mVar.C(-1739483646);
                mVar.f();
            }
            if (((Boolean) p1Var2.getF182175a()).booleanValue()) {
                mVar.C(-1739398706);
                gVar2 = n02.g.KILOMETERS;
                if (gVar == gVar2) {
                    i16 = 149;
                } else {
                    i16 = PsExtractor.VIDEO_STREAM_MASK;
                }
                int i210 = i16;
                if (gVar == gVar2) {
                    i17 = 2237;
                } else {
                    i17 = DateTimeConstants.SECONDS_PER_HOUR;
                }
                int i211 = i17;
                if (gVar == gVar2) {
                    i18 = R.string.lbl_minute_per_km;
                } else {
                    i18 = R.string.lbl_minute_per_mile;
                }
                String strQ15 = gl1.y.Q(mVar, i18);
                if (gVar == gVar2) {
                    i19 = R.string.lbl_minutes_per_kilometer;
                } else {
                    i19 = R.string.lbl_minutes_per_mile;
                }
                String strQ16 = gl1.y.Q(mVar, i19);
                int iE8 = j23.t.e(i14, i210, i211);
                lVar3 = lVar2;
                zB3 = mVar.B(p1Var2) | mVar.B(lVar3);
                objQ6 = mVar.q();
                if (zB3) {
                    aVar2.getClass();
                    if (objQ6 == p3.m.a.f135155b) {
                        objQ6 = new a11.b0(lVar3, p1Var2, 14);
                        mVar.K(objQ6);
                    }
                } else {
                    objQ6 = new a11.b0(lVar3, p1Var2, 14);
                    mVar.K(objQ6);
                }
                e23.l lVar14 = (e23.l) objQ6;
                zB4 = mVar.B(p1Var2);
                objQ7 = mVar.q();
                if (zB4) {
                    aVar2.getClass();
                    if (objQ7 == p3.m.a.f135155b) {
                        objQ7 = new i11.i(p1Var2, 9);
                        mVar.K(objQ7);
                    }
                } else {
                    objQ7 = new i11.i(p1Var2, 9);
                    mVar.K(objQ7);
                }
                p3.m mVar6 = mVar;
                n02.k.a(i210, i211, iE8, false, strQ15, strQ16, null, lVar14, (e23.a) objQ7, mVar6, 0);
                mVar6.f();
            } else {
                mVar.C(-1737811134);
                mVar.f();
            }
        } else {
            mVar2.e();
        }
        return Unit.INSTANCE;
    }

    private final Object b(Object obj, Object obj2) {
        ((Integer) obj2).getClass();
        og2.c.a((h4.r) this.f14818c, (qg2.c) this.f14819d, (ah2.e) this.f14820e, (String) this.f14817b, (og2.l) this.f14821f, (pg2.a) this.f14822g, (e23.a) this.f14823h, (p3.m) obj, p3.p0.t(7));
        return Unit.INSTANCE;
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0056  */
    /* JADX WARN: Code duplicated, block: B:29:0x00e3  */
    /* JADX WARN: Multi-variable type inference failed */
    private final Object c(Object obj, Object obj2) {
        zc.d dVar = (zc.d) this.f14818c;
        o53.b0 b0Var = (o53.b0) this.f14822g;
        GroupTransferOwnershipActivity groupTransferOwnershipActivity = (GroupTransferOwnershipActivity) this.f14819d;
        Context context = (Context) this.f14820e;
        p3.p1 p1Var = (p3.p1) this.f14821f;
        p3.p1 p1Var2 = (p3.p1) this.f14823h;
        p3.p1 p1Var3 = (p3.p1) this.f14817b;
        p3.m mVar = (p3.m) obj;
        int iIntValue = ((Integer) obj2).intValue();
        GroupTransferOwnershipActivity.a aVar = GroupTransferOwnershipActivity.f36209d;
        if (mVar.n(iIntValue & 1, (iIntValue & 3) != 2)) {
            p3.x1 x1Var = p3.n.f135158a;
            boolean zR = mVar.r(dVar);
            Object objQ = mVar.q();
            p3.m.a aVar2 = p3.m.f135153a;
            if (zR) {
                objQ = new ls0.h(dVar, 22, p1Var, p1Var2);
                mVar.K(objQ);
            } else {
                aVar2.getClass();
                if (objQ == p3.m.a.f135155b) {
                    objQ = new ls0.h(dVar, 22, p1Var, p1Var2);
                    mVar.K(objQ);
                }
            }
            e2.c.b(null, null, null, null, null, null, false, null, (e23.l) objQ, mVar, 0, 511);
            if (((Boolean) p1Var2.getF182175a()).booleanValue()) {
                mVar.C(221963000);
                l72.c1 c1Var = l72.c1.f110940a;
                String strQ = gl1.y.Q(mVar, R.string.lbl_transfer_ownership);
                com.garmin.android.apps.connectmobile.connections.groups.services.model.b bVar = (com.garmin.android.apps.connectmobile.connections.groups.services.model.b) p1Var.getF182175a();
                String fullName = bVar != null ? bVar.getFullName() : null;
                com.garmin.android.apps.connectmobile.connections.groups.services.model.b bVar2 = (com.garmin.android.apps.connectmobile.connections.groups.services.model.b) p1Var.getF182175a();
                String strA = c22.p0.a(fullName, bVar2 != null ? bVar2.getDisplayName() : null);
                if (strA == null) {
                    strA = "";
                }
                String strP = gl1.y.P(R.string.lbl_member_become_owner, new Object[]{strA}, mVar);
                String strQ2 = gl1.y.Q(mVar, R.string.lbl_common_continue);
                boolean zR2 = mVar.r(b0Var) | mVar.r(groupTransferOwnershipActivity) | mVar.r(context);
                Object objQ2 = mVar.q();
                if (zR2) {
                    v4 v4Var = new v4(b0Var, p1Var3, p1Var, groupTransferOwnershipActivity, context, 26);
                    mVar.K(v4Var);
                    objQ2 = v4Var;
                } else {
                    aVar2.getClass();
                    if (objQ2 == p3.m.a.f135155b) {
                        v4 v4Var2 = new v4(b0Var, p1Var3, p1Var, groupTransferOwnershipActivity, context, 26);
                        mVar.K(v4Var2);
                        objQ2 = v4Var2;
                    }
                }
                e23.a<Unit> aVar3 = (e23.a) objQ2;
                String strQ3 = gl1.y.Q(mVar, R.string.lbl_cancel);
                Object objQ3 = mVar.q();
                aVar2.getClass();
                if (objQ3 == p3.m.a.f135155b) {
                    objQ3 = new om0.h(p1Var2, 4);
                    mVar.K(objQ3);
                }
                c1Var.a(false, strQ, strP, null, null, strQ2, false, false, aVar3, strQ3, (e23.a) objQ3, mVar, 0, 6, 217);
                mVar.f();
            } else {
                mVar.C(222755825);
                mVar.f();
            }
        } else {
            mVar.e();
        }
        return Unit.INSTANCE;
    }

    private final Object d(Object obj, Object obj2) {
        n82.f fVar = (n82.f) this.f14818c;
        or0.m mVar = (or0.m) this.f14819d;
        Context context = (Context) this.f14820e;
        lr0.a aVar = (lr0.a) this.f14821f;
        Activity activity = (Activity) this.f14822g;
        c.q qVar = (c.q) this.f14823h;
        p3.p1 p1Var = (p3.p1) this.f14817b;
        p3.m mVar2 = (p3.m) obj;
        int iIntValue = ((Integer) obj2).intValue();
        if (mVar2.n(iIntValue & 1, (iIntValue & 3) != 2)) {
            p3.x1 x1Var = p3.n.f135158a;
            h4.r.a aVar2 = h4.r.S;
            h4.r rVarE = u1.n.e(c2.x2.d(aVar2, 1.0f), vb.h.e(d92.b.f58623a, mVar2), o4.m1.f128891a);
            h4.d.f81522a.getClass();
            h4.g.a aVar3 = h4.d.a.f81537o;
            c2.j.f22691a.getClass();
            c2.z zVarA = c2.y.a(c2.j.f22694d, aVar3, mVar2, 48);
            int iHashCode = Long.hashCode(mVar2.getU());
            p3.i2 i2VarX = mVar2.x();
            h4.r rVarC = h4.k.c(rVarE, mVar2);
            h5.g.V.getClass();
            h5.e0.a aVar4 = h5.g.a.f81805b;
            if (mVar2.F() == null) {
                p3.p0.l();
                throw null;
            }
            mVar2.z();
            if (mVar2.getT()) {
                mVar2.M(aVar4);
            } else {
                mVar2.c();
            }
            p3.b4.c(h5.g.a.f81810g, zVarA, mVar2);
            p3.b4.c(h5.g.a.f81809f, i2VarX, mVar2);
            h5.g.a.b bVar = h5.g.a.f81813j;
            if (mVar2.getT() || !p005kotlin.jvm.internal.s.g(mVar2.q(), Integer.valueOf(iHashCode))) {
                v.h.z(iHashCode, mVar2, iHashCode, bVar);
            }
            p3.b4.c(h5.g.a.f81807d, rVarC, mVar2);
            c2.b0 b0Var = c2.b0.f22601a;
            g6.f.a aVar5 = g6.f.f75994b;
            c2.l.f(c2.l.C(aVar2, 0.0f, 16, 0.0f, 0.0f, 13), mVar2);
            Object objQ = mVar2.q();
            p3.m.f135153a.getClass();
            p3.m.a.C2565a c2565a = p3.m.a.f135155b;
            if (objQ == c2565a) {
                objQ = i53.a.a(o82.g.f130850c, o82.g.f130851d, o82.g.f130853f, o82.g.f130856i);
                mVar2.K(objQ);
            }
            i53.f fVar2 = (i53.f) objQ;
            Object objQ2 = mVar2.q();
            if (objQ2 == c2565a) {
                objQ2 = new yd1.a(context);
                mVar2.K(objQ2);
            }
            yd1.a aVar6 = (yd1.a) objQ2;
            i53.c cVarE = i53.a.e(c22.o2.b(fVar2, mVar2));
            int iIndexOf = fVar2.indexOf(fVar.f124961b.a());
            boolean zB = mVar2.B(fVar) | mVar2.r(mVar);
            Object objQ3 = mVar2.q();
            if (zB || objQ3 == c2565a) {
                objQ3 = new ls0.h(fVar, 26, fVar2, mVar);
                mVar2.K(objQ3);
            }
            t82.c.a(cVarE, null, iIndexOf, 0.0f, (e23.l) objQ3, mVar2, 0, 26);
            q82.a.a(c2.x2.f(aVar2, 1.0f), new n82.n(fVar, aVar6), null, mVar2, 6, 4);
            n82.c.a(b0Var.a(aVar2, 1.0f, true), fVar, 3, false, z3.f.c(1759260335, new aa2.q(fVar, mVar, aVar, activity, qVar, p1Var, 9), mVar2), mVar2, 24960, 8);
            mVar2.y();
        } else {
            mVar2.e();
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0063  */
    /* JADX WARN: Code duplicated, block: B:20:0x00ce  */
    /* JADX WARN: Multi-variable type inference failed */
    private final Object e(Object obj, Object obj2) {
        p3.p1 p1Var = (p3.p1) this.f14818c;
        e23.a aVar = (e23.a) this.f14819d;
        String str = (String) this.f14817b;
        e23.a aVar2 = (e23.a) this.f14820e;
        m4.b0 b0Var = (m4.b0) this.f14821f;
        p3.p1 p1Var2 = (p3.p1) this.f14822g;
        String str2 = (String) this.f14823h;
        p3.m mVar = (p3.m) obj;
        int iIntValue = ((Integer) obj2).intValue();
        if (mVar.n(iIntValue & 1, (iIntValue & 3) != 2)) {
            p3.x1 x1Var = p3.n.f135158a;
            boolean zBooleanValue = ((Boolean) p1Var.getF182175a()).booleanValue();
            p3.m.a aVar3 = p3.m.f135153a;
            if (zBooleanValue) {
                mVar.C(731839488);
                boolean zB = mVar.B(aVar);
                Object objQ = mVar.q();
                if (zB) {
                    objQ = new pf0.j(aVar, 4);
                    mVar.K(objQ);
                } else {
                    aVar3.getClass();
                    if (objQ == p3.m.a.f135155b) {
                        objQ = new pf0.j(aVar, 4);
                        mVar.K(objQ);
                    }
                }
                z02.f.f(null, (e23.a) objQ, null, z3.f.c(-1269696815, new ng2.i(b0Var, 8, p1Var2, str2), mVar), mVar, 24576, 13);
                mVar.f();
            } else {
                mVar.C(732531873);
                s62.a.f157643a.getClass();
                i53.f fVarA = i53.a.a(new l72.i3("SEARCH", gl1.y.Q(mVar, R.string.lbl_search), false, v62.o7.a(t62.b.f162798a), gl1.y.Q(mVar, R.string.lbl_search), 4, (p005kotlin.jvm.internal.j) null));
                boolean zB2 = mVar.B(p1Var);
                Object objQ2 = mVar.q();
                if (zB2) {
                    objQ2 = new o72.i3(p1Var, 26);
                    mVar.K(objQ2);
                } else {
                    aVar3.getClass();
                    if (objQ2 == p3.m.a.f135155b) {
                        objQ2 = new o72.i3(p1Var, 26);
                        mVar.K(objQ2);
                    }
                }
                z02.f.d(str, null, null, aVar2, fVarA, null, (e23.l) objQ2, mVar, GDIInReachMessaging.Capabilities.MessagingCapability.PLAN_CHANGE_VALUE, 86);
                mVar.f();
            }
        } else {
            mVar.e();
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0094  */
    private final Object f(Object obj, Object obj2) {
        e2.i0 i0Var = (e2.i0) this.f14818c;
        e23.l lVar = (e23.l) this.f14819d;
        e23.p pVar = (e23.p) this.f14820e;
        p3.p1 p1Var = (p3.p1) this.f14821f;
        p3.x3 x3Var = (p3.x3) this.f14822g;
        p3.x3 x3Var2 = (p3.x3) this.f14823h;
        p3.x3 x3Var3 = (p3.x3) this.f14817b;
        p3.m mVar = (p3.m) obj;
        int iIntValue = ((Integer) obj2).intValue();
        if (mVar.n(iIntValue & 1, (iIntValue & 3) != 2)) {
            p3.x1 x1Var = p3.n.f135158a;
            h4.r rVarD = c2.x2.d(h4.r.S, 1.0f);
            int i14 = c2.k3.f22728a;
            c2.c3 c3VarB = c2.q3.b(mVar);
            c2.p3.f22815b.getClass();
            c2.x1 x1VarD = c2.n3.d(c3VarB, c2.p3.f22826m | c2.p3.f22823j);
            d92.b.f58623a.getClass();
            d92.b.f58625c.getClass();
            c2.l1 l1VarC = c2.n3.c(new c2.a(x1VarD, c2.n3.b(0.0f, j92.b.f97899b.f97920e, 0.0f, 0.0f, 13)), mVar);
            boolean zB = mVar.B(lVar) | mVar.B(pVar) | mVar.B(p1Var);
            Object objQ = mVar.q();
            if (zB) {
                objQ = new aa2.p(x3Var, x3Var2, x3Var3, pVar, p1Var, lVar, 21);
                mVar.K(objQ);
            } else {
                p3.m.f135153a.getClass();
                if (objQ == p3.m.a.f135155b) {
                    objQ = new aa2.p(x3Var, x3Var2, x3Var3, pVar, p1Var, lVar, 21);
                    mVar.K(objQ);
                }
            }
            e2.c.b(rVarD, i0Var, l1VarC, null, null, null, false, null, (e23.l) objQ, mVar, 6, 504);
        } else {
            mVar.e();
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Code duplicated, block: B:25:0x00ff  */
    /* JADX WARN: Multi-variable type inference failed */
    private final Object g(Object obj, Object obj2) {
        c2.b0 b0Var;
        float f14;
        boolean z14;
        i53.f fVar = (i53.f) this.f14820e;
        n82.f fVar2 = (n82.f) this.f14818c;
        yq1.e eVar = (yq1.e) this.f14819d;
        yd1.c cVar = (yd1.c) this.f14821f;
        p3.p1 p1Var = (p3.p1) this.f14822g;
        p3.p1 p1Var2 = (p3.p1) this.f14823h;
        e23.a aVar = (e23.a) this.f14817b;
        p3.m mVar = (p3.m) obj;
        int iIntValue = ((Integer) obj2).intValue();
        if (mVar.n(iIntValue & 1, (iIntValue & 3) != 2)) {
            p3.x1 x1Var = p3.n.f135158a;
            h4.r.a aVar2 = h4.r.S;
            h4.r rVarE = u1.n.e(c2.x2.d(aVar2, 1.0f), vb.h.e(d92.b.f58623a, mVar), o4.m1.f128891a);
            c2.j.f22691a.getClass();
            c2.j.k kVar = c2.j.f22694d;
            h4.d.f81522a.getClass();
            c2.z zVarA = c2.y.a(kVar, h4.d.a.f81536n, mVar, 0);
            int iHashCode = Long.hashCode(mVar.getU());
            p3.i2 i2VarX = mVar.x();
            h4.r rVarC = h4.k.c(rVarE, mVar);
            h5.g.V.getClass();
            h5.e0.a aVar3 = h5.g.a.f81805b;
            if (mVar.F() == null) {
                p3.p0.l();
                throw null;
            }
            mVar.z();
            if (mVar.getT()) {
                mVar.M(aVar3);
            } else {
                mVar.c();
            }
            p3.b4.c(h5.g.a.f81810g, zVarA, mVar);
            p3.b4.c(h5.g.a.f81809f, i2VarX, mVar);
            h5.g.a.b bVar = h5.g.a.f81813j;
            if (mVar.getT() || !p005kotlin.jvm.internal.s.g(mVar.q(), Integer.valueOf(iHashCode))) {
                v.h.z(iHashCode, mVar, iHashCode, bVar);
            }
            p3.b4.c(h5.g.a.f81807d, rVarC, mVar);
            c2.b0 b0Var2 = c2.b0.f22601a;
            if (((yq1.d) p1Var.getF182175a()).f198795e) {
                mVar.C(1361471616);
                i53.c cVarE = i53.a.e(c22.o2.b(fVar, mVar));
                int iIndexOf = fVar.indexOf(fVar2.f124961b.a());
                h4.r rVarB = b0Var2.b(aVar2, h4.d.a.f81537o);
                boolean zB = mVar.B(fVar2) | mVar.r(eVar);
                Object objQ = mVar.q();
                if (zB) {
                    objQ = new p90.h(fVar2, 5, fVar, eVar);
                    mVar.K(objQ);
                } else {
                    p3.m.f135153a.getClass();
                    if (objQ == p3.m.a.f135155b) {
                        objQ = new p90.h(fVar2, 5, fVar, eVar);
                        mVar.K(objQ);
                    }
                }
                b0Var = b0Var2;
                f14 = 1.0f;
                z14 = true;
                t82.c.a(cVarE, rVarB, iIndexOf, 0.0f, (e23.l) objQ, mVar, 0, 24);
                q82.a.a(c2.x2.f(aVar2, 1.0f), new n82.n(fVar2, cVar), null, mVar, 6, 4);
                mVar = mVar;
                mVar.f();
            } else {
                b0Var = b0Var2;
                f14 = 1.0f;
                z14 = true;
                mVar.C(1362287505);
                mVar.f();
            }
            n82.c.a(b0Var.a(aVar2, f14, z14), fVar2, 3, (((yq1.d) p1Var.getF182175a()).f198795e || ((Boolean) p1Var2.getF182175a()).booleanValue()) ? z14 : false, z3.f.c(1190005779, new a42.c0((Object) eVar, (Object) fVar2, aVar, (Object) p1Var2, (Object) p1Var, 22), mVar), mVar, 24960, 0);
            mVar.y();
        } else {
            mVar.e();
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Code duplicated, block: B:23:0x00de  */
    /* JADX WARN: Code duplicated, block: B:24:0x00eb  */
    /* JADX WARN: Code duplicated, block: B:26:0x0126  */
    /* JADX WARN: Code duplicated, block: B:28:0x012f  */
    /* JADX WARN: Code duplicated, block: B:29:0x0133  */
    /* JADX WARN: Code duplicated, block: B:34:0x0150  */
    /* JADX WARN: Code duplicated, block: B:38:0x01a1  */
    /* JADX WARN: Code duplicated, block: B:40:0x01a8  */
    /* JADX WARN: Code duplicated, block: B:43:0x01cb  */
    /* JADX WARN: Code duplicated, block: B:44:0x01d6  */
    /* JADX WARN: Code duplicated, block: B:46:0x0218  */
    private final Object h(Object obj, Object obj2) {
        c.q qVar;
        h5.g.a.f fVar;
        ub1.l lVarU;
        c2.z zVarA;
        int iHashCode;
        p3.i2 i2VarX;
        h4.r rVarC;
        boolean zB;
        Object objQ;
        p3.m.a aVar;
        Object objQ2;
        Context context;
        i53.f fVar2 = (i53.f) this.f14820e;
        o82.g gVar = (o82.g) this.f14818c;
        n82.f fVar3 = (n82.f) this.f14819d;
        Context context2 = (Context) this.f14821f;
        q42.y yVar = (q42.y) this.f14822g;
        q42.d0 d0Var = (q42.d0) this.f14823h;
        c.q qVar2 = (c.q) this.f14817b;
        p3.m mVar = (p3.m) obj;
        int iIntValue = ((Integer) obj2).intValue();
        if (mVar.n(iIntValue & 1, (iIntValue & 3) != 2)) {
            p3.x1 x1Var = p3.n.f135158a;
            h4.r.a aVar2 = h4.r.S;
            h4.r rVarD = c2.x2.d(aVar2, 1.0f);
            long jE = vb.h.e(d92.b.f58623a, mVar);
            o4.m1.a aVar3 = o4.m1.f128891a;
            h4.r rVarE = u1.n.e(rVarD, jE, aVar3);
            h4.d.f81522a.getClass();
            h4.g.a aVar4 = h4.d.a.f81537o;
            c2.j.f22691a.getClass();
            c2.j.k kVar = c2.j.f22694d;
            c2.z zVarA2 = c2.y.a(kVar, aVar4, mVar, 48);
            int iHashCode2 = Long.hashCode(mVar.getU());
            p3.i2 i2VarX2 = mVar.x();
            h4.r rVarC2 = h4.k.c(rVarE, mVar);
            h5.g.V.getClass();
            h5.e0.a aVar5 = h5.g.a.f81805b;
            if (mVar.F() == null) {
                p3.p0.l();
                throw null;
            }
            mVar.z();
            if (mVar.getT()) {
                mVar.M(aVar5);
            } else {
                mVar.c();
            }
            h5.g.a.e eVar = h5.g.a.f81810g;
            p3.b4.c(eVar, zVarA2, mVar);
            h5.g.a.C1623g c1623g = h5.g.a.f81809f;
            p3.b4.c(c1623g, i2VarX2, mVar);
            h5.g.a.b bVar = h5.g.a.f81813j;
            if (mVar.getT()) {
                qVar = qVar2;
            } else {
                qVar = qVar2;
                if (!p005kotlin.jvm.internal.s.g(mVar.q(), Integer.valueOf(iHashCode2))) {
                }
                fVar = h5.g.a.f81807d;
                p3.b4.c(fVar, rVarC2, mVar);
                c2.b0 b0Var = c2.b0.f22601a;
                lVarU = zd0.g1.u((zd0.g1) KoinJavaComponent.get$default(zd0.g1.class, null, null, 6, null), c80.s0.WEIGHT, null, 6);
                if (lVarU == null) {
                    mVar.C(27547557);
                    mVar.f();
                } else {
                    mVar.C(27547558);
                    h4.r rVarE2 = u1.n.e(c2.x2.f(aVar2, 1.0f), d92.b.a(mVar).c().b(), aVar3);
                    zVarA = c2.y.a(kVar, h4.d.a.f81536n, mVar, 0);
                    iHashCode = Long.hashCode(mVar.getU());
                    i2VarX = mVar.x();
                    rVarC = h4.k.c(rVarE2, mVar);
                    if (mVar.F() != null) {
                        p3.p0.l();
                        throw null;
                    }
                    mVar.z();
                    if (mVar.getT()) {
                        mVar.M(aVar5);
                    } else {
                        mVar.c();
                    }
                    p3.b4.c(eVar, zVarA, mVar);
                    p3.b4.c(c1623g, i2VarX, mVar);
                    if (mVar.getT() || !p005kotlin.jvm.internal.s.g(mVar.q(), Integer.valueOf(iHashCode))) {
                        v.h.z(iHashCode, mVar, iHashCode, bVar);
                    }
                    p3.b4.c(fVar, rVarC, mVar);
                    d92.b.f58625c.getClass();
                    lVarU.a(c2.l.y(aVar2, j92.b.f97899b.f97920e), mVar, 0);
                    mVar.y();
                    mVar.f();
                }
                d92.b.f58625c.getClass();
                c2.l.f(c2.l.C(aVar2, 0.0f, j92.b.f97899b.f97920e, 0.0f, 0.0f, 13), mVar);
                i53.c cVarE = i53.a.e(c22.o2.b(fVar2, mVar));
                int iIndexOf = fVar2.indexOf(gVar);
                zB = mVar.B(fVar3);
                objQ = mVar.q();
                aVar = p3.m.f135153a;
                if (zB) {
                    objQ = new a42.f0(fVar3, fVar2, 11);
                    mVar.K(objQ);
                } else {
                    aVar.getClass();
                    if (objQ == p3.m.a.f135155b) {
                        objQ = new a42.f0(fVar3, fVar2, 11);
                        mVar.K(objQ);
                    }
                }
                t82.c.a(cVarE, null, iIndexOf, 0.0f, (e23.l) objQ, mVar, 3072, 18);
                objQ2 = mVar.q();
                aVar.getClass();
                if (objQ2 == p3.m.a.f135155b) {
                    context = context2;
                    objQ2 = new yd1.a(context);
                    mVar.K(objQ2);
                } else {
                    context = context2;
                }
                q82.a.a(c2.x2.f(aVar2, 1.0f), new n82.n(fVar3, (yd1.a) objQ2), null, mVar, 6, 4);
                n82.c.a(b0Var.a(aVar2, 1.0f, true), fVar3, 3, false, z3.f.c(1514025999, new a42.c0(yVar, fVar3, d0Var, context, qVar, 24), mVar), mVar, 24960, 8);
                mVar.y();
            }
            v.h.z(iHashCode2, mVar, iHashCode2, bVar);
            fVar = h5.g.a.f81807d;
            p3.b4.c(fVar, rVarC2, mVar);
            c2.b0 b0Var2 = c2.b0.f22601a;
            lVarU = zd0.g1.u((zd0.g1) KoinJavaComponent.get$default(zd0.g1.class, null, null, 6, null), c80.s0.WEIGHT, null, 6);
            if (lVarU == null) {
                mVar.C(27547557);
                mVar.f();
            } else {
                mVar.C(27547558);
                h4.r rVarE3 = u1.n.e(c2.x2.f(aVar2, 1.0f), d92.b.a(mVar).c().b(), aVar3);
                zVarA = c2.y.a(kVar, h4.d.a.f81536n, mVar, 0);
                iHashCode = Long.hashCode(mVar.getU());
                i2VarX = mVar.x();
                rVarC = h4.k.c(rVarE3, mVar);
                if (mVar.F() != null) {
                    p3.p0.l();
                    throw null;
                }
                mVar.z();
                if (mVar.getT()) {
                    mVar.M(aVar5);
                } else {
                    mVar.c();
                }
                p3.b4.c(eVar, zVarA, mVar);
                p3.b4.c(c1623g, i2VarX, mVar);
                if (mVar.getT()) {
                    v.h.z(iHashCode, mVar, iHashCode, bVar);
                } else {
                    v.h.z(iHashCode, mVar, iHashCode, bVar);
                }
                p3.b4.c(fVar, rVarC, mVar);
                d92.b.f58625c.getClass();
                lVarU.a(c2.l.y(aVar2, j92.b.f97899b.f97920e), mVar, 0);
                mVar.y();
                mVar.f();
            }
            d92.b.f58625c.getClass();
            c2.l.f(c2.l.C(aVar2, 0.0f, j92.b.f97899b.f97920e, 0.0f, 0.0f, 13), mVar);
            i53.c cVarE2 = i53.a.e(c22.o2.b(fVar2, mVar));
            int iIndexOf2 = fVar2.indexOf(gVar);
            zB = mVar.B(fVar3);
            objQ = mVar.q();
            aVar = p3.m.f135153a;
            if (zB) {
                aVar.getClass();
                if (objQ == p3.m.a.f135155b) {
                    objQ = new a42.f0(fVar3, fVar2, 11);
                    mVar.K(objQ);
                }
            } else {
                objQ = new a42.f0(fVar3, fVar2, 11);
                mVar.K(objQ);
            }
            t82.c.a(cVarE2, null, iIndexOf2, 0.0f, (e23.l) objQ, mVar, 3072, 18);
            objQ2 = mVar.q();
            aVar.getClass();
            if (objQ2 == p3.m.a.f135155b) {
                context = context2;
                objQ2 = new yd1.a(context);
                mVar.K(objQ2);
            } else {
                context = context2;
            }
            q82.a.a(c2.x2.f(aVar2, 1.0f), new n82.n(fVar3, (yd1.a) objQ2), null, mVar, 6, 4);
            n82.c.a(b0Var2.a(aVar2, 1.0f, true), fVar3, 3, false, z3.f.c(1514025999, new a42.c0(yVar, fVar3, d0Var, context, qVar, 24), mVar), mVar, 24960, 8);
            mVar.y();
        } else {
            mVar.e();
        }
        return Unit.INSTANCE;
    }

    private final Object i(Object obj, Object obj2) {
        ((Integer) obj2).getClass();
        qn1.a.b((mm1.b) this.f14818c, (DateTime) this.f14819d, (DateTime) this.f14820e, (sm1.s) this.f14821f, (e23.l) this.f14822g, (com.garmin.android.apps.connectmobile.sleep.presentation.c) this.f14823h, (e23.l) this.f14817b, (p3.m) obj, p3.p0.t(9));
        return Unit.INSTANCE;
    }

    /* JADX WARN: Code duplicated, block: B:131:0x0548  */
    /* JADX WARN: Code duplicated, block: B:136:0x0589  */
    /* JADX WARN: Code duplicated, block: B:141:0x05ab  */
    /* JADX WARN: Code duplicated, block: B:157:0x062a  */
    /* JADX WARN: Code duplicated, block: B:19:0x00aa  */
    /* JADX WARN: Code duplicated, block: B:204:0x0800  */
    /* JADX WARN: Code duplicated, block: B:206:0x0809  */
    /* JADX WARN: Code duplicated, block: B:207:0x080d  */
    /* JADX WARN: Code duplicated, block: B:212:0x082a  */
    /* JADX WARN: Code duplicated, block: B:214:0x0857  */
    /* JADX WARN: Code duplicated, block: B:245:0x095a  */
    /* JADX WARN: Code duplicated, block: B:316:0x0c49  */
    /* JADX WARN: Code duplicated, block: B:65:0x021f  */
    /* JADX WARN: Code duplicated, block: B:75:0x02c6  */
    /* JADX WARN: Code duplicated, block: B:91:0x037c  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        List list;
        int i14;
        h5.g.a.f fVar;
        c2.b0 b0Var;
        c2.z zVarA;
        int iHashCode;
        p3.i2 i2VarX;
        h4.r rVarC;
        h4.r rVarC2;
        lc.m0 m0Var;
        Object pVar;
        i53.f fVarA;
        lc.m0 m0Var2;
        i53.c cVarB;
        int i15;
        int i16 = this.f14816a;
        int i17 = 6;
        p3.m.a aVar = p3.m.f135153a;
        int i18 = 2;
        Object obj3 = this.f14817b;
        Object obj4 = this.f14823h;
        Object obj5 = this.f14822g;
        Object obj6 = this.f14821f;
        Object obj7 = this.f14820e;
        Object obj8 = this.f14819d;
        Object obj9 = this.f14818c;
        switch (i16) {
            case 0:
                i21.d dVar = (i21.d) obj9;
                l4.r rVar = (l4.r) obj8;
                i53.f fVar2 = (i53.f) obj7;
                lc.m0 m0Var3 = (lc.m0) obj6;
                o53.b0 b0Var2 = (o53.b0) obj5;
                fe feVar = (fe) obj4;
                String str = (String) obj3;
                i53.c cVar = (i53.c) obj;
                b63.v vVar = (b63.v) obj2;
                cVar.getClass();
                i01.a.Companion companion = i01.a.INSTANCE;
                String str2 = rVar.f14957b;
                companion.getClass();
                i01.a aVarA = i01.a.Companion.a(str2);
                b63.o oVarB = b63.o.Companion.b(b63.o.INSTANCE, rVar.f14958c);
                if (vVar != null) {
                    ArrayList arrayList = new ArrayList(p13.y.r(fVar2, 10));
                    Iterator<E> it = fVar2.iterator();
                    while (it.hasNext()) {
                        arrayList.add(((b11.i) it.next()).h(vVar));
                    }
                    list = arrayList;
                } else {
                    list = fVar2;
                }
                dVar.getClass();
                aVarA.getClass();
                oVarB.getClass();
                list.getClass();
                ge1.b.T(androidx.lifecycle.v1.a(dVar), null, null, new i21.q(dVar, aVarA, oVarB, cVar, list, null), 3);
                l4.y0 y0Var = l4.y0.INSTANCE;
                if (!lc.y.q(m0Var3, y0Var)) {
                    ge1.b.T(b0Var2, null, null, new w1(feVar, str, null), 3);
                    lc.y.l(m0Var3, y0Var);
                }
                return Unit.INSTANCE;
            case 1:
                String str3 = (String) obj3;
                String str4 = (String) obj9;
                b92.a aVar2 = (b92.a) obj8;
                e23.p<? super p3.m, ? super Integer, Unit> pVar2 = (e23.p) obj7;
                e23.p<? super p3.m, ? super Integer, Unit> pVar3 = (e23.p) obj6;
                e23.p pVar4 = (e23.p) obj5;
                bb1.g gVar = (bb1.g) obj4;
                p3.m mVar = (p3.m) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (mVar.n(iIntValue & 1, (iIntValue & 3) != 2)) {
                    p3.x1 x1Var = p3.n.f135158a;
                    l72.p2 p2Var = l72.p2.f111205a;
                    boolean zB = mVar.B(pVar4) | mVar.B(gVar);
                    Object objQ = mVar.q();
                    if (zB) {
                        objQ = new bb1.c(pVar4, gVar, 0);
                        mVar.K(objQ);
                    } else {
                        aVar.getClass();
                        if (objQ == p3.m.a.f135155b) {
                            objQ = new bb1.c(pVar4, gVar, 0);
                            mVar.K(objQ);
                        }
                    }
                    int i19 = b92.a.f16960b;
                    p2Var.h(str3, str4, null, null, aVar2, false, false, pVar2, pVar3, null, (e23.a) objQ, mVar, 12582912, 0, 620);
                } else {
                    mVar.e();
                }
                return Unit.INSTANCE;
            case 2:
                ((Integer) obj2).getClass();
                ck0.k.c((ck0.t) obj9, (ck0.v) obj8, (ck0.w) obj7, (e23.a) obj6, (e23.a) obj5, (e23.l) obj4, (e23.a) obj3, (p3.m) obj, p3.p0.t(1));
                return Unit.INSTANCE;
            case 3:
                ((Integer) obj2).getClass();
                cq0.t.b((String) obj3, (String) obj9, (String) obj8, (String) obj7, (List) obj6, (String) obj5, (e23.a) obj4, (p3.m) obj, p3.p0.t(1));
                return Unit.INSTANCE;
            case 4:
                mc mcVar = (mc) obj9;
                o51.e eVar = (o51.e) obj8;
                e23.l lVar = (e23.l) obj7;
                e23.l lVar2 = (e23.l) obj6;
                e23.l lVar3 = (e23.l) obj5;
                je2.b bVar = (je2.b) obj4;
                p3.p1 p1Var = (p3.p1) obj3;
                p3.m mVar2 = (p3.m) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                if (mVar2.n(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    p3.x1 x1Var2 = p3.n.f135158a;
                    h4.r.a aVar3 = h4.r.S;
                    h4.d.f81522a.getClass();
                    f5.z0 z0VarD = c2.q.d(h4.d.a.f81524b, false);
                    int iHashCode2 = Long.hashCode(mVar2.getU());
                    p3.i2 i2VarX2 = mVar2.x();
                    h4.r rVarC3 = h4.k.c(aVar3, mVar2);
                    h5.g.V.getClass();
                    h5.e0.a aVar4 = h5.g.a.f81805b;
                    if (mVar2.F() == null) {
                        p3.p0.l();
                        throw null;
                    }
                    mVar2.z();
                    if (mVar2.getT()) {
                        mVar2.M(aVar4);
                    } else {
                        mVar2.c();
                    }
                    p3.b4.c(h5.g.a.f81810g, z0VarD, mVar2);
                    p3.b4.c(h5.g.a.f81809f, i2VarX2, mVar2);
                    h5.g.a.b bVar2 = h5.g.a.f81813j;
                    if (mVar2.getT() || !p005kotlin.jvm.internal.s.g(mVar2.q(), Integer.valueOf(iHashCode2))) {
                        v.h.z(iHashCode2, mVar2, iHashCode2, bVar2);
                    }
                    p3.b4.c(h5.g.a.f81807d, rVarC3, mVar2);
                    c2.u uVar = c2.u.f22885a;
                    if (eVar.f129233f.isEmpty()) {
                        mVar2.C(654244631);
                        mVar2.f();
                    } else {
                        mVar2.C(1683660020);
                        if (bVar == null) {
                            mVar2.C(653853069);
                            mVar2.f();
                        } else {
                            mVar2.C(1683660020);
                            bVar.b(c2.x2.d(aVar3, 1.0f), eVar.f129232e, eVar.f129235h, eVar.f129233f, eVar.f129229b, true, null, eVar.f129231d, null, mVar2, (ke2.b.f104550d << 9) | 1073938438, 320);
                            mVar2.f();
                        }
                        mVar2.f();
                    }
                    h4.r rVarC4 = uVar.c(aVar3, h4.d.a.f81526d);
                    d92.b.f58623a.getClass();
                    d92.b.f58625c.getClass();
                    j92.e eVar2 = j92.b.f97899b;
                    float f14 = eVar2.f97920e;
                    float f15 = eVar2.f97918c;
                    h4.r rVarZ = c2.l.z(rVarC4, f15, f14);
                    boolean z14 = eVar.f129231d;
                    boolean z15 = eVar.f129230c;
                    Object objQ2 = mVar2.q();
                    aVar.getClass();
                    p3.m.a.C2565a c2565a = p3.m.a.f135155b;
                    if (objQ2 == c2565a) {
                        objQ2 = new cw1.k(p1Var, 18);
                        mVar2.K(objQ2);
                    }
                    rw0.i.a(z14, z15, lVar3, (e23.a) objQ2, rVarZ, 0.0f, null, mVar2, 3072, 96);
                    z41.d.a(c2.l.z(u1.n.e(c2.l.C(uVar.c(aVar3, h4.d.a.f81531i), 0.0f, 0.0f, 0.0f, eVar2.f97921f, 7), j20.x.b(mVar2), k2.i.f102406a), eVar2.f97920e, f15), mVar2, 0);
                    mVar2.y();
                    if (((Boolean) p1Var.getF182175a()).booleanValue()) {
                        mVar2.C(1524092877);
                        int i24 = eVar.f129229b;
                        com.garmin.android.library.mapsdkadapter.i.d dVar2 = eVar.f129228a;
                        boolean z16 = eVar.f129231d;
                        boolean z17 = eVar.f129230c;
                        Object objQ3 = mVar2.q();
                        if (objQ3 == c2565a) {
                            objQ3 = new cw1.k(p1Var, 19);
                            mVar2.K(objQ3);
                        }
                        rw0.l.a(mcVar, i24, dVar2, z16, z17, lVar, lVar2, lVar3, (e23.a) objQ3, mVar2, 100663296);
                        mVar2.f();
                    } else {
                        mVar2.C(1524650257);
                        mVar2.f();
                    }
                } else {
                    mVar2.e();
                }
                return Unit.INSTANCE;
            case 5:
                i53.f fVar3 = (i53.f) obj7;
                n82.f fVar4 = (n82.f) obj9;
                d52.q qVar = (d52.q) obj8;
                yd1.c cVar2 = (yd1.c) obj6;
                p3.p1 p1Var2 = (p3.p1) obj5;
                p3.p1 p1Var3 = (p3.p1) obj4;
                e23.a aVar5 = (e23.a) obj3;
                p3.m mVar3 = (p3.m) obj;
                int iIntValue3 = ((Integer) obj2).intValue();
                if (mVar3.n(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    p3.x1 x1Var3 = p3.n.f135158a;
                    h4.r.a aVar6 = h4.r.S;
                    h4.r rVarE = u1.n.e(c2.x2.d(aVar6, 1.0f), vb.h.e(d92.b.f58623a, mVar3), o4.m1.f128891a);
                    c2.j.f22691a.getClass();
                    c2.j.k kVar = c2.j.f22694d;
                    h4.d.f81522a.getClass();
                    c2.z zVarA2 = c2.y.a(kVar, h4.d.a.f81536n, mVar3, 0);
                    int iHashCode3 = Long.hashCode(mVar3.getU());
                    p3.i2 i2VarX3 = mVar3.x();
                    h4.r rVarC5 = h4.k.c(rVarE, mVar3);
                    h5.g.V.getClass();
                    h5.e0.a aVar7 = h5.g.a.f81805b;
                    if (mVar3.F() == null) {
                        p3.p0.l();
                        throw null;
                    }
                    mVar3.z();
                    if (mVar3.getT()) {
                        mVar3.M(aVar7);
                    } else {
                        mVar3.c();
                    }
                    p3.b4.c(h5.g.a.f81810g, zVarA2, mVar3);
                    p3.b4.c(h5.g.a.f81809f, i2VarX3, mVar3);
                    h5.g.a.b bVar3 = h5.g.a.f81813j;
                    if (mVar3.getT() || !p005kotlin.jvm.internal.s.g(mVar3.q(), Integer.valueOf(iHashCode3))) {
                        v.h.z(iHashCode3, mVar3, iHashCode3, bVar3);
                    }
                    p3.b4.c(h5.g.a.f81807d, rVarC5, mVar3);
                    c2.b0 b0Var3 = c2.b0.f22601a;
                    if (((d52.r) p1Var2.getF182175a()).f57660e) {
                        mVar3.C(-350036896);
                        i53.c cVarE = i53.a.e(c22.o2.b(fVar3, mVar3));
                        int iIndexOf = fVar3.indexOf(fVar4.f124961b.a());
                        h4.r rVarB = b0Var3.b(aVar6, h4.d.a.f81537o);
                        boolean zB2 = mVar3.B(fVar4) | mVar3.r(qVar);
                        Object objQ4 = mVar3.q();
                        if (zB2) {
                            objQ4 = new ci0.b(fVar4, i17, fVar3, qVar);
                            mVar3.K(objQ4);
                        } else {
                            aVar.getClass();
                            if (objQ4 == p3.m.a.f135155b) {
                                objQ4 = new ci0.b(fVar4, i17, fVar3, qVar);
                                mVar3.K(objQ4);
                            }
                        }
                        t82.c.a(cVarE, rVarB, iIndexOf, 0.0f, (e23.l) objQ4, mVar3, 0, 24);
                        q82.a.a(c2.x2.f(aVar6, 1.0f), new n82.n(fVar4, cVar2), null, mVar3, 6, 4);
                        mVar3 = mVar3;
                        mVar3.f();
                    } else {
                        mVar3.C(-349221007);
                        mVar3.f();
                    }
                    h4.r rVarA = b0Var3.a(aVar6, 1.0f, true);
                    boolean z18 = ((d52.r) p1Var2.getF182175a()).f57660e || ((Boolean) p1Var3.getF182175a()).booleanValue();
                    z3.e eVarC = z3.f.c(-1985838161, new a42.c0((Object) qVar, (Object) fVar4, aVar5, (Object) p1Var3, (Object) p1Var2, 9), mVar3);
                    p3.m mVar4 = mVar3;
                    n82.c.a(rVarA, fVar4, 3, z18, eVarC, mVar4, 24960, 0);
                    mVar4.y();
                } else {
                    mVar3.e();
                }
                return Unit.INSTANCE;
            case 6:
                c2.j.l lVar4 = (c2.j.l) obj9;
                h4.d.b bVar4 = (h4.d.b) obj8;
                String str5 = (String) obj3;
                e23.a aVar8 = (e23.a) obj7;
                String str6 = (String) obj6;
                e23.a aVar9 = (e23.a) obj5;
                e23.q qVar2 = (e23.q) obj4;
                p3.m mVar5 = (p3.m) obj;
                int iIntValue4 = ((Integer) obj2).intValue();
                if (mVar5.n(iIntValue4 & 1, (iIntValue4 & 3) != 2)) {
                    p3.x1 x1Var4 = p3.n.f135158a;
                    h4.r.a aVar10 = h4.r.S;
                    h4.r rVarD = c2.x2.d(aVar10, 1.0f);
                    d92.b.f58623a.getClass();
                    d92.b.f58625c.getClass();
                    j92.e eVar3 = j92.b.f97899b;
                    h4.r rVarC6 = c2.l.C(c2.l.A(rVarD, eVar3.f97920e, 0.0f, 2), 0.0f, 0.0f, 0.0f, eVar3.f97920e, 7);
                    c2.j.f22691a.getClass();
                    c2.j.k kVar2 = c2.j.f22694d;
                    h4.d.f81522a.getClass();
                    c2.z zVarA3 = c2.y.a(kVar2, h4.d.a.f81536n, mVar5, 0);
                    int iHashCode4 = Long.hashCode(mVar5.getU());
                    p3.i2 i2VarX4 = mVar5.x();
                    h4.r rVarC7 = h4.k.c(rVarC6, mVar5);
                    h5.g.V.getClass();
                    h5.e0.a aVar11 = h5.g.a.f81805b;
                    if (mVar5.F() == null) {
                        p3.p0.l();
                        throw null;
                    }
                    mVar5.z();
                    if (mVar5.getT()) {
                        mVar5.M(aVar11);
                    } else {
                        mVar5.c();
                    }
                    h5.g.a.e eVar4 = h5.g.a.f81810g;
                    p3.b4.c(eVar4, zVarA3, mVar5);
                    h5.g.a.C1623g c1623g = h5.g.a.f81809f;
                    p3.b4.c(c1623g, i2VarX4, mVar5);
                    h5.g.a.b bVar5 = h5.g.a.f81813j;
                    if (mVar5.getT()) {
                        i14 = 6;
                    } else {
                        i14 = 6;
                        if (!p005kotlin.jvm.internal.s.g(mVar5.q(), Integer.valueOf(iHashCode4))) {
                        }
                        fVar = h5.g.a.f81807d;
                        p3.b4.c(fVar, rVarC7, mVar5);
                        b0Var = c2.b0.f22601a;
                        h4.r rVarB2 = u1.a2.b(b0Var.a(c2.x2.f(aVar10, 1.0f), 1.0f, true), u1.a2.a(mVar5), true);
                        zVarA = c2.y.a(lVar4, bVar4, mVar5, 0);
                        iHashCode = Long.hashCode(mVar5.getU());
                        i2VarX = mVar5.x();
                        rVarC = h4.k.c(rVarB2, mVar5);
                        if (mVar5.F() != null) {
                            p3.p0.l();
                            throw null;
                        }
                        mVar5.z();
                        if (mVar5.getT()) {
                            mVar5.M(aVar11);
                        } else {
                            mVar5.c();
                        }
                        p3.b4.c(eVar4, zVarA, mVar5);
                        p3.b4.c(c1623g, i2VarX, mVar5);
                        if (mVar5.getT() || !p005kotlin.jvm.internal.s.g(mVar5.q(), Integer.valueOf(iHashCode))) {
                            v.h.z(iHashCode, mVar5, iHashCode, bVar5);
                        }
                        p3.b4.c(fVar, rVarC, mVar5);
                        qVar2.invoke(b0Var, mVar5, Integer.valueOf(i14));
                        mVar5.y();
                        da0.b.a(c2.x2.f(aVar10, 1.0f), str5, aVar8, true, str6, aVar9, true, null, null, true, mVar5, 6, 0);
                        mVar5.y();
                    }
                    v.h.z(iHashCode4, mVar5, iHashCode4, bVar5);
                    fVar = h5.g.a.f81807d;
                    p3.b4.c(fVar, rVarC7, mVar5);
                    b0Var = c2.b0.f22601a;
                    h4.r rVarB3 = u1.a2.b(b0Var.a(c2.x2.f(aVar10, 1.0f), 1.0f, true), u1.a2.a(mVar5), true);
                    zVarA = c2.y.a(lVar4, bVar4, mVar5, 0);
                    iHashCode = Long.hashCode(mVar5.getU());
                    i2VarX = mVar5.x();
                    rVarC = h4.k.c(rVarB3, mVar5);
                    if (mVar5.F() != null) {
                        p3.p0.l();
                        throw null;
                    }
                    mVar5.z();
                    if (mVar5.getT()) {
                        mVar5.M(aVar11);
                    } else {
                        mVar5.c();
                    }
                    p3.b4.c(eVar4, zVarA, mVar5);
                    p3.b4.c(c1623g, i2VarX, mVar5);
                    if (mVar5.getT()) {
                        v.h.z(iHashCode, mVar5, iHashCode, bVar5);
                    } else {
                        v.h.z(iHashCode, mVar5, iHashCode, bVar5);
                    }
                    p3.b4.c(fVar, rVarC, mVar5);
                    qVar2.invoke(b0Var, mVar5, Integer.valueOf(i14));
                    mVar5.y();
                    da0.b.a(c2.x2.f(aVar10, 1.0f), str5, aVar8, true, str6, aVar9, true, null, null, true, mVar5, 6, 0);
                    mVar5.y();
                } else {
                    mVar5.e();
                }
                return Unit.INSTANCE;
            case 7:
                String str7 = (String) obj3;
                e23.a aVar12 = (e23.a) obj9;
                i53.c cVar3 = (i53.c) obj8;
                i53.c cVar4 = (i53.c) obj7;
                e23.l lVar5 = (e23.l) obj6;
                fe feVar2 = (fe) obj4;
                e23.p pVar5 = (e23.p) obj5;
                p3.m mVar6 = (p3.m) obj;
                int iIntValue5 = ((Integer) obj2).intValue();
                if (mVar6.n(iIntValue5 & 1, (iIntValue5 & 3) != 2)) {
                    p3.x1 x1Var5 = p3.n.f135158a;
                    if (str7 == null || (rVarC2 = kotlin.o3.c(h4.r.S, str7)) == null) {
                        rVarC2 = h4.r.S;
                    }
                    h4.r rVar2 = rVarC2;
                    z3.e eVarC2 = z3.f.c(237918786, new d50.i(aVar12, cVar3, cVar4, lVar5), mVar6);
                    z3.e eVarC3 = z3.f.c(264064580, new ak0.o(feVar2, i18), mVar6);
                    o4.d0.f128823b.getClass();
                    kb.a(rVar2, eVarC2, null, eVarC3, null, 0, o4.d0.f128831j, 0L, null, z3.f.c(555457805, new ba2.i(pVar5, 1), mVar6), mVar6, 806882352, 436);
                } else {
                    mVar6.e();
                }
                return Unit.INSTANCE;
            case 8:
                ((Integer) obj2).getClass();
                ds.v.a((qr.t) obj9, (nr.p0) obj8, (Bitmap) obj7, (e23.a) obj6, (n4.d) obj5, (e23.l) obj4, (e23.a) obj3, (p3.m) obj, p3.p0.t(1));
                return Unit.INSTANCE;
            case 9:
                lc.m0 m0Var4 = (lc.m0) obj6;
                e62.c cVar5 = (e62.c) obj9;
                w52.v0 v0Var = (w52.v0) obj8;
                com.garmin.android.apps.connectmobile.workouts.presentation.details.f fVar5 = (com.garmin.android.apps.connectmobile.workouts.presentation.details.f) obj7;
                e23.a aVar13 = (e23.a) obj5;
                e23.l lVar6 = (e23.l) obj4;
                e23.a aVar14 = (e23.a) obj3;
                p3.m mVar7 = (p3.m) obj;
                int iIntValue6 = ((Integer) obj2).intValue();
                if (mVar7.n(iIntValue6 & 1, (iIntValue6 & 3) != 2)) {
                    p3.x1 x1Var6 = p3.n.f135158a;
                    boolean zR = mVar7.r(v0Var) | mVar7.r(fVar5) | mVar7.B(aVar13) | mVar7.r(m0Var4) | mVar7.B(lVar6) | mVar7.B(aVar14);
                    Object objQ5 = mVar7.q();
                    if (zR) {
                        m0Var = m0Var4;
                        pVar = new aa2.p(v0Var, fVar5, aVar13, m0Var, lVar6, aVar14);
                        mVar7.K(pVar);
                    } else {
                        aVar.getClass();
                        if (objQ5 == p3.m.a.f135155b) {
                            m0Var = m0Var4;
                            pVar = new aa2.p(v0Var, fVar5, aVar13, m0Var, lVar6, aVar14);
                            mVar7.K(pVar);
                        } else {
                            m0Var = m0Var4;
                            pVar = objQ5;
                        }
                    }
                    nc.y.a(m0Var, cVar5, null, null, null, null, null, null, null, (e23.l) pVar, mVar7, 0, 2044);
                } else {
                    mVar7.e();
                }
                return Unit.INSTANCE;
            case 10:
                e23.a aVar15 = (e23.a) obj9;
                pt1.c cVar6 = (pt1.c) obj8;
                e23.a aVar16 = (e23.a) obj7;
                e23.l lVar7 = (e23.l) obj6;
                p3.p1 p1Var4 = (p3.p1) obj5;
                e23.p pVar6 = (e23.p) obj4;
                e23.a aVar17 = (e23.a) obj3;
                p3.m mVar8 = (p3.m) obj;
                int iIntValue7 = ((Integer) obj2).intValue();
                if (mVar8.n(iIntValue7 & 1, (iIntValue7 & 3) != 2)) {
                    p3.x1 x1Var7 = p3.n.f135158a;
                    h4.r.a aVar18 = h4.r.S;
                    c2.j.f22691a.getClass();
                    c2.j.k kVar3 = c2.j.f22694d;
                    h4.d.f81522a.getClass();
                    c2.z zVarA4 = c2.y.a(kVar3, h4.d.a.f81536n, mVar8, 0);
                    int iHashCode5 = Long.hashCode(mVar8.getU());
                    p3.i2 i2VarX5 = mVar8.x();
                    h4.r rVarC8 = h4.k.c(aVar18, mVar8);
                    h5.g.V.getClass();
                    h5.e0.a aVar19 = h5.g.a.f81805b;
                    if (mVar8.F() == null) {
                        p3.p0.l();
                        throw null;
                    }
                    mVar8.z();
                    if (mVar8.getT()) {
                        mVar8.M(aVar19);
                    } else {
                        mVar8.c();
                    }
                    p3.b4.c(h5.g.a.f81810g, zVarA4, mVar8);
                    p3.b4.c(h5.g.a.f81809f, i2VarX5, mVar8);
                    h5.g.a.b bVar6 = h5.g.a.f81813j;
                    if (mVar8.getT() || !p005kotlin.jvm.internal.s.g(mVar8.q(), Integer.valueOf(iHashCode5))) {
                        v.h.z(iHashCode5, mVar8, iHashCode5, bVar6);
                    }
                    p3.b4.c(h5.g.a.f81807d, rVarC8, mVar8);
                    c2.b0 b0Var4 = c2.b0.f22601a;
                    String strQ = gl1.y.Q(mVar8, R.string.lbl_garmin_trails);
                    String strQ2 = gl1.y.Q(mVar8, R.string.saved_trails_menu_item);
                    u4.d.b bVar7 = u4.d.f168373k;
                    i53.f fVarA2 = i53.a.a(new l72.i3("menu_item_saved_trails", strQ2, false, n5.e.b(R.drawable.saved_trails_icon, mVar8, 6), gl1.y.Q(mVar8, R.string.saved_trails_menu_item), 4, (p005kotlin.jvm.internal.j) null));
                    if (cVar6.f140823h) {
                        mVar8.C(-711312866);
                        fVarA = i53.a.a(new l72.i3("menu_item_my_trails", gl1.y.Q(mVar8, R.string.profile_view_user_trail_reviews), false, (u4.d) null, (String) null, 28, (p005kotlin.jvm.internal.j) null));
                        mVar8.f();
                    } else {
                        mVar8.C(-710982406);
                        mVar8.f();
                        fVarA = null;
                    }
                    boolean zB3 = mVar8.B(aVar16) | mVar8.B(lVar7);
                    Object objQ6 = mVar8.q();
                    if (zB3) {
                        objQ6 = new et1.g1(aVar16, lVar7);
                        mVar8.K(objQ6);
                    } else {
                        aVar.getClass();
                        if (objQ6 == p3.m.a.f135155b) {
                            objQ6 = new et1.g1(aVar16, lVar7);
                            mVar8.K(objQ6);
                        }
                    }
                    z02.f.d(strQ, null, null, aVar15, fVarA2, fVarA, (e23.l) objQ6, mVar8, 2359296, 22);
                    String str8 = (String) p1Var4.getF182175a();
                    boolean z19 = cVar6.f140818c;
                    String strQ3 = gl1.y.Q(mVar8, R.string.lbl_search);
                    boolean zB4 = mVar8.B(p1Var4) | mVar8.B(pVar6);
                    Object objQ7 = mVar8.q();
                    if (zB4) {
                        objQ7 = new e11.m(pVar6, p1Var4, i18);
                        mVar8.K(objQ7);
                    } else {
                        aVar.getClass();
                        if (objQ7 == p3.m.a.f135155b) {
                            objQ7 = new e11.m(pVar6, p1Var4, i18);
                            mVar8.K(objQ7);
                        }
                    }
                    e23.p pVar7 = (e23.p) objQ7;
                    boolean zB5 = mVar8.B(pVar6) | mVar8.B(p1Var4);
                    Object objQ8 = mVar8.q();
                    if (zB5) {
                        objQ8 = new et1.i(pVar6, p1Var4, 1);
                        mVar8.K(objQ8);
                    } else {
                        aVar.getClass();
                        if (objQ8 == p3.m.a.f135155b) {
                            objQ8 = new et1.i(pVar6, p1Var4, 1);
                            mVar8.K(objQ8);
                        }
                    }
                    et1.w1.b(str8, z19, strQ3, pVar7, (e23.l) objQ8, aVar17, mVar8, 0);
                    mVar8.y();
                } else {
                    mVar8.e();
                }
                return Unit.INSTANCE;
            case 11:
                ((Integer) obj2).getClass();
                hl1.m.a((hl1.n) obj9, (kl1.a) obj8, (e23.a) obj7, (e23.a) obj6, (e23.s) obj5, (e23.a) obj4, (g2.m1) obj3, (p3.m) obj, p3.p0.t(1));
                return Unit.INSTANCE;
            case 12:
                return a(obj, obj2);
            case 13:
                ((Integer) obj2).getClass();
                ib0.w.b((String) obj3, (ib0.g) obj9, (e23.l) obj8, (e23.l) obj7, (e23.a) obj6, (e23.a) obj5, (e23.a) obj4, (p3.m) obj, p3.p0.t(1));
                return Unit.INSTANCE;
            case 14:
                ((Integer) obj2).getClass();
                jv0.i.a((gv0.d) obj9, (yu0.f) obj8, (e23.a) obj7, (e23.l) obj6, (e23.a) obj5, (e23.a) obj4, (e23.a) obj3, (p3.m) obj, p3.p0.t(1));
                return Unit.INSTANCE;
            case 15:
                lc.m0 m0Var5 = (lc.m0) obj6;
                e23.a aVar20 = (e23.a) obj9;
                Context context = (Context) obj8;
                e23.a aVar21 = (e23.a) obj7;
                c.q qVar3 = (c.q) obj5;
                Long l14 = (Long) obj4;
                p3.p1 p1Var5 = (p3.p1) obj3;
                p3.m mVar9 = (p3.m) obj;
                int iIntValue8 = ((Integer) obj2).intValue();
                if (mVar9.n(1 & iIntValue8, (iIntValue8 & 3) != 2)) {
                    p3.x1 x1Var8 = p3.n.f135158a;
                    k62.n nVar = k62.n.INSTANCE;
                    boolean zB6 = mVar9.B(aVar20) | mVar9.r(m0Var5) | mVar9.r(context) | mVar9.B(aVar21) | mVar9.r(qVar3) | mVar9.B(l14);
                    Object objQ9 = mVar9.q();
                    if (zB6) {
                        m0Var2 = m0Var5;
                        b82.l0 l0Var = new b82.l0(aVar20, p1Var5, m0Var2, context, aVar21, qVar3, l14);
                        mVar9.K(l0Var);
                        objQ9 = l0Var;
                    } else {
                        aVar.getClass();
                        if (objQ9 == p3.m.a.f135155b) {
                            m0Var2 = m0Var5;
                            b82.l0 l0Var2 = new b82.l0(aVar20, p1Var5, m0Var2, context, aVar21, qVar3, l14);
                            mVar9.K(l0Var2);
                            objQ9 = l0Var2;
                        } else {
                            m0Var2 = m0Var5;
                        }
                    }
                    nc.y.a(m0Var2, nVar, null, null, null, null, null, null, null, (e23.l) objQ9, mVar9, 48, 2044);
                } else {
                    mVar9.e();
                }
                return Unit.INSTANCE;
            case 16:
                ((Integer) obj2).getClass();
                ku1.n.a((h4.r) obj9, (u4.d) obj8, (String) obj3, (String) obj7, (String) obj6, (String) obj5, (e23.a) obj4, (p3.m) obj, p3.p0.t(1));
                return Unit.INSTANCE;
            case 17:
                e23.a aVar22 = (e23.a) obj9;
                o53.b0 b0Var5 = (o53.b0) obj5;
                ky0.w0 w0Var = (ky0.w0) obj8;
                c.q qVar4 = (c.q) obj7;
                Context context2 = (Context) obj6;
                p3.x3 x3Var = (p3.x3) obj4;
                p3.p1 p1Var6 = (p3.p1) obj3;
                p3.m mVar10 = (p3.m) obj;
                int iIntValue9 = ((Integer) obj2).intValue();
                if (mVar10.n(iIntValue9 & 1, (iIntValue9 & 3) != 2)) {
                    p3.x1 x1Var9 = p3.n.f135158a;
                    c22.x0.f23314a.getClass();
                    String strW = gl1.d.W(c22.x0.f23377da);
                    boolean zB7 = mVar10.B(aVar22);
                    Object objQ10 = mVar10.q();
                    if (zB7) {
                        objQ10 = new ku1.a(aVar22, 13);
                        mVar10.K(objQ10);
                    } else {
                        aVar.getClass();
                        if (objQ10 == p3.m.a.f135155b) {
                            objQ10 = new ku1.a(aVar22, 13);
                            mVar10.K(objQ10);
                        }
                    }
                    e23.a aVar23 = (e23.a) objQ10;
                    if (((sy0.k) x3Var.getF182175a()).f161235c) {
                        mVar10.C(-138283543);
                        l72.i3 i3Var = new l72.i3("MENU_ITEM_EDIT", gl1.d.W(c22.x0.f23343ba), !((sy0.k) x3Var.getF182175a()).f161245m, (u4.d) null, (String) null, 24, (p005kotlin.jvm.internal.j) null);
                        String strW2 = gl1.d.W(c22.x0.Y9);
                        d92.b.f58623a.getClass();
                        cVarB = i53.a.a(i3Var, new l72.i3("MENU_ITEM_DELETE", strW2, false, o4.d0.a(d92.b.a(mVar10).k().e()), (o4.d0) null, (u4.d) null, (String) null, 116, (p005kotlin.jvm.internal.j) null));
                        mVar10.f();
                    } else {
                        mVar10.C(-137657870);
                        mVar10.f();
                        cVarB = j53.l.b();
                    }
                    i53.c cVar7 = cVarB;
                    boolean zR2 = mVar10.r(b0Var5) | mVar10.r(w0Var) | mVar10.r(qVar4) | mVar10.r(context2);
                    Object objQ11 = mVar10.q();
                    if (zR2) {
                        objQ11 = new jv0.c(b0Var5, w0Var, qVar4, context2, p1Var6, 1);
                        mVar10.K(objQ11);
                    } else {
                        aVar.getClass();
                        if (objQ11 == p3.m.a.f135155b) {
                            objQ11 = new jv0.c(b0Var5, w0Var, qVar4, context2, p1Var6, 1);
                            mVar10.K(objQ11);
                        }
                    }
                    z02.f.d(strW, null, null, aVar23, null, cVar7, (e23.l) objQ11, mVar10, 2097152, 54);
                } else {
                    mVar10.e();
                }
                return Unit.INSTANCE;
            case 18:
                ((Integer) obj2).getClass();
                l21.e.a((h4.r) obj9, (m21.e) obj8, (v21.e) obj7, (e23.a) obj6, (e23.l) obj5, (e23.l) obj4, (e23.l) obj3, (p3.m) obj, p3.p0.t(7));
                return Unit.INSTANCE;
            case 19:
                p005kotlin.jvm.internal.r0 r0Var = (p005kotlin.jvm.internal.r0) obj7;
                dz2.b bVar8 = (dz2.b) obj6;
                com.garmin.device.filetransfer.a aVar24 = (com.garmin.device.filetransfer.a) obj5;
                String str9 = (String) obj3;
                lk2.c0 c0Var = (lk2.c0) obj4;
                long jLongValue = ((Long) obj).longValue();
                Long l15 = (Long) obj2;
                l15.longValue();
                ((e23.p) obj9).invoke(Long.valueOf(((lk2.a0) obj8).f113160c.longValue() + jLongValue), l15);
                Long l16 = (Long) r0Var.f105810a;
                long f61810d = bVar8.getF126459l();
                if (l16 == null || l16.longValue() != f61810d) {
                    Logger logger = aVar24.f50729e;
                    if (logger == null) {
                        p005kotlin.jvm.internal.s.m("logger");
                        throw null;
                    }
                    logger.error(str9 + " failed: DataSource.size changed while in progress (" + r0Var.f105810a + " != " + bVar8.getF126459l() + ")");
                    c0Var.g(new DataSourceModifiedException(tn.k.g(str9, " failed: DataSource.size changed while in progress"), null, 2, null));
                }
                return Unit.INSTANCE;
            case 20:
                ((Integer) obj2).getClass();
                lm0.l.a((km0.b) obj9, (e23.l) obj8, (e23.l) obj7, (e23.l) obj6, (e23.l) obj5, (e23.l) obj4, (e23.a) obj3, (p3.m) obj, p3.p0.t(1));
                return Unit.INSTANCE;
            case 21:
                return b(obj, obj2);
            case 22:
                return c(obj, obj2);
            case 23:
                return d(obj, obj2);
            case 24:
                return e(obj, obj2);
            case 25:
                return f(obj, obj2);
            case 26:
                return g(obj, obj2);
            case 27:
                return h(obj, obj2);
            case 28:
                return i(obj, obj2);
            default:
                i01.a aVar25 = (i01.a) obj9;
                NutritionActivity.g gVar2 = (NutritionActivity.g) obj8;
                e23.p pVar8 = (e23.p) obj7;
                p3.x3 x3Var2 = (p3.x3) obj6;
                p3.x3 x3Var3 = (p3.x3) obj5;
                p3.x3 x3Var4 = (p3.x3) obj4;
                p3.p1 p1Var7 = (p3.p1) obj3;
                p3.m mVar11 = (p3.m) obj;
                int iIntValue10 = ((Integer) obj2).intValue();
                if (mVar11.n(iIntValue10 & 1, (iIntValue10 & 3) != 2)) {
                    p3.x1 x1Var10 = p3.n.f135158a;
                    i01.a.INSTANCE.getClass();
                    aVar25.getClass();
                    int i25 = i01.a.Companion.C1721a.f86724a[aVar25.ordinal()];
                    if (i25 == 1) {
                        i15 = R.string.lbl_copy;
                    } else {
                        if (i25 != 2) {
                            lc.u0.r();
                            return null;
                        }
                        i15 = R.string.label_move;
                    }
                    String strQ4 = gl1.y.Q(mVar11, i15);
                    i53.f fVarA3 = i53.a.a(new l72.i3("SAVE", gl1.y.Q(mVar11, R.string.lbl_save), ((Boolean) x3Var2.getF182175a()).booleanValue(), (u4.d) null, (String) null, 24, (p005kotlin.jvm.internal.j) null));
                    boolean zB8 = mVar11.B(pVar8);
                    Object objQ12 = mVar11.q();
                    if (zB8) {
                        objQ12 = new mt0.e0(pVar8, x3Var3, x3Var4, p1Var7, 17);
                        mVar11.K(objQ12);
                    } else {
                        aVar.getClass();
                        if (objQ12 == p3.m.a.f135155b) {
                            objQ12 = new mt0.e0(pVar8, x3Var3, x3Var4, p1Var7, 17);
                            mVar11.K(objQ12);
                        }
                    }
                    z02.f.d(strQ4, null, null, gVar2, fVarA3, null, (e23.l) objQ12, mVar11, GDIInReachMessaging.Capabilities.MessagingCapability.PLAN_CHANGE_VALUE, 86);
                } else {
                    mVar11.e();
                }
                return Unit.INSTANCE;
        }
    }

    public /* synthetic */ l0(int i14, int i15, Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, o13.h hVar) {
        this.f14816a = i15;
        this.f14818c = obj;
        this.f14819d = obj2;
        this.f14820e = obj3;
        this.f14821f = obj4;
        this.f14822g = obj5;
        this.f14823h = obj6;
        this.f14817b = hVar;
    }

    public /* synthetic */ l0(h4.r rVar, qg2.c cVar, ah2.e eVar, String str, og2.l lVar, pg2.a aVar, e23.a aVar2, int i14) {
        this.f14816a = 21;
        this.f14818c = rVar;
        this.f14819d = cVar;
        this.f14820e = eVar;
        this.f14817b = str;
        this.f14821f = lVar;
        this.f14822g = aVar;
        this.f14823h = aVar2;
    }

    public /* synthetic */ l0(h4.r rVar, u4.d dVar, String str, String str2, String str3, String str4, e23.a aVar, int i14) {
        this.f14816a = 16;
        this.f14818c = rVar;
        this.f14819d = dVar;
        this.f14817b = str;
        this.f14820e = str2;
        this.f14821f = str3;
        this.f14822g = str4;
        this.f14823h = aVar;
    }

    public /* synthetic */ l0(i53.f fVar, Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, int i14) {
        this.f14816a = i14;
        this.f14820e = fVar;
        this.f14818c = obj;
        this.f14819d = obj2;
        this.f14821f = obj3;
        this.f14822g = obj4;
        this.f14823h = obj5;
        this.f14817b = obj6;
    }

    public /* synthetic */ l0(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, int i14) {
        this.f14816a = i14;
        this.f14818c = obj;
        this.f14819d = obj2;
        this.f14820e = obj3;
        this.f14821f = obj4;
        this.f14822g = obj5;
        this.f14823h = obj6;
        this.f14817b = obj7;
    }

    public /* synthetic */ l0(Object obj, Object obj2, String str, e23.a aVar, Object obj3, Object obj4, Object obj5, int i14) {
        this.f14816a = i14;
        this.f14818c = obj;
        this.f14819d = obj2;
        this.f14817b = str;
        this.f14820e = aVar;
        this.f14821f = obj3;
        this.f14822g = obj4;
        this.f14823h = obj5;
    }

    public /* synthetic */ l0(Object obj, o53.b0 b0Var, Object obj2, Object obj3, Object obj4, p3.p1 p1Var, p3.p1 p1Var2, int i14) {
        this.f14816a = i14;
        this.f14818c = obj;
        this.f14822g = b0Var;
        this.f14819d = obj2;
        this.f14820e = obj3;
        this.f14821f = obj4;
        this.f14823h = p1Var;
        this.f14817b = p1Var2;
    }

    public /* synthetic */ l0(String str, e23.a aVar, i53.c cVar, i53.c cVar2, e23.l lVar, fe feVar, e23.p pVar) {
        this.f14816a = 7;
        this.f14817b = str;
        this.f14818c = aVar;
        this.f14819d = cVar;
        this.f14820e = cVar2;
        this.f14821f = lVar;
        this.f14823h = feVar;
        this.f14822g = pVar;
    }

    public /* synthetic */ l0(String str, Object obj, Object obj2, Object obj3, Object obj4, Object obj5, e23.a aVar, int i14, int i15) {
        this.f14816a = i15;
        this.f14817b = str;
        this.f14818c = obj;
        this.f14819d = obj2;
        this.f14820e = obj3;
        this.f14821f = obj4;
        this.f14822g = obj5;
        this.f14823h = aVar;
    }

    public /* synthetic */ l0(String str, String str2, b92.a aVar, e23.p pVar, z3.e eVar, e23.p pVar2, bb1.g gVar) {
        this.f14816a = 1;
        this.f14817b = str;
        this.f14818c = str2;
        this.f14819d = aVar;
        this.f14820e = pVar;
        this.f14821f = eVar;
        this.f14822g = pVar2;
        this.f14823h = gVar;
    }

    public /* synthetic */ l0(lc.m0 m0Var, Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, int i14) {
        this.f14816a = i14;
        this.f14821f = m0Var;
        this.f14818c = obj;
        this.f14819d = obj2;
        this.f14820e = obj3;
        this.f14822g = obj4;
        this.f14823h = obj5;
        this.f14817b = obj6;
    }
}
