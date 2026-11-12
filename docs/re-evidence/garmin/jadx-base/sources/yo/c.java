package yo;

import com.garmin.android.gncs.NotificationConstants;
import com.google.gson.annotations.SerializedName;
import com.nimbusds.jose.jwk.JWKParameterNames;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0017\b\u0087\b\u0018\u00002\u00020\u0001B3\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\u0002¢\u0006\u0004\b\n\u0010\u000bR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\"\u0010\b\u001a\u00020\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0017\u0010\u0019\"\u0004\b\u001a\u0010\u001bR\"\u0010\t\u001a\u00020\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0015\u0010\u0018\u001a\u0004\b\u0013\u0010\u0019\"\u0004\b\u001c\u0010\u001b¨\u0006\u001d"}, d2 = {"Lyo/c;", "", "", "activityId", "", "legOperation", "Lto/o;", NotificationConstants.KEY_DATA_MIME_TYPE, "startTime", "endTime", "<init>", "(Ljava/lang/Long;Ljava/lang/String;Lto/o;JJ)V", "a", "Ljava/lang/Long;", "b", "()Ljava/lang/Long;", "Ljava/lang/String;", "getLegOperation", "()Ljava/lang/String;", "c", "Lto/o;", JWKParameterNames.RSA_EXPONENT, "()Lto/o;", "d", "J", "()J", "g", "(J)V", "f", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @SerializedName("activityId")
    private final Long activityId;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @SerializedName("operation")
    private final String legOperation;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @SerializedName("activityTypeDTO")
    private final to.o type;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @SerializedName("startTime")
    private long startTime;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @SerializedName("endTime")
    private long endTime;

    public c(Long l14, String str, to.o oVar, long j8, long j14) {
        str.getClass();
        this.activityId = l14;
        this.legOperation = str;
        this.type = oVar;
        this.startTime = j8;
        this.endTime = j14;
    }

    public static c a(c cVar, String str, long j8, long j14, int i14) {
        Long l14 = cVar.activityId;
        to.o oVar = cVar.type;
        if ((i14 & 8) != 0) {
            j8 = cVar.startTime;
        }
        long j15 = j8;
        if ((i14 & 16) != 0) {
            j14 = cVar.endTime;
        }
        cVar.getClass();
        str.getClass();
        return new c(l14, str, oVar, j15, j14);
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final Long getActivityId() {
        return this.activityId;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final long getEndTime() {
        return this.endTime;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final long getStartTime() {
        return this.startTime;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final to.o getType() {
        return this.type;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return p005kotlin.jvm.internal.s.g(this.activityId, cVar.activityId) && p005kotlin.jvm.internal.s.g(this.legOperation, cVar.legOperation) && p005kotlin.jvm.internal.s.g(this.type, cVar.type) && this.startTime == cVar.startTime && this.endTime == cVar.endTime;
    }

    public final void f(long j8) {
        this.endTime = j8;
    }

    public final void g(long j8) {
        this.startTime = j8;
    }

    public final int hashCode() {
        Long l14 = this.activityId;
        int iJ = wr.g.j((l14 == null ? 0 : l14.hashCode()) * 31, 31, this.legOperation);
        to.o oVar = this.type;
        return Long.hashCode(this.endTime) + q6.f.e((iJ + (oVar != null ? oVar.hashCode() : 0)) * 31, 31, this.startTime);
    }

    public final String toString() {
        Long l14 = this.activityId;
        String str = this.legOperation;
        to.o oVar = this.type;
        long j8 = this.startTime;
        long j14 = this.endTime;
        StringBuilder sbJ = b71.i.j("LegReconstructRequest(activityId=", ", legOperation=", str, l14, ", type=");
        sbJ.append(oVar);
        sbJ.append(", startTime=");
        sbJ.append(j8);
        return com.nimbusds.jose.shaded.gson.internal.a.g(j14, ", endTime=", ")", sbJ);
    }
}
