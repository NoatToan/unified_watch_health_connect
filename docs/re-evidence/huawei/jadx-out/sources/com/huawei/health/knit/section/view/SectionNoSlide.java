package com.huawei.health.knit.section.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.huawei.health.health.utils.vippage.ViewTreeVisibilityListener;
import com.huawei.health.knit.section.adapter.SectionNoSlideAdapter;
import com.huawei.health.servicesui.R;
import com.huawei.ui.commonui.recycleview.HealthRecycleView;
import com.huawei.ui.commonui.subheader.HealthSubHeader;
import defpackage.fcn;
import defpackage.fqb;
import defpackage.qqw;
import defpackage.qsp;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public class SectionNoSlide extends BaseSection {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private View f7860a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private SectionNoSlideAdapter f7861b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private HealthRecycleView f7862c;
    private int d;
    private Context e;
    private HealthSubHeader h;

    public SectionNoSlide(Context context) {
        super(context);
        this.d = 0;
    }

    public SectionNoSlide(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.d = 0;
    }

    public SectionNoSlide(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.d = 0;
    }

    @Override // com.huawei.health.knit.section.view.BaseSection
    public View onCreateView(Context context) {
        this.e = context;
        View viewInflate = LayoutInflater.from(context).inflate(R.layout.section_no_slide_recycle_view, (ViewGroup) this, false);
        this.f7860a = viewInflate;
        HealthSubHeader healthSubHeader = (HealthSubHeader) viewInflate.findViewById(R.id.section_no_slip_sub_header);
        this.h = healthSubHeader;
        qsp.d(healthSubHeader, 0, this.e.getResources().getString(R.string.IDS_vip_monthly_coupon), 4, 0);
        this.h.setSubHeaderBackgroundColor(0);
        this.f7862c = (HealthRecycleView) this.f7860a.findViewById(R.id.no_slide_recyclerview);
        this.f7862c.setLayoutManager(new LinearLayoutManager(this.e, 0, false));
        View view = this.f7860a;
        ViewTreeVisibilityListener.c(view, new ViewTreeVisibilityListener(view, this));
        return this.f7860a;
    }

    @Override // com.huawei.health.knit.section.view.BaseSection
    public String getLogTag() {
        return "SectionNoSlide";
    }

    @Override // com.huawei.health.knit.section.view.BaseSection
    protected void bindParamsToView(HashMap<String, Object> map) {
        if (map.isEmpty()) {
            return;
        }
        fqb fqbVar = new fqb();
        fqbVar.i((List) qqw.b(map, "ITEM_TITLE", null));
        fqbVar.f((List) qqw.b(map, "ITEM_DESCRIPTION", null));
        fqbVar.b((List) qqw.b(map, "ITEM_STATUS_BACKGROUND", null));
        fqbVar.g((List) qqw.b(map, "ITEM_PAGE_ATTRIBUTE", null));
        fqbVar.c((List) qqw.b(map, "ITEM_JOIN_NUMBER", null));
        fqbVar.e((List) qqw.b(map, "CLICK_EVENT_LISTENER", null));
        this.h.setMoreViewClickListener((View.OnClickListener) qqw.b(map, "COMMON_CLICK_EVENT", null));
        if (this.f7861b == null) {
            SectionNoSlideAdapter sectionNoSlideAdapter = new SectionNoSlideAdapter(this.e, fqbVar);
            this.f7861b = sectionNoSlideAdapter;
            this.f7862c.setAdapter(sectionNoSlideAdapter);
        }
        this.f7861b.d(fqbVar);
    }

    @Override // com.huawei.health.knit.section.view.BaseSection, com.huawei.health.health.utils.vippage.ViewTreeVisibilityListener.ViewTreeListenee
    public void biEvent() {
        fcn.n();
    }
}
