package u10;

import com.garmin.proto.generated.GDIConnectIQHTTPProto;
import java.util.HashMap;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;
import r1.q2;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u000bB-\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0014\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006¢\u0006\u0004\b\t\u0010\n¨\u0006\f"}, d2 = {"Lu10/h;", "", "Lcom/garmin/proto/generated/GDIConnectIQHTTPProto$ConnectIQOAuthCompleteRequest$ResponseStatus;", "status", "", "httpStatus", "Ljava/util/HashMap;", "", "resultDataMap", "<init>", "(Lcom/garmin/proto/generated/GDIConnectIQHTTPProto$ConnectIQOAuthCompleteRequest$ResponseStatus;ILjava/util/HashMap;)V", "a", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final GDIConnectIQHTTPProto.ConnectIQOAuthCompleteRequest.ResponseStatus f167748a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f167749b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final HashMap<String, String> f167750c;

    static {
        new a(null);
    }

    public h(GDIConnectIQHTTPProto.ConnectIQOAuthCompleteRequest.ResponseStatus responseStatus, int i14, HashMap<String, String> map) {
        responseStatus.getClass();
        this.f167748a = responseStatus;
        this.f167749b = i14;
        this.f167750c = map;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        return this.f167748a == hVar.f167748a && this.f167749b == hVar.f167749b && s.g(this.f167750c, hVar.f167750c);
    }

    public final int hashCode() {
        int iD = q2.d(this.f167749b, this.f167748a.hashCode() * 31, 31);
        HashMap<String, String> map = this.f167750c;
        return iD + (map == null ? 0 : map.hashCode());
    }

    public final String toString() {
        return "ConnectIQOAuthResponse(status=" + this.f167748a + ", httpStatus=" + this.f167749b + ", resultDataMap=" + this.f167750c + ")";
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006¨\u0006\b"}, d2 = {"Lu10/h$a;", "", "<init>", "()V", "", "RESULT_TYPE_URL_ENCODED", "I", "RESULT_TYPE_JSON", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
