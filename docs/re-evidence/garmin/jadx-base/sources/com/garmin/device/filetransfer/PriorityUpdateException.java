package com.garmin.device.filetransfer;

import com.garmin.proto.generated.GDIFileAccess;
import lc.u0;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import vb.h;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\u0018\u0000 \u00102\u00020\u0001:\u0001\u0011B-\b\u0002\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0010\b\u0002\u0010\b\u001a\n\u0018\u00010\u0006j\u0004\u0018\u0001`\u0007¢\u0006\u0004\b\t\u0010\nB\u0011\b\u0010\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\u000bB#\b\u0010\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0010\b\u0002\u0010\b\u001a\n\u0018\u00010\u0006j\u0004\u0018\u0001`\u0007¢\u0006\u0004\b\t\u0010\fR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\r\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0012"}, d2 = {"Lcom/garmin/device/filetransfer/PriorityUpdateException;", "Lcom/garmin/device/filetransfer/FileTransferException;", "Lcom/garmin/proto/generated/GDIFileAccess$PriorityUpdateResponse$Status;", "status", "", "message", "Ljava/lang/Exception;", "Lkotlin/Exception;", "cause", "<init>", "(Lcom/garmin/proto/generated/GDIFileAccess$PriorityUpdateResponse$Status;Ljava/lang/String;Ljava/lang/Exception;)V", "(Lcom/garmin/proto/generated/GDIFileAccess$PriorityUpdateResponse$Status;)V", "(Ljava/lang/String;Ljava/lang/Exception;)V", "Lcom/garmin/proto/generated/GDIFileAccess$PriorityUpdateResponse$Status;", "getStatus", "()Lcom/garmin/proto/generated/GDIFileAccess$PriorityUpdateResponse$Status;", "Companion", "a", "file-transfer-device_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class PriorityUpdateException extends FileTransferException {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final GDIFileAccess.PriorityUpdateResponse.Status status;

    /* JADX WARN: Illegal instructions before constructor call */
    public PriorityUpdateException(GDIFileAccess.PriorityUpdateResponse.Status status) {
        String str;
        status.getClass();
        INSTANCE.getClass();
        int i14 = Companion.C1023a.f50722a[status.ordinal()];
        if (i14 == 1) {
            h.z("");
            throw null;
        }
        if (i14 == 2) {
            str = "Priority update failed: Invalid priority";
        } else {
            if (i14 != 3) {
                u0.r();
                throw null;
            }
            str = "Priority update failed: Unknown transfer handle";
        }
        this(status, str, null, 4, null);
    }

    public final GDIFileAccess.PriorityUpdateResponse.Status getStatus() {
        return this.status;
    }

    /* JADX INFO: renamed from: com.garmin.device.filetransfer.PriorityUpdateException$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/garmin/device/filetransfer/PriorityUpdateException$a;", "", "<init>", "()V", "file-transfer-device_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {

        /* JADX INFO: renamed from: com.garmin.device.filetransfer.PriorityUpdateException$a$a, reason: collision with other inner class name */
        public /* synthetic */ class C1023a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f50722a;

            static {
                int[] iArr = new int[GDIFileAccess.PriorityUpdateResponse.Status.values().length];
                try {
                    iArr[GDIFileAccess.PriorityUpdateResponse.Status.SUCCESS.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[GDIFileAccess.PriorityUpdateResponse.Status.INVALID_PRIORITY.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[GDIFileAccess.PriorityUpdateResponse.Status.UNKNOWN_TRANSFER.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                f50722a = iArr;
            }
        }

        public /* synthetic */ Companion(j jVar) {
            this();
        }

        private Companion() {
        }
    }

    private PriorityUpdateException(GDIFileAccess.PriorityUpdateResponse.Status status, String str, Exception exc) {
        super(str, exc);
        this.status = status;
    }

    public /* synthetic */ PriorityUpdateException(GDIFileAccess.PriorityUpdateResponse.Status status, String str, Exception exc, int i14, j jVar) {
        this(status, str, (i14 & 4) != 0 ? null : exc);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public PriorityUpdateException(String str, Exception exc) {
        this(null, str, exc);
        str.getClass();
    }

    public /* synthetic */ PriorityUpdateException(String str, Exception exc, int i14, j jVar) {
        this(str, (i14 & 2) != 0 ? null : exc);
    }
}
