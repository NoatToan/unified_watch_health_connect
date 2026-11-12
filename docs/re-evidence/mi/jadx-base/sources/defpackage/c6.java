package defpackage;

import com.smarthome.core.modelconfig.PluginDeviceInfo;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(bv = {}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u000e\u0010\u000fJ\b\u0010\u0003\u001a\u00020\u0002H\u0016R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u0019\u0010\n\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r¨\u0006\u0010"}, d2 = {"Lc6;", "", "", "toString", "", "result", "Z", PluginDeviceInfo.FDESC, "()Z", "Lk4;", "data", "Lk4;", PluginDeviceInfo.FMODEL, "()Lk4;", "<init>", "(ZLk4;)V", "bluetooth_release"}, k = 1, mv = {1, 7, 1})
public final class c6 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f4970a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public final ChannelReplyPacket f4971b;

    public c6(boolean z, @Nullable ChannelReplyPacket channelReplyPacket) {
        this.f4970a = z;
        this.f4971b = channelReplyPacket;
    }

    @Nullable
    /* JADX INFO: renamed from: a, reason: from getter */
    public final ChannelReplyPacket getF4971b() {
        return this.f4971b;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final boolean getF4970a() {
        return this.f4970a;
    }

    @NotNull
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("DataSendResponse(result=");
        sb.append(this.f4970a);
        sb.append(", data=");
        ChannelReplyPacket channelReplyPacket = this.f4971b;
        sb.append(channelReplyPacket != null ? channelReplyPacket.toString() : null);
        sb.append(')');
        return sb.toString();
    }

    public /* synthetic */ c6(boolean z, ChannelReplyPacket channelReplyPacket, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(z, (i & 2) != 0 ? null : channelReplyPacket);
    }
}
