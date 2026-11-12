package defpackage;

import defpackage.l3i;
import java.util.Queue;

/* JADX INFO: loaded from: classes4.dex */
public abstract class n82<T extends l3i> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Queue<T> f27638a = ulq.g(20);

    public abstract T a();

    public T b() {
        T tPoll = this.f27638a.poll();
        return tPoll == null ? (T) a() : tPoll;
    }

    public void c(T t) {
        if (this.f27638a.size() < 20) {
            this.f27638a.offer(t);
        }
    }
}
