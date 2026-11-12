package defpackage;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.ViewDataBinding;
import com.xiaomi.fitness.electronic.scale.VisitorWeightViewModel;
import com.xiaomi.fitness.widget.RightArrowBindingSingleLineTextView;
import com.xiaomi.fitness.widget.view.RoundImageView;

/* JADX INFO: loaded from: classes8.dex */
public class wk0 extends vk0 {
    public static final ViewDataBinding.i K = null;
    public static final SparseIntArray L;
    public final ConstraintLayout I;
    public long J;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        L = sparseIntArray;
        sparseIntArray.put(bri.S6, 5);
        sparseIntArray.put(bri.Q6, 6);
        sparseIntArray.put(bri.R6, 7);
    }

    public wk0(rk5 rk5Var, View view, Object[] objArr) {
        super(rk5Var, view, 0, (RightArrowBindingSingleLineTextView) objArr[3], (RightArrowBindingSingleLineTextView) objArr[4], (TextView) objArr[6], (Button) objArr[7], (RightArrowBindingSingleLineTextView) objArr[1], (RoundImageView) objArr[5], (RightArrowBindingSingleLineTextView) objArr[2]);
        this.J = -1L;
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[0];
        this.I = constraintLayout;
        constraintLayout.setTag(null);
        this.A.setTag(null);
        this.B.setTag(null);
        this.E.setTag(null);
        this.G.setTag(null);
        o0(view);
        H();
    }

    public void A0(VisitorWeightViewModel visitorWeightViewModel) {
        this.H = visitorWeightViewModel;
        synchronized (this) {
            this.J |= 1;
        }
        notifyPropertyChanged(av1.d);
        super.e0();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean F() {
        synchronized (this) {
            try {
                return this.J != 0;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void H() {
        synchronized (this) {
            this.J = 2L;
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
        String sex;
        String birthday;
        String nickName;
        String height;
        synchronized (this) {
            j = this.J;
            this.J = 0L;
        }
        VisitorWeightViewModel visitorWeightViewModel = this.H;
        long j2 = j & 3;
        if (j2 == 0 || visitorWeightViewModel == null) {
            sex = null;
            birthday = null;
            nickName = null;
            height = null;
        } else {
            sex = visitorWeightViewModel.getSex();
            birthday = visitorWeightViewModel.getBirthday();
            nickName = visitorWeightViewModel.getNickName();
            height = visitorWeightViewModel.getHeight();
        }
        if (j2 != 0) {
            RightArrowBindingSingleLineTextView.remindText(this.A, birthday);
            RightArrowBindingSingleLineTextView.remindText(this.B, height);
            RightArrowBindingSingleLineTextView.remindText(this.E, nickName);
            RightArrowBindingSingleLineTextView.remindText(this.G, sex);
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean q0(int i, Object obj) {
        if (av1.d != i) {
            return false;
        }
        A0((VisitorWeightViewModel) obj);
        return true;
    }

    public wk0(rk5 rk5Var, View view) {
        this(rk5Var, view, ViewDataBinding.P(rk5Var, view, 8, K, L));
    }
}
