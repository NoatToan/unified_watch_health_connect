package defpackage;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.CheckedTextView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.databinding.ViewDataBinding;

/* JADX INFO: loaded from: classes10.dex */
public class ly7 extends ky7 {
    public static final ViewDataBinding.i F = null;
    public static final SparseIntArray G;
    public final RelativeLayout D;
    public long E;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        G = sparseIntArray;
        sparseIntArray.put(zri.s3, 1);
        sparseIntArray.put(zri.k3, 2);
        sparseIntArray.put(zri.x1, 3);
    }

    public ly7(rk5 rk5Var, View view, Object[] objArr) {
        super(rk5Var, view, 0, (CheckedTextView) objArr[3], (TextView) objArr[2], (TextView) objArr[1]);
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

    public ly7(rk5 rk5Var, View view) {
        this(rk5Var, view, ViewDataBinding.P(rk5Var, view, 4, F, G));
    }
}
