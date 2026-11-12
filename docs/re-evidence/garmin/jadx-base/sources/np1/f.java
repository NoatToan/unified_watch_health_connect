package np1;

import com.google.gson.annotations.SerializedName;
import java.util.List;
import km1.v;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import p005kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\b\u0087\b\u0018\u00002\u00020\u0001B3\u0012\u0012\b\u0002\u0010\u0004\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nR$\u0010\u0004\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\u000b\u0010\rR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u000e\u0010\u0010R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, d2 = {"Lnp1/f;", "", "", "Lkm1/v;", "dailySleeps", "Lnp1/c;", "deviceSolarInputDTO", "Lnp1/a;", "listOfAllActivities", "<init>", "(Ljava/util/List;Lnp1/c;Lnp1/a;)V", "a", "Ljava/util/List;", "()Ljava/util/List;", "b", "Lnp1/c;", "()Lnp1/c;", "c", "Lnp1/a;", "()Lnp1/a;", "gcm-solar-intensity_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @SerializedName("DailySleeps")
    private final List<v> dailySleeps;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @SerializedName("deviceSolarInput")
    private final c deviceSolarInputDTO;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @SerializedName("listOfAllActivities")
    private final a listOfAllActivities;

    public /* synthetic */ f(List list, c cVar, a aVar, int i14, j jVar) {
        this((i14 & 1) != 0 ? null : list, (i14 & 2) != 0 ? null : cVar, (i14 & 4) != 0 ? null : aVar);
    }

    public final List<v> a() {
        return this.dailySleeps;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final c getDeviceSolarInputDTO() {
        return this.deviceSolarInputDTO;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final a getListOfAllActivities() {
        return this.listOfAllActivities;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return s.g(this.dailySleeps, fVar.dailySleeps) && s.g(this.deviceSolarInputDTO, fVar.deviceSolarInputDTO) && s.g(this.listOfAllActivities, fVar.listOfAllActivities);
    }

    public final int hashCode() {
        List<v> list = this.dailySleeps;
        int iHashCode = (list == null ? 0 : list.hashCode()) * 31;
        c cVar = this.deviceSolarInputDTO;
        int iHashCode2 = (iHashCode + (cVar == null ? 0 : cVar.hashCode())) * 31;
        a aVar = this.listOfAllActivities;
        return iHashCode2 + (aVar != null ? aVar.hashCode() : 0);
    }

    public final String toString() {
        return "SolarIntensityListDTO(dailySleeps=" + this.dailySleeps + ", deviceSolarInputDTO=" + this.deviceSolarInputDTO + ", listOfAllActivities=" + this.listOfAllActivities + ")";
    }

    public f(List<v> list, c cVar, a aVar) {
        this.dailySleeps = list;
        this.deviceSolarInputDTO = cVar;
        this.listOfAllActivities = aVar;
    }

    public f() {
        this(null, null, null, 7, null);
    }
}
