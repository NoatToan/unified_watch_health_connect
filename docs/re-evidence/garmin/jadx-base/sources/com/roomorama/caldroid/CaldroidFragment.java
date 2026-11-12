package com.roomorama.caldroid;

import android.annotation.SuppressLint;
import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.text.format.DateUtils;
import android.text.format.Time;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.GridView;
import android.widget.ListAdapter;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.i;
import androidx.fragment.app.v;
import androidx.viewpager.widget.ViewPager;
import com.garmin.android.apps.connectmobile.R;
import h03.a;
import h03.c;
import java.lang.reflect.Field;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Formatter;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.TimeZone;
import th.b;

/* JADX INFO: loaded from: classes3.dex */
@SuppressLint({"DefaultLocale"})
public class CaldroidFragment extends i {
    public static final String DIALOG_TITLE = "dialogTitle";
    public static final String DISABLE_DATES = "disableDates";
    public static final String ENABLE_CLICK_ON_DISABLED_DATES = "enableClickOnDisabledDates";
    public static final String ENABLE_SWIPE = "enableSwipe";
    public static int FRIDAY = 6;
    public static final String MAX_DATE = "maxDate";
    public static final String MIN_DATE = "minDate";
    public static int MONDAY = 2;
    public static final String MONTH = "month";
    private static final int MONTH_YEAR_FLAG = 52;
    public static final int NUMBER_OF_PAGES = 4;
    public static int SATURDAY = 7;
    public static final String SELECTED_DATES = "selectedDates";
    public static final String SHOW_NAVIGATION_ARROWS = "showNavigationArrows";
    public static final String SIX_WEEKS_IN_CALENDAR = "sixWeeksInCalendar";
    public static final String SQUARE_TEXT_VIEW_CELL = "squareTextViewCell";
    public static final String START_DAY_OF_WEEK = "startDayOfWeek";
    public static int SUNDAY = 1;
    public static final String THEME_RESOURCE = "themeResource";
    public static int THURSDAY = 5;
    public static int TUESDAY = 3;
    public static int WEDNESDAY = 4;
    public static final String YEAR = "year";
    public static final String _BACKGROUND_FOR_DATETIME_MAP = "_backgroundForDateTimeMap";
    public static final String _MAX_DATE_TIME = "_maxDateTime";
    public static final String _MIN_DATE_TIME = "_minDateTime";
    public static final String _TEXT_COLOR_FOR_DATETIME_MAP = "_textColorForDateTimeMap";
    public static int disabledBackgroundDrawable = -1;
    public static int disabledTextColor = -7829368;
    protected HashMap<a, Integer> backgroundForDateTimeMap;
    protected HashMap<String, Object> caldroidData;
    private CaldroidListener caldroidListener;
    protected ArrayList<a> dateInMonthsList;
    private AdapterView.OnItemClickListener dateItemClickListener;
    private AdapterView.OnItemLongClickListener dateItemLongClickListener;
    protected ArrayList<CaldroidGridAdapter> datePagerAdapters;
    private b dateViewPager;
    protected String dialogTitle;
    protected ArrayList<a> disableDates;
    protected boolean enableClickOnDisabledDates;
    protected boolean enableSwipe;
    protected HashMap<String, Object> extraData;
    private ArrayList<DateGridFragment> fragments;
    private Button leftArrowButton;
    protected a maxDateTime;
    protected a minDateTime;
    protected int month;
    private TextView monthTitleTextView;
    private Formatter monthYearFormatter;
    private final StringBuilder monthYearStringBuilder;
    private DatePageChangeListener pageChangeListener;
    private Button rightArrowButton;
    protected ArrayList<a> selectedDates;
    protected boolean showNavigationArrows;
    private boolean sixWeeksInCalendar;
    protected boolean squareTextViewCell;
    protected int startDayOfWeek;
    protected HashMap<a, Integer> textColorForDateTimeMap;
    private int themeResource;
    private GridView weekdayGridView;
    protected int year;
    public String TAG = "CaldroidFragment";
    private Time firstMonthTime = new Time();

    public class DatePageChangeListener implements ViewPager.j {
        private ArrayList<CaldroidGridAdapter> caldroidGridAdapters;
        private a currentDateTime;
        private int currentPage = 1000;

        public DatePageChangeListener() {
        }

        private int getNext(int i14) {
            return (i14 + 1) % 4;
        }

        private int getPrevious(int i14) {
            return (i14 + 3) % 4;
        }

        public ArrayList<CaldroidGridAdapter> getCaldroidGridAdapters() {
            return this.caldroidGridAdapters;
        }

        public int getCurrent(int i14) {
            return i14 % 4;
        }

        public a getCurrentDateTime() {
            return this.currentDateTime;
        }

        public int getCurrentPage() {
            return this.currentPage;
        }

