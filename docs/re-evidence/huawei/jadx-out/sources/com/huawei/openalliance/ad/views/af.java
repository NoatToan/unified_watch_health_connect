package com.huawei.openalliance.ad.views;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import com.huawei.openalliance.ad.ht;
import com.huawei.openalliance.ad.hw;
import com.huawei.openalliance.ad.nz;
import com.huawei.openalliance.ad.oo;
import com.huawei.openalliance.ad.utils.dk;

/* JADX INFO: loaded from: classes41.dex */
public class af extends RelativeLayout implements com.huawei.openalliance.ad.views.interfaces.s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final String f21132a = "af";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private oo f21133b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f21134c;
    private int d;
    private int e;
    private View f;
    private float g;

    public void setWideSloganResId(int i) {
        this.d = i;
    }

    public void setSloganShowListener(ht htVar) {
        this.f21133b.a(htVar);
    }

    @Override // android.view.View
    protected void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        hw.a(f21132a, "onSizeChanged w: %d h: %d oldw: %d oldh: %d", Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4));
        a(i, i2);
    }

    public int getOrientation() {
        return this.e;
    }

    public void b() {
        setVisibility(8);
    }

    @Override // com.huawei.openalliance.ad.views.interfaces.s
    public void a(int i) {
        ImageView imageView;
        if (dk.c(getContext())) {
            hw.c(f21132a, "showImageView - activity finished, not add view");
            return;
        }
        View view = this.f;
        if (view instanceof ImageView) {
            imageView = (ImageView) view;
            imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
        } else {
            imageView = new ImageView(getContext());
            imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
            this.f = imageView;
            addView(imageView, new RelativeLayout.LayoutParams(-1, -1));
        }
        imageView.setImageResource(i);
    }

    public void a() {
        setVisibility(0);
        if (this.f == null) {
            this.f21133b.a(this.f21134c, true);
        }
    }

    private void b(int i) {
        this.f21133b = new nz(getContext(), this, i);
    }

    private void a(int i, int i2) {
        int i3;
        String str;
        if (i <= 0 || i2 <= 0) {
            return;
        }
        float f = (i * 1.0f) / i2;
        float fAbs = Math.abs(this.g - f);
        String str2 = f21132a;
        hw.a(str2, "ratio: %s diff:%s", Float.valueOf(f), Float.valueOf(fAbs));
        if (fAbs > 0.01f) {
            this.g = f;
            if (f <= 0.9f || (i3 = this.d) <= 0) {
                i3 = this.f21134c;
                str = "pick defaultSloganResId";
            } else {
                str = "pick wideSloganResId";
            }
            hw.a(str2, str);
            this.f21133b.a(i3, false);
        }
    }

    public af(Context context, int i, int i2, int i3) {
        super(context);
        this.d = 0;
        this.e = i;
        this.f21134c = i2;
        b(i3);
    }
}
