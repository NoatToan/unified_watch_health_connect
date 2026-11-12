package com.facebook.share.internal;

import android.annotation.SuppressLint;
import android.os.Bundle;
import com.facebook.FacebookException;
import com.facebook.internal.Utility;
import com.facebook.share.model.AppGroupCreationContent;
import com.facebook.share.model.GameRequestContent;
import com.facebook.share.model.ShareContent;
import com.facebook.share.model.ShareHashtag;
import com.facebook.share.model.ShareLinkContent;
import com.facebook.share.model.ShareOpenGraphAction;
import com.facebook.share.model.ShareOpenGraphContent;
import com.facebook.share.model.SharePhoto;
import com.facebook.share.model.SharePhotoContent;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Objects;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.jvm.JvmStatic;
import org.jetbrains.annotations.NotNull;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0007J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\bH\u0007J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\nH\u0007J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\fH\u0007J\u0018\u0010\u0010\u001a\u00020\u00042\u000e\u0010\u000f\u001a\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u000eH\u0007J\u0010\u0010\u0011\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\bH\u0007J\u0010\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u0013\u001a\u00020\u0012H\u0007¨\u0006\u0016"}, d2 = {"Lcom/facebook/share/internal/WebDialogParameters;", "", "Lcom/facebook/share/model/AppGroupCreationContent;", "appGroupCreationContent", "Landroid/os/Bundle;", "create", "Lcom/facebook/share/model/GameRequestContent;", "gameRequestContent", "Lcom/facebook/share/model/ShareLinkContent;", "shareLinkContent", "Lcom/facebook/share/model/ShareOpenGraphContent;", "shareOpenGraphContent", "Lcom/facebook/share/model/SharePhotoContent;", "sharePhotoContent", "Lcom/facebook/share/model/ShareContent;", "shareContent", "createBaseParameters", "createForFeed", "Lcom/facebook/share/internal/ShareFeedContent;", "shareFeedContent", "<init>", "()V", "facebook-common_release"}, k = 1, mv = {1, 5, 1})
public final class WebDialogParameters {

    @NotNull
    public static final WebDialogParameters INSTANCE = new WebDialogParameters();

    private WebDialogParameters() {
    }

    @JvmStatic
    @NotNull
    public static final Bundle create(@NotNull AppGroupCreationContent appGroupCreationContent) {
        String string;
        Bundle bundle = new Bundle();
        Utility.putNonEmptyString(bundle, "name", appGroupCreationContent.getName());
        Utility.putNonEmptyString(bundle, "description", appGroupCreationContent.getDescription());
        AppGroupCreationContent.AppGroupPrivacy appGroupPrivacy = appGroupCreationContent.getAppGroupPrivacy();
        Utility.putNonEmptyString(bundle, "privacy", (appGroupPrivacy == null || (string = appGroupPrivacy.toString()) == null) ? null : string.toLowerCase(Locale.ENGLISH));
        return bundle;
    }

    @JvmStatic
    @NotNull
    public static final Bundle createBaseParameters(@NotNull ShareContent<?, ?> shareContent) {
        Bundle bundle = new Bundle();
        ShareHashtag shareHashtag = shareContent.getShareHashtag();
        Utility.putNonEmptyString(bundle, ShareConstants.WEB_DIALOG_PARAM_HASHTAG, shareHashtag != null ? shareHashtag.getHashtag() : null);
        return bundle;
    }

    @JvmStatic
    @SuppressLint({"DeprecatedMethod"})
    @NotNull
    public static final Bundle createForFeed(@NotNull ShareLinkContent shareLinkContent) {
        Bundle bundle = new Bundle();
        Utility.putNonEmptyString(bundle, "name", shareLinkContent.getContentTitle());
        Utility.putNonEmptyString(bundle, "description", shareLinkContent.getContentDescription());
        Utility.putNonEmptyString(bundle, "link", Utility.getUriString(shareLinkContent.getContentUrl()));
        Utility.putNonEmptyString(bundle, "picture", Utility.getUriString(shareLinkContent.getImageUrl()));
        Utility.putNonEmptyString(bundle, ShareConstants.WEB_DIALOG_PARAM_QUOTE, shareLinkContent.getQuote());
        ShareHashtag shareHashtag = shareLinkContent.getShareHashtag();
        Utility.putNonEmptyString(bundle, ShareConstants.WEB_DIALOG_PARAM_HASHTAG, shareHashtag != null ? shareHashtag.getHashtag() : null);
        return bundle;
    }

