package kotlin;

import kotlin.internal.InlineOnly;

/* JADX INFO: loaded from: classes23.dex */
public final class HashCodeKt {
    @SinceKotlin(version = "1.3")
    @InlineOnly
    private static final int a(Object obj) {
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }
}
