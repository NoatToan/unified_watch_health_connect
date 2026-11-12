package com.huawei.health.section.section;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.content.ContextCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.huawei.health.knit.section.view.BaseSection;
import com.huawei.health.marketing.request.GlobalSearchContent;
import com.huawei.health.servicesui.R;
import com.huawei.ui.commonui.listener.OnClickSectionListener;
import com.huawei.ui.commonui.recycleview.HealthRecycleView;
import com.huawei.ui.commonui.subheader.HealthSubHeader;
import defpackage.njy;
import defpackage.qqw;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes8.dex */
public class SectionSimpleList extends BaseSection {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private HealthSubHeader f8766b;
    private HealthRecycleView e;

    public SectionSimpleList(Context context) {
        super(context);
    }

    public SectionSimpleList(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public SectionSimpleList(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    @Override // com.huawei.health.knit.section.view.BaseSection
    public View onCreateView(Context context) {
        View viewInflate = LayoutInflater.from(context).inflate(R.layout.section_simple_list, (ViewGroup) this, false);
        HealthRecycleView healthRecycleView = (HealthRecycleView) viewInflate.findViewById(R.id.simple_list_view);
        this.e = healthRecycleView;
        healthRecycleView.setHasFixedSize(true);
        this.e.setNestedScrollingEnabled(false);
        this.e.b(false);
        this.e.e(false);
        this.e.setLayoutManager(new LinearLayoutManager(context, 1, false));
        HealthSubHeader healthSubHeader = (HealthSubHeader) viewInflate.findViewById(R.id.section_sub_header);
        this.f8766b = healthSubHeader;
        healthSubHeader.setMoreTextVisibility(4);
        this.f8766b.setMoreLayoutVisibility(4);
        this.f8766b.setSubHeaderBackgroundColor(ContextCompat.getColor(context, R.color.common_transparent));
        return viewInflate;
    }

    @Override // com.huawei.health.knit.section.view.BaseSection
    public String getLogTag() {
        return "SectionSimpleList";
    }

    @Override // com.huawei.health.knit.section.view.BaseSection
    public void bindParamsToView(HashMap<String, Object> map) {
        List<GlobalSearchContent> listA = qqw.a((Map) map, "SECTION_SIMPLE_LIST_DATA", GlobalSearchContent.class, (List) null);
        boolean zE = njy.e(listA);
        this.e.setVisibility(!zE ? 0 : 8);
        SimpleListAdapter simpleListAdapter = new SimpleListAdapter(this.e.getContext());
        simpleListAdapter.a(listA);
        this.e.setAdapter(simpleListAdapter);
        this.f8766b.setVisibility(zE ? 8 : 0);
        this.f8766b.setHeadTitleText(qqw.d((Map) map, "TITLE", ""));
        String strD = qqw.d((Map) map, "SHOWMORE", (String) null);
        final OnClickSectionListener onClickSectionListenerC = qqw.c(map, "SHOW_MORE_CLICK_EVENT", (OnClickSectionListener) null);
        if (strD != null && onClickSectionListenerC != null) {
            this.f8766b.setMoreText(strD);
            this.f8766b.setMoreTextVisibility(0);
            this.f8766b.setMoreLayoutVisibility(0);
            this.f8766b.setMoreViewClickListener(new View.OnClickListener() { // from class: com.huawei.health.section.section.SectionSimpleList.3
                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    onClickSectionListenerC.onClick("SHOW_MORE_CLICK_EVENT");
                }
            });
            return;
        }
        this.f8766b.setMoreText("");
        this.f8766b.setMoreTextVisibility(4);
        this.f8766b.setMoreLayoutVisibility(4);
    }
}
