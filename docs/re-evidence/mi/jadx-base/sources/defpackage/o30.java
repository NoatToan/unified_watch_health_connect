package defpackage;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.databinding.ViewDataBinding;
import com.xiaomi.fitness.widget.view.DividerView;

/* JADX INFO: loaded from: classes7.dex */
public class o30 extends n30 {
    public static final ViewDataBinding.i J = null;
    public static final SparseIntArray K;
    public final RelativeLayout H;
    public long I;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        K = sparseIntArray;
        sparseIntArray.put(vqi.d, 1);
        sparseIntArray.put(vqi.t0, 2);
        sparseIntArray.put(vqi.e, 3);
        sparseIntArray.put(vqi.D, 4);
        sparseIntArray.put(vqi.c, 5);
        sparseIntArray.put(vqi.f37136k, 6);
        sparseIntArray.put(vqi.m, 7);
    }

    public o30(rk5 rk5Var, View view, Object[] objArr) {
        super(rk5Var, view, 0, (TextView) objArr[5], (ImageView) objArr[1], (TextView) objArr[3], (LinearLayout) objArr[6], (TextView) objArr[7], (DividerView) objArr[4], (LinearLayout) objArr[2]);
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

    public o30(rk5 rk5Var, View view) {
        this(rk5Var, view, ViewDataBinding.P(rk5Var, view, 8, J, K));
    }
}
