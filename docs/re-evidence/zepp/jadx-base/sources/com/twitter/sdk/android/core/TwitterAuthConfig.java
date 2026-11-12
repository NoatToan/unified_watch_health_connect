package com.twitter.sdk.android.core;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes18.dex */
public class TwitterAuthConfig implements Parcelable {
    public static final Parcelable.Creator<TwitterAuthConfig> CREATOR = new a();
    public static final int DEFAULT_AUTH_REQUEST_CODE = 140;
    private final String a;
    private final String b;

    public static class a implements Parcelable.Creator<TwitterAuthConfig> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public TwitterAuthConfig createFromParcel(Parcel parcel) {
            return new TwitterAuthConfig(parcel, (a) null);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public TwitterAuthConfig[] newArray(int i) {
            return new TwitterAuthConfig[i];
        }
    }

    public /* synthetic */ TwitterAuthConfig(Parcel parcel, a aVar) {
        this(parcel);
    }

    public static String a(String str) {
        if (str != null) {
            return str.trim();
        }
        return null;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String getConsumerKey() {
        return this.a;
    }

    public String getConsumerSecret() {
        return this.b;
    }

    public int getRequestCode() {
        return 140;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
        parcel.writeString(this.b);
    }

    public TwitterAuthConfig(String str, String str2) {
        if (str == null || str2 == null) {
            throw new IllegalArgumentException("TwitterAuthConfig must not be created with null consumer key or secret.");
        }
        this.a = a(str);
        this.b = a(str2);
    }

    private TwitterAuthConfig(Parcel parcel) {
        this.a = parcel.readString();
        this.b = parcel.readString();
    }
}
