package com.huawei.ui.commonui.ratingbar;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.core.content.ContextCompat;
import com.huawei.ui.commonui.R;

/* JADX INFO: loaded from: classes16.dex */
public class HealthStarRatingBar extends LinearLayout {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Drawable f23812a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f23813b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Drawable f23814c;
    private Drawable d;

    public HealthStarRatingBar(Context context) {
        super(context);
        b(context, null);
    }

    public HealthStarRatingBar(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        b(context, attributeSet);
    }

    public HealthStarRatingBar(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        b(context, attributeSet);
    }

    private void b(Context context, AttributeSet attributeSet) {
        setOrientation(0);
        setGravity(17);
        if (attributeSet == null) {
            this.f23813b = 5;
        } else {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.HealthStarRatingBar);
            this.f23813b = typedArrayObtainStyledAttributes.getInteger(R.styleable.HealthStarRatingBar_starCount, 5);
            typedArrayObtainStyledAttributes.recycle();
        }
        this.d = ContextCompat.getDrawable(context, R.mipmap.score_sleep_rating_default);
        this.f23812a = ContextCompat.getDrawable(context, R.mipmap.score_sleep_rating_half);
        this.f23814c = ContextCompat.getDrawable(context, R.mipmap.score_sleep_rating_fill);
        for (int i = 0; i < this.f23813b; i++) {
            addView(getStarImageView());
        }
    }

    private ImageView getStarImageView() {
        ImageView imageView = new ImageView(getContext());
        imageView.setAdjustViewBounds(true);
        imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
        imageView.setImageDrawable(this.d);
        return imageView;
    }

    public void setStar(int i) {
        int i2 = this.f23813b * 2;
        if (i >= i2) {
            i = i2;
        }
        if (i <= 0) {
            i = 0;
        }
        int i3 = i / 2;
        for (int i4 = 0; i4 < i3; i4++) {
            e(getChildAt(i4), this.f23814c);
        }
        for (int i5 = i3; i5 < this.f23813b; i5++) {
            e(getChildAt(i5), this.d);
        }
        if (i % 2 == 1) {
            e(getChildAt(i3), this.f23812a);
        }
    }

    private void e(View view, Drawable drawable) {
        if (view instanceof ImageView) {
            ((ImageView) view).setImageDrawable(drawable);
        }
    }
}
