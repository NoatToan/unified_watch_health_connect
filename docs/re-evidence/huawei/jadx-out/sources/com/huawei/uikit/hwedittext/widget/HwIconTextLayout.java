package com.huawei.uikit.hwedittext.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.appcompat.content.res.AppCompatResources;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.core.graphics.drawable.DrawableCompat;
import com.huawei.uikit.hwedittext.R;
import defpackage.xfs;
import ohos.ace.adapter.capability.web.WebDataBaseColumns;

/* JADX INFO: loaded from: classes20.dex */
public class HwIconTextLayout extends LinearLayout {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private HwWidgetStyle f29484a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected HwShapeMode f29485b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private EditText f29486c;
    private View.OnClickListener d;
    private AppCompatImageView e;
    private boolean f;
    private OnPasswordVisibleChangedListener g;
    private CharSequence h;
    private View i;
    private Drawable j;
    private CharSequence k;
    private int l;
    private Drawable m;
    private int n;
    private int o;
    private Drawable q;
    private boolean s;

    /* JADX INFO: loaded from: classes44.dex */
    public interface OnPasswordVisibleChangedListener {
        void onPasswordVisibleChanged(ImageView imageView, boolean z);
    }

    class d implements View.OnClickListener {
        d() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (HwIconTextLayout.this.f) {
                HwIconTextLayout.this.c();
                if (HwIconTextLayout.this.g != null) {
                    HwIconTextLayout.this.g.onPasswordVisibleChanged(HwIconTextLayout.this.e, HwIconTextLayout.this.d());
                }
            }
            if (HwIconTextLayout.this.d != null) {
                HwIconTextLayout.this.d.onClick(HwIconTextLayout.this.e);
            }
        }
    }

    public HwIconTextLayout(Context context) {
        this(context, null);
    }

    private void getEyeId() {
        HwWidgetStyle hwWidgetStyle = this.f29484a;
        if (hwWidgetStyle == HwWidgetStyle.LIGHT) {
            this.o = R.drawable.hwedittext_ic_visibility_password;
            this.l = R.drawable.hwedittext_ic_visibility_off_password;
        } else if (hwWidgetStyle == HwWidgetStyle.DARK) {
            this.o = R.drawable.hwedittext_ic_visibility_password_dark;
            this.l = R.drawable.hwedittext_ic_visibility_off_password_dark;
        } else {
            this.o = R.drawable.hwedittext_ic_visibility_password_translucent;
            this.l = R.drawable.hwedittext_ic_visibility_off_password_translucent;
        }
    }

    public EditText getEditText() {
        return this.f29486c;
    }

    public CharSequence getHint() {
        return this.f29486c.getHint();
    }

    public Drawable getIcon() {
        return this.e.getDrawable();
    }

    public Drawable getIconBackground() {
        return this.i.getBackground();
    }

    public AppCompatImageView getImageView() {
        return this.e;
    }

    public View.OnClickListener getOnIconClickListener() {
        return this.d;
    }

    public OnPasswordVisibleChangedListener getOnPasswordVisibleChangedListener() {
        return this.g;
    }

    public CharSequence getText() {
        return this.f29486c.getText();
    }

    public void setHint(CharSequence charSequence) {
        this.f29486c.setHint(charSequence);
    }

    public void setIcon(Drawable drawable) {
        this.e.setImageDrawable(drawable);
    }

    public void setIconBackground(Drawable drawable) {
        this.i.setBackground(drawable);
        this.j = drawable;
    }

    public void setOnIconClickListener(View.OnClickListener onClickListener) {
        this.d = onClickListener;
    }

    public void setOnPasswordVisibleChangedListener(OnPasswordVisibleChangedListener onPasswordVisibleChangedListener) {
        this.g = onPasswordVisibleChangedListener;
        boolean z = onPasswordVisibleChangedListener != null;
        if (this.f != z) {
            this.f = z;
            a();
        }
    }

    public void setPasswordType(boolean z) {
        if (this.f != z) {
            this.f = z;
            a();
        }
    }

    public void setSafeEditText(boolean z) {
        this.s = z;
    }

    public void setText(CharSequence charSequence) {
        this.f29486c.setText(charSequence);
    }

    public HwIconTextLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.hwIconTextStyle);
    }

    private void a() {
        if (!this.f) {
            this.i.setBackground(this.j);
            return;
        }
        this.f29486c.setTextDirection(5);
        this.f29486c.setTextAlignment(5);
        this.i.setBackground(this.j);
        c();
        e();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c() {
        EditText editText = this.f29486c;
        if (editText instanceof HwEditText) {
            if (this.s) {
                ((HwEditText) editText).setSafeEditText(true);
            } else {
                ((HwEditText) editText).setSafeEditText(false);
            }
        }
        int selectionStart = this.f29486c.getSelectionStart();
        if (d() || !b()) {
            this.f29486c.setInputType(129);
            this.e.setImageDrawable(AppCompatResources.getDrawable(getContext(), this.l));
        } else {
            this.f29486c.setInputType(145);
            this.e.setImageDrawable(AppCompatResources.getDrawable(getContext(), this.o));
        }
        this.f29486c.setSelection(selectionStart);
    }

    private void c(int i) {
        View.inflate(getContext(), i, this);
        EditText editText = (EditText) findViewById(R.id.hwedittext_edit);
        this.f29486c = editText;
        if (editText != null) {
            editText.setHint(this.h);
            this.f29486c.setText(this.k);
        }
        AppCompatImageView appCompatImageView = (AppCompatImageView) findViewById(R.id.hwedittext_icon);
        this.e = appCompatImageView;
        if (appCompatImageView != null) {
            if (appCompatImageView.getParent() instanceof View) {
                this.i = (View) this.e.getParent();
            }
            if (this.i == null) {
                return;
            }
            int i2 = this.n;
            if (i2 > 0) {
                this.e.setImageDrawable(e(i2));
            }
            HwShapeMode hwShapeMode = this.f29485b;
            setIconBackground((hwShapeMode == HwShapeMode.BUBBLE || hwShapeMode == HwShapeMode.WHITE) ? this.m : this.q);
            a();
            this.i.setOnClickListener(new d());
        }
    }

    private static Context e(Context context, int i) {
        return xfs.c(context, i, R.style.Theme_Emui_HwEditText);
    }

    public HwIconTextLayout(Context context, AttributeSet attributeSet, int i) {
        super(e(context, i), attributeSet, i);
        this.n = 0;
        this.o = 0;
        this.l = 0;
        this.s = false;
        a(super.getContext(), attributeSet, i);
        HwShapeMode hwShapeMode = this.f29485b;
        if (hwShapeMode == HwShapeMode.BUBBLE) {
            e(R.layout.hwedittext_icon_text_layout_bubble, R.layout.hwedittext_icon_text_layout_bubble_dark, R.layout.hwedittext_icon_text_layout_bubble_translucent);
            return;
        }
        if (hwShapeMode == HwShapeMode.LINEAR) {
            e(R.layout.hwedittext_icon_text_layout_linear, R.layout.hwedittext_icon_text_layout_linear_dark, R.layout.hwedittext_icon_text_layout_linear_translucent);
        } else if (hwShapeMode == HwShapeMode.WHITE) {
            e(R.layout.hwedittext_icon_text_layout_bubble_white, R.layout.hwedittext_icon_text_layout_bubble_white_dark, R.layout.hwedittext_icon_text_layout_bubble_white_translucent);
        } else {
            e(R.layout.hwedittext_icon_text_layout_space, R.layout.hwedittext_icon_text_layout_space_dark, R.layout.hwedittext_icon_text_layout_space_translucent);
        }
    }

    private void a(Context context, AttributeSet attributeSet, int i) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.HwIconTextLayout, i, R.style.Widget_Emui_HwIconTextLayout);
        int i2 = typedArrayObtainStyledAttributes.getInt(R.styleable.HwIconTextLayout_hwShapeMode, 0);
        if (i2 >= 0 && i2 < HwShapeMode.values().length) {
            this.f29485b = HwShapeMode.values()[i2];
        }
        this.f29484a = HwWidgetStyle.values()[typedArrayObtainStyledAttributes.getInt(R.styleable.HwIconTextLayout_hwWidgetStyle, 0)];
        this.h = typedArrayObtainStyledAttributes.getString(R.styleable.HwIconTextLayout_hwHint);
        this.k = typedArrayObtainStyledAttributes.getString(R.styleable.HwIconTextLayout_hwText);
        this.f = typedArrayObtainStyledAttributes.getBoolean(R.styleable.HwIconTextLayout_hwIsPassword, false);
        if (typedArrayObtainStyledAttributes.hasValue(R.styleable.HwIconTextLayout_hwIcon)) {
            this.n = typedArrayObtainStyledAttributes.getResourceId(R.styleable.HwIconTextLayout_hwIcon, 0);
        }
        this.q = typedArrayObtainStyledAttributes.getDrawable(R.styleable.HwIconTextLayout_hwLinearIconBackground);
        this.m = typedArrayObtainStyledAttributes.getDrawable(R.styleable.HwIconTextLayout_hwBubbleIconBackground);
        typedArrayObtainStyledAttributes.recycle();
        getEyeId();
    }

    private void e() {
        this.f29486c.setAutofillHints(new String[]{WebDataBaseColumns.EntryColumns.COLUMN_NAME_USERPASS});
    }

    private void e(int i, int i2, int i3) {
        HwWidgetStyle hwWidgetStyle = this.f29484a;
        if (hwWidgetStyle == HwWidgetStyle.LIGHT) {
            c(i);
        } else if (hwWidgetStyle == HwWidgetStyle.DARK) {
            c(i2);
        } else {
            c(i3);
        }
    }

    private boolean b() {
        int inputType = this.f29486c.getInputType() & 4095;
        return (inputType == 129) | (inputType == 225) | (inputType == 18);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean d() {
        return (this.f29486c.getInputType() & 4095) == 145;
    }

    private Drawable e(int i) {
        Drawable drawable = AppCompatResources.getDrawable(getContext(), i);
        if (drawable != null) {
            DrawableCompat.setAutoMirrored(drawable, true);
        }
        return drawable;
    }
}
