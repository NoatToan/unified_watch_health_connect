package cy2;

import android.os.Parcel;
import android.os.Parcelable;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B;\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lcy2/f;", "Landroid/os/Parcelable;", "", "cancelButtonResId", "", "cancelButtonDescription", "toolbarTitleColor", "toolbarTitle", "Lcy2/b;", "exitAlertConfig", "<init>", "(ILjava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Lcy2/b;)V", "subscriptions-purchase_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class f implements Parcelable {
    public static final Parcelable.Creator<f> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f56829a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f56830b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Integer f56831c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f56832d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final b f56833e;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<f> {
        @Override // android.os.Parcelable.Creator
        public final f createFromParcel(Parcel parcel) {
            Integer numValueOf;
            b bVar;
            parcel.getClass();
            int i14 = parcel.readInt();
            String string = parcel.readString();
            if (parcel.readInt() == 0) {
                numValueOf = null;
                bVar = null;
            } else {
                numValueOf = Integer.valueOf(parcel.readInt());
                bVar = null;
            }
            return new f(i14, string, numValueOf, parcel.readString(), parcel.readInt() == 0 ? bVar : b.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final f[] newArray(int i14) {
            return new f[i14];
        }
    }

    public /* synthetic */ f(int i14, String str, Integer num, String str2, b bVar, int i15, p005kotlin.jvm.internal.j jVar) {
        this(i14, str, (i15 & 4) != 0 ? -16777216 : num, (i15 & 8) != 0 ? null : str2, (i15 & 16) != 0 ? null : bVar);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return this.f56829a == fVar.f56829a && s.g(this.f56830b, fVar.f56830b) && s.g(this.f56831c, fVar.f56831c) && s.g(this.f56832d, fVar.f56832d) && s.g(this.f56833e, fVar.f56833e);
    }

    public final int hashCode() {
        int iJ = wr.g.j(Integer.hashCode(this.f56829a) * 31, 31, this.f56830b);
        Integer num = this.f56831c;
        int iHashCode = (iJ + (num == null ? 0 : num.hashCode())) * 31;
        String str = this.f56832d;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        b bVar = this.f56833e;
        return iHashCode2 + (bVar != null ? bVar.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbR = wr.g.r(this.f56829a, "InAppPurchaseToolbarConfig(cancelButtonResId=", ", cancelButtonDescription=", this.f56830b, ", toolbarTitleColor=");
        p6.b.l(this.f56831c, ", toolbarTitle=", this.f56832d, ", exitAlertConfig=", sbR);
        sbR.append(this.f56833e);
        sbR.append(")");
        return sbR.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i14) {
        parcel.getClass();
        parcel.writeInt(this.f56829a);
        parcel.writeString(this.f56830b);
        Integer num = this.f56831c;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            kg.f.k(parcel, 1, num);
        }
        parcel.writeString(this.f56832d);
        b bVar = this.f56833e;
        if (bVar == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            bVar.writeToParcel(parcel, i14);
        }
    }

    public f(int i14, String str, Integer num, String str2, b bVar) {
        str.getClass();
        this.f56829a = i14;
        this.f56830b = str;
        this.f56831c = num;
        this.f56832d = str2;
        this.f56833e = bVar;
    }
}
