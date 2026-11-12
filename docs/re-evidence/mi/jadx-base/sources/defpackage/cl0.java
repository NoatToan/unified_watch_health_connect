package defpackage;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.ImageView;
import android.widget.ScrollView;
import androidx.databinding.ViewDataBinding;

/* JADX INFO: loaded from: classes8.dex */
public class cl0 extends bl0 {
    public static final ViewDataBinding.i I = null;
    public static final SparseIntArray J;
    public final ScrollView G;
    public long H;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        J = sparseIntArray;
        sparseIntArray.put(bri.V0, 1);
        sparseIntArray.put(bri.W0, 2);
        sparseIntArray.put(bri.X0, 3);
        sparseIntArray.put(bri.Y0, 4);
        sparseIntArray.put(bri.Z0, 5);
        sparseIntArray.put(bri.a1, 6);
    }

    public cl0(rk5 rk5Var, View view, Object[] objArr) {
        super(rk5Var, view, 0, (ImageView) objArr[1], (ImageView) objArr[2], (ImageView) objArr[3], (ImageView) objArr[4], (ImageView) objArr[5], (ImageView) objArr[6]);
        this.H = -1L;
        ScrollView scrollView = (ScrollView) objArr[0];
        this.G = scrollView;
        scrollView.setTag(null);
        o0(view);
        H();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean F() {
        synchronized (this) {
            try {
                return this.H != 0;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void H() {
        synchronized (this) {
            this.H = 1L;
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
            this.H = 0L;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean q0(int i, Object obj) {
        return true;
    }

    public cl0(rk5 rk5Var, View view) {
        this(rk5Var, view, ViewDataBinding.P(rk5Var, view, 7, I, J));
    }
}
