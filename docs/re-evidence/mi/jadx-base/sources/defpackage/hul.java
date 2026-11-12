package defpackage;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
public abstract class hul implements Comparable<hul> {
    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public int compareTo(@NotNull hul hulVar) {
        return Long.valueOf(h()).compareTo(Long.valueOf(hulVar.h()));
    }

    public long b(@NotNull hul hulVar) {
        return h() - hulVar.h();
    }

    public final boolean c(@NotNull hul hulVar) {
        return b(hulVar) > 0;
    }

    public final boolean d(@NotNull hul hulVar) {
        return b(hulVar) < 0;
    }

    public long e(@Nullable hul hulVar) {
        return (hulVar == null || compareTo(hulVar) >= 0) ? h() : hulVar.h();
    }

    public abstract long h();
}
