package kotlin.io.path;

import kotlin.SinceKotlin;
import kotlin.WasExperimental;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
@SinceKotlin(version = "2.1")
@WasExperimental(markerClass = {ExperimentalPathApi.class})
public enum PathWalkOption {
    INCLUDE_DIRECTORIES,
    BREADTH_FIRST,
    FOLLOW_LINKS;

    private static final /* synthetic */ EnumEntries $ENTRIES = EnumEntriesKt.enumEntries(values());

    @NotNull
    public static EnumEntries<PathWalkOption> getEntries() {
        return $ENTRIES;
    }
}
