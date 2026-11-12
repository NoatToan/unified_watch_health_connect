package defpackage;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.core.widget.NestedScrollView;
import androidx.databinding.ViewDataBinding;
import com.mi.health.data.sportmodel.view.SportPathMapView;
import com.xiaomi.fitness.detail.view.FixMapDragLayout;
import com.xiaomi.fitness.detail.view.SportRecordBasicInfoView;

/* JADX INFO: loaded from: classes10.dex */
public class b5a extends a5a {
    public static final ViewDataBinding.i J = null;
    public static final SparseIntArray K;
    public final NestedScrollView H;
    public long I;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        K = sparseIntArray;
        sparseIntArray.put(bsi.N, 1);
        sparseIntArray.put(bsi.c2, 2);
        sparseIntArray.put(bsi.D6, 3);
        sparseIntArray.put(bsi.h5, 4);
        sparseIntArray.put(bsi.E6, 5);
        sparseIntArray.put(bsi.S, 6);
        sparseIntArray.put(bsi.J6, 7);
    }

    public b5a(rk5 rk5Var, View view, Object[] objArr) {
        super(rk5Var, view, 0, (ImageView) objArr[1], (FrameLayout) objArr[6], (FixMapDragLayout) objArr[2], (LinearLayout) objArr[4], (SportPathMapView) objArr[3], (SportRecordBasicInfoView) objArr[5], (TextView) objArr[7]);
        this.I = -1L;
        NestedScrollView nestedScrollView = (NestedScrollView) objArr[0];
        this.H = nestedScrollView;
        nestedScrollView.setTag(null);
        o0(view);
        H();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean F() {
        synchronized (this) {
            try {
                return this.I != 0;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void H() {
        synchronized (this) {
            this.I = 1L;
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
            this.I = 0L;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean q0(int i, Object obj) {
        return true;
    }

    public b5a(rk5 rk5Var, View view) {
        this(rk5Var, view, ViewDataBinding.P(rk5Var, view, 8, J, K));
    }
}
