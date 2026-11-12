package defpackage;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.ViewDataBinding;
import androidx.viewpager2.widget.ViewPager2;
import com.xiaomi.fitness.medal.widget.CustomCustomProgressBar;
import com.xiaomi.fitness.widget.SlidableScrollView;

/* JADX INFO: loaded from: classes9.dex */
public class ybf extends wbf {
    public static final ViewDataBinding.i Z = null;
    public static final SparseIntArray a0;
    public final ConstraintLayout X;
    public long Y;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        a0 = sparseIntArray;
        sparseIntArray.put(iri.c, 1);
        sparseIntArray.put(iri.P, 2);
        sparseIntArray.put(iri.l, 3);
        sparseIntArray.put(iri.o0, 4);
        sparseIntArray.put(iri.z0, 5);
        sparseIntArray.put(iri.f22020k, 6);
        sparseIntArray.put(iri.O, 7);
        sparseIntArray.put(iri.G, 8);
        sparseIntArray.put(iri.B, 9);
        sparseIntArray.put(iri.C, 10);
        sparseIntArray.put(iri.Y, 11);
        sparseIntArray.put(iri.Z, 12);
        sparseIntArray.put(iri.X, 13);
        sparseIntArray.put(iri.t, 14);
        sparseIntArray.put(iri.g, 15);
        sparseIntArray.put(iri.h0, 16);
        sparseIntArray.put(iri.i, 17);
        sparseIntArray.put(iri.g0, 18);
        sparseIntArray.put(iri.f22021r, 19);
        sparseIntArray.put(iri.q, 20);
        sparseIntArray.put(iri.S, 21);
        sparseIntArray.put(iri.T, 22);
        sparseIntArray.put(iri.U, 23);
    }

    public ybf(rk5 rk5Var, View view, Object[] objArr) {
        super(rk5Var, view, 0, (ImageView) objArr[1], (LinearLayout) objArr[15], (TextView) objArr[17], (ViewPager2) objArr[6], (ConstraintLayout) objArr[3], (TextView) objArr[20], (TextView) objArr[19], (TextView) objArr[14], (TextView) objArr[10], (ConstraintLayout) objArr[8], (TextView) objArr[9], (AppCompatTextView) objArr[7], (AppCompatTextView) objArr[2], (RelativeLayout) objArr[21], (ImageView) objArr[22], (TextView) objArr[23], (CustomCustomProgressBar) objArr[13], (RelativeLayout) objArr[11], (ConstraintLayout) objArr[12], (LinearLayout) objArr[18], (TextView) objArr[16], (SlidableScrollView) objArr[4], (ConstraintLayout) objArr[5]);
        this.Y = -1L;
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[0];
        this.X = constraintLayout;
        constraintLayout.setTag(null);
        o0(view);
        H();
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
            this.Y = 1L;
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
        return true;
    }

    public ybf(rk5 rk5Var, View view) {
        this(rk5Var, view, ViewDataBinding.P(rk5Var, view, 24, Z, a0));
    }
}
