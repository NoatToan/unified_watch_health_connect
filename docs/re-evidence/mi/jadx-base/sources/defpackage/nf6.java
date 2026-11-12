package defpackage;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import miuix.androidbasewidget.widget.ProgressBar;

/* JADX INFO: loaded from: classes8.dex */
public class nf6 extends mf6 {
    public static final ViewDataBinding.i K = null;
    public static final SparseIntArray L;
    public final RelativeLayout I;
    public long J;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        L = sparseIntArray;
        sparseIntArray.put(zqi.r3, 1);
        sparseIntArray.put(zqi.S8, 2);
        sparseIntArray.put(zqi.T8, 3);
        sparseIntArray.put(zqi.R8, 4);
        sparseIntArray.put(zqi.B4, 5);
        sparseIntArray.put(zqi.O2, 6);
        sparseIntArray.put(zqi.D3, 7);
        sparseIntArray.put(zqi.xa, 8);
    }

    public nf6(rk5 rk5Var, View view, Object[] objArr) {
        super(rk5Var, view, 0, (LinearLayout) objArr[6], (ConstraintLayout) objArr[1], (ImageView) objArr[7], (RecyclerView) objArr[5], (ProgressBar) objArr[4], (TextView) objArr[2], (TextView) objArr[3], (TextView) objArr[8]);
        this.J = -1L;
        RelativeLayout relativeLayout = (RelativeLayout) objArr[0];
        this.I = relativeLayout;
        relativeLayout.setTag(null);
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

    public nf6(rk5 rk5Var, View view) {
        this(rk5Var, view, ViewDataBinding.P(rk5Var, view, 9, K, L));
    }
}
