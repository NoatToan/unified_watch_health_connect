package hf1;

import com.garmin.android.apps.connectmobile.f3;
import j20.x;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;
import yc.l2;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B9\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lhf1/c;", "", "", "userProfilePK", "", "calendarDate", "acuteImpactLoad", "acuteDistance", "acuteTolerance", "<init>", "(Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;)V", "gcm-running-tolerance_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Integer f83635a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f83636b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Integer f83637c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Integer f83638d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Integer f83639e;

    public c(Integer num, String str, Integer num2, Integer num3, Integer num4) {
        this.f83635a = num;
        this.f83636b = str;
        this.f83637c = num2;
        this.f83638d = num3;
        this.f83639e = num4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return s.g(this.f83635a, cVar.f83635a) && s.g(this.f83636b, cVar.f83636b) && s.g(this.f83637c, cVar.f83637c) && s.g(this.f83638d, cVar.f83638d) && s.g(this.f83639e, cVar.f83639e);
    }

    public final int hashCode() {
        Integer num = this.f83635a;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        String str = this.f83636b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        Integer num2 = this.f83637c;
        int iHashCode3 = (iHashCode2 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.f83638d;
        int iHashCode4 = (iHashCode3 + (num3 == null ? 0 : num3.hashCode())) * 31;
        Integer num4 = this.f83639e;
        return iHashCode4 + (num4 != null ? num4.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbF = l2.f("RunningToleranceData(userProfilePK=", this.f83635a, ", calendarDate=", this.f83636b, ", acuteImpactLoad=");
        x.m(sbF, this.f83637c, ", acuteDistance=", this.f83638d, ", acuteTolerance=");
        return f3.i(sbF, this.f83639e, ")");
    }
}
