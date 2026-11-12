package defpackage;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.ViewDataBinding;
import com.xiaomi.fitness.widget.RightArrowSingleLineTextView;
import com.xiaomi.fitness.widget.RightArrowTwoLineTextView;

/* JADX INFO: loaded from: classes5.dex */
public class m9a extends l9a {
    public static final ViewDataBinding.i Y = null;
    public static final SparseIntArray Z;
    public final ConstraintLayout W;
    public long X;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        Z = sparseIntArray;
        sparseIntArray.put(kqi.O, 1);
        sparseIntArray.put(kqi.G, 2);
        sparseIntArray.put(kqi.H, 3);
        sparseIntArray.put(kqi.F, 4);
        sparseIntArray.put(kqi.E, 5);
        sparseIntArray.put(kqi.P, 6);
        sparseIntArray.put(kqi.R, 7);
        sparseIntArray.put(kqi.Q, 8);
        sparseIntArray.put(kqi.N, 9);
        sparseIntArray.put(kqi.J, 10);
        sparseIntArray.put(kqi.I, 11);
        sparseIntArray.put(kqi.K, 12);
        sparseIntArray.put(kqi.M, 13);
        sparseIntArray.put(kqi.L, 14);
        sparseIntArray.put(kqi.n, 15);
        sparseIntArray.put(kqi.m, 16);
        sparseIntArray.put(kqi.l, 17);
        sparseIntArray.put(kqi.f24196k, 18);
        sparseIntArray.put(kqi.j, 19);
        sparseIntArray.put(kqi.B, 20);
        sparseIntArray.put(kqi.C, 21);
        sparseIntArray.put(kqi.D, 22);
    }

    public m9a(rk5 rk5Var, View view, Object[] objArr) {
        super(rk5Var, view, 0, (TextView) objArr[19], (TextView) objArr[18], (TextView) objArr[17], (TextView) objArr[16], (View) objArr[15], (Button) objArr[20], (Button) objArr[21], (Button) objArr[22], (TextView) objArr[5], (View) objArr[4], (RightArrowTwoLineTextView) objArr[2], (RightArrowTwoLineTextView) objArr[3], (RightArrowSingleLineTextView) objArr[11], (ConstraintLayout) objArr[10], (RightArrowTwoLineTextView) objArr[12], (RightArrowTwoLineTextView) objArr[14], (RightArrowTwoLineTextView) objArr[13], (TextView) objArr[9], (ConstraintLayout) objArr[1], (RightArrowSingleLineTextView) objArr[6], (RightArrowSingleLineTextView) objArr[8], (RightArrowSingleLineTextView) objArr[7]);
        this.X = -1L;
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[0];
        this.W = constraintLayout;
        constraintLayout.setTag(null);
        o0(view);
        H();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean F() {
        synchronized (this) {
            try {
                return this.X != 0;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void H() {
        synchronized (this) {
            this.X = 1L;
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
            this.X = 0L;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean q0(int i, Object obj) {
        return true;
    }

    public m9a(rk5 rk5Var, View view) {
        this(rk5Var, view, ViewDataBinding.P(rk5Var, view, 23, Y, Z));
    }
}
