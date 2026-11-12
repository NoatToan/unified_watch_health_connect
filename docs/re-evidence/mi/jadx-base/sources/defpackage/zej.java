package defpackage;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import androidx.appcompat.widget.SwitchCompat;

/* JADX INFO: loaded from: classes4.dex */
public class zej extends SwitchCompat {
    public boolean U;
    public Integer V;
    public Integer W;

    public zej(Context context) {
        super(context);
        this.U = true;
        this.V = null;
        this.W = null;
    }

    public void r(Drawable drawable, Integer num) {
        if (num == null) {
            drawable.clearColorFilter();
        } else {
            drawable.setColorFilter(num.intValue(), PorterDuff.Mode.MULTIPLY);
        }
    }

    public void s(boolean z) {
        if (isChecked() != z) {
            super.setChecked(z);
            v(z);
        }
        this.U = true;
    }

    @Override // androidx.appcompat.widget.SwitchCompat, android.widget.CompoundButton, android.widget.Checkable
    public void setChecked(boolean z) {
        if (!this.U || isChecked() == z) {
            super.setChecked(isChecked());
            return;
        }
        this.U = false;
        super.setChecked(z);
        v(z);
    }

    public void t(Integer num) {
        r(super.getThumbDrawable(), num);
    }

    public void u(Integer num) {
        r(super.getTrackDrawable(), num);
    }

    public final void v(boolean z) {
        Integer num = this.W;
        if (num == null && this.V == null) {
            return;
        }
        if (!z) {
            num = this.V;
        }
        u(num);
    }

    public void w(Integer num) {
        if (num == this.V) {
            return;
        }
        this.V = num;
        if (isChecked()) {
            return;
        }
        u(this.V);
    }

    public void x(Integer num) {
        if (num == this.W) {
            return;
        }
        this.W = num;
        if (isChecked()) {
            u(this.W);
        }
    }
}
