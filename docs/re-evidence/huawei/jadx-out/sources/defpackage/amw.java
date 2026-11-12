package defpackage;

import com.google.common.collect.ElementTypesAreNonnullByDefault;
import java.util.ArrayDeque;
import java.util.concurrent.ConcurrentLinkedQueue;

/* JADX INFO: loaded from: classes21.dex */
@ElementTypesAreNonnullByDefault
public final class amw {
    public static <E> ArrayDeque<E> c() {
        return new ArrayDeque<>();
    }

    public static <E> ConcurrentLinkedQueue<E> d() {
        return new ConcurrentLinkedQueue<>();
    }
}
