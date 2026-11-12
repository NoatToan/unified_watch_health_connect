package com.huawei.health.knit.section.view;

import android.content.Context;
import android.text.SpannableString;
import android.text.method.LinkMovementMethod;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.huawei.health.servicesui.R;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.ui.commonui.healthtextview.HealthTextView;
import defpackage.qqs;
import defpackage.qrs;
import java.util.HashMap;

/* JADX INFO: loaded from: classes7.dex */
public class Section_SleepOrigin_Text extends BaseSection {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private LinearLayout f7981c;
    private HealthTextView e;

    public Section_SleepOrigin_Text(Context context) {
        super(context);
    }

    public Section_SleepOrigin_Text(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public Section_SleepOrigin_Text(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    @Override // com.huawei.health.knit.section.view.BaseSection
    public View onCreateView(Context context) {
        View viewInflate = LayoutInflater.from(context).inflate(R.layout.section_sleep_report_text, (ViewGroup) this, false);
        this.f7981c = (LinearLayout) viewInflate.findViewById(R.id.sleep_parse);
        this.e = (HealthTextView) viewInflate.findViewById(R.id.sleep_report);
        if (qqs.e(context)) {
            this.e.setTextColor(context.getColor(R.color.common_white_60alpha));
        } else {
            this.e.setTextColor(context.getColor(R.color.common_black_60alpha));
        }
        this.e.setPadding(0, 0, 0, qrs.d(context, 12.0f));
        return viewInflate;
    }

    @Override // com.huawei.health.knit.section.view.BaseSection
    public String getLogTag() {
        return "Section_SleepOrigin_Text";
    }

    @Override // com.huawei.health.knit.section.view.BaseSection
    protected void bindParamsToView(HashMap<String, Object> map) {
        HealthTextView healthTextView;
        if (map == null || map.size() == 0) {
            LogUtil.a("Section_SleepOrigin_Text", "no need to bind");
            return;
        }
        LogUtil.a("Section_SleepOrigin_Text", "bindParamsToView");
        Object obj = map.get("CORE_SLEEP_BTN_TIPS");
        if ((obj instanceof Boolean) && ((Boolean) obj).booleanValue() && (this.e.getLayoutParams() instanceof LinearLayout.LayoutParams)) {
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.e.getLayoutParams();
            layoutParams.setMarginStart(getContext().getResources().getDimensionPixelOffset(R.dimen.health_common_24dp));
            layoutParams.setMarginEnd(getContext().getResources().getDimensionPixelOffset(R.dimen.health_common_24dp));
            this.e.setLayoutParams(layoutParams);
        }
        Object obj2 = map.get("REPORT_TEXT");
        if (!(obj2 instanceof SpannableString) || (healthTextView = this.e) == null) {
            return;
        }
        healthTextView.setVisibility(0);
        this.e.setText((SpannableString) obj2);
        this.e.setMovementMethod(LinkMovementMethod.getInstance());
    }
}
