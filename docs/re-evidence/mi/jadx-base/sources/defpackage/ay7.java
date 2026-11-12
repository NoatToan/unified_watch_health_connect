package defpackage;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.LinearLayout;
import androidx.core.widget.NestedScrollView;
import androidx.databinding.ViewDataBinding;
import com.xiaomi.fitness.sport_eco.view.widget.SportRadioView;
import com.xiaomi.fitness.widget.RightArrowSingleLineTextView;
import com.xiaomi.fitness.widget.SwitchButtonTwoLineTextView;

/* JADX INFO: loaded from: classes10.dex */
public class ay7 extends zx7 {
    public static final ViewDataBinding.i L = null;
    public static final SparseIntArray M;
    public final NestedScrollView J;
    public long K;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        M = sparseIntArray;
        sparseIntArray.put(zri.C3, 1);
        sparseIntArray.put(zri.i1, 2);
        sparseIntArray.put(zri.E1, 3);
        sparseIntArray.put(zri.z0, 4);
        sparseIntArray.put(zri.H1, 5);
        sparseIntArray.put(zri.F1, 6);
        sparseIntArray.put(zri.C1, 7);
        sparseIntArray.put(zri.D1, 8);
        sparseIntArray.put(zri.G1, 9);
    }

    public ay7(rk5 rk5Var, View view, Object[] objArr) {
        super(rk5Var, view, 0, (LinearLayout) objArr[4], (RightArrowSingleLineTextView) objArr[2], (SportRadioView) objArr[7], (SportRadioView) objArr[8], (SwitchButtonTwoLineTextView) objArr[3], (SportRadioView) objArr[6], (SportRadioView) objArr[9], (SportRadioView) objArr[5], (LinearLayout) objArr[1]);
        this.K = -1L;
        NestedScrollView nestedScrollView = (NestedScrollView) objArr[0];
        this.J = nestedScrollView;
        nestedScrollView.setTag(null);
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

    public ay7(rk5 rk5Var, View view) {
        this(rk5Var, view, ViewDataBinding.P(rk5Var, view, 10, L, M));
    }
}
