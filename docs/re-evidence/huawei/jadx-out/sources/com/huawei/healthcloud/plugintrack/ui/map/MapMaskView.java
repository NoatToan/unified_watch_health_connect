package com.huawei.healthcloud.plugintrack.ui.map;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatImageView;
import com.huawei.healthcloud.plugintrack.R;

/* JADX INFO: loaded from: classes33.dex */
public class MapMaskView extends AppCompatImageView {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private PorterDuffXfermode f11221a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f11222b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private float f11223c;
    private Paint d;
    private RectF e;

    public MapMaskView(Context context) {
        super(context);
        this.e = new RectF();
        this.d = new Paint();
        this.f11221a = new PorterDuffXfermode(PorterDuff.Mode.XOR);
        this.f11222b = -1;
        b(context);
    }

    public MapMaskView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.e = new RectF();
        this.d = new Paint();
        this.f11221a = new PorterDuffXfermode(PorterDuff.Mode.XOR);
        this.f11222b = -1;
        b(context);
    }

    public MapMaskView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.e = new RectF();
        this.d = new Paint();
        this.f11221a = new PorterDuffXfermode(PorterDuff.Mode.XOR);
        this.f11222b = -1;
        b(context);
    }

    private void b(Context context) {
        this.f11223c = context.getResources().getDimension(R.dimen.cardCornerRadius);
        this.f11222b = context.getResources().getColor(R.color.colorSubBackground);
    }

    @Override // android.widget.ImageView, android.view.View
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        int width = getWidth();
        int height = getHeight();
        float f = width;
        float f2 = height;
        int iSaveLayer = canvas.saveLayer(0.0f, 0.0f, f, f2, null, 31);
        this.d.setStyle(Paint.Style.FILL_AND_STROKE);
        this.d.setStrokeWidth(0.0f);
        this.d.setAntiAlias(true);
        this.d.setColor(this.f11222b);
        canvas.drawRect(0.0f, 0.0f, f, f2, this.d);
        this.d.setXfermode(this.f11221a);
        this.d.setColor(-16777216);
        this.e.left = 2.0f;
        this.e.right = width - 4;
        this.e.top = 2.0f;
        this.e.bottom = height - 4;
        RectF rectF = this.e;
        float f3 = this.f11223c;
        canvas.drawRoundRect(rectF, f3, f3, this.d);
        this.d.setXfermode(null);
        canvas.restoreToCount(iSaveLayer);
    }
}
