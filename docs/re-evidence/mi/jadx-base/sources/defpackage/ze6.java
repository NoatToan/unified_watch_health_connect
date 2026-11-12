package defpackage;

import android.util.SparseIntArray;
import android.view.View;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.databinding.ViewDataBinding;
import com.xiaomi.fitness.widget.RightArrowSingleLineTextView;

/* JADX INFO: loaded from: classes8.dex */
public class ze6 extends ye6 {
    public static final ViewDataBinding.i L = null;
    public static final SparseIntArray M;
    public final LinearLayoutCompat J;
    public long K;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        M = sparseIntArray;
        sparseIntArray.put(zqi.v5, 1);
        sparseIntArray.put(zqi.w5, 2);
        sparseIntArray.put(zqi.s5, 3);
        sparseIntArray.put(zqi.t5, 4);
        sparseIntArray.put(zqi.t2, 5);
        sparseIntArray.put(zqi.u2, 6);
        sparseIntArray.put(zqi.f41577a, 7);
        sparseIntArray.put(zqi.L5, 8);
        sparseIntArray.put(zqi.c8, 9);
    }

    public ze6(rk5 rk5Var, View view, Object[] objArr) {
        super(rk5Var, view, 0, (RightArrowSingleLineTextView) objArr[7], (RightArrowSingleLineTextView) objArr[5], (RightArrowSingleLineTextView) objArr[6], (RightArrowSingleLineTextView) objArr[3], (RightArrowSingleLineTextView) objArr[4], (RightArrowSingleLineTextView) objArr[1], (RightArrowSingleLineTextView) objArr[2], (RightArrowSingleLineTextView) objArr[8], (RightArrowSingleLineTextView) objArr[9]);
        this.K = -1L;
        LinearLayoutCompat linearLayoutCompat = (LinearLayoutCompat) objArr[0];
        this.J = linearLayoutCompat;
        linearLayoutCompat.setTag(null);
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

    public ze6(rk5 rk5Var, View view) {
        this(rk5Var, view, ViewDataBinding.P(rk5Var, view, 10, L, M));
    }
}
