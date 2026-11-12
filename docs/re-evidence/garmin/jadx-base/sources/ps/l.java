package ps;

import com.google.gson.annotations.SerializedName;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001B\u0013\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005R$\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t\"\u0004\b\u0006\u0010\u0005¨\u0006\n"}, d2 = {"Lps/l;", "", "Lps/c;", "calendarEventInfo", "<init>", "(Lps/c;)V", "a", "Lps/c;", "getCalendarEventInfo", "()Lps/c;", "gcm-domain-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @SerializedName("calendarEventInfo")
    private c calendarEventInfo;

    public /* synthetic */ l(c cVar, int i14, p005kotlin.jvm.internal.j jVar) {
        this((i14 & 1) != 0 ? null : cVar);
    }

    public final void a() {
        this.calendarEventInfo = null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof l) && p005kotlin.jvm.internal.s.g(this.calendarEventInfo, ((l) obj).calendarEventInfo);
    }

    public final int hashCode() {
        c cVar = this.calendarEventInfo;
        if (cVar == null) {
            return 0;
        }
        return cVar.hashCode();
    }

    public final String toString() {
        return "ActivityMetadataDTO(calendarEventInfo=" + this.calendarEventInfo + ")";
    }

    public l(c cVar) {
        this.calendarEventInfo = cVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public l() {
        this(null, 1, 0 == true ? 1 : 0);
    }
}
