package defpackage;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import com.xiaomi.fitness.detail.view.ShareTrackLineView;
import com.xiaomi.fitness.share.view.ShareRoutineView;
import com.xiaomi.fitness.widget.view.RoundImageView;

/* JADX INFO: loaded from: classes10.dex */
public class nod extends mod {
    public static final ViewDataBinding.i M = null;
    public static final SparseIntArray N;
    public final ConstraintLayout K;
    public long L;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        N = sparseIntArray;
        sparseIntArray.put(bsi.h2, 1);
        sparseIntArray.put(bsi.B4, 2);
        sparseIntArray.put(bsi.C6, 3);
        sparseIntArray.put(bsi.V3, 4);
        sparseIntArray.put(bsi.P9, 5);
        sparseIntArray.put(bsi.U3, 6);
        sparseIntArray.put(bsi.y8, 7);
        sparseIntArray.put(bsi.l6, 8);
        sparseIntArray.put(bsi.Z5, 9);
        sparseIntArray.put(bsi.k5, 10);
    }

    public nod(rk5 rk5Var, View view, Object[] objArr) {
        super(rk5Var, view, 0, (RoundImageView) objArr[1], (TextView) objArr[6], (TextView) objArr[4], (TextView) objArr[2], (RecyclerView) objArr[10], (ShareRoutineView) objArr[9], (ShareTrackLineView) objArr[8], (TextView) objArr[3], (TextView) objArr[7], (TextView) objArr[5]);
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

    public nod(rk5 rk5Var, View view) {
        this(rk5Var, view, ViewDataBinding.P(rk5Var, view, 11, M, N));
    }
}
