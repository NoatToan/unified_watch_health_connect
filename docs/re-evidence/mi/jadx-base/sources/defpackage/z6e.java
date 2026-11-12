package defpackage;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.databinding.ViewDataBinding;

/* JADX INFO: loaded from: classes9.dex */
public class z6e extends x6e {
    public static final ViewDataBinding.i N = null;
    public static final SparseIntArray O;
    public final FrameLayout L;
    public long M;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        O = sparseIntArray;
        sparseIntArray.put(eri.Za, 1);
        sparseIntArray.put(eri.Oa, 2);
        sparseIntArray.put(eri.uk, 3);
        sparseIntArray.put(eri.wk, 4);
        sparseIntArray.put(eri.vk, 5);
        sparseIntArray.put(eri.Wa, 6);
        sparseIntArray.put(eri.dm, 7);
        sparseIntArray.put(eri.fm, 8);
        sparseIntArray.put(eri.em, 9);
        sparseIntArray.put(eri.Bj, 10);
        sparseIntArray.put(eri.Cj, 11);
    }

    public z6e(rk5 rk5Var, View view, Object[] objArr) {
        super(rk5Var, view, 0, (LinearLayout) objArr[2], (LinearLayout) objArr[6], (LinearLayout) objArr[1], (TextView) objArr[3], (TextView) objArr[5], (TextView) objArr[4], (TextView) objArr[10], (TextView) objArr[11], (TextView) objArr[7], (TextView) objArr[9], (TextView) objArr[8]);
        this.M = -1L;
        FrameLayout frameLayout = (FrameLayout) objArr[0];
        this.L = frameLayout;
        frameLayout.setTag(null);
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

    public z6e(rk5 rk5Var, View view) {
        this(rk5Var, view, ViewDataBinding.P(rk5Var, view, 12, N, O));
    }
}
