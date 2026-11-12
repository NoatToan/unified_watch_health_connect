package defpackage;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.LinearLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.widget.NestedScrollView;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import com.fitness.banner.export.view.AnnouncementBannerView;
import com.xiaomi.fitness.homepage.view.DataHeaderV2View;
import com.xiaomi.fitness.widget.view.HomeHeaderTabTitleView;
import miuix.springback.view.SpringBackLayout;

/* JADX INFO: loaded from: classes9.dex */
public class j5a extends i5a {
    public static final ViewDataBinding.i K = null;
    public static final SparseIntArray L;
    public final ConstraintLayout I;
    public long J;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        L = sparseIntArray;
        sparseIntArray.put(eri.y5, 1);
        sparseIntArray.put(eri.Mh, 2);
        sparseIntArray.put(eri.Le, 3);
        sparseIntArray.put(eri.E2, 4);
        sparseIntArray.put(eri.b2, 5);
        sparseIntArray.put(eri.b0, 6);
        sparseIntArray.put(eri.F5, 7);
        sparseIntArray.put(eri.E5, 8);
    }

    public j5a(rk5 rk5Var, View view, Object[] objArr) {
        super(rk5Var, view, 0, (AnnouncementBannerView) objArr[6], (LinearLayout) objArr[5], (DataHeaderV2View) objArr[4], (HomeHeaderTabTitleView) objArr[1], (RecyclerView) objArr[8], (RecyclerView) objArr[7], (NestedScrollView) objArr[3], (SpringBackLayout) objArr[2]);
        this.J = -1L;
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[0];
        this.I = constraintLayout;
        constraintLayout.setTag(null);
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

    public j5a(rk5 rk5Var, View view) {
        this(rk5Var, view, ViewDataBinding.P(rk5Var, view, 9, K, L));
    }
}
