package defpackage;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.TextView;
import androidx.databinding.ViewDataBinding;
import com.xiaomi.fitness.detail.view.RingView;
import com.xiaomi.fitness.widget.view.RoundImageView;

/* JADX INFO: loaded from: classes10.dex */
public class ibe extends hbe {
    public static final ViewDataBinding.i F = null;
    public static final SparseIntArray G = null;
    public long E;

    public ibe(rk5 rk5Var, View[] viewArr, Object[] objArr) {
        super(rk5Var, viewArr[0], 0, (TextView) objArr[2], (RoundImageView) objArr[0], (RingView) objArr[3], (TextView) objArr[1]);
        this.E = -1L;
        this.A.setTag(null);
        this.B.setTag(null);
        this.C.setTag(null);
        this.D.setTag(null);
        p0(viewArr);
        H();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean F() {
        synchronized (this) {
            try {
                return this.E != 0;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void H() {
        synchronized (this) {
            this.E = 1L;
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
            this.E = 0L;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean q0(int i, Object obj) {
        return true;
    }

    public ibe(rk5 rk5Var, View[] viewArr) {
        this(rk5Var, viewArr, ViewDataBinding.V(rk5Var, viewArr, 4, F, G));
    }
}
