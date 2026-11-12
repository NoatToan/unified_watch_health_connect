package defpackage;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.ViewDataBinding;
import com.xiaomi.fitness.widget.RightArrowSingleLineTextView;
import com.xiaomi.fitness.widget.RightArrowTwoLineTextView;
import com.xiaomi.fitness.widget.SwitchButtonSingleLineTextView;

/* JADX INFO: loaded from: classes9.dex */
public class jsb extends isb {
    public static final ViewDataBinding.i Y = null;
    public static final SparseIntArray Z;
    public final LinearLayout W;
    public long X;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        Z = sparseIntArray;
        sparseIntArray.put(eri.oh, 1);
        sparseIntArray.put(eri.m2, 2);
        sparseIntArray.put(eri.n2, 3);
        sparseIntArray.put(eri.o2, 4);
        sparseIntArray.put(eri.j2, 5);
        sparseIntArray.put(eri.p2, 6);
        sparseIntArray.put(eri.q2, 7);
        sparseIntArray.put(eri.v, 8);
        sparseIntArray.put(eri.Vc, 9);
        sparseIntArray.put(eri.h2, 10);
        sparseIntArray.put(eri.i2, 11);
        sparseIntArray.put(eri.F, 12);
        sparseIntArray.put(eri.B, 13);
        sparseIntArray.put(eri.D, 14);
        sparseIntArray.put(eri.A, 15);
        sparseIntArray.put(eri.k2, 16);
        sparseIntArray.put(eri.l2, 17);
        sparseIntArray.put(eri.G3, 18);
        sparseIntArray.put(eri.A3, 19);
        sparseIntArray.put(eri.D3, 20);
        sparseIntArray.put(eri.z3, 21);
        sparseIntArray.put(eri.lh, 22);
    }

    public jsb(rk5 rk5Var, View view, Object[] objArr) {
        super(rk5Var, view, 0, (SwitchButtonSingleLineTextView) objArr[8], (RightArrowSingleLineTextView) objArr[15], (RightArrowSingleLineTextView) objArr[13], (RightArrowSingleLineTextView) objArr[14], (SwitchButtonSingleLineTextView) objArr[12], (TextView) objArr[10], (LinearLayout) objArr[11], (RightArrowTwoLineTextView) objArr[5], (TextView) objArr[16], (LinearLayout) objArr[17], (TextView) objArr[2], (LinearLayout) objArr[3], (RightArrowTwoLineTextView) objArr[4], (TextView) objArr[6], (LinearLayout) objArr[7], (RightArrowSingleLineTextView) objArr[21], (RightArrowSingleLineTextView) objArr[19], (RightArrowSingleLineTextView) objArr[20], (SwitchButtonSingleLineTextView) objArr[18], (SwitchButtonSingleLineTextView) objArr[9], (Button) objArr[22], (ConstraintLayout) objArr[1]);
        this.X = -1L;
        LinearLayout linearLayout = (LinearLayout) objArr[0];
        this.W = linearLayout;
        linearLayout.setTag(null);
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

    public jsb(rk5 rk5Var, View view) {
        this(rk5Var, view, ViewDataBinding.P(rk5Var, view, 23, Y, Z));
    }
}
