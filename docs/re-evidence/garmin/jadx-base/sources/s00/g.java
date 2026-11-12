package s00;

import android.os.Bundle;
import com.garmin.android.apps.connectmobile.GarminConnectMobileApp;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.annual_report.preprocess.AnnualReportPreProcessWorker;
import com.garmin.android.apps.connectmobile.i2;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Ls00/g;", "Ln00/d;", "<init>", "()V", "a", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class g implements n00.d {
    static {
        new a(null);
    }

    @Override // n00.d
    public final void a(GarminConnectMobileApp garminConnectMobileApp, n00.c cVar, Bundle bundle) {
        int i14;
        garminConnectMobileApp.getClass();
        cVar.getClass();
        i2.a aVar = i2.f36769a;
        a2 a2Var = a2.GENERAL;
        aVar.getClass();
        i2.a.b(a2Var, "AnnualReportReadyNotificationHandler", "onPushNotificationReceived: " + bundle);
        xt.a aVar2 = (xt.a) KoinJavaComponent.get$default(xt.a.class, null, null, 6, null);
        rt.a aVar3 = aVar2.f192134c;
        boolean z14 = (aVar3.f() == null || aVar3.k(aVar2.f192132a)) ? false : true;
        i2.a.b(a2Var, "AnnualReportReadyNotificationHandler", "checkNoTodayCache: Has today's cache: [" + z14 + "]");
        if (z14) {
            return;
        }
        try {
            String string = bundle.getString("annual-report-year", "");
            string.getClass();
            i14 = Integer.parseInt(string);
        } catch (NumberFormatException e4) {
            i2.a aVar4 = i2.f36769a;
            a2 a2Var2 = a2.GENERAL;
            aVar4.getClass();
            i2.a.f(a2Var2, "AnnualReportReadyNotificationHandler", "checkAnnualReportYear: exception: [" + e4 + "]");
            i14 = 0;
        }
        boolean z15 = i14 == 2025;
        String strG = com.airbnb.lottie.animation.keyframe.a.g("checkAnnualReportYear: Has annual report year matched: [", "]", z15);
        i2.a aVar5 = i2.f36769a;
        a2 a2Var3 = a2.GENERAL;
        aVar5.getClass();
        i2.a.b(a2Var3, "AnnualReportReadyNotificationHandler", strG);
        if (z15) {
            AnnualReportPreProcessWorker.f30176j.getClass();
            AnnualReportPreProcessWorker.a.a(garminConnectMobileApp, true);
        }
    }

    @Override // n00.d
    public final n00.c[] b() {
        return new n00.c[]{n00.c.ANNUAL_REPORT_READY};
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006¨\u0006\b"}, d2 = {"Ls00/g$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "KEY_ANNUAL_REPORT_YEAR", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
