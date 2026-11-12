package com.garmin.android.apps.connectmobile.workouts.data.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.exoplayer2.util.MimeTypes;
import com.google.gson.annotations.SerializedName;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\f\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\nR$\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\t\u0010\b\u001a\u0004\b\u000b\u0010\n\"\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lcom/garmin/android/apps/connectmobile/workouts/data/model/d0;", "Landroid/os/Parcelable;", "", "thumbnail", MimeTypes.BASE_TYPE_VIDEO, "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "a", "Ljava/lang/String;", "b", "()Ljava/lang/String;", "d", "setVideo", "(Ljava/lang/String;)V", "gcm-workouts_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class d0 implements Parcelable {
    public static final Parcelable.Creator<d0> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @SerializedName("thumbnail")
    private final String thumbnail;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @SerializedName(MimeTypes.BASE_TYPE_VIDEO)
    private String video;

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<d0> {
        @Override // android.os.Parcelable.Creator
        public final d0 createFromParcel(Parcel parcel) {
            parcel.getClass();
            return new d0(parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final d0[] newArray(int i14) {
            return new d0[i14];
        }
    }

    public /* synthetic */ d0(String str, String str2, int i14, p005kotlin.jvm.internal.j jVar) {
        this((i14 & 1) != 0 ? null : str, (i14 & 2) != 0 ? null : str2);
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getThumbnail() {
        return this.thumbnail;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final String getVideo() {
        return this.video;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d0)) {
            return false;
        }
        d0 d0Var = (d0) obj;
        return p005kotlin.jvm.internal.s.g(this.thumbnail, d0Var.thumbnail) && p005kotlin.jvm.internal.s.g(this.video, d0Var.video);
    }

    public final int hashCode() {
        String str = this.thumbnail;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.video;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        return v.e0.g("VideoDTO(thumbnail=", this.thumbnail, ", video=", this.video, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i14) {
        parcel.getClass();
        parcel.writeString(this.thumbnail);
        parcel.writeString(this.video);
    }

    public d0(String str, String str2) {
        this.thumbnail = str;
        this.video = str2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public d0() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }
}
