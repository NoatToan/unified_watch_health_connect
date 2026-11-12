package defpackage;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.LinearLayout;
import androidx.databinding.ViewDataBinding;
import androidx.lifecycle.LifecycleOwner;
import com.xiaomi.fitness.baseui.recyclerview.MoreRecyclerView;

/* JADX INFO: loaded from: classes5.dex */
public class xq4 extends wq4 {
    public static final ViewDataBinding.i E;
    public static final SparseIntArray F;
    public final LinearLayout C;
    public long D;

    static {
        ViewDataBinding.i iVar = new ViewDataBinding.i(3);
        E = iVar;
        iVar.a(0, new String[]{"course_delete_bottom"}, new int[]{1}, new int[]{sti.course_delete_bottom});
        SparseIntArray sparseIntArray = new SparseIntArray();
        F = sparseIntArray;
        sparseIntArray.put(oqi.c1, 2);
    }

    public xq4(rk5 rk5Var, View view, Object[] objArr) {
        super(rk5Var, view, 1, (gq4) objArr[1], (MoreRecyclerView) objArr[2]);
        this.D = -1L;
        k0(this.A);
        LinearLayout linearLayout = (LinearLayout) objArr[0];
        this.C = linearLayout;
        linearLayout.setTag(null);
        o0(view);
        H();
    }

    public final boolean A0(gq4 gq4Var, int i) {
        if (i != ew1.f17121a) {
            return false;
        }
        synchronized (this) {
            this.D |= 1;
        }
        return true;
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean F() {
        synchronized (this) {
            try {
                if (this.D != 0) {
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
            this.D = 2L;
        }
        this.A.H();
        e0();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean W(int i, Object obj, int i2) {
        if (i != 0) {
            return false;
        }
        return A0((gq4) obj, i2);
    }

    @Override // androidx.databinding.ViewDataBinding
    public void l0(LifecycleOwner lifecycleOwner) {
        super.l0(lifecycleOwner);
        this.A.l0(lifecycleOwner);
    }

    @Override // androidx.databinding.ViewDataBinding
    public void o() {
        synchronized (this) {
            this.D = 0L;
        }
        ViewDataBinding.r(this.A);
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean q0(int i, Object obj) {
        return true;
    }

    public xq4(rk5 rk5Var, View view) {
        this(rk5Var, view, ViewDataBinding.P(rk5Var, view, 3, E, F));
    }
}
