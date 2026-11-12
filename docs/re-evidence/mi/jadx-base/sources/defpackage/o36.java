package defpackage;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.ScrollView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.databinding.ViewDataBinding;

/* JADX INFO: loaded from: classes8.dex */
public class o36 extends n36 {
    public static final ViewDataBinding.i D = null;
    public static final SparseIntArray E;
    public final ScrollView B;
    public long C;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        E = sparseIntArray;
        sparseIntArray.put(xqi.s0, 1);
    }

    public o36(rk5 rk5Var, View view, Object[] objArr) {
        super(rk5Var, view, 0, (AppCompatTextView) objArr[1]);
        this.C = -1L;
        ScrollView scrollView = (ScrollView) objArr[0];
        this.B = scrollView;
        scrollView.setTag(null);
        o0(view);
        H();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean F() {
        synchronized (this) {
            try {
                return this.C != 0;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void H() {
        synchronized (this) {
            this.C = 1L;
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
            this.C = 0L;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean q0(int i, Object obj) {
        return true;
    }

    public o36(rk5 rk5Var, View view) {
        this(rk5Var, view, ViewDataBinding.P(rk5Var, view, 2, D, E));
    }
}
