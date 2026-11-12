package defpackage;

import io.sentry.util.p;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URL;
import java.util.Map;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
public final class iok {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final URL f21951a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final Map<String, String> f21952b;

    public iok(@NotNull String str, @NotNull Map<String, String> map) {
        p.c(str, "url is required");
        p.c(map, "headers is required");
        try {
            this.f21951a = URI.create(str).toURL();
            this.f21952b = map;
        } catch (MalformedURLException e) {
            throw new IllegalArgumentException("Failed to compose the Sentry's server URL.", e);
        }
    }

    @NotNull
    public Map<String, String> a() {
        return this.f21952b;
    }

    @NotNull
    public URL b() {
        return this.f21951a;
    }
}
