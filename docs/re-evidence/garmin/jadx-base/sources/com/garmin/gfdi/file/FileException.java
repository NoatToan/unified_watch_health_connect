package com.garmin.gfdi.file;

import java.util.concurrent.CancellationException;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0003\n\u0002\b\f\u0018\u00002\u00060\u0001j\u0002`\u0002:\u0001\u0012B#\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nB\u0019\b\u0010\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\t\u0010\u000bB\u0011\b\u0010\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\fB\u0011\b\u0010\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\t\u0010\rB\u0019\b\u0010\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\u000eR\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0013"}, d2 = {"Lcom/garmin/gfdi/file/FileException;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "Lcom/garmin/gfdi/file/FileException$a;", "reason", "", "message", "", "cause", "<init>", "(Lcom/garmin/gfdi/file/FileException$a;Ljava/lang/String;Ljava/lang/Throwable;)V", "(Lcom/garmin/gfdi/file/FileException$a;Ljava/lang/String;)V", "(Ljava/lang/Throwable;)V", "(Lcom/garmin/gfdi/file/FileException$a;)V", "(Lcom/garmin/gfdi/file/FileException$a;Ljava/lang/Throwable;)V", "Lcom/garmin/gfdi/file/FileException$a;", "getReason", "()Lcom/garmin/gfdi/file/FileException$a;", "a", "gfdi_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class FileException extends Exception {
    private final a reason;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0003\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/garmin/gfdi/file/FileException$a;", "", "<init>", "(Ljava/lang/String;I)V", "gfdi_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public enum a {
        FILE_INDEX_NOT_READABLE,
        DATA_REQUESTED_EXCEEDS_FILE_SIZE,
        NOT_ENOUGH_SPACE,
        NOT_SUPPORTED,
        NO_SLOTS_FOR_TYPE,
        NOT_ENOUGH_SPACE_FOR_FILE_TYPE,
        FILE_INDEX_DOES_NOT_EXIST,
        FILE_INDEX_NOT_WRITABLE,
        INVALID_REQUEST,
        NOT_READY,
        CRC_MISMATCH,
        CANCELLED_BY_DEVICE,
        OFFSET_MISMATCH,
        COMPRESSION_ERROR,
        UNEXPECTED_PACKET_COUNTER,
        TIMEOUT,
        CANCELLED_BY_APP,
        TRANSFER_IN_PROGRESS,
        MALFORMED_GFDI_MESSAGE,
        INTERNAL_ERROR,
        CONNECTION_CLOSED
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public FileException(a aVar, String str, Throwable th3) {
        aVar.getClass();
        if (str == null) {
            str = "Operation failed: " + aVar;
        }
        super(str, th3);
        this.reason = aVar;
    }

    public final a getReason() {
        return this.reason;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public FileException(a aVar, String str) {
        this(aVar, str, null);
        aVar.getClass();
        str.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public FileException(Throwable th3) {
        this(th3 instanceof CancellationException ? a.CANCELLED_BY_APP : a.INTERNAL_ERROR, null, th3);
        th3.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public FileException(a aVar) {
        this(aVar, "Operation failed: " + aVar, null);
        aVar.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public FileException(a aVar, Throwable th3) {
        this(aVar, null, th3);
        aVar.getClass();
        th3.getClass();
    }
}
