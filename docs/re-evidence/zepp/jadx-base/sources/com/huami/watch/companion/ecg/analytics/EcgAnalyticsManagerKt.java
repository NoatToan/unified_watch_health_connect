package com.huami.watch.companion.ecg.analytics;

import com.alipay.sdk.m.f0.c;
import com.google.firebase.perf.FirebasePerformance;
import com.huami.android.zxing.Intents;
import com.huami.ecg.core.db.entity.EcgData;
import com.huami.ecg.core.model.constant.MeasureStateValue;
import com.huami.mifit.analytics.Analytics;
import com.huami.mifit.analytics.builder.CountEventBuilder;
import com.huami.nfc.base.Analysis;
import com.huami.tools.analytics.DbUtils;
import com.thanosfisherman.wifiutils.a;
import com.unionpay.tsmservice.data.Constant;
import com.xiaomi.hm.health.lab.model.SensorRecordsEnity;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes16.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u001d\n\u0002\u0018\u0002\n\u0002\b\b\u001a\u0010\u0010\u0003\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000\u001a\u0018\u0010\u0006\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u00002\u0006\u0010\u0005\u001a\u00020\u0004\u001a\u0010\u0010\u0007\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000\u001a\u0010\u0010\b\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000\u001a\u0010\u0010\t\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000\u001a\u0010\u0010\n\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000\u001a\u0010\u0010\u000b\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000\u001a\u0010\u0010\f\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000\u001a\u000e\u0010\u000f\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\r\u001a\u000e\u0010\u0011\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\r\u001a\u000e\u0010\u0013\u001a\u00020\u00022\u0006\u0010\u0012\u001a\u00020\u0004\u001a\u000e\u0010\u0016\u001a\u00020\u00042\u0006\u0010\u0015\u001a\u00020\u0014\u001a\u000e\u0010\u0017\u001a\u00020\u00042\u0006\u0010\u0015\u001a\u00020\u0014\u001a \u0010\u0019\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u00002\u0006\u0010\u0018\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0004\u001a\"\u0010\u001b\u001a\u0004\u0018\u00010\u001a2\b\u0010\u0001\u001a\u0004\u0018\u00010\u00002\u0006\u0010\u0018\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0004\"\u0016\u0010\u001c\u001a\u00020\u00048\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u001c\u0010\u001d\"\u0016\u0010\u001e\u001a\u00020\u00048\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u001e\u0010\u001d\"\u0016\u0010\u001f\u001a\u00020\u00048\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u001f\u0010\u001d\"\u0016\u0010 \u001a\u00020\u00048\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b \u0010\u001d\"\u0016\u0010!\u001a\u00020\u00048\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b!\u0010\u001d\"\u0016\u0010\"\u001a\u00020\u00048\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\"\u0010\u001d\"\u0016\u0010#\u001a\u00020\u00048\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b#\u0010\u001d\"\u0016\u0010$\u001a\u00020\u00048\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b$\u0010\u001d\"\u0016\u0010%\u001a\u00020\u00048\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b%\u0010\u001d\"\u0016\u0010&\u001a\u00020\u00048\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b&\u0010\u001d\"\u0016\u0010'\u001a\u00020\u00048\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b'\u0010\u001d\"\u0016\u0010(\u001a\u00020\u00048\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b(\u0010\u001d\"\u0016\u0010)\u001a\u00020\u00048\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b)\u0010\u001d\"\u0016\u0010*\u001a\u00020\u00048\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b*\u0010\u001d\"\u0016\u0010+\u001a\u00020\u00048\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b+\u0010\u001d\"\u0016\u0010,\u001a\u00020\u00048\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b,\u0010\u001d\"\u0016\u0010-\u001a\u00020\u00048\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b-\u0010\u001d\"\u0016\u0010.\u001a\u00020\u00048\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b.\u0010\u001d\"\u0016\u0010/\u001a\u00020\u00048\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b/\u0010\u001d\"\u0016\u00100\u001a\u00020\u00048\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b0\u0010\u001d\"\u0016\u00101\u001a\u00020\u00048\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b1\u0010\u001d\"\u0016\u00102\u001a\u00020\u00048\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b2\u0010\u001d\"\u0016\u00103\u001a\u00020\u00048\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b3\u0010\u001d\"\u0016\u00104\u001a\u00020\u00048\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b4\u0010\u001d\"\u0016\u00105\u001a\u00020\u00048\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b5\u0010\u001d\"\u0016\u00106\u001a\u00020\u00048\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b6\u0010\u001d\"\u0016\u00107\u001a\u00020\u00048\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b7\u0010\u001d\"$\u0010?\u001a\u0004\u0018\u0001088\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b9\u0010:\u001a\u0004\b;\u0010<\"\u0004\b=\u0010>¨\u0006@"}, d2 = {"Lcom/huami/ecg/core/db/entity/EcgData;", "ecgData", "", "ecgC", "", "type", "singleEcgC", "singleEcgCDetail", "singleEcgCDelete", "singleEcgCDeleteConfirm", "singleEcgCGoMdHealth", "goMdHealthV", "goMdHealthC", "", "open", "ecgDetailCFilter", "export", "ecgDetailCExportPdf", "channel", "ecgDetailCExportPdfChannel", "Ljava/util/Date;", "date", "getDate", "getTime", DbUtils.Const.Columns.Event.EVENT_ID, "ecgAnalytics", "Lcom/huami/mifit/analytics/builder/CountEventBuilder;", "getBuilder", "TAG", "Ljava/lang/String;", Intents.WifiConnect.TYPE, "SOURCE", "ID", "DATE", "TIME", "FROM", "STATUS", Analysis.PARAM_RESULT, Constant.TARGET_CHANNEL, SensorRecordsEnity.SensorType.SENSOR_ECG, "STATUS_MORE", "SINGLE_ECG", "DETAIL", FirebasePerformance.HttpMethod.DELETE, "DELETE_CONFIRM", "GO_MD_HEALTH", "FILTER", a.a, "CLOSE", "EXPORT_PDF", c.p, "FAIL", "EXPORT_PDF_CHANNEL", "QQ", "WEIXIN", MeasureStateValue.OTHER, "Lcom/huami/watch/companion/ecg/analytics/EcgAnalyticsCallBack;", "a", "Lcom/huami/watch/companion/ecg/analytics/EcgAnalyticsCallBack;", "getEcgAnalyticsCallBack", "()Lcom/huami/watch/companion/ecg/analytics/EcgAnalyticsCallBack;", "setEcgAnalyticsCallBack", "(Lcom/huami/watch/companion/ecg/analytics/EcgAnalyticsCallBack;)V", "ecgAnalyticsCallBack", "ecg-companion_release"}, k = 2, mv = {1, 5, 1})
public final class EcgAnalyticsManagerKt {

