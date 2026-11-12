package kotlin.io.path;

import java.nio.file.Path;
import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
final class PathNode {

    @Nullable
    private Iterator<PathNode> contentIterator;

    @Nullable
    private final Object key;

    @Nullable
    private final PathNode parent;

    @NotNull
    private final Path path;

    public PathNode(@NotNull Path path, @Nullable Object obj, @Nullable PathNode pathNode) {
        Intrinsics.checkNotNullParameter(path, "path");
        this.path = path;
        this.key = obj;
        this.parent = pathNode;
    }

    @Nullable
    public final Iterator<PathNode> getContentIterator() {
        return this.contentIterator;
    }

    @Nullable
    public final Object getKey() {
        return this.key;
    }

    @Nullable
    public final PathNode getParent() {
        return this.parent;
    }

    @NotNull
    public final Path getPath() {
        return this.path;
    }

    public final void setContentIterator(@Nullable Iterator<PathNode> it) {
        this.contentIterator = it;
    }
}