        @Override // androidx.viewpager.widget.ViewPager.j
        public void onPageScrollStateChanged(int i14) {
        }

        @Override // androidx.viewpager.widget.ViewPager.j
        public void onPageScrolled(int i14, float f14, int i15) {
        }

        @Override // androidx.viewpager.widget.ViewPager.j
        public void onPageSelected(int i14) {
            refreshAdapters(i14);
            CaldroidFragment.this.setCalendarDateTime(this.currentDateTime);
            CaldroidGridAdapter caldroidGridAdapter = this.caldroidGridAdapters.get(i14 % 4);
            CaldroidFragment.this.dateInMonthsList.clear();
            CaldroidFragment.this.dateInMonthsList.addAll(caldroidGridAdapter.getDatetimeList());
        }

        public void refreshAdapters(int i14) {
            CaldroidGridAdapter caldroidGridAdapter = this.caldroidGridAdapters.get(getCurrent(i14));
            CaldroidGridAdapter caldroidGridAdapter2 = this.caldroidGridAdapters.get(getPrevious(i14));
            CaldroidGridAdapter caldroidGridAdapter3 = this.caldroidGridAdapters.get(getNext(i14));
            int i15 = this.currentPage;
            if (i14 == i15) {
                caldroidGridAdapter.setAdapterDateTime(this.currentDateTime);
                caldroidGridAdapter.notifyDataSetChanged();
                a aVar = this.currentDateTime;
                a.EnumC1610a enumC1610a = a.EnumC1610a.LastDay;
                aVar.getClass();
                caldroidGridAdapter2.setAdapterDateTime(new c(aVar, enumC1610a).b(false, 0, 1, 0, 0, 0, 0, 0));
                caldroidGridAdapter2.notifyDataSetChanged();
                a aVar2 = this.currentDateTime;
                aVar2.getClass();
                caldroidGridAdapter3.setAdapterDateTime(new c(aVar2, enumC1610a).b(true, 0, 1, 0, 0, 0, 0, 0));
                caldroidGridAdapter3.notifyDataSetChanged();
            } else {
                a aVar3 = this.currentDateTime;
                if (i14 > i15) {
                    a.EnumC1610a enumC1610a2 = a.EnumC1610a.LastDay;
                    aVar3.getClass();
                    a aVarB = new c(aVar3, enumC1610a2).b(true, 0, 1, 0, 0, 0, 0, 0);
                    this.currentDateTime = aVarB;
                    caldroidGridAdapter3.setAdapterDateTime(new c(aVarB, enumC1610a2).b(true, 0, 1, 0, 0, 0, 0, 0));
                    caldroidGridAdapter3.notifyDataSetChanged();
                } else {
                    a.EnumC1610a enumC1610a3 = a.EnumC1610a.LastDay;
                    aVar3.getClass();
                    a aVarB2 = new c(aVar3, enumC1610a3).b(false, 0, 1, 0, 0, 0, 0, 0);
                    this.currentDateTime = aVarB2;
                    caldroidGridAdapter2.setAdapterDateTime(new c(aVarB2, enumC1610a3).b(false, 0, 1, 0, 0, 0, 0, 0));
                    caldroidGridAdapter2.notifyDataSetChanged();
                }
            }
            this.currentPage = i14;
        }

        public void setCaldroidGridAdapters(ArrayList<CaldroidGridAdapter> arrayList) {
            this.caldroidGridAdapters = arrayList;
        }

        public void setCurrentDateTime(a aVar) {
            this.currentDateTime = aVar;
            CaldroidFragment.this.setCalendarDateTime(aVar);
        }

        public void setCurrentPage(int i14) {
            this.currentPage = i14;
        }
    }

    public CaldroidFragment() {
        StringBuilder sb3 = new StringBuilder(50);
        this.monthYearStringBuilder = sb3;
        this.monthYearFormatter = new Formatter(sb3, Locale.getDefault());
        this.themeResource = R.style.CaldroidDefault;
        this.month = -1;
        this.year = -1;
        this.disableDates = new ArrayList<>();
        this.selectedDates = new ArrayList<>();
        this.caldroidData = new HashMap<>();
        this.extraData = new HashMap<>();
        this.backgroundForDateTimeMap = new HashMap<>();
        this.textColorForDateTimeMap = new HashMap<>();
        this.startDayOfWeek = SUNDAY;
        this.sixWeeksInCalendar = true;
        this.datePagerAdapters = new ArrayList<>();
        this.enableSwipe = true;
        this.showNavigationArrows = true;
        this.enableClickOnDisabledDates = false;
    }

    public static LayoutInflater getLayoutInflater(Context context, LayoutInflater layoutInflater, int i14) {
        return layoutInflater.cloneInContext(new ContextThemeWrapper(context, i14));
    }

