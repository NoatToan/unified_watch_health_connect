package kotlin;

import kotlin.internal.InlineOnly;

/* JADX INFO: loaded from: classes2.dex */
public final class HashCodeKt {
    @SinceKotlin(version = "1.3")
    @InlineOnly
    private static final int hashCode(Object obj) {
        if (obj != null) {
            return obj.hashCode();
        }
        return 0;
    }
}
