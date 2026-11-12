package kotlin.io;

import java.io.File;
import java.util.List;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes23.dex */
public final class FilePathComponents {

    @NotNull
    private final File a;

    @NotNull
    private final List<File> b;

    /* JADX WARN: Multi-variable type inference failed */
    public FilePathComponents(@NotNull File file, @NotNull List<? extends File> list) {
        this.a = file;
        this.b = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ FilePathComponents copy$default(FilePathComponents filePathComponents, File file, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            file = filePathComponents.a;
        }
        if ((i & 2) != 0) {
            list = filePathComponents.b;
        }
        return filePathComponents.copy(file, list);
    }

    @NotNull
    public final File component1() {
        return this.a;
    }

    @NotNull
    public final List<File> component2() {
        return this.b;
    }

    @NotNull
    public final FilePathComponents copy(@NotNull File file, @NotNull List<? extends File> list) {
        return new FilePathComponents(file, list);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FilePathComponents)) {
            return false;
        }
        FilePathComponents filePathComponents = (FilePathComponents) obj;
        return Intrinsics.areEqual(this.a, filePathComponents.a) && Intrinsics.areEqual(this.b, filePathComponents.b);
    }

    @NotNull
    public final File getRoot() {
        return this.a;
    }

    @NotNull
    public final String getRootName() {
        return this.a.getPath();
    }

    @NotNull
    public final List<File> getSegments() {
        return this.b;
    }

    public final int getSize() {
        return this.b.size();
    }

    public int hashCode() {
        return (this.a.hashCode() * 31) + this.b.hashCode();
    }

    public final boolean isRooted() {
        return this.a.getPath().length() > 0;
    }

    @NotNull
    public final File subPath(int i, int i2) {
        if (i < 0 || i > i2 || i2 > getSize()) {
            throw new IllegalArgumentException();
        }
        return new File(CollectionsKt___CollectionsKt.joinToString$default(this.b.subList(i, i2), File.separator, null, null, 0, null, null, 62, null));
    }

    @NotNull
    public String toString() {
        return "FilePathComponents(root=" + this.a + ", segments=" + this.b + ')';
    }
}
