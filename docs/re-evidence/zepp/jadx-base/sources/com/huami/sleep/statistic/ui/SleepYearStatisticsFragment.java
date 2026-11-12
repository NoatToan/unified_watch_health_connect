package com.huami.sleep.statistic.ui;

import androidx.fragment.app.Fragment;
import com.huami.sleep.statistic.dto.TimeMode;
import com.huami.sleep.statistic.sleepanalysis.ui.SleepAnalysisFragment;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\b\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¨\u0006\f"}, d2 = {"Lcom/huami/sleep/statistic/ui/SleepYearStatisticsFragment;", "Lcom/huami/sleep/statistic/ui/SleepStatisticsBaseFragment;", "Lcom/huami/sleep/statistic/dto/TimeMode;", SleepAnalysisFragment.TIME_MODE, "", "time", "Landroidx/fragment/app/Fragment;", "dayDetailFragment", "", "userId", "<init>", "(Ljava/lang/String;)V", "sleep_release"}, k = 1, mv = {1, 5, 1})
public final class SleepYearStatisticsFragment extends SleepStatisticsBaseFragment {
    public SleepYearStatisticsFragment(@NotNull String str) {
        super(str);
    }

    @Override // com.huami.sleep.statistic.ui.SleepStatisticsBaseFragment
    public void _$_clearFindViewByIdCache() {
    }

    @Override // com.huami.sleep.statistic.ui.SleepStatisticsBaseFragment
    @NotNull
    public Fragment dayDetailFragment(long time) {
        return SleepStatisticsFragment.INSTANCE.getInstance(getUserId(), timeMode(), time);
    }

    @Override // com.huami.sleep.statistic.ui.SleepStatisticsBaseFragment
    @NotNull
    public TimeMode timeMode() {
        return TimeMode.YEAR;
    }
}
