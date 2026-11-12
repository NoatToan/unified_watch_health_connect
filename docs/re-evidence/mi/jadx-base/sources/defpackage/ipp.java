package defpackage;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;
import com.google.android.material.tabs.TabLayout;
import com.xiaomi.fitness.detail.view.SportShareEditView;

/* JADX INFO: loaded from: classes10.dex */
public class ipp extends gpp {
    public static final ViewDataBinding.i M = null;
    public static final SparseIntArray N;
    public final ConstraintLayout K;
    public long L;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        N = sparseIntArray;
        sparseIntArray.put(bsi.q6, 1);
        sparseIntArray.put(bsi.f, 2);
        sparseIntArray.put(bsi.o, 3);
        sparseIntArray.put(bsi.n7, 4);
        sparseIntArray.put(bsi.l7, 5);
        sparseIntArray.put(bsi.Z4, 6);
        sparseIntArray.put(bsi.da, 7);
        sparseIntArray.put(bsi.ca, 8);
        sparseIntArray.put(bsi.A, 9);
        sparseIntArray.put(bsi.X6, 10);
    }

    public ipp(rk5 rk5Var, View view, Object[] objArr) {
        super(rk5Var, view, 0, (ConstraintLayout) objArr[2], (ImageView) objArr[3], (RecyclerView) objArr[9], (TextView) objArr[6], (View) objArr[1], (SportShareEditView) objArr[10], (ImageView) objArr[4], (TabLayout) objArr[5], (ViewPager2) objArr[8], (ConstraintLayout) objArr[7]);
        this.L = -1L;
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[0];
        this.K = constraintLayout;
        constraintLayout.setTag(null);
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

    public ipp(rk5 rk5Var, View view) {
        this(rk5Var, view, ViewDataBinding.P(rk5Var, view, 11, M, N));
    }
}
