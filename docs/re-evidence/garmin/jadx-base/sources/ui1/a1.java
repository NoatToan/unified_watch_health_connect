package ui1;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.annotations.SerializedName;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lui1/a1;", "Landroid/os/Parcelable;", "", "useMessengerForActivation", "<init>", "(Z)V", "a", "Z", "b", "()Z", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class a1 implements Parcelable {
    public static final Parcelable.Creator<a1> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @SerializedName("useMessengerForActivation")
    private final boolean useMessengerForActivation;

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<a1> {
        @Override // android.os.Parcelable.Creator
        public final a1 createFromParcel(Parcel parcel) {
            parcel.getClass();
            return new a1(parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        public final a1[] newArray(int i14) {
            return new a1[i14];
        }
    }

    public a1(boolean z14) {
        this.useMessengerForActivation = z14;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final boolean getUseMessengerForActivation() {
        return this.useMessengerForActivation;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof a1) && this.useMessengerForActivation == ((a1) obj).useMessengerForActivation;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.useMessengerForActivation);
    }

    public final String toString() {
        return com.airbnb.lottie.animation.keyframe.a.g("UseMessengerForActivationDTO(useMessengerForActivation=", ")", this.useMessengerForActivation);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i14) {
        parcel.getClass();
        parcel.writeInt(this.useMessengerForActivation ? 1 : 0);
    }
}