    @NotNull
    public static final String CHANNEL = "channel";

    @NotNull
    public static final String CLOSE = "close";

    @NotNull
    public static final String DATE = "date";

    @NotNull
    public static final String DELETE = "delete";

    @NotNull
    public static final String DELETE_CONFIRM = "delete_confirm";

    @NotNull
    public static final String DETAIL = "detail";

    @NotNull
    public static final String ECG = "ecg";

    @NotNull
    public static final String EXPORT_PDF = "exportpdf";

    @NotNull
    public static final String EXPORT_PDF_CHANNEL = "exportpdf_channel";

    @NotNull
    public static final String FAIL = "fail";

    @NotNull
    public static final String FILTER = "filter";

    @NotNull
    public static final String FROM = "fr";

    @NotNull
    public static final String GO_MD_HEALTH = "gomdhealth";

    @NotNull
    public static final String ID = "id";

    @NotNull
    public static final String OPEN = "open";

    @NotNull
    public static final String OTHER = "other";

    @NotNull
    public static final String QQ = "qq";

    @NotNull
    public static final String RESULT = "result";

    @NotNull
    public static final String SINGLE_ECG = "singleecg";

    @NotNull
    public static final String SOURCE = "source";

    @NotNull
    public static final String STATUS = "status";

    @NotNull
    public static final String STATUS_MORE = "status_more";

