package com.facebook.share.widget;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import androidx.fragment.app.Fragment;
import com.facebook.FacebookCallback;
import com.facebook.internal.AppCall;
import com.facebook.internal.CallbackManagerImpl;
import com.facebook.internal.DialogFeature;
import com.facebook.internal.DialogPresenter;
import com.facebook.internal.FacebookDialogBase;
import com.facebook.internal.FragmentWrapper;
import com.facebook.share.internal.AppInviteDialogFeature;
import com.facebook.share.internal.ResultProcessor;
import com.facebook.share.internal.ShareConstants;
import com.facebook.share.internal.ShareInternalUtility;
import com.facebook.share.model.AppInviteContent;
import com.twitter.sdk.android.tweetcomposer.g;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
@Deprecated
public class AppInviteDialog extends FacebookDialogBase<AppInviteContent, Result> {
    private static final String g = "AppInviteDialog";
    private static final int h = CallbackManagerImpl.RequestCodeOffset.AppInvite.toRequestCode();

    @Deprecated
    public static final class Result {
        private final Bundle a;

        public Result(Bundle bundle) {
            this.a = bundle;
        }

        public Bundle getData() {
            return this.a;
        }
    }

    public class a extends ResultProcessor {
        public final /* synthetic */ FacebookCallback b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(FacebookCallback facebookCallback, FacebookCallback facebookCallback2) {
            super(facebookCallback);
            this.b = facebookCallback2;
        }

        @Override // com.facebook.share.internal.ResultProcessor
        public void onSuccess(AppCall appCall, Bundle bundle) {
            if (g.g.equalsIgnoreCase(ShareInternalUtility.getNativeDialogCompletionGesture(bundle))) {
                this.b.onCancel();
            } else {
                this.b.onSuccess(new Result(bundle));
            }
        }
    }

    public class b implements CallbackManagerImpl.Callback {
        public final /* synthetic */ ResultProcessor a;

        public b(ResultProcessor resultProcessor) {
            this.a = resultProcessor;
        }

        @Override // com.facebook.internal.CallbackManagerImpl.Callback
        public boolean onActivityResult(int i, Intent intent) {
            return ShareInternalUtility.handleActivityResult(AppInviteDialog.this.getRequestCodeField(), i, intent, this.a);
        }
    }

    public class c extends FacebookDialogBase<AppInviteContent, Result>.ModeHandler {

        public class a implements DialogPresenter.ParameterProvider {
            public final /* synthetic */ AppInviteContent a;

            public a(AppInviteContent appInviteContent) {
                this.a = appInviteContent;
            }

            @Override // com.facebook.internal.DialogPresenter.ParameterProvider
            public Bundle getLegacyParameters() {
                Log.e(AppInviteDialog.g, "Attempting to present the AppInviteDialog with an outdated Facebook app on the device");
                return new Bundle();
            }

            @Override // com.facebook.internal.DialogPresenter.ParameterProvider
            public Bundle getParameters() {
                return AppInviteDialog.f(this.a);
            }
        }

        private c() {
            super();
        }

        @Override // com.facebook.internal.FacebookDialogBase.ModeHandler
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public boolean canShow(AppInviteContent appInviteContent, boolean z) {
            return false;
        }

        @Override // com.facebook.internal.FacebookDialogBase.ModeHandler
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public AppCall createAppCall(AppInviteContent appInviteContent) {
            AppCall appCallCreateBaseAppCall = AppInviteDialog.this.createBaseAppCall();
            DialogPresenter.setupAppCallForNativeDialog(appCallCreateBaseAppCall, new a(appInviteContent), AppInviteDialog.g());
            return appCallCreateBaseAppCall;
        }

        public /* synthetic */ c(AppInviteDialog appInviteDialog, a aVar) {
            this();
        }
    }

    public class d extends FacebookDialogBase<AppInviteContent, Result>.ModeHandler {
        private d() {
            super();
        }

        @Override // com.facebook.internal.FacebookDialogBase.ModeHandler
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public boolean canShow(AppInviteContent appInviteContent, boolean z) {
            return false;
        }

