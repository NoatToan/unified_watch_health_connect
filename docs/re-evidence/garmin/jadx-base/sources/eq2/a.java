package eq2;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.annotations.SerializedName;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;
import wr.g;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u001a\u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u000b\u001a\u0004\b\u000e\u0010\rR\u001a\u0010\u0005\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u000b\u001a\u0004\b\u0010\u0010\rR\u001a\u0010\u0007\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, d2 = {"Leq2/a;", "Landroid/os/Parcelable;", "", "applicationId", "action", "payload", "Leq2/b;", "data", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Leq2/b;)V", "a", "Ljava/lang/String;", "getApplicationId", "()Ljava/lang/String;", "b", "c", "getPayload", "d", "Leq2/b;", "()Leq2/b;", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class a implements Parcelable {
    public static final Parcelable.Creator<a> CREATOR = new C1383a();

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @SerializedName("applicationId")
    private final String applicationId;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @SerializedName("action")
    private final String action;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @SerializedName("payload")
    private final String payload;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @SerializedName("data")
    private final b data;

    /* JADX INFO: renamed from: eq2.a$a, reason: collision with other inner class name */
    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class C1383a implements Parcelable.Creator<a> {
        @Override // android.os.Parcelable.Creator
        public final a createFromParcel(Parcel parcel) {
            parcel.getClass();
            return new a(parcel.readString(), parcel.readString(), parcel.readString(), b.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final a[] newArray(int i14) {
            return new a[i14];
        }
    }

    public a(String str, String str2, String str3, b bVar) {
        str.getClass();
        str2.getClass();
        str3.getClass();
        bVar.getClass();
        this.applicationId = str;
        this.action = str2;
        this.payload = str3;
        this.data = bVar;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getAction() {
        return this.action;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final b getData() {
        return this.data;
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
        return s.g(this.applicationId, aVar.applicationId) && s.g(this.action, aVar.action) && s.g(this.payload, aVar.payload) && s.g(this.data, aVar.data);
    }

    public final int hashCode() {
        return this.data.hashCode() + g.j(g.j(this.applicationId.hashCode() * 31, 31, this.action), 31, this.payload);
    }

    public final String toString() {
        String str = this.applicationId;
        String str2 = this.action;
        String str3 = this.payload;
        b bVar = this.data;
        StringBuilder sbI = p6.b.i("A2WContext(applicationId=", str, ", action=", str2, ", payload=");
        sbI.append(str3);
        sbI.append(", data=");
        sbI.append(bVar);
        sbI.append(")");
        return sbI.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i14) {
        parcel.getClass();
        parcel.writeString(this.applicationId);
        parcel.writeString(this.action);
        parcel.writeString(this.payload);
        this.data.writeToParcel(parcel, i14);
    }
}
