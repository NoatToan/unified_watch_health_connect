package fg0;

import com.google.gson.annotations.SerializedName;
import java.util.List;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bR\"\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\t\u0010\u000bR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Lfg0/f;", "", "", "Lfg0/e;", "eventMyDay", "", "hasMoreTrainingEvents", "<init>", "(Ljava/util/List;Ljava/lang/Boolean;)V", "a", "Ljava/util/List;", "()Ljava/util/List;", "b", "Ljava/lang/Boolean;", "getHasMoreTrainingEvents", "()Ljava/lang/Boolean;", "gcm-domain-training_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @SerializedName("eventMyDay")
    private final List<e> eventMyDay;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @SerializedName("hasMoreTrainingEvents")
    private final Boolean hasMoreTrainingEvents;

    public /* synthetic */ f(List list, Boolean bool, int i14, p005kotlin.jvm.internal.j jVar) {
        this((i14 & 1) != 0 ? null : list, (i14 & 2) != 0 ? null : bool);
    }

    public final List<e> a() {
        return this.eventMyDay;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return p005kotlin.jvm.internal.s.g(this.eventMyDay, fVar.eventMyDay) && p005kotlin.jvm.internal.s.g(this.hasMoreTrainingEvents, fVar.hasMoreTrainingEvents);
    }

    public final int hashCode() {
        List<e> list = this.eventMyDay;
        int iHashCode = (list == null ? 0 : list.hashCode()) * 31;
        Boolean bool = this.hasMoreTrainingEvents;
        return iHashCode + (bool != null ? bool.hashCode() : 0);
    }

    public final String toString() {
        return "DashboardEvents(eventMyDay=" + this.eventMyDay + ", hasMoreTrainingEvents=" + this.hasMoreTrainingEvents + ")";
    }

    public f(List<e> list, Boolean bool) {
        this.eventMyDay = list;
        this.hasMoreTrainingEvents = bool;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public f() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }
}
