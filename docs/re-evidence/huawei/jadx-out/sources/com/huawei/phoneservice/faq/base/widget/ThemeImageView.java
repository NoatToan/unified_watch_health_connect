package com.huawei.phoneservice.faq.base.widget;

import android.R;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.PorterDuffXfermode;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatImageView;
import com.huawei.phoneservice.faq.base.util.d;
import com.huawei.phoneservice.faq.base.util.g;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: loaded from: classes41.dex */
public class ThemeImageView extends AppCompatImageView {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Set<Integer> f21599b = new HashSet();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    static final String f21600c = "ThemeImageView";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Bitmap f21601a;
    private Integer d;
    private int e;
    private Bitmap f;
    private int g;
    private Integer h;
    private Paint i;
    private Bitmap j;

    public void e() {
        if (this.f21601a == null && getDrawable() != null) {
            this.f21601a = d(getDrawable());
        }
        Bitmap bitmap = this.f21601a;
        if (bitmap == null || bitmap.isRecycled()) {
            return;
        }
        try {
            super.setImageDrawable(getImageDrawable());
        } catch (IllegalArgumentException e) {
            g.c(f21600c, e + "setImageDrawable error");
        }
    }

    public ThemeImageView c(int i) {
        this.h = Integer.valueOf(i);
        return this;
    }

    public ThemeImageView d(int i) {
        this.d = Integer.valueOf(i);
        return this;
    }

    @Override // androidx.appcompat.widget.AppCompatImageView, android.widget.ImageView
    public void setImageResource(int i) {
        setImageDrawable(getResources().getDrawable(i));
    }

    @Override // androidx.appcompat.widget.AppCompatImageView, android.widget.ImageView
    public void setImageDrawable(Drawable drawable) {
        if (this.g != 0 && drawable != null && drawable.getConstantState() != null && c(drawable) && !(drawable instanceof StateListDrawable)) {
            try {
                Bitmap bitmapD = d(drawable);
                this.f21601a = bitmapD;
                if (bitmapD != null) {
                    drawable = getImageDrawable();
                }
            } catch (IllegalArgumentException e) {
                g.c(f21600c, e + "setImageDrawable error");
            }
        }
        super.setImageDrawable(drawable);
    }

    public ColorFilter getPressedFilter() {
        Integer num = this.h;
        return new PorterDuffColorFilter(num == null ? getResources().getColor(this.g) : num.intValue(), PorterDuff.Mode.SRC_IN);
    }

    public ColorFilter getNormalFilter() {
        Integer num = this.d;
        return new PorterDuffColorFilter(num == null ? getResources().getColor(this.e) : num.intValue(), PorterDuff.Mode.SRC_IN);
    }

    public static StateListDrawable c(Drawable drawable, Drawable drawable2) {
        StateListDrawable stateListDrawable = new StateListDrawable();
        stateListDrawable.addState(new int[]{R.attr.state_enabled, R.attr.state_pressed}, drawable2);
        stateListDrawable.addState(new int[0], drawable);
        return stateListDrawable;
    }

    private void e(Context context, AttributeSet attributeSet) {
        int iIntValue;
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, com.huawei.phoneservice.faq.base.R.styleable.ThemeImageView);
            this.e = typedArrayObtainStyledAttributes.getResourceId(com.huawei.phoneservice.faq.base.R.styleable.ThemeImageView_normal_color, com.huawei.phoneservice.faq.base.R.color.faq_base_sdk_themeImageView_normal);
            this.g = typedArrayObtainStyledAttributes.getResourceId(com.huawei.phoneservice.faq.base.R.styleable.ThemeImageView_pressed_color, 0);
            typedArrayObtainStyledAttributes.recycle();
        }
        if (this.e != 0) {
            d(getResources().getColor(this.e));
        }
        if (this.g == 0) {
            Integer num = this.d;
            if (num != null) {
                iIntValue = (int) (((double) num.intValue()) * 0.8d);
            }
            Paint paint = new Paint();
            this.i = paint;
            paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
            e();
        }
        iIntValue = getResources().getColor(this.g);
        c(iIntValue);
        Paint paint2 = new Paint();
        this.i = paint2;
        paint2.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
        e();
    }

    private Drawable getImageDrawable() throws IllegalArgumentException {
        Paint paint = new Paint(1);
        if (this.f == null) {
            this.f = Bitmap.createBitmap(this.f21601a.getWidth(), this.f21601a.getHeight(), this.f21601a.getConfig());
        }
        if (this.j == null) {
            this.j = Bitmap.createBitmap(this.f21601a.getWidth(), this.f21601a.getHeight(), this.f21601a.getConfig());
        }
        Canvas canvas = new Canvas(this.f);
        paint.setColorFilter(getNormalFilter());
        canvas.drawPaint(this.i);
        canvas.drawBitmap(this.f21601a, new Matrix(), paint);
        canvas.setBitmap(this.j);
        paint.setColorFilter(getPressedFilter());
        canvas.drawPaint(this.i);
        canvas.drawBitmap(this.f21601a, new Matrix(), paint);
        if (isInEditMode()) {
            return c(new BitmapDrawable((Resources) null, this.f), new BitmapDrawable((Resources) null, this.j));
        }
        Resources resources = getResources();
        return c(new BitmapDrawable(resources, this.f), new BitmapDrawable(resources, this.j));
    }

    private boolean c(Drawable drawable) {
        Set<Integer> set = f21599b;
        synchronized (set) {
            if (!d.c(set) && drawable != null && drawable.getConstantState() != null) {
                Iterator<Integer> it = set.iterator();
                while (it.hasNext()) {
                    Drawable drawable2 = getResources().getDrawable(it.next().intValue());
                    if (drawable2 != null && drawable.getConstantState().equals(drawable2.getConstantState())) {
                        return false;
                    }
                }
                return true;
            }
            return true;
        }
    }

    public static Bitmap d(Drawable drawable) {
        Bitmap bitmapCreateBitmap = null;
        if (drawable != null) {
            try {
                bitmapCreateBitmap = Bitmap.createBitmap(drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight(), drawable.getOpacity() != -1 ? Bitmap.Config.ARGB_8888 : Bitmap.Config.RGB_565);
                Canvas canvas = new Canvas(bitmapCreateBitmap);
                drawable.setBounds(0, 0, drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight());
                drawable.draw(canvas);
                return bitmapCreateBitmap;
            } catch (IllegalArgumentException unused) {
                g.d(f21600c, "drawableToBitmap IllegalArgumentException");
            }
        }
        return bitmapCreateBitmap;
    }

    public ThemeImageView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.d = null;
        this.h = null;
        e(context, attributeSet);
    }

    public ThemeImageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.d = null;
        this.h = null;
        e(context, attributeSet);
    }

    public ThemeImageView(Context context) {
        super(context);
        this.d = null;
        this.h = null;
    }
}
