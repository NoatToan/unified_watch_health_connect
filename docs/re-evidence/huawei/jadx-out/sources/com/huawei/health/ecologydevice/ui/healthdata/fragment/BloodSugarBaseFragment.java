package com.huawei.health.ecologydevice.ui.healthdata.fragment;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.core.content.ContextCompat;
import androidx.fragment.app.FragmentActivity;
import com.huawei.ecologydevice.R;
import com.huawei.haf.application.BaseApplication;
import com.huawei.health.ecologydevice.ui.healthdata.activity.BloodSugarHistoryActivity;
import com.huawei.hihealth.HiHealthData;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.ui.commonui.base.BaseFragment;
import com.huawei.ui.commonui.button.HealthButton;
import com.huawei.ui.commonui.healthtextview.HealthTextView;
import com.huawei.ui.commonui.linechart.view.dashboard.BloodSugarDashboardView;
import com.huawei.ui.commonui.linechart.view.dashboard.DashboardRingView;
import defpackage.emq;
import defpackage.qrk;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes27.dex */
public abstract class BloodSugarBaseFragment extends BaseFragment {
    private static final int BLOOD_SUGAR_VALUE_MAX = 33;
    private static final int BLOOD_SUGAR_VALUE_MIN = 1;
    private static final int COLOR_PART_SIZE = 2;
    private static final String TAG = "BloodSugarBaseFragment";
    protected BloodSugarHistoryActivity mActivity;
    protected HiHealthData mBloodSugar;
    protected HealthButton mButtonConfirm;
    protected FrameLayout mContainerLayout;
    protected BloodSugarDashboardView mDashboardView;
    protected long mTime;
    protected int mTimePeriod;
    protected HealthTextView mTopDateView;
    protected HealthTextView mTopTimePeriodView;
    protected HealthTextView mTopTimeView;
    protected float mValue;

    protected abstract HiHealthData getHealthData();

    protected void initData() {
    }

    @Override // androidx.fragment.app.Fragment
    public void onAttach(Context context) {
        super.onAttach(context);
        FragmentActivity activity = getActivity();
        if (activity instanceof BloodSugarHistoryActivity) {
            this.mActivity = (BloodSugarHistoryActivity) activity;
        }
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewInflate = layoutInflater.inflate(R.layout.fragment_blood_sugar_base, (ViewGroup) null, false);
        if (viewInflate != null) {
            initView(viewInflate);
            initData();
            updateView();
            return viewInflate;
        }
        LogUtil.j(TAG, "onCreateView, view is null");
        return viewInflate;
    }

    protected void initView(View view) {
        this.mTopDateView = (HealthTextView) view.findViewById(R.id.blood_sugar_top_date);
        this.mTopTimeView = (HealthTextView) view.findViewById(R.id.blood_sugar_top_time);
        this.mTopTimePeriodView = (HealthTextView) view.findViewById(R.id.blood_sugar_top_time_period);
        this.mDashboardView = (BloodSugarDashboardView) view.findViewById(R.id.blood_sugar_dashboard_view);
        this.mContainerLayout = (FrameLayout) view.findViewById(R.id.blood_sugar_fl_container);
        this.mButtonConfirm = (HealthButton) view.findViewById(R.id.blood_sugar_bt_done);
    }

    protected void updateData() {
        HiHealthData healthData = getHealthData();
        this.mBloodSugar = healthData;
        if (healthData == null) {
            LogUtil.j(TAG, "updateData BloodSugar data is null");
            return;
        }
        this.mTime = healthData.getEndTime();
        this.mTimePeriod = BigDecimal.valueOf(this.mBloodSugar.getType()).intValue();
        this.mValue = BigDecimal.valueOf(this.mBloodSugar.getValue()).floatValue();
    }

    @Override // com.huawei.ui.commonui.base.BaseFragment, androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
    }

    @Override // androidx.fragment.app.Fragment
    public void onHiddenChanged(boolean z) {
        super.onHiddenChanged(z);
        if (z) {
            return;
        }
        updateView();
    }

    protected void updateView() {
        LogUtil.a(TAG, "updateView");
        updateData();
        updateDashboardRingViewRange();
    }

    protected void updateTopDateView(boolean z) {
        this.mTopDateView.setText(qrk.h(this.mTime));
        this.mTopTimeView.setText(qrk.g(this.mTime));
        if (z) {
            String strD = emq.d(this.mTimePeriod);
            this.mTopTimePeriodView.setVisibility(0);
            this.mTopTimePeriodView.setText(strD);
            return;
        }
        this.mTopTimePeriodView.setVisibility(8);
    }

    protected void updateDashboardRingViewRange() {
        ArrayList arrayList = new ArrayList();
        List<Float> listA = emq.a(this.mTimePeriod);
        int i = 0;
        int i2 = 0;
        while (i2 < listA.size() && this.mValue > listA.get(i2).floatValue()) {
            i2++;
        }
        int[] iArrB = emq.b();
        int length = (iArrB.length / 2) + i2;
        float f = 0.0f;
        while (i < listA.size()) {
            float fFloatValue = listA.get(i).floatValue();
            int i3 = i == i2 ? length : i;
            if (i3 < iArrB.length) {
                arrayList.add(new DashboardRingView.a(f, fFloatValue, iArrB[i3]));
                f = fFloatValue;
            }
            i++;
        }
        this.mDashboardView.setRingAreas(1.0f, 33.0f, arrayList);
        int iC = emq.c(getContext(), this.mTimePeriod, this.mValue);
        if (length < iArrB.length) {
            this.mDashboardView.setStatusText(emq.b(iC), iArrB[length]);
        } else {
            this.mDashboardView.setStatusText(getString(R.string.IDS_hw_health_show_healthdata_nodata_symbol), ContextCompat.getColor(BaseApplication.b(), R.color.textColorSecondary));
        }
        this.mDashboardView.setCurrentValue(this.mValue);
        this.mDashboardView.b();
    }
}
