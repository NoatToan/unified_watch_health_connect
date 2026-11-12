package com.huawei.health.knit.section.view;

import android.content.Context;
import android.content.res.Configuration;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Pair;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import androidx.core.content.ContextCompat;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.huawei.haf.design.pattern.Observer;
import com.huawei.haf.design.pattern.ObserverManagerUtil;
import com.huawei.health.knit.section.adapter.Section3_2List_01_Adapter;
import com.huawei.health.knit.section.utils.SpacesItemDecoration;
import com.huawei.health.servicesui.R;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.ui.commonui.base.BaseActivity;
import com.huawei.ui.commonui.listener.OnClickSectionListener;
import com.huawei.ui.commonui.recycleview.HealthRecycleView;
import com.huawei.ui.commonui.subheader.HealthSubHeader;
import defpackage.fts;
import defpackage.gvi;
import defpackage.njy;
import defpackage.qqp;
import defpackage.qqs;
import defpackage.qqw;
import defpackage.qrs;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes7.dex */
public class Section3_2List_01 extends BaseSection {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private List<Map<String, Object>> f7680a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Context f7681b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f7682c;
    private HealthSubHeader d;
    private Map<String, List<Object>> e;
    private Observer f;
    private boolean g;
    private int h;
    private LinearLayout i;
    private String j;
    private OnClickSectionListener k;
    private Pair<Integer, Integer> l;
    private HealthRecycleView m;
    private Section3_2List_01_Adapter o;

    public Section3_2List_01(Context context) {
        super(context);
        this.l = BaseActivity.getSafeRegionWidth();
        this.g = false;
        this.h = Integer.MAX_VALUE;
    }

    public Section3_2List_01(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.l = BaseActivity.getSafeRegionWidth();
        this.g = false;
        this.h = Integer.MAX_VALUE;
    }

    public Section3_2List_01(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.l = BaseActivity.getSafeRegionWidth();
        this.g = false;
        this.h = Integer.MAX_VALUE;
    }

    @Override // com.huawei.health.knit.section.view.BaseSection
    protected void bindParamsToView(HashMap<String, Object> map) {
        c(map);
        d();
    }

