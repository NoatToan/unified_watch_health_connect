package defpackage;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: loaded from: classes8.dex */
public class vh6 extends uh6 {
    public static final ViewDataBinding.i K = null;
    public static final SparseIntArray L;
    public final ConstraintLayout I;
    public long J;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        L = sparseIntArray;
        sparseIntArray.put(zqi.q2, 1);
        sparseIntArray.put(zqi.r2, 2);
        sparseIntArray.put(zqi.b4, 3);
        sparseIntArray.put(zqi.a4, 4);
        sparseIntArray.put(zqi.P2, 5);
        sparseIntArray.put(zqi.I3, 6);
        sparseIntArray.put(zqi.za, 7);
        sparseIntArray.put(zqi.Aa, 8);
    }

    public vh6(rk5 rk5Var, View view, Object[] objArr) {
        super(rk5Var, view, 0, (TextView) objArr[1], (RecyclerView) objArr[2], (LinearLayout) objArr[5], (ImageView) objArr[6], (RecyclerView) objArr[4], (TextView) objArr[3], (TextView) objArr[7], (TextView) objArr[8]);
        this.J = -1L;
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[0];
        this.I = constraintLayout;
        constraintLayout.setTag(null);
        o0(view);
        H();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean F() {
        synchronized (this) {
            try {
                return this.J != 0;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void H() {
        synchronized (this) {
            this.J = 1L;
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
            this.J = 0L;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean q0(int i, Object obj) {
        return true;
    }

    public vh6(rk5 rk5Var, View view) {
        this(rk5Var, view, ViewDataBinding.P(rk5Var, view, 9, K, L));
    }
}
