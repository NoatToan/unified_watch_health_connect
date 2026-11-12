package kotlin.io.path;

import java.nio.file.FileVisitOption;
import java.nio.file.LinkOption;
import java.util.Set;
import kotlin.collections.SetsKt__SetsJVMKt;
import kotlin.collections.SetsKt__SetsKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
public final class LinkFollowing {

    @NotNull
    public static final LinkFollowing INSTANCE = new LinkFollowing();

    @NotNull
    private static final LinkOption[] nofollowLinkOption = {LinkOption.NOFOLLOW_LINKS};

    @NotNull
    private static final LinkOption[] followLinkOption = new LinkOption[0];

    @NotNull
    private static final Set<FileVisitOption> nofollowVisitOption = SetsKt__SetsKt.emptySet();

    @NotNull
    private static final Set<FileVisitOption> followVisitOption = SetsKt__SetsJVMKt.setOf(FileVisitOption.FOLLOW_LINKS);

    private LinkFollowing() {
    }

    @NotNull
    public final LinkOption[] toLinkOptions(boolean z) {
        return z ? followLinkOption : nofollowLinkOption;
    }

    @NotNull
    public final Set<FileVisitOption> toVisitOptions(boolean z) {
        return z ? followVisitOption : nofollowVisitOption;
    }
}
