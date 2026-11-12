package defpackage;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager.widget.ViewPager;

/* JADX INFO: loaded from: classes10.dex */
public class k2a extends j2a {
    public static final ViewDataBinding.i N = null;
    public static final SparseIntArray O;
    public final LinearLayout L;
    public long M;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        O = sparseIntArray;
        sparseIntArray.put(csi.K3, 1);
        sparseIntArray.put(csi.L1, 2);
        sparseIntArray.put(csi.P4, 3);
        sparseIntArray.put(csi.k5, 4);
        sparseIntArray.put(csi.E3, 5);
        sparseIntArray.put(csi.k0, 6);
        sparseIntArray.put(csi.P2, 7);
        sparseIntArray.put(csi.y3, 8);
        sparseIntArray.put(csi.m5, 9);
        sparseIntArray.put(csi.V, 10);
        sparseIntArray.put(csi.S1, 11);
    }

    public k2a(rk5 rk5Var, View view, Object[] objArr) {
        super(rk5Var, view, 0, (RecyclerView) objArr[10], (TextView) objArr[6], (TextView) objArr[2], (TextView) objArr[11], (TextView) objArr[7], (TextView) objArr[8], (TextView) objArr[5], (LinearLayout) objArr[1], (TextView) objArr[3], (TextView) objArr[4], (ViewPager) objArr[9]);
        this.M = -1L;
        LinearLayout linearLayout = (LinearLayout) objArr[0];
        this.L = linearLayout;
        linearLayout.setTag(null);
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

    public k2a(rk5 rk5Var, View view) {
        this(rk5Var, view, ViewDataBinding.P(rk5Var, view, 12, N, O));
    }
}
