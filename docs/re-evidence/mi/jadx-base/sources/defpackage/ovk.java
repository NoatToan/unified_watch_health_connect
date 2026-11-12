package defpackage;

import android.content.res.Resources;
import android.support.v4.media.session.PlaybackStateCompat;
import android.util.SparseIntArray;
import android.view.View;
import android.widget.ProgressBar;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.ViewDataBinding;
import androidx.lifecycle.MutableLiveData;
import com.xiaomi.fitness.rn.settings.viewmodel.DeviceUpdateViewModel;

/* JADX INFO: loaded from: classes8.dex */
public class ovk extends nvk implements z7h.a {
    public static final ViewDataBinding.i P = null;
    public static final SparseIntArray Q;
    public final LinearLayoutCompat I;
    public final TextView J;
    public final TextView K;
    public final ScrollView L;
    public final TextView M;
    public final View.OnClickListener N;
    public long O;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        Q = sparseIntArray;
        sparseIntArray.put(sri.d, 11);
    }

    public ovk(rk5 rk5Var, View view, Object[] objArr) {
        super(rk5Var, view, 10, (ConstraintLayout) objArr[6], (LinearLayoutCompat) objArr[11], (TextView) objArr[5], (TextView) objArr[7], (TextView) objArr[10], (ProgressBar) objArr[9], (TextView) objArr[1]);
        this.O = -1L;
        this.A.setTag(null);
        this.C.setTag(null);
        LinearLayoutCompat linearLayoutCompat = (LinearLayoutCompat) objArr[0];
        this.I = linearLayoutCompat;
        linearLayoutCompat.setTag(null);
        TextView textView = (TextView) objArr[2];
        this.J = textView;
        textView.setTag(null);
        TextView textView2 = (TextView) objArr[3];
        this.K = textView2;
        textView2.setTag(null);
        ScrollView scrollView = (ScrollView) objArr[4];
        this.L = scrollView;
        scrollView.setTag(null);
        TextView textView3 = (TextView) objArr[8];
        this.M = textView3;
        textView3.setTag(null);
        this.D.setTag(null);
        this.E.setTag(null);
        this.F.setTag(null);
        this.G.setTag(null);
        o0(view);
        this.N = new z7h(this, 1);
        H();
    }

    public final boolean A0(MutableLiveData<String> mutableLiveData, int i) {
        if (i != lv1.f25454a) {
            return false;
        }
        synchronized (this) {
            this.O |= 8;
        }
        return true;
    }

    public final boolean B0(MutableLiveData<String> mutableLiveData, int i) {
        if (i != lv1.f25454a) {
            return false;
        }
        synchronized (this) {
            this.O |= 512;
        }
        return true;
    }

    public final boolean C0(MutableLiveData<String> mutableLiveData, int i) {
        if (i != lv1.f25454a) {
            return false;
        }
        synchronized (this) {
            this.O |= 256;
        }
        return true;
    }

    public final boolean D0(MutableLiveData<Boolean> mutableLiveData, int i) {
        if (i != lv1.f25454a) {
            return false;
        }
        synchronized (this) {
            this.O |= 2;
        }
        return true;
    }

    public final boolean E0(MutableLiveData<Boolean> mutableLiveData, int i) {
        if (i != lv1.f25454a) {
            return false;
        }
        synchronized (this) {
            this.O |= 32;
        }
        return true;
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean F() {
        synchronized (this) {
            try {
                return this.O != 0;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final boolean F0(MutableLiveData<Boolean> mutableLiveData, int i) {
        if (i != lv1.f25454a) {
            return false;
        }
        synchronized (this) {
            this.O |= 16;
        }
        return true;
    }

    public final boolean G0(MutableLiveData<Boolean> mutableLiveData, int i) {
        if (i != lv1.f25454a) {
            return false;
        }
        synchronized (this) {
            this.O |= 128;
        }
        return true;
    }

    @Override // androidx.databinding.ViewDataBinding
    public void H() {
        synchronized (this) {
            this.O = 2048L;
        }
        e0();
    }

    public final boolean H0(MutableLiveData<Integer> mutableLiveData, int i) {
        if (i != lv1.f25454a) {
            return false;
        }
        synchronized (this) {
            this.O |= 1;
        }
        return true;
    }

    public final boolean I0(MutableLiveData<String> mutableLiveData, int i) {
        if (i != lv1.f25454a) {
            return false;
        }
        synchronized (this) {
            this.O |= 4;
        }
        return true;
    }

    public final boolean J0(MutableLiveData<String> mutableLiveData, int i) {
        if (i != lv1.f25454a) {
            return false;
        }
        synchronized (this) {
            this.O |= 64;
        }
        return true;
    }

    public void K0(DeviceUpdateViewModel deviceUpdateViewModel) {
        this.H = deviceUpdateViewModel;
        synchronized (this) {
            this.O |= 1024;
        }
        notifyPropertyChanged(lv1.f25455b);
        super.e0();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean W(int i, Object obj, int i2) {
        switch (i) {
            case 0:
                return H0((MutableLiveData) obj, i2);
            case 1:
                return D0((MutableLiveData) obj, i2);
            case 2:
                return I0((MutableLiveData) obj, i2);
            case 3:
                return A0((MutableLiveData) obj, i2);
            case 4:
                return F0((MutableLiveData) obj, i2);
            case 5:
                return E0((MutableLiveData) obj, i2);
            case 6:
                return J0((MutableLiveData) obj, i2);
            case 7:
                return G0((MutableLiveData) obj, i2);
            case 8:
                return C0((MutableLiveData) obj, i2);
            case 9:
                return B0((MutableLiveData) obj, i2);
            default:
                return false;
        }
    }

    @Override // z7h.a
    public final void a(int i, View view) {
        DeviceUpdateViewModel deviceUpdateViewModel = this.H;
        if (deviceUpdateViewModel != null) {
            deviceUpdateViewModel.buttonClick();
        }
    }

    /* JADX WARN: Code duplicated, block: B:106:0x0153  */
    /* JADX WARN: Code duplicated, block: B:137:0x01b3  */
    /* JADX WARN: Code duplicated, block: B:146:0x01dd  */
    /* JADX WARN: Code duplicated, block: B:37:0x0077 A[PHI: r2
      0x0077: PHI (r2v3 long) = (r2v0 long), (r2v14 long) binds: [B:20:0x0047, B:34:0x0071] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:46:0x0093  */
    /* JADX WARN: Code duplicated, block: B:55:0x00af  */
    @Override // androidx.databinding.ViewDataBinding
    public void o() {
        long j;
        int i;
        String string;
        String str;
        int iH0;
        int i2;
        String value;
        String str2;
        int i3;
        String str3;
        int i4;
        String str4;
        long j2;
        int i5;
        String value2;
        String value3;
        String value4;
        long j3;
        int i6;
        String value5;
        Resources resources;
        int i7;
        synchronized (this) {
            j = this.O;
            this.O = 0L;
        }
        DeviceUpdateViewModel deviceUpdateViewModel = this.H;
        if ((4095 & j) != 0) {
            if ((j & 3073) != 0) {
                MutableLiveData<Integer> progress = deviceUpdateViewModel != null ? deviceUpdateViewModel.getProgress() : null;
                w0(0, progress);
                iH0 = ViewDataBinding.h0(progress != null ? progress.getValue() : null);
            } else {
                iH0 = 0;
            }
            long j4 = j & 3074;
            if (j4 == 0) {
                i5 = 0;
            } else {
                MutableLiveData<Boolean> mutableLiveDataIsButtonShow = deviceUpdateViewModel != null ? deviceUpdateViewModel.isButtonShow() : null;
                w0(1, mutableLiveDataIsButtonShow);
                boolean zJ0 = ViewDataBinding.j0(mutableLiveDataIsButtonShow != null ? mutableLiveDataIsButtonShow.getValue() : null);
                if (j4 != 0) {
                    j |= zJ0 ? 8192L : 4096L;
                }
                if (zJ0) {
                    i5 = 0;
                } else {
                    i5 = 8;
                }
            }
            if ((j & 3076) == 0) {
                value2 = null;
            } else {
                MutableLiveData<String> progressStr = deviceUpdateViewModel != null ? deviceUpdateViewModel.getProgressStr() : null;
                w0(2, progressStr);
                if (progressStr != null) {
                    value2 = progressStr.getValue();
                } else {
                    value2 = null;
                }
            }
            if ((j & 3080) == 0) {
                value3 = null;
            } else {
                MutableLiveData<String> buttonTxt = deviceUpdateViewModel != null ? deviceUpdateViewModel.getButtonTxt() : null;
                w0(3, buttonTxt);
                if (buttonTxt != null) {
                    value3 = buttonTxt.getValue();
                } else {
                    value3 = null;
                }
            }
            long j5 = j & 3088;
            if (j5 != 0) {
                MutableLiveData<Boolean> mutableLiveDataIsLogInfoShow = deviceUpdateViewModel != null ? deviceUpdateViewModel.isLogInfoShow() : null;
                w0(4, mutableLiveDataIsLogInfoShow);
                boolean zJ1 = ViewDataBinding.j0(mutableLiveDataIsLogInfoShow != null ? mutableLiveDataIsLogInfoShow.getValue() : null);
                if (j5 != 0) {
                    j |= zJ1 ? 2129920L : 1064960L;
                }
                i4 = zJ1 ? 0 : 4;
                i3 = zJ1 ? 0 : 8;
            } else {
                i3 = 0;
                i4 = 0;
            }
            long j6 = j & 3104;
            if (j6 != 0) {
                MutableLiveData<Boolean> mutableLiveDataIsCanUpdate = deviceUpdateViewModel != null ? deviceUpdateViewModel.isCanUpdate() : null;
                w0(5, mutableLiveDataIsCanUpdate);
                boolean zJ2 = ViewDataBinding.j0(mutableLiveDataIsCanUpdate != null ? mutableLiveDataIsCanUpdate.getValue() : null);
                if (j6 != 0) {
                    j |= zJ2 ? PlaybackStateCompat.ACTION_PREPARE_FROM_URI : PlaybackStateCompat.ACTION_PREPARE_FROM_SEARCH;
                }
                if (zJ2) {
                    resources = this.J.getResources();
                    i7 = v0j.f36352r;
                } else {
                    resources = this.J.getResources();
                    i7 = v0j.l;
                }
                string = resources.getString(i7);
            } else {
                string = null;
            }
            if ((j & 3136) == 0) {
                value4 = null;
            } else {
                MutableLiveData<String> progressTxt = deviceUpdateViewModel != null ? deviceUpdateViewModel.getProgressTxt() : null;
                w0(6, progressTxt);
                if (progressTxt != null) {
                    value4 = progressTxt.getValue();
                } else {
                    value4 = null;
                }
            }
            long j7 = j & 3200;
            if (j7 != 0) {
                MutableLiveData<Boolean> mutableLiveDataIsProgressShow = deviceUpdateViewModel != null ? deviceUpdateViewModel.isProgressShow() : null;
                w0(7, mutableLiveDataIsProgressShow);
                boolean zJ3 = ViewDataBinding.j0(mutableLiveDataIsProgressShow != null ? mutableLiveDataIsProgressShow.getValue() : null);
                if (j7 != 0) {
                    j |= zJ3 ? PlaybackStateCompat.ACTION_SET_SHUFFLE_MODE_ENABLED : PlaybackStateCompat.ACTION_SET_REPEAT_MODE;
                }
                i6 = zJ3 ? 0 : 8;
                j3 = 3328;
            } else {
                j3 = 3328;
                i6 = 0;
            }
            if ((j & j3) == 0) {
                value5 = null;
            } else {
                MutableLiveData<String> currentVersionTxt = deviceUpdateViewModel != null ? deviceUpdateViewModel.getCurrentVersionTxt() : null;
                w0(8, currentVersionTxt);
                if (currentVersionTxt != null) {
                    value5 = currentVersionTxt.getValue();
                } else {
                    value5 = null;
                }
            }
            if ((j & 3584) == 0) {
                i = i5;
                str4 = value5;
                i2 = i6;
                j2 = 3200;
                str3 = value3;
                str2 = value4;
                str = value2;
                value = null;
            } else {
                MutableLiveData<String> changeLog = deviceUpdateViewModel != null ? deviceUpdateViewModel.getChangeLog() : null;
                w0(9, changeLog);
                if (changeLog != null) {
                    str4 = value5;
                    j2 = 3200;
                    str3 = value3;
                    str2 = value4;
                    str = value2;
                    value = changeLog.getValue();
                    i = i5;
                    i2 = i6;
                } else {
                    i = i5;
                    str4 = value5;
                    i2 = i6;
                    j2 = 3200;
                    str3 = value3;
                    str2 = value4;
                    str = value2;
                    value = null;
                }
            }
        } else {
            i = 0;
            string = null;
            str = null;
            iH0 = 0;
            i2 = 0;
            value = null;
            str2 = null;
            i3 = 0;
            str3 = null;
            i4 = 0;
            str4 = null;
            j2 = 3200;
        }
        if ((j2 & j) != 0) {
            this.A.setVisibility(i2);
        }
        if ((3584 & j) != 0) {
            r8p.b(this.C, value);
        }
        if ((3104 & j) != 0) {
            r8p.b(this.J, string);
        }
        if ((j & 3088) != 0) {
            this.K.setVisibility(i3);
            this.L.setVisibility(i4);
        }
        if ((j & 3076) != 0) {
            r8p.b(this.M, str);
        }
        if ((3136 & j) != 0) {
            r8p.b(this.D, str2);
        }
        if ((j & 3080) != 0) {
            r8p.b(this.E, str3);
        }
        if ((j & 3074) != 0) {
            this.E.setVisibility(i);
        }
        if ((2048 & j) != 0) {
            this.E.setOnClickListener(this.N);
        }
        if ((j & 3073) != 0) {
            this.F.setProgress(iH0);
        }
        if ((j & 3328) != 0) {
            r8p.b(this.G, str4);
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean q0(int i, Object obj) {
        if (lv1.f25455b != i) {
            return false;
        }
        K0((DeviceUpdateViewModel) obj);
        return true;
    }

    public ovk(rk5 rk5Var, View view) {
        this(rk5Var, view, ViewDataBinding.P(rk5Var, view, 12, P, Q));
    }
}
