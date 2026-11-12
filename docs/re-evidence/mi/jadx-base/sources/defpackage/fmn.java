package defpackage;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatEditText;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.ViewDataBinding;
import com.google.android.flexbox.FlexboxLayout;

/* JADX INFO: loaded from: classes10.dex */
public class fmn extends emn {
    public static final ViewDataBinding.i M = null;
    public static final SparseIntArray N;
    public long L;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        N = sparseIntArray;
        sparseIntArray.put(xri.i0, 1);
        sparseIntArray.put(xri.j0, 2);
        sparseIntArray.put(xri.h0, 3);
        sparseIntArray.put(xri.I3, 4);
        sparseIntArray.put(xri.G2, 5);
        sparseIntArray.put(xri.e0, 6);
        sparseIntArray.put(xri.H, 7);
        sparseIntArray.put(xri.S, 8);
        sparseIntArray.put(xri.Q, 9);
        sparseIntArray.put(xri.R, 10);
    }

    public fmn(rk5 rk5Var, View view, Object[] objArr) {
        super(rk5Var, view, 0, (LinearLayout) objArr[7], (Button) objArr[9], (Button) objArr[10], (Button) objArr[8], (CardView) objArr[6], (TextView) objArr[3], (LinearLayout) objArr[1], (TextView) objArr[2], (FlexboxLayout) objArr[0], (AppCompatEditText) objArr[5], (ConstraintLayout) objArr[4]);
        this.L = -1L;
        this.I.setTag(null);
        o0(view);
        H();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean F() {
        synchronized (this) {
            try {
                return this.L != 0;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void H() {
        synchronized (this) {
            this.L = 1L;
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
            this.L = 0L;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean q0(int i, Object obj) {
        return true;
    }

    public fmn(rk5 rk5Var, View view) {
        this(rk5Var, view, ViewDataBinding.P(rk5Var, view, 11, M, N));
    }
}
