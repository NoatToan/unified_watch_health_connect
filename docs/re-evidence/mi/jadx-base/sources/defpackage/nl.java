package defpackage;

import com.smarthome.core.modelconfig.PluginDeviceInfo;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.channels.Channel;
import kotlinx.coroutines.channels.ChannelKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(bv = {}, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0010\u0012\n\u0002\b\n\u0018\u00002\u00020\u0001:\u0001$B7\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\n\u001a\u00020\t\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u000e\u0012\b\b\u0002\u0010\u0016\u001a\u00020\u0015\u0012\b\b\u0002\u0010\u001a\u001a\u00020\u0002¢\u0006\u0004\b'\u0010(J\u0006\u0010\u0003\u001a\u00020\u0002R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\"\u0010\u000f\u001a\u00020\u000e8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0016\u001a\u00020\u00158\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0017\u0010\u001a\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u001d\u0010 \u001a\b\u0012\u0004\u0012\u00020\u001f0\u001e8\u0006¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#R\u0011\u0010&\u001a\u00020\u001f8F¢\u0006\u0006\u001a\u0004\b$\u0010%¨\u0006)"}, d2 = {"Lnl;", "", "", "h", "Ljq$a;", "command", "Ljq$a;", PluginDeviceInfo.FICONON, "()Ljq$a;", "Lqq;", "prediction", "Lqq;", PluginDeviceInfo.FBLUETOOTHPAIR, "()Lqq;", "", "timeout", "J", PluginDeviceInfo.FLOCALIZATIONS, "()J", "setTimeout", "(J)V", "Ljava/util/UUID;", "id", "Ljava/util/UUID;", PluginDeviceInfo.FICONOFF, "()Ljava/util/UUID;", "needTailReply", "Z", PluginDeviceInfo.FICONOFFLINE, "()Z", "Lkotlinx/coroutines/channels/Channel;", "", "channel", "Lkotlinx/coroutines/channels/Channel;", PluginDeviceInfo.FDESC, "()Lkotlinx/coroutines/channels/Channel;", PluginDeviceInfo.FMODEL, "()[B", "bytes", "<init>", "(Ljq$a;Lqq;JLjava/util/UUID;Z)V", "bluetooth_release"}, k = 1, mv = {1, 7, 1})
public final class nl {

    @NotNull
    public static final a h = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final jq.a f28026a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final qq f28027b;
    public long c;

    @NotNull
    public final UUID d;
    public final boolean e;
    public final long f;

    @NotNull
    public final Channel<byte[]> g;

    @Metadata(bv = {}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, d2 = {"Lnl$a;", "", "", "TIMEOUT", "J", "<init>", "()V", "bluetooth_release"}, k = 1, mv = {1, 7, 1})
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public nl(@NotNull jq.a command, @NotNull qq prediction, long j, @NotNull UUID id, boolean z) {
        Intrinsics.checkNotNullParameter(command, "command");
        Intrinsics.checkNotNullParameter(prediction, "prediction");
        Intrinsics.checkNotNullParameter(id, "id");
        this.f28026a = command;
        this.f28027b = prediction;
        this.c = j;
        this.d = id;
        this.e = z;
        this.f = System.currentTimeMillis();
        this.g = ChannelKt.Channel$default(0, null, null, 7, null);
    }

    @NotNull
    public final byte[] a() {
        return this.f28026a.getBytes();
    }

    @NotNull
    public final Channel<byte[]> b() {
        return this.g;
    }

    @NotNull
    /* JADX INFO: renamed from: c, reason: from getter */
    public final jq.a getF28026a() {
        return this.f28026a;
    }

    @NotNull
    /* JADX INFO: renamed from: d, reason: from getter */
    public final UUID getD() {
        return this.d;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final boolean getE() {
        return this.e;
    }

    @NotNull
    /* JADX INFO: renamed from: f, reason: from getter */
    public final qq getF28027b() {
        return this.f28027b;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final long getC() {
        return this.c;
    }

    public final boolean h() {
        return System.currentTimeMillis() - this.f >= this.c;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ nl(jq.a aVar, qq qqVar, long j, UUID uuid, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        qq qqVar2 = (i & 2) != 0 ? o6.t : qqVar;
        long j2 = (i & 4) != 0 ? 5000L : j;
        if ((i & 8) != 0) {
            uuid = UUID.randomUUID();
            Intrinsics.checkNotNullExpressionValue(uuid, "randomUUID()");
        }
        this(aVar, qqVar2, j2, uuid, (i & 16) != 0 ? true : z);
    }
}
