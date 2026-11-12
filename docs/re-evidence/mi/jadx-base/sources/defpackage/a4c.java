package defpackage;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import com.xiaomi.fitness.baseui.widget.LevelPercentBarView;

/* JADX INFO: loaded from: classes9.dex */
public class a4c extends z3c {
    public static final ViewDataBinding.i O = null;
    public static final SparseIntArray P;
    public final ConstraintLayout M;
    public long N;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        P = sparseIntArray;
        sparseIntArray.put(eri.Wo, 1);
        sparseIntArray.put(eri.Ro, 2);
        sparseIntArray.put(eri.Xo, 3);
        sparseIntArray.put(eri.qn, 4);
        sparseIntArray.put(eri.jn, 5);
        sparseIntArray.put(eri.Al, 6);
        sparseIntArray.put(eri.ol, 7);
        sparseIntArray.put(eri.nl, 8);
        sparseIntArray.put(eri.Vo, 9);
        sparseIntArray.put(eri.qa, 10);
        sparseIntArray.put(eri.ra, 11);
        sparseIntArray.put(eri.Nk, 12);
    }

    public a4c(rk5 rk5Var, View view, Object[] objArr) {
        super(rk5Var, view, 0, (LevelPercentBarView) objArr[10], (RecyclerView) objArr[11], (TextView) objArr[12], (TextView) objArr[8], (TextView) objArr[7], (TextView) objArr[6], (TextView) objArr[5], (TextView) objArr[4], (Guideline) objArr[2], (View) objArr[9], (View) objArr[1], (View) objArr[3]);
        this.N = -1L;
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[0];
        this.M = constraintLayout;
        constraintLayout.setTag(null);
        o0(view);
        H();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean F() {
        synchronized (this) {
            try {
                return this.N != 0;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void H() {
        synchronized (this) {
            this.N = 1L;
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
            this.N = 0L;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean q0(int i, Object obj) {
        return true;
    }

    public a4c(rk5 rk5Var, View view) {
        this(rk5Var, view, ViewDataBinding.P(rk5Var, view, 13, O, P));
    }
}
