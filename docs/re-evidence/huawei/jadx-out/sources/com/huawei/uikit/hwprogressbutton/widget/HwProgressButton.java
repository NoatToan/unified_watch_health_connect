package com.huawei.uikit.hwprogressbutton.widget;

import android.R;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.drawable.ClipDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ProgressBar;
import androidx.core.content.ContextCompat;
import androidx.core.graphics.drawable.DrawableCompat;
import com.huawei.uikit.hwprogressbar.widget.HwProgressBar;
import com.huawei.uikit.hwtextview.widget.HwTextView;
import defpackage.xcv;
import defpackage.xcy;
import defpackage.xeh;
import defpackage.xfs;
import defpackage.xfu;
import java.lang.reflect.Method;
import java.math.RoundingMode;
import java.text.NumberFormat;
import java.util.Locale;

/* JADX INFO: loaded from: classes20.dex */
public class HwProgressButton extends FrameLayout {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static Method f29520b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final int f29521c = a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private HwTextView f29522a;
    private int d;
    private HwProgressBar e;
    private ColorStateList f;
    private Drawable g;
    private Drawable h;
    private ColorStateList i;
    private String j;
    private boolean k;
    private LayerDrawable l;
    private Locale m;
    private float n;
    private Drawable o;
    private float p;
    private float q;
    private float r;
    private float s;
    private int t;
    private Context w;
    private ObjectAnimator x;
    private int y;

    class a implements HwProgressBar.OnVisualProgressChangedListener {
        a() {
        }

        @Override // com.huawei.uikit.hwprogressbar.widget.HwProgressBar.OnVisualProgressChangedListener
        public void onVisualProgressChanged(HwProgressBar hwProgressBar, float f) {
            HwProgressButton.this.y = (int) (((double) f) * 100.0d);
            HwProgressButton hwProgressButton = HwProgressButton.this;
            hwProgressButton.setPercentage(hwProgressButton.y);
        }
    }

    static class aauaf extends View.BaseSavedState {
        public static final Parcelable.Creator<aauaf> CREATOR = new e();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f29524a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        int f29525b;

        class e implements Parcelable.Creator<aauaf> {
            e() {
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
            public aauaf createFromParcel(Parcel parcel) {
                return new aauaf(parcel, null);
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
            public aauaf[] newArray(int i) {
                return new aauaf[i];
            }
        }

        /* synthetic */ aauaf(Parcel parcel, a aVar) {
            this(parcel);
        }

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            if (parcel == null) {
                Log.w("HwProgressButton", "writeToParcel, parcel is null");
                return;
            }
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.f29524a);
            parcel.writeInt(this.f29525b);
        }

        aauaf(Parcelable parcelable) {
            super(parcelable);
        }

        private aauaf(Parcel parcel) {
            super(parcel);
            this.f29524a = parcel.readInt();
            this.f29525b = parcel.readInt();
        }
    }

    public HwProgressButton(Context context) {
        this(context, null);
    }

    protected static int a() {
        if (f29520b == null) {
            f29520b = xeh.c("getInt", new Class[]{String.class, Integer.TYPE}, "android.os.SystemProperties");
        }
        Method method = f29520b;
        if (method == null) {
            return 200;
        }
        Object objC = xeh.c((Object) null, method, new Object[]{"hw_sc.platform.ux_level", 200});
        if (objC instanceof Integer) {
            return ((Integer) objC).intValue();
        }
        return 200;
    }

