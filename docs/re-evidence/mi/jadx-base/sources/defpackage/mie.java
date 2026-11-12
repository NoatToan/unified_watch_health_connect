package defpackage;

import android.net.Uri;
import com.google.android.exoplayer2.upstream.b;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: loaded from: classes4.dex */
public final class mie {
    public static final AtomicLong h = new AtomicLong();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f26212a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b f26213b;
    public final Uri c;
    public final Map<String, List<String>> d;
    public final long e;
    public final long f;
    public final long g;

    public mie(long j, b bVar, long j2) {
        this(j, bVar, bVar.f8404a, Collections.emptyMap(), j2, 0L, 0L);
    }

    public static long a() {
        return h.getAndIncrement();
    }

    public mie(long j, b bVar, Uri uri, Map<String, List<String>> map, long j2, long j3, long j4) {
        this.f26212a = j;
        this.f26213b = bVar;
        this.c = uri;
        this.d = map;
        this.e = j2;
        this.f = j3;
        this.g = j4;
    }
}
