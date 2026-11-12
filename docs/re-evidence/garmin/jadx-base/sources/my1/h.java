package my1;

import java.util.List;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B?\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\t\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lmy1/h;", "", "", "cyclingCourseId", "Lab1/g;", "powerGuide", "runningCourseId", "", "Lcom/garmin/android/apps/connectmobile/pacepro/data/dto/b;", "paceBands", "Lcom/garmin/android/apps/connectmobile/courses/model/e;", "courseDetails", "<init>", "(Ljava/lang/Long;Lab1/g;Ljava/lang/Long;Ljava/util/List;Lcom/garmin/android/apps/connectmobile/courses/model/e;)V", "gcm-training-initiative_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Long f121517a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ab1.g f121518b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Long f121519c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final List<com.garmin.android.apps.connectmobile.pacepro.data.dto.b> f121520d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final com.garmin.android.apps.connectmobile.courses.model.e f121521e;

    public h(Long l14, ab1.g gVar, Long l15, List<com.garmin.android.apps.connectmobile.pacepro.data.dto.b> list, com.garmin.android.apps.connectmobile.courses.model.e eVar) {
        this.f121517a = l14;
        this.f121518b = gVar;
        this.f121519c = l15;
        this.f121520d = list;
        this.f121521e = eVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        return s.g(this.f121517a, hVar.f121517a) && s.g(this.f121518b, hVar.f121518b) && s.g(this.f121519c, hVar.f121519c) && s.g(this.f121520d, hVar.f121520d) && s.g(this.f121521e, hVar.f121521e);
    }

    public final int hashCode() {
        Long l14 = this.f121517a;
        int iHashCode = (l14 == null ? 0 : l14.hashCode()) * 31;
        ab1.g gVar = this.f121518b;
        int iHashCode2 = (iHashCode + (gVar == null ? 0 : gVar.hashCode())) * 31;
        Long l15 = this.f121519c;
        int iHashCode3 = (iHashCode2 + (l15 == null ? 0 : l15.hashCode())) * 31;
        List<com.garmin.android.apps.connectmobile.pacepro.data.dto.b> list = this.f121520d;
        int iHashCode4 = (iHashCode3 + (list == null ? 0 : list.hashCode())) * 31;
        com.garmin.android.apps.connectmobile.courses.model.e eVar = this.f121521e;
        return iHashCode4 + (eVar != null ? eVar.hashCode() : 0);
    }

    public final String toString() {
        return "TriathlonEventStrategyData(cyclingCourseId=" + this.f121517a + ", powerGuide=" + this.f121518b + ", runningCourseId=" + this.f121519c + ", paceBands=" + this.f121520d + ", courseDetails=" + this.f121521e + ")";
    }
}
