package defpackage;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.LinearLayout;
import androidx.databinding.ViewDataBinding;
import androidx.lifecycle.MutableLiveData;
import com.xiaomi.fitness.devicesettings.common.avs.AivsViewModel;
import com.xiaomi.fitness.widget.RightArrowBindingTwoLineTextView;
import com.xiaomi.fitness.widget.SwitchButtonBindingTwoLineTextView;

/* JADX INFO: loaded from: classes8.dex */
public class tf6 extends sf6 {
    public static final ViewDataBinding.i F = null;
    public static final SparseIntArray G;
    public long E;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        G = sparseIntArray;
        sparseIntArray.put(zqi.n8, 2);
    }

    public tf6(rk5 rk5Var, View view, Object[] objArr) {
        super(rk5Var, view, 1, (LinearLayout) objArr[0], (SwitchButtonBindingTwoLineTextView) objArr[1], (RightArrowBindingTwoLineTextView) objArr[2]);
        this.E = -1L;
        this.A.setTag(null);
        this.B.setTag(null);
        o0(view);
        H();
    }

    @Override // defpackage.sf6
    public void A0(AivsViewModel aivsViewModel) {
        this.D = aivsViewModel;
        synchronized (this) {
            this.E |= 2;
        }
        notifyPropertyChanged(bw1.f);
        super.e0();
    }

    public final boolean B0(MutableLiveData<Boolean> mutableLiveData, int i) {
        if (i != bw1.f4667a) {
            return false;
        }
        synchronized (this) {
            this.E |= 1;
        }
        return true;
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean F() {
        synchronized (this) {
            try {
                return this.E != 0;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void H() {
        synchronized (this) {
            this.E = 4L;
        }
        e0();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean W(int i, Object obj, int i2) {
        if (i != 0) {
            return false;
        }
        return B0((MutableLiveData) obj, i2);
    }

    @Override // androidx.databinding.ViewDataBinding
    public void o() {
        long j;
        synchronized (this) {
            j = this.E;
            this.E = 0L;
        }
        AivsViewModel aivsViewModel = this.D;
        long j2 = j & 7;
        boolean zJ0 = false;
        if (j2 != 0) {
            MutableLiveData<Boolean> optimiseOpen = aivsViewModel != null ? aivsViewModel.getOptimiseOpen() : null;
            w0(0, optimiseOpen);
            zJ0 = ViewDataBinding.j0(optimiseOpen != null ? optimiseOpen.getValue() : null);
        }
        if (j2 != 0) {
            SwitchButtonBindingTwoLineTextView.setSwitchOn(this.B, zJ0);
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean q0(int i, Object obj) {
        if (bw1.f != i) {
            return false;
        }
        A0((AivsViewModel) obj);
        return true;
    }

    public tf6(rk5 rk5Var, View view) {
        this(rk5Var, view, ViewDataBinding.P(rk5Var, view, 3, F, G));
    }
}
