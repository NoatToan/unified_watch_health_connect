package com.xiaomi.fitness.devicesettings.bluttooth.music.bean;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.xiaomi.fitness.util.SportRecordBundleKey;
import com.xiaomi.smarthome.framework.plugin.rn.utils.MediaStoreUtil;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u0012\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0005\u0018\u0000 '2\u00020\u0001:\u0001'B3\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bB\u0011\b\u0016\u0012\u0006\u0010\f\u001a\u00020\r¢\u0006\u0004\b\n\u0010\u000eJ\u0018\u0010\"\u001a\u00020#2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010$\u001a\u00020\tH\u0016J\b\u0010%\u001a\u00020\tH\u0016J\b\u0010&\u001a\u00020\u0003H\u0016R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0010R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0010R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u001c\u0010\u0017\u001a\u0004\u0018\u00010\u0018X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR\u001a\u0010\u001d\u001a\u00020\u001eX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u001f\"\u0004\b \u0010!¨\u0006("}, d2 = {"Lcom/xiaomi/fitness/devicesettings/bluttooth/music/bean/MusicBean;", "Landroid/os/Parcelable;", "name", "", "artist", "album", SportRecordBundleKey.BUNDLE_PARAM_URI, "Landroid/net/Uri;", "duration", "", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Landroid/net/Uri;I)V", "parcel", "Landroid/os/Parcel;", "(Landroid/os/Parcel;)V", "getName", "()Ljava/lang/String;", "getArtist", "getAlbum", "getUri", "()Landroid/net/Uri;", "getDuration", "()I", "id", "", "getId", "()[B", "setId", "([B)V", "isDownLoadSuccess", "", "()Z", "setDownLoadSuccess", "(Z)V", "writeToParcel", "", "flags", "describeContents", "toString", "CREATOR", "device-settings_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class MusicBean implements Parcelable {

    /* JADX INFO: renamed from: CREATOR, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @Nullable
    private final String album;

    @Nullable
    private final String artist;
    private final int duration;

    @Nullable
    private byte[] id;
    private boolean isDownLoadSuccess;

    @NotNull
    private final String name;

    @NotNull
    private final Uri uri;

    /* JADX INFO: renamed from: com.xiaomi.fitness.devicesettings.bluttooth.music.bean.MusicBean$CREATOR, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J\u001d\u0010\b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0016¢\u0006\u0002\u0010\f¨\u0006\r"}, d2 = {"Lcom/xiaomi/fitness/devicesettings/bluttooth/music/bean/MusicBean$CREATOR;", "Landroid/os/Parcelable$Creator;", "Lcom/xiaomi/fitness/devicesettings/bluttooth/music/bean/MusicBean;", "<init>", "()V", "createFromParcel", "parcel", "Landroid/os/Parcel;", "newArray", "", MediaStoreUtil.MediaInfo.SIZE, "", "(I)[Lcom/xiaomi/fitness/devicesettings/bluttooth/music/bean/MusicBean;", "device-settings_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion implements Parcelable.Creator<MusicBean> {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NotNull
        public MusicBean createFromParcel(@NotNull Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new MusicBean(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NotNull
        public MusicBean[] newArray(int size) {
            return new MusicBean[size];
        }
    }

    public MusicBean(@NotNull String name, @Nullable String str, @Nullable String str2, @NotNull Uri uri, int i) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(uri, "uri");
        this.name = name;
        this.artist = str;
        this.album = str2;
        this.uri = uri;
        this.duration = i;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Nullable
    public final String getAlbum() {
        return this.album;
    }

    @Nullable
    public final String getArtist() {
        return this.artist;
    }

    public final int getDuration() {
        return this.duration;
    }

    @Nullable
    public final byte[] getId() {
        return this.id;
    }

    @NotNull
    public final String getName() {
        return this.name;
    }

    @NotNull
    public final Uri getUri() {
        return this.uri;
    }

    /* JADX INFO: renamed from: isDownLoadSuccess, reason: from getter */
    public final boolean getIsDownLoadSuccess() {
        return this.isDownLoadSuccess;
    }

    public final void setDownLoadSuccess(boolean z) {
        this.isDownLoadSuccess = z;
    }

    public final void setId(@Nullable byte[] bArr) {
        this.id = bArr;
    }

    @NotNull
    public String toString() {
        String string;
        String str = this.name;
        String str2 = this.artist;
        String str3 = this.album;
        Uri uri = this.uri;
        int i = this.duration;
        byte[] bArr = this.id;
        if (bArr != null) {
            string = Arrays.toString(bArr);
            Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        } else {
            string = null;
        }
        return "MusicBean(name='" + str + "', artist=" + str2 + ", album=" + str3 + ", uri='" + uri + "', duration=" + i + ", id=" + string + ", isDownLoadSuccess=" + this.isDownLoadSuccess + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel parcel, int flags) {
        Intrinsics.checkNotNullParameter(parcel, "parcel");
        parcel.writeString(this.name);
        parcel.writeString(this.artist);
        parcel.writeString(this.album);
        parcel.writeParcelable(this.uri, flags);
        parcel.writeInt(this.duration);
        parcel.writeByte(this.isDownLoadSuccess ? (byte) 1 : (byte) 0);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public MusicBean(@NotNull Parcel parcel) {
        Intrinsics.checkNotNullParameter(parcel, "parcel");
        String string = parcel.readString();
        Intrinsics.checkNotNull(string);
        String string2 = parcel.readString();
        String string3 = parcel.readString();
        Parcelable parcelable = parcel.readParcelable(Uri.class.getClassLoader());
        Intrinsics.checkNotNull(parcelable);
        this(string, string2, string3, (Uri) parcelable, parcel.readInt());
        this.isDownLoadSuccess = parcel.readByte() != 0;
    }
}
