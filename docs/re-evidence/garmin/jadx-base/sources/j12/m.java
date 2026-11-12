package j12;

import android.os.Parcel;
import android.os.Parcelable;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.google.gson.annotations.SerializedName;
import com.nimbusds.jose.jwk.JWKParameterNames;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import lc.u0;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\"\b\u0087\b\u0018\u00002\u00020\u0001BY\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0010\b\u0002\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006\u0012\u0010\b\u0002\u0010\n\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\u0006\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\u000f\u0010\u0010R\"\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R$\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR*\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"R*\u0010\n\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b#\u0010\u001e\u001a\u0004\b$\u0010 \"\u0004\b%\u0010\"R$\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b&\u0010'\u001a\u0004\b#\u0010(\"\u0004\b)\u0010*R$\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u001f\u0010+\u001a\u0004\b\u0017\u0010,\"\u0004\b-\u0010.¨\u0006/"}, d2 = {"Lj12/m;", "Landroid/os/Parcelable;", "", "userId", "Lj12/j;", "sectionPublicity", "", "Lj12/e;", "pastMonthsStatistics", "Lj12/f;", "personalRecords", "Lj12/d;", "lifeTimeGoal", "Lcom/garmin/android/apps/connectmobile/repcounting/model/f;", "exerciseTranslations", "<init>", "(ILj12/j;Ljava/util/List;Ljava/util/List;Lj12/d;Lcom/garmin/android/apps/connectmobile/repcounting/model/f;)V", "a", "I", IntegerTokenConverter.CONVERTER_KEY, "()I", "setUserId", "(I)V", "b", "Lj12/j;", "h", "()Lj12/j;", "setSectionPublicity", "(Lj12/j;)V", "c", "Ljava/util/List;", "f", "()Ljava/util/List;", "setPastMonthsStatistics", "(Ljava/util/List;)V", "d", "g", JWKParameterNames.RSA_SECOND_PRIME_FACTOR, JWKParameterNames.RSA_EXPONENT, "Lj12/d;", "()Lj12/d;", "setLifeTimeGoal", "(Lj12/d;)V", "Lcom/garmin/android/apps/connectmobile/repcounting/model/f;", "()Lcom/garmin/android/apps/connectmobile/repcounting/model/f;", "o", "(Lcom/garmin/android/apps/connectmobile/repcounting/model/f;)V", "gcm-profile_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class m implements Parcelable {
    public static final Parcelable.Creator<m> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @SerializedName("userId")
    private int userId;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @SerializedName("sectionPublicity")
    private j sectionPublicity;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @SerializedName("pastMonthsStatistics")
    private List<e> pastMonthsStatistics;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @SerializedName("personalRecord")
    private List<f> personalRecords;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @SerializedName("lifeTimeGoal")
    private d lifeTimeGoal;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    @com.garmin.android.apps.connectmobile.util.gson.b
    private com.garmin.android.apps.connectmobile.repcounting.model.f exerciseTranslations;

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<m> {
        @Override // android.os.Parcelable.Creator
        public final m createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            ArrayList arrayList2;
            parcel.getClass();
            int i14 = parcel.readInt();
            j jVarCreateFromParcel = parcel.readInt() == 0 ? null : j.CREATOR.createFromParcel(parcel);
            int iA = 0;
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i15 = parcel.readInt();
                ArrayList arrayList3 = new ArrayList(i15);
                int iA2 = 0;
                while (iA2 != i15) {
                    iA2 = kg.f.a(e.CREATOR, parcel, arrayList3, iA2, 1);
                }
                arrayList = arrayList3;
            }
            if (parcel.readInt() == 0) {
                arrayList2 = null;
            } else {
                int i16 = parcel.readInt();
                ArrayList arrayList4 = new ArrayList(i16);
                while (iA != i16) {
                    iA = kg.f.a(f.CREATOR, parcel, arrayList4, iA, 1);
                }
                arrayList2 = arrayList4;
            }
            return new m(i14, jVarCreateFromParcel, arrayList, arrayList2, parcel.readInt() != 0 ? d.CREATOR.createFromParcel(parcel) : null, (com.garmin.android.apps.connectmobile.repcounting.model.f) parcel.readParcelable(m.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final m[] newArray(int i14) {
            return new m[i14];
        }
    }

    public /* synthetic */ m(int i14, j jVar, List list, List list2, d dVar, com.garmin.android.apps.connectmobile.repcounting.model.f fVar, int i15, p005kotlin.jvm.internal.j jVar2) {
        this((i15 & 1) != 0 ? 0 : i14, (i15 & 2) != 0 ? null : jVar, (i15 & 4) != 0 ? null : list, (i15 & 8) != 0 ? null : list2, (i15 & 16) != 0 ? null : dVar, (i15 & 32) != 0 ? null : fVar);
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final com.garmin.android.apps.connectmobile.repcounting.model.f getExerciseTranslations() {
        return this.exerciseTranslations;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final d getLifeTimeGoal() {
        return this.lifeTimeGoal;
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
        return this.userId == mVar.userId && s.g(this.sectionPublicity, mVar.sectionPublicity) && s.g(this.pastMonthsStatistics, mVar.pastMonthsStatistics) && s.g(this.personalRecords, mVar.personalRecords) && s.g(this.lifeTimeGoal, mVar.lifeTimeGoal) && s.g(this.exerciseTranslations, mVar.exerciseTranslations);
    }

    public final List<e> f() {
        return this.pastMonthsStatistics;
    }

    public final List<f> g() {
        return this.personalRecords;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final j getSectionPublicity() {
        return this.sectionPublicity;
    }

    public final int hashCode() {
        int iHashCode = Integer.hashCode(this.userId) * 31;
        j jVar = this.sectionPublicity;
        int iHashCode2 = (iHashCode + (jVar == null ? 0 : jVar.hashCode())) * 31;
        List<e> list = this.pastMonthsStatistics;
        int iHashCode3 = (iHashCode2 + (list == null ? 0 : list.hashCode())) * 31;
        List<f> list2 = this.personalRecords;
        int iHashCode4 = (iHashCode3 + (list2 == null ? 0 : list2.hashCode())) * 31;
        d dVar = this.lifeTimeGoal;
        int iHashCode5 = (iHashCode4 + (dVar == null ? 0 : dVar.hashCode())) * 31;
        com.garmin.android.apps.connectmobile.repcounting.model.f fVar = this.exerciseTranslations;
        return iHashCode5 + (fVar != null ? fVar.hashCode() : 0);
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final int getUserId() {
        return this.userId;
    }

    public final boolean j() {
        List<e> list = this.pastMonthsStatistics;
        if (list != null) {
            list.getClass();
            int size = list.size();
            for (int i14 = 0; i14 < size; i14++) {
                List<e> list2 = this.pastMonthsStatistics;
                list2.getClass();
                e eVar = list2.get(i14);
                if (eVar != null && eVar.getTotalCyclingDistance() > 0.0d) {
                    return true;
                }
            }
        }
        return false;
    }

    public final boolean k() {
        List<e> list = this.pastMonthsStatistics;
        if (list != null) {
            list.getClass();
            int size = list.size();
            for (int i14 = 0; i14 < size; i14++) {
                List<e> list2 = this.pastMonthsStatistics;
                list2.getClass();
                e eVar = list2.get(i14);
                if (eVar != null && eVar.getTotalRunningDistance() > 0.0d) {
                    return true;
                }
            }
        }
        return false;
    }

    public final boolean m() {
        List<e> list = this.pastMonthsStatistics;
        if (list != null) {
            list.getClass();
            int size = list.size();
            for (int i14 = 0; i14 < size; i14++) {
                List<e> list2 = this.pastMonthsStatistics;
                list2.getClass();
                e eVar = list2.get(i14);
                if (eVar != null && eVar.getTotalSwimmingDistance() > 0.0d) {
                    return true;
                }
            }
        }
        return false;
    }

    public final void o(com.garmin.android.apps.connectmobile.repcounting.model.f fVar) {
        this.exerciseTranslations = fVar;
    }

    public final void q(List<f> list) {
        this.personalRecords = list;
    }

    public final String toString() {
        int i14 = this.userId;
        j jVar = this.sectionPublicity;
        List<e> list = this.pastMonthsStatistics;
        List<f> list2 = this.personalRecords;
        d dVar = this.lifeTimeGoal;
        com.garmin.android.apps.connectmobile.repcounting.model.f fVar = this.exerciseTranslations;
        StringBuilder sb3 = new StringBuilder("UserProfileStatsDTO(userId=");
        sb3.append(i14);
        sb3.append(", sectionPublicity=");
        sb3.append(jVar);
        sb3.append(", pastMonthsStatistics=");
        n23.j.z(sb3, list, ", personalRecords=", list2, ", lifeTimeGoal=");
        sb3.append(dVar);
        sb3.append(", exerciseTranslations=");
        sb3.append(fVar);
        sb3.append(")");
        return sb3.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i14) {
        parcel.getClass();
        parcel.writeInt(this.userId);
        j jVar = this.sectionPublicity;
        if (jVar == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            jVar.writeToParcel(parcel, i14);
        }
        List<e> list = this.pastMonthsStatistics;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            Iterator itO = u0.o(parcel, list, 1);
            while (itO.hasNext()) {
                ((e) itO.next()).writeToParcel(parcel, i14);
            }
        }
        List<f> list2 = this.personalRecords;
        if (list2 == null) {
            parcel.writeInt(0);
        } else {
            Iterator itO2 = u0.o(parcel, list2, 1);
            while (itO2.hasNext()) {
                ((f) itO2.next()).writeToParcel(parcel, i14);
            }
        }
        d dVar = this.lifeTimeGoal;
        if (dVar == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            dVar.writeToParcel(parcel, i14);
        }
        parcel.writeParcelable(this.exerciseTranslations, i14);
    }

    public m(int i14, j jVar, List<e> list, List<f> list2, d dVar, com.garmin.android.apps.connectmobile.repcounting.model.f fVar) {
        this.userId = i14;
        this.sectionPublicity = jVar;
        this.pastMonthsStatistics = list;
        this.personalRecords = list2;
        this.lifeTimeGoal = dVar;
        this.exerciseTranslations = fVar;
    }

    public m() {
        this(0, null, null, null, null, null, 63, null);
    }
}
