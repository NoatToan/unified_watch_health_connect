package zi2;

import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0007B\u0019\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\b"}, d2 = {"Lzi2/a;", "", "", "ssoHost", "hostName", "<init>", "(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;)V", "a", "networking-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public enum a {
    PROD("sso.garmin.com", "connectapi.garmin.com"),
    CHINA("sso.garmin.cn", "connectapi.garmin.cn"),
    CHINA_TEST("sso.garmin.cn", "connectapi.garmin.cn"),
    TEST("ssotest.garmin.com", "connectapitest.garmin.com"),
    TEST_SSO_CHINA("ssotest-china.garmin.com", "connectapitest.garmin.com"),
    PINK("ssotest-china.garmin.com", "connectapipink.garmin.com"),
    STAGE("ssostg.garmin.com", "connectapistg.garmin.com"),
    DEMO("ssotest.garmin.com", "connectapidemo.garmin.com"),
    BLUE("ssotest.garmin.com", "connectapiblue.garmin.com"),
    RED("ssotest.garmin.com", "connectapired.garmin.com"),
    AQUA("ssotest.garmin.com", "connectapiaqua.garmin.com"),
    MANGO("ssotest.garmin.com", "connectapimango.garmin.com"),
    JADE("ssotest.garmin.com", "connectapijade.garmin.com");


    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f204880a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f204881b;

    static {
        new C3824a(null);
    }

    a(String str, String str2) {
        this.f204880a = str;
        this.f204881b = str2;
    }

    /* JADX INFO: renamed from: zi2.a$a, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lzi2/a$a;", "", "<init>", "()V", "", "CONNECT_MOBILE_PACKAGE", "Ljava/lang/String;", "networking-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class C3824a {
        public /* synthetic */ C3824a(j jVar) {
            this();
        }

        private C3824a() {
        }
    }
}
