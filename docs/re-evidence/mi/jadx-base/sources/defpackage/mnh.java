package defpackage;

import android.support.v4.media.session.PlaybackStateCompat;
import android.util.SparseIntArray;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.ObservableBoolean;
import androidx.databinding.ObservableInt;
import androidx.databinding.ViewDataBinding;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.recyclerview.widget.RecyclerView;
import com.xiaomi.fitness.baseui.recyclerview.adapter.ImageViewBindingAdapter;
import com.xiaomi.fitness.pay.result.PayResultModel;
import com.xiaomi.fitness.pay.result.PayResultViewModel;

/* JADX INFO: loaded from: classes9.dex */
public class mnh extends lnh {
    public static final ViewDataBinding.i Y = null;
    public static final SparseIntArray Z;
    public final ConstraintLayout T;
    public final TextView U;
    public final TextView V;
    public final ConstraintLayout W;
    public long X;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        Z = sparseIntArray;
        sparseIntArray.put(ori.i, 14);
        sparseIntArray.put(ori.f29626r, 15);
        sparseIntArray.put(ori.start_time_title, 16);
    }

    public mnh(rk5 rk5Var, View view, Object[] objArr) {
        super(rk5Var, view, 7, (View) objArr[14], (TextView) objArr[5], (TextView) objArr[10], (TextView) objArr[15], (ImageView) objArr[9], (TextView) objArr[11], (RecyclerView) objArr[7], (TextView) objArr[6], (TextView) objArr[16], (TextView) objArr[2], (TextView) objArr[3], (ImageView) objArr[1], (TextView) objArr[4]);
        this.X = -1L;
        this.B.setTag(null);
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[0];
        this.T = constraintLayout;
        constraintLayout.setTag(null);
        TextView textView = (TextView) objArr[12];
        this.U = textView;
        textView.setTag(null);
        TextView textView2 = (TextView) objArr[13];
        this.V = textView2;
        textView2.setTag(null);
        ConstraintLayout constraintLayout2 = (ConstraintLayout) objArr[8];
        this.W = constraintLayout2;
        constraintLayout2.setTag(null);
        this.C.setTag(null);
        this.E.setTag(null);
        this.F.setTag(null);
        this.G.setTag(null);
        this.H.setTag(null);
        this.J.setTag(null);
        this.K.setTag(null);
        this.L.setTag(null);
        this.M.setTag(null);
        o0(view);
        H();
    }

    @Override // defpackage.lnh
    public void A0(String str) {
        this.S = str;
        synchronized (this) {
            this.X |= 4096;
        }
        notifyPropertyChanged(jv1.c);
        super.e0();
    }

    @Override // defpackage.lnh
    public void B0(String str) {
        this.O = str;
        synchronized (this) {
            this.X |= 1024;
        }
        notifyPropertyChanged(jv1.d);
        super.e0();
    }

    @Override // defpackage.lnh
    public void C0(String str) {
        this.R = str;
        synchronized (this) {
            this.X |= 512;
        }
        notifyPropertyChanged(jv1.e);
        super.e0();
    }

    @Override // defpackage.lnh
    public void D0(String str) {
        this.Q = str;
        synchronized (this) {
            this.X |= 256;
        }
        notifyPropertyChanged(jv1.f);
        super.e0();
    }

    @Override // defpackage.lnh
    public void E0(String str) {
        this.P = str;
        synchronized (this) {
            this.X |= 2048;
        }
        notifyPropertyChanged(jv1.h);
        super.e0();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean F() {
        synchronized (this) {
            try {
                return this.X != 0;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final boolean F0(ObservableBoolean observableBoolean, int i) {
        if (i != jv1.f23164a) {
            return false;
        }
        synchronized (this) {
            this.X |= 64;
        }
        return true;
    }

    public final boolean G0(ObservableBoolean observableBoolean, int i) {
        if (i != jv1.f23164a) {
            return false;
        }
        synchronized (this) {
            this.X |= 2;
        }
        return true;
    }

    @Override // androidx.databinding.ViewDataBinding
    public void H() {
        synchronized (this) {
            this.X = 8192L;
        }
        e0();
    }

    public final boolean H0(MutableLiveData<String> mutableLiveData, int i) {
        if (i != jv1.f23164a) {
            return false;
        }
        synchronized (this) {
            this.X |= 32;
        }
        return true;
    }

    public final boolean I0(ObservableBoolean observableBoolean, int i) {
        if (i != jv1.f23164a) {
            return false;
        }
        synchronized (this) {
            this.X |= 4;
        }
        return true;
    }

    public final boolean J0(MutableLiveData<String> mutableLiveData, int i) {
        if (i != jv1.f23164a) {
            return false;
        }
        synchronized (this) {
            this.X |= 1;
        }
        return true;
    }

    public final boolean K0(ObservableInt observableInt, int i) {
        if (i != jv1.f23164a) {
            return false;
        }
        synchronized (this) {
            this.X |= 8;
        }
        return true;
    }

    public final boolean L0(MutableLiveData<String> mutableLiveData, int i) {
        if (i != jv1.f23164a) {
            return false;
        }
        synchronized (this) {
            this.X |= 16;
        }
        return true;
    }

    public void M0(PayResultViewModel payResultViewModel) {
        this.N = payResultViewModel;
        synchronized (this) {
            this.X |= 128;
        }
        notifyPropertyChanged(jv1.g);
        super.e0();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean W(int i, Object obj, int i2) {
        switch (i) {
            case 0:
                return J0((MutableLiveData) obj, i2);
            case 1:
                return G0((ObservableBoolean) obj, i2);
            case 2:
                return I0((ObservableBoolean) obj, i2);
            case 3:
                return K0((ObservableInt) obj, i2);
            case 4:
                return L0((MutableLiveData) obj, i2);
            case 5:
                return H0((MutableLiveData) obj, i2);
            case 6:
                return F0((ObservableBoolean) obj, i2);
            default:
                return false;
        }
    }

    /* JADX WARN: Code duplicated, block: B:103:0x017a A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:105:0x017d  */
    /* JADX WARN: Code duplicated, block: B:107:0x0180 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:108:0x0182  */
    /* JADX WARN: Code duplicated, block: B:110:0x0188  */
    /* JADX WARN: Code duplicated, block: B:112:0x018e  */
    /* JADX WARN: Code duplicated, block: B:114:0x0192  */
    /* JADX WARN: Code duplicated, block: B:115:0x0194  */
    /* JADX WARN: Code duplicated, block: B:117:0x0198  */
    /* JADX WARN: Code duplicated, block: B:120:0x01a2  */
    /* JADX WARN: Code duplicated, block: B:123:0x01ae  */
    /* JADX WARN: Code duplicated, block: B:126:0x01ba  */
    /* JADX WARN: Code duplicated, block: B:129:0x01c6  */
    /* JADX WARN: Code duplicated, block: B:132:0x01d1  */
    /* JADX WARN: Code duplicated, block: B:135:0x01e2  */
    /* JADX WARN: Code duplicated, block: B:138:0x01ee  */
    /* JADX WARN: Code duplicated, block: B:141:0x01fb  */
    /* JADX WARN: Code duplicated, block: B:144:0x0206  */
    /* JADX WARN: Code duplicated, block: B:147:0x0217  */
    /* JADX WARN: Code duplicated, block: B:150:0x0222  */
    /* JADX WARN: Code duplicated, block: B:153:0x022f  */
    /* JADX WARN: Code duplicated, block: B:160:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:19:0x0053  */
    /* JADX WARN: Code duplicated, block: B:28:0x006f  */
    /* JADX WARN: Code duplicated, block: B:61:0x00c9 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:62:0x00cb  */
    /* JADX WARN: Code duplicated, block: B:63:0x00d2  */
    /* JADX WARN: Code duplicated, block: B:66:0x00d9  */
    /* JADX WARN: Code duplicated, block: B:67:0x00de  */
    /* JADX WARN: Code duplicated, block: B:70:0x00e7 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:71:0x00e9  */
    /* JADX WARN: Code duplicated, block: B:73:0x00ef  */
    /* JADX WARN: Code duplicated, block: B:76:0x00f6  */
    /* JADX WARN: Code duplicated, block: B:78:0x00ff  */
    /* JADX WARN: Code duplicated, block: B:82:0x010a A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:83:0x010c  */
    /* JADX WARN: Code duplicated, block: B:84:0x0115  */
    /* JADX WARN: Code duplicated, block: B:87:0x011e  */
    /* JADX WARN: Code duplicated, block: B:88:0x0135  */
    @Override // androidx.databinding.ViewDataBinding
    public void o() {
        long j;
        long j2;
        PayResultModel payResultModel;
        String str;
        int i;
        String str2;
        String str3;
        boolean z;
        boolean z2;
        int i2;
        int i3;
        boolean z3;
        long j3;
        int i4;
        int i5;
        long j4;
        String value;
        boolean z4;
        boolean z5;
        int i6;
        int i7;
        int i8;
        String value2;
        LiveData<?> nextString;
        LiveData<?> statusString;
        ObservableInt statusIcon;
        synchronized (this) {
            j = this.X;
            this.X = 0L;
        }
        PayResultViewModel payResultViewModel = this.N;
        String str4 = this.Q;
        String str5 = this.R;
        String str6 = this.O;
        String str7 = this.P;
        String str8 = this.S;
        if ((8447 & j) != 0) {
            PayResultModel mModel = payResultViewModel != null ? payResultViewModel.getMModel() : null;
            if ((j & 8321) == 0) {
                value = null;
            } else {
                LiveData<?> statusDescString = mModel != null ? mModel.getStatusDescString() : null;
                w0(0, statusDescString);
                if (statusDescString != null) {
                    value = statusDescString.getValue();
                } else {
                    value = null;
                }
            }
            if ((j & 8322) == 0) {
                z4 = false;
            } else {
                ObservableBoolean nextBtnEnabled = mModel != null ? mModel.getNextBtnEnabled() : null;
                x0(1, nextBtnEnabled);
                if (nextBtnEnabled != null) {
                    z4 = nextBtnEnabled.get();
                } else {
                    z4 = false;
                }
            }
            if ((j & 8388) != 0) {
                ObservableBoolean paySuccess = mModel != null ? mModel.getPaySuccess() : null;
                x0(2, paySuccess);
                z5 = paySuccess != null ? paySuccess.get() : false;
                if ((j & 8324) != 0) {
                    j |= z5 ? 8519680L : 4259840L;
                }
                if ((j & 8388) != 0) {
                    j = z5 ? j | PlaybackStateCompat.ACTION_SET_SHUFFLE_MODE : j | PlaybackStateCompat.ACTION_SET_CAPTIONING_ENABLED;
                }
                if ((j & 8324) != 0) {
                    i6 = z5 ? 0 : 8;
                    i7 = z5 ? 8 : 0;
                    if ((j & 8328) == 0) {
                        i8 = 0;
                    } else {
                        if (mModel != null) {
                            statusIcon = mModel.getStatusIcon();
                        } else {
                            statusIcon = null;
                        }
                        x0(3, statusIcon);
                        if (statusIcon != null) {
                            i8 = statusIcon.get();
                        } else {
                            i8 = 0;
                        }
                    }
                    if ((j & 8336) != 0) {
                        if (mModel != null) {
                            statusString = mModel.getStatusString();
                        } else {
                            statusString = null;
                        }
                        w0(4, statusString);
                        value2 = statusString != null ? statusString.getValue() : null;
                        if ((j & 8352) != 0) {
                            if (mModel != null) {
                                nextString = mModel.getNextString();
                            } else {
                                nextString = null;
                            }
                            w0(5, nextString);
                            if (nextString != null) {
                                String value3 = nextString.getValue();
                                i2 = i6;
                                z2 = z5;
                                z = z4;
                                str3 = value;
                                str2 = value2;
                                i = i7;
                                long j5 = j;
                                str = value3;
                                payResultModel = mModel;
                                i3 = i8;
                                j2 = j5;
                            }
                        } else {
                            mModel = mModel;
                        }
                        i2 = i6;
                        payResultModel = mModel;
                        i3 = i8;
                        z2 = z5;
                        j2 = j;
                        z = z4;
                        str = null;
                        str3 = value;
                        str2 = value2;
                        i = i7;
                    }
                    if ((j & 8352) != 0) {
                        if (mModel != null) {
                            nextString = mModel.getNextString();
                        } else {
                            nextString = null;
                        }
                        w0(5, nextString);
                        if (nextString != null) {
                            String value4 = nextString.getValue();
                            i2 = i6;
                            z2 = z5;
                            z = z4;
                            str3 = value;
                            str2 = value2;
                            i = i7;
                            long j6 = j;
                            str = value4;
                            payResultModel = mModel;
                            i3 = i8;
                            j2 = j6;
                        }
                    } else {
                        mModel = mModel;
                    }
                    i2 = i6;
                    payResultModel = mModel;
                    i3 = i8;
                    z2 = z5;
                    j2 = j;
                    z = z4;
                    str = null;
                    str3 = value;
                    str2 = value2;
                    i = i7;
                }
                if ((j & 8328) == 0) {
                    i8 = 0;
                } else {
                    if (mModel != null) {
                        statusIcon = mModel.getStatusIcon();
                    } else {
                        statusIcon = null;
                    }
                    x0(3, statusIcon);
                    if (statusIcon != null) {
                        i8 = statusIcon.get();
                    } else {
                        i8 = 0;
                    }
                }
                if ((j & 8336) != 0) {
                    if (mModel != null) {
                        statusString = mModel.getStatusString();
                    } else {
                        statusString = null;
                    }
                    w0(4, statusString);
                    if (statusString != null) {
                    }
                    if ((j & 8352) != 0) {
                        if (mModel != null) {
                            nextString = mModel.getNextString();
                        } else {
                            nextString = null;
                        }
                        w0(5, nextString);
                        if (nextString != null) {
                            String value5 = nextString.getValue();
                            i2 = i6;
                            z2 = z5;
                            z = z4;
                            str3 = value;
                            str2 = value2;
                            i = i7;
                            long j7 = j;
                            str = value5;
                            payResultModel = mModel;
                            i3 = i8;
                            j2 = j7;
                        }
                    } else {
                        mModel = mModel;
                    }
                    i2 = i6;
                    payResultModel = mModel;
                    i3 = i8;
                    z2 = z5;
                    j2 = j;
                    z = z4;
                    str = null;
                    str3 = value;
                    str2 = value2;
                    i = i7;
                }
                if ((j & 8352) != 0) {
                    if (mModel != null) {
                        nextString = mModel.getNextString();
                    } else {
                        nextString = null;
                    }
                    w0(5, nextString);
                    if (nextString != null) {
                        String value6 = nextString.getValue();
                        i2 = i6;
                        z2 = z5;
                        z = z4;
                        str3 = value;
                        str2 = value2;
                        i = i7;
                        long j8 = j;
                        str = value6;
                        payResultModel = mModel;
                        i3 = i8;
                        j2 = j8;
                    }
                } else {
                    mModel = mModel;
                }
                i2 = i6;
                payResultModel = mModel;
                i3 = i8;
                z2 = z5;
                j2 = j;
                z = z4;
                str = null;
                str3 = value;
                str2 = value2;
                i = i7;
            } else {
                z5 = false;
            }
            i6 = 0;
            if ((j & 8328) == 0) {
                i8 = 0;
            } else {
                if (mModel != null) {
                    statusIcon = mModel.getStatusIcon();
                } else {
                    statusIcon = null;
                }
                x0(3, statusIcon);
                if (statusIcon != null) {
                    i8 = statusIcon.get();
                } else {
                    i8 = 0;
                }
            }
            if ((j & 8336) != 0) {
                if (mModel != null) {
                    statusString = mModel.getStatusString();
                } else {
                    statusString = null;
                }
                w0(4, statusString);
                if (statusString != null) {
                }
                if ((j & 8352) != 0) {
                    if (mModel != null) {
                        nextString = mModel.getNextString();
                    } else {
                        nextString = null;
                    }
                    w0(5, nextString);
                    if (nextString != null) {
                        String value7 = nextString.getValue();
                        i2 = i6;
                        z2 = z5;
                        z = z4;
                        str3 = value;
                        str2 = value2;
                        i = i7;
                        long j9 = j;
                        str = value7;
                        payResultModel = mModel;
                        i3 = i8;
                        j2 = j9;
                    }
                } else {
                    mModel = mModel;
                }
                i2 = i6;
                payResultModel = mModel;
                i3 = i8;
                z2 = z5;
                j2 = j;
                z = z4;
                str = null;
                str3 = value;
                str2 = value2;
                i = i7;
            }
            if ((j & 8352) != 0) {
                if (mModel != null) {
                    nextString = mModel.getNextString();
                } else {
                    nextString = null;
                }
                w0(5, nextString);
                if (nextString != null) {
                    String value8 = nextString.getValue();
                    i2 = i6;
                    z2 = z5;
                    z = z4;
                    str3 = value;
                    str2 = value2;
                    i = i7;
                    long j10 = j;
                    str = value8;
                    payResultModel = mModel;
                    i3 = i8;
                    j2 = j10;
                }
            } else {
                mModel = mModel;
            }
            i2 = i6;
            payResultModel = mModel;
            i3 = i8;
            z2 = z5;
            j2 = j;
            z = z4;
            str = null;
            str3 = value;
            str2 = value2;
            i = i7;
        } else {
            j2 = j;
            payResultModel = null;
            str = null;
            i = 0;
            str2 = null;
            str3 = null;
            z = false;
            z2 = false;
            i2 = 0;
            i3 = 0;
        }
        if ((j2 & PlaybackStateCompat.ACTION_SET_SHUFFLE_MODE) != 0) {
            ObservableBoolean hasRecommend = payResultModel != null ? payResultModel.getHasRecommend() : null;
            x0(6, hasRecommend);
            z3 = hasRecommend != null ? hasRecommend.get() : false;
            j3 = j2 & 8388;
            if (j3 != 0) {
                if (!z2) {
                    z3 = false;
                }
                if (j3 != 0) {
                    if (z3) {
                        j4 = 557056;
                    } else {
                        j4 = 278528;
                    }
                    j2 |= j4;
                }
                int i9 = z3 ? 0 : 8;
                if (z3) {
                    i5 = 0;
                } else {
                    i5 = 4;
                }
                i4 = i9;
            } else {
                i4 = 0;
                i5 = 0;
            }
            if ((j2 & 8322) != 0) {
                this.B.setEnabled(z);
            }
            if ((8352 & j2) != 0) {
                r8p.b(this.B, str);
            }
            if ((9216 & j2) != 0) {
                r8p.b(this.U, str6);
            }
            if ((10240 & j2) != 0) {
                r8p.b(this.V, str7);
            }
            if ((j2 & 8324) != 0) {
                this.W.setVisibility(i);
                this.M.setVisibility(i2);
            }
            if ((12288 & j2) != 0) {
                r8p.b(this.C, str8);
            }
            if ((8704 & j2) != 0) {
                ImageViewBindingAdapter.setIcon(this.E, str5, null, null);
            }
            if ((8448 & j2) != 0) {
                r8p.b(this.F, str4);
            }
            if ((j2 & 8388) != 0) {
                this.G.setVisibility(i4);
                this.H.setVisibility(i5);
            }
            if ((8336 & j2) != 0) {
                r8p.b(this.J, str2);
            }
            if ((j2 & 8321) != 0) {
                r8p.b(this.K, str3);
            }
            if ((j2 & 8328) != 0) {
                ImageViewBindingAdapter.setIcon(this.L, i3);
            }
        }
        str3 = str3;
        j3 = j2 & 8388;
        if (j3 != 0) {
            if (!z2) {
                z3 = false;
            }
            if (j3 != 0) {
                if (z3) {
                    j4 = 557056;
                } else {
                    j4 = 278528;
                }
                j2 |= j4;
            }
            if (z3) {
            }
            if (z3) {
                i5 = 0;
            } else {
                i5 = 4;
            }
            i4 = i9;
        } else {
            i4 = 0;
            i5 = 0;
        }
        if ((j2 & 8322) != 0) {
            this.B.setEnabled(z);
        }
        if ((8352 & j2) != 0) {
            r8p.b(this.B, str);
        }
        if ((9216 & j2) != 0) {
            r8p.b(this.U, str6);
        }
        if ((10240 & j2) != 0) {
            r8p.b(this.V, str7);
        }
        if ((j2 & 8324) != 0) {
            this.W.setVisibility(i);
            this.M.setVisibility(i2);
        }
        if ((12288 & j2) != 0) {
            r8p.b(this.C, str8);
        }
        if ((8704 & j2) != 0) {
            ImageViewBindingAdapter.setIcon(this.E, str5, null, null);
        }
        if ((8448 & j2) != 0) {
            r8p.b(this.F, str4);
        }
        if ((j2 & 8388) != 0) {
            this.G.setVisibility(i4);
            this.H.setVisibility(i5);
        }
        if ((8336 & j2) != 0) {
            r8p.b(this.J, str2);
        }
        if ((j2 & 8321) != 0) {
            r8p.b(this.K, str3);
        }
        if ((j2 & 8328) != 0) {
            ImageViewBindingAdapter.setIcon(this.L, i3);
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean q0(int i, Object obj) {
        if (jv1.g == i) {
            M0((PayResultViewModel) obj);
        } else if (jv1.f == i) {
            D0((String) obj);
        } else if (jv1.e == i) {
            C0((String) obj);
        } else if (jv1.d == i) {
            B0((String) obj);
        } else if (jv1.h == i) {
            E0((String) obj);
        } else {
            if (jv1.c != i) {
                return false;
            }
            A0((String) obj);
        }
        return true;
    }

    public mnh(rk5 rk5Var, View view) {
        this(rk5Var, view, ViewDataBinding.P(rk5Var, view, 17, Y, Z));
    }
}
