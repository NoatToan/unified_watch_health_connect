package ip;

import am.x0;
import android.os.Parcel;
import android.os.Parcelable;
import com.garmin.android.apps.connectmobile.activities.PrivacyType;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lip/a;", "Landroid/os/Parcelable;", "Lam/x0;", "activityType", "Lcom/garmin/android/apps/connectmobile/activities/PrivacyType;", "privacy", "<init>", "(Lam/x0;Lcom/garmin/android/apps/connectmobile/activities/PrivacyType;)V", "gcm-domain-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class a implements Parcelable {
    public static final Parcelable.Creator<a> CREATOR = new C1808a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final x0 f94639a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final PrivacyType f94640b;

    /* JADX INFO: renamed from: ip.a$a, reason: collision with other inner class name */
    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class C1808a implements Parcelable.Creator<a> {
        @Override // android.os.Parcelable.Creator
        public final a createFromParcel(Parcel parcel) {
            parcel.getClass();
            return new a(x0.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : PrivacyType.valueOf(parcel.readString()));
        }

        @Override // android.os.Parcelable.Creator
        public final a[] newArray(int i14) {
            return new a[i14];
        }
    }

    public a(x0 x0Var, PrivacyType privacyType) {
        x0Var.getClass();
        this.f94639a = x0Var;
        this.f94640b = privacyType;
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
        return this.f94639a == aVar.f94639a && this.f94640b == aVar.f94640b;
    }

    public final int hashCode() {
        int iHashCode = this.f94639a.hashCode() * 31;
        PrivacyType privacyType = this.f94640b;
        return iHashCode + (privacyType == null ? 0 : privacyType.hashCode());
    }

    public final String toString() {
        return "ActivityPrivacyLevel(activityType=" + this.f94639a + ", privacy=" + this.f94640b + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i14) {
        parcel.getClass();
        this.f94639a.writeToParcel(parcel, i14);
        PrivacyType privacyType = this.f94640b;
        if (privacyType == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(privacyType.name());
        }
    }

    public /* synthetic */ a(x0 x0Var, PrivacyType privacyType, int i14, p005kotlin.jvm.internal.j jVar) {
        this(x0Var, (i14 & 2) != 0 ? null : privacyType);
    }
}
