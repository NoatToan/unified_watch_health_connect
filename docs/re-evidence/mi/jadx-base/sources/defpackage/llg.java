package defpackage;

import io.reactivex.internal.schedulers.RxThreadFactory;
import java.util.concurrent.ThreadFactory;

/* JADX INFO: loaded from: classes2.dex */
public final class llg extends hfl {
    public static final RxThreadFactory d = new RxThreadFactory("RxNewThreadScheduler", Math.max(1, Math.min(10, Integer.getInteger("rx2.newthread-priority", 5).intValue())));
    public final ThreadFactory c;

    public llg() {
        this(d);
    }

    @Override // defpackage.hfl
    public hfl.c b() {
        return new nlg(this.c);
    }

    public llg(ThreadFactory threadFactory) {
        this.c = threadFactory;
    }
}
