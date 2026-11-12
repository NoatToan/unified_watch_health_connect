package defpackage;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.ObservableBoolean;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import com.xiaomi.fitness.watch.face.debug.designer.FaceDesignerModel;
import com.xiaomi.fitness.watch.face.debug.designer.FaceDesignerViewModel;
import com.xiaomi.fitness.widget.SwitchButtonBindingTwoLineTextView;

/* JADX INFO: loaded from: classes10.dex */
public class ax8 extends zw8 {
    public static final ViewDataBinding.i H = null;
    public static final SparseIntArray I;
    public final ConstraintLayout F;
    public long G;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        I = sparseIntArray;
        sparseIntArray.put(isi.Z1, 3);
        sparseIntArray.put(isi.h0, 4);
    }

    public ax8(rk5 rk5Var, View view, Object[] objArr) {
        super(rk5Var, view, 2, (RecyclerView) objArr[4], (TextView) objArr[3], (SwitchButtonBindingTwoLineTextView) objArr[2], (SwitchButtonBindingTwoLineTextView) objArr[1]);
        this.G = -1L;
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[0];
        this.F = constraintLayout;
        constraintLayout.setTag(null);
        this.C.setTag(null);
        this.D.setTag(null);
        o0(view);
        H();
    }

    public final boolean A0(ObservableBoolean observableBoolean, int i) {
        if (i != tv1.f35070a) {
            return false;
        }
        synchronized (this) {
            this.G |= 1;
        }
        return true;
    }

    public final boolean B0(ObservableBoolean observableBoolean, int i) {
        if (i != tv1.f35070a) {
            return false;
        }
        synchronized (this) {
            this.G |= 2;
        }
        return true;
    }

    public void C0(FaceDesignerViewModel faceDesignerViewModel) {
        this.E = faceDesignerViewModel;
        synchronized (this) {
            this.G |= 4;
        }
        notifyPropertyChanged(tv1.d);
        super.e0();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean F() {
        synchronized (this) {
            try {
                return this.G != 0;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void H() {
        synchronized (this) {
            this.G = 8L;
        }
        e0();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean W(int i, Object obj, int i2) {
        if (i == 0) {
            return A0((ObservableBoolean) obj, i2);
        }
        if (i != 1) {
            return false;
        }
        return B0((ObservableBoolean) obj, i2);
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0039  */
    @Override // androidx.databinding.ViewDataBinding
    public void o() {
        long j;
        boolean z;
        boolean z2;
        synchronized (this) {
            j = this.G;
            this.G = 0L;
        }
        FaceDesignerViewModel faceDesignerViewModel = this.E;
        boolean z3 = false;
        if ((15 & j) != 0) {
            FaceDesignerModel mModel = faceDesignerViewModel != null ? faceDesignerViewModel.getMModel() : null;
            if ((j & 13) == 0) {
                z2 = false;
            } else {
                ObservableBoolean verifyCapability = mModel != null ? mModel.getVerifyCapability() : null;
                x0(0, verifyCapability);
                if (verifyCapability != null) {
                    z2 = verifyCapability.get();
                } else {
                    z2 = false;
                }
            }
            if ((j & 14) != 0) {
                ObservableBoolean verifySign = mModel != null ? mModel.getVerifySign() : null;
                x0(1, verifySign);
                if (verifySign != null) {
                    z3 = verifySign.get();
                }
            }
            z = z3;
            z3 = z2;
        } else {
            z = false;
        }
        if ((13 & j) != 0) {
            SwitchButtonBindingTwoLineTextView.setSwitchOn(this.C, z3);
        }
        if ((j & 14) != 0) {
            SwitchButtonBindingTwoLineTextView.setSwitchOn(this.D, z);
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean q0(int i, Object obj) {
        if (tv1.d != i) {
            return false;
        }
        C0((FaceDesignerViewModel) obj);
        return true;
    }

    public ax8(rk5 rk5Var, View view) {
        this(rk5Var, view, ViewDataBinding.P(rk5Var, view, 5, H, I));
    }
}
