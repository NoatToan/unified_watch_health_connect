package defpackage;

import com.huawei.openalliance.ad.constant.Constants;
import java.util.concurrent.atomic.AtomicInteger;
import org.eclipse.californium.core.network.MessageIdTracker;

/* JADX INFO: loaded from: classes20.dex */
public class zwb implements MessageIdTracker {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f54662c;
    private final AtomicInteger d;
    private final int e;

    public zwb(int i, int i2, int i3) {
        AtomicInteger atomicInteger = new AtomicInteger();
        this.d = atomicInteger;
        if (i2 >= i3) {
            throw new IllegalArgumentException("max. MID " + i3 + " must be larger than min. MID " + i2 + "!");
        }
        if (i < i2 || i3 <= i) {
            throw new IllegalArgumentException("initial MID " + i + " must be in range [" + i2 + Constants.LINK + i3 + ")!");
        }
        atomicInteger.set(i - i2);
        this.e = i2;
        this.f54662c = i3 - i2;
    }

    @Override // org.eclipse.californium.core.network.MessageIdTracker
    public int getNextMessageId() {
        int andIncrement = this.d.getAndIncrement();
        int i = this.f54662c;
        if (andIncrement % i == i - 1) {
            this.d.addAndGet(-i);
        }
        return this.e + andIncrement;
    }
}
