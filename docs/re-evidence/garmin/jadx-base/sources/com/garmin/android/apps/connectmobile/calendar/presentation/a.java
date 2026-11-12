package com.garmin.android.apps.connectmobile.calendar.presentation;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.text.format.DateUtils;
import android.text.format.Time;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.m;
import androidx.fragment.app.v;
import androidx.viewpager.widget.ViewPager;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.calendar.presentation.infiniteviewpager.InfiniteViewPager;
import com.garmin.android.apps.connectmobile.connectiq.m0;
import com.roomorama.caldroid.CaldroidFragment;
import com.roomorama.caldroid.CaldroidGridAdapter;
import com.roomorama.caldroid.CaldroidListener;
import com.roomorama.caldroid.CalendarHelper;
import ey.w;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.Formatter;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Locale;
import java.util.TimeZone;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import p13.j0;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0017\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0006"}, d2 = {"Lcom/garmin/android/apps/connectmobile/calendar/presentation/a;", "Landroidx/fragment/app/Fragment;", "<init>", "()V", "b", "a", "gcm-calendar_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
@SuppressLint({"DefaultLocale"})
public class a extends Fragment {
    public static final C0496a D = new C0496a(null);
    public ey.a A;
    public m0 B;
    public CaldroidListener C;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Time f31106a = new Time();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final StringBuilder f31107b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Formatter f31108c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public InfiniteViewPager f31109d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public b f31110e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public ArrayList<c> f31111f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f31112g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f31113h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f31114i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final ArrayList<h03.a> f31115j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final ArrayList<h03.a> f31116k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public h03.a f31117l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public h03.a f31118m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public ArrayList<h03.a> f31119n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final HashMap<String, Object> f31120o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final HashMap<String, Object> f31121p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final HashMap<h03.a, Integer> f31122q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final HashMap<h03.a, Integer> f31123r;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public int f31124t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public boolean f31125v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final ArrayList<CaldroidGridAdapter> f31126w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public boolean f31127x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public boolean f31128y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public boolean f31129z;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/garmin/android/apps/connectmobile/calendar/presentation/a$b;", "Landroidx/viewpager/widget/ViewPager$j;", "<init>", "(Lcom/garmin/android/apps/connectmobile/calendar/presentation/a;)V", "gcm-calendar_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public final class b implements ViewPager.j {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f31130a = 1000;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public h03.a f31131b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public ArrayList<CaldroidGridAdapter> f31132c;

        public b() {
        }

        @Override // androidx.viewpager.widget.ViewPager.j
        public final void onPageScrollStateChanged(int i14) {
        }

        @Override // androidx.viewpager.widget.ViewPager.j
        public final void onPageScrolled(int i14, float f14, int i15) {
        }

        @Override // androidx.viewpager.widget.ViewPager.j
        public final void onPageSelected(int i14) {
            Collection<? extends h03.a> datetimeList;
            ArrayList<CaldroidGridAdapter> arrayList = this.f31132c;
            CaldroidGridAdapter caldroidGridAdapter = arrayList != null ? arrayList.get(i14 % 4) : null;
            ArrayList<CaldroidGridAdapter> arrayList2 = this.f31132c;
            CaldroidGridAdapter caldroidGridAdapter2 = arrayList2 != null ? arrayList2.get((i14 + 3) % 4) : null;
            ArrayList<CaldroidGridAdapter> arrayList3 = this.f31132c;
            CaldroidGridAdapter caldroidGridAdapter3 = arrayList3 != null ? arrayList3.get((i14 + 1) % 4) : null;
            int i15 = this.f31130a;
            if (i14 == i15) {
                if (caldroidGridAdapter != null) {
                    caldroidGridAdapter.setAdapterDateTime(this.f31131b);
                }
                if (caldroidGridAdapter != null) {
                    caldroidGridAdapter.notifyDataSetChanged();
                }
                if (caldroidGridAdapter2 != null) {
                    h03.a aVar = this.f31131b;
                    caldroidGridAdapter2.setAdapterDateTime(aVar != null ? new h03.c(aVar, h03.a.EnumC1610a.LastDay).b(false, 0, 1, 0, 0, 0, 0, 0) : null);
                }
                if (caldroidGridAdapter2 != null) {
                    caldroidGridAdapter2.notifyDataSetChanged();
                }
                if (caldroidGridAdapter3 != null) {
                    h03.a aVar2 = this.f31131b;
                    caldroidGridAdapter3.setAdapterDateTime(aVar2 != null ? new h03.c(aVar2, h03.a.EnumC1610a.LastDay).b(true, 0, 1, 0, 0, 0, 0, 0) : null);
                }
                if (caldroidGridAdapter3 != null) {
                    caldroidGridAdapter3.notifyDataSetChanged();
                }
            } else {
                h03.a aVar3 = this.f31131b;
                if (i14 > i15) {
                    h03.a aVarB = aVar3 != null ? new h03.c(aVar3, h03.a.EnumC1610a.LastDay).b(true, 0, 1, 0, 0, 0, 0, 0) : null;
                    this.f31131b = aVarB;
                    if (caldroidGridAdapter3 != null) {
                        caldroidGridAdapter3.setAdapterDateTime(aVarB != null ? new h03.c(aVarB, h03.a.EnumC1610a.LastDay).b(true, 0, 1, 0, 0, 0, 0, 0) : null);
                    }
                    if (caldroidGridAdapter3 != null) {
                        caldroidGridAdapter3.notifyDataSetChanged();
                    }
                } else {
                    h03.a aVarB2 = aVar3 != null ? new h03.c(aVar3, h03.a.EnumC1610a.LastDay).b(false, 0, 1, 0, 0, 0, 0, 0) : null;
                    this.f31131b = aVarB2;
                    if (caldroidGridAdapter2 != null) {
                        caldroidGridAdapter2.setAdapterDateTime(aVarB2 != null ? new h03.c(aVarB2, h03.a.EnumC1610a.LastDay).b(false, 0, 1, 0, 0, 0, 0, 0) : null);
                    }
                    if (caldroidGridAdapter2 != null) {
                        caldroidGridAdapter2.notifyDataSetChanged();
                    }
                }
            }
            this.f31130a = i14;
            h03.a aVar4 = this.f31131b;
            a aVar5 = a.this;
            aVar5.setCalendarDateTime(aVar4);
            ArrayList<CaldroidGridAdapter> arrayList4 = this.f31132c;
            CaldroidGridAdapter caldroidGridAdapter4 = arrayList4 != null ? arrayList4.get(i14 % 4) : null;
            ArrayList<h03.a> arrayList5 = aVar5.f31119n;
            if (arrayList5 != null) {
                arrayList5.clear();
            }
            ArrayList<h03.a> arrayList6 = aVar5.f31119n;
            if (arrayList6 != null) {
                if (caldroidGridAdapter4 == null || (datetimeList = caldroidGridAdapter4.getDatetimeList()) == null) {
                    datetimeList = j0.f134944a;
                }
                arrayList6.addAll(datetimeList);
            }
        }
    }

