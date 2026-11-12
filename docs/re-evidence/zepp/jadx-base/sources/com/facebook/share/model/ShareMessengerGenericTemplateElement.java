package com.facebook.share.model;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes2.dex */
@Deprecated
public final class ShareMessengerGenericTemplateElement implements ShareModel {
    public static final Parcelable.Creator<ShareMessengerGenericTemplateElement> CREATOR = new a();
    private final String a;
    private final String b;
    private final Uri c;
    private final ShareMessengerActionButton d;
    private final ShareMessengerActionButton e;

    public static class Builder implements ShareModelBuilder<ShareMessengerGenericTemplateElement, Builder> {
        private String a;
        private String b;
        private Uri c;
        private ShareMessengerActionButton d;
        private ShareMessengerActionButton e;

        public Builder f(Parcel parcel) {
            return readFrom((ShareMessengerGenericTemplateElement) parcel.readParcelable(ShareMessengerGenericTemplateElement.class.getClassLoader()));
        }

        public Builder setButton(ShareMessengerActionButton shareMessengerActionButton) {
            this.e = shareMessengerActionButton;
            return this;
        }

        public Builder setDefaultAction(ShareMessengerActionButton shareMessengerActionButton) {
            this.d = shareMessengerActionButton;
            return this;
        }

        public Builder setImageUrl(Uri uri) {
            this.c = uri;
            return this;
        }

        public Builder setSubtitle(String str) {
            this.b = str;
            return this;
        }

        public Builder setTitle(String str) {
            this.a = str;
            return this;
        }

        @Override // com.facebook.share.ShareBuilder
        public ShareMessengerGenericTemplateElement build() {
            return new ShareMessengerGenericTemplateElement(this, null);
        }

        @Override // com.facebook.share.model.ShareModelBuilder
        public Builder readFrom(ShareMessengerGenericTemplateElement shareMessengerGenericTemplateElement) {
            return shareMessengerGenericTemplateElement == null ? this : setTitle(shareMessengerGenericTemplateElement.a).setSubtitle(shareMessengerGenericTemplateElement.b).setImageUrl(shareMessengerGenericTemplateElement.c).setDefaultAction(shareMessengerGenericTemplateElement.d).setButton(shareMessengerGenericTemplateElement.e);
        }
    }

    public static class a implements Parcelable.Creator<ShareMessengerGenericTemplateElement> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public ShareMessengerGenericTemplateElement createFromParcel(Parcel parcel) {
            return new ShareMessengerGenericTemplateElement(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public ShareMessengerGenericTemplateElement[] newArray(int i) {
            return new ShareMessengerGenericTemplateElement[i];
        }
    }

    public /* synthetic */ ShareMessengerGenericTemplateElement(Builder builder, a aVar) {
        this(builder);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public ShareMessengerActionButton getButton() {
        return this.e;
    }

    public ShareMessengerActionButton getDefaultAction() {
        return this.d;
    }

    public Uri getImageUrl() {
        return this.c;
    }

    public String getSubtitle() {
        return this.b;
    }

    public String getTitle() {
        return this.a;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
        parcel.writeString(this.b);
        parcel.writeParcelable(this.c, i);
        parcel.writeParcelable(this.d, i);
        parcel.writeParcelable(this.e, i);
    }

    private ShareMessengerGenericTemplateElement(Builder builder) {
        this.a = builder.a;
        this.b = builder.b;
        this.c = builder.c;
        this.d = builder.d;
        this.e = builder.e;
    }

    public ShareMessengerGenericTemplateElement(Parcel parcel) {
        this.a = parcel.readString();
        this.b = parcel.readString();
        this.c = (Uri) parcel.readParcelable(Uri.class.getClassLoader());
        this.d = (ShareMessengerActionButton) parcel.readParcelable(ShareMessengerActionButton.class.getClassLoader());
        this.e = (ShareMessengerActionButton) parcel.readParcelable(ShareMessengerActionButton.class.getClassLoader());
    }
}
