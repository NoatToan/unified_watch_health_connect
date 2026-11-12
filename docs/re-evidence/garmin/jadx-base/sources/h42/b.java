package h42;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.annotations.SerializedName;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import lc.u0;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import p005kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bR*\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR$\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Lh42/b;", "Landroid/os/Parcelable;", "", "Lh42/c;", "forecast", "Lh42/d;", "historical", "<init>", "(Ljava/util/List;Lh42/d;)V", "a", "Ljava/util/List;", "b", "()Ljava/util/List;", "setForecast", "(Ljava/util/List;)V", "Lh42/d;", "d", "()Lh42/d;", "setHistorical", "(Lh42/d;)V", "gcm-domain-training_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class b implements Parcelable {
    public static final Parcelable.Creator<b> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @SerializedName("forecast")
    private List<c> forecast;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @SerializedName("historical")
    private d historical;

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<b> {
        @Override // android.os.Parcelable.Creator
        public final b createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            parcel.getClass();
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i14 = parcel.readInt();
                arrayList = new ArrayList(i14);
                int iA = 0;
                while (iA != i14) {
                    iA = kg.f.a(c.CREATOR, parcel, arrayList, iA, 1);
                }
            }
            return new b(arrayList, parcel.readInt() != 0 ? d.CREATOR.createFromParcel(parcel) : null);
        }

        @Override // android.os.Parcelable.Creator
        public final b[] newArray(int i14) {
            return new b[i14];
        }
    }

    public /* synthetic */ b(List list, d dVar, int i14, j jVar) {
        this((i14 & 1) != 0 ? null : list, (i14 & 2) != 0 ? null : dVar);
    }

    public final List<c> b() {
        return this.forecast;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final d getHistorical() {
        return this.historical;
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
        return s.g(this.forecast, bVar.forecast) && s.g(this.historical, bVar.historical);
    }

    public final int hashCode() {
        List<c> list = this.forecast;
        int iHashCode = (list == null ? 0 : list.hashCode()) * 31;
        d dVar = this.historical;
        return iHashCode + (dVar != null ? dVar.hashCode() : 0);
    }

    public final String toString() {
        return "RaceDayWeatherDTO(forecast=" + this.forecast + ", historical=" + this.historical + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i14) {
        parcel.getClass();
        List<c> list = this.forecast;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            Iterator itO = u0.o(parcel, list, 1);
            while (itO.hasNext()) {
                ((c) itO.next()).writeToParcel(parcel, i14);
            }
        }
        d dVar = this.historical;
        if (dVar == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            dVar.writeToParcel(parcel, i14);
        }
    }

    public b(List<c> list, d dVar) {
        this.forecast = list;
        this.historical = dVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public b() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }
}