    public static CaldroidFragment newInstance(String str, int i14, int i15) {
        CaldroidFragment caldroidFragment = new CaldroidFragment();
        Bundle bundle = new Bundle();
        bundle.putString(DIALOG_TITLE, str);
        bundle.putInt(MONTH, i14);
        bundle.putInt(YEAR, i15);
        caldroidFragment.setArguments(bundle);
        return caldroidFragment;
    }

    private void setupDateGridPages(View view2) {
        a aVar = new a(Integer.valueOf(this.year), Integer.valueOf(this.month), 1, 0, 0, 0, 0);
        DatePageChangeListener datePageChangeListener = new DatePageChangeListener();
        this.pageChangeListener = datePageChangeListener;
        datePageChangeListener.setCurrentDateTime(aVar);
        aVar.g();
        int iIntValue = aVar.f80660c.intValue();
        aVar.g();
        CaldroidGridAdapter newDatesGridAdapter = getNewDatesGridAdapter(iIntValue, aVar.f80659b.intValue());
        this.dateInMonthsList = newDatesGridAdapter.getDatetimeList();
        a.EnumC1610a enumC1610a = a.EnumC1610a.LastDay;
        a aVarB = new c(aVar, enumC1610a).b(true, 0, 1, 0, 0, 0, 0, 0);
        aVarB.g();
        int iIntValue2 = aVarB.f80660c.intValue();
        aVarB.g();
        CaldroidGridAdapter newDatesGridAdapter2 = getNewDatesGridAdapter(iIntValue2, aVarB.f80659b.intValue());
        a aVarB2 = new c(aVarB, enumC1610a).b(true, 0, 1, 0, 0, 0, 0, 0);
        aVarB2.g();
        int iIntValue3 = aVarB2.f80660c.intValue();
        aVarB2.g();
        CaldroidGridAdapter newDatesGridAdapter3 = getNewDatesGridAdapter(iIntValue3, aVarB2.f80659b.intValue());
        a aVarB3 = new c(aVar, enumC1610a).b(false, 0, 1, 0, 0, 0, 0, 0);
        aVarB3.g();
        int iIntValue4 = aVarB3.f80660c.intValue();
        aVarB3.g();
        CaldroidGridAdapter newDatesGridAdapter4 = getNewDatesGridAdapter(iIntValue4, aVarB3.f80659b.intValue());
        this.datePagerAdapters.add(newDatesGridAdapter);
        this.datePagerAdapters.add(newDatesGridAdapter2);
        this.datePagerAdapters.add(newDatesGridAdapter3);
        this.datePagerAdapters.add(newDatesGridAdapter4);
        this.pageChangeListener.setCaldroidGridAdapters(this.datePagerAdapters);
        b bVar = (b) view2.findViewById(R.id.months_infinite_pager);
        this.dateViewPager = bVar;
        bVar.setEnabled(this.enableSwipe);
        this.dateViewPager.setSixWeeksInCalendar(this.sixWeeksInCalendar);
        this.dateViewPager.setDatesInMonth(this.dateInMonthsList);
        MonthPagerAdapter monthPagerAdapter = new MonthPagerAdapter(getChildFragmentManager());
        this.fragments = monthPagerAdapter.getFragments();
        for (int i14 = 0; i14 < 4; i14++) {
            DateGridFragment dateGridFragment = this.fragments.get(i14);
            CaldroidGridAdapter caldroidGridAdapter = this.datePagerAdapters.get(i14);
            dateGridFragment.setGridViewRes(getGridViewRes());
            dateGridFragment.setGridAdapter(caldroidGridAdapter);
            dateGridFragment.setOnItemClickListener(getDateItemClickListener());
            dateGridFragment.setOnItemLongClickListener(getDateItemLongClickListener());
        }
        this.dateViewPager.setAdapter(new th.a(monthPagerAdapter));
        this.dateViewPager.setOnPageChangeListener(this.pageChangeListener);
    }

    public void clearBackgroundResourceForDate(Date date) {
        this.backgroundForDateTimeMap.remove(CalendarHelper.convertDateToDateTime(date));
    }

    public void clearBackgroundResourceForDateTime(a aVar) {
        this.backgroundForDateTimeMap.remove(aVar);
    }

    public void clearBackgroundResourceForDateTimes(List<a> list) {
        if (list == null || list.size() == 0) {
            return;
        }
        Iterator<a> it = list.iterator();
        while (it.hasNext()) {
            this.backgroundForDateTimeMap.remove(it.next());
        }
    }

    public void clearBackgroundResourceForDates(List<Date> list) {
        if (list == null || list.size() == 0) {
            return;
        }
        Iterator<Date> it = list.iterator();
        while (it.hasNext()) {
            clearBackgroundResourceForDate(it.next());
        }
    }

