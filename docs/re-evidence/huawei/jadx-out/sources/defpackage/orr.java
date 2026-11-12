package defpackage;

import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: loaded from: classes13.dex */
public class orr implements Runnable, Comparable<Runnable> {
    private static final AtomicLong d = new AtomicLong();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f44612a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Runnable f44613c;
    private final long e = d.getAndIncrement();

    public orr(Runnable runnable, int i) {
        this.f44613c = runnable;
        this.f44612a = i;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f44613c.run();
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0018  */
    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public int compareTo(Runnable runnable) {
        orr orrVar;
        if (runnable instanceof orr) {
            orrVar = (orr) runnable;
        } else if (runnable instanceof orn) {
            orn ornVar = (orn) runnable;
            if (ornVar.f44609c instanceof orr) {
                orrVar = (orr) ornVar.f44609c;
            } else {
                orrVar = null;
            }
        } else {
            orrVar = null;
        }
        if (orrVar == null) {
            return 0;
        }
        int i = this.f44612a;
        int i2 = orrVar.f44612a;
        if (i != i2) {
            return i2 - i;
        }
        if (orrVar.f44613c != this.f44613c) {
            return this.e < orrVar.e ? -1 : 1;
        }
        return 0;
    }
}
