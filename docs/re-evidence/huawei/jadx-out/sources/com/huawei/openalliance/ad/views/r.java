package com.huawei.openalliance.ad.views;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import com.huawei.openalliance.ad.R;
import com.huawei.openalliance.ad.df;
import com.huawei.openalliance.ad.hw;
import com.huawei.openalliance.ad.nq;

/* JADX INFO: loaded from: classes41.dex */
public class r extends n implements com.huawei.openalliance.ad.views.interfaces.i {
    private ImageView i;

    @Override // com.huawei.openalliance.ad.views.n, com.huawei.openalliance.ad.views.interfaces.n
    public boolean e() {
        return true;
    }

    @Override // com.huawei.openalliance.ad.views.interfaces.i
    public void a(Drawable drawable) {
        hw.b("PPSImageView", "onAdImageLoaded - set image to view");
        this.i.setImageDrawable(drawable);
        this.f21289a.a(this.e);
        df.a(drawable);
        df.a((Bitmap) null);
    }

    private void a(Context context) {
        inflate(context, R.layout.hiad_view_image_ad, this);
        this.i = (ImageView) findViewById(R.id.iv_ad_content);
    }

    public r(Context context, int i) {
        super(context);
        a(context);
        this.f21289a = new nq(context, this, i);
    }
}
