package com.facebook.share.model;

import android.net.Uri;
import android.os.Parcel;
import com.facebook.share.internal.ShareConstants;
import com.facebook.share.model.ShareContent;
import com.facebook.share.model.ShareContent.Builder;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.watch.transport.httpsupport.cacher.DataCacher;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import kotlin.Metadata;
import org.cybergarage.upnp.Argument;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\b\u000b\b&\u0018\u0000*\u0014\b\u0000\u0010\u0001*\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0000*\u0014\b\u0001\u0010\u0003*\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00022\u00020\u0004:\u0001/B\u001d\b\u0014\u0012\u0012\u0010+\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0002¢\u0006\u0004\b,\u0010-B\u0011\b\u0014\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b,\u0010.J\u0018\u0010\t\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u00072\u0006\u0010\u0006\u001a\u00020\u0005H\u0002J\b\u0010\u000b\u001a\u00020\nH\u0016J\u0018\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\nH\u0016R\u001b\u0010\u0014\u001a\u0004\u0018\u00010\u00108\u0006@\u0006¢\u0006\f\n\u0004\b\t\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R!\u0010\u0019\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u00078\u0006@\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u001b\u0010\u001e\u001a\u0004\u0018\u00010\b8\u0006@\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u001b\u0010!\u001a\u0004\u0018\u00010\b8\u0006@\u0006¢\u0006\f\n\u0004\b\u001f\u0010\u001b\u001a\u0004\b \u0010\u001dR\u001b\u0010$\u001a\u0004\u0018\u00010\b8\u0006@\u0006¢\u0006\f\n\u0004\b\"\u0010\u001b\u001a\u0004\b#\u0010\u001dR\u001b\u0010*\u001a\u0004\u0018\u00010%8\u0006@\u0006¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)¨\u00060"}, d2 = {"Lcom/facebook/share/model/ShareContent;", "P", "Lcom/facebook/share/model/ShareContent$Builder;", "E", "Lcom/facebook/share/model/ShareModel;", "Landroid/os/Parcel;", "parcel", "", "", "a", "", "describeContents", Argument.OUT, DataCacher.j, "", "writeToParcel", "Landroid/net/Uri;", "Landroid/net/Uri;", "getContentUrl", "()Landroid/net/Uri;", "contentUrl", "b", "Ljava/util/List;", "getPeopleIds", "()Ljava/util/List;", "peopleIds", "c", "Ljava/lang/String;", "getPlaceId", "()Ljava/lang/String;", "placeId", GoogleApiAvailabilityLight.a, "getPageId", "pageId", "e", "getRef", "ref", "Lcom/facebook/share/model/ShareHashtag;", "f", "Lcom/facebook/share/model/ShareHashtag;", "getShareHashtag", "()Lcom/facebook/share/model/ShareHashtag;", "shareHashtag", "builder", "<init>", "(Lcom/facebook/share/model/ShareContent$Builder;)V", "(Landroid/os/Parcel;)V", ShareStoryContent.Builder.k, "facebook-common_release"}, k = 1, mv = {1, 5, 1})
public abstract class ShareContent<P extends ShareContent<P, E>, E extends Builder<P, E>> implements ShareModel {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @Nullable
    private final Uri contentUrl;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @Nullable
    private final List<String> peopleIds;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @Nullable
    private final String placeId;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @Nullable
    private final String pageId;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @Nullable
    private final String ref;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @Nullable
    private final ShareHashtag shareHashtag;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b(\b&\u0018\u0000*\u0014\b\u0002\u0010\u0002*\u000e\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\u0001*\u0014\b\u0003\u0010\u0003*\u000e\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\u00002\u000e\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\u0004B\u0007¢\u0006\u0004\b;\u0010<J\u0017\u0010\u0007\u001a\u00028\u00032\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u001d\u0010\f\u001a\u00028\u00032\u000e\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u000f\u001a\u00028\u00032\b\u0010\u000e\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0012\u001a\u00028\u00032\b\u0010\u0011\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0012\u0010\u0010J\u0017\u0010\u0014\u001a\u00028\u00032\b\u0010\u0013\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0014\u0010\u0010J\u0017\u0010\u0017\u001a\u00028\u00032\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015¢\u0006\u0004\b\u0017\u0010\u0018J\u0019\u0010\u001a\u001a\u00028\u00032\b\u0010\u0019\u001a\u0004\u0018\u00018\u0002H\u0016¢\u0006\u0004\b\u001a\u0010\u001bR$\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!R*\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%\"\u0004\b&\u0010'R$\u0010\u000e\u001a\u0004\u0018\u00010\n8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b(\u0010)\u001a\u0004\b*\u0010+\"\u0004\b,\u0010-R$\u0010\u0011\u001a\u0004\u0018\u00010\n8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b.\u0010)\u001a\u0004\b/\u0010+\"\u0004\b0\u0010-R$\u0010\u0013\u001a\u0004\u0018\u00010\n8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b1\u0010)\u001a\u0004\b2\u0010+\"\u0004\b3\u0010-R$\u0010:\u001a\u0004\u0018\u00010\u00158\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b4\u00105\u001a\u0004\b6\u00107\"\u0004\b8\u00109¨\u0006="}, d2 = {"Lcom/facebook/share/model/ShareContent$Builder;", "Lcom/facebook/share/model/ShareContent;", "P", "E", "Lcom/facebook/share/model/ShareModelBuilder;", "Landroid/net/Uri;", "contentUrl", "setContentUrl", "(Landroid/net/Uri;)Lcom/facebook/share/model/ShareContent$Builder;", "", "", "peopleIds", "setPeopleIds", "(Ljava/util/List;)Lcom/facebook/share/model/ShareContent$Builder;", "placeId", "setPlaceId", "(Ljava/lang/String;)Lcom/facebook/share/model/ShareContent$Builder;", "pageId", "setPageId", "ref", "setRef", "Lcom/facebook/share/model/ShareHashtag;", "shareHashtag", "setShareHashtag", "(Lcom/facebook/share/model/ShareHashtag;)Lcom/facebook/share/model/ShareContent$Builder;", "content", "readFrom", "(Lcom/facebook/share/model/ShareContent;)Lcom/facebook/share/model/ShareContent$Builder;", "a", "Landroid/net/Uri;", "getContentUrl$facebook_common_release", "()Landroid/net/Uri;", "setContentUrl$facebook_common_release", "(Landroid/net/Uri;)V", "b", "Ljava/util/List;", "getPeopleIds$facebook_common_release", "()Ljava/util/List;", "setPeopleIds$facebook_common_release", "(Ljava/util/List;)V", "c", "Ljava/lang/String;", "getPlaceId$facebook_common_release", "()Ljava/lang/String;", "setPlaceId$facebook_common_release", "(Ljava/lang/String;)V", GoogleApiAvailabilityLight.a, "getPageId$facebook_common_release", "setPageId$facebook_common_release", "e", "getRef$facebook_common_release", "setRef$facebook_common_release", "f", "Lcom/facebook/share/model/ShareHashtag;", "getHashtag$facebook_common_release", "()Lcom/facebook/share/model/ShareHashtag;", "setHashtag$facebook_common_release", "(Lcom/facebook/share/model/ShareHashtag;)V", ShareConstants.WEB_DIALOG_PARAM_HASHTAG, "<init>", "()V", "facebook-common_release"}, k = 1, mv = {1, 5, 1})
    public static abstract class Builder<P extends ShareContent<P, E>, E extends Builder<P, E>> implements ShareModelBuilder<P, E> {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        @Nullable
        private Uri contentUrl;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        @Nullable
        private List<String> peopleIds;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        @Nullable
        private String placeId;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        @Nullable
        private String pageId;

        /* JADX INFO: renamed from: e, reason: from kotlin metadata */
        @Nullable
        private String ref;

        /* JADX INFO: renamed from: f, reason: from kotlin metadata */
        @Nullable
        private ShareHashtag hashtag;

        @Nullable
        /* JADX INFO: renamed from: getContentUrl$facebook_common_release, reason: from getter */
        public final Uri getContentUrl() {
            return this.contentUrl;
        }

        @Nullable
        /* JADX INFO: renamed from: getHashtag$facebook_common_release, reason: from getter */
        public final ShareHashtag getHashtag() {
            return this.hashtag;
        }

        @Nullable
        /* JADX INFO: renamed from: getPageId$facebook_common_release, reason: from getter */
        public final String getPageId() {
            return this.pageId;
        }

        @Nullable
        public final List<String> getPeopleIds$facebook_common_release() {
            return this.peopleIds;
        }

        @Nullable
        /* JADX INFO: renamed from: getPlaceId$facebook_common_release, reason: from getter */
        public final String getPlaceId() {
            return this.placeId;
        }

        @Nullable
        /* JADX INFO: renamed from: getRef$facebook_common_release, reason: from getter */
        public final String getRef() {
            return this.ref;
        }

        @NotNull
        public final E setContentUrl(@Nullable Uri contentUrl) {
            this.contentUrl = contentUrl;
            return this;
        }

        public final void setContentUrl$facebook_common_release(@Nullable Uri uri) {
            this.contentUrl = uri;
        }

        public final void setHashtag$facebook_common_release(@Nullable ShareHashtag shareHashtag) {
            this.hashtag = shareHashtag;
        }

        @NotNull
        public final E setPageId(@Nullable String pageId) {
            this.pageId = pageId;
            return this;
        }

        public final void setPageId$facebook_common_release(@Nullable String str) {
            this.pageId = str;
        }

        @NotNull
        public final E setPeopleIds(@Nullable List<String> peopleIds) {
            this.peopleIds = peopleIds == null ? null : Collections.unmodifiableList(peopleIds);
            return this;
        }

        public final void setPeopleIds$facebook_common_release(@Nullable List<String> list) {
            this.peopleIds = list;
        }

        @NotNull
        public final E setPlaceId(@Nullable String placeId) {
            this.placeId = placeId;
            return this;
        }

        public final void setPlaceId$facebook_common_release(@Nullable String str) {
            this.placeId = str;
        }

        @NotNull
        public final E setRef(@Nullable String ref) {
            this.ref = ref;
            return this;
        }

        public final void setRef$facebook_common_release(@Nullable String str) {
            this.ref = str;
        }

        @NotNull
        public final E setShareHashtag(@Nullable ShareHashtag shareHashtag) {
            this.hashtag = shareHashtag;
            return this;
        }

        @Override // com.facebook.share.model.ShareModelBuilder
        @NotNull
        public E readFrom(@Nullable P content) {
            return content == null ? this : (E) setContentUrl(content.getContentUrl()).setPeopleIds(content.getPeopleIds()).setPlaceId(content.getPlaceId()).setPageId(content.getPageId()).setRef(content.getRef()).setShareHashtag(content.getShareHashtag());
        }
    }

    public ShareContent(@NotNull Builder<P, E> builder) {
        this.contentUrl = builder.getContentUrl();
        this.peopleIds = builder.getPeopleIds$facebook_common_release();
        this.placeId = builder.getPlaceId();
        this.pageId = builder.getPageId();
        this.ref = builder.getRef();
        this.shareHashtag = builder.getHashtag();
    }

    private final List<String> a(Parcel parcel) {
        ArrayList arrayList = new ArrayList();
        parcel.readStringList(arrayList);
        if (arrayList.isEmpty()) {
            return null;
        }
        return Collections.unmodifiableList(arrayList);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Nullable
    public final Uri getContentUrl() {
        return this.contentUrl;
    }

    @Nullable
    public final String getPageId() {
        return this.pageId;
    }

    @Nullable
    public final List<String> getPeopleIds() {
        return this.peopleIds;
    }

    @Nullable
    public final String getPlaceId() {
        return this.placeId;
    }

    @Nullable
    public final String getRef() {
        return this.ref;
    }

    @Nullable
    public final ShareHashtag getShareHashtag() {
        return this.shareHashtag;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel out, int flags) {
        out.writeParcelable(this.contentUrl, 0);
        out.writeStringList(this.peopleIds);
        out.writeString(this.placeId);
        out.writeString(this.pageId);
        out.writeString(this.ref);
        out.writeParcelable(this.shareHashtag, 0);
    }

    public ShareContent(@NotNull Parcel parcel) {
        this.contentUrl = (Uri) parcel.readParcelable(Uri.class.getClassLoader());
        this.peopleIds = a(parcel);
        this.placeId = parcel.readString();
        this.pageId = parcel.readString();
        this.ref = parcel.readString();
        this.shareHashtag = new ShareHashtag.Builder().b(parcel).build();
    }
}
