package defpackage;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.EditText;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.databinding.ViewDataBinding;

/* JADX INFO: loaded from: classes9.dex */
public class q8e extends p8e {
    public static final ViewDataBinding.i F = null;
    public static final SparseIntArray G;
    public final RelativeLayout D;
    public long E;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        G = sparseIntArray;
        sparseIntArray.put(eri.bn, 1);
        sparseIntArray.put(eri.w4, 2);
        sparseIntArray.put(eri.jn, 3);
    }

    public q8e(rk5 rk5Var, View view, Object[] objArr) {
        super(rk5Var, view, 0, (EditText) objArr[2], (TextView) objArr[1], (TextView) objArr[3]);
        this.E = -1L;
        RelativeLayout relativeLayout = (RelativeLayout) objArr[0];
        this.D = relativeLayout;
        relativeLayout.setTag(null);
        o0(view);
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

    public q8e(rk5 rk5Var, View view) {
        this(rk5Var, view, ViewDataBinding.P(rk5Var, view, 4, F, G));
    }
}
