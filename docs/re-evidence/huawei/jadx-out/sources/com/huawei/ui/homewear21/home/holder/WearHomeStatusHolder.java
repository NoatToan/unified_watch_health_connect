package com.huawei.ui.homewear21.home.holder;

import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.huawei.ui.commonui.healthtextview.HealthTextView;
import com.huawei.ui.homewear21.R;
import defpackage.qsp;

/* JADX INFO: loaded from: classes18.dex */
public class WearHomeStatusHolder extends RecyclerView.ViewHolder {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private LinearLayout f26333a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private HealthTextView f26334b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private ImageView f26335c;
    private HealthTextView d;
    private HealthTextView e;
    private LinearLayout f;
    private LinearLayout g;
    private HealthTextView h;
    private HealthTextView i;
    private HealthTextView j;
    private HealthTextView k;
    private LinearLayout l;
    private HealthTextView m;
    private LinearLayout n;
    private HealthTextView o;
    private HealthTextView p;
    private ImageView q;
    private ImageView s;
    private LinearLayout t;

    public WearHomeStatusHolder(View view) {
        super(view);
        if (view == null) {
            return;
        }
        this.i = (HealthTextView) qsp.a(view, R.id.connect_status);
        this.j = (HealthTextView) qsp.a(view, R.id.connect_tip);
        this.f = (LinearLayout) qsp.a(view, R.id.device_progress);
        this.f26333a = (LinearLayout) qsp.a(view, R.id.battery_layout);
        this.k = (HealthTextView) qsp.a(view, R.id.reconnect);
        this.f26335c = (ImageView) qsp.a(view, R.id.battery_icon);
        this.d = (HealthTextView) qsp.a(view, R.id.battery_number);
        this.s = (ImageView) qsp.a(view, R.id.wear_home_fill_background);
        this.q = (ImageView) qsp.a(view, R.id.wear_home_background);
        this.p = (HealthTextView) qsp.a(view, R.id.tip_power_saving);
        this.g = (LinearLayout) qsp.a(view, R.id.connect_status_layout);
        this.t = (LinearLayout) qsp.a(view, R.id.wear_place_layout);
        this.l = (LinearLayout) qsp.a(view, R.id.status_end_layout);
        this.e = (HealthTextView) qsp.a(view, R.id.bolt_wear_status);
        this.f26334b = (HealthTextView) qsp.a(view, R.id.bolt_wear_place);
        this.n = (LinearLayout) qsp.a(view, R.id.earphone_power_layout);
        this.m = (HealthTextView) qsp.a(view, R.id.left_earphone_power_size);
        this.o = (HealthTextView) qsp.a(view, R.id.right_earphone_power_size);
        this.h = (HealthTextView) qsp.a(view, R.id.earphone_battery_number);
    }

    public HealthTextView f() {
        return this.i;
    }

    public HealthTextView g() {
        return this.j;
    }

    public LinearLayout j() {
        return this.f;
    }

    public LinearLayout b() {
        return this.f26333a;
    }

    public HealthTextView l() {
        return this.k;
    }

    public ImageView e() {
        return this.f26335c;
    }

    public HealthTextView a() {
        return this.d;
    }

    public ImageView p() {
        return this.s;
    }

    public ImageView s() {
        return this.q;
    }

    public HealthTextView r() {
        return this.p;
    }

    public LinearLayout h() {
        return this.g;
    }

    public LinearLayout t() {
        return this.t;
    }

    public LinearLayout k() {
        return this.l;
    }

    public HealthTextView c() {
        return this.e;
    }

    public HealthTextView d() {
        return this.f26334b;
    }

    public LinearLayout m() {
        return this.n;
    }

    public HealthTextView o() {
        return this.m;
    }

    public HealthTextView n() {
        return this.o;
    }

    public HealthTextView i() {
        return this.h;
    }
}
