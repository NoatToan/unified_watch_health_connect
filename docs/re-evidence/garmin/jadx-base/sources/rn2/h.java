package rn2;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.annotations.SerializedName;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p005kotlin.Metadata;
import u62.z;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\r\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0004\b\b\u0010\tR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u001a\u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u000b\u001a\u0004\b\u000f\u0010\rR \u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u000e\u0010\u0012¨\u0006\u0013"}, d2 = {"Lrn2/h;", "Lpn2/d;", "", "apduListIndex", "apduListId", "", "Lrn2/f;", "apduBlockList", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V", "a", "Ljava/lang/String;", "f", "()Ljava/lang/String;", "b", "d", "c", "Ljava/util/List;", "()Ljava/util/List;", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class h implements pn2.d {
    public static final Parcelable.Creator<h> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @SerializedName("apduListIndex")
    private final String apduListIndex;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @SerializedName("apduListId")
    private final String apduListId;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @SerializedName("apduBlockList")
    private final List<f> apduBlockList;

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<h> {
        @Override // android.os.Parcelable.Creator
        public final h createFromParcel(Parcel parcel) {
            parcel.getClass();
            String string = parcel.readString();
            String string2 = parcel.readString();
            int i14 = parcel.readInt();
            ArrayList arrayList = new ArrayList(i14);
            int iA = 0;
            while (iA != i14) {
                iA = kg.f.a(f.CREATOR, parcel, arrayList, iA, 1);
            }
            return new h(string, string2, arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final h[] newArray(int i14) {
            return new h[i14];
        }
    }

    public h(String str, String str2, List<f> list) {
        str.getClass();
        str2.getClass();
        list.getClass();
        this.apduListIndex = str;
        this.apduListId = str2;
        this.apduBlockList = list;
    }

    public final List<f> b() {
        return this.apduBlockList;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final String getApduListId() {
        return this.apduListId;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        return p005kotlin.jvm.internal.s.g(this.apduListIndex, hVar.apduListIndex) && p005kotlin.jvm.internal.s.g(this.apduListId, hVar.apduListId) && p005kotlin.jvm.internal.s.g(this.apduBlockList, hVar.apduBlockList);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final String getApduListIndex() {
        return this.apduListIndex;
    }

    public final int hashCode() {
        return this.apduBlockList.hashCode() + wr.g.j(this.apduListIndex.hashCode() * 31, 31, this.apduListId);
    }

    public final String toString() {
        String str = this.apduListIndex;
        String str2 = this.apduListId;
        return z.c(p6.b.i("FNCApduInfoDto(apduListIndex='", str, "', apduListId='", str2, "', apduBlockList="), this.apduBlockList, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i14) {
        parcel.getClass();
        parcel.writeString(this.apduListIndex);
        parcel.writeString(this.apduListId);
        Iterator itE = kg.f.e(this.apduBlockList, parcel);
        while (itE.hasNext()) {
            ((f) itE.next()).writeToParcel(parcel, i14);
        }
    }
}
