package j62;

import android.content.Context;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import c2.b0;
import c2.j;
import c2.y;
import c2.z;
import com.garmin.android.apps.connectmobile.R;
import e23.p;
import h4.k;
import h4.r;
import h5.e0;
import h5.g;
import java.util.ArrayList;
import java.util.List;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.s;
import p13.h0;
import p13.x;
import p3.b4;
import p3.c2;
import p3.i2;
import p3.m;
import p3.n;
import p3.p0;
import p3.p1;
import p3.x1;
import p3.y3;
import v.h;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class e implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f97425a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.garmin.android.apps.connectmobile.workouts.presentation.msn.filter.f f97426b;

    public /* synthetic */ e(com.garmin.android.apps.connectmobile.workouts.presentation.msn.filter.f fVar, int i14) {
        this.f97425a = i14;
        this.f97426b = fVar;
    }

    /* JADX WARN: Code duplicated, block: B:102:0x0381  */
    /* JADX WARN: Code duplicated, block: B:107:0x0399  */
    /* JADX WARN: Code duplicated, block: B:29:0x00d9  */
    /* JADX WARN: Code duplicated, block: B:34:0x00f7  */
    /* JADX WARN: Code duplicated, block: B:46:0x017e  */
    /* JADX WARN: Code duplicated, block: B:53:0x01d4  */
    /* JADX WARN: Code duplicated, block: B:58:0x01ec  */
    /* JADX WARN: Code duplicated, block: B:65:0x0240  */
    /* JADX WARN: Code duplicated, block: B:70:0x0258  */
    /* JADX WARN: Code duplicated, block: B:77:0x02ac  */
    /* JADX WARN: Code duplicated, block: B:82:0x02c4  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        String string;
        Object obj3;
        Object obj4;
        String string2;
        Object obj5;
        String string3;
        Object obj6;
        String string4;
        Object obj7;
        String string5;
        Object obj8;
        String string6;
        Object obj9;
        int size;
        int i14 = this.f97425a;
        final com.garmin.android.apps.connectmobile.workouts.presentation.msn.filter.f fVar = this.f97426b;
        final int i15 = 2;
        boolean z14 = false;
        final int i16 = 1;
        switch (i14) {
            case 0:
                m mVar = (m) obj;
                int iIntValue = ((Integer) obj2).intValue();
                com.garmin.android.apps.connectmobile.workouts.presentation.msn.filter.f.a aVar = com.garmin.android.apps.connectmobile.workouts.presentation.msn.filter.f.f49519e;
                if (mVar.n(iIntValue & 1, (iIntValue & 3) != 2)) {
                    x1 x1Var = n.f135158a;
                    z02.b.a(false, null, null, null, false, z3.f.c(1783177056, new e(fVar, i16), mVar), mVar, 196608, 31);
                } else {
                    mVar.e();
                }
                return Unit.INSTANCE;
            default:
                m mVar2 = (m) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                com.garmin.android.apps.connectmobile.workouts.presentation.msn.filter.f.a aVar2 = com.garmin.android.apps.connectmobile.workouts.presentation.msn.filter.f.f49519e;
                if (mVar2.n(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    x1 x1Var2 = n.f135158a;
                    r.a aVar3 = r.S;
                    j.f22691a.getClass();
                    j.k kVar = j.f22694d;
                    h4.d.f81522a.getClass();
                    z zVarA = y.a(kVar, h4.d.a.f81536n, mVar2, 0);
                    int iHashCode = Long.hashCode(mVar2.getU());
                    i2 i2VarX = mVar2.x();
                    r rVarC = k.c(aVar3, mVar2);
                    g.V.getClass();
                    e0.a aVar4 = g.a.f81805b;
                    if (mVar2.F() == null) {
                        p0.l();
                        throw null;
                    }
                    mVar2.z();
                    if (mVar2.getT()) {
                        mVar2.M(aVar4);
                    } else {
                        mVar2.c();
                    }
                    b4.c(g.a.f81810g, zVarA, mVar2);
                    b4.c(g.a.f81809f, i2VarX, mVar2);
                    g.a.b bVar = g.a.f81813j;
                    if (mVar2.getT() || !s.g(mVar2.q(), Integer.valueOf(iHashCode))) {
                        h.z(iHashCode, mVar2, iHashCode, bVar);
                    }
                    b4.c(g.a.f81807d, rVarC, mVar2);
                    b0 b0Var = b0.f22601a;
                    y3 y3Var = AndroidCompositionLocals_androidKt.f6042b;
                    Context context = (Context) mVar2.A(y3Var);
                    b bVar2 = fVar.v6().f97419k;
                    context.getClass();
                    if (bVar2 != null) {
                        string = context.getString(bVar2.f97408b);
                        string.getClass();
                    } else {
                        string = context.getString(R.string.common_all);
                        string.getClass();
                    }
                    String strQ = gl1.y.Q(mVar2, R.string.lbl_msn_workouts_activity_type_filter);
                    boolean zR = mVar2.r(fVar);
                    Object objQ = mVar2.q();
                    m.a aVar5 = m.f135153a;
                    if (zR) {
                        obj3 = objQ;
                        final boolean z15 = z14 ? 1 : 0;
                        e23.a aVar6 = new e23.a() { // from class: j62.f
                            @Override // e23.a
                            public final Object invoke() {
                                switch (z15) {
                                    case 0:
                                        com.garmin.android.apps.connectmobile.workouts.presentation.msn.filter.f.b bVar3 = fVar.f49520d;
                                        if (bVar3 != null) {
                                            bVar3.X4();
                                        }
                                        break;
                                    case 1:
                                        com.garmin.android.apps.connectmobile.workouts.presentation.msn.filter.f.b bVar4 = fVar.f49520d;
                                        if (bVar4 != null) {
                                            bVar4.C2();
                                        }
                                        break;
                                    case 2:
                                        com.garmin.android.apps.connectmobile.workouts.presentation.msn.filter.f.b bVar5 = fVar.f49520d;
                                        if (bVar5 != null) {
                                            bVar5.d3();
                                        }
                                        break;
                                    case 3:
                                        com.garmin.android.apps.connectmobile.workouts.presentation.msn.filter.f.b bVar6 = fVar.f49520d;
                                        if (bVar6 != null) {
                                            bVar6.v5();
                                        }
                                        break;
                                    default:
                                        com.garmin.android.apps.connectmobile.workouts.presentation.msn.filter.f.b bVar7 = fVar.f49520d;
                                        if (bVar7 != null) {
                                            bVar7.v8();
                                        }
                                        break;
                                }
                                return Unit.INSTANCE;
                            }
                        };
                        mVar2.K(aVar6);
                        obj3 = aVar6;
                    } else {
                        aVar5.getClass();
                        if (objQ == m.a.f135155b) {
                            obj3 = objQ;
                            final int z16 = z14 ? 1 : 0;
                            e23.a aVar7 = new e23.a() { // from class: j62.f
                                @Override // e23.a
                                public final Object invoke() {
                                    switch (z16) {
                                        case 0:
                                            com.garmin.android.apps.connectmobile.workouts.presentation.msn.filter.f.b bVar3 = fVar.f49520d;
                                            if (bVar3 != null) {
                                                bVar3.X4();
                                            }
                                            break;
                                        case 1:
                                            com.garmin.android.apps.connectmobile.workouts.presentation.msn.filter.f.b bVar4 = fVar.f49520d;
                                            if (bVar4 != null) {
                                                bVar4.C2();
                                            }
                                            break;
                                        case 2:
                                            com.garmin.android.apps.connectmobile.workouts.presentation.msn.filter.f.b bVar5 = fVar.f49520d;
                                            if (bVar5 != null) {
                                                bVar5.d3();
                                            }
                                            break;
                                        case 3:
                                            com.garmin.android.apps.connectmobile.workouts.presentation.msn.filter.f.b bVar6 = fVar.f49520d;
                                            if (bVar6 != null) {
                                                bVar6.v5();
                                            }
                                            break;
                                        default:
                                            com.garmin.android.apps.connectmobile.workouts.presentation.msn.filter.f.b bVar7 = fVar.f49520d;
                                            if (bVar7 != null) {
                                                bVar7.v8();
                                            }
                                            break;
                                    }
                                    return Unit.INSTANCE;
                                }
                            };
                            mVar2.K(aVar7);
                            obj3 = aVar7;
                        }
                    }
                    obj3 = objQ;
                    d10.d.u6(strQ, string, (e23.a) obj3, mVar2);
                    boolean zB = mVar2.B(string);
                    Object objQ2 = mVar2.q();
                    if (zB) {
                        obj4 = objQ2;
                        c2 c2VarN = p0.n(Boolean.valueOf(x.k(context.getString(R.string.common_all), context.getString(b.STRENGTH.f97408b)).contains(string)));
                        mVar2.K(c2VarN);
                        obj4 = c2VarN;
                    } else {
                        aVar5.getClass();
                        if (objQ2 == m.a.f135155b) {
                            obj4 = objQ2;
                            c2 c2VarN2 = p0.n(Boolean.valueOf(x.k(context.getString(R.string.common_all), context.getString(b.STRENGTH.f97408b)).contains(string)));
                            mVar2.K(c2VarN2);
                            obj4 = c2VarN2;
                        }
                    }
                    obj4 = objQ2;
                    p1 p1Var = (p1) obj4;
                    if (!((Boolean) p1Var.getF182175a()).booleanValue()) {
                        fVar.v6().b(null);
                    }
                    String strQ2 = gl1.y.Q(mVar2, R.string.lbl_sport_training_focus);
                    List<String> list = fVar.v6().f97420l;
                    if (list != null) {
                        string2 = h0.k0(list, ", ", null, null, new iz1.f(new i62.g(new l22.a(context)), 7), 30);
                    } else {
                        string2 = context.getString(R.string.common_all);
                        string2.getClass();
                    }
                    boolean zR2 = mVar2.r(fVar) | mVar2.B(p1Var);
                    Object objQ3 = mVar2.q();
                    if (zR2) {
                        obj5 = objQ3;
                        i91.c cVar = new i91.c(21, fVar, p1Var);
                        mVar2.K(cVar);
                        obj5 = cVar;
                    } else {
                        aVar5.getClass();
                        if (objQ3 == m.a.f135155b) {
                            obj5 = objQ3;
                            i91.c cVar2 = new i91.c(21, fVar, p1Var);
                            mVar2.K(cVar2);
                            obj5 = cVar2;
                        }
                    }
                    obj5 = objQ3;
                    d10.d.u6(strQ2, string2, (e23.a) obj5, mVar2);
                    String strQ3 = gl1.y.Q(mVar2, R.string.common_difficulty);
                    Context context2 = (Context) mVar2.A(y3Var);
                    List<o13.p<String, String>> list2 = fVar.v6().f97409a;
                    List<o13.p<String, String>> list3 = fVar.v6().f97421m;
                    context2.getClass();
                    list2.getClass();
                    if (list3 != null) {
                        int size2 = list2.size();
                        int size3 = list3.size();
                        if (1 > size3 || size3 >= size2) {
                            string3 = context2.getString(R.string.common_all);
                            string3.getClass();
                        } else {
                            string3 = h0.k0(list3, ", ", null, null, new j02.r(10), 30);
                        }
                    } else {
                        string3 = context2.getString(R.string.common_all);
                        string3.getClass();
                    }
                    boolean zR3 = mVar2.r(fVar);
                    Object objQ4 = mVar2.q();
                    if (zR3) {
                        obj6 = objQ4;
                        e23.a aVar8 = new e23.a() { // from class: j62.f
                            @Override // e23.a
                            public final Object invoke() {
                                switch (i16) {
                                    case 0:
                                        com.garmin.android.apps.connectmobile.workouts.presentation.msn.filter.f.b bVar3 = fVar.f49520d;
                                        if (bVar3 != null) {
                                            bVar3.X4();
                                        }
                                        break;
                                    case 1:
                                        com.garmin.android.apps.connectmobile.workouts.presentation.msn.filter.f.b bVar4 = fVar.f49520d;
                                        if (bVar4 != null) {
                                            bVar4.C2();
                                        }
                                        break;
                                    case 2:
                                        com.garmin.android.apps.connectmobile.workouts.presentation.msn.filter.f.b bVar5 = fVar.f49520d;
                                        if (bVar5 != null) {
                                            bVar5.d3();
                                        }
                                        break;
                                    case 3:
                                        com.garmin.android.apps.connectmobile.workouts.presentation.msn.filter.f.b bVar6 = fVar.f49520d;
                                        if (bVar6 != null) {
                                            bVar6.v5();
                                        }
                                        break;
                                    default:
                                        com.garmin.android.apps.connectmobile.workouts.presentation.msn.filter.f.b bVar7 = fVar.f49520d;
                                        if (bVar7 != null) {
                                            bVar7.v8();
                                        }
                                        break;
                                }
                                return Unit.INSTANCE;
                            }
                        };
                        mVar2.K(aVar8);
                        obj6 = aVar8;
                    } else {
                        aVar5.getClass();
                        if (objQ4 == m.a.f135155b) {
                            obj6 = objQ4;
                            e23.a aVar9 = new e23.a() { // from class: j62.f
                                @Override // e23.a
                                public final Object invoke() {
                                    switch (i16) {
                                        case 0:
                                            com.garmin.android.apps.connectmobile.workouts.presentation.msn.filter.f.b bVar3 = fVar.f49520d;
                                            if (bVar3 != null) {
                                                bVar3.X4();
                                            }
                                            break;
                                        case 1:
                                            com.garmin.android.apps.connectmobile.workouts.presentation.msn.filter.f.b bVar4 = fVar.f49520d;
                                            if (bVar4 != null) {
                                                bVar4.C2();
                                            }
                                            break;
                                        case 2:
                                            com.garmin.android.apps.connectmobile.workouts.presentation.msn.filter.f.b bVar5 = fVar.f49520d;
                                            if (bVar5 != null) {
                                                bVar5.d3();
                                            }
                                            break;
                                        case 3:
                                            com.garmin.android.apps.connectmobile.workouts.presentation.msn.filter.f.b bVar6 = fVar.f49520d;
                                            if (bVar6 != null) {
                                                bVar6.v5();
                                            }
                                            break;
                                        default:
                                            com.garmin.android.apps.connectmobile.workouts.presentation.msn.filter.f.b bVar7 = fVar.f49520d;
                                            if (bVar7 != null) {
                                                bVar7.v8();
                                            }
                                            break;
                                    }
                                    return Unit.INSTANCE;
                                }
                            };
                            mVar2.K(aVar9);
                            obj6 = aVar9;
                        }
                    }
                    obj6 = objQ4;
                    d10.d.u6(strQ3, string3, (e23.a) obj6, mVar2);
                    String strQ4 = gl1.y.Q(mVar2, R.string.lbl_msn_workouts_muscle_groups_filter);
                    Context context3 = (Context) mVar2.A(y3Var);
                    List<o13.p<String, String>> list4 = fVar.v6().f97410b;
                    List<o13.p<String, String>> list5 = fVar.v6().f97423o;
                    context3.getClass();
                    list4.getClass();
                    if (list5 != null) {
                        int size4 = list4.size();
                        int size5 = list5.size();
                        if (1 > size5 || size5 >= size4) {
                            string4 = context3.getString(R.string.common_all);
                            string4.getClass();
                        } else {
                            string4 = h0.k0(list5, ", ", null, null, new j02.r(16), 30);
                        }
                    } else {
                        string4 = context3.getString(R.string.common_all);
                        string4.getClass();
                    }
                    boolean zR4 = mVar2.r(fVar);
                    Object objQ5 = mVar2.q();
                    if (zR4) {
                        obj7 = objQ5;
                        e23.a aVar10 = new e23.a() { // from class: j62.f
                            @Override // e23.a
                            public final Object invoke() {
                                switch (i15) {
                                    case 0:
                                        com.garmin.android.apps.connectmobile.workouts.presentation.msn.filter.f.b bVar3 = fVar.f49520d;
                                        if (bVar3 != null) {
                                            bVar3.X4();
                                        }
                                        break;
                                    case 1:
                                        com.garmin.android.apps.connectmobile.workouts.presentation.msn.filter.f.b bVar4 = fVar.f49520d;
                                        if (bVar4 != null) {
                                            bVar4.C2();
                                        }
                                        break;
                                    case 2:
                                        com.garmin.android.apps.connectmobile.workouts.presentation.msn.filter.f.b bVar5 = fVar.f49520d;
                                        if (bVar5 != null) {
                                            bVar5.d3();
                                        }
                                        break;
                                    case 3:
                                        com.garmin.android.apps.connectmobile.workouts.presentation.msn.filter.f.b bVar6 = fVar.f49520d;
                                        if (bVar6 != null) {
                                            bVar6.v5();
                                        }
                                        break;
                                    default:
                                        com.garmin.android.apps.connectmobile.workouts.presentation.msn.filter.f.b bVar7 = fVar.f49520d;
                                        if (bVar7 != null) {
                                            bVar7.v8();
                                        }
                                        break;
                                }
                                return Unit.INSTANCE;
                            }
                        };
                        mVar2.K(aVar10);
                        obj7 = aVar10;
                    } else {
                        aVar5.getClass();
                        if (objQ5 == m.a.f135155b) {
                            obj7 = objQ5;
                            e23.a aVar11 = new e23.a() { // from class: j62.f
                                @Override // e23.a
                                public final Object invoke() {
                                    switch (i15) {
                                        case 0:
                                            com.garmin.android.apps.connectmobile.workouts.presentation.msn.filter.f.b bVar3 = fVar.f49520d;
                                            if (bVar3 != null) {
                                                bVar3.X4();
                                            }
                                            break;
                                        case 1:
                                            com.garmin.android.apps.connectmobile.workouts.presentation.msn.filter.f.b bVar4 = fVar.f49520d;
                                            if (bVar4 != null) {
                                                bVar4.C2();
                                            }
                                            break;
                                        case 2:
                                            com.garmin.android.apps.connectmobile.workouts.presentation.msn.filter.f.b bVar5 = fVar.f49520d;
                                            if (bVar5 != null) {
                                                bVar5.d3();
                                            }
                                            break;
                                        case 3:
                                            com.garmin.android.apps.connectmobile.workouts.presentation.msn.filter.f.b bVar6 = fVar.f49520d;
                                            if (bVar6 != null) {
                                                bVar6.v5();
                                            }
                                            break;
                                        default:
                                            com.garmin.android.apps.connectmobile.workouts.presentation.msn.filter.f.b bVar7 = fVar.f49520d;
                                            if (bVar7 != null) {
                                                bVar7.v8();
                                            }
                                            break;
                                    }
                                    return Unit.INSTANCE;
                                }
                            };
                            mVar2.K(aVar11);
                            obj7 = aVar11;
                        }
                    }
                    obj7 = objQ5;
                    d10.d.u6(strQ4, string4, (e23.a) obj7, mVar2);
                    String strQ5 = gl1.y.Q(mVar2, R.string.user_settings_goals_section_title);
                    Context context4 = (Context) mVar2.A(y3Var);
                    List<o13.p<String, String>> list6 = fVar.v6().f97411c;
                    List<o13.p<String, String>> list7 = fVar.v6().f97424p;
                    context4.getClass();
                    list6.getClass();
                    if (list7 != null) {
                        int size6 = list6.size();
                        int size7 = list7.size();
                        if (1 > size7 || size7 >= size6) {
                            string5 = context4.getString(R.string.common_all);
                            string5.getClass();
                        } else {
                            string5 = h0.k0(list7, ", ", null, null, new j02.r(9), 30);
                        }
                    } else {
                        string5 = context4.getString(R.string.common_all);
                        string5.getClass();
                    }
                    boolean zR5 = mVar2.r(fVar);
                    Object objQ6 = mVar2.q();
                    if (zR5) {
                        obj8 = objQ6;
                        final int i17 = 3;
                        e23.a aVar12 = new e23.a() { // from class: j62.f
                            @Override // e23.a
                            public final Object invoke() {
                                switch (i17) {
                                    case 0:
                                        com.garmin.android.apps.connectmobile.workouts.presentation.msn.filter.f.b bVar3 = fVar.f49520d;
                                        if (bVar3 != null) {
                                            bVar3.X4();
                                        }
                                        break;
                                    case 1:
                                        com.garmin.android.apps.connectmobile.workouts.presentation.msn.filter.f.b bVar4 = fVar.f49520d;
                                        if (bVar4 != null) {
                                            bVar4.C2();
                                        }
                                        break;
                                    case 2:
                                        com.garmin.android.apps.connectmobile.workouts.presentation.msn.filter.f.b bVar5 = fVar.f49520d;
                                        if (bVar5 != null) {
                                            bVar5.d3();
                                        }
                                        break;
                                    case 3:
                                        com.garmin.android.apps.connectmobile.workouts.presentation.msn.filter.f.b bVar6 = fVar.f49520d;
                                        if (bVar6 != null) {
                                            bVar6.v5();
                                        }
                                        break;
                                    default:
                                        com.garmin.android.apps.connectmobile.workouts.presentation.msn.filter.f.b bVar7 = fVar.f49520d;
                                        if (bVar7 != null) {
                                            bVar7.v8();
                                        }
                                        break;
                                }
                                return Unit.INSTANCE;
                            }
                        };
                        mVar2.K(aVar12);
                        obj8 = aVar12;
                    } else {
                        aVar5.getClass();
                        if (objQ6 == m.a.f135155b) {
                            obj8 = objQ6;
                            final int i18 = 3;
                            e23.a aVar13 = new e23.a() { // from class: j62.f
                                @Override // e23.a
                                public final Object invoke() {
                                    switch (i18) {
                                        case 0:
                                            com.garmin.android.apps.connectmobile.workouts.presentation.msn.filter.f.b bVar3 = fVar.f49520d;
                                            if (bVar3 != null) {
                                                bVar3.X4();
                                            }
                                            break;
                                        case 1:
                                            com.garmin.android.apps.connectmobile.workouts.presentation.msn.filter.f.b bVar4 = fVar.f49520d;
                                            if (bVar4 != null) {
                                                bVar4.C2();
                                            }
                                            break;
                                        case 2:
                                            com.garmin.android.apps.connectmobile.workouts.presentation.msn.filter.f.b bVar5 = fVar.f49520d;
                                            if (bVar5 != null) {
                                                bVar5.d3();
                                            }
                                            break;
                                        case 3:
                                            com.garmin.android.apps.connectmobile.workouts.presentation.msn.filter.f.b bVar6 = fVar.f49520d;
                                            if (bVar6 != null) {
                                                bVar6.v5();
                                            }
                                            break;
                                        default:
                                            com.garmin.android.apps.connectmobile.workouts.presentation.msn.filter.f.b bVar7 = fVar.f49520d;
                                            if (bVar7 != null) {
                                                bVar7.v8();
                                            }
                                            break;
                                    }
                                    return Unit.INSTANCE;
                                }
                            };
                            mVar2.K(aVar13);
                            obj8 = aVar13;
                        }
                    }
                    obj8 = objQ6;
                    d10.d.u6(strQ5, string5, (e23.a) obj8, mVar2);
                    String strQ6 = gl1.y.Q(mVar2, R.string.txt_duration);
                    Context context5 = (Context) mVar2.A(y3Var);
                    List<? extends com.garmin.android.apps.connectmobile.workouts.presentation.msn.filter.a> list8 = fVar.v6().f97422n;
                    context5.getClass();
                    if (list8 == null || 1 > (size = list8.size())) {
                        string6 = context5.getString(R.string.common_all);
                        string6.getClass();
                    } else {
                        com.garmin.android.apps.connectmobile.workouts.presentation.msn.filter.a.f49510c.getClass();
                        if (size >= com.garmin.android.apps.connectmobile.workouts.presentation.msn.filter.a.C0972a.a().size()) {
                            string6 = context5.getString(R.string.common_all);
                            string6.getClass();
                        } else if (size == 1) {
                            string6 = com.garmin.android.apps.connectmobile.workouts.presentation.msn.filter.e.b(list8.get(0).f49511a, list8.get(0).f49512b, context5);
                        } else {
                            ArrayList arrayList = new ArrayList();
                            int i19 = list8.get(0).f49511a;
                            int i24 = list8.get(0).f49512b;
                            for (int i25 = 1; i25 < size; i25++) {
                                if (Math.abs(list8.get(i25).f49511a - i24) <= 1) {
                                    i24 = list8.get(i25).f49512b;
                                } else {
                                    arrayList.add(com.garmin.android.apps.connectmobile.workouts.presentation.msn.filter.e.b(i19, i24, context5));
                                    i19 = list8.get(i25).f49511a;
                                    i24 = list8.get(i25).f49512b;
                                }
                                if (i25 == size - 1) {
                                    arrayList.add(com.garmin.android.apps.connectmobile.workouts.presentation.msn.filter.e.b(i19, i24, context5));
                                }
                            }
                            string6 = h0.k0(arrayList, ", ", null, null, null, 62);
                        }
                    }
                    boolean zR6 = mVar2.r(fVar);
                    Object objQ7 = mVar2.q();
                    if (zR6) {
                        obj9 = objQ7;
                        final int i26 = 4;
                        e23.a aVar14 = new e23.a() { // from class: j62.f
                            @Override // e23.a
                            public final Object invoke() {
                                switch (i26) {
                                    case 0:
                                        com.garmin.android.apps.connectmobile.workouts.presentation.msn.filter.f.b bVar3 = fVar.f49520d;
                                        if (bVar3 != null) {
                                            bVar3.X4();
                                        }
                                        break;
                                    case 1:
                                        com.garmin.android.apps.connectmobile.workouts.presentation.msn.filter.f.b bVar4 = fVar.f49520d;
                                        if (bVar4 != null) {
                                            bVar4.C2();
                                        }
                                        break;
                                    case 2:
                                        com.garmin.android.apps.connectmobile.workouts.presentation.msn.filter.f.b bVar5 = fVar.f49520d;
                                        if (bVar5 != null) {
                                            bVar5.d3();
                                        }
                                        break;
                                    case 3:
                                        com.garmin.android.apps.connectmobile.workouts.presentation.msn.filter.f.b bVar6 = fVar.f49520d;
                                        if (bVar6 != null) {
                                            bVar6.v5();
                                        }
                                        break;
                                    default:
                                        com.garmin.android.apps.connectmobile.workouts.presentation.msn.filter.f.b bVar7 = fVar.f49520d;
                                        if (bVar7 != null) {
                                            bVar7.v8();
                                        }
                                        break;
                                }
                                return Unit.INSTANCE;
                            }
                        };
                        mVar2.K(aVar14);
                        obj9 = aVar14;
                    } else {
                        aVar5.getClass();
                        if (objQ7 == m.a.f135155b) {
                            obj9 = objQ7;
                            final int i27 = 4;
                            e23.a aVar15 = new e23.a() { // from class: j62.f
                                @Override // e23.a
                                public final Object invoke() {
                                    switch (i27) {
                                        case 0:
                                            com.garmin.android.apps.connectmobile.workouts.presentation.msn.filter.f.b bVar3 = fVar.f49520d;
                                            if (bVar3 != null) {
                                                bVar3.X4();
                                            }
                                            break;
                                        case 1:
                                            com.garmin.android.apps.connectmobile.workouts.presentation.msn.filter.f.b bVar4 = fVar.f49520d;
                                            if (bVar4 != null) {
                                                bVar4.C2();
                                            }
                                            break;
                                        case 2:
                                            com.garmin.android.apps.connectmobile.workouts.presentation.msn.filter.f.b bVar5 = fVar.f49520d;
                                            if (bVar5 != null) {
                                                bVar5.d3();
                                            }
                                            break;
                                        case 3:
                                            com.garmin.android.apps.connectmobile.workouts.presentation.msn.filter.f.b bVar6 = fVar.f49520d;
                                            if (bVar6 != null) {
                                                bVar6.v5();
                                            }
                                            break;
                                        default:
                                            com.garmin.android.apps.connectmobile.workouts.presentation.msn.filter.f.b bVar7 = fVar.f49520d;
                                            if (bVar7 != null) {
                                                bVar7.v8();
                                            }
                                            break;
                                    }
                                    return Unit.INSTANCE;
                                }
                            };
                            mVar2.K(aVar15);
                            obj9 = aVar15;
                        }
                    }
                    obj9 = objQ7;
                    d10.d.u6(strQ6, string6, (e23.a) obj9, mVar2);
                    mVar2.y();
                    x1 x1Var3 = n.f135158a;
                } else {
                    mVar2.e();
                }
                return Unit.INSTANCE;
        }
    }
}
