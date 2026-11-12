package u92;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lu92/a;", "", "", "baseURL", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "garmin-consent_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public enum a {
    PROD("https://consent-text.privacy.services.garmin.com"),
    CHINA("https://services.garmin.cn"),
    CHINA_TEST("https://services.garmin.cn"),
    TEST("https://test.consent-text.privacy.services.garmin.com"),
    TEST_SSO_CHINA("https://test.consent-text.privacy.services.garmin.com"),
    STAGE("https://staging.consent-text.privacy.services.garmin.com"),
    DEMO("https://test.consent-text.privacy.services.garmin.com"),
    PINK("https://test.consent-text.privacy.services.garmin.com"),
    BLUE("https://test.consent-text.privacy.services.garmin.com"),
    RED("https://test.consent-text.privacy.services.garmin.com"),
    AQUA("https://test.consent-text.privacy.services.garmin.com"),
    MANGO("https://test.consent-text.privacy.services.garmin.com"),
    JADE("https://test.consent-text.privacy.services.garmin.com");


    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f169576a;

    a(String str) {
        this.f169576a = str;
    }
}
