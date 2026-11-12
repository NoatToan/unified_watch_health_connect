package defpackage;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.TextView;
import androidx.databinding.ViewDataBinding;
import com.xiaomi.fitness.widget.RightArrowSingleLineTextView;
import com.xiaomi.fitness.widget.view.DividerView;

/* JADX INFO: loaded from: classes9.dex */
public class jtb extends itb {
    public static final ViewDataBinding.i E = null;
    public static final SparseIntArray F = null;
    public long D;

    public jtb(rk5 rk5Var, View[] viewArr, Object[] objArr) {
        super(rk5Var, viewArr[0], 0, (DividerView) objArr[2], (RightArrowSingleLineTextView) objArr[1], (TextView) objArr[0]);
        this.D = -1L;
        this.A.setTag(null);
        this.B.setTag(null);
        this.C.setTag(null);
        p0(viewArr);
        H();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean F() {
        synchronized (this) {
            try {
                return this.D != 0;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void H() {
        synchronized (this) {
            this.D = 1L;
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
            this.D = 0L;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean q0(int i, Object obj) {
        return true;
    }

    public jtb(rk5 rk5Var, View[] viewArr) {
        this(rk5Var, viewArr, ViewDataBinding.V(rk5Var, viewArr, 3, E, F));
    }
}