        @Override // com.facebook.internal.FacebookDialogBase.ModeHandler
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public AppCall createAppCall(AppInviteContent appInviteContent) {
            AppCall appCallCreateBaseAppCall = AppInviteDialog.this.createBaseAppCall();
            DialogPresenter.setupAppCallForWebFallbackDialog(appCallCreateBaseAppCall, AppInviteDialog.f(appInviteContent), AppInviteDialog.g());
            return appCallCreateBaseAppCall;
        }

        public /* synthetic */ d(AppInviteDialog appInviteDialog, a aVar) {
            this();
        }
    }

    @Deprecated
    public AppInviteDialog(Activity activity) {
        super(activity, h);
    }

    @Deprecated
    public static boolean canShow() {
        return false;
    }

    private static boolean canShowNativeDialog() {
        return false;
    }

    private static boolean canShowWebFallback() {
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static Bundle f(AppInviteContent appInviteContent) {
        Bundle bundle = new Bundle();
        bundle.putString(ShareConstants.APPLINK_URL, appInviteContent.getApplinkUrl());
        bundle.putString(ShareConstants.PREVIEW_IMAGE_URL, appInviteContent.getPreviewImageUrl());
        bundle.putString("destination", appInviteContent.getDestination().toString());
        String promotionCode = appInviteContent.getPromotionCode();
        if (promotionCode == null) {
            promotionCode = "";
        }
        String promotionText = appInviteContent.getPromotionText();
        if (!TextUtils.isEmpty(promotionText)) {
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put(ShareConstants.PROMO_CODE, promotionCode);
                jSONObject.put(ShareConstants.PROMO_TEXT, promotionText);
                bundle.putString(ShareConstants.DEEPLINK_CONTEXT, jSONObject.toString());
                bundle.putString(ShareConstants.PROMO_CODE, promotionCode);
                bundle.putString(ShareConstants.PROMO_TEXT, promotionText);
            } catch (JSONException unused) {
                Log.e(g, "Json Exception in creating deeplink context");
            }
        }
        return bundle;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static DialogFeature g() {
        return AppInviteDialogFeature.APP_INVITES_DIALOG;
    }

    private static void h(FragmentWrapper fragmentWrapper, AppInviteContent appInviteContent) {
        new AppInviteDialog(fragmentWrapper).show(appInviteContent);
    }

    @Override // com.facebook.internal.FacebookDialogBase
    public AppCall createBaseAppCall() {
        return new AppCall(getRequestCodeField());
    }

    @Override // com.facebook.internal.FacebookDialogBase
    public List<FacebookDialogBase<AppInviteContent, Result>.ModeHandler> getOrderedModeHandlers() {
        ArrayList arrayList = new ArrayList();
        a aVar = null;
        arrayList.add(new c(this, aVar));
        arrayList.add(new d(this, aVar));
        return arrayList;
    }

    @Override // com.facebook.internal.FacebookDialogBase
    public void registerCallbackImpl(CallbackManagerImpl callbackManagerImpl, FacebookCallback<Result> facebookCallback) {
        callbackManagerImpl.registerCallback(getRequestCodeField(), new b(facebookCallback == null ? null : new a(facebookCallback, facebookCallback)));
    }

    @Override // com.facebook.internal.FacebookDialogBase, com.facebook.FacebookDialog
    @Deprecated
    public void show(AppInviteContent appInviteContent) {
    }

    @Deprecated
    public AppInviteDialog(Fragment fragment) {
        this(new FragmentWrapper(fragment));
    }

    @Deprecated
    public static void show(Activity activity, AppInviteContent appInviteContent) {
        new AppInviteDialog(activity).show(appInviteContent);
    }

    @Deprecated
    public AppInviteDialog(android.app.Fragment fragment) {
        this(new FragmentWrapper(fragment));
    }

    @Deprecated
    public static void show(Fragment fragment, AppInviteContent appInviteContent) {
        h(new FragmentWrapper(fragment), appInviteContent);
    }

    private AppInviteDialog(FragmentWrapper fragmentWrapper) {
        super(fragmentWrapper, h);
    }

    @Deprecated
    public static void show(android.app.Fragment fragment, AppInviteContent appInviteContent) {
        h(new FragmentWrapper(fragment), appInviteContent);
    }
}
