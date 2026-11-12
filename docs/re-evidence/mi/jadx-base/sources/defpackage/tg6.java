package defpackage;

import android.util.SparseIntArray;
import android.view.View;
import androidx.databinding.ViewDataBinding;
import androidx.lifecycle.MutableLiveData;
import com.xiaomi.fitness.devicesettings.huami.goalremind.GoalRemindViewModel;
import com.xiaomi.fitness.widget.SwitchButtonBindingTwoLineTextView;
import miuix.core.widget.NestedScrollView;
import miuix.springback.view.SpringBackLayout;

/* JADX INFO: loaded from: classes8.dex */
public class tg6 extends sg6 {
    public static final ViewDataBinding.i F = null;
    public static final SparseIntArray G;
    public final SpringBackLayout D;
    public long E;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        G = sparseIntArray;
        sparseIntArray.put(zqi.G8, 2);
    }

    public tg6(rk5 rk5Var, View view, Object[] objArr) {
        super(rk5Var, view, 1, (SwitchButtonBindingTwoLineTextView) objArr[1], (NestedScrollView) objArr[2]);
        this.E = -1L;
        this.A.setTag(null);
        SpringBackLayout springBackLayout = (SpringBackLayout) objArr[0];
        this.D = springBackLayout;
        springBackLayout.setTag(null);
        o0(view);
        H();
    }

    public final boolean A0(MutableLiveData<Boolean> mutableLiveData, int i) {
        if (i != bw1.f4667a) {
            return false;
        }
        synchronized (this) {
            this.E |= 1;
        }
        return true;
    }

    public void B0(GoalRemindViewModel goalRemindViewModel) {
        this.C = goalRemindViewModel;
        synchronized (this) {
            this.E |= 2;
        }
        notifyPropertyChanged(bw1.f);
        super.e0();
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
        return A0((MutableLiveData) obj, i2);
    }

    @Override // androidx.databinding.ViewDataBinding
    public void o() {
        long j;
        synchronized (this) {
            j = this.E;
            this.E = 0L;
        }
        GoalRemindViewModel goalRemindViewModel = this.C;
        long j2 = j & 7;
        boolean zJ0 = false;
        if (j2 != 0) {
            MutableLiveData<Boolean> remindSwitch = goalRemindViewModel != null ? goalRemindViewModel.getRemindSwitch() : null;
            w0(0, remindSwitch);
            zJ0 = ViewDataBinding.j0(remindSwitch != null ? remindSwitch.getValue() : null);
        }
        if (j2 != 0) {
            SwitchButtonBindingTwoLineTextView.setSwitchOn(this.A, zJ0);
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean q0(int i, Object obj) {
        if (bw1.f != i) {
            return false;
        }
        B0((GoalRemindViewModel) obj);
        return true;
    }

    public tg6(rk5 rk5Var, View view) {
        this(rk5Var, view, ViewDataBinding.P(rk5Var, view, 3, F, G));
    }
}
