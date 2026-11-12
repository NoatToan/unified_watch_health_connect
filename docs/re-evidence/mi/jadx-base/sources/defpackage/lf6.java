package defpackage;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.databinding.ViewDataBinding;
import androidx.lifecycle.LifecycleOwner;
import androidx.recyclerview.widget.RecyclerView;
import com.xiaomi.fitness.widget.SwitchButtonTwoLineTextView;

/* JADX INFO: loaded from: classes8.dex */
public class lf6 extends kf6 {
    public static final ViewDataBinding.i I;
    public static final SparseIntArray J;
    public final LinearLayout G;
    public long H;

    static {
        ViewDataBinding.i iVar = new ViewDataBinding.i(7);
        I = iVar;
        iVar.a(0, new String[]{"device_settings_alarm_clock_fragment_bottom"}, new int[]{1}, new int[]{eui.l});
        SparseIntArray sparseIntArray = new SparseIntArray();
        J = sparseIntArray;
        sparseIntArray.put(zqi.f41579k, 2);
        sparseIntArray.put(zqi.m8, 3);
        sparseIntArray.put(zqi.p, 4);
        sparseIntArray.put(zqi.o, 5);
        sparseIntArray.put(zqi.M0, 6);
    }

    public lf6(rk5 rk5Var, View view, Object[] objArr) {
        super(rk5Var, view, 1, (LinearLayout) objArr[5], (SwitchButtonTwoLineTextView) objArr[2], (RecyclerView) objArr[4], (rd6) objArr[1], (TextView) objArr[6], (View) objArr[3]);
        this.H = -1L;
        k0(this.D);
        LinearLayout linearLayout = (LinearLayout) objArr[0];
        this.G = linearLayout;
        linearLayout.setTag(null);
        o0(view);
        H();
    }

    public final boolean A0(rd6 rd6Var, int i) {
        if (i != bw1.f4667a) {
            return false;
        }
        synchronized (this) {
            this.H |= 1;
        }
        return true;
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean F() {
        synchronized (this) {
            try {
                if (this.H != 0) {
                    return true;
                }
                return this.D.F();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void H() {
        synchronized (this) {
            this.H = 2L;
        }
        this.D.H();
        e0();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean W(int i, Object obj, int i2) {
        if (i != 0) {
            return false;
        }
        return A0((rd6) obj, i2);
    }

    @Override // androidx.databinding.ViewDataBinding
    public void l0(LifecycleOwner lifecycleOwner) {
        super.l0(lifecycleOwner);
        this.D.l0(lifecycleOwner);
    }

    @Override // androidx.databinding.ViewDataBinding
    public void o() {
        synchronized (this) {
            this.H = 0L;
        }
        ViewDataBinding.r(this.D);
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean q0(int i, Object obj) {
        return true;
    }

    public lf6(rk5 rk5Var, View view) {
        this(rk5Var, view, ViewDataBinding.P(rk5Var, view, 7, I, J));
    }
}
