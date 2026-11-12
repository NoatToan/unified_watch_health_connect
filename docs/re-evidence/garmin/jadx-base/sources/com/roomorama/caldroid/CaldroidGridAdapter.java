package com.roomorama.caldroid;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import com.garmin.android.apps.connectmobile.R;
import h03.a;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
public class CaldroidGridAdapter extends BaseAdapter {
    protected HashMap<String, Object> caldroidData;
    protected Context context;
    protected ArrayList<a> datetimeList;
    protected ColorStateList defaultTextColorRes;
    protected ArrayList<a> disableDates;
    protected HashMap<String, Object> extraData;
    protected a maxDateTime;
    protected a minDateTime;
    protected int month;
    protected Resources resources;
    protected ArrayList<a> selectedDates;
    protected boolean sixWeeksInCalendar;
    protected boolean squareTextViewCell;
    protected int startDayOfWeek;
    protected int themeResource;
    protected a today;
    protected int year;
    protected HashMap<a, Integer> disableDatesMap = new HashMap<>();
    protected HashMap<a, Integer> selectedDatesMap = new HashMap<>();
    protected int defaultCellBackgroundRes = -1;

    public CaldroidGridAdapter(Context context, int i14, int i15, HashMap<String, Object> map, HashMap<String, Object> map2) {
        this.month = i14;
        this.year = i15;
        this.context = context;
        this.caldroidData = map;
        this.extraData = map2;
        this.resources = context.getResources();
        populateFromCaldroidData();
    }

    private void getDefaultResources() {
        ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(this.context, this.themeResource);
        Resources.Theme theme = contextThemeWrapper.getTheme();
        TypedValue typedValue = new TypedValue();
        if (this.squareTextViewCell) {
            theme.resolveAttribute(R.attr.styleCaldroidSquareCell, typedValue, true);
        } else {
            theme.resolveAttribute(R.attr.styleCaldroidNormalCell, typedValue, true);
        }
        TypedArray typedArrayObtainStyledAttributes = contextThemeWrapper.obtainStyledAttributes(typedValue.data, sj.a.f159439a);
        this.defaultCellBackgroundRes = typedArrayObtainStyledAttributes.getResourceId(1, -1);
        this.defaultTextColorRes = typedArrayObtainStyledAttributes.getColorStateList(0);
        typedArrayObtainStyledAttributes.recycle();
    }

    private void populateFromCaldroidData() {
        ArrayList<a> arrayList = (ArrayList) this.caldroidData.get(CaldroidFragment.DISABLE_DATES);
        this.disableDates = arrayList;
        if (arrayList != null) {
            this.disableDatesMap.clear();
            Iterator<a> it = this.disableDates.iterator();
            while (it.hasNext()) {
                this.disableDatesMap.put(it.next(), 1);
            }
        }
        ArrayList<a> arrayList2 = (ArrayList) this.caldroidData.get(CaldroidFragment.SELECTED_DATES);
        this.selectedDates = arrayList2;
        if (arrayList2 != null) {
            this.selectedDatesMap.clear();
            Iterator<a> it3 = this.selectedDates.iterator();
            while (it3.hasNext()) {
                this.selectedDatesMap.put(it3.next(), 1);
            }
        }
        this.minDateTime = (a) this.caldroidData.get(CaldroidFragment._MIN_DATE_TIME);
        this.maxDateTime = (a) this.caldroidData.get(CaldroidFragment._MAX_DATE_TIME);
        this.startDayOfWeek = ((Integer) this.caldroidData.get(CaldroidFragment.START_DAY_OF_WEEK)).intValue();
        this.sixWeeksInCalendar = ((Boolean) this.caldroidData.get(CaldroidFragment.SIX_WEEKS_IN_CALENDAR)).booleanValue();
        this.squareTextViewCell = ((Boolean) this.caldroidData.get(CaldroidFragment.SQUARE_TEXT_VIEW_CELL)).booleanValue();
        this.themeResource = ((Integer) this.caldroidData.get(CaldroidFragment.THEME_RESOURCE)).intValue();
        this.datetimeList = CalendarHelper.getFullWeeks(this.month, this.year, this.startDayOfWeek, this.sixWeeksInCalendar);
        getDefaultResources();
    }

    private void resetCustomResources(CellView cellView) {
        cellView.setBackgroundResource(this.defaultCellBackgroundRes);
        cellView.setTextColor(this.defaultTextColorRes);
    }

