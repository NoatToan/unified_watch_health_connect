package defpackage;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import com.xiaomi.fitness.widget.view.RoundImageView;
import com.xiaomi.wearable.data.sportmodel.detail.view.LinearGradientView;

/* JADX INFO: loaded from: classes10.dex */
public class rod extends qod {
    public static final ViewDataBinding.i S = null;
    public static final SparseIntArray T;
    public final ConstraintLayout Q;
    public long R;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        T = sparseIntArray;
        sparseIntArray.put(bsi.C6, 1);
        sparseIntArray.put(bsi.V3, 2);
        sparseIntArray.put(bsi.P9, 3);
        sparseIntArray.put(bsi.U3, 4);
        sparseIntArray.put(bsi.y8, 5);
        sparseIntArray.put(bsi.D5, 6);
        sparseIntArray.put(bsi.h2, 7);
        sparseIntArray.put(bsi.B4, 8);
        sparseIntArray.put(bsi.H6, 9);
        sparseIntArray.put(bsi.d2, 10);
        sparseIntArray.put(bsi.s, 11);
        sparseIntArray.put(bsi.F5, 12);
        sparseIntArray.put(bsi.U8, 13);
        sparseIntArray.put(bsi.D8, 14);
        sparseIntArray.put(bsi.M3, 15);
        sparseIntArray.put(bsi.k5, 16);
    }

    public rod(rk5 rk5Var, View view, Object[] objArr) {
        super(rk5Var, view, 0, (View) objArr[11], (FrameLayout) objArr[10], (RoundImageView) objArr[7], (LinearGradientView) objArr[15], (TextView) objArr[4], (TextView) objArr[2], (TextView) objArr[8], (RecyclerView) objArr[16], (RelativeLayout) objArr[6], (ConstraintLayout) objArr[12], (TextView) objArr[1], (TextView) objArr[9], (TextView) objArr[5], (TextView) objArr[14], (TextView) objArr[13], (TextView) objArr[3]);
        this.R = -1L;
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[0];
        this.Q = constraintLayout;
        constraintLayout.setTag(null);
        o0(view);
        H();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean F() {
        synchronized (this) {
            try {
                return this.R != 0;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void H() {
        synchronized (this) {
            this.R = 1L;
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
            this.R = 0L;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean q0(int i, Object obj) {
        return true;
    }

    public rod(rk5 rk5Var, View view) {
        this(rk5Var, view, ViewDataBinding.P(rk5Var, view, 17, S, T));
    }
}
