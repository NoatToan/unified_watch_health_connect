package com.huawei.ui.main.stories.me.views;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.util.AttributeSet;
import android.widget.ImageView;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.ui.main.R;
import java.util.Locale;

/* JADX INFO: loaded from: classes43.dex */
public class CircleImageView extends ImageView {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final ImageView.ScaleType f28540b = ImageView.ScaleType.CENTER_CROP;
    private static final Bitmap.Config e = Bitmap.Config.ARGB_8888;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Bitmap f28541a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f28542c;
    private ColorFilter d;
    private final RectF f;
    private final Paint g;
    private float h;
    private BitmapShader i;
    private int j;
    private int k;
    private final RectF l;
    private float m;
    private final Paint n;
    private int o;
    private final Matrix p;
    private boolean r;
    private boolean s;

    public CircleImageView(Context context) {
        super(context);
        this.l = new RectF();
        this.f = new RectF();
        this.p = new Matrix();
        this.n = new Paint();
        this.g = new Paint();
        this.o = -3355444;
        this.k = 6;
        b();
    }

    public CircleImageView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public CircleImageView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.l = new RectF();
        this.f = new RectF();
        this.p = new Matrix();
        this.n = new Paint();
        this.g = new Paint();
        this.o = -3355444;
        this.k = 6;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.CircleImageView, i, 0);
        if (typedArrayObtainStyledAttributes == null) {
            LogUtil.j("CircleImageView", "Return for null.");
            return;
        }
        this.k = typedArrayObtainStyledAttributes.getDimensionPixelSize(R.styleable.CircleImageView_BorderWidth, 6);
        this.o = typedArrayObtainStyledAttributes.getColor(R.styleable.CircleImageView_BorderColor, -3355444);
        typedArrayObtainStyledAttributes.recycle();
        b();
    }

    public int getBorderWidth() {
        return this.k;
    }

    public void setBorderWidth(int i) {
        if (i == this.k) {
            return;
        }
        this.k = i;
        e();
    }

    @Override // android.widget.ImageView
    public ImageView.ScaleType getScaleType() {
        return f28540b;
    }

    @Override // android.widget.ImageView
    public void setScaleType(ImageView.ScaleType scaleType) {
        if (scaleType == null) {
            LogUtil.j("CircleImageView", "scaleType is null");
        } else {
            if (scaleType == f28540b) {
                return;
            }
            LogUtil.d("CircleImageView", "setScaleType not supported = ", scaleType);
            throw new IllegalArgumentException(String.format(Locale.ENGLISH, "ScaleType %s not supported.", scaleType));
        }
    }

    @Override // android.widget.ImageView
    public void setAdjustViewBounds(boolean z) {
        if (z) {
            LogUtil.d("CircleImageView", "adjustViewBounds not supported.");
            throw new IllegalArgumentException("adjustViewBounds not supported.");
        }
    }

    @Override // android.widget.ImageView, android.view.View
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (getDrawable() == null) {
            return;
        }
        float width = getWidth() / 2;
        float height = getHeight() / 2;
        canvas.drawCircle(width, height, this.m, this.n);
        if (this.k != 0) {
            canvas.drawCircle(width, height, this.h, this.g);
        }
    }

    @Override // android.view.View
    protected void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        e();
    }

    @Override // android.widget.ImageView
    public void setImageResource(int i) {
        super.setImageResource(i);
        this.f28541a = d(getDrawable());
        e();
    }

    @Override // android.widget.ImageView
    public void setImageURI(Uri uri) {
        if (uri == null) {
            LogUtil.j("CircleImageView", "uri is null");
            return;
        }
        super.setImageURI(uri);
        this.f28541a = d(getDrawable());
        e();
    }

    @Override // android.widget.ImageView
    public void setImageBitmap(Bitmap bitmap) {
        if (bitmap == null) {
            LogUtil.j("CircleImageView", "bitmap is null");
            return;
        }
        super.setImageBitmap(bitmap);
        this.f28541a = bitmap;
        e();
    }

    @Override // android.widget.ImageView
    public void setImageDrawable(Drawable drawable) {
        if (drawable == null) {
            LogUtil.j("CircleImageView", "drawable is null");
            return;
        }
        super.setImageDrawable(drawable);
        this.f28541a = d(drawable);
        e();
    }

    @Override // android.widget.ImageView
    public void setColorFilter(ColorFilter colorFilter) {
        Paint paint;
        if (colorFilter == null) {
            LogUtil.j("CircleImageView", "drawable is null");
        } else {
            if (colorFilter == this.d || (paint = this.n) == null) {
                return;
            }
            this.d = colorFilter;
            paint.setColorFilter(colorFilter);
            invalidate();
        }
    }

    private void b() {
        super.setScaleType(f28540b);
        this.r = true;
        if (this.s) {
            e();
            this.s = false;
        }
    }

    private void e() {
        if (!this.r) {
            this.s = true;
            return;
        }
        if (this.f28541a == null) {
            return;
        }
        this.i = new BitmapShader(this.f28541a, Shader.TileMode.CLAMP, Shader.TileMode.CLAMP);
        this.n.setAntiAlias(true);
        this.n.setShader(this.i);
        this.g.setStyle(Paint.Style.STROKE);
        this.g.setAntiAlias(true);
        this.g.setColor(this.o);
        this.g.setStrokeWidth(this.k);
        this.f28542c = this.f28541a.getHeight();
        this.j = this.f28541a.getWidth();
        this.f.set(0.0f, 0.0f, getWidth(), getHeight());
        this.h = Math.min((this.f.height() - this.k) / 2.0f, (this.f.width() - this.k) / 2.0f);
        RectF rectF = this.l;
        float f = this.k;
        rectF.set(f, f, this.f.width() - this.k, this.f.height() - this.k);
        this.m = Math.min(this.l.height() / 2.0f, this.l.width() / 2.0f);
        a();
        invalidate();
    }

    private Bitmap d(Drawable drawable) {
        Bitmap bitmapCreateBitmap;
        if (drawable == null) {
            return null;
        }
        if (drawable instanceof BitmapDrawable) {
            return ((BitmapDrawable) drawable).getBitmap();
        }
        try {
            if (drawable instanceof ColorDrawable) {
                bitmapCreateBitmap = Bitmap.createBitmap(2, 2, e);
            } else {
                bitmapCreateBitmap = Bitmap.createBitmap(drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight(), e);
            }
            Canvas canvas = new Canvas(bitmapCreateBitmap);
            drawable.setBounds(0, 0, canvas.getWidth(), canvas.getHeight());
            drawable.draw(canvas);
            return bitmapCreateBitmap;
        } catch (OutOfMemoryError e2) {
            LogUtil.d("CircleImageView", "OutOfMemoryError = ", e2.getMessage());
            return null;
        }
    }

    private void a() {
        float fWidth;
        float fHeight;
        this.p.set(null);
        float fWidth2 = 0.0f;
        if (this.j * this.l.height() > this.l.width() * this.f28542c) {
            fWidth = this.l.height() / this.f28542c;
            fHeight = 0.0f;
            fWidth2 = (this.l.width() - (this.j * fWidth)) * 0.5f;
        } else {
            fWidth = this.l.width() / this.j;
            fHeight = (this.l.height() - (this.f28542c * fWidth)) * 0.5f;
        }
        this.p.setScale(fWidth, fWidth);
        Matrix matrix = this.p;
        int i = this.k;
        matrix.postTranslate(((int) (fWidth2 + 0.5f)) + i, ((int) (fHeight + 0.5f)) + i);
        this.i.setLocalMatrix(this.p);
    }
}
