package defpackage;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.ViewDataBinding;
import com.xiaomi.fitness.sport.model.CommonSportModel;
import com.xiaomi.fitness.sport.utils.StringUtil;
import java.util.Map;

/* JADX INFO: loaded from: classes10.dex */
public class auq extends ztq {
    public static final ViewDataBinding.i G = null;
    public static final SparseIntArray H = null;
    public final ConstraintLayout D;
    public final TextView E;
    public long F;

    public auq(rk5 rk5Var, View view, Object[] objArr) {
        super(rk5Var, view, 0, (TextView) objArr[2], (ProgressBar) objArr[1]);
        this.F = -1L;
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[0];
        this.D = constraintLayout;
        constraintLayout.setTag(null);
        TextView textView = (TextView) objArr[3];
        this.E = textView;
        textView.setTag(null);
        this.A.setTag(null);
        this.B.setTag(null);
        o0(view);
        H();
    }

    @Override // defpackage.ztq
    public void A0(Map<CommonSportModel.SportTitle, String> map) {
        this.C = map;
        synchronized (this) {
            this.F |= 1;
        }
        notifyPropertyChanged(nv1.f28392k);
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
        boolean zIsNotBlank;
        String str;
        String str2;
        String str3;
        synchronized (this) {
            j = this.F;
            this.F = 0L;
        }
        Map<CommonSportModel.SportTitle, String> map = this.C;
        long j2 = j & 3;
        int iH0 = 0;
        if (j2 != 0) {
            if (map != null) {
                str2 = map.get(CommonSportModel.SportTitle.progressDetail);
                str3 = map.get(CommonSportModel.SportTitle.progressPercentage);
                str = map.get(CommonSportModel.SportTitle.progressValue);
            } else {
                str = null;
                str2 = null;
                str3 = null;
            }
            zIsNotBlank = StringUtil.isNotBlank(str);
            if (j2 != 0) {
                j = zIsNotBlank ? j | 8 : j | 4;
            }
        } else {
            zIsNotBlank = false;
            str = null;
            str2 = null;
            str3 = null;
        }
        Integer numValueOf = (j & 8) != 0 ? Integer.valueOf(str) : null;
        long j3 = j & 3;
        if (j3 != 0) {
            iH0 = ViewDataBinding.h0(Integer.valueOf(zIsNotBlank ? numValueOf.intValue() : 0));
        }
        if (j3 != 0) {
            r8p.b(this.E, str3);
            r8p.b(this.A, str2);
            this.B.setProgress(iH0);
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean q0(int i, Object obj) {
        if (nv1.f28392k != i) {
            return false;
        }
        A0((Map) obj);
        return true;
    }

    public auq(rk5 rk5Var, View view) {
        this(rk5Var, view, ViewDataBinding.P(rk5Var, view, 4, G, H));
    }
}