    public a() {
        StringBuilder sb3 = new StringBuilder(50);
        this.f31107b = sb3;
        this.f31108c = new Formatter(sb3, Locale.getDefault());
        this.f31112g = R.style.CaldroidDefault;
        this.f31113h = -1;
        this.f31114i = -1;
        this.f31115j = new ArrayList<>();
        this.f31116k = new ArrayList<>();
        this.f31120o = new HashMap<>();
        this.f31121p = new HashMap<>();
        this.f31122q = new HashMap<>();
        this.f31123r = new HashMap<>();
        this.f31124t = 1;
        this.f31125v = true;
        this.f31126w = new ArrayList<>();
        this.f31127x = true;
    }

    public final HashMap<String, Object> getCaldroidData() {
        HashMap<String, Object> map = this.f31120o;
        map.clear();
        map.put(CaldroidFragment.DISABLE_DATES, this.f31115j);
        map.put(CaldroidFragment.SELECTED_DATES, this.f31116k);
        h03.a aVar = this.f31117l;
        if (aVar != null) {
            map.put(CaldroidFragment._MIN_DATE_TIME, aVar);
        }
        h03.a aVar2 = this.f31118m;
        if (aVar2 != null) {
            map.put(CaldroidFragment._MAX_DATE_TIME, aVar2);
        }
        map.put(CaldroidFragment.START_DAY_OF_WEEK, Integer.valueOf(this.f31124t));
        map.put(CaldroidFragment.SIX_WEEKS_IN_CALENDAR, Boolean.valueOf(this.f31125v));
        map.put(CaldroidFragment.SQUARE_TEXT_VIEW_CELL, Boolean.valueOf(this.f31129z));
        map.put(CaldroidFragment.THEME_RESOURCE, Integer.valueOf(this.f31112g));
        map.put(CaldroidFragment._BACKGROUND_FOR_DATETIME_MAP, this.f31122q);
        map.put(CaldroidFragment._TEXT_COLOR_FOR_DATETIME_MAP, this.f31123r);
        return map;
    }

