package dn;

import com.google.gson.annotations.SerializedName;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;
import v.e0;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\u0007\u0010\tR\u001a\u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\b\u001a\u0004\b\u000b\u0010\t¨\u0006\f"}, d2 = {"Ldn/b;", "", "", "activityType", "lastActivityDate", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "a", "Ljava/lang/String;", "()Ljava/lang/String;", "b", "getLastActivityDate", "gcm-domain-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @SerializedName("activityType")
    private final String activityType;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @SerializedName("lastActivityDate")
    private final String lastActivityDate;

    public b(String str, String str2) {
        str.getClass();
        str2.getClass();
        this.activityType = str;
        this.lastActivityDate = str2;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getActivityType() {
        return this.activityType;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return s.g(this.activityType, bVar.activityType) && s.g(this.lastActivityDate, bVar.lastActivityDate);
    }

    public final int hashCode() {
        return this.lastActivityDate.hashCode() + (this.activityType.hashCode() * 31);
    }

    public final String toString() {
        return e0.g("HistoricalActivityTypeIndicator(activityType=", this.activityType, ", lastActivityDate=", this.lastActivityDate, ")");
    }
}
