package o83;

import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: loaded from: classes11.dex */
public class k implements j83.g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ l.a f130915a;

    public k(l.a aVar) {
        this.f130915a = aVar;
    }

    @Override // j83.g
    public final void b(long j8) {
        long j14;
        long j15;
        if (j8 > 0) {
            l.a aVar = this.f130915a;
            AtomicLong atomicLong = aVar.f130925k;
            do {
                j14 = atomicLong.get();
                j15 = j14 + j8;
                if (j15 < 0) {
                    j15 = Long.MAX_VALUE;
                }
            } while (!atomicLong.compareAndSet(j14, j15));
            aVar.k();
        }
    }
}
