package io.sentry.internal.modules;

import io.sentry.ILogger;
import io.sentry.SentryLevel;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.Charset;
import java.util.Map;
import java.util.TreeMap;
import org.jetbrains.annotations.ApiStatus;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@ApiStatus.Internal
public abstract class d implements b {
    public static final Charset c = Charset.forName("UTF-8");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final ILogger f21725a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public Map<String, String> f21726b = null;

    public d(@NotNull ILogger iLogger) {
        this.f21725a = iLogger;
    }

    @Override // io.sentry.internal.modules.b
    @Nullable
    public Map<String, String> a() {
        Map<String, String> map = this.f21726b;
        if (map != null) {
            return map;
        }
        Map<String, String> mapB = b();
        this.f21726b = mapB;
        return mapB;
    }

    public abstract Map<String, String> b();

    public Map<String, String> c(@NotNull InputStream inputStream) {
        TreeMap treeMap = new TreeMap();
        try {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream, c));
            try {
                for (String line = bufferedReader.readLine(); line != null; line = bufferedReader.readLine()) {
                    int iLastIndexOf = line.lastIndexOf(58);
                    treeMap.put(line.substring(0, iLastIndexOf), line.substring(iLastIndexOf + 1));
                }
                this.f21725a.c(SentryLevel.DEBUG, "Extracted %d modules from resources.", Integer.valueOf(treeMap.size()));
                bufferedReader.close();
            } catch (Throwable th) {
                try {
                    bufferedReader.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        } catch (IOException e) {
            this.f21725a.a(SentryLevel.ERROR, "Error extracting modules.", e);
        } catch (RuntimeException e2) {
            this.f21725a.b(SentryLevel.ERROR, e2, "%s file is malformed.", "sentry-external-modules.txt");
        }
        return treeMap;
    }
}
