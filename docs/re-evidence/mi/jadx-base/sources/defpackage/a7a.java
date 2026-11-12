package defpackage;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import androidx.databinding.ViewDataBinding;
import com.xiaomi.fitness.devicesettings.huami.vibratemode.DeviceImageView;
import miuix.core.widget.NestedScrollView;
import miuix.springback.view.SpringBackLayout;

/* JADX INFO: loaded from: classes8.dex */
public class a7a extends z6a {
    public static final ViewDataBinding.i H = null;
    public static final SparseIntArray I;
    public final SpringBackLayout F;
    public long G;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        I = sparseIntArray;
        sparseIntArray.put(zqi.M7, 1);
        sparseIntArray.put(zqi.T1, 2);
        sparseIntArray.put(zqi.O8, 3);
        sparseIntArray.put(zqi.start_find, 4);
        sparseIntArray.put(zqi.stop_find, 5);
    }

    public a7a(rk5 rk5Var, View view, Object[] objArr) {
        super(rk5Var, view, 0, (DeviceImageView) objArr[2], (NestedScrollView) objArr[1], (Button) objArr[4], (TextView) objArr[3], (Button) objArr[5]);
        this.G = -1L;
        SpringBackLayout springBackLayout = (SpringBackLayout) objArr[0];
        this.F = springBackLayout;
        springBackLayout.setTag(null);
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

    public a7a(rk5 rk5Var, View view) {
        this(rk5Var, view, ViewDataBinding.P(rk5Var, view, 6, H, I));
    }
}
