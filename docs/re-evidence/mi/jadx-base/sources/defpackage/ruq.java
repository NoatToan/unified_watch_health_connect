package defpackage;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.ViewDataBinding;
import com.xiaomi.fitness.sport.bean.LaunchViewBean;
import com.xiaomi.fitness.sport.view.DataBindingAdapters;

/* JADX INFO: loaded from: classes10.dex */
public class ruq extends quq {
    public static final ViewDataBinding.i K = null;
    public static final SparseIntArray L;
    public final ConstraintLayout I;
    public long J;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        L = sparseIntArray;
        sparseIntArray.put(xri.i2, 7);
    }

    public ruq(rk5 rk5Var, View view, Object[] objArr) {
        super(rk5Var, view, 0, (TextView) objArr[1], (TextView) objArr[7], (TextView) objArr[2], (TextView) objArr[3], (ImageView) objArr[4], (TextView) objArr[6], (TextView) objArr[5]);
        this.J = -1L;
        this.A.setTag(null);
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[0];
        this.I = constraintLayout;
        constraintLayout.setTag(null);
        this.C.setTag(null);
        this.D.setTag(null);
        this.E.setTag(null);
        this.F.setTag(null);
        this.G.setTag(null);
        o0(view);
        H();
    }

    @Override // defpackage.quq
    public void A0(LaunchViewBean launchViewBean) {
        this.H = launchViewBean;
        synchronized (this) {
            this.J |= 1;
        }
        notifyPropertyChanged(nv1.e);
        super.e0();
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
            this.J = 2L;
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
        int i;
        int i2;
        String weatherTemperature;
        String str;
        String unit;
        String title;
        String str2;
        int distance;
        int weatherImg;
        String weatherStr;
        synchronized (this) {
            j = this.J;
            this.J = 0L;
        }
        LaunchViewBean launchViewBean = this.H;
        long j2 = j & 3;
        int i3 = 0;
        if (j2 != 0) {
            if (launchViewBean != null) {
                distance = launchViewBean.getDistance();
                unit = launchViewBean.getUnit();
                title = launchViewBean.getTitle();
                weatherStr = launchViewBean.getWeatherStr();
                weatherImg = launchViewBean.getWeatherImg();
                weatherTemperature = launchViewBean.getWeatherTemperature();
            } else {
                distance = 0;
                weatherImg = 0;
                weatherTemperature = null;
                unit = null;
                title = null;
                weatherStr = null;
            }
            i3 = distance == 0 ? 1 : 0;
            if (j2 != 0) {
                j = i3 != 0 ? j | 8 : j | 4;
            }
            i = i3;
            i3 = distance;
            str = weatherStr;
            i2 = weatherImg;
        } else {
            i = 0;
            i2 = 0;
            weatherTemperature = null;
            str = null;
            unit = null;
            title = null;
        }
        String strValueOf = (4 & j) != 0 ? String.valueOf(i3) : null;
        long j3 = j & 3;
        if (j3 != 0) {
            str2 = i != 0 ? "--" : strValueOf;
        } else {
            str2 = null;
        }
        if (j3 != 0) {
            r8p.b(this.A, title);
            r8p.b(this.C, str2);
            r8p.b(this.D, unit);
            DataBindingAdapters.setImageResource(this.E, i2);
            r8p.b(this.F, str);
            r8p.b(this.G, weatherTemperature);
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean q0(int i, Object obj) {
        if (nv1.e != i) {
            return false;
        }
        A0((LaunchViewBean) obj);
        return true;
    }

    public ruq(rk5 rk5Var, View view) {
        this(rk5Var, view, ViewDataBinding.P(rk5Var, view, 8, K, L));
    }
}
