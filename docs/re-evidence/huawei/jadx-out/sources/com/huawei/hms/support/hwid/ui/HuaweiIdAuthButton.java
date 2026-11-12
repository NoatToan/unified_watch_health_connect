package com.huawei.hms.support.hwid.ui;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import androidx.media3.ui.DefaultTimeBar;
import com.huawei.android.hms.hwid.R;

/* JADX INFO: loaded from: classes34.dex */
public class HuaweiIdAuthButton extends RelativeLayout {
    public static final int COLOR_POLICY_BLACK = 3;
    public static final int COLOR_POLICY_GRAY = 4;
    public static final int COLOR_POLICY_RED = 0;
    public static final int COLOR_POLICY_WHITE = 1;
    public static final int COLOR_POLICY_WHITE_WITH_BORDER = 2;
    public static final int CORNER_RADIUS_LARGE = -1;
    public static final int CORNER_RADIUS_MEDIUM = -2;
    public static final int CORNER_RADIUS_SMALL = -3;
    public static final int THEME_FULL_TITLE = 1;
    public static final int THEME_NO_TITLE = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final PorterDuffColorFilter f16671a = new PorterDuffColorFilter(218103808, PorterDuff.Mode.SRC_ATOP);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final PorterDuffColorFilter f16672b = new PorterDuffColorFilter(436207616, PorterDuff.Mode.SRC_ATOP);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final PorterDuffColorFilter f16673c = new PorterDuffColorFilter(DefaultTimeBar.DEFAULT_UNPLAYED_COLOR, PorterDuff.Mode.SRC_ATOP);
    private int d;
    private int e;
    private int f;
    private GradientDrawable g;
    private Button h;
    private ImageView i;
    private LinearLayout j;

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return true;
    }

    public HuaweiIdAuthButton(Context context) {
        super(context);
        a((AttributeSet) null);
    }

    public HuaweiIdAuthButton(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        a(attributeSet);
    }

    public HuaweiIdAuthButton(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        a(attributeSet);
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0029  */
    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        GradientDrawable gradientDrawable;
        if (motionEvent.getAction() == 0) {
            if (this.g != null && isEnabled()) {
                int i = this.e;
                if (i == 0) {
                    this.g.setColorFilter(f16672b);
                } else if (i == 1 || i == 2) {
                    this.g.setColorFilter(f16671a);
                } else if (i == 3) {
                    this.g.setColorFilter(f16673c);
                } else if (i == 4) {
                    this.g.setColorFilter(f16671a);
                }
            }
        } else if (1 == motionEvent.getAction() && (gradientDrawable = this.g) != null) {
            gradientDrawable.clearColorFilter();
        }
        if (hasOnClickListeners()) {
            return super.onTouchEvent(motionEvent);
        }
        return true;
    }

    private void a(AttributeSet attributeSet) {
        GradientDrawable gradientDrawable = (GradientDrawable) getResources().getDrawable(R.drawable.hwid_auth_button_background);
        this.g = gradientDrawable;
        setBackground(gradientDrawable);
        LinearLayout linearLayout = new LinearLayout(getContext());
        this.j = linearLayout;
        int i = 0;
        linearLayout.setOrientation(0);
        this.j.setGravity(17);
        b();
        a();
        addView(this.j);
        int iA = a(8.0f);
        int i2 = 1;
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, R.styleable.HuaweiIdAuthButton);
            i2 = typedArrayObtainStyledAttributes.getInt(R.styleable.HuaweiIdAuthButton_hwid_button_theme, 1);
            i = typedArrayObtainStyledAttributes.getInt(R.styleable.HuaweiIdAuthButton_hwid_color_policy, 0);
            iA = typedArrayObtainStyledAttributes.getLayoutDimension(R.styleable.HuaweiIdAuthButton_hwid_corner_radius, a(8.0f));
            typedArrayObtainStyledAttributes.recycle();
        }
        setLayoutParams(generateDefaultLayoutParams());
        setUIMode(i2, i, iA);
    }

    private void a() {
        if (this.i == null) {
            this.i = new ImageView(getContext());
        }
        this.i.setImageDrawable(getResources().getDrawable(R.drawable.hwid_auth_button_round_normal));
        setBackgroundDrawableColor(R.color.hwid_auth_button_color_white);
        this.j.addView(this.i);
    }

    private void b() {
        if (this.h == null) {
            this.h = new Button(getContext());
        }
        this.h.setStateListAnimator(null);
        this.h.setBackground(null);
        int intrinsicWidth = a(R.drawable.hwid_auth_button_white).getIntrinsicWidth();
        int iA = a(8.0f);
        this.h.setCompoundDrawablePadding(iA);
        a(intrinsicWidth, iA);
        this.h.setLayoutParams(new ViewGroup.LayoutParams(-2, a(36.0f)));
        this.j.addView(this.h);
    }

    private void a(int i, int i2) {
        this.h.setTextSize(16.0f);
        this.h.setText(getResources().getText(R.string.hwid_huawei_login_button_text));
        this.h.setSingleLine();
        int i3 = getResources().getDisplayMetrics().widthPixels;
        int iA = a(16.0f);
        int i4 = iA + iA;
        int i5 = i3 - i4;
        this.h.setMaxWidth(i5);
        float fMeasureText = this.h.getPaint().measureText(this.h.getText().toString());
        while (((int) fMeasureText) + i + i2 + i4 > i5 && this.h.getTextSize() > a(9.0f)) {
            Button button = this.h;
            button.setTextSize(0, button.getTextSize() - 1.0f);
            fMeasureText = this.h.getPaint().measureText(this.h.getText().toString());
        }
        this.h.setEllipsize(TextUtils.TruncateAt.END);
        this.h.setPadding(iA, 0, iA, 0);
    }

    private Drawable a(int i) {
        Drawable drawable = getResources().getDrawable(i);
        drawable.setBounds(0, 0, drawable.getMinimumWidth(), drawable.getMinimumHeight());
        this.h.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, (Drawable) null, (Drawable) null, (Drawable) null);
        return drawable;
    }

    public int getTheme() {
        return this.d;
    }

    public int getColorPolicy() {
        return this.e;
    }

    public int getCornerRadius() {
        return this.f;
    }

    @Override // android.view.View
    public void setEnabled(boolean z) {
        super.setEnabled(z);
        if (!z) {
            setAlpha(0.38f);
        } else {
            setAlpha(1.0f);
        }
    }

    public void setTheme(int i) {
        if (i == 0) {
            this.d = i;
            this.i.setVisibility(0);
            this.h.setVisibility(8);
            setMinimumWidth(a(48.0f));
            setMinimumHeight(a(48.0f));
            this.j.setMinimumWidth(a(48.0f));
            this.j.setMinimumHeight(a(48.0f));
            return;
        }
        if (i != 1) {
            return;
        }
        this.d = i;
        this.i.setVisibility(8);
        this.h.setVisibility(0);
        setMinimumWidth(a(200.0f));
        setMinimumHeight(a(36.0f));
        this.j.setMinimumWidth(a(200.0f));
        this.j.setMinimumHeight(a(36.0f));
    }

    public void setColorPolicy(int i) {
        if (i == 0) {
            a(i, R.color.hwid_auth_button_color_red, R.color.hwid_auth_button_color_text_white, R.drawable.hwid_auth_button_white);
            this.i.setImageDrawable(getResources().getDrawable(R.drawable.hwid_auth_button_round_white));
            return;
        }
        if (i == 1) {
            a(i, R.color.hwid_auth_button_color_white, R.color.hwid_auth_button_color_text_black, R.drawable.hwid_auth_button_normal);
            this.i.setImageDrawable(getResources().getDrawable(R.drawable.hwid_auth_button_round_normal));
            return;
        }
        if (i == 2) {
            a(i, R.color.hwid_auth_button_color_white, R.color.hwid_auth_button_color_text_black, R.drawable.hwid_auth_button_normal);
            if (this.d == 1) {
                b(a(1.0f), getResources().getColor(R.color.hwid_auth_button_color_border));
                return;
            }
            return;
        }
        if (i == 3) {
            a(i, R.color.hwid_auth_button_color_black, R.color.hwid_auth_button_color_text_white, R.drawable.hwid_auth_button_white);
            this.i.setImageDrawable(getResources().getDrawable(R.drawable.hwid_auth_button_round_white));
        } else {
            if (i != 4) {
                return;
            }
            a(i, R.color.hwid_auth_button_color_gray, R.color.hwid_auth_button_color_text_black, R.drawable.hwid_auth_button_normal);
        }
    }

    private void a(int i, int i2, int i3, int i4) {
        this.e = i;
        if (this.d == 1 || i == 0 || i == 3 || i == 1) {
            setBackgroundDrawableColor(i2);
        } else {
            setBackgroundDrawableColor(R.color.hwid_auth_button_color_white);
            this.i.setImageDrawable(getResources().getDrawable(R.drawable.hwid_auth_button_round_normal));
        }
        b(0, 0);
        this.h.setTextColor(getResources().getColor(i3));
        a(i4);
    }

    public void setCornerRadius(int i) {
        if (i == -3) {
            i = a(3.0f);
        } else if (i == -2) {
            i = a(8.0f);
        } else if (i == -1) {
            i = a(24.0f);
        }
        if (i < 0) {
            return;
        }
        this.f = i;
        setBackgroundCornerRadius(i);
    }

    private void setBackgroundCornerRadius(int i) {
        this.g.mutate();
        this.g.setCornerRadius(i);
    }

    private void setBackgroundDrawableColor(int i) {
        this.g.mutate();
        this.g.setColor(getResources().getColor(i));
    }

    private void b(int i, int i2) {
        this.g.mutate();
        this.g.setStroke(i, i2);
    }

    public void setUIMode(int i, int i2, int i3) {
        setTheme(i);
        setColorPolicy(i2);
        setCornerRadius(i3);
    }

    private int a(float f) {
        return (int) ((f * getResources().getDisplayMetrics().density) + 0.5f);
    }
}
