package l42;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.annotations.SerializedName;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import lc.u0;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0018\b\u0087\b\u0018\u00002\u00020\u0001B-\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bR(\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\"\u0010\u0006\u001a\u00020\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u000e\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\"\u0010\u0007\u001a\u00020\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0017\u0010\u0012\u001a\u0004\b\u0018\u0010\u0014\"\u0004\b\u0019\u0010\u0016R\"\u0010\t\u001a\u00020\b8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001f¨\u0006 "}, d2 = {"Ll42/a;", "Landroid/os/Parcelable;", "", "Ll42/c;", "dateWeightList", "", "endDate", "startDate", "Ll42/g;", "totalAverage", "<init>", "(Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ll42/g;)V", "a", "Ljava/util/List;", "b", "()Ljava/util/List;", "setDateWeightList", "(Ljava/util/List;)V", "Ljava/lang/String;", "getEndDate", "()Ljava/lang/String;", "setEndDate", "(Ljava/lang/String;)V", "c", "getStartDate", "setStartDate", "d", "Ll42/g;", "getTotalAverage", "()Ll42/g;", "setTotalAverage", "(Ll42/g;)V", "data_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class a implements Parcelable {
    public static final Parcelable.Creator<a> CREATOR = new C2101a();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f109910e = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @SerializedName("dateWeightList")
    private List<c> dateWeightList;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @SerializedName("endDate")
    private String endDate;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @SerializedName("startDate")
    private String startDate;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @SerializedName("totalAverage")
    private g totalAverage;

    /* JADX INFO: renamed from: l42.a$a, reason: collision with other inner class name */
    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class C2101a implements Parcelable.Creator<a> {
        @Override // android.os.Parcelable.Creator
        public final a createFromParcel(Parcel parcel) {
            parcel.getClass();
            int i14 = parcel.readInt();
            ArrayList arrayList = new ArrayList(i14);
            int iD = 0;
            while (iD != i14) {
                iD = u0.d(a.class, parcel, arrayList, iD, 1);
            }
            return new a(arrayList, parcel.readString(), parcel.readString(), (g) parcel.readParcelable(a.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final a[] newArray(int i14) {
            return new a[i14];
        }
    }

    public a(List<c> list, String str, String str2, g gVar) {
        list.getClass();
        str.getClass();
        str2.getClass();
        gVar.getClass();
        this.dateWeightList = list;
        this.endDate = str;
        this.startDate = str2;
        this.totalAverage = gVar;
    }

    public final List<c> b() {
        return this.dateWeightList;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return s.g(this.dateWeightList, aVar.dateWeightList) && s.g(this.endDate, aVar.endDate) && s.g(this.startDate, aVar.startDate) && s.g(this.totalAverage, aVar.totalAverage);
    }

    public final int hashCode() {
        return this.totalAverage.hashCode() + wr.g.j(wr.g.j(this.dateWeightList.hashCode() * 31, 31, this.endDate), 31, this.startDate);
    }

    public final String toString() {
        return "DailyWeightAverageDTO(dateWeightList=" + this.dateWeightList + ", endDate=" + this.endDate + ", startDate=" + this.startDate + ", totalAverage=" + this.totalAverage + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i14) {
        parcel.getClass();
        Iterator itE = kg.f.e(this.dateWeightList, parcel);
        while (itE.hasNext()) {
            parcel.writeParcelable((Parcelable) itE.next(), i14);
        }
        parcel.writeString(this.endDate);
        parcel.writeString(this.startDate);
        parcel.writeParcelable(this.totalAverage, i14);
    }
}
