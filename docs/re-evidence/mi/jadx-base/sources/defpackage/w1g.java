package defpackage;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.CheckBox;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.ViewDataBinding;
import com.xiaomi.fitness.widget.view.DividerView;

/* JADX INFO: loaded from: classes9.dex */
public class w1g extends v1g {
    public static final ViewDataBinding.i O = null;
    public static final SparseIntArray P;
    public final ConstraintLayout M;
    public long N;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        P = sparseIntArray;
        sparseIntArray.put(lri.E, 1);
        sparseIntArray.put(lri.F, 2);
        sparseIntArray.put(lri.I, 3);
        sparseIntArray.put(lri.a1, 4);
        sparseIntArray.put(lri.B, 5);
        sparseIntArray.put(lri.A, 6);
        sparseIntArray.put(lri.p, 7);
        sparseIntArray.put(lri.j, 8);
        sparseIntArray.put(lri.l, 9);
        sparseIntArray.put(lri.f25379k, 10);
        sparseIntArray.put(lri.m, 11);
        sparseIntArray.put(lri.z0, 12);
    }

    public w1g(rk5 rk5Var, View view, Object[] objArr) {
        super(rk5Var, view, 0, (LinearLayout) objArr[8], (TextView) objArr[10], (TextView) objArr[9], (TextView) objArr[11], (ConstraintLayout) objArr[7], (TextView) objArr[6], (CheckBox) objArr[5], (ConstraintLayout) objArr[1], (TextView) objArr[2], (DividerView) objArr[3], (TextView) objArr[12], (LinearLayout) objArr[4]);
        this.N = -1L;
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[0];
        this.M = constraintLayout;
        constraintLayout.setTag(null);
        o0(view);
        H();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean F() {
        synchronized (this) {
            try {
                return this.N != 0;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void H() {
        synchronized (this) {
            this.N = 1L;
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
            this.N = 0L;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean q0(int i, Object obj) {
        return true;
    }

    public w1g(rk5 rk5Var, View view) {
        this(rk5Var, view, ViewDataBinding.P(rk5Var, view, 13, O, P));
    }
}
