package defpackage;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Group;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import com.xiaomi.fitness.widget.expandable.ExpandableTextView;
import com.xiaomi.fitness.widget.view.DividerView;
import com.xiaomi.fitness.widget.view.RatioImageView;

/* JADX INFO: loaded from: classes5.dex */
public class mm7 extends lm7 {
    public static final ViewDataBinding.i e0 = null;
    public static final SparseIntArray f0;
    public final LinearLayout c0;
    public long d0;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f0 = sparseIntArray;
        sparseIntArray.put(oqi.T0, 1);
        sparseIntArray.put(oqi.H1, 2);
        sparseIntArray.put(oqi.V, 3);
        sparseIntArray.put(oqi.W, 4);
        sparseIntArray.put(oqi.X, 5);
        sparseIntArray.put(oqi.y, 6);
        sparseIntArray.put(oqi.z, 7);
        sparseIntArray.put(oqi.A, 8);
        sparseIntArray.put(oqi.v1, 9);
        sparseIntArray.put(oqi.w1, 10);
        sparseIntArray.put(oqi.x1, 11);
        sparseIntArray.put(oqi.R, 12);
        sparseIntArray.put(oqi.a0, 13);
        sparseIntArray.put(oqi.b0, 14);
        sparseIntArray.put(oqi.c0, 15);
        sparseIntArray.put(oqi.S, 16);
        sparseIntArray.put(oqi.U, 17);
        sparseIntArray.put(oqi.E, 18);
        sparseIntArray.put(oqi.D, 19);
        sparseIntArray.put(oqi.F, 20);
        sparseIntArray.put(oqi.C, 21);
        sparseIntArray.put(oqi.c1, 22);
        sparseIntArray.put(oqi.f29391b, 23);
        sparseIntArray.put(oqi.d, 24);
        sparseIntArray.put(oqi.c, 25);
        sparseIntArray.put(oqi.A1, 26);
        sparseIntArray.put(oqi.B1, 27);
        sparseIntArray.put(oqi.start_view, 28);
    }

    public mm7(rk5 rk5Var, View view, Object[] objArr) {
        super(rk5Var, view, 0, (LinearLayout) objArr[23], (DividerView) objArr[25], (TextView) objArr[24], (ConstraintLayout) objArr[6], (TextView) objArr[7], (TextView) objArr[8], (LinearLayout) objArr[21], (TextView) objArr[19], (Group) objArr[18], (TextView) objArr[20], (ExpandableTextView) objArr[12], (View) objArr[16], (TextView) objArr[17], (ConstraintLayout) objArr[3], (TextView) objArr[4], (TextView) objArr[5], (View) objArr[13], (TextView) objArr[14], (TextView) objArr[15], (RatioImageView) objArr[1], (RecyclerView) objArr[22], (TextView) objArr[28], (ConstraintLayout) objArr[9], (TextView) objArr[10], (TextView) objArr[11], (TextView) objArr[26], (TextView) objArr[27], (View) objArr[2]);
        this.d0 = -1L;
        LinearLayout linearLayout = (LinearLayout) objArr[0];
        this.c0 = linearLayout;
        linearLayout.setTag(null);
        o0(view);
        H();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean F() {
        synchronized (this) {
            try {
                return this.d0 != 0;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void H() {
        synchronized (this) {
            this.d0 = 1L;
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
            this.d0 = 0L;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean q0(int i, Object obj) {
        return true;
    }

    public mm7(rk5 rk5Var, View view) {
        this(rk5Var, view, ViewDataBinding.P(rk5Var, view, 29, e0, f0));
    }
}
