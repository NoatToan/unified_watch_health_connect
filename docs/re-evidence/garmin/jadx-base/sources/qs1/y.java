package qs1;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.annotations.SerializedName;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lqs1/y;", "Landroid/os/Parcelable;", "", "translatedText", "<init>", "(Ljava/lang/String;)V", "a", "Ljava/lang/String;", "b", "()Ljava/lang/String;", "gcm-trails_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class y implements Parcelable {
    public static final Parcelable.Creator<y> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @SerializedName("translatedText")
    private final String translatedText;

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<y> {
        @Override // android.os.Parcelable.Creator
        public final y createFromParcel(Parcel parcel) {
            parcel.getClass();
            return new y(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final y[] newArray(int i14) {
            return new y[i14];
        }
    }

    public y(String str) {
        str.getClass();
        this.translatedText = str;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getTranslatedText() {
        return this.translatedText;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof y) && p005kotlin.jvm.internal.s.g(this.translatedText, ((y) obj).translatedText);
    }

    public final int hashCode() {
        return this.translatedText.hashCode();
    }

    public final String toString() {
        return am.j.m("TranslatedCommentWrapperDTO(translatedText=", this.translatedText, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i14) {
        parcel.getClass();
        parcel.writeString(this.translatedText);
    }
}
