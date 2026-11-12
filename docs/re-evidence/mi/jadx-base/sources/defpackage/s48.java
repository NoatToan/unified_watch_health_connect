package defpackage;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import com.xiaomi.fitness.baseui.widget.LevelBarView;

/* JADX INFO: loaded from: classes8.dex */
public class s48 extends r48 {
    public static final ViewDataBinding.i N = null;
    public static final SparseIntArray O;
    public final ConstraintLayout L;
    public long M;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        O = sparseIntArray;
        sparseIntArray.put(bri.w6, 1);
        sparseIntArray.put(bri.x6, 2);
        sparseIntArray.put(bri.P5, 3);
        sparseIntArray.put(bri.K5, 4);
        sparseIntArray.put(bri.R4, 5);
        sparseIntArray.put(bri.F4, 6);
        sparseIntArray.put(bri.E4, 7);
        sparseIntArray.put(bri.v6, 8);
        sparseIntArray.put(bri.N1, 9);
        sparseIntArray.put(bri.O1, 10);
        sparseIntArray.put(bri.x4, 11);
    }

    public s48(rk5 rk5Var, View view, Object[] objArr) {
        super(rk5Var, view, 0, (LevelBarView) objArr[9], (RecyclerView) objArr[10], (TextView) objArr[11], (TextView) objArr[7], (TextView) objArr[6], (TextView) objArr[5], (TextView) objArr[4], (TextView) objArr[3], (View) objArr[8], (View) objArr[1], (View) objArr[2]);
        this.M = -1L;
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[0];
        this.L = constraintLayout;
        constraintLayout.setTag(null);
        o0(view);
        H();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean F() {
        synchronized (this) {
            try {
                return this.M != 0;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void H() {
        synchronized (this) {
            this.M = 1L;
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
            this.M = 0L;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean q0(int i, Object obj) {
        return true;
    }

    public s48(rk5 rk5Var, View view) {
        this(rk5Var, view, ViewDataBinding.P(rk5Var, view, 12, N, O));
    }
}
