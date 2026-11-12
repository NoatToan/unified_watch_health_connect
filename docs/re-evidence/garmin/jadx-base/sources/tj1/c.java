package tj1;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.annotations.SerializedName;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Ltj1/c;", "Landroid/os/Parcelable;", "", "contactInfoPrimaryKey", "Ltj1/d;", "errorDetail", "<init>", "(Ljava/lang/Integer;Ltj1/d;)V", "a", "Ljava/lang/Integer;", "getContactInfoPrimaryKey", "()Ljava/lang/Integer;", "b", "Ltj1/d;", "getErrorDetail", "()Ltj1/d;", "gcm-domain-social_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class c implements Parcelable {
    public static final Parcelable.Creator<c> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @SerializedName("contactInfoPk")
    private final Integer contactInfoPrimaryKey;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @SerializedName("errorDetail")
    private final d errorDetail;

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<c> {
        @Override // android.os.Parcelable.Creator
        public final c createFromParcel(Parcel parcel) {
            parcel.getClass();
            return new c(parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() != 0 ? d.CREATOR.createFromParcel(parcel) : null);
        }

        @Override // android.os.Parcelable.Creator
        public final c[] newArray(int i14) {
            return new c[i14];
        }
    }

    public c(Integer num, d dVar) {
        this.contactInfoPrimaryKey = num;
        this.errorDetail = dVar;
    }

    public final boolean b() {
        Integer errorCode;
        Integer errorCode2;
        d dVar = this.errorDetail;
        if (dVar != null && (errorCode2 = dVar.getErrorCode()) != null && errorCode2.intValue() == 2001) {
            return true;
        }
        d dVar2 = this.errorDetail;
        return (dVar2 == null || (errorCode = dVar2.getErrorCode()) == null || errorCode.intValue() != 3001) ? false : true;
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
        return p005kotlin.jvm.internal.s.g(this.contactInfoPrimaryKey, cVar.contactInfoPrimaryKey) && p005kotlin.jvm.internal.s.g(this.errorDetail, cVar.errorDetail);
    }

    public final int hashCode() {
        Integer num = this.contactInfoPrimaryKey;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        d dVar = this.errorDetail;
        return iHashCode + (dVar != null ? dVar.hashCode() : 0);
    }

    public final String toString() {
        return "ContactInfoError(contactInfoPrimaryKey=" + this.contactInfoPrimaryKey + ", errorDetail=" + this.errorDetail + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i14) {
        parcel.getClass();
        Integer num = this.contactInfoPrimaryKey;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            kg.f.k(parcel, 1, num);
        }
        d dVar = this.errorDetail;
        if (dVar == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            dVar.writeToParcel(parcel, i14);
        }
    }
}
