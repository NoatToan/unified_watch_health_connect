package com.xiaomi.fitness.health.sleep.ui;

import com.example.statistics.export.IOnetrack;
import com.example.statistics.export.OneTrackExtKt;
import com.example.statistics.export.OneTrackStatBean;
import com.xiaomi.fitness.health.sleep.view.SleepViewModel;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\b\u0010\u0005\u001a\u00020\u0006H\u0014J\b\u0010\u0007\u001a\u00020\bH\u0014¨\u0006\t"}, d2 = {"Lcom/xiaomi/fitness/health/sleep/ui/SleepMonthItemFragment;", "Lcom/xiaomi/fitness/health/sleep/ui/SleepBaseWeekMonthItemFragment;", "Lcom/xiaomi/fitness/health/sleep/view/SleepViewModel;", "<init>", "()V", "fragmentPosition", "", "onInvisible", "", "health_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class SleepMonthItemFragment extends Hilt_SleepMonthItemFragment<SleepViewModel> {
    @Override // com.xiaomi.fitness.health.sleep.ui.SleepBaseWeekMonthItemFragment
    public int fragmentPosition() {
        return 2;
    }

    @Override // com.xiaomi.fitness.baseui.view.BaseFragment
    public void onInvisible() {
        OneTrackExtKt.getInstance(IOnetrack.INSTANCE).reportData(new OneTrackStatBean("c_pa_v3", "56.4.5.1.21797"), "name", "sleeping_detail_page", "page_fragment", "month", "title", "睡眠", "data", getOneTrackReportData());
        super.onInvisible();
    }
}
