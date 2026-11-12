package defpackage;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import androidx.databinding.ViewDataBinding;
import com.xiaomi.fitness.electronic.scale.widget.NoScrollRecyclerView;
import com.xiaomi.fitness.electronic.scale.widget.UserManageFooterView;
import com.xiaomi.fitness.electronic.scale.widget.UserManageHeaderView;
import miuix.core.widget.NestedScrollView;

/* JADX INFO: loaded from: classes8.dex */
public class qk0 extends pk0 {
    public static final ViewDataBinding.i H = null;
    public static final SparseIntArray I;
    public final RelativeLayout F;
    public long G;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        I = sparseIntArray;
        sparseIntArray.put(bri.Q3, 1);
        sparseIntArray.put(bri.v1, 2);
        sparseIntArray.put(bri.D0, 3);
        sparseIntArray.put(bri.h6, 4);
        sparseIntArray.put(bri.w0, 5);
    }

    public qk0(rk5 rk5Var, View view, Object[] objArr) {
        super(rk5Var, view, 0, (UserManageFooterView) objArr[5], (UserManageHeaderView) objArr[3], (LinearLayout) objArr[2], (NestedScrollView) objArr[1], (NoScrollRecyclerView) objArr[4]);
        this.G = -1L;
        RelativeLayout relativeLayout = (RelativeLayout) objArr[0];
        this.F = relativeLayout;
        relativeLayout.setTag(null);
        o0(view);
        H();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean F() {
        synchronized (this) {
            try {
                return this.G != 0;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void H() {
        synchronized (this) {
            this.G = 1L;
        }
        e0();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean W(int i, Object obj, int i2) {
        return false;
    }

    @Override // androidx.databinding.ViewDataBinding
    public void o() {
        synchronized (this) {
            this.G = 0L;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean q0(int i, Object obj) {
        return true;
    }

    public qk0(rk5 rk5Var, View view) {
        this(rk5Var, view, ViewDataBinding.P(rk5Var, view, 6, H, I));
    }
}
