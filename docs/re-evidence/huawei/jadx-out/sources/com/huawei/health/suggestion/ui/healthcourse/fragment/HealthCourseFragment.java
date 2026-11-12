package com.huawei.health.suggestion.ui.healthcourse.fragment;

import android.os.Bundle;
import com.huawei.basefitnessadvice.model.Navigation;
import com.huawei.health.suggestion.R;
import com.huawei.health.suggestion.ui.healthcourse.adapter.HealthCourseAdapter;
import com.huawei.health.suggestion.ui.polymericpage.adapter.PolymericDataAdapter;
import com.huawei.health.suggestion.ui.polymericpage.view.PolymericDataFragment;
import com.huawei.hwlogsmodel.LogUtil;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Map;

/* JADX INFO: loaded from: classes9.dex */
public class HealthCourseFragment extends PolymericDataFragment {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Map<String, Object> f9571a;

    public static HealthCourseFragment e(Map<String, Object> map) {
        Bundle bundle = new Bundle();
        bundle.putSerializable("RESOURCE_FRAGMENT_BI", (Serializable) map);
        HealthCourseFragment healthCourseFragment = new HealthCourseFragment();
        healthCourseFragment.setArguments(bundle);
        return healthCourseFragment;
    }

    @Override // com.huawei.health.suggestion.ui.polymericpage.view.PolymericDataFragment
    public void initArgument() {
        Bundle arguments = getArguments();
        if (arguments == null) {
            LogUtil.a("Suggestion_HealthCourseFragment", "initArgument, arguments is null.");
        } else {
            this.f9571a = (Map) arguments.getSerializable("RESOURCE_FRAGMENT_BI");
        }
    }

    @Override // com.huawei.health.suggestion.ui.polymericpage.view.PolymericDataFragment
    public PolymericDataAdapter newPolymericDataAdapter() {
        Map<String, Object> map = this.f9571a;
        if (map != null) {
            map.put("labelId", a());
        }
        HealthCourseAdapter healthCourseAdapter = new HealthCourseAdapter(new ArrayList(), this.mRecycleViewFitWorks, R.layout.sug_item_health_all_course_list, this.f9571a);
        healthCourseAdapter.setIsShowSquare(d());
        return healthCourseAdapter;
    }

    private String a() {
        Navigation navigationB = this.mDataViewModel.b(this.mDataViewModel.c());
        return navigationB != null ? navigationB.getName() : "";
    }

    private boolean d() {
        LogUtil.a("Suggestion_HealthCourseFragment", "mDataViewModel.getCurrentNavigation():", Integer.valueOf(this.mDataViewModel.c()));
        Navigation navigationB = this.mDataViewModel.b(this.mDataViewModel.c());
        if (navigationB != null) {
            return navigationB.isDisplaySquareStyle();
        }
        return false;
    }
}
