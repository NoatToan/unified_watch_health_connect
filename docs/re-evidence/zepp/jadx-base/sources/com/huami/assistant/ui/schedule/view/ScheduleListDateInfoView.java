package com.huami.assistant.ui.schedule.view;

import android.annotation.TargetApi;
import android.content.Context;
import android.text.format.DateUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.Nullable;
import com.huami.assistant.R;
import com.huami.watch.util.DateDay;
import com.huami.watch.util.TimeUtil;

/* JADX INFO: loaded from: classes5.dex */
public class ScheduleListDateInfoView extends LinearLayout {
    private TextView a;
    private TextView b;
    private TextView c;

    public ScheduleListDateInfoView(Context context) {
        super(context);
        a(context);
    }

    private void a(Context context) {
        View.inflate(context, R.layout.view_schedule_list_date_info, this);
        this.a = (TextView) findViewById(R.id.date_info_day);
        this.b = (TextView) findViewById(R.id.date_info_date);
        this.c = (TextView) findViewById(R.id.date_info_week);
    }

    public void setTime(long time) {
        DateDay dateDayFrom = DateDay.from(time);
        this.a.setText(DateUtils.getRelativeTimeSpanString(dateDayFrom.dayStartMills(), DateDay.today().dayStartMills(), 86400000L));
        this.b.setText(DateUtils.formatDateTime(getContext(), time, 524308));
        if (dateDayFrom.equals(DateDay.today()) || dateDayFrom.equals(DateDay.today().yesterday()) || dateDayFrom.equals(DateDay.today().tomorrow())) {
            this.c.setText(DateUtils.getRelativeTimeSpanString(dateDayFrom.dayStartMills(), DateDay.today().dayStartMills(), 86400000L));
        } else {
            this.c.setText(TimeUtil.formatDateTimeByDefaultLocal(time, "EE"));
        }
    }

    public ScheduleListDateInfoView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
        a(context);
    }

    public ScheduleListDateInfoView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        a(context);
    }

    @TargetApi(21)
    public ScheduleListDateInfoView(Context context, AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        super(context, attrs, defStyleAttr, defStyleRes);
        a(context);
    }
}
