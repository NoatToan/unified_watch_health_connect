package defpackage;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.widget.NestedScrollView;
import androidx.databinding.ViewDataBinding;
import androidx.lifecycle.LifecycleOwner;
import com.mi.health.sport.TrackMapView;
import com.mi.health.sport.TrackShareRoutineView;
import com.xiaomi.fitness.baseui.widget.SportDetailItemView;
import com.xiaomi.fitness.chart.mpchart.linechart.CustomLineChart;
import com.xiaomi.fitness.route.track.ext.Report;
import com.xiaomi.fitness.widget.view.DataTitleSimpleView;

/* JADX INFO: loaded from: classes8.dex */
public class e3g extends d3g {
    public static final ViewDataBinding.i k0;
    public static final SparseIntArray l0;
    public final ConstraintLayout i0;
    public long j0;

    static {
        ViewDataBinding.i iVar = new ViewDataBinding.i(34);
        k0 = iVar;
        iVar.a(0, new String[]{"mine_no_ele_layout", "mine_track_detail_progress"}, new int[]{12, 13}, new int[]{bvi.e, bvi.h});
        SparseIntArray sparseIntArray = new SparseIntArray();
        l0 = sparseIntArray;
        sparseIntArray.put(vri.a0, 14);
        sparseIntArray.put(vri.I, 15);
        sparseIntArray.put(vri.f37162r, 16);
        sparseIntArray.put(vri.N, 17);
        sparseIntArray.put(vri.W, 18);
        sparseIntArray.put(vri.S, 19);
        sparseIntArray.put(vri.Y, 20);
        sparseIntArray.put(vri.U, 21);
        sparseIntArray.put(vri.f, 22);
        sparseIntArray.put(vri.h, 23);
        sparseIntArray.put(vri.q, 24);
        sparseIntArray.put(vri.i, 25);
        sparseIntArray.put(vri.j, 26);
        sparseIntArray.put(vri.e, 27);
        sparseIntArray.put(vri.d, 28);
        sparseIntArray.put(vri.O, 29);
        sparseIntArray.put(vri.m, 30);
        sparseIntArray.put(vri.s, 31);
        sparseIntArray.put(vri.f37160b, 32);
        sparseIntArray.put(vri.B, 33);
    }

    public e3g(rk5 rk5Var, View view, Object[] objArr) {
        super(rk5Var, view, 2, (ImageView) objArr[32], (CustomLineChart) objArr[28], (FrameLayout) objArr[27], (LinearLayout) objArr[22], (DataTitleSimpleView) objArr[23], (SportDetailItemView) objArr[25], (SportDetailItemView) objArr[26], (TextView) objArr[11], (ImageView) objArr[30], (LinearLayout) objArr[24], (NestedScrollView) objArr[16], (ImageView) objArr[31], (o2g) objArr[12], (Button) objArr[33], (f3g) objArr[13], (TrackShareRoutineView) objArr[15], (ConstraintLayout) objArr[17], (TextView) objArr[29], (TextView) objArr[5], (TextView) objArr[6], (ImageView) objArr[19], (TextView) objArr[9], (TextView) objArr[10], (ImageView) objArr[21], (TextView) objArr[3], (TextView) objArr[4], (ImageView) objArr[18], (TextView) objArr[7], (TextView) objArr[8], (ImageView) objArr[20], (TextView) objArr[2], (TrackMapView) objArr[14], (TextView) objArr[1]);
        this.j0 = -1L;
        this.H.setTag(null);
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[0];
        this.i0 = constraintLayout;
        constraintLayout.setTag(null);
        k0(this.M);
        k0(this.O);
        this.S.setTag(null);
        this.T.setTag(null);
        this.V.setTag(null);
        this.W.setTag(null);
        this.Y.setTag(null);
        this.Z.setTag(null);
        this.b0.setTag(null);
        this.c0.setTag(null);
        this.e0.setTag(null);
        this.g0.setTag(null);
        o0(view);
        H();
    }

    @Override // defpackage.d3g
    public void A0(Report report) {
        this.h0 = report;
        synchronized (this) {
            this.j0 |= 4;
        }
        notifyPropertyChanged(mv1.f27241b);
        super.e0();
    }

    public final boolean B0(o2g o2gVar, int i) {
        if (i != mv1.f27240a) {
            return false;
        }
        synchronized (this) {
            this.j0 |= 1;
        }
        return true;
    }

    public final boolean C0(f3g f3gVar, int i) {
        if (i != mv1.f27240a) {
            return false;
        }
        synchronized (this) {
            this.j0 |= 2;
        }
        return true;
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean F() {
        synchronized (this) {
            try {
                if (this.j0 != 0) {
                    return true;
                }
                return this.M.F() || this.O.F();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void H() {
        synchronized (this) {
            this.j0 = 8L;
        }
        this.M.H();
        this.O.H();
        e0();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean W(int i, Object obj, int i2) {
        if (i == 0) {
            return B0((o2g) obj, i2);
        }
        if (i != 1) {
            return false;
        }
        return C0((f3g) obj, i2);
    }

    @Override // androidx.databinding.ViewDataBinding
    public void l0(LifecycleOwner lifecycleOwner) {
        super.l0(lifecycleOwner);
        this.M.l0(lifecycleOwner);
        this.O.l0(lifecycleOwner);
    }

    @Override // androidx.databinding.ViewDataBinding
    public void o() {
        long j;
        String name;
        String increaseDes;
        String declineDes;
        String dis;
        String duration;
        String str;
        String durationDes;
        String decline;
        String disDes;
        String increase;
        synchronized (this) {
            j = this.j0;
            this.j0 = 0L;
        }
        Report report = this.h0;
        long j2 = j & 12;
        if (j2 == 0 || report == null) {
            name = null;
            increaseDes = null;
            declineDes = null;
            dis = null;
            duration = null;
            str = null;
            durationDes = null;
            decline = null;
            disDes = null;
            increase = null;
        } else {
            name = report.getName();
            increaseDes = report.getIncreaseDes();
            declineDes = report.getDeclineDes();
            dis = report.getDis();
            duration = report.getDuration();
            str = report.getImport();
            durationDes = report.getDurationDes();
            decline = report.getDecline();
            disDes = report.getDisDes();
            increase = report.getIncrease();
        }
        if (j2 != 0) {
            r8p.b(this.H, dis);
            this.M.A0(report);
            r8p.b(this.S, dis);
            r8p.b(this.T, disDes);
            r8p.b(this.V, decline);
            r8p.b(this.W, declineDes);
            r8p.b(this.Y, duration);
            r8p.b(this.Z, durationDes);
            r8p.b(this.b0, increase);
            r8p.b(this.c0, increaseDes);
            r8p.b(this.e0, str);
            r8p.b(this.g0, name);
        }
        ViewDataBinding.r(this.M);
        ViewDataBinding.r(this.O);
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean q0(int i, Object obj) {
        if (mv1.f27241b != i) {
            return false;
        }
        A0((Report) obj);
        return true;
    }

    public e3g(rk5 rk5Var, View view) {
        this(rk5Var, view, ViewDataBinding.P(rk5Var, view, 34, k0, l0));
    }
}
