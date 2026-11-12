package com.facebook.gamingservices.model;

import android.os.Parcel;
import androidx.annotation.Nullable;
import com.facebook.share.model.ShareModel;
import com.facebook.share.model.ShareModelBuilder;

/* JADX INFO: loaded from: classes2.dex */
public class ContextCreateContent implements ShareModel {

    @Nullable
    private final String a;

    public static class Builder implements ShareModelBuilder<ContextCreateContent, Builder> {

        @Nullable
        private String a;

        public Builder b(Parcel parcel) {
            return readFrom((ContextCreateContent) parcel.readParcelable(ContextCreateContent.class.getClassLoader()));
        }

        public Builder setSuggestedPlayerID(@Nullable String str) {
            this.a = str;
            return this;
        }

        @Override // com.facebook.share.ShareBuilder
        public ContextCreateContent build() {
            return new ContextCreateContent(this);
        }

        @Override // com.facebook.share.model.ShareModelBuilder
        public Builder readFrom(ContextCreateContent contextCreateContent) {
            return contextCreateContent == null ? this : setSuggestedPlayerID(contextCreateContent.getSuggestedPlayerID());
        }
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Nullable
    public String getSuggestedPlayerID() {
        return this.a;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
    }

    private ContextCreateContent(Builder builder) {
        this.a = builder.a;
    }

    public ContextCreateContent(Parcel parcel) {
        this.a = parcel.readString();
    }
}
