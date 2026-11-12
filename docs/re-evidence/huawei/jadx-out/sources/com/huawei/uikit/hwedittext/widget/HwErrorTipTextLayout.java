package com.huawei.uikit.hwedittext.widget;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.content.Context;
import android.content.res.TypedArray;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.animation.LinearInterpolator;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.core.widget.TextViewCompat;
import com.huawei.uikit.hwedittext.R;
import defpackage.xfs;
import defpackage.xft;

/* JADX INFO: loaded from: classes20.dex */
public class HwErrorTipTextLayout extends RelativeLayout {
    private static final String k = "HwErrorTipTextLayout";
    private static final int l = 3;
    private static final int m = 200;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private boolean f29476a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f29477b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f29478c;
    private int d;
    private HwShapeMode e;
    private int f;
    private int g;
    private int h;
    private int i;
    private LinearLayout j;
    protected EditText mEditText;
    protected int mErrorTextAppearance;
    protected TextView mErrorView;

    class b extends AnimatorListenerAdapter {
        final /* synthetic */ boolean d;

        b(boolean z) {
            this.d = z;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            super.onAnimationEnd(animator);
            HwErrorTipTextLayout.this.setBackground(this.d);
            HwErrorTipTextLayout.this.mErrorView.setAlpha(this.d ? 1.0f : 0.0f);
            HwErrorTipTextLayout.this.mErrorView.setVisibility(this.d ? 0 : 8);
        }
    }

    /* JADX INFO: loaded from: classes44.dex */
    class d extends View.AccessibilityDelegate {
        private d() {
        }

        @Override // android.view.View.AccessibilityDelegate
        public void onInitializeAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
            if (view == null || accessibilityEvent == null) {
                return;
            }
            super.onInitializeAccessibilityEvent(view, accessibilityEvent);
            accessibilityEvent.setClassName(HwErrorTipTextLayout.k);
        }

