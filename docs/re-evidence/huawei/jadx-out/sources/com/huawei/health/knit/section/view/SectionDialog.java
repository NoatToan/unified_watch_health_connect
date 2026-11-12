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
import com.huawei.ui.commonui.listener.OnClickSectionListener;
import defpackage.qqw;
import defpackage.qsp;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes7.dex */
public class SectionDialog extends BaseSection {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private LinearLayout f7768a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private HealthTextView f7769b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private HealthTextView f7770c;
    private Context d;
    private HealthTextView e;

    public SectionDialog(Context context) {
        this(context, null);
    }

    public SectionDialog(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public SectionDialog(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.d = context;
    }

    @Override // com.huawei.health.knit.section.view.BaseSection
    public View onCreateView(Context context) {
        LogUtil.a("SectionDialog", "onCreateView");
        View viewInflate = LayoutInflater.from(context).inflate(R.layout.section_dialog_layout, (ViewGroup) this, false);
        LinearLayout linearLayout = (LinearLayout) viewInflate.findViewById(R.id.layout_section_dialog);
        this.f7768a = linearLayout;
        linearLayout.setVisibility(0);
        this.e = (HealthTextView) viewInflate.findViewById(R.id.tv_wechat_title);
        this.f7769b = (HealthTextView) viewInflate.findViewById(R.id.tv_wechat_join);
        this.f7770c = (HealthTextView) viewInflate.findViewById(R.id.tv_wechat_ignore);
        return viewInflate;
    }

    @Override // com.huawei.health.knit.section.view.BaseSection
    public String getLogTag() {
        return "SectionDialog";
    }

    @Override // com.huawei.health.knit.section.view.BaseSection
    protected void bindParamsToView(HashMap<String, Object> map) {
        if (map == null || map.size() == 0) {
            LogUtil.a("SectionDialog", "no need to bind");
            return;
        }
        LogUtil.a("SectionDialog", "bindParamsToView");
        qsp.a(this.e, qqw.d((Map) map, "REPORT_TEXT", ""), true);
        qsp.a(this.f7770c, qqw.d((Map) map, "LEFT_BUTTON_TEXT", ""), true);
        qsp.a(this.f7769b, qqw.d((Map) map, "RIGHT_BUTTON_TEXT", ""), true);
        final OnClickSectionListener onClickSectionListenerC = qqw.c(map, "CLICK_EVENT_LISTENER", (OnClickSectionListener) null);
        HealthTextView healthTextView = this.f7770c;
        if (healthTextView == null || onClickSectionListenerC == null) {
            LogUtil.j("SectionDialog", "setOnSectionClickListener view or listener is null");
        } else {
            healthTextView.setOnClickListener(new View.OnClickListener() { // from class: com.huawei.health.knit.section.view.SectionDialog.2
                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    SectionDialog.this.f7768a.setVisibility(8);
                    onClickSectionListenerC.onClick("LEFT_BUTTON_TEXT");
                }
            });
            this.f7769b.setOnClickListener(new View.OnClickListener() { // from class: com.huawei.health.knit.section.view.SectionDialog.4
                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    SectionDialog.this.f7768a.setVisibility(8);
                    onClickSectionListenerC.onClick("RIGHT_BUTTON_TEXT");
                }
            });
        }
    }
}
