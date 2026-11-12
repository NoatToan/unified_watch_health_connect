package com.huawei.ui.commonui.seekbar;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.ui.commonui.R;
import com.huawei.uikit.phone.hwseekbar.widget.HwSeekBar;
import defpackage.qqz;
import health.compact.a.LanguageUtil;

/* JADX INFO: loaded from: classes16.dex */
public class HealthSeekBarExtend extends LinearLayout {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private ImageView f23888b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private HwSeekBar f23889c;
    private final Context e;

    public HealthSeekBarExtend(Context context) {
        this(context, null);
    }

    public HealthSeekBarExtend(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.e = context;
        Object systemService = context.getSystemService("layout_inflater");
        if (!(systemService instanceof LayoutInflater)) {
            LogUtil.j("CommonUI_HealthSeekBarExtend", "HealthSeekBarExtend service is not instance of LayoutInflater");
            return;
        }
        ((LayoutInflater) systemService).inflate(R.layout.health_seek_bar_extend, this);
        this.f23889c = (HwSeekBar) findViewById(R.id.health_seekbar);
        this.f23888b = (ImageView) findViewById(R.id.health_color_ruler_image);
        if (attributeSet == null) {
            return;
        }
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.health_seekbar_extend);
        this.f23889c.setMax(typedArrayObtainStyledAttributes.getInteger(R.styleable.health_seekbar_extend_max, 100));
        Drawable drawable = typedArrayObtainStyledAttributes.getDrawable(R.styleable.health_seekbar_extend_progressDrawable);
        if (drawable != null) {
            this.f23889c.setProgressDrawable(drawable);
        }
        setThumb(typedArrayObtainStyledAttributes.getDrawable(R.styleable.health_seekbar_extend_thumb));
        Drawable drawable2 = typedArrayObtainStyledAttributes.getDrawable(R.styleable.health_seekbar_extend_rulerSrc);
        if (drawable2 != null) {
            if (LanguageUtil.ba(context)) {
                BitmapDrawable bitmapDrawableE = qqz.e(context, drawable2);
                if (bitmapDrawableE != null) {
                    this.f23888b.setImageDrawable(bitmapDrawableE);
                }
            } else {
                this.f23888b.setImageDrawable(drawable2);
            }
        }
        int dimensionPixelOffset = typedArrayObtainStyledAttributes.getDimensionPixelOffset(R.styleable.health_seekbar_extend_dividerHeight, (int) TypedValue.applyDimension(1, 3.0f, getResources().getDisplayMetrics()));
        ViewGroup.LayoutParams layoutParams = this.f23888b.getLayoutParams();
        if (layoutParams instanceof LinearLayout.LayoutParams) {
            ((LinearLayout.LayoutParams) layoutParams).topMargin = dimensionPixelOffset;
        }
        typedArrayObtainStyledAttributes.recycle();
    }

    public void setThumb(Drawable drawable) {
        if (drawable != null) {
            int intrinsicWidth = drawable.getIntrinsicWidth() / 2;
            this.f23889c.setThumb(drawable);
            setThumbOffset(intrinsicWidth);
            setSeekBarPadding(intrinsicWidth, 0, intrinsicWidth, 0);
            this.f23888b.setPadding(intrinsicWidth, 0, intrinsicWidth, 0);
        }
    }

    public void setThumbOffset(int i) {
        this.f23889c.setThumbOffset(i);
    }

    public void setSeekBarPadding(int i, int i2, int i3, int i4) {
        this.f23889c.setPadding(i, i2, i3, i4);
    }

    public void setProgressDrawable(Drawable drawable) {
        if (drawable != null) {
            this.f23889c.setProgressDrawable(drawable);
        }
    }

    public void setRulerSrc(Drawable drawable) {
        if (drawable == null || this.f23888b == null) {
            return;
        }
        if (LanguageUtil.ba(this.e)) {
            BitmapDrawable bitmapDrawableE = qqz.e(this.e, drawable);
            if (bitmapDrawableE != null) {
                this.f23888b.setImageDrawable(bitmapDrawableE);
                return;
            }
            return;
        }
        this.f23888b.setImageDrawable(drawable);
    }

    public void setMax(int i) {
        HwSeekBar hwSeekBar = this.f23889c;
        if (hwSeekBar != null) {
            hwSeekBar.setMax(i);
        }
    }

    public void setProgress(int i) {
        if (this.f23889c == null) {
            return;
        }
        if (LanguageUtil.ba(this.e)) {
            HwSeekBar hwSeekBar = this.f23889c;
            hwSeekBar.setProgress(hwSeekBar.getMax() - (i - this.f23889c.getMin()));
        } else {
            this.f23889c.setProgress(i);
        }
    }
}
