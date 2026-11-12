package defpackage;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.LinearLayout;
import androidx.databinding.ViewDataBinding;
import androidx.lifecycle.LifecycleOwner;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: loaded from: classes8.dex */
public class km6 extends jm6 {
    public static final ViewDataBinding.i F;
    public static final SparseIntArray G;
    public final LinearLayout D;
    public long E;

    static {
        ViewDataBinding.i iVar = new ViewDataBinding.i(4);
        F = iVar;
        iVar.a(0, new String[]{"device_settings_remind_fragment_event_bottom"}, new int[]{1}, new int[]{eui.Q1});
        SparseIntArray sparseIntArray = new SparseIntArray();
        G = sparseIntArray;
        sparseIntArray.put(zqi.c3, 2);
        sparseIntArray.put(zqi.b3, 3);
    }

    public km6(rk5 rk5Var, View view, Object[] objArr) {
        super(rk5Var, view, 1, (lm6) objArr[1], (LinearLayout) objArr[3], (RecyclerView) objArr[2]);
        this.E = -1L;
        k0(this.A);
        LinearLayout linearLayout = (LinearLayout) objArr[0];
        this.D = linearLayout;
        linearLayout.setTag(null);
        o0(view);
        H();
    }

    public final boolean A0(lm6 lm6Var, int i) {
        if (i != bw1.f4667a) {
            return false;
        }
        synchronized (this) {
            this.E |= 1;
        }
        return true;
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean F() {
        synchronized (this) {
            try {
                if (this.E != 0) {
                    return true;
                }
                return this.A.F();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void H() {
        synchronized (this) {
            this.E = 2L;
        }
        this.A.H();
        e0();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean W(int i, Object obj, int i2) {
        if (i != 0) {
            return false;
        }
        return A0((lm6) obj, i2);
    }

    @Override // androidx.databinding.ViewDataBinding
    public void l0(LifecycleOwner lifecycleOwner) {
        super.l0(lifecycleOwner);
        this.A.l0(lifecycleOwner);
    }

    @Override // androidx.databinding.ViewDataBinding
    public void o() {
        synchronized (this) {
            this.E = 0L;
        }
        ViewDataBinding.r(this.A);
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean q0(int i, Object obj) {
        return true;
    }

    public km6(rk5 rk5Var, View view) {
        this(rk5Var, view, ViewDataBinding.P(rk5Var, view, 4, F, G));
    }
}
