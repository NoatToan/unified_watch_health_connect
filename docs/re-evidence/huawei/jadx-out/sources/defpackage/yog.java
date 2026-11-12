package defpackage;

import android.content.Context;
import android.text.TextUtils;
import com.huawei.hianalytics.process.HiAnalyticsConfig;
import com.huawei.hianalytics.process.HiAnalyticsInstance;
import com.huawei.wisesecurity.kfs.ha.HiAnalyticsType;
import com.huawei.wisesecurity.kfs.ha.message.ReportMsgBuilder;
import com.huawei.wisesecurity.kfs.log.ILogKfs;

/* JADX INFO: loaded from: classes20.dex */
public class yog {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ILogKfs f53695b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f53696c;
    private HiAnalyticsInstance d;
    private final ynx e;

    public yog(Context context, String str, String str2, ILogKfs iLogKfs) {
        if (TextUtils.isEmpty(str2)) {
            iLogKfs.w("HaReporter", "hiAnalyticsUrl has not been initialized, and the report data will not be reported.");
        } else {
            iLogKfs.i("HaReporter", "hiAnalyticsUrl is " + str2);
        }
        this.f53696c = str;
        this.f53695b = iLogKfs;
        this.e = new ynx(iLogKfs);
        a(str2, context);
    }

    public void a() {
        this.e.d();
    }

    private void a(String str, Context context) {
        HiAnalyticsConfig hiAnalyticsConfigBuild = new HiAnalyticsConfig.Builder().setCollectURL(str).setEnableUUID(false).build();
        HiAnalyticsInstance hiAnalyticsInstanceRefresh = new HiAnalyticsInstance.Builder(context).setMaintConf(hiAnalyticsConfigBuild).setOperConf(hiAnalyticsConfigBuild).refresh(this.f53696c);
        this.d = hiAnalyticsInstanceRefresh;
        if (hiAnalyticsInstanceRefresh == null) {
            this.f53695b.i("HaReporter", "The analytics instance was not successfully obtained, and the analytics capability cannot be used");
        } else {
            hiAnalyticsInstanceRefresh.setAppid("com.huawei.wisesecurity.common");
        }
    }

    public void a(Context context, ReportMsgBuilder reportMsgBuilder) {
        c(context, reportMsgBuilder, HiAnalyticsType.HIANALYTICS_MAINTENANCE);
    }

    public void c(Context context, ReportMsgBuilder reportMsgBuilder, HiAnalyticsType hiAnalyticsType) {
        if (this.d == null) {
            this.f53695b.i("HaReporter", "onEvent null == analyticsInstance");
            return;
        }
        if (this.e.c(context)) {
            this.f53695b.i("HaReporter", "onEvent isEnabledUserExperience is false");
            return;
        }
        try {
            this.d.onEvent(hiAnalyticsType.getCode(), reportMsgBuilder.getEventId(), reportMsgBuilder.build());
            this.f53695b.i("HaReporter", "onEvent success");
        } catch (Exception e) {
            this.f53695b.w("HaReporter", "onEvent fail : " + e.getMessage());
        }
    }
}
