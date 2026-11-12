package com.facebook.share.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.amap.api.mapcore.util.hl;
import com.facebook.share.model.ShareContent;
import com.facebook.share.model.ShareStoryContent;
import com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder;
import com.huami.watch.transport.httpsupport.cacher.DataCacher;
import com.loc.z;
import kotlin.Metadata;
import kotlin.jvm.JvmField;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.cybergarage.upnp.Argument;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u001f\u0018\u0000 '2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0002('B\u0011\b\u0012\u0012\u0006\u0010\"\u001a\u00020\u0002¢\u0006\u0004\b#\u0010$B\u0011\b\u0010\u0012\u0006\u0010%\u001a\u00020\u0005¢\u0006\u0004\b#\u0010&J\b\u0010\u0004\u001a\u00020\u0003H\u0016J\u0018\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0003H\u0016R\u001b\u0010\u000f\u001a\u0004\u0018\u00010\n8\u0006@\u0006¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000eR\u001b\u0010\u0012\u001a\u0004\u0018\u00010\n8\u0006@\u0006¢\u0006\f\n\u0004\b\u0010\u0010\f\u001a\u0004\b\u0011\u0010\u000eR\u001b\u0010\u0015\u001a\u0004\u0018\u00010\n8\u0006@\u0006¢\u0006\f\n\u0004\b\u0013\u0010\f\u001a\u0004\b\u0014\u0010\u000eR\u001b\u0010\u0018\u001a\u0004\u0018\u00010\n8\u0006@\u0006¢\u0006\f\n\u0004\b\u0016\u0010\f\u001a\u0004\b\u0017\u0010\u000eR\u001b\u0010\u001b\u001a\u0004\u0018\u00010\n8\u0006@\u0006¢\u0006\f\n\u0004\b\u0019\u0010\f\u001a\u0004\b\u001a\u0010\u000eR\u001b\u0010\u001e\u001a\u0004\u0018\u00010\n8\u0006@\u0006¢\u0006\f\n\u0004\b\u001c\u0010\f\u001a\u0004\b\u001d\u0010\u000eR\u001b\u0010!\u001a\u0004\u0018\u00010\n8\u0006@\u0006¢\u0006\f\n\u0004\b\u001f\u0010\f\u001a\u0004\b \u0010\u000e¨\u0006)"}, d2 = {"Lcom/facebook/share/internal/ShareFeedContent;", "Lcom/facebook/share/model/ShareContent;", "Lcom/facebook/share/internal/ShareFeedContent$Builder;", "", "describeContents", "Landroid/os/Parcel;", Argument.OUT, DataCacher.j, "", "writeToParcel", "", "g", "Ljava/lang/String;", "getToId", "()Ljava/lang/String;", "toId", "h", "getLink", "link", "i", "getLinkName", "linkName", z.j, "getLinkCaption", "linkCaption", hl.k, "getLinkDescription", "linkDescription", "l", "getPicture", "picture", "m", "getMediaSource", "mediaSource", "builder", "<init>", "(Lcom/facebook/share/internal/ShareFeedContent$Builder;)V", "parcel", "(Landroid/os/Parcel;)V", "Companion", ShareStoryContent.Builder.k, "facebook-common_release"}, k = 1, mv = {1, 5, 1})
public final class ShareFeedContent extends ShareContent<ShareFeedContent, Builder> {

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    @Nullable
    private final String toId;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    @Nullable
    private final String link;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @Nullable
    private final String linkName;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    @Nullable
    private final String linkCaption;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    @Nullable
    private final String linkDescription;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    @Nullable
    private final String picture;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    @Nullable
    private final String mediaSource;

