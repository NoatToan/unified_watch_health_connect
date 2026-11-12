package defpackage;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.databinding.ViewDataBinding;

/* JADX INFO: loaded from: classes10.dex */
public class s93 extends r93 {
    public static final ViewDataBinding.i N = null;
    public static final SparseIntArray O;
    public final LinearLayout L;
    public long M;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        O = sparseIntArray;
        sparseIntArray.put(dsi.i, 1);
        sparseIntArray.put(dsi.e, 2);
        sparseIntArray.put(dsi.f15892k, 3);
        sparseIntArray.put(dsi.h, 4);
        sparseIntArray.put(dsi.g, 5);
        sparseIntArray.put(dsi.f, 6);
        sparseIntArray.put(dsi.f15890a, 7);
        sparseIntArray.put(dsi.j, 8);
        sparseIntArray.put(dsi.l, 9);
        sparseIntArray.put(dsi.o, 10);
        sparseIntArray.put(dsi.d, 11);
    }

    public s93(rk5 rk5Var, View view, Object[] objArr) {
        super(rk5Var, view, 0, (LinearLayout) objArr[7], (TextView) objArr[11], (RelativeLayout) objArr[2], (TextView) objArr[6], (TextView) objArr[5], (TextView) objArr[4], (ImageView) objArr[1], (TextView) objArr[8], (LinearLayout) objArr[3], (TextView) objArr[9], (TextView) objArr[10]);
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

    public s93(rk5 rk5Var, View view) {
        this(rk5Var, view, ViewDataBinding.P(rk5Var, view, 12, N, O));
    }
}
