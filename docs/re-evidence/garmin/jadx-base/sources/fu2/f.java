package fu2;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lfu2/f;", "", "", "host", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "weather_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public enum f {
    PROD("https://api.gcs.garmin.com/weather"),
    CHINA("https://api.gcs.garmin.cn/weather"),
    CHINA_TEST("https://api.gcs.garmin.cn/weather"),
    TEST("https://api.gcs.test.garmin.com/weather"),
    TEST_SSO_CHINA("https://api.gcs.test.garmin.com/weather");


    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f73586a;

    f(String str) {
        this.f73586a = str;
    }
}
