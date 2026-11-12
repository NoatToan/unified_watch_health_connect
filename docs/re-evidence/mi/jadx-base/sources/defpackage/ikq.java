package defpackage;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.databinding.ViewDataBinding;
import com.xiaomi.fitness.userinfo.medicalid.baseui.DisplayItemView;
import com.xiaomi.fitness.widget.view.RoundImageView;

/* JADX INFO: loaded from: classes10.dex */
public class ikq extends hkq {
    public static final ViewDataBinding.i M = null;
    public static final SparseIntArray N;
    public final RelativeLayout K;
    public long L;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        N = sparseIntArray;
        sparseIntArray.put(hsi.N, 1);
        sparseIntArray.put(hsi.z1, 2);
        sparseIntArray.put(hsi.u1, 3);
        sparseIntArray.put(hsi.g, 4);
        sparseIntArray.put(hsi.B, 5);
        sparseIntArray.put(hsi.e, 6);
        sparseIntArray.put(hsi.q, 7);
        sparseIntArray.put(hsi.p1, 8);
        sparseIntArray.put(hsi.A, 9);
        sparseIntArray.put(hsi.s, 10);
    }

    public ikq(rk5 rk5Var, View view, Object[] objArr) {
        super(rk5Var, view, 0, (DisplayItemView) objArr[6], (DisplayItemView) objArr[4], (DisplayItemView) objArr[7], (DisplayItemView) objArr[10], (View) objArr[9], (DisplayItemView) objArr[5], (RoundImageView) objArr[1], (DisplayItemView) objArr[8], (TextView) objArr[3], (TextView) objArr[2]);
        this.L = -1L;
        RelativeLayout relativeLayout = (RelativeLayout) objArr[0];
        this.K = relativeLayout;
        relativeLayout.setTag(null);
        o0(view);
        H();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean F() {
        synchronized (this) {
            try {
                return this.L != 0;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void H() {
        synchronized (this) {
            this.L = 1L;
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
            this.L = 0L;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean q0(int i, Object obj) {
        return true;
    }

    public ikq(rk5 rk5Var, View view) {
        this(rk5Var, view, ViewDataBinding.P(rk5Var, view, 11, M, N));
    }
}
