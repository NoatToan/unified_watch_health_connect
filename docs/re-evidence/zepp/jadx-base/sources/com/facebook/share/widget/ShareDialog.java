package com.facebook.share.widget;

import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import com.facebook.AccessToken;
import com.facebook.FacebookCallback;
import com.facebook.appevents.InternalAppEventsLogger;
import com.facebook.internal.AnalyticsEvents;
import com.facebook.internal.AppCall;
import com.facebook.internal.CallbackManagerImpl;
import com.facebook.internal.DialogFeature;
import com.facebook.internal.DialogPresenter;
import com.facebook.internal.FacebookDialogBase;
import com.facebook.internal.FragmentWrapper;
import com.facebook.internal.NativeAppCallAttachmentStore;
import com.facebook.internal.Utility;
import com.facebook.share.Sharer;
import com.facebook.share.internal.CameraEffectFeature;
import com.facebook.share.internal.LegacyNativeDialogParameters;
import com.facebook.share.internal.NativeDialogParameters;
import com.facebook.share.internal.OpenGraphActionDialogFeature;
import com.facebook.share.internal.ShareContentValidation;
import com.facebook.share.internal.ShareDialogFeature;
import com.facebook.share.internal.ShareFeedContent;
import com.facebook.share.internal.ShareInternalUtility;
import com.facebook.share.internal.ShareStoryFeature;
import com.facebook.share.internal.WebDialogParameters;
import com.facebook.share.model.ShareCameraEffectContent;
import com.facebook.share.model.ShareContent;
import com.facebook.share.model.ShareLinkContent;
import com.facebook.share.model.ShareMediaContent;
import com.facebook.share.model.ShareOpenGraphContent;
import com.facebook.share.model.SharePhoto;
import com.facebook.share.model.SharePhotoContent;
import com.facebook.share.model.ShareStoryContent;
import com.facebook.share.model.ShareVideoContent;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

/* JADX INFO: loaded from: classes2.dex */
public final class ShareDialog extends FacebookDialogBase<ShareContent, Sharer.Result> implements Sharer {
    public static final String WEB_SHARE_DIALOG = "share";
    private static final String i = "ShareDialog";
    private static final String j = "feed";
    private static final String k = "share_open_graph";
    private static final int l = CallbackManagerImpl.RequestCodeOffset.Share.toRequestCode();
    private boolean g;
    private boolean h;

    public enum Mode {
        AUTOMATIC,
        NATIVE,
        WEB,
        FEED
    }

