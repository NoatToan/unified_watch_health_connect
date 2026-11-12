package com.facebook.gamingservices;

import android.app.Activity;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import com.facebook.AccessToken;
import com.facebook.FacebookCallback;
import com.facebook.FacebookException;
import com.facebook.FacebookSdk;
import com.facebook.GraphResponse;
import com.facebook.gamingservices.cloudgaming.CloudGameLoginHandler;
import com.facebook.gamingservices.cloudgaming.DaemonRequest;
import com.facebook.gamingservices.cloudgaming.internal.SDKConstants;
import com.facebook.gamingservices.cloudgaming.internal.SDKMessageEnum;
import com.facebook.internal.AppCall;
import com.facebook.internal.CallbackManagerImpl;
import com.facebook.internal.CustomTabUtils;
import com.facebook.internal.DialogPresenter;
import com.facebook.internal.FacebookDialogBase;
import com.facebook.internal.FragmentWrapper;
import com.facebook.internal.NativeProtocol;
import com.facebook.internal.Validate;
import com.facebook.share.internal.GameRequestValidation;
import com.facebook.share.internal.ResultProcessor;
import com.facebook.share.internal.ShareConstants;
import com.facebook.share.internal.ShareInternalUtility;
import com.facebook.share.internal.WebDialogParameters;
import com.facebook.share.model.GameRequestContent;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class GameRequestDialog extends FacebookDialogBase<GameRequestContent, Result> {
    private static final String h = "apprequests";
    private static final int i = CallbackManagerImpl.RequestCodeOffset.GameRequest.toRequestCode();
    private FacebookCallback g;

    public static final class Result {
        public String a;
        public List<String> b;

        public /* synthetic */ Result(Bundle bundle, a aVar) {
            this(bundle);
        }

        public String getRequestId() {
            return this.a;
        }

        public List<String> getRequestRecipients() {
            return this.b;
        }

        public /* synthetic */ Result(GraphResponse graphResponse, a aVar) {
            this(graphResponse);
        }

        private Result(Bundle bundle) {
            this.a = bundle.getString("request");
            this.b = new ArrayList();
            while (bundle.containsKey(String.format(ShareConstants.WEB_DIALOG_RESULT_PARAM_TO_ARRAY_MEMBER, Integer.valueOf(this.b.size())))) {
                List<String> list = this.b;
                list.add(bundle.getString(String.format(ShareConstants.WEB_DIALOG_RESULT_PARAM_TO_ARRAY_MEMBER, Integer.valueOf(list.size()))));
            }
        }

        private Result(GraphResponse graphResponse) {
            try {
                JSONObject graphObject = graphResponse.getGraphObject();
                JSONObject jSONObjectOptJSONObject = graphObject.optJSONObject("data");
                graphObject = jSONObjectOptJSONObject != null ? jSONObjectOptJSONObject : graphObject;
                this.a = graphObject.getString("request_id");
                this.b = new ArrayList();
                JSONArray jSONArray = graphObject.getJSONArray("to");
                for (int i = 0; i < jSONArray.length(); i++) {
                    this.b.add(jSONArray.getString(i));
                }
            } catch (JSONException unused) {
                this.a = null;
                this.b = new ArrayList();
            }
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
            if (bundle != null) {
                this.b.onSuccess(new Result(bundle, (a) null));
            } else {
                onCancel(appCall);
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
            return ShareInternalUtility.handleActivityResult(GameRequestDialog.this.getRequestCodeField(), i, intent, this.a);
        }
    }

    public class c implements DaemonRequest.Callback {
        public c() {
        }

        @Override // com.facebook.gamingservices.cloudgaming.DaemonRequest.Callback
        public void onCompleted(GraphResponse graphResponse) {
            if (GameRequestDialog.this.g != null) {
                if (graphResponse.getError() != null) {
                    GameRequestDialog.this.g.onError(new FacebookException(graphResponse.getError().getErrorMessage()));
                } else {
                    GameRequestDialog.this.g.onSuccess(new Result(graphResponse, (a) null));
                }
            }
        }
    }

    public class d extends FacebookDialogBase<GameRequestContent, Result>.ModeHandler {
        private d() {
            super();
        }

        @Override // com.facebook.internal.FacebookDialogBase.ModeHandler
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public boolean canShow(GameRequestContent gameRequestContent, boolean z) {
            return CustomTabUtils.getChromePackage() != null && Validate.hasCustomTabRedirectActivity(GameRequestDialog.this.getActivityContext(), CustomTabUtils.getDefaultRedirectURI());
        }

        @Override // com.facebook.internal.FacebookDialogBase.ModeHandler
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public AppCall createAppCall(GameRequestContent gameRequestContent) {
            GameRequestValidation.validate(gameRequestContent);
            AppCall appCallCreateBaseAppCall = GameRequestDialog.this.createBaseAppCall();
            Bundle bundleCreate = WebDialogParameters.create(gameRequestContent);
            AccessToken currentAccessToken = AccessToken.getCurrentAccessToken();
            if (currentAccessToken != null) {
                bundleCreate.putString("app_id", currentAccessToken.getApplicationId());
            } else {
                bundleCreate.putString("app_id", FacebookSdk.getApplicationId());
            }
            bundleCreate.putString("redirect_uri", CustomTabUtils.getDefaultRedirectURI());
            DialogPresenter.setupAppCallForCustomTabDialog(appCallCreateBaseAppCall, GameRequestDialog.h, bundleCreate);
            return appCallCreateBaseAppCall;
        }

        public /* synthetic */ d(GameRequestDialog gameRequestDialog, a aVar) {
            this();
        }
    }

    public class e extends FacebookDialogBase<GameRequestContent, Result>.ModeHandler {
        private e() {
            super();
        }

        @Override // com.facebook.internal.FacebookDialogBase.ModeHandler
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public boolean canShow(GameRequestContent gameRequestContent, boolean z) {
            PackageManager packageManager = GameRequestDialog.this.getActivityContext().getPackageManager();
            Intent intent = new Intent("com.facebook.games.gaming_services.DEEPLINK");
            intent.setType("text/plain");
            boolean z2 = intent.resolveActivity(packageManager) != null;
            AccessToken currentAccessToken = AccessToken.getCurrentAccessToken();
            return z2 && (currentAccessToken != null && currentAccessToken.getGraphDomain() != null && FacebookSdk.GAMING.equals(currentAccessToken.getGraphDomain()));
        }

        @Override // com.facebook.internal.FacebookDialogBase.ModeHandler
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public AppCall createAppCall(GameRequestContent gameRequestContent) {
            AppCall appCallCreateBaseAppCall = GameRequestDialog.this.createBaseAppCall();
            Intent intent = new Intent("com.facebook.games.gaming_services.DEEPLINK");
            intent.setType("text/plain");
            AccessToken currentAccessToken = AccessToken.getCurrentAccessToken();
            Bundle bundle = new Bundle();
            bundle.putString(SDKConstants.PARAM_TOURNAMENTS_DEEPLINK, "GAME_REQUESTS");
            if (currentAccessToken != null) {
                bundle.putString("app_id", currentAccessToken.getApplicationId());
            } else {
                bundle.putString("app_id", FacebookSdk.getApplicationId());
            }
            bundle.putString("actionType", gameRequestContent.getActionType() != null ? gameRequestContent.getActionType().name() : null);
            bundle.putString("message", gameRequestContent.getMessage());
            bundle.putString("title", gameRequestContent.getTitle());
            bundle.putString("data", gameRequestContent.getData());
            bundle.putString(SDKConstants.PARAM_GAME_REQUESTS_CTA, gameRequestContent.getCta());
            gameRequestContent.getRecipients();
            JSONArray jSONArray = new JSONArray();
            if (gameRequestContent.getRecipients() != null) {
                Iterator<String> it2 = gameRequestContent.getRecipients().iterator();
                while (it2.hasNext()) {
                    jSONArray.put(it2.next());
                }
            }
            bundle.putString("to", jSONArray.toString());
            NativeProtocol.setupProtocolRequestIntent(intent, appCallCreateBaseAppCall.getCallId().toString(), "", NativeProtocol.getLatestKnownVersion(), bundle);
            appCallCreateBaseAppCall.setRequestIntent(intent);
            return appCallCreateBaseAppCall;
        }

        public /* synthetic */ e(GameRequestDialog gameRequestDialog, a aVar) {
            this();
        }
    }

    public class f extends FacebookDialogBase<GameRequestContent, Result>.ModeHandler {
        private f() {
            super();
        }

        @Override // com.facebook.internal.FacebookDialogBase.ModeHandler
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public boolean canShow(GameRequestContent gameRequestContent, boolean z) {
            return true;
        }

        @Override // com.facebook.internal.FacebookDialogBase.ModeHandler
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public AppCall createAppCall(GameRequestContent gameRequestContent) {
            GameRequestValidation.validate(gameRequestContent);
            AppCall appCallCreateBaseAppCall = GameRequestDialog.this.createBaseAppCall();
            DialogPresenter.setupAppCallForWebDialog(appCallCreateBaseAppCall, GameRequestDialog.h, WebDialogParameters.create(gameRequestContent));
            return appCallCreateBaseAppCall;
        }

        public /* synthetic */ f(GameRequestDialog gameRequestDialog, a aVar) {
            this();
        }
    }

    public GameRequestDialog(Activity activity) {
        super(activity, i);
    }

    public static boolean canShow() {
        return true;
    }

    private static void g(FragmentWrapper fragmentWrapper, GameRequestContent gameRequestContent) {
        new GameRequestDialog(fragmentWrapper).show(gameRequestContent);
    }

    private void h(GameRequestContent gameRequestContent, Object obj) {
        Activity activityContext = getActivityContext();
        AccessToken currentAccessToken = AccessToken.getCurrentAccessToken();
        if (currentAccessToken == null || currentAccessToken.isExpired()) {
            throw new FacebookException("Attempted to open GameRequestDialog with an invalid access token");
        }
        c cVar = new c();
        String applicationId = currentAccessToken.getApplicationId();
        String strName = gameRequestContent.getActionType() != null ? gameRequestContent.getActionType().name() : null;
        JSONObject jSONObject = new JSONObject();
        JSONArray jSONArray = new JSONArray();
        try {
            jSONObject.put(SDKConstants.PARAM_APP_ID, applicationId);
            jSONObject.put("actionType", strName);
            jSONObject.put("message", gameRequestContent.getMessage());
            jSONObject.put(SDKConstants.PARAM_GAME_REQUESTS_CTA, gameRequestContent.getCta());
            jSONObject.put("title", gameRequestContent.getTitle());
            jSONObject.put("data", gameRequestContent.getData());
            jSONObject.put("options", gameRequestContent.getFilters());
            if (gameRequestContent.getRecipients() != null) {
                Iterator<String> it2 = gameRequestContent.getRecipients().iterator();
                while (it2.hasNext()) {
                    jSONArray.put(it2.next());
                }
            }
            jSONObject.put("to", jSONArray);
            DaemonRequest.executeAsync(activityContext, jSONObject, cVar, SDKMessageEnum.OPEN_GAME_REQUESTS_DIALOG);
        } catch (JSONException unused) {
            FacebookCallback facebookCallback = this.g;
            if (facebookCallback != null) {
                facebookCallback.onError(new FacebookException("Couldn't prepare Game Request Dialog"));
            }
        }
    }

    public static void show(Activity activity, GameRequestContent gameRequestContent) {
        new GameRequestDialog(activity).show(gameRequestContent);
    }

    @Override // com.facebook.internal.FacebookDialogBase
    public AppCall createBaseAppCall() {
        return new AppCall(getRequestCodeField());
    }

    @Override // com.facebook.internal.FacebookDialogBase
    public List<FacebookDialogBase<GameRequestContent, Result>.ModeHandler> getOrderedModeHandlers() {
        ArrayList arrayList = new ArrayList();
        a aVar = null;
        arrayList.add(new e(this, aVar));
        arrayList.add(new d(this, aVar));
        arrayList.add(new f(this, aVar));
        return arrayList;
    }

    @Override // com.facebook.internal.FacebookDialogBase
    public void registerCallbackImpl(CallbackManagerImpl callbackManagerImpl, FacebookCallback<Result> facebookCallback) {
        this.g = facebookCallback;
        callbackManagerImpl.registerCallback(getRequestCodeField(), new b(facebookCallback == null ? null : new a(facebookCallback, facebookCallback)));
    }

    public GameRequestDialog(Fragment fragment) {
        this(new FragmentWrapper(fragment));
    }

    public static void show(Fragment fragment, GameRequestContent gameRequestContent) {
        g(new FragmentWrapper(fragment), gameRequestContent);
    }

    @Override // com.facebook.internal.FacebookDialogBase
    public void showImpl(GameRequestContent gameRequestContent, Object obj) {
        if (CloudGameLoginHandler.isRunningInCloud()) {
            h(gameRequestContent, obj);
        } else {
            super.showImpl(gameRequestContent, obj);
        }
    }

    public GameRequestDialog(android.app.Fragment fragment) {
        this(new FragmentWrapper(fragment));
    }

    public static void show(android.app.Fragment fragment, GameRequestContent gameRequestContent) {
        g(new FragmentWrapper(fragment), gameRequestContent);
    }

    private GameRequestDialog(FragmentWrapper fragmentWrapper) {
        super(fragmentWrapper, i);
    }
}
