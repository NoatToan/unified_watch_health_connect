package com.huawei.healthcloud.plugintrack.ui.view.sharegroup;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.text.TextPaint;
import android.util.AttributeSet;
import android.view.View;

/* JADX INFO: loaded from: classes33.dex */
public class SharePorterDuffView extends View {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Typeface f11381a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Bitmap f11382b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final PorterDuff.Mode f11383c;
    private Paint d;
    private Bitmap e;
    private String f;
    private int g;
    private int h;
    private PorterDuffXfermode i;
    private int j;

    public SharePorterDuffView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        PorterDuff.Mode mode = PorterDuff.Mode.DST_IN;
        this.f11383c = mode;
        this.d = new Paint(1);
        this.i = new PorterDuffXfermode(mode);
    }

    private void a() {
        Drawable drawable = new Drawable(this) { // from class: com.huawei.healthcloud.plugintrack.ui.view.sharegroup.SharePorterDuffView.2
            @Override // android.graphics.drawable.Drawable
            public void draw(Canvas canvas) {
            }

            @Override // android.graphics.drawable.Drawable
            public int getOpacity() {
                return 0;
            }

            @Override // android.graphics.drawable.Drawable
            public void setAlpha(int i) {
            }

            @Override // android.graphics.drawable.Drawable
            public void setColorFilter(ColorFilter colorFilter) {
            }
        };
        this.e = Bitmap.createBitmap(this.g, this.h, Bitmap.Config.ALPHA_8);
        TextPaint textPaint = new TextPaint();
        textPaint.setTextAlign(Paint.Align.CENTER);
        textPaint.setTextSize(this.j);
        textPaint.setColor(-16777216);
        textPaint.setTypeface(this.f11381a);
        Canvas canvas = new Canvas(this.e);
        drawable.setBounds(0, 0, this.g, this.h);
        drawable.draw(canvas);
        canvas.drawBitmap(this.e, 0.0f, 0.0f, new Paint());
        canvas.drawText(this.f, this.e.getWidth() / 2.0f, ((this.e.getHeight() - textPaint.getFontMetrics().top) - textPaint.getFontMetrics().bottom) / 2.0f, textPaint);
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        this.h = getHeight();
        this.g = getWidth();
        a();
        canvas.drawColor(-16777216);
        int iSaveLayer = canvas.saveLayer(0.0f, 0.0f, this.g, this.h, null, 31);
        canvas.drawBitmap(this.f11382b, 0.0f, 0.0f, this.d);
        this.d.setXfermode(this.i);
        canvas.drawBitmap(this.e, 0.0f, 0.0f, this.d);
        this.d.setXfermode(null);
        canvas.restoreToCount(iSaveLayer);
    }
}
