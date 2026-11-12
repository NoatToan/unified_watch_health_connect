package j90;

import java.util.Iterator;
import p005kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes8.dex */
public final class p {
    public static final o a(z80.f fVar) {
        Object next;
        o.a aVar = o.f97845c;
        String str = fVar.f203046d;
        aVar.getClass();
        Iterator<T> it = o.f97853k.iterator();
        while (it.hasNext()) {
            next = it.next();
            if (s.g(((o) next).f97854a, str)) {
                return (o) next;
            }
        }
        next = null;
        return (o) next;
    }
}
