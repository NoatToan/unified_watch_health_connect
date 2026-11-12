package defpackage;

import android.util.SparseIntArray;
import android.view.TextureView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.ObservableBoolean;
import androidx.databinding.ViewDataBinding;
import com.xiaomi.fitness.watch.face.edit.ui.FaceEditPreviewView;
import com.xiaomi.fitness.watch.face.model.FaceEditModel;
import com.xiaomi.fitness.watch.face.viewmodel.FaceEditViewModel;
import com.xiaomi.fitness.watch.face.widget.FaceEditPicker;
import com.xiaomi.fitness.watch.face.widget.FaceEditScrollLayout;

/* JADX INFO: loaded from: classes10.dex */
public class kx8 extends jx8 {
    public static final ViewDataBinding.i Q = null;
    public static final SparseIntArray R;
    public long P;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        R = sparseIntArray;
        sparseIntArray.put(isi.T1, 2);
        sparseIntArray.put(isi.F1, 3);
        sparseIntArray.put(isi.n1, 4);
        sparseIntArray.put(isi.D2, 5);
        sparseIntArray.put(isi.f1, 6);
        sparseIntArray.put(isi.E2, 7);
        sparseIntArray.put(isi.T0, 8);
        sparseIntArray.put(isi.g, 9);
        sparseIntArray.put(isi.c2, 10);
        sparseIntArray.put(isi.u, 11);
        sparseIntArray.put(isi.f22049b, 12);
    }

    public kx8(rk5 rk5Var, View view, Object[] objArr) {
        super(rk5Var, view, 1, (TextView) objArr[12], (ImageView) objArr[9], (ConstraintLayout) objArr[11], null, (FaceEditPicker) objArr[1], (FaceEditPreviewView) objArr[8], (TextureView) objArr[6], (ImageView) objArr[4], (ConstraintLayout) objArr[3], (ConstraintLayout) objArr[0], (FaceEditScrollLayout) objArr[2], (ImageView) objArr[10], (CardView) objArr[5], (ImageView) objArr[7]);
        this.P = -1L;
        this.E.setTag(null);
        this.J.setTag(null);
        o0(view);
        H();
    }

    public final boolean A0(ObservableBoolean observableBoolean, int i) {
        if (i != tv1.f35070a) {
            return false;
        }
        synchronized (this) {
            this.P |= 1;
        }
        return true;
    }

    public void B0(FaceEditViewModel faceEditViewModel) {
        this.O = faceEditViewModel;
        synchronized (this) {
            this.P |= 2;
        }
        notifyPropertyChanged(tv1.d);
        super.e0();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean F() {
        synchronized (this) {
            try {
                return this.P != 0;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void H() {
        synchronized (this) {
            this.P = 4L;
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
            j = this.P;
            this.P = 0L;
        }
        FaceEditViewModel faceEditViewModel = this.O;
        long j2 = j & 7;
        int i = 0;
        if (j2 != 0) {
            FaceEditModel mModel = faceEditViewModel != null ? faceEditViewModel.getMModel() : null;
            ObservableBoolean initNameIdMapDone = mModel != null ? mModel.getInitNameIdMapDone() : null;
            x0(0, initNameIdMapDone);
            boolean z = initNameIdMapDone != null ? initNameIdMapDone.get() : false;
            if (j2 != 0) {
                j |= z ? 16L : 8L;
            }
            if (!z) {
                i = 8;
            }
        }
        if ((j & 7) != 0) {
            this.E.setVisibility(i);
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean q0(int i, Object obj) {
        if (tv1.d != i) {
            return false;
        }
        B0((FaceEditViewModel) obj);
        return true;
    }

    public kx8(rk5 rk5Var, View view) {
        this(rk5Var, view, ViewDataBinding.P(rk5Var, view, 13, Q, R));
    }
}
