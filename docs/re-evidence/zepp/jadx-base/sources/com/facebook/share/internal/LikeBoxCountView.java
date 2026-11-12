package com.facebook.share.internal;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.facebook.common.R;

/* JADX INFO: loaded from: classes2.dex */
@Deprecated
public class LikeBoxCountView extends FrameLayout {
    private TextView a;
    private LikeBoxCountViewCaretPosition b;
    private float c;
    private float d;
    private float e;
    private Paint f;
    private int g;
    private int h;

    public enum LikeBoxCountViewCaretPosition {
        LEFT,
        TOP,
        RIGHT,
        BOTTOM
    }

    public static /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[LikeBoxCountViewCaretPosition.values().length];
            a = iArr;
            try {
                iArr[LikeBoxCountViewCaretPosition.LEFT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[LikeBoxCountViewCaretPosition.TOP.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                a[LikeBoxCountViewCaretPosition.RIGHT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                a[LikeBoxCountViewCaretPosition.BOTTOM.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    @Deprecated
    public LikeBoxCountView(Context context) {
        super(context);
        this.b = LikeBoxCountViewCaretPosition.LEFT;
        b(context);
    }

    private void a(Canvas canvas, float f, float f2, float f3, float f4) {
        Path path = new Path();
        float f5 = this.e * 2.0f;
        float f6 = f + f5;
        float f7 = f2 + f5;
        path.addArc(new RectF(f, f2, f6, f7), -180.0f, 90.0f);
        if (this.b == LikeBoxCountViewCaretPosition.TOP) {
            float f8 = f3 - f;
            path.lineTo(((f8 - this.d) / 2.0f) + f, f2);
            path.lineTo((f8 / 2.0f) + f, f2 - this.c);
            path.lineTo(((f8 + this.d) / 2.0f) + f, f2);
        }
        path.lineTo(f3 - this.e, f2);
        float f9 = f3 - f5;
        path.addArc(new RectF(f9, f2, f3, f7), -90.0f, 90.0f);
        if (this.b == LikeBoxCountViewCaretPosition.RIGHT) {
            float f10 = f4 - f2;
            path.lineTo(f3, ((f10 - this.d) / 2.0f) + f2);
            path.lineTo(this.c + f3, (f10 / 2.0f) + f2);
            path.lineTo(f3, ((f10 + this.d) / 2.0f) + f2);
        }
        path.lineTo(f3, f4 - this.e);
        float f11 = f4 - f5;
        path.addArc(new RectF(f9, f11, f3, f4), 0.0f, 90.0f);
        if (this.b == LikeBoxCountViewCaretPosition.BOTTOM) {
            float f12 = f3 - f;
            path.lineTo(((this.d + f12) / 2.0f) + f, f4);
            path.lineTo((f12 / 2.0f) + f, this.c + f4);
            path.lineTo(((f12 - this.d) / 2.0f) + f, f4);
        }
        path.lineTo(this.e + f, f4);
        path.addArc(new RectF(f, f11, f6, f4), 90.0f, 90.0f);
        if (this.b == LikeBoxCountViewCaretPosition.LEFT) {
            float f13 = f4 - f2;
            path.lineTo(f, ((this.d + f13) / 2.0f) + f2);
            path.lineTo(f - this.c, (f13 / 2.0f) + f2);
            path.lineTo(f, ((f13 - this.d) / 2.0f) + f2);
        }
        path.lineTo(f, f2 + this.e);
        canvas.drawPath(path, this.f);
    }

    private void b(Context context) {
        setWillNotDraw(false);
        this.c = getResources().getDimension(R.dimen.com_facebook_likeboxcountview_caret_height);
        this.d = getResources().getDimension(R.dimen.com_facebook_likeboxcountview_caret_width);
        this.e = getResources().getDimension(R.dimen.com_facebook_likeboxcountview_border_radius);
        Paint paint = new Paint();
        this.f = paint;
        paint.setColor(getResources().getColor(R.color.com_facebook_likeboxcountview_border_color));
        this.f.setStrokeWidth(getResources().getDimension(R.dimen.com_facebook_likeboxcountview_border_width));
        this.f.setStyle(Paint.Style.STROKE);
        c(context);
        addView(this.a);
        setCaretPosition(this.b);
    }

    private void c(Context context) {
        this.a = new TextView(context);
        this.a.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        this.a.setGravity(17);
        this.a.setTextSize(0, getResources().getDimension(R.dimen.com_facebook_likeboxcountview_text_size));
        this.a.setTextColor(getResources().getColor(R.color.com_facebook_likeboxcountview_text_color));
        this.g = getResources().getDimensionPixelSize(R.dimen.com_facebook_likeboxcountview_text_padding);
        this.h = getResources().getDimensionPixelSize(R.dimen.com_facebook_likeboxcountview_caret_height);
    }

    private void d(int i, int i2, int i3, int i4) {
        TextView textView = this.a;
        int i5 = this.g;
        textView.setPadding(i + i5, i2 + i5, i3 + i5, i5 + i4);
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        int paddingTop = getPaddingTop();
        int paddingLeft = getPaddingLeft();
        int width = getWidth() - getPaddingRight();
        int height = getHeight() - getPaddingBottom();
        int i = a.a[this.b.ordinal()];
        if (i == 1) {
            paddingLeft = (int) (paddingLeft + this.c);
        } else if (i == 2) {
            paddingTop = (int) (paddingTop + this.c);
        } else if (i == 3) {
            width = (int) (width - this.c);
        } else if (i == 4) {
            height = (int) (height - this.c);
        }
        a(canvas, paddingLeft, paddingTop, width, height);
    }

    @Deprecated
    public void setCaretPosition(LikeBoxCountViewCaretPosition likeBoxCountViewCaretPosition) {
        this.b = likeBoxCountViewCaretPosition;
        int i = a.a[likeBoxCountViewCaretPosition.ordinal()];
        if (i == 1) {
            d(this.h, 0, 0, 0);
            return;
        }
        if (i == 2) {
            d(0, this.h, 0, 0);
        } else if (i == 3) {
            d(0, 0, this.h, 0);
        } else {
            if (i != 4) {
                return;
            }
            d(0, 0, 0, this.h);
        }
    }

    @Deprecated
    public void setText(String str) {
        this.a.setText(str);
    }
}
