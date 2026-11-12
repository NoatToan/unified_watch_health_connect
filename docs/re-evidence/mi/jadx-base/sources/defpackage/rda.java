package defpackage;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.ViewDataBinding;
import com.xiaomi.fitness.detail.view.MapScrollView;
import com.xiaomi.fitness.detail.view.SportEnvironmentalView;
import com.xiaomi.fitness.detail.view.SportRecordBasicInfoView;
import com.xiaomi.fitness.detail.view.SportShareBottomView;
import com.xiaomi.fitness.detail.view.SportShareLongView;
import com.xiaomi.fitness.detail.view.SportTargetView;
import com.xiaomi.fitness.share.view.ShareLogoContainer;

/* JADX INFO: loaded from: classes10.dex */
public class rda extends qda {
    public static final ViewDataBinding.i T = null;
    public static final SparseIntArray U;
    public final ConstraintLayout R;
    public long S;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        U = sparseIntArray;
        sparseIntArray.put(bsi.m6, 1);
        sparseIntArray.put(bsi.j6, 2);
        sparseIntArray.put(bsi.X3, 3);
        sparseIntArray.put(bsi.Q4, 4);
        sparseIntArray.put(bsi.c4, 5);
        sparseIntArray.put(bsi.g9, 6);
        sparseIntArray.put(bsi.W8, 7);
        sparseIntArray.put(bsi.E6, 8);
        sparseIntArray.put(bsi.G6, 9);
        sparseIntArray.put(bsi.B6, 10);
        sparseIntArray.put(bsi.h5, 11);
        sparseIntArray.put(bsi.S, 12);
        sparseIntArray.put(bsi.J6, 13);
        sparseIntArray.put(bsi.t2, 14);
        sparseIntArray.put(bsi.u2, 15);
        sparseIntArray.put(bsi.y2, 16);
        sparseIntArray.put(bsi.F6, 17);
    }

    public rda(rk5 rk5Var, View view, Object[] objArr) {
        super(rk5Var, view, 0, (FrameLayout) objArr[12], (ImageView) objArr[14], (ImageView) objArr[15], (ImageView) objArr[16], (MapScrollView) objArr[3], (View) objArr[5], (LinearLayout) objArr[4], (LinearLayout) objArr[11], (SportShareBottomView) objArr[2], (ShareLogoContainer) objArr[1], (SportEnvironmentalView) objArr[10], (SportRecordBasicInfoView) objArr[8], (SportShareLongView) objArr[17], (SportTargetView) objArr[9], (TextView) objArr[13], (TextView) objArr[7], (TextView) objArr[6]);
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

    public rda(rk5 rk5Var, View view) {
        this(rk5Var, view, ViewDataBinding.P(rk5Var, view, 18, T, U));
    }
}
