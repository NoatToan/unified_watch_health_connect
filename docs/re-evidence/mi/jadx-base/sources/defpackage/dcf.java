package defpackage;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.widget.NestedScrollView;
import androidx.databinding.ViewDataBinding;
import com.xiaomi.fitness.medal.widget.MedalShareContentCardView;

/* JADX INFO: loaded from: classes9.dex */
public class dcf extends bcf {
    public static final ViewDataBinding.i R = null;
    public static final SparseIntArray S;
    public final ConstraintLayout P;
    public long Q;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        S = sparseIntArray;
        sparseIntArray.put(iri.L, 1);
        sparseIntArray.put(iri.j0, 2);
        sparseIntArray.put(iri.i0, 3);
        sparseIntArray.put(iri.p0, 4);
        sparseIntArray.put(iri.y0, 5);
        sparseIntArray.put(iri.e, 6);
        sparseIntArray.put(iri.c0, 7);
        sparseIntArray.put(iri.v, 8);
        sparseIntArray.put(iri.u0, 9);
        sparseIntArray.put(iri.e0, 10);
        sparseIntArray.put(iri.w, 11);
        sparseIntArray.put(iri.v0, 12);
        sparseIntArray.put(iri.d0, 13);
        sparseIntArray.put(iri.x, 14);
        sparseIntArray.put(iri.w0, 15);
    }

    public dcf(rk5 rk5Var, View view, Object[] objArr) {
        super(rk5Var, view, 0, (FrameLayout) objArr[6], (ImageView) objArr[8], (ImageView) objArr[11], (ImageView) objArr[14], (ImageView) objArr[1], (RelativeLayout) objArr[7], (RelativeLayout) objArr[13], (RelativeLayout) objArr[10], (MedalShareContentCardView) objArr[3], (NestedScrollView) objArr[2], (ConstraintLayout) objArr[4], (TextView) objArr[9], (TextView) objArr[12], (TextView) objArr[15], (ImageView) objArr[5]);
        this.Q = -1L;
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[0];
        this.P = constraintLayout;
        constraintLayout.setTag(null);
        o0(view);
        H();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean F() {
        synchronized (this) {
            try {
                return this.Q != 0;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void H() {
        synchronized (this) {
            this.Q = 1L;
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
            this.Q = 0L;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean q0(int i, Object obj) {
        return true;
    }

    public dcf(rk5 rk5Var, View view) {
        this(rk5Var, view, ViewDataBinding.P(rk5Var, view, 16, R, S));
    }
}
