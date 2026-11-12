package dy;

import am.j;
import com.google.gson.annotations.SerializedName;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Ldy/b;", "", "", "startDate", "<init>", "(Ljava/lang/String;)V", "a", "Ljava/lang/String;", "getStartDate", "()Ljava/lang/String;", "gcm-domain-calendar_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @SerializedName("startDate")
    private final String startDate;

    public b(String str) {
        this.startDate = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof b) && s.g(this.startDate, ((b) obj).startDate);
    }

    public final int hashCode() {
        String str = this.startDate;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public final String toString() {
        return j.m("SendCalendarWorkoutRequestBody(startDate=", this.startDate, ")");
    }
}
