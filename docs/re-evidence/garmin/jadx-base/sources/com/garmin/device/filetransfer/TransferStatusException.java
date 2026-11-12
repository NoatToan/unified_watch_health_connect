package com.garmin.device.filetransfer;

import com.garmin.proto.generated.GDIFileAccess;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u0000 \u000f2\u00020\u0001:\u0001\u0010B-\u0012\n\u0010\u0004\u001a\u00060\u0002j\u0002`\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0010\b\u0002\u0010\t\u001a\n\u0018\u00010\u0007j\u0004\u0018\u0001`\b¢\u0006\u0004\b\n\u0010\u000bR\u001b\u0010\u0004\u001a\u00060\u0002j\u0002`\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\f\u001a\u0004\b\r\u0010\u000e¨\u0006\u0011"}, d2 = {"Lcom/garmin/device/filetransfer/TransferStatusException;", "Lcom/garmin/device/filetransfer/FileTransferException;", "Lcom/garmin/proto/generated/GDIFileAccess$TransferStatusRequest$FailureReason;", "Lcom/garmin/device/filetransfer/TransferStatusFailure;", "status", "", "message", "Ljava/lang/Exception;", "Lkotlin/Exception;", "cause", "<init>", "(Lcom/garmin/proto/generated/GDIFileAccess$TransferStatusRequest$FailureReason;Ljava/lang/String;Ljava/lang/Exception;)V", "Lcom/garmin/proto/generated/GDIFileAccess$TransferStatusRequest$FailureReason;", "getStatus", "()Lcom/garmin/proto/generated/GDIFileAccess$TransferStatusRequest$FailureReason;", "Companion", "a", "file-transfer-device_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class TransferStatusException extends FileTransferException {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final GDIFileAccess.TransferStatusRequest.FailureReason status;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TransferStatusException(GDIFileAccess.TransferStatusRequest.FailureReason failureReason, String str, Exception exc) {
        super(str, exc);
        failureReason.getClass();
        str.getClass();
        this.status = failureReason;
    }

    public final GDIFileAccess.TransferStatusRequest.FailureReason getStatus() {
        return this.status;
    }

    /* JADX INFO: renamed from: com.garmin.device.filetransfer.TransferStatusException$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/garmin/device/filetransfer/TransferStatusException$a;", "", "<init>", "()V", "file-transfer-device_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(j jVar) {
            this();
        }

        private Companion() {
        }
    }

    public /* synthetic */ TransferStatusException(GDIFileAccess.TransferStatusRequest.FailureReason failureReason, String str, Exception exc, int i14, j jVar) {
        this(failureReason, str, (i14 & 4) != 0 ? null : exc);
    }
}
