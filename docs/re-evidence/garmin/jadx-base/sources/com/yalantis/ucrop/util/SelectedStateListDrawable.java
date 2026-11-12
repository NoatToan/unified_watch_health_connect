package com.yalantis.ucrop.util;

import android.R;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;

/* JADX INFO: loaded from: classes3.dex */
public class SelectedStateListDrawable extends StateListDrawable {
    private int mSelectionColor;

    public SelectedStateListDrawable(Drawable drawable, int i14) {
        this.mSelectionColor = i14;
        addState(new int[]{R.attr.state_selected}, drawable);
        addState(new int[0], drawable);
    }

    @Override // android.graphics.drawable.StateListDrawable, android.graphics.drawable.DrawableContainer, android.graphics.drawable.Drawable
    public boolean isStateful() {
        return true;
    }

    @Override // android.graphics.drawable.StateListDrawable, android.graphics.drawable.DrawableContainer, android.graphics.drawable.Drawable
    public boolean onStateChange(int[] iArr) {
        boolean z14 = false;
        for (int i14 : iArr) {
            if (i14 == 16842913) {
                z14 = true;
            }
        }
        if (z14) {
            super.setColorFilter(this.mSelectionColor, PorterDuff.Mode.SRC_ATOP);
        } else {
            super.clearColorFilter();
        }
        return super.onStateChange(iArr);
    }
}
