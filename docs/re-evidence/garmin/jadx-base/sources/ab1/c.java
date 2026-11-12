package ab1;

import com.google.gson.annotations.SerializedName;
import org.joda.time.DateTime;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u0016\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\n\u0010\f¨\u0006\r"}, d2 = {"Lab1/c;", "", "", "_calendarDate", "", "ftp", "<init>", "(Ljava/lang/String;Ljava/lang/Integer;)V", "a", "Ljava/lang/String;", "b", "Ljava/lang/Integer;", "()Ljava/lang/Integer;", "gcm-power-guide_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @SerializedName("calendarDate")
    private final String _calendarDate;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @SerializedName("functionalThresholdPower")
    private final Integer ftp;

    public c(String str, Integer num) {
        this._calendarDate = str;
        this.ftp = num;
    }

    public final DateTime a() {
        return g22.k.q(this._calendarDate, "yyyy-MM-dd'T'HH:mm:ss.SSS", null);
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final Integer getFtp() {
        return this.ftp;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return s.g(this._calendarDate, cVar._calendarDate) && s.g(this.ftp, cVar.ftp);
    }

    public final int hashCode() {
        String str = this._calendarDate;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        Integer num = this.ftp;
        return iHashCode + (num != null ? num.hashCode() : 0);
    }

    public final String toString() {
        return "FunctionalThresholdPowerDTO(_calendarDate=" + this._calendarDate + ", ftp=" + this.ftp + ")";
    }
}
