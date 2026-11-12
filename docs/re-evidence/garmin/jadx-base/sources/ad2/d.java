package ad2;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lad2/d;", "", "", "url", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "networking-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public enum d {
    PROD("https://omt.garmin.com"),
    CHINA("https://omt.garmin.cn"),
    CHINA_TEST("https://omt.garmin.cn"),
    DEMO("https://omtdemo.garmin.com"),
    TEST("https://omttest.garmin.com"),
    TEST_SSO_CHINA("https://omttest.garmin.com"),
    STAGE("https://omtstg.garmin.com");


    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f2788a;

    d(String str) {
        this.f2788a = str;
    }
}
