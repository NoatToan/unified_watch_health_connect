package wr2;

import org.slf4j.Marker;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lwr2/h;", "", "<init>", "()V", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final h f186860a = new h();

    private h() {
    }

    public static String a(int i14, boolean z14) {
        if (i14 < 0) {
            return am.j.h(Math.abs(i14), "-$");
        }
        if (i14 == 0) {
            return "$0";
        }
        return vb.h.h(Math.abs(i14), z14 ? Marker.ANY_NON_NULL_MARKER : "", "$");
    }
}
