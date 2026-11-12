package qs1;

import android.os.Parcel;
import android.os.Parcelable;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.garmin.android.gncs.NotificationConstants;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import com.google.gson.annotations.SerializedName;
import com.nimbusds.jose.jwk.JWKParameterNames;
import i3.e5;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u001a\b\u0087\b\u0018\u00002\u00020\u0001B\u007f\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u000f\u0010\u0010R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0012\u001a\u0004\b\u0016\u0010\u0014R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0012\u001a\u0004\b\u0018\u0010\u0014R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u0012\u001a\u0004\b\u001a\u0010\u0014R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001b\u0010\u0012\u001a\u0004\b\u001c\u0010\u0014R\u001c\u0010\t\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u0015\u0010\u001fR\u001c\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b \u0010\"R\u001c\u0010\f\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001c\u0010\u0012\u001a\u0004\b\u0019\u0010\u0014R\u001c\u0010\r\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0012\u001a\u0004\b#\u0010\u0014R\u001c\u0010\u000e\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b#\u0010\u0012\u001a\u0004\b\u001d\u0010\u0014¨\u0006$"}, d2 = {"Lqs1/q;", "Landroid/os/Parcelable;", "", "displayName", FirebaseAnalytics.Param.LOCATION, "searchResultItemId", NotificationConstants.KEY_DATA_MIME_TYPE, "locale", "Lqs1/a;", "boundingBox", "", "curatedCourseId", RemoteConfigConstants.RequestFieldKey.COUNTRY_CODE, "provinceUriComponent", "courseNameUriComponent", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lqs1/a;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "a", "Ljava/lang/String;", "getDisplayName", "()Ljava/lang/String;", "b", IntegerTokenConverter.CONVERTER_KEY, "c", JWKParameterNames.OCT_KEY_VALUE, "d", "m", JWKParameterNames.RSA_EXPONENT, "h", "f", "Lqs1/a;", "()Lqs1/a;", "g", "Ljava/lang/Long;", "()Ljava/lang/Long;", "j", "gcm-trails_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class q implements Parcelable {
    public static final Parcelable.Creator<q> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @SerializedName("displayName")
    private final String displayName;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @SerializedName(FirebaseAnalytics.Param.LOCATION)
    private final String location;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @SerializedName("searchResultItemId")
    private final String searchResultItemId;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @SerializedName(NotificationConstants.KEY_DATA_MIME_TYPE)
    private final String type;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @SerializedName("locale")
    private final String locale;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    @SerializedName("boundingBox")
    private final qs1.a boundingBox;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @SerializedName("curatedCourseId")
    private final Long curatedCourseId;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    @SerializedName(RemoteConfigConstants.RequestFieldKey.COUNTRY_CODE)
    private final String countryCode;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    @SerializedName("provinceUriComponent")
    private final String provinceUriComponent;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    @SerializedName("courseNameUriComponent")
    private final String courseNameUriComponent;

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<q> {
        @Override // android.os.Parcelable.Creator
        public final q createFromParcel(Parcel parcel) {
            parcel.getClass();
            return new q(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : qs1.a.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? Long.valueOf(parcel.readLong()) : null, parcel.readString(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final q[] newArray(int i14) {
            return new q[i14];
        }
    }

    public /* synthetic */ q(String str, String str2, String str3, String str4, String str5, qs1.a aVar, Long l14, String str6, String str7, String str8, int i14, p005kotlin.jvm.internal.j jVar) {
        this((i14 & 1) != 0 ? null : str, (i14 & 2) != 0 ? null : str2, (i14 & 4) != 0 ? null : str3, (i14 & 8) != 0 ? null : str4, (i14 & 16) != 0 ? null : str5, (i14 & 32) != 0 ? null : aVar, (i14 & 64) != 0 ? null : l14, (i14 & 128) != 0 ? null : str6, (i14 & 256) != 0 ? null : str7, (i14 & 512) != 0 ? null : str8);
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final qs1.a getBoundingBox() {
        return this.boundingBox;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final String getCountryCode() {
        return this.countryCode;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q)) {
            return false;
        }
        q qVar = (q) obj;
        return p005kotlin.jvm.internal.s.g(this.displayName, qVar.displayName) && p005kotlin.jvm.internal.s.g(this.location, qVar.location) && p005kotlin.jvm.internal.s.g(this.searchResultItemId, qVar.searchResultItemId) && p005kotlin.jvm.internal.s.g(this.type, qVar.type) && p005kotlin.jvm.internal.s.g(this.locale, qVar.locale) && p005kotlin.jvm.internal.s.g(this.boundingBox, qVar.boundingBox) && p005kotlin.jvm.internal.s.g(this.curatedCourseId, qVar.curatedCourseId) && p005kotlin.jvm.internal.s.g(this.countryCode, qVar.countryCode) && p005kotlin.jvm.internal.s.g(this.provinceUriComponent, qVar.provinceUriComponent) && p005kotlin.jvm.internal.s.g(this.courseNameUriComponent, qVar.courseNameUriComponent);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final String getCourseNameUriComponent() {
        return this.courseNameUriComponent;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final Long getCuratedCourseId() {
        return this.curatedCourseId;
    }

    public final String getDisplayName() {
        return this.displayName;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final String getLocale() {
        return this.locale;
    }

    public final int hashCode() {
        String str = this.displayName;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.location;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.searchResultItemId;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.type;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.locale;
        int iHashCode5 = (iHashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        qs1.a aVar = this.boundingBox;
        int iHashCode6 = (iHashCode5 + (aVar == null ? 0 : aVar.hashCode())) * 31;
        Long l14 = this.curatedCourseId;
        int iHashCode7 = (iHashCode6 + (l14 == null ? 0 : l14.hashCode())) * 31;
        String str6 = this.countryCode;
        int iHashCode8 = (iHashCode7 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.provinceUriComponent;
        int iHashCode9 = (iHashCode8 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.courseNameUriComponent;
        return iHashCode9 + (str8 != null ? str8.hashCode() : 0);
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final String getLocation() {
        return this.location;
    }

    /* JADX INFO: renamed from: j, reason: from getter */
    public final String getProvinceUriComponent() {
        return this.provinceUriComponent;
    }

    /* JADX INFO: renamed from: k, reason: from getter */
    public final String getSearchResultItemId() {
        return this.searchResultItemId;
    }

    /* JADX INFO: renamed from: m, reason: from getter */
    public final String getType() {
        return this.type;
    }

    public final String toString() {
        String str = this.displayName;
        String str2 = this.location;
        String str3 = this.searchResultItemId;
        String str4 = this.type;
        String str5 = this.locale;
        qs1.a aVar = this.boundingBox;
        Long l14 = this.curatedCourseId;
        String str6 = this.countryCode;
        String str7 = this.provinceUriComponent;
        String str8 = this.courseNameUriComponent;
        StringBuilder sbI = p6.b.i("SearchResultItemDTO(displayName=", str, ", location=", str2, ", searchResultItemId=");
        sn.a.t(sbI, str3, ", type=", str4, ", locale=");
        sbI.append(str5);
        sbI.append(", boundingBox=");
        sbI.append(aVar);
        sbI.append(", curatedCourseId=");
        b71.i.q(l14, ", countryCode=", str6, ", provinceUriComponent=", sbI);
        return e5.h(sbI, str7, ", courseNameUriComponent=", str8, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i14) {
        parcel.getClass();
        parcel.writeString(this.displayName);
        parcel.writeString(this.location);
        parcel.writeString(this.searchResultItemId);
        parcel.writeString(this.type);
        parcel.writeString(this.locale);
        qs1.a aVar = this.boundingBox;
        if (aVar == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            aVar.writeToParcel(parcel, i14);
        }
        Long l14 = this.curatedCourseId;
        if (l14 == null) {
            parcel.writeInt(0);
        } else {
            sn.a.n(parcel, 1, l14);
        }
        parcel.writeString(this.countryCode);
        parcel.writeString(this.provinceUriComponent);
        parcel.writeString(this.courseNameUriComponent);
    }

    public q(String str, String str2, String str3, String str4, String str5, qs1.a aVar, Long l14, String str6, String str7, String str8) {
        this.displayName = str;
        this.location = str2;
        this.searchResultItemId = str3;
        this.type = str4;
        this.locale = str5;
        this.boundingBox = aVar;
        this.curatedCourseId = l14;
        this.countryCode = str6;
        this.provinceUriComponent = str7;
        this.courseNameUriComponent = str8;
    }

    public q() {
        this(null, null, null, null, null, null, null, null, null, null, 1023, null);
    }
}
