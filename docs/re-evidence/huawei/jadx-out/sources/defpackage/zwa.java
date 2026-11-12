package defpackage;

import com.huawei.openalliance.ad.constant.Constants;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import org.eclipse.californium.core.config.CoapConfig;
import org.eclipse.californium.core.network.MessageIdTracker;
import org.eclipse.californium.elements.config.Configuration;
import org.eclipse.californium.elements.util.ClockUtil;

/* JADX INFO: loaded from: classes20.dex */
public class zwa implements MessageIdTracker {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Map<Integer, Long> f54659a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f54660b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f54661c;
    private int d;
    private final long e;

    public zwa(int i, int i2, int i3, Configuration configuration) {
        if (i2 >= i3) {
            throw new IllegalArgumentException("max. MID " + i3 + " must be larger than min. MID " + i2 + "!");
        }
        if (i < i2 || i3 <= i) {
            throw new IllegalArgumentException("initial MID " + i + " must be in range [" + i2 + Constants.LINK + i3 + ")!");
        }
        this.e = configuration.e(CoapConfig.s, TimeUnit.NANOSECONDS).longValue();
        this.d = i - i2;
        this.f54660b = i2;
        int i4 = i3 - i2;
        this.f54661c = i4;
        this.f54659a = new HashMap(i4);
    }

    @Override // org.eclipse.californium.core.network.MessageIdTracker
    public int getNextMessageId() {
        int i;
        Long l;
        long jC = ClockUtil.c();
        synchronized (this.f54659a) {
            int i2 = this.d;
            int i3 = this.f54661c;
            int i4 = (i2 & 65535) % i3;
            this.d = i4;
            do {
                int i5 = this.d;
                if (i5 < i4 + i3) {
                    this.d = i5 + 1;
                    i = i5 % this.f54661c;
                    l = this.f54659a.get(Integer.valueOf(i));
                    if (l == null) {
                        break;
                    }
                } else {
                    throw new IllegalStateException("No MID available, all [" + this.f54660b + Constants.LINK + (this.f54660b + this.f54661c) + ") MIDs in use! (MID lifetime " + (TimeUnit.NANOSECONDS.toSeconds(this.e) + "s") + "!)");
                }
            } while (l.longValue() - jC > 0);
            this.f54659a.put(Integer.valueOf(i), Long.valueOf(jC + this.e));
            return i + this.f54660b;
        }
    }
}
