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

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0087\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004¢\u0006\u0004\b\u0007\u0010\bR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\"\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\r\u0010\u000f¨\u0006\u0010"}, d2 = {"Lep2/c;", "Landroid/os/Parcelable;", "Lcom/garmin/feature/garminpay/providers/gpay/model/Links;", "links", "", "Lep2/b;", "supportedFitPayCardTypeDTOS", "<init>", "(Lcom/garmin/feature/garminpay/providers/gpay/model/Links;Ljava/util/List;)V", "a", "Lcom/garmin/feature/garminpay/providers/gpay/model/Links;", "getLinks", "()Lcom/garmin/feature/garminpay/providers/gpay/model/Links;", "b", "Ljava/util/List;", "()Ljava/util/List;", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class c implements Parcelable {
    public static final Parcelable.Creator<c> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @SerializedName("_links")
    private final Links links;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @SerializedName("supportedCardTypes")
    private final List<b> supportedFitPayCardTypeDTOS;

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<c> {
        @Override // android.os.Parcelable.Creator
        public final c createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            parcel.getClass();
            Links links = (Links) parcel.readSerializable();
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i14 = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(i14);
                int iA = 0;
                while (iA != i14) {
                    iA = kg.f.a(b.CREATOR, parcel, arrayList2, iA, 1);
                }
                arrayList = arrayList2;
            }
            return new c(links, arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final c[] newArray(int i14) {
            return new c[i14];
        }
    }

    public c(Links links, List<b> list) {
        links.getClass();
        this.links = links;
        this.supportedFitPayCardTypeDTOS = list;
    }

    public final List<b> b() {
        return this.supportedFitPayCardTypeDTOS;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return s.g(this.links, cVar.links) && s.g(this.supportedFitPayCardTypeDTOS, cVar.supportedFitPayCardTypeDTOS);
    }

    public final int hashCode() {
        int iHashCode = this.links.f51142a.hashCode() * 31;
        List<b> list = this.supportedFitPayCardTypeDTOS;
        return iHashCode + (list == null ? 0 : list.hashCode());
    }

    public final String toString() {
        return "FitPayCardTypesCollectionDTO(links=" + this.links + ", supportedFitPayCardTypeDTOS=" + this.supportedFitPayCardTypeDTOS + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i14) {
        parcel.getClass();
        parcel.writeSerializable(this.links);
        List<b> list = this.supportedFitPayCardTypeDTOS;
        if (list == null) {
            parcel.writeInt(0);
            return;
        }
        Iterator itO = u0.o(parcel, list, 1);
        while (itO.hasNext()) {
            ((b) itO.next()).writeToParcel(parcel, i14);
        }
    }

    public /* synthetic */ c(Links links, List list, int i14, p005kotlin.jvm.internal.j jVar) {
        this(links, (i14 & 2) != 0 ? null : list);
    }
}
