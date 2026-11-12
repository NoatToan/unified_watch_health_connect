package com.mapbox.maps.extension.compose.annotation;

import android.graphics.Bitmap;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.room.a0;
import ch.qos.logback.core.CoreConstants;
import java.util.Objects;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import p005kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u000f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004B\u000f\b\u0016\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007B\u001b\b\u0002\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\bJ\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012H\u0096\u0002J\b\u0010\u0013\u001a\u00020\u000eH\u0016J\b\u0010\u0014\u001a\u00020\u0003H\u0016J\u0019\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u000eHÖ\u0001R\u0016\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0016\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u001a"}, d2 = {"Lcom/mapbox/maps/extension/compose/annotation/IconImage;", "Landroid/os/Parcelable;", "imageId", "", "(Ljava/lang/String;)V", "bitmap", "Landroid/graphics/Bitmap;", "(Landroid/graphics/Bitmap;)V", "(Ljava/lang/String;Landroid/graphics/Bitmap;)V", "getBitmap$extension_compose_release", "()Landroid/graphics/Bitmap;", "getImageId$extension_compose_release", "()Ljava/lang/String;", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "extension-compose_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final class IconImage implements Parcelable {
    public static final Parcelable.Creator<IconImage> CREATOR = new Creator();
    private final Bitmap bitmap;
    private final String imageId;

    private IconImage(String str, Bitmap bitmap) {
        this.imageId = str;
        this.bitmap = bitmap;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (!(other instanceof IconImage)) {
            return false;
        }
        IconImage iconImage = (IconImage) other;
        return s.g(iconImage.imageId, this.imageId) && s.g(iconImage.bitmap, this.bitmap);
    }

    /* JADX INFO: renamed from: getBitmap$extension_compose_release, reason: from getter */
    public final Bitmap getBitmap() {
        return this.bitmap;
    }

    /* JADX INFO: renamed from: getImageId$extension_compose_release, reason: from getter */
    public final String getImageId() {
        return this.imageId;
    }

    public int hashCode() {
        return Objects.hash(this.imageId, this.bitmap);
    }

    public String toString() {
        StringBuilder sb3 = new StringBuilder("IconImage(");
        String strValueOf = this.imageId;
        if (strValueOf == null) {
            strValueOf = String.valueOf(this.bitmap);
        }
        return a0.m(sb3, strValueOf, CoreConstants.RIGHT_PARENTHESIS_CHAR);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int flags) {
        parcel.getClass();
        parcel.writeString(this.imageId);
        parcel.writeParcelable(this.bitmap, flags);
    }

    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    public static final class Creator implements Parcelable.Creator<IconImage> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final IconImage createFromParcel(Parcel parcel) {
            parcel.getClass();
            return new IconImage(parcel.readString(), (Bitmap) parcel.readParcelable(IconImage.class.getClassLoader()), null);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final IconImage[] newArray(int i14) {
            return new IconImage[i14];
        }
    }

    public /* synthetic */ IconImage(String str, Bitmap bitmap, j jVar) {
        this(str, bitmap);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public IconImage(String str) {
        this(str, null);
        str.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public IconImage(Bitmap bitmap) {
        this(null, bitmap);
        bitmap.getClass();
    }
}
