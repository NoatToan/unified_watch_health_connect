package com.google.android.material.textfield;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Point;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import androidx.appcompat.widget.AppCompatEditText;
import defpackage.b4j;
import defpackage.c9p;
import defpackage.d4f;
import defpackage.k3j;
import defpackage.n8f;
import defpackage.pii;

/* JADX INFO: loaded from: classes5.dex */
public class TextInputEditText extends AppCompatEditText {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Rect f8871a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f8872b;

    public TextInputEditText(Context context) {
        this(context, null);
    }

    private CharSequence getHintFromLayout() {
        TextInputLayout textInputLayout = getTextInputLayout();
        if (textInputLayout != null) {
            return textInputLayout.getHint();
        }
        return null;
    }

    private TextInputLayout getTextInputLayout() {
        for (ViewParent parent = getParent(); parent instanceof View; parent = parent.getParent()) {
            if (parent instanceof TextInputLayout) {
                return (TextInputLayout) parent;
            }
        }
        return null;
    }

    public final boolean a(TextInputLayout textInputLayout) {
        return textInputLayout != null && this.f8872b;
    }

    @Override // android.widget.TextView, android.view.View
    public void getFocusedRect(Rect rect) {
        super.getFocusedRect(rect);
        TextInputLayout textInputLayout = getTextInputLayout();
        if (!a(textInputLayout) || rect == null) {
            return;
        }
        textInputLayout.getFocusedRect(this.f8871a);
        rect.bottom = this.f8871a.bottom;
    }

    @Override // android.view.View
    public boolean getGlobalVisibleRect(Rect rect, Point point) {
        TextInputLayout textInputLayout = getTextInputLayout();
        return a(textInputLayout) ? textInputLayout.getGlobalVisibleRect(rect, point) : super.getGlobalVisibleRect(rect, point);
    }

    @Override // android.widget.TextView
    public CharSequence getHint() {
        TextInputLayout textInputLayout = getTextInputLayout();
        return (textInputLayout == null || !textInputLayout.M()) ? super.getHint() : textInputLayout.getHint();
    }

    @Override // android.widget.TextView, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        TextInputLayout textInputLayout = getTextInputLayout();
        if (textInputLayout != null && textInputLayout.M() && super.getHint() == null && d4f.c()) {
            setHint("");
        }
    }

    @Override // androidx.appcompat.widget.AppCompatEditText, android.widget.TextView, android.view.View
    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection inputConnectionOnCreateInputConnection = super.onCreateInputConnection(editorInfo);
        if (inputConnectionOnCreateInputConnection != null && editorInfo.hintText == null) {
            editorInfo.hintText = getHintFromLayout();
        }
        return inputConnectionOnCreateInputConnection;
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        getTextInputLayout();
    }

    @Override // android.view.View
    public boolean requestRectangleOnScreen(Rect rect) {
        TextInputLayout textInputLayout = getTextInputLayout();
        if (!a(textInputLayout) || rect == null) {
            return super.requestRectangleOnScreen(rect);
        }
        this.f8871a.set(rect.left, rect.top, rect.right, rect.bottom + (textInputLayout.getHeight() - getHeight()));
        return super.requestRectangleOnScreen(this.f8871a);
    }

    public void setTextInputLayoutFocusedRectEnabled(boolean z) {
        this.f8872b = z;
    }

    public TextInputEditText(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, pii.t);
    }

    public TextInputEditText(Context context, AttributeSet attributeSet, int i) {
        super(n8f.c(context, attributeSet, i, 0), attributeSet, i);
        this.f8871a = new Rect();
        TypedArray typedArrayH = c9p.h(context, attributeSet, b4j.o9, i, k3j.p, new int[0]);
        setTextInputLayoutFocusedRectEnabled(typedArrayH.getBoolean(b4j.p9, false));
        typedArrayH.recycle();
    }
}
