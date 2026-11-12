package com.huawei.health.knit.section.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import com.huawei.health.knit.section.listener.ILayoutCreatedCallback;
import com.huawei.health.servicesui.R;
import com.huawei.hwlogsmodel.LogUtil;
import defpackage.qrs;
import java.util.HashMap;

/* JADX INFO: loaded from: classes7.dex */
public class SectionToastCard extends BaseSection {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private View f7963c;
    private RelativeLayout e;

    public SectionToastCard(Context context) {
        super(context);
    }

    public SectionToastCard(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public SectionToastCard(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    @Override // com.huawei.health.knit.section.view.BaseSection
    public View onCreateView(Context context) {
        LogUtil.a("SectionToastCard", "onCreateView");
        View viewInflate = LayoutInflater.from(context).inflate(R.layout.common_auto_test_toast, (ViewGroup) this, false);
        this.f7963c = viewInflate;
        RelativeLayout relativeLayout = (RelativeLayout) viewInflate.findViewById(R.id.common_auto_test_toast_layout);
        this.e = relativeLayout;
        ViewGroup.LayoutParams layoutParams = relativeLayout.getLayoutParams();
        if (!(layoutParams instanceof LinearLayout.LayoutParams)) {
            LogUtil.a("SectionToastCard", "type is error");
        } else {
            LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) layoutParams;
            layoutParams2.bottomMargin = qrs.d(context, 12.0f);
            layoutParams2.topMargin = qrs.d(context, 0.0f);
            this.e.setLayoutParams(layoutParams2);
        }
        return this.f7963c;
    }

    @Override // com.huawei.health.knit.section.view.BaseSection
    public String getLogTag() {
        return "SectionToastCard";
    }

    @Override // com.huawei.health.knit.section.view.BaseSection
    protected void bindParamsToView(HashMap<String, Object> map) {
        LogUtil.a("SectionToastCard", "bindParamsToView");
        if (map == null || map.isEmpty()) {
            LogUtil.a("SectionToastCard", "no need to bind");
            return;
        }
        Object obj = map.get("FULL_SCREEN_CALLBACK");
        if (!(obj instanceof ILayoutCreatedCallback)) {
            LogUtil.a("SectionToastCard", "type error");
        } else {
            ((ILayoutCreatedCallback) obj).onLayoutUpdate(this.e);
        }
    }
}
