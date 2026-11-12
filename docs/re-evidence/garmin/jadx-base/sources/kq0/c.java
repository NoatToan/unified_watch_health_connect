package kq0;

import java.util.List;
import p005kotlin.Metadata;
import p13.x;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lkq0/c;", "", "<init>", "()V", "gcm-incident-detection_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final c f106153a = new c();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final List<Long> f106154b = x.k(200L, 1000L, 5000L);

    private c() {
    }

    public static long a(int i14) {
        if (1 > i14) {
            return -1L;
        }
        List<Long> list = f106154b;
        if (i14 <= list.size()) {
            return list.get(i14 - 1).longValue();
        }
        return -1L;
    }
}
