package defpackage;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.LinearLayout;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import com.xiaomi.fitness.view.CardUnderstandView;
import com.xiaomi.fitness.view.HealthBannerCardSetView;

/* JADX INFO: loaded from: classes9.dex */
public class uce extends tce {
    public static final ViewDataBinding.i G = null;
    public static final SparseIntArray H;
    public final LinearLayout E;
    public long F;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        H = sparseIntArray;
        sparseIntArray.put(eri.Ed, 1);
        sparseIntArray.put(eri.Fd, 2);
        sparseIntArray.put(eri.L5, 3);
        sparseIntArray.put(eri.uo, 4);
    }

    public uce(rk5 rk5Var, View view, Object[] objArr) {
        super(rk5Var, view, 0, (HealthBannerCardSetView) objArr[3], (RecyclerView) objArr[1], (RecyclerView) objArr[2], (CardUnderstandView) objArr[4]);
        this.F = -1L;
        LinearLayout linearLayout = (LinearLayout) objArr[0];
        this.E = linearLayout;
        linearLayout.setTag(null);
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

    public uce(rk5 rk5Var, View view) {
        this(rk5Var, view, ViewDataBinding.P(rk5Var, view, 5, G, H));
    }
}
