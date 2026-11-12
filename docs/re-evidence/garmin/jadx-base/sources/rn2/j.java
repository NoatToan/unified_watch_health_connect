package rn2;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.annotations.SerializedName;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B#\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0002¢\u0006\u0004\b\u0007\u0010\bR \u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR \u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\n\u001a\u0004\b\r\u0010\f¨\u0006\u000e"}, d2 = {"Lrn2/j;", "Lpn2/d;", "", "Lrn2/i;", "cardList", "Lrn2/o;", "deleteCardList", "<init>", "(Ljava/util/List;Ljava/util/List;)V", "a", "Ljava/util/List;", "b", "()Ljava/util/List;", "d", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class j implements pn2.d {
    public static final Parcelable.Creator<j> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @SerializedName("cardList")
    private final List<i> cardList;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @SerializedName("deleteCardList")
    private final List<o> deleteCardList;

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<j> {
        @Override // android.os.Parcelable.Creator
        public final j createFromParcel(Parcel parcel) {
            parcel.getClass();
            int i14 = parcel.readInt();
            ArrayList arrayList = new ArrayList(i14);
            int iA = 0;
            int iA2 = 0;
            while (iA2 != i14) {
                iA2 = kg.f.a(i.CREATOR, parcel, arrayList, iA2, 1);
            }
            int i15 = parcel.readInt();
            ArrayList arrayList2 = new ArrayList(i15);
            while (iA != i15) {
                iA = kg.f.a(o.CREATOR, parcel, arrayList2, iA, 1);
            }
            return new j(arrayList, arrayList2);
        }

        @Override // android.os.Parcelable.Creator
        public final j[] newArray(int i14) {
            return new j[i14];
        }
    }

    public j(List<i> list, List<o> list2) {
        list.getClass();
        list2.getClass();
        this.cardList = list;
        this.deleteCardList = list2;
    }

    public final List<i> b() {
        return this.cardList;
    }

    public final List<o> d() {
        return this.deleteCardList;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j)) {
            return false;
        }
        j jVar = (j) obj;
        return p005kotlin.jvm.internal.s.g(this.cardList, jVar.cardList) && p005kotlin.jvm.internal.s.g(this.deleteCardList, jVar.deleteCardList);
    }

    public final int hashCode() {
        return this.deleteCardList.hashCode() + (this.cardList.hashCode() * 31);
    }

    public final String toString() {
        return c22.t.f("FNCardListResponsePayloadDto(cardList=", ", deleteCardList=", ")", this.cardList, this.deleteCardList);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i14) {
        parcel.getClass();
        Iterator itE = kg.f.e(this.cardList, parcel);
        while (itE.hasNext()) {
            ((i) itE.next()).writeToParcel(parcel, i14);
        }
        Iterator itE2 = kg.f.e(this.deleteCardList, parcel);
        while (itE2.hasNext()) {
            ((o) itE2.next()).writeToParcel(parcel, i14);
        }
    }
}
