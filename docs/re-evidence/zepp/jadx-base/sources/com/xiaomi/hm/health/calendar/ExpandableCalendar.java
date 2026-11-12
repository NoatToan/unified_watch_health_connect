package com.xiaomi.hm.health.calendar;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.content.Context;
import android.util.AttributeSet;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.LinearInterpolator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.content.ContextCompat;
import com.xiaomi.hm.health.baseutil.TintUtils;
import com.xiaomi.hm.health.calendar.utils.DateBeanWrapper;
import com.xiaomi.hm.health.calendar.utils.DateSingleInstance;
import com.xiaomi.hm.health.databases.model.trainning.TrainingCourseItem;
import com.xiaomi.hm.health.traininglib.util.TrainingConfig;
import com.xiaomi.hm.health.traininglib.util.TrainingDateUtils;
import java.util.List;

/* JADX INFO: loaded from: classes20.dex */
public class ExpandableCalendar extends LinearLayout implements View.OnClickListener {
    private static final String n = "ExpandableCalendarLayou";
    private static final long o = 500;
    private ImageView a;
    private View b;
    private View c;
    private TextView d;
    private CalendarRecyclerView e;
    private CalendarWeekViewpager f;
    private boolean g;
    private int h;
    private int i;
    private boolean j;
    private boolean k;
    private boolean l;
    private OnReminderClickListener m;

