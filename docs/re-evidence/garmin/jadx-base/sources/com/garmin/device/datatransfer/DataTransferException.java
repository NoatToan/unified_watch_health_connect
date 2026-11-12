package com.garmin.device.datatransfer;

import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import p005kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0006\b\u0016\u0018\u0000 \t2\u00060\u0001j\u0002`\u0002:\u0001\nB\u001d\b\u0000\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\b¨\u0006\u000b"}, d2 = {"Lcom/garmin/device/datatransfer/DataTransferException;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "", "message", "", "cause", "<init>", "(Ljava/lang/String;Ljava/lang/Throwable;)V", "Companion", "a", "data-transfer_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public class DataTransferException extends Exception {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX WARN: Illegal instructions before constructor call */
    public DataTransferException(String str, Throwable th3) {
        str.getClass();
        INSTANCE.getClass();
        if (th3 != null && (th3 instanceof DataTransferException)) {
            DataTransferException dataTransferException = (DataTransferException) th3;
            if (s.g(dataTransferException.getMessage(), str)) {
                th3 = dataTransferException.getCause();
            }
        }
        super(str, th3);
    }

    /* JADX INFO: renamed from: com.garmin.device.datatransfer.DataTransferException$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/garmin/device/datatransfer/DataTransferException$a;", "", "<init>", "()V", "data-transfer_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(j jVar) {
            this();
        }

        private Companion() {
        }
    }

    public /* synthetic */ DataTransferException(String str, Throwable th3, int i14, j jVar) {
        this(str, (i14 & 2) != 0 ? null : th3);
    }
}
