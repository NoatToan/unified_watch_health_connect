package jm1;

import android.os.Parcel;
import android.os.Parcelable;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.google.gson.annotations.SerializedName;
import com.nimbusds.jose.jwk.JWKParameterNames;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import p005kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b!\b\u0087\b\u0018\u00002\u00020\u0001Bg\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u000b\u0010\fR$\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R$\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0013\u0010\u000e\u001a\u0004\b\u0014\u0010\u0010\"\u0004\b\u0015\u0010\u0012R$\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0016\u0010\u000e\u001a\u0004\b\u0017\u0010\u0010\"\u0004\b\u0018\u0010\u0012R$\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0019\u0010\u000e\u001a\u0004\b\u0019\u0010\u0010\"\u0004\b\u001a\u0010\u0012R$\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u001b\u0010\u000e\u001a\u0004\b\u001c\u0010\u0010\"\u0004\b\u001d\u0010\u0012R$\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u001c\u0010\u000e\u001a\u0004\b\u001e\u0010\u0010\"\u0004\b\u001f\u0010\u0012R$\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u000f\u0010\u000e\u001a\u0004\b\u0013\u0010\u0010\"\u0004\b \u0010\u0012R$\u0010\n\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u001e\u0010\u000e\u001a\u0004\b!\u0010\u0010\"\u0004\b\"\u0010\u0012¨\u0006#"}, d2 = {"Ljm1/c;", "Landroid/os/Parcelable;", "Ljm1/d;", "overall", "totalDuration", "stress", "deepPercentage", "lightPercentage", "remPercentage", "awakeCount", "restlessness", "<init>", "(Ljm1/d;Ljm1/d;Ljm1/d;Ljm1/d;Ljm1/d;Ljm1/d;Ljm1/d;Ljm1/d;)V", "a", "Ljm1/d;", "g", "()Ljm1/d;", "setOverall", "(Ljm1/d;)V", "b", "m", "setTotalDuration", "c", JWKParameterNames.OCT_KEY_VALUE, "setStress", "d", "setDeepPercentage", JWKParameterNames.RSA_EXPONENT, "f", "setLightPercentage", "h", "setRemPercentage", "setAwakeCount", IntegerTokenConverter.CONVERTER_KEY, "setRestlessness", "gcm-domain-wellness_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class c implements Parcelable {
    public static final Parcelable.Creator<c> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @SerializedName("overall")
    private d overall;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @SerializedName("totalDuration")
    private d totalDuration;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @SerializedName("stress")
    private d stress;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @SerializedName("deepPercentage")
    private d deepPercentage;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @SerializedName("lightPercentage")
    private d lightPercentage;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    @SerializedName("remPercentage")
    private d remPercentage;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @SerializedName("awakeCount")
    private d awakeCount;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    @SerializedName("restlessness")
    private d restlessness;

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<c> {
        @Override // android.os.Parcelable.Creator
        public final c createFromParcel(Parcel parcel) {
            parcel.getClass();
            return new c(parcel.readInt() == 0 ? null : d.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : d.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : d.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : d.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : d.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : d.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : d.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? d.CREATOR.createFromParcel(parcel) : null);
        }

        @Override // android.os.Parcelable.Creator
        public final c[] newArray(int i14) {
            return new c[i14];
        }
    }

    public /* synthetic */ c(d dVar, d dVar2, d dVar3, d dVar4, d dVar5, d dVar6, d dVar7, d dVar8, int i14, j jVar) {
        this((i14 & 1) != 0 ? null : dVar, (i14 & 2) != 0 ? null : dVar2, (i14 & 4) != 0 ? null : dVar3, (i14 & 8) != 0 ? null : dVar4, (i14 & 16) != 0 ? null : dVar5, (i14 & 32) != 0 ? null : dVar6, (i14 & 64) != 0 ? null : dVar7, (i14 & 128) != 0 ? null : dVar8);
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final d getAwakeCount() {
        return this.awakeCount;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final d getDeepPercentage() {
        return this.deepPercentage;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return s.g(this.overall, cVar.overall) && s.g(this.totalDuration, cVar.totalDuration) && s.g(this.stress, cVar.stress) && s.g(this.deepPercentage, cVar.deepPercentage) && s.g(this.lightPercentage, cVar.lightPercentage) && s.g(this.remPercentage, cVar.remPercentage) && s.g(this.awakeCount, cVar.awakeCount) && s.g(this.restlessness, cVar.restlessness);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final d getLightPercentage() {
        return this.lightPercentage;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final d getOverall() {
        return this.overall;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final d getRemPercentage() {
        return this.remPercentage;
    }

    public final int hashCode() {
        d dVar = this.overall;
        int iHashCode = (dVar == null ? 0 : dVar.hashCode()) * 31;
        d dVar2 = this.totalDuration;
        int iHashCode2 = (iHashCode + (dVar2 == null ? 0 : dVar2.hashCode())) * 31;
        d dVar3 = this.stress;
        int iHashCode3 = (iHashCode2 + (dVar3 == null ? 0 : dVar3.hashCode())) * 31;
        d dVar4 = this.deepPercentage;
        int iHashCode4 = (iHashCode3 + (dVar4 == null ? 0 : dVar4.hashCode())) * 31;
        d dVar5 = this.lightPercentage;
        int iHashCode5 = (iHashCode4 + (dVar5 == null ? 0 : dVar5.hashCode())) * 31;
        d dVar6 = this.remPercentage;
        int iHashCode6 = (iHashCode5 + (dVar6 == null ? 0 : dVar6.hashCode())) * 31;
        d dVar7 = this.awakeCount;
        int iHashCode7 = (iHashCode6 + (dVar7 == null ? 0 : dVar7.hashCode())) * 31;
        d dVar8 = this.restlessness;
        return iHashCode7 + (dVar8 != null ? dVar8.hashCode() : 0);
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final d getRestlessness() {
        return this.restlessness;
    }

    public final Integer j() {
        Double value;
        d dVar = this.overall;
        if (dVar == null || (value = dVar.getValue()) == null) {
            return null;
        }
        return Integer.valueOf((int) value.doubleValue());
    }

    /* JADX INFO: renamed from: k, reason: from getter */
    public final d getStress() {
        return this.stress;
    }

    /* JADX INFO: renamed from: m, reason: from getter */
    public final d getTotalDuration() {
        return this.totalDuration;
    }

    public final boolean o() {
        d dVar = this.overall;
        if (dVar != null) {
            return (dVar != null ? dVar.getValue() : null) != null;
        }
        return false;
    }

    public final boolean q() {
        d dVar = this.awakeCount;
        String qualifierKey = dVar != null ? dVar.getQualifierKey() : null;
        return s.g(qualifierKey, "GOOD") || s.g(qualifierKey, "EXCELLENT");
    }

    public final String toString() {
        return "SleepScoreDTO(overall=" + this.overall + ", totalDuration=" + this.totalDuration + ", stress=" + this.stress + ", deepPercentage=" + this.deepPercentage + ", lightPercentage=" + this.lightPercentage + ", remPercentage=" + this.remPercentage + ", awakeCount=" + this.awakeCount + ", restlessness=" + this.restlessness + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i14) {
        parcel.getClass();
        d dVar = this.overall;
        if (dVar == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            dVar.writeToParcel(parcel, i14);
        }
        d dVar2 = this.totalDuration;
        if (dVar2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            dVar2.writeToParcel(parcel, i14);
        }
        d dVar3 = this.stress;
        if (dVar3 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            dVar3.writeToParcel(parcel, i14);
        }
        d dVar4 = this.deepPercentage;
        if (dVar4 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            dVar4.writeToParcel(parcel, i14);
        }
        d dVar5 = this.lightPercentage;
        if (dVar5 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            dVar5.writeToParcel(parcel, i14);
        }
        d dVar6 = this.remPercentage;
        if (dVar6 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            dVar6.writeToParcel(parcel, i14);
        }
        d dVar7 = this.awakeCount;
        if (dVar7 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            dVar7.writeToParcel(parcel, i14);
        }
        d dVar8 = this.restlessness;
        if (dVar8 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            dVar8.writeToParcel(parcel, i14);
        }
    }

    public c(d dVar, d dVar2, d dVar3, d dVar4, d dVar5, d dVar6, d dVar7, d dVar8) {
        this.overall = dVar;
        this.totalDuration = dVar2;
        this.stress = dVar3;
        this.deepPercentage = dVar4;
        this.lightPercentage = dVar5;
        this.remPercentage = dVar6;
        this.awakeCount = dVar7;
        this.restlessness = dVar8;
    }

    public c() {
        this(null, null, null, null, null, null, null, null, 255, null);
    }
}
