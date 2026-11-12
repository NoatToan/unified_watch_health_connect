package lk2;

import com.garmin.proto.generated.GDIFileAccess;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u001d\u0012\n\u0010\u0004\u001a\u00060\u0002j\u0002`\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Llk2/z;", "", "Lcom/garmin/proto/generated/GDIFileAccess$ResourceUpdateNotification$Status;", "Lcom/garmin/device/filetransfer/ResourceUpdateStatus;", "status", "", "activePriority", "<init>", "(Lcom/garmin/proto/generated/GDIFileAccess$ResourceUpdateNotification$Status;Ljava/lang/Integer;)V", "file-transfer-device_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class z {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final GDIFileAccess.ResourceUpdateNotification.Status f113314a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Integer f113315b;

    public /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f113316a;

        static {
            int[] iArr = new int[GDIFileAccess.ResourceUpdateNotification.Status.values().length];
            try {
                iArr[GDIFileAccess.ResourceUpdateNotification.Status.CURRENT_PRIORITY_LOWERED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[GDIFileAccess.ResourceUpdateNotification.Status.FILE_SPACE_FREED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f113316a = iArr;
        }
    }

    public z(GDIFileAccess.ResourceUpdateNotification.Status status, Integer num) {
        status.getClass();
        this.f113314a = status;
        this.f113315b = num;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z)) {
            return false;
        }
        z zVar = (z) obj;
        return this.f113314a == zVar.f113314a && p005kotlin.jvm.internal.s.g(this.f113315b, zVar.f113315b);
    }

    public final int hashCode() {
        int iHashCode = this.f113314a.hashCode() * 31;
        Integer num = this.f113315b;
        return iHashCode + (num == null ? 0 : num.hashCode());
    }

    public final String toString() {
        int[] iArr = a.f113316a;
        GDIFileAccess.ResourceUpdateNotification.Status status = this.f113314a;
        int i14 = iArr[status.ordinal()];
        Integer num = this.f113315b;
        if (i14 != 1) {
            if (i14 == 2) {
                return "ResourceUpdateEvent(SPACE_FREED)";
            }
            return "ResourceUpdateEvent(" + status + ", activePriority=" + num + ")";
        }
        if (num == null) {
            return "ResourceUpdateEvent(NO_TRANSFER_ACTIVE)";
        }
        return "ResourceUpdateEvent(" + status + ", activePriority=" + num + ")";
    }
}
