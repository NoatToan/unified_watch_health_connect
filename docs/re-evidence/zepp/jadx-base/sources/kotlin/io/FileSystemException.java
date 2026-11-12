package kotlin.io;

import java.io.File;
import java.io.IOException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes23.dex */
public class FileSystemException extends IOException {

    @NotNull
    private final File a;

    @Nullable
    private final File b;

    @Nullable
    private final String c;

    public /* synthetic */ FileSystemException(File file, File file2, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(file, (i & 2) != 0 ? null : file2, (i & 4) != 0 ? null : str);
    }

    @NotNull
    public final File getFile() {
        return this.a;
    }

    @Nullable
    public final File getOther() {
        return this.b;
    }

    @Nullable
    public final String getReason() {
        return this.c;
    }

    public FileSystemException(@NotNull File file, @Nullable File file2, @Nullable String str) {
        super(ExceptionsKt.a(file, file2, str));
        this.a = file;
        this.b = file2;
        this.c = str;
    }
}
