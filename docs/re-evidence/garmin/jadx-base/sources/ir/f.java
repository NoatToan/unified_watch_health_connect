package ir;

import com.google.gson.annotations.SerializedName;
import i3.e5;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000e\b\u0087\b\u0018\u00002\u00020\u0001B)\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0004¢\u0006\u0004\b\b\u0010\tR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u000e\u0010\u0010R\u001a\u0010\u0006\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u000f\u001a\u0004\b\u0011\u0010\u0010R\u001a\u0010\u0007\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\u000f\u001a\u0004\b\n\u0010\u0010¨\u0006\u0012"}, d2 = {"Lir/f;", "", "Lir/g;", "uuid", "", "name", "startDate", "endDate", "<init>", "(Lir/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "a", "Lir/g;", "d", "()Lir/g;", "b", "Ljava/lang/String;", "()Ljava/lang/String;", "c", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @SerializedName("multiDayActivityUUID")
    private final g uuid;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @SerializedName("name")
    private final String name;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @SerializedName("startDate")
    private final String startDate;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @SerializedName("endDate")
    private final String endDate;

    public f(g gVar, String str, String str2, String str3) {
        com.airbnb.lottie.animation.keyframe.a.y(str, str2, str3);
        this.uuid = gVar;
        this.name = str;
        this.startDate = str2;
        this.endDate = str3;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getEndDate() {
        return this.endDate;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getName() {
        return this.name;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getStartDate() {
        return this.startDate;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final g getUuid() {
        return this.uuid;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return s.g(this.uuid, fVar.uuid) && s.g(this.name, fVar.name) && s.g(this.startDate, fVar.startDate) && s.g(this.endDate, fVar.endDate);
    }

    public final int hashCode() {
        g gVar = this.uuid;
        return this.endDate.hashCode() + wr.g.j(wr.g.j((gVar == null ? 0 : gVar.hashCode()) * 31, 31, this.name), 31, this.startDate);
    }

    public final String toString() {
        g gVar = this.uuid;
        String str = this.name;
        String str2 = this.startDate;
        String str3 = this.endDate;
        StringBuilder sb3 = new StringBuilder("EpicSummaryDTO(uuid=");
        sb3.append(gVar);
        sb3.append(", name=");
        sb3.append(str);
        sb3.append(", startDate=");
        return e5.h(sb3, str2, ", endDate=", str3, ")");
    }
}
