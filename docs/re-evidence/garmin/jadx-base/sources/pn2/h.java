package pn2;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.annotations.SerializedName;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\nR\u001a\u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\b\u001a\u0004\b\u000b\u0010\n¨\u0006\f"}, d2 = {"Lpn2/h;", "Landroid/os/Parcelable;", "Lpn2/s;", "daily", "monthly", "<init>", "(Lpn2/s;Lpn2/s;)V", "a", "Lpn2/s;", "b", "()Lpn2/s;", "d", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class h implements Parcelable {
    public static final Parcelable.Creator<h> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @SerializedName("daily")
    private final s daily;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @SerializedName("monthly")
    private final s monthly;

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<h> {
        @Override // android.os.Parcelable.Creator
        public final h createFromParcel(Parcel parcel) {
            parcel.getClass();
            Parcelable.Creator<s> creator = s.CREATOR;
            return new h(creator.createFromParcel(parcel), creator.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final h[] newArray(int i14) {
            return new h[i14];
        }
    }

    public h(s sVar, s sVar2) {
        sVar.getClass();
        sVar2.getClass();
        this.daily = sVar;
        this.monthly = sVar2;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final s getDaily() {
        return this.daily;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final s getMonthly() {
        return this.monthly;
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
        return p005kotlin.jvm.internal.s.g(this.daily, hVar.daily) && p005kotlin.jvm.internal.s.g(this.monthly, hVar.monthly);
    }

    public final int hashCode() {
        return this.monthly.hashCode() + (this.daily.hashCode() * 31);
    }

    public final String toString() {
        return "FNMaintenanceTime(daily=" + this.daily + ", monthly=" + this.monthly + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i14) {
        parcel.getClass();
        this.daily.writeToParcel(parcel, i14);
        this.monthly.writeToParcel(parcel, i14);
    }
}