    public void clearDisableDates() {
        this.disableDates.clear();
    }

    public void clearSelectedDates() {
        this.selectedDates.clear();
    }

    public void clearTextColorForDate(Date date) {
        this.textColorForDateTimeMap.remove(CalendarHelper.convertDateToDateTime(date));
    }

    public void clearTextColorForDates(List<Date> list) {
        if (list == null || list.size() == 0) {
            return;
        }
        Iterator<Date> it = list.iterator();
        while (it.hasNext()) {
            clearTextColorForDate(it.next());
        }
    }

    public HashMap<a, Integer> getBackgroundForDateTimeMap() {
        return this.backgroundForDateTimeMap;
    }

    public HashMap<String, Object> getCaldroidData() {
        this.caldroidData.clear();
        this.caldroidData.put(DISABLE_DATES, this.disableDates);
        this.caldroidData.put(SELECTED_DATES, this.selectedDates);
        this.caldroidData.put(_MIN_DATE_TIME, this.minDateTime);
        this.caldroidData.put(_MAX_DATE_TIME, this.maxDateTime);
        this.caldroidData.put(START_DAY_OF_WEEK, Integer.valueOf(this.startDayOfWeek));
        this.caldroidData.put(SIX_WEEKS_IN_CALENDAR, Boolean.valueOf(this.sixWeeksInCalendar));
        this.caldroidData.put(SQUARE_TEXT_VIEW_CELL, Boolean.valueOf(this.squareTextViewCell));
        this.caldroidData.put(THEME_RESOURCE, Integer.valueOf(this.themeResource));
        this.caldroidData.put(_BACKGROUND_FOR_DATETIME_MAP, this.backgroundForDateTimeMap);
        this.caldroidData.put(_TEXT_COLOR_FOR_DATETIME_MAP, this.textColorForDateTimeMap);
        return this.caldroidData;
    }

    public CaldroidListener getCaldroidListener() {
        return this.caldroidListener;
    }

    public int getCurrentVirtualPosition() {
        return this.pageChangeListener.getCurrent(this.dateViewPager.getCurrentItem());
    }

    public AdapterView.OnItemClickListener getDateItemClickListener() {
        if (this.dateItemClickListener == null) {
            this.dateItemClickListener = new AdapterView.OnItemClickListener() { // from class: com.roomorama.caldroid.CaldroidFragment.1
                @Override // android.widget.AdapterView.OnItemClickListener
                public void onItemClick(AdapterView<?> adapterView, View view2, int i14, long j8) {
                    a aVar = CaldroidFragment.this.dateInMonthsList.get(i14);
                    if (CaldroidFragment.this.caldroidListener != null) {
                        CaldroidFragment caldroidFragment = CaldroidFragment.this;
                        if (!caldroidFragment.enableClickOnDisabledDates) {
                            a aVar2 = caldroidFragment.minDateTime;
                            if (aVar2 != null && aVar.r(aVar2)) {
                                return;
                            }
                            a aVar3 = CaldroidFragment.this.maxDateTime;
                            if (aVar3 != null && aVar.o(aVar3)) {
                                return;
                            }
                            ArrayList<a> arrayList = CaldroidFragment.this.disableDates;
                            if (arrayList != null && arrayList.indexOf(aVar) != -1) {
                                return;
                            }
                        }
                        CaldroidFragment.this.caldroidListener.onSelectDate(CalendarHelper.convertDateTimeToDate(aVar), view2);
                    }
                }
            };
        }
        return this.dateItemClickListener;
    }

    public AdapterView.OnItemLongClickListener getDateItemLongClickListener() {
        if (this.dateItemLongClickListener == null) {
            this.dateItemLongClickListener = new AdapterView.OnItemLongClickListener() { // from class: com.roomorama.caldroid.CaldroidFragment.2
                @Override // android.widget.AdapterView.OnItemLongClickListener
                public boolean onItemLongClick(AdapterView<?> adapterView, View view2, int i14, long j8) {
                    a aVar = CaldroidFragment.this.dateInMonthsList.get(i14);
                    if (CaldroidFragment.this.caldroidListener == null) {
                        return true;
                    }
                    CaldroidFragment caldroidFragment = CaldroidFragment.this;
                    if (!caldroidFragment.enableClickOnDisabledDates) {
                        a aVar2 = caldroidFragment.minDateTime;
                        if (aVar2 != null && aVar.r(aVar2)) {
                            return false;
                        }
                        a aVar3 = CaldroidFragment.this.maxDateTime;
                        if (aVar3 != null && aVar.o(aVar3)) {
                            return false;
                        }
                        ArrayList<a> arrayList = CaldroidFragment.this.disableDates;
                        if (arrayList != null && arrayList.indexOf(aVar) != -1) {
                            return false;
                        }
                    }
                    CaldroidFragment.this.caldroidListener.onLongClickDate(CalendarHelper.convertDateTimeToDate(aVar), view2);
                    return true;
                }
            };
        }
        return this.dateItemLongClickListener;
    }

