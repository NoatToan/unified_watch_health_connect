package yg2;

import com.google.gson.annotations.SerializedName;
import i3.e5;
import p005kotlin.Metadata;
import r1.q2;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\f\b\u0087\b\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\t\u0010\u000bR\u001a\u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\n\u001a\u0004\b\r\u0010\u000bR\u001a\u0010\u0005\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010\n\u001a\u0004\b\f\u0010\u000b¨\u0006\u000e"}, d2 = {"Lyg2/a;", "", "", "clusterIndex", "startStepIndex", "endStepIndex", "repeatCount", "<init>", "(IIII)V", "a", "I", "()I", "b", "c", "live-session-view"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @SerializedName("clusterIndex")
    private final int clusterIndex;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @SerializedName("startStepIndex")
    private final int startStepIndex;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @SerializedName("endStepIndex")
    private final int endStepIndex;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f196937d;

    public a(int i14, int i15, int i16, int i17) {
        this.clusterIndex = i14;
        this.startStepIndex = i15;
        this.endStepIndex = i16;
        this.f196937d = i17;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final int getClusterIndex() {
        return this.clusterIndex;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final int getEndStepIndex() {
        return this.endStepIndex;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final int getStartStepIndex() {
        return this.startStepIndex;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.clusterIndex == aVar.clusterIndex && this.startStepIndex == aVar.startStepIndex && this.endStepIndex == aVar.endStepIndex && this.f196937d == aVar.f196937d;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f196937d) + q2.d(this.endStepIndex, q2.d(this.startStepIndex, Integer.hashCode(this.clusterIndex) * 31, 31), 31);
    }

    public final String toString() {
        return androidx.core.view.j.e(this.endStepIndex, this.f196937d, ", repeatCount=", ")", e5.j(this.clusterIndex, this.startStepIndex, "Cluster(clusterIndex=", ", startStepIndex=", ", endStepIndex="));
    }

    public /* synthetic */ a(int i14, int i15, int i16, int i17, int i18, p005kotlin.jvm.internal.j jVar) {
        this(i14, i15, i16, (i18 & 8) != 0 ? 1 : i17);
    }
}
