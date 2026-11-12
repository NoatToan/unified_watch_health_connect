package defpackage;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.ViewDataBinding;
import com.xiaomi.fitness.electronic.scale.widget.AnalysisDataDesView;
import com.xiaomi.fitness.electronic.scale.widget.AnalysisDataView;
import com.xiaomi.fitness.electronic.scale.widget.FatAnalysisBodyView;

/* JADX INFO: loaded from: classes8.dex */
public class o68 extends n68 {
    public static final ViewDataBinding.i T = null;
    public static final SparseIntArray U;
    public final ConstraintLayout R;
    public long S;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        U = sparseIntArray;
        sparseIntArray.put(bri.I5, 1);
        sparseIntArray.put(bri.g2, 2);
        sparseIntArray.put(bri.o1, 3);
        sparseIntArray.put(bri.V4, 4);
        sparseIntArray.put(bri.h2, 5);
        sparseIntArray.put(bri.p1, 6);
        sparseIntArray.put(bri.h5, 7);
        sparseIntArray.put(bri.e2, 8);
        sparseIntArray.put(bri.l1, 9);
        sparseIntArray.put(bri.P4, 10);
        sparseIntArray.put(bri.E6, 11);
        sparseIntArray.put(bri.K6, 12);
        sparseIntArray.put(bri.M6, 13);
        sparseIntArray.put(bri.D6, 14);
        sparseIntArray.put(bri.J6, 15);
        sparseIntArray.put(bri.o6, 16);
        sparseIntArray.put(bri.l6, 17);
    }

    public o68(rk5 rk5Var, View view, Object[] objArr) {
        super(rk5Var, view, 0, (ImageView) objArr[9], (ImageView) objArr[3], (ImageView) objArr[6], (LinearLayout) objArr[8], (LinearLayout) objArr[2], (LinearLayout) objArr[5], (TextView) objArr[10], (TextView) objArr[4], (TextView) objArr[7], (TextView) objArr[1], (AnalysisDataDesView) objArr[17], (FatAnalysisBodyView) objArr[16], (AnalysisDataView) objArr[14], (AnalysisDataView) objArr[11], (AnalysisDataView) objArr[15], (AnalysisDataView) objArr[12], (AnalysisDataView) objArr[13]);
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

    public o68(rk5 rk5Var, View view) {
        this(rk5Var, view, ViewDataBinding.P(rk5Var, view, 18, T, U));
    }
}
