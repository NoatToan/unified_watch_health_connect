package defpackage;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.ViewDataBinding;
import androidx.lifecycle.LifecycleOwner;
import com.amap.api.maps.MapView;
import com.xiaomi.fitness.detail.view.SportShareLongView;
import com.xiaomi.fitness.share.amap.moments.MomentsView;
import com.xiaomi.fitness.share.view.DataShareProfileView;
import com.xiaomi.fitness.share.view.DataTitleShareVideo;
import com.xiaomi.fitness.share.view.ShareSportInfoView;
import com.xiaomi.fitness.share.view.SportTraceDataView;

/* JADX INFO: loaded from: classes10.dex */
public class iqp extends hqp {
    public static final ViewDataBinding.i S;
    public static final SparseIntArray T;
    public long R;

    static {
        ViewDataBinding.i iVar = new ViewDataBinding.i(17);
        S = iVar;
        iVar.a(1, new String[]{"trail_sport_trace_edit_panel_tab_layout"}, new int[]{6}, new int[]{ivi.B2});
        iVar.a(2, new String[]{"trail_sport_record_share_edit_detail_dialog_view", "trail_sport_record_share_switch_map_dialog_view", "trail_sport_record_share_switch_music_dialog_view"}, new int[]{3, 4, 5}, new int[]{ivi.q2, ivi.v2, ivi.w2});
        SparseIntArray sparseIntArray = new SparseIntArray();
        T = sparseIntArray;
        sparseIntArray.put(bsi.W3, 7);
        sparseIntArray.put(bsi.X4, 8);
        sparseIntArray.put(bsi.H7, 9);
        sparseIntArray.put(bsi.a5, 10);
        sparseIntArray.put(bsi.n6, 11);
        sparseIntArray.put(bsi.t4, 12);
        sparseIntArray.put(bsi.K6, 13);
        sparseIntArray.put(bsi.a7, 14);
        sparseIntArray.put(bsi.W4, 15);
        sparseIntArray.put(bsi.ka, 16);
    }

    public iqp(rk5 rk5Var, View view, Object[] objArr) {
        super(rk5Var, view, 4, (pqp) objArr[3], (ConstraintLayout) objArr[1], (ConstraintLayout) objArr[2], (MapView) objArr[7], (MomentsView) objArr[12], (ImageView) objArr[15], (ImageView) objArr[8], (DataShareProfileView) objArr[10], (ConstraintLayout) objArr[0], (ShareSportInfoView) objArr[11], (SportShareLongView) objArr[14], (SportTraceDataView) objArr[13], (rqp) objArr[4], (tqp) objArr[5], (zqp) objArr[6], (DataTitleShareVideo) objArr[9], (LinearLayout) objArr[16]);
        this.R = -1L;
        k0(this.A);
        this.B.setTag(null);
        this.C.setTag(null);
        this.I.setTag(null);
        k0(this.M);
        k0(this.N);
        k0(this.O);
        o0(view);
        H();
    }

    public final boolean A0(pqp pqpVar, int i) {
        if (i != qv1.f31871a) {
            return false;
        }
        synchronized (this) {
            this.R |= 8;
        }
        return true;
    }

    public final boolean B0(rqp rqpVar, int i) {
        if (i != qv1.f31871a) {
            return false;
        }
        synchronized (this) {
            this.R |= 1;
        }
        return true;
    }

    public final boolean C0(tqp tqpVar, int i) {
        if (i != qv1.f31871a) {
            return false;
        }
        synchronized (this) {
            this.R |= 2;
        }
        return true;
    }

    public final boolean D0(zqp zqpVar, int i) {
        if (i != qv1.f31871a) {
            return false;
        }
        synchronized (this) {
            this.R |= 4;
        }
        return true;
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean F() {
        synchronized (this) {
            try {
                if (this.R != 0) {
                    return true;
                }
                return this.A.F() || this.M.F() || this.N.F() || this.O.F();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void H() {
        synchronized (this) {
            this.R = 16L;
        }
        this.A.H();
        this.M.H();
        this.N.H();
        this.O.H();
        e0();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean W(int i, Object obj, int i2) {
        if (i == 0) {
            return B0((rqp) obj, i2);
        }
        if (i == 1) {
            return C0((tqp) obj, i2);
        }
        if (i == 2) {
            return D0((zqp) obj, i2);
        }
        if (i != 3) {
            return false;
        }
        return A0((pqp) obj, i2);
    }

    @Override // androidx.databinding.ViewDataBinding
    public void l0(LifecycleOwner lifecycleOwner) {
        super.l0(lifecycleOwner);
        this.A.l0(lifecycleOwner);
        this.M.l0(lifecycleOwner);
        this.N.l0(lifecycleOwner);
        this.O.l0(lifecycleOwner);
    }

    @Override // androidx.databinding.ViewDataBinding
    public void o() {
        synchronized (this) {
            this.R = 0L;
        }
        ViewDataBinding.r(this.A);
        ViewDataBinding.r(this.M);
        ViewDataBinding.r(this.N);
        ViewDataBinding.r(this.O);
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean q0(int i, Object obj) {
        return true;
    }

    public iqp(rk5 rk5Var, View view) {
        this(rk5Var, view, ViewDataBinding.P(rk5Var, view, 17, S, T));
    }
}
