package com.facebook.share.internal;

import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.os.ParcelFileDescriptor;
import android.util.Pair;
import androidx.annotation.Nullable;
import com.facebook.AccessToken;
import com.facebook.CallbackManager;
import com.facebook.FacebookCallback;
import com.facebook.FacebookException;
import com.facebook.FacebookGraphResponseException;
import com.facebook.FacebookOperationCanceledException;
import com.facebook.FacebookRequestError;
import com.facebook.FacebookSdk;
import com.facebook.GraphRequest;
import com.facebook.GraphResponse;
import com.facebook.HttpMethod;
import com.facebook.appevents.InternalAppEventsLogger;
import com.facebook.devicerequests.internal.DeviceRequestsHelper;
import com.facebook.internal.AnalyticsEvents;
import com.facebook.internal.AppCall;
import com.facebook.internal.CallbackManagerImpl;
import com.facebook.internal.NativeAppCallAttachmentStore;
import com.facebook.internal.NativeProtocol;
import com.facebook.internal.Utility;
import com.facebook.internal.instrument.crashshield.CrashShieldHandler;
import com.facebook.share.Sharer;
import com.facebook.share.model.CameraEffectTextures;
import com.facebook.share.model.ShareCameraEffectContent;
import com.facebook.share.model.ShareMedia;
import com.facebook.share.model.ShareMediaContent;
import com.facebook.share.model.ShareOpenGraphAction;
import com.facebook.share.model.ShareOpenGraphContent;
import com.facebook.share.model.SharePhoto;
import com.facebook.share.model.SharePhotoContent;
import com.facebook.share.model.ShareStoryContent;
import com.facebook.share.model.ShareVideo;
import com.facebook.share.model.ShareVideoContent;
import com.facebook.share.widget.LikeView;
import com.huami.watch.transport.httpsupport.model.DataItem;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.UUID;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public final class ShareInternalUtility {
    public static final String MY_PHOTOS = "me/photos";
    public static final String a = "me/staging_resources";
    public static final String b = "file";

    public static class a implements Utility.Mapper<NativeAppCallAttachmentStore.Attachment, Bundle> {
        @Override // com.facebook.internal.Utility.Mapper
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Bundle apply(NativeAppCallAttachmentStore.Attachment attachment) {
            Bundle bundle = new Bundle();
            bundle.putString("uri", attachment.getAttachmentUrl());
            String uriExtension = ShareInternalUtility.getUriExtension(attachment.getOriginalUri());
            if (uriExtension != null) {
                Utility.putNonEmptyString(bundle, "extension", uriExtension);
            }
            return bundle;
        }
    }

    public static class b implements Utility.Mapper<ShareMedia, Bundle> {
        public final /* synthetic */ UUID a;
        public final /* synthetic */ List b;

        public b(UUID uuid, List list) {
            this.a = uuid;
            this.b = list;
        }

        @Override // com.facebook.internal.Utility.Mapper
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Bundle apply(ShareMedia shareMedia) {
            NativeAppCallAttachmentStore.Attachment attachmentA = ShareInternalUtility.a(this.a, shareMedia);
            this.b.add(attachmentA);
            Bundle bundle = new Bundle();
            bundle.putString("type", shareMedia.getMediaType().name());
            bundle.putString("uri", attachmentA.getAttachmentUrl());
            String uriExtension = ShareInternalUtility.getUriExtension(attachmentA.getOriginalUri());
            if (uriExtension != null) {
                Utility.putNonEmptyString(bundle, "extension", uriExtension);
            }
            return bundle;
        }
    }

    public static class c extends ResultProcessor {
        public final /* synthetic */ FacebookCallback b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(FacebookCallback facebookCallback, FacebookCallback facebookCallback2) {
            super(facebookCallback);
            this.b = facebookCallback2;
        }

        @Override // com.facebook.share.internal.ResultProcessor
        public void onCancel(AppCall appCall) {
            ShareInternalUtility.e(this.b);
        }

        @Override // com.facebook.share.internal.ResultProcessor
        public void onError(AppCall appCall, FacebookException facebookException) {
            ShareInternalUtility.f(this.b, facebookException);
        }

        @Override // com.facebook.share.internal.ResultProcessor
        public void onSuccess(AppCall appCall, Bundle bundle) {
            if (bundle != null) {
                String nativeDialogCompletionGesture = ShareInternalUtility.getNativeDialogCompletionGesture(bundle);
                if (nativeDialogCompletionGesture != null && !DataItem.HTTP_METHOD_POST.equalsIgnoreCase(nativeDialogCompletionGesture)) {
                    if (com.twitter.sdk.android.tweetcomposer.g.g.equalsIgnoreCase(nativeDialogCompletionGesture)) {
                        ShareInternalUtility.e(this.b);
                        return;
                    } else {
                        ShareInternalUtility.f(this.b, new FacebookException(NativeProtocol.ERROR_UNKNOWN_ERROR));
                        return;
                    }
                }
                String shareDialogPostId = ShareInternalUtility.getShareDialogPostId(bundle);
                if (shareDialogPostId != null) {
                    ShareInternalUtility.i(this.b, shareDialogPostId);
                } else {
                    ShareInternalUtility.f(this.b, new FacebookException(NativeProtocol.ERROR_UNKNOWN_ERROR));
                }
            }
        }
    }

    public static class d implements CallbackManagerImpl.Callback {
        public final /* synthetic */ int a;

        public d(int i) {
            this.a = i;
        }

        @Override // com.facebook.internal.CallbackManagerImpl.Callback
        public boolean onActivityResult(int i, Intent intent) {
            return ShareInternalUtility.handleActivityResult(this.a, i, intent, ShareInternalUtility.getShareResultProcessor(null));
        }
    }

    public static class e implements CallbackManagerImpl.Callback {
        public final /* synthetic */ int a;
        public final /* synthetic */ FacebookCallback b;

        public e(int i, FacebookCallback facebookCallback) {
            this.a = i;
            this.b = facebookCallback;
        }

        @Override // com.facebook.internal.CallbackManagerImpl.Callback
        public boolean onActivityResult(int i, Intent intent) {
            return ShareInternalUtility.handleActivityResult(this.a, i, intent, ShareInternalUtility.getShareResultProcessor(this.b));
        }
    }

    public static class f implements Utility.Mapper<SharePhoto, NativeAppCallAttachmentStore.Attachment> {
        public final /* synthetic */ UUID a;

        public f(UUID uuid) {
            this.a = uuid;
        }

        @Override // com.facebook.internal.Utility.Mapper
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public NativeAppCallAttachmentStore.Attachment apply(SharePhoto sharePhoto) {
            return ShareInternalUtility.a(this.a, sharePhoto);
        }
    }

    public static class g implements Utility.Mapper<NativeAppCallAttachmentStore.Attachment, String> {
        @Override // com.facebook.internal.Utility.Mapper
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public String apply(NativeAppCallAttachmentStore.Attachment attachment) {
            return attachment.getAttachmentUrl();
        }
    }

    public static class h implements Utility.Mapper<ShareMedia, Bundle> {
        public final /* synthetic */ UUID a;
        public final /* synthetic */ List b;

        public h(UUID uuid, List list) {
            this.a = uuid;
            this.b = list;
        }

        @Override // com.facebook.internal.Utility.Mapper
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Bundle apply(ShareMedia shareMedia) {
            NativeAppCallAttachmentStore.Attachment attachmentA = ShareInternalUtility.a(this.a, shareMedia);
            this.b.add(attachmentA);
            Bundle bundle = new Bundle();
            bundle.putString("type", shareMedia.getMediaType().name());
            bundle.putString("uri", attachmentA.getAttachmentUrl());
            return bundle;
        }
    }

    public static class i implements OpenGraphJSONUtility.PhotoJSONProcessor {
        public final /* synthetic */ UUID a;
        public final /* synthetic */ ArrayList b;

        public i(UUID uuid, ArrayList arrayList) {
            this.a = uuid;
            this.b = arrayList;
        }

        @Override // com.facebook.share.internal.OpenGraphJSONUtility.PhotoJSONProcessor
        public JSONObject toJSONObject(SharePhoto sharePhoto) {
            NativeAppCallAttachmentStore.Attachment attachmentA = ShareInternalUtility.a(this.a, sharePhoto);
            if (attachmentA == null) {
                return null;
            }
            this.b.add(attachmentA);
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("url", attachmentA.getAttachmentUrl());
                if (sharePhoto.getUserGenerated()) {
                    jSONObject.put(NativeProtocol.IMAGE_USER_GENERATED_KEY, true);
                }
                return jSONObject;
            } catch (JSONException e) {
                throw new FacebookException("Unable to attach images", e);
            }
        }
    }

    public static class j implements OpenGraphJSONUtility.PhotoJSONProcessor {
        @Override // com.facebook.share.internal.OpenGraphJSONUtility.PhotoJSONProcessor
        public JSONObject toJSONObject(SharePhoto sharePhoto) {
            Uri imageUrl = sharePhoto.getImageUrl();
            if (!Utility.isWebUri(imageUrl)) {
                throw new FacebookException("Only web images may be used in OG objects shared via the web dialog");
            }
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("url", imageUrl.toString());
                return jSONObject;
            } catch (JSONException e) {
                throw new FacebookException("Unable to attach images", e);
            }
        }
    }

    public static class k implements Utility.Mapper<SharePhoto, NativeAppCallAttachmentStore.Attachment> {
        public final /* synthetic */ UUID a;

        public k(UUID uuid) {
            this.a = uuid;
        }

        @Override // com.facebook.internal.Utility.Mapper
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public NativeAppCallAttachmentStore.Attachment apply(SharePhoto sharePhoto) {
            return ShareInternalUtility.a(this.a, sharePhoto);
        }
    }

    public static /* synthetic */ NativeAppCallAttachmentStore.Attachment a(UUID uuid, ShareMedia shareMedia) {
        if (CrashShieldHandler.isObjectCrashing(ShareInternalUtility.class)) {
            return null;
        }
        try {
            return d(uuid, shareMedia);
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, ShareInternalUtility.class);
            return null;
        }
    }

    private static AppCall b(int i2, int i3, Intent intent) {
        if (CrashShieldHandler.isObjectCrashing(ShareInternalUtility.class)) {
            return null;
        }
        try {
            UUID callIdFromIntent = NativeProtocol.getCallIdFromIntent(intent);
            if (callIdFromIntent == null) {
                return null;
            }
            return AppCall.finishPendingCall(callIdFromIntent, i2);
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, ShareInternalUtility.class);
            return null;
        }
    }

    private static NativeAppCallAttachmentStore.Attachment c(UUID uuid, Uri uri, Bitmap bitmap) {
        NativeAppCallAttachmentStore.Attachment attachmentCreateAttachment = null;
        if (CrashShieldHandler.isObjectCrashing(ShareInternalUtility.class)) {
            return null;
        }
        try {
            if (bitmap == null) {
                if (uri != null) {
                    attachmentCreateAttachment = NativeAppCallAttachmentStore.createAttachment(uuid, uri);
                }
                return attachmentCreateAttachment;
            }
            attachmentCreateAttachment = NativeAppCallAttachmentStore.createAttachment(uuid, bitmap);
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, ShareInternalUtility.class);
        }
        return attachmentCreateAttachment;
    }

    private static NativeAppCallAttachmentStore.Attachment d(UUID uuid, ShareMedia shareMedia) {
        Uri localUrl;
        Bitmap bitmap;
        if (CrashShieldHandler.isObjectCrashing(ShareInternalUtility.class)) {
            return null;
        }
        try {
            if (shareMedia instanceof SharePhoto) {
                SharePhoto sharePhoto = (SharePhoto) shareMedia;
                bitmap = sharePhoto.getBitmap();
                localUrl = sharePhoto.getImageUrl();
            } else if (shareMedia instanceof ShareVideo) {
                localUrl = ((ShareVideo) shareMedia).getLocalUrl();
                bitmap = null;
            } else {
                localUrl = null;
                bitmap = null;
            }
            return c(uuid, localUrl, bitmap);
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, ShareInternalUtility.class);
            return null;
        }
    }

    public static void e(FacebookCallback<Sharer.Result> facebookCallback) {
        if (CrashShieldHandler.isObjectCrashing(ShareInternalUtility.class)) {
            return;
        }
        try {
            j(AnalyticsEvents.PARAMETER_SHARE_OUTCOME_CANCELLED, null);
            if (facebookCallback != null) {
                facebookCallback.onCancel();
            }
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, ShareInternalUtility.class);
        }
    }

    public static void f(FacebookCallback<Sharer.Result> facebookCallback, FacebookException facebookException) {
        if (CrashShieldHandler.isObjectCrashing(ShareInternalUtility.class)) {
            return;
        }
        try {
            j("error", facebookException.getMessage());
            if (facebookCallback != null) {
                facebookCallback.onError(facebookException);
            }
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, ShareInternalUtility.class);
        }
    }

    public static void g(FacebookCallback<Sharer.Result> facebookCallback, GraphResponse graphResponse, String str) {
        if (CrashShieldHandler.isObjectCrashing(ShareInternalUtility.class)) {
            return;
        }
        try {
            j("error", str);
            if (facebookCallback != null) {
                facebookCallback.onError(new FacebookGraphResponseException(graphResponse, str));
            }
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, ShareInternalUtility.class);
        }
    }

    @Nullable
    public static Bundle getBackgroundAssetMediaInfo(ShareStoryContent shareStoryContent, UUID uuid) {
        if (!CrashShieldHandler.isObjectCrashing(ShareInternalUtility.class) && shareStoryContent != null) {
            try {
                if (shareStoryContent.getBackgroundAsset() != null) {
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(shareStoryContent.getBackgroundAsset());
                    ArrayList arrayList2 = new ArrayList();
                    List map = Utility.map(arrayList, new b(uuid, arrayList2));
                    NativeAppCallAttachmentStore.addAttachments(arrayList2);
                    return (Bundle) map.get(0);
                }
            } catch (Throwable th) {
                CrashShieldHandler.handleThrowable(th, ShareInternalUtility.class);
            }
        }
        return null;
    }

    public static Pair<String, String> getFieldNameAndNamespaceFromFullName(String str) {
        String strSubstring;
        int i2;
        if (CrashShieldHandler.isObjectCrashing(ShareInternalUtility.class)) {
            return null;
        }
        try {
            int iIndexOf = str.indexOf(58);
            if (iIndexOf == -1 || str.length() <= (i2 = iIndexOf + 1)) {
                strSubstring = null;
            } else {
                strSubstring = str.substring(0, iIndexOf);
                str = str.substring(i2);
            }
            return new Pair<>(strSubstring, str);
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, ShareInternalUtility.class);
            return null;
        }
    }

    public static List<Bundle> getMediaInfos(ShareMediaContent shareMediaContent, UUID uuid) {
        if (!CrashShieldHandler.isObjectCrashing(ShareInternalUtility.class) && shareMediaContent != null) {
            try {
                List<ShareMedia> media = shareMediaContent.getMedia();
                if (media != null) {
                    ArrayList arrayList = new ArrayList();
                    List<Bundle> map = Utility.map(media, new h(uuid, arrayList));
                    NativeAppCallAttachmentStore.addAttachments(arrayList);
                    return map;
                }
            } catch (Throwable th) {
                CrashShieldHandler.handleThrowable(th, ShareInternalUtility.class);
            }
        }
        return null;
    }

    @Nullable
    public static LikeView.ObjectType getMostSpecificObjectType(LikeView.ObjectType objectType, LikeView.ObjectType objectType2) {
        if (CrashShieldHandler.isObjectCrashing(ShareInternalUtility.class)) {
            return null;
        }
        if (objectType == objectType2) {
            return objectType;
        }
        try {
            LikeView.ObjectType objectType3 = LikeView.ObjectType.UNKNOWN;
            if (objectType == objectType3) {
                return objectType2;
            }
            if (objectType2 == objectType3) {
                return objectType;
            }
            return null;
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, ShareInternalUtility.class);
            return null;
        }
    }

    public static String getNativeDialogCompletionGesture(Bundle bundle) {
        if (CrashShieldHandler.isObjectCrashing(ShareInternalUtility.class)) {
            return null;
        }
        try {
            return bundle.containsKey(NativeProtocol.RESULT_ARGS_DIALOG_COMPLETION_GESTURE_KEY) ? bundle.getString(NativeProtocol.RESULT_ARGS_DIALOG_COMPLETION_GESTURE_KEY) : bundle.getString(NativeProtocol.EXTRA_DIALOG_COMPLETION_GESTURE_KEY);
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, ShareInternalUtility.class);
            return null;
        }
    }

    public static List<String> getPhotoUrls(SharePhotoContent sharePhotoContent, UUID uuid) {
        if (!CrashShieldHandler.isObjectCrashing(ShareInternalUtility.class) && sharePhotoContent != null) {
            try {
                List<SharePhoto> photos = sharePhotoContent.getPhotos();
                if (photos != null) {
                    List map = Utility.map(photos, new f(uuid));
                    List<String> map2 = Utility.map(map, new g());
                    NativeAppCallAttachmentStore.addAttachments(map);
                    return map2;
                }
            } catch (Throwable th) {
                CrashShieldHandler.handleThrowable(th, ShareInternalUtility.class);
            }
        }
        return null;
    }

    public static String getShareDialogPostId(Bundle bundle) {
        if (CrashShieldHandler.isObjectCrashing(ShareInternalUtility.class)) {
            return null;
        }
        try {
            if (bundle.containsKey(ShareConstants.RESULT_POST_ID)) {
                return bundle.getString(ShareConstants.RESULT_POST_ID);
            }
            return bundle.containsKey(ShareConstants.EXTRA_RESULT_POST_ID) ? bundle.getString(ShareConstants.EXTRA_RESULT_POST_ID) : bundle.getString(ShareConstants.WEB_DIALOG_RESULT_PARAM_POST_ID);
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, ShareInternalUtility.class);
            return null;
        }
    }

    public static ResultProcessor getShareResultProcessor(FacebookCallback<Sharer.Result> facebookCallback) {
        if (CrashShieldHandler.isObjectCrashing(ShareInternalUtility.class)) {
            return null;
        }
        try {
            return new c(facebookCallback, facebookCallback);
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, ShareInternalUtility.class);
            return null;
        }
    }

    @Nullable
    public static Bundle getStickerUrl(ShareStoryContent shareStoryContent, UUID uuid) {
        if (!CrashShieldHandler.isObjectCrashing(ShareInternalUtility.class) && shareStoryContent != null) {
            try {
                if (shareStoryContent.getStickerAsset() != null) {
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(shareStoryContent.getStickerAsset());
                    List map = Utility.map(arrayList, new k(uuid));
                    List map2 = Utility.map(map, new a());
                    NativeAppCallAttachmentStore.addAttachments(map);
                    return (Bundle) map2.get(0);
                }
            } catch (Throwable th) {
                CrashShieldHandler.handleThrowable(th, ShareInternalUtility.class);
            }
        }
        return null;
    }

    public static Bundle getTextureUrlBundle(ShareCameraEffectContent shareCameraEffectContent, UUID uuid) {
        if (!CrashShieldHandler.isObjectCrashing(ShareInternalUtility.class) && shareCameraEffectContent != null) {
            try {
                CameraEffectTextures textures = shareCameraEffectContent.getTextures();
                if (textures != null) {
                    Bundle bundle = new Bundle();
                    ArrayList arrayList = new ArrayList();
                    for (String str : textures.keySet()) {
                        NativeAppCallAttachmentStore.Attachment attachmentC = c(uuid, textures.getTextureUri(str), textures.getTextureBitmap(str));
                        arrayList.add(attachmentC);
                        bundle.putString(str, attachmentC.getAttachmentUrl());
                    }
                    NativeAppCallAttachmentStore.addAttachments(arrayList);
                    return bundle;
                }
            } catch (Throwable th) {
                CrashShieldHandler.handleThrowable(th, ShareInternalUtility.class);
            }
        }
        return null;
    }

    @Nullable
    public static String getUriExtension(Uri uri) {
        if (CrashShieldHandler.isObjectCrashing(ShareInternalUtility.class) || uri == null) {
            return null;
        }
        try {
            String string = uri.toString();
            int iLastIndexOf = string.lastIndexOf(46);
            if (iLastIndexOf == -1) {
                return null;
            }
            return string.substring(iLastIndexOf);
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, ShareInternalUtility.class);
            return null;
        }
    }

    public static String getVideoUrl(ShareVideoContent shareVideoContent, UUID uuid) {
        if (!CrashShieldHandler.isObjectCrashing(ShareInternalUtility.class) && shareVideoContent != null) {
            try {
                if (shareVideoContent.getVideo() != null) {
                    NativeAppCallAttachmentStore.Attachment attachmentCreateAttachment = NativeAppCallAttachmentStore.createAttachment(uuid, shareVideoContent.getVideo().getLocalUrl());
                    ArrayList arrayList = new ArrayList(1);
                    arrayList.add(attachmentCreateAttachment);
                    NativeAppCallAttachmentStore.addAttachments(arrayList);
                    return attachmentCreateAttachment.getAttachmentUrl();
                }
            } catch (Throwable th) {
                CrashShieldHandler.handleThrowable(th, ShareInternalUtility.class);
            }
        }
        return null;
    }

    public static void h(FacebookCallback<Sharer.Result> facebookCallback, String str) {
        if (CrashShieldHandler.isObjectCrashing(ShareInternalUtility.class)) {
            return;
        }
        try {
            j("error", str);
            if (facebookCallback != null) {
                facebookCallback.onError(new FacebookException(str));
            }
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, ShareInternalUtility.class);
        }
    }

    public static boolean handleActivityResult(int i2, int i3, Intent intent, ResultProcessor resultProcessor) {
        if (CrashShieldHandler.isObjectCrashing(ShareInternalUtility.class)) {
            return false;
        }
        try {
            AppCall appCallB = b(i2, i3, intent);
            if (appCallB == null) {
                return false;
            }
            NativeAppCallAttachmentStore.cleanupAttachmentsForCall(appCallB.getCallId());
            if (resultProcessor == null) {
                return true;
            }
            FacebookException exceptionFromErrorData = NativeProtocol.getExceptionFromErrorData(NativeProtocol.getErrorDataFromResultIntent(intent));
            if (exceptionFromErrorData == null) {
                resultProcessor.onSuccess(appCallB, NativeProtocol.getSuccessResultsFromIntent(intent));
            } else if (exceptionFromErrorData instanceof FacebookOperationCanceledException) {
                resultProcessor.onCancel(appCallB);
            } else {
                resultProcessor.onError(appCallB, exceptionFromErrorData);
            }
            return true;
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, ShareInternalUtility.class);
            return false;
        }
    }

    public static void i(FacebookCallback<Sharer.Result> facebookCallback, String str) {
        if (CrashShieldHandler.isObjectCrashing(ShareInternalUtility.class)) {
            return;
        }
        try {
            j(AnalyticsEvents.PARAMETER_SHARE_OUTCOME_SUCCEEDED, null);
            if (facebookCallback != null) {
                facebookCallback.onSuccess(new Sharer.Result(str));
            }
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, ShareInternalUtility.class);
        }
    }

    public static void invokeCallbackWithError(FacebookCallback<Sharer.Result> facebookCallback, String str) {
        if (CrashShieldHandler.isObjectCrashing(ShareInternalUtility.class)) {
            return;
        }
        try {
            h(facebookCallback, str);
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, ShareInternalUtility.class);
        }
    }

    public static void invokeCallbackWithException(FacebookCallback<Sharer.Result> facebookCallback, Exception exc) {
        if (CrashShieldHandler.isObjectCrashing(ShareInternalUtility.class)) {
            return;
        }
        try {
            if (exc instanceof FacebookException) {
                f(facebookCallback, (FacebookException) exc);
                return;
            }
            invokeCallbackWithError(facebookCallback, "Error preparing share content: " + exc.getLocalizedMessage());
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, ShareInternalUtility.class);
        }
    }

    public static void invokeCallbackWithResults(FacebookCallback<Sharer.Result> facebookCallback, String str, GraphResponse graphResponse) {
        if (CrashShieldHandler.isObjectCrashing(ShareInternalUtility.class)) {
            return;
        }
        try {
            FacebookRequestError error = graphResponse.getError();
            if (error == null) {
                i(facebookCallback, str);
                return;
            }
            String errorMessage = error.getErrorMessage();
            if (Utility.isNullOrEmpty(errorMessage)) {
                errorMessage = "Unexpected error sharing.";
            }
            g(facebookCallback, graphResponse, errorMessage);
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, ShareInternalUtility.class);
        }
    }

    private static void j(String str, String str2) {
        if (CrashShieldHandler.isObjectCrashing(ShareInternalUtility.class)) {
            return;
        }
        try {
            InternalAppEventsLogger internalAppEventsLogger = new InternalAppEventsLogger(FacebookSdk.getApplicationContext());
            Bundle bundle = new Bundle();
            bundle.putString(AnalyticsEvents.PARAMETER_SHARE_OUTCOME, str);
            if (str2 != null) {
                bundle.putString("error_message", str2);
            }
            internalAppEventsLogger.logEventImplicitly(AnalyticsEvents.EVENT_SHARE_RESULT, bundle);
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, ShareInternalUtility.class);
        }
    }

    public static GraphRequest newUploadStagingResourceWithImageRequest(AccessToken accessToken, Bitmap bitmap, GraphRequest.Callback callback) {
        if (CrashShieldHandler.isObjectCrashing(ShareInternalUtility.class)) {
            return null;
        }
        try {
            Bundle bundle = new Bundle(1);
            bundle.putParcelable("file", bitmap);
            return new GraphRequest(accessToken, a, bundle, HttpMethod.POST, callback);
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, ShareInternalUtility.class);
            return null;
        }
    }

    public static void registerSharerCallback(int i2, CallbackManager callbackManager, FacebookCallback<Sharer.Result> facebookCallback) {
        if (CrashShieldHandler.isObjectCrashing(ShareInternalUtility.class)) {
            return;
        }
        try {
            if (!(callbackManager instanceof CallbackManagerImpl)) {
                throw new FacebookException("Unexpected CallbackManager, please use the provided Factory.");
            }
            ((CallbackManagerImpl) callbackManager).registerCallback(i2, new e(i2, facebookCallback));
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, ShareInternalUtility.class);
        }
    }

    public static void registerStaticShareCallback(int i2) {
        if (CrashShieldHandler.isObjectCrashing(ShareInternalUtility.class)) {
            return;
        }
        try {
            CallbackManagerImpl.registerStaticCallback(i2, new d(i2));
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, ShareInternalUtility.class);
        }
    }

    public static JSONArray removeNamespacesFromOGJsonArray(JSONArray jSONArray, boolean z) throws JSONException {
        if (CrashShieldHandler.isObjectCrashing(ShareInternalUtility.class)) {
            return null;
        }
        try {
            JSONArray jSONArray2 = new JSONArray();
            for (int i2 = 0; i2 < jSONArray.length(); i2++) {
                Object objRemoveNamespacesFromOGJsonObject = jSONArray.get(i2);
                if (objRemoveNamespacesFromOGJsonObject instanceof JSONArray) {
                    objRemoveNamespacesFromOGJsonObject = removeNamespacesFromOGJsonArray((JSONArray) objRemoveNamespacesFromOGJsonObject, z);
                } else if (objRemoveNamespacesFromOGJsonObject instanceof JSONObject) {
                    objRemoveNamespacesFromOGJsonObject = removeNamespacesFromOGJsonObject((JSONObject) objRemoveNamespacesFromOGJsonObject, z);
                }
                jSONArray2.put(objRemoveNamespacesFromOGJsonObject);
            }
            return jSONArray2;
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, ShareInternalUtility.class);
            return null;
        }
    }

    public static JSONObject removeNamespacesFromOGJsonObject(JSONObject jSONObject, boolean z) {
        if (CrashShieldHandler.isObjectCrashing(ShareInternalUtility.class) || jSONObject == null) {
            return null;
        }
        try {
            try {
                JSONObject jSONObject2 = new JSONObject();
                JSONObject jSONObject3 = new JSONObject();
                JSONArray jSONArrayNames = jSONObject.names();
                for (int i2 = 0; i2 < jSONArrayNames.length(); i2++) {
                    String string = jSONArrayNames.getString(i2);
                    Object objRemoveNamespacesFromOGJsonArray = jSONObject.get(string);
                    if (objRemoveNamespacesFromOGJsonArray instanceof JSONObject) {
                        objRemoveNamespacesFromOGJsonArray = removeNamespacesFromOGJsonObject((JSONObject) objRemoveNamespacesFromOGJsonArray, true);
                    } else if (objRemoveNamespacesFromOGJsonArray instanceof JSONArray) {
                        objRemoveNamespacesFromOGJsonArray = removeNamespacesFromOGJsonArray((JSONArray) objRemoveNamespacesFromOGJsonArray, true);
                    }
                    Pair<String, String> fieldNameAndNamespaceFromFullName = getFieldNameAndNamespaceFromFullName(string);
                    String str = (String) fieldNameAndNamespaceFromFullName.first;
                    String str2 = (String) fieldNameAndNamespaceFromFullName.second;
                    if (z) {
                        if (str != null && str.equals(DeviceRequestsHelper.d)) {
                            jSONObject2.put(string, objRemoveNamespacesFromOGJsonArray);
                        } else if (str == null || str.equals("og")) {
                            jSONObject2.put(str2, objRemoveNamespacesFromOGJsonArray);
                        } else {
                            jSONObject3.put(str2, objRemoveNamespacesFromOGJsonArray);
                        }
                    } else if (str == null || !str.equals("fb")) {
                        jSONObject2.put(str2, objRemoveNamespacesFromOGJsonArray);
                    } else {
                        jSONObject2.put(string, objRemoveNamespacesFromOGJsonArray);
                    }
                }
                if (jSONObject3.length() > 0) {
                    jSONObject2.put("data", jSONObject3);
                }
                return jSONObject2;
            } catch (JSONException unused) {
                throw new FacebookException("Failed to create json object from share content");
            }
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, ShareInternalUtility.class);
            return null;
        }
    }

    public static JSONObject toJSONObjectForCall(UUID uuid, ShareOpenGraphContent shareOpenGraphContent) throws JSONException {
        if (CrashShieldHandler.isObjectCrashing(ShareInternalUtility.class)) {
            return null;
        }
        try {
            ShareOpenGraphAction action = shareOpenGraphContent.getAction();
            ArrayList arrayList = new ArrayList();
            JSONObject jSONObject = OpenGraphJSONUtility.toJSONObject(action, new i(uuid, arrayList));
            NativeAppCallAttachmentStore.addAttachments(arrayList);
            if (shareOpenGraphContent.getPlaceId() != null && Utility.isNullOrEmpty(jSONObject.optString("place"))) {
                jSONObject.put("place", shareOpenGraphContent.getPlaceId());
            }
            if (shareOpenGraphContent.getPeopleIds() != null) {
                JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("tags");
                Set hashSet = jSONArrayOptJSONArray == null ? new HashSet() : Utility.jsonArrayToSet(jSONArrayOptJSONArray);
                Iterator<String> it2 = shareOpenGraphContent.getPeopleIds().iterator();
                while (it2.hasNext()) {
                    hashSet.add(it2.next());
                }
                jSONObject.put("tags", new JSONArray((Collection) hashSet));
            }
            return jSONObject;
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, ShareInternalUtility.class);
            return null;
        }
    }

    public static JSONObject toJSONObjectForWeb(ShareOpenGraphContent shareOpenGraphContent) throws JSONException {
        if (CrashShieldHandler.isObjectCrashing(ShareInternalUtility.class)) {
            return null;
        }
        try {
            return OpenGraphJSONUtility.toJSONObject(shareOpenGraphContent.getAction(), new j());
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, ShareInternalUtility.class);
            return null;
        }
    }

    public static GraphRequest newUploadStagingResourceWithImageRequest(AccessToken accessToken, File file, GraphRequest.Callback callback) throws FileNotFoundException {
        if (CrashShieldHandler.isObjectCrashing(ShareInternalUtility.class)) {
            return null;
        }
        try {
            GraphRequest.ParcelableResourceWithMimeType parcelableResourceWithMimeType = new GraphRequest.ParcelableResourceWithMimeType(ParcelFileDescriptor.open(file, 268435456), "image/png");
            Bundle bundle = new Bundle(1);
            bundle.putParcelable("file", parcelableResourceWithMimeType);
            return new GraphRequest(accessToken, a, bundle, HttpMethod.POST, callback);
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, ShareInternalUtility.class);
            return null;
        }
    }

    public static GraphRequest newUploadStagingResourceWithImageRequest(AccessToken accessToken, Uri uri, GraphRequest.Callback callback) throws FileNotFoundException {
        if (CrashShieldHandler.isObjectCrashing(ShareInternalUtility.class)) {
            return null;
        }
        try {
            if (Utility.isFileUri(uri)) {
                return newUploadStagingResourceWithImageRequest(accessToken, new File(uri.getPath()), callback);
            }
            if (Utility.isContentUri(uri)) {
                GraphRequest.ParcelableResourceWithMimeType parcelableResourceWithMimeType = new GraphRequest.ParcelableResourceWithMimeType(uri, "image/png");
                Bundle bundle = new Bundle(1);
                bundle.putParcelable("file", parcelableResourceWithMimeType);
                return new GraphRequest(accessToken, a, bundle, HttpMethod.POST, callback);
            }
            throw new FacebookException("The image Uri must be either a file:// or content:// Uri");
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, ShareInternalUtility.class);
            return null;
        }
    }
}
