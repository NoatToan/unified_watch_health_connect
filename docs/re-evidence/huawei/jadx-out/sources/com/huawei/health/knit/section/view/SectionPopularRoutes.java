package com.huawei.health.knit.section.view;

import android.content.Context;
import android.content.res.Configuration;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.huawei.health.knit.section.adapter.SectionPopularRoutesAdapter;
import com.huawei.health.servicesui.R;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.ui.commonui.listener.OnClickSectionListener;
import com.huawei.ui.commonui.recycleview.HealthRecycleView;
import com.huawei.ui.commonui.subheader.HealthSubHeader;
import defpackage.dkf;
import defpackage.fpy;
import defpackage.fts;
import defpackage.qqw;
import defpackage.qrs;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes7.dex */
public class SectionPopularRoutes extends BaseSection {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private LinearLayout f7884a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private HealthSubHeader f7885b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private HealthRecycleView f7886c;
    private Context d;
    private SectionPopularRoutesAdapter e;

    public SectionPopularRoutes(Context context) {
        this(context, null);
    }

    public SectionPopularRoutes(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public SectionPopularRoutes(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.d = context;
    }

    @Override // com.huawei.health.knit.section.view.BaseSection
    public View onCreateView(Context context) {
        View viewInflate = LayoutInflater.from(context).inflate(R.layout.section_popular_routes_layout, (ViewGroup) this, false);
        LinearLayout linearLayout = (LinearLayout) viewInflate.findViewById(R.id.root_view_layout);
        this.f7884a = linearLayout;
        linearLayout.post(new Runnable() { // from class: com.huawei.health.knit.section.view.SectionPopularRoutes.1
            @Override // java.lang.Runnable
            public void run() {
                SectionPopularRoutes.this.f7884a.setMinimumWidth(qrs.q());
            }
        });
        HealthSubHeader healthSubHeader = (HealthSubHeader) viewInflate.findViewById(R.id.section_sub_header);
        this.f7885b = healthSubHeader;
        healthSubHeader.setSubHeaderBackgroundColor(context.getResources().getColor(R.color.common_transparent));
        HealthRecycleView healthRecycleView = (HealthRecycleView) viewInflate.findViewById(R.id.section_popular_routes_recycler_view);
        this.f7886c = healthRecycleView;
        healthRecycleView.setLayoutManager(new LinearLayoutManager(context, 0, false));
        return viewInflate;
    }

    @Override // android.view.View
    protected void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        fts.b(this.d, this.f7886c, this.e);
    }

    @Override // com.huawei.health.knit.section.view.BaseSection
    protected void bindParamsToView(HashMap<String, Object> map) {
        LogUtil.a("SectionPopularRoutes", "bindViewParams");
        setSubHeaderTitle(qqw.b(map, "TITLE", null));
        setSubTitle(qqw.b(map, "SUBTITLE", null));
        setSubViewStatus(qqw.b(map, "SUBTITLE", null));
        setRightArrayVisibility(qqw.b(map, "RIGHT_ARRAY", null));
        fpy fpyVar = new fpy();
        b(qqw.b(map, "CLICK_EVENT_LISTENER", null), fpyVar);
        fpyVar.a(qqw.a((Map) map, "IMAGE", String.class, (List) new ArrayList()));
        fpyVar.e(qqw.a((Map) map, "NAME", String.class, (List) new ArrayList()));
        fpyVar.b(qqw.a((Map) map, "TOTAL_DISTANCE", Double.class, (List) new ArrayList()));
        fpyVar.c(qqw.a((Map) map, "PARTICIPATE_USER_NUM", Long.class, (List) new ArrayList()));
        setAdapterData(fpyVar);
    }

    private void setAdapterData(fpy fpyVar) {
        SectionPopularRoutesAdapter sectionPopularRoutesAdapter = this.e;
        if (sectionPopularRoutesAdapter == null) {
            SectionPopularRoutesAdapter sectionPopularRoutesAdapter2 = new SectionPopularRoutesAdapter(this.d, fpyVar);
            this.e = sectionPopularRoutesAdapter2;
            this.f7886c.setAdapter(sectionPopularRoutesAdapter2);
            return;
        }
        sectionPopularRoutesAdapter.a(fpyVar);
    }

    private void b(final Object obj, fpy fpyVar) {
        if (!fts.e(obj) || this.f7885b == null) {
            return;
        }
        LogUtil.a("SectionPopularRoutes", "click event is set");
        this.f7885b.setOnClickListener(new View.OnClickListener() { // from class: com.huawei.health.knit.section.view.SectionPopularRoutes.5
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                ((OnClickSectionListener) obj).onClick("ALL_CLICK_EVENT");
            }
        });
        fpyVar.b((OnClickSectionListener) obj);
    }

    @Override // com.huawei.health.knit.section.view.BaseSection, android.view.View.OnClickListener
    public void onClick(View view) {
        if (view.getId() == R.id.section_sub_header) {
            onClick("ALL_CLICK_EVENT");
        } else {
            LogUtil.e("view id is invalid", new Object[0]);
        }
    }

    @Override // com.huawei.health.knit.section.view.BaseSection
    public String getLogTag() {
        return "SectionPopularRoutes";
    }

    private void setSubTitle(Object obj) {
        if (this.f7885b != null) {
            if (fts.j(obj)) {
                LogUtil.a("SectionPopularRoutes", "subtitle is set");
                this.f7885b.setMoreTextVisibility(0);
                this.f7885b.setMoreText((String) obj);
            } else {
                LogUtil.a("SectionPopularRoutes", "subtitle is invisible");
                this.f7885b.setMoreTextVisibility(4);
            }
        }
    }

    private void setSubViewStatus(Object obj) {
        HealthSubHeader healthSubHeader;
        if (obj == null || (healthSubHeader = this.f7885b) == null) {
            return;
        }
        dkf.e(obj, healthSubHeader, "SectionPopularRoutes", 8, "gone");
    }

    private void setRightArrayVisibility(Object obj) {
        HealthSubHeader healthSubHeader;
        if (obj == null || (healthSubHeader = this.f7885b) == null) {
            return;
        }
        healthSubHeader.setRightArrayVisibility(0);
    }

    private void setSubHeaderTitle(Object obj) {
        if (!fts.j(obj) || this.f7885b == null) {
            return;
        }
        LogUtil.a("SectionPopularRoutes", "title is set");
        this.f7885b.setHeadTitleText((String) obj);
    }
}
