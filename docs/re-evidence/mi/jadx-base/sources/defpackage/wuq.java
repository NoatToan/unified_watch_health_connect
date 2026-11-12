package defpackage;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.ViewDataBinding;
import com.xiaomi.fitness.sport.bean.LocalSportBean;

/* JADX INFO: loaded from: classes10.dex */
public class wuq extends vuq {
    public static final ViewDataBinding.i G = null;
    public static final SparseIntArray H;
    public final ConstraintLayout E;
    public long F;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        H = sparseIntArray;
        sparseIntArray.put(xri.y2, 3);
    }

    public wuq(rk5 rk5Var, View view, Object[] objArr) {
        super(rk5Var, view, 0, (TextView) objArr[2], (ImageView) objArr[3], (TextView) objArr[1]);
        this.F = -1L;
        this.A.setTag(null);
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[0];
        this.E = constraintLayout;
        constraintLayout.setTag(null);
        this.C.setTag(null);
        o0(view);
        H();
    }

    @Override // defpackage.vuq
    public void C0(LocalSportBean localSportBean) {
        this.D = localSportBean;
        synchronized (this) {
            this.F |= 1;
        }
        notifyPropertyChanged(nv1.c);
        super.e0();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean F() {
        synchronized (this) {
            try {
                return this.F != 0;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void H() {
        synchronized (this) {
            this.F = 2L;
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
        String localTitle;
        String localSource;
        synchronized (this) {
            j = this.F;
            this.F = 0L;
        }
        LocalSportBean localSportBean = this.D;
        long j2 = j & 3;
        if (j2 == 0 || localSportBean == null) {
            localTitle = null;
            localSource = null;
        } else {
            localTitle = localSportBean.getLocalTitle();
            localSource = localSportBean.getLocalSource();
        }
        if (j2 != 0) {
            r8p.b(this.A, localSource);
            r8p.b(this.C, localTitle);
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean q0(int i, Object obj) {
        if (nv1.c != i) {
            return false;
        }
        C0((LocalSportBean) obj);
        return true;
    }

    public wuq(rk5 rk5Var, View view) {
        this(rk5Var, view, ViewDataBinding.P(rk5Var, view, 4, G, H));
    }
}
