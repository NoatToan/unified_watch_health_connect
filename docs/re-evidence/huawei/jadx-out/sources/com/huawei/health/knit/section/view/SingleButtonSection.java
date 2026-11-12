package com.huawei.health.knit.section.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.huawei.health.servicesui.R;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.ui.commonui.button.HealthButton;
import com.huawei.ui.commonui.listener.OnClickSectionListener;
import defpackage.qqw;
import defpackage.qsp;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes7.dex */
public class SingleButtonSection extends BaseSection {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private HealthButton f7986a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private View f7987b;

    public SingleButtonSection(Context context) {
        this(context, null);
    }

    public SingleButtonSection(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public SingleButtonSection(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    @Override // com.huawei.health.knit.section.view.BaseSection
    public View onCreateView(Context context) {
        if (this.f7987b == null) {
            LogUtil.a("SingleButtonSection", "onCreateView");
            View viewInflate = LayoutInflater.from(context).inflate(R.layout.section_single_button, (ViewGroup) this, false);
            this.f7987b = viewInflate;
            this.f7986a = (HealthButton) viewInflate.findViewById(R.id.view_more_data);
            this.f7987b.setVisibility(8);
        }
        return this.f7987b;
    }

    @Override // com.huawei.health.knit.section.view.BaseSection
    public String getLogTag() {
        return "SingleButtonSection";
    }

    @Override // com.huawei.health.knit.section.view.BaseSection
    protected void bindParamsToView(HashMap<String, Object> map) {
        LogUtil.a("SingleButtonSection", "bindParamsToView");
        if (map == null || map.size() == 0) {
            LogUtil.a("SingleButtonSection", "no need to bind");
            return;
        }
        this.f7986a.setText(qqw.d((Map) map, "SINGLE_BUTTON", ""));
        final int iC = qqw.c(map, "CARD_INDEX", 0);
        if (iC == 0 || iC == 1) {
            qsp.c(this.f7987b, 8);
            return;
        }
        qsp.c(this.f7987b, 0);
        final OnClickSectionListener onClickSectionListenerC = qqw.c(map, "CLICK_EVENT_LISTENER", (OnClickSectionListener) null);
        if (onClickSectionListenerC != null) {
            this.f7986a.setOnClickListener(new View.OnClickListener() { // from class: com.huawei.health.knit.section.view.SingleButtonSection.4
                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    onClickSectionListenerC.onClick(iC);
                }
            });
        }
    }
}