    public void customizeTextView(int i14, CellView cellView) {
        a aVar;
        int paddingTop = cellView.getPaddingTop();
        int paddingLeft = cellView.getPaddingLeft();
        int paddingBottom = cellView.getPaddingBottom();
        int paddingRight = cellView.getPaddingRight();
        a aVar2 = this.datetimeList.get(i14);
        cellView.resetCustomStates();
        resetCustomResources(cellView);
        if (aVar2.equals(getToday())) {
            cellView.addCustomState(CellView.STATE_TODAY);
        }
        aVar2.g();
        if (aVar2.f80660c.intValue() != this.month) {
            cellView.addCustomState(CellView.STATE_PREV_NEXT_MONTH);
        }
        a aVar3 = this.minDateTime;
        if ((aVar3 != null && aVar2.r(aVar3)) || (((aVar = this.maxDateTime) != null && aVar2.o(aVar)) || (this.disableDates != null && this.disableDatesMap.containsKey(aVar2)))) {
            cellView.addCustomState(CellView.STATE_DISABLED);
        }
        if (this.selectedDates != null && this.selectedDatesMap.containsKey(aVar2)) {
            cellView.addCustomState(CellView.STATE_SELECTED);
        }
        cellView.refreshDrawableState();
        StringBuilder sb3 = new StringBuilder("");
        aVar2.g();
        sb3.append(aVar2.f80661d);
        cellView.setText(sb3.toString());
        setCustomResources(aVar2, cellView, cellView);
        cellView.setPadding(paddingLeft, paddingTop, paddingRight, paddingBottom);
    }

    public HashMap<String, Object> getCaldroidData() {
        return this.caldroidData;
    }

    @Override // android.widget.Adapter
    public int getCount() {
        return this.datetimeList.size();
    }

    public ArrayList<a> getDatetimeList() {
        return this.datetimeList;
    }

    public ArrayList<a> getDisableDates() {
        return this.disableDates;
    }

    public HashMap<String, Object> getExtraData() {
        return this.extraData;
    }

    @Override // android.widget.Adapter
    public Object getItem(int i14) {
        return this.datetimeList.get(i14);
    }

    @Override // android.widget.Adapter
    public long getItemId(int i14) {
        return 0L;
    }

    public a getMaxDateTime() {
        return this.maxDateTime;
    }

    public a getMinDateTime() {
        return this.minDateTime;
    }

    public ArrayList<a> getSelectedDates() {
        return this.selectedDates;
    }

    public int getThemeResource() {
        return this.themeResource;
    }

    public a getToday() {
        if (this.today == null) {
            this.today = CalendarHelper.convertDateToDateTime(new Date());
        }
        return this.today;
    }

    @Override // android.widget.Adapter
    public View getView(int i14, View view2, ViewGroup viewGroup) {
        CellView cellView = (CellView) view2;
        LayoutInflater layoutInflater = CaldroidFragment.getLayoutInflater(this.context, (LayoutInflater) this.context.getSystemService("layout_inflater"), this.themeResource);
        if (view2 == null) {
            cellView = this.squareTextViewCell ? (CellView) layoutInflater.inflate(R.layout.square_date_cell, (ViewGroup) null) : (CellView) layoutInflater.inflate(R.layout.normal_date_cell, (ViewGroup) null);
        }
        customizeTextView(i14, cellView);
        return cellView;
    }

    public void setAdapterDateTime(a aVar) {
        aVar.g();
        this.month = aVar.f80660c.intValue();
        aVar.g();
        int iIntValue = aVar.f80659b.intValue();
        this.year = iIntValue;
        this.datetimeList = CalendarHelper.getFullWeeks(this.month, iIntValue, this.startDayOfWeek, this.sixWeeksInCalendar);
    }

    public void setCaldroidData(HashMap<String, Object> map) {
        this.caldroidData = map;
        populateFromCaldroidData();
    }

    public void setCustomResources(a aVar, View view2, TextView textView) {
        Integer num;
        Integer num2;
        HashMap map = (HashMap) this.caldroidData.get(CaldroidFragment._BACKGROUND_FOR_DATETIME_MAP);
        if (map != null && (num2 = (Integer) map.get(aVar)) != null) {
            view2.setBackgroundResource(num2.intValue());
        }
        HashMap map2 = (HashMap) this.caldroidData.get(CaldroidFragment._TEXT_COLOR_FOR_DATETIME_MAP);
        if (map2 == null || (num = (Integer) map2.get(aVar)) == null) {
            return;
        }
        textView.setTextColor(this.resources.getColor(num.intValue()));
    }

    public void setDisableDates(ArrayList<a> arrayList) {
        this.disableDates = arrayList;
    }

    public void setExtraData(HashMap<String, Object> map) {
        this.extraData = map;
    }

    public void setMaxDateTime(a aVar) {
        this.maxDateTime = aVar;
    }

    public void setMinDateTime(a aVar) {
        this.minDateTime = aVar;
    }

    public void setSelectedDates(ArrayList<a> arrayList) {
        this.selectedDates = arrayList;
    }

    public void updateToday() {
        this.today = CalendarHelper.convertDateToDateTime(new Date());
    }
}
