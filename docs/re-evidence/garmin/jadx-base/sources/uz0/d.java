package uz0;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.JsonElement;
import com.google.gson.annotations.SerializedName;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\f\u0010\u000e¨\u0006\u000f"}, d2 = {"Luz0/d;", "Landroid/os/Parcelable;", "", "requestKey", "Lcom/google/gson/JsonElement;", "data", "<init>", "(Ljava/lang/Integer;Lcom/google/gson/JsonElement;)V", "a", "Ljava/lang/Integer;", "d", "()Ljava/lang/Integer;", "b", "Lcom/google/gson/JsonElement;", "()Lcom/google/gson/JsonElement;", "gcm-notifications_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class d implements Parcelable {
    public static final Parcelable.Creator<d> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @SerializedName("requestKey")
    private final Integer requestKey;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @SerializedName("data")
    private final JsonElement data;

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<d> {
        @Override // android.os.Parcelable.Creator
        public final d createFromParcel(Parcel parcel) {
            parcel.getClass();
            return new d(parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), (JsonElement) parcel.readValue(d.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final d[] newArray(int i14) {
            return new d[i14];
        }
    }

    public d(Integer num, JsonElement jsonElement) {
        this.requestKey = num;
        this.data = jsonElement;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final JsonElement getData() {
        return this.data;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final Integer getRequestKey() {
        return this.requestKey;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return s.g(this.requestKey, dVar.requestKey) && s.g(this.data, dVar.data);
    }

    public final int hashCode() {
        Integer num = this.requestKey;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        JsonElement jsonElement = this.data;
        return iHashCode + (jsonElement != null ? jsonElement.hashCode() : 0);
    }

    public final String toString() {
        return "InboxRequestNotificationDTO(requestKey=" + this.requestKey + ", data=" + this.data + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i14) {
        parcel.getClass();
        Integer num = this.requestKey;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            kg.f.k(parcel, 1, num);
        }
        parcel.writeValue(this.data);
    }
}
