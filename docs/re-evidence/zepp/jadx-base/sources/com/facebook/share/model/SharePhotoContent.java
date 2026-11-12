package com.facebook.share.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.internal.AnalyticsEvents;
import com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder;
import com.huami.watch.transport.httpsupport.cacher.DataCacher;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.JvmField;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.cybergarage.upnp.Argument;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\r\u0018\u0000 \u00162\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u0017\u0016B\u0011\b\u0012\u0012\u0006\u0010\u0011\u001a\u00020\u0002¢\u0006\u0004\b\u0012\u0010\u0013B\u0011\b\u0010\u0012\u0006\u0010\u0014\u001a\u00020\u0005¢\u0006\u0004\b\u0012\u0010\u0015J\b\u0010\u0004\u001a\u00020\u0003H\u0016J\u0018\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0003H\u0016R\u001f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000b0\n8\u0006@\u0006¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0018"}, d2 = {"Lcom/facebook/share/model/SharePhotoContent;", "Lcom/facebook/share/model/ShareContent;", "Lcom/facebook/share/model/SharePhotoContent$Builder;", "", "describeContents", "Landroid/os/Parcel;", Argument.OUT, DataCacher.j, "", "writeToParcel", "", "Lcom/facebook/share/model/SharePhoto;", "g", "Ljava/util/List;", "getPhotos", "()Ljava/util/List;", "photos", "builder", "<init>", "(Lcom/facebook/share/model/SharePhotoContent$Builder;)V", "parcel", "(Landroid/os/Parcel;)V", "Companion", ShareStoryContent.Builder.k, "facebook-common_release"}, k = 1, mv = {1, 5, 1})
public final class SharePhotoContent extends ShareContent<SharePhotoContent, Builder> {

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    @NotNull
    private final List<SharePhoto> photos;

    @JvmField
    @NotNull
    public static final Parcelable.Creator<SharePhotoContent> CREATOR = new Parcelable.Creator<SharePhotoContent>() { // from class: com.facebook.share.model.SharePhotoContent$Companion$CREATOR$1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NotNull
        public SharePhotoContent createFromParcel(@NotNull Parcel parcel) {
            return new SharePhotoContent(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NotNull
        public SharePhotoContent[] newArray(int size) {
            return new SharePhotoContent[size];
        }
    };

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0006\n\u0002\u0010!\n\u0002\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00000\u0001B\u0007¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0005\u001a\u00020\u00002\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003J\u0016\u0010\b\u001a\u00020\u00002\u000e\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0006J\b\u0010\t\u001a\u00020\u0002H\u0016J\u0012\u0010\u000b\u001a\u00020\u00002\b\u0010\n\u001a\u0004\u0018\u00010\u0002H\u0016J\u0016\u0010\f\u001a\u00020\u00002\u000e\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0006R\"\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00030\r8\u0000@\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0014"}, d2 = {"Lcom/facebook/share/model/SharePhotoContent$Builder;", "Lcom/facebook/share/model/ShareContent$Builder;", "Lcom/facebook/share/model/SharePhotoContent;", "Lcom/facebook/share/model/SharePhoto;", AnalyticsEvents.PARAMETER_SHARE_DIALOG_CONTENT_PHOTO, "addPhoto", "", "photos", "addPhotos", JsonPOJOBuilder.DEFAULT_BUILD_METHOD, "content", "readFrom", "setPhotos", "", "g", "Ljava/util/List;", "getPhotos$facebook_common_release", "()Ljava/util/List;", "<init>", "()V", "facebook-common_release"}, k = 1, mv = {1, 5, 1})
    public static final class Builder extends ShareContent.Builder<SharePhotoContent, Builder> {

        /* JADX INFO: renamed from: g, reason: from kotlin metadata */
        @NotNull
        private final List<SharePhoto> photos = new ArrayList();

        @NotNull
        public final Builder addPhoto(@Nullable SharePhoto photo) {
            if (photo != null) {
                this.photos.add(new SharePhoto.Builder().readFrom(photo).build());
            }
            return this;
        }

        @NotNull
        public final Builder addPhotos(@Nullable List<SharePhoto> photos) {
            if (photos != null) {
                Iterator<SharePhoto> it2 = photos.iterator();
                while (it2.hasNext()) {
                    addPhoto(it2.next());
                }
            }
            return this;
        }

        @NotNull
        public final List<SharePhoto> getPhotos$facebook_common_release() {
            return this.photos;
        }

        @NotNull
        public final Builder setPhotos(@Nullable List<SharePhoto> photos) {
            this.photos.clear();
            addPhotos(photos);
            return this;
        }

        @Override // com.facebook.share.ShareBuilder
        @NotNull
        public SharePhotoContent build() {
            return new SharePhotoContent(this, null);
        }

        @Override // com.facebook.share.model.ShareContent.Builder, com.facebook.share.model.ShareModelBuilder
        @NotNull
        public Builder readFrom(@Nullable SharePhotoContent content) {
            return content == null ? this : ((Builder) super.readFrom(content)).addPhotos(content.getPhotos());
        }
    }

    public /* synthetic */ SharePhotoContent(Builder builder, DefaultConstructorMarker defaultConstructorMarker) {
        this(builder);
    }

    @Override // com.facebook.share.model.ShareContent, android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @NotNull
    public final List<SharePhoto> getPhotos() {
        return this.photos;
    }

    @Override // com.facebook.share.model.ShareContent, android.os.Parcelable
    public void writeToParcel(@NotNull Parcel out, int flags) {
        super.writeToParcel(out, flags);
        SharePhoto.Builder.l(out, flags, this.photos);
    }

    private SharePhotoContent(Builder builder) {
        super(builder);
        this.photos = CollectionsKt___CollectionsKt.toList(builder.getPhotos$facebook_common_release());
    }

    public SharePhotoContent(@NotNull Parcel parcel) {
        super(parcel);
        this.photos = CollectionsKt___CollectionsKt.toList(SharePhoto.Builder.k(parcel));
    }
}
