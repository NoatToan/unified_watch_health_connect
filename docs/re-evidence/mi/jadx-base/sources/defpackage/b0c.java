package defpackage;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import androidx.databinding.ViewDataBinding;
import androidx.lifecycle.LifecycleOwner;
import androidx.recyclerview.widget.RecyclerView;
import com.xiaomi.fitness.health.weight.view.WeightSegmentalView;

/* JADX INFO: loaded from: classes9.dex */
public class b0c extends a0c {
    public static final ViewDataBinding.i W;
    public static final SparseIntArray X;
    public final ConstraintLayout U;
    public long V;

    static {
        ViewDataBinding.i iVar = new ViewDataBinding.i(21);
        W = iVar;
        iVar.a(0, new String[]{"health_layout_common_card_icon_title"}, new int[]{2}, new int[]{jui.h4});
        int i = jui.f4;
        iVar.a(1, new String[]{"health_layout_card_data_item", "health_layout_card_data_item", "health_layout_card_data_item", "health_layout_card_data_item", "health_layout_card_data_item"}, new int[]{3, 4, 5, 6, 7}, new int[]{i, i, i, i, i});
        SparseIntArray sparseIntArray = new SparseIntArray();
        X = sparseIntArray;
        sparseIntArray.put(eri.va, 8);
        sparseIntArray.put(eri.s9, 9);
        sparseIntArray.put(eri.zl, 10);
        sparseIntArray.put(eri.u5, 11);
        sparseIntArray.put(eri.v5, 12);
        sparseIntArray.put(eri.ap, 13);
        sparseIntArray.put(eri.bp, 14);
        sparseIntArray.put(eri.ln, 15);
        sparseIntArray.put(eri.mn, 16);
        sparseIntArray.put(eri.Gl, 17);
        sparseIntArray.put(eri.Hl, 18);
        sparseIntArray.put(eri.nn, 19);
        sparseIntArray.put(eri.on, 20);
    }

    public b0c(rk5 rk5Var, View view, Object[] objArr) {
        super(rk5Var, view, 6, (LinearLayout) objArr[0], (Guideline) objArr[11], (Guideline) objArr[12], (WeightSegmentalView) objArr[9], (qxb) objArr[2], (RecyclerView) objArr[8], (TextView) objArr[10], (TextView) objArr[17], (TextView) objArr[18], (TextView) objArr[15], (TextView) objArr[16], (TextView) objArr[19], (TextView) objArr[20], (View) objArr[13], (View) objArr[14], (mxb) objArr[4], (mxb) objArr[3], (mxb) objArr[7], (mxb) objArr[5], (mxb) objArr[6]);
        this.V = -1L;
        this.A.setTag(null);
        k0(this.E);
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[1];
        this.U = constraintLayout;
        constraintLayout.setTag(null);
        k0(this.P);
        k0(this.Q);
        k0(this.R);
        k0(this.S);
        k0(this.T);
        o0(view);
        H();
    }

    private boolean A0(qxb qxbVar, int i) {
        if (i != cv1.f14763a) {
            return false;
        }
        synchronized (this) {
            this.V |= 32;
        }
        return true;
    }

    public final boolean B0(mxb mxbVar, int i) {
        if (i != cv1.f14763a) {
            return false;
        }
        synchronized (this) {
            this.V |= 4;
        }
        return true;
    }

    public final boolean C0(mxb mxbVar, int i) {
        if (i != cv1.f14763a) {
            return false;
        }
        synchronized (this) {
            this.V |= 16;
        }
        return true;
    }

    public final boolean D0(mxb mxbVar, int i) {
        if (i != cv1.f14763a) {
            return false;
        }
        synchronized (this) {
            this.V |= 1;
        }
        return true;
    }

    public final boolean E0(mxb mxbVar, int i) {
        if (i != cv1.f14763a) {
            return false;
        }
        synchronized (this) {
            this.V |= 2;
        }
        return true;
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean F() {
        synchronized (this) {
            try {
                if (this.V != 0) {
                    return true;
                }
                return this.E.F() || this.Q.F() || this.P.F() || this.S.F() || this.T.F() || this.R.F();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final boolean F0(mxb mxbVar, int i) {
        if (i != cv1.f14763a) {
            return false;
        }
        synchronized (this) {
            this.V |= 8;
        }
        return true;
    }

    @Override // androidx.databinding.ViewDataBinding
    public void H() {
        synchronized (this) {
            this.V = 64L;
        }
        this.E.H();
        this.Q.H();
        this.P.H();
        this.S.H();
        this.T.H();
        this.R.H();
        e0();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean W(int i, Object obj, int i2) {
        if (i == 0) {
            return D0((mxb) obj, i2);
        }
        if (i == 1) {
            return E0((mxb) obj, i2);
        }
        if (i == 2) {
            return B0((mxb) obj, i2);
        }
        if (i == 3) {
            return F0((mxb) obj, i2);
        }
        if (i == 4) {
            return C0((mxb) obj, i2);
        }
        if (i != 5) {
            return false;
        }
        return A0((qxb) obj, i2);
    }

    @Override // androidx.databinding.ViewDataBinding
    public void l0(LifecycleOwner lifecycleOwner) {
        super.l0(lifecycleOwner);
        this.E.l0(lifecycleOwner);
        this.Q.l0(lifecycleOwner);
        this.P.l0(lifecycleOwner);
        this.S.l0(lifecycleOwner);
        this.T.l0(lifecycleOwner);
        this.R.l0(lifecycleOwner);
    }

    @Override // androidx.databinding.ViewDataBinding
    public void o() {
        synchronized (this) {
            this.V = 0L;
        }
        ViewDataBinding.r(this.E);
        ViewDataBinding.r(this.Q);
        ViewDataBinding.r(this.P);
        ViewDataBinding.r(this.S);
        ViewDataBinding.r(this.T);
        ViewDataBinding.r(this.R);
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean q0(int i, Object obj) {
        return true;
    }

    public b0c(rk5 rk5Var, View view) {
        this(rk5Var, view, ViewDataBinding.P(rk5Var, view, 21, W, X));
    }
}
