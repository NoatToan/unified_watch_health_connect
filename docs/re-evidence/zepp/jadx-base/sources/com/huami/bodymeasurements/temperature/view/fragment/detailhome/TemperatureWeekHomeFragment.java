package com.huami.bodymeasurements.temperature.view.fragment.detailhome;

import androidx.fragment.app.Fragment;
import com.huami.bodymeasurements.detailframe.DetailHomeBaseFragment;
import com.huami.bodymeasurements.detailframe.dto.DateMode;
import com.huami.bodymeasurements.temperature.model.TempConstantsKt;
import com.huami.bodymeasurements.temperature.model.record.TempRecordUtils;
import com.huami.bodymeasurements.temperature.view.fragment.TemperatureStatisticsDetailFragment;
import java.util.Date;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\f\u001a\u00020\n¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¨\u0006\u000f"}, d2 = {"Lcom/huami/bodymeasurements/temperature/view/fragment/detailhome/TemperatureWeekHomeFragment;", "Lcom/huami/bodymeasurements/detailframe/DetailHomeBaseFragment;", "", "time", "Landroidx/fragment/app/Fragment;", "detailFragment", "", "hidden", "", "onHiddenChanged", "Ljava/util/Date;", "startDate", "endDate", "<init>", "(Ljava/util/Date;Ljava/util/Date;)V", "temperature_release"}, k = 1, mv = {1, 5, 1})
public final class TemperatureWeekHomeFragment extends DetailHomeBaseFragment {
    public TemperatureWeekHomeFragment(@NotNull Date date, @NotNull Date date2) {
        super(date, date2, DateMode.WEEK);
    }

    @Override // com.huami.bodymeasurements.detailframe.DetailHomeBaseFragment
    public void _$_clearFindViewByIdCache() {
    }

    @Override // com.huami.bodymeasurements.detailframe.DetailHomeBaseFragment
    @NotNull
    public Fragment detailFragment(long time) {
        return TemperatureStatisticsDetailFragment.INSTANCE.getInstance("week", time);
    }

    @Override // com.huami.bodymeasurements.detailframe.DetailHomeBaseFragment, androidx.fragment.app.Fragment
    public void onHiddenChanged(boolean hidden) {
        super.onHiddenChanged(hidden);
        if (hidden) {
            return;
        }
        TempRecordUtils.INSTANCE.recordCountEvent(TempConstantsKt.HEALTH_BODYTEM_WEEK_C);
    }
}
