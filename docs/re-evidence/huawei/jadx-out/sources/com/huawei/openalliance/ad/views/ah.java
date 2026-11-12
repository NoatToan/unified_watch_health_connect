package com.huawei.openalliance.ad.views;

import android.content.Context;
import android.view.LayoutInflater;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import com.huawei.openalliance.ad.R;

/* JADX INFO: loaded from: classes41.dex */
public class ah extends AutoScaleSizeRelativeLayout {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private ImageView f21137a;

    public ImageView getCloseBtn() {
        return this.f21137a;
    }

    private void a(Context context) {
        ((RelativeLayout) LayoutInflater.from(context).inflate(R.layout.hiad_splash_icon_close_view, this)).setBackgroundColor(0);
        this.f21137a = (ImageView) findViewById(R.id.icon_close);
    }

    public ah(Context context) {
        super(context);
        a(context);
    }
}
