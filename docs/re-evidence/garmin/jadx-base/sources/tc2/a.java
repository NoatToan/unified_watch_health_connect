package tc2;

import com.garmin.android.apps.connectmobile.f3;
import com.google.gson.annotations.SerializedName;
import com.google.maps.android.BuildConfig;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\u000e\b\u0086\b\u0018\u00002\u00020\u0001B%\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\u000e\u001a\u0004\b\n\u0010\u000fR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Ltc2/a;", "", "Ltc2/b;", "status", "", "graduationDateUTC", "", "requiredAge", "<init>", "(Ltc2/b;Ljava/lang/Long;Ljava/lang/Integer;)V", "a", "Ltc2/b;", "b", "()Ltc2/b;", "Ljava/lang/Long;", "()Ljava/lang/Long;", "c", "Ljava/lang/Integer;", "getRequiredAge", "()Ljava/lang/Integer;", "networking-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @SerializedName("status")
    private final b status;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @SerializedName("graduationDate")
    private final Long graduationDateUTC;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @SerializedName("requiredAge")
    private final Integer requiredAge;

    public a(b bVar, Long l14, Integer num) {
        this.status = bVar;
        this.graduationDateUTC = l14;
        this.requiredAge = num;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final Long getGraduationDateUTC() {
        return this.graduationDateUTC;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final b getStatus() {
        return this.status;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.status == aVar.status && s.g(this.graduationDateUTC, aVar.graduationDateUTC) && s.g(this.requiredAge, aVar.requiredAge);
    }

    public final int hashCode() {
        b bVar = this.status;
        int iHashCode = (bVar == null ? 0 : bVar.hashCode()) * 31;
        Long l14 = this.graduationDateUTC;
        int iHashCode2 = (iHashCode + (l14 == null ? 0 : l14.hashCode())) * 31;
        Integer num = this.requiredAge;
        return iHashCode2 + (num != null ? num.hashCode() : 0);
    }

    public final String toString() {
        String strName;
        b bVar = this.status;
        if (bVar == null || (strName = bVar.name()) == null) {
            strName = BuildConfig.TRAVIS;
        }
        Long l14 = this.graduationDateUTC;
        Integer num = this.requiredAge;
        StringBuilder sb3 = new StringBuilder("AgeDetail(status=");
        sb3.append(strName);
        sb3.append(", graduationDateUTC=");
        sb3.append(l14);
        sb3.append(", requiredAge=");
        return f3.i(sb3, num, ")");
    }
}
