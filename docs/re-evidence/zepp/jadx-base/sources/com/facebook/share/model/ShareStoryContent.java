package com.facebook.share.model;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class ShareStoryContent extends ShareContent<ShareStoryContent, Builder> {
    public static final Parcelable.Creator<ShareStoryContent> CREATOR = new a();
    private final ShareMedia g;
    private final SharePhoto h;

    @Nullable
    private final List<String> i;
    private final String j;

    public static final class Builder extends ShareContent.Builder<ShareStoryContent, Builder> {
        public static final String k = "Builder";
        private ShareMedia g;
        private SharePhoto h;
        private List<String> i;
        private String j;

        public Builder setAttributionLink(String str) {
            this.j = str;
            return this;
        }

        public Builder setBackgroundAsset(ShareMedia shareMedia) {
            this.g = shareMedia;
            return this;
        }

        public Builder setBackgroundColorList(List<String> list) {
            this.i = list;
            return this;
        }

        public Builder setStickerAsset(SharePhoto sharePhoto) {
            this.h = sharePhoto;
            return this;
        }

        @Override // com.facebook.share.ShareBuilder
        public ShareStoryContent build() {
            return new ShareStoryContent(this, null);
        }

        @Override // com.facebook.share.model.ShareContent.Builder, com.facebook.share.model.ShareModelBuilder
        public Builder readFrom(ShareStoryContent shareStoryContent) {
            return shareStoryContent == null ? this : ((Builder) super.readFrom(shareStoryContent)).setBackgroundAsset(shareStoryContent.getBackgroundAsset()).setStickerAsset(shareStoryContent.getStickerAsset()).setBackgroundColorList(shareStoryContent.getBackgroundColorList()).setAttributionLink(shareStoryContent.getAttributionLink());
        }
    }

    public static class a implements Parcelable.Creator<ShareStoryContent> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public ShareStoryContent createFromParcel(Parcel parcel) {
            return new ShareStoryContent(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public ShareStoryContent[] newArray(int i) {
            return new ShareStoryContent[i];
        }
    }

    public /* synthetic */ ShareStoryContent(Builder builder, a aVar) {
        this(builder);
    }

    @Nullable
    private List<String> a(Parcel parcel) {
        ArrayList arrayList = new ArrayList();
        parcel.readStringList(arrayList);
        if (arrayList.isEmpty()) {
            return null;
        }
        return Collections.unmodifiableList(arrayList);
    }

    @Override // com.facebook.share.model.ShareContent, android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String getAttributionLink() {
        return this.j;
    }

    public ShareMedia getBackgroundAsset() {
        return this.g;
    }

    @Nullable
    public List<String> getBackgroundColorList() {
        List<String> list = this.i;
        if (list == null) {
            return null;
        }
        return Collections.unmodifiableList(list);
    }

    public SharePhoto getStickerAsset() {
        return this.h;
    }

    @Override // com.facebook.share.model.ShareContent, android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeParcelable(this.g, 0);
        parcel.writeParcelable(this.h, 0);
        parcel.writeStringList(this.i);
        parcel.writeString(this.j);
    }

    private ShareStoryContent(Builder builder) {
        super(builder);
        this.g = builder.g;
        this.h = builder.h;
        this.i = builder.i;
        this.j = builder.j;
    }

    public ShareStoryContent(Parcel parcel) {
        super(parcel);
        this.g = (ShareMedia) parcel.readParcelable(ShareMedia.class.getClassLoader());
        this.h = (SharePhoto) parcel.readParcelable(SharePhoto.class.getClassLoader());
        this.i = a(parcel);
        this.j = parcel.readString();
    }
}
