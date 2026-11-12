package defpackage;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.databinding.ViewDataBinding;
import com.xiaomi.fitness.widget.view.DividerView;

/* JADX INFO: loaded from: classes7.dex */
public class a60 extends z50 {
    public static final ViewDataBinding.i S = null;
    public static final SparseIntArray T;
    public final LinearLayout Q;
    public long R;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        T = sparseIntArray;
        sparseIntArray.put(vqi.C, 1);
        sparseIntArray.put(vqi.i0, 2);
        sparseIntArray.put(vqi.h0, 3);
        sparseIntArray.put(vqi.L, 4);
        sparseIntArray.put(vqi.q0, 5);
        sparseIntArray.put(vqi.p0, 6);
        sparseIntArray.put(vqi.g, 7);
        sparseIntArray.put(vqi.u, 8);
        sparseIntArray.put(vqi.v, 9);
        sparseIntArray.put(vqi.h, 10);
        sparseIntArray.put(vqi.c0, 11);
        sparseIntArray.put(vqi.b0, 12);
        sparseIntArray.put(vqi.i, 13);
        sparseIntArray.put(vqi.t, 14);
        sparseIntArray.put(vqi.s, 15);
        sparseIntArray.put(vqi.j, 16);
    }

    public a60(rk5 rk5Var, View view, Object[] objArr) {
        super(rk5Var, view, 0, (ImageView) objArr[7], (ImageView) objArr[10], (ImageView) objArr[13], (ImageView) objArr[16], (AppCompatTextView) objArr[15], (AppCompatTextView) objArr[14], (AppCompatTextView) objArr[8], (AppCompatTextView) objArr[9], (DividerView) objArr[1], (ImageView) objArr[4], (AppCompatTextView) objArr[12], (AppCompatTextView) objArr[11], (AppCompatTextView) objArr[3], (AppCompatTextView) objArr[2], (AppCompatTextView) objArr[6], (AppCompatTextView) objArr[5]);
        this.R = -1L;
        LinearLayout linearLayout = (LinearLayout) objArr[0];
        this.Q = linearLayout;
        linearLayout.setTag(null);
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

    public a60(rk5 rk5Var, View view) {
        this(rk5Var, view, ViewDataBinding.P(rk5Var, view, 17, S, T));
    }
}
