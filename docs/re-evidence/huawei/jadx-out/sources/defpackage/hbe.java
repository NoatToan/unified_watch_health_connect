package defpackage;

import com.huawei.health.sportservice.download.cloud.VoiceDataApi;

/* JADX INFO: loaded from: classes8.dex */
public class hbe {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static volatile VoiceDataApi f36345b;
    private static final Object d = new Object();

    public static VoiceDataApi e() {
        if (f36345b == null) {
            synchronized (d) {
                if (f36345b == null) {
                    f36345b = new hbb();
                }
            }
        }
        return f36345b;
    }
}
