package com.garmin.android.apps.connectmobile.training.atp.create.steps;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import aq.q1;
import c22.j0;
import c22.l3;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.training.atp.create.steps.i;
import i3.e5;
import java.text.DateFormatSymbols;
import java.util.ArrayList;
import java.util.List;
import org.apache.commons.lang3.StringUtils;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p13.y;
import wt1.q;
import xw1.n;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0006"}, d2 = {"Lcom/garmin/android/apps/connectmobile/training/atp/create/steps/i;", "Lcom/garmin/android/apps/connectmobile/training/atp/create/steps/b;", "<init>", "()V", "a", "b", "gcm-training-plans_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class i extends com.garmin.android.apps.connectmobile.training.atp.create.steps.b {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final a f45283r = new a(null);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public zt1.f f45284h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public b f45285i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public b f45286j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public b f45287k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public b f45288l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public b f45289m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public b f45290n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public b f45291o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public b f45292p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public View f45293q;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/garmin/android/apps/connectmobile/training/atp/create/steps/i$b;", "", "Landroid/view/View;", "view", "<init>", "(Landroid/view/View;)V", "gcm-training-plans_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final View f45294a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final TextView f45295b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final TextView f45296c;

        public b(View view2) {
            view2.getClass();
            this.f45294a = view2;
            View viewFindViewById = view2.findViewById(R.id.list_item_label_first);
            viewFindViewById.getClass();
            this.f45295b = (TextView) viewFindViewById;
            View viewFindViewById2 = view2.findViewById(R.id.list_item_label_second);
            viewFindViewById2.getClass();
            this.f45296c = (TextView) viewFindViewById2;
        }

        public final void a(e23.a aVar, String str, int i14) {
            this.f45296c.setText(str);
            TextView textView = this.f45295b;
            textView.setText(i14);
            textView.setTextColor(a7.b.getColor(textView.getContext(), R.color.gcm_text_primary));
            q1 q1Var = new q1(aVar, 1);
            View view2 = this.f45294a;
            view2.setOnClickListener(q1Var);
            view2.setBackgroundResource(R.drawable.gcm_surface_1_selector_background);
        }
    }

    /* JADX WARN: Code duplicated, block: B:33:0x008e  */
    /* JADX WARN: Code duplicated, block: B:35:0x0099  */
    /* JADX WARN: Code duplicated, block: B:38:0x00ae A[LOOP:0: B:36:0x00a8->B:38:0x00ae, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:39:0x00c9  */
    /* JADX WARN: Code duplicated, block: B:41:0x00cc  */
    /* JADX WARN: Code duplicated, block: B:43:0x00d4  */
    /* JADX WARN: Code duplicated, block: B:85:0x01a9  */
    public final void E6(xw1.c cVar) {
        String string;
        String raceTitle;
        fg0.k kVar;
        fg0.k kVar2;
        String strD;
        String string2;
        fg0.k kVar3;
        b bVar;
        DateFormatSymbols dateFormatSymbols;
        List<String> listY;
        ArrayList arrayList;
        String strJoin;
        List<String> listY2;
        cVar.getClass();
        this.f45250c = cVar;
        b bVar2 = this.f45285i;
        String str = "";
        String strF = null;
        if (bVar2 != null) {
            Context context = getContext();
            if (context == null) {
                dateFormatSymbols = new DateFormatSymbols();
                listY = cVar.y();
                if (listY != null) {
                    arrayList = new ArrayList(y.r(listY, 10));
                    for (String str2 : listY) {
                        q.f187120f.getClass();
                        arrayList.add(dateFormatSymbols.getShortWeekdays()[q.a.a(str2).f187134e]);
                    }
                } else {
                    arrayList = null;
                }
                if (arrayList != null || (strJoin = TextUtils.join(", ", arrayList)) == null) {
                    strJoin = "";
                }
            } else {
                List<String> listY3 = cVar.y();
                Integer numValueOf = listY3 != null ? Integer.valueOf(listY3.size()) : null;
                if (numValueOf != null && numValueOf.intValue() == 7) {
                    strJoin = context.getString(R.string.frequency_every_day);
                    strJoin.getClass();
                } else if (numValueOf != null && numValueOf.intValue() == 5) {
                    List<String> listY4 = cVar.y();
                    if (listY4 != null) {
                        q.f187120f.getClass();
                        if (listY4.containsAll(q.a.c())) {
                            strJoin = context.getString(R.string.frequency_weekdays);
                            strJoin.getClass();
                        } else {
                            dateFormatSymbols = new DateFormatSymbols();
                            listY = cVar.y();
                            if (listY != null) {
                                arrayList = new ArrayList(y.r(listY, 10));
                                while (r5.hasNext()) {
                                    q.f187120f.getClass();
                                    arrayList.add(dateFormatSymbols.getShortWeekdays()[q.a.a(str2).f187134e]);
                                }
                            } else {
                                arrayList = null;
                            }
                            if (arrayList != null) {
                                strJoin = "";
                            } else {
                                strJoin = "";
                            }
                        }
                    } else {
                        dateFormatSymbols = new DateFormatSymbols();
                        listY = cVar.y();
                        if (listY != null) {
                            arrayList = new ArrayList(y.r(listY, 10));
                            while (r5.hasNext()) {
                                q.f187120f.getClass();
                                arrayList.add(dateFormatSymbols.getShortWeekdays()[q.a.a(str2).f187134e]);
                            }
                        } else {
                            arrayList = null;
                        }
                        if (arrayList != null) {
                            strJoin = "";
                        } else {
                            strJoin = "";
                        }
                    }
                } else if (numValueOf == null || numValueOf.intValue() != 2 || (listY2 = cVar.y()) == null) {
                    dateFormatSymbols = new DateFormatSymbols();
                    listY = cVar.y();
                    if (listY != null) {
                        arrayList = new ArrayList(y.r(listY, 10));
                        while (r5.hasNext()) {
                            q.f187120f.getClass();
                            arrayList.add(dateFormatSymbols.getShortWeekdays()[q.a.a(str2).f187134e]);
                        }
                    } else {
                        arrayList = null;
                    }
                    if (arrayList != null) {
                        strJoin = "";
                    } else {
                        strJoin = "";
                    }
                } else {
                    q.f187120f.getClass();
                    if (listY2.containsAll(q.a.e())) {
                        strJoin = context.getString(R.string.device_settings_frequency_weekends);
                        strJoin.getClass();
                    } else {
                        dateFormatSymbols = new DateFormatSymbols();
                        listY = cVar.y();
                        if (listY != null) {
                            arrayList = new ArrayList(y.r(listY, 10));
                            while (r5.hasNext()) {
                                q.f187120f.getClass();
                                arrayList.add(dateFormatSymbols.getShortWeekdays()[q.a.a(str2).f187134e]);
                            }
                        } else {
                            arrayList = null;
                        }
                        if (arrayList != null) {
                            strJoin = "";
                        } else {
                            strJoin = "";
                        }
                    }
                }
            }
            final int i14 = 0;
            bVar2.a(new e23.a(this) { // from class: au1.f

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ i f13042b;

                {
                    this.f13042b = this;
                }

                @Override // e23.a
                public final Object invoke() {
                    xw1.c cVarB;
                    String selectedGoal;
                    switch (i14) {
                        case 0:
                            zt1.f fVar = this.f13042b.f45284h;
                            if (fVar != null) {
                                zt1.g gVar = fVar.f206972e;
                                xw1.c cVarB2 = xw1.c.b(gVar.d().f206993a, null, null, null, 0, 0, 0, 0, null, null, 0, 0, null, 33554431);
                                gVar.a(cVarB2);
                                fVar.f206968a.F8(cVarB2);
                            }
                            break;
                        case 1:
                            zt1.f fVar2 = this.f13042b.f45284h;
                            if (fVar2 != null) {
                                zt1.g gVar2 = fVar2.f206972e;
                                xw1.c cVarB3 = xw1.c.b(gVar2.d().f206993a, null, null, null, 0, 0, 0, 0, null, null, 0, 0, null, 33554431);
                                gVar2.a(cVarB3);
                                fVar2.f206968a.r6(cVarB3);
                            }
                            break;
                        case 2:
                            zt1.f fVar3 = this.f13042b.f45284h;
                            if (fVar3 != null) {
                                zt1.d dVar = fVar3.f206968a;
                                zt1.g gVar3 = fVar3.f206972e;
                                xw1.c cVarB4 = xw1.c.b(gVar3.d().f206993a, null, null, null, 0, 0, 0, 0, null, null, 0, 0, null, 33554431);
                                if (cVarB4.D()) {
                                    dVar.B8(com.garmin.android.library.backgroundtaskmanagement.b.c.NO_DATA);
                                } else {
                                    Long selectedWorkoutPlanId = cVarB4.getSelectedWorkoutPlanId();
                                    xw1.h hVar = new xw1.h(null, null, null, null, null, 0, cVarB4.getMaxWeeksPerPlan(), cVarB4.getMaxWorkoutsPerWeek(), cVarB4.getMinWeeksPerPlan(), cVarB4.getMinWorkoutsPerWeek(), 0, 0, null, null, false, null, null, null, selectedWorkoutPlanId, 261183, null);
                                    gVar3.a(cVarB4);
                                    dVar.D7(cVarB4, hVar);
                                }
                            }
                            break;
                        case 3:
                            zt1.f fVar4 = this.f13042b.f45284h;
                            if (fVar4 != null) {
                                fVar4.x();
                            }
                            break;
                        case 4:
                            zt1.f fVar5 = this.f13042b.f45284h;
                            if (fVar5 != null) {
                                fVar5.w();
                            }
                            break;
                        case 5:
                            zt1.f fVar6 = this.f13042b.f45284h;
                            if (fVar6 != null) {
                                zt1.g gVar4 = fVar6.f206972e;
                                xw1.c cVarB5 = xw1.c.b(gVar4.d().f206993a, null, null, null, 0, 0, 0, 0, null, null, 0, 0, null, 33554431);
                                gVar4.a(cVarB5);
                                fVar6.f206968a.A3(cVarB5);
                            }
                            break;
                        case 6:
                            zt1.f fVar7 = this.f13042b.f45284h;
                            if (fVar7 != null) {
                                zt1.g gVar5 = fVar7.f206972e;
                                xw1.c cVarB6 = xw1.c.b(gVar5.d().f206993a, null, null, null, 0, 0, 0, 0, null, null, 0, 0, null, 33554431);
                                gVar5.a(cVarB6);
                                fVar7.f206968a.I6(cVarB6, false);
                            }
                            break;
                        default:
                            zt1.f fVar8 = this.f13042b.f45284h;
                            if (fVar8 != null && (selectedGoal = (cVarB = xw1.c.b(fVar8.f206972e.d().f206993a, null, null, null, 0, 0, 0, 0, null, null, 0, 0, null, 33554431)).getSelectedGoal()) != null) {
                                fVar8.f206968a.G1();
                                fVar8.f206974g.K((int) fVar8.f206969b, selectedGoal, Integer.valueOf(cVarB.getSelectedPaceGoalTime()), fVar8.f206980m);
                            }
                            break;
                    }
                    return Unit.INSTANCE;
                }
            }, strJoin, R.string.lbl_days_available);
        }
        String longRunDay = cVar.getLongRunDay();
        if (longRunDay == null || longRunDay.length() == 0) {
            string = getString(R.string.no_value);
        } else {
            q.a aVar = q.f187120f;
            String longRunDay2 = cVar.getLongRunDay();
            aVar.getClass();
            string = getString(q.a.a(longRunDay2).f187131b);
        }
        string.getClass();
        b bVar3 = this.f45286j;
        if (bVar3 != null) {
            final int i15 = 1;
            bVar3.a(new e23.a(this) { // from class: au1.f

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ i f13042b;

                {
                    this.f13042b = this;
                }

                @Override // e23.a
                public final Object invoke() {
                    xw1.c cVarB;
                    String selectedGoal;
                    switch (i15) {
                        case 0:
                            zt1.f fVar = this.f13042b.f45284h;
                            if (fVar != null) {
                                zt1.g gVar = fVar.f206972e;
                                xw1.c cVarB2 = xw1.c.b(gVar.d().f206993a, null, null, null, 0, 0, 0, 0, null, null, 0, 0, null, 33554431);
                                gVar.a(cVarB2);
                                fVar.f206968a.F8(cVarB2);
                            }
                            break;
                        case 1:
                            zt1.f fVar2 = this.f13042b.f45284h;
                            if (fVar2 != null) {
                                zt1.g gVar2 = fVar2.f206972e;
                                xw1.c cVarB3 = xw1.c.b(gVar2.d().f206993a, null, null, null, 0, 0, 0, 0, null, null, 0, 0, null, 33554431);
                                gVar2.a(cVarB3);
                                fVar2.f206968a.r6(cVarB3);
                            }
                            break;
                        case 2:
                            zt1.f fVar3 = this.f13042b.f45284h;
                            if (fVar3 != null) {
                                zt1.d dVar = fVar3.f206968a;
                                zt1.g gVar3 = fVar3.f206972e;
                                xw1.c cVarB4 = xw1.c.b(gVar3.d().f206993a, null, null, null, 0, 0, 0, 0, null, null, 0, 0, null, 33554431);
                                if (cVarB4.D()) {
                                    dVar.B8(com.garmin.android.library.backgroundtaskmanagement.b.c.NO_DATA);
                                } else {
                                    Long selectedWorkoutPlanId = cVarB4.getSelectedWorkoutPlanId();
                                    xw1.h hVar = new xw1.h(null, null, null, null, null, 0, cVarB4.getMaxWeeksPerPlan(), cVarB4.getMaxWorkoutsPerWeek(), cVarB4.getMinWeeksPerPlan(), cVarB4.getMinWorkoutsPerWeek(), 0, 0, null, null, false, null, null, null, selectedWorkoutPlanId, 261183, null);
                                    gVar3.a(cVarB4);
                                    dVar.D7(cVarB4, hVar);
                                }
                            }
                            break;
                        case 3:
                            zt1.f fVar4 = this.f13042b.f45284h;
                            if (fVar4 != null) {
                                fVar4.x();
                            }
                            break;
                        case 4:
                            zt1.f fVar5 = this.f13042b.f45284h;
                            if (fVar5 != null) {
                                fVar5.w();
                            }
                            break;
                        case 5:
                            zt1.f fVar6 = this.f13042b.f45284h;
                            if (fVar6 != null) {
                                zt1.g gVar4 = fVar6.f206972e;
                                xw1.c cVarB5 = xw1.c.b(gVar4.d().f206993a, null, null, null, 0, 0, 0, 0, null, null, 0, 0, null, 33554431);
                                gVar4.a(cVarB5);
                                fVar6.f206968a.A3(cVarB5);
                            }
                            break;
                        case 6:
                            zt1.f fVar7 = this.f13042b.f45284h;
                            if (fVar7 != null) {
                                zt1.g gVar5 = fVar7.f206972e;
                                xw1.c cVarB6 = xw1.c.b(gVar5.d().f206993a, null, null, null, 0, 0, 0, 0, null, null, 0, 0, null, 33554431);
                                gVar5.a(cVarB6);
                                fVar7.f206968a.I6(cVarB6, false);
                            }
                            break;
                        default:
                            zt1.f fVar8 = this.f13042b.f45284h;
                            if (fVar8 != null && (selectedGoal = (cVarB = xw1.c.b(fVar8.f206972e.d().f206993a, null, null, null, 0, 0, 0, 0, null, null, 0, 0, null, 33554431)).getSelectedGoal()) != null) {
                                fVar8.f206968a.G1();
                                fVar8.f206974g.K((int) fVar8.f206969b, selectedGoal, Integer.valueOf(cVarB.getSelectedPaceGoalTime()), fVar8.f206980m);
                            }
                            break;
                    }
                    return Unit.INSTANCE;
                }
            }, string, R.string.atp_lbl_long_run_day);
        }
        Integer selectedWorkoutsPerWeek = cVar.getSelectedWorkoutsPerWeek();
        String strValueOf = selectedWorkoutsPerWeek != null ? String.valueOf(selectedWorkoutsPerWeek.intValue()) : null;
        b bVar4 = this.f45287k;
        if (bVar4 != null) {
            final int i16 = 2;
            bVar4.a(new e23.a(this) { // from class: au1.f

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ i f13042b;

                {
                    this.f13042b = this;
                }

                @Override // e23.a
                public final Object invoke() {
                    xw1.c cVarB;
                    String selectedGoal;
                    switch (i16) {
                        case 0:
                            zt1.f fVar = this.f13042b.f45284h;
                            if (fVar != null) {
                                zt1.g gVar = fVar.f206972e;
                                xw1.c cVarB2 = xw1.c.b(gVar.d().f206993a, null, null, null, 0, 0, 0, 0, null, null, 0, 0, null, 33554431);
                                gVar.a(cVarB2);
                                fVar.f206968a.F8(cVarB2);
                            }
                            break;
                        case 1:
                            zt1.f fVar2 = this.f13042b.f45284h;
                            if (fVar2 != null) {
                                zt1.g gVar2 = fVar2.f206972e;
                                xw1.c cVarB3 = xw1.c.b(gVar2.d().f206993a, null, null, null, 0, 0, 0, 0, null, null, 0, 0, null, 33554431);
                                gVar2.a(cVarB3);
                                fVar2.f206968a.r6(cVarB3);
                            }
                            break;
                        case 2:
                            zt1.f fVar3 = this.f13042b.f45284h;
                            if (fVar3 != null) {
                                zt1.d dVar = fVar3.f206968a;
                                zt1.g gVar3 = fVar3.f206972e;
                                xw1.c cVarB4 = xw1.c.b(gVar3.d().f206993a, null, null, null, 0, 0, 0, 0, null, null, 0, 0, null, 33554431);
                                if (cVarB4.D()) {
                                    dVar.B8(com.garmin.android.library.backgroundtaskmanagement.b.c.NO_DATA);
                                } else {
                                    Long selectedWorkoutPlanId = cVarB4.getSelectedWorkoutPlanId();
                                    xw1.h hVar = new xw1.h(null, null, null, null, null, 0, cVarB4.getMaxWeeksPerPlan(), cVarB4.getMaxWorkoutsPerWeek(), cVarB4.getMinWeeksPerPlan(), cVarB4.getMinWorkoutsPerWeek(), 0, 0, null, null, false, null, null, null, selectedWorkoutPlanId, 261183, null);
                                    gVar3.a(cVarB4);
                                    dVar.D7(cVarB4, hVar);
                                }
                            }
                            break;
                        case 3:
                            zt1.f fVar4 = this.f13042b.f45284h;
                            if (fVar4 != null) {
                                fVar4.x();
                            }
                            break;
                        case 4:
                            zt1.f fVar5 = this.f13042b.f45284h;
                            if (fVar5 != null) {
                                fVar5.w();
                            }
                            break;
                        case 5:
                            zt1.f fVar6 = this.f13042b.f45284h;
                            if (fVar6 != null) {
                                zt1.g gVar4 = fVar6.f206972e;
                                xw1.c cVarB5 = xw1.c.b(gVar4.d().f206993a, null, null, null, 0, 0, 0, 0, null, null, 0, 0, null, 33554431);
                                gVar4.a(cVarB5);
                                fVar6.f206968a.A3(cVarB5);
                            }
                            break;
                        case 6:
                            zt1.f fVar7 = this.f13042b.f45284h;
                            if (fVar7 != null) {
                                zt1.g gVar5 = fVar7.f206972e;
                                xw1.c cVarB6 = xw1.c.b(gVar5.d().f206993a, null, null, null, 0, 0, 0, 0, null, null, 0, 0, null, 33554431);
                                gVar5.a(cVarB6);
                                fVar7.f206968a.I6(cVarB6, false);
                            }
                            break;
                        default:
                            zt1.f fVar8 = this.f13042b.f45284h;
                            if (fVar8 != null && (selectedGoal = (cVarB = xw1.c.b(fVar8.f206972e.d().f206993a, null, null, null, 0, 0, 0, 0, null, null, 0, 0, null, 33554431)).getSelectedGoal()) != null) {
                                fVar8.f206968a.G1();
                                fVar8.f206974g.K((int) fVar8.f206969b, selectedGoal, Integer.valueOf(cVarB.getSelectedPaceGoalTime()), fVar8.f206980m);
                            }
                            break;
                    }
                    return Unit.INSTANCE;
                }
            }, strValueOf, R.string.lbl_workouts_per_week_title);
        }
        if (cVar.D() && (bVar = this.f45287k) != null) {
            TextView textView = bVar.f45296c;
            textView.getClass();
            textView.setTextColor(a7.b.getColor(textView.getContext(), R.color.gcm_text_secondary));
            View view2 = bVar.f45294a;
            view2.setOnClickListener(null);
            v22.e.g(R.color.gcm_list_item_background, view2);
        }
        n tiEventDTO = cVar.getTiEventDTO();
        if ((tiEventDTO != null ? tiEventDTO.f192426b : null) != null) {
            n tiEventDTO2 = cVar.getTiEventDTO();
            if (tiEventDTO2 != null && (kVar3 = tiEventDTO2.f192426b) != null) {
                strF = kVar3.F();
            }
        } else {
            xw1.k selectedRace = cVar.getSelectedRace();
            if (selectedRace == null) {
                strF = "";
            } else {
                String strB = j0.b(j0.K(selectedRace.getRaceDate(), "yyyy-MM-dd"), "EEEE, MMM d", null);
                if (strB != null) {
                    raceTitle = e5.g(selectedRace.getRaceTitle(), " - ", strB);
                } else {
                    raceTitle = selectedRace.getRaceTitle();
                    if (raceTitle == null) {
                        strF = "";
                    }
                }
                strF = raceTitle;
            }
        }
        b bVar5 = this.f45288l;
        if (bVar5 != null) {
            final int i17 = 3;
            bVar5.a(new e23.a(this) { // from class: au1.f

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ i f13042b;

                {
                    this.f13042b = this;
                }

                @Override // e23.a
                public final Object invoke() {
                    xw1.c cVarB;
                    String selectedGoal;
                    switch (i17) {
                        case 0:
                            zt1.f fVar = this.f13042b.f45284h;
                            if (fVar != null) {
                                zt1.g gVar = fVar.f206972e;
                                xw1.c cVarB2 = xw1.c.b(gVar.d().f206993a, null, null, null, 0, 0, 0, 0, null, null, 0, 0, null, 33554431);
                                gVar.a(cVarB2);
                                fVar.f206968a.F8(cVarB2);
                            }
                            break;
                        case 1:
                            zt1.f fVar2 = this.f13042b.f45284h;
                            if (fVar2 != null) {
                                zt1.g gVar2 = fVar2.f206972e;
                                xw1.c cVarB3 = xw1.c.b(gVar2.d().f206993a, null, null, null, 0, 0, 0, 0, null, null, 0, 0, null, 33554431);
                                gVar2.a(cVarB3);
                                fVar2.f206968a.r6(cVarB3);
                            }
                            break;
                        case 2:
                            zt1.f fVar3 = this.f13042b.f45284h;
                            if (fVar3 != null) {
                                zt1.d dVar = fVar3.f206968a;
                                zt1.g gVar3 = fVar3.f206972e;
                                xw1.c cVarB4 = xw1.c.b(gVar3.d().f206993a, null, null, null, 0, 0, 0, 0, null, null, 0, 0, null, 33554431);
                                if (cVarB4.D()) {
                                    dVar.B8(com.garmin.android.library.backgroundtaskmanagement.b.c.NO_DATA);
                                } else {
                                    Long selectedWorkoutPlanId = cVarB4.getSelectedWorkoutPlanId();
                                    xw1.h hVar = new xw1.h(null, null, null, null, null, 0, cVarB4.getMaxWeeksPerPlan(), cVarB4.getMaxWorkoutsPerWeek(), cVarB4.getMinWeeksPerPlan(), cVarB4.getMinWorkoutsPerWeek(), 0, 0, null, null, false, null, null, null, selectedWorkoutPlanId, 261183, null);
                                    gVar3.a(cVarB4);
                                    dVar.D7(cVarB4, hVar);
                                }
                            }
                            break;
                        case 3:
                            zt1.f fVar4 = this.f13042b.f45284h;
                            if (fVar4 != null) {
                                fVar4.x();
                            }
                            break;
                        case 4:
                            zt1.f fVar5 = this.f13042b.f45284h;
                            if (fVar5 != null) {
                                fVar5.w();
                            }
                            break;
                        case 5:
                            zt1.f fVar6 = this.f13042b.f45284h;
                            if (fVar6 != null) {
                                zt1.g gVar4 = fVar6.f206972e;
                                xw1.c cVarB5 = xw1.c.b(gVar4.d().f206993a, null, null, null, 0, 0, 0, 0, null, null, 0, 0, null, 33554431);
                                gVar4.a(cVarB5);
                                fVar6.f206968a.A3(cVarB5);
                            }
                            break;
                        case 6:
                            zt1.f fVar7 = this.f13042b.f45284h;
                            if (fVar7 != null) {
                                zt1.g gVar5 = fVar7.f206972e;
                                xw1.c cVarB6 = xw1.c.b(gVar5.d().f206993a, null, null, null, 0, 0, 0, 0, null, null, 0, 0, null, 33554431);
                                gVar5.a(cVarB6);
                                fVar7.f206968a.I6(cVarB6, false);
                            }
                            break;
                        default:
                            zt1.f fVar8 = this.f13042b.f45284h;
                            if (fVar8 != null && (selectedGoal = (cVarB = xw1.c.b(fVar8.f206972e.d().f206993a, null, null, null, 0, 0, 0, 0, null, null, 0, 0, null, 33554431)).getSelectedGoal()) != null) {
                                fVar8.f206968a.G1();
                                fVar8.f206974g.K((int) fVar8.f206969b, selectedGoal, Integer.valueOf(cVarB.getSelectedPaceGoalTime()), fVar8.f206980m);
                            }
                            break;
                    }
                    return Unit.INSTANCE;
                }
            }, strF, R.string.lbl_race);
        }
        b bVar6 = this.f45289m;
        if (bVar6 != null) {
            final int i18 = 4;
            bVar6.a(new e23.a(this) { // from class: au1.f

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ i f13042b;

                {
                    this.f13042b = this;
                }

                @Override // e23.a
                public final Object invoke() {
                    xw1.c cVarB;
                    String selectedGoal;
                    switch (i18) {
                        case 0:
                            zt1.f fVar = this.f13042b.f45284h;
                            if (fVar != null) {
                                zt1.g gVar = fVar.f206972e;
                                xw1.c cVarB2 = xw1.c.b(gVar.d().f206993a, null, null, null, 0, 0, 0, 0, null, null, 0, 0, null, 33554431);
                                gVar.a(cVarB2);
                                fVar.f206968a.F8(cVarB2);
                            }
                            break;
                        case 1:
                            zt1.f fVar2 = this.f13042b.f45284h;
                            if (fVar2 != null) {
                                zt1.g gVar2 = fVar2.f206972e;
                                xw1.c cVarB3 = xw1.c.b(gVar2.d().f206993a, null, null, null, 0, 0, 0, 0, null, null, 0, 0, null, 33554431);
                                gVar2.a(cVarB3);
                                fVar2.f206968a.r6(cVarB3);
                            }
                            break;
                        case 2:
                            zt1.f fVar3 = this.f13042b.f45284h;
                            if (fVar3 != null) {
                                zt1.d dVar = fVar3.f206968a;
                                zt1.g gVar3 = fVar3.f206972e;
                                xw1.c cVarB4 = xw1.c.b(gVar3.d().f206993a, null, null, null, 0, 0, 0, 0, null, null, 0, 0, null, 33554431);
                                if (cVarB4.D()) {
                                    dVar.B8(com.garmin.android.library.backgroundtaskmanagement.b.c.NO_DATA);
                                } else {
                                    Long selectedWorkoutPlanId = cVarB4.getSelectedWorkoutPlanId();
                                    xw1.h hVar = new xw1.h(null, null, null, null, null, 0, cVarB4.getMaxWeeksPerPlan(), cVarB4.getMaxWorkoutsPerWeek(), cVarB4.getMinWeeksPerPlan(), cVarB4.getMinWorkoutsPerWeek(), 0, 0, null, null, false, null, null, null, selectedWorkoutPlanId, 261183, null);
                                    gVar3.a(cVarB4);
                                    dVar.D7(cVarB4, hVar);
                                }
                            }
                            break;
                        case 3:
                            zt1.f fVar4 = this.f13042b.f45284h;
                            if (fVar4 != null) {
                                fVar4.x();
                            }
                            break;
                        case 4:
                            zt1.f fVar5 = this.f13042b.f45284h;
                            if (fVar5 != null) {
                                fVar5.w();
                            }
                            break;
                        case 5:
                            zt1.f fVar6 = this.f13042b.f45284h;
                            if (fVar6 != null) {
                                zt1.g gVar4 = fVar6.f206972e;
                                xw1.c cVarB5 = xw1.c.b(gVar4.d().f206993a, null, null, null, 0, 0, 0, 0, null, null, 0, 0, null, 33554431);
                                gVar4.a(cVarB5);
                                fVar6.f206968a.A3(cVarB5);
                            }
                            break;
                        case 6:
                            zt1.f fVar7 = this.f13042b.f45284h;
                            if (fVar7 != null) {
                                zt1.g gVar5 = fVar7.f206972e;
                                xw1.c cVarB6 = xw1.c.b(gVar5.d().f206993a, null, null, null, 0, 0, 0, 0, null, null, 0, 0, null, 33554431);
                                gVar5.a(cVarB6);
                                fVar7.f206968a.I6(cVarB6, false);
                            }
                            break;
                        default:
                            zt1.f fVar8 = this.f13042b.f45284h;
                            if (fVar8 != null && (selectedGoal = (cVarB = xw1.c.b(fVar8.f206972e.d().f206993a, null, null, null, 0, 0, 0, 0, null, null, 0, 0, null, 33554431)).getSelectedGoal()) != null) {
                                fVar8.f206968a.G1();
                                fVar8.f206974g.K((int) fVar8.f206969b, selectedGoal, Integer.valueOf(cVarB.getSelectedPaceGoalTime()), fVar8.f206980m);
                            }
                            break;
                    }
                    return Unit.INSTANCE;
                }
            }, cVar.getCoachName(), R.string.lbl_personal_coach);
        }
        b bVar7 = this.f45290n;
        if (bVar7 != null) {
            final int i19 = 5;
            bVar7.a(new e23.a(this) { // from class: au1.f

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ i f13042b;

                {
                    this.f13042b = this;
                }

                @Override // e23.a
                public final Object invoke() {
                    xw1.c cVarB;
                    String selectedGoal;
                    switch (i19) {
                        case 0:
                            zt1.f fVar = this.f13042b.f45284h;
                            if (fVar != null) {
                                zt1.g gVar = fVar.f206972e;
                                xw1.c cVarB2 = xw1.c.b(gVar.d().f206993a, null, null, null, 0, 0, 0, 0, null, null, 0, 0, null, 33554431);
                                gVar.a(cVarB2);
                                fVar.f206968a.F8(cVarB2);
                            }
                            break;
                        case 1:
                            zt1.f fVar2 = this.f13042b.f45284h;
                            if (fVar2 != null) {
                                zt1.g gVar2 = fVar2.f206972e;
                                xw1.c cVarB3 = xw1.c.b(gVar2.d().f206993a, null, null, null, 0, 0, 0, 0, null, null, 0, 0, null, 33554431);
                                gVar2.a(cVarB3);
                                fVar2.f206968a.r6(cVarB3);
                            }
                            break;
                        case 2:
                            zt1.f fVar3 = this.f13042b.f45284h;
                            if (fVar3 != null) {
                                zt1.d dVar = fVar3.f206968a;
                                zt1.g gVar3 = fVar3.f206972e;
                                xw1.c cVarB4 = xw1.c.b(gVar3.d().f206993a, null, null, null, 0, 0, 0, 0, null, null, 0, 0, null, 33554431);
                                if (cVarB4.D()) {
                                    dVar.B8(com.garmin.android.library.backgroundtaskmanagement.b.c.NO_DATA);
                                } else {
                                    Long selectedWorkoutPlanId = cVarB4.getSelectedWorkoutPlanId();
                                    xw1.h hVar = new xw1.h(null, null, null, null, null, 0, cVarB4.getMaxWeeksPerPlan(), cVarB4.getMaxWorkoutsPerWeek(), cVarB4.getMinWeeksPerPlan(), cVarB4.getMinWorkoutsPerWeek(), 0, 0, null, null, false, null, null, null, selectedWorkoutPlanId, 261183, null);
                                    gVar3.a(cVarB4);
                                    dVar.D7(cVarB4, hVar);
                                }
                            }
                            break;
                        case 3:
                            zt1.f fVar4 = this.f13042b.f45284h;
                            if (fVar4 != null) {
                                fVar4.x();
                            }
                            break;
                        case 4:
                            zt1.f fVar5 = this.f13042b.f45284h;
                            if (fVar5 != null) {
                                fVar5.w();
                            }
                            break;
                        case 5:
                            zt1.f fVar6 = this.f13042b.f45284h;
                            if (fVar6 != null) {
                                zt1.g gVar4 = fVar6.f206972e;
                                xw1.c cVarB5 = xw1.c.b(gVar4.d().f206993a, null, null, null, 0, 0, 0, 0, null, null, 0, 0, null, 33554431);
                                gVar4.a(cVarB5);
                                fVar6.f206968a.A3(cVarB5);
                            }
                            break;
                        case 6:
                            zt1.f fVar7 = this.f13042b.f45284h;
                            if (fVar7 != null) {
                                zt1.g gVar5 = fVar7.f206972e;
                                xw1.c cVarB6 = xw1.c.b(gVar5.d().f206993a, null, null, null, 0, 0, 0, 0, null, null, 0, 0, null, 33554431);
                                gVar5.a(cVarB6);
                                fVar7.f206968a.I6(cVarB6, false);
                            }
                            break;
                        default:
                            zt1.f fVar8 = this.f13042b.f45284h;
                            if (fVar8 != null && (selectedGoal = (cVarB = xw1.c.b(fVar8.f206972e.d().f206993a, null, null, null, 0, 0, 0, 0, null, null, 0, 0, null, 33554431)).getSelectedGoal()) != null) {
                                fVar8.f206968a.G1();
                                fVar8.f206974g.K((int) fVar8.f206969b, selectedGoal, Integer.valueOf(cVarB.getSelectedPaceGoalTime()), fVar8.f206980m);
                            }
                            break;
                    }
                    return Unit.INSTANCE;
                }
            }, cVar.getLocalizedGoal(), R.string.lbl_goal);
        }
        boolean zF = cVar.F();
        b bVar8 = this.f45291o;
        if (zF) {
            if (bVar8 != null) {
                bVar8.f45294a.setVisibility(0);
            }
            b bVar9 = this.f45291o;
            if (bVar9 != null) {
                Context context2 = getContext();
                if (context2 != null) {
                    long selectedPaceGoalTime = cVar.getSelectedPaceGoalTime();
                    l3.f23124b.getClass();
                    String strB1 = l3.a.b1(selectedPaceGoalTime * 1000);
                    String string3 = context2.getString(R.string.common_min_abbreviated_without_period);
                    string2 = context2.getString(R.string.lbl_run_in, zl.a.c(string3, strB1, StringUtils.SPACE, string3));
                    string2.getClass();
                } else {
                    string2 = "";
                }
                final int i24 = 6;
                bVar9.a(new e23.a(this) { // from class: au1.f

                    /* JADX INFO: renamed from: b, reason: collision with root package name */
                    public final /* synthetic */ i f13042b;

                    {
                        this.f13042b = this;
                    }

                    @Override // e23.a
                    public final Object invoke() {
                        xw1.c cVarB;
                        String selectedGoal;
                        switch (i24) {
                            case 0:
                                zt1.f fVar = this.f13042b.f45284h;
                                if (fVar != null) {
                                    zt1.g gVar = fVar.f206972e;
                                    xw1.c cVarB2 = xw1.c.b(gVar.d().f206993a, null, null, null, 0, 0, 0, 0, null, null, 0, 0, null, 33554431);
                                    gVar.a(cVarB2);
                                    fVar.f206968a.F8(cVarB2);
                                }
                                break;
                            case 1:
                                zt1.f fVar2 = this.f13042b.f45284h;
                                if (fVar2 != null) {
                                    zt1.g gVar2 = fVar2.f206972e;
                                    xw1.c cVarB3 = xw1.c.b(gVar2.d().f206993a, null, null, null, 0, 0, 0, 0, null, null, 0, 0, null, 33554431);
                                    gVar2.a(cVarB3);
                                    fVar2.f206968a.r6(cVarB3);
                                }
                                break;
                            case 2:
                                zt1.f fVar3 = this.f13042b.f45284h;
                                if (fVar3 != null) {
                                    zt1.d dVar = fVar3.f206968a;
                                    zt1.g gVar3 = fVar3.f206972e;
                                    xw1.c cVarB4 = xw1.c.b(gVar3.d().f206993a, null, null, null, 0, 0, 0, 0, null, null, 0, 0, null, 33554431);
                                    if (cVarB4.D()) {
                                        dVar.B8(com.garmin.android.library.backgroundtaskmanagement.b.c.NO_DATA);
                                    } else {
                                        Long selectedWorkoutPlanId = cVarB4.getSelectedWorkoutPlanId();
                                        xw1.h hVar = new xw1.h(null, null, null, null, null, 0, cVarB4.getMaxWeeksPerPlan(), cVarB4.getMaxWorkoutsPerWeek(), cVarB4.getMinWeeksPerPlan(), cVarB4.getMinWorkoutsPerWeek(), 0, 0, null, null, false, null, null, null, selectedWorkoutPlanId, 261183, null);
                                        gVar3.a(cVarB4);
                                        dVar.D7(cVarB4, hVar);
                                    }
                                }
                                break;
                            case 3:
                                zt1.f fVar4 = this.f13042b.f45284h;
                                if (fVar4 != null) {
                                    fVar4.x();
                                }
                                break;
                            case 4:
                                zt1.f fVar5 = this.f13042b.f45284h;
                                if (fVar5 != null) {
                                    fVar5.w();
                                }
                                break;
                            case 5:
                                zt1.f fVar6 = this.f13042b.f45284h;
                                if (fVar6 != null) {
                                    zt1.g gVar4 = fVar6.f206972e;
                                    xw1.c cVarB5 = xw1.c.b(gVar4.d().f206993a, null, null, null, 0, 0, 0, 0, null, null, 0, 0, null, 33554431);
                                    gVar4.a(cVarB5);
                                    fVar6.f206968a.A3(cVarB5);
                                }
                                break;
                            case 6:
                                zt1.f fVar7 = this.f13042b.f45284h;
                                if (fVar7 != null) {
                                    zt1.g gVar5 = fVar7.f206972e;
                                    xw1.c cVarB6 = xw1.c.b(gVar5.d().f206993a, null, null, null, 0, 0, 0, 0, null, null, 0, 0, null, 33554431);
                                    gVar5.a(cVarB6);
                                    fVar7.f206968a.I6(cVarB6, false);
                                }
                                break;
                            default:
                                zt1.f fVar8 = this.f13042b.f45284h;
                                if (fVar8 != null && (selectedGoal = (cVarB = xw1.c.b(fVar8.f206972e.d().f206993a, null, null, null, 0, 0, 0, 0, null, null, 0, 0, null, 33554431)).getSelectedGoal()) != null) {
                                    fVar8.f206968a.G1();
                                    fVar8.f206974g.K((int) fVar8.f206969b, selectedGoal, Integer.valueOf(cVarB.getSelectedPaceGoalTime()), fVar8.f206980m);
                                }
                                break;
                        }
                        return Unit.INSTANCE;
                    }
                }, string2, R.string.lbl_time_goal);
            }
        } else if (bVar8 != null) {
            bVar8.f45294a.setVisibility(8);
        }
        n tiEventDTO3 = cVar.getTiEventDTO();
        if (tiEventDTO3 == null || (kVar = tiEventDTO3.f192426b) == null || !kVar.n0()) {
            b bVar10 = this.f45292p;
            if (bVar10 != null) {
                bVar10.f45294a.setVisibility(8);
                return;
            }
            return;
        }
        b bVar11 = this.f45292p;
        if (bVar11 != null) {
            bVar11.f45294a.setVisibility(0);
            n tiEventDTO4 = cVar.getTiEventDTO();
            if (tiEventDTO4 != null && (kVar2 = tiEventDTO4.f192426b) != null && (strD = kVar2.D()) != null) {
                str = strD;
            }
            final int i25 = 7;
            bVar11.a(new e23.a(this) { // from class: au1.f

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ i f13042b;

                {
                    this.f13042b = this;
                }

                @Override // e23.a
                public final Object invoke() {
                    xw1.c cVarB;
                    String selectedGoal;
                    switch (i25) {
                        case 0:
                            zt1.f fVar = this.f13042b.f45284h;
                            if (fVar != null) {
                                zt1.g gVar = fVar.f206972e;
                                xw1.c cVarB2 = xw1.c.b(gVar.d().f206993a, null, null, null, 0, 0, 0, 0, null, null, 0, 0, null, 33554431);
                                gVar.a(cVarB2);
                                fVar.f206968a.F8(cVarB2);
                            }
                            break;
                        case 1:
                            zt1.f fVar2 = this.f13042b.f45284h;
                            if (fVar2 != null) {
                                zt1.g gVar2 = fVar2.f206972e;
                                xw1.c cVarB3 = xw1.c.b(gVar2.d().f206993a, null, null, null, 0, 0, 0, 0, null, null, 0, 0, null, 33554431);
                                gVar2.a(cVarB3);
                                fVar2.f206968a.r6(cVarB3);
                            }
                            break;
                        case 2:
                            zt1.f fVar3 = this.f13042b.f45284h;
                            if (fVar3 != null) {
                                zt1.d dVar = fVar3.f206968a;
                                zt1.g gVar3 = fVar3.f206972e;
                                xw1.c cVarB4 = xw1.c.b(gVar3.d().f206993a, null, null, null, 0, 0, 0, 0, null, null, 0, 0, null, 33554431);
                                if (cVarB4.D()) {
                                    dVar.B8(com.garmin.android.library.backgroundtaskmanagement.b.c.NO_DATA);
                                } else {
                                    Long selectedWorkoutPlanId = cVarB4.getSelectedWorkoutPlanId();
                                    xw1.h hVar = new xw1.h(null, null, null, null, null, 0, cVarB4.getMaxWeeksPerPlan(), cVarB4.getMaxWorkoutsPerWeek(), cVarB4.getMinWeeksPerPlan(), cVarB4.getMinWorkoutsPerWeek(), 0, 0, null, null, false, null, null, null, selectedWorkoutPlanId, 261183, null);
                                    gVar3.a(cVarB4);
                                    dVar.D7(cVarB4, hVar);
                                }
                            }
                            break;
                        case 3:
                            zt1.f fVar4 = this.f13042b.f45284h;
                            if (fVar4 != null) {
                                fVar4.x();
                            }
                            break;
                        case 4:
                            zt1.f fVar5 = this.f13042b.f45284h;
                            if (fVar5 != null) {
                                fVar5.w();
                            }
                            break;
                        case 5:
                            zt1.f fVar6 = this.f13042b.f45284h;
                            if (fVar6 != null) {
                                zt1.g gVar4 = fVar6.f206972e;
                                xw1.c cVarB5 = xw1.c.b(gVar4.d().f206993a, null, null, null, 0, 0, 0, 0, null, null, 0, 0, null, 33554431);
                                gVar4.a(cVarB5);
                                fVar6.f206968a.A3(cVarB5);
                            }
                            break;
                        case 6:
                            zt1.f fVar7 = this.f13042b.f45284h;
                            if (fVar7 != null) {
                                zt1.g gVar5 = fVar7.f206972e;
                                xw1.c cVarB6 = xw1.c.b(gVar5.d().f206993a, null, null, null, 0, 0, 0, 0, null, null, 0, 0, null, 33554431);
                                gVar5.a(cVarB6);
                                fVar7.f206968a.I6(cVarB6, false);
                            }
                            break;
                        default:
                            zt1.f fVar8 = this.f13042b.f45284h;
                            if (fVar8 != null && (selectedGoal = (cVarB = xw1.c.b(fVar8.f206972e.d().f206993a, null, null, null, 0, 0, 0, 0, null, null, 0, 0, null, 33554431)).getSelectedGoal()) != null) {
                                fVar8.f206968a.G1();
                                fVar8.f206974g.K((int) fVar8.f206969b, selectedGoal, Integer.valueOf(cVarB.getSelectedPaceGoalTime()), fVar8.f206980m);
                            }
                            break;
                    }
                    return Unit.INSTANCE;
                }
            }, str, R.string.txt_date);
        }
    }

    @Override // yt1.e
    public final int V5() {
        return R.string.lbl_edit_plan_settings;
    }

    @Override // com.garmin.android.apps.connectmobile.training.atp.create.steps.b
    public final String b5() {
        return "ReviewEditInformationFragment";
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        layoutInflater.getClass();
        return layoutInflater.inflate(R.layout.gcm4_training_edit_review_step, viewGroup, false);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        zt1.f fVar = this.f45284h;
        if (fVar != null) {
            fVar.f206968a.i2();
        }
    }

    @Override // com.garmin.android.apps.connectmobile.training.atp.create.steps.b, androidx.fragment.app.Fragment
    public final void onViewCreated(View view2, Bundle bundle) {
        view2.getClass();
        super.onViewCreated(view2, bundle);
        View viewFindViewById = view2.findViewById(R.id.workout_days_item);
        viewFindViewById.getClass();
        this.f45285i = new b(viewFindViewById);
        View viewFindViewById2 = view2.findViewById(R.id.long_run_day_item);
        viewFindViewById2.getClass();
        this.f45286j = new b(viewFindViewById2);
        View viewFindViewById3 = view2.findViewById(R.id.workout_per_week);
        viewFindViewById3.getClass();
        this.f45287k = new b(viewFindViewById3);
        View viewFindViewById4 = view2.findViewById(R.id.race_item);
        viewFindViewById4.getClass();
        this.f45288l = new b(viewFindViewById4);
        View viewFindViewById5 = view2.findViewById(R.id.personal_coach_item);
        viewFindViewById5.getClass();
        this.f45289m = new b(viewFindViewById5);
        View viewFindViewById6 = view2.findViewById(R.id.k5_goal_item);
        viewFindViewById6.getClass();
        this.f45290n = new b(viewFindViewById6);
        View viewFindViewById7 = view2.findViewById(R.id.time_goal_item);
        viewFindViewById7.getClass();
        this.f45291o = new b(viewFindViewById7);
        View viewFindViewById8 = view2.findViewById(R.id.date_item);
        viewFindViewById8.getClass();
        this.f45292p = new b(viewFindViewById8);
        View viewFindViewById9 = view2.findViewById(R.id.bottom_divider);
        viewFindViewById9.getClass();
        viewFindViewById9.setVisibility(8);
        this.f45293q = viewFindViewById9;
        E6(w6());
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/garmin/android/apps/connectmobile/training/atp/create/steps/i$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "gcm-training-plans_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
