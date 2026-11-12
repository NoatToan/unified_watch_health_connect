package com.huawei.uikit.hwedittext.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.core.widget.TextViewCompat;
import com.huawei.uikit.hwedittext.R;
import defpackage.xfs;

/* JADX INFO: loaded from: classes44.dex */
public class HwHelpTextLayout extends LinearLayout {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private CharSequence f29481a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private TextView f29482b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private HwWidgetStyle f29483c;
    protected HwShapeMode d;
    private EditText e;
    private int f;
    private CharSequence g;
    private CharSequence j;

    public HwHelpTextLayout(Context context) {
        this(context, null);
    }

    private static Context e(Context context, int i) {
        return xfs.c(context, i, R.style.Theme_Emui_HwEditText);
    }

    public EditText getEditText() {
        return this.e;
    }

    public CharSequence getHelp() {
        return this.f29482b.getText();
    }

    public CharSequence getHint() {
        return this.e.getHint();
    }

    public CharSequence getText() {
        return this.e.getText();
    }

    public TextView getTextView() {
        return this.f29482b;
    }

    @Override // android.view.View
    protected void onFinishInflate() {
        super.onFinishInflate();
    }

    public void setHelp(CharSequence charSequence) {
        this.f29482b.setText(charSequence);
    }

    public void setHint(CharSequence charSequence) {
        this.e.setHint(charSequence);
    }

    public void setText(CharSequence charSequence) {
        this.e.setText(charSequence);
    }

    public HwHelpTextLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.hwHelpTextStyle);
    }

    private void e(Context context, AttributeSet attributeSet, int i) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.HwHelpTextLayout, i, R.style.Widget_Emui_HwHelpTextLayout);
        this.d = HwShapeMode.values()[typedArrayObtainStyledAttributes.getInt(R.styleable.HwHelpTextLayout_hwShapeMode, 0)];
        this.f29483c = HwWidgetStyle.values()[typedArrayObtainStyledAttributes.getInt(R.styleable.HwHelpTextLayout_hwWidgetStyle, 0)];
        this.f29481a = typedArrayObtainStyledAttributes.getString(R.styleable.HwHelpTextLayout_hwHint);
        this.j = typedArrayObtainStyledAttributes.getString(R.styleable.HwHelpTextLayout_hwText);
        this.g = typedArrayObtainStyledAttributes.getString(R.styleable.HwHelpTextLayout_hwHelp);
        this.f = typedArrayObtainStyledAttributes.getResourceId(R.styleable.HwHelpTextLayout_hwHelpTextAppearance, 0);
        typedArrayObtainStyledAttributes.recycle();
    }

    public HwHelpTextLayout(Context context, AttributeSet attributeSet, int i) {
        super(e(context, i), attributeSet, i);
        e(super.getContext(), attributeSet, i);
        HwShapeMode hwShapeMode = this.d;
        if (hwShapeMode == HwShapeMode.BUBBLE) {
            c(R.layout.hwedittext_help_text_layout_bubble, R.layout.hwedittext_help_text_layout_bubble_dark, R.layout.hwedittext_help_text_layout_bubble_translucent);
            return;
        }
        if (hwShapeMode == HwShapeMode.LINEAR) {
            c(R.layout.hwedittext_help_text_layout_linear, R.layout.hwedittext_help_text_layout_linear_dark, R.layout.hwedittext_help_text_layout_linear_translucent);
        } else if (hwShapeMode == HwShapeMode.WHITE) {
            c(R.layout.hwedittext_help_text_layout_bubble_white, R.layout.hwedittext_help_text_layout_bubble_white_dark, R.layout.hwedittext_help_text_layout_bubble_white_translucent);
        } else {
            c(R.layout.hwedittext_help_text_layout_space, R.layout.hwedittext_help_text_layout_space_dark, R.layout.hwedittext_help_text_layout_space_translucent);
        }
    }

    private void d(int i) {
        View.inflate(getContext(), i, this);
        EditText editText = (EditText) findViewById(R.id.hwedittext_edit);
        this.e = editText;
        if (editText != null) {
            editText.setHint(this.f29481a);
            this.e.setText(this.j);
        }
        TextView textView = (TextView) findViewById(R.id.hwedittext_text_assist);
        this.f29482b = textView;
        if (textView != null) {
            textView.setText(this.g);
            TextViewCompat.setTextAppearance(this.f29482b, this.f);
        }
    }

    private void c(int i, int i2, int i3) {
        HwWidgetStyle hwWidgetStyle = this.f29483c;
        if (hwWidgetStyle == HwWidgetStyle.LIGHT) {
            d(i);
        } else if (hwWidgetStyle == HwWidgetStyle.DARK) {
            d(i2);
        } else {
            d(i3);
        }
    }
}
