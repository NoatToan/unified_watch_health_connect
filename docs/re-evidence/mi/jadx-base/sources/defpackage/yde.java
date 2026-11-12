package defpackage;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.LinearLayout;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import com.xiaomi.fitness.baseui.widget.LevelBarView;
import com.xiaomi.fitness.view.CardUnderstandView;

/* JADX INFO: loaded from: classes9.dex */
public class yde extends xde {
    public static final ViewDataBinding.i I = null;
    public static final SparseIntArray J;
    public final LinearLayout G;
    public long H;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        J = sparseIntArray;
        sparseIntArray.put(eri.fp, 1);
        sparseIntArray.put(eri.Od, 2);
        sparseIntArray.put(eri.gp, 3);
        sparseIntArray.put(eri.ma, 4);
        sparseIntArray.put(eri.ra, 5);
        sparseIntArray.put(eri.uo, 6);
    }

    public yde(rk5 rk5Var, View view, Object[] objArr) {
        super(rk5Var, view, 0, (LevelBarView) objArr[4], (RecyclerView) objArr[5], (RecyclerView) objArr[2], (CardUnderstandView) objArr[6], (LinearLayout) objArr[1], (View) objArr[3]);
        this.H = -1L;
        LinearLayout linearLayout = (LinearLayout) objArr[0];
        this.G = linearLayout;
        linearLayout.setTag(null);
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

    public yde(rk5 rk5Var, View view) {
        this(rk5Var, view, ViewDataBinding.P(rk5Var, view, 7, I, J));
    }
}
