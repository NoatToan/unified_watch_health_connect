package defpackage;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.CheckBox;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.ViewDataBinding;
import androidx.lifecycle.LifecycleOwner;
import com.xiaomi.fitness.health.threetarget.model.ThreeTargetView;

/* JADX INFO: loaded from: classes7.dex */
public class ixh extends hxh {
    public static final ViewDataBinding.i R;
    public static final SparseIntArray S;
    public final FrameLayout O;
    public final RelativeLayout P;
    public long Q;

    static {
        ViewDataBinding.i iVar = new ViewDataBinding.i(16);
        R = iVar;
        iVar.a(1, new String[]{"pk_layout_user_active_goal"}, new int[]{2}, new int[]{bui.q});
        SparseIntArray sparseIntArray = new SparseIntArray();
        S = sparseIntArray;
        sparseIntArray.put(wqi.j, 3);
        sparseIntArray.put(wqi.D0, 4);
        sparseIntArray.put(wqi.I, 5);
        sparseIntArray.put(wqi.W0, 6);
        sparseIntArray.put(wqi.S, 7);
        sparseIntArray.put(wqi.T, 8);
        sparseIntArray.put(wqi.i, 9);
        sparseIntArray.put(wqi.v1, 10);
        sparseIntArray.put(wqi.t1, 11);
        sparseIntArray.put(wqi.Q0, 12);
        sparseIntArray.put(wqi.t0, 13);
        sparseIntArray.put(wqi.U0, 14);
        sparseIntArray.put(wqi.F, 15);
    }

    public ixh(rk5 rk5Var, View view, Object[] objArr) {
        super(rk5Var, view, 1, (CheckBox) objArr[9], (RelativeLayout) objArr[3], (TextView) objArr[15], (AppCompatImageView) objArr[5], (ryh) objArr[2], (LinearLayout) objArr[7], (LinearLayout) objArr[8], (ConstraintLayout) objArr[13], (ThreeTargetView) objArr[4], (TextView) objArr[12], (TextView) objArr[14], (TextView) objArr[6], (TextView) objArr[11], (TextView) objArr[10]);
        this.Q = -1L;
        k0(this.E);
        FrameLayout frameLayout = (FrameLayout) objArr[0];
        this.O = frameLayout;
        frameLayout.setTag(null);
        RelativeLayout relativeLayout = (RelativeLayout) objArr[1];
        this.P = relativeLayout;
        relativeLayout.setTag(null);
        o0(view);
        H();
    }

    public final boolean A0(ryh ryhVar, int i) {
        if (i != yv1.f40598a) {
            return false;
        }
        synchronized (this) {
            this.Q |= 1;
        }
        return true;
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean F() {
        synchronized (this) {
            try {
                if (this.Q != 0) {
                    return true;
                }
                return this.E.F();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void H() {
        synchronized (this) {
            this.Q = 2L;
        }
        this.E.H();
        e0();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean W(int i, Object obj, int i2) {
        if (i != 0) {
            return false;
        }
        return A0((ryh) obj, i2);
    }

    @Override // androidx.databinding.ViewDataBinding
    public void l0(LifecycleOwner lifecycleOwner) {
        super.l0(lifecycleOwner);
        this.E.l0(lifecycleOwner);
    }

    @Override // androidx.databinding.ViewDataBinding
    public void o() {
        synchronized (this) {
            this.Q = 0L;
        }
        ViewDataBinding.r(this.E);
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean q0(int i, Object obj) {
        return true;
    }

    public ixh(rk5 rk5Var, View view) {
        this(rk5Var, view, ViewDataBinding.P(rk5Var, view, 16, R, S));
    }
}
