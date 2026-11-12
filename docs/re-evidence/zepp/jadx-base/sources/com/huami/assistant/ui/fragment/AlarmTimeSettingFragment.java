package com.huami.assistant.ui.fragment;

import android.content.res.Resources;
import android.os.Bundle;
import android.text.format.DateFormat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.p008lifecycle.Observer;
import androidx.p008lifecycle.ViewModelProvider;
import com.huami.assistant.R;
import com.huami.assistant.alarm.Alarm;
import com.huami.assistant.arch.EditAlarmViewModel;
import com.huami.watch.companion.ui.view.WheelAdapter;
import com.huami.widget.wheelview.OnWheelScrollListener;
import com.huami.widget.wheelview.WheelView;
import java.util.Calendar;

/* JADX INFO: loaded from: classes5.dex */
public class AlarmTimeSettingFragment extends Fragment {
    private WheelView a;
    private WheelView b;
    private WheelView c;
    private WheelAdapter d;
    private b e;
    private EditAlarmViewModel f;
    private OnWheelScrollListener g = new a();

    public class a implements OnWheelScrollListener {
        public a() {
        }

        @Override // com.huami.widget.wheelview.OnWheelScrollListener
        public void onScrollingFinished(WheelView wheel) {
            if (AlarmTimeSettingFragment.this.f != null) {
                AlarmTimeSettingFragment.this.f.setTime(AlarmTimeSettingFragment.this.getHour(), AlarmTimeSettingFragment.this.getMinute());
            }
        }

        @Override // com.huami.widget.wheelview.OnWheelScrollListener
        public void onScrollingStarted(WheelView wheel) {
        }
    }

    public class b {
        public int a;
        public int b;
        public int c;
        public int d;
        public int e;
        public boolean f;

        public b(int hour, int min) {
            boolean zIs24HourFormat = DateFormat.is24HourFormat(AlarmTimeSettingFragment.this.getContext());
            this.f = zIs24HourFormat;
            if (zIs24HourFormat) {
                this.a = 0;
                this.b = 23;
            } else {
                this.a = 1;
                this.b = 12;
            }
            Calendar calendar = Calendar.getInstance();
            calendar.set(11, hour);
            calendar.set(12, min);
            this.e = calendar.get(9);
            if (this.f) {
                this.c = hour;
            } else {
                int i = calendar.get(10);
                this.c = (i != 0 ? i : 12) - 1;
            }
            this.d = min;
        }
    }

    private void e() {
        if (this.e.f) {
            this.a.setVisibility(8);
        } else {
            WheelAdapter wheelAdapter = new WheelAdapter(getActivity(), 0, 1, this.a, getResources().getColor(R.color.wheel_center_color), getResources().getColor(R.color.wheel_dark_color), getResources().getColor(R.color.wheel_lighter_color), false, 46, 8, 6, 6);
            wheelAdapter.setMode(17);
            this.a.setVisibleItems(5).setCenterDrawable(R.color.transparent).setViewAdapter(wheelAdapter).setCurrentItem(this.e.e).addScrollingListener(this.g);
        }
        FragmentActivity activity = getActivity();
        b bVar = this.e;
        int i = bVar.a;
        int i2 = bVar.b;
        WheelView wheelView = this.b;
        Resources resources = getResources();
        int i3 = R.color.wheel_center_color;
        int color = resources.getColor(i3);
        Resources resources2 = getResources();
        int i4 = R.color.wheel_dark_color;
        int color2 = resources2.getColor(i4);
        Resources resources3 = getResources();
        int i5 = R.color.wheel_lighter_color;
        this.d = new WheelAdapter(activity, i, i2, wheelView, color, color2, resources3.getColor(i5), false, 46, 8, 6, 6);
        WheelView visibleItems = this.b.setVisibleItems(5);
        int i6 = R.color.transparent;
        WheelView centerDrawable = visibleItems.setCenterDrawable(i6);
        String string = getString(R.string.unit_hour);
        int i7 = R.color.black;
        centerDrawable.setCenterStyle(string, i7, 32.0f).setViewAdapter(this.d).setCurrentItem(this.e.c).addScrollingListener(this.g);
        this.c.setVisibleItems(5).setCenterDrawable(i6).setCenterStyle(getString(R.string.unit_min), i7, 32.0f).setViewAdapter(new WheelAdapter(getActivity(), 0, 59, this.c, getResources().getColor(i3), getResources().getColor(i4), getResources().getColor(i5), false, 46, 8, 6, 6)).setCurrentItem(this.e.d).addScrollingListener(this.g);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void f(Alarm alarm) {
        if (alarm != null) {
            this.e = new b(alarm.hour, alarm.minutes);
            g();
        }
    }

    private void g() {
        this.a.setVisibility(this.e.f ? 8 : 0);
        this.a.setCurrentItem(this.e.e);
        this.d.setStartValue(this.e.a);
        this.d.setEndValue(this.e.b);
        this.b.setCurrentItem(this.e.c);
        this.c.setCurrentItem(this.e.d);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int getHour() {
        int currentItem = this.b.getCurrentItem();
        if (this.e.f) {
            return currentItem;
        }
        Calendar calendar = Calendar.getInstance();
        calendar.set(9, this.a.getCurrentItem());
        calendar.set(10, currentItem == 11 ? 0 : currentItem + 1);
        return calendar.get(11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int getMinute() {
        return this.c.getCurrentItem();
    }

    private void initView(View view) {
        this.a = (WheelView) view.findViewById(R.id.time_ampm);
        this.b = (WheelView) view.findViewById(R.id.time_hour);
        this.c = (WheelView) view.findViewById(R.id.time_minute);
    }

    private void initViewModel() {
        if (getActivity() == null) {
            return;
        }
        EditAlarmViewModel editAlarmViewModel = (EditAlarmViewModel) new ViewModelProvider(getActivity()).get(EditAlarmViewModel.class);
        this.f = editAlarmViewModel;
        editAlarmViewModel.getAlarm().observe(this, new Observer() { // from class: rb
            @Override // androidx.p008lifecycle.Observer
            public final void onChanged(Object obj) {
                this.a.f((Alarm) obj);
            }
        });
    }

    @Override // androidx.fragment.app.Fragment
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        if (getView() != null) {
            initView(getView());
            this.e = new b(8, 0);
            e();
        }
        initViewModel();
    }

    @Override // androidx.fragment.app.Fragment
    @Nullable
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_alarm_time_setting, container, false);
    }
}
