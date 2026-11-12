package com.huawei.health.section.section;

import android.content.Context;
import android.content.res.Configuration;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.content.ContextCompat;
import com.huawei.haf.design.pattern.Observer;
import com.huawei.haf.design.pattern.ObserverManagerUtil;
import com.huawei.health.knit.section.view.BaseSection;
import com.huawei.health.section.adapter.Section1_1Search_01Adapter;
import com.huawei.health.servicesui.R;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.ui.commonui.listener.OnClickSectionListener;
import com.huawei.ui.commonui.recycleview.HealthRecycleView;
import com.huawei.ui.commonui.subheader.HealthSubHeader;
import defpackage.dkf;
import defpackage.fts;
import defpackage.gvi;
import defpackage.gvn;
import defpackage.njy;
import defpackage.qqw;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes8.dex */
public class Section1_1Search_01 extends BaseSection {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Context f8750a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Observer f8751b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f8752c;
    private View d;
    private Section1_1Search_01Adapter e;
    private HealthRecycleView f;
    private HealthSubHeader i;

    public Section1_1Search_01(Context context) {
        this(context, null);
    }

    public Section1_1Search_01(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public Section1_1Search_01(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f8750a = context;
    }

    @Override // com.huawei.health.knit.section.view.BaseSection
    public View onCreateView(Context context) {
        View viewInflate = LayoutInflater.from(context).inflate(R.layout.section1_1list_01_layout, (ViewGroup) this, false);
        this.d = viewInflate;
        HealthSubHeader healthSubHeader = (HealthSubHeader) viewInflate.findViewById(R.id.section_sub_header);
        this.i = healthSubHeader;
        dkf.c(healthSubHeader);
        this.i.setSubHeaderBackgroundColor(ContextCompat.getColor(this.d.getContext(), R.color.common_transparent));
        this.d.findViewById(R.id.section1_1list_01_recycler_layout).setVisibility(0);
        HealthRecycleView healthRecycleView = (HealthRecycleView) this.d.findViewById(R.id.section1_1list_01_recycler_view);
        this.f = healthRecycleView;
        dkf.a(healthRecycleView, context);
        return this.d;
    }

    @Override // android.view.View
    protected void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        fts.b(this.f8750a, this.f, this.e);
    }

    @Override // com.huawei.health.knit.section.view.BaseSection
    public String getLogTag() {
        return "Section1_1Search_01";
    }

    @Override // com.huawei.health.knit.section.view.BaseSection
    public void bindParamsToView(HashMap<String, Object> map) {
        gvn gvnVar = new gvn();
        dkf.e(this.i, map);
        gvnVar.d(qqw.c(map, "CLICK_EVENT_LISTENER", (OnClickSectionListener) null));
        gvnVar.m(qqw.a((Map) map, "ITEM_TITLE", String.class, (List) new ArrayList()));
        gvnVar.g(qqw.a((Map) map, "ITEM_TAG", String.class, (List) new ArrayList()));
        gvnVar.f(qqw.a((Map) map, "ITEM_SUBTITLE", String.class, (List) new ArrayList()));
        gvnVar.e(qqw.a((Map) map, "ITEM_IMAGE", Object.class, (List) new ArrayList()));
        gvnVar.h(qqw.a((Map) map, "ITEM_RIGHT_BTN", String.class, (List) new ArrayList()));
        gvnVar.e(qqw.d((Map) map, "HIGHLIGHTED_TEXT", ""));
        gvnVar.j(qqw.a((Map) map, "ITEM_PARENT_TITLE", String.class, (List) new ArrayList()));
        gvnVar.a(qqw.a((Map) map, "ITEM_DESCRIPTION", String.class, (List) new ArrayList()));
        gvnVar.b(qqw.a((Map) map, "ITEM_JOIN_NUMBER", String.class, (List) new ArrayList()));
        gvnVar.i(qqw.a((Map) map, "ITEM_PAGE_ATTRIBUTE", String.class, (List) new ArrayList()));
        gvnVar.d(qqw.a((Map) map, "RIGHT_ICON_IMAGE", Object.class, (List) new ArrayList()));
        Object obj = map.get("ITEM_BI_EVENT_MAP");
        if (njy.b(obj, Map.class)) {
            gvnVar.c((List) obj);
        }
        String strD = qqw.d((Map) map, "BI_OBSERVER_LABEL", (String) null);
        if (strD != null && !TextUtils.equals(strD, this.f8752c)) {
            String str = this.f8752c;
            if (str != null && this.f8751b != null) {
                LogUtil.a("Section1_1Search_01", "unregister old observer, old label: ", str);
                ObserverManagerUtil.a(this.f8751b, this.f8752c);
            }
            Observer observerE = gvi.e(this.f);
            this.f8751b = observerE;
            this.f8752c = strD;
            ObserverManagerUtil.d(observerE, strD);
            LogUtil.a("Section1_1Search_01", "register biObserver, label: ", this.f8752c);
        }
        this.e = new Section1_1Search_01Adapter(this.f8750a, gvnVar);
        int iC = qqw.c(map, "ITEM_LIMIT", 0);
        if (iC > 0) {
            this.e.b(iC);
        }
        this.f.setAdapter(this.e);
    }
}
