package np1;

import android.os.Parcelable;
import b71.i;
import com.google.gson.annotations.SerializedName;
import com.nimbusds.jose.jwk.JWKParameterNames;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import p005kotlin.jvm.internal.s;
import to.o;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000f\b\u0087\b\u0018\u00002\u00020\u0001BC\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\f\u0010\u000eR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u000f\u0010\u0011R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0010\u001a\u0004\b\u0013\u0010\u0011R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0010\u001a\u0004\b\u0014\u0010\u0011R\u001c\u0010\t\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0012\u0010\u0016¨\u0006\u0017"}, d2 = {"Lnp1/b;", "", "", "activityId", "", "activityName", "startTimeGMT", "startTimeLocal", "Lto/o;", "activityType", "<init>", "(Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lto/o;)V", "a", "Ljava/lang/Long;", "()Ljava/lang/Long;", "b", "Ljava/lang/String;", "()Ljava/lang/String;", "c", "d", JWKParameterNames.RSA_EXPONENT, "Lto/o;", "()Lto/o;", "gcm-solar-intensity_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @SerializedName("activityId")
    private final Long activityId;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @SerializedName("activityName")
    private final String activityName;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @SerializedName("startTimeGMT")
    private final String startTimeGMT;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @SerializedName("startTimeLocal")
    private final String startTimeLocal;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @SerializedName("activityType")
    private final o activityType;

    static {
        Parcelable.Creator<o> creator = o.CREATOR;
    }

    public /* synthetic */ b(Long l14, String str, String str2, String str3, o oVar, int i14, j jVar) {
        this((i14 & 1) != 0 ? null : l14, (i14 & 2) != 0 ? null : str, (i14 & 4) != 0 ? null : str2, (i14 & 8) != 0 ? null : str3, (i14 & 16) != 0 ? null : oVar);
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final Long getActivityId() {
        return this.activityId;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getActivityName() {
        return this.activityName;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final o getActivityType() {
        return this.activityType;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final String getStartTimeGMT() {
        return this.startTimeGMT;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final String getStartTimeLocal() {
        return this.startTimeLocal;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return s.g(this.activityId, bVar.activityId) && s.g(this.activityName, bVar.activityName) && s.g(this.startTimeGMT, bVar.startTimeGMT) && s.g(this.startTimeLocal, bVar.startTimeLocal) && s.g(this.activityType, bVar.activityType);
    }

    public final int hashCode() {
        Long l14 = this.activityId;
        int iHashCode = (l14 == null ? 0 : l14.hashCode()) * 31;
        String str = this.activityName;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.startTimeGMT;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.startTimeLocal;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        o oVar = this.activityType;
        return iHashCode4 + (oVar != null ? oVar.hashCode() : 0);
    }

    public final String toString() {
        Long l14 = this.activityId;
        String str = this.activityName;
        String str2 = this.startTimeGMT;
        String str3 = this.startTimeLocal;
        o oVar = this.activityType;
        StringBuilder sbJ = i.j("ActivityListItemDTO(activityId=", ", activityName=", str, l14, ", startTimeGMT=");
        sn.a.t(sbJ, str2, ", startTimeLocal=", str3, ", activityType=");
        sbJ.append(oVar);
        sbJ.append(")");
        return sbJ.toString();
    }

    public b(Long l14, String str, String str2, String str3, o oVar) {
        this.activityId = l14;
        this.activityName = str;
        this.startTimeGMT = str2;
        this.startTimeLocal = str3;
        this.activityType = oVar;
    }

    public b() {
        this(null, null, null, null, null, 31, null);
    }
}
