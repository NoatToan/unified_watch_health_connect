package defpackage;

import com.miui.tsmclient.util.Constants;
import com.smarthome.core.modelconfig.PluginDeviceInfo;
import com.xiaomi.smarthome.framework.plugin.rn.report.RnReportConst;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(bv = {}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0001\u000bB\u0017\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\u0006\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b\u0016\u0010\u0017J8\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\bH\u0016J\u0010\u0010\r\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\bH\u0016J(\u0010\u000b\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u0002H\u0016J\b\u0010\r\u001a\u00020\u0002H\u0016J\b\u0010\u0011\u001a\u00020\u0002H\u0016¨\u0006\u0018"}, d2 = {"Lt3;", "Ld1;", "", "flag", "sessionId", "packetIndex", "totalSize", RnReportConst.ApiReport.PARAM_MODULE, "", "data", "Lz3;", PluginDeviceInfo.FMODEL, "byteArray", PluginDeviceInfo.FICONON, Constants.EXTRA_SESSION_ID, "code", "index", "j", "Lq3;", "channel", "Lw3;", "channelCallbackHolder", "<init>", "(Lq3;Lw3;)V", "bluetooth_release"}, k = 1, mv = {1, 7, 1})
public final class t3 extends d1 {

    @NotNull
    public static final a E = new a(null);

    @NotNull
    public final w3 D;

    @Metadata(bv = {}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\b¨\u0006\u000b"}, d2 = {"Lt3$a;", "", "", "FIRST_PACKET_HEADER_SIZE", "I", "SUBSEQUENT_PACKET_HEADER_SIZE", "", "TAG", "Ljava/lang/String;", "<init>", "()V", "bluetooth_release"}, k = 1, mv = {1, 7, 1})
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t3(@NotNull q3 channel, @NotNull w3 channelCallbackHolder) {
        super(channel, channelCallbackHolder, 0);
        Intrinsics.checkNotNullParameter(channel, "channel");
        Intrinsics.checkNotNullParameter(channelCallbackHolder, "channelCallbackHolder");
        this.D = channelCallbackHolder;
    }

    @Override // defpackage.d1
    @NotNull
    public z3 a(int flag, int sessionId, int packetIndex, int totalSize, int module, @NotNull byte[] data) {
        Intrinsics.checkNotNullParameter(data, "data");
        return (flag & 1) > 0 ? new cb(flag, sessionId, packetIndex, totalSize, module, data, 0, 64, null) : new z3(flag, sessionId, packetIndex, data, 0, 16, null);
    }

    @Override // defpackage.d1
    public int c() {
        return 10;
    }

    @Override // defpackage.d1
    public int j() {
        return 4;
    }

    @Override // defpackage.d1
    @NotNull
    public z3 c(@NotNull byte[] byteArray) {
        Intrinsics.checkNotNullParameter(byteArray, "byteArray");
        return z3.f.c(byteArray);
    }

    @Override // defpackage.d1
    @NotNull
    public byte[] a(int module, int sessionID, int code, int index) {
        return new byte[]{(byte) module, (byte) sessionID, (byte) code, (byte) index};
    }
}
