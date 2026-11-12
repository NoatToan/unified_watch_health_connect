package k30;

import com.garmin.android.apps.connectmobile.f3;
import com.google.gson.annotations.SerializedName;
import java.util.List;
import p005kotlin.Metadata;
import u62.z;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001BE\u0012\u001c\u0010\u0004\u001a\u0018\u0012\u0012\u0012\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u0002\u0018\u00010\u0002\u0018\u00010\u0002\u0012\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0002\u0012\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0002¢\u0006\u0004\b\t\u0010\nR0\u0010\u0004\u001a\u0018\u0012\u0012\u0012\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u0002\u0018\u00010\u0002\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000eR\"\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010\f\u001a\u0004\b\u000b\u0010\u000eR\"\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010\f\u001a\u0004\b\u000f\u0010\u000e¨\u0006\u0010"}, d2 = {"Lk30/d;", "", "", "", "route", "Lk30/b;", "closestPointsToViaPoints", "Lk30/j;", "routeMessages", "<init>", "(Ljava/util/List;Ljava/util/List;Ljava/util/List;)V", "a", "Ljava/util/List;", "b", "()Ljava/util/List;", "c", "gcm-domain-training_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @SerializedName("route")
    private final List<List<List<Double>>> route;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @SerializedName("closestPointsToViaPoints")
    private final List<b> closestPointsToViaPoints;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @SerializedName("routeMessages")
    private final List<j> routeMessages;

    /* JADX WARN: Multi-variable type inference failed */
    public d(List<? extends List<? extends List<Double>>> list, List<b> list2, List<? extends j> list3) {
        this.route = list;
        this.closestPointsToViaPoints = list2;
        this.routeMessages = list3;
    }

    public final List<b> a() {
        return this.closestPointsToViaPoints;
    }

    public final List<List<List<Double>>> b() {
        return this.route;
    }

    public final List<j> c() {
        return this.routeMessages;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return p005kotlin.jvm.internal.s.g(this.route, dVar.route) && p005kotlin.jvm.internal.s.g(this.closestPointsToViaPoints, dVar.closestPointsToViaPoints) && p005kotlin.jvm.internal.s.g(this.routeMessages, dVar.routeMessages);
    }

    public final int hashCode() {
        List<List<List<Double>>> list = this.route;
        int iHashCode = (list == null ? 0 : list.hashCode()) * 31;
        List<b> list2 = this.closestPointsToViaPoints;
        int iHashCode2 = (iHashCode + (list2 == null ? 0 : list2.hashCode())) * 31;
        List<j> list3 = this.routeMessages;
        return iHashCode2 + (list3 != null ? list3.hashCode() : 0);
    }

    public final String toString() {
        List<List<List<Double>>> list = this.route;
        List<b> list2 = this.closestPointsToViaPoints;
        return z.c(f3.k("CleanCourseResponseDTO(route=", ", closestPointsToViaPoints=", ", routeMessages=", list, list2), this.routeMessages, ")");
    }
}
