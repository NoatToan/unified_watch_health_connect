package ho0;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.SparseBooleanArray;
import android.view.MenuItem;
import android.widget.Button;
import androidx.fragment.app.Fragment;
import c53.c0;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.calendar.presentation.detail.details.CalendarDetailsActivity;
import com.garmin.android.apps.connectmobile.charts.mpchart3.wrapper.CustomBarChart;
import com.garmin.android.apps.connectmobile.consent.DataStorageConsentActivity;
import com.garmin.android.apps.connectmobile.e1;
import com.garmin.android.apps.connectmobile.g3;
import com.garmin.android.apps.connectmobile.garminpayfeature.GarminPayLaunchScreenActivity;
import com.garmin.android.apps.connectmobile.heartrate.presentation.HeartRateReportsActivity;
import com.garmin.android.apps.connectmobile.jet_lag.presentation.JetLagActivity;
import com.garmin.android.apps.connectmobile.jet_lag.presentation.edit.TripDetailsActivity;
import com.garmin.android.apps.connectmobile.menstrualcycle.presentation.details.MenstrualCycleDetailsActivity;
import com.garmin.android.apps.connectmobile.menstrualcycle.presentation.details.MenstrualCycleGenesisActivity;
import com.garmin.android.apps.connectmobile.pulseox.presentation.PulseOxActivity;
import com.garmin.android.apps.connectmobile.traininginitiative.ui.TrainingInitiativeEventActivity;
import com.garmin.android.apps.connectmobile.traininginitiative.ui.imagemultipicker.ImageMultiPickerActivity;
import com.garmin.android.apps.connectmobile.traininginitiative.ui.priority.TrainingPrioritySelectionActivity;
import com.garmin.android.gncs.NotificationConstants;
import e32.o;
import g2.m1;
import hq.f0;
import hq.g0;
import hq.m0;
import hq.n0;
import hq.n0.a;
import hq2.r;
import i3.ec;
import i3.fc;
import i3.g2;
import i3.gj;
import i3.h8;
import i3.h9;
import i3.l7;
import i3.m6;
import i3.wd;
import java.lang.annotation.Annotation;
import java.util.ArrayList;
import java.util.List;
import lc.u0;
import m63.y1;
import o4.b1;
import o4.f1;
import o4.j1;
import o4.r1;
import org.joda.time.DateTime;
import org.joda.time.LocalDate;
import org.joda.time.ReadableInstant;
import org.joda.time.ReadablePartial;
import org.koin.java.KoinJavaComponent;
import org.slf4j.Logger;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.s;
import p005kotlin.jvm.internal.x0;
import p13.h0;
import p13.j0;
import p13.u;
import pt1.p;
import retrofit2.HttpException;
import s5.r0;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class g implements e23.l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f84711a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f84712b;

    public /* synthetic */ g(Object obj, int i14) {
        this.f84711a = i14;
        this.f84712b = obj;
    }

    /* JADX WARN: Code duplicated, block: B:163:0x0447 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:164:0x0449  */
    /* JADX WARN: Code duplicated, block: B:165:0x044c  */
    /* JADX WARN: Code duplicated, block: B:171:0x045c  */
    /* JADX WARN: Code duplicated, block: B:176:0x0476  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // e23.l
    public final Object invoke(Object obj) {
        Throwable th3;
        HttpException httpException;
        MenuItem menuItem;
        List<hz1.e> list;
        k63.e f94809a;
        int i14 = this.f84711a;
        Object[] objArr = 0;
        int i15 = 3;
        annotations = null;
        List<Annotation> annotations = null;
        Object obj2 = this.f84712b;
        switch (i14) {
            case 0:
                sd2.f fVar = (sd2.f) obj;
                int i16 = h.f84713l;
                fVar.getClass();
                yb0.a aVar = ((h) obj2).f84714f;
                if (aVar != null) {
                    aVar.f195678a.j(new w61.f<>(fVar));
                }
                return Unit.INSTANCE;
            case 1:
                co0.f fVar2 = (co0.f) obj;
                int i17 = HeartRateReportsActivity.f36641d;
                fVar2.getClass();
                ((j) obj2).invoke(fVar2);
                return Unit.INSTANCE;
            case 2:
                g0 g0Var = (g0) obj2;
                List list2 = (List) obj;
                list2.getClass();
                ArrayList<hq.h> arrayList = g0Var.f85022d;
                if (g0Var.f85019a) {
                    List listS = c0.s(new c53.c(c0.l(h0.M(list2), new f0(objArr == true ? 1 : 0)), new com.google.maps.android.compose.clustering.d(21)));
                    for (hq.h hVar : arrayList) {
                        hVar.f85028c = listS.contains(hVar.f());
                    }
                } else {
                    List listR = g0.r(list2);
                    for (hq.h hVar2 : arrayList) {
                        hVar2.f85028c = listR.contains(hVar2.f());
                    }
                }
                g0Var.notifyDataSetChanged();
                return Unit.INSTANCE;
            case 3:
                boolean zBooleanValue = ((Boolean) obj).booleanValue();
                int i18 = m0.f85071d;
                ((Button) obj2).setEnabled(zBooleanValue);
                return Unit.INSTANCE;
            case 4:
                return androidx.lifecycle.m.a(null, ((n0) obj2).new a((List) obj, null), 3);
            case 5:
                r rVar = (r) obj2;
                byte[] bArr = (byte[]) obj;
                Logger logger = r.f85270f;
                bArr.getClass();
                e13.j jVarR = rVar.r();
                gw.j jVar = new gw.j(new m1(23, rVar, bArr), 28);
                int i19 = w03.b.f181178a;
                return new e13.g(jVarR, jVar);
            case 6:
                MenstrualCycleDetailsActivity menstrualCycleDetailsActivity = (MenstrualCycleDetailsActivity) obj2;
                fw.m mVar = (fw.m) obj;
                MenstrualCycleDetailsActivity.a aVar2 = MenstrualCycleDetailsActivity.f38784t;
                mVar.getClass();
                int i24 = MenstrualCycleDetailsActivity.b.f38797a[mVar.f73769b.ordinal()];
                if (i24 == 1) {
                    menstrualCycleDetailsActivity.showProgressOverlay();
                } else if (i24 == 2) {
                    menstrualCycleDetailsActivity.hideProgressOverlay();
                    if (s.g(mVar.f73770c, Boolean.FALSE)) {
                        MenstrualCycleGenesisActivity.f38811e.getClass();
                        menstrualCycleDetailsActivity.startActivity(new Intent(menstrualCycleDetailsActivity, (Class<?>) MenstrualCycleGenesisActivity.class));
                        menstrualCycleDetailsActivity.finish();
                    } else {
                        menstrualCycleDetailsActivity.va(true);
                    }
                } else {
                    if (i24 != 3) {
                        u0.r();
                        return null;
                    }
                    menstrualCycleDetailsActivity.va(true);
                    menstrualCycleDetailsActivity.hideProgressOverlay();
                    g22.a.a(menstrualCycleDetailsActivity, mVar.f73771d);
                }
                return Unit.INSTANCE;
            case 7:
                com.garmin.android.apps.connectmobile.menstrualcycle.presentation.details.h hVar3 = (com.garmin.android.apps.connectmobile.menstrualcycle.presentation.details.h) obj2;
                cx0.a aVar3 = (cx0.a) obj;
                com.garmin.android.apps.connectmobile.menstrualcycle.presentation.details.h.a aVar4 = com.garmin.android.apps.connectmobile.menstrualcycle.presentation.details.h.P;
                if ((aVar3 != null ? aVar3.f56600b : null) != null) {
                    if (aVar3 != null) {
                        th3 = aVar3.f56600b;
                    } else {
                        th3 = null;
                    }
                    if (th3 != null && !aVar3.f56602d) {
                        g22.e.f(hVar3);
                        Throwable th4 = aVar3.f56600b;
                        httpException = th4 instanceof HttpException ? (HttpException) th4 : null;
                        if (httpException == null && httpException.code() == 412) {
                            DataStorageConsentActivity.a aVar5 = DataStorageConsentActivity.f32194t;
                            Context contextRequireContext = hVar3.requireContext();
                            contextRequireContext.getClass();
                            DataStorageConsentActivity.a.c(aVar5, contextRequireContext);
                        } else {
                            g22.e.c(hVar3);
                        }
                        aVar3.f56602d = true;
                    }
                } else if ((aVar3 != null ? (ww0.b) aVar3.f56599a : null) != null) {
                    i52.a.f91796a.getClass();
                    i52.a.f91797b.edit().putString(i52.a.c(R.string.key_mct_logged_symptoms_date), LocalDate.now().toString()).apply();
                    hVar3.w6();
                    e1 e1Var = hVar3.f38949a;
                    if (e1Var != null) {
                        e1Var.onFragmentFinished((2 & 1) != 0 ? null : -1, null);
                    }
                } else {
                    if (aVar3 != null) {
                        th3 = aVar3.f56600b;
                    } else {
                        th3 = null;
                    }
                    if (th3 != null) {
                        g22.e.f(hVar3);
                        Throwable th5 = aVar3.f56600b;
                        if (th5 instanceof HttpException) {
                        }
                        if (httpException == null) {
                            g22.e.c(hVar3);
                        } else {
                            g22.e.c(hVar3);
                        }
                        aVar3.f56602d = true;
                    }
                }
                return Unit.INSTANCE;
            case 8:
                LocalDate localDate = (LocalDate) obj;
                localDate.getClass();
                return Boolean.valueOf(((com.garmin.android.apps.connectmobile.menstrualcycle.presentation.details.i) obj2).f38986d.compareTo((ReadablePartial) localDate) < 0);
            case 9:
                b00.a aVar6 = (b00.a) obj;
                CalendarDetailsActivity.b bVar = CalendarDetailsActivity.f31194p;
                e32.j jVar2 = (e32.j) ((CalendarDetailsActivity) obj2).oa();
                if (jVar2 != null) {
                    o oVar = o.f62806i;
                    oVar.getClass();
                    int iM = u.M(jVar2.f62798j, oVar);
                    Fragment fragment = iM >= 0 ? jVar2.f62800l.get(iM) : null;
                    e32.h hVar4 = fragment instanceof e32.h ? (e32.h) fragment : null;
                    if (hVar4 != null) {
                        hVar4.w6().setSwipeEnabled(!s.g(aVar6, b00.a.b.f14134a));
                    }
                }
                return Unit.INSTANCE;
            case 10:
                com.garmin.android.apps.connectmobile.calendar.presentation.detail.details.b.a aVar7 = com.garmin.android.apps.connectmobile.calendar.presentation.detail.details.b.C;
                ((com.garmin.android.apps.connectmobile.calendar.presentation.detail.details.b) obj2).F6(!s.g((b00.a) obj, b00.a.b.f14134a));
                return Unit.INSTANCE;
            case 11:
                ImageMultiPickerActivity imageMultiPickerActivity = (ImageMultiPickerActivity) obj2;
                List<hz1.e> list3 = (List) obj;
                hz1.c cVar = imageMultiPickerActivity.f46081b;
                if (cVar == null) {
                    s.m("adapter");
                    throw null;
                }
                if (list3 == null || (list = cVar.f86526h) == null || list.isEmpty()) {
                    cVar.f86526h = list3;
                    cVar.f86527i = new SparseBooleanArray(0);
                    cVar.notifyDataSetChanged();
                } else {
                    List<hz1.e> list4 = cVar.f86526h;
                    cVar.f86526h = list3;
                    if (list4 != null) {
                        h0.F0(list4);
                    } else {
                        list4 = null;
                    }
                    androidx.recyclerview.widget.o.e eVarA = androidx.recyclerview.widget.o.a(new hz1.c.b(list4, list3));
                    eVarA.b(new hz1.d(cVar, eVarA));
                }
                hz1.c cVar2 = imageMultiPickerActivity.f46081b;
                if (cVar2 == null) {
                    s.m("adapter");
                    throw null;
                }
                TrainingInitiativeEventActivity.f45718o.getClass();
                TrainingInitiativeEventActivity.a.b();
                int i25 = TrainingInitiativeEventActivity.f45720q;
                if (i25 > -1) {
                    cVar2.f86519a = i25;
                    cVar2.A(i25, true);
                }
                TrainingInitiativeEventActivity.a.b();
                if (TrainingInitiativeEventActivity.f45720q > -1 && (menuItem = imageMultiPickerActivity.f46084e) != null) {
                    menuItem.setEnabled(true);
                }
                return Unit.INSTANCE;
            case 12:
                Boolean bool = (Boolean) obj;
                bool.getClass();
                ((i10.h) obj2).f87059c.j(bool);
                return Unit.INSTANCE;
            case 13:
                g2 g2Var = (g2) obj2;
                ge1.b.T(g2Var.getCoroutineScope(), null, null, new g2.b.C1736b(g2Var, (n4.c) obj, null), 3);
                return Unit.INSTANCE;
            case 14:
                l7 l7Var = (l7) obj2;
                l4.f fVar3 = (l4.f) obj;
                float f75991a = fVar3.getF69050b() * l7Var.f88845m.e().f75997a;
                o4.j jVarA = o4.m.a();
                r1 r1VarB = l7Var.f88844l;
                if (r1VarB == null) {
                    ec ecVar = (ec) h5.i.a(l7Var, fc.f88102a);
                    n3.c0.f122715a.getClass();
                    r1VarB = fc.b(ecVar, n3.c0.f122719e);
                }
                b1 b1VarA = r1VarB.a(fVar3.f109845a.b(), fVar3.f109845a.getLayoutDirection(), fVar3);
                if (b1VarA instanceof b1.b) {
                    jVarA.q(((b1.b) b1VarA).f128812a, f1.b.CounterClockwise);
                } else if (b1VarA instanceof b1.c) {
                    jVarA.k(((b1.c) b1VarA).f128813a, f1.b.CounterClockwise);
                } else {
                    if (!(b1VarA instanceof b1.a)) {
                        u0.r();
                        return null;
                    }
                    f1.m(jVarA, ((b1.a) b1VarA).f128811a);
                }
                o4.j jVarA2 = o4.m.a();
                jVarA2.q(new n4.d(0.0f, Float.intBitsToFloat((int) (fVar3.f109845a.b() & 4294967295L)) - f75991a, Float.intBitsToFloat((int) (fVar3.f109845a.b() >> 32)), Float.intBitsToFloat((int) (4294967295L & fVar3.f109845a.b()))), f1.b.CounterClockwise);
                o4.j jVarA3 = o4.m.a();
                j1.f128873b.getClass();
                jVarA3.s(jVarA2, jVarA, j1.f128874c);
                return fVar3.e(new hy.h(i15, jVarA3, l7Var));
            case 15:
                h8 h8Var = (h8) obj2;
                h8Var.show();
                return new h9(h8Var);
            case 16:
                return Boolean.valueOf(s.g(((m6) obj).f88952a, (wd) obj2));
            case 17:
                r0 r0Var = (r0) obj2;
                s5.c.d dVar = (s5.c.d) obj;
                s5.c.a aVar8 = (s5.c.a) dVar.f157149a;
                if (aVar8 instanceof s5.m.b) {
                    s5.m.b bVar2 = (s5.m.b) aVar8;
                    if (bVar2.f157243b == null) {
                        return s5.c.d.a(dVar, new s5.m.b(bVar2.f157242a, r0Var, bVar2.f157244c), 0, 0, 14);
                    }
                }
                if (!(aVar8 instanceof s5.m.a)) {
                    return dVar;
                }
                s5.m.a aVar9 = (s5.m.a) aVar8;
                return aVar9.f157240b == null ? s5.c.d.a(dVar, new s5.m.a(aVar9.f157239a, r0Var, aVar9.f157241c), 0, 0, 14) : dVar;
            case 18:
                return ((gj) obj2).b();
            case 19:
                DateTime dateTime = (DateTime) obj;
                dateTime.getClass();
                DateTime dateTimePlusDays = dateTime.plusDays(1);
                if (dateTimePlusDays.compareTo((ReadableInstant) obj2) <= 0) {
                    return dateTimePlusDays;
                }
                return null;
            case 20:
                k63.a aVar10 = (k63.a) obj;
                aVar10.getClass();
                i63.c<T> cVar3 = ((i63.a) obj2).f91881b;
                if (cVar3 != null && (f94809a = cVar3.getF158591b()) != null) {
                    annotations = f94809a.getAnnotations();
                }
                if (annotations == null) {
                    annotations = j0.f134944a;
                }
                annotations.getClass();
                aVar10.f103213b = annotations;
                return Unit.INSTANCE;
            case 21:
                i63.e eVar = (i63.e) obj2;
                k63.a aVar11 = (k63.a) obj;
                aVar11.getClass();
                x0.f105818a.getClass();
                y1.f117048a.getClass();
                k63.a.b(aVar11, NotificationConstants.KEY_DATA_MIME_TYPE, y1.f117049b);
                k63.a.b(aVar11, "value", k63.k.f("kotlinx.serialization.Polymorphic<" + eVar.f91884a.D() + '>', k63.l.a.f103251a, new k63.e[0]));
                List<? extends Annotation> list5 = eVar.f91885b;
                list5.getClass();
                aVar11.f103213b = list5;
                return Unit.INSTANCE;
            case 22:
                DateTime dateTime2 = (DateTime) obj;
                int i26 = PulseOxActivity.f41055b;
                dateTime2.getClass();
                ((ic1.e) KoinJavaComponent.get$default(ic1.e.class, null, null, 6, null)).e((PulseOxActivity) obj2, dateTime2);
                return Unit.INSTANCE;
            case 23:
                Intent intent = (Intent) obj;
                int i27 = ig2.e.f93438b;
                intent.getClass();
                intent.putExtra("extra_activity_type", (zf2.d) obj2);
                return Unit.INSTANCE;
            case 24:
                yf2.a aVar12 = (yf2.a) obj2;
                Intent intent2 = (Intent) obj;
                int i28 = ig2.e.f93438b;
                intent2.getClass();
                intent2.putExtra("extra_value_estimation_type_key", aVar12 != null ? aVar12.f196898a : null);
                return Unit.INSTANCE;
            case 25:
                ((GarminPayLaunchScreenActivity) obj2).f35306a.error("A error occurs while updating onboarding statuses.", (Throwable) obj);
                return Unit.INSTANCE;
            case 26:
                com.garmin.android.apps.connectmobile.jet_lag.presentation.edit.b bVar3 = (com.garmin.android.apps.connectmobile.jet_lag.presentation.edit.b) obj2;
                com.garmin.android.apps.connectmobile.jet_lag.presentation.edit.b.a aVar13 = com.garmin.android.apps.connectmobile.jet_lag.presentation.edit.b.f37020x;
                int i29 = com.garmin.android.apps.connectmobile.jet_lag.presentation.edit.b.C0663b.f37029a[((g3) obj).f35300a.ordinal()];
                if (i29 == 1) {
                    g22.e.f(bVar3);
                    Bundle arguments = bVar3.getArguments();
                    if (arguments == null || !arguments.getBoolean("EXTRA_DRAWER_SHOWN")) {
                        bVar3.requireActivity().setResult(-1);
                        bVar3.requireActivity().finish();
                    } else {
                        JetLagActivity.a aVar14 = JetLagActivity.f36950d;
                        androidx.fragment.app.m mVarRequireActivity = bVar3.requireActivity();
                        mVarRequireActivity.getClass();
                        aVar14.getClass();
                        bVar3.startActivity(JetLagActivity.a.a(mVarRequireActivity, true));
                        bVar3.requireActivity().finish();
                    }
                } else if (i29 == 2) {
                    g22.e.f(bVar3);
                    g22.e.c(bVar3);
                } else {
                    if (i29 != 3) {
                        u0.r();
                        return null;
                    }
                    g22.e.l(bVar3);
                }
                return Unit.INSTANCE;
            case 27:
                TripDetailsActivity tripDetailsActivity = (TripDetailsActivity) obj2;
                TripDetailsActivity.a aVar15 = TripDetailsActivity.f37000i;
                int i30 = TripDetailsActivity.b.f37009a[((g3) obj).f35300a.ordinal()];
                if (i30 == 1) {
                    tripDetailsActivity.hideProgressOverlay();
                    tripDetailsActivity.setResult(-1);
                    tripDetailsActivity.finish();
                } else if (i30 == 2) {
                    tripDetailsActivity.hideProgressOverlay();
                    tripDetailsActivity.displayFailedMessage();
                } else {
                    if (i30 != 3) {
                        u0.r();
                        return null;
                    }
                    tripDetailsActivity.showProgressOverlay();
                }
                return Unit.INSTANCE;
            case 28:
                Context context = (Context) obj;
                context.getClass();
                CustomBarChart customBarChart = new CustomBarChart(context);
                rz.a aVar16 = new rz.a(customBarChart, new xs1.a(context), new xs1.b(customBarChart), null, null, null, 56, null);
                aVar16.c();
                qz.a.b(aVar16, (p) obj2, null, 6);
                return customBarChart;
            default:
                TrainingPrioritySelectionActivity trainingPrioritySelectionActivity = (TrainingPrioritySelectionActivity) obj2;
                String str = (String) obj;
                TrainingPrioritySelectionActivity.a aVar17 = TrainingPrioritySelectionActivity.f46174b;
                if (s.g(str, "TrainingPrioritySelectionFragment")) {
                    com.garmin.android.apps.connectmobile.traininginitiative.ui.priority.b.f46192e.getClass();
                    trainingPrioritySelectionActivity.da(new com.garmin.android.apps.connectmobile.traininginitiative.ui.priority.b(), str);
                } else if (s.g(str, "TrainingPriorityChangeEventConfirmationFragment")) {
                    com.garmin.android.apps.connectmobile.traininginitiative.ui.priority.a.f46181e.getClass();
                    trainingPrioritySelectionActivity.da(new com.garmin.android.apps.connectmobile.traininginitiative.ui.priority.a(), str);
                }
                return Unit.INSTANCE;
        }
    }
}
