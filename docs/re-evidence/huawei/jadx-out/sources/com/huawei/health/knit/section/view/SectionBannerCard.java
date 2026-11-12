package com.huawei.health.knit.section.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.huawei.health.servicesui.R;
import com.huawei.ui.commonui.healthtextview.HealthTextView;
import com.huawei.ui.commonui.listener.OnClickSectionListener;
import defpackage.qqw;
import defpackage.qsp;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes7.dex */
public class SectionBannerCard extends BaseSection {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private HealthTextView f7745a;
    private HealthTextView d;
    private HealthTextView e;

    public SectionBannerCard(Context context) {
        this(context, null);
    }

    public SectionBannerCard(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public SectionBannerCard(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    @Override // com.huawei.health.knit.section.view.BaseSection
    public View onCreateView(Context context) {
        View viewInflate = LayoutInflater.from(context).inflate(R.layout.section_banner_card_layout, (ViewGroup) this, false);
        this.f7745a = (HealthTextView) viewInflate.findViewById(R.id.content);
        this.e = (HealthTextView) viewInflate.findViewById(R.id.cancel);
        this.d = (HealthTextView) viewInflate.findViewById(R.id.submit);
        return viewInflate;
    }

    @Override // com.huawei.health.knit.section.view.BaseSection
    public String getLogTag() {
        return "SectionUpdate";
    }

    @Override // com.huawei.health.knit.section.view.BaseSection
    protected void bindParamsToView(HashMap<String, Object> map) {
        qsp.b(this.f7745a, qqw.d((Map) map, "BANNER_CARD_CONTENT", ""));
        qsp.b(this.e, qqw.d((Map) map, "BANNER_CARD_CANCEL", ""));
        qsp.b(this.d, qqw.d((Map) map, "BANNER_CARD_SUBMIT", ""));
        setClickListenerEvent(map.get("CLICK_EVENT_LISTENER"));
    }

    private void setClickListenerEvent(Object obj) {
        if (obj instanceof OnClickSectionListener) {
            final OnClickSectionListener onClickSectionListener = (OnClickSectionListener) obj;
            HealthTextView healthTextView = this.e;
            if (healthTextView != null) {
                healthTextView.setOnClickListener(new View.OnClickListener() { // from class: fvh
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        onClickSectionListener.onClick("BANNER_CARD_CANCEL_CLICK_EVENT");
                    }
                });
            }
            HealthTextView healthTextView2 = this.d;
            if (healthTextView2 != null) {
                healthTextView2.setOnClickListener(new View.OnClickListener() { // from class: fvg
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        onClickSectionListener.onClick("BANNER_CARD_SUBMIT_CLICK_EVENT");
                    }
                });
            }
        }
    }
}
