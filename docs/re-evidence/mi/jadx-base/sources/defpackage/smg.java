package defpackage;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.databinding.ViewDataBinding;
import com.xiaomi.fitness.nfc.widget.SafeEditText;

/* JADX INFO: loaded from: classes9.dex */
public class smg extends rmg {
    public static final ViewDataBinding.i L = null;
    public static final SparseIntArray M;
    public final ScrollView J;
    public long K;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        M = sparseIntArray;
        sparseIntArray.put(mri.i, 1);
        sparseIntArray.put(mri.m4, 2);
        sparseIntArray.put(mri.M0, 3);
        sparseIntArray.put(mri.O0, 4);
        sparseIntArray.put(mri.n4, 5);
        sparseIntArray.put(mri.v2, 6);
        sparseIntArray.put(mri.O1, 7);
        sparseIntArray.put(mri.U2, 8);
        sparseIntArray.put(mri.L, 9);
    }

    public smg(rk5 rk5Var, View view, Object[] objArr) {
        super(rk5Var, view, 0, (TextView) objArr[1], (View) objArr[9], (RelativeLayout) objArr[3], (SafeEditText) objArr[4], (TextView) objArr[7], (View) objArr[6], (TextView) objArr[8], (TextView) objArr[2], (TextView) objArr[5]);
        this.K = -1L;
        ScrollView scrollView = (ScrollView) objArr[0];
        this.J = scrollView;
        scrollView.setTag(null);
        o0(view);
        H();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean F() {
        synchronized (this) {
            try {
                return this.K != 0;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void H() {
        synchronized (this) {
            this.K = 1L;
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
            this.K = 0L;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean q0(int i, Object obj) {
        return true;
    }

    public smg(rk5 rk5Var, View view) {
        this(rk5Var, view, ViewDataBinding.P(rk5Var, view, 10, L, M));
    }
}
