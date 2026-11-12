package com.huawei.openalliance.ad.views;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.text.style.ImageSpan;
import com.huawei.openalliance.ad.utils.dk;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes12.dex */
public class c extends ImageSpan {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    int f21169a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    int f21170b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private WeakReference<Drawable> f21171c;

    @Override // android.text.style.DynamicDrawableSpan, android.text.style.ReplacementSpan
    public int getSize(Paint paint, CharSequence charSequence, int i, int i2, Paint.FontMetricsInt fontMetricsInt) {
        return this.f21169a + super.getSize(paint, charSequence, i, i2, fontMetricsInt) + this.f21170b;
    }

    @Override // android.text.style.DynamicDrawableSpan, android.text.style.ReplacementSpan
    public void draw(Canvas canvas, CharSequence charSequence, int i, int i2, float f, int i3, int i4, int i5, Paint paint) {
        Drawable drawableA = a();
        canvas.save();
        canvas.translate(this.f21169a + f, (i3 + ((i5 - i3) / 2)) - (drawableA.getBounds().height() / 2));
        drawableA.draw(canvas);
        canvas.restore();
    }

    private void a(int i, int i2) {
        if (dk.c()) {
            this.f21169a = i2;
            this.f21170b = i;
        } else {
            this.f21169a = i;
            this.f21170b = i2;
        }
    }

    private Drawable a() {
        WeakReference<Drawable> weakReference = this.f21171c;
        Drawable drawable = weakReference != null ? weakReference.get() : null;
        if (drawable != null) {
            return drawable;
        }
        Drawable drawable2 = getDrawable();
        this.f21171c = new WeakReference<>(drawable2);
        return drawable2;
    }

    public c(Drawable drawable, int i, int i2, int i3) {
        super(drawable, i);
        a(i2, i3);
    }

    public c(Context context, Bitmap bitmap, int i, int i2, int i3) {
        super(context, bitmap, i);
        a(i2, i3);
    }
}
