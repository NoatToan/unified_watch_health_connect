package ww1;

import android.os.Parcel;
import android.os.Parcelable;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.google.gson.annotations.SerializedName;
import com.nimbusds.jose.jwk.JWKParameterNames;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import lc.u0;
import org.joda.time.DateTime;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b \b\u0087\b\u0018\u00002\u00020\u0001By\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\n\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\b\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\b\u0012\u000e\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000f\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!R\u001c\u0010\t\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%R\u0016\u0010\n\u001a\u0004\u0018\u00010\b8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b&\u0010#R\u0016\u0010\u000b\u001a\u0004\u0018\u00010\b8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b'\u0010#R\u001c\u0010\r\u001a\u0004\u0018\u00010\f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0018\u0010(\u001a\u0004\b)\u0010*R\u001c\u0010\u000e\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b$\u0010#\u001a\u0004\b+\u0010%R\"\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001c\u0010,\u001a\u0004\b\u001a\u0010-R\u0016\u0010\u0012\u001a\u0004\u0018\u00010\b8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b.\u0010#R\u0016\u0010\u0013\u001a\u0004\u0018\u00010\b8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b/\u0010#¨\u00060"}, d2 = {"Lww1/i;", "Landroid/os/Parcelable;", "", "trainingPlanId", "Lww1/j;", "trainingPlanType", "Lww1/k;", "trainingStatus", "", "trainingPlanName", "_startDate", "_raceDate", "Lww1/d0;", "trainingPlanSubType", "_trainingPlanCategory", "", "Lww1/x;", "planPhases", "_pausedDate", "_resumedDate", "<init>", "(JLww1/j;Lww1/k;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lww1/d0;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;)V", "a", "J", "g", "()J", "b", "Lww1/j;", IntegerTokenConverter.CONVERTER_KEY, "()Lww1/j;", "c", "Lww1/k;", "getTrainingStatus", "()Lww1/k;", "d", "Ljava/lang/String;", "h", "()Ljava/lang/String;", JWKParameterNames.RSA_EXPONENT, "f", "Lww1/d0;", "getTrainingPlanSubType", "()Lww1/d0;", "get_trainingPlanCategory", "Ljava/util/List;", "()Ljava/util/List;", "j", JWKParameterNames.OCT_KEY_VALUE, "gcm-domain-training_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class i implements Parcelable {
    public static final Parcelable.Creator<i> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @SerializedName("trainingPlanId")
    private final long trainingPlanId;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @SerializedName("trainingType")
    private final j trainingPlanType;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @SerializedName("trainingStatus")
    private final k trainingStatus;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @SerializedName("name")
    private final String trainingPlanName;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @SerializedName("startDate")
    private final String _startDate;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    @SerializedName("endDate")
    private final String _raceDate;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @SerializedName("trainingSubType")
    private final d0 trainingPlanSubType;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    @SerializedName("trainingPlanCategory")
    private final String _trainingPlanCategory;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    @SerializedName("planPhases")
    private final List<x> planPhases;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    @SerializedName("pausedDate")
    private final String _pausedDate;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    @SerializedName("resumedDate")
    private final String _resumedDate;

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<i> {
        @Override // android.os.Parcelable.Creator
        public final i createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            parcel.getClass();
            long j8 = parcel.readLong();
            j jVarCreateFromParcel = parcel.readInt() == 0 ? null : j.CREATOR.createFromParcel(parcel);
            k kVarCreateFromParcel = parcel.readInt() == 0 ? null : k.CREATOR.createFromParcel(parcel);
            String string = parcel.readString();
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            d0 d0VarCreateFromParcel = parcel.readInt() == 0 ? null : d0.CREATOR.createFromParcel(parcel);
            String string4 = parcel.readString();
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i14 = parcel.readInt();
                arrayList = new ArrayList(i14);
                int iA = 0;
                while (iA != i14) {
                    iA = kg.f.a(x.CREATOR, parcel, arrayList, iA, 1);
                }
            }
            return new i(j8, jVarCreateFromParcel, kVarCreateFromParcel, string, string2, string3, d0VarCreateFromParcel, string4, arrayList, parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final i[] newArray(int i14) {
            return new i[i14];
        }
    }

    public i(long j8, j jVar, k kVar, String str, String str2, String str3, d0 d0Var, String str4, List<x> list, String str5, String str6) {
        this.trainingPlanId = j8;
        this.trainingPlanType = jVar;
        this.trainingStatus = kVar;
        this.trainingPlanName = str;
        this._startDate = str2;
        this._raceDate = str3;
        this.trainingPlanSubType = d0Var;
        this._trainingPlanCategory = str4;
        this.planPhases = list;
        this._pausedDate = str5;
        this._resumedDate = str6;
    }

    public final List<x> b() {
        return this.planPhases;
    }

    public final DateTime d() {
        String str = this._raceDate;
        if (str != null) {
            return g22.k.q(str, "yyyy-MM-dd'T'HH:mm:ss.SSS", null);
        }
        return null;
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
        return this.trainingPlanId == iVar.trainingPlanId && p005kotlin.jvm.internal.s.g(this.trainingPlanType, iVar.trainingPlanType) && p005kotlin.jvm.internal.s.g(this.trainingStatus, iVar.trainingStatus) && p005kotlin.jvm.internal.s.g(this.trainingPlanName, iVar.trainingPlanName) && p005kotlin.jvm.internal.s.g(this._startDate, iVar._startDate) && p005kotlin.jvm.internal.s.g(this._raceDate, iVar._raceDate) && p005kotlin.jvm.internal.s.g(this.trainingPlanSubType, iVar.trainingPlanSubType) && p005kotlin.jvm.internal.s.g(this._trainingPlanCategory, iVar._trainingPlanCategory) && p005kotlin.jvm.internal.s.g(this.planPhases, iVar.planPhases) && p005kotlin.jvm.internal.s.g(this._pausedDate, iVar._pausedDate) && p005kotlin.jvm.internal.s.g(this._resumedDate, iVar._resumedDate);
    }

    public final vt1.m f() {
        vt1.m.a aVar = vt1.m.f180156b;
        String str = this._trainingPlanCategory;
        aVar.getClass();
        for (vt1.m mVar : vt1.m.values()) {
            if (p005kotlin.jvm.internal.s.g(mVar.f180162a, str)) {
                return mVar;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final long getTrainingPlanId() {
        return this.trainingPlanId;
    }

    public final DateTime getStartDate() {
        String str = this._startDate;
        if (str != null) {
            return g22.k.q(str, "yyyy-MM-dd'T'HH:mm:ss.SSS", null);
        }
        return null;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final String getTrainingPlanName() {
        return this.trainingPlanName;
    }

    public final int hashCode() {
        int iHashCode = Long.hashCode(this.trainingPlanId) * 31;
        j jVar = this.trainingPlanType;
        int iHashCode2 = (iHashCode + (jVar == null ? 0 : jVar.hashCode())) * 31;
        k kVar = this.trainingStatus;
        int iHashCode3 = (iHashCode2 + (kVar == null ? 0 : kVar.hashCode())) * 31;
        String str = this.trainingPlanName;
        int iHashCode4 = (iHashCode3 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this._startDate;
        int iHashCode5 = (iHashCode4 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this._raceDate;
        int iHashCode6 = (iHashCode5 + (str3 == null ? 0 : str3.hashCode())) * 31;
        d0 d0Var = this.trainingPlanSubType;
        int iHashCode7 = (iHashCode6 + (d0Var == null ? 0 : d0Var.hashCode())) * 31;
        String str4 = this._trainingPlanCategory;
        int iHashCode8 = (iHashCode7 + (str4 == null ? 0 : str4.hashCode())) * 31;
        List<x> list = this.planPhases;
        int iHashCode9 = (iHashCode8 + (list == null ? 0 : list.hashCode())) * 31;
        String str5 = this._pausedDate;
        int iHashCode10 = (iHashCode9 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this._resumedDate;
        return iHashCode10 + (str6 != null ? str6.hashCode() : 0);
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final j getTrainingPlanType() {
        return this.trainingPlanType;
    }

    public final boolean j() {
        k kVar = this.trainingStatus;
        return p005kotlin.jvm.internal.s.g(kVar != null ? kVar.getStatusKey() : null, "Scheduled");
    }

    public final boolean k() {
        k kVar = this.trainingStatus;
        return p005kotlin.jvm.internal.s.g(kVar != null ? kVar.getStatusKey() : null, "Completed");
    }

    public final boolean m() {
        d0 d0Var;
        d0 d0Var2;
        String subTypeKey;
        String subTypeKey2;
        String subTypeKey3;
        d0 d0Var3 = this.trainingPlanSubType;
        return ((d0Var3 == null || (subTypeKey3 = d0Var3.getSubTypeKey()) == null || !subTypeKey3.equalsIgnoreCase(l.RUNNING_OPEN_LOOP.f187825a)) && ((d0Var = this.trainingPlanSubType) == null || (subTypeKey2 = d0Var.getSubTypeKey()) == null || !subTypeKey2.equalsIgnoreCase(l.CYCLING_OPEN_LOOP.f187825a)) && ((d0Var2 = this.trainingPlanSubType) == null || (subTypeKey = d0Var2.getSubTypeKey()) == null || !subTypeKey.equalsIgnoreCase(l.TRIATHLON_OPEN_LOOP.f187825a))) ? false : true;
    }

    public final boolean o() {
        k kVar = this.trainingStatus;
        return p005kotlin.jvm.internal.s.g(kVar != null ? kVar.getStatusKey() : null, "Paused");
    }

    public final String toString() {
        long j8 = this.trainingPlanId;
        j jVar = this.trainingPlanType;
        k kVar = this.trainingStatus;
        String str = this.trainingPlanName;
        String str2 = this._startDate;
        String str3 = this._raceDate;
        d0 d0Var = this.trainingPlanSubType;
        String str4 = this._trainingPlanCategory;
        List<x> list = this.planPhases;
        String str5 = this._pausedDate;
        String str6 = this._resumedDate;
        StringBuilder sb3 = new StringBuilder("BasicTrainingPlanDTO(trainingPlanId=");
        sb3.append(j8);
        sb3.append(", trainingPlanType=");
        sb3.append(jVar);
        sb3.append(", trainingStatus=");
        sb3.append(kVar);
        sb3.append(", trainingPlanName=");
        sb3.append(str);
        sn.a.t(sb3, ", _startDate=", str2, ", _raceDate=", str3);
        sb3.append(", trainingPlanSubType=");
        sb3.append(d0Var);
        sb3.append(", _trainingPlanCategory=");
        sb3.append(str4);
        sb3.append(", planPhases=");
        sb3.append(list);
        sb3.append(", _pausedDate=");
        sb3.append(str5);
        return v.e0.h(sb3, ", _resumedDate=", str6, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i14) {
        parcel.getClass();
        parcel.writeLong(this.trainingPlanId);
        j jVar = this.trainingPlanType;
        if (jVar == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            jVar.writeToParcel(parcel, i14);
        }
        k kVar = this.trainingStatus;
        if (kVar == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            kVar.writeToParcel(parcel, i14);
        }
        parcel.writeString(this.trainingPlanName);
        parcel.writeString(this._startDate);
        parcel.writeString(this._raceDate);
        d0 d0Var = this.trainingPlanSubType;
        if (d0Var == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            d0Var.writeToParcel(parcel, i14);
        }
        parcel.writeString(this._trainingPlanCategory);
        List<x> list = this.planPhases;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            Iterator itO = u0.o(parcel, list, 1);
            while (itO.hasNext()) {
                ((x) itO.next()).writeToParcel(parcel, i14);
            }
        }
        parcel.writeString(this._pausedDate);
        parcel.writeString(this._resumedDate);
    }
}
