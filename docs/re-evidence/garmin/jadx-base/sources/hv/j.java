package hv;

import com.google.gson.annotations.SerializedName;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000e\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\t\u0010\u000fR\u001a\u0010\u0006\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010\n\u001a\u0004\b\u0011\u0010\f¨\u0006\u0012"}, d2 = {"Lhv/j;", "", "", "time", "", "comment", "duration", "<init>", "(ILjava/lang/String;I)V", "a", "I", "d", "()I", "b", "Ljava/lang/String;", "()Ljava/lang/String;", "c", "getDuration", "gcm-bic_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @SerializedName("tm")
    private final int time;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @SerializedName("cm")
    private final String comment;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @SerializedName("dr")
    private final int duration;

    public /* synthetic */ j(int i14, String str, int i15, int i16, p005kotlin.jvm.internal.j jVar) {
        this((i16 & 1) != 0 ? 0 : i14, (i16 & 2) != 0 ? null : str, (i16 & 4) != 0 ? 0 : i15);
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getComment() {
        return this.comment;
    }

    public final int b() {
        return this.time + this.duration;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final int getTime() {
        return this.time;
    }

    public final int d() {
        return this.time;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j)) {
            return false;
        }
        j jVar = (j) obj;
        return this.time == jVar.time && s.g(this.comment, jVar.comment) && this.duration == jVar.duration;
    }

    public final int hashCode() {
        int iHashCode = Integer.hashCode(this.time) * 31;
        String str = this.comment;
        return Integer.hashCode(this.duration) + ((iHashCode + (str == null ? 0 : str.hashCode())) * 31);
    }

    public final String toString() {
        int i14 = this.time;
        String str = this.comment;
        return am.j.q(wr.g.r(i14, "LottieMarker(time=", ", comment=", str, ", duration="), this.duration, ")");
    }

    public j(int i14, String str, int i15) {
        this.time = i14;
        this.comment = str;
        this.duration = i15;
    }

    public j() {
        this(0, null, 0, 7, null);
    }
}
