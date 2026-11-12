package ab1;

import android.os.Parcel;
import android.os.Parcelable;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.google.gson.annotations.SerializedName;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import lc.u0;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0018\b\u0087\b\u0018\u00002\u00020\u0001B9\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0010\b\u0002\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u000b\u0010\fR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\"\u0010\u0005\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R*\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR$\u0010\n\u001a\u0004\u0018\u00010\t8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u000f\u0010\u001d\u001a\u0004\b\u0011\u0010\u001e\"\u0004\b\u001f\u0010 ¨\u0006!"}, d2 = {"Lab1/d;", "Landroid/os/Parcelable;", "", "powerGuidancePk", "Lab1/g;", "powerGuidanceSummary", "", "Lab1/e;", "powerGuidanceSplits", "Lab1/a;", "alertUserSettingsChanges", "<init>", "(Ljava/lang/Long;Lab1/g;Ljava/util/List;Lab1/a;)V", "a", "Ljava/lang/Long;", "d", "()Ljava/lang/Long;", "b", "Lab1/g;", "g", "()Lab1/g;", "setPowerGuidanceSummary", "(Lab1/g;)V", "c", "Ljava/util/List;", "f", "()Ljava/util/List;", IntegerTokenConverter.CONVERTER_KEY, "(Ljava/util/List;)V", "Lab1/a;", "()Lab1/a;", "h", "(Lab1/a;)V", "gcm-domain-training_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class d implements Parcelable {
    public static final Parcelable.Creator<d> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @SerializedName("powerGuidancePk")
    private final Long powerGuidancePk;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @SerializedName("powerGuidanceSummary")
    private g powerGuidanceSummary;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @SerializedName("powerGuidanceSplits")
    private List<e> powerGuidanceSplits;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @com.garmin.android.apps.connectmobile.util.gson.b
    private ab1.a alertUserSettingsChanges;

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<d> {
        @Override // android.os.Parcelable.Creator
        public final d createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            parcel.getClass();
            Long lValueOf = parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong());
            g gVar = (g) parcel.readParcelable(d.class.getClassLoader());
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i14 = parcel.readInt();
                arrayList = new ArrayList(i14);
                int iA = 0;
                while (iA != i14) {
                    iA = kg.f.a(e.CREATOR, parcel, arrayList, iA, 1);
                }
            }
            return new d(lValueOf, gVar, arrayList, parcel.readInt() != 0 ? ab1.a.CREATOR.createFromParcel(parcel) : null);
        }

        @Override // android.os.Parcelable.Creator
        public final d[] newArray(int i14) {
            return new d[i14];
        }
    }

    public /* synthetic */ d(Long l14, g gVar, List list, ab1.a aVar, int i14, p005kotlin.jvm.internal.j jVar) {
        this((i14 & 1) != 0 ? null : l14, gVar, (i14 & 4) != 0 ? null : list, (i14 & 8) != 0 ? null : aVar);
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final ab1.a getAlertUserSettingsChanges() {
        return this.alertUserSettingsChanges;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final Long getPowerGuidancePk() {
        return this.powerGuidancePk;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return s.g(this.powerGuidancePk, dVar.powerGuidancePk) && s.g(this.powerGuidanceSummary, dVar.powerGuidanceSummary) && s.g(this.powerGuidanceSplits, dVar.powerGuidanceSplits) && s.g(this.alertUserSettingsChanges, dVar.alertUserSettingsChanges);
    }

    public final List<e> f() {
        return this.powerGuidanceSplits;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final g getPowerGuidanceSummary() {
        return this.powerGuidanceSummary;
    }

    public final void h(ab1.a aVar) {
        this.alertUserSettingsChanges = aVar;
    }

    public final int hashCode() {
        Long l14 = this.powerGuidancePk;
        int iHashCode = (this.powerGuidanceSummary.hashCode() + ((l14 == null ? 0 : l14.hashCode()) * 31)) * 31;
        List<e> list = this.powerGuidanceSplits;
        int iHashCode2 = (iHashCode + (list == null ? 0 : list.hashCode())) * 31;
        ab1.a aVar = this.alertUserSettingsChanges;
        return iHashCode2 + (aVar != null ? aVar.hashCode() : 0);
    }

    public final void i(ArrayList arrayList) {
        this.powerGuidanceSplits = arrayList;
    }

    public final String toString() {
        return "PowerGuideDTO(powerGuidancePk=" + this.powerGuidancePk + ", powerGuidanceSummary=" + this.powerGuidanceSummary + ", powerGuidanceSplits=" + this.powerGuidanceSplits + ", alertUserSettingsChanges=" + this.alertUserSettingsChanges + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i14) {
        parcel.getClass();
        Long l14 = this.powerGuidancePk;
        if (l14 == null) {
            parcel.writeInt(0);
        } else {
            sn.a.n(parcel, 1, l14);
        }
        parcel.writeParcelable(this.powerGuidanceSummary, i14);
        List<e> list = this.powerGuidanceSplits;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            Iterator itO = u0.o(parcel, list, 1);
            while (itO.hasNext()) {
                ((e) itO.next()).writeToParcel(parcel, i14);
            }
        }
        ab1.a aVar = this.alertUserSettingsChanges;
        if (aVar == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            aVar.writeToParcel(parcel, i14);
        }
    }

    public d(Long l14, g gVar, List<e> list, ab1.a aVar) {
        gVar.getClass();
        this.powerGuidancePk = l14;
        this.powerGuidanceSummary = gVar;
        this.powerGuidanceSplits = list;
        this.alertUserSettingsChanges = aVar;
    }
}
