package defpackage;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.databinding.ViewDataBinding;
import com.xiaomi.fitness.detail.view.SportFeedbackView;

/* JADX INFO: loaded from: classes10.dex */
public class nda extends mda {
    public static final ViewDataBinding.i M = null;
    public static final SparseIntArray N;
    public final FrameLayout K;
    public long L;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        N = sparseIntArray;
        sparseIntArray.put(bsi.J9, 1);
        sparseIntArray.put(bsi.O3, 2);
        sparseIntArray.put(bsi.h0, 3);
        sparseIntArray.put(bsi.g0, 4);
        sparseIntArray.put(bsi.d0, 5);
        sparseIntArray.put(bsi.P, 6);
        sparseIntArray.put(bsi.l0, 7);
        sparseIntArray.put(bsi.g8, 8);
        sparseIntArray.put(bsi.X1, 9);
        sparseIntArray.put(bsi.Z0, 10);
    }

    public nda(rk5 rk5Var, View view, Object[] objArr) {
        super(rk5Var, view, 0, (FrameLayout) objArr[6], (FrameLayout) objArr[5], (FrameLayout) objArr[4], (FrameLayout) objArr[3], (FrameLayout) objArr[7], (FrameLayout) objArr[10], (SportFeedbackView) objArr[9], (LinearLayout) objArr[2], (FrameLayout) objArr[8], (TextView) objArr[1]);
        this.L = -1L;
        FrameLayout frameLayout = (FrameLayout) objArr[0];
        this.K = frameLayout;
        frameLayout.setTag(null);
        o0(view);
        H();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean F() {
        synchronized (this) {
            try {
                return this.L != 0;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void H() {
        synchronized (this) {
            this.L = 1L;
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
            this.L = 0L;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean q0(int i, Object obj) {
        return true;
    }

    public nda(rk5 rk5Var, View view) {
        this(rk5Var, view, ViewDataBinding.P(rk5Var, view, 11, M, N));
    }
}
