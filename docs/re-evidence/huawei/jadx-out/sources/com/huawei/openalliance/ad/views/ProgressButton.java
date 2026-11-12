package com.huawei.openalliance.ad.views;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import com.huawei.hms.ads.uiengine.common.IProgressButton;
import com.huawei.openalliance.ad.download.app.AppStatus;
import com.huawei.openalliance.ad.hw;
import com.huawei.openalliance.ad.utils.as;
import com.huawei.openalliance.ad.utils.dk;
import java.util.Locale;

/* JADX INFO: loaded from: classes12.dex */
public class ProgressButton extends View implements View.OnClickListener, IProgressButton {
    private Drawable A;
    private long B;
    private Paint C;
    private boolean D;
    private IProgressButton.ProgressButtonResetListener E;
    private int F;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected Rect f21074a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected Paint f21075b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected CharSequence f21076c;
    String d;
    int e;
    int f;
    protected Drawable g;
    protected final byte[] h;
    protected int i;
    protected int j;
    protected int k;
    protected boolean l;
    protected boolean m;
    protected int n;
    private final String o;
    private int p;
    private boolean q;
    private boolean r;
    private int s;
    private int t;
    private int u;
    private int v;
    private float w;
    private Float x;
    private int y;
    private int z;

    void a(float f, boolean z) {
    }

    @Override // com.huawei.hms.ads.uiengine.common.IProgressButton
    public int getCancelBtnHeight(int i) {
        return i;
    }

    @Override // com.huawei.hms.ads.uiengine.common.IProgressButton
    public View getProgressBtn() {
        return this;
    }

    @Override // com.huawei.hms.ads.uiengine.common.IProgressButton
    public AppStatus getStatus() {
        return null;
    }

    public void onClick(View view) {
    }

    @Override // android.view.View
    protected boolean verifyDrawable(Drawable drawable) {
        boolean z;
        synchronized (this.h) {
            z = drawable == this.g || super.verifyDrawable(drawable);
        }
        return z;
    }

    @Override // com.huawei.hms.ads.uiengine.common.IProgressButton
    public void updateLayoutHeight() {
        this.u = ((int) this.w) + getPaddingTop() + getPaddingBottom();
    }

    @Override // com.huawei.hms.ads.uiengine.common.IProgressButton
    public void setTextSize(float f) {
        this.w = f;
        setOriginTextSize(Float.valueOf(f));
        Paint paint = this.f21075b;
        if (paint != null) {
            paint.setAntiAlias(true);
            this.f21075b.setTextSize(this.w);
        }
        d();
    }

    @Override // com.huawei.hms.ads.uiengine.common.IProgressButton
    public void setTextInner(CharSequence charSequence, boolean z) {
        this.l = z;
        setText(charSequence);
    }

    public void setTextColor(int i) {
        this.v = i;
        Paint paint = this.f21075b;
        if (paint != null) {
            paint.setColor(i);
        }
    }

    @Override // com.huawei.hms.ads.uiengine.common.IProgressButton
    public void setText(CharSequence charSequence) {
        hw.a(this.o, "setText:%s, need safepadding: %s", charSequence, Boolean.valueOf(this.l));
        synchronized (this.h) {
            c();
            this.f21076c = String.valueOf(charSequence).toUpperCase(Locale.getDefault());
            Float f = this.x;
            float fA = a(this.f21076c, f != null ? f.floatValue() : this.w);
            if (!TextUtils.isEmpty(charSequence) && Math.abs(fA - this.w) >= 0.5f) {
                setTextSize(fA);
            }
            if (getWidth() > 0 || this.r) {
                a();
            } else {
                post(new Runnable() { // from class: com.huawei.openalliance.ad.views.ProgressButton.1
                    @Override // java.lang.Runnable
                    public void run() {
                        if (hw.a()) {
                            hw.a(ProgressButton.this.o, "view post, resetButtonSize");
                        }
                        ProgressButton.this.a();
                    }
                });
            }
            postInvalidate();
        }
    }

    @Override // com.huawei.hms.ads.uiengine.common.IProgressButton
    public void setShowCancelBtn(boolean z) {
        this.m = z;
    }

