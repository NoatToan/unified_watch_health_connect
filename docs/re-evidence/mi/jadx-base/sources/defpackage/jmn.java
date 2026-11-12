package defpackage;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.ViewDataBinding;
import com.xiaomi.fitness.sport.baseui.SportNumberPicker;

/* JADX INFO: loaded from: classes10.dex */
public class jmn extends imn {
    public static final ViewDataBinding.i N = null;
    public static final SparseIntArray O;
    public long M;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        O = sparseIntArray;
        sparseIntArray.put(xri.i0, 1);
        sparseIntArray.put(xri.o7, 2);
        sparseIntArray.put(xri.V6, 3);
        sparseIntArray.put(xri.I3, 4);
        sparseIntArray.put(xri.J3, 5);
        sparseIntArray.put(xri.h7, 6);
        sparseIntArray.put(xri.o6, 7);
        sparseIntArray.put(xri.e8, 8);
        sparseIntArray.put(xri.H, 9);
        sparseIntArray.put(xri.S, 10);
        sparseIntArray.put(xri.P, 11);
    }

    public jmn(rk5 rk5Var, View view, Object[] objArr) {
        super(rk5Var, view, 0, (LinearLayout) objArr[9], (Button) objArr[11], (Button) objArr[10], (LinearLayout) objArr[1], (LinearLayout) objArr[0], (LinearLayout) objArr[4], (ConstraintLayout) objArr[5], (SportNumberPicker) objArr[7], (TextView) objArr[3], (TextView) objArr[6], (TextView) objArr[2], (TextView) objArr[8]);
        this.M = -1L;
        this.E.setTag(null);
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

    public jmn(rk5 rk5Var, View view) {
        this(rk5Var, view, ViewDataBinding.P(rk5Var, view, 12, N, O));
    }
}
