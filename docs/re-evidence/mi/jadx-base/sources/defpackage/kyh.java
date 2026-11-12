package defpackage;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import com.xiaomi.fitness.health.threetarget.model.ThreeTargetView;
import com.xiaomi.fitness.widget.view.DividerView;

/* JADX INFO: loaded from: classes7.dex */
public class kyh extends jyh {
    public static final ViewDataBinding.i N = null;
    public static final SparseIntArray O;
    public final RelativeLayout L;
    public long M;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        O = sparseIntArray;
        sparseIntArray.put(wqi.h0, 1);
        sparseIntArray.put(wqi.u0, 2);
        sparseIntArray.put(wqi.D0, 3);
        sparseIntArray.put(wqi.h, 4);
        sparseIntArray.put(wqi.A0, 5);
        sparseIntArray.put(wqi.s1, 6);
        sparseIntArray.put(wqi.u, 7);
        sparseIntArray.put(wqi.n, 8);
        sparseIntArray.put(wqi.E, 9);
        sparseIntArray.put(wqi.g, 10);
        sparseIntArray.put(wqi.i0, 11);
    }

    public kyh(rk5 rk5Var, View view, Object[] objArr) {
        super(rk5Var, view, 0, (Button) objArr[10], (AppCompatImageView) objArr[4], (DividerView) objArr[8], (RecyclerView) objArr[7], (TextView) objArr[9], (View) objArr[1], (TextView) objArr[11], (RelativeLayout) objArr[2], (TextView) objArr[5], (ThreeTargetView) objArr[3], (TextView) objArr[6]);
        this.M = -1L;
        RelativeLayout relativeLayout = (RelativeLayout) objArr[0];
        this.L = relativeLayout;
        relativeLayout.setTag(null);
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

    public kyh(rk5 rk5Var, View view) {
        this(rk5Var, view, ViewDataBinding.P(rk5Var, view, 12, N, O));
    }
}
