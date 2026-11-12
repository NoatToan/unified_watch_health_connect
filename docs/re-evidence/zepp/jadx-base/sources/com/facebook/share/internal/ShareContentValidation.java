package com.facebook.share.internal;

import android.graphics.Bitmap;
import android.net.Uri;
import com.amap.api.mapcore.util.hl;
import com.facebook.FacebookException;
import com.facebook.FacebookSdk;
import com.facebook.internal.AnalyticsEvents;
import com.facebook.internal.Utility;
import com.facebook.internal.Validate;
import com.facebook.share.model.ShareCameraEffectContent;
import com.facebook.share.model.ShareContent;
import com.facebook.share.model.ShareLinkContent;
import com.facebook.share.model.ShareMedia;
import com.facebook.share.model.ShareMediaContent;
import com.facebook.share.model.ShareMessengerActionButton;
import com.facebook.share.model.ShareMessengerGenericTemplateContent;
import com.facebook.share.model.ShareMessengerMediaTemplateContent;
import com.facebook.share.model.ShareMessengerOpenGraphMusicTemplateContent;
import com.facebook.share.model.ShareMessengerURLActionButton;
import com.facebook.share.model.ShareOpenGraphAction;
import com.facebook.share.model.ShareOpenGraphContent;
import com.facebook.share.model.ShareOpenGraphObject;
import com.facebook.share.model.ShareOpenGraphValueContainer;
import com.facebook.share.model.SharePhoto;
import com.facebook.share.model.SharePhotoContent;
import com.facebook.share.model.ShareStoryContent;
import com.facebook.share.model.ShareVideo;
import com.facebook.share.model.ShareVideoContent;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.loc.z;
import com.ximalaya.ting.android.opensdk.constants.DTransferConstants;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Objects;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.StringCompanionObject;
import kotlin.text.StringsKt__StringsKt;
import org.cybergarage.soap.SOAP;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000´\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\bÆ\u0002\u0018\u00002\u00020\u0001:\u0004\f*O\u0012B\t\b\u0002¢\u0006\u0004\bM\u0010NJ\u001a\u0010\u0005\u001a\u00020\u00042\u0010\u0010\u0003\u001a\f\u0012\u0002\b\u0003\u0012\u0002\b\u0003\u0018\u00010\u0002H\u0007J\u001a\u0010\u0006\u001a\u00020\u00042\u0010\u0010\u0003\u001a\f\u0012\u0002\b\u0003\u0012\u0002\b\u0003\u0018\u00010\u0002H\u0007J\u001a\u0010\u0007\u001a\u00020\u00042\u0010\u0010\u0003\u001a\f\u0012\u0002\b\u0003\u0012\u0002\b\u0003\u0018\u00010\u0002H\u0007J\u001a\u0010\b\u001a\u00020\u00042\u0010\u0010\u0003\u001a\f\u0012\u0002\b\u0003\u0012\u0002\b\u0003\u0018\u00010\u0002H\u0007J\u001a\u0010\t\u001a\u00020\u00042\u0010\u0010\u0003\u001a\f\u0012\u0002\b\u0003\u0012\u0002\b\u0003\u0018\u00010\u0002H\u0007J\"\u0010\f\u001a\u00020\u00042\u0010\u0010\u0003\u001a\f\u0012\u0002\b\u0003\u0012\u0002\b\u0003\u0018\u00010\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0002J\u001a\u0010\u000f\u001a\u00020\u00042\b\u0010\u000e\u001a\u0004\u0018\u00010\r2\u0006\u0010\u000b\u001a\u00020\nH\u0002J\u0018\u0010\u0012\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\nH\u0002J\u0018\u0010\u0015\u001a\u00020\u00042\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u000b\u001a\u00020\nH\u0002J\u0012\u0010\u0018\u001a\u00020\u00042\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016H\u0002J\u0018\u0010\u0019\u001a\u00020\u00042\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u000b\u001a\u00020\nH\u0002J\u0018\u0010\u001a\u001a\u00020\u00042\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u000b\u001a\u00020\nH\u0002J\u0018\u0010\u001b\u001a\u00020\u00042\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u000b\u001a\u00020\nH\u0002J\u0018\u0010\u001e\u001a\u00020\u00042\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u000b\u001a\u00020\nH\u0002J\u001a\u0010!\u001a\u00020\u00042\b\u0010 \u001a\u0004\u0018\u00010\u001f2\u0006\u0010\u000b\u001a\u00020\nH\u0002J\u0018\u0010$\u001a\u00020\u00042\u0006\u0010#\u001a\u00020\"2\u0006\u0010\u000b\u001a\u00020\nH\u0002J\u0018\u0010'\u001a\u00020\u00042\u0006\u0010&\u001a\u00020%2\u0006\u0010\u000b\u001a\u00020\nH\u0007J\u0010\u0010*\u001a\u00020\u00042\u0006\u0010)\u001a\u00020(H\u0002J\u0018\u0010-\u001a\u00020\u00042\u0006\u0010,\u001a\u00020+2\u0006\u0010\u000b\u001a\u00020\nH\u0002J\u001a\u00100\u001a\u00020\u00042\b\u0010/\u001a\u0004\u0018\u00010.2\u0006\u0010\u000b\u001a\u00020\nH\u0002J\u001a\u00103\u001a\u00020\u00042\b\u00102\u001a\u0004\u0018\u0001012\u0006\u0010\u000b\u001a\u00020\nH\u0002J(\u00108\u001a\u00020\u00042\u000e\u00105\u001a\n\u0012\u0002\b\u0003\u0012\u0002\b\u0003042\u0006\u0010\u000b\u001a\u00020\n2\u0006\u00107\u001a\u000206H\u0002J\u0010\u0010:\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u000209H\u0002J\u0010\u0010<\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020;H\u0002J\u0010\u0010>\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020=H\u0002J\u0012\u0010A\u001a\u00020\u00042\b\u0010@\u001a\u0004\u0018\u00010?H\u0002J\u0010\u0010C\u001a\u00020\u00042\u0006\u0010@\u001a\u00020BH\u0002J\u0018\u0010F\u001a\u00020\u00042\u0006\u0010E\u001a\u00020D2\u0006\u00107\u001a\u000206H\u0002J\u001a\u0010G\u001a\u00020\u00042\b\u0010\u001a\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u000b\u001a\u00020\nH\u0002R\u0016\u0010I\u001a\u00020\n8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010HR\u0016\u0010J\u001a\u00020\n8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010HR\u0016\u0010K\u001a\u00020\n8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010HR\u0016\u0010L\u001a\u00020\n8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010H¨\u0006P"}, d2 = {"Lcom/facebook/share/internal/ShareContentValidation;", "", "Lcom/facebook/share/model/ShareContent;", "content", "", "validateForMessage", "validateForNativeShare", "validateForWebShare", "validateForApiShare", "validateForStoryShare", "Lcom/facebook/share/internal/ShareContentValidation$Validator;", "validator", "a", "Lcom/facebook/share/model/ShareStoryContent;", "storyContent", "u", "Lcom/facebook/share/model/ShareLinkContent;", "linkContent", "c", "Lcom/facebook/share/model/SharePhotoContent;", "photoContent", "m", "Lcom/facebook/share/model/SharePhoto;", AnalyticsEvents.PARAMETER_SHARE_DIALOG_CONTENT_PHOTO, "l", GoogleApiAvailabilityLight.b, "o", com.google.android.exoplayer2.text.ttml.b.r, "Lcom/facebook/share/model/ShareVideoContent;", "videoContent", "w", "Lcom/facebook/share/model/ShareVideo;", "video", "v", "Lcom/facebook/share/model/ShareMediaContent;", "mediaContent", GoogleApiAvailabilityLight.a, "Lcom/facebook/share/model/ShareMedia;", FirebaseAnalytics.Param.MEDIUM, "validateMedium", "Lcom/facebook/share/model/ShareCameraEffectContent;", "cameraEffectContent", "b", "Lcom/facebook/share/model/ShareOpenGraphContent;", "openGraphContent", "g", "Lcom/facebook/share/model/ShareOpenGraphAction;", "openGraphAction", "f", "Lcom/facebook/share/model/ShareOpenGraphObject;", "openGraphObject", "i", "Lcom/facebook/share/model/ShareOpenGraphValueContainer;", "valueContainer", "", "requireNamespace", z.j, "Lcom/facebook/share/model/ShareMessengerOpenGraphMusicTemplateContent;", "e", "Lcom/facebook/share/model/ShareMessengerGenericTemplateContent;", "r", "Lcom/facebook/share/model/ShareMessengerMediaTemplateContent;", SOAP.XMLNS, "Lcom/facebook/share/model/ShareMessengerActionButton;", "button", DTransferConstants.SEARCH_KEY, "Lcom/facebook/share/model/ShareMessengerURLActionButton;", "t", "", "key", "h", hl.k, "Lcom/facebook/share/internal/ShareContentValidation$Validator;", "webShareValidator", "defaultValidator", "apiValidator", "storyValidator", "<init>", "()V", "Validator", "facebook-common_release"}, k = 1, mv = {1, 5, 1})
public final class ShareContentValidation {

