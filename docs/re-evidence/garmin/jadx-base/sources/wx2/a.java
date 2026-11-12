package wx2;

import com.garmin.proto.generated.GDISmartProto;
import com.google.firebase.messaging.Constants;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import p005kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001:\u0001\nB)\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\t¨\u0006\u000b"}, d2 = {"Lwx2/a;", "", "", "successful", "", Constants.IPC_BUNDLE_KEY_SEND_ERROR, "Lcom/garmin/proto/generated/GDISmartProto$Smart;", "smart", "<init>", "(ZLjava/lang/Integer;Lcom/garmin/proto/generated/GDISmartProto$Smart;)V", "a", "sms_release"}, k = 1, mv = {1, 4, 1})
public final /* data */ class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f188010a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Integer f188011b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final GDISmartProto.Smart f188012c;

    static {
        new C3493a(null);
    }

    public /* synthetic */ a(boolean z14, Integer num, GDISmartProto.Smart smart, int i14, j jVar) {
        this((i14 & 1) != 0 ? true : z14, (i14 & 2) != 0 ? null : num, (i14 & 4) != 0 ? null : smart);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.f188010a == aVar.f188010a && s.g(this.f188011b, aVar.f188011b) && s.g(this.f188012c, aVar.f188012c);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r0v7 */
    public final int hashCode() {
        boolean z14 = this.f188010a;
        ?? r14 = z14;
        if (z14) {
            r14 = 1;
        }
        int i14 = r14 * 31;
        Integer num = this.f188011b;
        int iHashCode = (i14 + (num != null ? num.hashCode() : 0)) * 31;
        GDISmartProto.Smart smart = this.f188012c;
        return iHashCode + (smart != null ? smart.hashCode() : 0);
    }

    public final String toString() {
        return "MessageResult(successful=" + this.f188010a + ", error=" + this.f188011b + ", smart=" + this.f188012c + ")";
    }

    /* JADX INFO: renamed from: wx2.a$a, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\u0006R\u0014\u0010\t\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\t\u0010\u0006R\u0014\u0010\n\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\n\u0010\u0006¨\u0006\u000b"}, d2 = {"Lwx2/a$a;", "", "<init>", "()V", "", "INVALID_MESSAGE", "I", "INVALID_NUMBER", "INVALID_NUMBER_OR_MESSAGE", "INVALID_REQUEST", "MISSING_PERMISSION", "sms_release"}, k = 1, mv = {1, 4, 1})
    public static final class C3493a {
        private C3493a() {
        }

        public /* synthetic */ C3493a(j jVar) {
            this();
        }
    }

    public a(boolean z14, Integer num, GDISmartProto.Smart smart) {
        this.f188010a = z14;
        this.f188011b = num;
        this.f188012c = smart;
    }

    public a() {
        this(false, null, null, 7, null);
    }
}
