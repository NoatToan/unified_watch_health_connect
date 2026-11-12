package defpackage;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.ViewDataBinding;
import com.github.mikephil.charting.charts.LineChart;

/* JADX INFO: loaded from: classes9.dex */
public class jom extends iom {
    public static final ViewDataBinding.i M = null;
    public static final SparseIntArray N;
    public final FrameLayout K;
    public long L;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        N = sparseIntArray;
        sparseIntArray.put(eri.la, 1);
        sparseIntArray.put(eri.mh, 2);
        sparseIntArray.put(eri.V2, 3);
        sparseIntArray.put(eri.Yh, 4);
        sparseIntArray.put(eri.ai, 5);
        sparseIntArray.put(eri.Vh, 6);
        sparseIntArray.put(eri.Zh, 7);
        sparseIntArray.put(eri.bi, 8);
        sparseIntArray.put(eri.Wh, 9);
        sparseIntArray.put(eri.za, 10);
    }

    public jom(rk5 rk5Var, View view, Object[] objArr) {
        super(rk5Var, view, 0, (TextView) objArr[3], (ConstraintLayout) objArr[1], (LineChart) objArr[10], (TextView) objArr[2], (TextView) objArr[6], (TextView) objArr[9], (CardView) objArr[4], (CardView) objArr[7], (View) objArr[5], (View) objArr[8]);
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

    public jom(rk5 rk5Var, View view) {
        this(rk5Var, view, ViewDataBinding.P(rk5Var, view, 11, M, N));
    }
}
