package androidx.media3.extractor.metadata.flac;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.media3.common.MediaMetadata;
import androidx.media3.common.Metadata;
import androidx.media3.common.util.Util;
import com.google.common.base.Ascii;

/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public class VorbisComment implements Metadata.Entry {
    public static final Parcelable.Creator<VorbisComment> CREATOR = new Parcelable.Creator<VorbisComment>() { // from class: androidx.media3.extractor.metadata.flac.VorbisComment.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public VorbisComment createFromParcel(Parcel parcel) {
            return new VorbisComment(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public VorbisComment[] newArray(int i) {
            return new VorbisComment[i];
        }
    };
    public final String key;
    public final String value;

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public VorbisComment(String str, String str2) {
        this.key = Ascii.toUpperCase(str);
        this.value = str2;
    }

    public VorbisComment(Parcel parcel) {
        this.key = (String) Util.castNonNull(parcel.readString());
        this.value = (String) Util.castNonNull(parcel.readString());
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:25:0x0048  */
    @Override // androidx.media3.common.Metadata.Entry
    public void populateMediaMetadata(MediaMetadata.Builder builder) {
        byte b2;
        String str = this.key;
        str.hashCode();
        switch (str) {
            case "ALBUM":
                b2 = 0;
                break;
            case "TITLE":
                b2 = 1;
                break;
            case "DESCRIPTION":
                b2 = 2;
                break;
            case "ALBUMARTIST":
                b2 = 3;
                break;
            case "ARTIST":
                b2 = 4;
                break;
            default:
                b2 = -1;
                break;
        }
        if (b2 == 0) {
            builder.setAlbumTitle(this.value);
            return;
        }
        if (b2 == 1) {
            builder.setTitle(this.value);
            return;
        }
        if (b2 == 2) {
            builder.setDescription(this.value);
        } else if (b2 == 3) {
            builder.setAlbumArtist(this.value);
        } else {
            if (b2 != 4) {
                return;
            }
            builder.setArtist(this.value);
        }
    }

    public String toString() {
        return "VC: " + this.key + "=" + this.value;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        VorbisComment vorbisComment = (VorbisComment) obj;
        return this.key.equals(vorbisComment.key) && this.value.equals(vorbisComment.value);
    }

    public int hashCode() {
        return ((this.key.hashCode() + 527) * 31) + this.value.hashCode();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.key);
        parcel.writeString(this.value);
    }
}
