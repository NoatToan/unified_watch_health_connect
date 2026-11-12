package com.facebook.share.widget;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import com.facebook.FacebookCallback;
import com.facebook.appevents.InternalAppEventsLogger;
import com.facebook.internal.AnalyticsEvents;
import com.facebook.internal.AppCall;
import com.facebook.internal.CallbackManagerImpl;
import com.facebook.internal.DialogFeature;
import com.facebook.internal.DialogPresenter;
import com.facebook.internal.FacebookDialogBase;
import com.facebook.internal.FragmentWrapper;
import com.facebook.share.Sharer;
import com.facebook.share.internal.LegacyNativeDialogParameters;
import com.facebook.share.internal.MessageDialogFeature;
import com.facebook.share.internal.NativeDialogParameters;
import com.facebook.share.internal.ShareContentValidation;
import com.facebook.share.internal.ShareInternalUtility;
import com.facebook.share.model.ShareContent;
import com.facebook.share.model.ShareLinkContent;
import com.facebook.share.model.ShareMessengerGenericTemplateContent;
import com.facebook.share.model.ShareMessengerMediaTemplateContent;
import com.facebook.share.model.ShareMessengerOpenGraphMusicTemplateContent;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
@Deprecated
public final class MessageDialog extends FacebookDialogBase<ShareContent, Sharer.Result> implements Sharer {
    private static final int h = CallbackManagerImpl.RequestCodeOffset.Message.toRequestCode();
    private boolean g;

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
            return shareContent != null && MessageDialog.canShow((Class<? extends ShareContent>) shareContent.getClass());
        }

        @Override // com.facebook.internal.FacebookDialogBase.ModeHandler
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public AppCall createAppCall(ShareContent shareContent) {
            ShareContentValidation.validateForMessage(shareContent);
            AppCall appCallCreateBaseAppCall = MessageDialog.this.createBaseAppCall();
            boolean shouldFailOnDataError = MessageDialog.this.getShouldFailOnDataError();
            MessageDialog.h(MessageDialog.this.getActivityContext(), shareContent, appCallCreateBaseAppCall);
            DialogPresenter.setupAppCallForNativeDialog(appCallCreateBaseAppCall, new a(appCallCreateBaseAppCall, shareContent, shouldFailOnDataError), MessageDialog.g(shareContent.getClass()));
            return appCallCreateBaseAppCall;
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public MessageDialog(Activity activity) {
        int i = h;
        super(activity, i);
        this.g = false;
        ShareInternalUtility.registerStaticShareCallback(i);
    }

    public static boolean canShow(Class<? extends ShareContent> cls) {
        DialogFeature dialogFeatureG = g(cls);
        return dialogFeatureG != null && DialogPresenter.canPresentNativeDialogWithFeature(dialogFeatureG);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static DialogFeature g(Class<? extends ShareContent> cls) {
        if (ShareLinkContent.class.isAssignableFrom(cls)) {
            return MessageDialogFeature.MESSAGE_DIALOG;
        }
        if (ShareMessengerGenericTemplateContent.class.isAssignableFrom(cls)) {
            return MessageDialogFeature.MESSENGER_GENERIC_TEMPLATE;
        }
        if (ShareMessengerOpenGraphMusicTemplateContent.class.isAssignableFrom(cls)) {
            return MessageDialogFeature.MESSENGER_OPEN_GRAPH_MUSIC_TEMPLATE;
        }
        if (ShareMessengerMediaTemplateContent.class.isAssignableFrom(cls)) {
            return MessageDialogFeature.MESSENGER_MEDIA_TEMPLATE;
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void h(Context context, ShareContent shareContent, AppCall appCall) {
        String str;
        DialogFeature dialogFeatureG = g(shareContent.getClass());
        if (dialogFeatureG == MessageDialogFeature.MESSAGE_DIALOG) {
            str = "status";
        } else if (dialogFeatureG == MessageDialogFeature.MESSENGER_GENERIC_TEMPLATE) {
            str = AnalyticsEvents.PARAMETER_SHARE_MESSENGER_GENERIC_TEMPLATE;
        } else if (dialogFeatureG == MessageDialogFeature.MESSENGER_MEDIA_TEMPLATE) {
            str = AnalyticsEvents.PARAMETER_SHARE_MESSENGER_MEDIA_TEMPLATE;
        } else {
            str = dialogFeatureG == MessageDialogFeature.MESSENGER_OPEN_GRAPH_MUSIC_TEMPLATE ? AnalyticsEvents.PARAMETER_SHARE_MESSENGER_OPEN_GRAPH_MUSIC_TEMPLATE : "unknown";
        }
        InternalAppEventsLogger internalAppEventsLogger = new InternalAppEventsLogger(context);
        Bundle bundle = new Bundle();
        bundle.putString(AnalyticsEvents.PARAMETER_SHARE_DIALOG_CONTENT_TYPE, str);
        bundle.putString(AnalyticsEvents.PARAMETER_SHARE_DIALOG_CONTENT_UUID, appCall.getCallId().toString());
        bundle.putString(AnalyticsEvents.PARAMETER_SHARE_DIALOG_CONTENT_PAGE_ID, shareContent.getPageId());
        internalAppEventsLogger.logEventImplicitly(AnalyticsEvents.EVENT_SHARE_MESSENGER_DIALOG_SHOW, bundle);
    }

    private static void i(FragmentWrapper fragmentWrapper, ShareContent shareContent) {
        new MessageDialog(fragmentWrapper).show(shareContent);
    }

    public static void show(Activity activity, ShareContent shareContent) {
        new MessageDialog(activity).show(shareContent);
    }

    @Override // com.facebook.internal.FacebookDialogBase
    public AppCall createBaseAppCall() {
        return new AppCall(getRequestCodeField());
    }

    @Override // com.facebook.internal.FacebookDialogBase
    public List<FacebookDialogBase<ShareContent, Sharer.Result>.ModeHandler> getOrderedModeHandlers() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new b());
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
        i(new FragmentWrapper(fragment), shareContent);
    }

    public static void show(android.app.Fragment fragment, ShareContent shareContent) {
        i(new FragmentWrapper(fragment), shareContent);
    }

    public MessageDialog(Fragment fragment) {
        this(new FragmentWrapper(fragment));
    }

    public MessageDialog(android.app.Fragment fragment) {
        this(new FragmentWrapper(fragment));
    }

    /* JADX WARN: Illegal instructions before constructor call */
    private MessageDialog(FragmentWrapper fragmentWrapper) {
        int i = h;
        super(fragmentWrapper, i);
        this.g = false;
        ShareInternalUtility.registerStaticShareCallback(i);
    }

    public MessageDialog(Activity activity, int i) {
        super(activity, i);
        this.g = false;
        ShareInternalUtility.registerStaticShareCallback(i);
    }

    public MessageDialog(Fragment fragment, int i) {
        this(new FragmentWrapper(fragment), i);
    }

    public MessageDialog(android.app.Fragment fragment, int i) {
        this(new FragmentWrapper(fragment), i);
    }

    private MessageDialog(FragmentWrapper fragmentWrapper, int i) {
        super(fragmentWrapper, i);
        this.g = false;
        ShareInternalUtility.registerStaticShareCallback(i);
    }
}
