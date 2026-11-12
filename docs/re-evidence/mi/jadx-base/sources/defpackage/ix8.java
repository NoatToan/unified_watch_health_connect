package defpackage;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.ObservableBoolean;
import androidx.databinding.ViewDataBinding;
import androidx.lifecycle.LifecycleOwner;
import androidx.recyclerview.widget.RecyclerView;
import com.xiaomi.fitness.watch.face.model.FaceDetailModel;
import com.xiaomi.fitness.watch.face.view.FaceWaterMarkView;
import com.xiaomi.fitness.watch.face.viewmodel.FaceDetailViewModel;
import com.xiaomi.fitness.watch.face.widget.FaceDetailScrollView;

/* JADX INFO: loaded from: classes10.dex */
public class ix8 extends hx8 {
    public static final ViewDataBinding.i Z;
    public static final SparseIntArray a0;
    public final ConstraintLayout X;
    public long Y;

    static {
        ViewDataBinding.i iVar = new ViewDataBinding.i(23);
        Z = iVar;
        iVar.a(1, new String[]{"face_layout_detail_header"}, new int[]{6}, new int[]{ovi.m});
        SparseIntArray sparseIntArray = new SparseIntArray();
        a0 = sparseIntArray;
        sparseIntArray.put(isi.S1, 7);
        sparseIntArray.put(isi.V0, 8);
        sparseIntArray.put(isi.Z0, 9);
        sparseIntArray.put(isi.A1, 10);
        sparseIntArray.put(isi.f0, 11);
        sparseIntArray.put(isi.u, 12);
        sparseIntArray.put(isi.v, 13);
        sparseIntArray.put(isi.W, 14);
        sparseIntArray.put(isi.X, 15);
        sparseIntArray.put(isi.c0, 16);
        sparseIntArray.put(isi.f22049b, 17);
        sparseIntArray.put(isi.M0, 18);
        sparseIntArray.put(isi.K1, 19);
        sparseIntArray.put(isi.z2, 20);
        sparseIntArray.put(isi.L1, 21);
        sparseIntArray.put(isi.H2, 22);
    }

    public ix8(rk5 rk5Var, View view, Object[] objArr) {
        super(rk5Var, view, 4, (TextView) objArr[17], (ConstraintLayout) objArr[12], (ConstraintLayout) objArr[13], (ConstraintLayout) objArr[14], (ImageView) objArr[15], (TextView) objArr[16], (View) objArr[11], (b19) objArr[6], (TextView) objArr[18], (RecyclerView) objArr[2], (TextView) objArr[3], (TextView) objArr[8], (TextView) objArr[9], (ImageView) objArr[10], (ConstraintLayout) objArr[19], (TextView) objArr[21], (RecyclerView) objArr[5], (TextView) objArr[4], (ConstraintLayout) objArr[0], (FaceDetailScrollView) objArr[7], (TextView) objArr[20], (FaceWaterMarkView) objArr[22]);
        this.Y = -1L;
        k0(this.H);
        this.J.setTag(null);
        this.K.setTag(null);
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[1];
        this.X = constraintLayout;
        constraintLayout.setTag(null);
        this.Q.setTag(null);
        this.R.setTag(null);
        this.S.setTag(null);
        o0(view);
        H();
    }

    public final boolean A0(b19 b19Var, int i) {
        if (i != tv1.f35070a) {
            return false;
        }
        synchronized (this) {
            this.Y |= 2;
        }
        return true;
    }

    public final boolean B0(ObservableBoolean observableBoolean, int i) {
        if (i != tv1.f35070a) {
            return false;
        }
        synchronized (this) {
            this.Y |= 1;
        }
        return true;
    }

    public final boolean C0(ObservableBoolean observableBoolean, int i) {
        if (i != tv1.f35070a) {
            return false;
        }
        synchronized (this) {
            this.Y |= 8;
        }
        return true;
    }

    public final boolean D0(ObservableBoolean observableBoolean, int i) {
        if (i != tv1.f35070a) {
            return false;
        }
        synchronized (this) {
            this.Y |= 4;
        }
        return true;
    }

