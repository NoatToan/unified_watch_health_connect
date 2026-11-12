package com.huawei.ui.homewear21.home.holder;

import android.view.View;
import android.widget.RelativeLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.huawei.ui.commonui.healthtextview.HealthTextView;
import com.huawei.ui.homewear21.R;
import defpackage.qsp;

/* JADX INFO: loaded from: classes18.dex */
public class WearHomeTipHolder extends RecyclerView.ViewHolder {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private HealthTextView f26336a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private HealthTextView f26337b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private HealthTextView f26338c;
    private HealthTextView d;
    private RelativeLayout e;

    public WearHomeTipHolder(View view) {
        super(view);
        this.e = (RelativeLayout) qsp.a(view, R.id.common_auto_test_toast_layout);
        this.f26338c = (HealthTextView) qsp.a(view, R.id.toast_cancel_tv);
        this.f26336a = (HealthTextView) qsp.a(view, R.id.toast_try_tv);
        this.f26337b = (HealthTextView) qsp.a(view, R.id.toast_no_notice_tv);
        this.d = (HealthTextView) qsp.a(view, R.id.toast_title_tv);
    }

    public HealthTextView d() {
        return this.f26336a;
    }

    public HealthTextView c() {
        return this.f26338c;
    }

    public HealthTextView a() {
        return this.f26337b;
    }

    public HealthTextView b() {
        return this.d;
    }

    public RelativeLayout e() {
        return this.e;
    }
}
