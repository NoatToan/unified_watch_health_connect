package bl2;

import com.garmin.device.filetransfer.DataSourceModifiedException;
import com.garmin.device.filetransfer.FileTransferException;
import com.garmin.device.filetransfer.ItemAccessException;
import com.garmin.device.filetransfer.TransferStatusException;
import com.garmin.proto.generated.GDIFileAccess;
import org.slf4j.Logger;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\bÀ\u0002\u0018\u00002\u00020\u0001:\u0001\u0004B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lbl2/n;", "", "<init>", "()V", "a", "file-transfer-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final n f18688a = new n();

    public /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f18691a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int[] f18692b;

        static {
            int[] iArr = new int[GDIFileAccess.ItemAccessResult.values().length];
            try {
                iArr[GDIFileAccess.ItemAccessResult.ITEM_TYPE_NOT_SUPPORTED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[GDIFileAccess.ItemAccessResult.NO_AVAILABLE_RESOURCES.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[GDIFileAccess.ItemAccessResult.CONFLICTING_PUSH_REQUEST.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[GDIFileAccess.ItemAccessResult.NO_SPACE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[GDIFileAccess.ItemAccessResult.AMBIGUOUS_DATA_TYPE.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[GDIFileAccess.ItemAccessResult.UNKNOWN_ITEM.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            f18691a = iArr;
            int[] iArr2 = new int[GDIFileAccess.TransferStatusRequest.FailureReason.values().length];
            try {
                iArr2[GDIFileAccess.TransferStatusRequest.FailureReason.CANCELLED_BY_DEVICE.ordinal()] = 1;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr2[GDIFileAccess.TransferStatusRequest.FailureReason.CANCELLED_BY_CLIENT.ordinal()] = 2;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr2[GDIFileAccess.TransferStatusRequest.FailureReason.HIGHER_PRIORITY_REQUEST_RECEIVED.ordinal()] = 3;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr2[GDIFileAccess.TransferStatusRequest.FailureReason.ITEM_DELETED.ordinal()] = 4;
            } catch (NoSuchFieldError unused10) {
            }
            f18692b = iArr2;
        }
    }

    private n() {
    }

    public static pk2.y a(ok2.b bVar, rs2.c cVar, wk2.i iVar, pk2.y yVar, ok2.e eVar) {
        bVar.getClass();
        cVar.getClass();
        iVar.getClass();
        yVar.getClass();
        if (!yVar.f138508a || eVar == null || eVar.a() || bVar.getConfiguration().l(cVar, iVar.getF205152b()).isEmpty()) {
            return null;
        }
        return pk2.y.FILE_TYPE_BLOCKING_FAILURE;
    }

    public static a b(wk2.i iVar, FileTransferException fileTransferException, Logger logger) {
        iVar.getClass();
        int i14 = 2;
        p005kotlin.jvm.internal.j jVar = null;
        boolean z14 = false;
        boolean z15 = true;
        if ((fileTransferException instanceof ItemAccessException) && ((ItemAccessException) fileTransferException).getItemAccessResult() == GDIFileAccess.ItemAccessResult.INVALID_OFFSET) {
            logger.warn("Invalid offset for " + iVar.getId() + ", retry from beginning");
            return new a(z15, z14, i14, jVar);
        }
        if (fileTransferException instanceof DataSourceModifiedException) {
            logger.warn("Data source modified while in progress for " + iVar.getId() + ", retry from beginning");
            return new a(z15, z14, i14, jVar);
        }
        if (!(fileTransferException instanceof TransferStatusException) || ((TransferStatusException) fileTransferException).getStatus() != GDIFileAccess.TransferStatusRequest.FailureReason.COMPRESSION_FAILED) {
            return null;
        }
        logger.warn("Compression failed for " + iVar.getId() + ", retry without compression");
        return new a(iVar.getDirection() == wk2.h.DEVICE_TO_PHONE, true);
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lbl2/n$a;", "", "", "resetOffset", "disableCompression", "<init>", "(ZZ)V", "file-transfer-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final boolean f18689a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final boolean f18690b;

        public /* synthetic */ a(boolean z14, boolean z15, int i14, p005kotlin.jvm.internal.j jVar) {
            this((i14 & 1) != 0 ? false : z14, (i14 & 2) != 0 ? false : z15);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.f18689a == aVar.f18689a && this.f18690b == aVar.f18690b;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f18690b) + (Boolean.hashCode(this.f18689a) * 31);
        }

        public final String toString() {
            return com.airbnb.lottie.animation.keyframe.a.e("RestartOptions(resetOffset=", ", disableCompression=", ")", this.f18689a, this.f18690b);
        }

        public a(boolean z14, boolean z15) {
            this.f18689a = z14;
            this.f18690b = z15;
        }

        /* JADX WARN: Illegal instructions before constructor call */
        public a() {
            boolean z14 = false;
            this(z14, z14, 3, null);
        }
    }
}
