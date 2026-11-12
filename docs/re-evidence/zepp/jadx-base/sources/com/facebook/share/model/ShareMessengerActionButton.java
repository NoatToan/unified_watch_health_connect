package com.facebook.share.model;

import android.os.Parcel;
import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@Deprecated
public abstract class ShareMessengerActionButton implements ShareModel {
    private final String a;

    public static abstract class Builder<M extends ShareMessengerActionButton, B extends Builder> implements ShareModelBuilder<M, B> {
        private String a;

        public B setTitle(@Nullable String str) {
            this.a = str;
            return this;
        }

        @Override // com.facebook.share.model.ShareModelBuilder
        public B readFrom(M m) {
            return m == null ? this : (B) setTitle(m.getTitle());
        }
    }

    public ShareMessengerActionButton(Builder builder) {
        this.a = builder.a;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String getTitle() {
        return this.a;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
    }

    public ShareMessengerActionButton(Parcel parcel) {
        this.a = parcel.readString();
    }
}
