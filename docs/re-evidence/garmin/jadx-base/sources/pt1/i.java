package pt1;

import android.os.Parcel;
import android.os.Parcelable;
import com.garmin.android.gncs.NotificationConstants;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001Bo\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"Lpt1/i;", "Landroid/os/Parcelable;", "", "displayName", FirebaseAnalytics.Param.LOCATION, "searchResultItemId", "Lus1/f;", NotificationConstants.KEY_DATA_MIME_TYPE, "locale", "description", "Lle2/a;", "boundingBox", "", "curatedCourseId", RemoteConfigConstants.RequestFieldKey.COUNTRY_CODE, "provinceUriComponent", "courseNameUriComponent", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lus1/f;Ljava/lang/String;Ljava/lang/String;Lle2/a;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "gcm-trails_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class i implements Parcelable {
    public static final Parcelable.Creator<i> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f140856a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f140857b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f140858c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final us1.f f140859d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f140860e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f140861f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final le2.a f140862g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Long f140863h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final String f140864i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final String f140865j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final String f140866k;

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<i> {
        @Override // android.os.Parcelable.Creator
        public final i createFromParcel(Parcel parcel) {
            parcel.getClass();
            return new i(parcel.readString(), parcel.readString(), parcel.readString(), us1.f.valueOf(parcel.readString()), parcel.readString(), parcel.readString(), (le2.a) parcel.readParcelable(i.class.getClassLoader()), parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong()), parcel.readString(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final i[] newArray(int i14) {
            return new i[i14];
        }
    }

    static {
        Parcelable.Creator<le2.a> creator = le2.a.CREATOR;
    }

    public i(String str, String str2, String str3, us1.f fVar, String str4, String str5, le2.a aVar, Long l14, String str6, String str7, String str8) {
        str.getClass();
        str2.getClass();
        str3.getClass();
        fVar.getClass();
        str4.getClass();
        str5.getClass();
        aVar.getClass();
        this.f140856a = str;
        this.f140857b = str2;
        this.f140858c = str3;
        this.f140859d = fVar;
        this.f140860e = str4;
        this.f140861f = str5;
        this.f140862g = aVar;
        this.f140863h = l14;
        this.f140864i = str6;
        this.f140865j = str7;
        this.f140866k = str8;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        return p005kotlin.jvm.internal.s.g(this.f140856a, iVar.f140856a) && p005kotlin.jvm.internal.s.g(this.f140857b, iVar.f140857b) && p005kotlin.jvm.internal.s.g(this.f140858c, iVar.f140858c) && this.f140859d == iVar.f140859d && p005kotlin.jvm.internal.s.g(this.f140860e, iVar.f140860e) && p005kotlin.jvm.internal.s.g(this.f140861f, iVar.f140861f) && p005kotlin.jvm.internal.s.g(this.f140862g, iVar.f140862g) && p005kotlin.jvm.internal.s.g(this.f140863h, iVar.f140863h) && p005kotlin.jvm.internal.s.g(this.f140864i, iVar.f140864i) && p005kotlin.jvm.internal.s.g(this.f140865j, iVar.f140865j) && p005kotlin.jvm.internal.s.g(this.f140866k, iVar.f140866k);
    }

    public final int hashCode() {
        int iHashCode = (this.f140862g.hashCode() + wr.g.j(wr.g.j((this.f140859d.hashCode() + wr.g.j(wr.g.j(this.f140856a.hashCode() * 31, 31, this.f140857b), 31, this.f140858c)) * 31, 31, this.f140860e), 31, this.f140861f)) * 31;
        Long l14 = this.f140863h;
        int iHashCode2 = (iHashCode + (l14 == null ? 0 : l14.hashCode())) * 31;
        String str = this.f140864i;
        int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f140865j;
        int iHashCode4 = (iHashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f140866k;
        return iHashCode4 + (str3 != null ? str3.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbI = p6.b.i("SearchResultItemState(displayName=", this.f140856a, ", location=", this.f140857b, ", searchResultItemId=");
        sbI.append(this.f140858c);
        sbI.append(", type=");
        sbI.append(this.f140859d);
        sbI.append(", locale=");
        sn.a.t(sbI, this.f140860e, ", description=", this.f140861f, ", boundingBox=");
        sbI.append(this.f140862g);
        sbI.append(", curatedCourseId=");
        sbI.append(this.f140863h);
        sbI.append(", countryCode=");
        sn.a.t(sbI, this.f140864i, ", provinceUriComponent=", this.f140865j, ", courseNameUriComponent=");
        return am.j.o(this.f140866k, ")", sbI);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i14) {
        parcel.getClass();
        parcel.writeString(this.f140856a);
        parcel.writeString(this.f140857b);
        parcel.writeString(this.f140858c);
        parcel.writeString(this.f140859d.name());
        parcel.writeString(this.f140860e);
        parcel.writeString(this.f140861f);
        parcel.writeParcelable(this.f140862g, i14);
        Long l14 = this.f140863h;
        if (l14 == null) {
            parcel.writeInt(0);
        } else {
            sn.a.n(parcel, 1, l14);
        }
        parcel.writeString(this.f140864i);
        parcel.writeString(this.f140865j);
        parcel.writeString(this.f140866k);
    }

    public /* synthetic */ i(String str, String str2, String str3, us1.f fVar, String str4, String str5, le2.a aVar, Long l14, String str6, String str7, String str8, int i14, p005kotlin.jvm.internal.j jVar) {
        this(str, str2, str3, fVar, str4, str5, aVar, (i14 & 128) != 0 ? null : l14, (i14 & 256) != 0 ? null : str6, (i14 & 512) != 0 ? null : str7, (i14 & 1024) != 0 ? null : str8);
    }
}
