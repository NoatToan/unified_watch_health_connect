package jv1;

import android.os.Parcel;
import android.os.Parcelable;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.google.gson.annotations.SerializedName;
import com.nimbusds.jose.jwk.JWKParameterNames;
import java.util.ArrayList;
import java.util.List;
import p005kotlin.Metadata;
import p13.h0;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0012\b\u0087\b\u0018\u00002\u00020\u0001BU\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004\u0012\u0010\b\u0002\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004\u0012\u0010\b\u0002\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u000b\u0010\fR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\"\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013R\"\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0012\u001a\u0004\b\u0015\u0010\u0013R\"\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0012\u001a\u0004\b\u0016\u0010\u0013R\u001c\u0010\n\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a¨\u0006\u001b"}, d2 = {"Ljv1/e0;", "Landroid/os/Parcelable;", "", "userProfilePk", "", "", "availableTrainingDays", "preferredLongTrainingDays", "preferredSwimTrainingDays", "Ljv1/a;", "adaptiveCoachingPlanType", "<init>", "(Ljava/lang/Long;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljv1/a;)V", "a", "Ljava/lang/Long;", IntegerTokenConverter.CONVERTER_KEY, "()Ljava/lang/Long;", "b", "Ljava/util/List;", "()Ljava/util/List;", "c", "d", "h", JWKParameterNames.RSA_EXPONENT, "Ljv1/a;", "getAdaptiveCoachingPlanType", "()Ljv1/a;", "gcm-training-plans_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class e0 implements Parcelable {
    public static final Parcelable.Creator<e0> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @SerializedName("userProfilePk")
    private final Long userProfilePk;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @SerializedName("availableTrainingDays")
    private final List<String> availableTrainingDays;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @SerializedName("preferredLongTrainingDays")
    private final List<String> preferredLongTrainingDays;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @SerializedName("preferredSwimTrainingDays")
    private final List<String> preferredSwimTrainingDays;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @SerializedName("adaptiveCoachingPlanType")
    private final jv1.a adaptiveCoachingPlanType;

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<e0> {
        @Override // android.os.Parcelable.Creator
        public final e0 createFromParcel(Parcel parcel) {
            Long lValueOf;
            jv1.a aVar;
            parcel.getClass();
            if (parcel.readInt() == 0) {
                lValueOf = null;
                aVar = null;
            } else {
                lValueOf = Long.valueOf(parcel.readLong());
                aVar = null;
            }
            return new e0(lValueOf, parcel.createStringArrayList(), parcel.createStringArrayList(), parcel.createStringArrayList(), parcel.readInt() == 0 ? aVar : jv1.a.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final e0[] newArray(int i14) {
            return new e0[i14];
        }
    }

    public /* synthetic */ e0(Long l14, List list, List list2, List list3, jv1.a aVar, int i14, p005kotlin.jvm.internal.j jVar) {
        this((i14 & 1) != 0 ? null : l14, (i14 & 2) != 0 ? null : list, (i14 & 4) != 0 ? null : list2, (i14 & 8) != 0 ? null : list3, (i14 & 16) != 0 ? null : aVar);
    }

    public final List<String> b() {
        return this.availableTrainingDays;
    }

    public final List<String> d() {
        return this.preferredLongTrainingDays;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e0)) {
            return false;
        }
        e0 e0Var = (e0) obj;
        return p005kotlin.jvm.internal.s.g(this.userProfilePk, e0Var.userProfilePk) && p005kotlin.jvm.internal.s.g(this.availableTrainingDays, e0Var.availableTrainingDays) && p005kotlin.jvm.internal.s.g(this.preferredLongTrainingDays, e0Var.preferredLongTrainingDays) && p005kotlin.jvm.internal.s.g(this.preferredSwimTrainingDays, e0Var.preferredSwimTrainingDays) && this.adaptiveCoachingPlanType == e0Var.adaptiveCoachingPlanType;
    }

    public final List<String> f(boolean z14) {
        List<String> list = this.preferredLongTrainingDays;
        if (list == null || !z14 || list.size() <= 1) {
            return this.preferredLongTrainingDays;
        }
        wt1.q.f187120f.getClass();
        if (wt1.q.a.e().containsAll(this.preferredLongTrainingDays) || wt1.q.a.c().containsAll(this.preferredLongTrainingDays)) {
            return h0.U(this.preferredLongTrainingDays, 1);
        }
        List<String> list2 = this.preferredLongTrainingDays;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list2) {
            wt1.q.f187120f.getClass();
            if (wt1.q.a.e().contains((String) obj)) {
                arrayList.add(obj);
            }
        }
        return h0.b1(arrayList);
    }

    public final ArrayList g() {
        w13.c cVar = wt1.q.f187129o;
        ArrayList arrayListK = n23.j.k(cVar);
        p13.c.b bVar = new p13.c.b();
        while (bVar.hasNext()) {
            Object next = bVar.next();
            wt1.q qVar = (wt1.q) next;
            List<String> list = this.availableTrainingDays;
            if (list == null || list.contains(qVar.f187130a)) {
                arrayListK.add(next);
            }
        }
        return arrayListK;
    }

    public final List<String> h() {
        return this.preferredSwimTrainingDays;
    }

    public final int hashCode() {
        Long l14 = this.userProfilePk;
        int iHashCode = (l14 == null ? 0 : l14.hashCode()) * 31;
        List<String> list = this.availableTrainingDays;
        int iHashCode2 = (iHashCode + (list == null ? 0 : list.hashCode())) * 31;
        List<String> list2 = this.preferredLongTrainingDays;
        int iHashCode3 = (iHashCode2 + (list2 == null ? 0 : list2.hashCode())) * 31;
        List<String> list3 = this.preferredSwimTrainingDays;
        int iHashCode4 = (iHashCode3 + (list3 == null ? 0 : list3.hashCode())) * 31;
        jv1.a aVar = this.adaptiveCoachingPlanType;
        return iHashCode4 + (aVar != null ? aVar.hashCode() : 0);
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final Long getUserProfilePk() {
        return this.userProfilePk;
    }

    public final String toString() {
        Long l14 = this.userProfilePk;
        List<String> list = this.availableTrainingDays;
        List<String> list2 = this.preferredLongTrainingDays;
        List<String> list3 = this.preferredSwimTrainingDays;
        jv1.a aVar = this.adaptiveCoachingPlanType;
        StringBuilder sb3 = new StringBuilder("UserSettingsDTO(userProfilePk=");
        sb3.append(l14);
        sb3.append(", availableTrainingDays=");
        sb3.append(list);
        sb3.append(", preferredLongTrainingDays=");
        n23.j.z(sb3, list2, ", preferredSwimTrainingDays=", list3, ", adaptiveCoachingPlanType=");
        sb3.append(aVar);
        sb3.append(")");
        return sb3.toString();
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
        parcel.writeStringList(this.availableTrainingDays);
        parcel.writeStringList(this.preferredLongTrainingDays);
        parcel.writeStringList(this.preferredSwimTrainingDays);
        jv1.a aVar = this.adaptiveCoachingPlanType;
        if (aVar == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            aVar.writeToParcel(parcel, i14);
        }
    }

    public e0(Long l14, List<String> list, List<String> list2, List<String> list3, jv1.a aVar) {
        this.userProfilePk = l14;
        this.availableTrainingDays = list;
        this.preferredLongTrainingDays = list2;
        this.preferredSwimTrainingDays = list3;
        this.adaptiveCoachingPlanType = aVar;
    }

    public e0() {
        this(null, null, null, null, null, 31, null);
    }
}
