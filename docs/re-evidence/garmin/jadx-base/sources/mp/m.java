package mp;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.annotations.SerializedName;
import com.nimbusds.jose.jwk.JWKParameterNames;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u001d\b\u0087\b\u0018\u00002\u00020\u0001BW\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u000b\u0010\fR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u000e\u001a\u0004\b\u0012\u0010\u0010R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u000e\u001a\u0004\b\u0014\u0010\u0010R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u000e\u001a\u0004\b\u0016\u0010\u0010R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u000e\u001a\u0004\b\u0018\u0010\u0010R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u000e\u001a\u0004\b\u001a\u0010\u0010R\u001c\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001b\u0010\u000e\u001a\u0004\b\u001c\u0010\u0010R\u001c\u0010\n\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001d\u0010\u000e\u001a\u0004\b\u001e\u0010\u0010¨\u0006\u001f"}, d2 = {"Lmp/m;", "Landroid/os/Parcelable;", "Lmp/e;", "avgStress", "avgStressWin", "avgStressLoss", "avgStressDraw", "gamesWon", "gamesNotWon", "gamesAverageWon", "avgPackWeight", "<init>", "(Lmp/e;Lmp/e;Lmp/e;Lmp/e;Lmp/e;Lmp/e;Lmp/e;Lmp/e;)V", "a", "Lmp/e;", "getAvgStress", "()Lmp/e;", "b", "getAvgStressWin", "c", "getAvgStressLoss", "d", "getAvgStressDraw", JWKParameterNames.RSA_EXPONENT, "getGamesWon", "f", "getGamesNotWon", "g", "getGamesAverageWon", "h", "getAvgPackWeight", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class m implements Parcelable {
    public static final Parcelable.Creator<m> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @SerializedName("splitSummaries.avgStress")
    private final e avgStress;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @SerializedName("splitSummaries.avgStressWin")
    private final e avgStressWin;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @SerializedName("splitSummaries.avgStressLoss")
    private final e avgStressLoss;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @SerializedName("splitSummaries.avgStressDraw")
    private final e avgStressDraw;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @SerializedName("splitSummaries.gamesWon")
    private final e gamesWon;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    @SerializedName("splitSummaries.gamesNotWon")
    private final e gamesNotWon;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @SerializedName("splitSummaries.gamesAverageWon")
    private final e gamesAverageWon;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    @SerializedName("splitSummaries.avgPackWeight")
    private final e avgPackWeight;

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<m> {
        @Override // android.os.Parcelable.Creator
        public final m createFromParcel(Parcel parcel) {
            parcel.getClass();
            return new m(parcel.readInt() == 0 ? null : e.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : e.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : e.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : e.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : e.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : e.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : e.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? e.CREATOR.createFromParcel(parcel) : null);
        }

        @Override // android.os.Parcelable.Creator
        public final m[] newArray(int i14) {
            return new m[i14];
        }
    }

    public m(e eVar, e eVar2, e eVar3, e eVar4, e eVar5, e eVar6, e eVar7, e eVar8) {
        this.avgStress = eVar;
        this.avgStressWin = eVar2;
        this.avgStressLoss = eVar3;
        this.avgStressDraw = eVar4;
        this.gamesWon = eVar5;
        this.gamesNotWon = eVar6;
        this.gamesAverageWon = eVar7;
        this.avgPackWeight = eVar8;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m)) {
            return false;
        }
        m mVar = (m) obj;
        return s.g(this.avgStress, mVar.avgStress) && s.g(this.avgStressWin, mVar.avgStressWin) && s.g(this.avgStressLoss, mVar.avgStressLoss) && s.g(this.avgStressDraw, mVar.avgStressDraw) && s.g(this.gamesWon, mVar.gamesWon) && s.g(this.gamesNotWon, mVar.gamesNotWon) && s.g(this.gamesAverageWon, mVar.gamesAverageWon) && s.g(this.avgPackWeight, mVar.avgPackWeight);
    }

    public final int hashCode() {
        e eVar = this.avgStress;
        int iHashCode = (eVar == null ? 0 : eVar.hashCode()) * 31;
        e eVar2 = this.avgStressWin;
        int iHashCode2 = (iHashCode + (eVar2 == null ? 0 : eVar2.hashCode())) * 31;
        e eVar3 = this.avgStressLoss;
        int iHashCode3 = (iHashCode2 + (eVar3 == null ? 0 : eVar3.hashCode())) * 31;
        e eVar4 = this.avgStressDraw;
        int iHashCode4 = (iHashCode3 + (eVar4 == null ? 0 : eVar4.hashCode())) * 31;
        e eVar5 = this.gamesWon;
        int iHashCode5 = (iHashCode4 + (eVar5 == null ? 0 : eVar5.hashCode())) * 31;
        e eVar6 = this.gamesNotWon;
        int iHashCode6 = (iHashCode5 + (eVar6 == null ? 0 : eVar6.hashCode())) * 31;
        e eVar7 = this.gamesAverageWon;
        int iHashCode7 = (iHashCode6 + (eVar7 == null ? 0 : eVar7.hashCode())) * 31;
        e eVar8 = this.avgPackWeight;
        return iHashCode7 + (eVar8 != null ? eVar8.hashCode() : 0);
    }

    public final String toString() {
        return "SplitSummariesDTO(avgStress=" + this.avgStress + ", avgStressWin=" + this.avgStressWin + ", avgStressLoss=" + this.avgStressLoss + ", avgStressDraw=" + this.avgStressDraw + ", gamesWon=" + this.gamesWon + ", gamesNotWon=" + this.gamesNotWon + ", gamesAverageWon=" + this.gamesAverageWon + ", avgPackWeight=" + this.avgPackWeight + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i14) {
        parcel.getClass();
        e eVar = this.avgStress;
        if (eVar == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            eVar.writeToParcel(parcel, i14);
        }
        e eVar2 = this.avgStressWin;
        if (eVar2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            eVar2.writeToParcel(parcel, i14);
        }
        e eVar3 = this.avgStressLoss;
        if (eVar3 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            eVar3.writeToParcel(parcel, i14);
        }
        e eVar4 = this.avgStressDraw;
        if (eVar4 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            eVar4.writeToParcel(parcel, i14);
        }
        e eVar5 = this.gamesWon;
        if (eVar5 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            eVar5.writeToParcel(parcel, i14);
        }
        e eVar6 = this.gamesNotWon;
        if (eVar6 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            eVar6.writeToParcel(parcel, i14);
        }
        e eVar7 = this.gamesAverageWon;
        if (eVar7 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            eVar7.writeToParcel(parcel, i14);
        }
        e eVar8 = this.avgPackWeight;
        if (eVar8 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            eVar8.writeToParcel(parcel, i14);
        }
    }
}
