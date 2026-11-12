package fo2;

import android.os.Parcel;
import android.os.Parcelable;
import com.garmin.feature.garminpay.providers.gpay.snowball.CurrencyValue;
import com.google.gson.annotations.SerializedName;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\nR\u001a\u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\b\u001a\u0004\b\u000b\u0010\n¨\u0006\f"}, d2 = {"Lfo2/i;", "Landroid/os/Parcelable;", "Lcom/garmin/feature/garminpay/providers/gpay/snowball/CurrencyValue;", "totalCredit", "totalCost", "<init>", "(Lcom/garmin/feature/garminpay/providers/gpay/snowball/CurrencyValue;Lcom/garmin/feature/garminpay/providers/gpay/snowball/CurrencyValue;)V", "a", "Lcom/garmin/feature/garminpay/providers/gpay/snowball/CurrencyValue;", "d", "()Lcom/garmin/feature/garminpay/providers/gpay/snowball/CurrencyValue;", "b", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class i implements Parcelable {
    public static final Parcelable.Creator<i> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @SerializedName("totalCredit")
    private final CurrencyValue totalCredit;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @SerializedName("totalCost")
    private final CurrencyValue totalCost;

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<i> {
        @Override // android.os.Parcelable.Creator
        public final i createFromParcel(Parcel parcel) {
            parcel.getClass();
            return new i((CurrencyValue) parcel.readSerializable(), (CurrencyValue) parcel.readSerializable());
        }

        @Override // android.os.Parcelable.Creator
        public final i[] newArray(int i14) {
            return new i[i14];
        }
    }

    public i(CurrencyValue currencyValue, CurrencyValue currencyValue2) {
        currencyValue.getClass();
        currencyValue2.getClass();
        this.totalCredit = currencyValue;
        this.totalCost = currencyValue2;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final CurrencyValue getTotalCost() {
        return this.totalCost;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final CurrencyValue getTotalCredit() {
        return this.totalCredit;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        return p005kotlin.jvm.internal.s.g(this.totalCredit, iVar.totalCredit) && p005kotlin.jvm.internal.s.g(this.totalCost, iVar.totalCost);
    }

    public final int hashCode() {
        return this.totalCost.hashCode() + (this.totalCredit.hashCode() * 31);
    }

    public final String toString() {
        return "Fee(totalCredit=" + this.totalCredit + ", totalCost=" + this.totalCost + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i14) {
        parcel.getClass();
        parcel.writeSerializable(this.totalCredit);
        parcel.writeSerializable(this.totalCost);
    }
}
