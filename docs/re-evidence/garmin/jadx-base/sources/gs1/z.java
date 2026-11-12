package gs1;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.annotations.SerializedName;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lgs1/z;", "Landroid/os/Parcelable;", "Lgs1/l;", "payload", "<init>", "(Lgs1/l;)V", "a", "Lgs1/l;", "b", "()Lgs1/l;", "model_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class z implements Parcelable {
    public static final Parcelable.Creator<z> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @SerializedName("payload")
    private final l payload;

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<z> {
        @Override // android.os.Parcelable.Creator
        public final z createFromParcel(Parcel parcel) {
            parcel.getClass();
            return new z(l.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final z[] newArray(int i14) {
            return new z[i14];
        }
    }

    public z(l lVar) {
        lVar.getClass();
        this.payload = lVar;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final l getPayload() {
        return this.payload;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof z) && p005kotlin.jvm.internal.s.g(this.payload, ((z) obj).payload);
    }

    public final int hashCode() {
        return this.payload.hashCode();
    }

    public final String toString() {
        return "UserDailySummary(payload=" + this.payload + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i14) {
        parcel.getClass();
        this.payload.writeToParcel(parcel, i14);
    }
}
