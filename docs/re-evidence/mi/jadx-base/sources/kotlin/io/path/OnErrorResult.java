package kotlin.io.path;

import kotlin.SinceKotlin;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
@SinceKotlin(version = "1.8")
@ExperimentalPathApi
public enum OnErrorResult {
    SKIP_SUBTREE,
    TERMINATE;

    private static final /* synthetic */ EnumEntries $ENTRIES = EnumEntriesKt.enumEntries(values());

    @NotNull
    public static EnumEntries<OnErrorResult> getEntries() {
        return $ENTRIES;
    }
}
