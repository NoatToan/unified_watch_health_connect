package com.huawei.openalliance.ad.views;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.huawei.openalliance.ad.R;
import com.huawei.openalliance.ad.hw;
import com.huawei.openalliance.ad.inter.data.AppInfo;
import com.huawei.openalliance.ad.utils.as;
import com.huawei.openalliance.ad.utils.dr;

/* JADX INFO: loaded from: classes12.dex */
public class PPSAppDetailTemplateView extends PPSAppDetailView {
    private TextView e;
    private TextView f;
    private int g;

    @Override // com.huawei.openalliance.ad.views.PPSAppDetailView
    protected void a(Context context, AttributeSet attributeSet) {
        TypedArray typedArrayObtainStyledAttributes;
        if (attributeSet == null || (typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.InsreTemplate)) == null) {
            return;
        }
        try {
            int integer = typedArrayObtainStyledAttributes.getInteger(R.styleable.InsreTemplate_insreTemplate, 2);
            this.g = integer;
            hw.a("PPSAppDetailTemplateView", "insreTemplate %s", Integer.valueOf(integer));
        } finally {
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    @Override // com.huawei.openalliance.ad.views.PPSAppDetailView
    protected void a() {
        super.a();
        this.e = (TextView) findViewById(R.id.app_name);
        this.f = (TextView) findViewById(R.id.app_develop_name);
        AppInfo appInfo = getAppInfo();
        if (appInfo != null) {
            this.e.setText(appInfo.getAppName());
            this.f.setText(appInfo.getDeveloperName());
        }
        c(getContext());
    }

    @Override // com.huawei.openalliance.ad.views.PPSAppDetailView
    protected int a(Context context) {
        return this.g == 4 ? R.layout.hiad_landing_app_detail_insretemplate4 : R.layout.hiad_landing_app_detail_template_custom;
    }

    private void c(Context context) {
        if (!as.n(context)) {
            hw.b("PPSAppDetailTemplateView", "do not deal elderly font.");
            return;
        }
        TextView textView = this.e;
        if (textView == null || this.f == null) {
            hw.c("PPSAppDetailTemplateView", "appName or appDeveloper tv is null.");
            return;
        }
        a(textView, 28);
        a(this.f, 21);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        layoutParams.setMargins(0, (int) dr.a(context, 4), 0, 0);
        if (this.g == 4) {
            this.f.setLayoutParams(layoutParams);
        } else {
            this.e.setLayoutParams(layoutParams);
            this.f.setLayoutParams(layoutParams);
        }
    }

    private void a(TextView textView, int i) {
        if (textView != null) {
            textView.setTextSize(1, i);
        }
    }

    public PPSAppDetailTemplateView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public PPSAppDetailTemplateView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public PPSAppDetailTemplateView(Context context) {
        super(context);
    }
}
