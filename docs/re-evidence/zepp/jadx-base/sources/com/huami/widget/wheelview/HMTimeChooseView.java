package com.huami.widget.wheelview;

import android.content.Context;
import android.text.format.DateFormat;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.core.content.ContextCompat;
import com.huami.widget.wheelview.adapters.PickAdapter;
import java.util.Calendar;

/* JADX INFO: loaded from: classes17.dex */
public class HMTimeChooseView extends LinearLayout {
    private static final String i = "HMTimeChooseView";
    private static final int j = 1;
    private static final int k = 0;
    private static final int l = 42;
    private TextView a;
    private WheelView b;
    private WheelView c;
    private PickAdapter d;
    private boolean e;
    private ITimeChooseListener f;
    private int g;
    private int h;
    public WheelView mMinWheel;

    public interface ITimeChooseListener {
        void onTimeChoose(int i, int i2);
    }

    public interface UpdateAmPmListener {
        void updateAmPm(int i);
    }

    public interface UpdateHourListener {
        void updateHour(int i);
    }

    public class a implements OnWheelScrollListener {
        public a() {
        }

        @Override // com.huami.widget.wheelview.OnWheelScrollListener
        public void onScrollingFinished(WheelView wheelView) {
            HMTimeChooseView.this.e();
        }

        @Override // com.huami.widget.wheelview.OnWheelScrollListener
        public void onScrollingStarted(WheelView wheelView) {
        }
    }

    public class b implements OnWheelScrollListener {
        public b() {
        }

        @Override // com.huami.widget.wheelview.OnWheelScrollListener
        public void onScrollingFinished(WheelView wheelView) {
            HMTimeChooseView.this.e();
        }

        @Override // com.huami.widget.wheelview.OnWheelScrollListener
        public void onScrollingStarted(WheelView wheelView) {
        }
    }

    public class c implements OnWheelScrollListener {
        public c() {
        }

        @Override // com.huami.widget.wheelview.OnWheelScrollListener
        public void onScrollingFinished(WheelView wheelView) {
            HMTimeChooseView.this.e();
        }

        @Override // com.huami.widget.wheelview.OnWheelScrollListener
        public void onScrollingStarted(WheelView wheelView) {
        }
    }

    public HMTimeChooseView(Context context) {
        this(context, null);
    }

