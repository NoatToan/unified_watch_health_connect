package defpackage;

import com.google.common.base.Preconditions;
import com.google.common.cache.ElementTypesAreNonnullByDefault;
import com.google.common.cache.RemovalCause;
import java.util.AbstractMap;
import javax.annotation.CheckForNull;

/* JADX INFO: loaded from: classes21.dex */
@ElementTypesAreNonnullByDefault
public final class aju<K, V> extends AbstractMap.SimpleImmutableEntry<K, V> {
    private static final long serialVersionUID = 0;
    private final RemovalCause d;

    public static <K, V> aju<K, V> e(@CheckForNull K k, @CheckForNull V v, RemovalCause removalCause) {
        return new aju<>(k, v, removalCause);
    }

    private aju(@CheckForNull K k, @CheckForNull V v, RemovalCause removalCause) {
        super(k, v);
        this.d = (RemovalCause) Preconditions.checkNotNull(removalCause);
    }
}
