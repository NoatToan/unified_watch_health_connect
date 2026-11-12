package defpackage;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.ViewDataBinding;
import com.xiaomi.fitness.electronic.scale.widget.BodyConditionView;

/* JADX INFO: loaded from: classes8.dex */
public class g68 extends f68 {
    public static final ViewDataBinding.i K = null;
    public static final SparseIntArray L;
    public final ConstraintLayout I;
    public long J;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        L = sparseIntArray;
        sparseIntArray.put(bri.I5, 1);
        sparseIntArray.put(bri.O6, 2);
        sparseIntArray.put(bri.H6, 3);
        sparseIntArray.put(bri.A6, 4);
        sparseIntArray.put(bri.t6, 5);
        sparseIntArray.put(bri.G6, 6);
        sparseIntArray.put(bri.N6, 7);
        sparseIntArray.put(bri.m6, 8);
    }

    public g68(rk5 rk5Var, View view, Object[] objArr) {
        super(rk5Var, view, 0, (TextView) objArr[1], (BodyConditionView) objArr[8], (BodyConditionView) objArr[5], (BodyConditionView) objArr[4], (BodyConditionView) objArr[6], (BodyConditionView) objArr[3], (BodyConditionView) objArr[7], (BodyConditionView) objArr[2]);
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

    public g68(rk5 rk5Var, View view) {
        this(rk5Var, view, ViewDataBinding.P(rk5Var, view, 9, K, L));
    }
}
