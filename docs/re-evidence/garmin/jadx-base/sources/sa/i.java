package sa;

import android.net.Uri;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: loaded from: classes.dex */
public final class i {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final AtomicLong f158115c = new AtomicLong();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Map<String, List<String>> f158116a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f158117b;

    public i(long j8, ha.g gVar, long j14) {
        this(j8, gVar, gVar.f82555a, Collections.EMPTY_MAP, j14, 0L, 0L);
    }

    public i(long j8, ha.g gVar, Uri uri, Map<String, List<String>> map, long j14, long j15, long j16) {
        this.f158116a = map;
        this.f158117b = j15;
    }
}
