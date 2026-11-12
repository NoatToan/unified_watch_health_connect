package com.huami.watch.ui.dialog;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;
import com.huami.watch.companionlib.R;

/* JADX INFO: loaded from: classes10.dex */
public class LoadingView extends View {
    private Context a;
    private Paint b;
    private int c;
    private int d;
    private Bitmap e;
    private Bitmap f;
    private Bitmap g;

    public LoadingView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.a = context;
        Paint paint = new Paint();
        this.b = paint;
        paint.setFilterBitmap(true);
        this.c = 0;
        this.d = 0;
    }

    @Override // android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        recycle(this.e);
        recycle(this.f);
        recycle(this.g);
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        Resources resources = this.a.getResources();
        if (this.e == null) {
            this.e = BitmapFactory.decodeResource(resources, R.drawable.ic_dialog_loading_bg);
        }
        if (this.f == null) {
            this.f = BitmapFactory.decodeResource(resources, R.drawable.ic_dialog_loading_hour);
        }
        if (this.g == null) {
            this.g = BitmapFactory.decodeResource(resources, R.drawable.ic_dialog_loading_minute);
        }
        int width = canvas.getWidth() / 2;
        int height = canvas.getHeight() / 2;
        Bitmap bitmap = this.e;
        canvas.drawBitmap(bitmap, width - (bitmap.getWidth() / 2), height - (this.e.getHeight() / 2), this.b);
        canvas.save();
        float f = width;
        float f2 = height;
        canvas.rotate(this.c, f, f2);
        Bitmap bitmap2 = this.f;
        canvas.drawBitmap(bitmap2, width - (bitmap2.getWidth() / 2), height - (this.f.getHeight() / 2), this.b);
        canvas.restore();
        canvas.save();
        canvas.rotate(this.d, f, f2);
        Bitmap bitmap3 = this.g;
        canvas.drawBitmap(bitmap3, width - (bitmap3.getWidth() / 2), height - (this.g.getHeight() / 2), this.b);
        canvas.restore();
        int i = this.c + 1;
        this.c = i;
        int i2 = this.d + 12;
        this.d = i2;
        if (i >= 360) {
            this.c = 0;
        }
        if (i2 >= 360) {
            this.d = 0;
        }
        postInvalidateOnAnimation();
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        setMeasuredDimension(94, 94);
    }

    public void recycle(Bitmap bitmap) {
        if (bitmap != null) {
            bitmap.recycle();
        }
    }
}
