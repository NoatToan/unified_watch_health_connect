package defpackage;

import android.util.SparseIntArray;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.ViewDataBinding;
import com.xiaomi.fitness.sport_eco.ftp.request.FtpModel;

/* JADX INFO: loaded from: classes10.dex */
public class lcb extends kcb {
    public static final ViewDataBinding.i E = null;
    public static final SparseIntArray F = null;
    public final ConstraintLayout C;
    public long D;

    public lcb(rk5 rk5Var, View view, Object[] objArr) {
        super(rk5Var, view, 0);
        this.D = -1L;
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[0];
        this.C = constraintLayout;
        constraintLayout.setTag(null);
        o0(view);
        H();
    }

    public void A0(FtpModel ftpModel) {
        this.A = ftpModel;
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean F() {
        synchronized (this) {
            try {
                return this.D != 0;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void H() {
        synchronized (this) {
            this.D = 4L;
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
        synchronized (this) {
            j = this.D;
            this.D = 0L;
        }
        View.OnClickListener onClickListener = this.B;
        if ((j & 5) != 0) {
            this.C.setOnClickListener(onClickListener);
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean q0(int i, Object obj) {
        if (pv1.c == i) {
            setClickListener((View.OnClickListener) obj);
        } else {
            if (pv1.e != i) {
                return false;
            }
            A0((FtpModel) obj);
        }
        return true;
    }

    @Override // defpackage.kcb
    public void setClickListener(View.OnClickListener onClickListener) {
        this.B = onClickListener;
        synchronized (this) {
            this.D |= 1;
        }
        notifyPropertyChanged(pv1.c);
        super.e0();
    }

    public lcb(rk5 rk5Var, View view) {
        this(rk5Var, view, ViewDataBinding.P(rk5Var, view, 1, E, F));
    }
}
