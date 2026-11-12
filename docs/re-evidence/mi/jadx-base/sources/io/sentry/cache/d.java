package io.sentry.cache;

import defpackage.fsd;
import io.sentry.SentryLevel;
import io.sentry.SentryOptions;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.nio.charset.Charset;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Charset f21675a = Charset.forName("UTF-8");

    public static void a(@NotNull SentryOptions sentryOptions, @NotNull String str, @NotNull String str2) {
        File fileB = b(sentryOptions, str);
        if (fileB == null) {
            sentryOptions.getLogger().c(SentryLevel.INFO, "Cache dir is not set, cannot delete from scope cache", new Object[0]);
            return;
        }
        File file = new File(fileB, str2);
        if (file.exists()) {
            sentryOptions.getLogger().c(SentryLevel.DEBUG, "Deleting %s from scope cache", str2);
            if (file.delete()) {
                return;
            }
            sentryOptions.getLogger().c(SentryLevel.ERROR, "Failed to delete: %s", file.getAbsolutePath());
        }
    }

    @Nullable
    public static File b(@NotNull SentryOptions sentryOptions, @NotNull String str) {
        String cacheDirPath = sentryOptions.getCacheDirPath();
        if (cacheDirPath == null) {
            return null;
        }
        File file = new File(cacheDirPath, str);
        file.mkdirs();
        return file;
    }

    @Nullable
    public static <T, R> T c(@NotNull SentryOptions sentryOptions, @NotNull String str, @NotNull String str2, @NotNull Class<T> cls, @Nullable fsd<R> fsdVar) {
        File fileB = b(sentryOptions, str);
        if (fileB == null) {
            sentryOptions.getLogger().c(SentryLevel.INFO, "Cache dir is not set, cannot read from scope cache", new Object[0]);
            return null;
        }
        File file = new File(fileB, str2);
        if (file.exists()) {
            try {
                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream(file), f21675a));
                try {
                    if (fsdVar == null) {
                        T t = (T) sentryOptions.getSerializer().b(bufferedReader, cls);
                        bufferedReader.close();
                        return t;
                    }
                    T t2 = (T) sentryOptions.getSerializer().c(bufferedReader, cls, fsdVar);
                    bufferedReader.close();
                    return t2;
                } catch (Throwable th) {
                    try {
                        bufferedReader.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            } catch (Throwable th3) {
                sentryOptions.getLogger().b(SentryLevel.ERROR, th3, "Error reading entity from scope cache: %s", str2);
            }
        } else {
            sentryOptions.getLogger().c(SentryLevel.DEBUG, "No entry stored for %s", str2);
        }
        return null;
    }

    public static <T> void d(@NotNull SentryOptions sentryOptions, @NotNull T t, @NotNull String str, @NotNull String str2) {
        File fileB = b(sentryOptions, str);
        if (fileB == null) {
            sentryOptions.getLogger().c(SentryLevel.INFO, "Cache dir is not set, cannot store in scope cache", new Object[0]);
            return;
        }
        File file = new File(fileB, str2);
        if (file.exists()) {
            sentryOptions.getLogger().c(SentryLevel.DEBUG, "Overwriting %s in scope cache", str2);
            if (!file.delete()) {
                sentryOptions.getLogger().c(SentryLevel.ERROR, "Failed to delete: %s", file.getAbsolutePath());
            }
        }
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            try {
                BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(fileOutputStream, f21675a));
                try {
                    sentryOptions.getSerializer().a(t, bufferedWriter);
                    bufferedWriter.close();
                    fileOutputStream.close();
                } catch (Throwable th) {
                    try {
                        bufferedWriter.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            } catch (Throwable th3) {
                try {
                    fileOutputStream.close();
                } catch (Throwable th4) {
                    th3.addSuppressed(th4);
                }
                throw th3;
            }
        } catch (Throwable th5) {
            sentryOptions.getLogger().b(SentryLevel.ERROR, th5, "Error persisting entity: %s", str2);
        }
    }
}
