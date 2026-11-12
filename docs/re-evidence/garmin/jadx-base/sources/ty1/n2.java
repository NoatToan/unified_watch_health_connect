package ty1;

import android.os.Bundle;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.g3;
import com.garmin.android.apps.connectmobile.traininginitiative.ui.TrainingInitiativeEventActivity;
import com.garmin.android.apps.connectmobile.traininginitiative.viewmodels.AddTIEventViewModel;
import java.util.ArrayList;
import java.util.List;
import org.joda.time.DateTime;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class n2 implements e23.l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f167196a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ TrainingInitiativeEventActivity f167197b;

    public /* synthetic */ n2(TrainingInitiativeEventActivity trainingInitiativeEventActivity, int i14) {
        this.f167196a = i14;
        this.f167197b = trainingInitiativeEventActivity;
    }

    /* JADX WARN: Code duplicated, block: B:171:0x0473 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:172:0x0475  */
    /* JADX WARN: Code duplicated, block: B:173:0x048c  */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // e23.l
    public final Object invoke(Object obj) {
        int i14 = this.f167196a;
        TrainingInitiativeEventActivity trainingInitiativeEventActivity = this.f167197b;
        switch (i14) {
            case 0:
                fw.m mVar = (fw.m) obj;
                TrainingInitiativeEventActivity.a aVar = TrainingInitiativeEventActivity.f45718o;
                fw.p pVar = mVar.f73769b;
                List list = (List) mVar.f73770c;
                int i15 = TrainingInitiativeEventActivity.b.f45733a[pVar.ordinal()];
                if (i15 == 1) {
                    trainingInitiativeEventActivity.showProgressOverlay();
                } else if (i15 == 2) {
                    trainingInitiativeEventActivity.hideProgressOverlay();
                    ww1.w wVar = trainingInitiativeEventActivity.ka().F2;
                    if (wVar != null) {
                        m52.i iVar = wVar.f187882a;
                        if (list != null) {
                            AddTIEventViewModel addTIEventViewModelKa = trainingInitiativeEventActivity.ka();
                            ((androidx.lifecycle.y0) addTIEventViewModelKa.Q0.getValue()).m(list);
                            addTIEventViewModelKa.O6(iVar);
                            List listK = p13.x.k(wVar.f187883b, wVar.f187884c, wVar.f187885d);
                            listK.getClass();
                            og0.a.f131967a.getClass();
                            addTIEventViewModelKa.W5().m(new com.garmin.android.apps.connectmobile.workouts.data.model.f(listK, iVar, og0.a.f(listK)));
                            addTIEventViewModelKa.B2 = false;
                            addTIEventViewModelKa.O5().m("TIAddTriathlonEventDistanceFragment");
                        } else if (list == null) {
                            trainingInitiativeEventActivity.ka().O6(m52.i.CUSTOM);
                            AddTIEventViewModel addTIEventViewModelKa2 = trainingInitiativeEventActivity.ka();
                            addTIEventViewModelKa2.B2 = false;
                            addTIEventViewModelKa2.O5().m("TIAddTriathlonEventDistanceFragment");
                        } else {
                            AddTIEventViewModel addTIEventViewModelKa3 = trainingInitiativeEventActivity.ka();
                            ((androidx.lifecycle.y0) addTIEventViewModelKa3.Q0.getValue()).m(list);
                            addTIEventViewModelKa3.O5().m("TIAddTriathlonEventTypeFragment");
                        }
                    } else if (list == null) {
                        trainingInitiativeEventActivity.ka().O6(m52.i.CUSTOM);
                        AddTIEventViewModel addTIEventViewModelKa4 = trainingInitiativeEventActivity.ka();
                        addTIEventViewModelKa4.B2 = false;
                        addTIEventViewModelKa4.O5().m("TIAddTriathlonEventDistanceFragment");
                    } else {
                        AddTIEventViewModel addTIEventViewModelKa5 = trainingInitiativeEventActivity.ka();
                        ((androidx.lifecycle.y0) addTIEventViewModelKa5.Q0.getValue()).m(list);
                        addTIEventViewModelKa5.O5().m("TIAddTriathlonEventTypeFragment");
                    }
                } else {
                    if (i15 != 3) {
                        lc.u0.r();
                        return null;
                    }
                    trainingInitiativeEventActivity.hideProgressOverlay();
                    trainingInitiativeEventActivity.ka().O6(m52.i.CUSTOM);
                    AddTIEventViewModel addTIEventViewModelKa6 = trainingInitiativeEventActivity.ka();
                    addTIEventViewModelKa6.B2 = false;
                    addTIEventViewModelKa6.O5().m("TIAddTriathlonEventDistanceFragment");
                }
                return Unit.INSTANCE;
            case 1:
                g3 g3Var = (g3) obj;
                TrainingInitiativeEventActivity.a aVar2 = TrainingInitiativeEventActivity.f45718o;
                fw.p pVar2 = g3Var != null ? g3Var.f35300a : null;
                int i16 = pVar2 == null ? -1 : TrainingInitiativeEventActivity.b.f45733a[pVar2.ordinal()];
                if (i16 == 1) {
                    trainingInitiativeEventActivity.showProgressOverlay();
                } else if (i16 != 2) {
                    trainingInitiativeEventActivity.hideProgressOverlay();
                    trainingInitiativeEventActivity.ka().w6();
                } else {
                    List list2 = (List) g3Var.f35301b;
                    if (list2 == null || list2.isEmpty()) {
                        trainingInitiativeEventActivity.ka().w6();
                    } else {
                        trainingInitiativeEventActivity.ka().O5().m("TIEventMatchingFragment");
                    }
                    trainingInitiativeEventActivity.hideProgressOverlay();
                }
                return Unit.INSTANCE;
            default:
                String str = (String) obj;
                TrainingInitiativeEventActivity.a aVar3 = TrainingInitiativeEventActivity.f45718o;
                trainingInitiativeEventActivity.showActionBar();
                if (str != null) {
                    switch (str.hashCode()) {
                        case -1928483414:
                            if (str.equals("TIAddTriathlonEventDistanceFragment")) {
                                com.garmin.android.apps.connectmobile.traininginitiative.ui.u.a aVar4 = com.garmin.android.apps.connectmobile.traininginitiative.ui.u.A;
                                com.garmin.android.apps.connectmobile.workouts.data.model.f fVarD = trainingInitiativeEventActivity.ka().V5().d();
                                boolean z14 = trainingInitiativeEventActivity.ka().B2;
                                aVar4.getClass();
                                Bundle bundle = new Bundle();
                                bundle.putParcelable("TRIATHLON_TYPE_DISTANCE", fVarD);
                                bundle.putBoolean("IS_FROM_REVIEW_ENTRY_SCREEN", z14);
                                com.garmin.android.apps.connectmobile.traininginitiative.ui.u uVar = new com.garmin.android.apps.connectmobile.traininginitiative.ui.u();
                                uVar.setArguments(bundle);
                                trainingInitiativeEventActivity.ma(uVar, str);
                            }
                            break;
                        case -1823570321:
                            if (str.equals("TIAddTriathlonEventTypeFragment")) {
                                com.garmin.android.apps.connectmobile.traininginitiative.ui.v.a aVar5 = com.garmin.android.apps.connectmobile.traininginitiative.ui.v.f46300e;
                                List list3 = (List) ((androidx.lifecycle.s0) trainingInitiativeEventActivity.ka().R0.getValue()).d();
                                aVar5.getClass();
                                Bundle bundle2 = new Bundle();
                                bundle2.putParcelableArrayList("TRIATHLON_TYPE_DISTANCE", list3 != null ? new ArrayList<>(list3) : null);
                                com.garmin.android.apps.connectmobile.traininginitiative.ui.v vVar = new com.garmin.android.apps.connectmobile.traininginitiative.ui.v();
                                vVar.setArguments(bundle2);
                                trainingInitiativeEventActivity.ma(vVar, str);
                            }
                            break;
                        case -1727948238:
                            if (str.equals("TIAddEventDistanceTimeFragment2")) {
                                com.garmin.android.apps.connectmobile.traininginitiative.ui.k.f46110c.getClass();
                                trainingInitiativeEventActivity.ma(new com.garmin.android.apps.connectmobile.traininginitiative.ui.k(), str);
                            }
                            break;
                        case -1676756860:
                            if (str.equals("TIAddEventWebsiteNotesFragment")) {
                                com.garmin.android.apps.connectmobile.traininginitiative.ui.s.a aVar6 = com.garmin.android.apps.connectmobile.traininginitiative.ui.s.f46227x;
                                DateTime dateTimeLa = trainingInitiativeEventActivity.la();
                                aVar6.getClass();
                                Bundle bundle3 = new Bundle();
                                if (dateTimeLa == null) {
                                    dateTimeLa = new DateTime();
                                }
                                bundle3.putSerializable("extra.date.time", dateTimeLa);
                                com.garmin.android.apps.connectmobile.traininginitiative.ui.s sVar = new com.garmin.android.apps.connectmobile.traininginitiative.ui.s();
                                sVar.setArguments(bundle3);
                                trainingInitiativeEventActivity.ma(sVar, str);
                            }
                            break;
                        case -1352716013:
                            if (str.equals("TIReviewEntriesFragment")) {
                                if (trainingInitiativeEventActivity.ka().f46439u2) {
                                    trainingInitiativeEventActivity.hideActionBar();
                                }
                                com.garmin.android.apps.connectmobile.traininginitiative.ui.a0.a aVar7 = com.garmin.android.apps.connectmobile.traininginitiative.ui.a0.I1;
                                DateTime dateTimeLa2 = trainingInitiativeEventActivity.la();
                                aVar7.getClass();
                                Bundle bundle4 = new Bundle();
                                if (dateTimeLa2 == null) {
                                    dateTimeLa2 = new DateTime();
                                }
                                bundle4.putSerializable("extra.date.time", dateTimeLa2);
                                com.garmin.android.apps.connectmobile.traininginitiative.ui.a0 a0Var = new com.garmin.android.apps.connectmobile.traininginitiative.ui.a0();
                                a0Var.setArguments(bundle4);
                                trainingInitiativeEventActivity.ma(a0Var, str);
                            }
                            break;
                        case -820035494:
                            if (str.equals("TIAddEventTypeFragment2")) {
                                com.garmin.android.apps.connectmobile.traininginitiative.ui.r.a aVar8 = com.garmin.android.apps.connectmobile.traininginitiative.ui.r.f46219c;
                                DateTime dateTimeLa3 = trainingInitiativeEventActivity.la();
                                aVar8.getClass();
                                Bundle bundle5 = new Bundle();
                                if (dateTimeLa3 == null) {
                                    dateTimeLa3 = new DateTime();
                                }
                                bundle5.putSerializable("extra.date.time", dateTimeLa3);
                                com.garmin.android.apps.connectmobile.traininginitiative.ui.r rVar = new com.garmin.android.apps.connectmobile.traininginitiative.ui.r();
                                rVar.setArguments(bundle5);
                                trainingInitiativeEventActivity.ma(rVar, str);
                            }
                            break;
                        case -724924229:
                            if (str.equals("TIAddEventShareableFragment")) {
                                com.garmin.android.apps.connectmobile.traininginitiative.ui.q.a aVar9 = com.garmin.android.apps.connectmobile.traininginitiative.ui.q.f46204j;
                                DateTime dateTimeLa4 = trainingInitiativeEventActivity.la();
                                aVar9.getClass();
                                Bundle bundle6 = new Bundle();
                                if (dateTimeLa4 == null) {
                                    dateTimeLa4 = new DateTime();
                                }
                                bundle6.putSerializable("extra.date.time", dateTimeLa4);
                                com.garmin.android.apps.connectmobile.traininginitiative.ui.q qVar = new com.garmin.android.apps.connectmobile.traininginitiative.ui.q();
                                qVar.setArguments(bundle6);
                                trainingInitiativeEventActivity.ma(qVar, str);
                            }
                            break;
                        case -696284760:
                            if (str.equals("TIAddACourseGenesisFragment")) {
                                com.garmin.android.apps.connectmobile.traininginitiative.ui.g.f45967d.getClass();
                                trainingInitiativeEventActivity.ma(new com.garmin.android.apps.connectmobile.traininginitiative.ui.g(), str);
                            }
                            break;
                        case -588438231:
                            if (str.equals("TIAddEventNameFragment")) {
                                com.garmin.android.apps.connectmobile.traininginitiative.ui.o.a aVar10 = com.garmin.android.apps.connectmobile.traininginitiative.ui.o.f46150j;
                                DateTime dateTimeLa5 = trainingInitiativeEventActivity.la();
                                aVar10.getClass();
                                Bundle bundle7 = new Bundle();
                                if (dateTimeLa5 == null) {
                                    dateTimeLa5 = new DateTime();
                                }
                                bundle7.putSerializable("extra.date.time", dateTimeLa5);
                                com.garmin.android.apps.connectmobile.traininginitiative.ui.o oVar = new com.garmin.android.apps.connectmobile.traininginitiative.ui.o();
                                oVar.setArguments(bundle7);
                                trainingInitiativeEventActivity.ma(oVar, str);
                            }
                            break;
                        case -575977471:
                            if (str.equals("TIReviewEntriesEventTypeFragment")) {
                                if (trainingInitiativeEventActivity.ka().f46439u2) {
                                    trainingInitiativeEventActivity.hideActionBar();
                                }
                                com.garmin.android.apps.connectmobile.traininginitiative.ui.z.a aVar11 = com.garmin.android.apps.connectmobile.traininginitiative.ui.z.f46367y;
                                DateTime dateTimeLa6 = trainingInitiativeEventActivity.la();
                                aVar11.getClass();
                                Bundle bundle8 = new Bundle();
                                if (dateTimeLa6 == null) {
                                    dateTimeLa6 = new DateTime();
                                }
                                bundle8.putSerializable("extra.date.time", dateTimeLa6);
                                com.garmin.android.apps.connectmobile.traininginitiative.ui.z zVar = new com.garmin.android.apps.connectmobile.traininginitiative.ui.z();
                                zVar.setArguments(bundle8);
                                trainingInitiativeEventActivity.ma(zVar, str);
                            }
                            break;
                        case -453159147:
                            if (str.equals("TIReviewEntriesDistanceTimeFragment")) {
                                trainingInitiativeEventActivity.hideActionBar();
                                com.garmin.android.apps.connectmobile.traininginitiative.ui.y.f46341v.getClass();
                                trainingInitiativeEventActivity.ma(new com.garmin.android.apps.connectmobile.traininginitiative.ui.y(), str);
                            }
                            break;
                        case -220809038:
                            if (str.equals("TIEventMatchingFragment")) {
                                vy1.a.f180785g.getClass();
                                Bundle bundle9 = new Bundle();
                                vy1.a aVar12 = new vy1.a();
                                aVar12.setArguments(bundle9);
                                trainingInitiativeEventActivity.ma(aVar12, str);
                            }
                            break;
                        case -190305443:
                            if (str.equals("TIAddEventImageFragment")) {
                                com.garmin.android.apps.connectmobile.traininginitiative.ui.l.a aVar13 = com.garmin.android.apps.connectmobile.traininginitiative.ui.l.f46122h;
                                DateTime dateTimeLa7 = trainingInitiativeEventActivity.la();
                                aVar13.getClass();
                                Bundle bundle10 = new Bundle();
                                if (dateTimeLa7 == null) {
                                    dateTimeLa7 = new DateTime();
                                }
                                bundle10.putSerializable("extra.date.time", dateTimeLa7);
                                com.garmin.android.apps.connectmobile.traininginitiative.ui.l lVar = new com.garmin.android.apps.connectmobile.traininginitiative.ui.l();
                                lVar.setArguments(bundle10);
                                trainingInitiativeEventActivity.ma(lVar, str);
                            }
                            break;
                        case 701838129:
                            if (str.equals("TIAddLocationFragment")) {
                                if (trainingInitiativeEventActivity.ka().f46439u2) {
                                    trainingInitiativeEventActivity.ka().C2 = true;
                                }
                                com.garmin.android.apps.connectmobile.traininginitiative.ui.t.a aVar14 = com.garmin.android.apps.connectmobile.traininginitiative.ui.t.f46255f;
                                DateTime dateTimeLa8 = trainingInitiativeEventActivity.la();
                                aVar14.getClass();
                                Bundle bundle11 = new Bundle();
                                if (dateTimeLa8 == null) {
                                    dateTimeLa8 = new DateTime();
                                }
                                bundle11.putSerializable("extra.date.time", dateTimeLa8);
                                com.garmin.android.apps.connectmobile.traininginitiative.ui.t tVar = new com.garmin.android.apps.connectmobile.traininginitiative.ui.t();
                                tVar.setArguments(bundle11);
                                trainingInitiativeEventActivity.ma(tVar, str);
                            }
                            break;
                        case 981312087:
                            if (str.equals("TIAddEventMainFragment")) {
                                androidx.fragment.app.v supportFragmentManager = trainingInitiativeEventActivity.getSupportFragmentManager();
                                androidx.fragment.app.a aVarB = androidx.core.view.j.b(supportFragmentManager, supportFragmentManager);
                                com.garmin.android.apps.connectmobile.traininginitiative.ui.n.a aVar15 = com.garmin.android.apps.connectmobile.traininginitiative.ui.n.f46137f;
                                DateTime dateTimeLa9 = trainingInitiativeEventActivity.la();
                                aVar15.getClass();
                                Bundle bundle12 = new Bundle();
                                if (dateTimeLa9 == null) {
                                    dateTimeLa9 = new DateTime();
                                }
                                bundle12.putSerializable("extra.date.time", dateTimeLa9);
                                com.garmin.android.apps.connectmobile.traininginitiative.ui.n nVar = new com.garmin.android.apps.connectmobile.traininginitiative.ui.n();
                                nVar.setArguments(bundle12);
                                aVarB.l(R.id.content_frame, nVar, str);
                                aVarB.e();
                            }
                            break;
                        case 1040107340:
                            if (str.equals("TIAddEventDateFragment")) {
                                com.garmin.android.apps.connectmobile.traininginitiative.ui.j.a aVar16 = com.garmin.android.apps.connectmobile.traininginitiative.ui.j.f46094h;
                                DateTime dateTimeLa10 = trainingInitiativeEventActivity.la();
                                aVar16.getClass();
                                Bundle bundle13 = new Bundle();
                                if (dateTimeLa10 == null) {
                                    dateTimeLa10 = new DateTime();
                                }
                                bundle13.putSerializable("extra.date.time", dateTimeLa10);
                                com.garmin.android.apps.connectmobile.traininginitiative.ui.j jVar = new com.garmin.android.apps.connectmobile.traininginitiative.ui.j();
                                jVar.setArguments(bundle13);
                                trainingInitiativeEventActivity.ma(jVar, str);
                            }
                            break;
                        case 1328438236:
                            if (str.equals("TIFindEventFragment")) {
                                vy1.e.a aVar17 = vy1.e.T;
                                DateTime dateTimeLa11 = trainingInitiativeEventActivity.la();
                                aVar17.getClass();
                                Bundle bundle14 = new Bundle();
                                if (dateTimeLa11 == null) {
                                    dateTimeLa11 = new DateTime();
                                }
                                bundle14.putSerializable("extra.date.time", dateTimeLa11);
                                vy1.e eVar = new vy1.e();
                                eVar.setArguments(bundle14);
                                trainingInitiativeEventActivity.ma(eVar, str);
                            }
                            break;
                        case 1439202882:
                            if (str.equals("TIAddEventCreateACourseFragment")) {
                                com.garmin.android.apps.connectmobile.traininginitiative.ui.i.a aVar18 = com.garmin.android.apps.connectmobile.traininginitiative.ui.i.f46067g;
                                DateTime dateTimeLa12 = trainingInitiativeEventActivity.la();
                                aVar18.getClass();
                                Bundle bundle15 = new Bundle();
                                if (dateTimeLa12 == null) {
                                    dateTimeLa12 = new DateTime();
                                }
                                bundle15.putSerializable("extra.date.time", dateTimeLa12);
                                com.garmin.android.apps.connectmobile.traininginitiative.ui.i iVar2 = new com.garmin.android.apps.connectmobile.traininginitiative.ui.i();
                                iVar2.setArguments(bundle15);
                                trainingInitiativeEventActivity.ma(iVar2, str);
                            }
                            break;
                        case 1893027695:
                            if (str.equals("TIAddEventRaceFragment")) {
                                com.garmin.android.apps.connectmobile.traininginitiative.ui.p.a aVar19 = com.garmin.android.apps.connectmobile.traininginitiative.ui.p.f46166c;
                                DateTime dateTimeLa13 = trainingInitiativeEventActivity.la();
                                aVar19.getClass();
                                Bundle bundle16 = new Bundle();
                                if (dateTimeLa13 == null) {
                                    dateTimeLa13 = new DateTime();
                                }
                                bundle16.putSerializable("extra.date.time", dateTimeLa13);
                                com.garmin.android.apps.connectmobile.traininginitiative.ui.p pVar3 = new com.garmin.android.apps.connectmobile.traininginitiative.ui.p();
                                pVar3.setArguments(bundle16);
                                trainingInitiativeEventActivity.ma(pVar3, str);
                            }
                            break;
                    }
                }
                return Unit.INSTANCE;
        }
    }
}
