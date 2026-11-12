package kotlin.enums;

import java.io.Serializable;
import java.lang.Enum;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
public final class EnumEntriesSerializationProxy<E extends Enum<E>> implements Serializable {

    @NotNull
    private static final Companion Companion = new Companion(null);
    private static final long serialVersionUID = 0;

    @NotNull
    private final Class<E> c;

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public EnumEntriesSerializationProxy(@NotNull E[] entries) {
        Intrinsics.checkNotNullParameter(entries, "entries");
        Class<E> cls = (Class<E>) entries.getClass().getComponentType();
        Intrinsics.checkNotNull(cls);
        this.c = cls;
    }

    private final Object readResolve() {
        E[] enumConstants = this.c.getEnumConstants();
        Intrinsics.checkNotNullExpressionValue(enumConstants, "getEnumConstants(...)");
        return EnumEntriesKt.enumEntries(enumConstants);
    }
}
