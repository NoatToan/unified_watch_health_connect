package i62;

import java.util.HashMap;
import java.util.List;
import p005kotlin.Metadata;
import p13.x;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Li62/p;", "", "<init>", "()V", "gcm-workouts_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final p f91878a = new p();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final HashMap<String, List<Long>> f91879b = new HashMap<>();

    private p() {
    }

    public static void a(Long l14, String str) {
        if (str == null || str.length() == 0 || l14.longValue() <= 0) {
            return;
        }
        HashMap<String, List<Long>> map = f91879b;
        if (!map.containsKey(str)) {
            map.put(str, x.m(l14));
            return;
        }
        List<Long> list = map.get(str);
        if (list == null || list.contains(l14)) {
            return;
        }
        list.add(0, l14);
    }

    public static void b(long j8, String str) {
        List<Long> list;
        if (str == null || str.length() == 0 || j8 <= 0) {
            return;
        }
        HashMap<String, List<Long>> map = f91879b;
        if (!map.containsKey(str) || (list = map.get(str)) == null) {
            return;
        }
        list.remove(Long.valueOf(j8));
    }
}
