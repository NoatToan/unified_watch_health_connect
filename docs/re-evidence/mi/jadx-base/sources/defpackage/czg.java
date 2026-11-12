package defpackage;

import android.util.SparseIntArray;
import android.view.View;
import androidx.databinding.ViewDataBinding;
import com.xiaomi.fitness.widget.RightArrowSingleLineTextView;
import com.xiaomi.fitness.widget.SwitchButtonSingleLineTextView;
import com.xiaomi.fitness.widget.SwitchButtonTwoLineTextView;
import miuix.core.widget.NestedScrollView;
import miuix.springback.view.SpringBackLayout;

/* JADX INFO: loaded from: classes9.dex */
public class czg extends bzg {
    public static final ViewDataBinding.i L = null;
    public static final SparseIntArray M;
    public final SpringBackLayout J;
    public long K;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        M = sparseIntArray;
        sparseIntArray.put(nri.I, 1);
        sparseIntArray.put(nri.h, 2);
        sparseIntArray.put(nri.j, 3);
        sparseIntArray.put(nri.g, 4);
        sparseIntArray.put(nri.i, 5);
        sparseIntArray.put(nri.H, 6);
        sparseIntArray.put(nri.G, 7);
        sparseIntArray.put(nri.n, 8);
        sparseIntArray.put(nri.o, 9);
    }

    public czg(rk5 rk5Var, View view, Object[] objArr) {
        super(rk5Var, view, 0, (SwitchButtonTwoLineTextView) objArr[4], (SwitchButtonTwoLineTextView) objArr[2], (SwitchButtonTwoLineTextView) objArr[5], (SwitchButtonSingleLineTextView) objArr[3], (SwitchButtonSingleLineTextView) objArr[8], (RightArrowSingleLineTextView) objArr[9], (RightArrowSingleLineTextView) objArr[7], (SwitchButtonSingleLineTextView) objArr[6], (NestedScrollView) objArr[1]);
        this.K = -1L;
        SpringBackLayout springBackLayout = (SpringBackLayout) objArr[0];
        this.J = springBackLayout;
        springBackLayout.setTag(null);
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

    public czg(rk5 rk5Var, View view) {
        this(rk5Var, view, ViewDataBinding.P(rk5Var, view, 10, L, M));
    }
}
