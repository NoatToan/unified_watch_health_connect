package com.google.android.material.internal;

import android.annotation.SuppressLint;
import android.content.Context;
import android.util.AttributeSet;
import android.widget.ImageButton;
import androidx.annotation.RestrictTo;

/* JADX INFO: loaded from: classes5.dex */
@SuppressLint({"AppCompatCustomView"})
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public class VisibilityAwareImageButton extends ImageButton {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f8747a;

    public VisibilityAwareImageButton(Context context) {
        this(context, null);
    }

    public final void b(int i, boolean z) {
        super.setVisibility(i);
        if (z) {
            this.f8747a = i;
        }
    }

    public final int getUserSetVisibility() {
        return this.f8747a;
    }

    @Override // android.widget.ImageView, android.view.View
    public void setVisibility(int i) {
        b(i, true);
    }

    public VisibilityAwareImageButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public VisibilityAwareImageButton(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f8747a = getVisibility();
    }
}
