package defpackage;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.CheckBox;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.databinding.ViewDataBinding;
import com.xiaomi.fitness.nfc.widget.DeviceImageView;
import com.xiaomi.fitness.nfc.widget.InnerCardImageView;

/* JADX INFO: loaded from: classes9.dex */
public class eqg extends dqg {
    public static final ViewDataBinding.i P = null;
    public static final SparseIntArray Q;
    public long O;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        Q = sparseIntArray;
        sparseIntArray.put(mri.G5, 1);
        sparseIntArray.put(mri.i1, 2);
        sparseIntArray.put(mri.Z, 3);
        sparseIntArray.put(mri.C3, 4);
        sparseIntArray.put(mri.b3, 5);
        sparseIntArray.put(mri.S4, 6);
        sparseIntArray.put(mri.p1, 7);
        sparseIntArray.put(mri.f1, 8);
        sparseIntArray.put(mri.K, 9);
        sparseIntArray.put(mri.g, 10);
        sparseIntArray.put(mri.a3, 11);
        sparseIntArray.put(mri.Z2, 12);
        sparseIntArray.put(mri.G3, 13);
    }

    public eqg(rk5 rk5Var, View view, Object[] objArr) {
        super(rk5Var, view, 0, (TextView) objArr[10], (RelativeLayout) objArr[9], (InnerCardImageView) objArr[3], (TextView) objArr[8], (DeviceImageView) objArr[2], (TextView) objArr[7], (RelativeLayout) objArr[0], (CheckBox) objArr[12], (LinearLayout) objArr[11], (RelativeLayout) objArr[5], (ProgressBar) objArr[4], (TextView) objArr[13], (TextView) objArr[6], (FrameLayout) objArr[1]);
        this.O = -1L;
        this.G.setTag(null);
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

    public eqg(rk5 rk5Var, View view) {
        this(rk5Var, view, ViewDataBinding.P(rk5Var, view, 14, P, Q));
    }
}
