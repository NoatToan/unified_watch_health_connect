package defpackage;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.ViewDataBinding;
import com.xiaomi.fitness.detail.view.ShareTrackLineView;
import com.xiaomi.fitness.share.view.ShareRoutineView;
import com.xiaomi.fitness.widget.view.RoundImageView;

/* JADX INFO: loaded from: classes10.dex */
public class lod extends kod {
    public static final ViewDataBinding.i O = null;
    public static final SparseIntArray P;
    public final LinearLayout M;
    public long N;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        P = sparseIntArray;
        sparseIntArray.put(bsi.h2, 1);
        sparseIntArray.put(bsi.B4, 2);
        sparseIntArray.put(bsi.C6, 3);
        sparseIntArray.put(bsi.Z5, 4);
        sparseIntArray.put(bsi.l6, 5);
        sparseIntArray.put(bsi.V3, 6);
        sparseIntArray.put(bsi.P9, 7);
        sparseIntArray.put(bsi.Q6, 8);
        sparseIntArray.put(bsi.Y0, 9);
        sparseIntArray.put(bsi.V0, 10);
        sparseIntArray.put(bsi.X0, 11);
        sparseIntArray.put(bsi.W0, 12);
    }

    public lod(rk5 rk5Var, View view, Object[] objArr) {
        super(rk5Var, view, 0, (TextView) objArr[10], (TextView) objArr[12], (TextView) objArr[11], (ConstraintLayout) objArr[9], (RoundImageView) objArr[1], (TextView) objArr[6], (TextView) objArr[2], (ShareRoutineView) objArr[4], (ShareTrackLineView) objArr[5], (TextView) objArr[8], (TextView) objArr[3], (TextView) objArr[7]);
        this.N = -1L;
        LinearLayout linearLayout = (LinearLayout) objArr[0];
        this.M = linearLayout;
        linearLayout.setTag(null);
        o0(view);
        H();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean F() {
        synchronized (this) {
            try {
                return this.N != 0;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void H() {
        synchronized (this) {
            this.N = 1L;
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
            this.N = 0L;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean q0(int i, Object obj) {
        return true;
    }

    public lod(rk5 rk5Var, View view) {
        this(rk5Var, view, ViewDataBinding.P(rk5Var, view, 13, O, P));
    }
}
