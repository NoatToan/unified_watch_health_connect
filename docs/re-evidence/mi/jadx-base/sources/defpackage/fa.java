package defpackage;

import com.huami.bluetooth.profile.channel.module.file_transfer.FileTransferModule;
import com.smarthome.core.modelconfig.PluginDeviceInfo;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(bv = {}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lfa;", "", PluginDeviceInfo.FMODEL, "bluetooth_release"}, k = 1, mv = {1, 7, 1})
public final class fa {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final a f17582a = new a(null);

    @Metadata(bv = {}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0003\u001a\u00020\u0002R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\bR\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u0014\u0010\f\u001a\u00020\t8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\f\u0010\u000b¨\u0006\u000f"}, d2 = {"Lfa$a;", "", "Lkd;", "device", "Lea;", PluginDeviceInfo.FMODEL, "", "TAG", "Ljava/lang/String;", "", "VERSION_1", "I", "VERSION_2", "<init>", "()V", "bluetooth_release"}, k = 1, mv = {1, 7, 1})
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @Nullable
        public final ea a(@NotNull kd device) throws Exception {
            Intrinsics.checkNotNullParameter(device, "device");
            if (!device.F(FileTransferModule.class)) {
                t5t.d("FileTransferApiFactory", "Device not support file transfer");
                throw new Exception("Device not support file transfer");
            }
            FileTransferModule fileTransferModule = (FileTransferModule) device.y(FileTransferModule.class);
            if (fileTransferModule == null) {
                t5t.d("FileTransferApiFactory", "Module is null");
                throw new Exception("Module is null");
            }
            FileTransferProtocolVersion version = fileTransferModule.getVersion();
            if (version == null || version.getVersionCode() < 0) {
                t5t.d("FileTransferApiFactory", "Query version failed is null");
                throw new Exception("Query version failed is null");
            }
            t5t.d("FileTransferApiFactory", "File transfer version:" + version);
            int versionCode = version.getVersionCode();
            if (versionCode == 1) {
                return new ka(fileTransferModule, version);
            }
            if (versionCode == 2) {
                return new ja(fileTransferModule, version);
            }
            throw new Exception("Not support version");
        }
    }
}