    @Override // com.huawei.hms.ads.uiengine.common.IProgressButton
    public void setResetWidth(boolean z) {
        this.r = z;
    }

    @Override // com.huawei.hms.ads.uiengine.common.IProgressButton
    public void setResetListener(IProgressButton.ProgressButtonResetListener progressButtonResetListener) {
        this.E = progressButtonResetListener;
    }

    @Override // com.huawei.hms.ads.uiengine.common.IProgressButton
    public void setProgressDrawable(Drawable drawable, int i) {
        boolean z;
        synchronized (this.h) {
            Drawable drawable2 = this.g;
            if (drawable2 == null || drawable == drawable2) {
                z = false;
            } else {
                drawable2.setCallback(null);
                this.g.setState(new int[0]);
                z = true;
            }
            if (drawable != null) {
                drawable.setCallback(this);
            }
            this.g = drawable;
            this.A = drawable;
            if (z) {
                a(getWidth(), getHeight());
                if (i < 0) {
                    i = 0;
                }
                int i2 = this.z;
                if (i > i2) {
                    i = i2;
                }
                this.y = i;
                a(i, false, false);
            } else {
                setProgress(i);
            }
        }
    }

    @Override // com.huawei.hms.ads.uiengine.common.IProgressButton
    public void setProgressDrawable(Drawable drawable) {
        setProgressDrawable(drawable, 0);
    }

    @Override // com.huawei.hms.ads.uiengine.common.IProgressButton
    public void setProgress(int i) {
        synchronized (this.h) {
            a(i, false);
        }
    }

    @Override // com.huawei.hms.ads.uiengine.common.IProgressButton
    public void setPaintTypeface(Typeface typeface, int i) {
        if (i <= 0) {
            this.f21075b.setFakeBoldText(false);
            this.f21075b.setTextSkewX(0.0f);
            setPaintTypeface(typeface);
        } else {
            Typeface typefaceDefaultFromStyle = typeface == null ? Typeface.defaultFromStyle(i) : Typeface.create(typeface, i);
            setPaintTypeface(typefaceDefaultFromStyle);
            int i2 = (~(typefaceDefaultFromStyle != null ? typefaceDefaultFromStyle.getStyle() : 0)) & i;
            this.f21075b.setFakeBoldText((i2 & 1) != 0);
            this.f21075b.setTextSkewX((i2 & 2) != 0 ? -0.25f : 0.0f);
        }
    }

    @Override // com.huawei.hms.ads.uiengine.common.IProgressButton
    public void setPaintTypeface(Typeface typeface) {
        synchronized (this.h) {
            this.f21075b.setTypeface(typeface);
        }
    }

    @Override // com.huawei.hms.ads.uiengine.common.IProgressButton
    public void setMinWidth(int i) {
        synchronized (this.h) {
            this.t = i;
        }
    }

    @Override // com.huawei.hms.ads.uiengine.common.IProgressButton
    public void setMaxWidth(int i) {
        synchronized (this.h) {
            this.s = i;
        }
    }

    @Override // com.huawei.hms.ads.uiengine.common.IProgressButton
    public void setMax(int i) {
        synchronized (this.h) {
            if (i < 0) {
                i = 0;
            }
            if (i != this.z) {
                this.z = i;
                postInvalidate();
                if (this.y > i) {
                    this.y = i;
                }
                b(this.y, false);
            }
        }
    }

    @Override // com.huawei.hms.ads.uiengine.common.IProgressButton
    public void setFontFamily(String str) {
        this.d = str;
        a(str, this.e, this.f);
    }

    @Override // com.huawei.hms.ads.uiengine.common.IProgressButton
    public void setFixedWidth(boolean z) {
        this.q = z;
    }

    @Override // com.huawei.hms.ads.uiengine.common.IProgressButton
    public void setCancelBtnHeight(int i) {
        this.n = i;
    }

