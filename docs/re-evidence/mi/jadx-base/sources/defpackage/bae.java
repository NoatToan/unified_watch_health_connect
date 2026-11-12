package defpackage;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.LinearLayout;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import com.xiaomi.fitness.view.CardUnderstandView;
import com.xiaomi.fitness.view.HealthBannerCardSetView;
import com.xiaomi.fitness.widget.view.CardStyleSetView;

/* JADX INFO: loaded from: classes9.dex */
public class bae extends aae {
    public static final ViewDataBinding.i K = null;
    public static final SparseIntArray L;
    public final LinearLayout I;
    public long J;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        L = sparseIntArray;
        sparseIntArray.put(eri.b7, 1);
        sparseIntArray.put(eri.Cd, 2);
        sparseIntArray.put(eri.td, 3);
        sparseIntArray.put(eri.ud, 4);
        sparseIntArray.put(eri.sd, 5);
        sparseIntArray.put(eri.Dd, 6);
        sparseIntArray.put(eri.L5, 7);
        sparseIntArray.put(eri.uo, 8);
    }

    public bae(rk5 rk5Var, View view, Object[] objArr) {
        super(rk5Var, view, 0, (HealthBannerCardSetView) objArr[7], (CardStyleSetView) objArr[1], (RecyclerView) objArr[5], (RecyclerView) objArr[3], (RecyclerView) objArr[4], (RecyclerView) objArr[2], (RecyclerView) objArr[6], (CardUnderstandView) objArr[8]);
        this.J = -1L;
        LinearLayout linearLayout = (LinearLayout) objArr[0];
        this.I = linearLayout;
        linearLayout.setTag(null);
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

    public bae(rk5 rk5Var, View view) {
        this(rk5Var, view, ViewDataBinding.P(rk5Var, view, 9, K, L));
    }
}