    public void E0(FaceDetailViewModel faceDetailViewModel) {
        this.W = faceDetailViewModel;
        synchronized (this) {
            this.Y |= 16;
        }
        notifyPropertyChanged(tv1.d);
        super.e0();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean F() {
        synchronized (this) {
            try {
                if (this.Y != 0) {
                    return true;
                }
                return this.H.F();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void H() {
        synchronized (this) {
            this.Y = 32L;
        }
        this.H.H();
        e0();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean W(int i, Object obj, int i2) {
        if (i == 0) {
            return B0((ObservableBoolean) obj, i2);
        }
        if (i == 1) {
            return A0((b19) obj, i2);
        }
        if (i == 2) {
            return D0((ObservableBoolean) obj, i2);
        }
        if (i != 3) {
            return false;
        }
        return C0((ObservableBoolean) obj, i2);
    }

    @Override // androidx.databinding.ViewDataBinding
    public void l0(LifecycleOwner lifecycleOwner) {
        super.l0(lifecycleOwner);
        this.H.l0(lifecycleOwner);
    }

    /* JADX WARN: Code duplicated, block: B:28:0x0051 A[PHI: r2
      0x0051: PHI (r2v7 long) = (r2v0 long), (r2v15 long) binds: [B:12:0x0028, B:25:0x004b] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:46:0x007f A[PHI: r2
      0x007f: PHI (r2v9 long) = (r2v8 long), (r2v13 long) binds: [B:30:0x0056, B:43:0x0079] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:70:0x00bb  */
    /* JADX WARN: Code duplicated, block: B:73:0x00c6  */
    /* JADX WARN: Code duplicated, block: B:76:0x00d0  */
    @Override // androidx.databinding.ViewDataBinding
    public void o() {
        long j;
        int i;
        int i2;
        int i3;
        int i4;
        synchronized (this) {
            j = this.Y;
            this.Y = 0L;
        }
        FaceDetailViewModel faceDetailViewModel = this.W;
        if ((61 & j) != 0) {
            FaceDetailModel mModel = faceDetailViewModel != null ? faceDetailViewModel.getMModel() : null;
            long j2 = j & 49;
            if (j2 == 0) {
                i2 = 0;
            } else {
                ObservableBoolean hasDescription = mModel != null ? mModel.getHasDescription() : null;
                x0(0, hasDescription);
                boolean z = hasDescription != null ? hasDescription.get() : false;
                if (j2 != 0) {
                    j |= z ? 512L : 256L;
                }
                if (z) {
                    i2 = 0;
                } else {
                    i2 = 8;
                }
            }
            long j3 = j & 52;
            if (j3 == 0) {
                i4 = 0;
            } else {
                ObservableBoolean hasRecommend = mModel != null ? mModel.getHasRecommend() : null;
                x0(2, hasRecommend);
                boolean z2 = hasRecommend != null ? hasRecommend.get() : false;
                if (j3 != 0) {
                    j |= z2 ? 2048L : 1024L;
                }
                if (z2) {
                    i4 = 0;
                } else {
                    i4 = 8;
                }
            }
            long j4 = j & 56;
            if (j4 != 0) {
                ObservableBoolean hasLabelList = mModel != null ? mModel.getHasLabelList() : null;
                x0(3, hasLabelList);
                boolean z3 = hasLabelList != null ? hasLabelList.get() : false;
                if (j4 != 0) {
                    j |= z3 ? 128L : 64L;
                }
                int i5 = z3 ? 0 : 8;
                i = i4;
                i3 = i5;
            } else {
                i = i4;
            }
            if ((56 & j) != 0) {
                this.J.setVisibility(i3);
            }
            if ((j & 49) != 0) {
                this.K.setVisibility(i2);
            }
            if ((j & 52) != 0) {
                this.Q.setVisibility(i);
                this.R.setVisibility(i);
            }
            ViewDataBinding.r(this.H);
        }
        i = 0;
        i2 = 0;
        i3 = 0;
        if ((56 & j) != 0) {
            this.J.setVisibility(i3);
        }
        if ((j & 49) != 0) {
            this.K.setVisibility(i2);
        }
        if ((j & 52) != 0) {
            this.Q.setVisibility(i);
            this.R.setVisibility(i);
        }
        ViewDataBinding.r(this.H);
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean q0(int i, Object obj) {
        if (tv1.d != i) {
            return false;
        }
        E0((FaceDetailViewModel) obj);
        return true;
    }

    public ix8(rk5 rk5Var, View view) {
        this(rk5Var, view, ViewDataBinding.P(rk5Var, view, 23, Z, a0));
    }
}
