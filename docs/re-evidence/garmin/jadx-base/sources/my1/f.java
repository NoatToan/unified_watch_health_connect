package my1;

import java.util.List;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B!\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lmy1/f;", "", "", "Lcom/garmin/android/apps/connectmobile/pacepro/data/dto/b;", "paceBands", "Lcom/garmin/android/apps/connectmobile/courses/model/e;", "courseDetails", "<init>", "(Ljava/util/List;Lcom/garmin/android/apps/connectmobile/courses/model/e;)V", "gcm-training-initiative_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List<com.garmin.android.apps.connectmobile.pacepro.data.dto.b> f121508a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final com.garmin.android.apps.connectmobile.courses.model.e f121509b;

    public f(List<com.garmin.android.apps.connectmobile.pacepro.data.dto.b> list, com.garmin.android.apps.connectmobile.courses.model.e eVar) {
        this.f121508a = list;
        this.f121509b = eVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return s.g(this.f121508a, fVar.f121508a) && s.g(this.f121509b, fVar.f121509b);
    }

    public final int hashCode() {
        List<com.garmin.android.apps.connectmobile.pacepro.data.dto.b> list = this.f121508a;
        int iHashCode = (list == null ? 0 : list.hashCode()) * 31;
        com.garmin.android.apps.connectmobile.courses.model.e eVar = this.f121509b;
        return iHashCode + (eVar != null ? eVar.hashCode() : 0);
    }

    public final String toString() {
        return "RunningEventStrategyData(paceBands=" + this.f121508a + ", courseDetails=" + this.f121509b + ")";
    }
}
