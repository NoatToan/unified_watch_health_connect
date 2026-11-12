package com.google.maps.android.ui;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.google.maps.android.R;

/* JADX INFO: loaded from: classes3.dex */
public class IconGenerator {
    public static final int STYLE_BLUE = 4;
    public static final int STYLE_DEFAULT = 1;
    public static final int STYLE_GREEN = 5;
    public static final int STYLE_ORANGE = 7;
    public static final int STYLE_PURPLE = 6;
    public static final int STYLE_RED = 3;
    public static final int STYLE_WHITE = 2;
    private final Context a;
    private ViewGroup b;
    private RotationLayout c;
    private TextView d;
    private View e;
    private int f;
    private float g = 0.5f;
    private float h = 1.0f;
    private a i;

    public IconGenerator(Context context) {
        this.a = context;
        this.i = new a(context.getResources());
        ViewGroup viewGroup = (ViewGroup) LayoutInflater.from(context).inflate(R.layout.amu_text_bubble, (ViewGroup) null);
        this.b = viewGroup;
        RotationLayout rotationLayout = (RotationLayout) viewGroup.getChildAt(0);
        this.c = rotationLayout;
        TextView textView = (TextView) rotationLayout.findViewById(R.id.amu_text);
        this.d = textView;
        this.e = textView;
        setStyle(1);
    }

    private static int a(int i) {
        if (i == 3) {
            return -3407872;
        }
        if (i == 4) {
            return -16737844;
        }
        if (i == 5) {
            return -10053376;
        }
        if (i != 6) {
            return i != 7 ? -1 : -30720;
        }
        return -6736948;
    }

    private static int b(int i) {
        return (i == 3 || i == 4 || i == 5 || i == 6 || i == 7) ? R.style.amu_Bubble_TextAppearance_Light : R.style.amu_Bubble_TextAppearance_Dark;
    }

    private float c(float f, float f2) {
        int i = this.f;
        if (i == 0) {
            return f;
        }
        if (i == 1) {
            return 1.0f - f2;
        }
        if (i == 2) {
            return 1.0f - f;
        }
        if (i == 3) {
            return f2;
        }
        throw new IllegalStateException();
    }

    public float getAnchorU() {
        return c(this.g, this.h);
    }

    public float getAnchorV() {
        return c(this.h, this.g);
    }

    public Bitmap makeIcon(CharSequence charSequence) {
        TextView textView = this.d;
        if (textView != null) {
            textView.setText(charSequence);
        }
        return makeIcon();
    }

    public void setBackground(Drawable drawable) {
        this.b.setBackgroundDrawable(drawable);
        if (drawable == null) {
            this.b.setPadding(0, 0, 0, 0);
            return;
        }
        Rect rect = new Rect();
        drawable.getPadding(rect);
        this.b.setPadding(rect.left, rect.top, rect.right, rect.bottom);
    }

    public void setColor(int i) {
        this.i.a(i);
        setBackground(this.i);
    }

    public void setContentPadding(int i, int i2, int i3, int i4) {
        this.e.setPadding(i, i2, i3, i4);
    }

    public void setContentRotation(int i) {
        this.c.setViewRotation(i);
    }

    public void setContentView(View view) {
        this.c.removeAllViews();
        this.c.addView(view);
        this.e = view;
        View viewFindViewById = this.c.findViewById(R.id.amu_text);
        this.d = viewFindViewById instanceof TextView ? (TextView) viewFindViewById : null;
    }

    public void setRotation(int i) {
        this.f = ((i + 360) % 360) / 90;
    }

    public void setStyle(int i) {
        setColor(a(i));
        setTextAppearance(this.a, b(i));
    }

    public void setTextAppearance(Context context, int i) {
        TextView textView = this.d;
        if (textView != null) {
            textView.setTextAppearance(context, i);
        }
    }

    public void setTextAppearance(int i) {
        setTextAppearance(this.a, i);
    }

    public Bitmap makeIcon() {
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        this.b.measure(iMakeMeasureSpec, iMakeMeasureSpec);
        int measuredWidth = this.b.getMeasuredWidth();
        int measuredHeight = this.b.getMeasuredHeight();
        this.b.layout(0, 0, measuredWidth, measuredHeight);
        int i = this.f;
        if (i == 1 || i == 3) {
            measuredHeight = this.b.getMeasuredWidth();
            measuredWidth = this.b.getMeasuredHeight();
        }
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(measuredWidth, measuredHeight, Bitmap.Config.ARGB_8888);
        bitmapCreateBitmap.eraseColor(0);
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        int i2 = this.f;
        if (i2 != 0) {
            if (i2 == 1) {
                canvas.translate(measuredWidth, 0.0f);
                canvas.rotate(90.0f);
            } else if (i2 == 2) {
                canvas.rotate(180.0f, measuredWidth / 2, measuredHeight / 2);
            } else {
                canvas.translate(0.0f, measuredHeight);
                canvas.rotate(270.0f);
            }
        }
        this.b.draw(canvas);
        return bitmapCreateBitmap;
    }
}
