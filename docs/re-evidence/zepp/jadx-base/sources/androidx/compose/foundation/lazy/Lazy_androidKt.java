package androidx.compose.foundation.lazy;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\u001a\u0010\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0000¨\u0006\u0004"}, d2 = {"", "index", "", "getDefaultLazyKeyFor", "foundation_release"}, k = 2, mv = {1, 5, 1})
public final class Lazy_androidKt {
    @NotNull
    public static final Object getDefaultLazyKeyFor(int i) {
        return new DefaultLazyKey(i);
    }
}
