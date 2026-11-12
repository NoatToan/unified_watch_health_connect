package defpackage;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import com.xiaomi.fitness.widget.button.SwitchButton;

/* JADX INFO: loaded from: classes8.dex */
public class zdb extends ydb {
    public static final ViewDataBinding.i P = null;
    public static final SparseIntArray Q;
    public long O;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        Q = sparseIntArray;
        sparseIntArray.put(dri.L, 1);
        sparseIntArray.put(dri.C, 2);
        sparseIntArray.put(dri.Y, 3);
        sparseIntArray.put(dri.i, 4);
        sparseIntArray.put(dri.G, 5);
        sparseIntArray.put(dri.n, 6);
        sparseIntArray.put(dri.V, 7);
        sparseIntArray.put(dri.j, 8);
        sparseIntArray.put(dri.f15839b, 9);
        sparseIntArray.put(dri.c, 10);
        sparseIntArray.put(dri.X, 11);
        sparseIntArray.put(dri.x, 12);
        sparseIntArray.put(dri.y, 13);
    }

    public zdb(rk5 rk5Var, View view, Object[] objArr) {
        super(rk5Var, view, 0, (RelativeLayout) objArr[9], (TextView) objArr[10], (TextView) objArr[4], (SwitchButton) objArr[8], (RecyclerView) objArr[6], (ImageView) objArr[12], (ImageView) objArr[13], (ImageView) objArr[2], (TextView) objArr[5], (RelativeLayout) objArr[0], (ScrollView) objArr[1], (RecyclerView) objArr[7], (RelativeLayout) objArr[11], (TextView) objArr[3]);
        this.O = -1L;
        this.J.setTag(null);
        o0(view);
        H();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean F() {
        synchronized (this) {
            try {
                return this.O != 0;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void H() {
        synchronized (this) {
            this.O = 1L;
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
            this.O = 0L;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean q0(int i, Object obj) {
        return true;
    }

    public zdb(rk5 rk5Var, View view) {
        this(rk5Var, view, ViewDataBinding.P(rk5Var, view, 14, P, Q));
    }
}
