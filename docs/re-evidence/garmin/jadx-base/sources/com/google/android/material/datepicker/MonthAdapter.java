package com.google.android.material.datepicker;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import com.google.android.material.R;
import com.google.android.material.timepicker.TimeModel;
import java.util.Collection;
import java.util.Iterator;
import k7.d;

/* JADX INFO: loaded from: classes14.dex */
class MonthAdapter extends BaseAdapter {
    private static final int NO_DAY_NUMBER = -1;
    final CalendarConstraints calendarConstraints;
    CalendarStyle calendarStyle;
    final DateSelector<?> dateSelector;
    final DayViewDecorator dayViewDecorator;
    final Month month;
    private Collection<Long> previouslySelectedDates;
    static final int MAXIMUM_WEEKS = UtcDates.getUtcCalendar().getMaximum(4);
    private static final int MAXIMUM_GRID_CELLS = (UtcDates.getUtcCalendar().getMaximum(7) + UtcDates.getUtcCalendar().getMaximum(5)) - 1;

    public MonthAdapter(Month month, DateSelector<?> dateSelector, CalendarConstraints calendarConstraints, DayViewDecorator dayViewDecorator) {
        this.month = month;
        this.dateSelector = dateSelector;
        this.calendarConstraints = calendarConstraints;
        this.dayViewDecorator = dayViewDecorator;
        this.previouslySelectedDates = dateSelector.getSelectedDays();
    }

    private String getDayContentDescription(Context context, long j8) {
        return DateStrings.getDayContentDescription(context, j8, isToday(j8), isStartOfRange(j8), isEndOfRange(j8));
    }

    private void initializeStyles(Context context) {
        if (this.calendarStyle == null) {
            this.calendarStyle = new CalendarStyle(context);
        }
    }

    private boolean isSelected(long j8) {
        Iterator<Long> it = this.dateSelector.getSelectedDays().iterator();
        while (it.hasNext()) {
            if (UtcDates.canonicalYearMonthDay(j8) == UtcDates.canonicalYearMonthDay(it.next().longValue())) {
                return true;
            }
        }
        return false;
    }

    private boolean isToday(long j8) {
        return UtcDates.getTodayCalendar().getTimeInMillis() == j8;
    }

    private void updateSelectedState(TextView textView, long j8, int i14) {
        boolean zIsSelected;
        CalendarItemStyle calendarItemStyle;
        if (textView == null) {
            return;
        }
        Context context = textView.getContext();
        String dayContentDescription = getDayContentDescription(context, j8);
        textView.setContentDescription(dayContentDescription);
        boolean zIsValid = this.calendarConstraints.getDateValidator().isValid(j8);
        if (zIsValid) {
            textView.setEnabled(true);
            zIsSelected = isSelected(j8);
            textView.setSelected(zIsSelected);
            if (zIsSelected) {
                calendarItemStyle = this.calendarStyle.selectedDay;
            } else {
                boolean zIsToday = isToday(j8);
                CalendarStyle calendarStyle = this.calendarStyle;
                calendarItemStyle = zIsToday ? calendarStyle.todayDay : calendarStyle.day;
            }
        } else {
            zIsSelected = false;
            textView.setEnabled(false);
            calendarItemStyle = this.calendarStyle.invalidDay;
        }
        boolean z14 = zIsSelected;
        DayViewDecorator dayViewDecorator = this.dayViewDecorator;
        if (dayViewDecorator == null || i14 == -1) {
            calendarItemStyle.styleItem(textView);
            return;
        }
        Month month = this.month;
        int i15 = month.year;
        int i16 = month.month;
        calendarItemStyle.styleItem(textView, dayViewDecorator.getBackgroundColor(context, i15, i16, i14, zIsValid, z14), this.dayViewDecorator.getTextColor(context, i15, i16, i14, zIsValid, z14));
        textView.setCompoundDrawables(this.dayViewDecorator.getCompoundDrawableLeft(context, i15, i16, i14, zIsValid, z14), this.dayViewDecorator.getCompoundDrawableTop(context, i15, i16, i14, zIsValid, z14), this.dayViewDecorator.getCompoundDrawableRight(context, i15, i16, i14, zIsValid, z14), this.dayViewDecorator.getCompoundDrawableBottom(context, i15, i16, i14, zIsValid, z14));
        textView.setContentDescription(this.dayViewDecorator.getContentDescription(context, i15, i16, i14, zIsValid, z14, dayContentDescription));
    }

