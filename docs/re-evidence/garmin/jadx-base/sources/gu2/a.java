package gu2;

import android.location.Location;
import com.garmin.android.gncs.NotificationConstants;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import com.google.firebase.analytics.FirebaseAnalytics;
import j20.x;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001Be\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\t\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Lgu2/a;", "", "", "timestamp", "Landroid/location/Location;", FirebaseAnalytics.Param.LOCATION, "", TtmlNode.ATTR_ID, "description", "", "epochIssuedTime", "epochExpireTime", "source", "text", "Lfu2/a;", "severity", "Lfu2/b;", NotificationConstants.KEY_DATA_MIME_TYPE, "<init>", "(JLandroid/location/Location;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Lfu2/a;Lfu2/b;)V", "weather_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final /* data */ class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f79093a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Location f79094b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f79095c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f79096d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Integer f79097e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Integer f79098f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f79099g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f79100h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final fu2.a f79101i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final fu2.b f79102j;

    public a(long j8, Location location, String str, String str2, Integer num, Integer num2, String str3, String str4, fu2.a aVar, fu2.b bVar) {
        location.getClass();
        aVar.getClass();
        this.f79093a = j8;
        this.f79094b = location;
        this.f79095c = str;
        this.f79096d = str2;
        this.f79097e = num;
        this.f79098f = num2;
        this.f79099g = str3;
        this.f79100h = str4;
        this.f79101i = aVar;
        this.f79102j = bVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.f79093a == aVar.f79093a && this.f79094b.equals(aVar.f79094b) && s.g(this.f79095c, aVar.f79095c) && s.g(this.f79096d, aVar.f79096d) && s.g(this.f79097e, aVar.f79097e) && s.g(this.f79098f, aVar.f79098f) && s.g(this.f79099g, aVar.f79099g) && s.g(this.f79100h, aVar.f79100h) && this.f79101i == aVar.f79101i && this.f79102j == aVar.f79102j;
    }

    public final int hashCode() {
        int iHashCode = (this.f79094b.hashCode() + (Long.hashCode(this.f79093a) * 31)) * 31;
        String str = this.f79095c;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f79096d;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Integer num = this.f79097e;
        int iHashCode4 = (iHashCode3 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.f79098f;
        int iHashCode5 = (iHashCode4 + (num2 == null ? 0 : num2.hashCode())) * 31;
        String str3 = this.f79099g;
        int iHashCode6 = (iHashCode5 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f79100h;
        int iHashCode7 = (this.f79101i.hashCode() + ((iHashCode6 + (str4 == null ? 0 : str4.hashCode())) * 31)) * 31;
        fu2.b bVar = this.f79102j;
        return iHashCode7 + (bVar != null ? bVar.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbI = p6.b.i("AlertDTO(id=", this.f79095c, ", description=", this.f79096d, ", epochIssuedTime=");
        x.m(sbI, this.f79097e, ", epochExpireTime=", this.f79098f, ", source=");
        sn.a.t(sbI, this.f79099g, ", text=", this.f79100h, ", severity=");
        sbI.append(this.f79101i);
        sbI.append(", type=");
        sbI.append(this.f79102j);
        sbI.append(")");
        return sbI.toString();
    }
}
