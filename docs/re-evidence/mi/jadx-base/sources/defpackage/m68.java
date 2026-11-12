package defpackage;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import androidx.databinding.ViewDataBinding;
import com.xiaomi.fitness.electronic.scale.widget.BodyShapeView;

/* JADX INFO: loaded from: classes8.dex */
public class m68 extends l68 {
    public static final ViewDataBinding.i U = null;
    public static final SparseIntArray V;
    public final ConstraintLayout S;
    public long T;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        V = sparseIntArray;
        sparseIntArray.put(bri.I5, 1);
        sparseIntArray.put(bri.y0, 2);
        sparseIntArray.put(bri.v, 3);
        sparseIntArray.put(bri.w5, 4);
        sparseIntArray.put(bri.q1, 5);
        sparseIntArray.put(bri.x5, 6);
        sparseIntArray.put(bri.y5, 7);
        sparseIntArray.put(bri.x, 8);
        sparseIntArray.put(bri.J5, 9);
        sparseIntArray.put(bri.s6, 10);
        sparseIntArray.put(bri.S5, 11);
        sparseIntArray.put(bri.T5, 12);
        sparseIntArray.put(bri.d4, 13);
        sparseIntArray.put(bri.e4, 14);
        sparseIntArray.put(bri.z5, 15);
        sparseIntArray.put(bri.A5, 16);
        sparseIntArray.put(bri.f4, 17);
        sparseIntArray.put(bri.g4, 18);
    }

    public m68(rk5 rk5Var, View view, Object[] objArr) {
        super(rk5Var, view, 0, (ConstraintLayout) objArr[3], (ConstraintLayout) objArr[8], (Guideline) objArr[2], (ImageView) objArr[5], (TextView) objArr[13], (TextView) objArr[14], (TextView) objArr[17], (TextView) objArr[18], (TextView) objArr[4], (ImageView) objArr[6], (TextView) objArr[7], (TextView) objArr[15], (TextView) objArr[16], (TextView) objArr[1], (TextView) objArr[9], (TextView) objArr[11], (TextView) objArr[12], (BodyShapeView) objArr[10]);
        this.T = -1L;
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[0];
        this.S = constraintLayout;
        constraintLayout.setTag(null);
        o0(view);
        H();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean F() {
        synchronized (this) {
            try {
                return this.T != 0;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void H() {
        synchronized (this) {
            this.T = 1L;
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
            this.T = 0L;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean q0(int i, Object obj) {
        return true;
    }

    public m68(rk5 rk5Var, View view) {
        this(rk5Var, view, ViewDataBinding.P(rk5Var, view, 19, U, V));
    }
}
