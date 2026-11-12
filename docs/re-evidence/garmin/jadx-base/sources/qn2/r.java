package qn2;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.annotations.SerializedName;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0013\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0004\b\b\u0010\tR\"\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\"\u0010\u0004\u001a\u00020\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0010\u0010\u000b\u001a\u0004\b\u0011\u0010\r\"\u0004\b\u0012\u0010\u000fR(\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018¨\u0006\u0019"}, d2 = {"Lqn2/r;", "Lpn2/d;", "", "apduListIndex", "apduListId", "", "Lqn2/p;", "apduBlockList", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V", "a", "Ljava/lang/String;", "getApduListIndex", "()Ljava/lang/String;", "setApduListIndex", "(Ljava/lang/String;)V", "b", "getApduListId", "setApduListId", "c", "Ljava/util/List;", "getApduBlockList", "()Ljava/util/List;", "setApduBlockList", "(Ljava/util/List;)V", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class r implements pn2.d {
    public static final Parcelable.Creator<r> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @SerializedName("apduListIndex")
    private String apduListIndex;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @SerializedName("apduListId")
    private String apduListId;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @SerializedName("apduBlockList")
    private List<p> apduBlockList;

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<r> {
        @Override // android.os.Parcelable.Creator
        public final r createFromParcel(Parcel parcel) {
            parcel.getClass();
            String string = parcel.readString();
            String string2 = parcel.readString();
            int i14 = parcel.readInt();
            ArrayList arrayList = new ArrayList(i14);
            int iA = 0;
            while (iA != i14) {
                iA = kg.f.a(p.CREATOR, parcel, arrayList, iA, 1);
            }
            return new r(string, string2, arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final r[] newArray(int i14) {
            return new r[i14];
        }
    }

    public r(String str, String str2, List<p> list) {
        str.getClass();
        str2.getClass();
        list.getClass();
        this.apduListIndex = str;
        this.apduListId = str2;
        this.apduBlockList = list;
        if (str2.length() == 32) {
            return;
        }
        vb.h.x(am.j.h(this.apduListId.length(), "apduListId length(32): "));
        throw null;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r)) {
            return false;
        }
        r rVar = (r) obj;
        return p005kotlin.jvm.internal.s.g(this.apduListIndex, rVar.apduListIndex) && p005kotlin.jvm.internal.s.g(this.apduListId, rVar.apduListId) && p005kotlin.jvm.internal.s.g(this.apduBlockList, rVar.apduBlockList);
    }

    public final int hashCode() {
        return this.apduBlockList.hashCode() + wr.g.j(this.apduListIndex.hashCode() * 31, 31, this.apduListId);
    }

    public final String toString() {
        String str = this.apduListIndex;
        String str2 = this.apduListId;
        return u62.z.c(p6.b.i("FNRApduInfoDto(apduListIndex='", str, "', apduListId='", str2, "', apduBlockList="), this.apduBlockList, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i14) {
        parcel.getClass();
        parcel.writeString(this.apduListIndex);
        parcel.writeString(this.apduListId);
        Iterator itE = kg.f.e(this.apduBlockList, parcel);
        while (itE.hasNext()) {
            ((p) itE.next()).writeToParcel(parcel, i14);
        }
    }
}
