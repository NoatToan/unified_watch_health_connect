package com.huawei.health.knit.section.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.huawei.health.servicesui.R;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.ui.commonui.healthtextview.HealthTextView;
import defpackage.qqs;
import defpackage.qqw;
import defpackage.qrs;
import defpackage.qsp;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes7.dex */
public class Section_SleepReport_Text_02 extends BaseSection {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private HealthTextView f7983a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private LinearLayout f7984b;
    private View e;

    public Section_SleepReport_Text_02(Context context) {
        this(context, null);
    }

    public Section_SleepReport_Text_02(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public Section_SleepReport_Text_02(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    @Override // com.huawei.health.knit.section.view.BaseSection
    public View onCreateView(Context context) {
        LogUtil.a("Section_SleepReport_Text_02", "onCreateView");
        if (this.e == null) {
            View viewInflate = LayoutInflater.from(context).inflate(R.layout.section_sleep_report_text, (ViewGroup) this, false);
            this.e = viewInflate;
            this.f7984b = (LinearLayout) viewInflate.findViewById(R.id.sleep_parse);
            HealthTextView healthTextView = (HealthTextView) this.e.findViewById(R.id.sleep_report);
            this.f7983a = healthTextView;
            healthTextView.setTextSize(2, 12.0f);
            if (qqs.e(context)) {
                this.f7983a.setTextColor(context.getColor(R.color.common_white_60alpha));
            } else {
                this.f7983a.setTextColor(context.getColor(R.color.common_black_60alpha));
            }
        }
        return this.e;
    }

    @Override // com.huawei.health.knit.section.view.BaseSection
    public String getLogTag() {
        return "Section_SleepReport_Text_02";
    }

    @Override // com.huawei.health.knit.section.view.BaseSection
    protected void bindParamsToView(HashMap<String, Object> map) {
        if (map == null || map.size() == 0) {
            LogUtil.a("Section_SleepReport_Text_02", "no need to bind");
            return;
        }
        LogUtil.a("Section_SleepReport_Text_02", "bindParamsToView");
        if (this.f7983a == null) {
            return;
        }
        qsp.a(this.f7983a, qqw.d((Map) map, "REPORT_TEXT", ""), true);
        this.f7983a.setPadding(qrs.d(BaseApplication.getContext(), 12.0f), 0, qrs.d(BaseApplication.getContext(), 12.0f), 0);
    }

    public void setRootLayoutVisibility(int i) {
        LinearLayout linearLayout = this.f7984b;
        if (linearLayout != null) {
            linearLayout.setVisibility(i);
        }
    }
}
