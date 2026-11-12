package defpackage;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.ViewDataBinding;
import com.google.android.material.imageview.ShapeableImageView;

/* JADX INFO: loaded from: classes10.dex */
public class tuq extends suq {
    public static final ViewDataBinding.i F = null;
    public static final SparseIntArray G;
    public long E;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        G = sparseIntArray;
        sparseIntArray.put(xri.D5, 1);
        sparseIntArray.put(xri.x4, 2);
    }

    public tuq(rk5 rk5Var, View view, Object[] objArr) {
        super(rk5Var, view, 0, (ConstraintLayout) objArr[0], (TextView) objArr[2], (ShapeableImageView) objArr[1]);
        this.E = -1L;
        this.A.setTag(null);
        o0(view);
        H();
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
            this.E = 2L;
        }
        e0();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean W(int i, Object obj, int i2) {
        return false;
    }

    @Override // androidx.databinding.ViewDataBinding
    public void o() {
        synchronized (this) {
            this.E = 0L;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean q0(int i, Object obj) {
        if (nv1.f28391b != i) {
            return false;
        }
        setClick((View.OnClickListener) obj);
        return true;
    }

    @Override // defpackage.suq
    public void setClick(View.OnClickListener onClickListener) {
        this.D = onClickListener;
    }

    public tuq(rk5 rk5Var, View view) {
        this(rk5Var, view, ViewDataBinding.P(rk5Var, view, 3, F, G));
    }
}
