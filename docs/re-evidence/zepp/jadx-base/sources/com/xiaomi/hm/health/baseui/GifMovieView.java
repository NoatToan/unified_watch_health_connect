package com.xiaomi.hm.health.baseui;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Movie;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.view.View;
import com.huami.devicex.R;
import com.huami.tools.log.HMLog;

/* JADX INFO: loaded from: classes19.dex */
public class GifMovieView extends View {
    private static final String l = "GifMovieView";
    private static final int m = 1000;
    private int a;
    private Movie b;
    private long c;
    private int d;
    private float e;
    private float f;
    private float g;
    private int h;
    private int i;
    private volatile boolean j;
    private boolean k;

    public GifMovieView(Context context) {
        this(context, null);
    }

    private void a(Canvas canvas) {
        this.b.setTime(this.d);
        canvas.save();
        float f = this.g;
        canvas.scale(f, f);
        Movie movie = this.b;
        float f2 = this.e;
        float f3 = this.g;
        movie.draw(canvas, f2 / f3, this.f / f3);
        canvas.restore();
    }

    @SuppressLint({"NewApi"})
    private void b() {
        if (this.k) {
            invalidate();
        }
    }

    @SuppressLint({"NewApi"})
    private void c(Context context, AttributeSet attributeSet, int i) {
        setLayerType(1, null);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.GifMovieView, i, R.style.GifMovieView);
        this.a = typedArrayObtainStyledAttributes.getResourceId(R.styleable.GifMovieView_gif, -1);
        this.j = typedArrayObtainStyledAttributes.getBoolean(R.styleable.GifMovieView_paused, false);
        typedArrayObtainStyledAttributes.recycle();
        if (this.a != -1) {
            this.b = Movie.decodeStream(getResources().openRawResource(this.a));
        }
    }

    private void d() {
        long jUptimeMillis = SystemClock.uptimeMillis();
        if (this.c == 0) {
            this.c = jUptimeMillis;
        }
        int iDuration = this.b.duration();
        if (iDuration == 0) {
            iDuration = 1000;
        }
        this.d = (int) ((jUptimeMillis - this.c) % ((long) iDuration));
    }

    public Movie getMovie() {
        return this.b;
    }

    public boolean isPaused() {
        return this.j;
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        if (this.b != null) {
            if (this.j) {
                a(canvas);
                return;
            }
            d();
            a(canvas);
            b();
        }
    }

    @Override // android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        this.e = (getWidth() - this.h) / 2.0f;
        this.f = (getHeight() - this.i) / 2.0f;
        this.k = getVisibility() == 0;
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        int size;
        Movie movie = this.b;
        if (movie == null) {
            setMeasuredDimension(getSuggestedMinimumWidth(), getSuggestedMinimumHeight());
            return;
        }
        int iWidth = movie.width();
        int iHeight = this.b.height();
        float f = 1.0f;
        if (View.MeasureSpec.getMode(i) != 0 && iWidth != (size = View.MeasureSpec.getSize(i))) {
            f = size / iWidth;
        }
        this.g = f;
        HMLog.i(l, "mScale = " + this.g, new Object[0]);
        float f2 = (float) iWidth;
        float f3 = this.g;
        this.h = (int) (f2 * f3);
        this.i = (int) (iHeight * f3);
        HMLog.i(l, "mMeasuredMovieWidth = " + this.h + " , mMeasuredMovieHeight = " + this.i, new Object[0]);
        setMeasuredDimension(this.h, this.i);
    }

    @Override // android.view.View
    @SuppressLint({"NewApi"})
    public void onScreenStateChanged(int i) {
        super.onScreenStateChanged(i);
        this.k = i == 1;
        b();
    }

    @Override // android.view.View
    @SuppressLint({"NewApi"})
    public void onVisibilityChanged(View view, int i) {
        super.onVisibilityChanged(view, i);
        this.k = i == 0;
        b();
    }

    @Override // android.view.View
    public void onWindowVisibilityChanged(int i) {
        super.onWindowVisibilityChanged(i);
        this.k = i == 0;
        b();
    }

    public void setMovie(Movie movie) {
        this.b = movie;
        requestLayout();
    }

    public void setMovieResource(int i) {
        this.a = i;
        this.b = Movie.decodeStream(getResources().openRawResource(this.a));
        requestLayout();
    }

    public void setMovieTime(int i) {
        this.d = i;
        invalidate();
    }

    public void setPaused(boolean z) {
        this.j = z;
        if (!z) {
            this.c = SystemClock.uptimeMillis() - ((long) this.d);
        }
        invalidate();
    }

    public GifMovieView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public GifMovieView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.d = 0;
        this.j = false;
        this.k = true;
        c(context, attributeSet, i);
    }
}
