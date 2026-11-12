package defpackage;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.ViewDataBinding;
import com.mi.health.data.sportmodel.view.SportPathMapView;
import com.xiaomi.fitness.detail.view.FixMapDragLayout;
import com.xiaomi.fitness.detail.view.MapScrollView;
import com.xiaomi.fitness.detail.view.SportRecordBasicInfoView;
import com.xiaomi.fitness.detail.view.SportShareBottomView;
import com.xiaomi.fitness.detail.view.SportShareLongView;
import com.xiaomi.fitness.share.view.ShareLogoContainer;

/* JADX INFO: loaded from: classes10.dex */
public class gea extends fea {
    public static final ViewDataBinding.i g0 = null;
    public static final SparseIntArray h0;
    public final ConstraintLayout e0;
    public long f0;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        h0 = sparseIntArray;
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
        sparseIntArray.put(bsi.Y9, 11);
        sparseIntArray.put(bsi.U7, 12);
        sparseIntArray.put(bsi.o2, 13);
        sparseIntArray.put(bsi.e8, 14);
        sparseIntArray.put(bsi.B1, 15);
        sparseIntArray.put(bsi.C1, 16);
        sparseIntArray.put(bsi.D1, 17);
        sparseIntArray.put(bsi.X3, 18);
        sparseIntArray.put(bsi.Q4, 19);
        sparseIntArray.put(bsi.c4, 20);
        sparseIntArray.put(bsi.h5, 21);
        sparseIntArray.put(bsi.E6, 22);
        sparseIntArray.put(bsi.S, 23);
        sparseIntArray.put(bsi.J6, 24);
        sparseIntArray.put(bsi.t2, 25);
        sparseIntArray.put(bsi.u2, 26);
        sparseIntArray.put(bsi.y2, 27);
        sparseIntArray.put(bsi.x2, 28);
        sparseIntArray.put(bsi.w2, 29);
        sparseIntArray.put(bsi.a7, 30);
    }

    public gea(rk5 rk5Var, View view, Object[] objArr) {
        super(rk5Var, view, 0, (View) objArr[10], (FrameLayout) objArr[23], (LinearLayout) objArr[15], (AppCompatImageView) objArr[16], (TextView) objArr[17], (FixMapDragLayout) objArr[3], (AppCompatImageView) objArr[13], (ImageView) objArr[25], (ImageView) objArr[26], (ImageView) objArr[29], (ImageView) objArr[28], (ImageView) objArr[27], (MapScrollView) objArr[18], (View) objArr[20], (ConstraintLayout) objArr[5], (ConstraintLayout) objArr[19], (LinearLayout) objArr[21], (SportShareBottomView) objArr[2], (ShareLogoContainer) objArr[1], (AppCompatImageView) objArr[7], (SportPathMapView) objArr[4], (SportRecordBasicInfoView) objArr[22], (AppCompatImageView) objArr[6], (SportShareLongView) objArr[30], (TextView) objArr[24], (LinearLayout) objArr[12], (AppCompatTextView) objArr[8], (AppCompatTextView) objArr[9], (TextView) objArr[14], (View) objArr[11]);
        this.f0 = -1L;
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[0];
        this.e0 = constraintLayout;
        constraintLayout.setTag(null);
        o0(view);
        H();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean F() {
        synchronized (this) {
            try {
                return this.f0 != 0;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void H() {
        synchronized (this) {
            this.f0 = 1L;
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
            this.f0 = 0L;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean q0(int i, Object obj) {
        return true;
    }

    public gea(rk5 rk5Var, View view) {
        this(rk5Var, view, ViewDataBinding.P(rk5Var, view, 31, g0, h0));
    }
}
