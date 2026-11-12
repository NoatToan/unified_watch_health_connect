package kotlin.reflect.jvm.internal.impl.name;

import com.xiaomi.fitness.login.region.RegionManagerImpl;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
public final class NameUtils {

    @NotNull
    public static final NameUtils INSTANCE = new NameUtils();

    @NotNull
    private static final Regex SANITIZE_AS_JAVA_INVALID_CHARACTERS = new Regex("[^\\p{L}\\p{Digit}]");

    @NotNull
    private static final String CONTEXT_RECEIVER_PREFIX = "$context_receiver";

    private NameUtils() {
    }

    @JvmStatic
    @NotNull
    public static final Name contextReceiverName(int i) {
        Name nameIdentifier = Name.identifier(CONTEXT_RECEIVER_PREFIX + '_' + i);
        Intrinsics.checkNotNullExpressionValue(nameIdentifier, "identifier(...)");
        return nameIdentifier;
    }

    @JvmStatic
    @NotNull
    public static final String sanitizeAsJavaIdentifier(@NotNull String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        return SANITIZE_AS_JAVA_INVALID_CHARACTERS.replace(name, RegionManagerImpl.LOCALE_REPORTED_SERVER_SEPARATOR);
    }
}
