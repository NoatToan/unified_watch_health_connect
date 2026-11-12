package defpackage;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.ViewDataBinding;
import com.xiaomi.fitness.nfc.widget.DeviceImageView;
import com.xiaomi.fitness.nfc.widget.InnerCardImageView;

/* JADX INFO: loaded from: classes9.dex */
public class qqg extends pqg {
    public static final ViewDataBinding.i P = null;
    public static final SparseIntArray Q;
    public long O;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        Q = sparseIntArray;
        sparseIntArray.put(mri.y1, 1);
        sparseIntArray.put(mri.i1, 2);
        sparseIntArray.put(mri.Z, 3);
        sparseIntArray.put(mri.v2, 4);
        sparseIntArray.put(mri.y, 5);
        sparseIntArray.put(mri.z, 6);
        sparseIntArray.put(mri.K3, 7);
        sparseIntArray.put(mri.S, 8);
        sparseIntArray.put(mri.a1, 9);
        sparseIntArray.put(mri.W, 10);
        sparseIntArray.put(mri.Y0, 11);
        sparseIntArray.put(mri.O1, 12);
        sparseIntArray.put(mri.P3, 13);
    }

    public qqg(rk5 rk5Var, View view, Object[] objArr) {
        super(rk5Var, view, 0, (LinearLayout) objArr[5], (TextView) objArr[6], (ConstraintLayout) objArr[8], (TextView) objArr[10], (InnerCardImageView) objArr[3], (TextView) objArr[11], (TextView) objArr[9], (DeviceImageView) objArr[2], (FrameLayout) objArr[1], (LinearLayout) objArr[12], (View) objArr[4], (ConstraintLayout) objArr[0], (TextView) objArr[7], (TextView) objArr[13]);
        this.O = -1L;
        this.L.setTag(null);
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

    public qqg(rk5 rk5Var, View view) {
        this(rk5Var, view, ViewDataBinding.P(rk5Var, view, 14, P, Q));
    }
}
