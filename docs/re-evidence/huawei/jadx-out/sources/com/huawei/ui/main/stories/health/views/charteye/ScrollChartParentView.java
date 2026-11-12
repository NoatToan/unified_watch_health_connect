package com.huawei.ui.main.stories.health.views.charteye;

import android.content.Context;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.core.content.ContextCompat;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.ui.commonui.healthtextview.HealthTextView;
import com.huawei.ui.main.R;
import defpackage.qrs;
import health.compact.a.LanguageUtil;

/* JADX INFO: loaded from: classes19.dex */
public class ScrollChartParentView extends LinearLayout {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private HealthTextView f28213a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private ImageView f28214b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f28215c;
    private Context d;
    private HealthTextView e;
    private String g;

    public ScrollChartParentView(Context context, String str, String str2, String str3, String str4) {
        super(context);
        this.d = context;
        this.f28215c = str4;
        this.g = str2;
        a(str, str3);
    }

    public void c(String str) {
        HealthTextView healthTextView = this.f28213a;
        if (healthTextView != null) {
            healthTextView.setText(str);
        }
    }

    public ImageView getArrowView() {
        return this.f28214b;
    }

    public HealthTextView getTitle() {
        return this.e;
    }

    public HealthTextView getDataView() {
        return this.f28213a;
    }

    public void setTextColor(View view, int i) {
        if (view == null) {
            LogUtil.j("ScrollChartParentView_bloodSugar", "view is null");
        } else if (view instanceof HealthTextView) {
            ((HealthTextView) view).setTextColor(ContextCompat.getColor(this.d, i));
        }
    }

    private void d(String str) {
        if (LanguageUtil.k(this.d) || LanguageUtil.q(this.d)) {
            if (str.equals(getResources().getString(R.string.IDS_bloodsugar_continue))) {
                this.e.setAutoTextInfo(12, 1, 2);
            }
            if (str.equals(getResources().getString(R.string.IDS_hw_show_healthdata_bloodsugar_fingertips_desc))) {
                this.f28213a.setAutoTextInfo(10, 1, 2);
            }
        }
    }

    private void a(String str, String str2) {
        LogUtil.d("ScrollChartParentView_bloodSugar", str2, "initView type is ", this.f28215c);
        String str3 = this.f28215c;
        if (str3 != null && str3.equals("BLOOD_SUGAR_FINGER_TIP")) {
            LayoutInflater.from(getContext()).inflate(R.layout.item_blood_sugar_charteye, (ViewGroup) this, true);
            this.e = (HealthTextView) findViewById(R.id.data_title);
            HealthTextView healthTextView = (HealthTextView) findViewById(R.id.data_unit);
            this.f28213a = healthTextView;
            c(this.e, healthTextView);
            this.e.setText(str);
            this.e.setAllCaps(true);
            d(str2);
            this.f28213a.setText(str2);
            if (LanguageUtil.bc(this.d)) {
                this.f28213a.setTextSize(0, this.d.getResources().getDimension(R.dimen.hw_show_public_size_10));
            }
            if (TextUtils.isEmpty(str2)) {
                this.f28213a.setVisibility(4);
                return;
            } else {
                this.f28213a.setVisibility(0);
                this.f28213a.setAllCaps(true);
                return;
            }
        }
        LayoutInflater.from(getContext()).inflate(R.layout.item_blood_sugar_list_card, (ViewGroup) this, true);
        this.e = (HealthTextView) findViewById(R.id.data_list_title);
        this.f28213a = (HealthTextView) findViewById(R.id.data_list_unit);
        this.f28214b = (ImageView) findViewById(R.id.drop_down_arrow);
        c(this.e, this.f28213a);
        this.e.setText(str);
        this.e.setAllCaps(true);
        d(str);
        this.f28213a.setText(str2);
        this.f28213a.setAllCaps(true);
    }

    public String getType() {
        return this.g;
    }

    public void setType(String str) {
        this.g = str;
    }

    private void c(HealthTextView healthTextView, HealthTextView healthTextView2) {
        if (qrs.v()) {
            qrs.a(healthTextView);
            qrs.a(healthTextView2);
        }
    }
}
