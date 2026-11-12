package com.huawei.health.knit.section.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.huawei.health.knit.section.adapter.SectionSideSlipAdapter;
import com.huawei.health.servicesui.R;
import com.huawei.ui.commonui.recycleview.HealthRecycleView;
import com.huawei.ui.commonui.subheader.HealthSubHeader;
import defpackage.fqb;
import defpackage.qqw;
import defpackage.qsp;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public class SectionSideSlip extends BaseSection {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private HealthSubHeader f7923a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private List<Integer> f7924b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private SectionSideSlipAdapter f7925c;
    private Context d;
    private HealthRecycleView e;

    public SectionSideSlip(Context context) {
        super(context);
    }

    public SectionSideSlip(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public SectionSideSlip(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    @Override // com.huawei.health.knit.section.view.BaseSection
    public View onCreateView(Context context) {
        this.d = context;
        View viewInflate = LayoutInflater.from(context).inflate(R.layout.section_side_slip_layout, (ViewGroup) this, false);
        HealthSubHeader healthSubHeader = (HealthSubHeader) viewInflate.findViewById(R.id.section_side_slip_sub_header);
        this.f7923a = healthSubHeader;
        qsp.d(healthSubHeader, 0, context.getResources().getString(R.string.IDS_vip_monthly_coupon), 4, 0);
        this.f7923a.setSubHeaderBackgroundColor(0);
        HealthRecycleView healthRecycleView = (HealthRecycleView) viewInflate.findViewById(R.id.section_side_slip_recycler_view);
        this.e = healthRecycleView;
        healthRecycleView.setLayoutManager(new LinearLayoutManager(context, 0, false));
        return viewInflate;
    }

    @Override // com.huawei.health.knit.section.view.BaseSection
    public String getLogTag() {
        return "SectionSideSlip";
    }

    @Override // com.huawei.health.knit.section.view.BaseSection
    protected void bindParamsToView(HashMap<String, Object> map) {
        fqb fqbVar = new fqb();
        fqbVar.d((List) qqw.b(map, "ITEM_IMAGE", null));
        fqbVar.h((List) qqw.b(map, "NAME", null));
        fqbVar.a((List) qqw.b(map, "WEBVIEW_URL", null));
        List<Integer> list = (List) qqw.b(map, "ITEM_VIEW_TYPE", null);
        this.f7924b = list;
        fqbVar.j(list);
        fqbVar.i((List) qqw.b(map, "ITEM_TITLE", null));
        fqbVar.f((List) qqw.b(map, "ITEM_DESCRIPTION", null));
        fqbVar.b((List) qqw.b(map, "ITEM_STATUS_BACKGROUND", null));
        fqbVar.g((List) qqw.b(map, "ITEM_PAGE_ATTRIBUTE", null));
        fqbVar.c((List) qqw.b(map, "ITEM_JOIN_NUMBER", null));
        fqbVar.e((List) qqw.b(map, "CLICK_EVENT_LISTENER", null));
        setAdapterData(fqbVar);
    }

    private void setAdapterData(fqb fqbVar) {
        SectionSideSlipAdapter sectionSideSlipAdapter = this.f7925c;
        if (sectionSideSlipAdapter == null) {
            SectionSideSlipAdapter sectionSideSlipAdapter2 = new SectionSideSlipAdapter(this.d, fqbVar);
            this.f7925c = sectionSideSlipAdapter2;
            this.e.setAdapter(sectionSideSlipAdapter2);
            this.f7925c.c(fqbVar);
        } else {
            sectionSideSlipAdapter.c(fqbVar);
        }
        this.f7923a.setVisibility(8);
    }
}