    public interface OnReminderClickListener {
        void onReminderClick();
    }

    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (ExpandableCalendar.this.j) {
                ExpandableCalendar.this.r();
                return;
            }
            ExpandableCalendar.this.p();
            ExpandableCalendar.this.c.scrollTo(ExpandableCalendar.this.b.getScrollX(), ExpandableCalendar.this.e.getCanScrollHeight());
            ExpandableCalendar.this.u();
        }
    }

    public class b implements DateSingleInstance.OnWeekDayChangeListener {
        public b() {
        }

        @Override // com.xiaomi.hm.health.calendar.utils.DateSingleInstance.OnWeekDayChangeListener
        public void onWeekDayChange() {
            ExpandableCalendar.this.c.scrollTo(ExpandableCalendar.this.b.getScrollX(), ExpandableCalendar.this.e.getCanScrollHeight());
            ExpandableCalendar.this.e.getAdapter().notifyDataSetChanged();
        }
    }

    public class c implements DateSingleInstance.OnWeekDayClickListener {
        public c() {
        }

        @Override // com.xiaomi.hm.health.calendar.utils.DateSingleInstance.OnWeekDayClickListener
        public void onWeekDayClick(DateBeanWrapper<TrainingCourseItem> dateBeanWrapper) {
            ExpandableCalendar.this.f.jumpToChooseDate();
        }
    }

    public class d extends AnimatorListenerAdapter {
        public d() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            ExpandableCalendar.this.g = true;
        }
    }

    public class e implements ValueAnimator.AnimatorUpdateListener {
        public final /* synthetic */ View a;
        public final /* synthetic */ ValueAnimator b;

        public e(View view, ValueAnimator valueAnimator) {
            this.a = view;
            this.b = valueAnimator;
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            int iIntValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
            ExpandableCalendar expandableCalendar = ExpandableCalendar.this;
            expandableCalendar.t(expandableCalendar.c, iIntValue);
            int height = this.a.getHeight() + iIntValue;
            Log.d(ExpandableCalendar.n, "onAnimationUpdate  --------height:" + ExpandableCalendar.this.c.getHeight() + "     updateValue:" + iIntValue + "     calendarItemHeight:" + ExpandableCalendar.this.i + "   monthViewInitHeight:" + ExpandableCalendar.this.h);
            if (height < ExpandableCalendar.this.i) {
                height = ExpandableCalendar.this.i;
                this.b.cancel();
                ExpandableCalendar.this.u();
            } else if (height > ExpandableCalendar.this.h) {
                height = ExpandableCalendar.this.h;
                this.b.cancel();
            }
            this.a.setLayoutParams(new LinearLayout.LayoutParams(-1, height));
            this.a.requestLayout();
        }
    }

    public class f implements Runnable {
        public f() {
        }

        @Override // java.lang.Runnable
        public void run() {
            ExpandableCalendar.this.f.setVisibility(0);
            ExpandableCalendar.this.f.refreshWeekAdapter();
            ExpandableCalendar.this.c.setVisibility(8);
        }
    }

    public ExpandableCalendar(Context context) {
        this(context, null, 0);
    }

    private void m(boolean z) {
        if (this.g) {
            this.g = false;
            o(this.b, 0, z ? this.h : -this.h).start();
        }
    }

    private void n() {
        this.a = (ImageView) findViewById(R.id.imv_dragger);
        this.b = findViewById(R.id.fl_expandable);
        this.c = findViewById(R.id.ll_month);
        CalendarRecyclerView calendarRecyclerView = (CalendarRecyclerView) findViewById(R.id.crv_calendar);
        this.e = calendarRecyclerView;
        calendarRecyclerView.setCanItemClick(this.k);
        this.f = (CalendarWeekViewpager) findViewById(R.id.cwv_week);
        this.d = (TextView) findViewById(R.id.tx_reminder_time);
        findViewById(R.id.ll_training_remind).setOnClickListener(this);
        TintUtils.tintDrawable(this.a, ContextCompat.getColor(getContext(), R.color.dager_tint_gray));
    }

    @NonNull
    private ValueAnimator o(View view, int... iArr) {
        ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(iArr);
        valueAnimatorOfInt.setInterpolator(new LinearInterpolator());
        valueAnimatorOfInt.setDuration(500L).start();
        valueAnimatorOfInt.addListener(new d());
        valueAnimatorOfInt.addUpdateListener(new e(view, valueAnimatorOfInt));
        return valueAnimatorOfInt;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void p() {
        int measuredHeight = this.c.getMeasuredHeight();
        int measuredHeight2 = this.h;
        if (measuredHeight >= measuredHeight2) {
            measuredHeight2 = this.c.getMeasuredHeight();
        }
        this.h = measuredHeight2;
        this.a.setOnClickListener(this);
        this.b.setLayoutParams(new LinearLayout.LayoutParams(this.b.getWidth(), this.i));
        this.f.setLayoutParams(new FrameLayout.LayoutParams(this.b.getWidth(), this.i));
        this.f.setAutoCheckedNextWeek(false);
        DateSingleInstance.getInstance().setOnWeekDayChangeListener(new b());
        DateSingleInstance.getInstance().setOnWeekDayClickListener(new c());
        if (getVisibility() == 0) {
            s();
        }
    }

    private void q() {
        LayoutInflater.from(getContext()).inflate(R.layout.expandable_calendar, (ViewGroup) this, true);
        this.i = getResources().getDimensionPixelOffset(R.dimen.calender_item_size);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void r() {
        this.f.setVisibility(8);
        this.c.setVisibility(0);
        if (this.l) {
            return;
        }
        this.a.setVisibility(8);
    }

    private void s() {
        if (this.d == null) {
            return;
        }
        if (TrainingConfig.getPhoneEnable()) {
            this.d.setText(TrainingDateUtils.getTimeStrByIdx(getContext(), TrainingConfig.getHour(), TrainingConfig.getMinute()));
        } else {
            this.d.setText("");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void t(View view, int i) {
        int scrollY = (-i) / 2;
        int canScrollHeight = this.e.getCanScrollHeight();
        Log.d(n, "verticalSmoothScroll  calendarViewPagerMonth.getScrollY() :" + view.getScrollY() + "        canScrollHeight:" + canScrollHeight + "   distanceY:" + scrollY);
        if (scrollY > 0) {
            if (view.getScrollY() >= canScrollHeight) {
                view.scrollTo(view.getScrollX(), canScrollHeight);
                return;
            }
            if (view.getScrollY() + scrollY > canScrollHeight) {
                scrollY = canScrollHeight - view.getScrollY();
            }
            view.scrollBy(0, scrollY);
            return;
        }
        if (view.getScrollY() <= 0) {
            view.scrollTo(view.getScrollX(), 0);
            return;
        }
        if ((-scrollY) > view.getScrollY()) {
            scrollY = -view.getScrollY();
        }
        view.scrollBy(0, scrollY);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void u() {
        postDelayed(new f(), 50L);
    }

    public void gotoToday(int i) {
        this.e.gotoToday();
        this.f.jumpToChooseDate();
        this.f.setCurrentItem(i, true);
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        OnReminderClickListener onReminderClickListener;
        int id = view.getId();
        if (id != R.id.imv_dragger) {
            if (id != R.id.ll_training_remind || (onReminderClickListener = this.m) == null) {
                return;
            }
            onReminderClickListener.onReminderClick();
            return;
        }
        int height = this.b.getHeight();
        if (height == this.h) {
            m(false);
            this.f.jumpToChooseDate();
        } else if (height == this.i) {
            m(true);
            r();
        }
    }

    @Override // android.view.View
    public void onVisibilityChanged(@NonNull View view, int i) {
        if (i == 0) {
            s();
        }
        super.onVisibilityChanged(view, i);
    }

    public void setCanItemClick(boolean z) {
        this.k = z;
    }

    public void setCreateValue(List<DateBeanWrapper<TrainingCourseItem>> list, boolean z) {
        n();
        this.e.setDateWrapperList(list);
        this.j = !z;
        if (z) {
            this.a.setVisibility(0);
        } else {
            this.a.setVisibility(8);
            this.f.setVisibility(8);
        }
        post(new a());
    }

    public void setEnableDraggerWhenMonthMode(boolean z) {
        this.l = z;
    }

    public void setOnDayChangeListener(DateSingleInstance.OnDayChangeListener onDayChangeListener) {
        DateSingleInstance.getInstance().setDayChangeListener(onDayChangeListener);
    }

    public void setOnReminderClickListener(OnReminderClickListener onReminderClickListener) {
        this.m = onReminderClickListener;
    }

    public ExpandableCalendar(Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ExpandableCalendar(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.g = true;
        this.j = false;
        this.k = true;
        this.l = true;
        setOrientation(1);
        q();
    }
}
