package com.huami.lib.qrcode.view;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.View;
import androidx.annotation.Nullable;
import com.huami.lib.qrcode.R;

/* JADX INFO: loaded from: classes10.dex */
public class ScannerView extends View {
    private static final int h = 16;
    private int a;
    private float b;
    private int c;
    private Bitmap d;
    private Rect e;
    private Paint f;
    private String g;

    public ScannerView(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.a = 0;
        this.b = 0.0f;
        this.c = 0;
        this.g = getResources().getString(R.string.qrcode_scan_tip);
        a();
    }

    private void a() {
        DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
        Bitmap bitmapDecodeResource = BitmapFactory.decodeResource(getResources(), R.drawable.qrcode_ic_scan_line);
        this.d = bitmapDecodeResource;
        this.c = bitmapDecodeResource.getWidth();
        this.b = TypedValue.applyDimension(1, 3.0f, displayMetrics);
        Paint paint = new Paint(1);
        this.f = paint;
        paint.setColor(-1);
        this.f.setTextSize(TypedValue.applyDimension(2, 14.0f, displayMetrics));
        this.e = new Rect();
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        this.e.set(0, getHeight() >> 2, getWidth(), (getHeight() << 1) / 3);
        int i = (int) (this.a + this.b);
        this.a = i;
        if (i > this.e.height()) {
            this.a = 0;
        }
        int iCenterX = this.e.centerX();
        canvas.drawBitmap(this.d, iCenterX - (this.c >> 1), this.e.top + this.a, this.f);
        canvas.drawText(this.g, iCenterX - (this.f.measureText(this.g) / 2.0f), (getHeight() << 2) / 5.0f, this.f);
        Rect rect = this.e;
        postInvalidateDelayed(16L, rect.left, rect.top, rect.right, rect.bottom);
    }

    public void setScanTips(String str) {
        this.g = str;
        postInvalidate();
    }
}
