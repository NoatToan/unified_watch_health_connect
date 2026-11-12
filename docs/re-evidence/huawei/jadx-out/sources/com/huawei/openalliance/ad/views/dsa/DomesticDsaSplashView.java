package com.huawei.openalliance.ad.views.dsa;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import com.huawei.openalliance.ad.utils.as;

/* JADX INFO: loaded from: classes41.dex */
public class DomesticDsaSplashView extends DomesticDsaView {
    @Override // com.huawei.openalliance.ad.views.dsa.DomesticDsaView, com.huawei.openalliance.ad.views.i
    public void a(Context context) {
        super.a(context);
        if (this.f21243c != null) {
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.f21243c.getLayoutParams();
            int iA = as.a(getContext(), 12.0f);
            layoutParams.setMargins(iA, iA, iA, iA);
            this.f21243c.setLayoutParams(layoutParams);
            this.f21243c.setElevation(as.a(getContext(), 5.0f));
        }
    }

    public DomesticDsaSplashView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
    }

    public DomesticDsaSplashView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public DomesticDsaSplashView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public DomesticDsaSplashView(Context context) {
        super(context);
    }
}