    @JvmStatic
    @NotNull
    public static final Bundle create(@NotNull GameRequestContent gameRequestContent) {
        String string;
        String string2;
        Bundle bundle = new Bundle();
        Utility.putNonEmptyString(bundle, "message", gameRequestContent.getMessage());
        Utility.putCommaSeparatedStringList(bundle, "to", gameRequestContent.getRecipients());
        Utility.putNonEmptyString(bundle, "title", gameRequestContent.getTitle());
        Utility.putNonEmptyString(bundle, "data", gameRequestContent.getData());
        GameRequestContent.ActionType actionType = gameRequestContent.getActionType();
        String lowerCase = null;
        Utility.putNonEmptyString(bundle, ShareConstants.WEB_DIALOG_PARAM_ACTION_TYPE, (actionType == null || (string2 = actionType.toString()) == null) ? null : string2.toLowerCase(Locale.ENGLISH));
        Utility.putNonEmptyString(bundle, "object_id", gameRequestContent.getObjectId());
        GameRequestContent.Filters filters = gameRequestContent.getFilters();
        if (filters != null && (string = filters.toString()) != null) {
            lowerCase = string.toLowerCase(Locale.ENGLISH);
        }
        Utility.putNonEmptyString(bundle, "filters", lowerCase);
        Utility.putCommaSeparatedStringList(bundle, "suggestions", gameRequestContent.getSuggestions());
        return bundle;
    }

    @JvmStatic
    @NotNull
    public static final Bundle createForFeed(@NotNull ShareFeedContent shareFeedContent) {
        Bundle bundle = new Bundle();
        Utility.putNonEmptyString(bundle, "to", shareFeedContent.getToId());
        Utility.putNonEmptyString(bundle, "link", shareFeedContent.getLink());
        Utility.putNonEmptyString(bundle, "picture", shareFeedContent.getPicture());
        Utility.putNonEmptyString(bundle, "source", shareFeedContent.getMediaSource());
        Utility.putNonEmptyString(bundle, "name", shareFeedContent.getLinkName());
        Utility.putNonEmptyString(bundle, ShareConstants.FEED_CAPTION_PARAM, shareFeedContent.getLinkCaption());
        Utility.putNonEmptyString(bundle, "description", shareFeedContent.getLinkDescription());
        return bundle;
    }

    @JvmStatic
    @NotNull
    public static final Bundle create(@NotNull ShareLinkContent shareLinkContent) {
        Bundle bundleCreateBaseParameters = createBaseParameters(shareLinkContent);
        Utility.putUri(bundleCreateBaseParameters, "href", shareLinkContent.getContentUrl());
        Utility.putNonEmptyString(bundleCreateBaseParameters, ShareConstants.WEB_DIALOG_PARAM_QUOTE, shareLinkContent.getQuote());
        return bundleCreateBaseParameters;
    }

    @JvmStatic
    @NotNull
    public static final Bundle create(@NotNull ShareOpenGraphContent shareOpenGraphContent) {
        Bundle bundleCreateBaseParameters = createBaseParameters(shareOpenGraphContent);
        ShareOpenGraphAction action = shareOpenGraphContent.getAction();
        Utility.putNonEmptyString(bundleCreateBaseParameters, ShareConstants.WEB_DIALOG_PARAM_ACTION_TYPE, action != null ? action.getActionType() : null);
        try {
            JSONObject jSONObjectRemoveNamespacesFromOGJsonObject = ShareInternalUtility.removeNamespacesFromOGJsonObject(ShareInternalUtility.toJSONObjectForWeb(shareOpenGraphContent), false);
            Utility.putNonEmptyString(bundleCreateBaseParameters, ShareConstants.WEB_DIALOG_PARAM_ACTION_PROPERTIES, jSONObjectRemoveNamespacesFromOGJsonObject != null ? jSONObjectRemoveNamespacesFromOGJsonObject.toString() : null);
            return bundleCreateBaseParameters;
        } catch (JSONException e) {
            throw new FacebookException("Unable to serialize the ShareOpenGraphContent to JSON", e);
        }
    }

    @JvmStatic
    @NotNull
    public static final Bundle create(@NotNull SharePhotoContent sharePhotoContent) {
        Bundle bundleCreateBaseParameters = createBaseParameters(sharePhotoContent);
        List<SharePhoto> photos = sharePhotoContent.getPhotos();
        if (photos == null) {
            photos = CollectionsKt__CollectionsKt.emptyList();
        }
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(photos, 10));
        Iterator<T> it2 = photos.iterator();
        while (it2.hasNext()) {
            arrayList.add(String.valueOf(((SharePhoto) it2.next()).getImageUrl()));
        }
        Object[] array = arrayList.toArray(new String[0]);
        Objects.requireNonNull(array, "null cannot be cast to non-null type kotlin.Array<T>");
        bundleCreateBaseParameters.putStringArray("media", (String[]) array);
        return bundleCreateBaseParameters;
    }
}
