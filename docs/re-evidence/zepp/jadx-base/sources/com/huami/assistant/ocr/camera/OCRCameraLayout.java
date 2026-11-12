package com.huami.assistant.ocr.camera;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.huami.assistant.R;

/* JADX INFO: loaded from: classes5.dex */
public class OCRCameraLayout extends FrameLayout {
    public static int ORIENTATION_HORIZONTAL = 1;
    public static int ORIENTATION_PORTRAIT;
    private int a;
    private View b;
    private View c;
    private View d;
    private View e;
    private int f;
    private int g;
    private int h;
    private int i;
    private Rect j;
    private Paint k;

    public OCRCameraLayout(Context context) {
        super(context);
        this.a = ORIENTATION_PORTRAIT;
        setWillNotDraw(false);
        this.j = new Rect();
        Paint paint = new Paint();
        this.k = paint;
        paint.setStyle(Paint.Style.FILL);
        this.k.setColor(Color.argb(83, 0, 0, 0));
    }

    private void a(AttributeSet attrs) {
        TypedArray typedArrayObtainStyledAttributes = getContext().getTheme().obtainStyledAttributes(attrs, R.styleable.OCRCameraLayout, 0, 0);
        try {
            this.f = typedArrayObtainStyledAttributes.getResourceId(R.styleable.OCRCameraLayout_contentView, -1);
            this.g = typedArrayObtainStyledAttributes.getResourceId(R.styleable.OCRCameraLayout_centerView, -1);
            this.h = typedArrayObtainStyledAttributes.getResourceId(R.styleable.OCRCameraLayout_leftDownView, -1);
            this.i = typedArrayObtainStyledAttributes.getResourceId(R.styleable.OCRCameraLayout_rightUpView, -1);
        } finally {
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.b = findViewById(this.f);
        int i = this.g;
        if (i != -1) {
            this.c = findViewById(i);
        }
        this.d = findViewById(this.h);
        this.e = findViewById(this.i);
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        canvas.drawRect(this.j, this.k);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean changed, int l, int t, int r, int b) {
        int width = getWidth();
        int height = getHeight();
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.d.getLayoutParams();
        ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) this.e.getLayoutParams();
        if (r < b) {
            int i = (width * 4) / 3;
            int i2 = height - i;
            this.b.layout(l, t, r, i);
            Rect rect = this.j;
            rect.left = 0;
            rect.top = i;
            rect.right = width;
            rect.bottom = height;
            View view = this.c;
            if (view != null) {
                int measuredWidth = (width - view.getMeasuredWidth()) / 2;
                int measuredHeight = ((i2 - this.c.getMeasuredHeight()) / 2) + i;
                View view2 = this.c;
                view2.layout(measuredWidth, measuredHeight, view2.getMeasuredWidth() + measuredWidth, this.c.getMeasuredHeight() + measuredHeight);
            }
            int i3 = marginLayoutParams.leftMargin;
            int measuredHeight2 = ((i2 - this.d.getMeasuredHeight()) / 2) + i;
            View view3 = this.d;
            view3.layout(i3, measuredHeight2, view3.getMeasuredWidth() + i3, this.d.getMeasuredHeight() + measuredHeight2);
            int measuredWidth2 = (width - this.e.getMeasuredWidth()) - marginLayoutParams2.rightMargin;
            int measuredHeight3 = i + ((i2 - this.e.getMeasuredHeight()) / 2);
            View view4 = this.e;
            view4.layout(measuredWidth2, measuredHeight3, view4.getMeasuredWidth() + measuredWidth2, this.e.getMeasuredHeight() + measuredHeight3);
            return;
        }
        int i4 = (height * 4) / 3;
        int i5 = width - i4;
        this.b.layout(l, t, i4, height);
        Rect rect2 = this.j;
        rect2.left = i4;
        rect2.top = 0;
        rect2.right = width;
        rect2.bottom = height;
        View view5 = this.c;
        if (view5 != null) {
            int measuredWidth3 = ((i5 - view5.getMeasuredWidth()) / 2) + i4;
            int measuredHeight4 = (height - this.c.getMeasuredHeight()) / 2;
            View view6 = this.c;
            view6.layout(measuredWidth3, measuredHeight4, view6.getMeasuredWidth() + measuredWidth3, this.c.getMeasuredHeight() + measuredHeight4);
        }
        int measuredWidth4 = ((i5 - this.d.getMeasuredWidth()) / 2) + i4;
        int measuredHeight5 = (height - this.d.getMeasuredHeight()) - marginLayoutParams.bottomMargin;
        View view7 = this.d;
        view7.layout(measuredWidth4, measuredHeight5, view7.getMeasuredWidth() + measuredWidth4, this.d.getMeasuredHeight() + measuredHeight5);
        int measuredWidth5 = i4 + ((i5 - this.e.getMeasuredWidth()) / 2);
        int i6 = marginLayoutParams2.topMargin;
        View view8 = this.e;
        view8.layout(measuredWidth5, i6, view8.getMeasuredWidth() + measuredWidth5, this.e.getMeasuredHeight() + i6);
    }

    public void setOrientation(int orientation) {
        if (this.a == orientation) {
            return;
        }
        this.a = orientation;
        requestLayout();
    }

    public OCRCameraLayout(Context context, AttributeSet attrs) {
        super(context, attrs);
        this.a = ORIENTATION_PORTRAIT;
        setWillNotDraw(false);
        this.j = new Rect();
        Paint paint = new Paint();
        this.k = paint;
        paint.setStyle(Paint.Style.FILL);
        this.k.setColor(Color.argb(83, 0, 0, 0));
        a(attrs);
    }

    public OCRCameraLayout(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        this.a = ORIENTATION_PORTRAIT;
        setWillNotDraw(false);
        this.j = new Rect();
        Paint paint = new Paint();
        this.k = paint;
        paint.setStyle(Paint.Style.FILL);
        this.k.setColor(Color.argb(83, 0, 0, 0));
        a(attrs);
    }
}
