package hs2;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import p005kotlin.Metadata;
import v.e0;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lhs2/c;", "Landroid/os/Parcelable;", "", "cardId", "", "cardType", "", "balanceNotificationThreshold", "<init>", "([BLjava/lang/String;F)V", "garminpay-core_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class c implements Parcelable {
    public static final Parcelable.Creator<c> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final byte[] f85441a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f85442b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f85443c;

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<c> {
        @Override // android.os.Parcelable.Creator
        public final c createFromParcel(Parcel parcel) {
            parcel.getClass();
            return new c(parcel.createByteArray(), parcel.readString(), parcel.readFloat());
        }

        @Override // android.os.Parcelable.Creator
        public final c[] newArray(int i14) {
            return new c[i14];
        }
    }

    public c(byte[] bArr, String str, float f14) {
        bArr.getClass();
        str.getClass();
        this.f85441a = bArr;
        this.f85442b = str;
        this.f85443c = f14;
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
        return this.f85441a.equals(cVar.f85441a) && this.f85442b.equals(cVar.f85442b) && Float.compare(this.f85443c, cVar.f85443c) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f85443c) + wr.g.j(Arrays.hashCode(this.f85441a) * 31, 31, this.f85442b);
    }

    public final String toString() {
        return e0.e(this.f85443c, ")", p6.b.i("ExpressCardData(cardId=", Arrays.toString(this.f85441a), ", cardType=", this.f85442b, ", balanceNotificationThreshold="));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i14) {
        parcel.getClass();
        parcel.writeByteArray(this.f85441a);
        parcel.writeString(this.f85442b);
        parcel.writeFloat(this.f85443c);
    }
}
