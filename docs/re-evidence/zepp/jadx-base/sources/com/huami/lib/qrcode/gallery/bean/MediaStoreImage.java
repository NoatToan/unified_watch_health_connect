package com.huami.lib.qrcode.gallery.bean;

import android.net.Uri;
import androidx.annotation.RestrictTo;
import java.util.Date;
import java.util.Objects;

/* JADX INFO: loaded from: classes10.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY})
public class MediaStoreImage {
    public Uri contentUri;
    public Date dateAdded;
    public String displayName;
    public long id;

    public MediaStoreImage(long j, String str, Date date, Uri uri) {
        this.id = j;
        this.displayName = str;
        this.dateAdded = date;
        this.contentUri = uri;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        MediaStoreImage mediaStoreImage = (MediaStoreImage) obj;
        return this.id == mediaStoreImage.id && this.displayName.equals(mediaStoreImage.displayName) && this.dateAdded.equals(mediaStoreImage.dateAdded) && this.contentUri.equals(mediaStoreImage.contentUri);
    }

    public int hashCode() {
        return Objects.hash(Long.valueOf(this.id), this.displayName, this.dateAdded, this.contentUri);
    }
}
