package defpackage;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.ViewDataBinding;
import androidx.lifecycle.LifecycleOwner;
import com.xiaomi.fitness.baseui.recyclerview.MoreRecyclerView;
import com.xiaomi.fitness.devicesettings.common.track.TrackViewModel;

/* JADX INFO: loaded from: classes8.dex */
public class vi6 extends ui6 {
    public static final ViewDataBinding.i J;
    public static final SparseIntArray K;
    public final ConstraintLayout H;
    public long I;

    static {
        ViewDataBinding.i iVar = new ViewDataBinding.i(7);
        J = iVar;
        iVar.a(0, new String[]{"device_settings_item_track_list_head"}, new int[]{2}, new int[]{eui.h1});
        iVar.a(1, new String[]{"device_settings_layout_empty_view"}, new int[]{3}, new int[]{eui.u1});
        SparseIntArray sparseIntArray = new SparseIntArray();
        K = sparseIntArray;
        sparseIntArray.put(zqi.i7, 4);
        sparseIntArray.put(zqi.ca, 5);
        sparseIntArray.put(zqi.Qa, 6);
    }

    public vi6(rk5 rk5Var, View view, Object[] objArr) {
        super(rk5Var, view, 2, (cl6) objArr[3], (FrameLayout) objArr[1], (yk6) objArr[2], (MoreRecyclerView) objArr[4], (TextView) objArr[5], (View) objArr[6]);
        this.I = -1L;
        k0(this.A);
        this.B.setTag(null);
        k0(this.C);
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[0];
        this.H = constraintLayout;
        constraintLayout.setTag(null);
        o0(view);
        H();
    }

    public final boolean A0(cl6 cl6Var, int i) {
        if (i != bw1.f4667a) {
            return false;
        }
        synchronized (this) {
            this.I |= 1;
        }
        return true;
    }

    public final boolean B0(yk6 yk6Var, int i) {
        if (i != bw1.f4667a) {
            return false;
        }
        synchronized (this) {
            this.I |= 2;
        }
        return true;
    }

    public void C0(TrackViewModel trackViewModel) {
        this.G = trackViewModel;
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean F() {
        synchronized (this) {
            try {
                if (this.I != 0) {
                    return true;
                }
                return this.C.F() || this.A.F();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void H() {
        synchronized (this) {
            this.I = 8L;
        }
        this.C.H();
        this.A.H();
        e0();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean W(int i, Object obj, int i2) {
        if (i == 0) {
            return A0((cl6) obj, i2);
        }
        if (i != 1) {
            return false;
        }
        return B0((yk6) obj, i2);
    }

    @Override // androidx.databinding.ViewDataBinding
    public void l0(LifecycleOwner lifecycleOwner) {
        super.l0(lifecycleOwner);
        this.C.l0(lifecycleOwner);
        this.A.l0(lifecycleOwner);
    }

    @Override // androidx.databinding.ViewDataBinding
    public void o() {
        synchronized (this) {
            this.I = 0L;
        }
        ViewDataBinding.r(this.C);
        ViewDataBinding.r(this.A);
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean q0(int i, Object obj) {
        if (bw1.f != i) {
            return false;
        }
        C0((TrackViewModel) obj);
        return true;
    }

    public vi6(rk5 rk5Var, View view) {
        this(rk5Var, view, ViewDataBinding.P(rk5Var, view, 7, J, K));
    }
}
