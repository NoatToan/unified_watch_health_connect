package defpackage;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.ViewDataBinding;
import com.xiaomi.fitness.widget.SwitchButtonTwoLineTextView;
import miuix.androidbasewidget.widget.CheckedTextView;
import miuix.core.widget.NestedScrollView;

/* JADX INFO: loaded from: classes8.dex */
public class f1h extends e1h {
    public static final ViewDataBinding.i Z = null;
    public static final SparseIntArray a0;
    public final ConstraintLayout X;
    public long Y;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        a0 = sparseIntArray;
        sparseIntArray.put(zqi.M7, 1);
        sparseIntArray.put(zqi.a6, 2);
        sparseIntArray.put(zqi.U5, 3);
        sparseIntArray.put(zqi.T5, 4);
        sparseIntArray.put(zqi.S5, 5);
        sparseIntArray.put(zqi.R5, 6);
        sparseIntArray.put(zqi.V5, 7);
        sparseIntArray.put(zqi.Q5, 8);
        sparseIntArray.put(zqi.e0, 9);
        sparseIntArray.put(zqi.d0, 10);
        sparseIntArray.put(zqi.c0, 11);
        sparseIntArray.put(zqi.b0, 12);
        sparseIntArray.put(zqi.f0, 13);
        sparseIntArray.put(zqi.E9, 14);
        sparseIntArray.put(zqi.g9, 15);
        sparseIntArray.put(zqi.x9, 16);
        sparseIntArray.put(zqi.A9, 17);
        sparseIntArray.put(zqi.z9, 18);
        sparseIntArray.put(zqi.B9, 19);
        sparseIntArray.put(zqi.y9, 20);
        sparseIntArray.put(zqi.i0, 21);
        sparseIntArray.put(zqi.m6, 22);
        sparseIntArray.put(zqi.e3, 23);
    }

    public f1h(rk5 rk5Var, View view, Object[] objArr) {
        super(rk5Var, view, 0, (CheckedTextView) objArr[12], (ConstraintLayout) objArr[11], (AppCompatTextView) objArr[10], (AppCompatTextView) objArr[9], (AppCompatTextView) objArr[13], (Button) objArr[21], (Button) objArr[23], (ConstraintLayout) objArr[8], (CheckedTextView) objArr[6], (ConstraintLayout) objArr[5], (AppCompatTextView) objArr[4], (AppCompatTextView) objArr[3], (AppCompatTextView) objArr[7], (ConstraintLayout) objArr[2], (Button) objArr[22], (NestedScrollView) objArr[1], (SwitchButtonTwoLineTextView) objArr[15], (ConstraintLayout) objArr[16], (CheckedTextView) objArr[20], (AppCompatTextView) objArr[18], (AppCompatTextView) objArr[17], (ConstraintLayout) objArr[19], (LinearLayout) objArr[14]);
        this.Y = -1L;
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[0];
        this.X = constraintLayout;
        constraintLayout.setTag(null);
        o0(view);
        H();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean F() {
        synchronized (this) {
            try {
                return this.Y != 0;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void H() {
        synchronized (this) {
            this.Y = 1L;
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
            this.Y = 0L;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean q0(int i, Object obj) {
        return true;
    }

    public f1h(rk5 rk5Var, View view) {
        this(rk5Var, view, ViewDataBinding.P(rk5Var, view, 24, Z, a0));
    }
}
