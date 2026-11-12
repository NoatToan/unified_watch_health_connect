package com.linecorp.linesdk;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes18.dex */
public class LineProfile implements Parcelable {
    public static final Parcelable.Creator<LineProfile> CREATOR = new a();

    @NonNull
    private final String a;

    @NonNull
    private final String b;

    @Nullable
    private final Uri c;

    @Nullable
    private final String d;

    public static class a implements Parcelable.Creator<LineProfile> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final LineProfile createFromParcel(Parcel parcel) {
            return new LineProfile(parcel, null);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final LineProfile[] newArray(int i) {
            return new LineProfile[i];
        }
    }

    public /* synthetic */ LineProfile(Parcel parcel, a aVar) {
        this(parcel);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            LineProfile lineProfile = (LineProfile) obj;
            if (!this.a.equals(lineProfile.a) || !this.b.equals(lineProfile.b)) {
                return false;
            }
            Uri uri = this.c;
            if (uri == null ? lineProfile.c != null : !uri.equals(lineProfile.c)) {
                return false;
            }
            String str = this.d;
            String str2 = lineProfile.d;
            if (str != null) {
                return str.equals(str2);
            }
            if (str2 == null) {
                return true;
            }
        }
        return false;
    }

    @NonNull
    public String getDisplayName() {
        return this.b;
    }

    @Nullable
    public Uri getPictureUrl() {
        return this.c;
    }

    @Nullable
    public String getStatusMessage() {
        return this.d;
    }

    @NonNull
    public String getUserId() {
        return this.a;
    }

    public int hashCode() {
        int iHashCode = ((this.a.hashCode() * 31) + this.b.hashCode()) * 31;
        Uri uri = this.c;
        int iHashCode2 = (iHashCode + (uri != null ? uri.hashCode() : 0)) * 31;
        String str = this.d;
        return iHashCode2 + (str != null ? str.hashCode() : 0);
    }

    public String toString() {
        return "LineProfile{displayName='" + this.b + "', userId='" + this.a + "', pictureUrl='" + this.c + "', statusMessage='" + this.d + "'}";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
        parcel.writeString(this.b);
        parcel.writeParcelable(this.c, i);
        parcel.writeString(this.d);
    }

    public LineProfile(@NonNull String str, @NonNull String str2, @Nullable Uri uri, @Nullable String str3) {
        this.a = str;
        this.b = str2;
        this.c = uri;
        this.d = str3;
    }

    private LineProfile(@NonNull Parcel parcel) {
        this.a = parcel.readString();
        this.b = parcel.readString();
        this.c = (Uri) parcel.readParcelable(Uri.class.getClassLoader());
        this.d = parcel.readString();
    }
}
