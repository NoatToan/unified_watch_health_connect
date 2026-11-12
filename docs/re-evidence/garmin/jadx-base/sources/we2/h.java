package we2;

import com.google.gson.annotations.SerializedName;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import p005kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0011\b\u0081\b\u0018\u00002\u00020\u0001B3\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u001c\u0010\t\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0017\u001a\u0004\b\u0010\u0010\u0018¨\u0006\u0019"}, d2 = {"Lwe2/h;", "", "Lwe2/d;", "eventType", "Lwe2/e;", "flowName", "", "logMessage", "Lwe2/c;", "data", "<init>", "(Lwe2/d;Lwe2/e;Ljava/lang/String;Lwe2/c;)V", "a", "Lwe2/d;", "c", "()Lwe2/d;", "b", "Lwe2/e;", "d", "()Lwe2/e;", "Ljava/lang/String;", "getLogMessage", "()Ljava/lang/String;", "Lwe2/c;", "()Lwe2/c;", "mobile-auth_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @SerializedName("eventType")
    private final d eventType;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @SerializedName("flowName")
    private final e flowName;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @SerializedName("logMessage")
    private final String logMessage;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @SerializedName("data")
    private final c data;

    public /* synthetic */ h(d dVar, e eVar, String str, c cVar, int i14, j jVar) {
        this(dVar, (i14 & 2) != 0 ? null : eVar, (i14 & 4) != 0 ? null : str, (i14 & 8) != 0 ? null : cVar);
    }

    public final String a(boolean z14) {
        String strName;
        c cVar;
        String strName2 = this.eventType.name();
        e eVar = this.flowName;
        String str = "";
        if (eVar == null || (strName = eVar.name()) == null) {
            strName = "";
        }
        String str2 = this.logMessage;
        if (str2 == null) {
            str2 = "";
        }
        if (z14 && (cVar = this.data) != null && cVar.getCommunication() != null) {
            str = ", " + this.data.getCommunication();
        }
        return am.j.o(str2, str, p6.b.i("eventType=", strName2, ", flowName=", strName, ", logMessage="));
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final c getData() {
        return this.data;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final d getEventType() {
        return this.eventType;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final e getFlowName() {
        return this.flowName;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        return this.eventType == hVar.eventType && this.flowName == hVar.flowName && s.g(this.logMessage, hVar.logMessage) && s.g(this.data, hVar.data);
    }

    public final int hashCode() {
        int iHashCode = this.eventType.hashCode() * 31;
        e eVar = this.flowName;
        int iHashCode2 = (iHashCode + (eVar == null ? 0 : eVar.hashCode())) * 31;
        String str = this.logMessage;
        int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        c cVar = this.data;
        return iHashCode3 + (cVar != null ? cVar.hashCode() : 0);
    }

    public final String toString() {
        c cVar = this.data;
        if (cVar == null) {
            return a(false);
        }
        return a(false) + ", " + cVar;
    }

    public h(d dVar, e eVar, String str, c cVar) {
        dVar.getClass();
        this.eventType = dVar;
        this.flowName = eVar;
        this.logMessage = str;
        this.data = cVar;
    }
}
