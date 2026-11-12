package com.facebook.share.model;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes2.dex */
@Deprecated
public final class ShareMessengerMediaTemplateContent extends ShareContent<ShareMessengerMediaTemplateContent, Builder> {
    public static final Parcelable.Creator<ShareMessengerMediaTemplateContent> CREATOR = new a();
    private final MediaType g;
    private final String h;
    private final Uri i;
    private final ShareMessengerActionButton j;

    public static class Builder extends ShareContent.Builder<ShareMessengerMediaTemplateContent, Builder> {
        private MediaType g;
        private String h;
        private Uri i;
        private ShareMessengerActionButton j;

        public Builder setAttachmentId(String str) {
            this.h = str;
            return this;
        }

        public Builder setButton(ShareMessengerActionButton shareMessengerActionButton) {
            this.j = shareMessengerActionButton;
            return this;
        }

        public Builder setMediaType(MediaType mediaType) {
            this.g = mediaType;
            return this;
        }

        public Builder setMediaUrl(Uri uri) {
            this.i = uri;
            return this;
        }

        @Override // com.facebook.share.ShareBuilder
        public ShareMessengerMediaTemplateContent build() {
            return new ShareMessengerMediaTemplateContent(this, null);
        }

        @Override // com.facebook.share.model.ShareContent.Builder, com.facebook.share.model.ShareModelBuilder
        public Builder readFrom(ShareMessengerMediaTemplateContent shareMessengerMediaTemplateContent) {
            return shareMessengerMediaTemplateContent == null ? this : ((Builder) super.readFrom(shareMessengerMediaTemplateContent)).setMediaType(shareMessengerMediaTemplateContent.getMediaType()).setAttachmentId(shareMessengerMediaTemplateContent.getAttachmentId()).setMediaUrl(shareMessengerMediaTemplateContent.getMediaUrl()).setButton(shareMessengerMediaTemplateContent.getButton());
        }
    }

    public enum MediaType {
        IMAGE,
        VIDEO
    }

    public static class a implements Parcelable.Creator<ShareMessengerMediaTemplateContent> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public ShareMessengerMediaTemplateContent createFromParcel(Parcel parcel) {
            return new ShareMessengerMediaTemplateContent(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public ShareMessengerMediaTemplateContent[] newArray(int i) {
            return new ShareMessengerMediaTemplateContent[i];
        }
    }

    public /* synthetic */ ShareMessengerMediaTemplateContent(Builder builder, a aVar) {
        this(builder);
    }

    @Override // com.facebook.share.model.ShareContent, android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String getAttachmentId() {
        return this.h;
    }

    public ShareMessengerActionButton getButton() {
        return this.j;
    }

    public MediaType getMediaType() {
        return this.g;
    }

    public Uri getMediaUrl() {
        return this.i;
    }

    @Override // com.facebook.share.model.ShareContent, android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeSerializable(this.g);
        parcel.writeString(this.h);
        parcel.writeParcelable(this.i, i);
        parcel.writeParcelable(this.j, i);
    }

    private ShareMessengerMediaTemplateContent(Builder builder) {
        super(builder);
        this.g = builder.g;
        this.h = builder.h;
        this.i = builder.i;
        this.j = builder.j;
    }

    public ShareMessengerMediaTemplateContent(Parcel parcel) {
        super(parcel);
        this.g = (MediaType) parcel.readSerializable();
        this.h = parcel.readString();
        this.i = (Uri) parcel.readParcelable(Uri.class.getClassLoader());
        this.j = (ShareMessengerActionButton) parcel.readParcelable(ShareMessengerActionButton.class.getClassLoader());
    }
}
