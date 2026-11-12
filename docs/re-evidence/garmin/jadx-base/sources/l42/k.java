package l42;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.annotations.SerializedName;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0015\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nR(\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\"\u0010\u0006\u001a\u00020\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\r\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\"\u0010\b\u001a\u00020\u00078\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001b¨\u0006\u001c"}, d2 = {"Ll42/k;", "Landroid/os/Parcelable;", "", "Ll42/b;", "dailyWeightSummaries", "Ll42/c;", "previousDateWeight", "Ll42/g;", "totalAverage", "<init>", "(Ljava/util/List;Ll42/c;Ll42/g;)V", "a", "Ljava/util/List;", "b", "()Ljava/util/List;", "setDailyWeightSummaries", "(Ljava/util/List;)V", "Ll42/c;", "getPreviousDateWeight", "()Ll42/c;", "setPreviousDateWeight", "(Ll42/c;)V", "c", "Ll42/g;", "d", "()Ll42/g;", "setTotalAverage", "(Ll42/g;)V", "data_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class k implements Parcelable {
    public static final Parcelable.Creator<k> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @SerializedName("dailyWeightSummaries")
    private List<b> dailyWeightSummaries;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @SerializedName("previousDateWeight")
    private c previousDateWeight;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @SerializedName("totalAverage")
    private g totalAverage;

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<k> {
        @Override // android.os.Parcelable.Creator
        public final k createFromParcel(Parcel parcel) {
            parcel.getClass();
            int i14 = parcel.readInt();
            ArrayList arrayList = new ArrayList(i14);
            int iA = 0;
            while (iA != i14) {
                iA = kg.f.a(b.CREATOR, parcel, arrayList, iA, 1);
            }
            return new k(arrayList, (c) parcel.readParcelable(k.class.getClassLoader()), (g) parcel.readParcelable(k.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final k[] newArray(int i14) {
            return new k[i14];
        }
    }

    public k(List<b> list, c cVar, g gVar) {
        list.getClass();
        cVar.getClass();
        gVar.getClass();
        this.dailyWeightSummaries = list;
        this.previousDateWeight = cVar;
        this.totalAverage = gVar;
    }

    public final List<b> b() {
        return this.dailyWeightSummaries;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final g getTotalAverage() {
        return this.totalAverage;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k)) {
            return false;
        }
        k kVar = (k) obj;
        return s.g(this.dailyWeightSummaries, kVar.dailyWeightSummaries) && s.g(this.previousDateWeight, kVar.previousDateWeight) && s.g(this.totalAverage, kVar.totalAverage);
    }

    public final int hashCode() {
        return this.totalAverage.hashCode() + ((this.previousDateWeight.hashCode() + (this.dailyWeightSummaries.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "WeightRangeDTO(dailyWeightSummaries=" + this.dailyWeightSummaries + ", previousDateWeight=" + this.previousDateWeight + ", totalAverage=" + this.totalAverage + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i14) {
        parcel.getClass();
        Iterator itE = kg.f.e(this.dailyWeightSummaries, parcel);
        while (itE.hasNext()) {
            ((b) itE.next()).writeToParcel(parcel, i14);
        }
        parcel.writeParcelable(this.previousDateWeight, i14);
        parcel.writeParcelable(this.totalAverage, i14);
    }
}
