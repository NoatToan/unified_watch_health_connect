package defpackage;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.databinding.ViewDataBinding;
import com.xiaomi.fitness.nfc.widget.CardSwitcherView;
import com.xiaomi.fitness.nfc.widget.DeviceImageView;
import com.xiaomi.fitness.nfc.widget.InnerCardImageView;
import com.xiaomi.fitness.nfc.widget.IssuedTransCardDetailOptionView;
import com.xiaomi.fitness.nfc.widget.MarqueeTextView;

/* JADX INFO: loaded from: classes9.dex */
public class gqg extends fqg {
    public static final ViewDataBinding.i P = null;
    public static final SparseIntArray Q;
    public long O;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        Q = sparseIntArray;
        sparseIntArray.put(mri.Q4, 1);
        sparseIntArray.put(mri.F5, 2);
        sparseIntArray.put(mri.a0, 3);
        sparseIntArray.put(mri.Y4, 4);
        sparseIntArray.put(mri.X4, 5);
        sparseIntArray.put(mri.h5, 6);
        sparseIntArray.put(mri.c5, 7);
        sparseIntArray.put(mri.Y, 8);
        sparseIntArray.put(mri.k4, 9);
        sparseIntArray.put(mri.E0, 10);
        sparseIntArray.put(mri.P2, 11);
        sparseIntArray.put(mri.d1, 12);
        sparseIntArray.put(mri.O3, 13);
    }

    public gqg(rk5 rk5Var, View view, Object[] objArr) {
        super(rk5Var, view, 0, (InnerCardImageView) objArr[3], (CardSwitcherView) objArr[8], (TextView) objArr[10], (TextView) objArr[12], (IssuedTransCardDetailOptionView) objArr[0], (LinearLayout) objArr[11], (TextView) objArr[13], (LinearLayout) objArr[9], (MarqueeTextView) objArr[1], (TextView) objArr[5], (TextView) objArr[4], (TextView) objArr[7], (TextView) objArr[6], (DeviceImageView) objArr[2]);
        this.O = -1L;
        this.E.setTag(null);
        o0(view);
        H();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean F() {
        synchronized (this) {
            try {
                return this.O != 0;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void H() {
        synchronized (this) {
            this.O = 1L;
        }
        e0();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean W(int i, Object obj, int i2) {
        return false;
    }

    @Override // androidx.databinding.ViewDataBinding
    public void o() {
        synchronized (this) {
            this.O = 0L;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean q0(int i, Object obj) {
        return true;
    }

    public gqg(rk5 rk5Var, View view) {
        this(rk5Var, view, ViewDataBinding.P(rk5Var, view, 14, P, Q));
    }
}
