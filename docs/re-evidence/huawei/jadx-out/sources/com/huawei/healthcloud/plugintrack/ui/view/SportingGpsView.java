package com.huawei.healthcloud.plugintrack.ui.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.huawei.healthcloud.plugintrack.R;
import com.huawei.ui.commonui.healthtextview.HealthTextView;
import com.huawei.ui.commonui.imageview.HealthImageView;
import defpackage.jxk;
import defpackage.qsp;

/* JADX INFO: loaded from: classes10.dex */
public class SportingGpsView extends LinearLayout {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private HealthTextView f11327b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private HealthImageView f11328c;
    private View d;
    private HealthImageView e;

    public SportingGpsView(Context context) {
        super(context);
        e(context);
    }

    public SportingGpsView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        e(context);
    }

    public SportingGpsView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        e(context);
    }

    private void e(Context context) {
        if (context == null) {
            return;
        }
        View.inflate(context, R.layout.sport_gps_layout, this);
        this.d = findViewById(R.id.track_main_page_gps_layout);
        this.f11328c = (HealthImageView) findViewById(R.id.track_main_page_gps);
        this.e = (HealthImageView) findViewById(R.id.track_main_page_gps_sign);
        this.f11327b = (HealthTextView) findViewById(R.id.track_main_page_gps_sign_text);
    }

    public void b(Context context) {
        jxk.c(context, this.d, R.drawable.sport_gps_view_bg);
        jxk.c(context, this.f11328c, R.drawable.track_ic_gps);
        jxk.e(context, this.f11327b, R.color.textColorPrimary);
    }

    public void c(Context context, int i) {
        d(context, i);
        b(i);
    }

    private void d(Context context, int i) {
        if (2 == i) {
            jxk.b(context, (ImageView) this.e, R.drawable.icon_signal_weak);
            qsp.c((View) this.e, 0);
        } else if (3 == i) {
            jxk.b(context, (ImageView) this.e, R.drawable.icon_signal_moderate);
            qsp.c((View) this.e, 0);
        } else if (4 == i) {
            jxk.b(context, (ImageView) this.e, R.drawable.icon_signal_strong);
            qsp.c((View) this.e, 0);
        } else {
            qsp.c((View) this.e, 8);
        }
    }

    private void b(int i) {
        if (i == 0) {
            qsp.e((TextView) this.f11327b, R.string.IDS_motiontrack_show_sport_gps_not_open);
            qsp.c((View) this.f11327b, 0);
        } else if (1 == i) {
            qsp.e((TextView) this.f11327b, R.string.IDS_motiontrack_show_sport_gps_disable_1);
            qsp.c((View) this.f11327b, 0);
        } else {
            qsp.c((View) this.f11327b, 8);
        }
    }
}
