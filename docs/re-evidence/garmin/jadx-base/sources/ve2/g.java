package ve2;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lve2/g;", "", "", "baseURL", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "networking-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public enum g {
    PROD("https://mobile-auth.security.services.garmin.com"),
    CHINA("https://mobile-auth.security.services.garmin.cn"),
    CHINA_TEST("https://mobile-auth.security.services.garmin.cn"),
    TEST("https://mobile-auth-test.security.services.garmin.com"),
    TEST_SSO_CHINA("https://mobile-auth-test.security.services.garmin.com"),
    STAGE("https://mobile-auth-stg.security.services.garmin.com"),
    DEMO("https://mobile-auth-test.security.services.garmin.com"),
    PINK("https://mobile-auth-test.security.services.garmin.com"),
    BLUE("https://mobile-auth-test.security.services.garmin.com"),
    RED("https://mobile-auth-test.security.services.garmin.com"),
    AQUA("https://mobile-auth-test.security.services.garmin.com"),
    MANGO("https://mobile-auth-test.security.services.garmin.com"),
    JADE("https://mobile-auth-test.security.services.garmin.com");


    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f177738a;

    g(String str) {
        this.f177738a = str;
    }
}
