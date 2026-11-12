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
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0016\b\u0087\b\u0018\u00002\u00020\u0001B-\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0005¢\u0006\u0004\b\t\u0010\nR(\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\"\u0010\u0006\u001a\u00020\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\r\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\"\u0010\u0007\u001a\u00020\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0016\u0010\u0011\u001a\u0004\b\u0017\u0010\u0013\"\u0004\b\u0018\u0010\u0015R\"\u0010\b\u001a\u00020\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0019\u0010\u0011\u001a\u0004\b\u0019\u0010\u0013\"\u0004\b\u001a\u0010\u0015¨\u0006\u001b"}, d2 = {"Ll42/e;", "Landroid/os/Parcelable;", "", "Ll42/f;", "weeklyWeightSummaryList", "Ll42/g;", "previousWeekAverageDTO", "nextWeekAverageDTO", "weightAverageDto", "<init>", "(Ljava/util/List;Ll42/g;Ll42/g;Ll42/g;)V", "a", "Ljava/util/List;", "b", "()Ljava/util/List;", "setWeeklyWeightSummaryList", "(Ljava/util/List;)V", "Ll42/g;", "getPreviousWeekAverageDTO", "()Ll42/g;", "setPreviousWeekAverageDTO", "(Ll42/g;)V", "c", "getNextWeekAverageDTO", "setNextWeekAverageDTO", "d", "setWeightAverageDto", "data_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class e implements Parcelable {
    public static final Parcelable.Creator<e> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @SerializedName("weeklyWeightSummaries")
    private List<f> weeklyWeightSummaryList;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @SerializedName("previousWeekAverageDTO")
    private g previousWeekAverageDTO;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @SerializedName("nextWeekAverageDTO")
    private g nextWeekAverageDTO;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @SerializedName("weightAverageDTO")
    private g weightAverageDto;

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<e> {
        @Override // android.os.Parcelable.Creator
        public final e createFromParcel(Parcel parcel) {
            parcel.getClass();
            int i14 = parcel.readInt();
            ArrayList arrayList = new ArrayList(i14);
            int iA = 0;
            while (iA != i14) {
                iA = kg.f.a(f.CREATOR, parcel, arrayList, iA, 1);
            }
            return new e(arrayList, (g) parcel.readParcelable(e.class.getClassLoader()), (g) parcel.readParcelable(e.class.getClassLoader()), (g) parcel.readParcelable(e.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final e[] newArray(int i14) {
            return new e[i14];
        }
    }

    public e(List<f> list, g gVar, g gVar2, g gVar3) {
        list.getClass();
        gVar.getClass();
        gVar2.getClass();
        gVar3.getClass();
        this.weeklyWeightSummaryList = list;
        this.previousWeekAverageDTO = gVar;
        this.nextWeekAverageDTO = gVar2;
        this.weightAverageDto = gVar3;
    }

    public final List<f> b() {
        return this.weeklyWeightSummaryList;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final g getWeightAverageDto() {
        return this.weightAverageDto;
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
        return s.g(this.weeklyWeightSummaryList, eVar.weeklyWeightSummaryList) && s.g(this.previousWeekAverageDTO, eVar.previousWeekAverageDTO) && s.g(this.nextWeekAverageDTO, eVar.nextWeekAverageDTO) && s.g(this.weightAverageDto, eVar.weightAverageDto);
    }

    public final int hashCode() {
        return this.weightAverageDto.hashCode() + ((this.nextWeekAverageDTO.hashCode() + ((this.previousWeekAverageDTO.hashCode() + (this.weeklyWeightSummaryList.hashCode() * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "WeeklyWeightReportDTO(weeklyWeightSummaryList=" + this.weeklyWeightSummaryList + ", previousWeekAverageDTO=" + this.previousWeekAverageDTO + ", nextWeekAverageDTO=" + this.nextWeekAverageDTO + ", weightAverageDto=" + this.weightAverageDto + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i14) {
        parcel.getClass();
        Iterator itE = kg.f.e(this.weeklyWeightSummaryList, parcel);
        while (itE.hasNext()) {
            ((f) itE.next()).writeToParcel(parcel, i14);
        }
        parcel.writeParcelable(this.previousWeekAverageDTO, i14);
        parcel.writeParcelable(this.nextWeekAverageDTO, i14);
        parcel.writeParcelable(this.weightAverageDto, i14);
    }
}
