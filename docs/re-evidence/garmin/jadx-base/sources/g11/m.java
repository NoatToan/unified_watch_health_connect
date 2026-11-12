package g11;

import android.content.Context;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import b21.l4;
import b63.u;
import c80.q;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.nutrition.presentation.NutritionActivity;
import e11.f0;
import ew1.r1;
import gl1.y;
import h4.r;
import ht.s;
import o4.d0;
import o70.t;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Unit;
import p3.o0;
import p3.p2;
import p3.x1;
import yz1.z;

/* JADX INFO: loaded from: classes9.dex */
public final class m {
    /* JADX WARN: Code duplicated, block: B:101:0x01da  */
    /* JADX WARN: Code duplicated, block: B:43:0x00de  */
    /* JADX WARN: Code duplicated, block: B:54:0x0113  */
    /* JADX WARN: Code duplicated, block: B:79:0x0179  */
    /* JADX WARN: Code duplicated, block: B:82:0x0186  */
    /* JADX WARN: Code duplicated, block: B:84:0x018a  */
    /* JADX WARN: Code duplicated, block: B:85:0x0191  */
    /* JADX WARN: Code duplicated, block: B:87:0x0195  */
    /* JADX WARN: Code duplicated, block: B:89:0x01a2  */
    /* JADX WARN: Code duplicated, block: B:91:0x01ad  */
    /* JADX WARN: Code duplicated, block: B:93:0x01b8  */
    /* JADX WARN: Code duplicated, block: B:95:0x01c5  */
    /* JADX WARN: Code duplicated, block: B:96:0x01c7  */
    /* JADX WARN: Code duplicated, block: B:99:0x01d3  */
    public static final void a(r rVar, v21.e eVar, final q01.f fVar, p3.m mVar, int i14) {
        o0 o0Var;
        v21.e eVar2;
        int i15;
        v21.e eVar3;
        int i16;
        int i17;
        z zVar;
        v21.e eVar4;
        int i18;
        boolean z14;
        int i19;
        String strJ;
        int i24;
        String strJ2;
        int i25;
        int i26;
        int i27;
        int i28;
        boolean z15;
        boolean zR;
        Object objQ;
        o0 o0VarE = mVar.E(1688139254);
        int i29 = i14 | (o0VarE.B(rVar) ? 4 : 2) | 16 | (o0VarE.B(fVar) ? 256 : 128);
        final int i30 = 0;
        if (o0VarE.n(i29 & 1, (i29 & 147) != 146)) {
            o0VarE.G0();
            int i34 = i14 & 1;
            p3.m.a aVar = p3.m.f135153a;
            if (i34 == 0 || o0VarE.o0()) {
                Object objQ2 = o0VarE.q();
                aVar.getClass();
                if (objQ2 == p3.m.a.f135155b) {
                    objQ2 = (v21.e) KoinJavaComponent.get$default(v21.e.class, null, null, 6, null);
                    o0VarE.K(objQ2);
                }
                v21.e eVar5 = (v21.e) objQ2;
                i15 = i29 & (-113);
                eVar3 = eVar5;
            } else {
                o0VarE.e();
                i15 = i29 & (-113);
                eVar3 = eVar;
            }
            o0VarE.h0();
            x1 x1Var = p3.n.f135158a;
            final Context context = (Context) o0VarE.A(AndroidCompositionLocals_androidKt.f6042b);
            if (fVar instanceof q01.f.e) {
                i16 = 1584764554;
                i17 = R.string.title_no_food_logged;
            } else {
                i16 = 1584699857;
                i17 = R.string.lbl_nutrition;
            }
            String strJ3 = com.airbnb.lottie.animation.keyframe.a.j(o0VarE, i16, i17, o0VarE, false);
            yz1.d dVar = new yz1.d(fVar.f142005a, null, false, 6, null);
            t tVar = t.T;
            u4.d dVarB = t.b(tVar);
            d0 d0VarE = tVar.e(null, o0VarE, 1);
            int i35 = fVar.getF142017e() ? R.drawable.ic_gcm_add_16 : 0;
            String strQ = y.Q(o0VarE, R.string.log_food);
            int i36 = i15 & 896;
            boolean zR2 = (i36 == 256) | o0VarE.r(context);
            Object objQ3 = o0VarE.q();
            if (zR2) {
                objQ3 = new e23.a() { // from class: g11.l
                    @Override // e23.a
                    public final Object invoke() {
                        switch (i30) {
                            case 0:
                                s sVar = s.f85508a;
                                lt.e.k kVar = new lt.e.k(lt.e.a.Add, t.T);
                                sVar.getClass();
                                s.a(kVar);
                                boolean z16 = fVar instanceof q01.f.d;
                                Context context2 = context;
                                if (z16) {
                                    b21.b.a(context2);
                                } else {
                                    context2.startActivity(NutritionActivity.a.a(NutritionActivity.f39581f, context2, null, null, new l4.m((m21.b) m21.b.e.INSTANCE, g22.l.e(u.INSTANCE), (b11.k) null, false, 12, (p005kotlin.jvm.internal.j) null), false, false, 54));
                                }
                                break;
                            case 1:
                                s sVar2 = s.f85508a;
                                lt.e.k kVar2 = new lt.e.k(lt.e.a.Tapped, t.T);
                                sVar2.getClass();
                                s.a(kVar2);
                                q01.f fVar2 = fVar;
                                if ((fVar2 instanceof q01.f.C2664f) || (fVar2 instanceof q01.f.d)) {
                                    NutritionActivity.a aVar2 = NutritionActivity.f39581f;
                                    Context context3 = context;
                                    context3.startActivity(NutritionActivity.a.a(aVar2, context3, null, null, null, false, false, 62));
                                }
                                break;
                            default:
                                q01.f fVar3 = fVar;
                                boolean z17 = fVar3 instanceof q01.f.e;
                                Context context4 = context;
                                if (z17) {
                                    s sVar3 = s.f85508a;
                                    lt.e.k kVar3 = new lt.e.k(lt.e.a.LearnMore, t.T);
                                    sVar3.getClass();
                                    s.a(kVar3);
                                    context4.startActivity(NutritionActivity.a.a(NutritionActivity.f39581f, context4, null, null, new l4.m((m21.b) m21.b.e.INSTANCE, g22.l.e(u.INSTANCE), (b11.k) null, false, 12, (p005kotlin.jvm.internal.j) null), false, false, 54));
                                } else if (fVar3 instanceof q01.f.g) {
                                    s sVar4 = s.f85508a;
                                    lt.e.k kVar4 = new lt.e.k(lt.e.a.LearnMore, t.T);
                                    sVar4.getClass();
                                    s.a(kVar4);
                                    context4.startActivity(NutritionActivity.a.a(NutritionActivity.f39581f, context4, null, null, null, false, false, 62));
                                } else if (fVar3 instanceof q01.f.h) {
                                    s sVar5 = s.f85508a;
                                    lt.e.k kVar5 = new lt.e.k(lt.e.a.LearnMore, t.T);
                                    sVar5.getClass();
                                    s.a(kVar5);
                                    context4.startActivity(((ub1.g) KoinJavaComponent.get$default(ub1.g.class, null, null, 6, null)).g(context4, q.NUTRITION, false));
                                }
                                break;
                        }
                        return Unit.INSTANCE;
                    }
                };
                o0VarE.K(objQ3);
            } else {
                aVar.getClass();
                if (objQ3 == p3.m.a.f135155b) {
                    objQ3 = new e23.a() { // from class: g11.l
                        @Override // e23.a
                        public final Object invoke() {
                            switch (i30) {
                                case 0:
                                    s sVar = s.f85508a;
                                    lt.e.k kVar = new lt.e.k(lt.e.a.Add, t.T);
                                    sVar.getClass();
                                    s.a(kVar);
                                    boolean z16 = fVar instanceof q01.f.d;
                                    Context context2 = context;
                                    if (z16) {
                                        b21.b.a(context2);
                                    } else {
                                        context2.startActivity(NutritionActivity.a.a(NutritionActivity.f39581f, context2, null, null, new l4.m((m21.b) m21.b.e.INSTANCE, g22.l.e(u.INSTANCE), (b11.k) null, false, 12, (p005kotlin.jvm.internal.j) null), false, false, 54));
                                    }
                                    break;
                                case 1:
                                    s sVar2 = s.f85508a;
                                    lt.e.k kVar2 = new lt.e.k(lt.e.a.Tapped, t.T);
                                    sVar2.getClass();
                                    s.a(kVar2);
                                    q01.f fVar2 = fVar;
                                    if ((fVar2 instanceof q01.f.C2664f) || (fVar2 instanceof q01.f.d)) {
                                        NutritionActivity.a aVar2 = NutritionActivity.f39581f;
                                        Context context3 = context;
                                        context3.startActivity(NutritionActivity.a.a(aVar2, context3, null, null, null, false, false, 62));
                                    }
                                    break;
                                default:
                                    q01.f fVar3 = fVar;
                                    boolean z17 = fVar3 instanceof q01.f.e;
                                    Context context4 = context;
                                    if (z17) {
                                        s sVar3 = s.f85508a;
                                        lt.e.k kVar3 = new lt.e.k(lt.e.a.LearnMore, t.T);
                                        sVar3.getClass();
                                        s.a(kVar3);
                                        context4.startActivity(NutritionActivity.a.a(NutritionActivity.f39581f, context4, null, null, new l4.m((m21.b) m21.b.e.INSTANCE, g22.l.e(u.INSTANCE), (b11.k) null, false, 12, (p005kotlin.jvm.internal.j) null), false, false, 54));
                                    } else if (fVar3 instanceof q01.f.g) {
                                        s sVar4 = s.f85508a;
                                        lt.e.k kVar4 = new lt.e.k(lt.e.a.LearnMore, t.T);
                                        sVar4.getClass();
                                        s.a(kVar4);
                                        context4.startActivity(NutritionActivity.a.a(NutritionActivity.f39581f, context4, null, null, null, false, false, 62));
                                    } else if (fVar3 instanceof q01.f.h) {
                                        s sVar5 = s.f85508a;
                                        lt.e.k kVar5 = new lt.e.k(lt.e.a.LearnMore, t.T);
                                        sVar5.getClass();
                                        s.a(kVar5);
                                        context4.startActivity(((ub1.g) KoinJavaComponent.get$default(ub1.g.class, null, null, 6, null)).g(context4, q.NUTRITION, false));
                                    }
                                    break;
                            }
                            return Unit.INSTANCE;
                        }
                    };
                    o0VarE.K(objQ3);
                }
            }
            e23.a aVar2 = (e23.a) objQ3;
            z3.e eVarC = z3.f.c(400650291, new r1(24, fVar, eVar3), o0VarE);
            boolean zR3 = (i36 == 256) | o0VarE.r(context);
            Object objQ4 = o0VarE.q();
            if (zR3) {
                final int i37 = 1;
                objQ4 = new e23.a() { // from class: g11.l
                    @Override // e23.a
                    public final Object invoke() {
                        switch (i37) {
                            case 0:
                                s sVar = s.f85508a;
                                lt.e.k kVar = new lt.e.k(lt.e.a.Add, t.T);
                                sVar.getClass();
                                s.a(kVar);
                                boolean z16 = fVar instanceof q01.f.d;
                                Context context2 = context;
                                if (z16) {
                                    b21.b.a(context2);
                                } else {
                                    context2.startActivity(NutritionActivity.a.a(NutritionActivity.f39581f, context2, null, null, new l4.m((m21.b) m21.b.e.INSTANCE, g22.l.e(u.INSTANCE), (b11.k) null, false, 12, (p005kotlin.jvm.internal.j) null), false, false, 54));
                                }
                                break;
                            case 1:
                                s sVar2 = s.f85508a;
                                lt.e.k kVar2 = new lt.e.k(lt.e.a.Tapped, t.T);
                                sVar2.getClass();
                                s.a(kVar2);
                                q01.f fVar2 = fVar;
                                if ((fVar2 instanceof q01.f.C2664f) || (fVar2 instanceof q01.f.d)) {
                                    NutritionActivity.a aVar3 = NutritionActivity.f39581f;
                                    Context context3 = context;
                                    context3.startActivity(NutritionActivity.a.a(aVar3, context3, null, null, null, false, false, 62));
                                }
                                break;
                            default:
                                q01.f fVar3 = fVar;
                                boolean z17 = fVar3 instanceof q01.f.e;
                                Context context4 = context;
                                if (z17) {
                                    s sVar3 = s.f85508a;
                                    lt.e.k kVar3 = new lt.e.k(lt.e.a.LearnMore, t.T);
                                    sVar3.getClass();
                                    s.a(kVar3);
                                    context4.startActivity(NutritionActivity.a.a(NutritionActivity.f39581f, context4, null, null, new l4.m((m21.b) m21.b.e.INSTANCE, g22.l.e(u.INSTANCE), (b11.k) null, false, 12, (p005kotlin.jvm.internal.j) null), false, false, 54));
                                } else if (fVar3 instanceof q01.f.g) {
                                    s sVar4 = s.f85508a;
                                    lt.e.k kVar4 = new lt.e.k(lt.e.a.LearnMore, t.T);
                                    sVar4.getClass();
                                    s.a(kVar4);
                                    context4.startActivity(NutritionActivity.a.a(NutritionActivity.f39581f, context4, null, null, null, false, false, 62));
                                } else if (fVar3 instanceof q01.f.h) {
                                    s sVar5 = s.f85508a;
                                    lt.e.k kVar5 = new lt.e.k(lt.e.a.LearnMore, t.T);
                                    sVar5.getClass();
                                    s.a(kVar5);
                                    context4.startActivity(((ub1.g) KoinJavaComponent.get$default(ub1.g.class, null, null, 6, null)).g(context4, q.NUTRITION, false));
                                }
                                break;
                        }
                        return Unit.INSTANCE;
                    }
                };
                o0VarE.K(objQ4);
            } else {
                aVar.getClass();
                if (objQ4 == p3.m.a.f135155b) {
                    final int i38 = 1;
                    objQ4 = new e23.a() { // from class: g11.l
                        @Override // e23.a
                        public final Object invoke() {
                            switch (i38) {
                                case 0:
                                    s sVar = s.f85508a;
                                    lt.e.k kVar = new lt.e.k(lt.e.a.Add, t.T);
                                    sVar.getClass();
                                    s.a(kVar);
                                    boolean z16 = fVar instanceof q01.f.d;
                                    Context context2 = context;
                                    if (z16) {
                                        b21.b.a(context2);
                                    } else {
                                        context2.startActivity(NutritionActivity.a.a(NutritionActivity.f39581f, context2, null, null, new l4.m((m21.b) m21.b.e.INSTANCE, g22.l.e(u.INSTANCE), (b11.k) null, false, 12, (p005kotlin.jvm.internal.j) null), false, false, 54));
                                    }
                                    break;
                                case 1:
                                    s sVar2 = s.f85508a;
                                    lt.e.k kVar2 = new lt.e.k(lt.e.a.Tapped, t.T);
                                    sVar2.getClass();
                                    s.a(kVar2);
                                    q01.f fVar2 = fVar;
                                    if ((fVar2 instanceof q01.f.C2664f) || (fVar2 instanceof q01.f.d)) {
                                        NutritionActivity.a aVar3 = NutritionActivity.f39581f;
                                        Context context3 = context;
                                        context3.startActivity(NutritionActivity.a.a(aVar3, context3, null, null, null, false, false, 62));
                                    }
                                    break;
                                default:
                                    q01.f fVar3 = fVar;
                                    boolean z17 = fVar3 instanceof q01.f.e;
                                    Context context4 = context;
                                    if (z17) {
                                        s sVar3 = s.f85508a;
                                        lt.e.k kVar3 = new lt.e.k(lt.e.a.LearnMore, t.T);
                                        sVar3.getClass();
                                        s.a(kVar3);
                                        context4.startActivity(NutritionActivity.a.a(NutritionActivity.f39581f, context4, null, null, new l4.m((m21.b) m21.b.e.INSTANCE, g22.l.e(u.INSTANCE), (b11.k) null, false, 12, (p005kotlin.jvm.internal.j) null), false, false, 54));
                                    } else if (fVar3 instanceof q01.f.g) {
                                        s sVar4 = s.f85508a;
                                        lt.e.k kVar4 = new lt.e.k(lt.e.a.LearnMore, t.T);
                                        sVar4.getClass();
                                        s.a(kVar4);
                                        context4.startActivity(NutritionActivity.a.a(NutritionActivity.f39581f, context4, null, null, null, false, false, 62));
                                    } else if (fVar3 instanceof q01.f.h) {
                                        s sVar5 = s.f85508a;
                                        lt.e.k kVar5 = new lt.e.k(lt.e.a.LearnMore, t.T);
                                        sVar5.getClass();
                                        s.a(kVar5);
                                        context4.startActivity(((ub1.g) KoinJavaComponent.get$default(ub1.g.class, null, null, 6, null)).g(context4, q.NUTRITION, false));
                                    }
                                    break;
                            }
                            return Unit.INSTANCE;
                        }
                    };
                    o0VarE.K(objQ4);
                }
            }
            e23.a aVar3 = (e23.a) objQ4;
            z zVar2 = ((fVar instanceof q01.f.c) || (fVar instanceof q01.f.C2664f) || (fVar instanceof q01.f.d)) ? z.VALID_DATA : z.EMPTY;
            boolean z16 = fVar instanceof q01.f.e;
            if (z16) {
                zVar = zVar2;
                i24 = 1588109361;
                eVar4 = eVar3;
                i19 = R.string.nutrition_no_data_description;
                i18 = i15;
                z14 = false;
            } else {
                zVar = zVar2;
                eVar4 = eVar3;
                i18 = i15;
                z14 = false;
                if (fVar instanceof q01.f.a) {
                    i24 = 1588246598;
                    i19 = R.string.nutrition_is_not_supported_child_account;
                } else {
                    boolean z17 = fVar instanceof q01.f.g;
                    i19 = R.string.nutrition_set_up_description_short;
                    if (z17) {
                        i24 = 1588396204;
                    } else {
                        if (fVar instanceof q01.f.h) {
                            i24 = 1588541036;
                        } else {
                            o0VarE.C(1588656232);
                            o0VarE.g0(false);
                            strJ = null;
                        }
                        if (z16) {
                            i27 = 1588784634;
                            i28 = R.string.calories_edit_button;
                        } else {
                            if (fVar instanceof q01.f.g) {
                                i27 = 1588914431;
                                i28 = R.string.lbl_get_started;
                            } else if (fVar instanceof q01.f.h) {
                                o0VarE.C(1589046398);
                                if (((q01.f.h) fVar).f142019b) {
                                    i25 = 1589087473;
                                    i26 = R.string.start_your_free_trial;
                                } else {
                                    i25 = 1589184348;
                                    i26 = R.string.edit_profile_frame_non_subscriber_join_gcp;
                                }
                                strJ2 = com.airbnb.lottie.animation.keyframe.a.j(o0VarE, i25, i26, o0VarE, z14);
                                o0VarE.g0(z14);
                            } else {
                                o0VarE.C(1589328808);
                                o0VarE.g0(z14);
                                strJ2 = null;
                            }
                            if (i36 == 256) {
                                z15 = true;
                            } else {
                                z15 = z14;
                            }
                            zR = o0VarE.r(context) | z15;
                            objQ = o0VarE.q();
                            if (zR) {
                                final int i39 = 2;
                                objQ = new e23.a() { // from class: g11.l
                                    @Override // e23.a
                                    public final Object invoke() {
                                        switch (i39) {
                                            case 0:
                                                s sVar = s.f85508a;
                                                lt.e.k kVar = new lt.e.k(lt.e.a.Add, t.T);
                                                sVar.getClass();
                                                s.a(kVar);
                                                boolean z18 = fVar instanceof q01.f.d;
                                                Context context2 = context;
                                                if (z18) {
                                                    b21.b.a(context2);
                                                } else {
                                                    context2.startActivity(NutritionActivity.a.a(NutritionActivity.f39581f, context2, null, null, new l4.m((m21.b) m21.b.e.INSTANCE, g22.l.e(u.INSTANCE), (b11.k) null, false, 12, (p005kotlin.jvm.internal.j) null), false, false, 54));
                                                }
                                                break;
                                            case 1:
                                                s sVar2 = s.f85508a;
                                                lt.e.k kVar2 = new lt.e.k(lt.e.a.Tapped, t.T);
                                                sVar2.getClass();
                                                s.a(kVar2);
                                                q01.f fVar2 = fVar;
                                                if ((fVar2 instanceof q01.f.C2664f) || (fVar2 instanceof q01.f.d)) {
                                                    NutritionActivity.a aVar4 = NutritionActivity.f39581f;
                                                    Context context3 = context;
                                                    context3.startActivity(NutritionActivity.a.a(aVar4, context3, null, null, null, false, false, 62));
                                                }
                                                break;
                                            default:
                                                q01.f fVar3 = fVar;
                                                boolean z19 = fVar3 instanceof q01.f.e;
                                                Context context4 = context;
                                                if (z19) {
                                                    s sVar3 = s.f85508a;
                                                    lt.e.k kVar3 = new lt.e.k(lt.e.a.LearnMore, t.T);
                                                    sVar3.getClass();
                                                    s.a(kVar3);
                                                    context4.startActivity(NutritionActivity.a.a(NutritionActivity.f39581f, context4, null, null, new l4.m((m21.b) m21.b.e.INSTANCE, g22.l.e(u.INSTANCE), (b11.k) null, false, 12, (p005kotlin.jvm.internal.j) null), false, false, 54));
                                                } else if (fVar3 instanceof q01.f.g) {
                                                    s sVar4 = s.f85508a;
                                                    lt.e.k kVar4 = new lt.e.k(lt.e.a.LearnMore, t.T);
                                                    sVar4.getClass();
                                                    s.a(kVar4);
                                                    context4.startActivity(NutritionActivity.a.a(NutritionActivity.f39581f, context4, null, null, null, false, false, 62));
                                                } else if (fVar3 instanceof q01.f.h) {
                                                    s sVar5 = s.f85508a;
                                                    lt.e.k kVar5 = new lt.e.k(lt.e.a.LearnMore, t.T);
                                                    sVar5.getClass();
                                                    s.a(kVar5);
                                                    context4.startActivity(((ub1.g) KoinJavaComponent.get$default(ub1.g.class, null, null, 6, null)).g(context4, q.NUTRITION, false));
                                                }
                                                break;
                                        }
                                        return Unit.INSTANCE;
                                    }
                                };
                                o0VarE.K(objQ);
                            } else {
                                aVar.getClass();
                                if (objQ == p3.m.a.f135155b) {
                                    final int i310 = 2;
                                    objQ = new e23.a() { // from class: g11.l
                                        @Override // e23.a
                                        public final Object invoke() {
                                            switch (i310) {
                                                case 0:
                                                    s sVar = s.f85508a;
                                                    lt.e.k kVar = new lt.e.k(lt.e.a.Add, t.T);
                                                    sVar.getClass();
                                                    s.a(kVar);
                                                    boolean z18 = fVar instanceof q01.f.d;
                                                    Context context2 = context;
                                                    if (z18) {
                                                        b21.b.a(context2);
                                                    } else {
                                                        context2.startActivity(NutritionActivity.a.a(NutritionActivity.f39581f, context2, null, null, new l4.m((m21.b) m21.b.e.INSTANCE, g22.l.e(u.INSTANCE), (b11.k) null, false, 12, (p005kotlin.jvm.internal.j) null), false, false, 54));
                                                    }
                                                    break;
                                                case 1:
                                                    s sVar2 = s.f85508a;
                                                    lt.e.k kVar2 = new lt.e.k(lt.e.a.Tapped, t.T);
                                                    sVar2.getClass();
                                                    s.a(kVar2);
                                                    q01.f fVar2 = fVar;
                                                    if ((fVar2 instanceof q01.f.C2664f) || (fVar2 instanceof q01.f.d)) {
                                                        NutritionActivity.a aVar4 = NutritionActivity.f39581f;
                                                        Context context3 = context;
                                                        context3.startActivity(NutritionActivity.a.a(aVar4, context3, null, null, null, false, false, 62));
                                                    }
                                                    break;
                                                default:
                                                    q01.f fVar3 = fVar;
                                                    boolean z19 = fVar3 instanceof q01.f.e;
                                                    Context context4 = context;
                                                    if (z19) {
                                                        s sVar3 = s.f85508a;
                                                        lt.e.k kVar3 = new lt.e.k(lt.e.a.LearnMore, t.T);
                                                        sVar3.getClass();
                                                        s.a(kVar3);
                                                        context4.startActivity(NutritionActivity.a.a(NutritionActivity.f39581f, context4, null, null, new l4.m((m21.b) m21.b.e.INSTANCE, g22.l.e(u.INSTANCE), (b11.k) null, false, 12, (p005kotlin.jvm.internal.j) null), false, false, 54));
                                                    } else if (fVar3 instanceof q01.f.g) {
                                                        s sVar4 = s.f85508a;
                                                        lt.e.k kVar4 = new lt.e.k(lt.e.a.LearnMore, t.T);
                                                        sVar4.getClass();
                                                        s.a(kVar4);
                                                        context4.startActivity(NutritionActivity.a.a(NutritionActivity.f39581f, context4, null, null, null, false, false, 62));
                                                    } else if (fVar3 instanceof q01.f.h) {
                                                        s sVar5 = s.f85508a;
                                                        lt.e.k kVar5 = new lt.e.k(lt.e.a.LearnMore, t.T);
                                                        sVar5.getClass();
                                                        s.a(kVar5);
                                                        context4.startActivity(((ub1.g) KoinJavaComponent.get$default(ub1.g.class, null, null, 6, null)).g(context4, q.NUTRITION, false));
                                                    }
                                                    break;
                                            }
                                            return Unit.INSTANCE;
                                        }
                                    };
                                    o0VarE.K(objQ);
                                }
                            }
                            o0Var = o0VarE;
                            yz1.y.c(rVar, dVar, strJ3, null, dVarB, d0VarE, 0.0f, i35, null, 0.0f, strQ, null, null, aVar2, eVarC, aVar3, zVar, strJ, strJ2, (e23.a) objQ, o0Var, i18 & 14, 24576, 6984);
                            eVar2 = eVar4;
                        }
                        strJ2 = com.airbnb.lottie.animation.keyframe.a.j(o0VarE, i27, i28, o0VarE, z14);
                        if (i36 == 256) {
                            z15 = true;
                        } else {
                            z15 = z14;
                        }
                        zR = o0VarE.r(context) | z15;
                        objQ = o0VarE.q();
                        if (zR) {
                            aVar.getClass();
                            if (objQ == p3.m.a.f135155b) {
                                final int i311 = 2;
                                objQ = new e23.a() { // from class: g11.l
                                    @Override // e23.a
                                    public final Object invoke() {
                                        switch (i311) {
                                            case 0:
                                                s sVar = s.f85508a;
                                                lt.e.k kVar = new lt.e.k(lt.e.a.Add, t.T);
                                                sVar.getClass();
                                                s.a(kVar);
                                                boolean z18 = fVar instanceof q01.f.d;
                                                Context context2 = context;
                                                if (z18) {
                                                    b21.b.a(context2);
                                                } else {
                                                    context2.startActivity(NutritionActivity.a.a(NutritionActivity.f39581f, context2, null, null, new l4.m((m21.b) m21.b.e.INSTANCE, g22.l.e(u.INSTANCE), (b11.k) null, false, 12, (p005kotlin.jvm.internal.j) null), false, false, 54));
                                                }
                                                break;
                                            case 1:
                                                s sVar2 = s.f85508a;
                                                lt.e.k kVar2 = new lt.e.k(lt.e.a.Tapped, t.T);
                                                sVar2.getClass();
                                                s.a(kVar2);
                                                q01.f fVar2 = fVar;
                                                if ((fVar2 instanceof q01.f.C2664f) || (fVar2 instanceof q01.f.d)) {
                                                    NutritionActivity.a aVar4 = NutritionActivity.f39581f;
                                                    Context context3 = context;
                                                    context3.startActivity(NutritionActivity.a.a(aVar4, context3, null, null, null, false, false, 62));
                                                }
                                                break;
                                            default:
                                                q01.f fVar3 = fVar;
                                                boolean z19 = fVar3 instanceof q01.f.e;
                                                Context context4 = context;
                                                if (z19) {
                                                    s sVar3 = s.f85508a;
                                                    lt.e.k kVar3 = new lt.e.k(lt.e.a.LearnMore, t.T);
                                                    sVar3.getClass();
                                                    s.a(kVar3);
                                                    context4.startActivity(NutritionActivity.a.a(NutritionActivity.f39581f, context4, null, null, new l4.m((m21.b) m21.b.e.INSTANCE, g22.l.e(u.INSTANCE), (b11.k) null, false, 12, (p005kotlin.jvm.internal.j) null), false, false, 54));
                                                } else if (fVar3 instanceof q01.f.g) {
                                                    s sVar4 = s.f85508a;
                                                    lt.e.k kVar4 = new lt.e.k(lt.e.a.LearnMore, t.T);
                                                    sVar4.getClass();
                                                    s.a(kVar4);
                                                    context4.startActivity(NutritionActivity.a.a(NutritionActivity.f39581f, context4, null, null, null, false, false, 62));
                                                } else if (fVar3 instanceof q01.f.h) {
                                                    s sVar5 = s.f85508a;
                                                    lt.e.k kVar5 = new lt.e.k(lt.e.a.LearnMore, t.T);
                                                    sVar5.getClass();
                                                    s.a(kVar5);
                                                    context4.startActivity(((ub1.g) KoinJavaComponent.get$default(ub1.g.class, null, null, 6, null)).g(context4, q.NUTRITION, false));
                                                }
                                                break;
                                        }
                                        return Unit.INSTANCE;
                                    }
                                };
                                o0VarE.K(objQ);
                            }
                        } else {
                            final int i312 = 2;
                            objQ = new e23.a() { // from class: g11.l
                                @Override // e23.a
                                public final Object invoke() {
                                    switch (i312) {
                                        case 0:
                                            s sVar = s.f85508a;
                                            lt.e.k kVar = new lt.e.k(lt.e.a.Add, t.T);
                                            sVar.getClass();
                                            s.a(kVar);
                                            boolean z18 = fVar instanceof q01.f.d;
                                            Context context2 = context;
                                            if (z18) {
                                                b21.b.a(context2);
                                            } else {
                                                context2.startActivity(NutritionActivity.a.a(NutritionActivity.f39581f, context2, null, null, new l4.m((m21.b) m21.b.e.INSTANCE, g22.l.e(u.INSTANCE), (b11.k) null, false, 12, (p005kotlin.jvm.internal.j) null), false, false, 54));
                                            }
                                            break;
                                        case 1:
                                            s sVar2 = s.f85508a;
                                            lt.e.k kVar2 = new lt.e.k(lt.e.a.Tapped, t.T);
                                            sVar2.getClass();
                                            s.a(kVar2);
                                            q01.f fVar2 = fVar;
                                            if ((fVar2 instanceof q01.f.C2664f) || (fVar2 instanceof q01.f.d)) {
                                                NutritionActivity.a aVar4 = NutritionActivity.f39581f;
                                                Context context3 = context;
                                                context3.startActivity(NutritionActivity.a.a(aVar4, context3, null, null, null, false, false, 62));
                                            }
                                            break;
                                        default:
                                            q01.f fVar3 = fVar;
                                            boolean z19 = fVar3 instanceof q01.f.e;
                                            Context context4 = context;
                                            if (z19) {
                                                s sVar3 = s.f85508a;
                                                lt.e.k kVar3 = new lt.e.k(lt.e.a.LearnMore, t.T);
                                                sVar3.getClass();
                                                s.a(kVar3);
                                                context4.startActivity(NutritionActivity.a.a(NutritionActivity.f39581f, context4, null, null, new l4.m((m21.b) m21.b.e.INSTANCE, g22.l.e(u.INSTANCE), (b11.k) null, false, 12, (p005kotlin.jvm.internal.j) null), false, false, 54));
                                            } else if (fVar3 instanceof q01.f.g) {
                                                s sVar4 = s.f85508a;
                                                lt.e.k kVar4 = new lt.e.k(lt.e.a.LearnMore, t.T);
                                                sVar4.getClass();
                                                s.a(kVar4);
                                                context4.startActivity(NutritionActivity.a.a(NutritionActivity.f39581f, context4, null, null, null, false, false, 62));
                                            } else if (fVar3 instanceof q01.f.h) {
                                                s sVar5 = s.f85508a;
                                                lt.e.k kVar5 = new lt.e.k(lt.e.a.LearnMore, t.T);
                                                sVar5.getClass();
                                                s.a(kVar5);
                                                context4.startActivity(((ub1.g) KoinJavaComponent.get$default(ub1.g.class, null, null, 6, null)).g(context4, q.NUTRITION, false));
                                            }
                                            break;
                                    }
                                    return Unit.INSTANCE;
                                }
                            };
                            o0VarE.K(objQ);
                        }
                        o0Var = o0VarE;
                        yz1.y.c(rVar, dVar, strJ3, null, dVarB, d0VarE, 0.0f, i35, null, 0.0f, strQ, null, null, aVar2, eVarC, aVar3, zVar, strJ, strJ2, (e23.a) objQ, o0Var, i18 & 14, 24576, 6984);
                        eVar2 = eVar4;
                    }
                }
            }
            strJ = com.airbnb.lottie.animation.keyframe.a.j(o0VarE, i24, i19, o0VarE, z14);
            if (z16) {
                i27 = 1588784634;
                i28 = R.string.calories_edit_button;
            } else {
                if (fVar instanceof q01.f.g) {
                    i27 = 1588914431;
                    i28 = R.string.lbl_get_started;
                } else if (fVar instanceof q01.f.h) {
                    o0VarE.C(1589046398);
                    if (((q01.f.h) fVar).f142019b) {
                        i25 = 1589087473;
                        i26 = R.string.start_your_free_trial;
                    } else {
                        i25 = 1589184348;
                        i26 = R.string.edit_profile_frame_non_subscriber_join_gcp;
                    }
                    strJ2 = com.airbnb.lottie.animation.keyframe.a.j(o0VarE, i25, i26, o0VarE, z14);
                    o0VarE.g0(z14);
                } else {
                    o0VarE.C(1589328808);
                    o0VarE.g0(z14);
                    strJ2 = null;
                }
                if (i36 == 256) {
                    z15 = true;
                } else {
                    z15 = z14;
                }
                zR = o0VarE.r(context) | z15;
                objQ = o0VarE.q();
                if (zR) {
                    aVar.getClass();
                    if (objQ == p3.m.a.f135155b) {
                        final int i313 = 2;
                        objQ = new e23.a() { // from class: g11.l
                            @Override // e23.a
                            public final Object invoke() {
                                switch (i313) {
                                    case 0:
                                        s sVar = s.f85508a;
                                        lt.e.k kVar = new lt.e.k(lt.e.a.Add, t.T);
                                        sVar.getClass();
                                        s.a(kVar);
                                        boolean z18 = fVar instanceof q01.f.d;
                                        Context context2 = context;
                                        if (z18) {
                                            b21.b.a(context2);
                                        } else {
                                            context2.startActivity(NutritionActivity.a.a(NutritionActivity.f39581f, context2, null, null, new l4.m((m21.b) m21.b.e.INSTANCE, g22.l.e(u.INSTANCE), (b11.k) null, false, 12, (p005kotlin.jvm.internal.j) null), false, false, 54));
                                        }
                                        break;
                                    case 1:
                                        s sVar2 = s.f85508a;
                                        lt.e.k kVar2 = new lt.e.k(lt.e.a.Tapped, t.T);
                                        sVar2.getClass();
                                        s.a(kVar2);
                                        q01.f fVar2 = fVar;
                                        if ((fVar2 instanceof q01.f.C2664f) || (fVar2 instanceof q01.f.d)) {
                                            NutritionActivity.a aVar4 = NutritionActivity.f39581f;
                                            Context context3 = context;
                                            context3.startActivity(NutritionActivity.a.a(aVar4, context3, null, null, null, false, false, 62));
                                        }
                                        break;
                                    default:
                                        q01.f fVar3 = fVar;
                                        boolean z19 = fVar3 instanceof q01.f.e;
                                        Context context4 = context;
                                        if (z19) {
                                            s sVar3 = s.f85508a;
                                            lt.e.k kVar3 = new lt.e.k(lt.e.a.LearnMore, t.T);
                                            sVar3.getClass();
                                            s.a(kVar3);
                                            context4.startActivity(NutritionActivity.a.a(NutritionActivity.f39581f, context4, null, null, new l4.m((m21.b) m21.b.e.INSTANCE, g22.l.e(u.INSTANCE), (b11.k) null, false, 12, (p005kotlin.jvm.internal.j) null), false, false, 54));
                                        } else if (fVar3 instanceof q01.f.g) {
                                            s sVar4 = s.f85508a;
                                            lt.e.k kVar4 = new lt.e.k(lt.e.a.LearnMore, t.T);
                                            sVar4.getClass();
                                            s.a(kVar4);
                                            context4.startActivity(NutritionActivity.a.a(NutritionActivity.f39581f, context4, null, null, null, false, false, 62));
                                        } else if (fVar3 instanceof q01.f.h) {
                                            s sVar5 = s.f85508a;
                                            lt.e.k kVar5 = new lt.e.k(lt.e.a.LearnMore, t.T);
                                            sVar5.getClass();
                                            s.a(kVar5);
                                            context4.startActivity(((ub1.g) KoinJavaComponent.get$default(ub1.g.class, null, null, 6, null)).g(context4, q.NUTRITION, false));
                                        }
                                        break;
                                }
                                return Unit.INSTANCE;
                            }
                        };
                        o0VarE.K(objQ);
                    }
                } else {
                    final int i314 = 2;
                    objQ = new e23.a() { // from class: g11.l
                        @Override // e23.a
                        public final Object invoke() {
                            switch (i314) {
                                case 0:
                                    s sVar = s.f85508a;
                                    lt.e.k kVar = new lt.e.k(lt.e.a.Add, t.T);
                                    sVar.getClass();
                                    s.a(kVar);
                                    boolean z18 = fVar instanceof q01.f.d;
                                    Context context2 = context;
                                    if (z18) {
                                        b21.b.a(context2);
                                    } else {
                                        context2.startActivity(NutritionActivity.a.a(NutritionActivity.f39581f, context2, null, null, new l4.m((m21.b) m21.b.e.INSTANCE, g22.l.e(u.INSTANCE), (b11.k) null, false, 12, (p005kotlin.jvm.internal.j) null), false, false, 54));
                                    }
                                    break;
                                case 1:
                                    s sVar2 = s.f85508a;
                                    lt.e.k kVar2 = new lt.e.k(lt.e.a.Tapped, t.T);
                                    sVar2.getClass();
                                    s.a(kVar2);
                                    q01.f fVar2 = fVar;
                                    if ((fVar2 instanceof q01.f.C2664f) || (fVar2 instanceof q01.f.d)) {
                                        NutritionActivity.a aVar4 = NutritionActivity.f39581f;
                                        Context context3 = context;
                                        context3.startActivity(NutritionActivity.a.a(aVar4, context3, null, null, null, false, false, 62));
                                    }
                                    break;
                                default:
                                    q01.f fVar3 = fVar;
                                    boolean z19 = fVar3 instanceof q01.f.e;
                                    Context context4 = context;
                                    if (z19) {
                                        s sVar3 = s.f85508a;
                                        lt.e.k kVar3 = new lt.e.k(lt.e.a.LearnMore, t.T);
                                        sVar3.getClass();
                                        s.a(kVar3);
                                        context4.startActivity(NutritionActivity.a.a(NutritionActivity.f39581f, context4, null, null, new l4.m((m21.b) m21.b.e.INSTANCE, g22.l.e(u.INSTANCE), (b11.k) null, false, 12, (p005kotlin.jvm.internal.j) null), false, false, 54));
                                    } else if (fVar3 instanceof q01.f.g) {
                                        s sVar4 = s.f85508a;
                                        lt.e.k kVar4 = new lt.e.k(lt.e.a.LearnMore, t.T);
                                        sVar4.getClass();
                                        s.a(kVar4);
                                        context4.startActivity(NutritionActivity.a.a(NutritionActivity.f39581f, context4, null, null, null, false, false, 62));
                                    } else if (fVar3 instanceof q01.f.h) {
                                        s sVar5 = s.f85508a;
                                        lt.e.k kVar5 = new lt.e.k(lt.e.a.LearnMore, t.T);
                                        sVar5.getClass();
                                        s.a(kVar5);
                                        context4.startActivity(((ub1.g) KoinJavaComponent.get$default(ub1.g.class, null, null, 6, null)).g(context4, q.NUTRITION, false));
                                    }
                                    break;
                            }
                            return Unit.INSTANCE;
                        }
                    };
                    o0VarE.K(objQ);
                }
                o0Var = o0VarE;
                yz1.y.c(rVar, dVar, strJ3, null, dVarB, d0VarE, 0.0f, i35, null, 0.0f, strQ, null, null, aVar2, eVarC, aVar3, zVar, strJ, strJ2, (e23.a) objQ, o0Var, i18 & 14, 24576, 6984);
                eVar2 = eVar4;
            }
            strJ2 = com.airbnb.lottie.animation.keyframe.a.j(o0VarE, i27, i28, o0VarE, z14);
            if (i36 == 256) {
                z15 = true;
            } else {
                z15 = z14;
            }
            zR = o0VarE.r(context) | z15;
            objQ = o0VarE.q();
            if (zR) {
                aVar.getClass();
                if (objQ == p3.m.a.f135155b) {
                    final int i315 = 2;
                    objQ = new e23.a() { // from class: g11.l
                        @Override // e23.a
                        public final Object invoke() {
                            switch (i315) {
                                case 0:
                                    s sVar = s.f85508a;
                                    lt.e.k kVar = new lt.e.k(lt.e.a.Add, t.T);
                                    sVar.getClass();
                                    s.a(kVar);
                                    boolean z18 = fVar instanceof q01.f.d;
                                    Context context2 = context;
                                    if (z18) {
                                        b21.b.a(context2);
                                    } else {
                                        context2.startActivity(NutritionActivity.a.a(NutritionActivity.f39581f, context2, null, null, new l4.m((m21.b) m21.b.e.INSTANCE, g22.l.e(u.INSTANCE), (b11.k) null, false, 12, (p005kotlin.jvm.internal.j) null), false, false, 54));
                                    }
                                    break;
                                case 1:
                                    s sVar2 = s.f85508a;
                                    lt.e.k kVar2 = new lt.e.k(lt.e.a.Tapped, t.T);
                                    sVar2.getClass();
                                    s.a(kVar2);
                                    q01.f fVar2 = fVar;
                                    if ((fVar2 instanceof q01.f.C2664f) || (fVar2 instanceof q01.f.d)) {
                                        NutritionActivity.a aVar4 = NutritionActivity.f39581f;
                                        Context context3 = context;
                                        context3.startActivity(NutritionActivity.a.a(aVar4, context3, null, null, null, false, false, 62));
                                    }
                                    break;
                                default:
                                    q01.f fVar3 = fVar;
                                    boolean z19 = fVar3 instanceof q01.f.e;
                                    Context context4 = context;
                                    if (z19) {
                                        s sVar3 = s.f85508a;
                                        lt.e.k kVar3 = new lt.e.k(lt.e.a.LearnMore, t.T);
                                        sVar3.getClass();
                                        s.a(kVar3);
                                        context4.startActivity(NutritionActivity.a.a(NutritionActivity.f39581f, context4, null, null, new l4.m((m21.b) m21.b.e.INSTANCE, g22.l.e(u.INSTANCE), (b11.k) null, false, 12, (p005kotlin.jvm.internal.j) null), false, false, 54));
                                    } else if (fVar3 instanceof q01.f.g) {
                                        s sVar4 = s.f85508a;
                                        lt.e.k kVar4 = new lt.e.k(lt.e.a.LearnMore, t.T);
                                        sVar4.getClass();
                                        s.a(kVar4);
                                        context4.startActivity(NutritionActivity.a.a(NutritionActivity.f39581f, context4, null, null, null, false, false, 62));
                                    } else if (fVar3 instanceof q01.f.h) {
                                        s sVar5 = s.f85508a;
                                        lt.e.k kVar5 = new lt.e.k(lt.e.a.LearnMore, t.T);
                                        sVar5.getClass();
                                        s.a(kVar5);
                                        context4.startActivity(((ub1.g) KoinJavaComponent.get$default(ub1.g.class, null, null, 6, null)).g(context4, q.NUTRITION, false));
                                    }
                                    break;
                            }
                            return Unit.INSTANCE;
                        }
                    };
                    o0VarE.K(objQ);
                }
            } else {
                final int i316 = 2;
                objQ = new e23.a() { // from class: g11.l
                    @Override // e23.a
                    public final Object invoke() {
                        switch (i316) {
                            case 0:
                                s sVar = s.f85508a;
                                lt.e.k kVar = new lt.e.k(lt.e.a.Add, t.T);
                                sVar.getClass();
                                s.a(kVar);
                                boolean z18 = fVar instanceof q01.f.d;
                                Context context2 = context;
                                if (z18) {
                                    b21.b.a(context2);
                                } else {
                                    context2.startActivity(NutritionActivity.a.a(NutritionActivity.f39581f, context2, null, null, new l4.m((m21.b) m21.b.e.INSTANCE, g22.l.e(u.INSTANCE), (b11.k) null, false, 12, (p005kotlin.jvm.internal.j) null), false, false, 54));
                                }
                                break;
                            case 1:
                                s sVar2 = s.f85508a;
                                lt.e.k kVar2 = new lt.e.k(lt.e.a.Tapped, t.T);
                                sVar2.getClass();
                                s.a(kVar2);
                                q01.f fVar2 = fVar;
                                if ((fVar2 instanceof q01.f.C2664f) || (fVar2 instanceof q01.f.d)) {
                                    NutritionActivity.a aVar4 = NutritionActivity.f39581f;
                                    Context context3 = context;
                                    context3.startActivity(NutritionActivity.a.a(aVar4, context3, null, null, null, false, false, 62));
                                }
                                break;
                            default:
                                q01.f fVar3 = fVar;
                                boolean z19 = fVar3 instanceof q01.f.e;
                                Context context4 = context;
                                if (z19) {
                                    s sVar3 = s.f85508a;
                                    lt.e.k kVar3 = new lt.e.k(lt.e.a.LearnMore, t.T);
                                    sVar3.getClass();
                                    s.a(kVar3);
                                    context4.startActivity(NutritionActivity.a.a(NutritionActivity.f39581f, context4, null, null, new l4.m((m21.b) m21.b.e.INSTANCE, g22.l.e(u.INSTANCE), (b11.k) null, false, 12, (p005kotlin.jvm.internal.j) null), false, false, 54));
                                } else if (fVar3 instanceof q01.f.g) {
                                    s sVar4 = s.f85508a;
                                    lt.e.k kVar4 = new lt.e.k(lt.e.a.LearnMore, t.T);
                                    sVar4.getClass();
                                    s.a(kVar4);
                                    context4.startActivity(NutritionActivity.a.a(NutritionActivity.f39581f, context4, null, null, null, false, false, 62));
                                } else if (fVar3 instanceof q01.f.h) {
                                    s sVar5 = s.f85508a;
                                    lt.e.k kVar5 = new lt.e.k(lt.e.a.LearnMore, t.T);
                                    sVar5.getClass();
                                    s.a(kVar5);
                                    context4.startActivity(((ub1.g) KoinJavaComponent.get$default(ub1.g.class, null, null, 6, null)).g(context4, q.NUTRITION, false));
                                }
                                break;
                        }
                        return Unit.INSTANCE;
                    }
                };
                o0VarE.K(objQ);
            }
            o0Var = o0VarE;
            yz1.y.c(rVar, dVar, strJ3, null, dVarB, d0VarE, 0.0f, i35, null, 0.0f, strQ, null, null, aVar2, eVarC, aVar3, zVar, strJ, strJ2, (e23.a) objQ, o0Var, i18 & 14, 24576, 6984);
            eVar2 = eVar4;
        } else {
            o0Var = o0VarE;
            o0Var.e();
            eVar2 = eVar;
        }
        p2 p2VarI0 = o0Var.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new f0(rVar, eVar2, fVar, i14, 22);
        }
    }
}
