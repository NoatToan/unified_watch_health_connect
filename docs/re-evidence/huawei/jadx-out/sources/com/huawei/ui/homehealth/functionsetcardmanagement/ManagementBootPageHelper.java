package com.huawei.ui.homehealth.functionsetcardmanagement;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.ui.commonui.dotspageindicator.HealthDotsPageIndicator;
import com.huawei.ui.commonui.viewpager.HealthViewPager;
import com.huawei.ui.main.R;
import com.huawei.ui.main.stories.fitness.activity.coresleep.utils.BaseBootPagerHelper;
import com.huawei.ui.main.stories.fitness.views.coresleep.SleepBootMaskingLayerView;
import defpackage.sks;
import health.compact.a.LanguageUtil;
import health.compact.a.util.LogUtil;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes17.dex */
public class ManagementBootPageHelper extends BaseBootPagerHelper {
    public ManagementBootPageHelper(Context context) {
        super(context);
    }

    @Override // com.huawei.ui.main.stories.fitness.activity.coresleep.utils.BaseBootPagerHelper
    public void configBootPage(LinearLayout linearLayout) {
        LogUtil.a("ManagementBootPageHelper", "configBootPage");
        if (linearLayout == null) {
            LogUtil.a("ManagementBootPageHelper", "container is null");
            return;
        }
        this.mContainer = linearLayout;
        View viewInflate = LayoutInflater.from(this.mContext).inflate(R.layout.sleep_activity_extra_layout, (ViewGroup) linearLayout, false);
        HealthViewPager healthViewPager = (HealthViewPager) viewInflate.findViewById(R.id.sleep_boot_view_pager);
        ArrayList arrayList = new ArrayList();
        if (!LanguageUtil.f(this.mContext)) {
            arrayList.clear();
            arrayList.add(Integer.valueOf(com.huawei.ui.commonui.R.drawable.management_boot_page_oversea));
        } else {
            arrayList.clear();
            arrayList.add(Integer.valueOf(com.huawei.ui.commonui.R.drawable.management_boot_page));
        }
        sks sksVar = new sks(BaseApplication.getContext(), arrayList, new ArrayList<String>() { // from class: com.huawei.ui.homehealth.functionsetcardmanagement.ManagementBootPageHelper.2
            {
                add(BaseApplication.getContext().getString(com.huawei.ui.commonui.R.string.IDS_function_set_drag_des));
            }
        }, new ArrayList<String>() { // from class: com.huawei.ui.homehealth.functionsetcardmanagement.ManagementBootPageHelper.3
            {
                add(BaseApplication.getContext().getString(com.huawei.ui.commonui.R.string.IDS_function_set_know));
            }
        });
        this.mBootPageView = (SleepBootMaskingLayerView) viewInflate.findViewById(R.id.sleep_boot_page);
        sksVar.e(this.mBootPageView);
        sksVar.c(healthViewPager);
        healthViewPager.setAdapter(sksVar);
        ((HealthDotsPageIndicator) viewInflate.findViewById(R.id.sleep_dots_page_indicator)).setVisibility(8);
        linearLayout.addView(viewInflate);
    }

    @Override // com.huawei.ui.main.stories.fitness.activity.coresleep.utils.BaseBootPagerHelper
    public String getSharePreferenceString() {
        return "IS_FIRST_ENTRY_FUNCTION_SET_MANAGEMENT";
    }
}
