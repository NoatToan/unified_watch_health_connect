package defpackage;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.databinding.ViewDataBinding;
import com.xiaomi.fitness.sport.view.tab.adapter.RunningRouteView;

/* JADX INFO: loaded from: classes10.dex */
public class lmn extends kmn {
    public static final ViewDataBinding.i K = null;
    public static final SparseIntArray L;
    public long J;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        L = sparseIntArray;
        sparseIntArray.put(xri.V3, 1);
        sparseIntArray.put(xri.T3, 2);
        sparseIntArray.put(xri.W3, 3);
        sparseIntArray.put(xri.S3, 4);
        sparseIntArray.put(xri.I3, 5);
        sparseIntArray.put(xri.G5, 6);
        sparseIntArray.put(xri.H, 7);
        sparseIntArray.put(xri.P, 8);
    }

    public lmn(rk5 rk5Var, View view, Object[] objArr) {
        super(rk5Var, view, 0, (LinearLayout) objArr[7], (Button) objArr[8], (LinearLayout) objArr[0], (LinearLayout) objArr[5], (TextView) objArr[4], (TextView) objArr[2], (LinearLayout) objArr[1], (TextView) objArr[3], (RunningRouteView) objArr[6]);
        this.J = -1L;
        this.C.setTag(null);
        o0(view);
        H();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean F() {
        synchronized (this) {
            try {
                return this.J != 0;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void H() {
        synchronized (this) {
            this.J = 1L;
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
            this.J = 0L;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean q0(int i, Object obj) {
        return true;
    }

    public lmn(rk5 rk5Var, View view) {
        this(rk5Var, view, ViewDataBinding.P(rk5Var, view, 9, K, L));
    }
}
