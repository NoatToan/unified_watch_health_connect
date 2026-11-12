package com.facebook.share.model;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@Deprecated
public final class ShareMessengerURLActionButton extends ShareMessengerActionButton {
    public static final Parcelable.Creator<ShareMessengerURLActionButton> CREATOR = new a();
    private final Uri b;
    private final Uri c;
    private final boolean d;
    private final boolean e;
    private final WebviewHeightRatio f;

    public static final class Builder extends ShareMessengerActionButton.Builder<ShareMessengerURLActionButton, Builder> {
        private Uri b;
        private boolean c;
        private Uri d;
        private WebviewHeightRatio e;
        private boolean f;

        public Builder setFallbackUrl(@Nullable Uri uri) {
            this.d = uri;
            return this;
        }

        public Builder setIsMessengerExtensionURL(boolean z) {
            this.c = z;
            return this;
        }

        public Builder setShouldHideWebviewShareButton(boolean z) {
            this.f = z;
            return this;
        }

        public Builder setUrl(@Nullable Uri uri) {
            this.b = uri;
            return this;
        }

        public Builder setWebviewHeightRatio(WebviewHeightRatio webviewHeightRatio) {
            this.e = webviewHeightRatio;
            return this;
        }

        @Override // com.facebook.share.ShareBuilder
        public ShareMessengerURLActionButton build() {
            return new ShareMessengerURLActionButton(this, null);
        }

        @Override // com.facebook.share.model.ShareMessengerActionButton.Builder, com.facebook.share.model.ShareModelBuilder
        public Builder readFrom(ShareMessengerURLActionButton shareMessengerURLActionButton) {
            return shareMessengerURLActionButton == null ? this : setUrl(shareMessengerURLActionButton.getUrl()).setIsMessengerExtensionURL(shareMessengerURLActionButton.getIsMessengerExtensionURL()).setFallbackUrl(shareMessengerURLActionButton.getFallbackUrl()).setWebviewHeightRatio(shareMessengerURLActionButton.getWebviewHeightRatio()).setShouldHideWebviewShareButton(shareMessengerURLActionButton.getShouldHideWebviewShareButton());
        }
    }

    public enum WebviewHeightRatio {
        WebviewHeightRatioFull,
        WebviewHeightRatioTall,
        WebviewHeightRatioCompact
    }

    public static class a implements Parcelable.Creator<ShareMessengerURLActionButton> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public ShareMessengerURLActionButton createFromParcel(Parcel parcel) {
            return new ShareMessengerURLActionButton(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public ShareMessengerURLActionButton[] newArray(int i) {
            return new ShareMessengerURLActionButton[i];
        }
    }

    public /* synthetic */ ShareMessengerURLActionButton(Builder builder, a aVar) {
        this(builder);
    }

    @Nullable
    public Uri getFallbackUrl() {
        return this.c;
    }

    public boolean getIsMessengerExtensionURL() {
        return this.d;
    }

    public boolean getShouldHideWebviewShareButton() {
        return this.e;
    }

    public Uri getUrl() {
        return this.b;
    }

    @Nullable
    public WebviewHeightRatio getWebviewHeightRatio() {
        return this.f;
    }

    private ShareMessengerURLActionButton(Builder builder) {
        super(builder);
        this.b = builder.b;
        this.d = builder.c;
        this.c = builder.d;
        this.f = builder.e;
        this.e = builder.f;
    }

    public ShareMessengerURLActionButton(Parcel parcel) {
        super(parcel);
        this.b = (Uri) parcel.readParcelable(Uri.class.getClassLoader());
        this.d = parcel.readByte() != 0;
        this.c = (Uri) parcel.readParcelable(Uri.class.getClassLoader());
        this.f = (WebviewHeightRatio) parcel.readSerializable();
        this.e = parcel.readByte() != 0;
    }
}
