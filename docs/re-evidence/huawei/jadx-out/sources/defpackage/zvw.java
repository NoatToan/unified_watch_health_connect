package defpackage;

import com.huawei.openalliance.ad.constant.Constants;
import java.util.Arrays;
import java.util.concurrent.TimeUnit;
import org.eclipse.californium.core.config.CoapConfig;
import org.eclipse.californium.core.network.MessageIdTracker;
import org.eclipse.californium.elements.config.Configuration;
import org.eclipse.californium.elements.util.ClockUtil;

/* JADX INFO: loaded from: classes20.dex */
public class zvw implements MessageIdTracker {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f54634a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final long[] f54635b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final long f54636c;
    private final int d;
    private final int e;
    private final int f;
    private final int g;

    public zvw(int i, int i2, int i3, Configuration configuration) {
        if (i2 >= i3) {
            throw new IllegalArgumentException("max. MID " + i3 + " must be larger than min. MID " + i2 + "!");
        }
        if (i < i2 || i3 <= i) {
            throw new IllegalArgumentException("initial MID " + i + " must be in range [" + i2 + Constants.LINK + i3 + ")!");
        }
        this.f54636c = configuration.e(CoapConfig.s, TimeUnit.NANOSECONDS).longValue();
        this.f54634a = i - i2;
        this.d = i2;
        int i4 = i3 - i2;
        this.f = i4;
        int iIntValue = ((Integer) configuration.c(CoapConfig.ai)).intValue();
        this.e = iIntValue;
        this.g = ((i4 + iIntValue) - 1) / iIntValue;
        long[] jArr = new long[iIntValue];
        this.f54635b = jArr;
        Arrays.fill(jArr, ClockUtil.c() - 1000);
    }

    @Override // org.eclipse.californium.core.network.MessageIdTracker
    public int getNextMessageId() {
        long jC = ClockUtil.c();
        synchronized (this) {
            int i = (this.f54634a & 65535) % this.f;
            int i2 = i / this.g;
            int i3 = this.e;
            long[] jArr = this.f54635b;
            if (jArr[(i2 + 1) % i3] - jC < 0) {
                jArr[i2] = jC + this.f54636c;
                this.f54634a = i + 1;
                return i + this.d;
            }
            throw new IllegalStateException("No MID available, all [" + this.d + Constants.LINK + (this.d + this.f) + ") MID-groups in use! (MID lifetime " + (TimeUnit.NANOSECONDS.toSeconds(this.f54636c) + "s") + "!)");
        }
    }
}
