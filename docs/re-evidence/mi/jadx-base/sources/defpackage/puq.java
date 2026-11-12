package defpackage;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.ViewDataBinding;
import androidx.lifecycle.LifecycleOwner;
import androidx.recyclerview.widget.RecyclerView;
import com.xiaomi.fitness.sport.bean.LaunchViewBean;
import com.xiaomi.fitness.sport.view.widget.GpsSignalView;
import com.xiaomi.fitness.sport.view.widget.SportMusicView;

/* JADX INFO: loaded from: classes10.dex */
public class puq extends nuq {
    public static final ViewDataBinding.i V;
    public static final SparseIntArray W;
    public long U;

    static {
        ViewDataBinding.i iVar = new ViewDataBinding.i(14);
        V = iVar;
        iVar.a(0, new String[]{"view_launch_head"}, new int[]{2}, new int[]{dvi.z1});
        iVar.a(1, new String[]{"view_launch_indoor"}, new int[]{3}, new int[]{dvi.A1});
        SparseIntArray sparseIntArray = new SparseIntArray();
        W = sparseIntArray;
        sparseIntArray.put(xri.W1, 4);
        sparseIntArray.put(xri.u3, 5);
        sparseIntArray.put(xri.V0, 6);
        sparseIntArray.put(xri.n0, 7);
        sparseIntArray.put(xri.m0, 8);
        sparseIntArray.put(xri.J6, 9);
        sparseIntArray.put(xri.M6, 10);
        sparseIntArray.put(xri.Y5, 11);
        sparseIntArray.put(xri.goal_setting, 12);
        sparseIntArray.put(xri.d, 13);
    }

    public puq(rk5 rk5Var, View view, Object[] objArr) {
        super(rk5Var, view, 2, (TextView) objArr[13], null, (RecyclerView) objArr[8], (ConstraintLayout) objArr[0], (ConstraintLayout) objArr[7], null, null, null, (View) objArr[6], (ImageView) objArr[12], (GpsSignalView) objArr[4], (quq) objArr[2], (suq) objArr[3], (FrameLayout) objArr[5], (FrameLayout) objArr[1], (View) objArr[11], (SportMusicView) objArr[9], (ImageView) objArr[10]);
        this.U = -1L;
        this.D.setTag(null);
        k0(this.L);
        k0(this.M);
        this.O.setTag(null);
        o0(view);
        H();
    }

    private boolean C0(quq quqVar, int i) {
        if (i != nv1.f28390a) {
            return false;
        }
        synchronized (this) {
            this.U |= 2;
        }
        return true;
    }

    private boolean D0(suq suqVar, int i) {
        if (i != nv1.f28390a) {
            return false;
        }
        synchronized (this) {
            this.U |= 1;
        }
        return true;
    }

    @Override // defpackage.nuq
    public void B0(LaunchViewBean launchViewBean) {
        this.S = launchViewBean;
        synchronized (this) {
            this.U |= 4;
        }
        notifyPropertyChanged(nv1.e);
        super.e0();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean F() {
        synchronized (this) {
            try {
                if (this.U != 0) {
                    return true;
                }
                return this.L.F() || this.M.F();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void H() {
        synchronized (this) {
            this.U = 16L;
        }
        this.L.H();
        this.M.H();
        e0();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean W(int i, Object obj, int i2) {
        if (i == 0) {
            return D0((suq) obj, i2);
        }
        if (i != 1) {
            return false;
        }
        return C0((quq) obj, i2);
    }

    @Override // androidx.databinding.ViewDataBinding
    public void l0(LifecycleOwner lifecycleOwner) {
        super.l0(lifecycleOwner);
        this.L.l0(lifecycleOwner);
        this.M.l0(lifecycleOwner);
    }

    @Override // androidx.databinding.ViewDataBinding
    public void o() {
        long j;
        synchronized (this) {
            j = this.U;
            this.U = 0L;
        }
        LaunchViewBean launchViewBean = this.S;
        View.OnClickListener onClickListener = this.T;
        long j2 = 20 & j;
        long j3 = j & 24;
        if (j2 != 0) {
            this.L.A0(launchViewBean);
        }
        if (j3 != 0) {
            this.M.setClick(onClickListener);
        }
        ViewDataBinding.r(this.L);
        ViewDataBinding.r(this.M);
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean q0(int i, Object obj) {
        if (nv1.e == i) {
            B0((LaunchViewBean) obj);
        } else {
            if (nv1.f28391b != i) {
                return false;
            }
            setClick((View.OnClickListener) obj);
        }
        return true;
    }

    @Override // defpackage.nuq
    public void setClick(View.OnClickListener onClickListener) {
        this.T = onClickListener;
        synchronized (this) {
            this.U |= 8;
        }
        notifyPropertyChanged(nv1.f28391b);
        super.e0();
    }

    public puq(rk5 rk5Var, View view) {
        this(rk5Var, view, ViewDataBinding.P(rk5Var, view, 14, V, W));
    }
}