    private void updateSelectedStateForDate(MaterialCalendarGridView materialCalendarGridView, long j8) {
        if (Month.create(j8).equals(this.month)) {
            int dayOfMonth = this.month.getDayOfMonth(j8);
            updateSelectedState((TextView) materialCalendarGridView.getChildAt(materialCalendarGridView.getAdapter().dayToPosition(dayOfMonth) - materialCalendarGridView.getFirstVisiblePosition()), j8, dayOfMonth);
        }
    }

    public int dayToPosition(int i14) {
        return firstPositionInMonth() + (i14 - 1);
    }

    public int firstPositionInMonth() {
        return this.month.daysFromStartOfWeekToFirstOfMonth(this.calendarConstraints.getFirstDayOfWeek());
    }

    @Override // android.widget.Adapter
    public int getCount() {
        return MAXIMUM_GRID_CELLS;
    }

    @Override // android.widget.Adapter
    public Long getItem(int i14) {
        if (i14 < firstPositionInMonth() || i14 > lastPositionInMonth()) {
            return null;
        }
        return Long.valueOf(this.month.getDay(positionToDay(i14)));
    }

    @Override // android.widget.Adapter
    public long getItemId(int i14) {
        return i14 / this.month.daysInWeek;
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0054  */
    @Override // android.widget.Adapter
    public TextView getView(int i14, View view2, ViewGroup viewGroup) {
        int i15;
        initializeStyles(viewGroup.getContext());
        TextView textView = (TextView) view2;
        if (view2 == null) {
            textView = (TextView) LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.mtrl_calendar_day, viewGroup, false);
        }
        int iFirstPositionInMonth = i14 - firstPositionInMonth();
        if (iFirstPositionInMonth >= 0) {
            Month month = this.month;
            if (iFirstPositionInMonth >= month.daysInMonth) {
                textView.setVisibility(8);
                textView.setEnabled(false);
                i15 = -1;
            } else {
                i15 = iFirstPositionInMonth + 1;
                textView.setTag(month);
                textView.setText(String.format(textView.getResources().getConfiguration().locale, TimeModel.NUMBER_FORMAT, Integer.valueOf(i15)));
                textView.setVisibility(0);
                textView.setEnabled(true);
            }
        } else {
            textView.setVisibility(8);
            textView.setEnabled(false);
            i15 = -1;
        }
        Long item = getItem(i14);
        if (item == null) {
            return textView;
        }
        updateSelectedState(textView, item.longValue(), i15);
        return textView;
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public boolean hasStableIds() {
        return true;
    }

    public boolean isEndOfRange(long j8) {
        Iterator<d<Long, Long>> it = this.dateSelector.getSelectedRanges().iterator();
        while (it.hasNext()) {
            Long l14 = it.next().f103263b;
            if (l14 != null && l14.longValue() == j8) {
                return true;
            }
        }
        return false;
    }

    public boolean isFirstInRow(int i14) {
        return i14 % this.month.daysInWeek == 0;
    }

    public boolean isLastInRow(int i14) {
        return (i14 + 1) % this.month.daysInWeek == 0;
    }

    public boolean isStartOfRange(long j8) {
        Iterator<d<Long, Long>> it = this.dateSelector.getSelectedRanges().iterator();
        while (it.hasNext()) {
            Long l14 = it.next().f103262a;
            if (l14 != null && l14.longValue() == j8) {
                return true;
            }
        }
        return false;
    }

    public int lastPositionInMonth() {
        return (firstPositionInMonth() + this.month.daysInMonth) - 1;
    }

    public int positionToDay(int i14) {
        return (i14 - firstPositionInMonth()) + 1;
    }

    public void updateSelectedStates(MaterialCalendarGridView materialCalendarGridView) {
        Iterator<Long> it = this.previouslySelectedDates.iterator();
        while (it.hasNext()) {
            updateSelectedStateForDate(materialCalendarGridView, it.next().longValue());
        }
        DateSelector<?> dateSelector = this.dateSelector;
        if (dateSelector != null) {
            Iterator<Long> it3 = dateSelector.getSelectedDays().iterator();
            while (it3.hasNext()) {
                updateSelectedStateForDate(materialCalendarGridView, it3.next().longValue());
            }
            this.previouslySelectedDates = this.dateSelector.getSelectedDays();
        }
    }

    public boolean withinMonth(int i14) {
        return i14 >= firstPositionInMonth() && i14 <= lastPositionInMonth();
    }
}
