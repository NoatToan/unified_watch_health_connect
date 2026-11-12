package x30;

import am.j;
import com.garmin.android.apps.connectmobile.courses.model.ClimbDTO;
import p005kotlin.Metadata;
import r1.q2;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lx30/b;", "", "Li53/c;", "Lcom/garmin/android/apps/connectmobile/courses/model/ClimbDTO;", "climbs", "", "climbIndex", "noOfClimbs", "<init>", "(Li53/c;II)V", "gcm-courses_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final i53.c<ClimbDTO> f188567a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f188568b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f188569c;

    public b(i53.c<ClimbDTO> cVar, int i14, int i15) {
        cVar.getClass();
        this.f188567a = cVar;
        this.f188568b = i14;
        this.f188569c = i15;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return this.f188567a.equals(bVar.f188567a) && this.f188568b == bVar.f188568b && this.f188569c == bVar.f188569c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f188569c) + q2.d(this.f188568b, this.f188567a.hashCode() * 31, 31);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("ClimbsPagerUiState(climbs=");
        sb3.append(this.f188567a);
        sb3.append(", climbIndex=");
        sb3.append(this.f188568b);
        sb3.append(", noOfClimbs=");
        return j.q(sb3, this.f188569c, ")");
    }
}
