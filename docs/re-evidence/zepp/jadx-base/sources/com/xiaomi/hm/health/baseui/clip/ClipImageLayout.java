package com.xiaomi.hm.health.baseui.clip;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.util.AttributeSet;
import android.widget.RelativeLayout;

/* JADX INFO: loaded from: classes19.dex */
public class ClipImageLayout extends RelativeLayout {
    public static final int CROP_MODE_CIRCLE = 1;
    public static final int CROP_MODE_RECT = 0;
    private ClipZoomImageView a;
    private ClipImageBorderView b;
    private int c;

    public ClipImageLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.c = 10;
        this.a = new ClipZoomImageView(context);
        this.b = new ClipImageBorderView(context);
        this.a.setCropMode(0);
        this.b.setCropMode(0);
    }

    public Bitmap clip() {
        return this.a.clip();
    }

    public void setCropMode(int i) {
        this.b.setCropMode(i);
        this.a.setCropMode(i);
    }

    public void setHorizontalPadding(int i) {
        this.c = i;
    }

    public void setRectAngleLength(int i) {
        this.b.setRectAngleLength(i);
    }

    public void setRectAngleWidth(int i) {
        this.b.setRectAngleWidth(i);
    }

    public void setUseBackgroundColor(boolean z) {
        this.b.setUseBackgroundColor(z);
    }

    public void setimage(Bitmap bitmap) {
        this.a.setImageDrawable(new BitmapDrawable(getResources(), bitmap));
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
        removeAllViews();
        addView(this.a, layoutParams);
        addView(this.b, layoutParams);
        this.a.setHorizontalPadding(this.c);
        this.b.setHorizontalPadding(this.c);
    }
}
