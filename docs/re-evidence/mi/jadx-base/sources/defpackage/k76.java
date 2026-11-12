package defpackage;

import android.util.SparseIntArray;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.ViewDataBinding;
import com.fitness.banner.export.v2.BannerItemV2;
import com.fitness.banner.export.view.MultipleStyleBannerView;

/* JADX INFO: loaded from: classes8.dex */
public class k76 extends j76 {
    public static final ViewDataBinding.i E = null;
    public static final SparseIntArray F;
    public long D;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        F = sparseIntArray;
        sparseIntArray.put(xqi.h0, 1);
    }

    public k76(rk5 rk5Var, View view, Object[] objArr) {
        super(rk5Var, view, 0, (ConstraintLayout) objArr[0], (MultipleStyleBannerView) objArr[1]);
        this.D = -1L;
        this.A.setTag(null);
        o0(view);
        H();
    }

    public void A0(BannerItemV2 bannerItemV2) {
        this.C = bannerItemV2;
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean F() {
        synchronized (this) {
            try {
                return this.D != 0;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void H() {
        synchronized (this) {
            this.D = 2L;
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
            this.D = 0L;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean q0(int i, Object obj) {
        if (zv1.g != i) {
            return false;
        }
        A0((BannerItemV2) obj);
        return true;
    }

    public k76(rk5 rk5Var, View view) {
        this(rk5Var, view, ViewDataBinding.P(rk5Var, view, 2, E, F));
    }
}
