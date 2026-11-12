package defpackage;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.RelativeLayout;
import androidx.databinding.ViewDataBinding;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.xiaomi.fitness.habit.widget.MoreRecyclerView;
import com.xiaomi.fitness.habit.widget.StateLayout;

/* JADX INFO: loaded from: classes8.dex */
public class heb extends geb {
    public static final ViewDataBinding.i H = null;
    public static final SparseIntArray I;
    public final RelativeLayout F;
    public long G;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        I = sparseIntArray;
        sparseIntArray.put(dri.q, 1);
        sparseIntArray.put(dri.J, 2);
        sparseIntArray.put(dri.U, 3);
        sparseIntArray.put(dri.B, 4);
        sparseIntArray.put(dri.h, 5);
    }

    public heb(rk5 rk5Var, View view, Object[] objArr) {
        super(rk5Var, view, 0, (RelativeLayout) objArr[5], (View) objArr[1], (MoreRecyclerView) objArr[4], (SwipeRefreshLayout) objArr[2], (StateLayout) objArr[3]);
        this.G = -1L;
        RelativeLayout relativeLayout = (RelativeLayout) objArr[0];
        this.F = relativeLayout;
        relativeLayout.setTag(null);
        o0(view);
        H();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean F() {
        synchronized (this) {
            try {
                return this.G != 0;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void H() {
        synchronized (this) {
            this.G = 1L;
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
            this.G = 0L;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean q0(int i, Object obj) {
        return true;
    }

    public heb(rk5 rk5Var, View view) {
        this(rk5Var, view, ViewDataBinding.P(rk5Var, view, 6, H, I));
    }
}
