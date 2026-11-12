package defpackage;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.databinding.ViewDataBinding;
import androidx.lifecycle.LifecycleOwner;

/* JADX INFO: loaded from: classes10.dex */
public class wx7 extends vx7 {
    public static final ViewDataBinding.i H;
    public static final SparseIntArray I;
    public final LinearLayout F;
    public long G;

    static {
        ViewDataBinding.i iVar = new ViewDataBinding.i(6);
        H = iVar;
        iVar.a(0, new String[]{"eco_sport_ble_update_fragment_bottom"}, new int[]{1}, new int[]{fvi.t});
        SparseIntArray sparseIntArray = new SparseIntArray();
        I = sparseIntArray;
        sparseIntArray.put(zri.G2, 2);
        sparseIntArray.put(zri.z3, 3);
        sparseIntArray.put(zri.H2, 4);
        sparseIntArray.put(zri.w, 5);
    }

    public wx7(rk5 rk5Var, View view, Object[] objArr) {
        super(rk5Var, view, 1, (px7) objArr[1], (TextView) objArr[5], (ImageView) objArr[2], (TextView) objArr[4], (TextView) objArr[3]);
        this.G = -1L;
        k0(this.A);
        LinearLayout linearLayout = (LinearLayout) objArr[0];
        this.F = linearLayout;
        linearLayout.setTag(null);
        o0(view);
        H();
    }

    public final boolean C0(px7 px7Var, int i) {
        if (i != pv1.f30813a) {
            return false;
        }
        synchronized (this) {
            this.G |= 1;
        }
        return true;
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean F() {
        synchronized (this) {
            try {
                if (this.G != 0) {
                    return true;
                }
                return this.A.F();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void H() {
        synchronized (this) {
            this.G = 2L;
        }
        this.A.H();
        e0();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean W(int i, Object obj, int i2) {
        if (i != 0) {
            return false;
        }
        return C0((px7) obj, i2);
    }

    @Override // androidx.databinding.ViewDataBinding
    public void l0(LifecycleOwner lifecycleOwner) {
        super.l0(lifecycleOwner);
        this.A.l0(lifecycleOwner);
    }

    @Override // androidx.databinding.ViewDataBinding
    public void o() {
        synchronized (this) {
            this.G = 0L;
        }
        ViewDataBinding.r(this.A);
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean q0(int i, Object obj) {
        return true;
    }

    public wx7(rk5 rk5Var, View view) {
        this(rk5Var, view, ViewDataBinding.P(rk5Var, view, 6, H, I));
    }
}
