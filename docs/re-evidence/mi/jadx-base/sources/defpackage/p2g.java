package defpackage;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.ViewDataBinding;
import com.xiaomi.fitness.route.track.ext.Report;

/* JADX INFO: loaded from: classes8.dex */
public class p2g extends o2g {
    public static final ViewDataBinding.i R = null;
    public static final SparseIntArray S;
    public long Q;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        S = sparseIntArray;
        sparseIntArray.put(vri.X, 11);
        sparseIntArray.put(vri.T, 12);
        sparseIntArray.put(vri.Z, 13);
        sparseIntArray.put(vri.V, 14);
    }

    public p2g(rk5 rk5Var, View view, Object[] objArr) {
        super(rk5Var, view, 0, (ConstraintLayout) objArr[0], (TextView) objArr[5], (TextView) objArr[6], (ImageView) objArr[12], (TextView) objArr[9], (TextView) objArr[10], (ImageView) objArr[14], (TextView) objArr[3], (TextView) objArr[4], (ImageView) objArr[11], (TextView) objArr[7], (TextView) objArr[8], (ImageView) objArr[13], (TextView) objArr[2], (TextView) objArr[1]);
        this.Q = -1L;
        this.A.setTag(null);
        this.B.setTag(null);
        this.C.setTag(null);
        this.E.setTag(null);
        this.F.setTag(null);
        this.H.setTag(null);
        this.I.setTag(null);
        this.K.setTag(null);
        this.L.setTag(null);
        this.N.setTag(null);
        this.O.setTag(null);
        o0(view);
        H();
    }

    @Override // defpackage.o2g
    public void A0(Report report) {
        this.P = report;
        synchronized (this) {
            this.Q |= 1;
        }
        notifyPropertyChanged(mv1.f27241b);
        super.e0();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean F() {
        synchronized (this) {
            try {
                return this.Q != 0;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void H() {
        synchronized (this) {
            this.Q = 2L;
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
        String name;
        String increaseDes;
        String declineDes;
        String increase;
        String dis;
        String duration;
        String str;
        String durationDes;
        String decline;
        String disDes;
        synchronized (this) {
            j = this.Q;
            this.Q = 0L;
        }
        Report report = this.P;
        long j2 = j & 3;
        if (j2 == 0 || report == null) {
            name = null;
            increaseDes = null;
            declineDes = null;
            increase = null;
            dis = null;
            duration = null;
            str = null;
            durationDes = null;
            decline = null;
            disDes = null;
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
            r8p.b(this.B, dis);
            r8p.b(this.C, disDes);
            r8p.b(this.E, decline);
            r8p.b(this.F, declineDes);
            r8p.b(this.H, duration);
            r8p.b(this.I, durationDes);
            r8p.b(this.K, increase);
            r8p.b(this.L, increaseDes);
            r8p.b(this.N, str);
            r8p.b(this.O, name);
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean q0(int i, Object obj) {
        if (mv1.f27241b != i) {
            return false;
        }
        A0((Report) obj);
        return true;
    }

    public p2g(rk5 rk5Var, View view) {
        this(rk5Var, view, ViewDataBinding.P(rk5Var, view, 15, R, S));
    }
}
