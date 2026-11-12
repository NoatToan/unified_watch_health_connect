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
import j20.x;

/* JADX INFO: loaded from: classes2.dex */
public class IconGenerator {
    public static final int STYLE_BLUE = 4;
    public static final int STYLE_DEFAULT = 1;
    public static final int STYLE_GREEN = 5;
    public static final int STYLE_ORANGE = 7;
    public static final int STYLE_PURPLE = 6;
    public static final int STYLE_RED = 3;
    public static final int STYLE_WHITE = 2;
    private float mAnchorU = 0.5f;
    private float mAnchorV = 1.0f;
    private BubbleDrawable mBackground;
    private ViewGroup mContainer;
    private View mContentView;
    private final Context mContext;
    private int mRotation;
    private RotationLayout mRotationLayout;
    private TextView mTextView;

    public IconGenerator(Context context) {
        this.mContext = context;
        this.mBackground = new BubbleDrawable(context);
        ViewGroup viewGroup = (ViewGroup) LayoutInflater.from(context).inflate(R.layout.amu_text_bubble, (ViewGroup) null);
        this.mContainer = viewGroup;
        RotationLayout rotationLayout = (RotationLayout) viewGroup.getChildAt(0);
        this.mRotationLayout = rotationLayout;
        TextView textView = (TextView) rotationLayout.findViewById(R.id.amu_text);
        this.mTextView = textView;
        this.mContentView = textView;
        setStyle(1);
    }

    private static int getStyleColor(int i14) {
        if (i14 == 3) {
            return -3407872;
        }
        if (i14 == 4) {
            return -16737844;
        }
        if (i14 == 5) {
            return -10053376;
        }
        if (i14 != 6) {
            return i14 != 7 ? -1 : -30720;
        }
        return -6736948;
    }

    private static int getTextStyle(int i14) {
        return (i14 == 3 || i14 == 4 || i14 == 5 || i14 == 6 || i14 == 7) ? R.style.amu_Bubble_TextAppearance_Light : R.style.amu_Bubble_TextAppearance_Dark;
    }

    private float rotateAnchor(float f14, float f15) {
        int i14 = this.mRotation;
        if (i14 == 0) {
            return f14;
        }
        if (i14 == 1) {
            return 1.0f - f15;
        }
        if (i14 == 2) {
            return 1.0f - f14;
        }
        if (i14 == 3) {
            return f15;
        }
        x.h();
        return 0.0f;
    }

    public float getAnchorU() {
        return rotateAnchor(this.mAnchorU, this.mAnchorV);
    }

    public float getAnchorV() {
        return rotateAnchor(this.mAnchorV, this.mAnchorU);
    }

    public Bitmap makeIcon() {
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        this.mContainer.measure(iMakeMeasureSpec, iMakeMeasureSpec);
        int measuredWidth = this.mContainer.getMeasuredWidth();
        int measuredHeight = this.mContainer.getMeasuredHeight();
        this.mContainer.layout(0, 0, measuredWidth, measuredHeight);
        int i14 = this.mRotation;
        if (i14 == 1 || i14 == 3) {
            measuredHeight = this.mContainer.getMeasuredWidth();
            measuredWidth = this.mContainer.getMeasuredHeight();
        }
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(measuredWidth, measuredHeight, Bitmap.Config.ARGB_8888);
        bitmapCreateBitmap.eraseColor(0);
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        int i15 = this.mRotation;
        if (i15 == 1) {
            canvas.translate(measuredWidth, 0.0f);
            canvas.rotate(90.0f);
        } else if (i15 == 2) {
            canvas.rotate(180.0f, measuredWidth / 2, measuredHeight / 2);
        } else if (i15 == 3) {
            canvas.translate(0.0f, measuredHeight);
            canvas.rotate(270.0f);
        }
        this.mContainer.draw(canvas);
        return bitmapCreateBitmap;
    }

    public void setBackground(Drawable drawable) {
        this.mContainer.setBackgroundDrawable(drawable);
        if (drawable == null) {
            this.mContainer.setPadding(0, 0, 0, 0);
            return;
        }
        Rect rect = new Rect();
        drawable.getPadding(rect);
        this.mContainer.setPadding(rect.left, rect.top, rect.right, rect.bottom);
    }

    public void setColor(int i14) {
        this.mBackground.setColor(i14);
        setBackground(this.mBackground);
    }

    public void setContentPadding(int i14, int i15, int i16, int i17) {
        this.mContentView.setPadding(i14, i15, i16, i17);
    }

    public void setContentRotation(int i14) {
        this.mRotationLayout.setViewRotation(i14);
    }

    public void setContentView(View view2) {
        this.mRotationLayout.removeAllViews();
        this.mRotationLayout.addView(view2);
        this.mContentView = view2;
        View viewFindViewById = this.mRotationLayout.findViewById(R.id.amu_text);
        this.mTextView = viewFindViewById instanceof TextView ? (TextView) viewFindViewById : null;
    }

    public void setRotation(int i14) {
        this.mRotation = ((i14 + 360) % 360) / 90;
    }

    public void setStyle(int i14) {
        setColor(getStyleColor(i14));
        setTextAppearance(this.mContext, getTextStyle(i14));
    }

    public void setTextAppearance(Context context, int i14) {
        TextView textView = this.mTextView;
        if (textView != null) {
            textView.setTextAppearance(context, i14);
        }
    }

    public void setTextAppearance(int i14) {
        setTextAppearance(this.mContext, i14);
    }

    public Bitmap makeIcon(CharSequence charSequence) {
        TextView textView = this.mTextView;
        if (textView != null) {
            textView.setText(charSequence);
        }
        return makeIcon();
    }
}
