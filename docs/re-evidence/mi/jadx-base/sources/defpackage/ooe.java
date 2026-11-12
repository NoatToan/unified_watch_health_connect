package defpackage;

import android.support.v4.media.session.PlaybackStateCompat;
import android.util.SparseIntArray;
import android.view.View;
import android.widget.LinearLayout;
import androidx.databinding.ViewDataBinding;
import com.xiaomi.fitness.sport.bean.SportingItemData;
import com.xiaomi.fitness.sport.view.lockscreen.ui.ValueIconUnitView;
import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public class ooe extends moe {
    public static final ViewDataBinding.i M = null;
    public static final SparseIntArray N = null;
    public final LinearLayout K;
    public long L;

    public ooe(rk5 rk5Var, View view, Object[] objArr) {
        super(rk5Var, view, 0, (LinearLayout) objArr[1], (ValueIconUnitView) objArr[2], (ValueIconUnitView) objArr[3], (ValueIconUnitView) objArr[5], (ValueIconUnitView) objArr[6], (ValueIconUnitView) objArr[8], (ValueIconUnitView) objArr[9], (LinearLayout) objArr[4], (LinearLayout) objArr[7]);
        this.L = -1L;
        this.A.setTag(null);
        this.B.setTag(null);
        this.C.setTag(null);
        this.D.setTag(null);
        this.E.setTag(null);
        this.F.setTag(null);
        this.G.setTag(null);
        LinearLayout linearLayout = (LinearLayout) objArr[0];
        this.K = linearLayout;
        linearLayout.setTag(null);
        this.H.setTag(null);
        this.I.setTag(null);
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
        SportingItemData sportingItemData;
        int i;
        boolean z;
        boolean z2;
        int i2;
        boolean z3;
        SportingItemData sportingItemData2;
        SportingItemData sportingItemData3;
        long j2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        SportingItemData sportingItemData4;
        SportingItemData sportingItemData5;
        SportingItemData sportingItemData6;
        SportingItemData sportingItemData7;
        synchronized (this) {
            j = this.L;
            this.L = 0L;
        }
        List<SportingItemData> list = this.J;
        long j3 = j & 3;
        if (j3 != 0) {
            if (list != null) {
                SportingItemData sportingItemData8 = (SportingItemData) ViewDataBinding.B(list, 3);
                sportingItemData6 = (SportingItemData) ViewDataBinding.B(list, 0);
                sportingItemData4 = (SportingItemData) ViewDataBinding.B(list, 4);
                sportingItemData7 = (SportingItemData) ViewDataBinding.B(list, 1);
                SportingItemData sportingItemData9 = (SportingItemData) ViewDataBinding.B(list, 5);
                sportingItemData5 = (SportingItemData) ViewDataBinding.B(list, 2);
                sportingItemData = sportingItemData9;
                sportingItemData2 = sportingItemData8;
            } else {
                sportingItemData = null;
                sportingItemData4 = null;
                sportingItemData5 = null;
                sportingItemData2 = null;
                sportingItemData6 = null;
                sportingItemData7 = null;
            }
            boolean z4 = sportingItemData2 == null;
            z3 = sportingItemData6 != null;
            boolean z5 = sportingItemData6 == null;
            boolean z6 = sportingItemData4 == null;
            z = sportingItemData4 != null;
            boolean z7 = sportingItemData7 == null;
            boolean z8 = sportingItemData == null;
            boolean z9 = sportingItemData5 == null;
            z2 = sportingItemData5 != null;
            if (j3 != 0) {
                j |= z4 ? PlaybackStateCompat.ACTION_SET_SHUFFLE_MODE : PlaybackStateCompat.ACTION_SET_CAPTIONING_ENABLED;
            }
            if ((j & 3) != 0) {
                j = z3 ? j | 2048 : j | 1024;
            }
            if ((j & 3) != 0) {
                j |= z5 ? 8L : 4L;
            }
            if ((j & 3) != 0) {
                j |= z6 ? PlaybackStateCompat.ACTION_PREPARE_FROM_MEDIA_ID : 16384L;
            }
            if ((j & 3) != 0) {
                j = z ? j | 8388608 : j | 4194304;
            }
            if ((j & 3) != 0) {
                j |= z7 ? 33554432L : 16777216L;
            }
            if ((j & 3) != 0) {
                j |= z8 ? 128L : 64L;
            }
            if ((j & 3) != 0) {
                j |= z9 ? PlaybackStateCompat.ACTION_PREPARE_FROM_URI : PlaybackStateCompat.ACTION_PREPARE_FROM_SEARCH;
            }
            if ((j & 3) != 0) {
                j = z2 ? j | 8192 : j | 4096;
            }
            i = z4 ? 8 : 0;
            i2 = z5 ? 8 : 0;
            int i10 = z6 ? 8 : 0;
            int i11 = z7 ? 8 : 0;
            i3 = i10;
            sportingItemData3 = sportingItemData7;
            i4 = i11;
            i5 = z8 ? 8 : 0;
            i6 = z9 ? 8 : 0;
            j2 = 4096;
        } else {
            sportingItemData = null;
            i = 0;
            z = false;
            z2 = false;
            i2 = 0;
            z3 = false;
            sportingItemData2 = null;
            sportingItemData3 = null;
            j2 = 4096;
            i3 = 0;
            i4 = 0;
            i5 = 0;
            i6 = 0;
        }
        boolean z10 = ((j & j2) == 0 || sportingItemData2 == null) ? false : true;
        boolean z11 = ((j & 4194304) == 0 || sportingItemData == null) ? false : true;
        boolean z12 = ((1024 & j) == 0 || sportingItemData3 == null) ? false : true;
        long j4 = j & 3;
        if (j4 != 0) {
            if (z3) {
                z12 = true;
            }
            if (z2) {
                z10 = true;
            }
            if (z) {
                z11 = true;
            }
            if (j4 != 0) {
                j |= z12 ? 32L : 16L;
            }
            if ((j & 3) != 0) {
                j |= z10 ? PlaybackStateCompat.ACTION_SET_SHUFFLE_MODE_ENABLED : PlaybackStateCompat.ACTION_SET_REPEAT_MODE;
            }
            if ((j & 3) != 0) {
                j |= z11 ? 512L : 256L;
            }
            i8 = z12 ? 0 : 8;
            i9 = z10 ? 0 : 8;
            i7 = z11 ? 0 : 8;
        } else {
            i7 = 0;
            i8 = 0;
            i9 = 0;
        }
        if ((j & 3) != 0) {
            this.A.setVisibility(i8);
            this.B.setVisibility(i2);
            this.C.setVisibility(i4);
            this.D.setVisibility(i6);
            this.E.setVisibility(i);
            this.F.setVisibility(i3);
            this.G.setVisibility(i5);
            this.H.setVisibility(i9);
            this.I.setVisibility(i7);
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

    public ooe(rk5 rk5Var, View view) {
        this(rk5Var, view, ViewDataBinding.P(rk5Var, view, 10, M, N));
    }
}
