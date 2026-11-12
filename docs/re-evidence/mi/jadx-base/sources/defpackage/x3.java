package defpackage;

import com.smarthome.core.modelconfig.PluginDeviceInfo;
import com.xiaomi.fit.fitness.persist.db.FitnessDBConstants;
import com.xiaomi.smarthome.framework.plugin.rn.report.RnReportConst;
import io.netty.buffer.ByteBuf;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(bv = {}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0016\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0001\u0003B'\u0012\u0006\u0010\u0010\u001a\u00020\u0006\u0012\u0006\u0010\u0014\u001a\u00020\u0006\u0012\u0006\u0010\u000e\u001a\u00020\u0006\u0012\u0006\u0010\"\u001a\u00020!¢\u0006\u0004\b#\u0010$J\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\u0003\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004J\b\u0010\u0007\u001a\u00020\u0006H\u0002J\u0018\u0010\u0003\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u0006H\u0002J(\u0010\u0003\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\u0006H\u0002J\u0010\u0010\u0003\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u0006H\u0002R\u0017\u0010\u0010\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0014\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0011\u001a\u0004\b\u0015\u0010\u0013R\u0017\u0010\u000e\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u0011\u001a\u0004\b\u0016\u0010\u0013R\"\u0010\u0017\u001a\u00020\n8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR\"\u0010\u001d\u001a\u00020\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001d\u0010\u0011\u001a\u0004\b\u001e\u0010\u0013\"\u0004\b\u001f\u0010 ¨\u0006%"}, d2 = {"Lx3;", "", "", PluginDeviceInfo.FMODEL, "Lz3;", "packet", "", PluginDeviceInfo.FLOCALIZATIONS, "lastIndex", "receiveIndex", "", "packetDataSize", "isLastPacket", "cachedDataSize", "totalSize", "value", RnReportConst.ApiReport.PARAM_MODULE, "I", PluginDeviceInfo.FICONON, "()I", "sessionId", PluginDeviceInfo.FICONOFF, PluginDeviceInfo.FICONOFFLINE, FitnessDBConstants.COL_IS_SLEEP_COMPLETE, "Z", PluginDeviceInfo.FBLUETOOTHPAIR, "()Z", "setComplete", "(Z)V", "flag", PluginDeviceInfo.FDESC, "setFlag", "(I)V", "Lio/netty/buffer/ByteBuf;", "buf", "<init>", "(IIILio/netty/buffer/ByteBuf;)V", "bluetooth_release"}, k = 1, mv = {1, 7, 1})
public final class x3 {

    @NotNull
    public static final a h = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f38626a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f38627b;
    public final int c;

    @NotNull
    public final ByteBuf d;
    public int e;
    public boolean f;
    public int g;

    @Metadata(bv = {}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\b\u0010\tR\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00058\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007¨\u0006\n"}, d2 = {"Lx3$a;", "", "", "PACKET_LOOP_SIZE", "I", "", "TAG", "Ljava/lang/String;", "<init>", "()V", "bluetooth_release"}, k = 1, mv = {1, 7, 1})
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public x3(int i, int i2, int i3, @NotNull ByteBuf buf) {
        Intrinsics.checkNotNullParameter(buf, "buf");
        this.f38626a = i;
        this.f38627b = i2;
        this.c = i3;
        this.d = buf;
        buf.clear();
        this.e = -1;
    }

    @NotNull
    public final byte[] a() {
        byte[] bArrArray = this.d.readBytes(this.d.readableBytes()).array();
        Intrinsics.checkNotNullExpressionValue(bArrArray, "buf.readBytes(dataSize).array()");
        return bArrArray;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final int getG() {
        return this.g;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final int getF38626a() {
        return this.f38626a;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final int getF38627b() {
        return this.f38627b;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final int getC() {
        return this.c;
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final boolean getF() {
        return this.f;
    }

    public final int g() {
        return this.d.readableBytes();
    }

    public final int a(@NotNull z3 packet) {
        Intrinsics.checkNotNullParameter(packet, "packet");
        if (this.f38627b != packet.getF40827b()) {
            return 2;
        }
        if (a(this.e, packet.getC())) {
            t5t.d("ChannelDataBuf", "Packet lost");
            return 3;
        }
        this.g |= packet.getF40826a();
        if (!a(packet.getD().length, packet.g(), g(), this.c)) {
            return 4;
        }
        this.e = packet.getC();
        this.f = packet.g();
        this.d.writeBytes(packet.getD());
        return 1;
    }

    public final boolean a(int lastIndex, int receiveIndex) {
        return (lastIndex + 1) % 256 != receiveIndex;
    }

    public final boolean a(int packetDataSize, boolean isLastPacket, int cachedDataSize, int totalSize) {
        if (packetDataSize <= 0) {
            return false;
        }
        if ((this.g & 8) != 0) {
            return !isLastPacket || cachedDataSize + packetDataSize == a(totalSize + 8);
        }
        int i = cachedDataSize + packetDataSize;
        if (i > totalSize) {
            return false;
        }
        return !isLastPacket || i == totalSize;
    }

    public final int a(int value) {
        return value + ((16 - (value % 16)) % 16);
    }
}
