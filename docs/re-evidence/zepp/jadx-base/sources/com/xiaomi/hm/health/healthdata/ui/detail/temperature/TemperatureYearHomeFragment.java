package com.xiaomi.hm.health.healthdata.ui.detail.temperature;

import androidx.fragment.app.Fragment;
import com.xiaomi.hm.health.healthdata.dto.TimeMode;
import com.xiaomi.hm.health.healthdata.ui.base.YearHomeBaseFragment;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\b"}, d2 = {"Lcom/xiaomi/hm/health/healthdata/ui/detail/temperature/TemperatureYearHomeFragment;", "Lcom/xiaomi/hm/health/healthdata/ui/base/YearHomeBaseFragment;", "", "time", "Landroidx/fragment/app/Fragment;", "yearDetailFragment", "<init>", "()V", "app_midongPlayRelease"}, k = 1, mv = {1, 5, 1})
public final class TemperatureYearHomeFragment extends YearHomeBaseFragment {
    @Override // com.xiaomi.hm.health.healthdata.ui.base.YearHomeBaseFragment
    public void _$_clearFindViewByIdCache() {
    }

    @Override // com.xiaomi.hm.health.healthdata.ui.base.YearHomeBaseFragment
    @NotNull
    public Fragment yearDetailFragment(long time) {
        return TemperatureStatisticsFragment.INSTANCE.getInstance(TimeMode.YEAR, time);
    }
}
