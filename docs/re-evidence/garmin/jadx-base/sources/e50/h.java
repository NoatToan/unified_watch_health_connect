package e50;

import am.j;
import com.garmin.android.apps.connectmobile.courses.model.GeoPointDTO;
import fg0.k;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;
import r1.q2;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B«\u0001\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0010\u001a\u00020\f\u0012\u000e\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u0011\u0012\u0006\u0010\u0014\u001a\u00020\f\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0016\u001a\u00020\f\u0012\u000e\u0010\u0018\u001a\n\u0012\u0004\u0012\u00020\u0017\u0018\u00010\u0011\u0012\u0006\u0010\u0019\u001a\u00020\f\u0012\b\u0010\u001b\u001a\u0004\u0018\u00010\u001a\u0012\b\u0010\u001d\u001a\u0004\u0018\u00010\u001c¢\u0006\u0004\b\u001e\u0010\u001f¨\u0006 "}, d2 = {"Le50/h;", "", "", "courseId", "Ln50/b;", "courseSectionUIState", "", "courseDistance", "speedInMeterPerSecond", "elapsedSeconds", "Lcom/garmin/android/apps/connectmobile/courses/model/GeoPointDTO;", "startPoint", "", "isCyclingAbilityCompatible", "", "noOfClimbs", "supportsCoursePlanner", "Li53/c;", "Lfg0/k;", "events", "isThirdParty", "thirdPartyImageUrl", "supportsPacePro", "Lcom/garmin/android/apps/connectmobile/pacepro/data/dto/b;", "paceProStrategies", "supportsPowerGuide", "Lab1/g;", "powerGuide", "Lw01/c;", "nutritionAndHydration", "<init>", "(Ljava/lang/String;Ln50/b;DDLjava/lang/Double;Lcom/garmin/android/apps/connectmobile/courses/model/GeoPointDTO;ZIZLi53/c;ZLjava/lang/String;ZLi53/c;ZLab1/g;Lw01/c;)V", "gcm-courses_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f63017a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final n50.b f63018b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final double f63019c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final double f63020d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Double f63021e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final GeoPointDTO f63022f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f63023g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f63024h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final boolean f63025i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final i53.c<k> f63026j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final boolean f63027k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final String f63028l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final boolean f63029m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final i53.c<com.garmin.android.apps.connectmobile.pacepro.data.dto.b> f63030n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final boolean f63031o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final ab1.g f63032p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final w01.c f63033q;

    public h(String str, n50.b bVar, double d14, double d15, Double d16, GeoPointDTO geoPointDTO, boolean z14, int i14, boolean z15, i53.c<k> cVar, boolean z16, String str2, boolean z17, i53.c<com.garmin.android.apps.connectmobile.pacepro.data.dto.b> cVar2, boolean z18, ab1.g gVar, w01.c cVar3) {
        bVar.getClass();
        this.f63017a = str;
        this.f63018b = bVar;
        this.f63019c = d14;
        this.f63020d = d15;
        this.f63021e = d16;
        this.f63022f = geoPointDTO;
        this.f63023g = z14;
        this.f63024h = i14;
        this.f63025i = z15;
        this.f63026j = cVar;
        this.f63027k = z16;
        this.f63028l = str2;
        this.f63029m = z17;
        this.f63030n = cVar2;
        this.f63031o = z18;
        this.f63032p = gVar;
        this.f63033q = cVar3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        return s.g(this.f63017a, hVar.f63017a) && this.f63018b.equals(hVar.f63018b) && Double.compare(this.f63019c, hVar.f63019c) == 0 && Double.compare(this.f63020d, hVar.f63020d) == 0 && s.g(this.f63021e, hVar.f63021e) && s.g(this.f63022f, hVar.f63022f) && this.f63023g == hVar.f63023g && this.f63024h == hVar.f63024h && this.f63025i == hVar.f63025i && s.g(this.f63026j, hVar.f63026j) && this.f63027k == hVar.f63027k && s.g(this.f63028l, hVar.f63028l) && this.f63029m == hVar.f63029m && s.g(this.f63030n, hVar.f63030n) && this.f63031o == hVar.f63031o && s.g(this.f63032p, hVar.f63032p) && s.g(this.f63033q, hVar.f63033q);
    }

    public final int hashCode() {
        String str = this.f63017a;
        int iB = org.apache.commons.lang3.e.b(org.apache.commons.lang3.e.b((this.f63018b.hashCode() + ((str == null ? 0 : str.hashCode()) * 31)) * 31, 31, this.f63019c), 31, this.f63020d);
        Double d14 = this.f63021e;
        int iHashCode = (iB + (d14 == null ? 0 : d14.hashCode())) * 31;
        GeoPointDTO geoPointDTO = this.f63022f;
        int iG = q6.f.g(q2.d(this.f63024h, q6.f.g((iHashCode + (geoPointDTO == null ? 0 : geoPointDTO.hashCode())) * 31, 31, this.f63023g), 31), 31, this.f63025i);
        i53.c<k> cVar = this.f63026j;
        int iG2 = q6.f.g((iG + (cVar == null ? 0 : cVar.hashCode())) * 31, 31, this.f63027k);
        String str2 = this.f63028l;
        int iG3 = q6.f.g((iG2 + (str2 == null ? 0 : str2.hashCode())) * 31, 31, this.f63029m);
        i53.c<com.garmin.android.apps.connectmobile.pacepro.data.dto.b> cVar2 = this.f63030n;
        int iG4 = q6.f.g((iG3 + (cVar2 == null ? 0 : cVar2.hashCode())) * 31, 31, this.f63031o);
        ab1.g gVar = this.f63032p;
        int iHashCode2 = (iG4 + (gVar == null ? 0 : gVar.hashCode())) * 31;
        w01.c cVar3 = this.f63033q;
        return iHashCode2 + (cVar3 != null ? cVar3.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("CourseOverviewUIState(courseId=");
        sb3.append(this.f63017a);
        sb3.append(", courseSectionUIState=");
        sb3.append(this.f63018b);
        sb3.append(", courseDistance=");
        sb3.append(this.f63019c);
        j.x(sb3, ", speedInMeterPerSecond=", this.f63020d, ", elapsedSeconds=");
        sb3.append(this.f63021e);
        sb3.append(", startPoint=");
        sb3.append(this.f63022f);
        sb3.append(", isCyclingAbilityCompatible=");
        sb3.append(this.f63023g);
        sb3.append(", noOfClimbs=");
        sb3.append(this.f63024h);
        sb3.append(", supportsCoursePlanner=");
        sb3.append(this.f63025i);
        sb3.append(", events=");
        sb3.append(this.f63026j);
        sb3.append(", isThirdParty=");
        fb1.c.w(", thirdPartyImageUrl=", this.f63028l, ", supportsPacePro=", sb3, this.f63027k);
        sb3.append(this.f63029m);
        sb3.append(", paceProStrategies=");
        sb3.append(this.f63030n);
        sb3.append(", supportsPowerGuide=");
        sb3.append(this.f63031o);
        sb3.append(", powerGuide=");
        sb3.append(this.f63032p);
        sb3.append(", nutritionAndHydration=");
        sb3.append(this.f63033q);
        sb3.append(")");
        return sb3.toString();
    }
}
