package defpackage;

import android.util.SparseIntArray;
import android.view.View;
import androidx.databinding.ViewDataBinding;
import com.xiaomi.fitness.userinfo.bean.UserIndicatorsInfo;
import com.xiaomi.fitness.userinfo.medicalid.baseui.UserInfoRightArrowSingleLineTextView;

/* JADX INFO: loaded from: classes10.dex */
public class okq extends nkq {
    public static final ViewDataBinding.i D = null;
    public static final SparseIntArray E = null;
    public final UserInfoRightArrowSingleLineTextView B;
    public long C;

    public okq(rk5 rk5Var, View view, Object[] objArr) {
        super(rk5Var, view, 0);
        this.C = -1L;
        UserInfoRightArrowSingleLineTextView userInfoRightArrowSingleLineTextView = (UserInfoRightArrowSingleLineTextView) objArr[0];
        this.B = userInfoRightArrowSingleLineTextView;
        userInfoRightArrowSingleLineTextView.setTag(null);
        o0(view);
        H();
    }

    public void A0(UserIndicatorsInfo userIndicatorsInfo) {
        this.A = userIndicatorsInfo;
        synchronized (this) {
            this.C |= 1;
        }
        notifyPropertyChanged(sv1.f34013b);
        super.e0();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean F() {
        synchronized (this) {
            try {
                return this.C != 0;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void H() {
        synchronized (this) {
            this.C = 2L;
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
        String indicators;
        String indicatorsValue;
        synchronized (this) {
            j = this.C;
            this.C = 0L;
        }
        UserIndicatorsInfo userIndicatorsInfo = this.A;
        long j2 = j & 3;
        if (j2 == 0 || userIndicatorsInfo == null) {
            indicators = null;
            indicatorsValue = null;
        } else {
            indicators = userIndicatorsInfo.getIndicators();
            indicatorsValue = userIndicatorsInfo.getIndicatorsValue();
        }
        if (j2 != 0) {
            this.B.setTitle(indicators);
            this.B.setRemindText(indicatorsValue);
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean q0(int i, Object obj) {
        if (sv1.f34013b != i) {
            return false;
        }
        A0((UserIndicatorsInfo) obj);
        return true;
    }

    public okq(rk5 rk5Var, View view) {
        this(rk5Var, view, ViewDataBinding.P(rk5Var, view, 1, D, E));
    }
}
