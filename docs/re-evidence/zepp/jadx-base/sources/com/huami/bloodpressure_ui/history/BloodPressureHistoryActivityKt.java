package com.huami.bloodpressure_ui.history;

import android.content.Context;
import com.chenenyu.router.Router;
import com.huami.bloodpressure_ui.analytics.BloodPressureAnalyticsExKt;
import com.huami.bloodpressure_ui.analytics.BloodPressureStatEvent;
import com.huami.mifit.analytics.builder.CountEventBuilder;
import com.huami.tools.analytics.DbUtils;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u001a\u000e\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000¨\u0006\u0004"}, d2 = {"Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "", "navigateToBloodPressureHistory", "bloodpressure-ui_release"}, k = 2, mv = {1, 5, 1})
public final class BloodPressureHistoryActivityKt {
    public static final void navigateToBloodPressureHistory(@NotNull Context context) {
        BloodPressureAnalyticsExKt.record(new CountEventBuilder(BloodPressureStatEvent.INSTANCE.getHEALTH_BLOODPRESSURE_HISTORY_C()));
        Router.build(BloodPressureHistoryActivity.ROUTE_BLOODPRESSURE_HISTORY).go(context);
    }
}
