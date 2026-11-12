package nd2;

import java.util.HashMap;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lnd2/a;", "", "<init>", "()V", "networking-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f125408a = new a();

    private a() {
    }

    public static final HashMap a(Long l14, String str, String str2) {
        HashMap map = new HashMap(3);
        map.put("X-Garmin-Unit-Id", String.valueOf(l14.longValue()));
        if (str != null) {
            map.put("X-Garmin-Firmware-Version", str);
        }
        if (str2 != null) {
            map.put("X-Garmin-SW-Part-Number", str2);
        }
        return map;
    }
}
