package defpackage;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.databinding.ViewDataBinding;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.xiaomi.fitness.habit.widget.MoreRecyclerView;
import com.xiaomi.fitness.habit.widget.StateLayout;

/* JADX INFO: loaded from: classes8.dex */
public class beb extends aeb {
    public static final ViewDataBinding.i H = null;
    public static final SparseIntArray I;
    public final FrameLayout F;
    public long G;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        I = sparseIntArray;
        sparseIntArray.put(dri.q, 2);
        sparseIntArray.put(dri.J, 3);
        sparseIntArray.put(dri.U, 4);
        sparseIntArray.put(dri.B, 5);
    }

    public beb(rk5 rk5Var, View view, Object[] objArr) {
        super(rk5Var, view, 0, (View) objArr[2], (MoreRecyclerView) objArr[5], (SwipeRefreshLayout) objArr[3], (LinearLayout) objArr[0], (StateLayout) objArr[4]);
        this.G = -1L;
        FrameLayout frameLayout = (FrameLayout) objArr[1];
        this.F = frameLayout;
        frameLayout.setTag(null);
        this.D.setTag(null);
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

    public beb(rk5 rk5Var, View view) {
        this(rk5Var, view, ViewDataBinding.P(rk5Var, view, 6, H, I));
    }
}
