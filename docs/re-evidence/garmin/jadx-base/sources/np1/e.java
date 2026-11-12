package np1;

import com.google.gson.annotations.SerializedName;
import java.util.List;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import p005kotlin.jvm.internal.s;
import p13.j0;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004¢\u0006\u0004\b\u0007\u0010\bR$\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\t\u0010\n\u001a\u0004\b\t\u0010\u000b\"\u0004\b\f\u0010\rR*\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u000e\u0010\u0010\"\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"Lnp1/e;", "", "", "localConnectDate", "", "Lnp1/d;", "solarInputReadings", "<init>", "(Ljava/lang/String;Ljava/util/List;)V", "a", "Ljava/lang/String;", "()Ljava/lang/String;", "setLocalConnectDate", "(Ljava/lang/String;)V", "b", "Ljava/util/List;", "()Ljava/util/List;", "setSolarInputReadings", "(Ljava/util/List;)V", "gcm-solar-intensity_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @SerializedName("localConnectDate")
    private String localConnectDate;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @SerializedName("solarInputReadings")
    private List<d> solarInputReadings;

    public e(String str, List list, int i14, j jVar) {
        this((i14 & 1) != 0 ? null : str, (i14 & 2) != 0 ? j0.f134944a : list);
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getLocalConnectDate() {
        return this.localConnectDate;
    }

    public final List<d> b() {
        return this.solarInputReadings;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return s.g(this.localConnectDate, eVar.localConnectDate) && s.g(this.solarInputReadings, eVar.solarInputReadings);
    }

    public final int hashCode() {
        String str = this.localConnectDate;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        List<d> list = this.solarInputReadings;
        return iHashCode + (list != null ? list.hashCode() : 0);
    }

    public final String toString() {
        return fb1.c.o("SolarIntensityDTO(localConnectDate=", this.localConnectDate, ", solarInputReadings=", this.solarInputReadings, ")");
    }

    public e(String str, List<d> list) {
        this.localConnectDate = str;
        this.solarInputReadings = list;
    }

    public e() {
        this(null, null, 3, null);
    }
}
