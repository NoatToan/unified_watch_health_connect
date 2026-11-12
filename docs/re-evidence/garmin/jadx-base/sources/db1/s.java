package db1;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.annotations.SerializedName;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p005kotlin.Metadata;
import u62.z;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0012\b\u0087\b\u0018\u00002\u00020\u0001B/\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0004\b\b\u0010\tR$\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR$\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0010\u0010\u000b\u001a\u0004\b\u0011\u0010\r\"\u0004\b\u0012\u0010\u000fR(\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0010\u0010\u0015\"\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"Ldb1/s;", "Landroid/os/Parcelable;", "", "min", "max", "", "Ldb1/r;", "glucoseList", "<init>", "(Ljava/lang/Double;Ljava/lang/Double;Ljava/util/List;)V", "a", "Ljava/lang/Double;", "f", "()Ljava/lang/Double;", "setMin", "(Ljava/lang/Double;)V", "b", "d", "setMax", "c", "Ljava/util/List;", "()Ljava/util/List;", "setGlucoseList", "(Ljava/util/List;)V", "gcm-domain-womens-health_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class s implements Parcelable {
    public static final Parcelable.Creator<s> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @SerializedName("min")
    private Double min;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @SerializedName("max")
    private Double max;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @SerializedName("glucoseList")
    private List<r> glucoseList;

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<s> {
        @Override // android.os.Parcelable.Creator
        public final s createFromParcel(Parcel parcel) {
            parcel.getClass();
            Double dValueOf = parcel.readInt() == 0 ? null : Double.valueOf(parcel.readDouble());
            Double dValueOf2 = parcel.readInt() != 0 ? Double.valueOf(parcel.readDouble()) : null;
            int i14 = parcel.readInt();
            ArrayList arrayList = new ArrayList(i14);
            int iA = 0;
            while (iA != i14) {
                iA = kg.f.a(r.CREATOR, parcel, arrayList, iA, 1);
            }
            return new s(dValueOf, dValueOf2, arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final s[] newArray(int i14) {
            return new s[i14];
        }
    }

    public /* synthetic */ s(Double d14, Double d15, List list, int i14, p005kotlin.jvm.internal.j jVar) {
        this((i14 & 1) != 0 ? null : d14, (i14 & 2) != 0 ? null : d15, (i14 & 4) != 0 ? new ArrayList() : list);
    }

    public final List<r> b() {
        return this.glucoseList;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final Double getMax() {
        return this.max;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s)) {
            return false;
        }
        s sVar = (s) obj;
        return p005kotlin.jvm.internal.s.g(this.min, sVar.min) && p005kotlin.jvm.internal.s.g(this.max, sVar.max) && p005kotlin.jvm.internal.s.g(this.glucoseList, sVar.glucoseList);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final Double getMin() {
        return this.min;
    }

    public final int hashCode() {
        Double d14 = this.min;
        int iHashCode = (d14 == null ? 0 : d14.hashCode()) * 31;
        Double d15 = this.max;
        return this.glucoseList.hashCode() + ((iHashCode + (d15 != null ? d15.hashCode() : 0)) * 31);
    }

    public final String toString() {
        Double d14 = this.min;
        Double d15 = this.max;
        return z.c(tn.k.i("UserGlucoseDetailedDTO(min=", d14, d15, ", max=", ", glucoseList="), this.glucoseList, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i14) {
        parcel.getClass();
        Double d14 = this.min;
        if (d14 == null) {
            parcel.writeInt(0);
        } else {
            sn.a.m(parcel, 1, d14);
        }
        Double d15 = this.max;
        if (d15 == null) {
            parcel.writeInt(0);
        } else {
            sn.a.m(parcel, 1, d15);
        }
        Iterator itE = kg.f.e(this.glucoseList, parcel);
        while (itE.hasNext()) {
            ((r) itE.next()).writeToParcel(parcel, i14);
        }
    }

    public s(Double d14, Double d15, List<r> list) {
        list.getClass();
        this.min = d14;
        this.max = d15;
        this.glucoseList = list;
    }

    public s() {
        this(null, null, null, 7, null);
    }
}
