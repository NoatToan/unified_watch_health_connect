package defpackage;

import io.sentry.ILogger;
import java.io.IOException;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
public interface h4h {
    h4h a() throws IOException;

    h4h b() throws IOException;

    h4h beginObject() throws IOException;

    h4h c(@Nullable String str) throws IOException;

    h4h d(long j) throws IOException;

    h4h e(double d) throws IOException;

    h4h endObject() throws IOException;

    h4h f(boolean z) throws IOException;

    h4h g(@NotNull String str) throws IOException;

    h4h h(@Nullable String str) throws IOException;

    h4h i(@Nullable Number number) throws IOException;

    h4h j(@NotNull ILogger iLogger, @Nullable Object obj) throws IOException;

    h4h k(@Nullable Boolean bool) throws IOException;

    h4h l() throws IOException;

    void setLenient(boolean z);
}
