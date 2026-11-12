package kotlin.coroutines.intrinsics;

import kotlin.PublishedApi;
import kotlin.SinceKotlin;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
@SinceKotlin(version = "1.3")
@PublishedApi
public enum CoroutineSingletons {
    COROUTINE_SUSPENDED,
    UNDECIDED,
    RESUMED;

    private static final /* synthetic */ EnumEntries $ENTRIES = EnumEntriesKt.enumEntries(values());

    @NotNull
    public static EnumEntries<CoroutineSingletons> getEntries() {
        return $ENTRIES;
    }
}
