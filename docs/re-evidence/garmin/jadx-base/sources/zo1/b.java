package zo1;

import com.garmin.android.apps.connectmobile.activities.newmodel.ActivityDetailChartDTO;
import java.util.List;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import ps.x1;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B?\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Lzo1/b;", "", "", "Lps/x1;", "typedSplits", "Lcom/garmin/android/apps/connectmobile/activities/newmodel/ActivityDetailChartDTO;", "chartDetails", "Lyo1/f;", "sgrCompetitionsResults", "", "hasActivity", "Lkotlin/Function0;", "", "onClose", "<init>", "(Ljava/util/List;Lcom/garmin/android/apps/connectmobile/activities/newmodel/ActivityDetailChartDTO;Lyo1/f;ZLe23/a;)V", "gcm-social-group-ride_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List<x1> f206228a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ActivityDetailChartDTO f206229b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final yo1.f f206230c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f206231d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final e23.a<Unit> f206232e;

    public b(List<x1> list, ActivityDetailChartDTO activityDetailChartDTO, yo1.f fVar, boolean z14, e23.a<Unit> aVar) {
        list.getClass();
        aVar.getClass();
        this.f206228a = list;
        this.f206229b = activityDetailChartDTO;
        this.f206230c = fVar;
        this.f206231d = z14;
        this.f206232e = aVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return this.f206228a.equals(bVar.f206228a) && p005kotlin.jvm.internal.s.g(this.f206229b, bVar.f206229b) && p005kotlin.jvm.internal.s.g(this.f206230c, bVar.f206230c) && this.f206231d == bVar.f206231d && this.f206232e.equals(bVar.f206232e);
    }

    public final int hashCode() {
        int iHashCode = this.f206228a.hashCode() * 31;
        ActivityDetailChartDTO activityDetailChartDTO = this.f206229b;
        int iHashCode2 = (iHashCode + (activityDetailChartDTO == null ? 0 : activityDetailChartDTO.hashCode())) * 31;
        yo1.f fVar = this.f206230c;
        return this.f206232e.hashCode() + q6.f.g((iHashCode2 + (fVar != null ? fVar.hashCode() : 0)) * 31, 31, this.f206231d);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("ClimbListArguments(typedSplits=");
        sb3.append(this.f206228a);
        sb3.append(", chartDetails=");
        sb3.append(this.f206229b);
        sb3.append(", sgrCompetitionsResults=");
        sb3.append(this.f206230c);
        sb3.append(", hasActivity=");
        sb3.append(this.f206231d);
        sb3.append(", onClose=");
        return n23.j.i(sb3, this.f206232e, ")");
    }
}
