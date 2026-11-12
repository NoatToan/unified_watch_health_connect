package ep2;

import android.os.Parcel;
import android.os.Parcelable;
import com.garmin.feature.garminpay.providers.gpay.model.Links;
import com.google.gson.annotations.SerializedName;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import lc.u0;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;
import u62.z;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u000f\b\u0087\b\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0010\b\u0002\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006¢\u0006\u0004\b\t\u0010\nR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000eR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\"\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u000f\u0010\u0015¨\u0006\u0016"}, d2 = {"Lep2/e;", "Landroid/os/Parcelable;", "Lcom/garmin/feature/garminpay/providers/gpay/model/Links;", "links", "", "totalResults", "", "Lep2/d;", "fitPayCredentialDTOS", "<init>", "(Lcom/garmin/feature/garminpay/providers/gpay/model/Links;Ljava/lang/Long;Ljava/util/List;)V", "a", "Lcom/garmin/feature/garminpay/providers/gpay/model/Links;", "getLinks", "()Lcom/garmin/feature/garminpay/providers/gpay/model/Links;", "b", "Ljava/lang/Long;", "getTotalResults", "()Ljava/lang/Long;", "c", "Ljava/util/List;", "()Ljava/util/List;", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class e implements Parcelable {
    public static final Parcelable.Creator<e> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @SerializedName("_links")
    private final Links links;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @SerializedName("totalResults")
    private final Long totalResults;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @SerializedName("results")
    private final List<d> fitPayCredentialDTOS;

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<e> {
        @Override // android.os.Parcelable.Creator
        public final e createFromParcel(Parcel parcel) {
            parcel.getClass();
            Links links = (Links) parcel.readSerializable();
            ArrayList arrayList = null;
            Long lValueOf = parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong());
            if (parcel.readInt() != 0) {
                int i14 = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(i14);
                int iA = 0;
                while (iA != i14) {
                    iA = kg.f.a(d.CREATOR, parcel, arrayList2, iA, 1);
                }
                arrayList = arrayList2;
            }
            return new e(links, lValueOf, arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final e[] newArray(int i14) {
            return new e[i14];
        }
    }

    public /* synthetic */ e(Links links, Long l14, List list, int i14, p005kotlin.jvm.internal.j jVar) {
        this(links, (i14 & 2) != 0 ? null : l14, (i14 & 4) != 0 ? null : list);
    }

    public final List<d> b() {
        return this.fitPayCredentialDTOS;
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
        return s.g(this.links, eVar.links) && s.g(this.totalResults, eVar.totalResults) && s.g(this.fitPayCredentialDTOS, eVar.fitPayCredentialDTOS);
    }

    public final int hashCode() {
        int iHashCode = this.links.f51142a.hashCode() * 31;
        Long l14 = this.totalResults;
        int iHashCode2 = (iHashCode + (l14 == null ? 0 : l14.hashCode())) * 31;
        List<d> list = this.fitPayCredentialDTOS;
        return iHashCode2 + (list != null ? list.hashCode() : 0);
    }

    public final String toString() {
        Links links = this.links;
        Long l14 = this.totalResults;
        List<d> list = this.fitPayCredentialDTOS;
        StringBuilder sb3 = new StringBuilder("FitPayCredentialsCollectionDTO(links=");
        sb3.append(links);
        sb3.append(", totalResults=");
        sb3.append(l14);
        sb3.append(", fitPayCredentialDTOS=");
        return z.c(sb3, list, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i14) {
        parcel.getClass();
        parcel.writeSerializable(this.links);
        Long l14 = this.totalResults;
        if (l14 == null) {
            parcel.writeInt(0);
        } else {
            sn.a.n(parcel, 1, l14);
        }
        List<d> list = this.fitPayCredentialDTOS;
        if (list == null) {
            parcel.writeInt(0);
            return;
        }
        Iterator itO = u0.o(parcel, list, 1);
        while (itO.hasNext()) {
            ((d) itO.next()).writeToParcel(parcel, i14);
        }
    }

    public e(Links links, Long l14, List<d> list) {
        links.getClass();
        this.links = links;
        this.totalResults = l14;
        this.fitPayCredentialDTOS = list;
    }
}
