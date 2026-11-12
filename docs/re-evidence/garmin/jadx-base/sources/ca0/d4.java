package ca0;

import com.garmin.android.apps.connectmobile.GarminConnectMobileApp;
import com.garmin.android.apps.connectmobile.settings.thirdparty.details.ThirdPartyConnectActivity;
import com.garmin.android.gfdi.remotedevicemanagement.RemoteDeviceEnabledDelegateImpl;
import com.garmin.android.library.livetrack.data.typeadapters.GcsDateTimeAdapter;
import java.lang.annotation.Annotation;
import org.apache.commons.lang3.RandomStringUtils;
import org.joda.time.format.DateTimeFormat;
import org.joda.time.format.ISODateTimeFormat;
import org.koin.java.KoinJavaComponent;
import org.slf4j.LoggerFactory;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class d4 implements e23.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f26191a;

    public /* synthetic */ d4(int i14) {
        this.f26191a = i14;
    }

    @Override // e23.a
    public final Object invoke() {
        switch (this.f26191a) {
            case 0:
                return new m63.f1("com.garmin.android.apps.connectmobile.device.setup.navigation.UserProfileRoute.ProfileImage", c4.k.INSTANCE, new Annotation[0]);
            case 1:
                return new m63.f1("com.garmin.android.apps.connectmobile.device.setup.navigation.UserProfileRoute.ProfileIntro", c4.l.INSTANCE, new Annotation[0]);
            case 2:
                return new m63.f1("com.garmin.android.apps.connectmobile.device.setup.navigation.UserProfileRoute.ProfileSetupComplete", c4.m.INSTANCE, new Annotation[0]);
            case 3:
                return new m63.f1("com.garmin.android.apps.connectmobile.device.setup.navigation.UserProfileRoute.Weight", c4.p.INSTANCE, new Annotation[0]);
            case 4:
                return new m63.f1("com.garmin.android.apps.connectmobile.device.setup.navigation.UserProfileRoute.WheelchairActivityLevel", c4.q.INSTANCE, new Annotation[0]);
            case 5:
                return new m63.f1("com.garmin.android.apps.connectmobile.device.setup.navigation.WiFiSetupRoute.AddManually", g4.a.INSTANCE, new Annotation[0]);
            case 6:
                return new m63.f1("com.garmin.android.apps.connectmobile.device.setup.navigation.WiFiSetupRoute.Scan", g4.e.INSTANCE, new Annotation[0]);
            case 7:
                return new m63.f1("com.garmin.android.apps.connectmobile.device.setup.navigation.WiFiSetupRoute.Select", g4.f.INSTANCE, new Annotation[0]);
            case 8:
                return new m63.f1("com.garmin.android.apps.connectmobile.device.setup.navigation.WiFiSetupRoute.Setup", g4.g.INSTANCE, new Annotation[0]);
            case 9:
                int i14 = GcsDateTimeAdapter.f50207d;
                return DateTimeFormat.forPattern("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'").withZoneUTC();
            case 10:
                int i15 = GcsDateTimeAdapter.f50207d;
                return ISODateTimeFormat.dateTimeParser().withZoneUTC();
            case 11:
                int i16 = gt2.c.f79010a;
                return gt2.b.f79005a.h("AnalyticsOperation");
            case 12:
                int i17 = gt2.c.f79010a;
                return gt2.b.f79005a.h("CampaignValidOperation");
            case 13:
                int i18 = gt2.c.f79010a;
                return gt2.b.f79005a.h("FetchCampaignsOperation");
            case 14:
                int i19 = gt2.c.f79010a;
                return gt2.b.f79005a.h("SendCampaignEmailOperation");
            case 15:
                ThirdPartyConnectActivity.a aVar = ThirdPartyConnectActivity.f43974c;
                return RandomStringUtils.randomAlphanumeric(10);
            case 16:
                cl2.h hVar = cl2.h.f27950a;
                try {
                    return ok2.a0.f132585h.a().getConfiguration().f132622b;
                } catch (Exception unused) {
                    return null;
                }
            case 17:
                cn1.e eVar = cn1.e.f28008a;
                return Unit.INSTANCE;
            case 18:
                cn1.e eVar2 = cn1.e.f28008a;
                return Unit.INSTANCE;
            case 19:
                cn1.e eVar3 = cn1.e.f28008a;
                return Unit.INSTANCE;
            case 20:
                return com.garmin.android.apps.connectmobile.v.userAccount_delegate$lambda$0();
            case 21:
                return com.garmin.android.apps.connectmobile.v.onDemandResourcesInstaller_delegate$lambda$0();
            case 22:
                GarminConnectMobileApp.a aVar2 = GarminConnectMobileApp.f28685g;
                return new fq1.i();
            case 23:
                com.garmin.android.apps.connectmobile.l2.a aVar3 = com.garmin.android.apps.connectmobile.l2.f37135b;
                return (com.garmin.android.apps.connectmobile.n2) KoinJavaComponent.get$default(com.garmin.android.apps.connectmobile.n2.class, null, null, 6, null);
            case 24:
                com.garmin.android.apps.connectmobile.l2.a aVar4 = com.garmin.android.apps.connectmobile.l2.f37135b;
                return (com.garmin.android.apps.connectmobile.n2) KoinJavaComponent.get$default(com.garmin.android.apps.connectmobile.n2.class, null, null, 6, null);
            case 25:
                com.garmin.android.apps.connectmobile.y2 y2Var = com.garmin.android.apps.connectmobile.y2.f49767a;
                return e53.c.c(e53.e.e(500, e53.f.MILLISECONDS));
            case 26:
                com.garmin.android.apps.connectmobile.y2 y2Var2 = com.garmin.android.apps.connectmobile.y2.f49767a;
                return e53.c.c(e53.e.e(500, e53.f.MILLISECONDS));
            case 27:
                return RemoteDeviceEnabledDelegateImpl.DEFAULT_delegate$lambda$1();
            case 28:
                return RemoteDeviceEnabledDelegateImpl.LOGGER_delegate$lambda$2();
            default:
                com.garmin.subscriptions.retrofit.e eVar4 = com.garmin.subscriptions.retrofit.e.f52691a;
                return LoggerFactory.getLogger("SUB#RateLimitManager");
        }
    }
}
