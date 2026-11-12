package xi;

import java.util.ArrayDeque;
import xi.l;

/* JADX INFO: loaded from: classes7.dex */
public abstract class c<T extends l> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayDeque f191073a;

    public c() {
        char[] cArr = qj.m.f144982a;
        this.f191073a = new ArrayDeque(20);
    }

    public final void a(T t7) {
        ArrayDeque arrayDeque = this.f191073a;
        if (arrayDeque.size() < 20) {
            arrayDeque.offer(t7);
        }
    }
}
