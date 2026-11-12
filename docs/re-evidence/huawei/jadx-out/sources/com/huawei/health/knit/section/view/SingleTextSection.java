package com.huawei.health.knit.section.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.huawei.health.servicesui.R;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.ui.commonui.healthtextview.HealthTextView;
import defpackage.qqw;
import defpackage.qsp;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes7.dex */
public class SingleTextSection extends BaseSection {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private View f7989b;
    private HealthTextView e;

    @Override // com.huawei.health.knit.section.view.BaseSection
    public boolean isSupportShare() {
        return false;
    }

    public SingleTextSection(Context context) {
        this(context, null);
    }

    public SingleTextSection(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public SingleTextSection(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    @Override // com.huawei.health.knit.section.view.BaseSection
    public View onCreateView(Context context) {
        LogUtil.a("SingleTextSection", "onCreateView");
        View viewInflate = LayoutInflater.from(context).inflate(R.layout.single_text_layout, (ViewGroup) this, false);
        this.f7989b = viewInflate;
        this.e = (HealthTextView) viewInflate.findViewById(R.id.heart_rate_reminder);
        return this.f7989b;
    }

    @Override // com.huawei.health.knit.section.view.BaseSection
    public String getLogTag() {
        return "SingleTextSection";
    }

    @Override // com.huawei.health.knit.section.view.BaseSection
    protected void bindParamsToView(HashMap<String, Object> map) {
        if (map == null || map.size() == 0) {
            LogUtil.a("SingleTextSection", "no need to bind");
            return;
        }
        LogUtil.a("SingleTextSection", "bindParamsToView");
        qsp.a(this.e, qqw.d((Map) map, "REPORT_TEXT", ""), true);
        a(map, this.e);
    }

    private void a(HashMap<String, Object> map, HealthTextView healthTextView) {
        int iC = qqw.c(map, "MARGIN_TOP", -1);
        if (iC == -1 || !(healthTextView.getLayoutParams() instanceof LinearLayout.LayoutParams)) {
            return;
        }
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) healthTextView.getLayoutParams();
        layoutParams.topMargin = iC;
        healthTextView.setLayoutParams(layoutParams);
    }
}
