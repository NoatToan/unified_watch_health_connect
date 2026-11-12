package defpackage;

import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.os.Build;
import android.os.LocaleList;

/* JADX INFO: loaded from: classes.dex */
public class x1e extends Paint {
    public x1e() {
    }

    @Override // android.graphics.Paint
    public void setAlpha(int i) {
        if (Build.VERSION.SDK_INT >= 30) {
            super.setAlpha(d5g.c(i, 0, 255));
        } else {
            setColor((d5g.c(i, 0, 255) << 24) | (getColor() & 16777215));
        }
    }

    @Override // android.graphics.Paint
    public void setTextLocales(LocaleList localeList) {
    }

    public x1e(int i) {
        super(i);
    }

    public x1e(PorterDuff.Mode mode) {
        setXfermode(new PorterDuffXfermode(mode));
    }

    public x1e(int i, PorterDuff.Mode mode) {
        super(i);
        setXfermode(new PorterDuffXfermode(mode));
    }
}
