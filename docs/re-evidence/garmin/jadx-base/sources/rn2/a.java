package rn2;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.annotations.SerializedName;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\f\u0010\u000e¨\u0006\u000f"}, d2 = {"Lrn2/a;", "Lpn2/d;", "Lrn2/n;", "commonInformation", "Lrn2/u;", "transitInformation", "<init>", "(Lrn2/n;Lrn2/u;)V", "a", "Lrn2/n;", "getCommonInformation", "()Lrn2/n;", "b", "Lrn2/u;", "()Lrn2/u;", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class a implements pn2.d {
    public static final Parcelable.Creator<a> CREATOR = new C2911a();

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @SerializedName("commonInformation")
    private final n commonInformation;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @SerializedName("transitInformation")
    private final u transitInformation;

    /* JADX INFO: renamed from: rn2.a$a, reason: collision with other inner class name */
    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class C2911a implements Parcelable.Creator<a> {
        @Override // android.os.Parcelable.Creator
        public final a createFromParcel(Parcel parcel) {
            parcel.getClass();
            return new a(n.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : u.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final a[] newArray(int i14) {
            return new a[i14];
        }
    }

    public a(n nVar, u uVar) {
        nVar.getClass();
        this.commonInformation = nVar;
        this.transitInformation = uVar;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final u getTransitInformation() {
        return this.transitInformation;
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
        return p005kotlin.jvm.internal.s.g(this.commonInformation, aVar.commonInformation) && p005kotlin.jvm.internal.s.g(this.transitInformation, aVar.transitInformation);
    }

    public final int hashCode() {
        int iHashCode = this.commonInformation.hashCode() * 31;
        u uVar = this.transitInformation;
        return iHashCode + (uVar == null ? 0 : uVar.hashCode());
    }

    public final String toString() {
        return "FNAdditionalInfoDto(commonInformation=" + this.commonInformation + ", transitInformation=" + this.transitInformation + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i14) {
        parcel.getClass();
        this.commonInformation.writeToParcel(parcel, i14);
        u uVar = this.transitInformation;
        if (uVar == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            uVar.writeToParcel(parcel, i14);
        }
    }
}
