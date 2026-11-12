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
public final class fvg implements eyc {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final fvg f18287a = new fvg();

    public static fvg g() {
        return f18287a;
    }

    @Override // defpackage.eyc
    public <T> void a(@NotNull T t, @NotNull Writer writer) throws IOException {
    }

    @Override // defpackage.eyc
    @Nullable
    public <T> T b(@NotNull Reader reader, @NotNull Class<T> cls) {
        return null;
    }

    @Override // defpackage.eyc
    @Nullable
    public <T, R> T c(@NotNull Reader reader, @NotNull Class<T> cls, @Nullable fsd<R> fsdVar) {
        return null;
    }

    @Override // defpackage.eyc
    public void d(@NotNull jul julVar, @NotNull OutputStream outputStream) throws Exception {
    }

    @Override // defpackage.eyc
    @Nullable
    public jul e(@NotNull InputStream inputStream) {
        return null;
    }

    @Override // defpackage.eyc
    @NotNull
    public String f(@NotNull Map<String, Object> map) throws Exception {
        return "";
    }
}
