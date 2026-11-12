package com.garmin.android.apps.connectmobile.userprofile.model;

import android.os.Parcel;
import android.os.Parcelable;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import com.google.gson.annotations.SerializedName;
import i3.e5;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0016\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0004¢\u0006\u0004\b\b\u0010\tR\"\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\"\u0010\u0005\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\"\u0010\u0006\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0015\u0010\u0010\u001a\u0004\b\u0016\u0010\u0012\"\u0004\b\u0017\u0010\u0014R\"\u0010\u0007\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0011\u0010\u0010\u001a\u0004\b\u0018\u0010\u0012\"\u0004\b\u0019\u0010\u0014¨\u0006\u001a"}, d2 = {"Lcom/garmin/android/apps/connectmobile/userprofile/model/e;", "Landroid/os/Parcelable;", "", TtmlNode.ATTR_ID, "", "image", "uuid", "previewImageMobile", "<init>", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "a", "I", "b", "()I", "setId", "(I)V", "Ljava/lang/String;", "d", "()Ljava/lang/String;", "h", "(Ljava/lang/String;)V", "c", "g", "setUuid", "f", IntegerTokenConverter.CONVERTER_KEY, "gcm-domain-social_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class e implements Parcelable {
    public static final Parcelable.Creator<e> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @SerializedName(TtmlNode.ATTR_ID)
    private int id;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @SerializedName("image")
    private String image;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @SerializedName("uuid")
    private String uuid;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @SerializedName("previewImageMobile")
    private String previewImageMobile;

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<e> {
        @Override // android.os.Parcelable.Creator
        public final e createFromParcel(Parcel parcel) {
            parcel.getClass();
            return new e(parcel.readInt(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final e[] newArray(int i14) {
            return new e[i14];
        }
    }

    public e(int i14, String str, String str2, String str3) {
        com.airbnb.lottie.animation.keyframe.a.y(str, str2, str3);
        this.id = i14;
        this.image = str;
        this.uuid = str2;
        this.previewImageMobile = str3;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final int getId() {
        return this.id;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final String getImage() {
        return this.image;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return this.id == eVar.id && s.g(this.image, eVar.image) && s.g(this.uuid, eVar.uuid) && s.g(this.previewImageMobile, eVar.previewImageMobile);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final String getPreviewImageMobile() {
        return this.previewImageMobile;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final String getUuid() {
        return this.uuid;
    }

    public final void h(String str) {
        this.image = str;
    }

    public final int hashCode() {
        return this.previewImageMobile.hashCode() + wr.g.j(wr.g.j(Integer.hashCode(this.id) * 31, 31, this.image), 31, this.uuid);
    }

    public final void i(String str) {
        this.previewImageMobile = str;
    }

    public final String toString() {
        int i14 = this.id;
        String str = this.image;
        return e5.h(wr.g.r(i14, "FrameDTO(id=", ", image=", str, ", uuid="), this.uuid, ", previewImageMobile=", this.previewImageMobile, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i14) {
        parcel.getClass();
        parcel.writeInt(this.id);
        parcel.writeString(this.image);
        parcel.writeString(this.uuid);
        parcel.writeString(this.previewImageMobile);
    }
}
