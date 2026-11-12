package com.huami.wallet.ui.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.util.AttributeSet;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes16.dex */
@SuppressLint({"AppCompatCustomView"})
public class SafeCheckbox extends CheckBox {
    private CompoundButton.OnCheckedChangeListener a;

    public SafeCheckbox(Context context) {
        super(context);
    }

    public void setChecked(boolean z, boolean z2) {
        if (z2) {
            super.setChecked(z);
            return;
        }
        super.setOnCheckedChangeListener(null);
        super.setChecked(z);
        super.setOnCheckedChangeListener(this.a);
    }

    @Override // android.widget.CompoundButton
    public void setOnCheckedChangeListener(@Nullable CompoundButton.OnCheckedChangeListener onCheckedChangeListener) {
        super.setOnCheckedChangeListener(onCheckedChangeListener);
        this.a = onCheckedChangeListener;
    }

    public SafeCheckbox(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public SafeCheckbox(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
