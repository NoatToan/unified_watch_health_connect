package defpackage;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import androidx.core.widget.NestedScrollView;
import androidx.databinding.ViewDataBinding;
import androidx.lifecycle.LifecycleOwner;

/* JADX INFO: loaded from: classes10.dex */
public class ekq extends dkq {
    public static final ViewDataBinding.i I;
    public static final SparseIntArray J;
    public long H;

    static {
        ViewDataBinding.i iVar = new ViewDataBinding.i(7);
        I = iVar;
        iVar.a(1, new String[]{"userinfo_card_aid_record"}, new int[]{3}, new int[]{nvi.q});
        SparseIntArray sparseIntArray = new SparseIntArray();
        J = sparseIntArray;
        sparseIntArray.put(hsi.o1, 2);
        sparseIntArray.put(hsi.T0, 4);
        sparseIntArray.put(hsi.x1, 5);
        sparseIntArray.put(hsi.y1, 6);
    }

    public ekq(rk5 rk5Var, View view, Object[] objArr) {
        super(rk5Var, view, 1, (CardView) objArr[1], (RelativeLayout) objArr[0], (ujq) objArr[3], (NestedScrollView) objArr[4], (View) objArr[2], (TextView) objArr[5], (TextView) objArr[6]);
        this.H = -1L;
        this.A.setTag(null);
        this.B.setTag(null);
        k0(this.C);
        o0(view);
        H();
    }

    public final boolean A0(ujq ujqVar, int i) {
        if (i != sv1.f34012a) {
            return false;
        }
        synchronized (this) {
            this.H |= 1;
        }
        return true;
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean F() {
        synchronized (this) {
            try {
                if (this.H != 0) {
                    return true;
                }
                return this.C.F();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void H() {
        synchronized (this) {
            this.H = 2L;
        }
        this.C.H();
        e0();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean W(int i, Object obj, int i2) {
        if (i != 0) {
            return false;
        }
        return A0((ujq) obj, i2);
    }

    @Override // androidx.databinding.ViewDataBinding
    public void l0(LifecycleOwner lifecycleOwner) {
        super.l0(lifecycleOwner);
        this.C.l0(lifecycleOwner);
    }

    @Override // androidx.databinding.ViewDataBinding
    public void o() {
        synchronized (this) {
            this.H = 0L;
        }
        ViewDataBinding.r(this.C);
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean q0(int i, Object obj) {
        return true;
    }

    public ekq(rk5 rk5Var, View view) {
        this(rk5Var, view, ViewDataBinding.P(rk5Var, view, 7, I, J));
    }
}
