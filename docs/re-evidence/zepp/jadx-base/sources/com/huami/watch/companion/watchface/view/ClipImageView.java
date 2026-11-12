package com.huami.watch.companion.watchface.view;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatImageView;
import com.huami.watch.companion.R;

/* JADX INFO: loaded from: classes16.dex */
public class ClipImageView extends AppCompatImageView {
    private static ClipStart g = ClipStart.LEFTTOP;
    private ClipStart a;
    private Bitmap b;
    private int c;
    private int d;
    private int e;
    private int f;

    public enum ClipStart {
        LEFTTOP,
        LEFTBOTTOM,
        RIGHTTOP,
        RIGHTBOTTOM
    }

    public static /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[ClipStart.values().length];
            a = iArr;
            try {
                iArr[ClipStart.LEFTTOP.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[ClipStart.LEFTBOTTOM.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                a[ClipStart.RIGHTTOP.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                a[ClipStart.RIGHTBOTTOM.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    public ClipImageView(Context context) {
        this(context, null, 0);
    }

    public void initBitmap(int i) {
        if (i == 0) {
            return;
        }
        initBitmap(BitmapFactory.decodeResource(getResources(), i));
    }

    @Override // android.widget.ImageView, android.view.View
    public void onDraw(Canvas canvas) {
        int i;
        super.onDraw(canvas);
        if (this.b == null) {
            return;
        }
        int i2 = a.a[this.a.ordinal()];
        int i3 = 0;
        if (i2 == 1) {
            i = 0;
        } else if (i2 != 2) {
            if (i2 == 3) {
                i3 = this.e;
            } else if (i2 == 4) {
                i3 = this.e;
                i = this.f;
            }
            i = 0;
        } else {
            i = this.f;
        }
        canvas.drawBitmap(Bitmap.createBitmap(this.b, i3, i, this.e, this.f), 0.0f, 0.0f, (Paint) null);
    }

    @Override // android.widget.ImageView, android.view.View
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (this.b == null) {
            return;
        }
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        int mode2 = View.MeasureSpec.getMode(i2);
        int size2 = View.MeasureSpec.getSize(i2);
        if (mode == Integer.MIN_VALUE && mode2 == Integer.MIN_VALUE) {
            setMeasuredDimension(this.e, this.f);
        } else if (mode == Integer.MIN_VALUE) {
            setMeasuredDimension(this.e, size2);
        } else if (mode2 == Integer.MIN_VALUE) {
            setMeasuredDimension(size, this.f);
        }
    }

    @Override // androidx.appcompat.widget.AppCompatImageView, android.widget.ImageView
    public void setImageBitmap(Bitmap bitmap) {
        initBitmap(bitmap);
    }

    @Override // androidx.appcompat.widget.AppCompatImageView, android.widget.ImageView
    public void setImageResource(int i) {
        initBitmap(i);
    }

    public ClipImageView(Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public void initBitmap(Bitmap bitmap) {
        if (bitmap == null) {
            return;
        }
        this.b = bitmap;
        this.e = bitmap.getWidth() / this.d;
        this.f = this.b.getHeight() / this.c;
    }

    public ClipImageView(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.c = 1;
        this.d = 1;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.ClipImageView);
        if (typedArrayObtainStyledAttributes != null) {
            int resourceId = typedArrayObtainStyledAttributes.getResourceId(R.styleable.ClipImageView_src, 0);
            this.d = typedArrayObtainStyledAttributes.getInt(R.styleable.ClipImageView_divideWidth, 1);
            this.c = typedArrayObtainStyledAttributes.getInt(R.styleable.ClipImageView_divideHeight, 1);
            this.a = ClipStart.values()[typedArrayObtainStyledAttributes.getInt(R.styleable.ClipImageView_clipStart, g.ordinal())];
            typedArrayObtainStyledAttributes.recycle();
            initBitmap(resourceId);
        }
    }
}
