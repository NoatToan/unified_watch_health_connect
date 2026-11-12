package defpackage;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.ViewDataBinding;
import androidx.lifecycle.LifecycleOwner;

/* JADX INFO: loaded from: classes10.dex */
public class uqp extends tqp {
    public static final ViewDataBinding.i I;
    public static final SparseIntArray J;
    public final ConstraintLayout G;
    public long H;

    static {
        ViewDataBinding.i iVar = new ViewDataBinding.i(7);
        I = iVar;
        iVar.a(0, new String[]{"trace_video_share_trace_style"}, new int[]{1}, new int[]{ivi.H1});
        SparseIntArray sparseIntArray = new SparseIntArray();
        J = sparseIntArray;
        sparseIntArray.put(bsi.f, 2);
        sparseIntArray.put(bsi.o, 3);
        sparseIntArray.put(bsi.K7, 4);
        sparseIntArray.put(bsi.H1, 5);
        sparseIntArray.put(bsi.j2, 6);
    }

    public uqp(rk5 rk5Var, View view, Object[] objArr) {
        super(rk5Var, view, 1, (ConstraintLayout) objArr[2], (ImageView) objArr[3], (ImageView) objArr[5], (ImageView) objArr[6], (TextView) objArr[4], (okp) objArr[1]);
        this.H = -1L;
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[0];
        this.G = constraintLayout;
        constraintLayout.setTag(null);
        k0(this.F);
        o0(view);
        H();
    }

    private boolean A0(okp okpVar, int i) {
        if (i != qv1.f31871a) {
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
                return this.F.F();
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
        this.F.H();
        e0();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean W(int i, Object obj, int i2) {
        if (i != 0) {
            return false;
        }
        return A0((okp) obj, i2);
    }

    @Override // androidx.databinding.ViewDataBinding
    public void l0(LifecycleOwner lifecycleOwner) {
        super.l0(lifecycleOwner);
        this.F.l0(lifecycleOwner);
    }

    @Override // androidx.databinding.ViewDataBinding
    public void o() {
        synchronized (this) {
            this.H = 0L;
        }
        ViewDataBinding.r(this.F);
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean q0(int i, Object obj) {
        return true;
    }

    public uqp(rk5 rk5Var, View view) {
        this(rk5Var, view, ViewDataBinding.P(rk5Var, view, 7, I, J));
    }
}
