package com.xiaomi.hm.health.healthdata.ui.detail.healthdata;

import androidx.fragment.app.Fragment;
import com.xiaomi.hm.health.healthdata.dto.TimeMode;
import com.xiaomi.hm.health.healthdata.ui.base.WeekHomeBaseFragment;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\b"}, d2 = {"Lcom/xiaomi/hm/health/healthdata/ui/detail/healthdata/HealthDataWeekHomeFragment;", "Lcom/xiaomi/hm/health/healthdata/ui/base/WeekHomeBaseFragment;", "", "time", "Landroidx/fragment/app/Fragment;", "weekDetailFragment", "<init>", "()V", "app_midongPlayRelease"}, k = 1, mv = {1, 5, 1})
public final class HealthDataWeekHomeFragment extends WeekHomeBaseFragment {
    @Override // com.xiaomi.hm.health.healthdata.ui.base.WeekHomeBaseFragment
    public void _$_clearFindViewByIdCache() {
    }

    @Override // com.xiaomi.hm.health.healthdata.ui.base.WeekHomeBaseFragment
    @NotNull
    public Fragment weekDetailFragment(long time) {
        return HealthDataDetailFragment.INSTANCE.getInstance(TimeMode.WEEK, time);
    }
}