    @JvmField
    @NotNull
    public static final Parcelable.Creator<ShareFeedContent> CREATOR = new Parcelable.Creator<ShareFeedContent>() { // from class: com.facebook.share.internal.ShareFeedContent$Companion$CREATOR$1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NotNull
        public ShareFeedContent createFromParcel(@NotNull Parcel parcel) {
            return new ShareFeedContent(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NotNull
        public ShareFeedContent[] newArray(int size) {
            return new ShareFeedContent[size];
        }
    };

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b,\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00000\u0001B\u0007¢\u0006\u0004\b-\u0010.J\u0010\u0010\u0005\u001a\u00020\u00002\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003J\u0010\u0010\u0007\u001a\u00020\u00002\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003J\u0010\u0010\t\u001a\u00020\u00002\b\u0010\b\u001a\u0004\u0018\u00010\u0003J\u0010\u0010\u000b\u001a\u00020\u00002\b\u0010\n\u001a\u0004\u0018\u00010\u0003J\u0010\u0010\r\u001a\u00020\u00002\b\u0010\f\u001a\u0004\u0018\u00010\u0003J\u0010\u0010\u000f\u001a\u00020\u00002\b\u0010\u000e\u001a\u0004\u0018\u00010\u0003J\u0010\u0010\u0011\u001a\u00020\u00002\b\u0010\u0010\u001a\u0004\u0018\u00010\u0003J\b\u0010\u0012\u001a\u00020\u0002H\u0016J\u0012\u0010\u0014\u001a\u00020\u00002\b\u0010\u0013\u001a\u0004\u0018\u00010\u0002H\u0016R$\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR$\u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u001b\u0010\u0016\u001a\u0004\b\u001c\u0010\u0018\"\u0004\b\u001d\u0010\u001aR$\u0010\b\u001a\u0004\u0018\u00010\u00038\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u001e\u0010\u0016\u001a\u0004\b\u001f\u0010\u0018\"\u0004\b \u0010\u001aR$\u0010\n\u001a\u0004\u0018\u00010\u00038\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b!\u0010\u0016\u001a\u0004\b\"\u0010\u0018\"\u0004\b#\u0010\u001aR$\u0010\f\u001a\u0004\u0018\u00010\u00038\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b$\u0010\u0016\u001a\u0004\b%\u0010\u0018\"\u0004\b&\u0010\u001aR$\u0010\u000e\u001a\u0004\u0018\u00010\u00038\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b'\u0010\u0016\u001a\u0004\b(\u0010\u0018\"\u0004\b)\u0010\u001aR$\u0010\u0010\u001a\u0004\u0018\u00010\u00038\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b*\u0010\u0016\u001a\u0004\b+\u0010\u0018\"\u0004\b,\u0010\u001a¨\u0006/"}, d2 = {"Lcom/facebook/share/internal/ShareFeedContent$Builder;", "Lcom/facebook/share/model/ShareContent$Builder;", "Lcom/facebook/share/internal/ShareFeedContent;", "", "toId", "setToId", "link", "setLink", "linkName", "setLinkName", "linkCaption", "setLinkCaption", "linkDescription", "setLinkDescription", "picture", "setPicture", "mediaSource", "setMediaSource", JsonPOJOBuilder.DEFAULT_BUILD_METHOD, "content", "readFrom", "g", "Ljava/lang/String;", "getToId$facebook_common_release", "()Ljava/lang/String;", "setToId$facebook_common_release", "(Ljava/lang/String;)V", "h", "getLink$facebook_common_release", "setLink$facebook_common_release", "i", "getLinkName$facebook_common_release", "setLinkName$facebook_common_release", z.j, "getLinkCaption$facebook_common_release", "setLinkCaption$facebook_common_release", hl.k, "getLinkDescription$facebook_common_release", "setLinkDescription$facebook_common_release", "l", "getPicture$facebook_common_release", "setPicture$facebook_common_release", "m", "getMediaSource$facebook_common_release", "setMediaSource$facebook_common_release", "<init>", "()V", "facebook-common_release"}, k = 1, mv = {1, 5, 1})
    public static final class Builder extends ShareContent.Builder<ShareFeedContent, Builder> {

        /* JADX INFO: renamed from: g, reason: from kotlin metadata */
        @Nullable
        private String toId;

        /* JADX INFO: renamed from: h, reason: from kotlin metadata */
        @Nullable
        private String link;

        /* JADX INFO: renamed from: i, reason: from kotlin metadata */
        @Nullable
        private String linkName;

        /* JADX INFO: renamed from: j, reason: from kotlin metadata */
        @Nullable
        private String linkCaption;

        /* JADX INFO: renamed from: k, reason: from kotlin metadata */
        @Nullable
        private String linkDescription;

        /* JADX INFO: renamed from: l, reason: from kotlin metadata */
        @Nullable
        private String picture;

        /* JADX INFO: renamed from: m, reason: from kotlin metadata */
        @Nullable
        private String mediaSource;

        @Nullable
        /* JADX INFO: renamed from: getLink$facebook_common_release, reason: from getter */
        public final String getLink() {
            return this.link;
        }

        @Nullable
        /* JADX INFO: renamed from: getLinkCaption$facebook_common_release, reason: from getter */
        public final String getLinkCaption() {
            return this.linkCaption;
        }

        @Nullable
        /* JADX INFO: renamed from: getLinkDescription$facebook_common_release, reason: from getter */
        public final String getLinkDescription() {
            return this.linkDescription;
        }

        @Nullable
        /* JADX INFO: renamed from: getLinkName$facebook_common_release, reason: from getter */
        public final String getLinkName() {
            return this.linkName;
        }

        @Nullable
        /* JADX INFO: renamed from: getMediaSource$facebook_common_release, reason: from getter */
        public final String getMediaSource() {
            return this.mediaSource;
        }

