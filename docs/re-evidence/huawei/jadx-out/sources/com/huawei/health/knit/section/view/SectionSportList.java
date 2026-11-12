package com.huawei.health.knit.section.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseExpandableListAdapter;
import android.widget.ExpandableListView;
import android.widget.LinearLayout;
import com.huawei.health.servicesui.R;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.ui.commonui.healthtextview.HealthTextView;
import com.huawei.ui.commonui.listview.HealthExpandableListView;
import defpackage.qqw;
import defpackage.qre;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes7.dex */
public class SectionSportList extends BaseSection {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private HealthTextView f7944a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private View f7945b;
    private HealthTextView d;
    private HealthExpandableListView e;

    public SectionSportList(Context context) {
        super(context);
    }

    public SectionSportList(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public SectionSportList(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    @Override // com.huawei.health.knit.section.view.BaseSection
    public View onCreateView(Context context) {
        LogUtil.a("SCUI_SectionSportList", "onCreateView: ");
        if (this.f7945b == null) {
            View viewInflate = LayoutInflater.from(context).inflate(R.layout.section_sport_list, (ViewGroup) this, false);
            this.f7945b = viewInflate;
            HealthExpandableListView healthExpandableListView = (HealthExpandableListView) viewInflate.findViewById(R.id.sport_record_simplify);
            this.e = healthExpandableListView;
            healthExpandableListView.setClickable(false);
            this.d = (HealthTextView) this.f7945b.findViewById(R.id.go_to_list);
            this.f7944a = (HealthTextView) this.f7945b.findViewById(R.id.sport_list_title);
        }
        return this.f7945b;
    }

    @Override // com.huawei.health.knit.section.view.BaseSection
    public String getLogTag() {
        return "SCUI_SectionSportList";
    }

    @Override // com.huawei.health.knit.section.view.BaseSection
    protected void bindParamsToView(HashMap<String, Object> map) {
        LogUtil.a("SCUI_SectionSportList", "bindParamsToView enter ");
        setViewData(map);
        this.f7944a.setText(qqw.d((Map) map, "BAR_CHART_DATE_TEXT", ""));
        this.d.setOnClickListener((View.OnClickListener) qqw.b(map, "COMMON_CLICK_EVENT", null));
        this.e.setOnChildClickListener((ExpandableListView.OnChildClickListener) qqw.b(map, "MIDDLE_TIP_TEXT_CLICK_EVENT", null));
    }

    private void setViewData(HashMap<String, Object> map) {
        Object objB = qqw.b(map, "REMIND_ADAPTER", null);
        if (objB instanceof BaseExpandableListAdapter) {
            BaseExpandableListAdapter baseExpandableListAdapter = (BaseExpandableListAdapter) objB;
            this.e.setAdapter(baseExpandableListAdapter);
            this.e.expandGroup(0, false);
            e(this.e, baseExpandableListAdapter);
        }
    }

    private void e(HealthExpandableListView healthExpandableListView, BaseExpandableListAdapter baseExpandableListAdapter) {
        LinearLayout.LayoutParams layoutParams;
        int childrenCount = baseExpandableListAdapter.getChildrenCount(0);
        LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) this.d.getLayoutParams();
        if (childrenCount <= 0) {
            layoutParams = new LinearLayout.LayoutParams(-1, 0);
            this.f7944a.setVisibility(8);
            layoutParams2.setMargins(0, qre.b(R.dimen.health_common_4dp), 0, qre.b(R.dimen.health_common_4dp));
        } else {
            int measuredHeight = 0;
            for (int i = 0; i < baseExpandableListAdapter.getChildrenCount(0); i++) {
                View childView = baseExpandableListAdapter.getChildView(0, i, false, null, healthExpandableListView);
                if (childView != null) {
                    childView.measure(0, 0);
                    measuredHeight += childView.getMeasuredHeight();
                }
            }
            layoutParams = new LinearLayout.LayoutParams(-1, measuredHeight);
            this.f7944a.setVisibility(0);
            layoutParams2.setMargins(0, qre.b(R.dimen.health_common_4dp), 0, qre.b(R.dimen.health_common_12dp));
        }
        healthExpandableListView.setLayoutParams(layoutParams);
        this.d.setLayoutParams(layoutParams2);
    }
}
