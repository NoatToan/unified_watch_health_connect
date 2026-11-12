package com.huami.bluetooth.profile.channel.module.file_transfer;

import com.baidu.ocr.sdk.utils.LogUtil;
import com.huami.bluetooth.profile.channel.module.file_transfer.impl.FileTransferCompressImpl;
import com.huami.bluetooth.profile.channel.module.file_transfer.impl.FileTransferImplV2;
import com.huami.bluetooth.profile.channel.module.file_transfer.model.FileTransferProtocolVersion;
import com.xiaomi.hm.health.bt.debug.Debug;
import com.xiaomi.hm.health.bt.device.HMBaseDevice;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\u0018\u0000 \u00042\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/huami/bluetooth/profile/channel/module/file_transfer/FileTransferApiFactory;", "", "<init>", "()V", "Companion", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
public final class FileTransferApiFactory {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final String a = "FileTransferApiFactory";
    private static final int b = 1;
    private static final int c = 2;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0003\u001a\u00020\u0002R\u0016\u0010\u0007\u001a\u00020\u00068\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\bR\u0016\u0010\n\u001a\u00020\t8\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u0016\u0010\f\u001a\u00020\t8\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\f\u0010\u000b¨\u0006\u000f"}, d2 = {"Lcom/huami/bluetooth/profile/channel/module/file_transfer/FileTransferApiFactory$Companion;", "", "Lcom/xiaomi/hm/health/bt/device/HMBaseDevice;", "device", "Lcom/huami/bluetooth/profile/channel/module/file_transfer/FileTransferApi;", "createApi", "", "TAG", "Ljava/lang/String;", "", "VERSION_1", LogUtil.I, "VERSION_2", "<init>", "()V", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @Nullable
        public final FileTransferApi createApi(@NotNull HMBaseDevice device) throws Exception {
            if (!device.supportModule(FileTransferModule.class)) {
                Debug.fi(FileTransferApiFactory.a, "Device not support file transfer");
                throw new Exception("Device not support file transfer");
            }
            FileTransferModule fileTransferModule = (FileTransferModule) device.getChannelModule(FileTransferModule.class);
            if (fileTransferModule == null) {
                Debug.fi(FileTransferApiFactory.a, "Module is null");
                throw new Exception("Module is null");
            }
            FileTransferProtocolVersion version = fileTransferModule.getVersion();
            if (version == null || version.getVersionCode() < 0) {
                Debug.fi(FileTransferApiFactory.a, "Query version failed is null");
                throw new Exception("Query version failed is null");
            }
            Debug.fi(FileTransferApiFactory.a, Intrinsics.stringPlus("File transfer version:", version));
            int versionCode = version.getVersionCode();
            if (versionCode == 1) {
                return new FileTransferImplV2(fileTransferModule, version);
            }
            if (versionCode == 2) {
                return new FileTransferCompressImpl(fileTransferModule, version);
            }
            throw new Exception("Not support version");
        }
    }
}
