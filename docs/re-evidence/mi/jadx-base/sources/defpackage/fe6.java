package defpackage;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.Button;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: loaded from: classes8.dex */
public class fe6 extends ee6 {
    public static final ViewDataBinding.i G = null;
    public static final SparseIntArray H;
    public final LinearLayoutCompat E;
    public long F;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        H = sparseIntArray;
        sparseIntArray.put(zqi.V7, 1);
        sparseIntArray.put(zqi.k3, 2);
        sparseIntArray.put(zqi.p2, 3);
        sparseIntArray.put(zqi.q1, 4);
    }

    public fe6(rk5 rk5Var, View view, Object[] objArr) {
        super(rk5Var, view, 0, (RecyclerView) objArr[4], (Button) objArr[3], (Button) objArr[2], (Button) objArr[1]);
        this.F = -1L;
        LinearLayoutCompat linearLayoutCompat = (LinearLayoutCompat) objArr[0];
        this.E = linearLayoutCompat;
        linearLayoutCompat.setTag(null);
        o0(view);
        H();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean F() {
        synchronized (this) {
            try {
                return this.F != 0;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void H() {
        synchronized (this) {
            this.F = 1L;
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
            this.F = 0L;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean q0(int i, Object obj) {
        return true;
    }

    public fe6(rk5 rk5Var, View view) {
        this(rk5Var, view, ViewDataBinding.P(rk5Var, view, 5, G, H));
    }
}
