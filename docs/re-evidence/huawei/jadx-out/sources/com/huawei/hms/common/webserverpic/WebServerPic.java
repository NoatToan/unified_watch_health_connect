package com.huawei.hms.common.webserverpic;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.huawei.hms.common.internal.Preconditions;
import com.huawei.hms.common.internal.safeparcel.SafeParcelWriter;
import java.util.Locale;

/* JADX INFO: loaded from: classes33.dex */
public class WebServerPic {
    public static final Parcelable.Creator<WebServerPic> CREATOR = new WebServerPicCreator();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Uri f13107a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f13108b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f13109c;

    public WebServerPic(Uri uri, int i, int i2) throws IllegalArgumentException {
        this.f13107a = uri;
        this.f13108b = i;
        this.f13109c = i2;
        if (uri == null) {
            throw new IllegalArgumentException("url is not able to be null");
        }
        if (i < 0 || i2 < 0) {
            throw new IllegalArgumentException("width and height should be positive or 0");
        }
    }

    public final int getHeight() {
        return this.f13109c;
    }

    public final Uri getUrl() {
        return this.f13107a;
    }

    public final int getWidth() {
        return this.f13108b;
    }

    public final String toString() {
        Locale locale = Locale.ENGLISH;
        int i = this.f13108b;
        int i2 = this.f13109c;
        return String.format(locale, "Image %dx%d %s", Integer.valueOf(i), Integer.valueOf(i2), this.f13107a.toString());
    }

    public final void writeToParcel(Parcel parcel, int i) {
        Preconditions.checkNotNull(parcel);
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeParcelable(parcel, 1, getUrl(), i, false);
        SafeParcelWriter.writeInt(parcel, 2, getWidth());
        SafeParcelWriter.writeInt(parcel, 3, getHeight());
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }

    public WebServerPic(Uri uri) throws IllegalArgumentException {
        this(uri, 0, 0);
    }
}
