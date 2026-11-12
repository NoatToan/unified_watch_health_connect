package com.huawei.ui.main.stories.fitness.activity.coresleep.utils;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.ui.commonui.viewpager.HealthViewPager;
import com.huawei.ui.main.R;
import com.huawei.ui.main.stories.fitness.views.coresleep.SleepBootMaskingLayerView;
import defpackage.txg;
import health.compact.a.LanguageUtil;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes19.dex */
public class BloodPressureBootPagerHelper extends BaseBootPagerHelper {
    public BloodPressureBootPagerHelper(Context context) {
        super(context);
    }

    @Override // com.huawei.ui.main.stories.fitness.activity.coresleep.utils.BaseBootPagerHelper
    protected void configBootPage(LinearLayout linearLayout) {
        if (linearLayout == null) {
            return;
        }
        this.mContainer = linearLayout;
        View viewInflate = LayoutInflater.from(this.mContext).inflate(R.layout.sleep_activity_extra_layout, (ViewGroup) linearLayout, false);
        HealthViewPager healthViewPager = (HealthViewPager) viewInflate.findViewById(R.id.sleep_boot_view_pager);
        ArrayList arrayList = new ArrayList();
        if (!LanguageUtil.f(this.mContext)) {
            arrayList.clear();
            arrayList.add(Integer.valueOf(R.drawable.bloodpressure_guide_first_oversea));
            arrayList.add(Integer.valueOf(R.drawable.bloodpressure_guide_second_oversea));
            arrayList.add(Integer.valueOf(R.drawable.bloodpressure_guide_third_oversea));
        } else {
            arrayList.clear();
            arrayList.add(Integer.valueOf(R.drawable.bloodpressure_guide_first));
            arrayList.add(Integer.valueOf(R.drawable.bloodpressure_guide_second));
            arrayList.add(Integer.valueOf(R.drawable.bloodpressure_guide_third));
        }
        txg txgVar = new txg(BaseApplication.getContext(), arrayList, new ArrayList<String>() { // from class: com.huawei.ui.main.stories.fitness.activity.coresleep.utils.BloodPressureBootPagerHelper.1
            {
                add(BaseApplication.getContext().getString(R.string.IDS_blood_pressure_guide_input));
                add(BaseApplication.getContext().getString(R.string.IDS_blood_pressure_guide_select));
                add(BaseApplication.getContext().getString(R.string.IDS_blood_pressure_guide_activity));
            }
        }, new ArrayList<String>() { // from class: com.huawei.ui.main.stories.fitness.activity.coresleep.utils.BloodPressureBootPagerHelper.5
            {
                add(BaseApplication.getContext().getString(R.string.IDS_bloodsugar_next));
                add(BaseApplication.getContext().getString(R.string.IDS_bloodsugar_next));
                add(BaseApplication.getContext().getString(R.string.IDS_device_show_complete));
            }
        });
        this.mBootPageView = (SleepBootMaskingLayerView) viewInflate.findViewById(R.id.sleep_boot_page);
        txgVar.e(this.mBootPageView);
        txgVar.c(healthViewPager);
    }

    @Override // com.huawei.ui.main.stories.fitness.activity.coresleep.utils.BaseBootPagerHelper
    protected String getSharePreferenceString() {
        return "IS_FIRST_ENTRY_BLOOD_PRESSURE";
    }
}
