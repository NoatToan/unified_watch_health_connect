package defpackage;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.LinearLayout;
import androidx.databinding.ViewDataBinding;
import com.xiaomi.fitness.nfc.widget.SetRightArrowView;
import com.xiaomi.fitness.nfc.widget.TSMSetRightArrowView;

/* JADX INFO: loaded from: classes9.dex */
public class epg extends dpg {
    public static final ViewDataBinding.i L = null;
    public static final SparseIntArray M;
    public long K;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        M = sparseIntArray;
        sparseIntArray.put(mri.T, 1);
        sparseIntArray.put(mri.L3, 2);
        sparseIntArray.put(mri.A2, 3);
        sparseIntArray.put(mri.z2, 4);
        sparseIntArray.put(mri.Y3, 5);
        sparseIntArray.put(mri.t4, 6);
        sparseIntArray.put(mri.s4, 7);
        sparseIntArray.put(mri.a4, 8);
        sparseIntArray.put(mri.j3, 9);
    }

    public epg(rk5 rk5Var, View view, Object[] objArr) {
        super(rk5Var, view, 0, (TSMSetRightArrowView) objArr[1], (LinearLayout) objArr[0], (SetRightArrowView) objArr[4], (SetRightArrowView) objArr[3], (SetRightArrowView) objArr[9], (SetRightArrowView) objArr[2], (SetRightArrowView) objArr[5], (SetRightArrowView) objArr[8], (SetRightArrowView) objArr[7], (SetRightArrowView) objArr[6]);
        this.K = -1L;
        this.B.setTag(null);
        o0(view);
        H();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean F() {
        synchronized (this) {
            try {
                return this.K != 0;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void H() {
        synchronized (this) {
            this.K = 1L;
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
            this.K = 0L;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean q0(int i, Object obj) {
        return true;
    }

    public epg(rk5 rk5Var, View view) {
        this(rk5Var, view, ViewDataBinding.P(rk5Var, view, 10, L, M));
    }
}
