package com.garmin.android.apps.connectmobile.training.atp.dashboard;

import android.view.View;
import androidx.fragment.app.v;
import androidx.lifecycle.v1;
import androidx.lifecycle.y0;
import c22.j0;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.calendar.model.CalendarItemDTO;
import com.garmin.android.apps.connectmobile.calendar.presentation.infiniteviewpager.InfiniteViewPager;
import com.garmin.android.apps.connectmobile.q1;
import com.google.android.exoplayer2.analytics.q;
import com.roomorama.caldroid.CaldroidListener;
import cu1.t;
import ey.f;
import ey.h;
import g22.k;
import java.util.ArrayList;
import java.util.Date;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.TimeZone;
import org.joda.time.DateTime;
import org.joda.time.format.DateTimeFormatter;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/garmin/android/apps/connectmobile/training/atp/dashboard/b;", "Lcom/roomorama/caldroid/CaldroidListener;", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class b extends CaldroidListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ a f45405a;

    public b(a aVar) {
        this.f45405a = aVar;
    }

    @Override // com.roomorama.caldroid.CaldroidListener
    public final void onChangeMonth(int i14, int i15) {
        a.C0872a c0872a = a.L0;
        a aVar = this.f45405a;
        InfiniteViewPager infiniteViewPager = aVar.f31109d;
        if (infiniteViewPager != null) {
            infiniteViewPager.setSixWeeksInCalendar(false);
        }
        com.garmin.android.apps.connectmobile.calendar.presentation.d dVarU6 = aVar.u6(aVar.f31113h, aVar.f31114i);
        if (dVarU6 != null) {
            dVarU6.l();
        }
        DateTime dateTimeWithMonthOfYear = DateTime.now().withYear(i15).withMonthOfYear(i14);
        boolean zIsBefore = dateTimeWithMonthOfYear.dayOfMonth().withMaximumValue().isBefore(DateTime.now());
        boolean zIsAfter = dateTimeWithMonthOfYear.dayOfMonth().withMinimumValue().isAfter(aVar.P);
        if (zIsBefore || zIsAfter) {
            return;
        }
        com.garmin.android.apps.connectmobile.calendar.presentation.d dVarU7 = aVar.u6(aVar.f31113h, aVar.f31114i);
        if (dVarU7 != null ? dVarU7.i(null) : false) {
            return;
        }
        if (dVarU7 != null) {
            dVarU7.d();
        }
        if (dVarU7 != null) {
            dVarU7.notifyDataSetChanged();
        }
        aVar.Y = null;
        h hVar = (h) aVar.K0.getValue();
        y0 y0Var = new y0();
        ge1.b.T(v1.a(hVar), null, null, new f(y0Var, hVar, dateTimeWithMonthOfYear, false, null), 3);
        y0Var.f(aVar, new t(aVar, dateTimeWithMonthOfYear));
    }

    /* JADX WARN: Code duplicated, block: B:40:0x00af  */
    @Override // com.roomorama.caldroid.CaldroidListener
    public final void onSelectDate(Date date, View view2) {
        CalendarItemDTO calendarItemDTO;
        date.getClass();
        view2.getClass();
        DateTime dateTime = new DateTime(date);
        int monthOfYear = dateTime.getMonthOfYear();
        int year = dateTime.getYear();
        a.C0872a c0872a = a.L0;
        a aVar = this.f45405a;
        com.garmin.android.apps.connectmobile.calendar.presentation.d dVarU6 = aVar.u6(monthOfYear, year);
        DateTime dateTime2 = aVar.I;
        if (dateTime2 != null ? k.f(dateTime2, dateTime) : false) {
            a.b bVar = aVar.J0;
            if (bVar != null) {
                bVar.P8();
            }
            CalendarItemDTO calendarItemDTO2 = aVar.f45397k0;
            if (calendarItemDTO2 != null) {
                calendarItemDTO2.H(dateTime);
            }
            if (dVarU6 != null) {
                com.garmin.android.apps.connectmobile.calendar.presentation.d.f31148r.getClass();
                dVarU6.f31160i = h03.a.h(dateTime.getMillis(), TimeZone.getDefault());
                dVarU6.f31167p = true;
                dVarU6.notifyDataSetChanged();
            }
            aVar.z6(new DateTime(date));
            return;
        }
        if (dVarU6 != null ? dVarU6.i(null) : false) {
            if (dVarU6 == null || dVarU6.f31166o == null) {
                calendarItemDTO = null;
            } else {
                DateTimeFormatter dateTimeFormatter = com.garmin.android.apps.connectmobile.calendar.presentation.d.f31149t;
                dateTimeFormatter.getClass();
                String strH = j0.h(dateTime, dateTimeFormatter);
                LinkedHashMap linkedHashMap = dVarU6.f31166o;
                List list = linkedHashMap != null ? (List) linkedHashMap.get(strH) : null;
                if (list != null) {
                    ArrayList arrayList = new ArrayList();
                    for (Object obj : list) {
                        if (((CalendarItemDTO) obj).G()) {
                            arrayList.add(obj);
                        }
                    }
                    if (arrayList.isEmpty()) {
                        calendarItemDTO = null;
                    } else {
                        calendarItemDTO = (CalendarItemDTO) arrayList.get(0);
                    }
                } else {
                    calendarItemDTO = null;
                }
            }
            if (calendarItemDTO == null) {
                a.b bVar2 = aVar.J0;
                if (bVar2 != null) {
                    bVar2.j8();
                }
                CalendarItemDTO calendarItemDTO3 = aVar.f45397k0;
                if (calendarItemDTO3 != null) {
                    calendarItemDTO3.H(dateTime);
                }
                if (dVarU6 != null) {
                    com.garmin.android.apps.connectmobile.calendar.presentation.d.f31148r.getClass();
                    dVarU6.f31160i = h03.a.h(dateTime.getMillis(), TimeZone.getDefault());
                    dVarU6.f31167p = true;
                    dVarU6.notifyDataSetChanged();
                }
                aVar.z6(dateTime);
                return;
            }
            Long l14 = aVar.Z;
            long j8 = calendarItemDTO.f30967a;
            if (l14 != null && l14.longValue() == j8) {
                return;
            }
            String string = aVar.getString(R.string.msg_replace_workout, calendarItemDTO.f30977f, j0.b(calendarItemDTO.D(), "EEEE, MMM d", null));
            string.getClass();
            q1.b bVar3 = q1.f41066b;
            String string2 = aVar.getString(R.string.lbl_replace_workout);
            string2.getClass();
            q qVar = new q(10, calendarItemDTO, aVar);
            bVar3.getClass();
            q1 q1VarC = q1.b.c(string2, string, R.string.common_confirm, R.string.lbl_cancel, qVar);
            v childFragmentManager = aVar.getChildFragmentManager();
            childFragmentManager.getClass();
            q1VarC.v6(childFragmentManager, "GCMFragTwoBttnAlertDialog");
        }
    }
}
