package defpackage;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.databinding.ViewDataBinding;
import com.xiaomi.fitness.active.pk.widget.PkBarChart;
import com.xiaomi.fitness.active.pk.widget.PkScoreView;

/* JADX INFO: loaded from: classes7.dex */
public class mxh extends lxh {
    public static final ViewDataBinding.i N = null;
    public static final SparseIntArray O;
    public final ScrollView L;
    public long M;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        O = sparseIntArray;
        sparseIntArray.put(wqi.b1, 1);
        sparseIntArray.put(wqi.z0, 2);
        sparseIntArray.put(wqi.v0, 3);
        sparseIntArray.put(wqi.w0, 4);
        sparseIntArray.put(wqi.a1, 5);
        sparseIntArray.put(wqi.q1, 6);
        sparseIntArray.put(wqi.r1, 7);
        sparseIntArray.put(wqi.S0, 8);
        sparseIntArray.put(wqi.Y0, 9);
        sparseIntArray.put(wqi.Z0, 10);
        sparseIntArray.put(wqi.X0, 11);
    }

    public mxh(rk5 rk5Var, View view, Object[] objArr) {
        super(rk5Var, view, 0, (PkBarChart) objArr[3], (PkBarChart) objArr[4], (PkScoreView) objArr[2], (TextView) objArr[8], (TextView) objArr[11], (TextView) objArr[9], (TextView) objArr[10], (TextView) objArr[5], (TextView) objArr[1], (TextView) objArr[6], (TextView) objArr[7]);
        this.M = -1L;
        ScrollView scrollView = (ScrollView) objArr[0];
        this.L = scrollView;
        scrollView.setTag(null);
        o0(view);
        H();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean F() {
        synchronized (this) {
            try {
                return this.M != 0;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void H() {
        synchronized (this) {
            this.M = 1L;
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
            this.M = 0L;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean q0(int i, Object obj) {
        return true;
    }

    public mxh(rk5 rk5Var, View view) {
        this(rk5Var, view, ViewDataBinding.P(rk5Var, view, 12, N, O));
    }
}
