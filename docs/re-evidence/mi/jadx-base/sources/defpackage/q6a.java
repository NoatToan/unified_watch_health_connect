package defpackage;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import com.xiaomi.fitness.watch.face.widget.PhotoBgPicker;
import com.xiaomi.fitness.widget.view.DividerView;

/* JADX INFO: loaded from: classes10.dex */
public class q6a extends p6a {
    public static final ViewDataBinding.i N = null;
    public static final SparseIntArray O;
    public final ConstraintLayout L;
    public long M;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        O = sparseIntArray;
        sparseIntArray.put(isi.Q, 1);
        sparseIntArray.put(isi.x1, 2);
        sparseIntArray.put(isi.k2, 3);
        sparseIntArray.put(isi.n2, 4);
        sparseIntArray.put(isi.C, 5);
        sparseIntArray.put(isi.B, 6);
        sparseIntArray.put(isi.s, 7);
        sparseIntArray.put(isi.f22048a, 8);
        sparseIntArray.put(isi.f0, 9);
        sparseIntArray.put(isi.h, 10);
        sparseIntArray.put(isi.f22049b, 11);
    }

    public q6a(rk5 rk5Var, View view, Object[] objArr) {
        super(rk5Var, view, 0, (TextView) objArr[8], (TextView) objArr[11], (View) objArr[10], (LinearLayout) objArr[7], (RecyclerView) objArr[6], (TextView) objArr[5], (DividerView) objArr[1], (View) objArr[9], (PhotoBgPicker) objArr[2], (ConstraintLayout) objArr[3], (miuix.recyclerview.widget.RecyclerView) objArr[4]);
        this.M = -1L;
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[0];
        this.L = constraintLayout;
        constraintLayout.setTag(null);
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

    public q6a(rk5 rk5Var, View view) {
        this(rk5Var, view, ViewDataBinding.P(rk5Var, view, 12, N, O));
    }
}
