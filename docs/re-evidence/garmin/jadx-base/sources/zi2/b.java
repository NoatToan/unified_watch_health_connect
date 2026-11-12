package zi2;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0019\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lzi2/b;", "", "", "hostName", "hostNameChina", "<init>", "(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;)V", "networking-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public enum b {
    /* JADX INFO: Fake field, exist only in values array */
    GARMIN("static.garmin.com", "static.garmin.cn"),
    /* JADX INFO: Fake field, exist only in values array */
    GARMIN_SERVICES("services.garmin.com", "services.garmin.cn"),
    GARMIN_ATP_GATEWAY("connect.garmin.com", "connect.garmin.cn"),
    GARMIN_ATP_GATEWAY_TEST("connecttest.garmin.com", "connecttest.garmin.cn"),
    GARMIN_VIDEO("connectvideo.garmin.com", "connectvideo.garmin.cn");


    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f204886a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f204887b;

    b(String str, String str2) {
        this.f204886a = str;
        this.f204887b = str2;
    }
}
