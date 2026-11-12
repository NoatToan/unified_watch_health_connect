package com.linecorp.linesdk;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes18.dex */
public class LineAccessToken implements Parcelable {
    public static final Parcelable.Creator<LineAccessToken> CREATOR = new a();

    @NonNull
    private final String a;
    private final long b;
    private final long c;

    public static class a implements Parcelable.Creator<LineAccessToken> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final LineAccessToken createFromParcel(Parcel parcel) {
            return new LineAccessToken(parcel, null);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final LineAccessToken[] newArray(int i) {
            return new LineAccessToken[i];
        }
    }

    public /* synthetic */ LineAccessToken(Parcel parcel, a aVar) {
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
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        LineAccessToken lineAccessToken = (LineAccessToken) obj;
        if (this.b == lineAccessToken.b && this.c == lineAccessToken.c) {
            return this.a.equals(lineAccessToken.a);
        }
        return false;
    }

    @NonNull
    public String getAccessToken() {
        return this.a;
    }

    public long getEstimatedExpirationTimeMillis() {
        return getIssuedClientTimeMillis() + getExpiresInMillis();
    }

    public long getExpiresInMillis() {
        return this.b;
    }

    public long getIssuedClientTimeMillis() {
        return this.c;
    }

    public int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        long j = this.b;
        int i = (iHashCode + ((int) (j ^ (j >>> 32)))) * 31;
        long j2 = this.c;
        return i + ((int) (j2 ^ (j2 >>> 32)));
    }

    public String toString() {
        return "LineAccessToken{accessToken='#####', expiresInMillis=" + this.b + ", issuedClientTimeMillis=" + this.c + '}';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
        parcel.writeLong(this.b);
        parcel.writeLong(this.c);
    }

    public LineAccessToken(@NonNull String str, long j, long j2) {
        this.a = str;
        this.b = j;
        this.c = j2;
    }

    private LineAccessToken(@NonNull Parcel parcel) {
        this.a = parcel.readString();
        this.b = parcel.readLong();
        this.c = parcel.readLong();
    }
}
