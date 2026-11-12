package com.google.android.exoplayer2.ui;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import androidx.annotation.Nullable;
import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* JADX INFO: loaded from: classes3.dex */
public final class AspectRatioFrameLayout extends FrameLayout {
    public static final int RESIZE_MODE_FILL = 3;
    public static final int RESIZE_MODE_FIT = 0;
    public static final int RESIZE_MODE_FIXED_HEIGHT = 2;
    public static final int RESIZE_MODE_FIXED_WIDTH = 1;
    public static final int RESIZE_MODE_ZOOM = 4;
    private static final float e = 0.01f;
    private final b a;

    @Nullable
    private AspectRatioListener b;
    private float c;
    private int d;

    public interface AspectRatioListener {
        void onAspectRatioUpdated(float targetAspectRatio, float naturalAspectRatio, boolean aspectRatioMismatch);
    }

    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface ResizeMode {
    }

    public final class b implements Runnable {
        private float a;
        private float b;
        private boolean c;
        private boolean d;

        private b() {
        }

        public void a(float targetAspectRatio, float naturalAspectRatio, boolean aspectRatioMismatch) {
            this.a = targetAspectRatio;
            this.b = naturalAspectRatio;
            this.c = aspectRatioMismatch;
            if (this.d) {
                return;
            }
            this.d = true;
            AspectRatioFrameLayout.this.post(this);
        }

        @Override // java.lang.Runnable
        public void run() {
            this.d = false;
            if (AspectRatioFrameLayout.this.b == null) {
                return;
            }
            AspectRatioFrameLayout.this.b.onAspectRatioUpdated(this.a, this.b, this.c);
        }
    }

    public AspectRatioFrameLayout(Context context) {
        this(context, null);
    }

    public int getResizeMode() {
        return this.d;
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        float f;
        float f2;
        super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        if (this.c <= 0.0f) {
            return;
        }
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        float f3 = measuredWidth;
        float f4 = measuredHeight;
        float f5 = f3 / f4;
        float f6 = (this.c / f5) - 1.0f;
        if (Math.abs(f6) <= 0.01f) {
            this.a.a(this.c, f5, false);
            return;
        }
        int i = this.d;
        if (i != 0) {
            if (i != 1) {
                if (i == 2) {
                    f = this.c;
                } else if (i == 4) {
                    if (f6 > 0.0f) {
                        f = this.c;
                    } else {
                        f2 = this.c;
                    }
                }
                measuredWidth = (int) (f4 * f);
            } else {
                f2 = this.c;
            }
            measuredHeight = (int) (f3 / f2);
        } else if (f6 > 0.0f) {
            f2 = this.c;
            measuredHeight = (int) (f3 / f2);
        } else {
            f = this.c;
            measuredWidth = (int) (f4 * f);
        }
        this.a.a(this.c, f5, true);
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(measuredWidth, 1073741824), View.MeasureSpec.makeMeasureSpec(measuredHeight, 1073741824));
    }

    public void setAspectRatio(float widthHeightRatio) {
        if (this.c != widthHeightRatio) {
            this.c = widthHeightRatio;
            requestLayout();
        }
    }

    public void setAspectRatioListener(@Nullable AspectRatioListener listener) {
        this.b = listener;
    }

    public void setResizeMode(int resizeMode) {
        if (this.d != resizeMode) {
            this.d = resizeMode;
            requestLayout();
        }
    }

    public AspectRatioFrameLayout(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
        this.d = 0;
        if (attrs != null) {
            TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(attrs, R.styleable.AspectRatioFrameLayout, 0, 0);
            try {
                this.d = typedArrayObtainStyledAttributes.getInt(R.styleable.AspectRatioFrameLayout_resize_mode, 0);
                typedArrayObtainStyledAttributes.recycle();
            } catch (Throwable th) {
                typedArrayObtainStyledAttributes.recycle();
                throw th;
            }
        }
        this.a = new b();
    }
}
