package defpackage;

import com.smarthome.core.modelconfig.PluginDeviceInfo;
import com.xiaomi.onetrack.api.b;
import com.xiaomi.smarthome.library.bluetooth.channel.packet.Packet;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(bv = {}, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\"\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u0006H&J\u0010\u0010\t\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\nH&J\u0010\u0010\t\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\fH&J\u0010\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u000eH&J\u0010\u0010\u000f\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u000eH&¨\u0006\u0010"}, d2 = {"Lea;", "", "Laa;", "fileInfo", "Lqp;", "transferListener", "", "withCompress", "", PluginDeviceInfo.FMODEL, "Lfv;", b.I, "Lba;", Packet.ACK, "Lth;", PluginDeviceInfo.FDESC, "bluetooth_release"}, k = 1, mv = {1, 7, 1})
public interface ea {
    void a(@NotNull FileInfo fileInfo, @NotNull qp transferListener, boolean withCompress);

    void a(@NotNull th transferListener);

    boolean a(@NotNull FilePacketResponse ack);

    boolean a(@NotNull TransferResponse response);

    void b(@NotNull th transferListener);
}
