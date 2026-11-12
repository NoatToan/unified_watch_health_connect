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
import defpackage.qqs;
import defpackage.qqw;
import defpackage.qsp;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes7.dex */
public class Section_SleepReport_Text_01 extends BaseSection {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Context f7982c;
    private HealthTextView d;
    private LinearLayout e;

    public Section_SleepReport_Text_01(Context context) {
        this(context, null);
    }

    public Section_SleepReport_Text_01(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public Section_SleepReport_Text_01(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f7982c = context;
    }

    @Override // com.huawei.health.knit.section.view.BaseSection
    public View onCreateView(Context context) {
        LogUtil.a("Section_SleepReport_Text_01", "onCreateView");
        View viewInflate = LayoutInflater.from(context).inflate(R.layout.section_sleep_report_text, (ViewGroup) this, false);
        this.e = (LinearLayout) viewInflate.findViewById(R.id.sleep_parse);
        this.d = (HealthTextView) viewInflate.findViewById(R.id.sleep_report);
        return viewInflate;
    }

    @Override // com.huawei.health.knit.section.view.BaseSection
    public String getLogTag() {
        return "Section_SleepReport_Text_01";
    }

    @Override // com.huawei.health.knit.section.view.BaseSection
    protected void bindParamsToView(HashMap<String, Object> map) {
        if (map == null || map.size() == 0) {
            LogUtil.a("Section_SleepReport_Text_01", "no need to bind");
            return;
        }
        LogUtil.a("Section_SleepReport_Text_01", "bindParamsToView");
        String strD = qqw.d((Map) map, "REPORT_TEXT", "");
        HealthTextView healthTextView = this.d;
        if (healthTextView == null) {
            return;
        }
        qsp.a(healthTextView, strD, true);
        if (qqs.e(this.f7982c)) {
            this.d.setTextColor(this.f7982c.getColor(R.color.common_white_60alpha));
        } else {
            this.d.setTextColor(this.f7982c.getColor(R.color.common_black_60alpha));
        }
    }

    public void setRootLayoutVisibility(int i) {
        LinearLayout linearLayout = this.e;
        if (linearLayout != null) {
            linearLayout.setVisibility(i);
        }
    }
}
