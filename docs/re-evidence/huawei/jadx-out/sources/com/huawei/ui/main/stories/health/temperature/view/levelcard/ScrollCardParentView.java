package com.huawei.ui.main.stories.health.temperature.view.levelcard;

import android.content.Context;
import android.graphics.Typeface;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.core.content.ContextCompat;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.ui.commonui.healthtextview.HealthTextView;
import com.huawei.ui.main.R;
import defpackage.qrr;
import defpackage.qrs;

/* JADX INFO: loaded from: classes19.dex */
public class ScrollCardParentView extends LinearLayout {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private HealthTextView f28153a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Context f28154b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f28155c;
    private HealthTextView d;
    private HealthTextView e;

    public ScrollCardParentView(Context context, String str, String str2, String str3, String str4) {
        super(context);
        this.f28154b = context;
        d(str, str2, str4);
        this.f28155c = str3;
    }

    public void c(String str) {
        HealthTextView healthTextView = this.f28153a;
        if (healthTextView != null) {
            healthTextView.setText(str);
        }
    }

    public HealthTextView getUnitTextView() {
        return this.d;
    }

    public HealthTextView getTitle() {
        return this.e;
    }

    public HealthTextView getDataTextView() {
        return this.f28153a;
    }

    public void setTextColor(View view, int i) {
        if (view == null) {
            LogUtil.j("ScrollCardParentView_temperature", "view is null");
        } else if (view instanceof HealthTextView) {
            ((HealthTextView) view).setTextColor(ContextCompat.getColor(this.f28154b, i));
        }
    }

    private void d(String str, String str2, String str3) {
        LayoutInflater.from(getContext()).inflate(R.layout.item_temperature_cardeye, (ViewGroup) this, true);
        this.e = (HealthTextView) findViewById(R.id.eye_card_temperature_title);
        this.f28153a = (HealthTextView) findViewById(R.id.eye_card_temperature_data);
        this.d = (HealthTextView) findViewById(R.id.eye_card_temperature_unit);
        this.e.setText(str);
        this.f28153a.setText(str3);
        this.d.setText(str2);
        if (qrs.v()) {
            this.e.setTextSize(1, 25.0f);
            this.f28153a.setTextSize(1, 35.0f);
            this.d.setTextSize(1, 21.0f);
        }
        if (TextUtils.isEmpty(str2)) {
            this.d.setVisibility(8);
        } else {
            this.d.setVisibility(0);
        }
        Typeface typefaceC = qrr.c();
        this.e.setTypeface(typefaceC);
        this.f28153a.setTypeface(typefaceC);
    }

    public String getType() {
        return this.f28155c;
    }
}
