package com.huawei.health.knit.section.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.huawei.health.knit.section.adapter.SectionSimpleRecordAdapter;
import com.huawei.health.servicesui.R;
import com.huawei.hms.support.api.entity.common.CommonConstant;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.ui.commonui.recycleview.HealthRecycleView;
import com.huawei.ui.commonui.subheader.HealthSubHeader;
import defpackage.fqc;
import defpackage.qqw;
import defpackage.qsp;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes7.dex */
public class SectionSimpleRecord extends BaseSection {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private HealthRecycleView f7926a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private SectionSimpleRecordAdapter f7927b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Context f7928c;
    private View d;
    private HealthSubHeader e;

    public SectionSimpleRecord(Context context) {
        super(context);
    }

    public SectionSimpleRecord(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public SectionSimpleRecord(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    @Override // com.huawei.health.knit.section.view.BaseSection
    public View onCreateView(Context context) {
        LogUtil.a("SectionSimpleRecord", "onCreateView");
        this.f7928c = context;
        View viewInflate = LayoutInflater.from(context).inflate(R.layout.section_simple_record_layout, (ViewGroup) this, false);
        this.d = viewInflate;
        this.e = (HealthSubHeader) viewInflate.findViewById(R.id.section_simple_sub_header);
        this.f7926a = (HealthRecycleView) this.d.findViewById(R.id.simple_record_recyclerview);
        return this.d;
    }

    @Override // com.huawei.health.knit.section.view.BaseSection
    public String getLogTag() {
        return "SectionSimpleRecord";
    }

    @Override // com.huawei.health.knit.section.view.BaseSection
    protected void bindParamsToView(HashMap<String, Object> map) {
        LogUtil.a("SectionSimpleRecord", "start to bindViewParams");
        if (map == null || map.size() == 0) {
            LogUtil.e("SectionSimpleRecord", "no need to bind");
            return;
        }
        qsp.d(this.e, 0, qqw.d((Map) map, "ITEM_TITLE", ""), 4, 8);
        this.e.setSubHeaderBackgroundColor(0);
        List listA = qqw.a((Map) map, "LEFT_ICON_TEXT", String.class, (List) new ArrayList());
        List listA2 = qqw.a((Map) map, "CLICK_EVENT_LISTENER", View.OnClickListener.class, (List) new ArrayList());
        int iC = qqw.c(map, "RIGHT_ICON_IMAGE", 0);
        int iC2 = qqw.c(map, CommonConstant.RETKEY.STATUS, 0);
        if (this.f7927b == null) {
            this.f7927b = new SectionSimpleRecordAdapter(iC2);
            this.f7926a.setLayoutManager(new LinearLayoutManager(this.f7928c));
            this.f7926a.setNestedScrollingEnabled(false);
            this.f7926a.b(false);
            this.f7926a.e(false);
            this.f7926a.setAdapter(this.f7927b);
        }
        this.f7927b.d(new fqc(listA, listA2, iC));
    }
}
