package com.huawei.health.knit.section.view;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.huawei.health.health.utils.vippage.ViewTreeVisibilityListener;
import com.huawei.health.servicesui.R;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.ui.commonui.healthtextview.HealthTextView;
import defpackage.fcn;
import defpackage.qqw;
import java.util.HashMap;

/* JADX INFO: loaded from: classes7.dex */
public class SectionText extends BaseSection {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private HealthTextView f7961a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private View f7962b;

    public SectionText(Context context) {
        super(context);
    }

    public SectionText(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public SectionText(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    @Override // com.huawei.health.knit.section.view.BaseSection
    public View onCreateView(Context context) {
        if (this.f7962b == null) {
            LogUtil.j("SectionText", "initView mainView is null, start to inflate");
            View viewInflate = LayoutInflater.from(context).inflate(R.layout.section_text_layout, (ViewGroup) this, false);
            this.f7962b = viewInflate;
            this.f7961a = (HealthTextView) viewInflate.findViewById(R.id.member_open_button);
        }
        View view = this.f7962b;
        ViewTreeVisibilityListener.c(view, new ViewTreeVisibilityListener(view, this));
        return this.f7962b;
    }

    @Override // com.huawei.health.knit.section.view.BaseSection
    public String getLogTag() {
        return "SectionText";
    }

    @Override // com.huawei.health.knit.section.view.BaseSection
    protected void bindParamsToView(HashMap<String, Object> map) {
        if (qqw.b(map, "ITEM_TITLE", null) instanceof String) {
            this.f7961a.setText((String) qqw.b(map, "ITEM_TITLE", null));
        }
        if (qqw.b(map, "CLICK_EVENT_LISTENER", null) instanceof View.OnClickListener) {
            this.f7961a.setOnClickListener((View.OnClickListener) qqw.b(map, "CLICK_EVENT_LISTENER", null));
        }
    }

    @Override // com.huawei.health.knit.section.view.BaseSection, com.huawei.health.health.utils.vippage.ViewTreeVisibilityListener.ViewTreeListenee
    public void biEvent() {
        HealthTextView healthTextView = this.f7961a;
        if (healthTextView == null || !TextUtils.equals(healthTextView.getText(), getResources().getString(R.string.IDS_vip_renewal))) {
            return;
        }
        fcn.s();
    }
}
