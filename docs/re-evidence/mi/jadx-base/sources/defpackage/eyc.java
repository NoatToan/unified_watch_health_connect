package defpackage;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.Reader;
import java.io.Writer;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
public interface eyc {
    <T> void a(@NotNull T t, @NotNull Writer writer) throws IOException;

    @Nullable
    <T> T b(@NotNull Reader reader, @NotNull Class<T> cls);

    @Nullable
    <T, R> T c(@NotNull Reader reader, @NotNull Class<T> cls, @Nullable fsd<R> fsdVar);

    void d(@NotNull jul julVar, @NotNull OutputStream outputStream) throws Exception;

    @Nullable
    jul e(@NotNull InputStream inputStream);

    @NotNull
    String f(@NotNull Map<String, Object> map) throws Exception;
}