    @NotNull
    public static final String SUCCESS = "success";

    @NotNull
    public static final String TAG = "EcgAnalyticsManager";

    @NotNull
    public static final String TIME = "time";

    @NotNull
    public static final String TYPE = "tp";

    @NotNull
    public static final String WEIXIN = "weixin";

    @Nullable
    private static EcgAnalyticsCallBack a;

    public static final void ecgAnalytics(@Nullable EcgData ecgData, @NotNull String str, @NotNull String str2) {
        CountEventBuilder builder;
        if (ecgData == null || (builder = getBuilder(ecgData, str, str2)) == null) {
            return;
        }
        Analytics.recordEvent(builder);
    }

    public static final void ecgC(@Nullable EcgData ecgData) {
        ecgAnalytics(ecgData, StatEventKt.ECG_C, SINGLE_ECG);
    }

    public static final void ecgDetailCExportPdf(boolean z) {
        CountEventBuilder countEventBuilder;
        CountEventBuilder countEventBuilderAddExtra;
        String str = z ? "success" : "fail";
        EcgAnalyticsCallBack ecgAnalyticsCallBack = a;
        CountEventBuilder countEventBuilderAddExtra2 = null;
        if (ecgAnalyticsCallBack != null && (countEventBuilder = ecgAnalyticsCallBack.getCountEventBuilder(StatEventKt.ECGDETAIL_C)) != null && (countEventBuilderAddExtra = countEventBuilder.addExtra("tp", EXPORT_PDF)) != null) {
            EcgAnalyticsCallBack ecgAnalyticsCallBack2 = a;
            CountEventBuilder countEventBuilderAddExtra3 = countEventBuilderAddExtra.addExtra("source", ecgAnalyticsCallBack2 == null ? null : ecgAnalyticsCallBack2.getDeviceSourceValue());
            if (countEventBuilderAddExtra3 != null) {
                countEventBuilderAddExtra2 = countEventBuilderAddExtra3.addExtra("result", str);
            }
        }
        if (countEventBuilderAddExtra2 != null) {
            Analytics.recordEvent(countEventBuilderAddExtra2);
        }
    }

    public static final void ecgDetailCExportPdfChannel(@NotNull String str) {
        CountEventBuilder countEventBuilder;
        CountEventBuilder countEventBuilderAddExtra;
        EcgAnalyticsCallBack ecgAnalyticsCallBack = a;
        CountEventBuilder countEventBuilderAddExtra2 = null;
        if (ecgAnalyticsCallBack != null && (countEventBuilder = ecgAnalyticsCallBack.getCountEventBuilder(StatEventKt.ECGDETAIL_C)) != null && (countEventBuilderAddExtra = countEventBuilder.addExtra("tp", EXPORT_PDF_CHANNEL)) != null) {
            EcgAnalyticsCallBack ecgAnalyticsCallBack2 = a;
            CountEventBuilder countEventBuilderAddExtra3 = countEventBuilderAddExtra.addExtra("source", ecgAnalyticsCallBack2 == null ? null : ecgAnalyticsCallBack2.getDeviceSourceValue());
            if (countEventBuilderAddExtra3 != null) {
                countEventBuilderAddExtra2 = countEventBuilderAddExtra3.addExtra("channel", str);
            }
        }
        if (countEventBuilderAddExtra2 != null) {
            Analytics.recordEvent(countEventBuilderAddExtra2);
        }
    }

    public static final void ecgDetailCFilter(boolean z) {
        CountEventBuilder countEventBuilder;
        CountEventBuilder countEventBuilderAddExtra;
        String str = z ? "open" : "close";
        EcgAnalyticsCallBack ecgAnalyticsCallBack = a;
        CountEventBuilder countEventBuilderAddExtra2 = null;
        if (ecgAnalyticsCallBack != null && (countEventBuilder = ecgAnalyticsCallBack.getCountEventBuilder(StatEventKt.ECGDETAIL_C)) != null && (countEventBuilderAddExtra = countEventBuilder.addExtra("tp", "filter")) != null) {
            EcgAnalyticsCallBack ecgAnalyticsCallBack2 = a;
            CountEventBuilder countEventBuilderAddExtra3 = countEventBuilderAddExtra.addExtra("source", ecgAnalyticsCallBack2 == null ? null : ecgAnalyticsCallBack2.getDeviceSourceValue());
            if (countEventBuilderAddExtra3 != null) {
                countEventBuilderAddExtra2 = countEventBuilderAddExtra3.addExtra("status", str);
            }
        }
        if (countEventBuilderAddExtra2 != null) {
            Analytics.recordEvent(countEventBuilderAddExtra2);
        }
    }

