package defpackage;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.ViewDataBinding;
import com.xiaomi.fitness.watch.face.edit.photo.crop.FaceForegroundScaleView;
import com.xiaomi.fitness.watch.face.export.exportview.RectView;
import com.xiaomi.fitness.watch.face.view.FaceStyleView;
import com.xiaomi.fitness.watch.face.view.ScaleView;
import miuix.recyclerview.widget.RecyclerView;

/* JADX INFO: loaded from: classes10.dex */
public class cx8 extends bx8 {
    public static final ViewDataBinding.i K = null;
    public static final SparseIntArray L;
    public final ConstraintLayout I;
    public long J;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        L = sparseIntArray;
        sparseIntArray.put(isi.T0, 1);
        sparseIntArray.put(isi.q0, 2);
        sparseIntArray.put(isi.r0, 3);
        sparseIntArray.put(isi.N1, 4);
        sparseIntArray.put(isi.l2, 5);
        sparseIntArray.put(isi.b1, 6);
        sparseIntArray.put(isi.c1, 7);
        sparseIntArray.put(isi.y0, 8);
    }

    public cx8(rk5 rk5Var, View view, Object[] objArr) {
        super(rk5Var, view, 0, (FaceStyleView) objArr[2], (FaceForegroundScaleView) objArr[3], (TextView) objArr[8], (ScaleView) objArr[1], (RecyclerView) objArr[6], (RecyclerView) objArr[7], (RectView) objArr[4], (TextView) objArr[5]);
        this.J = -1L;
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[0];
        this.I = constraintLayout;
        constraintLayout.setTag(null);
        o0(view);
        H();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean F() {
        synchronized (this) {
            try {
                return this.J != 0;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void H() {
        synchronized (this) {
            this.J = 1L;
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
            this.J = 0L;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean q0(int i, Object obj) {
        return true;
    }

    public cx8(rk5 rk5Var, View view) {
        this(rk5Var, view, ViewDataBinding.P(rk5Var, view, 9, K, L));
    }
}
