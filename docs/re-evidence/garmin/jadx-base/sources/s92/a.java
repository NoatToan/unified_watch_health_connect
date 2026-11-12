package s92;

import android.os.Parcel;
import android.os.Parcelable;
import ch.qos.logback.core.joran.action.Action;
import com.google.gson.annotations.SerializedName;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000f\b\u0081\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\"\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\"\u0010\u0005\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u000e\u0010\u0010\"\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"Ls92/a;", "Landroid/os/Parcelable;", "", Action.KEY_ATTRIBUTE, "", "value", "<init>", "(Ljava/lang/String;Z)V", "a", "Ljava/lang/String;", "getKey", "()Ljava/lang/String;", "setKey", "(Ljava/lang/String;)V", "b", "Z", "()Z", "d", "(Z)V", "garmin-consent_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class a implements Parcelable {
    public static final Parcelable.Creator<a> CREATOR = new C2988a();

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @SerializedName(Action.KEY_ATTRIBUTE)
    private String key;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @SerializedName("value")
    private boolean value;

    /* JADX INFO: renamed from: s92.a$a, reason: collision with other inner class name */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class C2988a implements Parcelable.Creator<a> {
        @Override // android.os.Parcelable.Creator
        public final a createFromParcel(Parcel parcel) {
            parcel.getClass();
            return new a(parcel.readString(), parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        public final a[] newArray(int i14) {
            return new a[i14];
        }
    }

    public /* synthetic */ a(String str, boolean z14, int i14, p005kotlin.jvm.internal.j jVar) {
        this((i14 & 1) != 0 ? "account.deviceSync" : str, (i14 & 2) != 0 ? false : z14);
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final boolean getValue() {
        return this.value;
    }

    public final void d(boolean z14) {
        this.value = z14;
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
        return s.g(this.key, aVar.key) && this.value == aVar.value;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.value) + (this.key.hashCode() * 31);
    }

    public final String toString() {
        return n23.j.g("AccountDeviceSyncDTO(key=", this.key, ", value=", this.value, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i14) {
        parcel.getClass();
        parcel.writeString(this.key);
        parcel.writeInt(this.value ? 1 : 0);
    }

    public a(String str, boolean z14) {
        str.getClass();
        this.key = str;
        this.value = z14;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public a() {
        this(null, false, 3, 0 == true ? 1 : 0);
    }
}
