package com.huami.watch.companion.ui.fragment;

import android.app.Activity;
import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.Nullable;
import com.huami.watch.companion.R;
import com.huami.watch.companion.dataflow.HealthData;
import com.huami.watch.companion.ui.view.WheelAdapter;
import com.huami.widget.wheelview.WheelView;

/* JADX INFO: loaded from: classes16.dex */
public class CalorieGoalSettingFragment extends Fragment {
    private WheelView a;
    private WheelAdapter b;
    private int c;
    private int d;
    private int e;

    private void a() {
        Activity activity = getActivity();
        this.c = 2;
        this.d = 30;
        this.e = 100;
        String string = getString(R.string.energy_unit);
        WheelAdapter wheelAdapter = new WheelAdapter(activity, this.c, this.d, this.a, activity.getResources().getColor(R.color.wheel_normal_center), activity.getResources().getColor(R.color.wheel_normal_normal), activity.getResources().getColor(R.color.wheel_normal_lighter), false, 46, 8, 6, 6);
        this.b = wheelAdapter;
        wheelAdapter.setValueGap(this.e);
        this.a.setVisibleItems(5).setCenterDrawable(R.color.transparent).setCenterStyle(string, R.color.dark_red_text, 32.0f).setViewAdapter(this.b);
        c();
    }

    private void b(View view) {
        this.a = (WheelView) view.findViewById(R.id.picker_step);
        a();
    }

    private void c() {
        int userGoalCal = HealthData.getUserGoalCal(getActivity());
        int i = this.e;
        if (i != 0) {
            userGoalCal /= i;
        }
        int i2 = this.c;
        if (userGoalCal < i2 || userGoalCal > this.d) {
            return;
        }
        this.a.setCurrentItem(userGoalCal - i2);
    }

    public int getCurrentSelectCalorie() {
        return this.b.getRealValue();
    }

    @Override // android.app.Fragment
    public void onActivityCreated(@Nullable Bundle bundle) {
        super.onActivityCreated(bundle);
        if (getView() != null) {
            b(getView());
        }
    }

    @Override // android.app.Fragment
    @Nullable
    public View onCreateView(LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, Bundle bundle) {
        return layoutInflater.inflate(R.layout.fragment_health_step_goal_setting, viewGroup, false);
    }
}
