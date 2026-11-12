package sx2;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lsx2/c;", "", "", "ghsHostname", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "SaMD_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public enum c {
    /* JADX INFO: Fake field, exist only in values array */
    PROD("ghs.garmin.com"),
    /* JADX INFO: Fake field, exist only in values array */
    TEST("ghs-stg.garmin.com"),
    /* JADX INFO: Fake field, exist only in values array */
    TEST_SSO_CHINA("ghs-stg.garmin.com"),
    /* JADX INFO: Fake field, exist only in values array */
    CHINA("ghs.garmin.cn");


    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f161147a;

    c(String str) {
        this.f161147a = str;
    }
}
