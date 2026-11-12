package com.xiaomi.hm.health.device.watch_skin;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;
import androidx.annotation.Nullable;
import androidx.core.content.ContextCompat;
import com.huami.devicex.R;
import com.huami.lib.view.ViewUtils;

/* JADX INFO: loaded from: classes19.dex */
public class WatchSkinProgressView extends View {
    public static final int STATE_DISABLE = 2;
    public static final int STATE_ENABLE = 1;
    public static final int STATE_LOADING = 3;
    private int a;
    private Context b;
    private int c;
    private int d;
    private float e;
    private String f;
    private Paint g;
    private Paint h;
    private Paint i;
    private Path j;
    private float k;
    private boolean l;

    public WatchSkinProgressView(Context context) {
        this(context, null);
    }

    private void a() {
        this.j = new Path();
        RectF rectF = new RectF(0.0f, 0.0f, this.c, this.d);
        if (this.l) {
            float dimension = (int) getResources().getDimension(R.dimen.btn_click_bg_round_radius);
            this.j.addRoundRect(rectF, new float[]{0.0f, 0.0f, 0.0f, 0.0f, dimension, dimension, dimension, dimension}, Path.Direction.CCW);
        } else {
            float f = (int) this.k;
            this.j.addRoundRect(rectF, new float[]{f, f, f, f, f, f, f, f}, Path.Direction.CCW);
        }
    }

    private void b() {
        Paint paint = new Paint(1);
        this.g = paint;
        paint.setColor(ContextCompat.getColor(this.b, R.color.p3));
        Paint paint2 = new Paint(1);
        this.h = paint2;
        paint2.setColor(ContextCompat.getColor(this.b, R.color.s33));
        Paint paint3 = new Paint(1);
        this.i = paint3;
        paint3.setColor(ContextCompat.getColor(this.b, R.color.s5));
        this.i.setTextSize(ViewUtils.sp2px(this.b, 14.0f));
        this.i.setTextAlign(Paint.Align.CENTER);
        this.f = this.b.getString(R.string.sync_watch_skin);
    }

    public int getState() {
        return this.a;
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        Path path = this.j;
        if (path != null) {
            canvas.clipPath(path);
        }
        int i = this.a;
        if (i == 1) {
            canvas.drawRect(0.0f, 0.0f, this.c, this.d, this.g);
        } else if (i == 2) {
            canvas.drawRect(0.0f, 0.0f, this.c, this.d, this.h);
        } else if (i == 3) {
            float f = this.c * this.e;
            canvas.drawRect(0.0f, 0.0f, f, this.d, this.g);
            canvas.drawRect(f, 0.0f, this.c, this.d, this.h);
        }
        Paint.FontMetrics fontMetrics = this.i.getFontMetrics();
        canvas.drawText(this.f, this.c / 2, ((this.d - fontMetrics.top) - fontMetrics.bottom) / 2.0f, this.i);
    }

    @Override // android.view.View
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        this.c = i;
        this.d = i2;
        a();
    }

    public void setProgress(float f) {
        this.e = f;
        invalidate();
    }

    public void setState(int i, String str) {
        this.a = i;
        setEnabled(i == 1);
        this.f = str;
        invalidate();
    }

    public WatchSkinProgressView(Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public WatchSkinProgressView(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.a = 1;
        this.l = true;
        this.b = context;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.WatchSkinProgressView, 0, i);
        this.l = typedArrayObtainStyledAttributes.getBoolean(R.styleable.WatchSkinProgressView_dialogMode, true);
        this.k = typedArrayObtainStyledAttributes.getDimension(R.styleable.WatchSkinProgressView_btnRadius, getResources().getDimension(R.dimen.btn_click_bg_round_radius_dial));
        typedArrayObtainStyledAttributes.recycle();
        b();
    }
}
