package com.facebook.share.model;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes2.dex */
public class ShareCameraEffectContent extends ShareContent<ShareCameraEffectContent, Builder> {
    public static final Parcelable.Creator<ShareCameraEffectContent> CREATOR = new a();
    private String g;
    private CameraEffectArguments h;
    private CameraEffectTextures i;

    public static final class Builder extends ShareContent.Builder<ShareCameraEffectContent, Builder> {
        private String g;
        private CameraEffectArguments h;
        private CameraEffectTextures i;

        public Builder setArguments(CameraEffectArguments cameraEffectArguments) {
            this.h = cameraEffectArguments;
            return this;
        }

        public Builder setEffectId(String str) {
            this.g = str;
            return this;
        }

        public Builder setTextures(CameraEffectTextures cameraEffectTextures) {
            this.i = cameraEffectTextures;
            return this;
        }

        @Override // com.facebook.share.ShareBuilder
        public ShareCameraEffectContent build() {
            return new ShareCameraEffectContent(this, null);
        }

        @Override // com.facebook.share.model.ShareContent.Builder, com.facebook.share.model.ShareModelBuilder
        public Builder readFrom(ShareCameraEffectContent shareCameraEffectContent) {
            return shareCameraEffectContent == null ? this : ((Builder) super.readFrom(shareCameraEffectContent)).setEffectId(this.g).setArguments(this.h);
        }
    }

    public static class a implements Parcelable.Creator<ShareCameraEffectContent> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public ShareCameraEffectContent createFromParcel(Parcel parcel) {
            return new ShareCameraEffectContent(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public ShareCameraEffectContent[] newArray(int i) {
            return new ShareCameraEffectContent[i];
        }
    }

    public /* synthetic */ ShareCameraEffectContent(Builder builder, a aVar) {
        this(builder);
    }

    public CameraEffectArguments getArguments() {
        return this.h;
    }

    public String getEffectId() {
        return this.g;
    }

    public CameraEffectTextures getTextures() {
        return this.i;
    }

    @Override // com.facebook.share.model.ShareContent, android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeString(this.g);
        parcel.writeParcelable(this.h, 0);
        parcel.writeParcelable(this.i, 0);
    }

    private ShareCameraEffectContent(Builder builder) {
        super(builder);
        this.g = builder.g;
        this.h = builder.h;
        this.i = builder.i;
    }

    public ShareCameraEffectContent(Parcel parcel) {
        super(parcel);
        this.g = parcel.readString();
        this.h = new CameraEffectArguments.Builder().readFrom(parcel).build();
        this.i = new CameraEffectTextures.Builder().readFrom(parcel).build();
    }
}