    @Override // android.view.View
    protected void onSizeChanged(int i, int i2, int i3, int i4) {
        a(i, i2);
    }

    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        SavedState savedStateA;
        synchronized (this.h) {
            savedStateA = SavedState.a(super.onSaveInstanceState());
            savedStateA.f21079a = this.y;
        }
        return savedStateA;
    }

    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        try {
            SavedState savedState = (SavedState) parcelable;
            super.onRestoreInstanceState(savedState.getSuperState());
            setProgress(savedState.f21079a);
        } catch (ClassCastException unused) {
            hw.c("ProgressBtn", "onRestoreInstanceState ClassCastException");
        } catch (Throwable th) {
            hw.c("ProgressBtn", "onRestoreInstanceState err: %s", th.getClass().getSimpleName());
        }
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        synchronized (this.h) {
            super.onDraw(canvas);
            Drawable drawable = this.A;
            if (drawable != null) {
                drawable.draw(canvas);
            }
            if (a(drawable)) {
                canvas.scale(-1.0f, 1.0f, getWidth() / 2.0f, getHeight() / 2.0f);
            }
            a(canvas);
        }
    }

    @Override // android.view.View
    public void jumpDrawablesToCurrentState() {
        synchronized (this.h) {
            super.jumpDrawablesToCurrentState();
            Drawable drawable = this.g;
            if (drawable != null) {
                drawable.jumpToCurrentState();
            }
        }
    }

    @Override // com.huawei.hms.ads.uiengine.common.IProgressButton
    public boolean isFastClick() {
        if (System.currentTimeMillis() - this.B < 500) {
            return true;
        }
        this.B = System.currentTimeMillis();
        return false;
    }

    @Override // com.huawei.hms.ads.uiengine.common.IProgressButton
    public final void incrementProgressBy(int i) {
        synchronized (this.h) {
            setProgress(this.y + i);
        }
    }

    protected int getTextStart() {
        if (dk.h()) {
            return this.k;
        }
        int width = ((getWidth() - this.f21074a.width()) - this.i) / 2;
        int i = this.j;
        if (width < i) {
            width = i;
        }
        hw.a(this.o, "safeTextStart: %s", Integer.valueOf(width));
        return width;
    }

    public CharSequence getText() {
        CharSequence charSequence;
        synchronized (this.h) {
            charSequence = this.f21076c;
        }
        return charSequence;
    }

    @Override // com.huawei.hms.ads.uiengine.common.IProgressButton
    public Rect getPromptRect() {
        Rect rect;
        synchronized (this.h) {
            rect = this.f21074a;
        }
        return rect;
    }

    @Override // com.huawei.hms.ads.uiengine.common.IProgressButton
    public Drawable getProgressDrawable() {
        Drawable drawable;
        synchronized (this.h) {
            drawable = this.g;
        }
        return drawable;
    }

    @Override // com.huawei.hms.ads.uiengine.common.IProgressButton
    public int getProgress() {
        int i;
        synchronized (this.h) {
            i = this.y;
        }
        return i;
    }

    @Override // android.view.View
    protected void drawableStateChanged() {
        hw.a(this.o, "drawableStateChanged");
        super.drawableStateChanged();
        e();
    }

    protected void a(Canvas canvas) {
        Rect rect;
        synchronized (this.h) {
            CharSequence charSequence = this.f21076c;
            if (charSequence != null && charSequence.length() > 0) {
                if (this.f21075b != null && (rect = this.f21074a) != null && rect.width() <= 0) {
                    this.f21075b.getTextBounds(this.f21076c.toString(), 0, this.f21076c.length(), this.f21074a);
                }
                String strIntern = this.f21076c.toString().intern();
                int width = (getWidth() / 2) - this.f21074a.centerX();
                if (this.l && width < this.i) {
                    width = getTextStart();
                }
                canvas.drawText((CharSequence) strIntern, 0, strIntern.length(), width, (getHeight() / 2) - this.f21074a.centerY(), this.f21075b);
            }
        }
    }

    void a(int i, boolean z) {
        synchronized (this.h) {
            if (i < 0) {
                i = 0;
            }
            int i2 = this.z;
            if (i > i2) {
                i = i2;
            }
            if (i != this.y) {
                this.y = i;
                b(i, z);
            }
        }
    }

    protected void a(int i, int i2) {
        synchronized (this.h) {
            Drawable drawable = this.g;
            if (drawable != null) {
                drawable.setBounds(0, 0, i, i2);
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:27:0x007d A[Catch: all -> 0x0086, TryCatch #0 {, blocks: (B:4:0x0003, B:6:0x0007, B:9:0x000f, B:12:0x004e, B:14:0x0052, B:15:0x0054, B:17:0x0058, B:18:0x0067, B:20:0x006b, B:24:0x0076, B:25:0x0079, B:27:0x007d, B:21:0x006f, B:23:0x0073, B:28:0x0084), top: B:33:0x0003 }] */
    protected void a() {
        IProgressButton.ProgressButtonResetListener progressButtonResetListener;
        synchronized (this.h) {
            CharSequence charSequence = this.f21076c;
            if (charSequence != null && charSequence.length() != 0) {
                this.f21075b.getTextBounds(this.f21076c.toString(), 0, this.f21076c.length(), this.f21074a);
                int iA = a(getPaddingStart(), getPaddingLeft(), this.j);
                int iWidth = this.f21074a.width() + iA + a(getPaddingEnd(), getPaddingRight(), this.k);
                ViewGroup.LayoutParams layoutParams = getLayoutParams();
                if (layoutParams != null) {
                    int i = this.u;
                    if (i > 0) {
                        layoutParams.height = i;
                    }
                    if (layoutParams.height <= 0) {
                        layoutParams.height = ((int) this.w) + getPaddingTop() + getPaddingBottom();
                    }
                    if (this.q) {
                        b(iWidth, layoutParams);
                    } else if (iWidth != layoutParams.width) {
                        a(iWidth, layoutParams);
                    } else {
                        progressButtonResetListener = this.E;
                        if (progressButtonResetListener != null) {
                            progressButtonResetListener.onSizeReset(layoutParams.width, layoutParams.height);
                        }
                    }
                    setLayoutParams(layoutParams);
                    progressButtonResetListener = this.E;
                    if (progressButtonResetListener != null) {
                        progressButtonResetListener.onSizeReset(layoutParams.width, layoutParams.height);
                    }
                }
            }
        }
    }

    private void setOriginTextSize(Float f) {
        if (f != null) {
            Float f2 = this.x;
            if (f2 == null || f2.floatValue() == 0.0f) {
                this.x = f;
            }
        }
    }

    private int getPaddingSize() {
        return a(getPaddingStart(), getPaddingLeft(), this.j) + a(getPaddingEnd(), getPaddingRight(), this.k);
    }

    private int getButtonSize() {
        if (!this.q) {
            return this.s;
        }
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        int width = getWidth();
        return width <= 0 ? layoutParams.width : width;
    }

    private void e() {
        synchronized (this.h) {
            int[] drawableState = getDrawableState();
            Drawable drawable = this.g;
            if (drawable != null && drawable.isStateful()) {
                this.g.setState(drawableState);
            }
        }
    }

    private void d() {
        Paint paint = new Paint();
        paint.setTextSize(this.w);
        Rect rect = new Rect();
        paint.getTextBounds("...", 0, 3, rect);
        this.p = rect.width();
    }

    private void c() {
        if (this.l) {
            int measuredHeight = this.u;
            if (measuredHeight <= 0) {
                measuredHeight = getMeasuredHeight();
            }
            if (measuredHeight <= 0) {
                return;
            }
            boolean z = measuredHeight < this.F;
            this.i = as.a(getContext(), z ? 24 : 36);
            this.j = as.a(getContext(), z ? 8 : 16);
            int iA = (measuredHeight / 2) + (as.a(getContext(), 12) / 2) + as.a(getContext(), z ? 4 : 8);
            this.k = iA;
            hw.a(this.o, "update text safe padding, start: %s, end: %s", Integer.valueOf(this.j), Integer.valueOf(iA));
        }
    }

    private void b(int i, boolean z) {
        synchronized (this.h) {
            a(i, z, true);
        }
    }

    private void b(int i, ViewGroup.LayoutParams layoutParams) {
        int width = getWidth();
        if (width <= 0 && this.r) {
            width = layoutParams.width;
        }
        if (i > width && width > 0) {
            CharSequence charSequenceA = a(this.f21076c, i, width);
            this.f21076c = charSequenceA;
            this.f21075b.getTextBounds(charSequenceA.toString(), 0, this.f21076c.length(), this.f21074a);
        } else {
            if (width > 0 || !this.r) {
                return;
            }
            layoutParams.width = i;
        }
    }

    private void b() {
        Paint paint = new Paint();
        this.f21075b = paint;
        paint.setAntiAlias(true);
        this.f21075b.setTextSize(this.w);
        this.f21075b.setColor(this.v);
        Paint paint2 = new Paint();
        this.C = paint2;
        paint2.setTextSize(this.w);
        int i = this.f;
        if (i != -1) {
            this.d = null;
        }
        a(this.d, this.e, i);
        setClickable(true);
        Paint paint3 = new Paint();
        paint3.setTextSize(this.w);
        Rect rect = new Rect();
        paint3.getTextBounds("...", 0, 3, rect);
        this.p = rect.width();
        this.D = dk.h();
        this.F = as.a(getContext(), 40.0f);
    }

    private boolean a(CharSequence charSequence, int i, int i2, int i3) {
        float fC = as.c(getContext(), i);
        hw.a(this.o, "currentSize:%s", Float.valueOf(fC));
        hw.a(this.o, "buttonSize:%s", Integer.valueOf(i3));
        if (i3 < 0) {
            return true;
        }
        this.C.setTextSize(fC);
        this.C.getTextBounds(charSequence.toString(), 0, charSequence.length(), this.f21074a);
        int iWidth = this.f21074a.width() + i2;
        hw.a(this.o, "textWidth:%s, btnWidth:%s", Integer.valueOf(iWidth), Integer.valueOf(i3));
        return iWidth <= i3;
    }

    private boolean a(Drawable drawable) {
        Drawable drawableFindDrawableByLayerId;
        if (drawable == null || !(drawable instanceof LayerDrawable) || (drawableFindDrawableByLayerId = ((LayerDrawable) drawable).findDrawableByLayerId(R.id.progress)) == null) {
            return false;
        }
        if ((drawableFindDrawableByLayerId instanceof PPSFlickerDrawable) || (drawableFindDrawableByLayerId instanceof q)) {
            return this.D;
        }
        return false;
    }

    private void a(String str, int i, int i2) {
        Typeface typefaceCreate;
        hw.a(this.o, "setTypefaceFromAttrs");
        if (str != null) {
            typefaceCreate = Typeface.create(str, i2);
            if (typefaceCreate != null) {
                hw.a(this.o, "setTypeface");
                setPaintTypeface(typefaceCreate);
                this.f21075b.setTypeface(typefaceCreate);
                return;
            }
        } else {
            typefaceCreate = null;
        }
        if (i == 1) {
            typefaceCreate = Typeface.SANS_SERIF;
        } else if (i == 2) {
            typefaceCreate = Typeface.SERIF;
        } else if (i == 3) {
            typefaceCreate = Typeface.MONOSPACE;
        }
        setPaintTypeface(typefaceCreate, i2);
    }

    /* JADX WARN: Code duplicated, block: B:24:0x00b3 A[Catch: all -> 0x00d0, TryCatch #0 {, blocks: (B:5:0x0005, B:22:0x00ac, B:24:0x00b3, B:25:0x00c3, B:26:0x00c6, B:13:0x0048, B:29:0x00ca, B:30:0x00cd, B:31:0x00ce, B:7:0x0011, B:11:0x0033, B:14:0x004b, B:18:0x009f, B:19:0x00a3, B:20:0x00a7), top: B:36:0x0005, inners: #2, #4, #5 }] */
    private void a(Context context, AttributeSet attributeSet) {
        String str;
        String str2;
        synchronized (this.h) {
            if (attributeSet != null) {
                TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, com.huawei.openalliance.ad.R.styleable.hiad_progress_button);
                TypedArray typedArrayObtainStyledAttributes2 = null;
                try {
                    typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, new int[]{R.attr.layout_height});
                    int dimensionPixelSize = typedArrayObtainStyledAttributes2.getDimensionPixelSize(0, -2);
                    this.u = dimensionPixelSize;
                    hw.a(this.o, "layoutHeight: %s", Integer.valueOf(dimensionPixelSize));
                    if (typedArrayObtainStyledAttributes2 != null) {
                        typedArrayObtainStyledAttributes2.recycle();
                    }
                } catch (Throwable th) {
                    try {
                        hw.c(this.o, "get layout height ex: %s", th.getClass().getSimpleName());
                        if (typedArrayObtainStyledAttributes2 != null) {
                        }
                        try {
                            this.q = typedArrayObtainStyledAttributes.getBoolean(com.huawei.openalliance.ad.R.styleable.hiad_progress_button_hiad_fixedWidth, false);
                            this.r = typedArrayObtainStyledAttributes.getBoolean(com.huawei.openalliance.ad.R.styleable.hiad_progress_button_hiad_resetWidth, true);
                            this.s = typedArrayObtainStyledAttributes.getDimensionPixelSize(com.huawei.openalliance.ad.R.styleable.hiad_progress_button_hiad_maxWidth, 0);
                            this.t = typedArrayObtainStyledAttributes.getDimensionPixelSize(com.huawei.openalliance.ad.R.styleable.hiad_progress_button_hiad_minWidth, 0);
                            float dimension = typedArrayObtainStyledAttributes.getDimension(com.huawei.openalliance.ad.R.styleable.hiad_progress_button_hiad_textSize, 0.0f);
                            this.w = dimension;
                            setOriginTextSize(Float.valueOf(dimension));
                            this.v = typedArrayObtainStyledAttributes.getColor(com.huawei.openalliance.ad.R.styleable.hiad_progress_button_hiad_textColor, -1);
                            this.d = typedArrayObtainStyledAttributes.getString(com.huawei.openalliance.ad.R.styleable.hiad_progress_button_hiad_fontFamily);
                            this.f = typedArrayObtainStyledAttributes.getInt(com.huawei.openalliance.ad.R.styleable.hiad_progress_button_hiad_styleIndex, -1);
                            this.e = typedArrayObtainStyledAttributes.getInt(com.huawei.openalliance.ad.R.styleable.hiad_progress_button_hiad_typefaceIndex, -1);
                        } catch (RuntimeException unused) {
                            str = this.o;
                            str2 = "initButtonAttr RuntimeException";
                            hw.c(str, str2);
                        } catch (Exception unused2) {
                            str = this.o;
                            str2 = "initButtonAttr error";
                            hw.c(str, str2);
                        }
                        typedArrayObtainStyledAttributes.recycle();
                        if (this.u <= 0) {
                            this.u = ((int) this.w) + getPaddingTop() + getPaddingBottom();
                        }
                    } catch (Throwable th2) {
                        if (typedArrayObtainStyledAttributes2 != null) {
                            typedArrayObtainStyledAttributes2.recycle();
                        }
                        throw th2;
                    }
                }
                try {
                    this.q = typedArrayObtainStyledAttributes.getBoolean(com.huawei.openalliance.ad.R.styleable.hiad_progress_button_hiad_fixedWidth, false);
                    this.r = typedArrayObtainStyledAttributes.getBoolean(com.huawei.openalliance.ad.R.styleable.hiad_progress_button_hiad_resetWidth, true);
                    this.s = typedArrayObtainStyledAttributes.getDimensionPixelSize(com.huawei.openalliance.ad.R.styleable.hiad_progress_button_hiad_maxWidth, 0);
                    this.t = typedArrayObtainStyledAttributes.getDimensionPixelSize(com.huawei.openalliance.ad.R.styleable.hiad_progress_button_hiad_minWidth, 0);
                    float dimension2 = typedArrayObtainStyledAttributes.getDimension(com.huawei.openalliance.ad.R.styleable.hiad_progress_button_hiad_textSize, 0.0f);
                    this.w = dimension2;
                    setOriginTextSize(Float.valueOf(dimension2));
                    this.v = typedArrayObtainStyledAttributes.getColor(com.huawei.openalliance.ad.R.styleable.hiad_progress_button_hiad_textColor, -1);
                    this.d = typedArrayObtainStyledAttributes.getString(com.huawei.openalliance.ad.R.styleable.hiad_progress_button_hiad_fontFamily);
                    this.f = typedArrayObtainStyledAttributes.getInt(com.huawei.openalliance.ad.R.styleable.hiad_progress_button_hiad_styleIndex, -1);
                    this.e = typedArrayObtainStyledAttributes.getInt(com.huawei.openalliance.ad.R.styleable.hiad_progress_button_hiad_typefaceIndex, -1);
                    typedArrayObtainStyledAttributes.recycle();
                    if (this.u <= 0) {
                        this.u = ((int) this.w) + getPaddingTop() + getPaddingBottom();
                    }
                } catch (Throwable th3) {
                    typedArrayObtainStyledAttributes.recycle();
                    throw th3;
                }
            }
        }
    }

    private void a(int i, boolean z, boolean z2) {
        synchronized (this.h) {
            int i2 = this.z;
            float f = i2 > 0 ? i / i2 : 0.0f;
            Drawable drawable = this.A;
            if (drawable != null) {
                drawable.setLevel((int) (10000.0f * f));
            } else {
                invalidate();
            }
            if (z2) {
                a(f, z);
            }
        }
    }

    private void a(int i, ViewGroup.LayoutParams layoutParams) {
        int i2 = this.s;
        if (i <= i2 || i2 <= 0) {
            int i3 = this.t;
            if (i < i3) {
                i = i3;
            }
        } else {
            CharSequence charSequenceA = a(this.f21076c, i, i2);
            this.f21076c = charSequenceA;
            this.f21075b.getTextBounds(charSequenceA.toString(), 0, this.f21076c.length(), this.f21074a);
            i = this.s;
        }
        layoutParams.width = i;
    }

    public static final class SavedState extends View.BaseSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new Parcelable.Creator<SavedState>() { // from class: com.huawei.openalliance.ad.views.ProgressButton.SavedState.1
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public SavedState[] newArray(int i) {
                return new SavedState[i];
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public SavedState createFromParcel(Parcel parcel) {
                return new SavedState(parcel);
            }
        };

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static SavedState f21078b;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f21079a;

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.f21079a);
        }

        public static SavedState a(Parcelable parcelable) {
            if (f21078b == null) {
                f21078b = new SavedState(parcelable);
            }
            return f21078b;
        }

        private SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        private SavedState(Parcel parcel) {
            super(parcel);
            this.f21079a = parcel.readInt();
        }
    }

    private CharSequence a(CharSequence charSequence, int i, int i2) {
        int length = getText().length();
        int iCeil = (int) Math.ceil((((double) (i - i2)) / ((double) getPromptRect().width())) * ((double) length));
        int iCeil2 = (int) Math.ceil(((double) (this.p * length)) / ((double) getPromptRect().width()));
        int i3 = length - iCeil;
        if (i3 - iCeil2 <= 0) {
            return i3 > 0 ? charSequence.toString().substring(0, i3) : charSequence;
        }
        return charSequence.toString().substring(0, length - (iCeil + iCeil2)) + "...";
    }

    private int a(int i, int i2, int i3) {
        if (i <= 0) {
            i = i2;
        }
        return (!this.l || i3 <= 0 || i >= i3) ? i : i3;
    }

    private float a(CharSequence charSequence, float f) {
        hw.a(this.o, "startSize:%s", Float.valueOf(f));
        int paddingSize = getPaddingSize();
        int buttonSize = getButtonSize();
        int iD = as.d(getContext(), f);
        while (iD > 9 && !a(charSequence, iD, paddingSize, buttonSize)) {
            iD--;
        }
        float fC = as.c(getContext(), iD);
        hw.a(this.o, "resultSize:%s", Float.valueOf(fC));
        return fC;
    }

    public ProgressButton(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i);
        this.o = "ProgressBtn_" + hashCode();
        this.f21074a = new Rect();
        this.q = false;
        this.r = true;
        this.v = -1;
        this.w = 12.0f;
        this.x = null;
        this.d = null;
        this.e = -1;
        this.f = -1;
        this.y = 0;
        this.z = 100;
        this.h = new byte[0];
        this.l = false;
        setOnClickListener(this);
        a(context, attributeSet);
        b();
    }

    public ProgressButton(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0);
        a(context, attributeSet);
        b();
    }

    public ProgressButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.progressBarStyle);
        a(context, attributeSet);
        b();
    }

    public ProgressButton(Context context) {
        this(context, null);
        b();
    }
}
