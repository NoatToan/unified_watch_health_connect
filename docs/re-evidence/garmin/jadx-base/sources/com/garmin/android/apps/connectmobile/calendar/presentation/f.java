package com.garmin.android.apps.connectmobile.calendar.presentation;

import android.content.Context;
import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.m;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.calendar.detail.model.CalendarDTO;
import com.garmin.android.apps.connectmobile.calendar.model.CalendarItemDTO;
import com.garmin.android.apps.connectmobile.calendar.presentation.infiniteviewpager.InfiniteViewPager;
import com.roomorama.caldroid.CaldroidFragment;
import com.roomorama.caldroid.CaldroidGridAdapter;
import com.roomorama.caldroid.CalendarHelper;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import p13.h0;
import p13.j0;
import p13.k0;
import p13.t0;
import vx.h;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002:\u0003\u0005\u0006\u0007B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\b"}, d2 = {"Lcom/garmin/android/apps/connectmobile/calendar/presentation/f;", "Lcom/garmin/android/apps/connectmobile/calendar/presentation/a;", "Lvx/h;", "<init>", "()V", "a", "b", "c", "gcm-calendar_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class f extends com.garmin.android.apps.connectmobile.calendar.presentation.a implements h {
    public int E;
    public h03.a F;
    public h03.a I;
    public a P;
    public b T;

    public interface a {
        void o8(boolean z14);
    }

    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\b\u0002\u0018\u00002 \u0012\u0004\u0012\u00020\u0002\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u00030\u0001B3\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\r\u001a\u00020\u000b\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"Lcom/garmin/android/apps/connectmobile/calendar/presentation/f$b;", "Lg22/c;", "Ljava/lang/Void;", "", "", "", "Lcom/garmin/android/apps/connectmobile/calendar/model/CalendarItemDTO;", "Lvx/h;", "calendarTasksListener", "Lcom/garmin/android/apps/connectmobile/calendar/detail/model/CalendarDTO;", "calendarDTO", "", CaldroidFragment.MONTH, CaldroidFragment.YEAR, "group", "<init>", "(Lvx/h;Lcom/garmin/android/apps/connectmobile/calendar/detail/model/CalendarDTO;IILjava/lang/String;)V", "gcm-calendar_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class b extends g22.c<Void, Map<String, ? extends List<? extends CalendarItemDTO>>> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final h f31219c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final CalendarDTO f31220d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final int f31221e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final int f31222f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final String f31223g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(h hVar, CalendarDTO calendarDTO, int i14, int i15, String str) {
            super(null, 1, null);
            hVar.getClass();
            this.f31219c = hVar;
            this.f31220d = calendarDTO;
            this.f31221e = i14;
            this.f31222f = i15;
            this.f31223g = str;
        }

        @Override // g22.c
        public final Map<String, ? extends List<? extends CalendarItemDTO>> b(Void[] voidArr) {
            ArrayList arrayList;
            com.garmin.android.apps.connectmobile.calendar.presentation.b bVarA = com.garmin.android.apps.connectmobile.calendar.presentation.b.f31134b.a();
            if (bVarA == null) {
                k0 k0Var = k0.f134949a;
                k0Var.getClass();
                return k0Var;
            }
            CalendarDTO calendarDTO = this.f31220d;
            List listB1 = (calendarDTO == null || (arrayList = calendarDTO.f30966f) == null) ? null : h0.b1(arrayList);
            if (listB1 == null) {
                listB1 = j0.f134944a;
            }
            HashMap mapB = bVarA.b(listB1);
            LinkedHashMap linkedHashMap = new LinkedHashMap(t0.a(mapB.size()));
            for (Map.Entry entry : mapB.entrySet()) {
                linkedHashMap.put(entry.getKey(), h0.b1((Iterable) entry.getValue()));
            }
            return linkedHashMap;
        }

        @Override // g22.c
        public final void d(Map<String, ? extends List<? extends CalendarItemDTO>> map) {
            Map<String, ? extends List<? extends CalendarItemDTO>> map2 = map;
            map2.getClass();
            int i14 = this.f31221e;
            int i15 = this.f31222f;
            this.f31219c.S0((HashMap) map2, this.f31220d, this.f31223g, i14, i15);
        }
    }

    static {
        new c(null);
    }

    @Override // vx.h
    public final void S0(HashMap<String, List<CalendarItemDTO>> map, CalendarDTO calendarDTO, String str, int i14, int i15) {
        map.getClass();
        d dVarV6 = v6(i14, i15);
        if (dVarV6 != null) {
            LinkedHashMap linkedHashMap = new LinkedHashMap(t0.a(map.size()));
            Iterator<T> it = map.entrySet().iterator();
            while (it.hasNext()) {
                Map.Entry entry = (Map.Entry) it.next();
                linkedHashMap.put(entry.getKey(), h0.d1((Collection) entry.getValue()));
            }
            dVarV6.f31166o = new LinkedHashMap(linkedHashMap);
            dVarV6.f31157f = calendarDTO;
            dVarV6.f31156e = str;
            dVarV6.notifyDataSetChanged();
        }
        a aVar = this.P;
        if (aVar != null) {
            aVar.o8(false);
        }
    }

    @Override // com.garmin.android.apps.connectmobile.calendar.presentation.a
    public final ArrayList<xx.a> getDaysOfWeek() {
        ArrayList<xx.a> arrayList = new ArrayList<>();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("EEEEE", Locale.getDefault());
        SimpleDateFormat simpleDateFormat2 = new SimpleDateFormat("EEEE", Locale.getDefault());
        h03.a aVarS = new h03.a(2013, 2, 17, 0, 0, 0, 0).s(Integer.valueOf(this.f31124t - 1));
        for (int i14 = 0; i14 < 7; i14++) {
            Date dateConvertDateTimeToDate = CalendarHelper.convertDateTimeToDate(aVarS);
            String str = simpleDateFormat.format(dateConvertDateTimeToDate);
            str.getClass();
            Locale locale = Locale.getDefault();
            locale.getClass();
            String upperCase = str.toUpperCase(locale);
            upperCase.getClass();
            String str2 = simpleDateFormat2.format(dateConvertDateTimeToDate);
            str2.getClass();
            arrayList.add(new xx.a(upperCase, str2));
            aVarS = aVarS.s(1);
        }
        return arrayList;
    }

    @Override // com.garmin.android.apps.connectmobile.calendar.presentation.a
    public final CaldroidGridAdapter getNewDatesGridAdapter(int i14, int i15) {
        m mVarRequireActivity = requireActivity();
        mVarRequireActivity.getClass();
        HashMap<String, Object> caldroidData = getCaldroidData();
        Resources resources = getResources();
        resources.getClass();
        return new d(mVarRequireActivity, i14, i15, caldroidData, this.f31121p, (this.E - resources.getDimension(R.dimen.calendar_month_view_height)) - resources.getDimension(R.dimen.calendar_week_day_height), this.F, this.I, false, 256, null);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onAttach(Context context) {
        context.getClass();
        super.onAttach(context);
        try {
            this.P = (a) getActivity();
        } catch (Exception unused) {
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        Object serializable;
        Object serializable2;
        super.onCreate(bundle);
        Bundle arguments = getArguments();
        if (arguments == null || !arguments.containsKey("CONTAINER_HEIGHT")) {
            return;
        }
        this.E = arguments.getInt("CONTAINER_HEIGHT");
        int i14 = Build.VERSION.SDK_INT;
        if (i14 >= 33) {
            serializable = arguments.getSerializable("HIGHLIGHTED_PERIOD_START_DATE", Date.class);
        } else {
            Object serializable3 = arguments.getSerializable("HIGHLIGHTED_PERIOD_START_DATE");
            if (!(serializable3 instanceof Date)) {
                serializable3 = null;
            }
            serializable = (Date) serializable3;
        }
        Date date = (Date) serializable;
        if (i14 >= 33) {
            serializable2 = arguments.getSerializable("HIGHLIGHTED_PERIOD_END_DATE", Date.class);
        } else {
            Object serializable4 = arguments.getSerializable("HIGHLIGHTED_PERIOD_END_DATE");
            serializable2 = (Date) (serializable4 instanceof Date ? serializable4 : null);
        }
        Date date2 = (Date) serializable2;
        if (date == null || date2 == null) {
            return;
        }
        h03.a aVarConvertDateToDateTime = CalendarHelper.convertDateToDateTime(date);
        this.F = aVarConvertDateToDateTime;
        if (aVarConvertDateToDateTime != null) {
            aVarConvertDateToDateTime.t(h03.a.d.DAY);
        }
        h03.a aVarConvertDateToDateTime2 = CalendarHelper.convertDateToDateTime(date2);
        this.I = aVarConvertDateToDateTime2;
        if (aVarConvertDateToDateTime2 != null) {
            aVarConvertDateToDateTime2.t(h03.a.d.DAY);
        }
    }

    @Override // com.garmin.android.apps.connectmobile.calendar.presentation.a, androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        layoutInflater.getClass();
        return super.onCreateView(layoutInflater, viewGroup, bundle);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onStop() {
        super.onStop();
        b bVar = this.T;
        if (bVar != null) {
            bVar.a();
        }
    }

    @Override // com.garmin.android.apps.connectmobile.calendar.presentation.a, androidx.fragment.app.Fragment
    public final void onViewCreated(View view2, Bundle bundle) {
        view2.getClass();
        super.onViewCreated(view2, bundle);
        InfiniteViewPager infiniteViewPager = this.f31109d;
        if (infiniteViewPager != null) {
            infiniteViewPager.setImportantForAccessibility(2);
        }
    }

    public final void u6() {
        d dVarV6 = v6(this.f31113h, this.f31114i);
        if (dVarV6 != null) {
            dVarV6.d();
        }
    }

    public final d v6(int i14, int i15) {
        ArrayList<CaldroidGridAdapter> arrayList = this.f31126w;
        int size = arrayList.size();
        for (int i16 = 0; i16 < size; i16++) {
            CaldroidGridAdapter caldroidGridAdapter = arrayList.get(i16);
            caldroidGridAdapter.getClass();
            d dVar = (d) caldroidGridAdapter;
            if (i14 == dVar.f() && i15 == dVar.g()) {
                return dVar;
            }
        }
        return null;
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\u0006R\u0014\u0010\t\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\u0006¨\u0006\n"}, d2 = {"Lcom/garmin/android/apps/connectmobile/calendar/presentation/f$c;", "", "<init>", "()V", "", "CONTAINER_HEIGHT", "Ljava/lang/String;", "HIGHLIGHTED_PERIOD_START_DATE", "HIGHLIGHTED_PERIOD_END_DATE", "TAG", "gcm-calendar_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class c {
        public /* synthetic */ c(j jVar) {
            this();
        }

        private c() {
        }
    }
}