    public ArrayList<CaldroidGridAdapter> getDatePagerAdapters() {
        return this.datePagerAdapters;
    }

    public b getDateViewPager() {
        return this.dateViewPager;
    }

    public ArrayList<String> getDaysOfWeek() {
        ArrayList<String> arrayList = new ArrayList<>();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("EEE", Locale.getDefault());
        a aVarS = new a(2013, 2, 17, 0, 0, 0, 0).s(Integer.valueOf(this.startDayOfWeek - SUNDAY));
        for (int i14 = 0; i14 < 7; i14++) {
            arrayList.add(simpleDateFormat.format(CalendarHelper.convertDateTimeToDate(aVarS)).toUpperCase());
            aVarS = aVarS.s(1);
        }
        return arrayList;
    }

    public HashMap<String, Object> getExtraData() {
        return this.extraData;
    }

    public ArrayList<DateGridFragment> getFragments() {
        return this.fragments;
    }

    public int getGridViewRes() {
        return R.layout.date_grid_fragment;
    }

    public Button getLeftArrowButton() {
        return this.leftArrowButton;
    }

    public TextView getMonthTitleTextView() {
        return this.monthTitleTextView;
    }

    public CaldroidGridAdapter getNewDatesGridAdapter(int i14, int i15) {
        return new CaldroidGridAdapter(getActivity(), i14, i15, getCaldroidData(), this.extraData);
    }

    public WeekdayArrayAdapter getNewWeekdayAdapter() {
        return new WeekdayArrayAdapter(getActivity(), android.R.layout.simple_list_item_1, getDaysOfWeek());
    }

    public Button getRightArrowButton() {
        return this.rightArrowButton;
    }

    public Bundle getSavedStates() {
        Bundle bundle = new Bundle();
        bundle.putInt(MONTH, this.month);
        bundle.putInt(YEAR, this.year);
        String str = this.dialogTitle;
        if (str != null) {
            bundle.putString(DIALOG_TITLE, str);
        }
        ArrayList<a> arrayList = this.selectedDates;
        if (arrayList != null && arrayList.size() > 0) {
            bundle.putStringArrayList(SELECTED_DATES, CalendarHelper.convertToStringList(this.selectedDates));
        }
        ArrayList<a> arrayList2 = this.disableDates;
        if (arrayList2 != null && arrayList2.size() > 0) {
            bundle.putStringArrayList(DISABLE_DATES, CalendarHelper.convertToStringList(this.disableDates));
        }
        a aVar = this.minDateTime;
        if (aVar != null) {
            bundle.putString(MIN_DATE, aVar.i("YYYY-MM-DD"));
        }
        a aVar2 = this.maxDateTime;
        if (aVar2 != null) {
            bundle.putString(MAX_DATE, aVar2.i("YYYY-MM-DD"));
        }
        bundle.putBoolean(SHOW_NAVIGATION_ARROWS, this.showNavigationArrows);
        bundle.putBoolean(ENABLE_SWIPE, this.enableSwipe);
        bundle.putInt(START_DAY_OF_WEEK, this.startDayOfWeek);
        bundle.putBoolean(SIX_WEEKS_IN_CALENDAR, this.sixWeeksInCalendar);
        bundle.putInt(THEME_RESOURCE, this.themeResource);
        return bundle;
    }

    public HashMap<a, Integer> getTextColorForDateTimeMap() {
        return this.textColorForDateTimeMap;
    }

    public int getThemeResource() {
        return this.themeResource;
    }

    public GridView getWeekdayGridView() {
        return this.weekdayGridView;
    }

    public boolean isEnableSwipe() {
        return this.enableSwipe;
    }

    public boolean isShowNavigationArrows() {
        return this.showNavigationArrows;
    }

    public boolean isSixWeeksInCalendar() {
        return this.sixWeeksInCalendar;
    }

    public void moveToDate(Date date) {
        moveToDateTime(CalendarHelper.convertDateToDateTime(date));
    }

