package io.sentry.internal.modules;

import io.sentry.ILogger;
import io.sentry.SentryLevel;
import java.net.URL;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.jetbrains.annotations.ApiStatus;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@ApiStatus.Internal
@ApiStatus.Experimental
public final class c extends d {
    public final Pattern d;
    public final Pattern e;
    public final ClassLoader f;

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public final String f21723a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        public final String f21724b;

        public a(@NotNull String str, @NotNull String str2) {
            this.f21723a = str;
            this.f21724b = str2;
        }
    }

    public c(@NotNull ILogger iLogger) {
        this(c.class.getClassLoader(), iLogger);
    }

    @Override // io.sentry.internal.modules.d
    public Map<String, String> b() {
        HashMap map = new HashMap();
        for (a aVar : e()) {
            map.put(aVar.f21723a, aVar.f21724b);
        }
        return map;
    }

    @Nullable
    public final a d(@Nullable String str) {
        if (str == null) {
            return null;
        }
        Matcher matcher = this.e.matcher(str);
        if (matcher.matches() && matcher.groupCount() == 2) {
            return new a(matcher.group(1), matcher.group(2));
        }
        return null;
    }

    @NotNull
    public final List<a> e() {
        ArrayList arrayList = new ArrayList();
        try {
            Enumeration<URL> resources = this.f.getResources("META-INF/MANIFEST.MF");
            while (resources.hasMoreElements()) {
                a aVarD = d(f(resources.nextElement()));
                if (aVarD != null) {
                    arrayList.add(aVarD);
                }
            }
        } catch (Throwable th) {
            this.f21725a.a(SentryLevel.ERROR, "Unable to detect modules via manifest files.", th);
        }
        return arrayList;
    }

    @Nullable
    public final String f(@NotNull URL url) {
        Matcher matcher = this.d.matcher(url.toString());
        if (matcher.matches() && matcher.groupCount() == 1) {
            return matcher.group(1);
        }
        return null;
    }

    public c(@Nullable ClassLoader classLoader, @NotNull ILogger iLogger) {
        super(iLogger);
        this.d = Pattern.compile(".*/(.+)!/META-INF/MANIFEST.MF");
        this.e = Pattern.compile("(.*?)-(\\d+\\.\\d+.*).jar");
        this.f = io.sentry.util.a.a(classLoader);
    }
}
