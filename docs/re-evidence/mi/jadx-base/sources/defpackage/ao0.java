package defpackage;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.databinding.ViewDataBinding;
import androidx.lifecycle.LifecycleOwner;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.tabs.TabLayout;
import com.mi.health.sport.RunningRouteListMap;

/* JADX INFO: loaded from: classes10.dex */
public class ao0 extends zn0 {
    public static final ViewDataBinding.i O;
    public static final SparseIntArray P;
    public final ConstraintLayout L;
    public final FrameLayout M;
    public long N;

    static {
        ViewDataBinding.i iVar = new ViewDataBinding.i(13);
        O = iVar;
        iVar.a(1, new String[]{"layout_route_select"}, new int[]{3}, new int[]{dvi.z});
        iVar.a(2, new String[]{"layout_route_list_title"}, new int[]{4}, new int[]{dvi.y});
        SparseIntArray sparseIntArray = new SparseIntArray();
        P = sparseIntArray;
        sparseIntArray.put(xri.v3, 5);
        sparseIntArray.put(xri.c4, 6);
        sparseIntArray.put(xri.d4, 7);
        sparseIntArray.put(xri.R1, 8);
        sparseIntArray.put(xri.h3, 9);
        sparseIntArray.put(xri.c7, 10);
        sparseIntArray.put(xri.b7, 11);
        sparseIntArray.put(xri.W4, 12);
    }

    public ao0(rk5 rk5Var, View view, Object[] objArr) {
        super(rk5Var, view, 2, (RelativeLayout) objArr[1], (Button) objArr[8], (CoordinatorLayout) objArr[9], (RunningRouteListMap) objArr[5], (ConstraintLayout) objArr[6], (AppCompatTextView) objArr[7], (RecyclerView) objArr[12], (uae) objArr[3], (TabLayout) objArr[11], (LinearLayoutCompat) objArr[10], (sae) objArr[4]);
        this.N = -1L;
        this.A.setTag(null);
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[0];
        this.L = constraintLayout;
        constraintLayout.setTag(null);
        FrameLayout frameLayout = (FrameLayout) objArr[2];
        this.M = frameLayout;
        frameLayout.setTag(null);
        k0(this.H);
        k0(this.K);
        o0(view);
        H();
    }

    public final boolean A0(uae uaeVar, int i) {
        if (i != nv1.f28390a) {
            return false;
        }
        synchronized (this) {
            this.N |= 2;
        }
        return true;
    }

    public final boolean B0(sae saeVar, int i) {
        if (i != nv1.f28390a) {
            return false;
        }
        synchronized (this) {
            this.N |= 1;
        }
        return true;
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean F() {
        synchronized (this) {
            try {
                if (this.N != 0) {
                    return true;
                }
                return this.H.F() || this.K.F();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void H() {
        synchronized (this) {
            this.N = 4L;
        }
        this.H.H();
        this.K.H();
        e0();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean W(int i, Object obj, int i2) {
        if (i == 0) {
            return B0((sae) obj, i2);
        }
        if (i != 1) {
            return false;
        }
        return A0((uae) obj, i2);
    }

    @Override // androidx.databinding.ViewDataBinding
    public void l0(LifecycleOwner lifecycleOwner) {
        super.l0(lifecycleOwner);
        this.H.l0(lifecycleOwner);
        this.K.l0(lifecycleOwner);
    }

    @Override // androidx.databinding.ViewDataBinding
    public void o() {
        synchronized (this) {
            this.N = 0L;
        }
        ViewDataBinding.r(this.H);
        ViewDataBinding.r(this.K);
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean q0(int i, Object obj) {
        return true;
    }

    public ao0(rk5 rk5Var, View view) {
        this(rk5Var, view, ViewDataBinding.P(rk5Var, view, 13, O, P));
    }
}
