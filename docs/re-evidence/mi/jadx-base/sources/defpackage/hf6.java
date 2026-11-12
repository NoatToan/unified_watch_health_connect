package defpackage;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.databinding.ViewDataBinding;
import com.xiaomi.fitness.devicesettings.huami.vibratemode.DeviceImageView;
import com.xiaomi.fitness.devicesettings.huami.vibratemode.VibrateModeProgressBar;
import miuix.core.widget.NestedScrollView;
import miuix.springback.view.SpringBackLayout;

/* JADX INFO: loaded from: classes8.dex */
public class hf6 extends gf6 {
    public static final ViewDataBinding.i N = null;
    public static final SparseIntArray O;
    public final SpringBackLayout L;
    public long M;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        O = sparseIntArray;
        sparseIntArray.put(zqi.M7, 1);
        sparseIntArray.put(zqi.Ma, 2);
        sparseIntArray.put(zqi.g1, 3);
        sparseIntArray.put(zqi.j1, 4);
        sparseIntArray.put(zqi.Oa, 5);
        sparseIntArray.put(zqi.h8, 6);
        sparseIntArray.put(zqi.M, 7);
        sparseIntArray.put(zqi.K6, 8);
        sparseIntArray.put(zqi.Q, 9);
        sparseIntArray.put(zqi.Pa, 10);
        sparseIntArray.put(zqi.Q8, 11);
    }

    public hf6(rk5 rk5Var, View view, Object[] objArr) {
        super(rk5Var, view, 0, (TextView) objArr[7], (LinearLayout) objArr[9], (RelativeLayout) objArr[3], (DeviceImageView) objArr[4], (VibrateModeProgressBar) objArr[8], (NestedScrollView) objArr[1], (TextView) objArr[6], (Button) objArr[11], (RelativeLayout) objArr[2], (ImageView) objArr[5], (Button) objArr[10]);
        this.M = -1L;
        SpringBackLayout springBackLayout = (SpringBackLayout) objArr[0];
        this.L = springBackLayout;
        springBackLayout.setTag(null);
        o0(view);
        H();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean F() {
        synchronized (this) {
            try {
                return this.M != 0;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void H() {
        synchronized (this) {
            this.M = 1L;
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
            this.M = 0L;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean q0(int i, Object obj) {
        return true;
    }

    public hf6(rk5 rk5Var, View view) {
        this(rk5Var, view, ViewDataBinding.P(rk5Var, view, 12, N, O));
    }
}
