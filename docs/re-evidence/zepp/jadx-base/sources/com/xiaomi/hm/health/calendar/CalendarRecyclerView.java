package com.xiaomi.hm.health.calendar;

import android.content.Context;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.widget.CheckBox;
import android.widget.LinearLayout;
import androidx.annotation.Nullable;
import androidx.core.content.ContextCompat;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.huami.widget.typeface.Font;
import com.huami.widget.typeface.TypefaceSpanUtils;
import com.xiaomi.hm.health.calendar.adapter.CommonRecycleAdapter;
import com.xiaomi.hm.health.calendar.adapter.CommonViewHolder;
import com.xiaomi.hm.health.calendar.utils.CalendarDateUtils;
import com.xiaomi.hm.health.calendar.utils.DateBeanWrapper;
import com.xiaomi.hm.health.calendar.utils.DateSingleInstance;
import com.xiaomi.hm.health.databases.model.trainning.TrainingCourseItem;
import com.xiaomi.hm.health.traininglib.util.TrainingDateUtils;
import java.util.List;

/* JADX INFO: loaded from: classes20.dex */
public class CalendarRecyclerView extends RecyclerView {
    private int a;
    private int b;
    private boolean c;
    private CommonRecycleAdapter<DateBeanWrapper<TrainingCourseItem>> d;
    private CommonRecycleAdapter<DateBeanWrapper<TrainingCourseItem>> e;

    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            CalendarRecyclerView calendarRecyclerView = CalendarRecyclerView.this;
            calendarRecyclerView.setMinimumHeight(calendarRecyclerView.a);
        }
    }

    public class b extends CommonRecycleAdapter<DateBeanWrapper<TrainingCourseItem>> {
        public final /* synthetic */ List d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(int i, int i2, List list, List list2) {
            super(i, i2, list);
            this.d = list2;
        }

        @Override // com.xiaomi.hm.health.calendar.adapter.CommonRecycleAdapter
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void bindViewHolder(CommonViewHolder commonViewHolder, DateBeanWrapper<TrainingCourseItem> dateBeanWrapper) {
            if (dateBeanWrapper == null) {
                commonViewHolder.setVisibility(R.id.imv_point, 8);
                return;
            }
            int day = CalendarDateUtils.getDay(dateBeanWrapper);
            int adapterPosition = commonViewHolder.getAdapterPosition();
            if (adapterPosition == 0 || day == 1) {
                int i = R.id.tx_month;
                commonViewHolder.setVisibility(i, 0);
                commonViewHolder.setText(i, CalendarRecyclerView.this.getContext().getString(R.string.x_month, Integer.valueOf(CalendarDateUtils.getMonth(dateBeanWrapper))));
            } else if (CalendarDateUtils.containsNewMonth(this.d, adapterPosition)) {
                commonViewHolder.setVisibility(R.id.tx_month, 4);
            } else {
                commonViewHolder.setVisibility(R.id.tx_month, 8);
            }
            CalendarRecyclerView.this.f(commonViewHolder, dateBeanWrapper, day);
        }

        @Override // com.xiaomi.hm.health.calendar.adapter.CommonRecycleAdapter
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public void onItemClick(DateBeanWrapper<TrainingCourseItem> dateBeanWrapper, int i) {
            if (dateBeanWrapper.isBeforeFirst() || dateBeanWrapper.isAfterLast() || !CalendarRecyclerView.this.c) {
                return;
            }
            DateSingleInstance.getInstance().setChooseDateWrapper(dateBeanWrapper, true);
            notifyDataSetChanged();
        }
    }

    public class c extends CommonRecycleAdapter<DateBeanWrapper<TrainingCourseItem>> {
        public c(int i, int i2, List list) {
            super(i, i2, list);
        }

        @Override // com.xiaomi.hm.health.calendar.adapter.CommonRecycleAdapter
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void bindViewHolder(CommonViewHolder commonViewHolder, DateBeanWrapper<TrainingCourseItem> dateBeanWrapper) {
            if (dateBeanWrapper == null) {
                commonViewHolder.setVisibility(R.id.imv_point, 8);
            } else {
                CalendarRecyclerView.this.f(commonViewHolder, dateBeanWrapper, CalendarDateUtils.getDay(dateBeanWrapper));
            }
        }

        @Override // com.xiaomi.hm.health.calendar.adapter.CommonRecycleAdapter
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public void onItemClick(DateBeanWrapper<TrainingCourseItem> dateBeanWrapper, int i) {
            if (dateBeanWrapper.isBeforeFirst() || dateBeanWrapper.isAfterLast()) {
                return;
            }
            DateSingleInstance.getInstance().setChooseDateWrapper(dateBeanWrapper, false);
            notifyDataSetChanged();
            DateSingleInstance.getInstance().getOnWeekDayChangeListener().onWeekDayChange();
        }
    }

    public CalendarRecyclerView(Context context, List<DateBeanWrapper<TrainingCourseItem>> list) {
        this(context, null, 0);
        CommonRecycleAdapter<DateBeanWrapper<TrainingCourseItem>> commonRecycleAdapterE = e(list);
        this.e = commonRecycleAdapterE;
        setAdapter(commonRecycleAdapterE);
        post(new a());
    }

    private CommonRecycleAdapter<DateBeanWrapper<TrainingCourseItem>> d(List<DateBeanWrapper<TrainingCourseItem>> list) {
        return new b(R.layout.item_tr_calendar, R.id.ll_calendar_item, list, list);
    }

    private CommonRecycleAdapter<DateBeanWrapper<TrainingCourseItem>> e(List<DateBeanWrapper<TrainingCourseItem>> list) {
        return new c(R.layout.item_tr_calendar, R.id.ll_calendar_item, list);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void f(CommonViewHolder commonViewHolder, DateBeanWrapper<TrainingCourseItem> dateBeanWrapper, int i) {
        int i2 = R.id.cbx_date;
        ((CheckBox) commonViewHolder.getView(i2)).setText(TypefaceSpanUtils.getStyledDigitsSpannableStringBuilder(String.valueOf(i), getContext(), Font.KM, Integer.valueOf((int) TypedValue.applyDimension(2, 15.0f, getResources().getDisplayMetrics())), null));
        commonViewHolder.setBackgroundColor(i2, ContextCompat.getColor(getContext(), R.color.transparent));
        int i3 = R.id.imv_point;
        commonViewHolder.setVisibility(i3, 8);
        if (this.c) {
            commonViewHolder.getView(R.id.ll_calendar_item).setClickable(false);
        }
        if (dateBeanWrapper.isBeforeFirst() || dateBeanWrapper.isAfterLast()) {
            commonViewHolder.setTextColorRes(i2, R.color.s3);
            commonViewHolder.getView(R.id.ll_calendar_item).setClickable(false);
            return;
        }
        int i4 = R.color.s1;
        commonViewHolder.setTextColorRes(i2, i4);
        TrainingCourseItem extraData = dateBeanWrapper.getExtraData();
        if (extraData != null) {
            Long l = extraData.trainingId;
            if (l != null && l.longValue() > 0) {
                commonViewHolder.setBackgroundResource(i2, R.drawable.calendar_orange);
                if (extraData.isFinished.booleanValue()) {
                    commonViewHolder.setVisibility(i3, 0);
                    commonViewHolder.setImageResource(i3, R.drawable.cl_checked);
                } else if (TrainingDateUtils.isAfterDay(TrainingDateUtils.getNow(), dateBeanWrapper.getDate())) {
                    commonViewHolder.setVisibility(i3, 0);
                    commonViewHolder.setImageResource(i3, R.drawable.cl_unchecked);
                }
            } else if (dateBeanWrapper.isWaitingDay()) {
                commonViewHolder.setBackgroundResource(i2, R.drawable.calendar_waiting_bg);
            } else {
                commonViewHolder.setBackgroundResource(i2, R.drawable.calendar_gray);
            }
        }
        if (TrainingDateUtils.isSameDay(dateBeanWrapper.getDate(), DateSingleInstance.getInstance().getChooseDate())) {
            commonViewHolder.setChecked(i2, true);
            commonViewHolder.setTextColorRes(i2, R.color.calendar_text_color_white);
        } else {
            commonViewHolder.setChecked(i2, false);
            commonViewHolder.setTextColorRes(i2, i4);
        }
    }

    public int getCalHeight() {
        DateSingleInstance dateSingleInstance = DateSingleInstance.getInstance();
        return (dateSingleInstance.getWeekCount() * this.a) + (dateSingleInstance.getMonthTitleCount() * this.b);
    }

    public int getCanScrollHeight() {
        DateSingleInstance dateSingleInstance = DateSingleInstance.getInstance();
        return (dateSingleInstance.getCanScrollWeekCount() * this.a) + (dateSingleInstance.getCanScrollMonthTitleCount() * this.b);
    }

    public void gotoToday() {
        DateSingleInstance.getInstance().setChooseDate(TrainingDateUtils.getNow());
        this.d.notifyDataSetChanged();
    }

    public void setCanItemClick(boolean z) {
        this.c = z;
    }

    public void setDateWrapperList(List<DateBeanWrapper<TrainingCourseItem>> list) {
        DateSingleInstance.getInstance().setDateWrapperList(list);
        setLayoutParams(new LinearLayout.LayoutParams(-1, getCalHeight()));
        CommonRecycleAdapter<DateBeanWrapper<TrainingCourseItem>> commonRecycleAdapterD = d(list);
        this.d = commonRecycleAdapterD;
        setAdapter(commonRecycleAdapterD);
        requestLayout();
    }

    public CalendarRecyclerView(Context context) {
        this(context, null, 0);
    }

    public CalendarRecyclerView(Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public CalendarRecyclerView(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.c = true;
        setNestedScrollingEnabled(false);
        GridLayoutManager gridLayoutManager = new GridLayoutManager(context, 7, 1, false);
        gridLayoutManager.setSmoothScrollbarEnabled(false);
        setLayoutManager(gridLayoutManager);
        setHasFixedSize(true);
        this.a = getResources().getDimensionPixelOffset(R.dimen.calender_item_size);
        this.b = getResources().getDimensionPixelOffset(R.dimen.calender_month_size);
    }
}
