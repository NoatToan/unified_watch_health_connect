package com.google.android.material.internal;

import android.annotation.SuppressLint;
import android.content.Context;
import android.util.AttributeSet;
import android.widget.ImageButton;

/* JADX INFO: loaded from: classes14.dex */
@SuppressLint({"AppCompatCustomView"})
public class VisibilityAwareImageButton extends ImageButton {
    private int userSetVisibility;

    public VisibilityAwareImageButton(Context context, AttributeSet attributeSet, int i14) {
        super(context, attributeSet, i14);
        this.userSetVisibility = getVisibility();
    }

    public final int getUserSetVisibility() {
        return this.userSetVisibility;
    }

    public final void internalSetVisibility(int i14, boolean z14) {
        super.setVisibility(i14);
        if (z14) {
            this.userSetVisibility = i14;
        }
    }

    @Override // android.widget.ImageView, android.view.View
    public void setVisibility(int i14) {
        internalSetVisibility(i14, true);
    }

    public VisibilityAwareImageButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public VisibilityAwareImageButton(Context context) {
        this(context, null);
    }
}
