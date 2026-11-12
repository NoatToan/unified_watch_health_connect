package gg1;

import android.content.Context;
import android.content.SharedPreferences;
import com.garmin.gcsprotos.generated.Auth;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Metadata;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r2v2 gg1.v0, still in use, count: 1, list:
  (r2v2 gg1.v0) from 0x0396: FILLED_NEW_ARRAY 
  (r0v0 gg1.v0)
  (r1v1 gg1.v0)
  (r2v2 gg1.v0)
  (r3v3 gg1.v0)
  (r5v5 gg1.v0)
  (r4v4 gg1.v0)
  (r6v6 gg1.v0)
  (r7v7 gg1.v0)
  (r8v8 gg1.v0)
  (r9v9 gg1.v0)
  (r10v10 gg1.v0)
 A[WRAPPED] elemType: gg1.v0
	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
	at jadx.core.utils.InsnRemover.lambda$unbindInsns$1(InsnRemover.java:101)
	at java.base/java.util.ArrayList.forEach(ArrayList.java:1612)
	at jadx.core.utils.InsnRemover.unbindInsns(InsnRemover.java:100)
	at jadx.core.utils.InsnRemover.removeAllAndUnbind(InsnRemover.java:257)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:187)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:102)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b'\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001*B©\u0002\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0004\u0012\u0006\u0010\b\u001a\u00020\u0004\u0012\u0006\u0010\t\u001a\u00020\u0004\u0012\u0006\u0010\n\u001a\u00020\u0004\u0012\u0006\u0010\u000b\u001a\u00020\u0004\u0012\u0006\u0010\f\u001a\u00020\u0004\u0012\u0006\u0010\r\u001a\u00020\u0004\u0012\u0006\u0010\u000e\u001a\u00020\u0004\u0012\u0006\u0010\u000f\u001a\u00020\u0004\u0012\u0006\u0010\u0010\u001a\u00020\u0004\u0012\u0006\u0010\u0011\u001a\u00020\u0004\u0012\u0006\u0010\u0012\u001a\u00020\u0004\u0012\u0006\u0010\u0013\u001a\u00020\u0004\u0012\u0006\u0010\u0014\u001a\u00020\u0004\u0012\u0006\u0010\u0015\u001a\u00020\u0004\u0012\u0006\u0010\u0016\u001a\u00020\u0004\u0012\u0006\u0010\u0017\u001a\u00020\u0004\u0012\u0006\u0010\u0018\u001a\u00020\u0004\u0012\u0006\u0010\u0019\u001a\u00020\u0004\u0012\u0006\u0010\u001a\u001a\u00020\u0004\u0012\u0006\u0010\u001b\u001a\u00020\u0004\u0012\u0006\u0010\u001c\u001a\u00020\u0004\u0012\u0006\u0010\u001d\u001a\u00020\u0004\u0012\u0006\u0010\u001e\u001a\u00020\u0004\u0012\u0006\u0010\u001f\u001a\u00020\u0004\u0012\u0006\u0010 \u001a\u00020\u0004\u0012\u0006\u0010!\u001a\u00020\u0004\u0012\u0006\u0010\"\u001a\u00020\u0004\u0012\u0006\u0010#\u001a\u00020\u0004\u0012\u0006\u0010$\u001a\u00020\u0004\u0012\u0006\u0010%\u001a\u00020\u0004\u0012\u0006\u0010&\u001a\u00020\u0004\u0012\u0006\u0010'\u001a\u00020\u0004¢\u0006\u0004\b(\u0010)¨\u0006+"}, d2 = {"Lgg1/v0;", "", "Lzi2/a;", "connectEnvironment", "", "gcsConnectHost", "gcsHost", "gcs", "shareActivityPrefix", "shareEpicActivityPrefix", "golf", "uploadService", "connectIqAppStore", "itServicesApi", "livetrackUrl", "stravaOauthUrl", "geolocationUrl", "feedbackUrl", "supportUrl", "staticUrl", "staticCdnUrl", "webUrl", "gcWebUrl", "forumUrl", "buyUrl", "gcsApiUrl", "mapTileUrl", "deviceSettingsHostUrl", "subscriptionsUrl", "eccUrl", "communicationServicesURL", "garminHealthServicesUrl", "trailsUrl", "connectIqAppSettings", "shortLinkDomain", "omtDomain", "omtCmsDomain", "inReachUrl", "messengerUrl", "gcxUrl", "<init>", "(Ljava/lang/String;ILzi2/a;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "a", "gcm-common-base_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class v0 {
    AquaServerEnvironment(zi2.a.AQUA, "gcs.test.garmin.com", "bronze.garmin.com", "bronze.garmin.com/OBN/OBNServlet", "connectaqua.dev.garmin.com/modern/activity/", "connectaqua.dev.garmin.com/app/epic/", "golftest.garmin.com/gcs-golfcommunity/api/v2/", "omtstg.garmin.com/UploadConfigurationService/UnitUploadSettings/", "apps-dev.garmin.com/gcm", "servicestest.garmin.com", "livetracktest.garmin.com/", "connectaqua.dev.garmin.com/modern?web_token=", "api.gcs.test.garmin.com", "appreview-test.garmin.com", "support.garmin.com", "static.garmin.com", "static.garmincdn.com", "www.garmin.com", "connectaqua.dev.garmin.com", "forums.garmin.com/apps-software/mobile-apps-web/f/garmin-connect-mobile-andriod", "buy.garmin.com", "api.gcs.test.garmin.com", "test.gcx.garmin.com/maptile", "connecttest.garmin.com/mobile-data/v2/", "test.subscriptions.garmin.com", "test-api.ecc.garmin.com", "message-test.communication.services.garmin.com/", "ghs-stg.garmin.com", "api-didt-test.garmin.com", "apps.garmin.com", "test.gar.mn", "omttest.garmin.com/", "cms.omttest.garmin.com", "test-messenger.inreachapp.com", "messenger.garmin.com", "test.gcx.garmin.com"),
    TestServerEnvironment(zi2.a.TEST, "gcs.test.garmin.com", "bronze.garmin.com", "bronze.garmin.com/OBN/OBNServlet", "connecttest.garmin.com/modern/activity/", "connecttest.garmin.com/app/epic/", "golftest.garmin.com/gcs-golfcommunity/api/v2/", "omtstg.garmin.com/UploadConfigurationService/UnitUploadSettings/", "apps-test.garmin.com/gcm", "servicestest.garmin.com", "livetracktest.garmin.com/", "connecttest.garmin.com/modern?web_token=", "api.gcs.test.garmin.com", "appreview-test.garmin.com", "support.garmin.com", "static.garmin.com", "static.garmincdn.com", "www.garmin.com", "connecttest.garmin.com", "forums.garmin.com/apps-software/mobile-apps-web/f/garmin-connect-mobile-andriod", "buy.garmin.com", "api.gcs.test.garmin.com", "test.gcx.garmin.com/maptile", "connecttest.garmin.com/mobile-data/v2/", "test.subscriptions.garmin.com", "test-api.ecc.garmin.com", "message-test.communication.services.garmin.com/", "ghs-stg.garmin.com", "api-didt-test.garmin.com", "apps-test.garmin.com", "test.gar.mn", "omttest.garmin.com/", "cms.omttest.garmin.com", "test-messenger.inreachapp.com", "messenger.garmin.com", "test.gcx.garmin.com"),
    /* JADX INFO: Fake field, exist only in values array */
    DemoServerEnvironment(zi2.a.DEMO, "gold-kc3.garmin.com", "gold-kc3.garmin.com/OBN/OBNServlet", "kc3.connect.garmin.com/modern/activity/", "golf.garmin.com/gcs-golfcommunity/api/v2/", "golf.garmin.com/gcs-golfcommunity/app/epic/", "omt.kcg.garmin.com/UploadConfigurationService/UnitUploadSettings/", "apps.garmin.com/gcm", "services-kcg.garmin.com", "livetrack.garmin.com/", "kc3.connect.garmin.com/modern?web_token=", "api.gcs.garmin.com", "appreview.garmin.com", "support.garmin.com", "gems.garmin.com", "static.garmin.com", "static.garmincdn.com", "www.garmin.com", "kc3.connect.garmin.com", "forums.garmin.com/apps-software/mobile-apps-web/f/garmin-connect-mobile-andriod", "buy.garmin.com", "api.gcs.kc3.garmin.com", "test.gcx.garmin.com/maptile", "connecttest.garmin.com/mobile-data/v2/", "test.subscriptions.garmin.com", "test-api.ecc.garmin.com", "message-test.communication.services.garmin.com/", "ghs-stg.garmin.com", "api-didt-test.garmin.com", "apps.garmin.com", "test.gar.mn", "omt.kcg.garmin.com/", "cms.omttest.garmin.com", "test-messenger.inreachapp.com", "messenger.garmin.com", "test.gcx.garmin.com"),
    PinkServerEnvironment(zi2.a.PINK, "gcs.test.garmin.com", "bronze.garmin.com", "bronze.garmin.com/OBN/OBNServlet", "connectpink.garmin.com/modern/activity/", "connectpink.garmin.com/app/epic/", "golftest.garmin.com/gcs-golfcommunity/api/v2/", "omtstg.garmin.com/UploadConfigurationService/UnitUploadSettings/", "apps-dev.garmin.com/gcm", "servicestest.garmin.com", "livetracktest.garmin.com/", "connecttest.garmin.com/modern?web_token=", "api.gcs.test.garmin.com", "appreview-test.garmin.com", "support.garmin.com", "static.garmin.com", "static.garmincdn.com", "www.garmin.com", "connectpink.garmin.com", "forums.garmin.com/apps-software/mobile-apps-web/f/garmin-connect-mobile-andriod", "buy.garmin.com", "api.gcs.test.garmin.com", "test.gcx.garmin.com/maptile", "connecttest.garmin.com/mobile-data/v2/", "test.subscriptions.garmin.com", "test-api.ecc.garmin.com", "message-test.communication.services.garmin.com/", "ghs-stg.garmin.com", "api-didt-test.garmin.com", "apps.garmin.com", "test.gar.mn", "omttest.garmin.com/", "cms.omttest.garmin.com", "test-messenger.inreachapp.com", "messenger.garmin.com", "test.gcx.garmin.com"),
    /* JADX INFO: Fake field, exist only in values array */
    RedServerEnvironment(zi2.a.RED, "gcs.test.garmin.com", "bronze.garmin.com", "bronze.garmin.com/OBN/OBNServlet", "connectred.garmin.com/modern/activity/", "connectred.garmin.com/app/epic/", "golftest.garmin.com/gcs-golfcommunity/api/v2/", "omtstg.garmin.com/UploadConfigurationService/UnitUploadSettings/", "apps-dev.garmin.com/gcm", "servicestest.garmin.com", "livetracktest.garmin.com/", "connecttest.garmin.com/modern?web_token=", "api.gcs.test.garmin.com", "appreview-test.garmin.com", "support.garmin.com", "static.garmin.com", "static.garmincdn.com", "www.garmin.com", "connectred.garmin.com", "forums.garmin.com/apps-software/mobile-apps-web/f/garmin-connect-mobile-andriod", "buy.garmin.com", "api.gcs.test.garmin.com", "test.gcx.garmin.com/maptile", "connecttest.garmin.com/mobile-data/v2/", "test.subscriptions.garmin.com", "test-api.ecc.garmin.com", "message-test.communication.services.garmin.com/", "ghs-stg.garmin.com", "api-didt-test.garmin.com", "apps.garmin.com", "test.gar.mn", "omttest.garmin.com/", "cms.omttest.garmin.com", "test-messenger.inreachapp.com", "messenger.garmin.com", "test.gcx.garmin.com"),
    /* JADX INFO: Fake field, exist only in values array */
    BlueServerEnvironment(zi2.a.BLUE, "gcs.test.garmin.com", "bronze.garmin.com", "bronze.garmin.com/OBN/OBNServlet", "connectblue.garmin.com/modern/activity/", "connectblue.garmin.com/app/epic/", "golftest.garmin.com/gcs-golfcommunity/api/v2/", "omtstg.garmin.com/UploadConfigurationService/UnitUploadSettings/", "apps-dev.garmin.com/gcm", "servicestest.garmin.com", "livetracktest.garmin.com/", "connecttest.garmin.com/modern?web_token=", "api.gcs.test.garmin.com", "appreview-test.garmin.com", "support.garmin.com", "static.garmin.com", "static.garmincdn.com", "www.garmin.com", "connectblue.garmin.com", "forums.garmin.com/apps-software/mobile-apps-web/f/garmin-connect-mobile-andriod", "buy.garmin.com", "api.gcs.test.garmin.com", "test.gcx.garmin.com/maptile", "connecttest.garmin.com/mobile-data/v2/", "test.subscriptions.garmin.com", "test-api.ecc.garmin.com", "message-test.communication.services.garmin.com/", "ghs-stg.garmin.com", "api-didt-test.garmin.com", "apps.garmin.com", "test.gar.mn", "omttest.garmin.com/", "cms.omttest.garmin.com", "test-messenger.inreachapp.com", "messenger.garmin.com", "test.gcx.garmin.com"),
    ProdServerEnvironment(zi2.a.PROD, "gcs.garmin.com", "gold.garmin.com", "gold.garmin.com/OBN/OBNServlet", "connect.garmin.com/modern/activity/", "connect.garmin.com/app/epic/", "golf.garmin.com/gcs-golfcommunity/api/v2/", "omt.garmin.com/UploadConfigurationService/UnitUploadSettings/", "apps.garmin.com/gcm", "services.garmin.com", "livetrack.garmin.com/", "connect.garmin.com/modern?web_token=", "api.gcs.garmin.com", "appreview.garmin.com", "support.garmin.com", "static.garmin.com", "static.garmincdn.com", "www.garmin.com", "connect.garmin.com", "forums.garmin.com/apps-software/mobile-apps-web/f/garmin-connect-mobile-andriod", "buy.garmin.com", "api.gcs.garmin.com", "gcx.garmin.com/maptile", "connect.garmin.com/mobile-data/v2/", "subscriptions.garmin.com", "api.ecc.garmin.com", "message.communication.services.garmin.com/", "ghs.garmin.com", "api-didt.garmin.com", "apps.garmin.com", "gar.mn", "omt.garmin.com/", "cms.omt.garmin.com", "messenger.inreachapp.com", "messenger.garmin.com", "gcx.garmin.com"),
    ChinaServerEnvironment(zi2.a.CHINA, "gcs.garmin.cn", "gold-sni.garmin.cn", "gold-sni.garmin.cn/OBN/OBNServlet", "connect.garmin.cn/modern/activity/", "connect.garmin.cn/app/epic/", "golf.garmin.cn/gcs-golfcommunity/api/v2/", "omt.garmin.cn/UploadConfigurationService/UnitUploadSettings/", "apps.garmin.cn/gcm", "services.garmin.cn", "livetrack.garmin.com.tw/", "connect.garmin.cn/modern?web_token=", "api.gcs.garmin.cn", "appreview.garmin.cn", "support.garmin.com", "static.garmin.cn", "static.garmin.cn", "www.garmin.cn", "connect.garmin.cn", "forums.garmin.com/apps-software/mobile-apps-web/f/garmin-connect-mobile-andriod", "buy.garmin.com", "api.gcs.garmin.cn", "gcx.garmin.com/maptile", "connect.garmin.cn/mobile-data/v2/", "subscriptions.garmin.cn", "api.ecc.garmin.com", "message.communication.services.garmin.com/", "ghs.garmin.cn", "api-didt-test.garmin.com", "apps.garmin.cn", "s.garmin.cn", "omt.garmin.cn/", "cms.omttest.garmin.cn", "test-messenger.inreachapp.com", "messenger.garmin.com", "gcx.garmin.com"),
    /* JADX INFO: Fake field, exist only in values array */
    MangoServerEnvironment(zi2.a.MANGO, "gcs.test.garmin.com", "bronze.garmin.com", "bronze.garmin.com/OBN/OBNServlet", "connectmango.dev.garmin.com/modern/activity/", "connectmango.dev.garmin.com/app/epic/", "golftest.garmin.com/gcs-golfcommunity/api/v2/", "omtstg.garmin.com/UploadConfigurationService/UnitUploadSettings/", "apps-dev.garmin.com/gcm", "servicestest.garmin.com", "livetracktest.garmin.com/", "connecttest.garmin.com/modern?web_token=", "api.gcs.test.garmin.com", "appreview-test.garmin.com", "support.garmin.com", "static.garmin.com", "static.garmincdn.com", "www.garmin.com", "connectmango.dev.garmin.com", "forums.garmin.com/apps-software/mobile-apps-web/f/garmin-connect-mobile-andriod", "buy.garmin.com", "api.gcs.test.garmin.com", "test.gcx.garmin.com/maptile", "connecttest.garmin.com/mobile-data/v2/", "test.subscriptions.garmin.com", "test-api.ecc.garmin.com", "message-test.communication.services.garmin.com/", "ghs-stg.garmin.com", "api-didt-test.garmin.com", "apps.garmin.com", "test.gar.mn", "omttest.garmin.com/", "cms.omttest.garmin.cn", "test-messenger.inreachapp.com", "messenger.garmin.com", "test.gcx.garmin.com"),
    JadeServerEnvironment(zi2.a.JADE, "gcs.test.garmin.com", "bronze.garmin.com", "bronze.garmin.com/OBN/OBNServlet", "connectjade.garmin.com/modern/activity/", "connectjade.garmin.com/app/epic/", "golftest.garmin.com/gcs-golfcommunity/api/v2/", "omtstg.garmin.com/UploadConfigurationService/UnitUploadSettings/", "apps-dev.garmin.com/gcm", "servicestest.garmin.com", "livetracktest.garmin.com/", "connecttest.garmin.com/modern?web_token=", "api.gcs.test.garmin.com", "appreview-test.garmin.com", "support.garmin.com", "static.garmin.com", "static.garmincdn.com", "www.garmin.com", "connectjade.garmin.com", "forums.garmin.com/apps-software/mobile-apps-web/f/garmin-connect-mobile-andriod", "buy.garmin.com", "api.gcs.test.garmin.com", "test.gcx.garmin.com/maptile", "connecttest.garmin.com/mobile-data/v2/", "test.subscriptions.garmin.com", "test-api.ecc.garmin.com", "message-test.communication.services.garmin.com/", "ghs-stg.garmin.com", "api-didt-test.garmin.com", "apps.garmin.com", "test.gar.mn", "omttest.garmin.com/", "cms.omttest.garmin.com", "test-messenger.inreachapp.com", "messenger.garmin.com", "test.gcx.garmin.com"),
    TestSSOChinaServerEnvironment(zi2.a.TEST_SSO_CHINA, "gcs.test.garmin.com", "bronze.garmin.com", "bronze.garmin.com/OBN/OBNServlet", "connecttest.garmin.com/modern/activity/", "connecttest.garmin.com/app/epic/", "golftest.garmin.com/gcs-golfcommunity/api/v2/", "omtstg.garmin.com/UploadConfigurationService/UnitUploadSettings/", "apps-test.garmin.com/gcm", "servicestest.garmin.com", "livetracktest.garmin.com/", "connecttest.garmin.com/modern?web_token=", "api.gcs.test.garmin.com", "appreview-test.garmin.com", "support.garmin.com", "static.garmin.com", "static.garmincdn.com", "www.garmin.com", "connecttest.garmin.com", "forums.garmin.com/apps-software/mobile-apps-web/f/garmin-connect-mobile-andriod", "buy.garmin.com", "api.gcs.test.garmin.com", "test.gcx.garmin.com/maptile", "connecttest.garmin.com/mobile-data/v2/", "test.subscriptions.garmin.com", "test-api.ecc.garmin.com", "message-test.communication.services.garmin.com/", "ghs-stg.garmin.com", "api-didt-test.garmin.com", "apps-test.garmin.com", "test.gar.mn", "omttest.garmin.com/", "cms.omttest.garmin.com", "test-messenger.inreachapp.com", "messenger.garmin.com", "test.gcx.garmin.com");

    public static final a T;
    public static final v0[] X;
    public final String A;
    public final String B;
    public final String C;
    public final String D;
    public final String E;
    public final String F;
    public final String I;
    public final ConcurrentHashMap<Auth.Category, String> P;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final zi2.a f77335a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f77336b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f77337c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f77338d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f77339e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f77340f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f77341g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f77342h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final String f77343i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final String f77344j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final String f77345k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final String f77346l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final String f77347m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final String f77348n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final String f77349o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final String f77350p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final String f77351q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final String f77352r;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final String f77353t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final String f77354v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final String f77355w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final String f77356x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final String f77357y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final String f77358z;

    static {
        v0 v0Var = AquaServerEnvironment;
        v0 v0Var2 = TestServerEnvironment;
        v0 v0Var3 = PinkServerEnvironment;
        v0 v0Var4 = ProdServerEnvironment;
        v0 v0Var5 = ChinaServerEnvironment;
        v0 v0Var6 = JadeServerEnvironment;
        v0 v0Var7 = TestSSOChinaServerEnvironment;
        T = new a(null);
        X = new v0[]{v0Var, v0Var2, v0Var, v0Var3, v0Var, v0Var, v0Var4, v0Var5, v0Var, v0Var6, v0Var7};
    }

    private v0(zi2.a aVar, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, String str17, String str18, String str19, String str20, String str21, String str22, String str23, String str24, String str25, String str26, String str27, String str28, String str29, String str30, String str31, String str32, String str33, String str34, String str35) {
        super(str, i);
        this.f77335a = aVar;
        this.f77336b = str;
        this.f77337c = str2;
        this.f77338d = str3;
        this.f77339e = str4;
        this.f77340f = str5;
        this.f77341g = str6;
        this.f77342h = str8;
        this.f77343i = str9;
        this.f77344j = str13;
        this.f77345k = str14;
        this.f77346l = str15;
        this.f77347m = str16;
        this.f77348n = str17;
        this.f77349o = str18;
        this.f77350p = str20;
        this.f77351q = str21;
        this.f77352r = str22;
        this.f77353t = str23;
        this.f77354v = str24;
        this.f77355w = str25;
        this.f77356x = str26;
        this.f77357y = str27;
        this.f77358z = str28;
        this.A = str29;
        this.B = str30;
        this.C = str31;
        this.D = str32;
        this.E = str33;
        this.F = str34;
        this.I = str35;
        ConcurrentHashMap<Auth.Category, String> concurrentHashMap = new ConcurrentHashMap<>();
        this.P = concurrentHashMap;
        Context contextC = ((c22.o) KoinJavaComponent.get$default(c22.o.class, null, null, 6, null)).c();
        if (concurrentHashMap.isEmpty()) {
            Map<String, ?> all = contextC.getSharedPreferences("GCS_URL_OVERRIDES_KEY" + aVar.name(), 0).getAll();
            all.getClass();
            for (Map.Entry<String, ?> entry : all.entrySet()) {
                String key = entry.getKey();
                Object value = entry.getValue();
                try {
                    key.getClass();
                    concurrentHashMap.put(Auth.Category.valueOf(key), String.valueOf(value));
                } catch (Exception unused) {
                }
            }
        }
    }

    public static v0 valueOf(String str) {
        return (v0) Enum.valueOf(v0.class, str);
    }

    public static v0[] values() {
        return (v0[]) L0.clone();
    }

    public final String a() {
        return fb1.c.n("https://", this.f77335a.f204881b);
    }

    public final String b() {
        return fb1.c.n("https://", this.f77349o);
    }

    public final String c(Auth.Category category) {
        String str;
        if (category == null || (str = this.P.get(category)) == null) {
            return fb1.c.n("https://", this.f77338d);
        }
        return d53.u.y(str, "http", false) ? str : "https://".concat(str);
    }

    public final String d() {
        return fb1.c.n("https://", this.f77353t);
    }

    public final String e() {
        return fb1.c.n("https://", this.C);
    }

    public final String f() {
        return fb1.c.n("https://", this.f77352r);
    }

    public final void g() {
        this.P.clear();
        SharedPreferences sharedPreferences = ((c22.o) KoinJavaComponent.get$default(c22.o.class, null, null, 6, null)).c().getSharedPreferences("GCS_URL_OVERRIDES_KEY" + this.f77335a.name(), 0);
        sharedPreferences.getClass();
        SharedPreferences.Editor editorEdit = sharedPreferences.edit();
        editorEdit.clear();
        editorEdit.apply();
    }

    public final String h() {
        return fb1.c.n("https://", this.f77347m);
    }

    public final String i() {
        return fb1.c.n("https://", this.f77345k);
    }

    public final String k() {
        return fb1.c.n("https://", this.f77348n);
    }

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\u0006R\u0014\u0010\t\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\u0006R\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lgg1/v0$a;", "", "<init>", "()V", "", "CONNECT_GARMIN_STATUS_URL", "Ljava/lang/String;", "CONNECT_GARMIN_STATUS_CN_URL", "GCS_URL_OVERRIDES_KEY", "CONNECT_IQ_API_SUFFIX", "", "Lgg1/v0;", "mServerEnvironments", "[Lgg1/v0;", "gcm-common-base_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        /* JADX WARN: Code duplicated, block: B:10:0x001e  */
        /* JADX WARN: Code duplicated, block: B:12:0x0021 A[RETURN] */
        public static v0 a(String str) {
            str.getClass();
            for (v0 v0Var : v0.X) {
                if (p005kotlin.jvm.internal.s.g(v0Var.f77335a.name(), str)) {
                    if (v0Var == null) {
                        return v0.ProdServerEnvironment;
                    }
                    return v0Var;
                }
            }
            v0Var = null;
            if (v0Var == null) {
                return v0.ProdServerEnvironment;
            }
            return v0Var;
        }

        public static v0 b() {
            return a(((f12.b) KoinJavaComponent.get$default(f12.b.class, null, null, 6, null)).h().name());
        }

        private a() {
        }
    }
}
