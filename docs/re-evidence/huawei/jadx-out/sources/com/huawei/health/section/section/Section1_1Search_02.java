package com.huawei.health.section.section;

import android.content.Context;
import android.content.res.Configuration;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.content.ContextCompat;
import com.huawei.health.knit.section.view.BaseSection;
import com.huawei.health.marketing.datatype.SingleGridContent;
import com.huawei.health.section.adapter.Section1_1Search_02Adapter;
import com.huawei.health.servicesui.R;
import com.huawei.ui.commonui.listener.OnClickSectionListener;
import com.huawei.ui.commonui.recycleview.HealthLinearLayoutManager;
import com.huawei.ui.commonui.recycleview.HealthRecycleView;
import com.huawei.ui.commonui.subheader.HealthSubHeader;
import defpackage.fts;
import defpackage.gvp;
import defpackage.qqw;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes8.dex */
public class Section1_1Search_02 extends BaseSection {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private HealthRecycleView f8753a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private View f8754b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Context f8755c;
    private Section1_1Search_02Adapter d;
    private HealthSubHeader e;

    public Section1_1Search_02(Context context) {
        this(context, null);
    }

    public Section1_1Search_02(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public Section1_1Search_02(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f8755c = context;
    }

    @Override // com.huawei.health.knit.section.view.BaseSection
    public String getLogTag() {
        return "Section1_1Search_02";
    }

    @Override // com.huawei.health.knit.section.view.BaseSection
    public View onCreateView(Context context) {
        View viewInflate = LayoutInflater.from(context).inflate(R.layout.section1_1list_01_layout, (ViewGroup) this, false);
        this.f8754b = viewInflate;
        HealthSubHeader healthSubHeader = (HealthSubHeader) viewInflate.findViewById(R.id.section_sub_header);
        this.e = healthSubHeader;
        healthSubHeader.setMoreTextVisibility(4);
        this.e.setMoreLayoutVisibility(4);
        this.e.setSubHeaderBackgroundColor(ContextCompat.getColor(this.f8754b.getContext(), R.color.common_transparent));
        this.f8754b.findViewById(R.id.section1_1list_01_recycler_layout).setVisibility(0);
        HealthRecycleView healthRecycleView = (HealthRecycleView) this.f8754b.findViewById(R.id.section1_1list_01_recycler_view);
        this.f8753a = healthRecycleView;
        healthRecycleView.setHasFixedSize(true);
        this.f8753a.setNestedScrollingEnabled(false);
        this.f8753a.b(false);
        this.f8753a.e(false);
        fts.d(context, this.f8753a, new HealthLinearLayoutManager(context), false, 0);
        return this.f8754b;
    }

    @Override // android.view.View
    protected void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        fts.b(this.f8755c, this.f8753a, this.d);
    }

    @Override // com.huawei.health.knit.section.view.BaseSection
    public void bindParamsToView(HashMap<String, Object> map) {
        gvp gvpVar = new gvp();
        this.e.setHeadTitleText(qqw.d((Map) map, "TITLE", ""));
        gvpVar.a(qqw.c(map, "CLICK_EVENT_LISTENER", (OnClickSectionListener) null));
        gvpVar.e(qqw.a((Map) map, "ITEMS", SingleGridContent.class, (List) new ArrayList()));
        Section1_1Search_02Adapter section1_1Search_02Adapter = new Section1_1Search_02Adapter(this.f8755c, gvpVar);
        this.d = section1_1Search_02Adapter;
        this.f8753a.setAdapter(section1_1Search_02Adapter);
    }
}
