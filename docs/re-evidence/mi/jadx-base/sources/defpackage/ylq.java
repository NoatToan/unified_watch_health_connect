package defpackage;

import java.util.Collection;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.Set;

/* JADX INFO: loaded from: classes6.dex */
public final class ylq {
    public static <T> Set<T> a(Collection<T> collection) {
        return Collections.unmodifiableSet(new LinkedHashSet(collection));
    }
}
