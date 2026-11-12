package com.huawei.ui.commonui.woundplastadview;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.bumptech.glide.request.RequestOptions;
import com.huawei.ui.commonui.R;
import defpackage.qqf;

/* JADX INFO: loaded from: classes16.dex */
public class WoundPlast extends FrameLayout {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private ImageView f24063a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private ImageView f24064b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private ImageSizeMode f24065c;
    private View d;

    public enum ImageSizeMode {
        SMALL_IMAGE,
        NORMAL_IMAGE
    }

    public WoundPlast(Context context) {
        super(context);
        this.f24065c = ImageSizeMode.SMALL_IMAGE;
        e();
    }

    public WoundPlast(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f24065c = ImageSizeMode.SMALL_IMAGE;
        e();
    }

    public WoundPlast(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f24065c = ImageSizeMode.SMALL_IMAGE;
        e();
    }

    private void e() {
        this.d = View.inflate(getContext(), R.layout.woundplast_ad_view, this);
        this.f24064b = (ImageView) findViewById(R.id.ad_image);
        ImageView imageView = (ImageView) findViewById(R.id.ad_close);
        this.f24063a = imageView;
        imageView.setOnClickListener(new View.OnClickListener() { // from class: com.huawei.ui.commonui.woundplastadview.WoundPlast.1
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                WoundPlast.this.d.setVisibility(8);
            }
        });
        c();
    }

    public void setAdClickListener(View.OnClickListener onClickListener) {
        this.d.setOnClickListener(onClickListener);
    }

    public void setAdImage(int i) {
        this.f24064b.setImageResource(i);
    }

    public void setAdImage(String str) {
        qqf.e(str, RequestOptions.overrideOf(Integer.MIN_VALUE, Integer.MIN_VALUE), this.f24064b);
    }

    public void setImageSizeMode(ImageSizeMode imageSizeMode) {
        if (this.f24065c != imageSizeMode) {
            this.f24065c = imageSizeMode;
            c();
        }
    }

    public ImageSizeMode getImageSizeMode() {
        return this.f24065c;
    }

    public void setCloseBtnClickListener(View.OnClickListener onClickListener) {
        this.f24063a.setOnClickListener(onClickListener);
    }

    private void b(int i, int i2) {
        ViewGroup.LayoutParams layoutParams = this.f24064b.getLayoutParams();
        if (layoutParams instanceof FrameLayout.LayoutParams) {
            FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) layoutParams;
            layoutParams2.width = getResources().getDimensionPixelSize(i);
            layoutParams2.height = getResources().getDimensionPixelSize(i2);
            this.f24064b.setLayoutParams(layoutParams2);
        }
    }

    private void setCloseBtnMargin(int i) {
        int dimensionPixelSize = i != 0 ? getResources().getDimensionPixelSize(i) : 0;
        ViewGroup.LayoutParams layoutParams = this.f24063a.getLayoutParams();
        if (layoutParams instanceof FrameLayout.LayoutParams) {
            FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) layoutParams;
            layoutParams2.setMarginEnd(dimensionPixelSize);
            layoutParams2.topMargin = dimensionPixelSize;
            this.f24063a.setLayoutParams(layoutParams2);
        }
    }

    private void c() {
        int iOrdinal = this.f24065c.ordinal();
        if (iOrdinal == 0) {
            setCloseBtnMargin(0);
            b(R.dimen.health_common_54dp, R.dimen.health_common_30dp);
        } else {
            if (iOrdinal != 1) {
                return;
            }
            setCloseBtnMargin(R.dimen.health_common_8dp);
            b(R.dimen.health_common_199dp, R.dimen.health_common_112dp);
        }
    }
}
