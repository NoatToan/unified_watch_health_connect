package com.huawei.uikit.hwprogressbutton.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.os.Build;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.LinearLayout;
import androidx.core.content.ContextCompat;
import androidx.core.graphics.drawable.DrawableCompat;
import com.huawei.uikit.hwbutton.widget.HwButton;
import com.huawei.uikit.hwprogressbutton.R;
import com.huawei.uikit.hwtextview.widget.HwTextView;
import defpackage.xfs;
import defpackage.xfu;

/* JADX INFO: loaded from: classes44.dex */
public class HwProgressButtonBar extends LinearLayout {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private HwTextView f29526a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private HwProgressButton f29527b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private HwButton f29528c;
    private HwButton d;
    private HwTextView e;
    private int f;
    private LinearLayout g;
    private LinearLayout h;
    private int i;
    private LinearLayout j;
    private int k;
    private ColorStateList l;
    private ColorStateList m;
    private ColorStateList n;
    private int o;
    private ColorStateList p;

    class b implements Runnable {

        class e implements ViewTreeObserver.OnPreDrawListener {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ HwButton f29529a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ HwProgressButton f29530b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ HwTextView f29531c;
            final /* synthetic */ HwButton d;
            final /* synthetic */ String e;

            e(HwTextView hwTextView, HwProgressButton hwProgressButton, String str, HwButton hwButton, HwButton hwButton2) {
                this.f29531c = hwTextView;
                this.f29530b = hwProgressButton;
                this.e = str;
                this.f29529a = hwButton;
                this.d = hwButton2;
            }

            @Override // android.view.ViewTreeObserver.OnPreDrawListener
            public boolean onPreDraw() {
                if (!"".equals(this.f29531c.getText().toString())) {
                    return false;
                }
                this.f29530b.getViewTreeObserver().removeOnPreDrawListener(this);
                int measuredHeight = this.f29530b.getMeasuredHeight();
                this.f29530b.setIdleText(this.e);
                this.f29529a.setMinHeight(measuredHeight);
                this.d.setMinHeight(measuredHeight);
                this.f29529a.setMaxLines(1);
                this.d.setMaxLines(1);
                this.f29531c.setMinHeight(measuredHeight);
                ViewGroup startContainer = HwProgressButtonBar.this.getStartContainer();
                ViewGroup endContainer = HwProgressButtonBar.this.getEndContainer();
                if (startContainer != null && endContainer != null) {
                    int i = measuredHeight + HwProgressButtonBar.this.k;
                    startContainer.setMinimumWidth(i);
                    startContainer.setMinimumHeight(i);
                    endContainer.setMinimumWidth(i);
                    endContainer.setMinimumHeight(i);
                }
                return true;
            }
        }