    @NotNull
    public static final ShareContentValidation INSTANCE = new ShareContentValidation();

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private static final Validator webShareValidator = new c();

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private static final Validator defaultValidator = new Validator();

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private static final Validator apiValidator = new a();

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private static final Validator storyValidator = new b();

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0016\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b)\u0010*J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\bH\u0016J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\nH\u0016J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\fH\u0016J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u000eH\u0016J\u0012\u0010\u0005\u001a\u00020\u00042\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0016J\u0012\u0010\u0005\u001a\u00020\u00042\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012H\u0016J \u0010\u0005\u001a\u00020\u00042\u000e\u0010\u0015\u001a\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u00142\u0006\u0010\u0017\u001a\u00020\u0016H\u0016J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0019\u001a\u00020\u0018H\u0016J\u0012\u0010\u0005\u001a\u00020\u00042\b\u0010\u001b\u001a\u0004\u0018\u00010\u001aH\u0016J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u001d\u001a\u00020\u001cH\u0016J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u001f\u001a\u00020\u001eH\u0016J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u001f\u001a\u00020 H\u0016J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u001f\u001a\u00020!H\u0016J\u0012\u0010\u0005\u001a\u00020\u00042\b\u0010#\u001a\u0004\u0018\u00010\"H\u0016R$\u0010'\u001a\u00020\u00162\u0006\u0010$\u001a\u00020\u00168\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(¨\u0006+"}, d2 = {"Lcom/facebook/share/internal/ShareContentValidation$Validator;", "", "Lcom/facebook/share/model/ShareLinkContent;", "linkContent", "", com.alipay.sdk.m.l.c.j, "Lcom/facebook/share/model/SharePhotoContent;", "photoContent", "Lcom/facebook/share/model/ShareVideoContent;", "videoContent", "Lcom/facebook/share/model/ShareMediaContent;", "mediaContent", "Lcom/facebook/share/model/ShareCameraEffectContent;", "cameraEffectContent", "Lcom/facebook/share/model/ShareOpenGraphContent;", "openGraphContent", "Lcom/facebook/share/model/ShareOpenGraphAction;", "openGraphAction", "Lcom/facebook/share/model/ShareOpenGraphObject;", "openGraphObject", "Lcom/facebook/share/model/ShareOpenGraphValueContainer;", "openGraphValueContainer", "", "requireNamespace", "Lcom/facebook/share/model/SharePhoto;", AnalyticsEvents.PARAMETER_SHARE_DIALOG_CONTENT_PHOTO, "Lcom/facebook/share/model/ShareVideo;", "video", "Lcom/facebook/share/model/ShareMedia;", FirebaseAnalytics.Param.MEDIUM, "Lcom/facebook/share/model/ShareMessengerOpenGraphMusicTemplateContent;", "content", "Lcom/facebook/share/model/ShareMessengerGenericTemplateContent;", "Lcom/facebook/share/model/ShareMessengerMediaTemplateContent;", "Lcom/facebook/share/model/ShareStoryContent;", "storyContent", "<set-?>", "a", "Z", "isOpenGraphContent", "()Z", "<init>", "()V", "facebook-common_release"}, k = 1, mv = {1, 5, 1})
    public static class Validator {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private boolean isOpenGraphContent;

        /* JADX INFO: renamed from: isOpenGraphContent, reason: from getter */
        public final boolean getIsOpenGraphContent() {
            return this.isOpenGraphContent;
        }

        public void validate(@NotNull ShareLinkContent linkContent) {
            ShareContentValidation.INSTANCE.c(linkContent, this);
        }

        public void validate(@NotNull SharePhotoContent photoContent) {
            ShareContentValidation.INSTANCE.m(photoContent, this);
        }

        public void validate(@NotNull ShareVideoContent videoContent) {
            ShareContentValidation.INSTANCE.w(videoContent, this);
        }

        public void validate(@NotNull ShareMediaContent mediaContent) {
            ShareContentValidation.INSTANCE.d(mediaContent, this);
        }

        public void validate(@NotNull ShareCameraEffectContent cameraEffectContent) {
            ShareContentValidation.INSTANCE.b(cameraEffectContent);
        }

        public void validate(@NotNull ShareOpenGraphContent openGraphContent) {
            this.isOpenGraphContent = true;
            ShareContentValidation.INSTANCE.g(openGraphContent, this);
        }

        public void validate(@Nullable ShareOpenGraphAction openGraphAction) {
            ShareContentValidation.INSTANCE.f(openGraphAction, this);
        }

        public void validate(@Nullable ShareOpenGraphObject openGraphObject) {
            ShareContentValidation.INSTANCE.i(openGraphObject, this);
        }

        public void validate(@NotNull ShareOpenGraphValueContainer<?, ?> openGraphValueContainer, boolean requireNamespace) {
            ShareContentValidation.INSTANCE.j(openGraphValueContainer, this, requireNamespace);
        }

        public void validate(@NotNull SharePhoto photo) {
            ShareContentValidation.INSTANCE.o(photo, this);
        }

        public void validate(@Nullable ShareVideo video) {
            ShareContentValidation.INSTANCE.v(video, this);
        }

        public void validate(@NotNull ShareMedia medium) {
            ShareContentValidation.validateMedium(medium, this);
        }

        public void validate(@NotNull ShareMessengerOpenGraphMusicTemplateContent content) {
            ShareContentValidation.INSTANCE.e(content);
        }

        public void validate(@NotNull ShareMessengerGenericTemplateContent content) {
            ShareContentValidation.INSTANCE.r(content);
        }

        public void validate(@NotNull ShareMessengerMediaTemplateContent content) {
            ShareContentValidation.INSTANCE.s(content);
        }

        public void validate(@Nullable ShareStoryContent storyContent) {
            ShareContentValidation.INSTANCE.u(storyContent, this);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\bH\u0016J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\nH\u0016¨\u0006\u000e"}, d2 = {"com/facebook/share/internal/ShareContentValidation$a", "Lcom/facebook/share/internal/ShareContentValidation$Validator;", "Lcom/facebook/share/model/SharePhoto;", AnalyticsEvents.PARAMETER_SHARE_DIALOG_CONTENT_PHOTO, "", com.alipay.sdk.m.l.c.j, "Lcom/facebook/share/model/ShareVideoContent;", "videoContent", "Lcom/facebook/share/model/ShareMediaContent;", "mediaContent", "Lcom/facebook/share/model/ShareLinkContent;", "linkContent", "<init>", "()V", "facebook-common_release"}, k = 1, mv = {1, 5, 1})
    public static final class a extends Validator {
        @Override // com.facebook.share.internal.ShareContentValidation.Validator
        public void validate(@NotNull SharePhoto photo) {
            ShareContentValidation.INSTANCE.n(photo, this);
        }

        @Override // com.facebook.share.internal.ShareContentValidation.Validator
        public void validate(@NotNull ShareVideoContent videoContent) {
            if (!Utility.isNullOrEmpty(videoContent.getPlaceId())) {
                throw new FacebookException("Cannot share video content with place IDs using the share api");
            }
            if (!Utility.isNullOrEmpty(videoContent.getPeopleIds())) {
                throw new FacebookException("Cannot share video content with people IDs using the share api");
            }
            if (!Utility.isNullOrEmpty(videoContent.getRef())) {
                throw new FacebookException("Cannot share video content with referrer URL using the share api");
            }
        }

        @Override // com.facebook.share.internal.ShareContentValidation.Validator
        public void validate(@NotNull ShareMediaContent mediaContent) {
            throw new FacebookException("Cannot share ShareMediaContent using the share api");
        }

        @Override // com.facebook.share.internal.ShareContentValidation.Validator
        public void validate(@NotNull ShareLinkContent linkContent) {
            if (!Utility.isNullOrEmpty(linkContent.getQuote())) {
                throw new FacebookException("Cannot share link content with quote using the share api");
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0006\u0010\u0007J\u0012\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016¨\u0006\b"}, d2 = {"com/facebook/share/internal/ShareContentValidation$b", "Lcom/facebook/share/internal/ShareContentValidation$Validator;", "Lcom/facebook/share/model/ShareStoryContent;", "storyContent", "", com.alipay.sdk.m.l.c.j, "<init>", "()V", "facebook-common_release"}, k = 1, mv = {1, 5, 1})
    public static final class b extends Validator {
        @Override // com.facebook.share.internal.ShareContentValidation.Validator
        public void validate(@Nullable ShareStoryContent storyContent) {
            ShareContentValidation.INSTANCE.u(storyContent, this);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\bH\u0016¨\u0006\f"}, d2 = {"com/facebook/share/internal/ShareContentValidation$c", "Lcom/facebook/share/internal/ShareContentValidation$Validator;", "Lcom/facebook/share/model/ShareVideoContent;", "videoContent", "", com.alipay.sdk.m.l.c.j, "Lcom/facebook/share/model/ShareMediaContent;", "mediaContent", "Lcom/facebook/share/model/SharePhoto;", AnalyticsEvents.PARAMETER_SHARE_DIALOG_CONTENT_PHOTO, "<init>", "()V", "facebook-common_release"}, k = 1, mv = {1, 5, 1})
    public static final class c extends Validator {
        @Override // com.facebook.share.internal.ShareContentValidation.Validator
        public void validate(@NotNull ShareVideoContent videoContent) {
            throw new FacebookException("Cannot share ShareVideoContent via web sharing dialogs");
        }

        @Override // com.facebook.share.internal.ShareContentValidation.Validator
        public void validate(@NotNull ShareMediaContent mediaContent) {
            throw new FacebookException("Cannot share ShareMediaContent via web sharing dialogs");
        }

        @Override // com.facebook.share.internal.ShareContentValidation.Validator
        public void validate(@NotNull SharePhoto photo) {
            ShareContentValidation.INSTANCE.p(photo, this);
        }
    }

    private ShareContentValidation() {
    }

    private final void a(ShareContent<?, ?> content, Validator validator) throws FacebookException {
        if (content == null) {
            throw new FacebookException("Must provide non-null content to share");
        }
        if (content instanceof ShareLinkContent) {
            validator.validate((ShareLinkContent) content);
            return;
        }
        if (content instanceof SharePhotoContent) {
            validator.validate((SharePhotoContent) content);
            return;
        }
        if (content instanceof ShareVideoContent) {
            validator.validate((ShareVideoContent) content);
            return;
        }
        if (content instanceof ShareOpenGraphContent) {
            validator.validate((ShareOpenGraphContent) content);
            return;
        }
        if (content instanceof ShareMediaContent) {
            validator.validate((ShareMediaContent) content);
            return;
        }
        if (content instanceof ShareCameraEffectContent) {
            validator.validate((ShareCameraEffectContent) content);
            return;
        }
        if (content instanceof ShareMessengerOpenGraphMusicTemplateContent) {
            validator.validate((ShareMessengerOpenGraphMusicTemplateContent) content);
            return;
        }
        if (content instanceof ShareMessengerMediaTemplateContent) {
            validator.validate((ShareMessengerMediaTemplateContent) content);
        } else if (content instanceof ShareMessengerGenericTemplateContent) {
            validator.validate((ShareMessengerGenericTemplateContent) content);
        } else if (content instanceof ShareStoryContent) {
            validator.validate((ShareStoryContent) content);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void b(ShareCameraEffectContent cameraEffectContent) {
        if (Utility.isNullOrEmpty(cameraEffectContent.getEffectId())) {
            throw new FacebookException("Must specify a non-empty effectId");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void c(ShareLinkContent linkContent, Validator validator) {
        Uri imageUrl = linkContent.getImageUrl();
        if (imageUrl != null && !Utility.isWebUri(imageUrl)) {
            throw new FacebookException("Image Url must be an http:// or https:// url");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void d(ShareMediaContent mediaContent, Validator validator) {
        List<ShareMedia> media = mediaContent.getMedia();
        if (media == null || media.isEmpty()) {
            throw new FacebookException("Must specify at least one medium in ShareMediaContent.");
        }
        if (media.size() > 6) {
            StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
            throw new FacebookException(String.format(Locale.ROOT, "Cannot add more than %d media.", Arrays.copyOf(new Object[]{6}, 1)));
        }
        Iterator<ShareMedia> it2 = media.iterator();
        while (it2.hasNext()) {
            validator.validate(it2.next());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void e(ShareMessengerOpenGraphMusicTemplateContent content) {
        if (Utility.isNullOrEmpty(content.getPageId())) {
            throw new FacebookException("Must specify Page Id for ShareMessengerOpenGraphMusicTemplateContent");
        }
        if (content.getUrl() == null) {
            throw new FacebookException("Must specify url for ShareMessengerOpenGraphMusicTemplateContent");
        }
        q(content.getButton());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void f(ShareOpenGraphAction openGraphAction, Validator validator) {
        if (openGraphAction == null) {
            throw new FacebookException("Must specify a non-null ShareOpenGraphAction");
        }
        if (Utility.isNullOrEmpty(openGraphAction.getActionType())) {
            throw new FacebookException("ShareOpenGraphAction must have a non-empty actionType");
        }
        validator.validate(openGraphAction, false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void g(ShareOpenGraphContent openGraphContent, Validator validator) {
        validator.validate(openGraphContent.getAction());
        String previewPropertyName = openGraphContent.getPreviewPropertyName();
        if (Utility.isNullOrEmpty(previewPropertyName)) {
            throw new FacebookException("Must specify a previewPropertyName.");
        }
        ShareOpenGraphAction action = openGraphContent.getAction();
        if (action == null || action.get(previewPropertyName) == null) {
            throw new FacebookException("Property \"" + previewPropertyName + "\" was not found on the action. The name of the preview property must match the name of an action property.");
        }
    }

    private final void h(String key, boolean requireNamespace) {
        if (requireNamespace) {
            Object[] array = StringsKt__StringsKt.split$default((CharSequence) key, new String[]{":"}, false, 0, 6, (Object) null).toArray(new String[0]);
            Objects.requireNonNull(array, "null cannot be cast to non-null type kotlin.Array<T>");
            String[] strArr = (String[]) array;
            if (strArr.length < 2) {
                throw new FacebookException("Open Graph keys must be namespaced: %s", key);
            }
            for (String str : strArr) {
                if (str.length() == 0) {
                    throw new FacebookException("Invalid key found in Open Graph dictionary: %s", key);
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void i(ShareOpenGraphObject openGraphObject, Validator validator) {
        if (openGraphObject == null) {
            throw new FacebookException("Cannot share a null ShareOpenGraphObject");
        }
        validator.validate(openGraphObject, true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void j(ShareOpenGraphValueContainer<?, ?> valueContainer, Validator validator, boolean requireNamespace) {
        for (String str : valueContainer.keySet()) {
            h(str, requireNamespace);
            Object obj = valueContainer.get(str);
            if (obj instanceof List) {
                for (Object obj2 : (List) obj) {
                    if (obj2 == null) {
                        throw new FacebookException("Cannot put null objects in Lists in ShareOpenGraphObjects and ShareOpenGraphActions");
                    }
                    k(obj2, validator);
                }
            } else {
                k(obj, validator);
            }
        }
    }

    private final void k(Object o, Validator validator) {
        if (o instanceof ShareOpenGraphObject) {
            validator.validate((ShareOpenGraphObject) o);
        } else if (o instanceof SharePhoto) {
            validator.validate((SharePhoto) o);
        }
    }

    private final void l(SharePhoto photo) {
        if (photo == null) {
            throw new FacebookException("Cannot share a null SharePhoto");
        }
        Bitmap bitmap = photo.getBitmap();
        Uri imageUrl = photo.getImageUrl();
        if (bitmap == null && imageUrl == null) {
            throw new FacebookException("SharePhoto does not have a Bitmap or ImageUrl specified");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void m(SharePhotoContent photoContent, Validator validator) {
        List<SharePhoto> photos = photoContent.getPhotos();
        if (photos == null || photos.isEmpty()) {
            throw new FacebookException("Must specify at least one Photo in SharePhotoContent.");
        }
        if (photos.size() > 6) {
            StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
            throw new FacebookException(String.format(Locale.ROOT, "Cannot add more than %d photos.", Arrays.copyOf(new Object[]{6}, 1)));
        }
        Iterator<SharePhoto> it2 = photos.iterator();
        while (it2.hasNext()) {
            validator.validate(it2.next());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void n(SharePhoto photo, Validator validator) {
        l(photo);
        Bitmap bitmap = photo.getBitmap();
        Uri imageUrl = photo.getImageUrl();
        if (bitmap == null && Utility.isWebUri(imageUrl) && !validator.getIsOpenGraphContent()) {
            throw new FacebookException("Cannot set the ImageUrl of a SharePhoto to the Uri of an image on the web when sharing SharePhotoContent");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void o(SharePhoto photo, Validator validator) {
        n(photo, validator);
        if (photo.getBitmap() == null && Utility.isWebUri(photo.getImageUrl())) {
            return;
        }
        Validate.hasContentProvider(FacebookSdk.getApplicationContext());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void p(SharePhoto photo, Validator validator) {
        l(photo);
    }

    private final void q(ShareMessengerActionButton button) {
        if (button == null) {
            return;
        }
        if (Utility.isNullOrEmpty(button.getTitle())) {
            throw new FacebookException("Must specify title for ShareMessengerActionButton");
        }
        if (button instanceof ShareMessengerURLActionButton) {
            t((ShareMessengerURLActionButton) button);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void r(ShareMessengerGenericTemplateContent content) {
        if (Utility.isNullOrEmpty(content.getPageId())) {
            throw new FacebookException("Must specify Page Id for ShareMessengerGenericTemplateContent");
        }
        if (content.getGenericTemplateElement() == null) {
            throw new FacebookException("Must specify element for ShareMessengerGenericTemplateContent");
        }
        if (Utility.isNullOrEmpty(content.getGenericTemplateElement().getTitle())) {
            throw new FacebookException("Must specify title for ShareMessengerGenericTemplateElement");
        }
        q(content.getGenericTemplateElement().getButton());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void s(ShareMessengerMediaTemplateContent content) {
        if (Utility.isNullOrEmpty(content.getPageId())) {
            throw new FacebookException("Must specify Page Id for ShareMessengerMediaTemplateContent");
        }
        if (content.getMediaUrl() == null && Utility.isNullOrEmpty(content.getAttachmentId())) {
            throw new FacebookException("Must specify either attachmentId or mediaURL for ShareMessengerMediaTemplateContent");
        }
        q(content.getButton());
    }

    private final void t(ShareMessengerURLActionButton button) {
        if (button.getUrl() == null) {
            throw new FacebookException("Must specify url for ShareMessengerURLActionButton");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void u(ShareStoryContent storyContent, Validator validator) {
        if (storyContent == null || (storyContent.getBackgroundAsset() == null && storyContent.getStickerAsset() == null)) {
            throw new FacebookException("Must pass the Facebook app a background asset, a sticker asset, or both");
        }
        if (storyContent.getBackgroundAsset() != null) {
            validator.validate(storyContent.getBackgroundAsset());
        }
        if (storyContent.getStickerAsset() != null) {
            validator.validate(storyContent.getStickerAsset());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void v(ShareVideo video, Validator validator) {
        if (video == null) {
            throw new FacebookException("Cannot share a null ShareVideo");
        }
        Uri localUrl = video.getLocalUrl();
        if (localUrl == null) {
            throw new FacebookException("ShareVideo does not have a LocalUrl specified");
        }
        if (!Utility.isContentUri(localUrl) && !Utility.isFileUri(localUrl)) {
            throw new FacebookException("ShareVideo must reference a video that is on the device");
        }
    }

    @JvmStatic
    public static final void validateForApiShare(@Nullable ShareContent<?, ?> content) {
        INSTANCE.a(content, apiValidator);
    }

    @JvmStatic
    public static final void validateForMessage(@Nullable ShareContent<?, ?> content) {
        INSTANCE.a(content, defaultValidator);
    }

    @JvmStatic
    public static final void validateForNativeShare(@Nullable ShareContent<?, ?> content) {
        INSTANCE.a(content, defaultValidator);
    }

    @JvmStatic
    public static final void validateForStoryShare(@Nullable ShareContent<?, ?> content) {
        INSTANCE.a(content, storyValidator);
    }

    @JvmStatic
    public static final void validateForWebShare(@Nullable ShareContent<?, ?> content) {
        INSTANCE.a(content, webShareValidator);
    }

    @JvmStatic
    public static final void validateMedium(@NotNull ShareMedia medium, @NotNull Validator validator) {
        if (medium instanceof SharePhoto) {
            validator.validate((SharePhoto) medium);
        } else if (medium instanceof ShareVideo) {
            validator.validate((ShareVideo) medium);
        } else {
            StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
            throw new FacebookException(String.format(Locale.ROOT, "Invalid media type: %s", Arrays.copyOf(new Object[]{medium.getClass().getSimpleName()}, 1)));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void w(ShareVideoContent videoContent, Validator validator) {
        validator.validate(videoContent.getVideo());
        SharePhoto previewPhoto = videoContent.getPreviewPhoto();
        if (previewPhoto != null) {
            validator.validate(previewPhoto);
        }
    }
}
