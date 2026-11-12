package kotlin.io;

import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
public enum FileWalkDirection {
    TOP_DOWN,
    BOTTOM_UP;

    private static final /* synthetic */ EnumEntries $ENTRIES = EnumEntriesKt.enumEntries(values());

    @NotNull
    public static EnumEntries<FileWalkDirection> getEntries() {
        return $ENTRIES;
    }
}
