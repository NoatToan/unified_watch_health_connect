package defpackage;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.LinearLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.ViewDataBinding;
import androidx.lifecycle.LiveData;
import androidx.viewpager2.widget.ViewPager2;
import com.xiaomi.fitness.health.sleep.ui.setting.SleepSettingModel;
import com.xiaomi.fitness.health.sleep.ui.setting.SleepSettingViewModel;
import com.xiaomi.fitness.health.sleep.ui.setting.baseui.SleepGuideCarouselIndicator;
import com.xiaomi.fitness.health.sleep.ui.setting.util.SnoreAndSleepWordsConverter;
import com.xiaomi.fitness.widget.SlidableScrollView;
import com.xiaomi.fitness.widget.SwitchButtonBindingTwoLineTextView;
import com.xiaomi.fitness.widget.SwitchButtonTwoLineTextView;

/* JADX INFO: loaded from: classes9.dex */
public class hwb extends gwb {
    public static final ViewDataBinding.i L = null;
    public static final SparseIntArray M;
    public final ConstraintLayout J;
    public long K;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        M = sparseIntArray;
        sparseIntArray.put(eri.Me, 2);
        sparseIntArray.put(eri.Oh, 3);
        sparseIntArray.put(eri.M, 4);
        sparseIntArray.put(eri.Y3, 5);
        sparseIntArray.put(eri.v1, 6);
        sparseIntArray.put(eri.Zo, 7);
        sparseIntArray.put(eri.To, 8);
    }

    public hwb(rk5 rk5Var, View view, Object[] objArr) {
        super(rk5Var, view, 1, (SwitchButtonTwoLineTextView) objArr[4], (ConstraintLayout) objArr[6], (View) objArr[5], (SlidableScrollView) objArr[2], (SwitchButtonTwoLineTextView) objArr[1], (LinearLayout) objArr[3], (ViewPager2) objArr[7], (SleepGuideCarouselIndicator) objArr[8]);
        this.K = -1L;
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[0];
        this.J = constraintLayout;
        constraintLayout.setTag(null);
        this.E.setTag(null);
        o0(view);
        H();
    }

    private boolean A0(LiveData<Integer> liveData, int i) {
        if (i != cv1.f14763a) {
            return false;
        }
        synchronized (this) {
            this.K |= 1;
        }
        return true;
    }

    public void B0(SleepSettingViewModel sleepSettingViewModel) {
        this.I = sleepSettingViewModel;
        synchronized (this) {
            this.K |= 2;
        }
        notifyPropertyChanged(cv1.f14764b);
        super.e0();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean F() {
        synchronized (this) {
            try {
                return this.K != 0;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void H() {
        synchronized (this) {
            this.K = 4L;
        }
        e0();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean W(int i, Object obj, int i2) {
        if (i != 0) {
            return false;
        }
        return A0((LiveData) obj, i2);
    }

    @Override // androidx.databinding.ViewDataBinding
    public void o() {
        long j;
        synchronized (this) {
            j = this.K;
            this.K = 0L;
        }
        SleepSettingViewModel sleepSettingViewModel = this.I;
        long j2 = j & 7;
        boolean zConvertStatusToBoolean = false;
        if (j2 != 0) {
            SleepSettingModel mModel = sleepSettingViewModel != null ? sleepSettingViewModel.getMModel() : null;
            LiveData<Integer> snoreDetection = mModel != null ? mModel.getSnoreDetection() : null;
            w0(0, snoreDetection);
            zConvertStatusToBoolean = SnoreAndSleepWordsConverter.INSTANCE.convertStatusToBoolean(ViewDataBinding.h0(snoreDetection != null ? snoreDetection.getValue() : null));
        }
        if (j2 != 0) {
            SwitchButtonBindingTwoLineTextView.setSwitchOn(this.E, zConvertStatusToBoolean);
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean q0(int i, Object obj) {
        if (cv1.f14764b != i) {
            return false;
        }
        B0((SleepSettingViewModel) obj);
        return true;
    }

    public hwb(rk5 rk5Var, View view) {
        this(rk5Var, view, ViewDataBinding.P(rk5Var, view, 9, L, M));
    }
}
