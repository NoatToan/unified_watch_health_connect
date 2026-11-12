package defpackage;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.databinding.ViewDataBinding;
import com.xiaomi.fitness.nfc.widget.DeviceImageView;
import com.xiaomi.fitness.nfc.widget.InnerCardImageView;

/* JADX INFO: loaded from: classes9.dex */
public class gng extends fng {
    public static final ViewDataBinding.i N = null;
    public static final SparseIntArray O;
    public long M;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        O = sparseIntArray;
        sparseIntArray.put(mri.i1, 1);
        sparseIntArray.put(mri.Z, 2);
        sparseIntArray.put(mri.v3, 3);
        sparseIntArray.put(mri.C5, 4);
        sparseIntArray.put(mri.f4, 5);
        sparseIntArray.put(mri.z5, 6);
        sparseIntArray.put(mri.e4, 7);
        sparseIntArray.put(mri.v4, 8);
        sparseIntArray.put(mri.d4, 9);
        sparseIntArray.put(mri.t1, 10);
        sparseIntArray.put(mri.P3, 11);
    }

    public gng(rk5 rk5Var, View view, Object[] objArr) {
        super(rk5Var, view, 0, (InnerCardImageView) objArr[2], (DeviceImageView) objArr[1], (TextView) objArr[10], (RelativeLayout) objArr[0], (TextView) objArr[3], (TextView) objArr[11], (RelativeLayout) objArr[9], (RelativeLayout) objArr[7], (RelativeLayout) objArr[5], (TextView) objArr[8], (TextView) objArr[6], (View) objArr[4]);
        this.M = -1L;
        this.D.setTag(null);
        o0(view);
        H();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean F() {
        synchronized (this) {
            try {
                return this.M != 0;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void H() {
        synchronized (this) {
            this.M = 1L;
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
            this.M = 0L;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean q0(int i, Object obj) {
        return true;
    }

    public gng(rk5 rk5Var, View view) {
        this(rk5Var, view, ViewDataBinding.P(rk5Var, view, 12, N, O));
    }
}
