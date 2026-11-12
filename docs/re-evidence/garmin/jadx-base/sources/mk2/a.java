package mk2;

import com.garmin.proto.generated.GDIDataTransferProto;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0004B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lmk2/a;", "", "<init>", "(Ljava/lang/String;I)V", "a", "file-transfer-device_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public enum a {
    IMMEDIATE,
    DURING_ACTIVITY,
    SOON,
    STANDARD;


    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C2267a f119182a = new C2267a(null);

    /* JADX INFO: renamed from: mk2.a$a, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lmk2/a$a;", "", "<init>", "()V", "", "MAX_DIRECT_TRANSFER_PRIORITY", "I", "file-transfer-device_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class C2267a {

        /* JADX INFO: renamed from: mk2.a$a$a, reason: collision with other inner class name */
        public /* synthetic */ class C2268a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f119188a;

            static {
                int[] iArr = new int[GDIDataTransferProto.FileAccessItemRequest.Latency.values().length];
                try {
                    iArr[GDIDataTransferProto.FileAccessItemRequest.Latency.SOON.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[GDIDataTransferProto.FileAccessItemRequest.Latency.IMMEDIATE.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[GDIDataTransferProto.FileAccessItemRequest.Latency.DURING_ACTIVITY.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                f119188a = iArr;
            }
        }

        public /* synthetic */ C2267a(j jVar) {
            this();
        }

        private C2267a() {
        }
    }
}
