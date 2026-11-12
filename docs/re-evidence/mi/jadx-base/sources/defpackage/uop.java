package defpackage;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.ViewDataBinding;
import com.google.android.material.tabs.TabItem;
import com.google.android.material.tabs.TabLayout;

/* JADX INFO: loaded from: classes10.dex */
public class uop extends top {
    public static final ViewDataBinding.i N = null;
    public static final SparseIntArray O;
    public final ConstraintLayout L;
    public long M;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        O = sparseIntArray;
        sparseIntArray.put(bsi.E7, 1);
        sparseIntArray.put(bsi.p, 2);
        sparseIntArray.put(bsi.S6, 3);
        sparseIntArray.put(bsi.y4, 4);
        sparseIntArray.put(bsi.f5, 5);
        sparseIntArray.put(bsi.l7, 6);
        sparseIntArray.put(bsi.t1, 7);
        sparseIntArray.put(bsi.r1, 8);
        sparseIntArray.put(bsi.u1, 9);
        sparseIntArray.put(bsi.s1, 10);
        sparseIntArray.put(bsi.N, 11);
    }

    public uop(rk5 rk5Var, View view, Object[] objArr) {
        super(rk5Var, view, 0, (ImageView) objArr[2], (FrameLayout) objArr[11], (TabItem) objArr[8], (TabItem) objArr[10], (TabItem) objArr[7], (TabItem) objArr[9], (ImageView) objArr[4], (View) objArr[5], (TextView) objArr[3], (TabLayout) objArr[6], (RelativeLayout) objArr[1]);
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

    public uop(rk5 rk5Var, View view) {
        this(rk5Var, view, ViewDataBinding.P(rk5Var, view, 12, N, O));
    }
}
