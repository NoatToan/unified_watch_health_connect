package com.huawei.ui.homehealth.smartcard;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import com.huawei.ui.commonui.base.BaseActivity;
import com.huawei.ui.commonui.healthtextview.HealthTextView;
import com.huawei.ui.homehealth.R;
import com.huawei.ui.homehealth.refreshcard.CardViewHolder;

/* JADX INFO: loaded from: classes17.dex */
public class SmartCardViewHolder extends CardViewHolder {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public ImageView f26089a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public HealthTextView f26090b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public ImageView f26091c;
    public View d;
    public RelativeLayout e;
    public HealthTextView g;
    public HealthTextView h;
    public HealthTextView i;

    public SmartCardViewHolder(View view, Context context, boolean z) {
        super(view, context, z);
        if (context != null) {
            View viewInflate = View.inflate(context, R.layout.pop_custom_view_dialog, null);
            this.d = viewInflate;
            if (viewInflate != null) {
                this.h = (HealthTextView) viewInflate.findViewById(R.id.hw_health_smart_card_pop_text1);
            }
        }
        this.e = (RelativeLayout) view.findViewById(R.id.hw_health_smart_card_layout);
        this.f26089a = (ImageView) view.findViewById(R.id.hw_health_smart_card_more);
        this.f26091c = (ImageView) view.findViewById(R.id.hw_health_smart_card_background);
        this.f26090b = (HealthTextView) view.findViewById(R.id.hw_health_onboarding_view_text1);
        this.g = (HealthTextView) view.findViewById(R.id.hw_health_onboarding_view_text2);
        this.i = (HealthTextView) view.findViewById(R.id.hw_health_onboarding_view_text3);
        BaseActivity.setViewSafeRegion(true, view.findViewById(R.id.hw_health_smart_card_content));
    }
}
