package hs1;

import com.google.gson.annotations.SerializedName;
import i3.e5;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0011\b\u0087\b\u0018\u00002\u00020\u0001B7\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0007\u0010\bR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010\n\u001a\u0004\b\u000e\u0010\fR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010\n\u001a\u0004\b\u0010\u0010\fR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010\n\u001a\u0004\b\u0012\u0010\f¨\u0006\u0013"}, d2 = {"Lhs1/b;", "", "", "eventTimestampGmt", "bodyBatteryLevel", "feedbackShortType", "feedbackLongType", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "a", "Ljava/lang/String;", "getEventTimestampGmt", "()Ljava/lang/String;", "b", "getBodyBatteryLevel", "c", "getFeedbackShortType", "d", "getFeedbackLongType", "gcm-domain-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @SerializedName("eventTimestampGmt")
    private final String eventTimestampGmt;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @SerializedName("bodyBatteryLevel")
    private final String bodyBatteryLevel;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @SerializedName("feedbackShortType")
    private final String feedbackShortType;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @SerializedName("feedbackLongType")
    private final String feedbackLongType;

    public /* synthetic */ b(String str, String str2, String str3, String str4, int i14, p005kotlin.jvm.internal.j jVar) {
        this((i14 & 1) != 0 ? null : str, (i14 & 2) != 0 ? null : str2, (i14 & 4) != 0 ? null : str3, (i14 & 8) != 0 ? null : str4);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return s.g(this.eventTimestampGmt, bVar.eventTimestampGmt) && s.g(this.bodyBatteryLevel, bVar.bodyBatteryLevel) && s.g(this.feedbackShortType, bVar.feedbackShortType) && s.g(this.feedbackLongType, bVar.feedbackLongType);
    }

    public final int hashCode() {
        String str = this.eventTimestampGmt;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.bodyBatteryLevel;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.feedbackShortType;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.feedbackLongType;
        return iHashCode3 + (str4 != null ? str4.hashCode() : 0);
    }

    public final String toString() {
        String str = this.eventTimestampGmt;
        String str2 = this.bodyBatteryLevel;
        return e5.h(p6.b.i("BodyBatteryDynamicFeedbackEvent(eventTimestampGmt=", str, ", bodyBatteryLevel=", str2, ", feedbackShortType="), this.feedbackShortType, ", feedbackLongType=", this.feedbackLongType, ")");
    }

    public b(String str, String str2, String str3, String str4) {
        this.eventTimestampGmt = str;
        this.bodyBatteryLevel = str2;
        this.feedbackShortType = str3;
        this.feedbackLongType = str4;
    }

    public b() {
        this(null, null, null, null, 15, null);
    }
}
