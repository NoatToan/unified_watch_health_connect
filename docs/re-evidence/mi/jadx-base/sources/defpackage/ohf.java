package defpackage;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.ViewDataBinding;
import com.xiaomi.fitness.medal.share.MedalShareContentView;
import com.xiaomi.fitness.widget.view.RoundImageView;

/* JADX INFO: loaded from: classes9.dex */
public class ohf extends nhf {
    public static final ViewDataBinding.i Q = null;
    public static final SparseIntArray R;
    public long P;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        R = sparseIntArray;
        sparseIntArray.put(iri.A, 1);
        sparseIntArray.put(iri.Q, 2);
        sparseIntArray.put(iri.f22018a, 3);
        sparseIntArray.put(iri.t0, 4);
        sparseIntArray.put(iri.k0, 5);
        sparseIntArray.put(iri.l0, 6);
        sparseIntArray.put(iri.m0, 7);
        sparseIntArray.put(iri.u, 8);
        sparseIntArray.put(iri.n, 9);
        sparseIntArray.put(iri.d, 10);
        sparseIntArray.put(iri.n0, 11);
        sparseIntArray.put(iri.V, 12);
        sparseIntArray.put(iri.R, 13);
        sparseIntArray.put(iri.j, 14);
    }

    public ohf(rk5 rk5Var, View view, Object[] objArr) {
        super(rk5Var, view, 0, (TextView) objArr[3], (ConstraintLayout) objArr[10], (TextView) objArr[14], (View) objArr[9], (TextView) objArr[8], (LinearLayout) objArr[1], (RoundImageView) objArr[2], (TextView) objArr[13], (RoundImageView) objArr[12], (ConstraintLayout) objArr[0], (MedalShareContentView) objArr[5], (ImageView) objArr[6], (TextView) objArr[7], (ImageView) objArr[11], (TextView) objArr[4]);
        this.P = -1L;
        this.J.setTag(null);
        o0(view);
        H();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean F() {
        synchronized (this) {
            try {
                return this.P != 0;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void H() {
        synchronized (this) {
            this.P = 1L;
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
            this.P = 0L;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean q0(int i, Object obj) {
        return true;
    }

    public ohf(rk5 rk5Var, View view) {
        this(rk5Var, view, ViewDataBinding.P(rk5Var, view, 15, Q, R));
    }
}
