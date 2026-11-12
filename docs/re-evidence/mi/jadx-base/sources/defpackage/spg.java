package defpackage;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.LinearLayout;
import androidx.databinding.ViewDataBinding;
import com.xiaomi.fitness.nfc.ui.NfcSettingViewModel;
import com.xiaomi.fitness.nfc.widget.SetRightArrowView;
import com.xiaomi.fitness.widget.SwitchButtonTwoLineTextView;

/* JADX INFO: loaded from: classes9.dex */
public class spg extends rpg {
    public static final ViewDataBinding.i I = null;
    public static final SparseIntArray J;
    public long H;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        J = sparseIntArray;
        sparseIntArray.put(mri.Y3, 1);
        sparseIntArray.put(mri.u, 2);
        sparseIntArray.put(mri.x, 3);
        sparseIntArray.put(mri.K4, 4);
        sparseIntArray.put(mri.B1, 5);
    }

    public spg(rk5 rk5Var, View view, Object[] objArr) {
        super(rk5Var, view, 0, (SetRightArrowView) objArr[2], (SwitchButtonTwoLineTextView) objArr[3], (SetRightArrowView) objArr[5], (LinearLayout) objArr[0], (SetRightArrowView) objArr[1], (SetRightArrowView) objArr[4]);
        this.H = -1L;
        this.D.setTag(null);
        o0(view);
        H();
    }

    public void A0(NfcSettingViewModel nfcSettingViewModel) {
        this.G = nfcSettingViewModel;
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
            this.H = 2L;
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
        if (hv1.f20500a != i) {
            return false;
        }
        A0((NfcSettingViewModel) obj);
        return true;
    }

    public spg(rk5 rk5Var, View view) {
        this(rk5Var, view, ViewDataBinding.P(rk5Var, view, 6, I, J));
    }
}
