package com.google.android.gms.common.images;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import i3.e5;
import java.util.Locale;
import org.apache.commons.lang3.StringUtils;
import org.json.JSONException;
import org.json.JSONObject;
import vb.h;

/* JADX INFO: loaded from: classes14.dex */
@SafeParcelable.Class(creator = "WebImageCreator")
public final class WebImage extends AbstractSafeParcelable {
    public static final Parcelable.Creator<WebImage> CREATOR = new zah();

    @SafeParcelable.VersionField(id = 1)
    final int zaa;

    @SafeParcelable.Field(getter = "getUrl", id = 2)
    private final Uri zab;

    @SafeParcelable.Field(getter = "getWidth", id = 3)
    private final int zac;

    @SafeParcelable.Field(getter = "getHeight", id = 4)
    private final int zad;

    /* JADX WARN: Illegal instructions before constructor call */
    @KeepForSdk
    public WebImage(JSONObject jSONObject) {
        Uri uri = Uri.EMPTY;
        if (jSONObject.has("url")) {
            try {
                uri = Uri.parse(jSONObject.getString("url"));
            } catch (JSONException unused) {
            }
        }
        this(uri, jSONObject.optInt("width", 0), jSONObject.optInt("height", 0));
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && (obj instanceof WebImage)) {
            WebImage webImage = (WebImage) obj;
            if (Objects.equal(this.zab, webImage.zab) && this.zac == webImage.zac && this.zad == webImage.zad) {
                return true;
            }
        }
        return false;
    }

    public int getHeight() {
        return this.zad;
    }

    public Uri getUrl() {
        return this.zab;
    }

    public int getWidth() {
        return this.zac;
    }

    public int hashCode() {
        return Objects.hashCode(this.zab, Integer.valueOf(this.zac), Integer.valueOf(this.zad));
    }

    @KeepForSdk
    public JSONObject toJson() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("url", this.zab.toString());
            jSONObject.put("width", this.zac);
            jSONObject.put("height", this.zad);
        } catch (JSONException unused) {
        }
        return jSONObject;
    }

    public String toString() {
        Locale locale = Locale.US;
        int i14 = this.zac;
        int i15 = this.zad;
        String string = this.zab.toString();
        StringBuilder sbJ = e5.j(i14, i15, "Image ", "x", StringUtils.SPACE);
        sbJ.append(string);
        return sbJ.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i14) {
        int i15 = this.zaa;
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 1, i15);
        SafeParcelWriter.writeParcelable(parcel, 2, getUrl(), i14, false);
        SafeParcelWriter.writeInt(parcel, 3, getWidth());
        SafeParcelWriter.writeInt(parcel, 4, getHeight());
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }

    public WebImage(Uri uri) {
        this(uri, 0, 0);
    }

    public WebImage(Uri uri, int i14, int i15) {
        this(1, uri, i14, i15);
        if (uri == null) {
            h.s("url cannot be null");
            throw null;
        }
        if (i14 < 0 || i15 < 0) {
            h.s("width and height must not be negative");
            throw null;
        }
    }

    @SafeParcelable.Constructor
    public WebImage(@SafeParcelable.Param(id = 1) int i14, @SafeParcelable.Param(id = 2) Uri uri, @SafeParcelable.Param(id = 3) int i15, @SafeParcelable.Param(id = 4) int i16) {
        this.zaa = i14;
        this.zab = uri;
        this.zac = i15;
        this.zad = i16;
    }
}
