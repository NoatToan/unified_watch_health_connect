package kotlin.text;

import kotlin.jvm.JvmField;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
final class SystemProperties {

    @NotNull
    public static final SystemProperties INSTANCE = new SystemProperties();

    @JvmField
    @NotNull
    public static final String LINE_SEPARATOR;

    static {
        String property = System.getProperty("line.separator");
        Intrinsics.checkNotNull(property);
        LINE_SEPARATOR = property;
    }

    private SystemProperties() {
    }
}
