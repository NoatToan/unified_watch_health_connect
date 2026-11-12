package defpackage;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import com.mi.health.sport.SportLaunchMapView;
import com.xiaomi.fitness.sport.view.widget.GpsSignalView;

/* JADX INFO: loaded from: classes10.dex */
public class wl0 extends vl0 {
    public static final ViewDataBinding.i W = null;
    public static final SparseIntArray X;
    public final ScrollView U;
    public long V;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        X = sparseIntArray;
        sparseIntArray.put(xri.o0, 1);
        sparseIntArray.put(xri.J7, 2);
        sparseIntArray.put(xri.p7, 3);
        sparseIntArray.put(xri.n8, 4);
        sparseIntArray.put(xri.f8, 5);
        sparseIntArray.put(xri.p2, 6);
        sparseIntArray.put(xri.A8, 7);
        sparseIntArray.put(xri.B8, 8);
        sparseIntArray.put(xri.C, 9);
        sparseIntArray.put(xri.B, 10);
        sparseIntArray.put(xri.b3, 11);
        sparseIntArray.put(xri.a3, 12);
        sparseIntArray.put(xri.E2, 13);
        sparseIntArray.put(xri.l4, 14);
        sparseIntArray.put(xri.m0, 15);
        sparseIntArray.put(xri.X1, 16);
        sparseIntArray.put(xri.t0, 17);
        sparseIntArray.put(xri.d, 18);
        sparseIntArray.put(xri.M6, 19);
        sparseIntArray.put(xri.x, 20);
    }

    public wl0(rk5 rk5Var, View view, Object[] objArr) {
        super(rk5Var, view, 0, (TextView) objArr[18], (RecyclerView) objArr[20], (ConstraintLayout) objArr[10], (ConstraintLayout) objArr[9], (RecyclerView) objArr[15], (ConstraintLayout) objArr[1], (RelativeLayout) objArr[17], (GpsSignalView) objArr[16], (TextView) objArr[6], (AppCompatImageView) objArr[13], (SportLaunchMapView) objArr[12], (CardView) objArr[11], (AppCompatTextView) objArr[14], (ImageView) objArr[19], (TextView) objArr[3], (ConstraintLayout) objArr[2], (TextView) objArr[5], (TextView) objArr[4], (TextView) objArr[7], (ImageView) objArr[8]);
        this.V = -1L;
        ScrollView scrollView = (ScrollView) objArr[0];
        this.U = scrollView;
        scrollView.setTag(null);
        o0(view);
        H();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean F() {
        synchronized (this) {
            try {
                return this.V != 0;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void H() {
        synchronized (this) {
            this.V = 1L;
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
            this.V = 0L;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean q0(int i, Object obj) {
        return true;
    }

    public wl0(rk5 rk5Var, View view) {
        this(rk5Var, view, ViewDataBinding.P(rk5Var, view, 21, W, X));
    }
}
