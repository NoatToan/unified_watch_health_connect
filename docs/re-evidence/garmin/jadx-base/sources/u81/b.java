package u81;

import android.os.Parcel;
import android.os.Parcelable;
import com.garmin.android.apps.connectmobile.f3;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kg.f;
import lc.u0;
import org.joda.time.LocalDate;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001Ba\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\u0016\u0010\t\u001a\u0012\u0012\u0004\u0012\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010\b\u0018\u00010\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\b\u0012\u000e\u0010\r\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"Lu81/b;", "Landroid/os/Parcelable;", "", "userProfilePk", "Lorg/joda/time/LocalDate;", "startDate", "endDate", "", "", "periodAvgScore", "maxScore", "", "Lu81/a;", "hillScoreDMOList", "hillScoreFeedbackPhraseId", "<init>", "(Ljava/lang/Long;Lorg/joda/time/LocalDate;Lorg/joda/time/LocalDate;Ljava/util/Map;Ljava/lang/Integer;Ljava/util/List;Ljava/lang/Integer;)V", "gcm-performance-scores_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class b implements Parcelable {
    public static final Parcelable.Creator<b> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Long f169471a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final LocalDate f169472b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final LocalDate f169473c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Map<LocalDate, Integer> f169474d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Integer f169475e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final List<u81.a> f169476f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Integer f169477g;

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<b> {
        @Override // android.os.Parcelable.Creator
        public final b createFromParcel(Parcel parcel) {
            LinkedHashMap linkedHashMap;
            ArrayList arrayList;
            parcel.getClass();
            Long lValueOf = parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong());
            LocalDate localDate = (LocalDate) parcel.readSerializable();
            LocalDate localDate2 = (LocalDate) parcel.readSerializable();
            int iA = 0;
            if (parcel.readInt() == 0) {
                linkedHashMap = null;
            } else {
                int i14 = parcel.readInt();
                linkedHashMap = new LinkedHashMap(i14);
                for (int i15 = 0; i15 != i14; i15++) {
                    linkedHashMap.put(parcel.readSerializable(), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()));
                }
            }
            Integer numValueOf = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i16 = parcel.readInt();
                arrayList = new ArrayList(i16);
                while (iA != i16) {
                    iA = f.a(u81.a.CREATOR, parcel, arrayList, iA, 1);
                }
            }
            return new b(lValueOf, localDate, localDate2, linkedHashMap, numValueOf, arrayList, parcel.readInt() != 0 ? Integer.valueOf(parcel.readInt()) : null);
        }

        @Override // android.os.Parcelable.Creator
        public final b[] newArray(int i14) {
            return new b[i14];
        }
    }

    public b(Long l14, LocalDate localDate, LocalDate localDate2, Map<LocalDate, Integer> map, Integer num, List<u81.a> list, Integer num2) {
        this.f169471a = l14;
        this.f169472b = localDate;
        this.f169473c = localDate2;
        this.f169474d = map;
        this.f169475e = num;
        this.f169476f = list;
        this.f169477g = num2;
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
        return s.g(this.f169471a, bVar.f169471a) && s.g(this.f169472b, bVar.f169472b) && s.g(this.f169473c, bVar.f169473c) && s.g(this.f169474d, bVar.f169474d) && s.g(this.f169475e, bVar.f169475e) && s.g(this.f169476f, bVar.f169476f) && s.g(this.f169477g, bVar.f169477g);
    }

    public final int hashCode() {
        Long l14 = this.f169471a;
        int iHashCode = (l14 == null ? 0 : l14.hashCode()) * 31;
        LocalDate localDate = this.f169472b;
        int iHashCode2 = (iHashCode + (localDate == null ? 0 : localDate.hashCode())) * 31;
        LocalDate localDate2 = this.f169473c;
        int iHashCode3 = (iHashCode2 + (localDate2 == null ? 0 : localDate2.hashCode())) * 31;
        Map<LocalDate, Integer> map = this.f169474d;
        int iHashCode4 = (iHashCode3 + (map == null ? 0 : map.hashCode())) * 31;
        Integer num = this.f169475e;
        int iHashCode5 = (iHashCode4 + (num == null ? 0 : num.hashCode())) * 31;
        List<u81.a> list = this.f169476f;
        int iHashCode6 = (iHashCode5 + (list == null ? 0 : list.hashCode())) * 31;
        Integer num2 = this.f169477g;
        return iHashCode6 + (num2 != null ? num2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("HillScoreReportDMO(userProfilePk=");
        sb3.append(this.f169471a);
        sb3.append(", startDate=");
        sb3.append(this.f169472b);
        sb3.append(", endDate=");
        sb3.append(this.f169473c);
        sb3.append(", periodAvgScore=");
        sb3.append(this.f169474d);
        sb3.append(", maxScore=");
        sb3.append(this.f169475e);
        sb3.append(", hillScoreDMOList=");
        sb3.append(this.f169476f);
        sb3.append(", hillScoreFeedbackPhraseId=");
        return f3.i(sb3, this.f169477g, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i14) {
        parcel.getClass();
        Long l14 = this.f169471a;
        if (l14 == null) {
            parcel.writeInt(0);
        } else {
            sn.a.n(parcel, 1, l14);
        }
        parcel.writeSerializable(this.f169472b);
        parcel.writeSerializable(this.f169473c);
        Map<LocalDate, Integer> map = this.f169474d;
        if (map == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(map.size());
            for (Map.Entry<LocalDate, Integer> entry : map.entrySet()) {
                parcel.writeSerializable(entry.getKey());
                Integer value = entry.getValue();
                if (value == null) {
                    parcel.writeInt(0);
                } else {
                    f.k(parcel, 1, value);
                }
            }
        }
        Integer num = this.f169475e;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            f.k(parcel, 1, num);
        }
        List<u81.a> list = this.f169476f;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            Iterator itO = u0.o(parcel, list, 1);
            while (itO.hasNext()) {
                ((u81.a) itO.next()).writeToParcel(parcel, i14);
            }
        }
        Integer num2 = this.f169477g;
        if (num2 == null) {
            parcel.writeInt(0);
        } else {
            f.k(parcel, 1, num2);
        }
    }
}
