package com.garmin.android.apps.connectmobile.userprofile.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import com.google.gson.annotations.SerializedName;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0018\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0004¢\u0006\u0004\b\t\u0010\nR\"\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\"\u0010\u0005\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\"\u0010\u0007\u001a\u00020\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR\"\u0010\b\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u001c\u0010\u0012\u001a\u0004\b\u001c\u0010\u0013\"\u0004\b\u001d\u0010\u0015¨\u0006\u001e"}, d2 = {"Lcom/garmin/android/apps/connectmobile/userprofile/model/a;", "Landroid/os/Parcelable;", "", TtmlNode.ATTR_ID, "", "image", "", "isGolf", "uuid", "<init>", "(JLjava/lang/String;ZLjava/lang/String;)V", "a", "J", "getId", "()J", "setId", "(J)V", "b", "Ljava/lang/String;", "()Ljava/lang/String;", "g", "(Ljava/lang/String;)V", "c", "Z", "f", "()Z", "setGolf", "(Z)V", "d", "setUuid", "gcm-domain-social_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class a implements Parcelable {
    public static final Parcelable.Creator<a> CREATOR = new C0903a();

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @SerializedName(TtmlNode.ATTR_ID)
    private long id;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @SerializedName("image")
    private String image;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @SerializedName("isGolf")
    private boolean isGolf;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @SerializedName("uuid")
    private String uuid;

    /* JADX INFO: renamed from: com.garmin.android.apps.connectmobile.userprofile.model.a$a, reason: collision with other inner class name */
    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class C0903a implements Parcelable.Creator<a> {
        @Override // android.os.Parcelable.Creator
        public final a createFromParcel(Parcel parcel) {
            parcel.getClass();
            return new a(parcel.readLong(), parcel.readString(), parcel.readInt() != 0, parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final a[] newArray(int i14) {
            return new a[i14];
        }
    }

    public a(long j8, String str, boolean z14, String str2) {
        str.getClass();
        str2.getClass();
        this.id = j8;
        this.image = str;
        this.isGolf = z14;
        this.uuid = str2;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getImage() {
        return this.image;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final String getUuid() {
        return this.uuid;
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
        return this.id == aVar.id && s.g(this.image, aVar.image) && this.isGolf == aVar.isGolf && s.g(this.uuid, aVar.uuid);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final boolean getIsGolf() {
        return this.isGolf;
    }

    public final void g(String str) {
        this.image = str;
    }

    public final int hashCode() {
        return this.uuid.hashCode() + q6.f.g(wr.g.j(Long.hashCode(this.id) * 31, 31, this.image), 31, this.isGolf);
    }

    public final String toString() {
        long j8 = this.id;
        String str = this.image;
        boolean z14 = this.isGolf;
        String str2 = this.uuid;
        StringBuilder sbK = com.airbnb.lottie.animation.keyframe.a.k(j8, "AvatarDTO(id=", ", image=", str);
        sbK.append(", isGolf=");
        sbK.append(z14);
        sbK.append(", uuid=");
        sbK.append(str2);
        sbK.append(")");
        return sbK.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i14) {
        parcel.getClass();
        parcel.writeLong(this.id);
        parcel.writeString(this.image);
        parcel.writeInt(this.isGolf ? 1 : 0);
        parcel.writeString(this.uuid);
    }
}
