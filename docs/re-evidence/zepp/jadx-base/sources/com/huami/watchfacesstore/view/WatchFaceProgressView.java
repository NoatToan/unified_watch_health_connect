package com.huami.watchfacesstore.view;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;
import androidx.annotation.ColorRes;
import androidx.annotation.Nullable;
import androidx.annotation.StringRes;
import androidx.core.content.ContextCompat;
import com.huami.watchfacesstore.R;
import com.huami.watchfacesstore.ext.ExtensionsKt;

/* JADX INFO: loaded from: classes17.dex */
public class WatchFaceProgressView extends View {
    public static final int STATE_DISABLE = 2;
    public static final int STATE_ENABLE = 1;
    public static final int STATE_LOADING = 3;
    private int a;
    private Context b;
    private int c;
    private int d;
    private float e;
    private String f;
    private int g;
    private int h;
    private float i;
    private float j;
    private Paint k;
    private Paint l;
    private Paint m;
    private Path n;
    private boolean o;

    public WatchFaceProgressView(Context context) {
        this(context, null);
    }

    private void a() {
        this.n = new Path();
        RectF rectF = new RectF(0.0f, 0.0f, this.c, this.d);
        if (this.o) {
            float dimension = (int) getResources().getDimension(R.dimen.btn_click_bg_round_radius);
            this.n.addRoundRect(rectF, new float[]{0.0f, 0.0f, 0.0f, 0.0f, dimension, dimension, dimension, dimension}, Path.Direction.CCW);
        } else {
            Path path = this.n;
            float f = this.j;
            path.addRoundRect(rectF, new float[]{f, f, f, f, f, f, f, f}, Path.Direction.CCW);
        }
    }

    private void b() {
        Paint paint = new Paint(1);
        this.k = paint;
        paint.setColor(this.g);
        Paint paint2 = new Paint(1);
        this.l = paint2;
        paint2.setColor(this.h);
        Paint paint3 = new Paint(1);
        this.m = paint3;
        paint3.setColor(-1);
        this.m.setTextSize(this.i);
        this.m.setTextAlign(Paint.Align.CENTER);
        if (this.f == null) {
            this.f = this.b.getString(R.string.wf_sync_watch_face);
        }
    }

    public int getState() {
        return this.a;
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        Path path = this.n;
        if (path != null) {
            canvas.clipPath(path);
        }
        int i = this.a;
        if (i == 1) {
            canvas.drawRect(0.0f, 0.0f, this.c, this.d, this.k);
        } else if (i == 2) {
            canvas.drawRect(0.0f, 0.0f, this.c, this.d, this.l);
        } else if (i == 3) {
            float f = this.c * this.e;
            canvas.drawRect(0.0f, 0.0f, f, this.d, this.k);
            canvas.drawRect(f, 0.0f, this.c, this.d, this.l);
        }
        Paint.FontMetrics fontMetrics = this.m.getFontMetrics();
        canvas.drawText(this.f, this.c / 2.0f, ((this.d - fontMetrics.top) - fontMetrics.bottom) / 2.0f, this.m);
    }

    @Override // android.view.View
    public void onSizeChanged(int w, int h, int oldw, int oldh) {
        super.onSizeChanged(w, h, oldw, oldh);
        this.c = w;
        this.d = h;
        a();
    }

    public void setDoneColor(@ColorRes int color) {
        this.k.setColor(ContextCompat.getColor(this.b, color));
        invalidate();
    }

    public void setProgress(float progress) {
        this.e = progress;
        invalidate();
    }

    public void setState(int state, String text) {
        this.a = state;
        setEnabled(state == 1);
        this.f = text;
        invalidate();
    }

    public WatchFaceProgressView(Context context, @Nullable AttributeSet attrs) {
        this(context, attrs, 0);
    }

    public WatchFaceProgressView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        this.a = 1;
        this.b = context;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attrs, R.styleable.WatchFaceProgressView, 0, defStyleAttr);
        this.o = typedArrayObtainStyledAttributes.getBoolean(R.styleable.WatchFaceProgressView_dialogMode, false);
        this.g = typedArrayObtainStyledAttributes.getColor(R.styleable.WatchFaceProgressView_doneColor, ContextCompat.getColor(this.b, R.color.wf_done_color));
        this.h = typedArrayObtainStyledAttributes.getColor(R.styleable.WatchFaceProgressView_unDoneColor, ContextCompat.getColor(this.b, R.color.wf_un_done_color));
        this.i = typedArrayObtainStyledAttributes.getDimension(R.styleable.WatchFaceProgressView_android_textSize, ExtensionsKt.getSp(14));
        this.f = typedArrayObtainStyledAttributes.getString(R.styleable.WatchFaceProgressView_android_text);
        this.j = typedArrayObtainStyledAttributes.getDimension(R.styleable.WatchFaceProgressView_radius, ExtensionsKt.getDp(6));
        typedArrayObtainStyledAttributes.recycle();
        b();
    }

    public void setProgress(float progress, String text) {
        this.e = progress;
        this.f = text;
        invalidate();
    }

    public void setState(int state, @StringRes int strId) {
        this.a = state;
        setEnabled(state == 1);
        this.f = getResources().getString(strId);
        invalidate();
    }
}