    public void moveToDateTime(a aVar) {
        a aVar2 = new a(Integer.valueOf(this.year), Integer.valueOf(this.month), 1, 0, 0, 0, 0);
        aVar2.f();
        aVar2.f();
        Integer numL = a.l(aVar2.f80659b, aVar2.f80660c);
        numL.intValue();
        aVar2.f();
        a aVar3 = new a(aVar2.f80659b, aVar2.f80660c, numL, 23, 59, 59, 999999999);
        if (aVar.r(aVar2)) {
            this.pageChangeListener.setCurrentDateTime(new c(aVar, a.EnumC1610a.LastDay).b(true, 0, 1, 0, 0, 0, 0, 0));
            int currentItem = this.dateViewPager.getCurrentItem();
            this.pageChangeListener.refreshAdapters(currentItem);
            this.dateViewPager.setCurrentItem(currentItem - 1);
            return;
        }
        if (aVar.o(aVar3)) {
            this.pageChangeListener.setCurrentDateTime(new c(aVar, a.EnumC1610a.LastDay).b(false, 0, 1, 0, 0, 0, 0, 0));
            int currentItem2 = this.dateViewPager.getCurrentItem();
            this.pageChangeListener.refreshAdapters(currentItem2);
            this.dateViewPager.setCurrentItem(currentItem2 + 1);
        }
    }

    public void nextMonth() {
        this.dateViewPager.setCurrentItem(this.pageChangeListener.getCurrentPage() + 1);
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        retrieveInitialArgs();
        if (getDialog() != null) {
            try {
                setRetainInstance(true);
            } catch (IllegalStateException e4) {
                e4.printStackTrace();
            }
        }
        View viewInflate = getLayoutInflater(getActivity(), layoutInflater, this.themeResource).inflate(R.layout.calendar_view, viewGroup, false);
        this.monthTitleTextView = (TextView) viewInflate.findViewById(R.id.calendar_month_year_textview);
        this.leftArrowButton = (Button) viewInflate.findViewById(R.id.calendar_left_arrow);
        this.rightArrowButton = (Button) viewInflate.findViewById(R.id.calendar_right_arrow);
        this.leftArrowButton.setOnClickListener(new View.OnClickListener() { // from class: com.roomorama.caldroid.CaldroidFragment.3
            @Override // android.view.View.OnClickListener
            public void onClick(View view2) {
                CaldroidFragment.this.prevMonth();
            }
        });
        this.rightArrowButton.setOnClickListener(new View.OnClickListener() { // from class: com.roomorama.caldroid.CaldroidFragment.4
            @Override // android.view.View.OnClickListener
            public void onClick(View view2) {
                CaldroidFragment.this.nextMonth();
            }
        });
        setShowNavigationArrows(this.showNavigationArrows);
        this.weekdayGridView = (GridView) viewInflate.findViewById(R.id.weekday_gridview);
        this.weekdayGridView.setAdapter((ListAdapter) getNewWeekdayAdapter());
        setupDateGridPages(viewInflate);
        refreshView();
        return viewInflate;
    }

    @Override // androidx.fragment.app.i, androidx.fragment.app.Fragment
    public void onDestroyView() {
        if (getDialog() != null && getRetainInstance()) {
            getDialog().setDismissMessage(null);
        }
        super.onDestroyView();
    }

