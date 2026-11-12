package ab1;

import com.garmin.android.apps.connectmobile.settings.user.PowerZonesDTO;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B7\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lab1/f;", "", "Lab1/d;", "powerGuideDTO", "Lcom/garmin/android/apps/connectmobile/courses/model/e;", "courseDetailDTO", "Lcom/garmin/android/apps/connectmobile/settings/user/PowerZonesDTO;", "powerZonesDTO", "Lw01/c;", "nutritionAndHydrationDetails", "<init>", "(Lab1/d;Lcom/garmin/android/apps/connectmobile/courses/model/e;Lcom/garmin/android/apps/connectmobile/settings/user/PowerZonesDTO;Lw01/c;)V", "gcm-power-guide_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public d f2563a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public com.garmin.android.apps.connectmobile.courses.model.e f2564b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public PowerZonesDTO f2565c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public w01.c f2566d;

    public /* synthetic */ f(d dVar, com.garmin.android.apps.connectmobile.courses.model.e eVar, PowerZonesDTO powerZonesDTO, w01.c cVar, int i14, p005kotlin.jvm.internal.j jVar) {
        this((i14 & 1) != 0 ? null : dVar, (i14 & 2) != 0 ? null : eVar, (i14 & 4) != 0 ? null : powerZonesDTO, (i14 & 8) != 0 ? null : cVar);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return s.g(this.f2563a, fVar.f2563a) && s.g(this.f2564b, fVar.f2564b) && s.g(this.f2565c, fVar.f2565c) && s.g(this.f2566d, fVar.f2566d);
    }

    public final int hashCode() {
        d dVar = this.f2563a;
        int iHashCode = (dVar == null ? 0 : dVar.hashCode()) * 31;
        com.garmin.android.apps.connectmobile.courses.model.e eVar = this.f2564b;
        int iHashCode2 = (iHashCode + (eVar == null ? 0 : eVar.hashCode())) * 31;
        PowerZonesDTO powerZonesDTO = this.f2565c;
        int iHashCode3 = (iHashCode2 + (powerZonesDTO == null ? 0 : powerZonesDTO.hashCode())) * 31;
        w01.c cVar = this.f2566d;
        return iHashCode3 + (cVar != null ? cVar.hashCode() : 0);
    }

    public final String toString() {
        return "PowerGuideStrategyDetails(powerGuideDTO=" + this.f2563a + ", courseDetailDTO=" + this.f2564b + ", powerZonesDTO=" + this.f2565c + ", nutritionAndHydrationDetails=" + this.f2566d + ")";
    }

    public f(d dVar, com.garmin.android.apps.connectmobile.courses.model.e eVar, PowerZonesDTO powerZonesDTO, w01.c cVar) {
        this.f2563a = dVar;
        this.f2564b = eVar;
        this.f2565c = powerZonesDTO;
        this.f2566d = cVar;
    }

    public f() {
        this(null, null, null, null, 15, null);
    }
}
