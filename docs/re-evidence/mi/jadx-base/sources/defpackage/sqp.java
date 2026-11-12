package defpackage;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.ViewDataBinding;
import androidx.lifecycle.LifecycleOwner;

/* JADX INFO: loaded from: classes10.dex */
public class sqp extends rqp {
    public static final ViewDataBinding.i J;
    public static final SparseIntArray K;
    public final ConstraintLayout H;
    public long I;

    static {
        ViewDataBinding.i iVar = new ViewDataBinding.i(8);
        J = iVar;
        int i = ivi.H1;
        iVar.a(0, new String[]{"trace_video_share_trace_style", "trace_video_share_trace_style"}, new int[]{1, 2}, new int[]{i, i});
        SparseIntArray sparseIntArray = new SparseIntArray();
        K = sparseIntArray;
        sparseIntArray.put(bsi.f, 3);
        sparseIntArray.put(bsi.o, 4);
        sparseIntArray.put(bsi.K7, 5);
        sparseIntArray.put(bsi.H1, 6);
        sparseIntArray.put(bsi.j2, 7);
    }

    public sqp(rk5 rk5Var, View view, Object[] objArr) {
        super(rk5Var, view, 2, (ConstraintLayout) objArr[3], (ImageView) objArr[4], (ImageView) objArr[6], (ImageView) objArr[7], (okp) objArr[1], (TextView) objArr[5], (okp) objArr[2]);
        this.I = -1L;
        k0(this.E);
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[0];
        this.H = constraintLayout;
        constraintLayout.setTag(null);
        k0(this.G);
        o0(view);
        H();
    }

    public final boolean A0(okp okpVar, int i) {
        if (i != qv1.f31871a) {
            return false;
        }
        synchronized (this) {
            this.I |= 2;
        }
        return true;
    }

    public final boolean B0(okp okpVar, int i) {
        if (i != qv1.f31871a) {
            return false;
        }
        synchronized (this) {
            this.I |= 1;
        }
        return true;
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean F() {
        synchronized (this) {
            try {
                if (this.I != 0) {
                    return true;
                }
                return this.E.F() || this.G.F();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void H() {
        synchronized (this) {
            this.I = 4L;
        }
        this.E.H();
        this.G.H();
        e0();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean W(int i, Object obj, int i2) {
        if (i == 0) {
            return B0((okp) obj, i2);
        }
        if (i != 1) {
            return false;
        }
        return A0((okp) obj, i2);
    }

    @Override // androidx.databinding.ViewDataBinding
    public void l0(LifecycleOwner lifecycleOwner) {
        super.l0(lifecycleOwner);
        this.E.l0(lifecycleOwner);
        this.G.l0(lifecycleOwner);
    }

    @Override // androidx.databinding.ViewDataBinding
    public void o() {
        synchronized (this) {
            this.I = 0L;
        }
        ViewDataBinding.r(this.E);
        ViewDataBinding.r(this.G);
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean q0(int i, Object obj) {
        return true;
    }

    public sqp(rk5 rk5Var, View view) {
        this(rk5Var, view, ViewDataBinding.P(rk5Var, view, 8, J, K));
    }
}
