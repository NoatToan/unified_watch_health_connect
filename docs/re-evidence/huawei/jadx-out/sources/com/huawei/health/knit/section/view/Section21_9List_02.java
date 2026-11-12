package com.huawei.health.knit.section.view;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.content.ContextCompat;
import com.huawei.haf.design.pattern.Observer;
import com.huawei.haf.design.pattern.ObserverManagerUtil;
import com.huawei.health.knit.section.adapter.Section21_9List_02Adapter;
import com.huawei.health.servicesui.R;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.ui.commonui.listener.OnClickSectionListener;
import com.huawei.ui.commonui.recycleview.HealthLinearLayoutManager;
import com.huawei.ui.commonui.recycleview.HealthRecycleView;
import com.huawei.ui.commonui.subheader.HealthSubHeader;
import defpackage.foy;
import defpackage.fts;
import defpackage.gvi;
import defpackage.njy;
import defpackage.qqw;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes7.dex */
public class Section21_9List_02 extends BaseSection {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Observer f7663a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private OnClickSectionListener f7664b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Context f7665c;
    private String d;
    private List<foy> e;
    private View h;
    private HealthSubHeader i;
    private HealthRecycleView j;

    public Section21_9List_02(Context context) {
        this(context, null);
    }

    public Section21_9List_02(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public Section21_9List_02(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f7665c = context;
    }

    @Override // com.huawei.health.knit.section.view.BaseSection
    public View onCreateView(Context context) {
        View viewInflate = LayoutInflater.from(context).inflate(R.layout.section21_9list_02_layout, (ViewGroup) this, false);
        this.h = viewInflate;
        HealthSubHeader healthSubHeader = (HealthSubHeader) viewInflate.findViewById(R.id.section21_9list_02_sub_header);
        this.i = healthSubHeader;
        healthSubHeader.setMoreTextVisibility(4);
        this.i.setMoreLayoutVisibility(4);
        this.i.setSubHeaderBackgroundColor(ContextCompat.getColor(this.h.getContext(), R.color.common_transparent));
        HealthRecycleView healthRecycleView = (HealthRecycleView) this.h.findViewById(R.id.section21_9list_02_recycle_view);
        this.j = healthRecycleView;
        healthRecycleView.setHasFixedSize(true);
        this.j.setNestedScrollingEnabled(false);
        this.j.b(false);
        this.j.e(false);
        fts.d(context, this.j, new HealthLinearLayoutManager(context), false, 0);
        return this.h;
    }

    @Override // com.huawei.health.knit.section.view.BaseSection
    public String getLogTag() {
        return "Section21_9List_02";
    }

    @Override // com.huawei.health.knit.section.view.BaseSection
    protected void bindParamsToView(HashMap<String, Object> map) {
        if (map == null || map.isEmpty()) {
            LogUtil.a("Section21_9List_02", "currentParams is null or empty");
            return;
        }
        this.i.setHeadTitleText(qqw.d((Map) map, "TITLE", ""));
        this.f7664b = qqw.c(map, "CLICK_EVENT_LISTENER", (OnClickSectionListener) null);
        String strD = qqw.d((Map) map, "SHOWMORE", (String) null);
        final OnClickSectionListener onClickSectionListenerC = qqw.c(map, "SHOW_MORE_CLICK_EVENT", (OnClickSectionListener) null);
        if (strD != null && onClickSectionListenerC != null) {
            this.i.setMoreText(strD);
            this.i.setMoreTextVisibility(0);
            this.i.setMoreLayoutVisibility(0);
            this.i.setMoreViewClickListener(new View.OnClickListener() { // from class: fuj
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    onClickSectionListenerC.onClick("SHOW_MORE_CLICK_EVENT");
                }
            });
        } else {
            this.i.setMoreText("");
            this.i.setMoreTextVisibility(4);
            this.i.setMoreLayoutVisibility(4);
        }
        Object obj = map.get("SECTION21_9LIST_02BEAN");
        this.e = njy.b(obj, foy.class) ? (List) obj : null;
        String strD2 = qqw.d((Map) map, "BI_OBSERVER_LABEL", (String) null);
        if (strD2 != null && !TextUtils.equals(strD2, this.d)) {
            String str = this.d;
            if (str != null && this.f7663a != null) {
                LogUtil.a("Section21_9List_02", "unregister old observer, old label: ", str);
                ObserverManagerUtil.a(this.f7663a, this.d);
            }
            Observer observerE = gvi.e(this.j);
            this.f7663a = observerE;
            this.d = strD2;
            ObserverManagerUtil.d(observerE, strD2);
            LogUtil.a("Section21_9List_02", "register biObserver, label: ", this.d);
        }
        if (this.e != null) {
            Section21_9List_02Adapter section21_9List_02Adapter = new Section21_9List_02Adapter(this.f7665c, this.e);
            section21_9List_02Adapter.c(this.f7664b);
            section21_9List_02Adapter.b(qqw.d((Map) map, "HIGHLIGHTED_TEXT", ""));
            int iC = qqw.c(map, "ITEM_LIMIT", 0);
            if (iC > 0) {
                section21_9List_02Adapter.a(iC);
            }
            this.j.setAdapter(section21_9List_02Adapter);
        }
    }
}
