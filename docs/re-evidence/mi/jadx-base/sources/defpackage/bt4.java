package defpackage;

import android.util.SparseIntArray;
import android.view.SurfaceView;
import android.view.View;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.ViewDataBinding;
import com.mi.health.course.export.data.CourseAllInfo;
import com.xiaomi.fitness.widget.expandable.ExpandableTextView;
import com.xiaomi.fitness.widget.view.RatioImageView;

/* JADX INFO: loaded from: classes5.dex */
public class bt4 extends at4 {
    public static final ViewDataBinding.i Z = null;
    public static final SparseIntArray a0;
    public final ConstraintLayout X;
    public long Y;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        a0 = sparseIntArray;
        sparseIntArray.put(oqi.T0, 1);
        sparseIntArray.put(oqi.p, 2);
        sparseIntArray.put(oqi.S0, 3);
        sparseIntArray.put(oqi.l2, 4);
        sparseIntArray.put(oqi.r0, 5);
        sparseIntArray.put(oqi.q0, 6);
        sparseIntArray.put(oqi.b2, 7);
        sparseIntArray.put(oqi.O1, 8);
        sparseIntArray.put(oqi.L1, 9);
        sparseIntArray.put(oqi.R0, 10);
        sparseIntArray.put(oqi.M1, 11);
        sparseIntArray.put(oqi.H1, 12);
        sparseIntArray.put(oqi.V, 13);
        sparseIntArray.put(oqi.W, 14);
        sparseIntArray.put(oqi.X, 15);
        sparseIntArray.put(oqi.y, 16);
        sparseIntArray.put(oqi.z, 17);
        sparseIntArray.put(oqi.A, 18);
        sparseIntArray.put(oqi.v1, 19);
        sparseIntArray.put(oqi.w1, 20);
        sparseIntArray.put(oqi.x1, 21);
        sparseIntArray.put(oqi.R, 22);
    }

    public bt4(rk5 rk5Var, View view, Object[] objArr) {
        super(rk5Var, view, 0, (CardView) objArr[2], (ConstraintLayout) objArr[16], (TextView) objArr[17], (TextView) objArr[18], (ExpandableTextView) objArr[22], (ConstraintLayout) objArr[13], (TextView) objArr[14], (TextView) objArr[15], (ImageView) objArr[6], (ImageView) objArr[5], (ProgressBar) objArr[10], (SurfaceView) objArr[3], (RatioImageView) objArr[1], (ConstraintLayout) objArr[19], (TextView) objArr[20], (TextView) objArr[21], (ConstraintLayout) objArr[12], (TextView) objArr[9], (TextView) objArr[11], (TextView) objArr[8], (TextView) objArr[7], (View) objArr[4]);
        this.Y = -1L;
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[0];
        this.X = constraintLayout;
        constraintLayout.setTag(null);
        o0(view);
        H();
    }

    public void A0(CourseAllInfo courseAllInfo) {
        this.W = courseAllInfo;
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean F() {
        synchronized (this) {
            try {
                return this.Y != 0;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void H() {
        synchronized (this) {
            this.Y = 2L;
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
            this.Y = 0L;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean q0(int i, Object obj) {
        if (ew1.f17122b != i) {
            return false;
        }
        A0((CourseAllInfo) obj);
        return true;
    }

    public bt4(rk5 rk5Var, View view) {
        this(rk5Var, view, ViewDataBinding.P(rk5Var, view, 23, Z, a0));
    }
}
