package defpackage;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.widget.NestedScrollView;
import androidx.databinding.ViewDataBinding;
import com.xiaomi.fitness.baseui.dialog.CustomCircleProgressBar;

/* JADX INFO: loaded from: classes5.dex */
public class iv3 extends hv3 {
    public static final ViewDataBinding.i S = null;
    public static final SparseIntArray T;
    public final ConstraintLayout Q;
    public long R;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        T = sparseIntArray;
        sparseIntArray.put(jqi.e, 1);
        sparseIntArray.put(jqi.g, 2);
        sparseIntArray.put(jqi.h, 3);
        sparseIntArray.put(jqi.o, 4);
        sparseIntArray.put(jqi.d, 5);
        sparseIntArray.put(jqi.c, 6);
        sparseIntArray.put(jqi.f23025b, 7);
        sparseIntArray.put(jqi.f23024a, 8);
        sparseIntArray.put(jqi.j, 9);
        sparseIntArray.put(jqi.q, 10);
        sparseIntArray.put(jqi.p, 11);
        sparseIntArray.put(jqi.f23027r, 12);
        sparseIntArray.put(jqi.i, 13);
        sparseIntArray.put(jqi.m, 14);
        sparseIntArray.put(jqi.n, 15);
        sparseIntArray.put(jqi.f, 16);
    }

    public iv3(rk5 rk5Var, View view, Object[] objArr) {
        super(rk5Var, view, 0, (ConstraintLayout) objArr[8], (TextView) objArr[7], (LinearLayoutCompat) objArr[6], (TextView) objArr[5], (NestedScrollView) objArr[1], (TextView) objArr[16], (ImageView) objArr[2], (TextView) objArr[3], (TextView) objArr[13], (LinearLayout) objArr[9], (TextView) objArr[14], (ProgressBar) objArr[15], (TextView) objArr[4], (CustomCircleProgressBar) objArr[11], (ProgressBar) objArr[10], (TextView) objArr[12]);
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

    public iv3(rk5 rk5Var, View view) {
        this(rk5Var, view, ViewDataBinding.P(rk5Var, view, 17, S, T));
    }
}
