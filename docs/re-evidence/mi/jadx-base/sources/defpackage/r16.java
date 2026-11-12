package defpackage;

import android.support.v4.media.session.PlaybackStateCompat;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewStub;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.ObservableArrayList;
import androidx.databinding.ObservableBoolean;
import androidx.databinding.ObservableInt;
import androidx.databinding.ViewDataBinding;
import androidx.databinding.f;
import androidx.recyclerview.widget.RecyclerView;
import com.airbnb.lottie.LottieAnimationView;
import com.xiaomi.fitness.baseui.recyclerview.adapter.BindingAdapters;
import com.xiaomi.fitness.baseui.recyclerview.adapter.PowerfullAdapter;
import com.xiaomi.fitness.baseui.recyclerview.itembindings.ItemBinding;
import com.xiaomi.fitness.device.manager.export.scan.ScannedDeviceInfo;
import com.xiaomi.fitness.device.manager.ui.scan.ScanDeviceViewModel;
import com.xiaomi.fitness.device.manager.ui.scan.ScanningView;

/* JADX INFO: loaded from: classes8.dex */
public class r16 extends q16 {
    public static final ViewDataBinding.i M = null;
    public static final SparseIntArray N;
    public long L;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        N = sparseIntArray;
        sparseIntArray.put(xqi.Z, 1);
        sparseIntArray.put(xqi.Y, 2);
        sparseIntArray.put(xqi.S, 9);
    }

    public r16(rk5 rk5Var, View view, Object[] objArr) {
        super(rk5Var, view, 4, (ConstraintLayout) objArr[0], (FrameLayout) objArr[4], (LottieAnimationView) objArr[7], (RecyclerView) objArr[5], (ScanningView) objArr[3], (TextView) objArr[6], (TextView) objArr[8], (TextView) objArr[9], new ixq((ViewStub) objArr[2]), new ixq((ViewStub) objArr[1]));
        this.L = -1L;
        this.A.setTag(null);
        this.B.setTag(null);
        this.C.setTag(null);
        this.D.setTag(null);
        this.E.setTag(null);
        this.F.setTag(null);
        this.G.setTag(null);
        this.I.j(this);
        this.J.j(this);
        o0(view);
        H();
    }

    public final boolean B0(ObservableInt observableInt, int i) {
        if (i != zv1.f41705a) {
            return false;
        }
        synchronized (this) {
            this.L |= 1;
        }
        return true;
    }

    public final boolean C0(ObservableBoolean observableBoolean, int i) {
        if (i != zv1.f41705a) {
            return false;
        }
        synchronized (this) {
            this.L |= 4;
        }
        return true;
    }

    public final boolean D0(ObservableBoolean observableBoolean, int i) {
        if (i != zv1.f41705a) {
            return false;
        }
        synchronized (this) {
            this.L |= 8;
        }
        return true;
    }

    public final boolean E0(ObservableArrayList<ScannedDeviceInfo> observableArrayList, int i) {
        if (i != zv1.f41705a) {
            return false;
        }
        synchronized (this) {
            this.L |= 2;
        }
        return true;
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean F() {
        synchronized (this) {
            try {
                return this.L != 0;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void F0(ScanDeviceViewModel scanDeviceViewModel) {
        this.K = scanDeviceViewModel;
        synchronized (this) {
            this.L |= 16;
        }
        notifyPropertyChanged(zv1.f41707k);
        super.e0();
    }

    @Override // androidx.databinding.ViewDataBinding
    public void H() {
        synchronized (this) {
            this.L = 32L;
        }
        e0();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean W(int i, Object obj, int i2) {
        if (i == 0) {
            return B0((ObservableInt) obj, i2);
        }
        if (i == 1) {
            return E0((ObservableArrayList) obj, i2);
        }
        if (i == 2) {
            return C0((ObservableBoolean) obj, i2);
        }
        if (i != 3) {
            return false;
        }
        return D0((ObservableBoolean) obj, i2);
    }

    /* JADX WARN: Code duplicated, block: B:100:0x0147  */
    /* JADX WARN: Code duplicated, block: B:23:0x005f  */
    /* JADX WARN: Code duplicated, block: B:44:0x0099 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:45:0x009b  */
    /* JADX WARN: Code duplicated, block: B:46:0x00a2  */
    /* JADX WARN: Code duplicated, block: B:49:0x00a8  */
    /* JADX WARN: Code duplicated, block: B:50:0x00ad  */
    /* JADX WARN: Code duplicated, block: B:52:0x00b0 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:53:0x00b2  */
    /* JADX WARN: Code duplicated, block: B:54:0x00b8  */
    /* JADX WARN: Code duplicated, block: B:56:0x00be  */
    /* JADX WARN: Code duplicated, block: B:57:0x00c1  */
    /* JADX WARN: Code duplicated, block: B:59:0x00c5  */
    /* JADX WARN: Code duplicated, block: B:60:0x00c8  */
    /* JADX WARN: Code duplicated, block: B:62:0x00d5  */
    /* JADX WARN: Code duplicated, block: B:92:0x0132 A[PHI: r2
      0x0132: PHI (r2v3 long) = (r2v2 long), (r2v18 long) binds: [B:80:0x0119, B:89:0x012c] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // androidx.databinding.ViewDataBinding
    public void o() {
        long j;
        int i;
        boolean z;
        boolean z2;
        int i2;
        int i3;
        ObservableBoolean isShowList;
        boolean z3;
        ItemBinding<ScannedDeviceInfo> itemBinding;
        f fVar;
        PowerfullAdapter<ScannedDeviceInfo> powerfullAdapter;
        boolean z4;
        int i4;
        boolean z5;
        int i5;
        ItemBinding<ScannedDeviceInfo> itemBinding2;
        f scannedDeviceList;
        PowerfullAdapter<ScannedDeviceInfo> adapter;
        long j2;
        int i6;
        int i7;
        synchronized (this) {
            j = this.L;
            this.L = 0L;
        }
        ScanDeviceViewModel scanDeviceViewModel = this.K;
        if ((63 & j) != 0) {
            if ((j & 50) != 0) {
                if (scanDeviceViewModel != null) {
                    itemBinding2 = scanDeviceViewModel.getItemBinding();
                    adapter = scanDeviceViewModel.getAdapter();
                    scannedDeviceList = scanDeviceViewModel.getScannedDeviceList();
                } else {
                    itemBinding2 = null;
                    scannedDeviceList = null;
                    adapter = null;
                }
                y0(1, scannedDeviceList);
            } else {
                itemBinding2 = null;
                scannedDeviceList = null;
                adapter = null;
            }
            if ((j & 49) == 0) {
                i3 = 0;
            } else {
                ObservableInt buttonText = scanDeviceViewModel != null ? scanDeviceViewModel.getButtonText() : null;
                x0(0, buttonText);
                if (buttonText != null) {
                    i3 = buttonText.get();
                } else {
                    i3 = 0;
                }
            }
            long j3 = j & 60;
            if (j3 != 0) {
                ObservableBoolean isSearching = scanDeviceViewModel != null ? scanDeviceViewModel.getIsSearching() : null;
                x0(2, isSearching);
                z = isSearching != null ? isSearching.get() : false;
                if (j3 != 0) {
                    j = z ? j | 2048 : j | 1024;
                }
                z2 = (j & 52) != 0 ? !z : false;
                j2 = j & 56;
                if (j2 != 0) {
                    if (scanDeviceViewModel != null) {
                        isShowList = scanDeviceViewModel.getIsShowList();
                    } else {
                        isShowList = null;
                    }
                    x0(3, isShowList);
                    if (isShowList != null) {
                        z3 = isShowList.get();
                    } else {
                        z3 = false;
                    }
                    if (j2 != 0) {
                        if (z3) {
                            j |= 41472;
                        } else {
                            j |= 20736;
                        }
                    }
                    if (z3) {
                        i6 = 8;
                    } else {
                        i6 = 0;
                    }
                    if (z3) {
                        i7 = 0;
                    } else {
                        i7 = 8;
                    }
                    itemBinding = itemBinding2;
                    fVar = scannedDeviceList;
                    powerfullAdapter = adapter;
                    i = i6;
                    i2 = i7;
                } else {
                    itemBinding = itemBinding2;
                    fVar = scannedDeviceList;
                    powerfullAdapter = adapter;
                    i = 0;
                    i2 = 0;
                    isShowList = null;
                    z3 = false;
                }
            } else {
                z = false;
            }
            j2 = j & 56;
            if (j2 != 0) {
                if (scanDeviceViewModel != null) {
                    isShowList = scanDeviceViewModel.getIsShowList();
                } else {
                    isShowList = null;
                }
                x0(3, isShowList);
                if (isShowList != null) {
                    z3 = isShowList.get();
                } else {
                    z3 = false;
                }
                if (j2 != 0) {
                    if (z3) {
                        j |= 41472;
                    } else {
                        j |= 20736;
                    }
                }
                if (z3) {
                    i6 = 8;
                } else {
                    i6 = 0;
                }
                if (z3) {
                    i7 = 0;
                } else {
                    i7 = 8;
                }
                itemBinding = itemBinding2;
                fVar = scannedDeviceList;
                powerfullAdapter = adapter;
                i = i6;
                i2 = i7;
            } else {
                itemBinding = itemBinding2;
                fVar = scannedDeviceList;
                powerfullAdapter = adapter;
                i = 0;
                i2 = 0;
                isShowList = null;
                z3 = false;
            }
        } else {
            i = 0;
            z = false;
            z2 = false;
            i2 = 0;
            i3 = 0;
            isShowList = null;
            z3 = false;
            itemBinding = null;
            fVar = null;
            powerfullAdapter = null;
        }
        if ((2048 & j) != 0) {
            if (scanDeviceViewModel != null) {
                isShowList = scanDeviceViewModel.getIsShowList();
            }
            x0(3, isShowList);
            if (isShowList != null) {
                z3 = isShowList.get();
            }
            if ((j & 56) != 0) {
                j |= z3 ? 41472L : 20736L;
            }
            z4 = !z3;
        } else {
            z4 = false;
        }
        long j4 = j & 60;
        if (j4 == 0) {
            i4 = 0;
        } else {
            if (!z) {
                z4 = false;
            }
            if (j4 != 0) {
                j |= z4 ? PlaybackStateCompat.ACTION_PREPARE_FROM_URI : PlaybackStateCompat.ACTION_PREPARE_FROM_SEARCH;
            }
            if (z4) {
                i4 = 0;
            } else {
                i4 = 8;
            }
        }
        if ((8192 & j) == 0) {
            z5 = false;
        } else {
            if ((scanDeviceViewModel != null ? scanDeviceViewModel.getDeviceInfo() : null) == null) {
                z5 = true;
            } else {
                z5 = false;
            }
        }
        long j5 = j & 56;
        if (j5 != 0) {
            if (!z3) {
                z5 = false;
            }
            if (j5 != 0) {
                j |= z5 ? 128L : 64L;
            }
            i5 = z5 ? 0 : 8;
        } else {
            i5 = 0;
        }
        if ((j & 56) != 0) {
            this.B.setVisibility(i2);
            this.E.setVisibility(i2);
            this.F.setVisibility(i5);
            this.G.setVisibility(i);
        }
        if ((j & 60) != 0) {
            this.C.setVisibility(i4);
        }
        if ((j & 50) != 0) {
            BindingAdapters.setAdapter(this.D, itemBinding, fVar, powerfullAdapter, null, null);
        }
        if ((52 & j) != 0) {
            this.G.setEnabled(z2);
        }
        if ((j & 49) != 0) {
            this.G.setText(i3);
        }
        if ((j & 48) != 0) {
            if (this.I.i()) {
                this.I.g().q0(zv1.f41707k, scanDeviceViewModel);
            }
            if (this.J.i()) {
                this.J.g().q0(zv1.f41707k, scanDeviceViewModel);
            }
        }
        if (this.I.g() != null) {
            ViewDataBinding.r(this.I.g());
        }
        if (this.J.g() != null) {
            ViewDataBinding.r(this.J.g());
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean q0(int i, Object obj) {
        if (zv1.f41707k != i) {
            return false;
        }
        F0((ScanDeviceViewModel) obj);
        return true;
    }

    public r16(rk5 rk5Var, View view) {
        this(rk5Var, view, ViewDataBinding.P(rk5Var, view, 10, M, N));
    }
}
