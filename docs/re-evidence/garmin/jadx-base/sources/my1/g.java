package my1;

import android.os.Parcel;
import android.os.Parcelable;
import b71.i;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import com.google.gson.annotations.SerializedName;
import com.nimbusds.jose.jwk.JWKParameterNames;
import j20.x;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import p005kotlin.jvm.internal.s;
import yc.l2;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0006\n\u0002\b#\b\u0087\b\u0018\u00002\u00020\u0001B[\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\f\u0010\rR$\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R$\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R$\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u0014\u0010\u001c\"\u0004\b\u001d\u0010\u001eR$\u0010\b\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u001f\u0010\u001b\u001a\u0004\b \u0010\u001c\"\u0004\b!\u0010\u001eR$\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\"\u0010\u000f\u001a\u0004\b#\u0010\u0011\"\u0004\b$\u0010\u0013R$\u0010\n\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0016\u0010\u000f\u001a\u0004\b%\u0010\u0011\"\u0004\b&\u0010\u0013R$\u0010\u000b\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b'\u0010\u0015\u001a\u0004\b\u001f\u0010\u0017\"\u0004\b(\u0010\u0019¨\u0006)"}, d2 = {"Lmy1/g;", "Landroid/os/Parcelable;", "", "unitId", "", "unitKey", "", "gmtOffset", "dstOffset", "groupNumber", "factor", RemoteConfigConstants.RequestFieldKey.TIME_ZONE, "<init>", "(Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;)V", "a", "Ljava/lang/Integer;", "getUnitId", "()Ljava/lang/Integer;", "setUnitId", "(Ljava/lang/Integer;)V", "b", "Ljava/lang/String;", "f", "()Ljava/lang/String;", "setUnitKey", "(Ljava/lang/String;)V", "c", "Ljava/lang/Double;", "()Ljava/lang/Double;", "setGmtOffset", "(Ljava/lang/Double;)V", "d", "getDstOffset", "setDstOffset", JWKParameterNames.RSA_EXPONENT, "getGroupNumber", "setGroupNumber", "getFactor", "setFactor", "g", "setTimeZone", "gcm-training-initiative_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class g implements Parcelable {
    public static final Parcelable.Creator<g> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @SerializedName("unitId")
    private Integer unitId;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @SerializedName("unitKey")
    private String unitKey;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @SerializedName("gmtOffset")
    private Double gmtOffset;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @SerializedName("dstOffset")
    private Double dstOffset;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @SerializedName("groupNumber")
    private Integer groupNumber;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    @SerializedName("factor")
    private Integer factor;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @SerializedName(RemoteConfigConstants.RequestFieldKey.TIME_ZONE)
    private String timeZone;

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<g> {
        /* JADX WARN: Multi-variable type inference failed */
        @Override // android.os.Parcelable.Creator
        public final g createFromParcel(Parcel parcel) {
            Integer numValueOf;
            Integer numValueOf2;
            parcel.getClass();
            if (parcel.readInt() == 0) {
                numValueOf = null;
                numValueOf2 = null;
            } else {
                numValueOf = Integer.valueOf(parcel.readInt());
                numValueOf2 = null;
            }
            String string = parcel.readString();
            Object objValueOf = parcel.readInt() == 0 ? numValueOf2 : Double.valueOf(parcel.readDouble());
            Object objValueOf2 = parcel.readInt() == 0 ? numValueOf2 : Double.valueOf(parcel.readDouble());
            Integer numValueOf3 = parcel.readInt() == 0 ? numValueOf2 : Integer.valueOf(parcel.readInt());
            if (parcel.readInt() != 0) {
                numValueOf2 = Integer.valueOf(parcel.readInt());
            }
            return new g(numValueOf, string, objValueOf, objValueOf2, numValueOf3, numValueOf2, parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final g[] newArray(int i14) {
            return new g[i14];
        }
    }

    public /* synthetic */ g(Integer num, String str, Double d14, Double d15, Integer num2, Integer num3, String str2, int i14, j jVar) {
        this((i14 & 1) != 0 ? null : num, (i14 & 2) != 0 ? null : str, (i14 & 4) != 0 ? null : d14, (i14 & 8) != 0 ? null : d15, (i14 & 16) != 0 ? null : num2, (i14 & 32) != 0 ? null : num3, (i14 & 64) != 0 ? null : str2);
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final Double getGmtOffset() {
        return this.gmtOffset;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final String getTimeZone() {
        return this.timeZone;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        return s.g(this.unitId, gVar.unitId) && s.g(this.unitKey, gVar.unitKey) && s.g(this.gmtOffset, gVar.gmtOffset) && s.g(this.dstOffset, gVar.dstOffset) && s.g(this.groupNumber, gVar.groupNumber) && s.g(this.factor, gVar.factor) && s.g(this.timeZone, gVar.timeZone);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final String getUnitKey() {
        return this.unitKey;
    }

    public final int hashCode() {
        Integer num = this.unitId;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        String str = this.unitKey;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        Double d14 = this.gmtOffset;
        int iHashCode3 = (iHashCode2 + (d14 == null ? 0 : d14.hashCode())) * 31;
        Double d15 = this.dstOffset;
        int iHashCode4 = (iHashCode3 + (d15 == null ? 0 : d15.hashCode())) * 31;
        Integer num2 = this.groupNumber;
        int iHashCode5 = (iHashCode4 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.factor;
        int iHashCode6 = (iHashCode5 + (num3 == null ? 0 : num3.hashCode())) * 31;
        String str2 = this.timeZone;
        return iHashCode6 + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        Integer num = this.unitId;
        String str = this.unitKey;
        Double d14 = this.gmtOffset;
        Double d15 = this.dstOffset;
        Integer num2 = this.groupNumber;
        Integer num3 = this.factor;
        String str2 = this.timeZone;
        StringBuilder sbF = l2.f("TimeZoneDTO(unitId=", num, ", unitKey=", str, ", gmtOffset=");
        i.p(d14, d15, ", dstOffset=", ", groupNumber=", sbF);
        x.m(sbF, num2, ", factor=", num3, ", timeZone=");
        return am.j.o(str2, ")", sbF);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i14) {
        parcel.getClass();
        Integer num = this.unitId;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            kg.f.k(parcel, 1, num);
        }
        parcel.writeString(this.unitKey);
        Double d14 = this.gmtOffset;
        if (d14 == null) {
            parcel.writeInt(0);
        } else {
            sn.a.m(parcel, 1, d14);
        }
        Double d15 = this.dstOffset;
        if (d15 == null) {
            parcel.writeInt(0);
        } else {
            sn.a.m(parcel, 1, d15);
        }
        Integer num2 = this.groupNumber;
        if (num2 == null) {
            parcel.writeInt(0);
        } else {
            kg.f.k(parcel, 1, num2);
        }
        Integer num3 = this.factor;
        if (num3 == null) {
            parcel.writeInt(0);
        } else {
            kg.f.k(parcel, 1, num3);
        }
        parcel.writeString(this.timeZone);
    }

    public g(Integer num, String str, Double d14, Double d15, Integer num2, Integer num3, String str2) {
        this.unitId = num;
        this.unitKey = str;
        this.gmtOffset = d14;
        this.dstOffset = d15;
        this.groupNumber = num2;
        this.factor = num3;
        this.timeZone = str2;
    }

    public g() {
        this(null, null, null, null, null, null, null, 127, null);
    }
}
