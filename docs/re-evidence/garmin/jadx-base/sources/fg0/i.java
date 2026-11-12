package fg0;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.annotations.SerializedName;
import com.nimbusds.jose.jwk.JWKParameterNames;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u001d\b\u0087\b\u0018\u00002\u00020\u0001BA\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bR$\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\"\u0010\u0005\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R$\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u0012\u0010\u001a\"\u0004\b\u001b\u0010\u001cR$\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0014\u0010\r\u001a\u0004\b\u001d\u0010\u000f\"\u0004\b\u001e\u0010\u0011R$\u0010\t\u001a\u0004\u0018\u00010\b8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$¨\u0006%"}, d2 = {"Lfg0/i;", "Landroid/os/Parcelable;", "", "imageUrl", "", "sportingEventCapable", "gcj02CourseCapable", "displayName", "", "unitId", "<init>", "(Ljava/lang/String;ZLjava/lang/Boolean;Ljava/lang/String;Ljava/lang/Long;)V", "a", "Ljava/lang/String;", "getImageUrl", "()Ljava/lang/String;", "setImageUrl", "(Ljava/lang/String;)V", "b", "Z", "d", "()Z", "setSportingEventCapable", "(Z)V", "c", "Ljava/lang/Boolean;", "()Ljava/lang/Boolean;", "setGcj02CourseCapable", "(Ljava/lang/Boolean;)V", "getDisplayName", "setDisplayName", JWKParameterNames.RSA_EXPONENT, "Ljava/lang/Long;", "f", "()Ljava/lang/Long;", "setUnitId", "(Ljava/lang/Long;)V", "gcm-domain-training_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class i implements Parcelable {
    public static final Parcelable.Creator<i> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @SerializedName("imageUrl")
    private String imageUrl;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @SerializedName("sportingEventCapable")
    private boolean sportingEventCapable;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @SerializedName("gcj02CourseCapable")
    private Boolean gcj02CourseCapable;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @SerializedName("displayName")
    private String displayName;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @SerializedName("unitId")
    private Long unitId;

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<i> {
        @Override // android.os.Parcelable.Creator
        public final i createFromParcel(Parcel parcel) {
            Boolean boolValueOf;
            parcel.getClass();
            String string = parcel.readString();
            boolean z14 = parcel.readInt() != 0;
            if (parcel.readInt() == 0) {
                boolValueOf = null;
            } else {
                boolValueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            return new i(string, z14, boolValueOf, parcel.readString(), parcel.readInt() != 0 ? Long.valueOf(parcel.readLong()) : null);
        }

        @Override // android.os.Parcelable.Creator
        public final i[] newArray(int i14) {
            return new i[i14];
        }
    }

    public /* synthetic */ i(String str, boolean z14, Boolean bool, String str2, Long l14, int i14, p005kotlin.jvm.internal.j jVar) {
        this((i14 & 1) != 0 ? null : str, (i14 & 2) != 0 ? false : z14, (i14 & 4) != 0 ? null : bool, (i14 & 8) != 0 ? null : str2, (i14 & 16) != 0 ? null : l14);
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final Boolean getGcj02CourseCapable() {
        return this.gcj02CourseCapable;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final boolean getSportingEventCapable() {
        return this.sportingEventCapable;
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
        return p005kotlin.jvm.internal.s.g(this.imageUrl, iVar.imageUrl) && this.sportingEventCapable == iVar.sportingEventCapable && p005kotlin.jvm.internal.s.g(this.gcj02CourseCapable, iVar.gcj02CourseCapable) && p005kotlin.jvm.internal.s.g(this.displayName, iVar.displayName) && p005kotlin.jvm.internal.s.g(this.unitId, iVar.unitId);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final Long getUnitId() {
        return this.unitId;
    }

    public final String getDisplayName() {
        return this.displayName;
    }

    public final String getImageUrl() {
        return this.imageUrl;
    }

    public final int hashCode() {
        String str = this.imageUrl;
        int iG = q6.f.g((str == null ? 0 : str.hashCode()) * 31, 31, this.sportingEventCapable);
        Boolean bool = this.gcj02CourseCapable;
        int iHashCode = (iG + (bool == null ? 0 : bool.hashCode())) * 31;
        String str2 = this.displayName;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        Long l14 = this.unitId;
        return iHashCode2 + (l14 != null ? l14.hashCode() : 0);
    }

    public final String toString() {
        String str = this.imageUrl;
        boolean z14 = this.sportingEventCapable;
        Boolean bool = this.gcj02CourseCapable;
        String str2 = this.displayName;
        Long l14 = this.unitId;
        StringBuilder sbD = zl.a.d("DeviceDTO(imageUrl=", str, ", sportingEventCapable=", z14, ", gcj02CourseCapable=");
        b71.i.s(sbD, bool, ", displayName=", str2, ", unitId=");
        return p6.b.g(sbD, l14, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i14) {
        parcel.getClass();
        parcel.writeString(this.imageUrl);
        parcel.writeInt(this.sportingEventCapable ? 1 : 0);
        Boolean bool = this.gcj02CourseCapable;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            tn.k.m(parcel, 1, bool);
        }
        parcel.writeString(this.displayName);
        Long l14 = this.unitId;
        if (l14 == null) {
            parcel.writeInt(0);
        } else {
            sn.a.n(parcel, 1, l14);
        }
    }

    public i(String str, boolean z14, Boolean bool, String str2, Long l14) {
        this.imageUrl = str;
        this.sportingEventCapable = z14;
        this.gcj02CourseCapable = bool;
        this.displayName = str2;
        this.unitId = l14;
    }

    public i() {
        this(null, false, null, null, null, 31, null);
    }
}
