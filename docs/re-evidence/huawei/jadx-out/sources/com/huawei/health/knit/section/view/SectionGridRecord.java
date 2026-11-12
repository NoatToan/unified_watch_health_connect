package com.huawei.health.knit.section.view;

import android.content.Context;
import android.text.SpannableString;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.huawei.health.knit.section.adapter.SectionGridAdapter;
import com.huawei.health.knit.section.utils.SpacesItemDecoration;
import com.huawei.health.servicesui.R;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.ui.commonui.listener.OnClickSectionListener;
import com.huawei.ui.commonui.recycleview.HealthRecycleView;
import com.huawei.ui.commonui.subheader.HealthSubHeader;
import defpackage.dkf;
import defpackage.qqp;
import defpackage.qqw;
import defpackage.qrs;
import defpackage.qsp;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes7.dex */
public class SectionGridRecord extends BaseSection {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private HealthRecycleView f7797a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private View f7798b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private List<SpannableString> f7799c;
    private Context d;
    private SectionGridAdapter e;
    private List<String> f;
    private List<Integer> g;
    private HealthSubHeader h;
    private OnClickSectionListener i;

    public SectionGridRecord(Context context) {
        super(context);
    }

    public SectionGridRecord(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public SectionGridRecord(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    @Override // com.huawei.health.knit.section.view.BaseSection
    public View onCreateView(Context context) {
        LogUtil.a("SectionGridRecord", "onCreateView");
        this.d = context;
        c();
        return this.f7798b;
    }

    private void c() {
        int i;
        if (this.f7798b == null) {
            LogUtil.j("SectionGridRecord", "initView mainView is null, start to inflate");
            this.f7798b = LayoutInflater.from(this.d).inflate(R.layout.section_grid_record_layout, (ViewGroup) this, false);
        }
        this.f7797a = (HealthRecycleView) this.f7798b.findViewById(R.id.section_abnormal_week_layout_recyclerview);
        HealthSubHeader healthSubHeader = (HealthSubHeader) this.f7798b.findViewById(R.id.section_blood_pressure_week_sub_header);
        this.h = healthSubHeader;
        healthSubHeader.setGuideLine();
        if (qrs.af(this.d)) {
            i = 4;
        } else {
            i = qrs.v() ? 2 : 3;
        }
        this.f7797a.setLayoutManager(new GridLayoutManager(this.d, i));
        dkf.d(this.f7797a);
        SectionGridAdapter sectionGridAdapter = new SectionGridAdapter(this.d);
        this.e = sectionGridAdapter;
        this.f7797a.setAdapter(sectionGridAdapter);
    }

    @Override // com.huawei.health.knit.section.view.BaseSection
    public String getLogTag() {
        return "SectionGridRecord";
    }

    @Override // com.huawei.health.knit.section.view.BaseSection
    public void bindParamsToView(HashMap<String, Object> map) {
        int i;
        LogUtil.a("SectionGridRecord", "start to bindViewParams");
        if (map == null || map.size() == 0) {
            LogUtil.a("SectionGridRecord", "no need to bind");
            return;
        }
        if (qrs.af(this.d)) {
            i = 4;
        } else {
            i = qrs.v() ? 2 : 3;
        }
        RecyclerView.LayoutManager layoutManager = this.f7797a.getLayoutManager();
        if (layoutManager instanceof GridLayoutManager) {
            GridLayoutManager gridLayoutManager = (GridLayoutManager) layoutManager;
            gridLayoutManager.setSpanCount(i);
            this.f7797a.setLayoutManager(gridLayoutManager);
        }
        while (this.f7797a.getItemDecorationCount() > 0) {
            this.f7797a.removeItemDecorationAt(0);
        }
        this.f7797a.addItemDecoration(new SpacesItemDecoration(qqp.b(this.d), qqp.b(this.d), i, new int[]{0, 0, 0, 0}));
        qsp.d(this.h, 0, qqw.d((Map) map, "TITLE", ""), 8, 8);
        this.f = qqw.a((Map) map, "TOP_TEXT", String.class, (List) new ArrayList());
        this.g = qqw.a((Map) map, "TOP_TEXT_COLOR", Integer.class, (List) new ArrayList());
        this.f7799c = qqw.a((Map) map, "BOTTOM_UNIT", SpannableString.class, (List) new ArrayList());
        OnClickSectionListener onClickSectionListener = (OnClickSectionListener) qqw.a(map, "CLICK_EVENT_LISTENER", (Class<Object>) OnClickSectionListener.class, (Object) null);
        this.i = onClickSectionListener;
        this.e.b(this.f, this.g, this.f7799c, onClickSectionListener);
    }
}
