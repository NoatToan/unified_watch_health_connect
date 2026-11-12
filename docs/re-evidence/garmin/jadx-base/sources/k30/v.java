package k30;

import com.google.gson.annotations.SerializedName;
import java.util.List;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\"\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\u0007\u0010\t¨\u0006\n"}, d2 = {"Lk30/v;", "", "", "Lcom/garmin/android/apps/connectmobile/courses/model/e;", "roundTripRouteCourses", "<init>", "(Ljava/util/List;)V", "a", "Ljava/util/List;", "()Ljava/util/List;", "gcm-domain-training_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class v {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @SerializedName("roundTripRouteCourses")
    private final List<com.garmin.android.apps.connectmobile.courses.model.e> roundTripRouteCourses;

    public v(List<com.garmin.android.apps.connectmobile.courses.model.e> list) {
        this.roundTripRouteCourses = list;
    }

    public final List<com.garmin.android.apps.connectmobile.courses.model.e> a() {
        return this.roundTripRouteCourses;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof v) && p005kotlin.jvm.internal.s.g(this.roundTripRouteCourses, ((v) obj).roundTripRouteCourses);
    }

    public final int hashCode() {
        List<com.garmin.android.apps.connectmobile.courses.model.e> list = this.roundTripRouteCourses;
        if (list == null) {
            return 0;
        }
        return list.hashCode();
    }

    public final String toString() {
        return tn.k.h("RoundTripRouteDTO(roundTripRouteCourses=", ")", this.roundTripRouteCourses);
    }
}
