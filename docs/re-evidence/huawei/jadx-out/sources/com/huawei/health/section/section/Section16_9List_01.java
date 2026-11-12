package com.huawei.health.section.section;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.content.ContextCompat;
import androidx.recyclerview.widget.GridLayoutManager;
import com.huawei.haf.design.pattern.Observer;
import com.huawei.haf.design.pattern.ObserverManagerUtil;
import com.huawei.health.knit.section.view.BaseSection;
import com.huawei.health.marketing.utils.ColumnLayoutItemDecoration;
import com.huawei.health.section.adapter.Section16_9List_01Adapter;
import com.huawei.health.servicesui.R;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.ui.commonui.listener.OnClickSectionListener;
import com.huawei.ui.commonui.recycleview.HealthRecycleView;
import com.huawei.ui.commonui.subheader.HealthSubHeader;
import defpackage.dkf;
import defpackage.fxk;
import defpackage.gvi;
import defpackage.gvo;
import defpackage.njy;
import defpackage.qqw;
import defpackage.qrs;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes8.dex */
public class Section16_9List_01 extends BaseSection {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Context f8747a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private HealthRecycleView f8748b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Observer f8749c;
    private String d;
    private boolean e;
    private View g;
    private HealthSubHeader h;

    public Section16_9List_01(Context context) {
        this(context, null);
    }

    public Section16_9List_01(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public Section16_9List_01(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f8747a = context;
    }

    @Override // com.huawei.health.knit.section.view.BaseSection
    public View onCreateView(Context context) {
        View viewInflate = LayoutInflater.from(context).inflate(R.layout.cloumn_linearlayout, (ViewGroup) this, false);
        this.g = viewInflate;
        HealthSubHeader healthSubHeader = (HealthSubHeader) viewInflate.findViewById(R.id.marketing_grid_sub_header);
        this.h = healthSubHeader;
        healthSubHeader.setMoreTextVisibility(4);
        this.h.setMoreLayoutVisibility(4);
        this.h.setSubHeaderBackgroundColor(ContextCompat.getColor(this.g.getContext(), R.color.common_transparent));
        this.f8748b = (HealthRecycleView) this.g.findViewById(R.id.marketing_grid_recycler_view);
        b();
        return this.g;
    }

    @Override // android.view.View
    protected void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        b();
    }

    private void b() {
        LogUtil.a("Section16_9List_01", "initConfiguredItemLayout");
        boolean zAf = qrs.af(BaseApplication.getContext());
        this.e = zAf;
        a(fxk.a(6, zAf, 0), fxk.a(6, this.e), fxk.c(6), fxk.a(6, 0));
    }

    private void a(int i, int i2, int i3, int[] iArr) {
        if (this.f8747a == null) {
            LogUtil.j("Section16_9List_01", "setRecyclerViewLayout() mContext is null.");
            return;
        }
        if (i < 1) {
            LogUtil.j("Section16_9List_01", "setRecyclerViewLayout() gridNumber should be at least 1.");
            return;
        }
        GridLayoutManager gridLayoutManager = new GridLayoutManager(this.f8747a, i);
        gridLayoutManager.setOrientation(1);
        this.f8748b.setLayoutManager(gridLayoutManager);
        if (this.f8748b.getItemDecorationCount() > 0) {
            this.f8748b.removeItemDecorationAt(0);
        }
        this.f8748b.addItemDecoration(new ColumnLayoutItemDecoration(i2, i3, i, iArr));
        this.f8748b.setHasFixedSize(true);
        this.f8748b.setNestedScrollingEnabled(false);
        this.f8748b.b(false);
        this.f8748b.e(false);
        this.f8748b.setVisibility(0);
    }

    @Override // com.huawei.health.knit.section.view.BaseSection
    public String getLogTag() {
        return "Section16_9List_01";
    }

    @Override // com.huawei.health.knit.section.view.BaseSection
    public void bindParamsToView(HashMap<String, Object> map) {
        gvo gvoVar = new gvo();
        dkf.e(this.h, map);
        gvoVar.b(qqw.c(map, "CLICK_EVENT_LISTENER", (OnClickSectionListener) null));
        int iC = qqw.c(map, "ITEM_LIMIT", 0);
        if (iC > 0) {
            gvoVar.b(iC);
        }
        gvoVar.j(qqw.a((Map) map, "ITEM_VIEW_TYPE", Integer.class, (List) new ArrayList()));
        gvoVar.g(qqw.a((Map) map, "ITEM_TITLE", String.class, (List) new ArrayList()));
        gvoVar.d(qqw.a((Map) map, "ITEM_DESCRIPTION", String.class, (List) new ArrayList()));
        gvoVar.b(qqw.a((Map) map, "ITEM_IMAGE", Object.class, (List) new ArrayList()));
        gvoVar.c(qqw.a((Map) map, "ITEM_PAGE_ATTRIBUTE", String.class, (List) new ArrayList()));
        gvoVar.h(qqw.a((Map) map, "ITEM_STATUS", String.class, (List) new ArrayList()));
        gvoVar.a(qqw.a((Map) map, "ITEM_JOIN_NUMBER", String.class, (List) new ArrayList()));
        gvoVar.f(qqw.a((Map) map, "ITEM_STATUS_BACKGROUND", Drawable.class, (List) new ArrayList()));
        gvoVar.b(qqw.d((Map) map, "HIGHLIGHTED_TEXT", ""));
        Object obj = map.get("ITEM_BI_EVENT_MAP");
        if (njy.b(obj, Map.class)) {
            gvoVar.e((List) obj);
        }
        String strD = qqw.d((Map) map, "BI_OBSERVER_LABEL", (String) null);
        if (strD != null && !TextUtils.equals(strD, this.d)) {
            String str = this.d;
            if (str != null && this.f8749c != null) {
                LogUtil.a("Section16_9List_01", "unregister old observer, old label: ", str);
                ObserverManagerUtil.a(this.f8749c, this.d);
            }
            Observer observerE = gvi.e(this.f8748b);
            this.f8749c = observerE;
            this.d = strD;
            ObserverManagerUtil.d(observerE, strD);
            LogUtil.a("Section16_9List_01", "register biObserver, label: ", this.d);
        }
        this.f8748b.setAdapter(new Section16_9List_01Adapter(this.f8747a, gvoVar));
    }
}
