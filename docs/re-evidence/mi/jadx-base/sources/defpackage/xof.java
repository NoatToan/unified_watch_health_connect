package defpackage;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.imageview.ShapeableImageView;

/* JADX INFO: loaded from: classes9.dex */
public class xof extends wof {
    public static final ViewDataBinding.i T = null;
    public static final SparseIntArray U;
    public final ConstraintLayout R;
    public long S;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        U = sparseIntArray;
        sparseIntArray.put(kri.g, 1);
        sparseIntArray.put(kri.d, 2);
        sparseIntArray.put(kri.f24230k, 3);
        sparseIntArray.put(kri.D, 4);
        sparseIntArray.put(kri.B, 5);
        sparseIntArray.put(kri.f, 6);
        sparseIntArray.put(kri.A, 7);
        sparseIntArray.put(kri.e, 8);
        sparseIntArray.put(kri.j, 9);
        sparseIntArray.put(kri.v, 10);
        sparseIntArray.put(kri.u, 11);
        sparseIntArray.put(kri.x, 12);
        sparseIntArray.put(kri.y, 13);
        sparseIntArray.put(kri.w, 14);
        sparseIntArray.put(kri.q, 15);
        sparseIntArray.put(kri.t, 16);
        sparseIntArray.put(kri.f24229b, 17);
    }

    public xof(rk5 rk5Var, View view, Object[] objArr) {
        super(rk5Var, view, 0, (CheckBox) objArr[17], (ImageView) objArr[2], (RecyclerView) objArr[8], (ConstraintLayout) objArr[6], (ShapeableImageView) objArr[1], (TextView) objArr[9], (ImageView) objArr[3], (TextView) objArr[15], (TextView) objArr[16], (ConstraintLayout) objArr[11], (ConstraintLayout) objArr[10], (TextView) objArr[14], (ImageView) objArr[12], (TextView) objArr[13], (TextView) objArr[7], (TextView) objArr[5], (TextView) objArr[4]);
        this.S = -1L;
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[0];
        this.R = constraintLayout;
        constraintLayout.setTag(null);
        o0(view);
        H();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean F() {
        synchronized (this) {
            try {
                return this.S != 0;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void H() {
        synchronized (this) {
            this.S = 1L;
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
            this.S = 0L;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean q0(int i, Object obj) {
        return true;
    }

    public xof(rk5 rk5Var, View view) {
        this(rk5Var, view, ViewDataBinding.P(rk5Var, view, 18, T, U));
    }
}
