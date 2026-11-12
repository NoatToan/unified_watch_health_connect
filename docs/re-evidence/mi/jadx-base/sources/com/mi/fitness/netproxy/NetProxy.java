package com.mi.fitness.netproxy;

import androidx.annotation.Keep;
import com.xiaomi.onetrack.b.m;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
@Keep
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0010\u0012\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0011\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0086 J\u0019\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\tH\u0086 J\u0011\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u0007H\u0086 J\u0011\u0010\u000f\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u0007H\u0086 J\u0011\u0010\u0010\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u0007H\u0086 J\u0011\u0010\u0011\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u0007H\u0086 J\u0019\u0010\u0012\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u00072\u0006\u0010\u0013\u001a\u00020\u0014H\u0086 J!\u0010\u0015\u001a\u00020\u000b2\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\t2\u0006\u0010\u0019\u001a\u00020\tH\u0086 J\u000e\u0010\u001a\u001a\u00020\u000b2\u0006\u0010\u0004\u001a\u00020\u0005J\u0010\u0010\u001b\u001a\u00020\u000b2\u0006\u0010\u0013\u001a\u00020\u0014H\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082.¢\u0006\u0002\n\u0000¨\u0006\u001c"}, d2 = {"Lcom/mi/fitness/netproxy/NetProxy;", "", "<init>", "()V", m.j, "Lcom/mi/fitness/netproxy/NetProxySender;", "netproxy_init", "", "sdk", "", "netproxy_start", "", "context", "loglevel", "netproxy_run", "netproxy_stop", "netproxy_clear", "netproxy_done", "netproxy_upstream", "buffer", "", "netproxy_pcap", "name", "", "record_size", "file_size", "setNetProxySender", "sendData", "netproxy_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class NetProxy {

    @NotNull
    public static final NetProxy INSTANCE = new NetProxy();
    private static NetProxySender sender;

    static {
        try {
            System.loadLibrary("netproxy");
        } catch (UnsatisfiedLinkError unused) {
            System.exit(1);
            throw new RuntimeException("System.exit returned normally, while it was supposed to halt JVM.");
        }
    }

    private NetProxy() {
    }

    private final void sendData(byte[] buffer) {
        NetProxySender netProxySender = sender;
        if (netProxySender == null) {
            Intrinsics.throwUninitializedPropertyAccessException(m.j);
            netProxySender = null;
        }
        netProxySender.sendData(buffer);
    }

    public final native void netproxy_clear(long context);

    public final native void netproxy_done(long context);

    public final native long netproxy_init(int sdk);

    public final native void netproxy_pcap(@NotNull String name, int record_size, int file_size);

    public final native void netproxy_run(long context);

    public final native void netproxy_start(long context, int loglevel);

    public final native void netproxy_stop(long context);

    public final native void netproxy_upstream(long context, @NotNull byte[] buffer);

    public final void setNetProxySender(@NotNull NetProxySender sender2) {
        Intrinsics.checkNotNullParameter(sender2, "sender");
        sender = sender2;
    }
}
