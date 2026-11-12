package com.huawei.openalliance.ad.views;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import com.huawei.hms.ads.uiengine.common.IProgressButton;
import com.huawei.openalliance.ad.R;
import com.huawei.openalliance.ad.download.app.AppStatus;
import com.huawei.openalliance.ad.hw;
import com.huawei.openalliance.ad.utils.as;

/* JADX INFO: loaded from: classes12.dex */
public abstract class a extends v implements View.OnClickListener, IProgressButton, IProgressButton.ProgressButtonResetListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected final String f21122a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected AppDownloadButtonStyle f21123b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected boolean f21124c;
    private IProgressButton d;
    private ImageView e;
    private RelativeLayout.LayoutParams f;
    private int g;
    private boolean h;
    private boolean i;
    private int j;
    private int k;
    private int l;
    private int m;
    private boolean n;
    private boolean o;

    public abstract AppStatus getStatus();

    public void onClick(View view) {
    }

    @Override // com.huawei.hms.ads.uiengine.common.IProgressButton
    public void updateLayoutHeight() {
        this.d.updateLayoutHeight();
    }

    public void setVisibilityInner(int i) {
        this.d.getProgressBtn().setVisibility(i);
    }

    @Override // com.huawei.hms.ads.uiengine.common.IProgressButton
    public void setTextSize(float f) {
        this.d.setTextSize(f);
    }

    @Override // com.huawei.hms.ads.uiengine.common.IProgressButton
    public void setTextColor(int i) {
        this.d.setTextColor(i);
    }

    @Override // com.huawei.hms.ads.uiengine.common.IProgressButton
    public void setText(CharSequence charSequence) {
        this.d.setTextInner(charSequence, this.n);
    }

    public void setResetWidth(boolean z) {
        this.i = z;
        this.d.setResetWidth(z);
    }

    @Override // com.huawei.hms.ads.uiengine.common.IProgressButton
    public void setProgressDrawable(Drawable drawable, int i) {
        this.d.setProgressDrawable(drawable, i);
    }

    @Override // com.huawei.hms.ads.uiengine.common.IProgressButton
    public void setProgressDrawable(Drawable drawable) {
        this.d.setProgressDrawable(drawable);
    }

    @Override // com.huawei.hms.ads.uiengine.common.IProgressButton
    public void setProgress(int i) {
        this.d.setProgress(i);
    }

    @Override // com.huawei.hms.ads.uiengine.common.IProgressButton
    public void setPaintTypeface(Typeface typeface, int i) {
        this.d.setPaintTypeface(typeface, i);
    }

    @Override // com.huawei.hms.ads.uiengine.common.IProgressButton
    public void setPaintTypeface(Typeface typeface) {
        this.d.setPaintTypeface(typeface);
    }

    @Override // com.huawei.hms.ads.uiengine.common.IProgressButton
    public void setMinWidth(int i) {
        this.k = i;
        this.d.setMinWidth(i);
    }

    @Override // com.huawei.hms.ads.uiengine.common.IProgressButton
    public void setMaxWidth(int i) {
        this.j = i;
        this.d.setMaxWidth(i);
    }

    @Override // com.huawei.hms.ads.uiengine.common.IProgressButton
    public void setMax(int i) {
        this.d.setMax(i);
    }

    public void setLayoutParamsSkipSizeReset(ViewGroup.LayoutParams layoutParams) {
        this.o = true;
        setLayoutParams(layoutParams);
    }

    @Override // com.huawei.hms.ads.uiengine.common.IProgressButton
    public void setFontFamily(String str) {
        this.d.setFontFamily(str);
    }

    @Override // com.huawei.hms.ads.uiengine.common.IProgressButton
    public void setFixedWidth(boolean z) {
        this.d.setFixedWidth(z);
    }

    public void setCancelBtnClickListener(View.OnClickListener onClickListener) {
        this.e.setOnClickListener(onClickListener);
    }

    @Override // com.huawei.hms.ads.uiengine.common.IProgressButton.ProgressButtonResetListener
    public void onSizeReset(int i, int i2) {
        hw.a(this.f21122a, "on size reset: %s, %s", Integer.valueOf(i), Integer.valueOf(i2));
        if (i <= 0 || i2 <= 0) {
            return;
        }
        if (this.o) {
            this.l = i;
            this.o = false;
        } else {
            b(i);
        }
        this.m = i2;
        a();
    }

    @Override // android.widget.RelativeLayout, android.view.View
    protected void onMeasure(int i, int i2) {
        int i3;
        IProgressButton iProgressButton = this.d;
        if (iProgressButton != null && this.h) {
            ViewGroup.LayoutParams layoutParams = iProgressButton.getProgressBtn().getLayoutParams();
            layoutParams.height = View.MeasureSpec.getSize(i2);
            layoutParams.width = View.MeasureSpec.getSize(i);
            int i4 = this.m;
            if (i4 > 0) {
                layoutParams.height = i4;
            }
            if (this.i && (i3 = this.l) > 0) {
                layoutParams.width = i3;
            }
            if (this.j > 0) {
                int i5 = layoutParams.width;
                int i6 = this.j;
                if (i5 > i6) {
                    layoutParams.width = i6;
                }
            }
            if (this.k > 0) {
                int i7 = layoutParams.width;
                int i8 = this.k;
                if (i7 < i8) {
                    layoutParams.width = i8;
                }
            }
            if (layoutParams.width > 0 && layoutParams.height > 0) {
                this.d.getProgressBtn().setLayoutParams(layoutParams);
            }
        }
        super.onMeasure(i, i2);
    }

    @Override // com.huawei.hms.ads.uiengine.common.IProgressButton
    public boolean isFastClick() {
        return this.d.isFastClick();
    }

    @Override // com.huawei.hms.ads.uiengine.common.IProgressButton
    public void incrementProgressBy(int i) {
        this.d.incrementProgressBy(i);
    }

    @Override // com.huawei.hms.ads.uiengine.common.IProgressButton
    public CharSequence getText() {
        return this.d.getText();
    }

    @Override // com.huawei.openalliance.ad.views.v
    protected String getTAG() {
        return this.f21122a;
    }

    @Override // com.huawei.hms.ads.uiengine.common.IProgressButton
    public Rect getPromptRect() {
        return this.d.getPromptRect();
    }

    @Override // com.huawei.hms.ads.uiengine.common.IProgressButton
    public Drawable getProgressDrawable() {
        return this.d.getProgressDrawable();
    }

    @Override // com.huawei.hms.ads.uiengine.common.IProgressButton
    public int getProgress() {
        return this.d.getProgress();
    }

    public void b(int i, int i2, int i3, int i4) {
        this.d.getProgressBtn().setPaddingRelative(i, i2, i3, i4);
    }

    protected void a(AppStatus appStatus) {
        if (appStatus == null) {
            return;
        }
        this.n = b(appStatus);
        hw.a(this.f21122a, "configCancelBtn, status: %s", appStatus);
        if (this.n) {
            this.e.setImageDrawable(getCancelBtnDrawable());
            this.d.setShowCancelBtn(this.n);
            int measuredHeight = getMeasuredHeight();
            if (measuredHeight <= 0) {
                post(new Runnable() { // from class: com.huawei.openalliance.ad.views.a.1
                    @Override // java.lang.Runnable
                    public void run() {
                        hw.a(a.this.f21122a, "post run");
                        a aVar = a.this;
                        aVar.a(aVar.getMeasuredHeight());
                    }
                });
                return;
            } else {
                a(measuredHeight);
                return;
            }
        }
        try {
            if (this.e.getParent() == this) {
                this.d.setShowCancelBtn(this.n);
                removeView(this.e);
            }
        } catch (Throwable th) {
            hw.c(this.f21122a, "remove cancel btn ex: %s", th.getClass().getSimpleName());
        }
    }

    public void a(View.OnClickListener onClickListener) {
        setOnClickListener(onClickListener);
        this.d.getProgressBtn().setOnClickListener(onClickListener);
    }

    public void a(int i, int i2, int i3, int i4) {
        this.d.getProgressBtn().setPadding(i, i2, i3, i4);
    }

    private Drawable getCancelBtnDrawable() {
        AppDownloadButtonStyle appDownloadButtonStyle = this.f21123b;
        return appDownloadButtonStyle == null ? getContext().getResources().getDrawable(R.drawable.hiad_app_down_cancel_btn) : appDownloadButtonStyle.cancelBtnDrawable;
    }

    private static boolean b(AppStatus appStatus) {
        return AppStatus.PAUSE == appStatus || AppStatus.WAITING_FOR_WIFI == appStatus;
    }

    private void b(int i) {
        if (this.i || this.l <= 0) {
            int i2 = this.j;
            if (i2 > 0 && i > i2) {
                this.l = i2;
                return;
            }
            int i3 = this.k;
            if (i3 <= 0 || i >= i3) {
                this.l = i;
            } else {
                this.l = i3;
            }
        }
    }

    private void a(Context context, ImageView imageView) {
        if (context == null) {
            return;
        }
        if (imageView != null) {
            hw.a(this.f21122a, "init cancelBtn for uiengine");
        } else {
            imageView = new ImageView(context);
        }
        this.e = imageView;
        this.g = as.a(context, 16.0f);
        if (this.e.getDrawable() == null) {
            this.e.setImageDrawable(context.getResources().getDrawable(R.drawable.hiad_app_down_cancel_btn));
        }
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
        this.f = layoutParams;
        layoutParams.addRule(19, this.d.getProgressBtn().getId());
        this.f.addRule(15);
    }

    private void a(Context context, AttributeSet attributeSet, boolean z, IProgressButton iProgressButton, ImageView imageView) {
        View progressBtn;
        int i;
        a(context, attributeSet);
        hw.a(this.f21122a, "init, create with attrs: %s", Boolean.valueOf(this.h));
        if (iProgressButton == null || iProgressButton.getProgressBtn() == null) {
            IProgressButton adVar = z ? new ad(context, attributeSet) : new ProgressButton(context, attributeSet);
            this.d = adVar;
            progressBtn = adVar.getProgressBtn();
            i = R.id.haid_down_btn_progress;
        } else {
            hw.a(this.f21122a, "init btn for uiengine");
            this.d = iProgressButton;
            progressBtn = iProgressButton.getProgressBtn();
            i = R.id.haid_down_btn_progress_uiengine;
        }
        progressBtn.setId(i);
        hw.b(this.f21122a, "progressBtn: %s", Integer.valueOf(this.d.hashCode()));
        setOnClickListener(this);
        this.d.setResetListener(this);
        this.d.getProgressBtn().setOnClickListener(this);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams.addRule(15);
        addView(this.d.getProgressBtn(), layoutParams);
        this.f21124c = z;
        a(context, imageView);
    }

    private void a(Context context, AttributeSet attributeSet) {
        if (context == null || attributeSet == null) {
            return;
        }
        this.h = true;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.hiad_progress_button);
        try {
            this.i = typedArrayObtainStyledAttributes.getBoolean(R.styleable.hiad_progress_button_hiad_resetWidth, true);
            this.j = typedArrayObtainStyledAttributes.getDimensionPixelSize(R.styleable.hiad_progress_button_hiad_maxWidth, 0);
            this.k = typedArrayObtainStyledAttributes.getDimensionPixelSize(R.styleable.hiad_progress_button_hiad_minWidth, 0);
            typedArrayObtainStyledAttributes.recycle();
        } catch (Throwable th) {
            try {
                hw.c(this.f21122a, "parseAttrs ex: %s", th.getClass().getSimpleName());
            } finally {
                typedArrayObtainStyledAttributes.recycle();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(int i) {
        this.g = i < as.a(getContext(), 40.0f) ? as.a(getContext(), 12.0f) : as.a(getContext(), 16.0f);
        int cancelBtnHeight = this.d.getCancelBtnHeight(i);
        hw.a(this.f21122a, "btnHeight: %s, cancelBtnSize: %s, realBtnHeight: %s", Integer.valueOf(i), Integer.valueOf(this.g), Integer.valueOf(cancelBtnHeight));
        this.f.height = cancelBtnHeight;
        this.f.width = cancelBtnHeight;
        int i2 = 0;
        this.f.setMarginEnd(0);
        int i3 = this.g;
        int i4 = (cancelBtnHeight - i3) / 2;
        if (i4 <= 0) {
            this.f.height = i3;
            this.f.width = this.g;
            this.f.setMarginEnd(as.a(getContext(), 12.0f));
        } else {
            i2 = i4;
        }
        this.e.setPaddingRelative(i2, i2, i2, i2);
        if (this.f21124c) {
            this.d.setCancelBtnHeight(this.g);
            this.e.setBackground(this.f21123b.c().getBackground());
        }
        try {
            if (this.e.getParent() != this) {
                addView(this.e, this.f);
            }
        } catch (Throwable th) {
            hw.c(this.f21122a, "add cancel btn ex: %s", th.getClass().getSimpleName());
        }
    }

    private void a() {
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        if (layoutParams != null) {
            layoutParams.height = this.m;
            layoutParams.width = this.l;
            setLayoutParams(layoutParams);
        }
        if (this.n) {
            a(this.m);
        }
    }

    public a(Context context, Boolean bool, IProgressButton iProgressButton, ImageView imageView) {
        super(context);
        this.f21122a = "AppDownBtn_" + hashCode();
        this.h = false;
        this.i = true;
        this.n = false;
        this.o = false;
        a(context, null, (bool == null ? true : bool).booleanValue(), iProgressButton, imageView);
    }

    public a(Context context, Boolean bool, IProgressButton iProgressButton) {
        super(context);
        this.f21122a = "AppDownBtn_" + hashCode();
        this.h = false;
        this.i = true;
        this.n = false;
        this.o = false;
        a(context, null, (bool == null ? true : bool).booleanValue(), iProgressButton, null);
    }

    public a(Context context, Boolean bool) {
        super(context);
        this.f21122a = "AppDownBtn_" + hashCode();
        this.h = false;
        this.i = true;
        this.n = false;
        this.o = false;
        a(context, null, (bool == null ? true : bool).booleanValue(), null, null);
    }

    public a(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.f21122a = "AppDownBtn_" + hashCode();
        this.h = false;
        this.i = true;
        this.n = false;
        this.o = false;
        a(context, attributeSet, false, null, null);
    }

    public a(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f21122a = "AppDownBtn_" + hashCode();
        this.h = false;
        this.i = true;
        this.n = false;
        this.o = false;
        a(context, attributeSet, false, null, null);
    }

    public a(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f21122a = "AppDownBtn_" + hashCode();
        this.h = false;
        this.i = true;
        this.n = false;
        this.o = false;
        a(context, attributeSet, false, null, null);
    }

    public a(Context context) {
        super(context);
        this.f21122a = "AppDownBtn_" + hashCode();
        this.h = false;
        this.i = true;
        this.n = false;
        this.o = false;
        a(context, null, false, null, null);
    }
}
