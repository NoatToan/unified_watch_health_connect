package com.google.android.gms.common.internal;

import am.j;
import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.Button;
import com.google.android.gms.common.util.DeviceProperties;
import vb.h;

/* JADX INFO: loaded from: classes14.dex */
public final class zaaa extends Button {
    public zaaa(Context context, AttributeSet attributeSet) {
        super(context, null, R.attr.buttonStyle);
    }

    private static final int zab(int i14, int i15, int i16, int i17) {
        if (i14 == 0) {
            return i15;
        }
        if (i14 == 1) {
            return i16;
        }
        if (i14 == 2) {
            return i17;
        }
        h.z(j.h(i14, "Unknown color scheme: "));
        return 0;
    }

    public final void zaa(Resources resources, int i14, int i15) {
        setTypeface(Typeface.DEFAULT_BOLD);
        setTextSize(14.0f);
        int i16 = (int) ((resources.getDisplayMetrics().density * 48.0f) + 0.5f);
        setMinHeight(i16);
        setMinWidth(i16);
        int i17 = com.google.android.gms.base.R.drawable.common_google_signin_btn_icon_dark;
        int i18 = com.google.android.gms.base.R.drawable.common_google_signin_btn_icon_light;
        int iZab = zab(i15, i17, i18, i18);
        int i19 = com.google.android.gms.base.R.drawable.common_google_signin_btn_text_dark;
        int i24 = com.google.android.gms.base.R.drawable.common_google_signin_btn_text_light;
        int iZab2 = zab(i15, i19, i24, i24);
        if (i14 == 0 || i14 == 1) {
            iZab = iZab2;
        } else if (i14 != 2) {
            h.z(j.h(i14, "Unknown button size: "));
            return;
        }
        Drawable drawable = resources.getDrawable(iZab);
        drawable.setTintList(resources.getColorStateList(com.google.android.gms.base.R.color.common_google_signin_btn_tint));
        drawable.setTintMode(PorterDuff.Mode.SRC_ATOP);
        setBackgroundDrawable(drawable);
        int i25 = com.google.android.gms.base.R.color.common_google_signin_btn_text_dark;
        int i26 = com.google.android.gms.base.R.color.common_google_signin_btn_text_light;
        setTextColor((ColorStateList) Preconditions.checkNotNull(resources.getColorStateList(zab(i15, i25, i26, i26))));
        if (i14 == 0) {
            setText(resources.getString(com.google.android.gms.base.R.string.common_signin_button_text));
        } else if (i14 == 1) {
            setText(resources.getString(com.google.android.gms.base.R.string.common_signin_button_text_long));
        } else {
            if (i14 != 2) {
                h.z(j.h(i14, "Unknown button size: "));
                return;
            }
            setText((CharSequence) null);
        }
        setTransformationMethod(null);
        if (DeviceProperties.isWearable(getContext())) {
            setGravity(19);
        }
    }
}