    public ArrayList<xx.a> getDaysOfWeek() {
        ArrayList<xx.a> arrayList = new ArrayList<>();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("EEE", Locale.getDefault());
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

    public CaldroidGridAdapter getNewDatesGridAdapter(int i14, int i15) {
        return new CaldroidGridAdapter(getActivity(), i14, i15, getCaldroidData(), this.f31121p);
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        layoutInflater.getClass();
        Bundle arguments = getArguments();
        if (arguments != null) {
            this.f31113h = arguments.getInt(CaldroidFragment.MONTH, -1);
            this.f31114i = arguments.getInt(CaldroidFragment.YEAR, -1);
            arguments.getString(CaldroidFragment.DIALOG_TITLE);
            int i14 = arguments.getInt(CaldroidFragment.START_DAY_OF_WEEK, 1);
            this.f31124t = i14;
            if (i14 > 7) {
                this.f31124t = i14 % 7;
            }
            arguments.getBoolean(CaldroidFragment.SHOW_NAVIGATION_ARROWS, true);
            this.f31127x = arguments.getBoolean(CaldroidFragment.ENABLE_SWIPE, true);
            this.f31125v = arguments.getBoolean(CaldroidFragment.SIX_WEEKS_IN_CALENDAR, true);
            this.f31129z = getResources().getConfiguration().orientation == 1 ? arguments.getBoolean(CaldroidFragment.SQUARE_TEXT_VIEW_CELL, true) : arguments.getBoolean(CaldroidFragment.SQUARE_TEXT_VIEW_CELL, false);
            this.f31128y = arguments.getBoolean(CaldroidFragment.ENABLE_CLICK_ON_DISABLED_DATES, false);
            ArrayList<String> stringArrayList = arguments.getStringArrayList(CaldroidFragment.DISABLE_DATES);
            if (stringArrayList != null && stringArrayList.size() > 0) {
                ArrayList<h03.a> arrayList = this.f31115j;
                if (arrayList != null) {
                    arrayList.clear();
                }
                Iterator<String> it = stringArrayList.iterator();
                it.getClass();
                while (it.hasNext()) {
                    h03.a dateTimeFromString = CalendarHelper.getDateTimeFromString(it.next(), "yyyy-MM-dd");
                    if (arrayList != null) {
                        arrayList.add(dateTimeFromString);
                    }
                }
            }
            ArrayList<String> stringArrayList2 = arguments.getStringArrayList(CaldroidFragment.SELECTED_DATES);
            if (stringArrayList2 != null && stringArrayList2.size() > 0) {
                ArrayList<h03.a> arrayList2 = this.f31116k;
                if (arrayList2 != null) {
                    arrayList2.clear();
                }
                Iterator<String> it3 = stringArrayList2.iterator();
                it3.getClass();
                while (it3.hasNext()) {
                    h03.a dateTimeFromString2 = CalendarHelper.getDateTimeFromString(it3.next(), "yyyy-MM-dd");
                    if (arrayList2 != null) {
                        arrayList2.add(dateTimeFromString2);
                    }
                }
            }
            String string = arguments.getString(CaldroidFragment.MIN_DATE);
            if (string != null) {
                this.f31117l = CalendarHelper.getDateTimeFromString(string, null);
            }
            String string2 = arguments.getString(CaldroidFragment.MAX_DATE);
            if (string2 != null) {
                this.f31118m = CalendarHelper.getDateTimeFromString(string2, null);
            }
            this.f31112g = arguments.getInt(CaldroidFragment.THEME_RESOURCE, R.style.CaldroidDefault);
        }
        if (this.f31113h == -1 || this.f31114i == -1) {
            h03.a aVarT = h03.a.h(System.currentTimeMillis(), TimeZone.getDefault()).t(h03.a.d.DAY);
            aVarT.g();
            Integer num = aVarT.f80660c;
            num.getClass();
            this.f31113h = num.intValue();
            aVarT.g();
            Integer num2 = aVarT.f80659b;
            num2.getClass();
            this.f31114i = num2.intValue();
        }
        m activity = getActivity();
        int i15 = this.f31112g;
        D.getClass();
        LayoutInflater layoutInflaterCloneInContext = layoutInflater.cloneInContext(new ContextThemeWrapper(activity, i15));
        layoutInflaterCloneInContext.getClass();
        View viewInflate = layoutInflaterCloneInContext.inflate(R.layout.calendar_view, viewGroup, false);
        viewInflate.getClass();
        h03.a aVar = new h03.a(Integer.valueOf(this.f31114i), Integer.valueOf(this.f31113h), 1, 0, 0, 0, 0);
        b bVar = new b();
        this.f31110e = bVar;
        bVar.f31131b = aVar;
        a.this.setCalendarDateTime(aVar);
        aVar.g();
        Integer num3 = aVar.f80660c;
        num3.getClass();
        int iIntValue = num3.intValue();
        aVar.g();
        Integer num4 = aVar.f80659b;
        num4.getClass();
        CaldroidGridAdapter newDatesGridAdapter = getNewDatesGridAdapter(iIntValue, num4.intValue());
        this.f31119n = newDatesGridAdapter.getDatetimeList();
        h03.a.EnumC1610a enumC1610a = h03.a.EnumC1610a.LastDay;
        h03.a aVarB = new h03.c(aVar, enumC1610a).b(true, 0, 1, 0, 0, 0, 0, 0);
        aVarB.g();
        Integer num5 = aVarB.f80660c;
        num5.getClass();
        int iIntValue2 = num5.intValue();
        aVarB.g();
        Integer num6 = aVarB.f80659b;
        num6.getClass();
        CaldroidGridAdapter newDatesGridAdapter2 = getNewDatesGridAdapter(iIntValue2, num6.intValue());
        h03.a aVarB2 = new h03.c(aVarB, enumC1610a).b(true, 0, 1, 0, 0, 0, 0, 0);
        aVarB2.g();
        Integer num7 = aVarB2.f80660c;
        num7.getClass();
        int iIntValue3 = num7.intValue();
        aVarB2.g();
        Integer num8 = aVarB2.f80659b;
        num8.getClass();
        CaldroidGridAdapter newDatesGridAdapter3 = getNewDatesGridAdapter(iIntValue3, num8.intValue());
        h03.a aVarB3 = new h03.c(aVar, enumC1610a).b(false, 0, 1, 0, 0, 0, 0, 0);
        aVarB3.g();
        Integer num9 = aVarB3.f80660c;
        num9.getClass();
        int iIntValue4 = num9.intValue();
        aVarB3.g();
        Integer num10 = aVarB3.f80659b;
        num10.getClass();
        CaldroidGridAdapter newDatesGridAdapter4 = getNewDatesGridAdapter(iIntValue4, num10.intValue());
        ArrayList<CaldroidGridAdapter> arrayList3 = this.f31126w;
        arrayList3.add(newDatesGridAdapter);
        arrayList3.add(newDatesGridAdapter2);
        arrayList3.add(newDatesGridAdapter3);
        arrayList3.add(newDatesGridAdapter4);
        b bVar2 = this.f31110e;
        if (bVar2 != null) {
            bVar2.f31132c = arrayList3;
        }
        View viewFindViewById = viewInflate.findViewById(R.id.months_infinite_pager);
        viewFindViewById.getClass();
        InfiniteViewPager infiniteViewPager = (InfiniteViewPager) viewFindViewById;
        this.f31109d = infiniteViewPager;
        infiniteViewPager.setEnabled(this.f31127x);
        InfiniteViewPager infiniteViewPager2 = this.f31109d;
        if (infiniteViewPager2 != null) {
            infiniteViewPager2.setSixWeeksInCalendar(this.f31125v);
        }
        v childFragmentManager = getChildFragmentManager();
        childFragmentManager.getClass();
        ey.v vVar = new ey.v(childFragmentManager);
        this.f31111f = vVar.getFragments();
        for (int i16 = 0; i16 < 4; i16++) {
            ArrayList<c> arrayList4 = this.f31111f;
            c cVar = arrayList4 != null ? arrayList4.get(i16) : null;
            CaldroidGridAdapter caldroidGridAdapter = arrayList3.get(i16);
            caldroidGridAdapter.getClass();
            CaldroidGridAdapter caldroidGridAdapter2 = caldroidGridAdapter;
            if (cVar != null) {
                cVar.f31145g = R.layout.date_grid_fragment;
            }
            if (cVar != null) {
                cVar.f31141c = caldroidGridAdapter2;
            }
            if (cVar != null) {
                m mVarRequireActivity = requireActivity();
                mVarRequireActivity.getClass();
                cVar.f31142d = new w(mVarRequireActivity, android.R.layout.simple_list_item_1, getDaysOfWeek());
            }
            if (cVar != null) {
                if (this.A == null) {
                    this.A = new ey.a(this, 0);
                }
                cVar.f31143e = this.A;
            }
            if (cVar != null) {
                if (this.B == null) {
                    this.B = new m0(this, 1);
                }
                cVar.f31144f = this.B;
            }
        }
        m mVarRequireActivity2 = requireActivity();
        mVarRequireActivity2.getClass();
        jy.c cVar2 = new jy.c(mVarRequireActivity2, vVar);
        InfiniteViewPager infiniteViewPager3 = this.f31109d;
        if (infiniteViewPager3 != null) {
            infiniteViewPager3.setAdapter(cVar2);
        }
        InfiniteViewPager infiniteViewPager4 = this.f31109d;
        if (infiniteViewPager4 != null) {
            infiniteViewPager4.setOnPageChangeListener(this.f31110e);
        }
        refreshView();
        return viewInflate;
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view2, Bundle bundle) {
        view2.getClass();
        super.onViewCreated(view2, bundle);
        CaldroidListener caldroidListener = this.C;
        if (caldroidListener == null || caldroidListener == null) {
            return;
        }
        caldroidListener.onCaldroidViewCreated();
    }

    public final void refreshView() {
        int i14;
        int i15 = this.f31113h;
        if (i15 == -1 || (i14 = this.f31114i) == -1) {
            return;
        }
        Time time = this.f31106a;
        time.year = i14;
        time.month = i15 - 1;
        time.monthDay = 1;
        long millis = time.toMillis(true);
        this.f31107b.setLength(0);
        DateUtils.formatDateRange(getActivity(), this.f31108c, millis, millis, 52).toString().getClass();
        Iterator<CaldroidGridAdapter> it = this.f31126w.iterator();
        it.getClass();
        while (it.hasNext()) {
            CaldroidGridAdapter next = it.next();
            next.getClass();
            CaldroidGridAdapter caldroidGridAdapter = next;
            caldroidGridAdapter.setCaldroidData(getCaldroidData());
            caldroidGridAdapter.setExtraData(this.f31121p);
            caldroidGridAdapter.updateToday();
            caldroidGridAdapter.notifyDataSetChanged();
        }
    }

    public final void setCalendarDateTime(h03.a aVar) {
        if (aVar != null) {
            aVar.g();
            Integer num = aVar.f80660c;
            num.getClass();
            this.f31113h = num.intValue();
            aVar.g();
            Integer num2 = aVar.f80659b;
            num2.getClass();
            this.f31114i = num2.intValue();
        }
        CaldroidListener caldroidListener = this.C;
        if (caldroidListener != null) {
            caldroidListener.onChangeMonth(this.f31113h, this.f31114i);
        }
        refreshView();
    }

    /* JADX INFO: renamed from: com.garmin.android.apps.connectmobile.calendar.presentation.a$a, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u001d\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0014\u0010\n\u001a\u00020\u00078\u0006X\u0086T¢\u0006\u0006\n\u0004\b\n\u0010\tR\u0014\u0010\u000b\u001a\u00020\u00078\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000b\u0010\tR\u0014\u0010\f\u001a\u00020\u00078\u0006X\u0086T¢\u0006\u0006\n\u0004\b\f\u0010\tR\u0014\u0010\r\u001a\u00020\u00078\u0006X\u0086T¢\u0006\u0006\n\u0004\b\r\u0010\tR\u0014\u0010\u000e\u001a\u00020\u00078\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000e\u0010\tR\u0014\u0010\u000f\u001a\u00020\u00078\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000f\u0010\tR\u0014\u0010\u0010\u001a\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0010\u0010\tR\u0014\u0010\u0011\u001a\u00020\u00078\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0011\u0010\tR\u0014\u0010\u0012\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0006R\u0014\u0010\u0013\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0013\u0010\u0006R\u0014\u0010\u0014\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0014\u0010\u0006R\u0014\u0010\u0015\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0015\u0010\u0006R\u0014\u0010\u0016\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0016\u0010\u0006R\u0014\u0010\u0017\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0017\u0010\u0006R\u0014\u0010\u0018\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0018\u0010\u0006R\u0014\u0010\u0019\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0019\u0010\u0006R\u0014\u0010\u001a\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u001a\u0010\u0006R\u0014\u0010\u001b\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u001b\u0010\u0006R\u0014\u0010\u001c\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u001c\u0010\u0006R\u0014\u0010\u001d\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u001d\u0010\u0006R\u0014\u0010\u001e\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u001e\u0010\u0006R\u0014\u0010\u001f\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u001f\u0010\u0006R\u0014\u0010 \u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b \u0010\u0006R\u0014\u0010!\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b!\u0010\u0006R\u0014\u0010\"\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\"\u0010\u0006R\u0014\u0010#\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b#\u0010\u0006¨\u0006$"}, d2 = {"Lcom/garmin/android/apps/connectmobile/calendar/presentation/a$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "", "SUNDAY", "I", "MONDAY", "TUESDAY", "WEDNESDAY", "THURSDAY", "FRIDAY", "SATURDAY", "MONTH_YEAR_FLAG", "NUMBER_OF_PAGES", "DIALOG_TITLE", "MONTH", "YEAR", "SHOW_NAVIGATION_ARROWS", "DISABLE_DATES", "SELECTED_DATES", "MIN_DATE", "MAX_DATE", "ENABLE_SWIPE", "START_DAY_OF_WEEK", "SIX_WEEKS_IN_CALENDAR", "ENABLE_CLICK_ON_DISABLED_DATES", "SQUARE_TEXT_VIEW_CELL", "THEME_RESOURCE", "MIN_DATE_TIME", "MAX_DATE_TIME", "BACKGROUND_FOR_DATETIME_MAP", "TEXT_COLOR_FOR_DATETIME_MAP", "gcm-calendar_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class C0496a {
        public /* synthetic */ C0496a(j jVar) {
            this();
        }

        private C0496a() {
        }
    }
}
