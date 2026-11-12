package defpackage;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.ViewDataBinding;
import com.xiaomi.fitness.nfc.widget.CardSwitcherView;
import com.xiaomi.fitness.nfc.widget.DeviceImageView;
import com.xiaomi.fitness.nfc.widget.InnerCardImageView;
import com.xiaomi.fitness.widget.RightArrowSingleLineTextView;

/* JADX INFO: loaded from: classes9.dex */
public class sog extends rog {
    public static final ViewDataBinding.i Q = null;
    public static final SparseIntArray R;
    public long P;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        R = sparseIntArray;
        sparseIntArray.put(mri.i1, 1);
        sparseIntArray.put(mri.Z, 2);
        sparseIntArray.put(mri.l1, 3);
        sparseIntArray.put(mri.h3, 4);
        sparseIntArray.put(mri.i3, 5);
        sparseIntArray.put(mri.A5, 6);
        sparseIntArray.put(mri.Q3, 7);
        sparseIntArray.put(mri.Y, 8);
        sparseIntArray.put(mri.A3, 9);
        sparseIntArray.put(mri.L2, 10);
        sparseIntArray.put(mri.M2, 11);
        sparseIntArray.put(mri.d1, 12);
        sparseIntArray.put(mri.N3, 13);
        sparseIntArray.put(mri.P3, 14);
    }

    public sog(rk5 rk5Var, View view, Object[] objArr) {
        super(rk5Var, view, 0, (CardSwitcherView) objArr[8], (InnerCardImageView) objArr[2], (TextView) objArr[12], (DeviceImageView) objArr[1], (ConstraintLayout) objArr[3], (RelativeLayout) objArr[0], (TextView) objArr[11], (LinearLayout) objArr[10], (TextView) objArr[4], (TextView) objArr[5], (LinearLayout) objArr[9], (TextView) objArr[13], (TextView) objArr[14], (RightArrowSingleLineTextView) objArr[7], (TextView) objArr[6]);
        this.P = -1L;
        this.F.setTag(null);
        o0(view);
        H();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean F() {
        synchronized (this) {
            try {
                return this.P != 0;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void H() {
        synchronized (this) {
            this.P = 1L;
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
            this.P = 0L;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean q0(int i, Object obj) {
        return true;
    }

    public sog(rk5 rk5Var, View view) {
        this(rk5Var, view, ViewDataBinding.P(rk5Var, view, 15, Q, R));
    }
}
