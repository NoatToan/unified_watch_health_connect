package defpackage;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.databinding.ViewDataBinding;
import com.xiaomi.fitness.account.api.bean.CountryInfo;

/* JADX INFO: loaded from: classes9.dex */
public class zqe extends yqe {
    public static final ViewDataBinding.i G = null;
    public static final SparseIntArray H;
    public final FrameLayout E;
    public long F;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        H = sparseIntArray;
        sparseIntArray.put(gri.e0, 3);
    }

    public zqe(rk5 rk5Var, View view, Object[] objArr) {
        super(rk5Var, view, 0, (TextView) objArr[2], (TextView) objArr[1], (LinearLayout) objArr[3]);
        this.F = -1L;
        this.A.setTag(null);
        this.B.setTag(null);
        FrameLayout frameLayout = (FrameLayout) objArr[0];
        this.E = frameLayout;
        frameLayout.setTag(null);
        o0(view);
        H();
    }

    public void A0(CountryInfo countryInfo) {
        this.D = countryInfo;
        synchronized (this) {
            this.F |= 1;
        }
        notifyPropertyChanged(dv1.f15952b);
        super.e0();
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
            this.F = 2L;
        }
        e0();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean W(int i, Object obj, int i2) {
        return false;
    }

    @Override // androidx.databinding.ViewDataBinding
    public void o() {
        long j;
        String name;
        String country;
        synchronized (this) {
            j = this.F;
            this.F = 0L;
        }
        CountryInfo countryInfo = this.D;
        long j2 = j & 3;
        if (j2 == 0 || countryInfo == null) {
            name = null;
            country = null;
        } else {
            name = countryInfo.getName();
            country = countryInfo.getCountry();
        }
        if (j2 != 0) {
            this.A.setText(name);
            this.B.setText(country);
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean q0(int i, Object obj) {
        if (dv1.f15952b != i) {
            return false;
        }
        A0((CountryInfo) obj);
        return true;
    }

    public zqe(rk5 rk5Var, View view) {
        this(rk5Var, view, ViewDataBinding.P(rk5Var, view, 4, G, H));
    }
}
