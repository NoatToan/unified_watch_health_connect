package defpackage;

import java.util.Arrays;
import java.util.List;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes5.dex */
public final class g9s {
    public static String a(List<?> list) {
        if (list == null) {
            return AbstractJsonLexerKt.NULL;
        }
        return Arrays.toString(list.toArray()) + ", Size : " + list.size();
    }
}
