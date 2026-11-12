package com.huami.heartrate.utils;

import com.huami.heartrate.koin.KoinExtKt;
import com.huami.mifit.analytics.Analytics;
import com.huami.mifit.analytics.builder.CalculationEventBuilder;
import com.huami.mifit.analytics.builder.CountEventBuilder;
import com.huami.mifit.analytics.helper.ActivityTrackHelper;
import com.huami.tools.analytics.internal.utils.Const;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\u001a\u0010\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0000\u001a\b\u0010\u0004\u001a\u00020\u0002H\u0000\u001a\n\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0000\"\u0016\u0010\t\u001a\u00020\u00008\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\b\"\u0016\u0010\u000b\u001a\u00020\u00008\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\n\u0010\b\"\u0016\u0010\f\u001a\u00020\u00008\u0000@\u0000X\u0080T¢\u0006\u0006\n\u0004\b\f\u0010\b\"\u0016\u0010\r\u001a\u00020\u00008\u0000@\u0000X\u0080T¢\u0006\u0006\n\u0004\b\r\u0010\b\"\u0016\u0010\u000e\u001a\u00020\u00008\u0000@\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u000e\u0010\b\"\u0016\u0010\u000f\u001a\u00020\u00008\u0000@\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u000f\u0010\b\"\u0016\u0010\u0010\u001a\u00020\u00008\u0000@\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0010\u0010\b\"\u0016\u0010\u0011\u001a\u00020\u00008\u0000@\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0011\u0010\b\"\u0016\u0010\u0012\u001a\u00020\u00008\u0000@\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0012\u0010\b¨\u0006\u0013"}, d2 = {"", "id", "", "recordEvent", "recordEnterHeartRateActivityEvent", "Lcom/huami/mifit/analytics/helper/ActivityTrackHelper;", "getActivityTrackHelper", "a", "Ljava/lang/String;", "DETAIL_HEART_RATE_V", "b", HeartRateAnalyticsHelperKt.b, HeartRateAnalyticsHelperKt.DETAIL_HR_DAY_V, HeartRateAnalyticsHelperKt.DETAIL_HR_WEEK_V, HeartRateAnalyticsHelperKt.DETAIL_HR_MONTH_V, HeartRateAnalyticsHelperKt.DETAIL_HR_YEAR_V, HeartRateAnalyticsHelperKt.DETAIL_HR_RHR_C, HeartRateAnalyticsHelperKt.DETAIL_HR_AHB_C, HeartRateAnalyticsHelperKt.DETAIL_HR_MANUAL_C, "heartrate_release"}, k = 2, mv = {1, 5, 1})
public final class HeartRateAnalyticsHelperKt {

    @NotNull
    public static final String DETAIL_HR_AHB_C = "DETAIL_HR_AHB_C";

    @NotNull
    public static final String DETAIL_HR_DAY_V = "DETAIL_HR_DAY_V";

    @NotNull
    public static final String DETAIL_HR_MANUAL_C = "DETAIL_HR_MANUAL_C";

    @NotNull
    public static final String DETAIL_HR_MONTH_V = "DETAIL_HR_MONTH_V";

    @NotNull
    public static final String DETAIL_HR_RHR_C = "DETAIL_HR_RHR_C";

    @NotNull
    public static final String DETAIL_HR_WEEK_V = "DETAIL_HR_WEEK_V";

    @NotNull
    public static final String DETAIL_HR_YEAR_V = "DETAIL_HR_YEAR_V";

    @NotNull
    private static final String a = "DETAIL_HEART_RATE_V";

    @NotNull
    private static final String b = "PAGEDURATION";

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", "it", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function1<Long, Unit> {
        public static final a a = new a();

        public a() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Long l) {
            invoke(l.longValue());
            return Unit.INSTANCE;
        }

        public final void invoke(long j) {
            Analytics.recordEvent(new CalculationEventBuilder(HeartRateAnalyticsHelperKt.b, j).addExtra(Const.PARAM_ACTIVITY_NAME, "DETAIL_HEART_RATE").setRealTimeRecord(true));
        }
    }

    @Nullable
    public static final ActivityTrackHelper getActivityTrackHelper() {
        if (KoinExtKt.isHollywood()) {
            return new ActivityTrackHelper(a.a);
        }
        return null;
    }

    public static final void recordEnterHeartRateActivityEvent() {
        if (KoinExtKt.isHollywood()) {
            Analytics.recordEvent(new CountEventBuilder("DETAIL_HEART_RATE_V").setRealTimeRecord(true));
        }
    }

    public static final void recordEvent(@NotNull String str) {
        Analytics.recordEvent(new CountEventBuilder(str));
    }
}
