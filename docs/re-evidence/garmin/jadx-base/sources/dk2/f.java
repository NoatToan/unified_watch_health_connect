package dk2;

import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\bB\u001f\b\u0002\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\t"}, d2 = {"Ldk2/f;", "", "", "osErrorCode", "", "isPreReq", "<init>", "(Ljava/lang/String;ILjava/lang/Integer;Z)V", "a", "device-discovery_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public enum f {
    /* JADX INFO: Fake field, exist only in values array */
    SCAN_FAILED_ALREADY_STARTED(1, false, 2, null),
    SCAN_FAILED_APPLICATION_REGISTRATION_FAILED(2, false, 2, null),
    /* JADX INFO: Fake field, exist only in values array */
    SCAN_FAILED_INTERNAL_ERROR(3, false, 2, null),
    /* JADX INFO: Fake field, exist only in values array */
    SCAN_FAILED_FEATURE_UNSUPPORTED(4, false, 2, null),
    SCAN_FAILED_UNKNOWN_OS_CODE(null, false, 3, null),
    DISCOVERY_PRE_REQS_NOT_MET_BT(null, true, 1, null),
    /* JADX INFO: Fake field, exist only in values array */
    DISCOVERY_PRE_REQS_NOT_MET_LOCATION(null, 1 == true ? 1 : 0, 1, null),
    DISCOVERY_TIMEOUT(null, false, 3, null);


    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f60249b = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Integer f60255a;

    /* synthetic */ f(Integer num, boolean z14, int i14, j jVar) {
        this((i14 & 1) != 0 ? null : num, (i14 & 2) != 0 ? false : z14);
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Ldk2/f$a;", "", "<init>", "()V", "device-discovery_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(j jVar) {
            this();
        }

        private a() {
        }
    }

    f(Integer num, boolean z14) {
        this.f60255a = num;
    }
}
