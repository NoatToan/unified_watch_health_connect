package defpackage;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.LinearLayout;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import com.xiaomi.fitness.common.devicelist.SportsDeviceListView;
import com.xiaomi.fitness.view.CardUnderstandView;
import com.xiaomi.fitness.view.HealthBannerCardSetView;

/* JADX INFO: loaded from: classes9.dex */
public class mde extends lde {
    public static final ViewDataBinding.i H = null;
    public static final SparseIntArray I;
    public final LinearLayout F;
    public long G;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        I = sparseIntArray;
        sparseIntArray.put(eri.Jd, 1);
        sparseIntArray.put(eri.Kd, 2);
        sparseIntArray.put(eri.B3, 3);
        sparseIntArray.put(eri.L5, 4);
        sparseIntArray.put(eri.uo, 5);
    }

    public mde(rk5 rk5Var, View view, Object[] objArr) {
        super(rk5Var, view, 0, (SportsDeviceListView) objArr[3], (HealthBannerCardSetView) objArr[4], (RecyclerView) objArr[1], (RecyclerView) objArr[2], (CardUnderstandView) objArr[5]);
        this.G = -1L;
        LinearLayout linearLayout = (LinearLayout) objArr[0];
        this.F = linearLayout;
        linearLayout.setTag(null);
        o0(view);
        H();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean F() {
        synchronized (this) {
            try {
                return this.G != 0;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void H() {
        synchronized (this) {
            this.G = 1L;
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
            this.G = 0L;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean q0(int i, Object obj) {
        return true;
    }

    public mde(rk5 rk5Var, View view) {
        this(rk5Var, view, ViewDataBinding.P(rk5Var, view, 6, H, I));
    }
}
