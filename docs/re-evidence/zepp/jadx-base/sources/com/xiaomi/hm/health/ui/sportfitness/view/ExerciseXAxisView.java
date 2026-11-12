package com.xiaomi.hm.health.ui.sportfitness.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.huami.watch.hmwatchmanager.R;
import com.huami.watch.util.I18nUtil;
import com.xiaomi.hm.health.baseutil.TimeUtils;
import java.util.Calendar;

/* JADX INFO: loaded from: classes22.dex */
public class ExerciseXAxisView extends RelativeLayout {
    private LinearLayout a;
    private LinearLayout b;
    private LinearLayout c;

    public ExerciseXAxisView(Context context) {
        this(context, null);
    }

    private void a(Context context) {
        LayoutInflater.from(context).inflate(R.layout.view_calori_x_axis, this);
        this.a = (LinearLayout) findViewById(R.id.day_xaxis_layout);
        this.b = (LinearLayout) findViewById(R.id.week_xaxis_layout);
        this.c = (LinearLayout) findViewById(R.id.month_xaxis_layout);
    }

    public void setDayBorder() {
        this.a.setVisibility(0);
        this.b.setVisibility(8);
        this.c.setVisibility(8);
        int childCount = this.a.getChildCount();
        String[] stringArray = getResources().getStringArray(R.array.exercise_day_chart_x);
        int i = 0;
        for (int i2 = 0; i2 < childCount; i2++) {
            if (this.a.getChildAt(i2) instanceof TextView) {
                ((TextView) this.a.getChildAt(i2)).setText(stringArray[i]);
                i++;
            }
        }
    }

    public void setMonthBorder(long time, float barWidth) {
        this.a.setVisibility(8);
        this.b.setVisibility(8);
        this.c.setVisibility(0);
        TextView textView = (TextView) this.c.findViewById(R.id.month_xaxis_start);
        TextView textView2 = (TextView) this.c.findViewById(R.id.month_xaxis_10);
        TextView textView3 = (TextView) this.c.findViewById(R.id.month_xaxis_20);
        TextView textView4 = (TextView) this.c.findViewById(R.id.month_xaxis_end);
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(time);
        int actualMaximum = calendar.getActualMaximum(5);
        calendar.set(5, 1);
        textView.setText(TimeUtils.formatDate_no_y(getContext(), calendar.getTime(), true));
        calendar.set(5, 10);
        textView2.setText(TimeUtils.formatDate_no_y(getContext(), calendar.getTime(), true));
        calendar.set(5, 20);
        textView3.setText(TimeUtils.formatDate_no_y(getContext(), calendar.getTime(), true));
        calendar.set(5, actualMaximum);
        textView4.setText(TimeUtils.formatDate_no_y(getContext(), calendar.getTime(), true));
    }

    public void setWeekBorder(long startTime, long endTime) {
        this.a.setVisibility(8);
        this.b.setVisibility(0);
        this.c.setVisibility(8);
        int childCount = this.b.getChildCount();
        String[] stringArray = I18nUtil.isZh(getContext()) ? getResources().getStringArray(R.array.weeks) : getResources().getStringArray(R.array.weeks_short);
        int i = 0;
        for (int i2 = 0; i2 < childCount; i2++) {
            if (this.b.getChildAt(i2) instanceof TextView) {
                ((TextView) this.b.getChildAt(i2)).setText(stringArray[i]);
                i++;
            }
        }
    }

    public ExerciseXAxisView(Context context, AttributeSet attrs) {
        this(context, attrs, 0);
    }

    public ExerciseXAxisView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        a(context);
    }
}