        @Override // android.view.View.AccessibilityDelegate
        public void onPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
            super.onPopulateAccessibilityEvent(view, accessibilityEvent);
        }

        /* synthetic */ d(HwErrorTipTextLayout hwErrorTipTextLayout, b bVar) {
            this();
        }
    }

    public HwErrorTipTextLayout(Context context) {
        this(context, null);
    }

    private static Context a(Context context, int i) {
        return xfs.c(context, i, R.style.Theme_Emui_HwEditText);
    }

    public static HwErrorTipTextLayout instantiate(Context context) {
        Object objC = xft.c(context, xft.b(context, HwErrorTipTextLayout.class, xft.d(context, 3, 1)), HwErrorTipTextLayout.class);
        if (objC instanceof HwErrorTipTextLayout) {
            return (HwErrorTipTextLayout) objC;
        }
        return null;
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        if (!(view instanceof EditText)) {
            super.addView(view, i, layoutParams);
        } else {
            setEditText((EditText) view);
            super.addView(view, 0, updateEditTextMargin(layoutParams));
        }
    }

    public EditText getEditText() {
        return this.mEditText;
    }

    public CharSequence getError() {
        TextView textView = this.mErrorView;
        if (textView != null) {
            return textView.getText();
        }
        return null;
    }

    public CharSequence getHint() {
        EditText editText = this.mEditText;
        if (editText == null) {
            return null;
        }
        return editText.getHint();
    }

    protected void initErrorView() {
        TextView textView = new TextView(getContext());
        this.mErrorView = textView;
        textView.setVisibility(8);
        this.mErrorView.setPaddingRelative(this.mEditText.getPaddingLeft(), getResources().getDimensionPixelSize(R.dimen.hwedittext_dimens_text_margin_fifth), this.mEditText.getPaddingRight(), 0);
        TextViewCompat.setTextAppearance(this.mErrorView, this.mErrorTextAppearance);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams.addRule(3, this.mEditText.getId());
        this.mErrorView.setLayoutParams(layoutParams);
        addView(this.mErrorView);
    }

    public boolean isErrorEnabled() {
        return this.f29476a;
    }

    protected void setBackground(boolean z) {
        EditText editText = this.mEditText;
        if (editText == null || this.mErrorView == null) {
            return;
        }
        HwShapeMode hwShapeMode = this.e;
        if (hwShapeMode == HwShapeMode.BUBBLE) {
            editText.setBackgroundResource(z ? this.f29477b : this.f);
            return;
        }
        if (hwShapeMode == HwShapeMode.LINEAR) {
            editText.setBackgroundResource(z ? this.d : this.h);
        } else if (hwShapeMode == HwShapeMode.WHITE) {
            editText.setBackgroundResource(z ? this.f29478c : this.g);
        } else {
            editText.setBackgroundResource(z ? this.d : this.i);
        }
    }

    protected void setEditText(EditText editText) {
        if (this.mEditText != null) {
            return;
        }
        this.mEditText = editText;
        this.mEditText.setImeOptions(editText.getImeOptions() | 33554432);
        HwShapeMode hwShapeMode = this.e;
        if (hwShapeMode == HwShapeMode.BUBBLE) {
            this.mEditText.setBackgroundResource(this.f);
        } else if (hwShapeMode == HwShapeMode.LINEAR) {
            this.mEditText.setBackgroundResource(this.h);
        } else if (hwShapeMode == HwShapeMode.WHITE) {
            this.mEditText.setBackgroundResource(this.g);
        } else {
            this.mEditText.setBackgroundResource(this.i);
        }
        initErrorView();
    }

    public void setError(CharSequence charSequence) {
        if (this.mEditText == null || this.mErrorView == null || !this.f29476a) {
            return;
        }
        boolean zIsEmpty = TextUtils.isEmpty(charSequence);
        this.mErrorView.setText(charSequence);
        this.mErrorView.animate().setInterpolator(new LinearInterpolator()).setDuration(200L).alpha(!zIsEmpty ? 1.0f : 0.0f).setListener(new b(!zIsEmpty)).start();
        sendAccessibilityEvent(2048);
    }

    public void setErrorEnabled(boolean z) {
        TextView textView;
        if (z == this.f29476a || (textView = this.mErrorView) == null) {
            return;
        }
        textView.setAlpha(z ? 1.0f : 0.0f);
        this.mErrorView.setVisibility(z ? 0 : 8);
        this.f29476a = z;
    }

    public void setHint(CharSequence charSequence) {
        EditText editText = this.mEditText;
        if (editText == null) {
            return;
        }
        editText.setHint(charSequence);
        sendAccessibilityEvent(2048);
    }

    protected ViewGroup.LayoutParams updateEditTextMargin(ViewGroup.LayoutParams layoutParams) {
        return layoutParams != null ? new RelativeLayout.LayoutParams(layoutParams) : generateDefaultLayoutParams();
    }

    public HwErrorTipTextLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.hwErrorTextStyle);
    }

    private void a(Context context, AttributeSet attributeSet, int i) {
        setAddStatesFromChildren(true);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.HwErrorTipTextLayout, i, R.style.Widget_Emui_HwErrorTipTextLayout);
        this.f = typedArrayObtainStyledAttributes.getResourceId(R.styleable.HwErrorTipTextLayout_hwEditTextBg, 0);
        this.g = typedArrayObtainStyledAttributes.getResourceId(R.styleable.HwErrorTipTextLayout_hwEditTextBgWhite, 0);
        this.h = typedArrayObtainStyledAttributes.getResourceId(R.styleable.HwErrorTipTextLayout_hwLinearEditBg, 0);
        this.i = typedArrayObtainStyledAttributes.getResourceId(R.styleable.HwErrorTipTextLayout_hwSpaceEditBg, 0);
        this.f29477b = typedArrayObtainStyledAttributes.getResourceId(R.styleable.HwErrorTipTextLayout_hwErrorResBg, 0);
        this.f29478c = typedArrayObtainStyledAttributes.getResourceId(R.styleable.HwErrorTipTextLayout_hwErrorResBgWhite, 0);
        this.mErrorTextAppearance = typedArrayObtainStyledAttributes.getResourceId(R.styleable.HwErrorTipTextLayout_hwErrorTextAppearance, 0);
        this.d = typedArrayObtainStyledAttributes.getResourceId(R.styleable.HwErrorTipTextLayout_hwErrorLinearEditBg, 0);
        this.f29476a = typedArrayObtainStyledAttributes.getBoolean(R.styleable.HwErrorTipTextLayout_hwErrorEnabled, true);
        this.e = HwShapeMode.values()[typedArrayObtainStyledAttributes.getInt(R.styleable.HwErrorTipTextLayout_hwShapeMode, 0)];
        typedArrayObtainStyledAttributes.recycle();
        setAccessibilityDelegate(new d(this, null));
    }

    public HwErrorTipTextLayout(Context context, AttributeSet attributeSet, int i) {
        super(a(context, i), attributeSet, i);
        a(super.getContext(), attributeSet, i);
    }
}