        @Nullable
        /* JADX INFO: renamed from: getPicture$facebook_common_release, reason: from getter */
        public final String getPicture() {
            return this.picture;
        }

        @Nullable
        /* JADX INFO: renamed from: getToId$facebook_common_release, reason: from getter */
        public final String getToId() {
            return this.toId;
        }

        @NotNull
        public final Builder setLink(@Nullable String link) {
            this.link = link;
            return this;
        }

        public final void setLink$facebook_common_release(@Nullable String str) {
            this.link = str;
        }

        @NotNull
        public final Builder setLinkCaption(@Nullable String linkCaption) {
            this.linkCaption = linkCaption;
            return this;
        }

        public final void setLinkCaption$facebook_common_release(@Nullable String str) {
            this.linkCaption = str;
        }

        @NotNull
        public final Builder setLinkDescription(@Nullable String linkDescription) {
            this.linkDescription = linkDescription;
            return this;
        }

        public final void setLinkDescription$facebook_common_release(@Nullable String str) {
            this.linkDescription = str;
        }

        @NotNull
        public final Builder setLinkName(@Nullable String linkName) {
            this.linkName = linkName;
            return this;
        }

        public final void setLinkName$facebook_common_release(@Nullable String str) {
            this.linkName = str;
        }

        @NotNull
        public final Builder setMediaSource(@Nullable String mediaSource) {
            this.mediaSource = mediaSource;
            return this;
        }

        public final void setMediaSource$facebook_common_release(@Nullable String str) {
            this.mediaSource = str;
        }

        @NotNull
        public final Builder setPicture(@Nullable String picture) {
            this.picture = picture;
            return this;
        }

        public final void setPicture$facebook_common_release(@Nullable String str) {
            this.picture = str;
        }

        @NotNull
        public final Builder setToId(@Nullable String toId) {
            this.toId = toId;
            return this;
        }

        public final void setToId$facebook_common_release(@Nullable String str) {
            this.toId = str;
        }

        @Override // com.facebook.share.ShareBuilder
        @NotNull
        public ShareFeedContent build() {
            return new ShareFeedContent(this, null);
        }

        @Override // com.facebook.share.model.ShareContent.Builder, com.facebook.share.model.ShareModelBuilder
        @NotNull
        public Builder readFrom(@Nullable ShareFeedContent content) {
            return content == null ? this : ((Builder) super.readFrom(content)).setToId(content.getToId()).setLink(content.getLink()).setLinkName(content.getLinkName()).setLinkCaption(content.getLinkCaption()).setLinkDescription(content.getLinkDescription()).setPicture(content.getPicture()).setMediaSource(content.getMediaSource());
        }
    }

    public /* synthetic */ ShareFeedContent(Builder builder, DefaultConstructorMarker defaultConstructorMarker) {
        this(builder);
    }

    @Override // com.facebook.share.model.ShareContent, android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Nullable
    public final String getLink() {
        return this.link;
    }

    @Nullable
    public final String getLinkCaption() {
        return this.linkCaption;
    }

    @Nullable
    public final String getLinkDescription() {
        return this.linkDescription;
    }

    @Nullable
    public final String getLinkName() {
        return this.linkName;
    }

    @Nullable
    public final String getMediaSource() {
        return this.mediaSource;
    }

    @Nullable
    public final String getPicture() {
        return this.picture;
    }

    @Nullable
    public final String getToId() {
        return this.toId;
    }

    @Override // com.facebook.share.model.ShareContent, android.os.Parcelable
    public void writeToParcel(@NotNull Parcel out, int flags) {
        super.writeToParcel(out, flags);
        out.writeString(this.toId);
        out.writeString(this.link);
        out.writeString(this.linkName);
        out.writeString(this.linkCaption);
        out.writeString(this.linkDescription);
        out.writeString(this.picture);
        out.writeString(this.mediaSource);
    }

    private ShareFeedContent(Builder builder) {
        super(builder);
        this.toId = builder.getToId();
        this.link = builder.getLink();
        this.linkName = builder.getLinkName();
        this.linkCaption = builder.getLinkCaption();
        this.linkDescription = builder.getLinkDescription();
        this.picture = builder.getPicture();
        this.mediaSource = builder.getMediaSource();
    }

    public ShareFeedContent(@NotNull Parcel parcel) {
        super(parcel);
        this.toId = parcel.readString();
        this.link = parcel.readString();
        this.linkName = parcel.readString();
        this.linkCaption = parcel.readString();
        this.linkDescription = parcel.readString();
        this.picture = parcel.readString();
        this.mediaSource = parcel.readString();
    }
}
