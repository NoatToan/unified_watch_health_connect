package ip1;

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
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\"\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lip1/h;", "Landroid/os/Parcelable;", "", "Lip1/g;", "solarGainDailyDetailDTOList", "<init>", "(Ljava/util/List;)V", "a", "Ljava/util/List;", "b", "()Ljava/util/List;", "gcm-solar-charge_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class h implements Parcelable {
    public static final Parcelable.Creator<h> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @SerializedName("solarGainDailyDetailDTOList")
    private final List<g> solarGainDailyDetailDTOList;

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<h> {
        @Override // android.os.Parcelable.Creator
        public final h createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            parcel.getClass();
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i14 = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(i14);
                int iA = 0;
                while (iA != i14) {
                    iA = kg.f.a(g.CREATOR, parcel, arrayList2, iA, 1);
                }
                arrayList = arrayList2;
            }
            return new h(arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final h[] newArray(int i14) {
            return new h[i14];
        }
    }

    public h(List<g> list) {
        this.solarGainDailyDetailDTOList = list;
    }

    public final List<g> b() {
        return this.solarGainDailyDetailDTOList;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof h) && s.g(this.solarGainDailyDetailDTOList, ((h) obj).solarGainDailyDetailDTOList);
    }

    public final int hashCode() {
        List<g> list = this.solarGainDailyDetailDTOList;
        if (list == null) {
            return 0;
        }
        return list.hashCode();
    }

    public final String toString() {
        return tn.k.h("SolarGainDataDTO(solarGainDailyDetailDTOList=", ")", this.solarGainDailyDetailDTOList);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i14) {
        parcel.getClass();
        List<g> list = this.solarGainDailyDetailDTOList;
        if (list == null) {
            parcel.writeInt(0);
            return;
        }
        Iterator itO = u0.o(parcel, list, 1);
        while (itO.hasNext()) {
            ((g) itO.next()).writeToParcel(parcel, i14);
        }
    }
}
