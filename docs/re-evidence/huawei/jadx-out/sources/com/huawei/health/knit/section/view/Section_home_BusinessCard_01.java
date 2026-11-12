package com.huawei.health.knit.section.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.huawei.health.marketing.views.ColumnLinearLayout;
import com.huawei.health.servicesui.R;
import com.huawei.hwlogsmodel.LogUtil;
import defpackage.qqw;
import java.util.HashMap;

/* JADX INFO: loaded from: classes7.dex */
public class Section_home_BusinessCard_01 extends BaseSection {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private LinearLayout f7985c;
    private ColumnLinearLayout d;

    public Section_home_BusinessCard_01(Context context) {
        this(context, null);
    }

    public Section_home_BusinessCard_01(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public Section_home_BusinessCard_01(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    @Override // com.huawei.health.knit.section.view.BaseSection
    public View onCreateView(Context context) {
        View viewInflate = LayoutInflater.from(context).inflate(R.layout.section_home_busineeecard_01, (ViewGroup) this, false);
        this.f7985c = (LinearLayout) viewInflate.findViewById(R.id.home_businesscard_layout);
        return viewInflate;
    }

    @Override // com.huawei.health.knit.section.view.BaseSection
    public String getLogTag() {
        return "Section_home_BusinessCard_01";
    }

    @Override // com.huawei.health.knit.section.view.BaseSection
    protected void bindParamsToView(HashMap<String, Object> map) {
        if (map == null || map.size() == 0) {
            LogUtil.a("Section_home_BusinessCard_01", "no need to bind");
            return;
        }
        Object objB = qqw.b(map, "BUSINESS_HOME", null);
        if (objB instanceof ColumnLinearLayout) {
            this.d = (ColumnLinearLayout) objB;
        }
        this.f7985c.addView(this.d);
    }
}