    @Override // androidx.fragment.app.i, androidx.fragment.app.Fragment
    public void onDetach() {
        super.onDetach();
        try {
            Field declaredField = Fragment.class.getDeclaredField("mChildFragmentManager");
            declaredField.setAccessible(true);
            declaredField.set(this, null);
        } catch (IllegalAccessException e4) {
            o2.c.p(e4);
        } catch (NoSuchFieldException e14) {
            o2.c.p(e14);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view2, Bundle bundle) {
        super.onViewCreated(view2, bundle);
        CaldroidListener caldroidListener = this.caldroidListener;
        if (caldroidListener != null) {
            caldroidListener.onCaldroidViewCreated();
        }
    }

    public void prevMonth() {
        this.dateViewPager.setCurrentItem(this.pageChangeListener.getCurrentPage() - 1);
    }

    public void refreshMonthTitleTextView() {
        Time time = this.firstMonthTime;
        time.year = this.year;
        time.month = this.month - 1;
        time.monthDay = 1;
        long millis = time.toMillis(true);
        this.monthYearStringBuilder.setLength(0);
        this.monthTitleTextView.setText(DateUtils.formatDateRange(getActivity(), this.monthYearFormatter, millis, millis, 52).toString().toUpperCase(Locale.getDefault()));
    }

    public void refreshView() {
        if (this.month == -1 || this.year == -1) {
            return;
        }
        refreshMonthTitleTextView();
        for (CaldroidGridAdapter caldroidGridAdapter : this.datePagerAdapters) {
            caldroidGridAdapter.setCaldroidData(getCaldroidData());
            caldroidGridAdapter.setExtraData(this.extraData);
            caldroidGridAdapter.updateToday();
            caldroidGridAdapter.notifyDataSetChanged();
        }
    }

    public void restoreDialogStatesFromKey(v vVar, Bundle bundle, String str, String str2) {
        restoreStatesFromKey(bundle, str);
        CaldroidFragment caldroidFragment = (CaldroidFragment) vVar.G(str2);
        if (caldroidFragment != null) {
            caldroidFragment.dismiss();
            show(vVar, str2);
        }
    }

    public void restoreStatesFromKey(Bundle bundle, String str) {
        if (bundle == null || !bundle.containsKey(str)) {
            return;
        }
        setArguments(bundle.getBundle(str));
    }

    public void retrieveInitialArgs() {
        Bundle arguments = getArguments();
        if (arguments != null) {
            this.month = arguments.getInt(MONTH, -1);
            this.year = arguments.getInt(YEAR, -1);
            this.dialogTitle = arguments.getString(DIALOG_TITLE);
            Dialog dialog = getDialog();
            if (dialog != null) {
                String str = this.dialogTitle;
                if (str != null) {
                    dialog.setTitle(str);
                } else {
                    dialog.requestWindowFeature(1);
                }
            }
            int i14 = arguments.getInt(START_DAY_OF_WEEK, 1);
            this.startDayOfWeek = i14;
            if (i14 > 7) {
                this.startDayOfWeek = i14 % 7;
            }
            this.showNavigationArrows = arguments.getBoolean(SHOW_NAVIGATION_ARROWS, true);
            this.enableSwipe = arguments.getBoolean(ENABLE_SWIPE, true);
            this.sixWeeksInCalendar = arguments.getBoolean(SIX_WEEKS_IN_CALENDAR, true);
            if (getResources().getConfiguration().orientation == 1) {
                this.squareTextViewCell = arguments.getBoolean(SQUARE_TEXT_VIEW_CELL, true);
            } else {
                this.squareTextViewCell = arguments.getBoolean(SQUARE_TEXT_VIEW_CELL, false);
            }
            this.enableClickOnDisabledDates = arguments.getBoolean(ENABLE_CLICK_ON_DISABLED_DATES, false);
            ArrayList<String> stringArrayList = arguments.getStringArrayList(DISABLE_DATES);
            if (stringArrayList != null && stringArrayList.size() > 0) {
                this.disableDates.clear();
                Iterator<String> it = stringArrayList.iterator();
                while (it.hasNext()) {
                    this.disableDates.add(CalendarHelper.getDateTimeFromString(it.next(), "yyyy-MM-dd"));
                }
            }
            ArrayList<String> stringArrayList2 = arguments.getStringArrayList(SELECTED_DATES);
            if (stringArrayList2 != null && stringArrayList2.size() > 0) {
                this.selectedDates.clear();
                Iterator<String> it3 = stringArrayList2.iterator();
                while (it3.hasNext()) {
                    this.selectedDates.add(CalendarHelper.getDateTimeFromString(it3.next(), "yyyy-MM-dd"));
                }
            }
            String string = arguments.getString(MIN_DATE);
            if (string != null) {
                this.minDateTime = CalendarHelper.getDateTimeFromString(string, null);
            }
            String string2 = arguments.getString(MAX_DATE);
            if (string2 != null) {
                this.maxDateTime = CalendarHelper.getDateTimeFromString(string2, null);
            }
            this.themeResource = arguments.getInt(THEME_RESOURCE, R.style.CaldroidDefault);
        }
        if (this.month == -1 || this.year == -1) {
            a aVarT = a.h(System.currentTimeMillis(), TimeZone.getDefault()).t(a.d.DAY);
            aVarT.g();
            this.month = aVarT.f80660c.intValue();
            aVarT.g();
            this.year = aVarT.f80659b.intValue();
        }
    }

    public void saveStatesToKey(Bundle bundle, String str) {
        bundle.putBundle(str, getSavedStates());
    }

    public void setBackgroundResourceForDate(int i14, Date date) {
        this.backgroundForDateTimeMap.put(CalendarHelper.convertDateToDateTime(date), Integer.valueOf(i14));
    }

    public void setBackgroundResourceForDateTime(int i14, a aVar) {
        this.backgroundForDateTimeMap.put(aVar, Integer.valueOf(i14));
    }

    public void setBackgroundResourceForDateTimes(HashMap<a, Integer> map) {
        this.backgroundForDateTimeMap.putAll(map);
    }

    public void setBackgroundResourceForDates(HashMap<Date, Integer> map) {
        if (map == null || map.size() == 0) {
            return;
        }
        this.backgroundForDateTimeMap.clear();
        for (Date date : map.keySet()) {
            Integer num = map.get(date);
            this.backgroundForDateTimeMap.put(CalendarHelper.convertDateToDateTime(date), num);
        }
    }

    public void setCaldroidListener(CaldroidListener caldroidListener) {
        this.caldroidListener = caldroidListener;
    }

    public void setCalendarDate(Date date) {
        setCalendarDateTime(CalendarHelper.convertDateToDateTime(date));
    }

    public void setCalendarDateTime(a aVar) {
        aVar.g();
        this.month = aVar.f80660c.intValue();
        aVar.g();
        int iIntValue = aVar.f80659b.intValue();
        this.year = iIntValue;
        CaldroidListener caldroidListener = this.caldroidListener;
        if (caldroidListener != null) {
            caldroidListener.onChangeMonth(this.month, iIntValue);
        }
        refreshView();
    }

    public void setDisableDates(ArrayList<Date> arrayList) {
        if (arrayList == null || arrayList.size() == 0) {
            return;
        }
        this.disableDates.clear();
        Iterator<Date> it = arrayList.iterator();
        while (it.hasNext()) {
            this.disableDates.add(CalendarHelper.convertDateToDateTime(it.next()));
        }
    }

    public void setDisableDatesFromString(ArrayList<String> arrayList, String str) {
        if (arrayList == null) {
            return;
        }
        this.disableDates.clear();
        Iterator<String> it = arrayList.iterator();
        while (it.hasNext()) {
            this.disableDates.add(CalendarHelper.getDateTimeFromString(it.next(), str));
        }
    }

    public void setEnableSwipe(boolean z14) {
        this.enableSwipe = z14;
        this.dateViewPager.setEnabled(z14);
    }

    public void setExtraData(HashMap<String, Object> map) {
        this.extraData = map;
    }

    public void setMaxDate(Date date) {
        if (date == null) {
            this.maxDateTime = null;
        } else {
            this.maxDateTime = CalendarHelper.convertDateToDateTime(date);
        }
    }

    public void setMaxDateFromString(String str, String str2) {
        if (str == null) {
            setMaxDate(null);
        } else {
            this.maxDateTime = CalendarHelper.getDateTimeFromString(str, str2);
        }
    }

    public void setMinDate(Date date) {
        if (date == null) {
            this.minDateTime = null;
        } else {
            this.minDateTime = CalendarHelper.convertDateToDateTime(date);
        }
    }

    public void setMinDateFromString(String str, String str2) {
        if (str == null) {
            setMinDate(null);
        } else {
            this.minDateTime = CalendarHelper.getDateTimeFromString(str, str2);
        }
    }

    public void setMonthTitleTextView(TextView textView) {
        this.monthTitleTextView = textView;
    }

    public void setSelectedDateStrings(String str, String str2, String str3) {
        setSelectedDates(CalendarHelper.getDateFromString(str, str3), CalendarHelper.getDateFromString(str2, str3));
    }

    public void setSelectedDates(Date date, Date date2) {
        if (date == null || date2 == null || date.after(date2)) {
            return;
        }
        this.selectedDates.clear();
        a aVarConvertDateToDateTime = CalendarHelper.convertDateToDateTime(date);
        a aVarConvertDateToDateTime2 = CalendarHelper.convertDateToDateTime(date2);
        while (true) {
            boolean zR = aVarConvertDateToDateTime.r(aVarConvertDateToDateTime2);
            ArrayList<a> arrayList = this.selectedDates;
            if (!zR) {
                arrayList.add(aVarConvertDateToDateTime2);
                return;
            } else {
                arrayList.add(aVarConvertDateToDateTime);
                aVarConvertDateToDateTime = aVarConvertDateToDateTime.s(1);
            }
        }
    }

    public void setShowNavigationArrows(boolean z14) {
        this.showNavigationArrows = z14;
        Button button = this.leftArrowButton;
        if (z14) {
            button.setVisibility(0);
            this.rightArrowButton.setVisibility(0);
        } else {
            button.setVisibility(4);
            this.rightArrowButton.setVisibility(4);
        }
    }

    public void setSixWeeksInCalendar(boolean z14) {
        this.sixWeeksInCalendar = z14;
        this.dateViewPager.setSixWeeksInCalendar(z14);
    }

    public void setTextColorForDate(int i14, Date date) {
        this.textColorForDateTimeMap.put(CalendarHelper.convertDateToDateTime(date), Integer.valueOf(i14));
    }

    public void setTextColorForDateTime(int i14, a aVar) {
        this.textColorForDateTimeMap.put(aVar, Integer.valueOf(i14));
    }

    public void setTextColorForDateTimes(HashMap<a, Integer> map) {
        this.textColorForDateTimeMap.putAll(map);
    }

    public void setTextColorForDates(HashMap<Date, Integer> map) {
        if (map == null || map.size() == 0) {
            return;
        }
        this.textColorForDateTimeMap.clear();
        for (Date date : map.keySet()) {
            Integer num = map.get(date);
            this.textColorForDateTimeMap.put(CalendarHelper.convertDateToDateTime(date), num);
        }
    }

    public void setThemeResource(int i14) {
        this.themeResource = i14;
    }

    public void setDisableDatesFromString(ArrayList<String> arrayList) {
        setDisableDatesFromString(arrayList, null);
    }
}
