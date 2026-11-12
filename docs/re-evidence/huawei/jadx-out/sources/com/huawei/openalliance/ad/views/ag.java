package com.huawei.openalliance.ad.views;

import android.content.Context;
import android.view.LayoutInflater;
import android.widget.RelativeLayout;
import com.huawei.openalliance.ad.R;
import com.huawei.openalliance.ad.utils.as;

/* JADX INFO: loaded from: classes41.dex */
public class ag extends RelativeLayout {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private AutoScaleSizeRelativeLayout f21135a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private CornerImageView f21136b;

    public AutoScaleSizeRelativeLayout getRoundLayout() {
        return this.f21135a;
    }

    public CornerImageView getIcon() {
        return this.f21136b;
    }

    private void a(Context context) {
        ((RelativeLayout) LayoutInflater.from(context).inflate(R.layout.hiad_dest_icon_view, this)).setBackgroundColor(0);
        AutoScaleSizeRelativeLayout autoScaleSizeRelativeLayout = (AutoScaleSizeRelativeLayout) findViewById(R.id.hiad_round_layout);
        this.f21135a = autoScaleSizeRelativeLayout;
        autoScaleSizeRelativeLayout.setBackgroundColor(-1);
        this.f21135a.setRectCornerRadius(as.a(context, 8.0f));
        CornerImageView cornerImageView = (CornerImageView) findViewById(R.id.hiad_dest_icon);
        this.f21136b = cornerImageView;
        cornerImageView.setRectCornerRadius(as.a(context, 6.0f));
    }

    public ag(Context context) {
        super(context);
        a(context);
    }
}