    @Nullable
    public static final CountEventBuilder getBuilder(@Nullable EcgData ecgData, @NotNull String str, @NotNull String str2) {
        CountEventBuilder countEventBuilder;
        CountEventBuilder countEventBuilderAddExtra;
        CountEventBuilder countEventBuilderAddExtra2;
        CountEventBuilder countEventBuilderAddExtra3;
        if (ecgData == null) {
            return null;
        }
        Date date = new Date(ecgData.getTimestamp() * ((long) 1000));
        EcgAnalyticsCallBack ecgAnalyticsCallBack = a;
        if (ecgAnalyticsCallBack == null || (countEventBuilder = ecgAnalyticsCallBack.getCountEventBuilder(str)) == null || (countEventBuilderAddExtra = countEventBuilder.addExtra("tp", str2)) == null) {
            return null;
        }
        EcgAnalyticsCallBack ecgAnalyticsCallBack2 = a;
        CountEventBuilder countEventBuilderAddExtra4 = countEventBuilderAddExtra.addExtra("source", ecgAnalyticsCallBack2 == null ? null : ecgAnalyticsCallBack2.getDeviceSourceValue());
        if (countEventBuilderAddExtra4 == null || (countEventBuilderAddExtra2 = countEventBuilderAddExtra4.addExtra("id", String.valueOf(ecgData.getTimestamp()))) == null || (countEventBuilderAddExtra3 = countEventBuilderAddExtra2.addExtra("date", getDate(date))) == null) {
            return null;
        }
        return countEventBuilderAddExtra3.addExtra("time", getTime(date));
    }

    @NotNull
    public static final String getDate(@NotNull Date date) {
        return new SimpleDateFormat("yyyy-MM-dd", Locale.getDefault()).format(date);
    }

    @Nullable
    public static final EcgAnalyticsCallBack getEcgAnalyticsCallBack() {
        return a;
    }

    @NotNull
    public static final String getTime(@NotNull Date date) {
        return new SimpleDateFormat("HH:mm", Locale.getDefault()).format(date);
    }

    public static final void goMdHealthC(@Nullable EcgData ecgData) {
        CountEventBuilder builder = getBuilder(ecgData, StatEventKt.GOMDHEALTH_C, ECG);
        if (builder == null) {
            return;
        }
        builder.addExtra("fr", GO_MD_HEALTH);
        Analytics.recordEvent(builder);
    }

    public static final void goMdHealthV(@Nullable EcgData ecgData) {
        ecgAnalytics(ecgData, StatEventKt.GOMDHEALTH_V, ECG);
    }

    public static final void setEcgAnalyticsCallBack(@Nullable EcgAnalyticsCallBack ecgAnalyticsCallBack) {
        a = ecgAnalyticsCallBack;
    }

    public static final void singleEcgC(@Nullable EcgData ecgData, @NotNull String str) {
        ecgAnalytics(ecgData, StatEventKt.SINGLEECG_C, str);
    }

    public static final void singleEcgCDelete(@Nullable EcgData ecgData) {
        singleEcgC(ecgData, "delete");
    }

    public static final void singleEcgCDeleteConfirm(@Nullable EcgData ecgData) {
        singleEcgC(ecgData, DELETE_CONFIRM);
    }

    public static final void singleEcgCDetail(@Nullable EcgData ecgData) {
        singleEcgC(ecgData, "detail");
    }

    public static final void singleEcgCGoMdHealth(@Nullable EcgData ecgData) {
        singleEcgC(ecgData, GO_MD_HEALTH);
    }
}
