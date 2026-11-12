package kotlin.reflect.jvm.internal.impl.resolve.scopes;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import kotlin.collections.h;
import kotlin.reflect.jvm.internal.impl.name.Name;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes23.dex */
public final class MemberScopeKt {
    @Nullable
    public static final Set<Name> flatMapClassifierNamesOrNull(@NotNull Iterable<? extends MemberScope> iterable) {
        HashSet hashSet = new HashSet();
        Iterator<? extends MemberScope> it2 = iterable.iterator();
        while (it2.hasNext()) {
            Set<Name> classifierNames = it2.next().getClassifierNames();
            if (classifierNames == null) {
                return null;
            }
            h.addAll(hashSet, classifierNames);
        }
        return hashSet;
    }
}
