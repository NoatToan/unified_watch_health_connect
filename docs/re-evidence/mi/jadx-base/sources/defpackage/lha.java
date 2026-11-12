package defpackage;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.core.widget.NestedScrollView;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;
import com.xiaomi.fitness.health.threetarget.model.ThreeTargetView;
import com.xiaomi.fitness.health.threetarget.view.TargetItemChartView;
import com.xiaomi.fitness.health.threetarget.view.VideoPreviewView;
import com.xiaomi.fitness.widget.view.DataTitleSimpleView;

/* JADX INFO: loaded from: classes9.dex */
public class lha extends kha {
    public static final ViewDataBinding.i T = null;
    public static final SparseIntArray U;
    public final LinearLayout R;
    public long S;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        U = sparseIntArray;
        sparseIntArray.put(eri.So, 1);
        sparseIntArray.put(eri.l5, 2);
        sparseIntArray.put(eri.Si, 3);
        sparseIntArray.put(eri.Ri, 4);
        sparseIntArray.put(eri.M9, 5);
        sparseIntArray.put(eri.ri, 6);
        sparseIntArray.put(eri.Ti, 7);
        sparseIntArray.put(eri.qd, 8);
        sparseIntArray.put(eri.I9, 9);
        sparseIntArray.put(eri.L9, 10);
        sparseIntArray.put(eri.J9, 11);
        sparseIntArray.put(eri.K9, 12);
        sparseIntArray.put(eri.rb, 13);
        sparseIntArray.put(eri.qb, 14);
        sparseIntArray.put(eri.pb, 15);
        sparseIntArray.put(eri.C8, 16);
        sparseIntArray.put(eri.B8, 17);
    }

    public lha(rk5 rk5Var, View view, Object[] objArr) {
        super(rk5Var, view, 0, (NestedScrollView) objArr[2], (AppCompatImageView) objArr[17], (TextView) objArr[16], (TargetItemChartView) objArr[9], (TargetItemChartView) objArr[11], (TargetItemChartView) objArr[12], (TargetItemChartView) objArr[10], (LinearLayout) objArr[5], (RecyclerView) objArr[15], (DataTitleSimpleView) objArr[14], (LinearLayout) objArr[13], (RecyclerView) objArr[8], (ImageView) objArr[6], (LinearLayout) objArr[4], (VideoPreviewView) objArr[3], (ThreeTargetView) objArr[7], (ViewPager2) objArr[1]);
        this.S = -1L;
        LinearLayout linearLayout = (LinearLayout) objArr[0];
        this.R = linearLayout;
        linearLayout.setTag(null);
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

    public lha(rk5 rk5Var, View view) {
        this(rk5Var, view, ViewDataBinding.P(rk5Var, view, 18, T, U));
    }
}
