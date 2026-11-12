package defpackage;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import androidx.databinding.ViewDataBinding;
import com.xiaomi.fitness.webview.CustomWebView;

/* JADX INFO: loaded from: classes10.dex */
public class kbr extends jbr {
    public static final ViewDataBinding.i H = null;
    public static final SparseIntArray I;
    public long G;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        I = sparseIntArray;
        sparseIntArray.put(jsi.common_webview_root_fl, 1);
        sparseIntArray.put(jsi.e, 2);
        sparseIntArray.put(jsi.h, 3);
        sparseIntArray.put(jsi.f23092b, 4);
        sparseIntArray.put(jsi.f23091a, 5);
    }

    public kbr(rk5 rk5Var, View view, Object[] objArr) {
        super(rk5Var, view, 0, (FrameLayout) objArr[5], (FrameLayout) objArr[1], (LinearLayout) objArr[0], (FrameLayout) objArr[4], (ProgressBar) objArr[2], (CustomWebView) objArr[3]);
        this.G = -1L;
        this.C.setTag(null);
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

    public kbr(rk5 rk5Var, View view) {
        this(rk5Var, view, ViewDataBinding.P(rk5Var, view, 6, H, I));
    }
}
