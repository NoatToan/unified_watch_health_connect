package com.huawei.openalliance.ad;

import android.content.Context;
import android.widget.ImageView;
import android.widget.RelativeLayout;

/* JADX INFO: loaded from: classes41.dex */
public class ua extends ub {
    @Override // com.huawei.openalliance.ad.ub
    protected int getLayoutId() {
        return R.layout.hiad_advertiser_info_dialog;
    }

    @Override // com.huawei.openalliance.ad.ub
    protected void a() {
        this.f20296c = (RelativeLayout) findViewById(R.id.haid_advertiser_info_dialog_root);
        this.k = findViewById(R.id.margin_view);
        this.l = findViewById(R.id.anchor_view);
        this.g = (com.huawei.openalliance.ad.views.i) findViewById(R.id.top_advertiser_view);
        this.m = (ImageView) findViewById(R.id.top_advertiser_iv);
        this.h = (com.huawei.openalliance.ad.views.i) findViewById(R.id.bottom_advertiser_view);
        this.n = (ImageView) findViewById(R.id.bottom_advertiser_iv);
    }

    public ua(Context context, int[] iArr, int[] iArr2) {
        super(context, iArr, iArr2);
    }
}
