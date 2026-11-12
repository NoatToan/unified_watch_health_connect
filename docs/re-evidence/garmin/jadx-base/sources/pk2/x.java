package pk2;

import com.garmin.device.filetransfer.ItemAccessException;
import com.garmin.device.filetransfer.TransferStatusException;
import com.garmin.device.filetransfer.core.util.CoreTransferException;
import com.garmin.device.filetransfer.core.util.UploadDestinationException;
import com.garmin.device.filetransfer.mlr.MLRTransportException;
import com.garmin.proto.generated.GDIFileAccess;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001:\u0001\u000bB\u001b\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007B\u0019\b\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u0006\u0010\n¨\u0006\f"}, d2 = {"Lpk2/x;", "", "Lpk2/y;", "status", "Lcom/garmin/device/filetransfer/core/util/CoreTransferException;", "ex", "<init>", "(Lpk2/y;Lcom/garmin/device/filetransfer/core/util/CoreTransferException;)V", "Lok2/e;", "failure", "(Lpk2/y;Lok2/e;)V", "a", "file-transfer-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class x {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final a f138495e = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final y f138496a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final CoreTransferException f138497b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ok2.e f138498c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f138499d;

    public /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f138500a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int[] f138501b;

        static {
            int[] iArr = new int[GDIFileAccess.ItemAccessResult.values().length];
            try {
                iArr[GDIFileAccess.ItemAccessResult.NO_SUPPORTED_TRANSPORT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            f138500a = iArr;
            int[] iArr2 = new int[GDIFileAccess.TransferStatusRequest.FailureReason.values().length];
            try {
                iArr2[GDIFileAccess.TransferStatusRequest.FailureReason.TRANSPORT_FAILED.ordinal()] = 1;
            } catch (NoSuchFieldError unused2) {
            }
            f138501b = iArr2;
        }
    }

    public x(y yVar, CoreTransferException coreTransferException) {
        yVar.getClass();
        this.f138496a = yVar;
        this.f138497b = coreTransferException;
        this.f138498c = coreTransferException != null ? coreTransferException.getFailure() : null;
        this.f138499d = coreTransferException != null ? coreTransferException.getDetails() : null;
    }

    public final boolean a() {
        ok2.e eVar = this.f138498c;
        if (eVar == null) {
            return false;
        }
        CoreTransferException coreTransferException = this.f138497b;
        if (coreTransferException != null) {
            Integer numY = lg.d.y(coreTransferException);
            if (numY != null && numY.intValue() == 429) {
                return false;
            }
            Throwable cause = coreTransferException.getCause();
            while (true) {
                if (cause == null) {
                    cause = null;
                    break;
                }
                if (MLRTransportException.class.isInstance(cause)) {
                    break;
                }
                cause = cause.getCause();
            }
            if (cause != null) {
                return false;
            }
            Throwable cause2 = coreTransferException.getCause();
            ItemAccessException itemAccessException = cause2 instanceof ItemAccessException ? (ItemAccessException) cause2 : null;
            if (itemAccessException != null) {
                if (b.f138500a[itemAccessException.getItemAccessResult().ordinal()] == 1) {
                    return false;
                }
            }
            Throwable cause3 = coreTransferException.getCause();
            TransferStatusException transferStatusException = cause3 instanceof TransferStatusException ? (TransferStatusException) cause3 : null;
            if (transferStatusException != null) {
                if (b.f138501b[transferStatusException.getStatus().ordinal()] == 1) {
                    return false;
                }
            }
        }
        return eVar.f132658b;
    }

    public final boolean b() {
        if (!this.f138496a.f138508a) {
            return false;
        }
        CoreTransferException coreTransferException = this.f138497b;
        UploadDestinationException uploadDestinationException = coreTransferException instanceof UploadDestinationException ? (UploadDestinationException) coreTransferException : null;
        return uploadDestinationException != null && uploadDestinationException.getInvalidContent();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x)) {
            return false;
        }
        x xVar = (x) obj;
        return this.f138496a == xVar.f138496a && p005kotlin.jvm.internal.s.g(this.f138497b, xVar.f138497b);
    }

    public final int hashCode() {
        int iHashCode = this.f138496a.hashCode() * 31;
        CoreTransferException coreTransferException = this.f138497b;
        return iHashCode + (coreTransferException == null ? 0 : coreTransferException.hashCode());
    }

    public final String toString() {
        String str;
        CoreTransferException coreTransferException = this.f138497b;
        if (coreTransferException != null) {
            str = ", ex=" + coreTransferException;
        } else {
            str = "";
        }
        return "AgentResult(status=" + this.f138496a + str + (b() ? ", resetFile=true" : "") + ")";
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lpk2/x$a;", "", "<init>", "()V", "file-transfer-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        public static x a(y yVar, CoreTransferException coreTransferException) {
            coreTransferException.getClass();
            yVar.getClass();
            return new x(yVar, coreTransferException);
        }

        public static /* synthetic */ x b(a aVar, CoreTransferException coreTransferException) {
            y yVar = y.NON_BLOCKING_FAILURE;
            aVar.getClass();
            return a(yVar, coreTransferException);
        }

        public static x c(a aVar, ok2.e eVar, String str, y yVar, int i14) {
            if ((i14 & 2) != 0) {
                str = null;
            }
            String str2 = str;
            if ((i14 & 4) != 0) {
                yVar = y.NON_BLOCKING_FAILURE;
            }
            aVar.getClass();
            eVar.getClass();
            yVar.getClass();
            return a(yVar, new CoreTransferException(eVar, str2, null, 4, null));
        }

        public static x d(CoreTransferException coreTransferException) {
            coreTransferException.getClass();
            return new x(y.NO_RETRY_FAILURE, coreTransferException);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static x e() {
            return new x(y.SUCCESS, null, 2, 0 == true ? 1 : 0);
        }

        private a() {
        }
    }

    public /* synthetic */ x(y yVar, CoreTransferException coreTransferException, int i14, p005kotlin.jvm.internal.j jVar) {
        this(yVar, (i14 & 2) != 0 ? null : coreTransferException);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public x(y yVar, ok2.e eVar) {
        this(yVar, new CoreTransferException(eVar));
        yVar.getClass();
        eVar.getClass();
    }
}