    @Override // android.view.View
    protected void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        fts.b(this.f7681b, this.m, this.o);
    }

    @Override // com.huawei.health.knit.section.view.BaseSection
    public String getLogTag() {
        return "Section_Section3_2List_01";
    }

    private void c(HashMap<String, Object> map) {
        this.e = new HashMap();
        this.d.setHeadTitleText(qqw.d((Map) map, "TITLE", ""));
        String strD = qqw.d((Map) map, "SUBTITLE", "");
        setSubTitleVisible(qqw.a(map, "IS_SUBTITLE_VISIBLE", false));
        setScholasticSubTitle(strD);
        this.e.put("SCHOLASTIC_TYPE_IMAGE", qqw.a((Map) map, "SCHOLASTIC_TYPE_IMAGE", Object.class, (List) new ArrayList()));
        this.e.put("SCHOLASTIC_TYPE_CONTENT", qqw.a((Map) map, "SCHOLASTIC_TYPE_CONTENT", Object.class, (List) new ArrayList()));
        OnClickSectionListener onClickSectionListenerC = qqw.c(map, "CLICK_EVENT_LISTENER", (OnClickSectionListener) null);
        if (onClickSectionListenerC != null) {
            this.d.setMoreViewClickListener(onClickSectionListenerC);
            this.k = onClickSectionListenerC;
        }
        int iC = qqw.c(map, "ITEM_LIMIT", 0);
        if (iC > 0) {
            this.h = iC;
        }
        this.f7682c = qqw.d((Map) map, "HIGHLIGHTED_TEXT", "");
        Object obj = map.get("ITEM_BI_EVENT_MAP");
        if (njy.b(obj, Map.class)) {
            this.f7680a = (List) obj;
        } else {
            this.f7680a = new ArrayList();
        }
        String strD2 = qqw.d((Map) map, "BI_OBSERVER_LABEL", (String) null);
        if (strD2 == null || TextUtils.equals(strD2, this.j)) {
            return;
        }
        String str = this.j;
        if (str != null && this.f != null) {
            LogUtil.a("Section_Section3_2List_01", "unregister old observer, old label: ", str);
            ObserverManagerUtil.a(this.f, this.j);
        }
        Observer observerE = gvi.e(this.m);
        this.f = observerE;
        this.j = strD2;
        ObserverManagerUtil.d(observerE, strD2);
        LogUtil.a("Section_Section3_2List_01", "register biObserver, label: ", this.j);
    }

    private void d() {
        Section3_2List_01_Adapter section3_2List_01_Adapter;
        if (this.o == null) {
            this.o = new Section3_2List_01_Adapter(this.f7681b);
        }
        this.o.d(this.k);
        this.o.e(this.f7682c);
        this.o.c(this.f7680a);
        this.o.a(this.h);
        Map<String, List<Object>> map = this.e;
        if (map != null && (section3_2List_01_Adapter = this.o) != null) {
            section3_2List_01_Adapter.d(map);
            this.m.setAdapter(this.o);
        } else {
            LogUtil.j("Section_Section3_2List_01", "subDataList is null or scholasticPageSectionAdapter is null");
        }
    }

    @Override // com.huawei.health.knit.section.view.BaseSection
    public View onCreateView(Context context) {
        this.f7681b = context;
        View viewInflate = LayoutInflater.from(getContext()).inflate(R.layout.configuredscholasticpagesection_layout, (ViewGroup) this, false);
        this.d = (HealthSubHeader) viewInflate.findViewById(R.id.configure_page_header);
        this.i = (LinearLayout) viewInflate.findViewById(R.id.layout_configured_page);
        if (qqs.e(this.f7681b)) {
            this.i.setBackgroundColor(this.f7681b.getResources().getColor(com.huawei.ui.commonui.R.color.emui_color_bg));
        }
        this.d.setSubHeaderBackgroundColor(ContextCompat.getColor(viewInflate.getContext(), R.color.common_transparent));
        this.m = (HealthRecycleView) viewInflate.findViewById(R.id.configured_page_recycle_view);
        this.d.setMoreTextVisibility(0);
        this.m.setNestedScrollingEnabled(false);
        this.m.setHasFixedSize(true);
        this.m.b(false);
        this.m.e(false);
        c();
        this.m.setLayoutManager(new LinearLayoutManager(this.f7681b));
        setRecyclerViewLayout(this.m);
        return viewInflate;
    }

    private void setRecyclerViewLayout(HealthRecycleView healthRecycleView) {
        int i;
        int iB = qqp.b(this.f7681b);
        if (qrs.af(this.f7681b)) {
            i = 2;
        } else {
            i = 1;
            iB = 0;
        }
        GridLayoutManager gridLayoutManager = new GridLayoutManager(this.f7681b, i);
        gridLayoutManager.setOrientation(1);
        healthRecycleView.setLayoutManager(gridLayoutManager);
        if (healthRecycleView.getItemDecorationCount() > 0) {
            healthRecycleView.removeItemDecorationAt(0);
        }
        healthRecycleView.addItemDecoration(new SpacesItemDecoration(iB, BaseApplication.getContext().getResources().getDimensionPixelSize(com.huawei.ui.commonui.R.dimen.cardMarginMiddle), i, new int[]{0, qrs.d(BaseApplication.getContext(), 4.0f), 0, qrs.d(BaseApplication.getContext(), 4.0f)}));
        healthRecycleView.setHasFixedSize(true);
        healthRecycleView.setNestedScrollingEnabled(false);
        healthRecycleView.setVisibility(0);
    }

    private void setScholasticSubTitle(String str) {
        if (TextUtils.isEmpty(str) || !this.g) {
            this.d.setMoreTextVisibility(4);
            this.d.setMoreLayoutVisibility(4);
        } else {
            this.d.setMoreTextVisibility(0);
            this.d.setMoreLayoutVisibility(0);
            this.d.setMoreText(str);
        }
    }

    public void setSubTitleVisible(boolean z) {
        this.g = z;
    }

    private void c() {
        this.m.setBackground(BaseApplication.getContext().getResources().getDrawable(R.drawable.configured_item_image_text_background));
        ViewGroup.LayoutParams layoutParams = this.m.getLayoutParams();
        if (layoutParams instanceof RelativeLayout.LayoutParams) {
            RelativeLayout.LayoutParams layoutParams2 = (RelativeLayout.LayoutParams) layoutParams;
            int dimensionPixelSize = BaseApplication.getContext().getResources().getDimensionPixelSize(R.dimen.defaultPaddingStart);
            int dimensionPixelSize2 = BaseApplication.getContext().getResources().getDimensionPixelSize(R.dimen.defaultPaddingEnd);
            layoutParams2.setMarginStart(dimensionPixelSize + ((Integer) this.l.first).intValue());
            layoutParams2.setMarginEnd(dimensionPixelSize2 + ((Integer) this.l.second).intValue());
            this.m.setLayoutParams(layoutParams2);
        }
    }
}
