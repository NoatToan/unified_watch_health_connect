package defpackage;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import com.xiaomi.fitness.watch.face.view.FaceColorPickView;
import com.xiaomi.fitness.watch.face.view.FaceFunView;
import com.xiaomi.fitness.watch.face.widget.PhotoBgPicker;
import com.xiaomi.fitness.widget.view.DividerView;

/* JADX INFO: loaded from: classes10.dex */
public class m6a extends l6a {
    public static final ViewDataBinding.i T = null;
    public static final SparseIntArray U;
    public final ConstraintLayout R;
    public long S;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        U = sparseIntArray;
        sparseIntArray.put(isi.Q, 1);
        sparseIntArray.put(isi.S0, 2);
        sparseIntArray.put(isi.R1, 3);
        sparseIntArray.put(isi.i1, 4);
        sparseIntArray.put(isi.p2, 5);
        sparseIntArray.put(isi.m2, 6);
        sparseIntArray.put(isi.w1, 7);
        sparseIntArray.put(isi.p, 8);
        sparseIntArray.put(isi.u0, 9);
        sparseIntArray.put(isi.K0, 10);
        sparseIntArray.put(isi.J0, 11);
        sparseIntArray.put(isi.I0, 12);
        sparseIntArray.put(isi.s, 13);
        sparseIntArray.put(isi.f22048a, 14);
        sparseIntArray.put(isi.f0, 15);
        sparseIntArray.put(isi.h, 16);
        sparseIntArray.put(isi.f22049b, 17);
    }

    public m6a(rk5 rk5Var, View view, Object[] objArr) {
        super(rk5Var, view, 0, (TextView) objArr[14], (TextView) objArr[17], (View) objArr[16], (FaceColorPickView) objArr[8], (LinearLayout) objArr[13], (DividerView) objArr[1], (View) objArr[15], (FaceFunView) objArr[9], (ImageView) objArr[12], (TextView) objArr[11], (ConstraintLayout) objArr[10], (TextView) objArr[2], (ConstraintLayout) objArr[4], (PhotoBgPicker) objArr[7], (TextView) objArr[3], (RecyclerView) objArr[6], (TextView) objArr[5]);
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

    public m6a(rk5 rk5Var, View view) {
        this(rk5Var, view, ViewDataBinding.P(rk5Var, view, 18, T, U));
    }
}
