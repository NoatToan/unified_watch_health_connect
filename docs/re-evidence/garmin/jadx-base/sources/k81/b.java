package k81;

import android.os.Parcel;
import android.os.Parcelable;
import b71.i;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.google.gson.annotations.SerializedName;
import com.nimbusds.jose.jwk.JWKParameterNames;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kg.f;
import lc.u0;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0017\b\u0087\b\u0018\u00002\u00020\u0001BW\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\u0016\u0010\t\u001a\u0012\u0012\u0004\u0012\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010\b\u0018\u00010\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\b\u0012\u000e\u0010\r\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b¢\u0006\u0004\b\u000e\u0010\u000fR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u0015\u001a\u0004\b\u0014\u0010\u0017R*\u0010\t\u001a\u0012\u0012\u0004\u0012\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010\b\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u001c\u0010\n\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 R\"\u0010\r\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001f\u0010!\u001a\u0004\b\u0019\u0010\"¨\u0006#"}, d2 = {"Lk81/b;", "Landroid/os/Parcelable;", "", "userProfilePk", "", "startDate", "endDate", "", "", "periodAvgScore", "maxScore", "", "Lk81/a;", "hillScoreDTOList", "<init>", "(Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;Ljava/lang/Integer;Ljava/util/List;)V", "a", "Ljava/lang/Long;", IntegerTokenConverter.CONVERTER_KEY, "()Ljava/lang/Long;", "b", "Ljava/lang/String;", "h", "()Ljava/lang/String;", "c", "d", "Ljava/util/Map;", "g", "()Ljava/util/Map;", JWKParameterNames.RSA_EXPONENT, "Ljava/lang/Integer;", "f", "()Ljava/lang/Integer;", "Ljava/util/List;", "()Ljava/util/List;", "gcm-performance-scores_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class b implements Parcelable {
    public static final Parcelable.Creator<b> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @SerializedName("userProfilePK")
    private final Long userProfilePk;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @SerializedName("startDate")
    private final String startDate;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @SerializedName("endDate")
    private final String endDate;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @SerializedName("periodAvgScore")
    private final Map<String, Integer> periodAvgScore;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @SerializedName("maxScore")
    private final Integer maxScore;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    @SerializedName("hillScoreDTOList")
    private final List<k81.a> hillScoreDTOList;

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<b> {
        @Override // android.os.Parcelable.Creator
        public final b createFromParcel(Parcel parcel) {
            LinkedHashMap linkedHashMap;
            parcel.getClass();
            ArrayList arrayList = null;
            Long lValueOf = parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong());
            String string = parcel.readString();
            String string2 = parcel.readString();
            int iA = 0;
            if (parcel.readInt() == 0) {
                linkedHashMap = null;
            } else {
                int i14 = parcel.readInt();
                linkedHashMap = new LinkedHashMap(i14);
                for (int i15 = 0; i15 != i14; i15++) {
                    linkedHashMap.put(parcel.readString(), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()));
                }
            }
            Integer numValueOf = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            if (parcel.readInt() != 0) {
                int i16 = parcel.readInt();
                arrayList = new ArrayList(i16);
                while (iA != i16) {
                    iA = f.a(k81.a.CREATOR, parcel, arrayList, iA, 1);
                }
            }
            return new b(lValueOf, string, string2, linkedHashMap, numValueOf, arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final b[] newArray(int i14) {
            return new b[i14];
        }
    }

    public b(Long l14, String str, String str2, Map<String, Integer> map, Integer num, List<k81.a> list) {
        this.userProfilePk = l14;
        this.startDate = str;
        this.endDate = str2;
        this.periodAvgScore = map;
        this.maxScore = num;
        this.hillScoreDTOList = list;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getEndDate() {
        return this.endDate;
    }

    public final List<k81.a> d() {
        return this.hillScoreDTOList;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return s.g(this.userProfilePk, bVar.userProfilePk) && s.g(this.startDate, bVar.startDate) && s.g(this.endDate, bVar.endDate) && s.g(this.periodAvgScore, bVar.periodAvgScore) && s.g(this.maxScore, bVar.maxScore) && s.g(this.hillScoreDTOList, bVar.hillScoreDTOList);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final Integer getMaxScore() {
        return this.maxScore;
    }

    public final Map<String, Integer> g() {
        return this.periodAvgScore;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final String getStartDate() {
        return this.startDate;
    }

    public final int hashCode() {
        Long l14 = this.userProfilePk;
        int iHashCode = (l14 == null ? 0 : l14.hashCode()) * 31;
        String str = this.startDate;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.endDate;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Map<String, Integer> map = this.periodAvgScore;
        int iHashCode4 = (iHashCode3 + (map == null ? 0 : map.hashCode())) * 31;
        Integer num = this.maxScore;
        int iHashCode5 = (iHashCode4 + (num == null ? 0 : num.hashCode())) * 31;
        List<k81.a> list = this.hillScoreDTOList;
        return iHashCode5 + (list != null ? list.hashCode() : 0);
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final Long getUserProfilePk() {
        return this.userProfilePk;
    }

    public final String toString() {
        Long l14 = this.userProfilePk;
        String str = this.startDate;
        String str2 = this.endDate;
        Map<String, Integer> map = this.periodAvgScore;
        Integer num = this.maxScore;
        List<k81.a> list = this.hillScoreDTOList;
        StringBuilder sbJ = i.j("HillScoreReportDTO(userProfilePk=", ", startDate=", str, l14, ", endDate=");
        sbJ.append(str2);
        sbJ.append(", periodAvgScore=");
        sbJ.append(map);
        sbJ.append(", maxScore=");
        sbJ.append(num);
        sbJ.append(", hillScoreDTOList=");
        sbJ.append(list);
        sbJ.append(")");
        return sbJ.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i14) {
        parcel.getClass();
        Long l14 = this.userProfilePk;
        if (l14 == null) {
            parcel.writeInt(0);
        } else {
            sn.a.n(parcel, 1, l14);
        }
        parcel.writeString(this.startDate);
        parcel.writeString(this.endDate);
        Map<String, Integer> map = this.periodAvgScore;
        if (map == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(map.size());
            for (Map.Entry<String, Integer> entry : map.entrySet()) {
                parcel.writeString(entry.getKey());
                Integer value = entry.getValue();
                if (value == null) {
                    parcel.writeInt(0);
                } else {
                    f.k(parcel, 1, value);
                }
            }
        }
        Integer num = this.maxScore;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            f.k(parcel, 1, num);
        }
        List<k81.a> list = this.hillScoreDTOList;
        if (list == null) {
            parcel.writeInt(0);
            return;
        }
        Iterator itO = u0.o(parcel, list, 1);
        while (itO.hasNext()) {
            ((k81.a) itO.next()).writeToParcel(parcel, i14);
        }
    }
}
