package com.airbnb.lottie.animation;

import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.os.Build;
import android.os.LocaleList;
import com.airbnb.lottie.utils.MiscUtils;
import com.google.android.flexbox.FlexItem;

/* JADX INFO: loaded from: classes7.dex */
public class LPaint extends Paint {
    public LPaint(PorterDuff.Mode mode) {
        setXfermode(new PorterDuffXfermode(mode));
    }

    @Override // android.graphics.Paint
    public void setAlpha(int i14) {
        if (Build.VERSION.SDK_INT >= 30) {
            super.setAlpha(MiscUtils.clamp(i14, 0, 255));
        } else {
            setColor((MiscUtils.clamp(i14, 0, 255) << 24) | (getColor() & FlexItem.MAX_SIZE));
        }
    }

    @Override // android.graphics.Paint
    public void setTextLocales(LocaleList localeList) {
    }

    public LPaint(int i14) {
        super(i14);
    }

    public LPaint() {
    }

    public LPaint(int i14, PorterDuff.Mode mode) {
        super(i14);
        setXfermode(new PorterDuffXfermode(mode));
    }
}
