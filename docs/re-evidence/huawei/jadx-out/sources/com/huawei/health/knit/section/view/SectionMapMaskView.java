package com.huawei.health.knit.section.view;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatImageView;
import com.huawei.ui.commonui.R;

/* JADX INFO: loaded from: classes7.dex */
public class SectionMapMaskView extends AppCompatImageView {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f7829a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private float f7830b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private RectF f7831c;
    private Paint d;
    private PorterDuffXfermode e;

    public SectionMapMaskView(Context context) {
        super(context);
        this.f7831c = new RectF();
        this.d = new Paint();
        this.e = new PorterDuffXfermode(PorterDuff.Mode.XOR);
        this.f7829a = -1;
        d(context);
    }

    public SectionMapMaskView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f7831c = new RectF();
        this.d = new Paint();
        this.e = new PorterDuffXfermode(PorterDuff.Mode.XOR);
        this.f7829a = -1;
        d(context);
    }

    public SectionMapMaskView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f7831c = new RectF();
        this.d = new Paint();
        this.e = new PorterDuffXfermode(PorterDuff.Mode.XOR);
        this.f7829a = -1;
        d(context);
    }

    private void d(Context context) {
        this.f7830b = context.getResources().getDimension(R.dimen.health_common_16dp);
        this.f7829a = context.getResources().getColor(R.color.colorSubBackground);
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
        this.d.setColor(this.f7829a);
        canvas.drawRect(0.0f, 0.0f, f, f2, this.d);
        this.d.setXfermode(this.e);
        this.d.setColor(-16777216);
        this.f7831c.left = 2.0f;
        this.f7831c.right = width - 4;
        this.f7831c.top = 2.0f;
        this.f7831c.bottom = height - 4;
        RectF rectF = this.f7831c;
        float f3 = this.f7830b;
        canvas.drawRoundRect(rectF, f3, f3, this.d);
        this.d.setXfermode(null);
        canvas.restoreToCount(iSaveLayer);
    }
}
