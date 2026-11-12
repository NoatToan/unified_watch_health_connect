package com.facebook.gamingservices.model;

import android.os.Parcel;
import androidx.annotation.Nullable;
import com.facebook.share.model.ShareModel;
import com.facebook.share.model.ShareModelBuilder;

/* JADX INFO: loaded from: classes2.dex */
public final class ContextSwitchContent implements ShareModel {

    @Nullable
    private final String a;

    public static class Builder implements ShareModelBuilder<ContextSwitchContent, Builder> {

        @Nullable
        private String a;

        public Builder b(Parcel parcel) {
            return readFrom((ContextSwitchContent) parcel.readParcelable(ContextSwitchContent.class.getClassLoader()));
        }

        public Builder setContextID(@Nullable String str) {
            this.a = str;
            return this;
        }

        @Override // com.facebook.share.ShareBuilder
        public ContextSwitchContent build() {
            return new ContextSwitchContent(this);
        }

        @Override // com.facebook.share.model.ShareModelBuilder
        public Builder readFrom(ContextSwitchContent contextSwitchContent) {
            return contextSwitchContent == null ? this : setContextID(contextSwitchContent.getContextID());
        }
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Nullable
    public String getContextID() {
        return this.a;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
    }

    private ContextSwitchContent(Builder builder) {
        this.a = builder.a;
    }

    public ContextSwitchContent(Parcel parcel) {
        this.a = parcel.readString();
    }
}
