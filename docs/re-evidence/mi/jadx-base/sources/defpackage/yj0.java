package defpackage;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.databinding.ViewDataBinding;
import com.xiaomi.fitness.electronic.scale.widget.NoScrollRecyclerView;
import miuix.core.widget.NestedScrollView;
import miuix.springback.view.SpringBackLayout;

/* JADX INFO: loaded from: classes8.dex */
public class yj0 extends xj0 {
    public static final ViewDataBinding.i J = null;
    public static final SparseIntArray K;
    public final RelativeLayout H;
    public long I;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        K = sparseIntArray;
        sparseIntArray.put(bri.I3, 1);
        sparseIntArray.put(bri.Q3, 2);
        sparseIntArray.put(bri.v1, 3);
        sparseIntArray.put(bri.f4513b, 4);
        sparseIntArray.put(bri.n0, 5);
        sparseIntArray.put(bri.G5, 6);
        sparseIntArray.put(bri.N, 7);
    }

    public yj0(rk5 rk5Var, View view, Object[] objArr) {
        super(rk5Var, view, 0, (NoScrollRecyclerView) objArr[4], (Button) objArr[7], (RelativeLayout) objArr[5], (LinearLayout) objArr[3], (SpringBackLayout) objArr[1], (NestedScrollView) objArr[2], (TextView) objArr[6]);
        this.I = -1L;
        RelativeLayout relativeLayout = (RelativeLayout) objArr[0];
        this.H = relativeLayout;
        relativeLayout.setTag(null);
        o0(view);
        H();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean F() {
        synchronized (this) {
            try {
                return this.I != 0;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void H() {
        synchronized (this) {
            this.I = 1L;
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
            this.I = 0L;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean q0(int i, Object obj) {
        return true;
    }

    public yj0(rk5 rk5Var, View view) {
        this(rk5Var, view, ViewDataBinding.P(rk5Var, view, 8, J, K));
    }
}
