package com.huami.lib.rainbow.button;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.content.ContextCompat;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.internal.ThemeEnforcement;
import com.google.android.material.internal.ViewUtils;
import com.google.android.material.resources.MaterialResources;
import com.huami.lib.rainbow.R;

/* JADX INFO: loaded from: classes10.dex */
public class RainbowButton extends MaterialButton {
    public RainbowButton(@NonNull Context context) {
        this(context, null);
    }

    @SuppressLint({"RestrictedApi"})
    private void a(Context context, AttributeSet attributeSet, int i, int i2) {
        TypedArray typedArrayObtainStyledAttributes = ThemeEnforcement.obtainStyledAttributes(context, attributeSet, R.styleable.MaterialButton, i, i2, new int[0]);
        try {
            int i3 = com.google.android.material.R.styleable.MaterialButton_strokeColor;
            if (typedArrayObtainStyledAttributes.hasValue(i3) || typedArrayObtainStyledAttributes.hasValue(com.google.android.material.R.styleable.MaterialButton_strokeWidth)) {
                setStrokeWidth(typedArrayObtainStyledAttributes.getDimensionPixelSize(com.google.android.material.R.styleable.MaterialButton_strokeWidth, Math.round(ViewUtils.dpToPx(context, 1))));
                setStrokeColor(MaterialResources.getColorStateList(context, typedArrayObtainStyledAttributes, i3));
                setBackgroundTintList(ContextCompat.getColorStateList(context, com.google.android.material.R.color.mtrl_btn_text_btn_bg_color_selector));
                setRippleColor(ContextCompat.getColorStateList(context, com.google.android.material.R.color.mtrl_btn_text_btn_ripple_color));
            }
        } finally {
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    public RainbowButton(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, com.google.android.material.R.attr.materialButtonStyle);
    }

    public RainbowButton(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        a(context, attributeSet, i, R.style.Rainbow_Widget_Button);
    }
}
