package com.facebook.gamingservices;

import android.app.Activity;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Bundle;
import androidx.annotation.Nullable;
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
import com.facebook.gamingservices.model.ContextCreateContent;
import com.facebook.internal.AppCall;
import com.facebook.internal.CallbackManagerImpl;
import com.facebook.internal.DialogPresenter;
import com.facebook.internal.FacebookDialogBase;
import com.facebook.internal.FragmentWrapper;
import com.facebook.internal.NativeProtocol;
import com.facebook.share.internal.ResultProcessor;
import com.facebook.share.internal.ShareInternalUtility;
import com.huami.tools.analytics.DbUtils;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class ContextCreateDialog extends FacebookDialogBase<ContextCreateContent, Result> {
    private static final int h = CallbackManagerImpl.RequestCodeOffset.GamingContextCreate.toRequestCode();

    @Nullable
    private FacebookCallback g;

    public static final class Result {

        @Nullable
        public String a;

        public /* synthetic */ Result(GraphResponse graphResponse, a aVar) {
            this(graphResponse);
        }

        @Nullable
        public String getContextID() {
            return this.a;
        }

        public /* synthetic */ Result(String str, a aVar) {
            this(str);
        }

        private Result(String str) {
            this.a = str;
        }

        private Result(GraphResponse graphResponse) {
            try {
                JSONObject graphObject = graphResponse.getGraphObject();
                if (graphObject == null) {
                    this.a = null;
                } else {
                    JSONObject jSONObjectOptJSONObject = graphObject.optJSONObject("data");
                    this.a = jSONObjectOptJSONObject != null ? jSONObjectOptJSONObject.getString("id") : null;
                }
            } catch (JSONException unused) {
                this.a = null;
            }
        }
    }

    public class a implements DaemonRequest.Callback {
        public a() {
        }

        @Override // com.facebook.gamingservices.cloudgaming.DaemonRequest.Callback
        public void onCompleted(GraphResponse graphResponse) {
            if (ContextCreateDialog.this.g != null) {
                if (graphResponse.getError() != null) {
                    ContextCreateDialog.this.g.onError(new FacebookException(graphResponse.getError().getErrorMessage()));
                } else {
                    ContextCreateDialog.this.g.onSuccess(new Result(graphResponse, (a) null));
                }
            }
        }
    }

    public class b extends ResultProcessor {
        public final /* synthetic */ FacebookCallback b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(FacebookCallback facebookCallback, FacebookCallback facebookCallback2) {
            super(facebookCallback);
            this.b = facebookCallback2;
        }

        @Override // com.facebook.share.internal.ResultProcessor
        public void onSuccess(AppCall appCall, Bundle bundle) {
            if (bundle == null) {
                onCancel(appCall);
                return;
            }
            if (bundle.getString("error_message") != null) {
                this.b.onError(new FacebookException(bundle.getString("error_message")));
                return;
            }
            a aVar = null;
            if (bundle.getString("id") != null) {
                GamingContext.setCurrentGamingContext(new GamingContext(bundle.getString("id")));
                this.b.onSuccess(new Result(bundle.getString("id"), aVar));
            } else if (bundle.getString(SDKConstants.PARAM_CONTEXT_CONTEXT_ID) != null) {
                GamingContext.setCurrentGamingContext(new GamingContext(bundle.getString(SDKConstants.PARAM_CONTEXT_CONTEXT_ID)));
                this.b.onSuccess(new Result(bundle.getString(SDKConstants.PARAM_CONTEXT_CONTEXT_ID), aVar));
            }
            this.b.onError(new FacebookException(bundle.getString("Invalid response received from server.")));
        }
    }

    public class c implements CallbackManagerImpl.Callback {
        public final /* synthetic */ ResultProcessor a;

        public c(ResultProcessor resultProcessor) {
            this.a = resultProcessor;
        }

        @Override // com.facebook.internal.CallbackManagerImpl.Callback
        public boolean onActivityResult(int i, Intent intent) {
            return ShareInternalUtility.handleActivityResult(ContextCreateDialog.this.getRequestCodeField(), i, intent, this.a);
        }
    }

    public class d extends FacebookDialogBase<ContextCreateContent, Result>.ModeHandler {
        private d() {
            super();
        }

        @Override // com.facebook.internal.FacebookDialogBase.ModeHandler
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public boolean canShow(ContextCreateContent contextCreateContent, boolean z) {
            PackageManager packageManager = ContextCreateDialog.this.getActivityContext().getPackageManager();
            Intent intent = new Intent("com.facebook.games.gaming_services.DEEPLINK");
            intent.setType("text/plain");
            boolean z2 = intent.resolveActivity(packageManager) != null;
            AccessToken currentAccessToken = AccessToken.getCurrentAccessToken();
            return z2 && (currentAccessToken != null && currentAccessToken.getGraphDomain() != null && FacebookSdk.GAMING.equals(currentAccessToken.getGraphDomain()));
        }

        @Override // com.facebook.internal.FacebookDialogBase.ModeHandler
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public AppCall createAppCall(ContextCreateContent contextCreateContent) {
            AppCall appCallCreateBaseAppCall = ContextCreateDialog.this.createBaseAppCall();
            Intent intent = new Intent("com.facebook.games.gaming_services.DEEPLINK");
            intent.setType("text/plain");
            AccessToken currentAccessToken = AccessToken.getCurrentAccessToken();
            Bundle bundle = new Bundle();
            bundle.putString(SDKConstants.PARAM_TOURNAMENTS_DEEPLINK, "CONTEXT_CREATE");
            if (currentAccessToken != null) {
                bundle.putString("game_id", currentAccessToken.getApplicationId());
            } else {
                bundle.putString("game_id", FacebookSdk.getApplicationId());
            }
            if (contextCreateContent.getSuggestedPlayerID() != null) {
                bundle.putString("player_id", contextCreateContent.getSuggestedPlayerID());
            }
            NativeProtocol.setupProtocolRequestIntent(intent, appCallCreateBaseAppCall.getCallId().toString(), "", NativeProtocol.getLatestKnownVersion(), bundle);
            appCallCreateBaseAppCall.setRequestIntent(intent);
            return appCallCreateBaseAppCall;
        }

        public /* synthetic */ d(ContextCreateDialog contextCreateDialog, a aVar) {
            this();
        }
    }

    public class e extends FacebookDialogBase<ContextCreateContent, Result>.ModeHandler {
        private e() {
            super();
        }

        @Override // com.facebook.internal.FacebookDialogBase.ModeHandler
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public boolean canShow(ContextCreateContent contextCreateContent, boolean z) {
            return true;
        }

        @Override // com.facebook.internal.FacebookDialogBase.ModeHandler
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public AppCall createAppCall(ContextCreateContent contextCreateContent) {
            AppCall appCallCreateBaseAppCall = ContextCreateDialog.this.createBaseAppCall();
            Bundle bundle = new Bundle();
            bundle.putString("player_id", contextCreateContent.getSuggestedPlayerID());
            AccessToken currentAccessToken = AccessToken.getCurrentAccessToken();
            if (currentAccessToken != null) {
                bundle.putString("dialog_access_token", currentAccessToken.getToken());
            }
            DialogPresenter.setupAppCallForWebDialog(appCallCreateBaseAppCall, DbUtils.Const.Table.CONTEXT, bundle);
            return appCallCreateBaseAppCall;
        }

        public /* synthetic */ e(ContextCreateDialog contextCreateDialog, a aVar) {
            this();
        }
    }

    public ContextCreateDialog(Activity activity) {
        super(activity, h);
    }

    private void f(ContextCreateContent contextCreateContent, Object obj) {
        Activity activityContext = getActivityContext();
        AccessToken currentAccessToken = AccessToken.getCurrentAccessToken();
        if (currentAccessToken == null || currentAccessToken.isExpired()) {
            throw new FacebookException("Attempted to open ContextCreateContent with an invalid access token");
        }
        a aVar = new a();
        JSONObject jSONObject = new JSONObject();
        try {
            if (contextCreateContent.getSuggestedPlayerID() != null) {
                jSONObject.put("id", contextCreateContent.getSuggestedPlayerID());
            }
            DaemonRequest.executeAsync(activityContext, jSONObject, aVar, SDKMessageEnum.CONTEXT_CREATE);
        } catch (JSONException unused) {
            FacebookCallback facebookCallback = this.g;
            if (facebookCallback != null) {
                facebookCallback.onError(new FacebookException("Couldn't prepare Context Create Dialog"));
            }
        }
    }

    @Override // com.facebook.internal.FacebookDialogBase
    public AppCall createBaseAppCall() {
        return new AppCall(getRequestCodeField());
    }

    @Override // com.facebook.internal.FacebookDialogBase
    public List<FacebookDialogBase<ContextCreateContent, Result>.ModeHandler> getOrderedModeHandlers() {
        ArrayList arrayList = new ArrayList();
        a aVar = null;
        arrayList.add(new d(this, aVar));
        arrayList.add(new e(this, aVar));
        return arrayList;
    }

    @Override // com.facebook.internal.FacebookDialogBase
    public void registerCallbackImpl(CallbackManagerImpl callbackManagerImpl, FacebookCallback<Result> facebookCallback) {
        this.g = facebookCallback;
        callbackManagerImpl.registerCallback(getRequestCodeField(), new c(facebookCallback == null ? null : new b(facebookCallback, facebookCallback)));
    }

    public ContextCreateDialog(Fragment fragment) {
        this(new FragmentWrapper(fragment));
    }

    @Override // com.facebook.internal.FacebookDialogBase, com.facebook.FacebookDialog
    public boolean canShow(ContextCreateContent contextCreateContent) {
        if (CloudGameLoginHandler.isRunningInCloud()) {
            return true;
        }
        a aVar = null;
        return new d(this, aVar).canShow(contextCreateContent, true) || new e(this, aVar).canShow(contextCreateContent, true);
    }

    @Override // com.facebook.internal.FacebookDialogBase
    public void showImpl(ContextCreateContent contextCreateContent, Object obj) {
        if (CloudGameLoginHandler.isRunningInCloud()) {
            f(contextCreateContent, obj);
        } else {
            super.showImpl(contextCreateContent, obj);
        }
    }

    public ContextCreateDialog(android.app.Fragment fragment) {
        this(new FragmentWrapper(fragment));
    }

    private ContextCreateDialog(FragmentWrapper fragmentWrapper) {
        super(fragmentWrapper, h);
    }
}
