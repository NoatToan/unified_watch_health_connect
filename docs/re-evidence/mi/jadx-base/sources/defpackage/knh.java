package defpackage;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.ObservableBoolean;
import androidx.databinding.ViewDataBinding;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.recyclerview.widget.RecyclerView;
import com.xiaomi.fitness.pay.channel.PayChannelModel;
import com.xiaomi.fitness.pay.channel.PayChannelViewModel;

/* JADX INFO: loaded from: classes9.dex */
public class knh extends jnh {
    public static final ViewDataBinding.i J = null;
    public static final SparseIntArray K;
    public final ConstraintLayout H;
    public long I;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        K = sparseIntArray;
        sparseIntArray.put(ori.y, 4);
        sparseIntArray.put(ori.w, 5);
        sparseIntArray.put(ori.v, 6);
    }

    public knh(rk5 rk5Var, View view, Object[] objArr) {
        super(rk5Var, view, 3, (RecyclerView) objArr[6], (TextView) objArr[5], (TextView) objArr[3], (TextView) objArr[4], (TextView) objArr[2], (TextView) objArr[1]);
        this.I = -1L;
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[0];
        this.H = constraintLayout;
        constraintLayout.setTag(null);
        this.C.setTag(null);
        this.E.setTag(null);
        this.F.setTag(null);
        o0(view);
        H();
    }

    public final boolean A0(ObservableBoolean observableBoolean, int i) {
        if (i != jv1.f23164a) {
            return false;
        }
        synchronized (this) {
            this.I |= 4;
        }
        return true;
    }

    public final boolean B0(ObservableBoolean observableBoolean, int i) {
        if (i != jv1.f23164a) {
            return false;
        }
        synchronized (this) {
            this.I |= 1;
        }
        return true;
    }

    public final boolean C0(MutableLiveData<String> mutableLiveData, int i) {
        if (i != jv1.f23164a) {
            return false;
        }
        synchronized (this) {
            this.I |= 2;
        }
        return true;
    }

    public void D0(PayChannelViewModel payChannelViewModel) {
        this.G = payChannelViewModel;
        synchronized (this) {
            this.I |= 8;
        }
        notifyPropertyChanged(jv1.f23165b);
        super.e0();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean F() {
        synchronized (this) {
            try {
                return this.I != 0;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void H() {
        synchronized (this) {
            this.I = 16L;
        }
        e0();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean W(int i, Object obj, int i2) {
        if (i == 0) {
            return B0((ObservableBoolean) obj, i2);
        }
        if (i == 1) {
            return C0((MutableLiveData) obj, i2);
        }
        if (i != 2) {
            return false;
        }
        return A0((ObservableBoolean) obj, i2);
    }

    /* JADX WARN: Code duplicated, block: B:37:0x006e  */
    @Override // androidx.databinding.ViewDataBinding
    public void o() {
        long j;
        int i;
        int i2;
        String value;
        boolean z;
        boolean z2;
        synchronized (this) {
            j = this.I;
            this.I = 0L;
        }
        PayChannelViewModel payChannelViewModel = this.G;
        if ((31 & j) != 0) {
            PayChannelModel mModel = payChannelViewModel != null ? payChannelViewModel.getMModel() : null;
            long j2 = j & 25;
            if (j2 != 0) {
                ObservableBoolean orderValid = mModel != null ? mModel.getOrderValid() : null;
                x0(0, orderValid);
                z2 = orderValid != null ? orderValid.get() : false;
                if (j2 != 0) {
                    j |= z2 ? 256L : 128L;
                }
                i2 = z2 ? 0 : 4;
            } else {
                i2 = 0;
                z2 = false;
            }
            if ((j & 26) == 0) {
                value = null;
            } else {
                LiveData<?> timerString = mModel != null ? mModel.getTimerString() : null;
                w0(1, timerString);
                if (timerString != null) {
                    value = timerString.getValue();
                } else {
                    value = null;
                }
            }
            long j3 = j & 28;
            if (j3 != 0) {
                ObservableBoolean channelListValid = mModel != null ? mModel.getChannelListValid() : null;
                x0(2, channelListValid);
                boolean z3 = channelListValid != null ? channelListValid.get() : false;
                if (j3 != 0) {
                    j |= z3 ? 64L : 32L;
                }
                i = z3 ? 0 : 8;
                z = z2;
            } else {
                z = z2;
                i = 0;
            }
        } else {
            i = 0;
            i2 = 0;
            value = null;
            z = false;
        }
        if ((j & 25) != 0) {
            this.C.setEnabled(z);
            this.E.setVisibility(i2);
        }
        if ((j & 28) != 0) {
            this.C.setVisibility(i);
        }
        if ((j & 26) != 0) {
            r8p.b(this.F, value);
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean q0(int i, Object obj) {
        if (jv1.f23165b != i) {
            return false;
        }
        D0((PayChannelViewModel) obj);
        return true;
    }

    public knh(rk5 rk5Var, View view) {
        this(rk5Var, view, ViewDataBinding.P(rk5Var, view, 7, J, K));
    }
}
