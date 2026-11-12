package defpackage;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import miuix.core.widget.NestedScrollView;
import miuix.springback.view.SpringBackLayout;

/* JADX INFO: loaded from: classes8.dex */
public class rm6 extends qm6 {
    public static final ViewDataBinding.i K = null;
    public static final SparseIntArray L;
    public final SpringBackLayout I;
    public long J;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        L = sparseIntArray;
        sparseIntArray.put(zqi.M7, 1);
        sparseIntArray.put(zqi.C4, 2);
        sparseIntArray.put(zqi.A4, 3);
        sparseIntArray.put(zqi.X3, 4);
        sparseIntArray.put(zqi.Y3, 5);
        sparseIntArray.put(zqi.V3, 6);
        sparseIntArray.put(zqi.i, 7);
        sparseIntArray.put(zqi.h, 8);
    }

    public rm6(rk5 rk5Var, View view, Object[] objArr) {
        super(rk5Var, view, 0, (Button) objArr[8], (FrameLayout) objArr[7], (TextView) objArr[6], (LinearLayout) objArr[4], (ImageView) objArr[5], (RecyclerView) objArr[3], (LinearLayout) objArr[2], (NestedScrollView) objArr[1]);
        this.J = -1L;
        SpringBackLayout springBackLayout = (SpringBackLayout) objArr[0];
        this.I = springBackLayout;
        springBackLayout.setTag(null);
        o0(view);
        H();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean F() {
        synchronized (this) {
            try {
                return this.J != 0;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void H() {
        synchronized (this) {
            this.J = 1L;
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
            this.J = 0L;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean q0(int i, Object obj) {
        return true;
    }

    public rm6(rk5 rk5Var, View view) {
        this(rk5Var, view, ViewDataBinding.P(rk5Var, view, 9, K, L));
    }
}
