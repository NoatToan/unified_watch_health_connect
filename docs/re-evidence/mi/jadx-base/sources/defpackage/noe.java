package defpackage;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.LinearLayout;
import androidx.databinding.ViewDataBinding;
import com.xiaomi.fitness.sport.bean.SportingItemData;
import com.xiaomi.fitness.sport.view.lockscreen.ui.ValueIconUnitView;
import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public class noe extends moe {
    public static final ViewDataBinding.i M = null;
    public static final SparseIntArray N = null;
    public final LinearLayout K;
    public long L;

    public noe(rk5 rk5Var, View view, Object[] objArr) {
        super(rk5Var, view, 0, null, (ValueIconUnitView) objArr[1], (ValueIconUnitView) objArr[2], (ValueIconUnitView) objArr[3], (ValueIconUnitView) objArr[4], (ValueIconUnitView) objArr[5], (ValueIconUnitView) objArr[6], null, null);
        this.L = -1L;
        this.B.setTag(null);
        this.C.setTag(null);
        this.D.setTag(null);
        this.E.setTag(null);
        this.F.setTag(null);
        this.G.setTag(null);
        LinearLayout linearLayout = (LinearLayout) objArr[0];
        this.K = linearLayout;
        linearLayout.setTag(null);
        o0(view);
        H();
    }

    @Override // defpackage.moe
    public void A0(List<SportingItemData> list) {
        this.J = list;
        synchronized (this) {
            this.L |= 1;
        }
        notifyPropertyChanged(nv1.i);
        super.e0();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean F() {
        synchronized (this) {
            try {
                return this.L != 0;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void H() {
        synchronized (this) {
            this.L = 2L;
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
            j = this.L;
            this.L = 0L;
        }
        List<SportingItemData> list = this.J;
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
            this.B.setVisibility(i3);
            this.C.setVisibility(i2);
            this.D.setVisibility(i6);
            this.E.setVisibility(i5);
            this.F.setVisibility(i);
            this.G.setVisibility(i4);
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean q0(int i, Object obj) {
        if (nv1.i != i) {
            return false;
        }
        A0((List) obj);
        return true;
    }

    public noe(rk5 rk5Var, View view) {
        this(rk5Var, view, ViewDataBinding.P(rk5Var, view, 7, M, N));
    }
}
