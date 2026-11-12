package kw;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.annotations.SerializedName;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\tB+\u0012\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0002¢\u0006\u0004\b\u0007\u0010\bR\"\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\"\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\n\u001a\u0004\b\r\u0010\f¨\u0006\u000e"}, d2 = {"Lkw/e;", "Landroid/os/Parcelable;", "", "Lkw/n;", "countryMeasurementCategories", "Lkw/q;", "defaultMeasurementCategories", "<init>", "(Ljava/util/Set;Ljava/util/Set;)V", "a", "Ljava/util/Set;", "b", "()Ljava/util/Set;", "d", "gcm-blood-pressure_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class e implements Parcelable {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @SerializedName("countryMeasurementCategories")
    private final Set<n> countryMeasurementCategories;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @SerializedName("defaultMeasurementCategories")
    private final Set<q> defaultMeasurementCategories;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a f106832c = new a(null);
    public static final Parcelable.Creator<e> CREATOR = new b();

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class b implements Parcelable.Creator<e> {
        @Override // android.os.Parcelable.Creator
        public final e createFromParcel(Parcel parcel) {
            LinkedHashSet linkedHashSet;
            parcel.getClass();
            LinkedHashSet linkedHashSet2 = null;
            if (parcel.readInt() == 0) {
                linkedHashSet = null;
            } else {
                int i14 = parcel.readInt();
                linkedHashSet = new LinkedHashSet(i14);
                for (int i15 = 0; i15 != i14; i15++) {
                    linkedHashSet.add(n.CREATOR.createFromParcel(parcel));
                }
            }
            if (parcel.readInt() != 0) {
                int i16 = parcel.readInt();
                linkedHashSet2 = new LinkedHashSet(i16);
                for (int i17 = 0; i17 != i16; i17++) {
                    linkedHashSet2.add(q.CREATOR.createFromParcel(parcel));
                }
            }
            return new e(linkedHashSet, linkedHashSet2);
        }

        @Override // android.os.Parcelable.Creator
        public final e[] newArray(int i14) {
            return new e[i14];
        }
    }

    public /* synthetic */ e(Set set, Set set2, int i14, p005kotlin.jvm.internal.j jVar) {
        this((i14 & 1) != 0 ? null : set, (i14 & 2) != 0 ? null : set2);
    }

    public final Set<n> b() {
        return this.countryMeasurementCategories;
    }

    public final Set<q> d() {
        return this.defaultMeasurementCategories;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return p005kotlin.jvm.internal.s.g(this.countryMeasurementCategories, eVar.countryMeasurementCategories) && p005kotlin.jvm.internal.s.g(this.defaultMeasurementCategories, eVar.defaultMeasurementCategories);
    }

    public final int hashCode() {
        Set<n> set = this.countryMeasurementCategories;
        int iHashCode = (set == null ? 0 : set.hashCode()) * 31;
        Set<q> set2 = this.defaultMeasurementCategories;
        return iHashCode + (set2 != null ? set2.hashCode() : 0);
    }

    public final String toString() {
        return "BloodPressureConfigDTO(countryMeasurementCategories=" + this.countryMeasurementCategories + ", defaultMeasurementCategories=" + this.defaultMeasurementCategories + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i14) {
        parcel.getClass();
        Set<n> set = this.countryMeasurementCategories;
        if (set == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(set.size());
            Iterator<n> it = set.iterator();
            while (it.hasNext()) {
                it.next().writeToParcel(parcel, i14);
            }
        }
        Set<q> set2 = this.defaultMeasurementCategories;
        if (set2 == null) {
            parcel.writeInt(0);
            return;
        }
        parcel.writeInt(1);
        parcel.writeInt(set2.size());
        Iterator<q> it3 = set2.iterator();
        while (it3.hasNext()) {
            it3.next().writeToParcel(parcel, i14);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lkw/e$a;", "", "<init>", "()V", "gcm-blood-pressure_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }

    public e(Set<n> set, Set<q> set2) {
        this.countryMeasurementCategories = set;
        this.defaultMeasurementCategories = set2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public e() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }
}
