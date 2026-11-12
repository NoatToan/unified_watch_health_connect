package kotlin.annotation;

import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
public enum AnnotationRetention {
    SOURCE,
    BINARY,
    RUNTIME;

    private static final /* synthetic */ EnumEntries $ENTRIES = EnumEntriesKt.enumEntries(values());

    @NotNull
    public static EnumEntries<AnnotationRetention> getEntries() {
        return $ENTRIES;
    }
}
