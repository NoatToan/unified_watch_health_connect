package oc0;

import android.os.Parcel;
import android.os.Parcelable;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.google.gson.annotations.SerializedName;
import com.nimbusds.jose.jwk.JWKParameterNames;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0016\b\u0087\b\u0018\u00002\u00020\u0001BM\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\n\u0010\u000bR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010\r\u001a\u0004\b\u0010\u0010\u000fR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010\r\u001a\u0004\b\u0012\u0010\u000fR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010\r\u001a\u0004\b\u0013\u0010\u000fR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0014\u0010\r\u001a\u0004\b\u0015\u0010\u000fR\u001c\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0015\u0010\r\u001a\u0004\b\u0016\u0010\u000fR\u001c\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0016\u0010\r\u001a\u0004\b\u0017\u0010\u000f¨\u0006\u0018"}, d2 = {"Loc0/a;", "Landroid/os/Parcelable;", "Loc0/b;", "defaultWatchFaceImage", "defaultWatchFaceBlankImage", "sideProfileImage", "tutorialImage", "option1Image", "option2Image", "option3Image", "<init>", "(Loc0/b;Loc0/b;Loc0/b;Loc0/b;Loc0/b;Loc0/b;Loc0/b;)V", "a", "Loc0/b;", "d", "()Loc0/b;", "b", "c", IntegerTokenConverter.CONVERTER_KEY, "getTutorialImage", JWKParameterNames.RSA_EXPONENT, "f", "g", "h", "gcm-domain-device_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class a implements Parcelable {
    public static final Parcelable.Creator<a> CREATOR = new C2491a();

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @SerializedName("defaultWatchFaceImage")
    private final b defaultWatchFaceImage;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @SerializedName("defaultWatchFaceBlankImage")
    private final b defaultWatchFaceBlankImage;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @SerializedName("sideProfileImage")
    private final b sideProfileImage;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @SerializedName("cableImage")
    private final b tutorialImage;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @SerializedName("option1Image")
    private final b option1Image;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    @SerializedName("option2Image")
    private final b option2Image;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @SerializedName("option3Image")
    private final b option3Image;

    /* JADX INFO: renamed from: oc0.a$a, reason: collision with other inner class name */
    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class C2491a implements Parcelable.Creator<a> {
        @Override // android.os.Parcelable.Creator
        public final a createFromParcel(Parcel parcel) {
            parcel.getClass();
            return new a(parcel.readInt() == 0 ? null : b.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : b.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : b.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : b.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : b.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : b.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? b.CREATOR.createFromParcel(parcel) : null);
        }

        @Override // android.os.Parcelable.Creator
        public final a[] newArray(int i14) {
            return new a[i14];
        }
    }

    public a(b bVar, b bVar2, b bVar3, b bVar4, b bVar5, b bVar6, b bVar7) {
        this.defaultWatchFaceImage = bVar;
        this.defaultWatchFaceBlankImage = bVar2;
        this.sideProfileImage = bVar3;
        this.tutorialImage = bVar4;
        this.option1Image = bVar5;
        this.option2Image = bVar6;
        this.option3Image = bVar7;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final b getDefaultWatchFaceBlankImage() {
        return this.defaultWatchFaceBlankImage;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final b getDefaultWatchFaceImage() {
        return this.defaultWatchFaceImage;
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
        return s.g(this.defaultWatchFaceImage, aVar.defaultWatchFaceImage) && s.g(this.defaultWatchFaceBlankImage, aVar.defaultWatchFaceBlankImage) && s.g(this.sideProfileImage, aVar.sideProfileImage) && s.g(this.tutorialImage, aVar.tutorialImage) && s.g(this.option1Image, aVar.option1Image) && s.g(this.option2Image, aVar.option2Image) && s.g(this.option3Image, aVar.option3Image);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final b getOption1Image() {
        return this.option1Image;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final b getOption2Image() {
        return this.option2Image;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final b getOption3Image() {
        return this.option3Image;
    }

    public final int hashCode() {
        b bVar = this.defaultWatchFaceImage;
        int iHashCode = (bVar == null ? 0 : bVar.hashCode()) * 31;
        b bVar2 = this.defaultWatchFaceBlankImage;
        int iHashCode2 = (iHashCode + (bVar2 == null ? 0 : bVar2.hashCode())) * 31;
        b bVar3 = this.sideProfileImage;
        int iHashCode3 = (iHashCode2 + (bVar3 == null ? 0 : bVar3.hashCode())) * 31;
        b bVar4 = this.tutorialImage;
        int iHashCode4 = (iHashCode3 + (bVar4 == null ? 0 : bVar4.hashCode())) * 31;
        b bVar5 = this.option1Image;
        int iHashCode5 = (iHashCode4 + (bVar5 == null ? 0 : bVar5.hashCode())) * 31;
        b bVar6 = this.option2Image;
        int iHashCode6 = (iHashCode5 + (bVar6 == null ? 0 : bVar6.hashCode())) * 31;
        b bVar7 = this.option3Image;
        return iHashCode6 + (bVar7 != null ? bVar7.hashCode() : 0);
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final b getSideProfileImage() {
        return this.sideProfileImage;
    }

    public final String toString() {
        return "DeviceSkuImages(defaultWatchFaceImage=" + this.defaultWatchFaceImage + ", defaultWatchFaceBlankImage=" + this.defaultWatchFaceBlankImage + ", sideProfileImage=" + this.sideProfileImage + ", tutorialImage=" + this.tutorialImage + ", option1Image=" + this.option1Image + ", option2Image=" + this.option2Image + ", option3Image=" + this.option3Image + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i14) {
        parcel.getClass();
        b bVar = this.defaultWatchFaceImage;
        if (bVar == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            bVar.writeToParcel(parcel, i14);
        }
        b bVar2 = this.defaultWatchFaceBlankImage;
        if (bVar2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            bVar2.writeToParcel(parcel, i14);
        }
        b bVar3 = this.sideProfileImage;
        if (bVar3 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            bVar3.writeToParcel(parcel, i14);
        }
        b bVar4 = this.tutorialImage;
        if (bVar4 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            bVar4.writeToParcel(parcel, i14);
        }
        b bVar5 = this.option1Image;
        if (bVar5 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            bVar5.writeToParcel(parcel, i14);
        }
        b bVar6 = this.option2Image;
        if (bVar6 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            bVar6.writeToParcel(parcel, i14);
        }
        b bVar7 = this.option3Image;
        if (bVar7 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            bVar7.writeToParcel(parcel, i14);
        }
    }
}
