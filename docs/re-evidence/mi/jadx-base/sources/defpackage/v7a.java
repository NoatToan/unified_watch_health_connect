package defpackage;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.databinding.ViewDataBinding;
import miuix.recyclerview.widget.RecyclerView;

/* JADX INFO: loaded from: classes9.dex */
public class v7a extends u7a {
    public static final ViewDataBinding.i G = null;
    public static final SparseIntArray H;
    public final LinearLayoutCompat E;
    public long F;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        H = sparseIntArray;
        sparseIntArray.put(eri.X6, 1);
        sparseIntArray.put(eri.fb, 2);
        sparseIntArray.put(eri.Ol, 3);
        sparseIntArray.put(eri.pd, 4);
    }

    public v7a(rk5 rk5Var, View view, Object[] objArr) {
        super(rk5Var, view, 0, (TextView) objArr[1], (RelativeLayout) objArr[2], (RecyclerView) objArr[4], (TextView) objArr[3]);
        this.F = -1L;
        LinearLayoutCompat linearLayoutCompat = (LinearLayoutCompat) objArr[0];
        this.E = linearLayoutCompat;
        linearLayoutCompat.setTag(null);
        o0(view);
        H();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean F() {
        synchronized (this) {
            try {
                return this.F != 0;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void H() {
        synchronized (this) {
            this.F = 1L;
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
            this.F = 0L;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean q0(int i, Object obj) {
        return true;
    }

    public v7a(rk5 rk5Var, View view) {
        this(rk5Var, view, ViewDataBinding.P(rk5Var, view, 5, G, H));
    }
}
