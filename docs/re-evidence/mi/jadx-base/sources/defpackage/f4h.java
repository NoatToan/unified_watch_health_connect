package defpackage;

import io.sentry.ILogger;
import io.sentry.SentryLevel;
import io.sentry.vendor.gson.stream.JsonToken;
import java.io.Closeable;
import java.io.IOException;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.TimeZone;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
public interface f4h extends Closeable {
    @Nullable
    static Date w(@Nullable String str, @NotNull ILogger iLogger) {
        if (str == null) {
            return null;
        }
        try {
            try {
                return yq5.e(str);
            } catch (Exception e) {
                iLogger.a(SentryLevel.ERROR, "Error when deserializing millis timestamp format.", e);
                return null;
            }
        } catch (Exception unused) {
            return yq5.f(str);
        }
    }

    @Nullable
    <T> T A(@NotNull ILogger iLogger, @NotNull fsd<T> fsdVar) throws Exception;

    @Nullable
    String B() throws IOException;

    @Nullable
    <T> List<T> C(@NotNull ILogger iLogger, @NotNull fsd<T> fsdVar) throws IOException;

    @Nullable
    Float I() throws IOException;

    @Nullable
    TimeZone V(ILogger iLogger) throws IOException;

    @Nullable
    Double W() throws IOException;

    void beginObject() throws IOException;

    @Nullable
    <T> Map<String, List<T>> e0(@NotNull ILogger iLogger, @NotNull fsd<T> fsdVar) throws IOException;

    void endObject() throws IOException;

    @Nullable
    Integer h0() throws IOException;

    @Nullable
    Long j0() throws IOException;

    void l0(ILogger iLogger, Map<String, Object> map, String str);

    double nextDouble() throws IOException;

    float nextFloat() throws IOException;

    int nextInt() throws IOException;

    long nextLong() throws IOException;

    @NotNull
    String nextName() throws IOException;

    String nextString() throws IOException;

    @NotNull
    JsonToken peek() throws IOException;

    @Nullable
    Object q0() throws IOException;

    @Nullable
    Date r(ILogger iLogger) throws IOException;

    void setLenient(boolean z);

    void skipValue() throws IOException;

    @Nullable
    Boolean t() throws IOException;

    @Nullable
    <T> Map<String, T> v(@NotNull ILogger iLogger, @NotNull fsd<T> fsdVar) throws IOException;
}
