package defpackage;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.databinding.ViewDataBinding;
import androidx.viewpager.widget.ViewPager;
import com.xiaomi.fitness.widget.carousel.CarouselBannerRoundIndicator;
import miuix.androidbasewidget.widget.ProgressBar;

/* JADX INFO: loaded from: classes9.dex */
public class ylg extends xlg {
    public static final ViewDataBinding.i I = null;
    public static final SparseIntArray J;
    public final LinearLayout G;
    public long H;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        J = sparseIntArray;
        sparseIntArray.put(mri.B5, 1);
        sparseIntArray.put(mri.V1, 2);
        sparseIntArray.put(mri.k3, 3);
        sparseIntArray.put(mri.N4, 4);
        sparseIntArray.put(mri.C3, 5);
        sparseIntArray.put(mri.B3, 6);
    }

    public ylg(rk5 rk5Var, View view, Object[] objArr) {
        super(rk5Var, view, 0, (CarouselBannerRoundIndicator) objArr[2], (TextView) objArr[3], (AppCompatTextView) objArr[6], (ProgressBar) objArr[5], (TextView) objArr[4], (ViewPager) objArr[1]);
        this.H = -1L;
        LinearLayout linearLayout = (LinearLayout) objArr[0];
        this.G = linearLayout;
        linearLayout.setTag(null);
        o0(view);
        H();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean F() {
        synchronized (this) {
            try {
                return this.H != 0;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void H() {
        synchronized (this) {
            this.H = 1L;
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
            this.H = 0L;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean q0(int i, Object obj) {
        return true;
    }

    public ylg(rk5 rk5Var, View view) {
        this(rk5Var, view, ViewDataBinding.P(rk5Var, view, 7, I, J));
    }
}
