package defpackage;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.ViewDataBinding;
import com.xiaomi.fitness.watch.face.edit.photo.crop.FaceForegroundScaleView;
import com.xiaomi.fitness.watch.face.export.exportview.RectView;
import com.xiaomi.fitness.watch.face.view.FaceStyleView;
import com.xiaomi.fitness.watch.face.view.XmsTextureView;
import miuix.recyclerview.widget.RecyclerView;

/* JADX INFO: loaded from: classes10.dex */
public class gx8 extends fx8 {
    public static final ViewDataBinding.i L = null;
    public static final SparseIntArray M;
    public final ConstraintLayout J;
    public long K;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        M = sparseIntArray;
        sparseIntArray.put(isi.u2, 1);
        sparseIntArray.put(isi.q0, 2);
        sparseIntArray.put(isi.r0, 3);
        sparseIntArray.put(isi.N1, 4);
        sparseIntArray.put(isi.l2, 5);
        sparseIntArray.put(isi.b1, 6);
        sparseIntArray.put(isi.c1, 7);
        sparseIntArray.put(isi.z1, 8);
        sparseIntArray.put(isi.y0, 9);
    }

    public gx8(rk5 rk5Var, View view, Object[] objArr) {
        super(rk5Var, view, 0, (FaceStyleView) objArr[2], (FaceForegroundScaleView) objArr[3], (TextView) objArr[9], (RecyclerView) objArr[6], (RecyclerView) objArr[7], (ImageView) objArr[8], (RectView) objArr[4], (TextView) objArr[5], (XmsTextureView) objArr[1]);
        this.K = -1L;
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[0];
        this.J = constraintLayout;
        constraintLayout.setTag(null);
        o0(view);
        H();
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
            this.K = 1L;
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
            this.K = 0L;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean q0(int i, Object obj) {
        return true;
    }

    public gx8(rk5 rk5Var, View view) {
        this(rk5Var, view, ViewDataBinding.P(rk5Var, view, 10, L, M));
    }
}
