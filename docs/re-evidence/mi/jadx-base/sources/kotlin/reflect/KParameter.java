package kotlin.reflect;

import kotlin.SinceKotlin;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
public interface KParameter extends KAnnotatedElement {

    public static final class DefaultImpls {
        @SinceKotlin(version = "1.1")
        public static /* synthetic */ void isVararg$annotations() {
        }
    }

    public enum Kind {
        INSTANCE,
        EXTENSION_RECEIVER,
        VALUE;

        private static final /* synthetic */ EnumEntries $ENTRIES = EnumEntriesKt.enumEntries(values());

        @NotNull
        public static EnumEntries<Kind> getEntries() {
            return $ENTRIES;
        }
    }

    int getIndex();

    @NotNull
    Kind getKind();

    @Nullable
    String getName();

    @NotNull
    KType getType();

    boolean isOptional();

    boolean isVararg();
}
