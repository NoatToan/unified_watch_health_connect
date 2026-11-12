package oc0;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.annotations.SerializedName;
import i3.e5;
import kg.f;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;
import wr.g;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0011\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u001a\u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010\n\u001a\u0004\b\u000e\u0010\fR\u001a\u0010\u0005\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010\n\u001a\u0004\b\u0010\u0010\fR\u001a\u0010\u0006\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010\n\u001a\u0004\b\u0012\u0010\f¨\u0006\u0013"}, d2 = {"Loc0/b;", "Landroid/os/Parcelable;", "", "highResImage", "largeImage", "mediumImage", "smallImage", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "a", "Ljava/lang/String;", "getHighResImage", "()Ljava/lang/String;", "b", "getLargeImage", "c", "getMediumImage", "d", "getSmallImage", "gcm-domain-device_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class b implements Parcelable {
    public static final Parcelable.Creator<b> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @SerializedName("highResImage")
    private final String highResImage;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @SerializedName("largeImage")
    private final String largeImage;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @SerializedName("mediumImage")
    private final String mediumImage;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @SerializedName("smallImage")
    private final String smallImage;

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<b> {
        @Override // android.os.Parcelable.Creator
        public final b createFromParcel(Parcel parcel) {
            parcel.getClass();
            return new b(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final b[] newArray(int i14) {
            return new b[i14];
        }
    }

    public b(String str, String str2, String str3, String str4) {
        f.p(str, str2, str3, str4);
        this.highResImage = str;
        this.largeImage = str2;
        this.mediumImage = str3;
        this.smallImage = str4;
    }

    public final String b() {
        if (this.highResImage.length() > 0) {
            return this.highResImage;
        }
        if (this.largeImage.length() > 0) {
            return this.largeImage;
        }
        if (this.mediumImage.length() > 0) {
            return this.mediumImage;
        }
        if (this.smallImage.length() > 0) {
            return this.smallImage;
        }
        return null;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return s.g(this.highResImage, bVar.highResImage) && s.g(this.largeImage, bVar.largeImage) && s.g(this.mediumImage, bVar.mediumImage) && s.g(this.smallImage, bVar.smallImage);
    }

    public final int hashCode() {
        return this.smallImage.hashCode() + g.j(g.j(this.highResImage.hashCode() * 31, 31, this.largeImage), 31, this.mediumImage);
    }

    public final String toString() {
        String str = this.highResImage;
        String str2 = this.largeImage;
        return e5.h(p6.b.i("WpcImage(highResImage=", str, ", largeImage=", str2, ", mediumImage="), this.mediumImage, ", smallImage=", this.smallImage, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i14) {
        parcel.getClass();
        parcel.writeString(this.highResImage);
        parcel.writeString(this.largeImage);
        parcel.writeString(this.mediumImage);
        parcel.writeString(this.smallImage);
    }
}
