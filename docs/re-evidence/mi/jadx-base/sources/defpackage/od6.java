package defpackage;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: loaded from: classes8.dex */
public class od6 extends nd6 {
    public static final ViewDataBinding.i J = null;
    public static final SparseIntArray K;
    public final RelativeLayout H;
    public long I;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        K = sparseIntArray;
        sparseIntArray.put(zqi.P, 1);
        sparseIntArray.put(zqi.K7, 2);
        sparseIntArray.put(zqi.u, 3);
        sparseIntArray.put(zqi.B4, 4);
        sparseIntArray.put(zqi.O2, 5);
        sparseIntArray.put(zqi.D3, 6);
        sparseIntArray.put(zqi.xa, 7);
    }

    public od6(rk5 rk5Var, View view, Object[] objArr) {
        super(rk5Var, view, 0, (Button) objArr[3], (FrameLayout) objArr[1], (LinearLayout) objArr[5], (ImageView) objArr[6], (RecyclerView) objArr[4], (Button) objArr[2], (TextView) objArr[7]);
        this.I = -1L;
        RelativeLayout relativeLayout = (RelativeLayout) objArr[0];
        this.H = relativeLayout;
        relativeLayout.setTag(null);
        o0(view);
        H();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean F() {
        synchronized (this) {
            try {
                return this.I != 0;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void H() {
        synchronized (this) {
            this.I = 1L;
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
            this.I = 0L;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean q0(int i, Object obj) {
        return true;
    }

    public od6(rk5 rk5Var, View view) {
        this(rk5Var, view, ViewDataBinding.P(rk5Var, view, 8, J, K));
    }
}
