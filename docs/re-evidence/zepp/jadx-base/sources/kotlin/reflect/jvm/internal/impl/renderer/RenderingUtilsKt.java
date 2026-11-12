package kotlin.reflect.jvm.internal.impl.renderer;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.name.FqNameUnsafe;
import kotlin.reflect.jvm.internal.impl.name.Name;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes23.dex */
public final class RenderingUtilsKt {
    /* JADX WARN: Code duplicated, block: B:25:? A[RETURN, SYNTHETIC] */
    private static final boolean a(Name name) {
        boolean z;
        if (name.isSpecial()) {
            return false;
        }
        String strAsString = name.asString();
        if (!KeywordStringsGenerated.KEYWORDS.contains(strAsString)) {
            for (int i = 0; i < strAsString.length(); i++) {
                char cCharAt = strAsString.charAt(i);
                if ((Character.isLetterOrDigit(cCharAt) || cCharAt == '_') ? false : true) {
                    z = true;
                    if (z) {
                        return false;
                    }
                }
            }
            z = false;
            if (z) {
                return false;
            }
        }
        return true;
    }

    @NotNull
    public static final String render(@NotNull Name name) {
        if (!a(name)) {
            return name.asString();
        }
        return Intrinsics.stringPlus(String.valueOf('`') + name.asString(), "`");
    }

    @NotNull
    public static final String renderFqName(@NotNull List<Name> list) {
        StringBuilder sb = new StringBuilder();
        for (Name name : list) {
            if (sb.length() > 0) {
                sb.append(".");
            }
            sb.append(render(name));
        }
        return sb.toString();
    }

    @NotNull
    public static final String render(@NotNull FqNameUnsafe fqNameUnsafe) {
        return renderFqName(fqNameUnsafe.pathSegments());
    }
}
