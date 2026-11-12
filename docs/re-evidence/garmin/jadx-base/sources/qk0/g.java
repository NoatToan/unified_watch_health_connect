package qk0;

import am.x0;
import com.garmin.android.apps.connectmobile.R;
import gl1.y;
import java.util.ArrayList;
import java.util.Iterator;
import l72.c1;
import p005kotlin.Unit;
import p13.d0;
import p13.h0;
import p3.o0;
import p3.p2;
import p3.x1;

/* JADX INFO: loaded from: classes8.dex */
public final class g {

    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f145099a;

        static {
            int[] iArr = new int[c80.u.values().length];
            try {
                iArr[c80.u.f25597f.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[c80.u.f25598g.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[c80.u.f25600i.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[c80.u.f25601j.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[c80.u.f25602k.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[c80.u.f25604m.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[c80.u.f25605n.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[c80.u.f25606o.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[c80.u.f25607p.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr[c80.u.f25608q.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr[c80.u.f25609r.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr[c80.u.f25599h.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr[c80.u.f25603l.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr[c80.u.f25610t.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            f145099a = iArr;
        }
    }

    /* JADX WARN: Code duplicated, block: B:41:0x009d  */
    public static final void a(t tVar, e23.a<Unit> aVar, e23.a<Unit> aVar2, p3.m mVar, int i14) {
        boolean z14;
        String strJ;
        i53.c<mk0.a> cVar = tVar.f145156b;
        o0 o0VarP = fb1.c.p(aVar, aVar2, mVar, 1374018694);
        int i15 = i14 | (o0VarP.r(tVar) ? 4 : 2) | (o0VarP.r(aVar) ? 32 : 16);
        boolean z15 = true;
        if (o0VarP.n(i15 & 1, (i15 & 147) != 146)) {
            x1 x1Var = p3.n.f135158a;
            if (!cVar.isEmpty()) {
                Iterator<mk0.a> it = cVar.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        z14 = false;
                        break;
                    } else if (!it.next().f119099c.isEmpty()) {
                        z14 = true;
                        break;
                    }
                }
            } else {
                z14 = false;
                break;
            }
            if (!cVar.isEmpty()) {
                Iterator<mk0.a> it3 = cVar.iterator();
                do {
                    if (!it3.hasNext()) {
                        z15 = false;
                        break;
                    }
                } while (it3.next().f119098b.isEmpty());
            } else {
                z15 = false;
                break;
            }
            mk0.a aVar3 = (mk0.a) h0.K0(cVar);
            x0 x0Var = aVar3 != null ? aVar3.f119097a : null;
            boolean zR = o0VarP.r(tVar);
            Object objQ = o0VarP.q();
            if (zR) {
                objQ = new q42.d(tVar, 9);
                o0VarP.K(objQ);
            } else {
                p3.m.f135153a.getClass();
                if (objQ == p3.m.a.f135155b) {
                    objQ = new q42.d(tVar, 9);
                    o0VarP.K(objQ);
                }
            }
            o13.t tVarB = o13.m.b((e23.a) objQ);
            if (z14 && z15) {
                o0VarP.C(-1941712148);
                if (x0Var == null) {
                    o0VarP.C(-1941664997);
                    String str = (String) tVarB.getValue();
                    str.getClass();
                    strJ = y.P(R.string.gear_replace_existing_collections_and_gear_multiple, new Object[]{str}, o0VarP);
                    o0VarP.g0(false);
                } else {
                    strJ = com.airbnb.lottie.animation.keyframe.a.j(o0VarP, -1941531790, R.string.gear_replace_existing_collections_and_gear_single, o0VarP, false);
                }
                o0VarP.g0(false);
            } else if (z15) {
                o0VarP.C(-1941374434);
                if (x0Var == null) {
                    o0VarP.C(-1941327004);
                    String str2 = (String) tVarB.getValue();
                    str2.getClass();
                    strJ = y.P(R.string.gear_replace_existing_collections_multiple, new Object[]{str2}, o0VarP);
                    o0VarP.g0(false);
                } else {
                    strJ = com.airbnb.lottie.animation.keyframe.a.j(o0VarP, -1941202725, R.string.gear_replace_existing_collections_single, o0VarP, false);
                }
                o0VarP.g0(false);
            } else {
                o0VarP.C(-1941055692);
                ArrayList arrayList = new ArrayList();
                Iterator<mk0.a> it4 = cVar.iterator();
                while (it4.hasNext()) {
                    d0.v(arrayList, it4.next().f119099c);
                }
                ArrayList arrayList2 = new ArrayList(p13.y.r(arrayList, 10));
                Iterator it5 = arrayList.iterator();
                while (it5.hasNext()) {
                    arrayList2.add(((mk0.d) it5.next()).f119106b);
                }
                c80.u uVar = (c80.u) h0.J0(h0.g1(arrayList2));
                if (uVar == null) {
                    o0VarP.C(-1940861260);
                    if (x0Var == null) {
                        o0VarP.C(-1940810141);
                        String str3 = (String) tVarB.getValue();
                        str3.getClass();
                        strJ = y.P(R.string.gear_replace_existing_gear_multiple, new Object[]{str3}, o0VarP);
                        o0VarP.g0(false);
                    } else {
                        strJ = com.airbnb.lottie.animation.keyframe.a.j(o0VarP, -1940684870, R.string.gear_replace_existing_gear_single, o0VarP, false);
                    }
                    o0VarP.g0(false);
                } else {
                    o0VarP.C(-1940561087);
                    String strP = "";
                    if (x0Var == null) {
                        o0VarP.C(-1940510681);
                        String str4 = (String) tVarB.getValue();
                        str4.getClass();
                        x1 x1Var2 = p3.n.f135158a;
                        switch (a.f145099a[uVar.ordinal()]) {
                            case 1:
                                o0VarP.C(-470440741);
                                strP = y.P(R.string.gear_replace_existing_shoes_multiple, new Object[]{str4}, o0VarP);
                                o0VarP.g0(false);
                                break;
                            case 2:
                                o0VarP.C(-470437286);
                                strP = y.P(R.string.gear_replace_existing_bike_multiple, new Object[]{str4}, o0VarP);
                                o0VarP.g0(false);
                                break;
                            case 3:
                                o0VarP.C(-470433829);
                                strP = y.P(R.string.gear_replace_existing_boots_multiple, new Object[]{str4}, o0VarP);
                                o0VarP.g0(false);
                                break;
                            case 4:
                                o0VarP.C(-470430374);
                                strP = y.P(R.string.gear_replace_existing_skis_multiple, new Object[]{str4}, o0VarP);
                                o0VarP.g0(false);
                                break;
                            case 5:
                                o0VarP.C(-470426785);
                                strP = y.P(R.string.gear_replace_existing_snowboard_multiple, new Object[]{str4}, o0VarP);
                                o0VarP.g0(false);
                                break;
                            case 6:
                                o0VarP.C(-470423140);
                                strP = y.P(R.string.gear_replace_existing_skates_multiple, new Object[]{str4}, o0VarP);
                                o0VarP.g0(false);
                                break;
                            case 7:
                                o0VarP.C(-470419423);
                                strP = y.P(R.string.gear_replace_existing_paddleboard_multiple, new Object[]{str4}, o0VarP);
                                o0VarP.g0(false);
                                break;
                            case 8:
                                o0VarP.C(-470415617);
                                strP = y.P(R.string.gear_replace_existing_surfboard_multiple, new Object[]{str4}, o0VarP);
                                o0VarP.g0(false);
                                break;
                            case 9:
                                o0VarP.C(-470411873);
                                strP = y.P(R.string.gear_replace_existing_wakeboard_multiple, new Object[]{str4}, o0VarP);
                                o0VarP.g0(false);
                                break;
                            case 10:
                                o0VarP.C(-470408294);
                                strP = y.P(R.string.gear_replace_existing_boat_multiple, new Object[]{str4}, o0VarP);
                                o0VarP.g0(false);
                                break;
                            case 11:
                                o0VarP.C(-470404672);
                                strP = y.P(R.string.gear_replace_existing_wheelchair_multiple, new Object[]{str4}, o0VarP);
                                o0VarP.g0(false);
                                break;
                            case 12:
                            case 13:
                            case 14:
                                o0VarP.C(-1697430315);
                                o0VarP.g0(false);
                                break;
                            default:
                                throw kg.f.h(o0VarP, -470440711, false);
                        }
                        o0VarP.g0(false);
                    } else {
                        o0VarP.C(-1940388541);
                        x1 x1Var3 = p3.n.f135158a;
                        String strT = gl1.d.T(x0Var.f4360c, o0VarP, 0);
                        switch (a.f145099a[uVar.ordinal()]) {
                            case 1:
                                o0VarP.C(1046285028);
                                strP = y.P(R.string.gear_replace_existing_shoes_single, new Object[]{strT}, o0VarP);
                                o0VarP.g0(false);
                                break;
                            case 2:
                                o0VarP.C(1046288259);
                                strP = y.P(R.string.gear_replace_existing_bike_single, new Object[]{strT}, o0VarP);
                                o0VarP.g0(false);
                                break;
                            case 3:
                                o0VarP.C(1046291492);
                                strP = y.P(R.string.gear_replace_existing_boots_single, new Object[]{strT}, o0VarP);
                                o0VarP.g0(false);
                                break;
                            case 4:
                                o0VarP.C(1046294723);
                                strP = y.P(R.string.gear_replace_existing_skis_single, new Object[]{strT}, o0VarP);
                                o0VarP.g0(false);
                                break;
                            case 5:
                                o0VarP.C(1046298088);
                                strP = y.P(R.string.gear_replace_existing_snowboard_single, new Object[]{strT}, o0VarP);
                                o0VarP.g0(false);
                                break;
                            case 6:
                                o0VarP.C(1046301509);
                                strP = y.P(R.string.gear_replace_existing_skates_single, new Object[]{strT}, o0VarP);
                                o0VarP.g0(false);
                                break;
                            case 7:
                                o0VarP.C(1046305002);
                                strP = y.P(R.string.gear_replace_existing_paddleboard_single, new Object[]{strT}, o0VarP);
                                o0VarP.g0(false);
                                break;
                            case 8:
                                o0VarP.C(1046308584);
                                strP = y.P(R.string.gear_replace_existing_surfboard_single, new Object[]{strT}, o0VarP);
                                o0VarP.g0(false);
                                break;
                            case 9:
                                o0VarP.C(1046312104);
                                strP = y.P(R.string.gear_replace_existing_wakeboard_single, new Object[]{strT}, o0VarP);
                                o0VarP.g0(false);
                                break;
                            case 10:
                                o0VarP.C(1046315459);
                                strP = y.P(R.string.gear_replace_existing_boat_single, new Object[]{strT}, o0VarP);
                                o0VarP.g0(false);
                                break;
                            case 11:
                                o0VarP.C(1046318857);
                                strP = y.P(R.string.gear_replace_existing_wheelchair_single, new Object[]{strT}, o0VarP);
                                o0VarP.g0(false);
                                break;
                            case 12:
                            case 13:
                            case 14:
                                o0VarP.C(-1923647899);
                                o0VarP.g0(false);
                                break;
                            default:
                                throw kg.f.h(o0VarP, 1046284988, false);
                        }
                        o0VarP.g0(false);
                    }
                    o0VarP.g0(false);
                    strJ = strP;
                }
                o0VarP.g0(false);
            }
            c1.f110940a.a(false, y.Q(o0VarP, R.string.lbl_gear_default_title), strJ, null, null, y.Q(o0VarP, R.string.lbl_replace), true, false, aVar, y.Q(o0VarP, R.string.lbl_cancel), aVar2, o0VarP, ((i15 << 21) & 234881024) | 1572864, 6, 153);
            x1 x1Var4 = p3.n.f135158a;
        } else {
            o0VarP.e();
        }
        p2 p2VarI0 = o0VarP.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new pp.g(tVar, aVar, aVar2, i14, 5);
        }
    }
}
