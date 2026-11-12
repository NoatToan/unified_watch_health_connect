package defpackage;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.databinding.ViewDataBinding;
import com.xiaomi.fitness.widget.view.DurationTextView;

/* JADX INFO: loaded from: classes9.dex */
public class bxb extends axb {
    public static final ViewDataBinding.i J = null;
    public static final SparseIntArray K;
    public long I;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        K = sparseIntArray;
        sparseIntArray.put(eri.ab, 1);
        sparseIntArray.put(eri.o9, 2);
        sparseIntArray.put(eri.en, 3);
        sparseIntArray.put(eri.Pg, 4);
        sparseIntArray.put(eri.p4, 5);
        sparseIntArray.put(eri.Wm, 6);
        sparseIntArray.put(eri.Vl, 7);
    }

    public bxb(rk5 rk5Var, View view, Object[] objArr) {
        super(rk5Var, view, 0, (DurationTextView) objArr[5], (AppCompatImageView) objArr[2], (LinearLayout) objArr[0], (LinearLayout) objArr[1], (View) objArr[4], (TextView) objArr[7], (TextView) objArr[6], (TextView) objArr[3]);
        this.I = -1L;
        this.C.setTag(null);
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

    public bxb(rk5 rk5Var, View view) {
        this(rk5Var, view, ViewDataBinding.P(rk5Var, view, 8, J, K));
    }
}
