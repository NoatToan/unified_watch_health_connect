package defpackage;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;
import com.google.android.material.tabs.TabLayout;
import com.mi.health.data.sportmodel.view.SportPathMapView;
import com.xiaomi.fitness.detail.view.FixMapDragLayout;
import com.xiaomi.fitness.detail.view.MapScrollView;
import com.xiaomi.fitness.detail.view.SportRecordBasicInfoView;
import com.xiaomi.fitness.detail.view.SportShareBottomView;
import com.xiaomi.fitness.detail.view.SportShareLongView;
import com.xiaomi.fitness.share.view.ShareLogoContainer;

/* JADX INFO: loaded from: classes10.dex */
public class bha extends aha {
    public static final ViewDataBinding.i f0 = null;
    public static final SparseIntArray g0;
    public final ConstraintLayout d0;
    public long e0;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        g0 = sparseIntArray;
        sparseIntArray.put(bsi.m6, 1);
        sparseIntArray.put(bsi.j6, 2);
        sparseIntArray.put(bsi.c2, 3);
        sparseIntArray.put(bsi.D6, 4);
        sparseIntArray.put(bsi.L4, 5);
        sparseIntArray.put(bsi.Y6, 6);
        sparseIntArray.put(bsi.W6, 7);
        sparseIntArray.put(bsi.b8, 8);
        sparseIntArray.put(bsi.c8, 9);
        sparseIntArray.put(bsi.x, 10);
        sparseIntArray.put(bsi.U7, 11);
        sparseIntArray.put(bsi.o2, 12);
        sparseIntArray.put(bsi.e8, 13);
        sparseIntArray.put(bsi.I0, 14);
        sparseIntArray.put(bsi.X3, 15);
        sparseIntArray.put(bsi.Q4, 16);
        sparseIntArray.put(bsi.c4, 17);
        sparseIntArray.put(bsi.h5, 18);
        sparseIntArray.put(bsi.E6, 19);
        sparseIntArray.put(bsi.l5, 20);
        sparseIntArray.put(bsi.T3, 21);
        sparseIntArray.put(bsi.ba, 22);
        sparseIntArray.put(bsi.J6, 23);
        sparseIntArray.put(bsi.t2, 24);
        sparseIntArray.put(bsi.u2, 25);
        sparseIntArray.put(bsi.y2, 26);
        sparseIntArray.put(bsi.x2, 27);
        sparseIntArray.put(bsi.w2, 28);
        sparseIntArray.put(bsi.a7, 29);
    }

    public bha(rk5 rk5Var, View view, Object[] objArr) {
        super(rk5Var, view, 0, (View) objArr[10], (View) objArr[14], (FixMapDragLayout) objArr[3], (AppCompatImageView) objArr[12], (ImageView) objArr[24], (ImageView) objArr[25], (ImageView) objArr[28], (ImageView) objArr[27], (ImageView) objArr[26], (TabLayout) objArr[21], (MapScrollView) objArr[15], (View) objArr[17], (ConstraintLayout) objArr[5], (ConstraintLayout) objArr[16], (LinearLayout) objArr[18], (RecyclerView) objArr[20], (SportShareBottomView) objArr[2], (ShareLogoContainer) objArr[1], (AppCompatImageView) objArr[7], (SportPathMapView) objArr[4], (SportRecordBasicInfoView) objArr[19], (AppCompatImageView) objArr[6], (SportShareLongView) objArr[29], (TextView) objArr[23], (LinearLayout) objArr[11], (AppCompatTextView) objArr[8], (AppCompatTextView) objArr[9], (TextView) objArr[13], (ViewPager2) objArr[22]);
        this.e0 = -1L;
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[0];
        this.d0 = constraintLayout;
        constraintLayout.setTag(null);
        o0(view);
        H();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean F() {
        synchronized (this) {
            try {
                return this.e0 != 0;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void H() {
        synchronized (this) {
            this.e0 = 1L;
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
            this.e0 = 0L;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean q0(int i, Object obj) {
        return true;
    }

    public bha(rk5 rk5Var, View view) {
        this(rk5Var, view, ViewDataBinding.P(rk5Var, view, 30, f0, g0));
    }
}
