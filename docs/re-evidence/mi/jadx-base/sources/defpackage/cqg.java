package defpackage;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.CheckBox;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.databinding.ViewDataBinding;
import com.xiaomi.fitness.nfc.widget.DeviceImageView;
import com.xiaomi.fitness.nfc.widget.InnerCardImageView;

/* JADX INFO: loaded from: classes9.dex */
public class cqg extends bqg {
    public static final ViewDataBinding.i I = null;
    public static final SparseIntArray J;
    public long H;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        J = sparseIntArray;
        sparseIntArray.put(mri.i1, 1);
        sparseIntArray.put(mri.Z, 2);
        sparseIntArray.put(mri.V4, 3);
        sparseIntArray.put(mri.V2, 4);
        sparseIntArray.put(mri.B0, 5);
        sparseIntArray.put(mri.G3, 6);
    }

    public cqg(rk5 rk5Var, View view, Object[] objArr) {
        super(rk5Var, view, 0, (InnerCardImageView) objArr[2], (CheckBox) objArr[5], (DeviceImageView) objArr[1], (RelativeLayout) objArr[0], (LinearLayout) objArr[4], (TextView) objArr[6], (TextView) objArr[3]);
        this.H = -1L;
        this.D.setTag(null);
        o0(view);
        H();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean F() {
        synchronized (this) {
            try {
                return this.H != 0;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void H() {
        synchronized (this) {
            this.H = 1L;
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
            this.H = 0L;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean q0(int i, Object obj) {
        return true;
    }

    public cqg(rk5 rk5Var, View view) {
        this(rk5Var, view, ViewDataBinding.P(rk5Var, view, 7, I, J));
    }
}