        b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            HwTextView percentage;
            HwProgressButton hwProgressButton = HwProgressButtonBar.this.getHwProgressButton();
            HwButton applyButton = HwProgressButtonBar.this.getApplyButton();
            HwButton updateButton = HwProgressButtonBar.this.getUpdateButton();
            if (hwProgressButton == null || applyButton == null || updateButton == null || (percentage = hwProgressButton.getPercentage()) == null) {
                return;
            }
            String string = percentage.getText().toString();
            hwProgressButton.setIdleText("");
            hwProgressButton.getViewTreeObserver().addOnPreDrawListener(new e(percentage, hwProgressButton, string, applyButton, updateButton));
        }
    }

    public HwProgressButtonBar(Context context) {
        this(context, null);
    }

    private ColorStateList getSmartIconColor() {
        return this.m;
    }

    private ColorStateList getSmartTitleColor() {
        return this.p;
    }

    private void setIconBounds(Drawable drawable) {
        if (drawable != null) {
            int intrinsicWidth = drawable.getIntrinsicWidth();
            int intrinsicHeight = drawable.getIntrinsicHeight();
            int i = this.i;
            if (intrinsicWidth > i) {
                if (intrinsicWidth != 0) {
                    intrinsicHeight = (int) (intrinsicHeight * (i / intrinsicWidth));
                }
                intrinsicWidth = i;
            }
            if (intrinsicHeight <= i) {
                i = intrinsicHeight;
            } else if (intrinsicHeight != 0) {
                intrinsicWidth = (int) (intrinsicWidth * (i / intrinsicHeight));
            }
            drawable.setBounds(0, 0, intrinsicWidth, i);
        }
    }

    public HwButton getApplyButton() {
        return this.f29528c;
    }

    public int getApplyButtonId() {
        return R.id.hwprogressbutton_bar_apply_button;
    }

    public ViewGroup getEndContainer() {
        return this.j;
    }

    public int getEndItemId() {
        return R.id.hwprogressbutton_bar_end_container;
    }

    public HwProgressButton getHwProgressButton() {
        return this.f29527b;
    }

    public int getHwProgressButtonId() {
        return R.id.hwprogressbutton_bar_progressbutton;
    }

    public ViewGroup getStartContainer() {
        return this.g;
    }

    public int getStartItemId() {
        return R.id.hwprogressbutton_bar_start_container;
    }

    public int getStyleMode() {
        return this.f;
    }

    public HwButton getUpdateButton() {
        return this.d;
    }

    public int getUpdateButtonId() {
        return R.id.hwprogressbutton_bar_update_button;
    }

    @Override // android.widget.LinearLayout, android.view.View
    protected void onMeasure(int i, int i2) {
        HwTextView hwTextView = this.f29526a;
        int lineCount = hwTextView != null ? hwTextView.getLineCount() : 0;
        HwTextView hwTextView2 = this.e;
        int lineCount2 = hwTextView2 != null ? hwTextView2.getLineCount() : 0;
        if (this.e != null && this.f29526a != null) {
            if (lineCount > 1 || lineCount2 > 1) {
                int i3 = this.o;
                setPadding(0, i3, 0, i3);
                this.g.setGravity(49);
                this.j.setGravity(49);
            } else {
                setPadding(0, 0, 0, 0);
                this.g.setGravity(17);
                this.j.setGravity(17);
            }
        }
        super.onMeasure(i, i2);
    }

    public void setApplyButtonClickListener(View.OnClickListener onClickListener) {
        HwButton hwButton = this.f29528c;
        if (hwButton == null) {
            Log.w("HwProgressButtonBar", "primary button is null ");
        } else {
            hwButton.setOnClickListener(onClickListener);
        }
    }

    public void setButtonsText(CharSequence charSequence, CharSequence charSequence2) {
        a(charSequence, this.f29528c);
        a(charSequence2, this.d);
    }

    public void setEndItem(Drawable drawable, CharSequence charSequence) {
        c(this.j, this.e, drawable, charSequence);
    }

    public void setEndItemClickListener(View.OnClickListener onClickListener) {
        LinearLayout linearLayout = this.j;
        if (linearLayout == null) {
            Log.w("HwProgressButtonBar", "endItem is null");
        } else {
            linearLayout.setOnClickListener(onClickListener);
        }
    }

    public void setSmartIconColor(ColorStateList colorStateList) {
        this.m = colorStateList;
    }

    public void setSmartTitleColor(ColorStateList colorStateList) {
        this.p = colorStateList;
    }

    public void setStartAndEndItem(Drawable drawable, CharSequence charSequence, Drawable drawable2, CharSequence charSequence2) {
        c(this.g, this.f29526a, drawable, charSequence);
        c(this.j, this.e, drawable2, charSequence2);
    }

    public void setStartItem(Drawable drawable, CharSequence charSequence) {
        c(this.g, this.f29526a, drawable, charSequence);
    }

    public void setStartItemClickListener(View.OnClickListener onClickListener) {
        LinearLayout linearLayout = this.g;
        if (linearLayout == null) {
            Log.w("HwProgressButtonBar", "startItem is null");
        } else {
            linearLayout.setOnClickListener(onClickListener);
        }
    }

    public void setStyleMode(int i) {
        this.f = i;
        if (i == 0) {
            this.h.setVisibility(8);
            this.f29527b.setVisibility(0);
        } else {
            if (i != 1) {
                return;
            }
            this.h.setVisibility(0);
            this.f29527b.setVisibility(8);
        }
    }

    public void setUpdateButtonClickListener(View.OnClickListener onClickListener) {
        HwButton hwButton = this.d;
        if (hwButton == null) {
            Log.w("HwProgressButtonBar", "primary button is null ");
        } else {
            hwButton.setOnClickListener(onClickListener);
        }
    }

    public HwProgressButtonBar(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.hwProgressButtonBarStyle);
    }

    private static Context e(Context context, int i) {
        return xfs.c(context, i, R.style.Theme_Emui_HwProgressButton);
    }

    public void setEndItem(int i, int i2) {
        c(this.j, this.e, ContextCompat.getDrawable(getContext(), i), getContext().getResources().getText(i2));
    }

    public void setStartItem(int i, int i2) {
        c(this.g, this.f29526a, ContextCompat.getDrawable(getContext(), i), getContext().getResources().getText(i2));
    }

    public HwProgressButtonBar(Context context, AttributeSet attributeSet, int i) {
        super(e(context, i), attributeSet, i);
        c(context, attributeSet, R.layout.hwprogressbuttonbar_layout);
    }

    private void c(Context context, AttributeSet attributeSet, int i) {
        TypedArray typedArrayObtainStyledAttributes;
        LayoutInflater.from(getContext()).inflate(i, (ViewGroup) this, true);
        this.f29526a = (HwTextView) findViewById(R.id.hwprogressbutton_bar_start_text_view);
        this.e = (HwTextView) findViewById(R.id.hwprogressbutton_bar_end_text_view);
        this.f29528c = (HwButton) findViewById(R.id.hwprogressbutton_bar_apply_button);
        this.d = (HwButton) findViewById(R.id.hwprogressbutton_bar_update_button);
        this.f29527b = (HwProgressButton) findViewById(R.id.hwprogressbutton_bar_progressbutton);
        this.h = (LinearLayout) findViewById(R.id.hwprogressbutton_bar_button_layout);
        this.g = (LinearLayout) findViewById(R.id.hwprogressbutton_bar_start_container);
        this.j = (LinearLayout) findViewById(R.id.hwprogressbutton_bar_end_container);
        try {
            this.o = getResources().getDimensionPixelSize(R.dimen.hwprogressbutton_bar_padding);
            this.i = getResources().getDimensionPixelSize(R.dimen.hwprogressbutton_bar_item_icon_size);
            this.k = (int) context.getResources().getDimension(R.dimen.hwprogressbutton_bar_height_margin);
        } catch (Resources.NotFoundException unused) {
            Log.e("HwProgressButtonBar", "resource not found");
        }
        Drawable drawable = ContextCompat.getDrawable(context, R.drawable.hwprogressbutton_selector_btn_normal_bg_tint);
        Drawable drawable2 = ContextCompat.getDrawable(context, R.drawable.hwprogressbutton_selector_btn_disable_bg_tint);
        Drawable drawable3 = ContextCompat.getDrawable(context, R.drawable.hwprogressbutton_selector_btn_disable_bg_tint);
        Drawable drawable4 = ContextCompat.getDrawable(context, R.drawable.hwprogressbutton_selector_btn_normal_bg_tint);
        Drawable drawableMutate = DrawableCompat.wrap(drawable2).mutate();
        Drawable drawableMutate2 = DrawableCompat.wrap(drawable3).mutate();
        DrawableCompat.setTint(drawableMutate, ContextCompat.getColor(context, R.color.emui_accent));
        DrawableCompat.setTint(drawableMutate2, ContextCompat.getColor(context, R.color.emui_accent));
        LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{drawableMutate, drawable});
        LayerDrawable layerDrawable2 = new LayerDrawable(new Drawable[]{drawableMutate2, drawable4});
        this.f29528c.setBackground(layerDrawable);
        this.d.setBackground(layerDrawable2);
        Resources.Theme theme = context.getTheme();
        if (theme != null && (typedArrayObtainStyledAttributes = theme.obtainStyledAttributes(attributeSet, R.styleable.HwProgressButton, R.attr.hwProgressButtonBarMenuStyle, R.style.Widget_Emui_HwProgressButtonBar_Button_Small)) != null) {
            this.n = typedArrayObtainStyledAttributes.getColorStateList(R.styleable.HwProgressButton_hwProgressButtonBarMenuTextColor);
            this.l = typedArrayObtainStyledAttributes.getColorStateList(R.styleable.HwProgressButton_hwProgressButtonBarMenuIconColor);
            typedArrayObtainStyledAttributes.recycle();
        }
        setStyleMode(0);
        a(getContext());
    }

    public void setButtonsText(int i, int i2) {
        a(getContext().getResources().getText(i), this.f29528c);
        a(getContext().getResources().getText(i2), this.d);
    }

    public void setStartAndEndItem(int i, int i2, int i3, int i4) {
        Resources resources = getContext().getResources();
        c(this.g, this.f29526a, ContextCompat.getDrawable(getContext(), i), resources.getText(i2));
        c(this.j, this.e, ContextCompat.getDrawable(getContext(), i3), resources.getText(i4));
    }

    private void a(Context context) {
        if (Build.VERSION.SDK_INT < 29 || !xfu.c(context) || Float.compare(xfu.d(context), 1.75f) < 0) {
            return;
        }
        post(new b());
    }

    private void c(LinearLayout linearLayout, HwTextView hwTextView, Drawable drawable, CharSequence charSequence) {
        if (hwTextView != null && linearLayout != null) {
            hwTextView.setText(charSequence);
            if (drawable == null && !a(hwTextView)) {
                linearLayout.setVisibility(8);
                return;
            }
            setIconBounds(drawable);
            if (a(hwTextView)) {
                hwTextView.setBackground(null);
                hwTextView.setCompoundDrawables(null, drawable, null, null);
            } else {
                hwTextView.setCompoundDrawables(null, null, null, null);
                hwTextView.setBackground(drawable);
            }
            ColorStateList smartIconColor = getSmartIconColor();
            ColorStateList smartTitleColor = getSmartTitleColor();
            Drawable drawableMutate = drawable != null ? DrawableCompat.wrap(drawable).mutate() : null;
            if (smartIconColor != null && smartTitleColor != null) {
                if (drawableMutate != null) {
                    DrawableCompat.setTintList(drawableMutate, smartIconColor);
                }
                hwTextView.setTextColor(smartTitleColor);
                return;
            }
            ColorStateList colorStateList = this.l;
            if (colorStateList != null && drawableMutate != null) {
                DrawableCompat.setTintList(drawableMutate, colorStateList);
            }
            ColorStateList colorStateList2 = this.n;
            if (colorStateList2 != null) {
                hwTextView.setTextColor(colorStateList2);
                return;
            }
            return;
        }
        Log.w("HwProgressButtonBar", "item layout initialization failed");
    }

    private boolean a(HwTextView hwTextView) {
        return !TextUtils.isEmpty(hwTextView.getText());
    }

    private void a(CharSequence charSequence, HwButton hwButton) {
        if (hwButton == null) {
            Log.w("HwProgressButtonBar", "button layout initialization failed");
        } else {
            hwButton.setText(charSequence);
        }
    }
}
