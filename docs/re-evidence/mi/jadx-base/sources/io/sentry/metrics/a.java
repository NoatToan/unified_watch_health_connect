package io.sentry.metrics;

import java.nio.charset.Charset;
import java.util.Map;
import org.jetbrains.annotations.ApiStatus;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
@ApiStatus.Internal
public final class a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Charset f21744b = Charset.forName("UTF-8");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Map<Long, Map<String, e>> f21745a;

    public a(@NotNull Map<Long, Map<String, e>> map) {
        this.f21745a = map;
    }

    public byte[] a() {
        StringBuilder sb = new StringBuilder();
        for (Map.Entry<Long, Map<String, e>> entry : this.f21745a.entrySet()) {
            g.a(entry.getKey().longValue(), entry.getValue().values(), sb);
        }
        return sb.toString().getBytes(f21744b);
    }
}
