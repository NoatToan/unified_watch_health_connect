package l42;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.annotations.SerializedName;
import com.nimbusds.jose.jwk.JWKParameterNames;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b'\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u000eBM\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0005\u0012\u0006\u0010\t\u001a\u00020\u0005\u0012\u0006\u0010\n\u001a\u00020\u0005\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\f\u0010\rR$\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R$\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0014\u0010\u000f\u001a\u0004\b\u0015\u0010\u0011\"\u0004\b\u0016\u0010\u0013R\"\u0010\u0006\u001a\u00020\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR\"\u0010\u0007\u001a\u00020\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u001d\u0010\u0018\u001a\u0004\b\u001e\u0010\u001a\"\u0004\b\u001f\u0010\u001cR\"\u0010\b\u001a\u00020\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b \u0010\u0018\u001a\u0004\b!\u0010\u001a\"\u0004\b\"\u0010\u001cR\"\u0010\t\u001a\u00020\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b#\u0010\u0018\u001a\u0004\b$\u0010\u001a\"\u0004\b%\u0010\u001cR\"\u0010\n\u001a\u00020\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b&\u0010\u0018\u001a\u0004\b'\u0010\u001a\"\u0004\b(\u0010\u001cR$\u0010\u000b\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b)\u0010\u000f\u001a\u0004\b*\u0010\u0011\"\u0004\b+\u0010\u0013¨\u0006,"}, d2 = {"Ll42/i;", "Landroid/os/Parcelable;", "", "bmi", "bodyFat", "", "date", "dateTimestamp", "gmtTimestamp", "sourceType", "unitKey", "value", "<init>", "(Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Double;)V", "a", "Ljava/lang/Double;", "getBmi", "()Ljava/lang/Double;", "setBmi", "(Ljava/lang/Double;)V", "b", "getBodyFat", "setBodyFat", "c", "Ljava/lang/String;", "getDate", "()Ljava/lang/String;", "setDate", "(Ljava/lang/String;)V", "d", "getDateTimestamp", "setDateTimestamp", JWKParameterNames.RSA_EXPONENT, "getGmtTimestamp", "setGmtTimestamp", "f", "getSourceType", "setSourceType", "g", "getUnitKey", "setUnitKey", "h", "getValue", "setValue", "data_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class i implements Parcelable {
    public static final Parcelable.Creator<i> CREATOR;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @SerializedName("bmi")
    private Double bmi;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @SerializedName("bodyFat")
    private Double bodyFat;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @SerializedName("date")
    private String date;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @SerializedName("dateTimestamp")
    private String dateTimestamp;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @SerializedName("gmtTimestamp")
    private String gmtTimestamp;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    @SerializedName("sourceType")
    private String sourceType;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @SerializedName("unitKey")
    private String unitKey;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    @SerializedName("value")
    private Double value;

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class b implements Parcelable.Creator<i> {
        @Override // android.os.Parcelable.Creator
        public final i createFromParcel(Parcel parcel) {
            parcel.getClass();
            Double dValueOf = parcel.readInt() == 0 ? null : Double.valueOf(parcel.readDouble());
            Double dValueOf2 = parcel.readInt() == 0 ? null : Double.valueOf(parcel.readDouble());
            String string = parcel.readString();
            Double d14 = dValueOf2;
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            String string4 = parcel.readString();
            Double dValueOf3 = null;
            String string5 = parcel.readString();
            if (parcel.readInt() != 0) {
                dValueOf3 = Double.valueOf(parcel.readDouble());
            }
            return new i(dValueOf, d14, string, string2, string3, string4, string5, dValueOf3);
        }

        @Override // android.os.Parcelable.Creator
        public final i[] newArray(int i14) {
            return new i[i14];
        }
    }

    static {
        new a(null);
        CREATOR = new b();
    }

    public i(Double d14, Double d15, String str, String str2, String str3, String str4, String str5, Double d16) {
        hb.a.p(str, str2, str3, str4, str5);
        this.bmi = d14;
        this.bodyFat = d15;
        this.date = str;
        this.dateTimestamp = str2;
        this.gmtTimestamp = str3;
        this.sourceType = str4;
        this.unitKey = str5;
        this.value = d16;
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
        return s.g(this.bmi, iVar.bmi) && s.g(this.bodyFat, iVar.bodyFat) && s.g(this.date, iVar.date) && s.g(this.dateTimestamp, iVar.dateTimestamp) && s.g(this.gmtTimestamp, iVar.gmtTimestamp) && s.g(this.sourceType, iVar.sourceType) && s.g(this.unitKey, iVar.unitKey) && s.g(this.value, iVar.value);
    }

    public final int hashCode() {
        Double d14 = this.bmi;
        int iHashCode = (d14 == null ? 0 : d14.hashCode()) * 31;
        Double d15 = this.bodyFat;
        int iJ = wr.g.j(wr.g.j(wr.g.j(wr.g.j(wr.g.j((iHashCode + (d15 == null ? 0 : d15.hashCode())) * 31, 31, this.date), 31, this.dateTimestamp), 31, this.gmtTimestamp), 31, this.sourceType), 31, this.unitKey);
        Double d16 = this.value;
        return iJ + (d16 != null ? d16.hashCode() : 0);
    }

    public final String toString() {
        Double d14 = this.bmi;
        Double d15 = this.bodyFat;
        String str = this.date;
        String str2 = this.dateTimestamp;
        String str3 = this.gmtTimestamp;
        String str4 = this.sourceType;
        String str5 = this.unitKey;
        Double d16 = this.value;
        StringBuilder sbI = tn.k.i("WeightDateDTO(bmi=", d14, d15, ", bodyFat=", ", date=");
        sn.a.t(sbI, str, ", dateTimestamp=", str2, ", gmtTimestamp=");
        sn.a.t(sbI, str3, ", sourceType=", str4, ", unitKey=");
        sbI.append(str5);
        sbI.append(", value=");
        sbI.append(d16);
        sbI.append(")");
        return sbI.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i14) {
        parcel.getClass();
        Double d14 = this.bmi;
        if (d14 == null) {
            parcel.writeInt(0);
        } else {
            sn.a.m(parcel, 1, d14);
        }
        Double d15 = this.bodyFat;
        if (d15 == null) {
            parcel.writeInt(0);
        } else {
            sn.a.m(parcel, 1, d15);
        }
        parcel.writeString(this.date);
        parcel.writeString(this.dateTimestamp);
        parcel.writeString(this.gmtTimestamp);
        parcel.writeString(this.sourceType);
        parcel.writeString(this.unitKey);
        Double d16 = this.value;
        if (d16 == null) {
            parcel.writeInt(0);
        } else {
            sn.a.m(parcel, 1, d16);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Ll42/i$a;", "", "<init>", "()V", "", "KILOGRAM", "Ljava/lang/String;", "data_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
