package com.facebook.share.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.share.model.ShareModel;
import com.facebook.share.model.ShareModelBuilder;

/* JADX INFO: loaded from: classes2.dex */
@Deprecated
public class LikeContent implements ShareModel {

    @Deprecated
    public static final Parcelable.Creator<LikeContent> CREATOR = new a();
    private final String a;
    private final String b;

    @Deprecated
    public static class Builder implements ShareModelBuilder<LikeContent, Builder> {
        private String a;
        private String b;

        @Deprecated
        public Builder setObjectId(String str) {
            this.a = str;
            return this;
        }

        @Deprecated
        public Builder setObjectType(String str) {
            this.b = str;
            return this;
        }

        @Override // com.facebook.share.ShareBuilder
        @Deprecated
        public LikeContent build() {
            return new LikeContent(this, null);
        }

        @Override // com.facebook.share.model.ShareModelBuilder
        @Deprecated
        public Builder readFrom(LikeContent likeContent) {
            return likeContent == null ? this : setObjectId(likeContent.getObjectId()).setObjectType(likeContent.getObjectType());
        }
    }

    public static class a implements Parcelable.Creator<LikeContent> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public LikeContent createFromParcel(Parcel parcel) {
            return new LikeContent(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public LikeContent[] newArray(int i) {
            return new LikeContent[i];
        }
    }

    public /* synthetic */ LikeContent(Builder builder, a aVar) {
        this(builder);
    }

    @Override // android.os.Parcelable
    @Deprecated
    public int describeContents() {
        return 0;
    }

    @Deprecated
    public String getObjectId() {
        return this.a;
    }

    @Deprecated
    public String getObjectType() {
        return this.b;
    }

    @Override // android.os.Parcelable
    @Deprecated
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
        parcel.writeString(this.b);
    }

    private LikeContent(Builder builder) {
        this.a = builder.a;
        this.b = builder.b;
    }

    @Deprecated
    public LikeContent(Parcel parcel) {
        this.a = parcel.readString();
        this.b = parcel.readString();
    }
}
