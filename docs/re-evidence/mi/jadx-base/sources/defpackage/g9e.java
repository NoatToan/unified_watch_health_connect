package defpackage;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Group;
import androidx.databinding.ViewDataBinding;
import com.xiaomi.fitness.watch.face.view.FaceImageView;
import com.xiaomi.fitness.widget.view.RatioImageView;

/* JADX INFO: loaded from: classes10.dex */
public class g9e extends f9e {
    public static final ViewDataBinding.i N = null;
    public static final SparseIntArray O;
    public final ConstraintLayout L;
    public long M;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        O = sparseIntArray;
        sparseIntArray.put(isi.l, 1);
        sparseIntArray.put(isi.m, 2);
        sparseIntArray.put(isi.x2, 3);
        sparseIntArray.put(isi.y2, 4);
        sparseIntArray.put(isi.i, 5);
        sparseIntArray.put(isi.Q, 6);
        sparseIntArray.put(isi.R, 7);
        sparseIntArray.put(isi.i0, 8);
        sparseIntArray.put(isi.L0, 9);
        sparseIntArray.put(isi.j2, 10);
        sparseIntArray.put(isi.e2, 11);
    }

    public g9e(rk5 rk5Var, View view, Object[] objArr) {
        super(rk5Var, view, 0, (ImageView) objArr[5], (View) objArr[1], (RatioImageView) objArr[2], (View) objArr[6], (TextView) objArr[7], (FrameLayout) objArr[8], (FaceImageView) objArr[9], (ImageView) objArr[11], (FaceImageView) objArr[10], (Group) objArr[3], (TextView) objArr[4]);
        this.M = -1L;
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[0];
        this.L = constraintLayout;
        constraintLayout.setTag(null);
        o0(view);
        H();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean F() {
        synchronized (this) {
            try {
                return this.M != 0;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void H() {
        synchronized (this) {
            this.M = 1L;
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
            this.M = 0L;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean q0(int i, Object obj) {
        return true;
    }

    public g9e(rk5 rk5Var, View view) {
        this(rk5Var, view, ViewDataBinding.P(rk5Var, view, 12, N, O));
    }
}
