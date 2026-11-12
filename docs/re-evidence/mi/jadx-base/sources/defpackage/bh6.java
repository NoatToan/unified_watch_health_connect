package defpackage;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ProgressBar;
import androidx.databinding.ViewDataBinding;
import com.xiaomi.fitness.webview.CustomWebView;

/* JADX INFO: loaded from: classes8.dex */
public class bh6 extends ah6 {
    public static final ViewDataBinding.i F = null;
    public static final SparseIntArray G;
    public final FrameLayout D;
    public long E;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        G = sparseIntArray;
        sparseIntArray.put(zqi.I6, 1);
        sparseIntArray.put(zqi.ab, 2);
        sparseIntArray.put(zqi.g3, 3);
    }

    public bh6(rk5 rk5Var, View view, Object[] objArr) {
        super(rk5Var, view, 0, (FrameLayout) objArr[3], (ProgressBar) objArr[1], (CustomWebView) objArr[2]);
        this.E = -1L;
        FrameLayout frameLayout = (FrameLayout) objArr[0];
        this.D = frameLayout;
        frameLayout.setTag(null);
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

    public bh6(rk5 rk5Var, View view) {
        this(rk5Var, view, ViewDataBinding.P(rk5Var, view, 4, F, G));
    }
}
