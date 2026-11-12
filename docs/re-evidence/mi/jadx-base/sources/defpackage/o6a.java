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
import com.xiaomi.fitness.watch.face.widget.VideoBgPicker;
import com.xiaomi.fitness.widget.view.DividerView;

/* JADX INFO: loaded from: classes10.dex */
public class o6a extends n6a {
    public static final ViewDataBinding.i S = null;
    public static final SparseIntArray T;
    public final ConstraintLayout Q;
    public long R;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        T = sparseIntArray;
        sparseIntArray.put(isi.Q, 1);
        sparseIntArray.put(isi.S0, 2);
        sparseIntArray.put(isi.R1, 3);
        sparseIntArray.put(isi.i1, 4);
        sparseIntArray.put(isi.p2, 5);
        sparseIntArray.put(isi.m2, 6);
        sparseIntArray.put(isi.w1, 7);
        sparseIntArray.put(isi.p, 8);
        sparseIntArray.put(isi.K0, 9);
        sparseIntArray.put(isi.J0, 10);
        sparseIntArray.put(isi.I0, 11);
        sparseIntArray.put(isi.s, 12);
        sparseIntArray.put(isi.f22048a, 13);
        sparseIntArray.put(isi.f0, 14);
        sparseIntArray.put(isi.h, 15);
        sparseIntArray.put(isi.f22049b, 16);
    }

    public o6a(rk5 rk5Var, View view, Object[] objArr) {
        super(rk5Var, view, 0, (TextView) objArr[13], (TextView) objArr[16], (View) objArr[15], (FaceColorPickView) objArr[8], (LinearLayout) objArr[12], (DividerView) objArr[1], (View) objArr[14], (ImageView) objArr[11], (TextView) objArr[10], (ConstraintLayout) objArr[9], (TextView) objArr[2], (ConstraintLayout) objArr[4], (VideoBgPicker) objArr[7], (TextView) objArr[3], (RecyclerView) objArr[6], (TextView) objArr[5]);
        this.R = -1L;
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[0];
        this.Q = constraintLayout;
        constraintLayout.setTag(null);
        o0(view);
        H();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean F() {
        synchronized (this) {
            try {
                return this.R != 0;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void H() {
        synchronized (this) {
            this.R = 1L;
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
            this.R = 0L;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean q0(int i, Object obj) {
        return true;
    }

    public o6a(rk5 rk5Var, View view) {
        this(rk5Var, view, ViewDataBinding.P(rk5Var, view, 17, S, T));
    }
}
