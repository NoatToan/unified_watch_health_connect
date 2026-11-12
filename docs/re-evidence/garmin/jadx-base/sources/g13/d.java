package g13;

import java.util.concurrent.ThreadFactory;
import q03.q;

/* JADX INFO: loaded from: classes3.dex */
public final class d extends q {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final f f74976c = new f("RxNewThreadScheduler", Math.max(1, Math.min(10, Integer.getInteger("rx2.newthread-priority", 5).intValue())));

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ThreadFactory f74977b;

    public d() {
        this(f74976c);
    }

    @Override // q03.q
    public final q.b a() {
        return new e(this.f74977b);
    }

    public d(ThreadFactory threadFactory) {
        this.f74977b = threadFactory;
    }
}
