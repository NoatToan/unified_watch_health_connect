package defpackage;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.appbar.AppBarLayout;

/* JADX INFO: loaded from: classes9.dex */
public class bca extends aca {
    public static final ViewDataBinding.i N = null;
    public static final SparseIntArray O;
    public final CoordinatorLayout L;
    public long M;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        O = sparseIntArray;
        sparseIntArray.put(eri.rj, 1);
        sparseIntArray.put(eri.V, 2);
        sparseIntArray.put(eri.Sc, 3);
        sparseIntArray.put(eri.y, 4);
        sparseIntArray.put(eri.Y, 5);
        sparseIntArray.put(eri.z5, 6);
        sparseIntArray.put(eri.Z, 7);
        sparseIntArray.put(eri.ej, 8);
        sparseIntArray.put(eri.gb, 9);
        sparseIntArray.put(eri.U2, 10);
        sparseIntArray.put(eri.Y1, 11);
    }

    public bca(rk5 rk5Var, View view, Object[] objArr) {
        super(rk5Var, view, 0, (AppBarLayout) objArr[4], (ImageView) objArr[2], (ImageView) objArr[5], (ImageView) objArr[7], (RecyclerView) objArr[11], (TextView) objArr[10], (ConstraintLayout) objArr[6], (TextView) objArr[9], (ImageView) objArr[3], (LinearLayout) objArr[8], (LinearLayout) objArr[1]);
        this.M = -1L;
        CoordinatorLayout coordinatorLayout = (CoordinatorLayout) objArr[0];
        this.L = coordinatorLayout;
        coordinatorLayout.setTag(null);
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

    public bca(rk5 rk5Var, View view) {
        this(rk5Var, view, ViewDataBinding.P(rk5Var, view, 12, N, O));
    }
}
