package tc1;

import am.j;
import com.google.gson.annotations.SerializedName;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u000e\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010\n\u001a\u0004\b\u000e\u0010\fR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"Ltc1/c;", "", "", "leastSignificantBits", "mostSignificantBits", "", "baseUUID", "<init>", "(Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;)V", "a", "Ljava/lang/Integer;", "getLeastSignificantBits", "()Ljava/lang/Integer;", "b", "getMostSignificantBits", "c", "Ljava/lang/String;", "getBaseUUID", "()Ljava/lang/String;", "gcm-domain-training_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @SerializedName("leastSignificantBits")
    private final Integer leastSignificantBits;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @SerializedName("mostSignificantBits")
    private final Integer mostSignificantBits;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @SerializedName("baseUUID")
    private final String baseUUID;

    public c(Integer num, Integer num2, String str) {
        this.leastSignificantBits = num;
        this.mostSignificantBits = num2;
        this.baseUUID = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return s.g(this.leastSignificantBits, cVar.leastSignificantBits) && s.g(this.mostSignificantBits, cVar.mostSignificantBits) && s.g(this.baseUUID, cVar.baseUUID);
    }

    public final int hashCode() {
        Integer num = this.leastSignificantBits;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        Integer num2 = this.mostSignificantBits;
        int iHashCode2 = (iHashCode + (num2 == null ? 0 : num2.hashCode())) * 31;
        String str = this.baseUUID;
        return iHashCode2 + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        return j.o(this.baseUUID, ")", com.airbnb.lottie.animation.keyframe.a.l(this.leastSignificantBits, "SportingEventUuid(leastSignificantBits=", ", mostSignificantBits=", ", baseUUID=", this.mostSignificantBits));
    }
}