    private void d(View view) {
        this.c = (WheelView) view.findViewById(R.id.time_choose_ampm_wheel);
        this.b = (WheelView) view.findViewById(R.id.time_choose_hour_wheel);
        this.mMinWheel = (WheelView) view.findViewById(R.id.time_choose_min_wheel);
        Context context = getContext();
        WheelView wheelView = this.c;
        Context context2 = getContext();
        int i2 = Constant.CENTER_TEXT_COLOR;
        int color = ContextCompat.getColor(context2, i2);
        Context context3 = getContext();
        int i3 = Constant.SECOND_TEXT_COLOR;
        int color2 = ContextCompat.getColor(context3, i3);
        Context context4 = getContext();
        int i4 = Constant.THIRD_TEXT_COLOR;
        PickAdapter pickAdapter = new PickAdapter(context, 0, 1, wheelView, color, color2, ContextCompat.getColor(context4, i4), false, 42, 20, 18, 16, 1);
        pickAdapter.setUIStyle("normal");
        pickAdapter.setMode(17);
        pickAdapter.setHMTimeChooseAmPmListener(new UpdateAmPmListener() { // from class: gk3
            @Override // com.huami.widget.wheelview.HMTimeChooseView.UpdateAmPmListener
            public final void updateAmPm(int i5) {
                this.a.g(i5);
            }
        });
        WheelView visibleItems = this.c.setVisibleItems(2);
        int i5 = R.drawable.wheel_view_select_bg_start;
        visibleItems.setCenterDrawable(i5).setCenterStyle("", 18.0f).setViewAdapter(pickAdapter);
        this.c.addScrollingListener(new a());
        PickAdapter pickAdapter2 = new PickAdapter(getContext(), 0, 23, this.b, ContextCompat.getColor(getContext(), i2), ContextCompat.getColor(getContext(), i3), ContextCompat.getColor(getContext(), i4), true, 42, 20, 18, 16, 1);
        this.d = pickAdapter2;
        pickAdapter2.setHMTimeChooseHourListener(new UpdateHourListener() { // from class: hk3
            @Override // com.huami.widget.wheelview.HMTimeChooseView.UpdateHourListener
            public final void updateHour(int i6) {
                this.a.f(i6);
            }
        });
        if (!this.e) {
            i5 = R.drawable.wheel_view_select_bg_center;
        }
        WheelView centerDrawable = this.b.setVisibleItems(5).setCenterDrawable(i5);
        String string = getResources().getString(R.string.unit_hour);
        int i6 = R.color.p4;
        centerDrawable.setCenterStyle(string, i6, 8, 10.0f, -1.0f).setViewAdapter(this.d);
        this.b.addScrollingListener(new b());
        this.mMinWheel.setVisibleItems(5).setCenterDrawable(R.drawable.wheel_view_select_bg_end).setCenterStyle(getResources().getString(R.string.wheel_view_unit_min), i6, 8, 10.0f, -1.0f).setViewAdapter(new PickAdapter(getContext(), 0, 59, this.mMinWheel, ContextCompat.getColor(getContext(), i2), ContextCompat.getColor(getContext(), i3), ContextCompat.getColor(getContext(), i4), true, 42, 20, 18, 16, 1));
        this.mMinWheel.addScrollingListener(new c());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e() {
        ITimeChooseListener iTimeChooseListener = this.f;
        if (iTimeChooseListener != null) {
            iTimeChooseListener.onTimeChoose(getSelectHour(), getSelectMin());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void f(int i2) {
        WheelView wheelView = this.c;
        if (wheelView == null || this.e) {
            return;
        }
        wheelView.setCurrentItem(i2 >= 12 ? 1 : 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void g(int i2) {
        if (this.e) {
            return;
        }
        int currentItem = this.b.getCurrentItem();
        if (i2 == 0) {
            if (currentItem >= 12) {
                currentItem -= 12;
            }
        } else if (currentItem < 12) {
            currentItem += 12;
        }
        this.b.setCurrentItemLooped(currentItem);
    }

    private int getHour() {
        int i2 = this.g;
        return i2 == -1 ? Calendar.getInstance().get(11) : i2;
    }

    private int getMinute() {
        int i2 = this.h;
        return i2 == -1 ? Calendar.getInstance().get(12) : i2;
    }

    private int getSelectHour() {
        return this.b.getCurrentItem();
    }

    private int getSelectMin() {
        return this.mMinWheel.getCurrentItem();
    }

    private void h() {
        if (this.e) {
            this.c.setVisibility(8);
            this.b.setCurrentItem(getHour());
            this.d.setMode(9);
        } else {
            this.c.setVisibility(0);
            this.d.setMode(16);
            int hour = getHour();
            if (hour >= 12) {
                this.c.setCurrentItem(1);
                this.b.setCurrentItem(hour - 12);
            } else {
                this.c.setCurrentItem(0);
                this.b.setCurrentItem(hour);
            }
        }
        this.mMinWheel.setCurrentItem(getMinute());
    }

    public void setInitialTime(int i2, int i3) {
        this.g = i2;
        this.h = i3;
        h();
    }

    public void setOnTimeChooseListener(ITimeChooseListener iTimeChooseListener) {
        this.f = iTimeChooseListener;
    }

    public void setTimeChooseTitle(String str) {
        this.a.setText(str);
    }

    public HMTimeChooseView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public HMTimeChooseView(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        this.e = false;
        this.f = null;
        this.g = -1;
        this.h = -1;
        this.e = DateFormat.is24HourFormat(context);
        View viewInflate = LayoutInflater.from(context).inflate(R.layout.view_choose_time, this);
        this.a = (TextView) viewInflate.findViewById(R.id.time_choose_title);
        d(viewInflate);
        h();
    }
}
