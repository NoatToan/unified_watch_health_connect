package com.huami.bloodoxygen.ui.business;

import androidx.fragment.app.Fragment;
import com.huami.bloodoxygen.ui.base.HomeBaseFragment;
import com.huami.bloodoxygen.ui.dto.TimeMode;
import com.huami.sleep.statistic.sleepanalysis.ui.SleepAnalysisFragment;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\u0007\u001a\u00020\u0006H\u0016¨\u0006\n"}, d2 = {"Lcom/huami/bloodoxygen/ui/business/BloodOxygenDayHomeFragment;", "Lcom/huami/bloodoxygen/ui/base/HomeBaseFragment;", "", "time", "Landroidx/fragment/app/Fragment;", "detailFragment", "Lcom/huami/bloodoxygen/ui/dto/TimeMode;", SleepAnalysisFragment.TIME_MODE, "<init>", "()V", "ui_release"}, k = 1, mv = {1, 5, 1})
public final class BloodOxygenDayHomeFragment extends HomeBaseFragment {
    @Override // com.huami.bloodoxygen.ui.base.HomeBaseFragment
    @NotNull
    public Fragment detailFragment(long time) {
        return BloodOxygenDetailFragment.INSTANCE.getInstance(timeMode(), time);
    }

    @Override // com.huami.bloodoxygen.ui.base.HomeBaseFragment
    @NotNull
    public TimeMode timeMode() {
        return TimeMode.DAY;
    }
}
