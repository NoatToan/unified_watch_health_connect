package defpackage;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.ViewDataBinding;
import androidx.lifecycle.LifecycleOwner;

/* JADX INFO: loaded from: classes10.dex */
public class qqp extends pqp {
    public static final ViewDataBinding.i M;
    public static final SparseIntArray N;
    public final ConstraintLayout J;
    public final LinearLayout K;
    public long L;

    static {
        ViewDataBinding.i iVar = new ViewDataBinding.i(11);
        M = iVar;
        iVar.a(1, new String[]{"trail_sport_trace_video_share_timeline_layout", "trail_sport_trace_video_share_add_pic_layout", "trail_video_share_moments", "trail_video_share_record_feelings"}, new int[]{2, 3, 4, 5}, new int[]{ivi.E2, ivi.C2, ivi.K2, ivi.L2});
        SparseIntArray sparseIntArray = new SparseIntArray();
        N = sparseIntArray;
        sparseIntArray.put(bsi.f, 6);
        sparseIntArray.put(bsi.B, 7);
        sparseIntArray.put(bsi.K7, 8);
        sparseIntArray.put(bsi.H1, 9);
        sparseIntArray.put(bsi.j2, 10);
    }

    public qqp(rk5 rk5Var, View view, Object[] objArr) {
        super(rk5Var, view, 4, (ConstraintLayout) objArr[6], (brp) objArr[3], (ImageView) objArr[7], (ImageView) objArr[9], (ImageView) objArr[10], (qrp) objArr[4], (srp) objArr[5], (frp) objArr[2], (TextView) objArr[8]);
        this.L = -1L;
        k0(this.B);
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[0];
        this.J = constraintLayout;
        constraintLayout.setTag(null);
        LinearLayout linearLayout = (LinearLayout) objArr[1];
        this.K = linearLayout;
        linearLayout.setTag(null);
        k0(this.F);
        k0(this.G);
        k0(this.H);
        o0(view);
        H();
    }

    public final boolean A0(brp brpVar, int i) {
        if (i != qv1.f31871a) {
            return false;
        }
        synchronized (this) {
            this.L |= 1;
        }
        return true;
    }

    public final boolean B0(qrp qrpVar, int i) {
        if (i != qv1.f31871a) {
            return false;
        }
        synchronized (this) {
            this.L |= 2;
        }
        return true;
    }

    public final boolean C0(srp srpVar, int i) {
        if (i != qv1.f31871a) {
            return false;
        }
        synchronized (this) {
            this.L |= 8;
        }
        return true;
    }

    public final boolean D0(frp frpVar, int i) {
        if (i != qv1.f31871a) {
            return false;
        }
        synchronized (this) {
            this.L |= 4;
        }
        return true;
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean F() {
        synchronized (this) {
            try {
                if (this.L != 0) {
                    return true;
                }
                return this.H.F() || this.B.F() || this.F.F() || this.G.F();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void H() {
        synchronized (this) {
            this.L = 16L;
        }
        this.H.H();
        this.B.H();
        this.F.H();
        this.G.H();
        e0();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean W(int i, Object obj, int i2) {
        if (i == 0) {
            return A0((brp) obj, i2);
        }
        if (i == 1) {
            return B0((qrp) obj, i2);
        }
        if (i == 2) {
            return D0((frp) obj, i2);
        }
        if (i != 3) {
            return false;
        }
        return C0((srp) obj, i2);
    }

    @Override // androidx.databinding.ViewDataBinding
    public void l0(LifecycleOwner lifecycleOwner) {
        super.l0(lifecycleOwner);
        this.H.l0(lifecycleOwner);
        this.B.l0(lifecycleOwner);
        this.F.l0(lifecycleOwner);
        this.G.l0(lifecycleOwner);
    }

    @Override // androidx.databinding.ViewDataBinding
    public void o() {
        synchronized (this) {
            this.L = 0L;
        }
        ViewDataBinding.r(this.H);
        ViewDataBinding.r(this.B);
        ViewDataBinding.r(this.F);
        ViewDataBinding.r(this.G);
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean q0(int i, Object obj) {
        return true;
    }

    public qqp(rk5 rk5Var, View view) {
        this(rk5Var, view, ViewDataBinding.P(rk5Var, view, 11, M, N));
    }
}
