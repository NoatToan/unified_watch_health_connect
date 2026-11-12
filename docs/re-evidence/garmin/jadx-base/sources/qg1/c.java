package qg1;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.annotations.SerializedName;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lqg1/c;", "Landroid/os/Parcelable;", "", "userHasBackup", "<init>", "(Z)V", "a", "Z", "b", "()Z", "gcm-device-settings_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class c implements Parcelable {
    public static final Parcelable.Creator<c> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @SerializedName("userHasCompleteBackup")
    private final boolean userHasBackup;

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<c> {
        @Override // android.os.Parcelable.Creator
        public final c createFromParcel(Parcel parcel) {
            parcel.getClass();
            return new c(parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        public final c[] newArray(int i14) {
            return new c[i14];
        }
    }

    public /* synthetic */ c(boolean z14, int i14, j jVar) {
        this((i14 & 1) != 0 ? false : z14);
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final boolean getUserHasBackup() {
        return this.userHasBackup;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof c) && this.userHasBackup == ((c) obj).userHasBackup;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.userHasBackup);
    }

    public final String toString() {
        return com.airbnb.lottie.animation.keyframe.a.g("DeviceBackupSummaryDTO(userHasBackup=", ")", this.userHasBackup);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i14) {
        parcel.getClass();
        parcel.writeInt(this.userHasBackup ? 1 : 0);
    }

    public c(boolean z14) {
        this.userHasBackup = z14;
    }

    public c() {
        this(false, 1, null);
    }
}
