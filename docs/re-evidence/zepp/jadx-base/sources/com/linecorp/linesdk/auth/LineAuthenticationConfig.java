package com.linecorp.linesdk.auth;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.linecorp.linesdk.BuildConfig;

/* JADX INFO: loaded from: classes18.dex */
public class LineAuthenticationConfig implements Parcelable {
    public static final Parcelable.Creator<LineAuthenticationConfig> CREATOR = new a();
    private static int f = 1;
    private static int g = 2;

    @NonNull
    private final String a;

    @NonNull
    private final Uri b;

    @NonNull
    private final Uri c;
    private final boolean d;
    private final boolean e;

    public static class Builder {

        @NonNull
        private final String a;

        @NonNull
        private Uri b;

        @NonNull
        private Uri c;
        private boolean d;
        private boolean e;

        public Builder(@NonNull String str) {
            if (TextUtils.isEmpty(str)) {
                throw new IllegalArgumentException("channelId is empty.");
            }
            this.a = str;
            this.b = Uri.parse(BuildConfig.AUTH_SERVER_BASE_URI);
            this.c = Uri.parse(BuildConfig.WEB_LOGIN_PAGE_URL);
        }

        @NonNull
        public LineAuthenticationConfig build() {
            return new LineAuthenticationConfig(this, (a) null);
        }

        @NonNull
        public Builder disableEncryptorPreparation() {
            this.e = true;
            return this;
        }

        @NonNull
        public Builder disableLineAppAuthentication() {
            this.d = true;
            return this;
        }

        @NonNull
        public Builder f(@Nullable Uri uri) {
            if (uri == null) {
                uri = Uri.parse(BuildConfig.AUTH_SERVER_BASE_URI);
            }
            this.b = uri;
            return this;
        }

        @NonNull
        public Builder g(@Nullable Uri uri) {
            if (uri == null) {
                uri = Uri.parse(BuildConfig.WEB_LOGIN_PAGE_URL);
            }
            this.c = uri;
            return this;
        }
    }

    public static class a implements Parcelable.Creator<LineAuthenticationConfig> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final LineAuthenticationConfig createFromParcel(Parcel parcel) {
            return new LineAuthenticationConfig(parcel, (a) null);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final LineAuthenticationConfig[] newArray(int i) {
            return new LineAuthenticationConfig[i];
        }
    }

    public /* synthetic */ LineAuthenticationConfig(Parcel parcel, a aVar) {
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
        LineAuthenticationConfig lineAuthenticationConfig = (LineAuthenticationConfig) obj;
        if (this.d == lineAuthenticationConfig.d && this.e == lineAuthenticationConfig.e && this.a.equals(lineAuthenticationConfig.a) && this.b.equals(lineAuthenticationConfig.b)) {
            return this.c.equals(lineAuthenticationConfig.c);
        }
        return false;
    }

    @NonNull
    public String getChannelId() {
        return this.a;
    }

    @NonNull
    public Uri getEndPointBaseUrl() {
        return this.b;
    }

    @NonNull
    public Uri getWebLoginPageUrl() {
        return this.c;
    }

    public int hashCode() {
        return (((((((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode()) * 31) + (this.d ? 1 : 0)) * 31) + (this.e ? 1 : 0);
    }

    public boolean isEncryptorPreparationDisabled() {
        return this.e;
    }

    public boolean isLineAppAuthenticationDisabled() {
        return this.d;
    }

    public String toString() {
        return "LineAuthenticationConfig{channelId=" + this.a + ", endPointBaseUrl=" + this.b + ", webLoginPageUrl=" + this.c + ", isLineAppAuthenticationDisabled=" + this.d + ", isEncryptorPreparationDisabled=" + this.e + '}';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
        parcel.writeParcelable(this.b, i);
        parcel.writeParcelable(this.c, i);
        parcel.writeInt((this.d ? f : 0) | 0 | (this.e ? g : 0));
    }

    public /* synthetic */ LineAuthenticationConfig(Builder builder, a aVar) {
        this(builder);
    }

    private LineAuthenticationConfig(@NonNull Builder builder) {
        this.a = builder.a;
        this.b = builder.b;
        this.c = builder.c;
        this.d = builder.d;
        this.e = builder.e;
    }

    private LineAuthenticationConfig(@NonNull Parcel parcel) {
        this.a = parcel.readString();
        this.b = (Uri) parcel.readParcelable(Uri.class.getClassLoader());
        this.c = (Uri) parcel.readParcelable(Uri.class.getClassLoader());
        int i = parcel.readInt();
        this.d = (f & i) > 0;
        this.e = (i & g) > 0;
    }
}
