package defpackage;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.LinearLayout;
import androidx.databinding.ViewDataBinding;
import com.xiaomi.fitness.sport_eco.bean.SportingItemData;
import com.xiaomi.fitness.sport_eco.view.lockscreen.ui.ValueIconUnitView;
import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public class xu7 extends wu7 {
    public static final ViewDataBinding.i J = null;
    public static final SparseIntArray K = null;
    public final LinearLayout H;
    public long I;

    public xu7(rk5 rk5Var, View view, Object[] objArr) {
        super(rk5Var, view, 0, (ValueIconUnitView) objArr[1], (ValueIconUnitView) objArr[2], (ValueIconUnitView) objArr[3], (ValueIconUnitView) objArr[4], (ValueIconUnitView) objArr[5], (ValueIconUnitView) objArr[6]);
        this.I = -1L;
        this.A.setTag(null);
        this.B.setTag(null);
        this.C.setTag(null);
        this.D.setTag(null);
        this.E.setTag(null);
        this.F.setTag(null);
        LinearLayout linearLayout = (LinearLayout) objArr[0];
        this.H = linearLayout;
        linearLayout.setTag(null);
        o0(view);
        H();
    }

    @Override // defpackage.wu7
    public void A0(List<SportingItemData> list) {
        this.G = list;
        synchronized (this) {
            this.I |= 1;
        }
        notifyPropertyChanged(pv1.g);
        super.e0();
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
            this.I = 2L;
        }
        e0();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean W(int i, Object obj, int i2) {
        return false;
    }

    @Override // androidx.databinding.ViewDataBinding
    public void o() {
        long j;
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        SportingItemData sportingItemData;
        SportingItemData sportingItemData2;
        SportingItemData sportingItemData3;
        SportingItemData sportingItemData4;
        SportingItemData sportingItemData5;
        SportingItemData sportingItemData6;
        synchronized (this) {
            j = this.I;
            this.I = 0L;
        }
        List<SportingItemData> list = this.G;
        long j2 = j & 3;
        if (j2 != 0) {
            if (list != null) {
                sportingItemData = (SportingItemData) ViewDataBinding.B(list, 1);
                sportingItemData3 = (SportingItemData) ViewDataBinding.B(list, 5);
                sportingItemData4 = (SportingItemData) ViewDataBinding.B(list, 3);
                sportingItemData5 = (SportingItemData) ViewDataBinding.B(list, 0);
                sportingItemData6 = (SportingItemData) ViewDataBinding.B(list, 2);
                sportingItemData2 = (SportingItemData) ViewDataBinding.B(list, 4);
            } else {
                sportingItemData = null;
                sportingItemData2 = null;
                sportingItemData3 = null;
                sportingItemData4 = null;
                sportingItemData5 = null;
                sportingItemData6 = null;
            }
            boolean z = sportingItemData == null;
            boolean z2 = sportingItemData3 == null;
            boolean z3 = sportingItemData4 == null;
            boolean z4 = sportingItemData5 == null;
            boolean z5 = sportingItemData6 == null;
            boolean z6 = sportingItemData2 == null;
            if (j2 != 0) {
                j |= z ? 2048L : 1024L;
            }
            if ((j & 3) != 0) {
                j |= z2 ? 128L : 64L;
            }
            if ((j & 3) != 0) {
                j |= z3 ? 512L : 256L;
            }
            if ((j & 3) != 0) {
                j |= z4 ? 8L : 4L;
            }
            if ((j & 3) != 0) {
                j |= z5 ? 32L : 16L;
            }
            if ((j & 3) != 0) {
                j |= z6 ? 8192L : 4096L;
            }
            i2 = z ? 8 : 0;
            int i7 = z2 ? 8 : 0;
            i5 = z3 ? 8 : 0;
            int i8 = z4 ? 8 : 0;
            i6 = z5 ? 8 : 0;
            i = z6 ? 8 : 0;
            i4 = i7;
            i3 = i8;
        } else {
            i = 0;
            i2 = 0;
            i3 = 0;
            i4 = 0;
            i5 = 0;
            i6 = 0;
        }
        if ((j & 3) != 0) {
            this.A.setVisibility(i3);
            this.B.setVisibility(i2);
            this.C.setVisibility(i6);
            this.D.setVisibility(i5);
            this.E.setVisibility(i);
            this.F.setVisibility(i4);
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean q0(int i, Object obj) {
        if (pv1.g != i) {
            return false;
        }
        A0((List) obj);
        return true;
    }

    public xu7(rk5 rk5Var, View view) {
        this(rk5Var, view, ViewDataBinding.P(rk5Var, view, 7, J, K));
    }
}