    private int getCurSdkVersion() {
        return Build.VERSION.SDK_INT;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPercentage(int i) {
        HwTextView hwTextView = this.f29522a;
        if (hwTextView == null) {
            Log.w("HwProgressButton", "setPercentage, mPercentage is null");
            return;
        }
        if (this.d == 2) {
            hwTextView.setText(this.j);
            return;
        }
        if (this.x != null) {
            i = this.y;
        }
        e();
        this.f29522a.setText(String.format(Locale.ROOT, "%2d", Integer.valueOf(i)) + "%");
    }

    private void setPercentageTextColor(ColorStateList colorStateList) {
        HwTextView hwTextView = this.f29522a;
        if (hwTextView == null || colorStateList == null) {
            return;
        }
        hwTextView.setTextColor(colorStateList);
    }

    public void a(int i) {
        if (this.e == null) {
            Log.w("HwProgressButton", "incrementProgressBy, mProgressBar is null");
            return;
        }
        if (this.d != 1) {
            setState(1);
            this.e.setBackground(null);
            c();
            setPercentageTextColor(this.i);
        }
        this.e.incrementProgressBy(i);
        setPercentage(this.e.getProgress());
    }

    public void b() {
        this.e.setBackground(null);
        if (this.k) {
            if (this.l == null) {
                c(getContext());
            }
            this.e.setProgressDrawable(this.l);
        } else {
            Drawable drawable = this.h;
            if (drawable == null || drawable.getConstantState() == null) {
                this.e.setProgressDrawable(this.h);
            } else {
                this.e.setProgressDrawable(this.h.getConstantState().newDrawable());
            }
        }
        setPercentageTextColor(this.f);
        setState(0);
    }

    protected void b(Canvas canvas) {
        Log.w("HwProgressButton", "Do nothing.");
    }

    protected Drawable c(int i) {
        Drawable drawable = ContextCompat.getDrawable(getContext(), i);
        if (f29521c >= 200) {
            d(drawable);
        }
        return drawable;
    }

    protected void c() {
        HwProgressBar hwProgressBar = this.e;
        if (hwProgressBar == null) {
            Log.w("HwProgressButton", "incrementProgressBy, mProgressBar is null");
        } else {
            hwProgressBar.setProgressDrawable(this.g);
        }
    }

    public void d() {
        setState(2);
        setPercentage(this.e.getProgress());
        j();
    }

    protected void d(Drawable drawable) {
        if (Build.VERSION.SDK_INT < 29 || !xfu.c(this.w) || Float.compare(xfu.d(this.w), 1.75f) < 0) {
            if (!(drawable instanceof LayerDrawable)) {
                Log.e("HwProgressButton", "drawable is not LayerDrawable");
                return;
            }
            LayerDrawable layerDrawable = (LayerDrawable) drawable;
            Drawable drawableFindDrawableByLayerId = layerDrawable.findDrawableByLayerId(R.id.progress);
            if (drawableFindDrawableByLayerId instanceof ClipDrawable) {
                xcy xcyVar = new xcy(drawableFindDrawableByLayerId, 0, 1);
                drawable.mutate();
                layerDrawable.setDrawableByLayerId(R.id.progress, xcyVar);
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        e(canvas);
    }

    public float getCornerRadius() {
        return this.p;
    }

    public Drawable getFocusedDrawable() {
        return this.o;
    }

    public int getFocusedPathColor() {
        return this.t;
    }

    public float getFocusedPathPadding() {
        return this.s;
    }

    public float getFocusedPathWidth() {
        return this.q;
    }

    public HwTextView getPercentage() {
        return this.f29522a;
    }

    public int getProgress() {
        return this.e.getProgress();
    }

    public ProgressBar getProgressBar() {
        return this.e;
    }

    public Drawable getProgressBarBackgroundDrawable() {
        return this.g;
    }

    public Drawable getProgressButtonBackgroundDrawable() {
        return this.h;
    }

    public int getState() {
        return this.d;
    }

    @Override // android.view.View
    protected void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        e();
    }

    @Override // android.view.View
    public void onHoverChanged(boolean z) {
        super.onHoverChanged(z);
        if (this.n == 1.0f) {
            return;
        }
        e(z);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 1073741824), i2);
    }

    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        HwProgressBar hwProgressBar;
        if (!(parcelable instanceof aauaf)) {
            Log.w("HwProgressButton", "onRestoreInstanceState: state = " + parcelable);
            return;
        }
        aauaf aauafVar = (aauaf) parcelable;
        super.onRestoreInstanceState(aauafVar.getSuperState());
        setState(aauafVar.f29525b);
        if (this.d != 0 && (hwProgressBar = this.e) != null) {
            hwProgressBar.setProgressDrawable(c(com.huawei.uikit.hwprogressbutton.R.drawable.hwprogressbutton_progressbar_normal_layer));
            setProgress(aauafVar.f29524a);
            setPercentage(aauafVar.f29524a);
            setPercentageTextColor(this.i);
            return;
        }
        Log.w("HwProgressButton", "onRestoreInstanceState mState = " + this.d + " , mProgressBar = " + this.e);
    }

    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        aauaf aauafVar = new aauaf(super.onSaveInstanceState());
        aauafVar.f29524a = this.e.getProgress();
        aauafVar.f29525b = this.d;
        return aauafVar;
    }

    public void setCornerRadius(float f) {
        this.p = f;
    }

    @Override // android.view.View
    public void setEnabled(boolean z) {
        super.setEnabled(z);
        if (z) {
            this.e.setAlpha(1.0f);
            this.f29522a.setAlpha(1.0f);
        } else {
            this.e.setAlpha(this.r);
            this.f29522a.setAlpha(this.r);
        }
    }

    public void setFocusedDrawable(Drawable drawable) {
        this.o = drawable;
    }

    public void setFocusedPathColor(int i) {
        this.t = i;
    }

    public void setFocusedPathPadding(float f) {
        this.s = f;
    }

    public void setFocusedPathWidth(float f) {
        this.q = f;
    }

    public void setHwProgressButtonTextColor(ColorStateList colorStateList) {
        Log.w("HwProgressButton", "Do nothing.");
    }

    public void setIdleText(String str) {
        if (str == null) {
            Log.w("HwProgressButton", "setIdleText, idleText is null");
        } else {
            if (this.d == 0) {
                this.f29522a.setText(str);
                return;
            }
            Log.w("HwProgressButton", "setIdleText, mState = " + this.d);
        }
    }

    public void setPauseText(String str) {
        if (str == null) {
            Log.w("HwProgressButton", "setPauseText, pauseText is null");
        } else {
            this.j = str;
        }
    }

    public void setProgress(int i) {
        this.e.setProgress(i);
    }

    public void setProgressBarBackgroundDrawable(Drawable drawable) {
        this.g = drawable;
        if (f29521c >= 200) {
            d(drawable);
        }
    }

    public void setProgressButtonBackgroundDrawable(Drawable drawable) {
        this.h = drawable;
        HwProgressBar hwProgressBar = this.e;
        if (hwProgressBar != null) {
            hwProgressBar.setProgressDrawable(drawable);
        }
    }

    protected void setState(int i) {
        if (this.d == i) {
            return;
        }
        if (i >= 0 && i <= 2) {
            this.d = i;
            return;
        }
        Log.w("HwProgressButton", "setState: invalid state: " + i);
    }

    public HwProgressButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, com.huawei.uikit.hwprogressbutton.R.attr.hwProgressButtonStyle);
    }

    private void h() {
        if (isEnabled()) {
            return;
        }
        this.e.setAlpha(this.r);
        this.f29522a.setAlpha(this.r);
    }

    private void j() {
        Object objC = xeh.c(this.e, "mVisualProgressUpdateAnimator", (Class<?>) HwProgressBar.class);
        if (objC instanceof ObjectAnimator) {
            this.x = (ObjectAnimator) objC;
        }
        Object objC2 = xeh.c(this.e, "mVisualProgress", (Class<?>) HwProgressBar.class);
        int iFloatValue = objC2 instanceof Float ? (int) (((double) ((Float) objC2).floatValue()) * 100.0d) : 0;
        ObjectAnimator objectAnimator = this.x;
        if (objectAnimator == null || !objectAnimator.isRunning()) {
            return;
        }
        this.x.cancel();
        setPercentage(iFloatValue);
    }

    public void setProgress(int i, boolean z) {
        if (this.e == null) {
            Log.w("HwProgressButton", "setProgress, mProgressBar is null");
            return;
        }
        if (this.d != 1) {
            setState(1);
            this.e.setBackground(null);
            this.e.setProgressDrawable(this.g);
            setPercentageTextColor(this.i);
        }
        if (z) {
            this.e.setProgress(i, true);
        } else {
            this.e.setProgress(i);
            setPercentage(this.e.getProgress());
        }
    }

    public HwProgressButton(Context context, AttributeSet attributeSet, int i) {
        super(b(context, i), attributeSet, i);
        this.e = null;
        this.f29522a = null;
        this.d = 0;
        this.k = true;
        this.n = 1.0f;
        this.y = 0;
        this.w = context;
        a(super.getContext(), attributeSet, com.huawei.uikit.hwprogressbutton.R.layout.hwprogressbutton_layout);
    }

    private static Context b(Context context, int i) {
        return xfs.c(context, i, com.huawei.uikit.hwprogressbutton.R.style.Theme_Emui_HwProgressButton);
    }

    private void a(Context context, AttributeSet attributeSet, int i) {
        if (getCurSdkVersion() >= 26) {
            setDefaultFocusHighlightEnabled(false);
        }
        Object systemService = getContext().getSystemService("layout_inflater");
        if (systemService instanceof LayoutInflater) {
            ((LayoutInflater) systemService).inflate(i, (ViewGroup) this, true);
        }
        this.e = (HwProgressBar) findViewById(com.huawei.uikit.hwprogressbutton.R.id.hwprogressbutton_progress_bar);
        HwTextView hwTextView = (HwTextView) findViewById(com.huawei.uikit.hwprogressbutton.R.id.hwprogressbutton_percentage_text_view);
        this.f29522a = hwTextView;
        HwProgressBar hwProgressBar = this.e;
        if (hwProgressBar != null && hwTextView != null) {
            hwProgressBar.setOnVisualProgressChangedListener(new a());
            this.j = "";
            this.r = b(com.huawei.uikit.hwprogressbutton.R.dimen.emui_disabled_alpha);
            c(context, attributeSet);
            h();
            setFocusable(true);
            return;
        }
        Log.e("HwProgressButton", "init: mProgressBar is " + this.e + " mPercentage is " + this.f29522a + " layoutResId: " + i);
    }

    private void c(Context context) {
        Drawable drawable = ContextCompat.getDrawable(context, com.huawei.uikit.hwprogressbutton.R.drawable.hwprogressbutton_selector_btn_normal_bg_tint);
        Drawable drawableMutate = DrawableCompat.wrap(ContextCompat.getDrawable(context, com.huawei.uikit.hwprogressbutton.R.drawable.hwprogressbutton_selector_btn_disable_bg_tint)).mutate();
        DrawableCompat.setTint(drawableMutate, ContextCompat.getColor(context, com.huawei.uikit.hwprogressbutton.R.color.hwprogressbutton_color));
        this.l = new LayerDrawable(new Drawable[]{drawableMutate, drawable});
    }

    private void c(Context context, AttributeSet attributeSet) {
        TypedArray typedArrayObtainStyledAttributes;
        Resources.Theme theme = context.getTheme();
        if (theme == null || (typedArrayObtainStyledAttributes = theme.obtainStyledAttributes(attributeSet, com.huawei.uikit.hwprogressbutton.R.styleable.HwProgressButton, com.huawei.uikit.hwprogressbutton.R.attr.hwProgressButtonStyle, com.huawei.uikit.hwprogressbutton.R.style.Widget_Emui_HwProgressButton_Normal_Translucent)) == null) {
            return;
        }
        this.h = typedArrayObtainStyledAttributes.getDrawable(com.huawei.uikit.hwprogressbutton.R.styleable.HwProgressButton_hwProgressButtonBackground);
        Drawable drawable = typedArrayObtainStyledAttributes.getDrawable(com.huawei.uikit.hwprogressbutton.R.styleable.HwProgressButton_hwProgressButtonProgressBarBackground);
        this.g = drawable;
        if (f29521c >= 200) {
            d(drawable);
        }
        this.e.setProgressDrawable(this.h);
        boolean z = typedArrayObtainStyledAttributes.getBoolean(com.huawei.uikit.hwprogressbutton.R.styleable.HwProgressButton_hwProgressButtonIsHighlight, true);
        this.k = z;
        if (z) {
            c(context);
            this.e.setProgressDrawable(this.l);
        }
        this.f = typedArrayObtainStyledAttributes.getColorStateList(com.huawei.uikit.hwprogressbutton.R.styleable.HwProgressButton_hwProgressButtonStaticTextColor);
        this.i = typedArrayObtainStyledAttributes.getColorStateList(com.huawei.uikit.hwprogressbutton.R.styleable.HwProgressButton_hwProgressButtonDynamicTextColor);
        setPercentageTextColor(this.f);
        this.o = typedArrayObtainStyledAttributes.getDrawable(com.huawei.uikit.hwprogressbutton.R.styleable.HwProgressButton_hwFocusedDrawable);
        this.n = typedArrayObtainStyledAttributes.getFloat(com.huawei.uikit.hwprogressbutton.R.styleable.HwProgressButton_hwHoveredZoomScale, 1.0f);
        this.t = typedArrayObtainStyledAttributes.getColor(com.huawei.uikit.hwprogressbutton.R.styleable.HwProgressButton_hwFocusedPathColor, 0);
        this.s = typedArrayObtainStyledAttributes.getDimension(com.huawei.uikit.hwprogressbutton.R.styleable.HwProgressButton_hwFocusedPathPadding, 0.0f);
        this.q = typedArrayObtainStyledAttributes.getDimension(com.huawei.uikit.hwprogressbutton.R.styleable.HwProgressButton_hwFocusedPathWidth, 0.0f);
        this.p = typedArrayObtainStyledAttributes.getDimension(com.huawei.uikit.hwprogressbutton.R.styleable.HwProgressButton_hwProgressButtonCornerRadius, 0.0f);
        typedArrayObtainStyledAttributes.recycle();
    }

    private float b(int i) {
        TypedValue typedValue = new TypedValue();
        getResources().getValue(i, typedValue, true);
        return typedValue.getFloat();
    }

    private void e(Canvas canvas) {
        if (isFocusable() && hasWindowFocus() && hasFocus()) {
            b(canvas);
        }
    }

    private void e(boolean z) {
        xcv.a(this, z ? this.n : 1.0f).start();
    }

    private void e() {
        NumberFormat percentInstance;
        Locale locale = this.m;
        if (locale == null || !locale.equals(Locale.getDefault())) {
            Locale locale2 = Locale.getDefault();
            this.m = locale2;
            if (locale2 != null) {
                percentInstance = NumberFormat.getPercentInstance(locale2);
            } else {
                percentInstance = NumberFormat.getPercentInstance();
            }
            if (percentInstance != null) {
                percentInstance.setRoundingMode(RoundingMode.DOWN);
                percentInstance.setMaximumFractionDigits(0);
            }
        }
    }
}
