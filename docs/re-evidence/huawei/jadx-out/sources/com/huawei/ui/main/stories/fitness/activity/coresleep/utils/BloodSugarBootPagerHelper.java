package com.huawei.ui.main.stories.fitness.activity.coresleep.utils;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.huawei.hwbasemgr.IBaseResponseCallback;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.ui.commonui.dotspageindicator.HealthDotsPageIndicator;
import com.huawei.ui.commonui.viewpager.HealthViewPager;
import com.huawei.ui.main.R;
import com.huawei.ui.main.stories.fitness.views.coresleep.SleepBootMaskingLayerView;
import defpackage.txg;
import health.compact.a.LanguageUtil;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes19.dex */
public class BloodSugarBootPagerHelper extends BaseBootPagerHelper {
    private IBaseResponseCallback e;

    public BloodSugarBootPagerHelper(Context context) {
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
            arrayList.add(Integer.valueOf(R.drawable.bloodsugar_guide_first_oversea));
            arrayList.add(Integer.valueOf(R.drawable.bloodsugar_guide_second));
            arrayList.add(Integer.valueOf(R.drawable.bloodsugar_guide_third_oversea));
        } else {
            arrayList.clear();
            arrayList.add(Integer.valueOf(R.drawable.bloodsugar_guide_first));
            arrayList.add(Integer.valueOf(R.drawable.bloodsugar_guide_second));
            arrayList.add(Integer.valueOf(R.drawable.bloodsugar_guide_third));
        }
        txg txgVar = new txg(BaseApplication.getContext(), arrayList, new ArrayList<String>() { // from class: com.huawei.ui.main.stories.fitness.activity.coresleep.utils.BloodSugarBootPagerHelper.4
            {
                add(BaseApplication.getContext().getString(R.string.IDS_blood_sugar_guide_input));
                add(BaseApplication.getContext().getString(R.string.IDS_blood_sugar_guide_select));
                add(BaseApplication.getContext().getString(R.string.IDS_blood_sugar_guide_activity));
            }
        }, new ArrayList<String>() { // from class: com.huawei.ui.main.stories.fitness.activity.coresleep.utils.BloodSugarBootPagerHelper.2
            {
                add(BaseApplication.getContext().getString(R.string.IDS_bloodsugar_next));
                add(BaseApplication.getContext().getString(R.string.IDS_bloodsugar_next));
                add(BaseApplication.getContext().getString(R.string.IDS_device_show_complete));
            }
        });
        this.mBootPageView = (SleepBootMaskingLayerView) viewInflate.findViewById(R.id.sleep_boot_page);
        txgVar.e(this.mBootPageView);
        txgVar.c(healthViewPager);
        txgVar.d(this.e);
        healthViewPager.setAdapter(txgVar);
        HealthDotsPageIndicator healthDotsPageIndicator = (HealthDotsPageIndicator) viewInflate.findViewById(R.id.sleep_dots_page_indicator);
        healthDotsPageIndicator.setRtlEnable(LanguageUtil.ba(BaseApplication.getContext()));
        healthDotsPageIndicator.setViewPager(healthViewPager);
        linearLayout.addView(viewInflate);
    }

    @Override // com.huawei.ui.main.stories.fitness.activity.coresleep.utils.BaseBootPagerHelper
    protected String getSharePreferenceString() {
        return "IS_FIRST_ENTRY_BLOOD_SUGAR";
    }

    public void a(IBaseResponseCallback iBaseResponseCallback) {
        this.e = iBaseResponseCallback;
    }
}