    public static /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[Mode.values().length];
            a = iArr;
            try {
                iArr[Mode.AUTOMATIC.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[Mode.WEB.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                a[Mode.NATIVE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public class b extends FacebookDialogBase<ShareContent, Sharer.Result>.ModeHandler {

        public class a implements DialogPresenter.ParameterProvider {
            public final /* synthetic */ AppCall a;
            public final /* synthetic */ ShareContent b;
            public final /* synthetic */ boolean c;

            public a(AppCall appCall, ShareContent shareContent, boolean z) {
                this.a = appCall;
                this.b = shareContent;
                this.c = z;
            }

            @Override // com.facebook.internal.DialogPresenter.ParameterProvider
            public Bundle getLegacyParameters() {
                return LegacyNativeDialogParameters.create(this.a.getCallId(), this.b, this.c);
            }

            @Override // com.facebook.internal.DialogPresenter.ParameterProvider
            public Bundle getParameters() {
                return NativeDialogParameters.create(this.a.getCallId(), this.b, this.c);
            }
        }

        private b() {
            super();
        }

        @Override // com.facebook.internal.FacebookDialogBase.ModeHandler
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public boolean canShow(ShareContent shareContent, boolean z) {
            return (shareContent instanceof ShareCameraEffectContent) && ShareDialog.k(shareContent.getClass());
        }

        @Override // com.facebook.internal.FacebookDialogBase.ModeHandler
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public AppCall createAppCall(ShareContent shareContent) {
            ShareContentValidation.validateForNativeShare(shareContent);
            AppCall appCallCreateBaseAppCall = ShareDialog.this.createBaseAppCall();
            DialogPresenter.setupAppCallForNativeDialog(appCallCreateBaseAppCall, new a(appCallCreateBaseAppCall, shareContent, ShareDialog.this.getShouldFailOnDataError()), ShareDialog.n(shareContent.getClass()));
            return appCallCreateBaseAppCall;
        }

        @Override // com.facebook.internal.FacebookDialogBase.ModeHandler
        public Object getMode() {
            return Mode.NATIVE;
        }

        public /* synthetic */ b(ShareDialog shareDialog, a aVar) {
            this();
        }
    }

    public class c extends FacebookDialogBase<ShareContent, Sharer.Result>.ModeHandler {
        private c() {
            super();
        }

        @Override // com.facebook.internal.FacebookDialogBase.ModeHandler
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public boolean canShow(ShareContent shareContent, boolean z) {
            return (shareContent instanceof ShareLinkContent) || (shareContent instanceof ShareFeedContent);
        }

        @Override // com.facebook.internal.FacebookDialogBase.ModeHandler
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public AppCall createAppCall(ShareContent shareContent) {
            Bundle bundleCreateForFeed;
            ShareDialog shareDialog = ShareDialog.this;
            shareDialog.o(shareDialog.getActivityContext(), shareContent, Mode.FEED);
            AppCall appCallCreateBaseAppCall = ShareDialog.this.createBaseAppCall();
            if (shareContent instanceof ShareLinkContent) {
                ShareLinkContent shareLinkContent = (ShareLinkContent) shareContent;
                ShareContentValidation.validateForWebShare(shareLinkContent);
                bundleCreateForFeed = WebDialogParameters.createForFeed(shareLinkContent);
            } else {
                bundleCreateForFeed = WebDialogParameters.createForFeed((ShareFeedContent) shareContent);
            }
            DialogPresenter.setupAppCallForWebDialog(appCallCreateBaseAppCall, ShareDialog.j, bundleCreateForFeed);
            return appCallCreateBaseAppCall;
        }

        @Override // com.facebook.internal.FacebookDialogBase.ModeHandler
        public Object getMode() {
            return Mode.FEED;
        }

        public /* synthetic */ c(ShareDialog shareDialog, a aVar) {
            this();
        }
    }

    public class d extends FacebookDialogBase<ShareContent, Sharer.Result>.ModeHandler {

        public class a implements DialogPresenter.ParameterProvider {
            public final /* synthetic */ AppCall a;
            public final /* synthetic */ ShareContent b;
            public final /* synthetic */ boolean c;

            public a(AppCall appCall, ShareContent shareContent, boolean z) {
                this.a = appCall;
                this.b = shareContent;
                this.c = z;
            }

            @Override // com.facebook.internal.DialogPresenter.ParameterProvider
            public Bundle getLegacyParameters() {
                return LegacyNativeDialogParameters.create(this.a.getCallId(), this.b, this.c);
            }

            @Override // com.facebook.internal.DialogPresenter.ParameterProvider
            public Bundle getParameters() {
                return NativeDialogParameters.create(this.a.getCallId(), this.b, this.c);
            }
        }

        private d() {
            super();
        }

        @Override // com.facebook.internal.FacebookDialogBase.ModeHandler
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public boolean canShow(ShareContent shareContent, boolean z) {
            boolean zCanPresentNativeDialogWithFeature;
            if (shareContent == null || (shareContent instanceof ShareCameraEffectContent) || (shareContent instanceof ShareStoryContent)) {
                return false;
            }
            if (z) {
                zCanPresentNativeDialogWithFeature = true;
            } else {
                zCanPresentNativeDialogWithFeature = shareContent.getShareHashtag() != null ? DialogPresenter.canPresentNativeDialogWithFeature(ShareDialogFeature.HASHTAG) : true;
                if ((shareContent instanceof ShareLinkContent) && !Utility.isNullOrEmpty(((ShareLinkContent) shareContent).getQuote())) {
                    zCanPresentNativeDialogWithFeature &= DialogPresenter.canPresentNativeDialogWithFeature(ShareDialogFeature.LINK_SHARE_QUOTES);
                }
            }
            return zCanPresentNativeDialogWithFeature && ShareDialog.k(shareContent.getClass());
        }

        @Override // com.facebook.internal.FacebookDialogBase.ModeHandler
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public AppCall createAppCall(ShareContent shareContent) {
            ShareDialog shareDialog = ShareDialog.this;
            shareDialog.o(shareDialog.getActivityContext(), shareContent, Mode.NATIVE);
            ShareContentValidation.validateForNativeShare(shareContent);
            AppCall appCallCreateBaseAppCall = ShareDialog.this.createBaseAppCall();
            DialogPresenter.setupAppCallForNativeDialog(appCallCreateBaseAppCall, new a(appCallCreateBaseAppCall, shareContent, ShareDialog.this.getShouldFailOnDataError()), ShareDialog.n(shareContent.getClass()));
            return appCallCreateBaseAppCall;
        }

        @Override // com.facebook.internal.FacebookDialogBase.ModeHandler
        public Object getMode() {
            return Mode.NATIVE;
        }

        public /* synthetic */ d(ShareDialog shareDialog, a aVar) {
            this();
        }
    }

    public class e extends FacebookDialogBase<ShareContent, Sharer.Result>.ModeHandler {

        public class a implements DialogPresenter.ParameterProvider {
            public final /* synthetic */ AppCall a;
            public final /* synthetic */ ShareContent b;
            public final /* synthetic */ boolean c;

            public a(AppCall appCall, ShareContent shareContent, boolean z) {
                this.a = appCall;
                this.b = shareContent;
                this.c = z;
            }

            @Override // com.facebook.internal.DialogPresenter.ParameterProvider
            public Bundle getLegacyParameters() {
                return LegacyNativeDialogParameters.create(this.a.getCallId(), this.b, this.c);
            }

            @Override // com.facebook.internal.DialogPresenter.ParameterProvider
            public Bundle getParameters() {
                return NativeDialogParameters.create(this.a.getCallId(), this.b, this.c);
            }
        }

        private e() {
            super();
        }

        @Override // com.facebook.internal.FacebookDialogBase.ModeHandler
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public boolean canShow(ShareContent shareContent, boolean z) {
            return (shareContent instanceof ShareStoryContent) && ShareDialog.k(shareContent.getClass());
        }

        @Override // com.facebook.internal.FacebookDialogBase.ModeHandler
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public AppCall createAppCall(ShareContent shareContent) {
            ShareContentValidation.validateForStoryShare(shareContent);
            AppCall appCallCreateBaseAppCall = ShareDialog.this.createBaseAppCall();
            DialogPresenter.setupAppCallForNativeDialog(appCallCreateBaseAppCall, new a(appCallCreateBaseAppCall, shareContent, ShareDialog.this.getShouldFailOnDataError()), ShareDialog.n(shareContent.getClass()));
            return appCallCreateBaseAppCall;
        }

        @Override // com.facebook.internal.FacebookDialogBase.ModeHandler
        public Object getMode() {
            return Mode.NATIVE;
        }

        public /* synthetic */ e(ShareDialog shareDialog, a aVar) {
            this();
        }
    }

    public class f extends FacebookDialogBase<ShareContent, Sharer.Result>.ModeHandler {
        private f() {
            super();
        }

        private SharePhotoContent b(SharePhotoContent sharePhotoContent, UUID uuid) {
            SharePhotoContent.Builder from = new SharePhotoContent.Builder().readFrom(sharePhotoContent);
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            for (int i = 0; i < sharePhotoContent.getPhotos().size(); i++) {
                SharePhoto sharePhotoBuild = sharePhotoContent.getPhotos().get(i);
                Bitmap bitmap = sharePhotoBuild.getBitmap();
                if (bitmap != null) {
                    NativeAppCallAttachmentStore.Attachment attachmentCreateAttachment = NativeAppCallAttachmentStore.createAttachment(uuid, bitmap);
                    sharePhotoBuild = new SharePhoto.Builder().readFrom(sharePhotoBuild).setImageUrl(Uri.parse(attachmentCreateAttachment.getAttachmentUrl())).setBitmap(null).build();
                    arrayList2.add(attachmentCreateAttachment);
                }
                arrayList.add(sharePhotoBuild);
            }
            from.setPhotos(arrayList);
            NativeAppCallAttachmentStore.addAttachments(arrayList2);
            return from.build();
        }

        private String d(ShareContent shareContent) {
            if ((shareContent instanceof ShareLinkContent) || (shareContent instanceof SharePhotoContent)) {
                return "share";
            }
            if (shareContent instanceof ShareOpenGraphContent) {
                return ShareDialog.k;
            }
            return null;
        }

        @Override // com.facebook.internal.FacebookDialogBase.ModeHandler
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public boolean canShow(ShareContent shareContent, boolean z) {
            return shareContent != null && ShareDialog.l(shareContent);
        }

        @Override // com.facebook.internal.FacebookDialogBase.ModeHandler
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public AppCall createAppCall(ShareContent shareContent) {
            Bundle bundleCreate;
            ShareDialog shareDialog = ShareDialog.this;
            shareDialog.o(shareDialog.getActivityContext(), shareContent, Mode.WEB);
            AppCall appCallCreateBaseAppCall = ShareDialog.this.createBaseAppCall();
            ShareContentValidation.validateForWebShare(shareContent);
            if (shareContent instanceof ShareLinkContent) {
                bundleCreate = WebDialogParameters.create((ShareLinkContent) shareContent);
            } else {
                bundleCreate = shareContent instanceof SharePhotoContent ? WebDialogParameters.create(b((SharePhotoContent) shareContent, appCallCreateBaseAppCall.getCallId())) : WebDialogParameters.create((ShareOpenGraphContent) shareContent);
            }
            DialogPresenter.setupAppCallForWebDialog(appCallCreateBaseAppCall, d(shareContent), bundleCreate);
            return appCallCreateBaseAppCall;
        }

        @Override // com.facebook.internal.FacebookDialogBase.ModeHandler
        public Object getMode() {
            return Mode.WEB;
        }

        public /* synthetic */ f(ShareDialog shareDialog, a aVar) {
            this();
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public ShareDialog(Activity activity) {
        int i2 = l;
        super(activity, i2);
        this.g = false;
        this.h = true;
        ShareInternalUtility.registerStaticShareCallback(i2);
    }

    public static boolean canShow(Class<? extends ShareContent> cls) {
        return m(cls) || k(cls);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean k(Class<? extends ShareContent> cls) {
        DialogFeature dialogFeatureN = n(cls);
        return dialogFeatureN != null && DialogPresenter.canPresentNativeDialogWithFeature(dialogFeatureN);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean l(ShareContent shareContent) {
        if (!m(shareContent.getClass())) {
            return false;
        }
        if (!(shareContent instanceof ShareOpenGraphContent)) {
            return true;
        }
        try {
            ShareInternalUtility.toJSONObjectForWeb((ShareOpenGraphContent) shareContent);
            return true;
        } catch (Exception e2) {
            Utility.logd(i, "canShow returned false because the content of the Opem Graph object can't be shared via the web dialog", e2);
            return false;
        }
    }

    private static boolean m(Class<? extends ShareContent> cls) {
        return ShareLinkContent.class.isAssignableFrom(cls) || ShareOpenGraphContent.class.isAssignableFrom(cls) || (SharePhotoContent.class.isAssignableFrom(cls) && AccessToken.isCurrentAccessTokenActive());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static DialogFeature n(Class<? extends ShareContent> cls) {
        if (ShareLinkContent.class.isAssignableFrom(cls)) {
            return ShareDialogFeature.SHARE_DIALOG;
        }
        if (SharePhotoContent.class.isAssignableFrom(cls)) {
            return ShareDialogFeature.PHOTOS;
        }
        if (ShareVideoContent.class.isAssignableFrom(cls)) {
            return ShareDialogFeature.VIDEO;
        }
        if (ShareOpenGraphContent.class.isAssignableFrom(cls)) {
            return OpenGraphActionDialogFeature.OG_ACTION_DIALOG;
        }
        if (ShareMediaContent.class.isAssignableFrom(cls)) {
            return ShareDialogFeature.MULTIMEDIA;
        }
        if (ShareCameraEffectContent.class.isAssignableFrom(cls)) {
            return CameraEffectFeature.SHARE_CAMERA_EFFECT;
        }
        if (ShareStoryContent.class.isAssignableFrom(cls)) {
            return ShareStoryFeature.SHARE_STORY_ASSET;
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void o(Context context, ShareContent shareContent, Mode mode) {
        String str;
        if (this.h) {
            mode = Mode.AUTOMATIC;
        }
        int i2 = a.a[mode.ordinal()];
        String str2 = "unknown";
        if (i2 == 1) {
            str = AnalyticsEvents.PARAMETER_SHARE_DIALOG_SHOW_AUTOMATIC;
        } else if (i2 != 2) {
            str = i2 != 3 ? "unknown" : AnalyticsEvents.PARAMETER_SHARE_DIALOG_SHOW_NATIVE;
        } else {
            str = "web";
        }
        DialogFeature dialogFeatureN = n(shareContent.getClass());
        if (dialogFeatureN == ShareDialogFeature.SHARE_DIALOG) {
            str2 = "status";
        } else if (dialogFeatureN == ShareDialogFeature.PHOTOS) {
            str2 = AnalyticsEvents.PARAMETER_SHARE_DIALOG_CONTENT_PHOTO;
        } else if (dialogFeatureN == ShareDialogFeature.VIDEO) {
            str2 = "video";
        } else if (dialogFeatureN == OpenGraphActionDialogFeature.OG_ACTION_DIALOG) {
            str2 = "open_graph";
        }
        InternalAppEventsLogger internalAppEventsLogger = new InternalAppEventsLogger(context);
        Bundle bundle = new Bundle();
        bundle.putString("fb_share_dialog_show", str);
        bundle.putString(AnalyticsEvents.PARAMETER_SHARE_DIALOG_CONTENT_TYPE, str2);
        internalAppEventsLogger.logEventImplicitly("fb_share_dialog_show", bundle);
    }

    private static void p(FragmentWrapper fragmentWrapper, ShareContent shareContent) {
        new ShareDialog(fragmentWrapper).show(shareContent);
    }

    public static void show(Activity activity, ShareContent shareContent) {
        new ShareDialog(activity).show(shareContent);
    }

    @Override // com.facebook.internal.FacebookDialogBase
    public AppCall createBaseAppCall() {
        return new AppCall(getRequestCodeField());
    }

    @Override // com.facebook.internal.FacebookDialogBase
    public List<FacebookDialogBase<ShareContent, Sharer.Result>.ModeHandler> getOrderedModeHandlers() {
        ArrayList arrayList = new ArrayList();
        a aVar = null;
        arrayList.add(new d(this, aVar));
        arrayList.add(new c(this, aVar));
        arrayList.add(new f(this, aVar));
        arrayList.add(new b(this, aVar));
        arrayList.add(new e(this, aVar));
        return arrayList;
    }

    @Override // com.facebook.share.Sharer
    public boolean getShouldFailOnDataError() {
        return this.g;
    }

    @Override // com.facebook.internal.FacebookDialogBase
    public void registerCallbackImpl(CallbackManagerImpl callbackManagerImpl, FacebookCallback<Sharer.Result> facebookCallback) {
        ShareInternalUtility.registerSharerCallback(getRequestCodeField(), callbackManagerImpl, facebookCallback);
    }

    @Override // com.facebook.share.Sharer
    public void setShouldFailOnDataError(boolean z) {
        this.g = z;
    }

    public static void show(Fragment fragment, ShareContent shareContent) {
        p(new FragmentWrapper(fragment), shareContent);
    }

    public boolean canShow(ShareContent shareContent, Mode mode) {
        Object obj = mode;
        if (mode == Mode.AUTOMATIC) {
            obj = FacebookDialogBase.BASE_AUTOMATIC_MODE;
        }
        return canShowImpl(shareContent, obj);
    }

    public static void show(android.app.Fragment fragment, ShareContent shareContent) {
        p(new FragmentWrapper(fragment), shareContent);
    }

    public void show(ShareContent shareContent, Mode mode) {
        boolean z = mode == Mode.AUTOMATIC;
        this.h = z;
        Object obj = mode;
        if (z) {
            obj = FacebookDialogBase.BASE_AUTOMATIC_MODE;
        }
        showImpl(shareContent, obj);
    }

    public ShareDialog(Fragment fragment) {
        this(new FragmentWrapper(fragment));
    }

    public ShareDialog(android.app.Fragment fragment) {
        this(new FragmentWrapper(fragment));
    }

    /* JADX WARN: Illegal instructions before constructor call */
    private ShareDialog(FragmentWrapper fragmentWrapper) {
        int i2 = l;
        super(fragmentWrapper, i2);
        this.g = false;
        this.h = true;
        ShareInternalUtility.registerStaticShareCallback(i2);
    }

    public ShareDialog(Activity activity, int i2) {
        super(activity, i2);
        this.g = false;
        this.h = true;
        ShareInternalUtility.registerStaticShareCallback(i2);
    }

    public ShareDialog(Fragment fragment, int i2) {
        this(new FragmentWrapper(fragment), i2);
    }

    public ShareDialog(android.app.Fragment fragment, int i2) {
        this(new FragmentWrapper(fragment), i2);
    }

    private ShareDialog(FragmentWrapper fragmentWrapper, int i2) {
        super(fragmentWrapper, i2);
        this.g = false;
        this.h = true;
        ShareInternalUtility.registerStaticShareCallback(i2);
    }
}
