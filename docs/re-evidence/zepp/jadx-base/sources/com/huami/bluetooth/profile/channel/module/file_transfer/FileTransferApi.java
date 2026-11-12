package com.huami.bluetooth.profile.channel.module.file_transfer;

import com.amazon.identity.auth.device.endpoint.AbstractJSONTokenResponse;
import com.baidu.ocr.sdk.utils.LogUtil;
import com.huami.bluetooth.feature.file_transfer.FileInfo;
import com.huami.ecg.core.model.constant.MeasureStateValue;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u0000 \u00132\u00020\u0001:\u0001\u0013J\"\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u0006H&J\u0010\u0010\f\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\nH&J\u0010\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\rH&J\u0010\u0010\u0011\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u0010H&J\u0010\u0010\u0012\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u0010H&¨\u0006\u0014"}, d2 = {"Lcom/huami/bluetooth/profile/channel/module/file_transfer/FileTransferApi;", "", "Lcom/huami/bluetooth/feature/file_transfer/FileInfo;", "fileInfo", "Lcom/huami/bluetooth/profile/channel/module/file_transfer/PushListener;", "transferListener", "", "withCompress", "", "sendFile", "Lcom/huami/bluetooth/profile/channel/module/file_transfer/TransferResponse;", AbstractJSONTokenResponse.RESPONSE, "startReceiveFile", "Lcom/huami/bluetooth/profile/channel/module/file_transfer/FilePacketResponse;", "ack", "fileDataPacketAck", "Lcom/huami/bluetooth/profile/channel/module/file_transfer/IFileTransfer;", "registerTransferListener", "unregisterTransferListener", "Companion", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
public interface FileTransferApi {
    public static final int BUSY = 9;
    public static final int CONTINUE = -1;
    public static final int CRC_NOT_MATCH = 11;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = Companion.a;
    public static final int OK = 0;
    public static final int PACKET_LOST = 10;
    public static final int SESSION_NOT_MATCH = 4;
    public static final int UNKNOWN = 1;
    public static final int WRITE_FILE_FAILED = 7;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\f\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\f\u0010\rR\u0016\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0016\u0010\u0005\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004R\u0016\u0010\u0006\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0004R\u0016\u0010\u0007\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0004R\u0016\u0010\b\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\u0004R\u0016\u0010\t\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\t\u0010\u0004R\u0016\u0010\n\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\n\u0010\u0004R\u0016\u0010\u000b\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000b\u0010\u0004¨\u0006\u000e"}, d2 = {"Lcom/huami/bluetooth/profile/channel/module/file_transfer/FileTransferApi$Companion;", "", "", "CONTINUE", LogUtil.I, "UNKNOWN", MeasureStateValue.BUSY, "OK", "SESSION_NOT_MATCH", "WRITE_FILE_FAILED", "CRC_NOT_MATCH", "PACKET_LOST", "<init>", "()V", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
    public static final class Companion {
        public static final int BUSY = 9;
        public static final int CONTINUE = -1;
        public static final int CRC_NOT_MATCH = 11;
        public static final int OK = 0;
        public static final int PACKET_LOST = 10;
        public static final int SESSION_NOT_MATCH = 4;
        public static final int UNKNOWN = 1;
        public static final int WRITE_FILE_FAILED = 7;
        public static final /* synthetic */ Companion a = new Companion();

        private Companion() {
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    public static final class DefaultImpls {
        public static /* synthetic */ void sendFile$default(FileTransferApi fileTransferApi, FileInfo fileInfo, PushListener pushListener, boolean z, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: sendFile");
            }
            if ((i & 4) != 0) {
                z = false;
            }
            fileTransferApi.sendFile(fileInfo, pushListener, z);
        }
    }

    boolean fileDataPacketAck(@NotNull FilePacketResponse ack);

    void registerTransferListener(@NotNull IFileTransfer transferListener);

    void sendFile(@NotNull FileInfo fileInfo, @NotNull PushListener transferListener, boolean withCompress);

    boolean startReceiveFile(@NotNull TransferResponse response);

    void unregisterTransferListener(@NotNull IFileTransfer transferListener);
}
