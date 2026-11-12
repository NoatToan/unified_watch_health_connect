package defpackage;

import java.net.InetSocketAddress;
import java.util.Random;
import java.util.concurrent.TimeUnit;
import org.eclipse.californium.core.config.CoapConfig;
import org.eclipse.californium.core.network.MessageIdProvider;
import org.eclipse.californium.core.network.MessageIdTracker;
import org.eclipse.californium.elements.config.Configuration;
import org.eclipse.californium.elements.util.ClockUtil;
import org.eclipse.californium.elements.util.LeastRecentlyUpdatedCache;
import org.eclipse.californium.elements.util.NetworkInterfacesUtil;
import org.slf4j.Logger;

/* JADX INFO: loaded from: classes20.dex */
public class zvx implements MessageIdProvider {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final Logger f54637c = aaex.a((Class<?>) zvx.class);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final CoapConfig.TrackerMode f54638a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final MessageIdTracker f54639b;
    private final int d;
    private final Configuration e;
    private final LeastRecentlyUpdatedCache<InetSocketAddress, MessageIdTracker> i;
    private final Random j;

    public zvx(Configuration configuration) {
        if (configuration == null) {
            throw new NullPointerException("Config must not be null");
        }
        this.f54638a = (CoapConfig.TrackerMode) configuration.c(CoapConfig.ae);
        this.e = configuration;
        if (((Boolean) configuration.c(CoapConfig.aw)).booleanValue()) {
            this.j = new Random(ClockUtil.c());
        } else {
            this.j = null;
        }
        this.i = new LeastRecentlyUpdatedCache<>(((Integer) configuration.c(CoapConfig.y)).intValue(), configuration.e(CoapConfig.ad, TimeUnit.SECONDS).longValue(), TimeUnit.SECONDS);
        int iIntValue = ((Integer) configuration.c(CoapConfig.ag)).intValue();
        if (iIntValue > 0) {
            this.d = iIntValue;
            Random random = this.j;
            this.f54639b = d(random == null ? iIntValue : random.nextInt(65536 - iIntValue) + iIntValue, iIntValue, 65536, configuration);
        } else {
            this.d = 65536;
            this.f54639b = null;
        }
    }

    @Override // org.eclipse.californium.core.network.MessageIdProvider
    public int getNextMessageId(InetSocketAddress inetSocketAddress) {
        MessageIdTracker messageIdTrackerD = d(inetSocketAddress);
        if (messageIdTrackerD == null) {
            throw new IllegalStateException("No MID available, max. peers " + this.i.h() + " exhausted! (Timeout " + (this.i.a(TimeUnit.SECONDS) + "s") + ".)");
        }
        return messageIdTrackerD.getNextMessageId();
    }

    private MessageIdTracker d(InetSocketAddress inetSocketAddress) {
        if (NetworkInterfacesUtil.a(inetSocketAddress.getAddress())) {
            if (this.f54639b == null) {
                f54637c.warn("Destination address {} is a multicast address, please configure NetworkConfig to support multicast messaging", inetSocketAddress);
            }
            return this.f54639b;
        }
        MessageIdTracker messageIdTrackerD = this.i.d(inetSocketAddress);
        if (messageIdTrackerD == null) {
            Random random = this.j;
            MessageIdTracker messageIdTrackerD2 = d(random == null ? 0 : random.nextInt(this.d), 0, this.d, this.e);
            this.i.f().lock();
            try {
                MessageIdTracker messageIdTrackerD3 = this.i.d(inetSocketAddress);
                if (messageIdTrackerD3 == null) {
                    if (this.i.a(inetSocketAddress, messageIdTrackerD2)) {
                        this.i.f().unlock();
                        return messageIdTrackerD2;
                    }
                    this.i.f().unlock();
                    return null;
                }
                this.i.f().unlock();
                messageIdTrackerD = messageIdTrackerD3;
            } catch (Throwable th) {
                this.i.f().unlock();
                throw th;
            }
        }
        if (messageIdTrackerD != null) {
            this.i.e(inetSocketAddress);
        }
        return messageIdTrackerD;
    }

    /* JADX INFO: renamed from: zvx$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f54640a;

        static {
            int[] iArr = new int[CoapConfig.TrackerMode.values().length];
            f54640a = iArr;
            try {
                iArr[CoapConfig.TrackerMode.NULL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f54640a[CoapConfig.TrackerMode.MAPBASED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f54640a[CoapConfig.TrackerMode.GROUPED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    private MessageIdTracker d(int i, int i2, int i3, Configuration configuration) {
        int i4 = AnonymousClass1.f54640a[this.f54638a.ordinal()];
        if (i4 == 1) {
            return new zwb(i, i2, i3);
        }
        if (i4 == 2) {
            return new zwa(i, i2, i3, configuration);
        }
        return new zvw(i, i2, i3, configuration);
    }
}
