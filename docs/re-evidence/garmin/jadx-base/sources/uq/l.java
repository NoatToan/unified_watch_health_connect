package uq;

import android.os.Parcel;
import android.os.Parcelable;
import com.garmin.android.gncs.NotificationConstants;
import com.google.gson.annotations.SerializedName;
import com.nimbusds.jose.jwk.JWKParameterNames;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;
import ps.u0;
import yc.l2;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b \b\u0087\b\u0018\u00002\u00020\u0001BO\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\f\u0010\rR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R$\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0016\u0010\u0013\u001a\u0004\b\u0017\u0010\u0015\"\u0004\b\u0018\u0010\u0019R$\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR$\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b \u0010\u000f\u001a\u0004\b!\u0010\u0011\"\u0004\b\"\u0010#R$\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'\"\u0004\b(\u0010)¨\u0006*"}, d2 = {"Luq/l;", "Landroid/os/Parcelable;", "", "messageIndex", "", NotificationConstants.KEY_DATA_MIME_TYPE, "status", "Lps/u0;", "difficulty", "numFalls", "", "packWeight", "<init>", "(Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Lps/u0;Ljava/lang/Integer;Ljava/lang/Double;)V", "a", "Ljava/lang/Integer;", "getMessageIndex", "()Ljava/lang/Integer;", "b", "Ljava/lang/String;", "getType", "()Ljava/lang/String;", "c", "getStatus", "setStatus", "(Ljava/lang/String;)V", "d", "Lps/u0;", "getDifficulty", "()Lps/u0;", "setDifficulty", "(Lps/u0;)V", JWKParameterNames.RSA_EXPONENT, "getNumFalls", "setNumFalls", "(Ljava/lang/Integer;)V", "f", "Ljava/lang/Double;", "getPackWeight", "()Ljava/lang/Double;", "setPackWeight", "(Ljava/lang/Double;)V", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class l implements Parcelable {
    public static final Parcelable.Creator<l> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @SerializedName("messageIndex")
    private final Integer messageIndex;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @SerializedName(NotificationConstants.KEY_DATA_MIME_TYPE)
    private final String type;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @SerializedName("status")
    private String status;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @SerializedName("gradeValue")
    private u0 difficulty;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @SerializedName("numFalls")
    private Integer numFalls;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    @SerializedName("packWeightGrams")
    private Double packWeight;

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<l> {
        /* JADX WARN: Multi-variable type inference failed */
        @Override // android.os.Parcelable.Creator
        public final l createFromParcel(Parcel parcel) {
            Integer numValueOf;
            Integer num;
            Integer num2;
            Double dValueOf;
            parcel.getClass();
            if (parcel.readInt() == 0) {
                numValueOf = null;
                num = null;
            } else {
                numValueOf = Integer.valueOf(parcel.readInt());
                num = null;
            }
            String string = parcel.readString();
            Integer num3 = num;
            String string2 = parcel.readString();
            u0 u0Var = (u0) parcel.readParcelable(l.class.getClassLoader());
            Integer numValueOf2 = parcel.readInt() == 0 ? num3 : Integer.valueOf(parcel.readInt());
            if (parcel.readInt() == 0) {
                Integer num4 = numValueOf2;
                dValueOf = num3;
                num2 = num4;
            } else {
                num2 = numValueOf2;
                dValueOf = Double.valueOf(parcel.readDouble());
            }
            return new l(numValueOf, string, string2, u0Var, num2, dValueOf);
        }

        @Override // android.os.Parcelable.Creator
        public final l[] newArray(int i14) {
            return new l[i14];
        }
    }

    public /* synthetic */ l(Integer num, String str, String str2, u0 u0Var, Integer num2, Double d14, int i14, p005kotlin.jvm.internal.j jVar) {
        this((i14 & 1) != 0 ? null : num, (i14 & 2) != 0 ? null : str, (i14 & 4) != 0 ? null : str2, (i14 & 8) != 0 ? null : u0Var, (i14 & 16) != 0 ? null : num2, (i14 & 32) != 0 ? null : d14);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l)) {
            return false;
        }
        l lVar = (l) obj;
        return s.g(this.messageIndex, lVar.messageIndex) && s.g(this.type, lVar.type) && s.g(this.status, lVar.status) && s.g(this.difficulty, lVar.difficulty) && s.g(this.numFalls, lVar.numFalls) && s.g(this.packWeight, lVar.packWeight);
    }

    public final int hashCode() {
        Integer num = this.messageIndex;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        String str = this.type;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.status;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        u0 u0Var = this.difficulty;
        int iHashCode4 = (iHashCode3 + (u0Var == null ? 0 : u0Var.hashCode())) * 31;
        Integer num2 = this.numFalls;
        int iHashCode5 = (iHashCode4 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Double d14 = this.packWeight;
        return iHashCode5 + (d14 != null ? d14.hashCode() : 0);
    }

    public final String toString() {
        Integer num = this.messageIndex;
        String str = this.type;
        String str2 = this.status;
        u0 u0Var = this.difficulty;
        Integer num2 = this.numFalls;
        Double d14 = this.packWeight;
        StringBuilder sbF = l2.f("UpdateTypedSplitDTO(messageIndex=", num, ", type=", str, ", status=");
        sbF.append(str2);
        sbF.append(", difficulty=");
        sbF.append(u0Var);
        sbF.append(", numFalls=");
        sbF.append(num2);
        sbF.append(", packWeight=");
        sbF.append(d14);
        sbF.append(")");
        return sbF.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i14) {
        parcel.getClass();
        Integer num = this.messageIndex;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            kg.f.k(parcel, 1, num);
        }
        parcel.writeString(this.type);
        parcel.writeString(this.status);
        parcel.writeParcelable(this.difficulty, i14);
        Integer num2 = this.numFalls;
        if (num2 == null) {
            parcel.writeInt(0);
        } else {
            kg.f.k(parcel, 1, num2);
        }
        Double d14 = this.packWeight;
        if (d14 == null) {
            parcel.writeInt(0);
        } else {
            sn.a.m(parcel, 1, d14);
        }
    }

    public l(Integer num, String str, String str2, u0 u0Var, Integer num2, Double d14) {
        this.messageIndex = num;
        this.type = str;
        this.status = str2;
        this.difficulty = u0Var;
        this.numFalls = num2;
        this.packWeight = d14;
    }

    public l() {
        this(null, null, null, null, null, null, 63, null);
    }
}
