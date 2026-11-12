package defpackage;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.ViewDataBinding;
import androidx.lifecycle.LifecycleOwner;
import com.xiaomi.fitness.share.view.TraceAMapDistanceView;
import com.xiaomi.fitness.share.view.TrackLineView;

/* JADX INFO: loaded from: classes10.dex */
public class gxq extends fxq {
    public static final ViewDataBinding.i N;
    public static final SparseIntArray O;
    public long M;

    static {
        ViewDataBinding.i iVar = new ViewDataBinding.i(12);
        N = iVar;
        iVar.a(1, new String[]{"view_trace_item_data"}, new int[]{2}, new int[]{ivi.S2});
        SparseIntArray sparseIntArray = new SparseIntArray();
        O = sparseIntArray;
        sparseIntArray.put(bsi.v1, 3);
        sparseIntArray.put(bsi.L6, 4);
        sparseIntArray.put(bsi.w1, 5);
        sparseIntArray.put(bsi.v6, 6);
        sparseIntArray.put(bsi.W1, 7);
        sparseIntArray.put(bsi.W7, 8);
        sparseIntArray.put(bsi.P1, 9);
        sparseIntArray.put(bsi.b6, 10);
        sparseIntArray.put(bsi.N1, 11);
    }

    public gxq(rk5 rk5Var, View view, Object[] objArr) {
        super(rk5Var, view, 1, (TextView) objArr[5], (TraceAMapDistanceView) objArr[3], (ImageView) objArr[11], (ConstraintLayout) objArr[9], (TextView) objArr[7], (TextView) objArr[10], (TextView) objArr[6], (ConstraintLayout) objArr[1], (TextView) objArr[4], (ConstraintLayout) objArr[0], (nxq) objArr[2], (TrackLineView) objArr[8]);
        this.M = -1L;
        this.H.setTag(null);
        this.J.setTag(null);
        k0(this.K);
        o0(view);
        H();
    }

    public final boolean C0(nxq nxqVar, int i) {
        if (i != qv1.f31871a) {
            return false;
        }
        synchronized (this) {
            this.M |= 1;
        }
        return true;
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean F() {
        synchronized (this) {
            try {
                if (this.M != 0) {
                    return true;
                }
                return this.K.F();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void H() {
        synchronized (this) {
            this.M = 2L;
        }
        this.K.H();
        e0();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean W(int i, Object obj, int i2) {
        if (i != 0) {
            return false;
        }
        return C0((nxq) obj, i2);
    }

    @Override // androidx.databinding.ViewDataBinding
    public void l0(LifecycleOwner lifecycleOwner) {
        super.l0(lifecycleOwner);
        this.K.l0(lifecycleOwner);
    }

    @Override // androidx.databinding.ViewDataBinding
    public void o() {
        synchronized (this) {
            this.M = 0L;
        }
        ViewDataBinding.r(this.K);
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean q0(int i, Object obj) {
        return true;
    }

    public gxq(rk5 rk5Var, View view) {
        this(rk5Var, view, ViewDataBinding.P(rk5Var, view, 12, N, O));
    }
}
