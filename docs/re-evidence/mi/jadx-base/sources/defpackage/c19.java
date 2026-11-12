package defpackage;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.ObservableBoolean;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import com.xiaomi.fitness.watch.face.edit.ui.FaceEditPreviewView;
import com.xiaomi.fitness.watch.face.model.FaceDetailModel;
import com.xiaomi.fitness.watch.face.viewmodel.FaceDetailViewModel;

/* JADX INFO: loaded from: classes10.dex */
public class c19 extends b19 {
    public static final ViewDataBinding.i L = null;
    public static final SparseIntArray M;
    public final ConstraintLayout J;
    public long K;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        M = sparseIntArray;
        sparseIntArray.put(isi.n1, 2);
        sparseIntArray.put(isi.T0, 3);
        sparseIntArray.put(isi.j2, 4);
        sparseIntArray.put(isi.t, 5);
        sparseIntArray.put(isi.C2, 6);
        sparseIntArray.put(isi.B2, 7);
        sparseIntArray.put(isi.F0, 8);
    }

    public c19(rk5 rk5Var, View view, Object[] objArr) {
        super(rk5Var, view, 1, (ImageView) objArr[1], (ConstraintLayout) objArr[5], (RecyclerView) objArr[8], (FaceEditPreviewView) objArr[3], (ImageView) objArr[2], (FaceEditPreviewView) objArr[4], (TextView) objArr[7], (ImageView) objArr[6]);
        this.K = -1L;
        this.A.setTag(null);
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[0];
        this.J = constraintLayout;
        constraintLayout.setTag(null);
        o0(view);
        H();
    }

    public final boolean A0(ObservableBoolean observableBoolean, int i) {
        if (i != tv1.f35070a) {
            return false;
        }
        synchronized (this) {
            this.K |= 1;
        }
        return true;
    }

    public void B0(FaceDetailViewModel faceDetailViewModel) {
        this.I = faceDetailViewModel;
        synchronized (this) {
            this.K |= 2;
        }
        notifyPropertyChanged(tv1.d);
        super.e0();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean F() {
        synchronized (this) {
            try {
                return this.K != 0;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void H() {
        synchronized (this) {
            this.K = 4L;
        }
        e0();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean W(int i, Object obj, int i2) {
        if (i != 0) {
            return false;
        }
        return A0((ObservableBoolean) obj, i2);
    }

    @Override // androidx.databinding.ViewDataBinding
    public void o() {
        long j;
        synchronized (this) {
            j = this.K;
            this.K = 0L;
        }
        FaceDetailViewModel faceDetailViewModel = this.I;
        long j2 = j & 7;
        int i = 0;
        if (j2 != 0) {
            FaceDetailModel mModel = faceDetailViewModel != null ? faceDetailViewModel.getMModel() : null;
            ObservableBoolean hasAod = mModel != null ? mModel.getHasAod() : null;
            x0(0, hasAod);
            boolean z = hasAod != null ? hasAod.get() : false;
            if (j2 != 0) {
                j |= z ? 16L : 8L;
            }
            if (!z) {
                i = 4;
            }
        }
        if ((j & 7) != 0) {
            this.A.setVisibility(i);
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean q0(int i, Object obj) {
        if (tv1.d != i) {
            return false;
        }
        B0((FaceDetailViewModel) obj);
        return true;
    }

    public c19(rk5 rk5Var, View view) {
        this(rk5Var, view, ViewDataBinding.P(rk5Var, view, 9, L, M));
    }
}
