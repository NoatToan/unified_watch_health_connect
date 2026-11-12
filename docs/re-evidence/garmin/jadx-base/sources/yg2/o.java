package yg2;

import com.google.gson.annotations.SerializedName;
import java.util.LinkedHashMap;
import java.util.Map;
import p005kotlin.Metadata;
import yc.l2;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0087\b\u0018\u00002\u00020\u0001BO\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0002\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\u0002\u0012\u001c\b\u0002\u0010\f\u001a\u0016\u0012\b\u0012\u00060\tj\u0002`\n\u0012\b\u0012\u00060\tj\u0002`\u000b0\b¢\u0006\u0004\b\r\u0010\u000eB\t\b\u0016¢\u0006\u0004\b\r\u0010\u000fR \u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R \u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0011\u001a\u0004\b\u0014\u0010\u0013R \u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0011\u001a\u0004\b\u0015\u0010\u0013¨\u0006\u0016"}, d2 = {"Lyg2/o;", "", "Li53/c;", "Lyg2/h0;", "steps", "Lyg2/a;", "clusters", "skippedClusters", "", "", "Lcom/garmin/android/livesessionview/ui/workout/ClusterStepIndex;", "Lcom/garmin/android/livesessionview/ui/workout/ClusterStepRepeatCount;", "nestedClusterRepeatCount", "<init>", "(Li53/c;Li53/c;Li53/c;Ljava/util/Map;)V", "()V", "a", "Li53/c;", "d", "()Li53/c;", "b", "c", "live-session-view"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class o {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @SerializedName("steps")
    private final i53.c<h0> steps;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @SerializedName("clusters")
    private final i53.c<a> clusters;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @SerializedName("skippedClusters")
    private final i53.c<a> skippedClusters;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Map<Integer, Integer> f197113d;

    public o(i53.c<h0> cVar, i53.c<a> cVar2, i53.c<a> cVar3, Map<Integer, Integer> map) {
        cVar.getClass();
        cVar2.getClass();
        cVar3.getClass();
        map.getClass();
        this.steps = cVar;
        this.clusters = cVar2;
        this.skippedClusters = cVar3;
        this.f197113d = map;
    }

    public static o a(o oVar, i53.f fVar, i53.c cVar, i53.c cVar2, int i14) {
        i53.c<h0> cVar3 = fVar;
        if ((i14 & 1) != 0) {
            cVar3 = oVar.steps;
        }
        if ((i14 & 2) != 0) {
            cVar = oVar.clusters;
        }
        if ((i14 & 4) != 0) {
            cVar2 = oVar.skippedClusters;
        }
        Map<Integer, Integer> map = oVar.f197113d;
        oVar.getClass();
        cVar3.getClass();
        cVar.getClass();
        cVar2.getClass();
        map.getClass();
        return new o(cVar3, cVar, cVar2, map);
    }

    public final i53.c<a> b() {
        return this.clusters;
    }

    public final i53.c<a> c() {
        return this.skippedClusters;
    }

    public final i53.c<h0> d() {
        return this.steps;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o)) {
            return false;
        }
        o oVar = (o) obj;
        return p005kotlin.jvm.internal.s.g(this.steps, oVar.steps) && p005kotlin.jvm.internal.s.g(this.clusters, oVar.clusters) && p005kotlin.jvm.internal.s.g(this.skippedClusters, oVar.skippedClusters) && p005kotlin.jvm.internal.s.g(this.f197113d, oVar.f197113d);
    }

    public final int hashCode() {
        return this.f197113d.hashCode() + l2.a(this.skippedClusters, l2.a(this.clusters, this.steps.hashCode() * 31, 31), 31);
    }

    public final String toString() {
        return "Workout(steps=" + this.steps + ", clusters=" + this.clusters + ", skippedClusters=" + this.skippedClusters + ", nestedClusterRepeatCount=" + this.f197113d + ")";
    }

    public /* synthetic */ o(i53.c cVar, i53.c cVar2, i53.c cVar3, Map map, int i14, p005kotlin.jvm.internal.j jVar) {
        this(cVar, cVar2, cVar3, (i14 & 8) != 0 ? new LinkedHashMap() : map);
    }

    public o() {
        this(j53.l.b(), j53.l.b(), j53.l.b(), null, 8, null);
    }
}
