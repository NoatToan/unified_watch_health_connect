package com.huawei.health.ecologydevice.ui.healthdata.fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.huawei.ecologydevice.R;
import com.huawei.hihealth.HiHealthData;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.ui.commonui.linechart.view.timeperiod.BloodSugarTimePeriod;
import com.huawei.ui.commonui.linechart.view.timeperiod.BloodSugarTimePeriodView;

/* JADX INFO: loaded from: classes27.dex */
public class BloodSugarDetailFragment extends BloodSugarBaseFragment {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private BloodSugarTimePeriodView f6605b;

    @Override // com.huawei.health.ecologydevice.ui.healthdata.fragment.BloodSugarBaseFragment
    protected void initView(View view) {
        super.initView(view);
        View viewInflate = LayoutInflater.from(this.mActivity).inflate(R.layout.item_blood_sugar_detail, (ViewGroup) null);
        if (viewInflate == null) {
            LogUtil.j("BloodSugarDetailFragment", "viewChild is null");
            return;
        }
        this.mContainerLayout.addView(viewInflate);
        BloodSugarTimePeriodView bloodSugarTimePeriodView = (BloodSugarTimePeriodView) viewInflate.findViewById(R.id.blood_sugar_time_period);
        this.f6605b = bloodSugarTimePeriodView;
        bloodSugarTimePeriodView.setOnTimePeriodItemChangedListener(new BloodSugarTimePeriodView.OnTimePeriodItemChangedListener() { // from class: eom
            @Override // com.huawei.ui.commonui.linechart.view.timeperiod.BloodSugarTimePeriodView.OnTimePeriodItemChangedListener
            public final void onTimePeriodItemChanged(int i, BloodSugarTimePeriod bloodSugarTimePeriod) {
                this.f33277b.c(i, bloodSugarTimePeriod);
            }
        });
        this.mButtonConfirm.setText(R.string.IDS_hw_health_show_healthdata_confirm);
        this.mButtonConfirm.setOnClickListener(new View.OnClickListener() { // from class: eoj
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                this.f33274a.b(view2);
            }
        });
    }

    public /* synthetic */ void c(int i, BloodSugarTimePeriod bloodSugarTimePeriod) {
        this.mTimePeriod = bloodSugarTimePeriod.getCode();
        LogUtil.d("BloodSugarDetailFragment", "initView, setOnTimePeriodItemChangedListener mTimePeriod = ", Integer.valueOf(this.mTimePeriod));
        updateDashboardRingViewRange();
    }

    public /* synthetic */ void b(View view) {
        this.mActivity.b(this.mTimePeriod);
    }

    @Override // com.huawei.health.ecologydevice.ui.healthdata.fragment.BloodSugarBaseFragment
    protected HiHealthData getHealthData() {
        return this.mActivity.e();
    }

    @Override // com.huawei.health.ecologydevice.ui.healthdata.fragment.BloodSugarBaseFragment
    protected void updateView() {
        super.updateView();
        updateTopDateView(false);
        this.f6605b.b(this.mTime, this.mTimePeriod);
    }
}
