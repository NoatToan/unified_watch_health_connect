package fn1;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lfn1/v;", "", "<init>", "()V", "gcm-sleep_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final v f72251a = new v();

    private v() {
    }

    public static long a(int i14, Integer num) {
        long jE = e53.e.e(i14, e53.f.HOURS);
        return num != null ? e53.c.h(jE, e53.e.e(num.intValue(), e53.f.MINUTES)) : jE;
    }
}
