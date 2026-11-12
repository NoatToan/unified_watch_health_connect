package com.huawei.uikit.hwedittext.widget;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.view.animation.LinearInterpolator;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.core.content.ContextCompat;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import androidx.core.widget.TextViewCompat;
import com.huawei.uikit.hwedittext.R;
import defpackage.xfs;

/* JADX INFO: loaded from: classes44.dex */
public class HwCounterTextLayout extends LinearLayout {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f29465a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private EditText f29466b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private HwShapeMode f29467c;
    private TextView d;
    private int e;
    private int f;
    private int g;
    private int h;
    private int i;
    private int j;
    private int k;
    private d l;
    private int m;
    private Animation n;
    private int o;
    private e p;

    class a extends View.AccessibilityDelegate {
        private a() {
        }

        @Override // android.view.View.AccessibilityDelegate
        public void onInitializeAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
            if (view == null || accessibilityEvent == null) {
                return;
            }
            super.onInitializeAccessibilityEvent(view, accessibilityEvent);
            accessibilityEvent.setClassName("HwCounterTextLayout");
        }

        @Override // android.view.View.AccessibilityDelegate
        public void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfo accessibilityNodeInfo) {
            if (view == null || accessibilityNodeInfo == null) {
                return;
            }
            super.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
            accessibilityNodeInfo.setClassName("HwCounterTextLayout");
            if (HwCounterTextLayout.this.f29466b != null) {
                accessibilityNodeInfo.setLabelFor(HwCounterTextLayout.this.f29466b);
            }
            CharSequence error = HwCounterTextLayout.this.getError();
            if (TextUtils.isEmpty(error)) {
                return;
            }
            AccessibilityNodeInfoCompat.obtain().setContentInvalid(true);
            AccessibilityNodeInfoCompat.obtain().setError(error);
        }

        @Override // android.view.View.AccessibilityDelegate
        public void onPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
            super.onPopulateAccessibilityEvent(view, accessibilityEvent);
        }

        /* synthetic */ a(HwCounterTextLayout hwCounterTextLayout, bzrwd bzrwdVar) {
            this();
        }
    }

    class bzrwd extends TextView {
        bzrwd(Context context) {
            super(context);
        }

        @Override // android.widget.TextView, android.view.View
        protected void onVisibilityChanged(View view, int i) {
            super.onVisibilityChanged(view, i);
            if (HwCounterTextLayout.this.f29467c == HwShapeMode.BUBBLE || HwCounterTextLayout.this.f29467c == HwShapeMode.WHITE) {
                HwCounterTextLayout.this.e();
            }
        }
    }

    class d implements TextWatcher {
        private d() {
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            HwCounterTextLayout.this.b(charSequence);
        }

        /* synthetic */ d(HwCounterTextLayout hwCounterTextLayout, bzrwd bzrwdVar) {
            this();
        }
    }

    class e implements Animation.AnimationListener {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private boolean f29470b;

        private e() {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationEnd(Animation animation) {
            TextViewCompat.setTextAppearance(HwCounterTextLayout.this.d, HwCounterTextLayout.this.f29465a);
            HwCounterTextLayout.this.setBackground(false);
            this.f29470b = false;
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationRepeat(Animation animation) {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationStart(Animation animation) {
            HwCounterTextLayout.this.d.setTextColor(HwCounterTextLayout.this.e);
            HwCounterTextLayout.this.setBackground(this.f29470b);
        }

        /* synthetic */ e(HwCounterTextLayout hwCounterTextLayout, bzrwd bzrwdVar) {
            this();
        }
    }

    public HwCounterTextLayout(Context context) {
        this(context, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setBackground(boolean z) {
        HwShapeMode hwShapeMode = this.f29467c;
        if (hwShapeMode == HwShapeMode.BUBBLE) {
            this.f29466b.setBackgroundResource(z ? this.f : this.h);
            e();
        } else if (hwShapeMode == HwShapeMode.LINEAR) {
            this.f29466b.setBackgroundResource(z ? this.o : this.m);
        } else if (hwShapeMode != HwShapeMode.WHITE) {
            this.f29466b.setBackgroundResource(z ? this.o : this.k);
        } else {
            this.f29466b.setBackgroundResource(z ? this.g : this.j);
            e();
        }
    }

    private void setEditText(EditText editText) {
        if (this.f29466b != null) {
            return;
        }
        this.f29466b = editText;
        this.f29466b.setImeOptions(editText.getImeOptions() | 33554432);
        HwShapeMode hwShapeMode = this.f29467c;
        if (hwShapeMode == HwShapeMode.BUBBLE) {
            this.f29466b.setBackgroundResource(this.h);
            return;
        }
        if (hwShapeMode == HwShapeMode.LINEAR) {
            this.f29466b.setBackgroundResource(this.m);
        } else if (hwShapeMode == HwShapeMode.WHITE) {
            this.f29466b.setBackgroundResource(this.j);
        } else {
            this.f29466b.setBackgroundResource(this.k);
        }
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        if (!(view instanceof EditText) || layoutParams == null) {
            super.addView(view, i, layoutParams);
            return;
        }
        setEditText((EditText) view);
        ViewGroup.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(layoutParams);
        FrameLayout frameLayout = new FrameLayout(getContext());
        frameLayout.addView(view, 0, layoutParams2);
        super.addView(frameLayout, 0, layoutParams2);
        d();
    }

    public EditText getEditText() {
        return this.f29466b;
    }

    public CharSequence getError() {
        TextView textView = this.d;
        if (textView != null) {
            return textView.getText();
        }
        return null;
    }

    public CharSequence getHint() {
        EditText editText = this.f29466b;
        if (editText == null) {
            return null;
        }
        return editText.getHint();
    }

    public int getMaxLength() {
        return this.i;
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        EditText editText = this.f29466b;
        if (editText == null) {
            return;
        }
        HwShapeMode hwShapeMode = this.f29467c;
        if ((hwShapeMode == HwShapeMode.BUBBLE || hwShapeMode == HwShapeMode.WHITE) && (editText.getParent() instanceof ViewGroup)) {
            ViewGroup viewGroup = (ViewGroup) this.f29466b.getParent();
            this.f29466b.layout(0, 0, viewGroup.getWidth(), viewGroup.getHeight());
        }
        if (this.l == null) {
            d dVar = new d(this, null);
            this.l = dVar;
            this.f29466b.addTextChangedListener(dVar);
            EditText editText2 = this.f29466b;
            editText2.setText(editText2.getText());
        }
    }

    public void setError(CharSequence charSequence) {
        if (this.f29466b == null || this.d == null) {
            return;
        }
        boolean zIsEmpty = TextUtils.isEmpty(charSequence);
        this.d.setText(charSequence);
        this.d.setVisibility(!zIsEmpty ? 0 : 8);
        this.d.animate().setInterpolator(new LinearInterpolator()).setDuration(50L).alpha(!zIsEmpty ? 1.0f : 0.0f).start();
        HwShapeMode hwShapeMode = this.f29467c;
        if (hwShapeMode == HwShapeMode.BUBBLE || hwShapeMode == HwShapeMode.WHITE) {
            e();
        }
        sendAccessibilityEvent(2048);
    }

    public void setHint(CharSequence charSequence) {
        EditText editText = this.f29466b;
        if (editText == null) {
            return;
        }
        editText.setHint(charSequence);
        sendAccessibilityEvent(2048);
    }

    public void setMaxLength(int i) {
        this.i = i;
    }

    public HwCounterTextLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.hwCounterTextStyle);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e() {
        ViewGroup.LayoutParams layoutParams = this.d.getLayoutParams();
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            int height = ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin;
            if (this.d.getVisibility() == 0) {
                height += this.d.getHeight() + getResources().getDimensionPixelSize(R.dimen.hwedittext_dimens_text_margin_fifth);
            }
            EditText editText = this.f29466b;
            editText.setPaddingRelative(editText.getPaddingStart(), this.f29466b.getPaddingTop(), this.f29466b.getPaddingEnd(), height);
        }
    }

    public HwCounterTextLayout(Context context, AttributeSet attributeSet, int i) {
        super(a(context, i), attributeSet, i);
        d(super.getContext(), attributeSet, i);
    }

    private static Context a(Context context, int i) {
        return xfs.c(context, i, R.style.Theme_Emui_HwEditText);
    }

    private void d(Context context, AttributeSet attributeSet, int i) {
        int color;
        setOrientation(1);
        try {
            color = ContextCompat.getColor(context, R.color.hwedittext_color_error);
        } catch (Resources.NotFoundException unused) {
            Log.d("HwCounterTextLayout", "initCounterTextErrorColor: resource error color not found");
            color = 0;
        }
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.HwCounterTextLayout, i, R.style.Widget_Emui_HwCounterTextLayout);
        this.f29465a = typedArrayObtainStyledAttributes.getResourceId(R.styleable.HwCounterTextLayout_hwCounterTextAppearance, 0);
        this.e = typedArrayObtainStyledAttributes.getColor(R.styleable.HwCounterTextLayout_hwCounterTextErrorColor, color);
        this.f29467c = HwShapeMode.values()[typedArrayObtainStyledAttributes.getInt(R.styleable.HwCounterTextLayout_hwShapeMode, 0)];
        this.m = typedArrayObtainStyledAttributes.getResourceId(R.styleable.HwCounterTextLayout_hwLinearEditBg, 0);
        this.k = typedArrayObtainStyledAttributes.getResourceId(R.styleable.HwCounterTextLayout_hwSpaceEditBg, 0);
        this.f = typedArrayObtainStyledAttributes.getResourceId(R.styleable.HwCounterTextLayout_hwErrorResBg, 0);
        this.g = typedArrayObtainStyledAttributes.getResourceId(R.styleable.HwCounterTextLayout_hwErrorResBgWhite, 0);
        this.h = typedArrayObtainStyledAttributes.getResourceId(R.styleable.HwCounterTextLayout_hwEditTextBg, 0);
        this.j = typedArrayObtainStyledAttributes.getResourceId(R.styleable.HwCounterTextLayout_hwEditTextBgWhite, 0);
        this.i = typedArrayObtainStyledAttributes.getInteger(R.styleable.HwCounterTextLayout_hwMaxLength, -1);
        this.o = typedArrayObtainStyledAttributes.getResourceId(R.styleable.HwCounterTextLayout_hwErrorLinearEditBg, 0);
        typedArrayObtainStyledAttributes.recycle();
        if (getImportantForAccessibility() == 0) {
            setImportantForAccessibility(1);
        }
        setAccessibilityDelegate(new a(this, null));
        Resources resources = getResources();
        setPaddingRelative(resources.getDimensionPixelSize(R.dimen.hwedittext_dimens_max_start), 0, resources.getDimensionPixelSize(R.dimen.hwedittext_dimens_max_end), 0);
    }

    private void d() {
        bzrwd bzrwdVar = new bzrwd(getContext());
        this.d = bzrwdVar;
        TextViewCompat.setTextAppearance(bzrwdVar, this.f29465a);
        this.d.setGravity(17);
        this.d.setTextDirection(5);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
        HwShapeMode hwShapeMode = this.f29467c;
        if (hwShapeMode != HwShapeMode.BUBBLE && hwShapeMode != HwShapeMode.WHITE) {
            layoutParams.gravity = 8388693;
            this.d.setPaddingRelative(0, getResources().getDimensionPixelSize(R.dimen.hwedittext_dimens_text_margin_fifth), 0, 0);
            addView(this.d, layoutParams);
            return;
        }
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams((ViewGroup.MarginLayoutParams) layoutParams);
        layoutParams2.gravity = 8388693;
        layoutParams2.setMarginEnd(this.f29466b.getPaddingEnd());
        layoutParams2.bottomMargin = this.f29466b.getPaddingBottom();
        ViewParent parent = this.f29466b.getParent();
        if (parent instanceof ViewGroup) {
            ((ViewGroup) parent).addView(this.d, layoutParams2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(CharSequence charSequence) {
        bzrwd bzrwdVar = null;
        if (this.i == -1) {
            setError(null);
            return;
        }
        if (charSequence instanceof Editable) {
            Editable editable = (Editable) charSequence;
            int length = editable.length();
            int i = this.i;
            if (length <= i) {
                if (length >= i * 0.9f) {
                    setError(getResources().getString(R.string.hwedittext_count_msg, Integer.valueOf(length), Integer.valueOf(this.i)));
                    return;
                }
                setError(null);
                return;
            }
            int selectionEnd = this.f29466b.getSelectionEnd();
            editable.delete(this.i, editable.length());
            EditText editText = this.f29466b;
            int i2 = this.i;
            if (selectionEnd > i2) {
                selectionEnd = i2;
            }
            editText.setSelection(selectionEnd);
            if (this.n == null) {
                this.n = AnimationUtils.loadAnimation(getContext(), R.anim.hwedittext_shake);
                e eVar = new e(this, bzrwdVar);
                this.p = eVar;
                Animation animation = this.n;
                if (animation != null) {
                    animation.setAnimationListener(eVar);
                }
            }
            this.p.f29470b = true;
            this.f29466b.startAnimation(this.n);
        }
    }
}
