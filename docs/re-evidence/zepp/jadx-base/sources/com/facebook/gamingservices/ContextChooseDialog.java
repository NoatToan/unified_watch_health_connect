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
import com.facebook.gamingservices.model.ContextChooseContent;
import com.facebook.internal.AppCall;
import com.facebook.internal.CallbackManagerImpl;
import com.facebook.internal.FacebookDialogBase;
import com.facebook.internal.FragmentWrapper;
import com.facebook.internal.NativeProtocol;
import com.facebook.share.internal.ResultProcessor;
import com.facebook.share.internal.ShareInternalUtility;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class ContextChooseDialog extends FacebookDialogBase<ContextChooseContent, Result> {
    private static final int h = CallbackManagerImpl.RequestCodeOffset.GamingContextChoose.toRequestCode();

    @Nullable
    private FacebookCallback g;

    public static final class Result {

        @Nullable
        public String a;

        public /* synthetic */ Result(Bundle bundle, a aVar) {
            this(bundle);
        }

        @Nullable
        public String getContextID() {
            return this.a;
        }

        public /* synthetic */ Result(GraphResponse graphResponse, a aVar) {
            this(graphResponse);
        }

        private Result(Bundle bundle) {
            this.a = bundle.getString("id");
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
            if (ContextChooseDialog.this.g != null) {
                if (graphResponse.getError() != null) {
                    ContextChooseDialog.this.g.onError(new FacebookException(graphResponse.getError().getErrorMessage()));
                } else {
                    ContextChooseDialog.this.g.onSuccess(new Result(graphResponse, (a) null));
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
            if (bundle.getString("id") != null) {
                GamingContext.setCurrentGamingContext(new GamingContext(bundle.getString("id")));
                this.b.onSuccess(new Result(bundle, (a) null));
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
            return ShareInternalUtility.handleActivityResult(ContextChooseDialog.this.getRequestCodeField(), i, intent, this.a);
        }
    }

    public class d extends FacebookDialogBase<ContextChooseContent, Result>.ModeHandler {
        private d() {
            super();
        }

        @Override // com.facebook.internal.FacebookDialogBase.ModeHandler
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public boolean canShow(ContextChooseContent contextChooseContent, boolean z) {
            PackageManager packageManager = ContextChooseDialog.this.getActivityContext().getPackageManager();
            Intent intent = new Intent("com.facebook.games.gaming_services.DEEPLINK");
            intent.setType("text/plain");
            boolean z2 = intent.resolveActivity(packageManager) != null;
            AccessToken currentAccessToken = AccessToken.getCurrentAccessToken();
            return z2 && (currentAccessToken != null && currentAccessToken.getGraphDomain() != null && FacebookSdk.GAMING.equals(currentAccessToken.getGraphDomain()));
        }

        @Override // com.facebook.internal.FacebookDialogBase.ModeHandler
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public AppCall createAppCall(ContextChooseContent contextChooseContent) {
            AppCall appCallCreateBaseAppCall = ContextChooseDialog.this.createBaseAppCall();
            Intent intent = new Intent("com.facebook.games.gaming_services.DEEPLINK");
            intent.setType("text/plain");
            AccessToken currentAccessToken = AccessToken.getCurrentAccessToken();
            Bundle bundle = new Bundle();
            bundle.putString(SDKConstants.PARAM_TOURNAMENTS_DEEPLINK, "CONTEXT_CHOOSE");
            if (currentAccessToken != null) {
                bundle.putString("game_id", currentAccessToken.getApplicationId());
            } else {
                bundle.putString("game_id", FacebookSdk.getApplicationId());
            }
            if (contextChooseContent.getMinSize() != null) {
                bundle.putString("min_thread_size", String.valueOf(contextChooseContent.getMinSize()));
            }
            if (contextChooseContent.getMaxSize() != null) {
                bundle.putString("max_thread_size", String.valueOf(contextChooseContent.getMaxSize()));
            }
            if (contextChooseContent.getFilters() != null) {
                bundle.putString("filters", new JSONArray((Collection) contextChooseContent.getFilters()).toString());
            }
            NativeProtocol.setupProtocolRequestIntent(intent, appCallCreateBaseAppCall.getCallId().toString(), "", NativeProtocol.getLatestKnownVersion(), bundle);
            appCallCreateBaseAppCall.setRequestIntent(intent);
            return appCallCreateBaseAppCall;
        }

        public /* synthetic */ d(ContextChooseDialog contextChooseDialog, a aVar) {
            this();
        }
    }

    public ContextChooseDialog(Activity activity) {
        super(activity, h);
    }

    private void f(ContextChooseContent contextChooseContent, Object obj) {
        Activity activityContext = getActivityContext();
        AccessToken currentAccessToken = AccessToken.getCurrentAccessToken();
        if (currentAccessToken == null || currentAccessToken.isExpired()) {
            throw new FacebookException("Attempted to open ContextChooseContent with an invalid access token");
        }
        a aVar = new a();
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("filters", contextChooseContent.getFilters());
            jSONObject.put(SDKConstants.PARAM_CONTEXT_MIN_SIZE, contextChooseContent.getMinSize());
            List<String> filters = contextChooseContent.getFilters();
            if (filters != null && !filters.isEmpty()) {
                JSONArray jSONArray = new JSONArray();
                for (int i = 0; i < filters.size(); i++) {
                    jSONArray.put(filters.get(i));
                }
                jSONObject.put("filters", jSONArray);
            }
            DaemonRequest.executeAsync(activityContext, jSONObject, aVar, SDKMessageEnum.CONTEXT_CHOOSE);
        } catch (JSONException unused) {
            FacebookCallback facebookCallback = this.g;
            if (facebookCallback != null) {
                facebookCallback.onError(new FacebookException("Couldn't prepare Context Choose Dialog"));
            }
        }
    }

    @Override // com.facebook.internal.FacebookDialogBase
    public AppCall createBaseAppCall() {
        return new AppCall(getRequestCodeField());
    }

    @Override // com.facebook.internal.FacebookDialogBase
    public List<FacebookDialogBase<ContextChooseContent, Result>.ModeHandler> getOrderedModeHandlers() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new d(this, null));
        return arrayList;
    }

    @Override // com.facebook.internal.FacebookDialogBase
    public void registerCallbackImpl(CallbackManagerImpl callbackManagerImpl, FacebookCallback<Result> facebookCallback) {
        this.g = facebookCallback;
        callbackManagerImpl.registerCallback(getRequestCodeField(), new c(facebookCallback == null ? null : new b(facebookCallback, facebookCallback)));
    }

    public ContextChooseDialog(Fragment fragment) {
        this(new FragmentWrapper(fragment));
    }

    @Override // com.facebook.internal.FacebookDialogBase, com.facebook.FacebookDialog
    public boolean canShow(ContextChooseContent contextChooseContent) {
        if (CloudGameLoginHandler.isRunningInCloud()) {
            return true;
        }
        return new d(this, null).canShow(contextChooseContent, true);
    }

    @Override // com.facebook.internal.FacebookDialogBase
    public void showImpl(ContextChooseContent contextChooseContent, Object obj) {
        if (CloudGameLoginHandler.isRunningInCloud()) {
            f(contextChooseContent, obj);
        } else {
            super.showImpl(contextChooseContent, obj);
        }
    }

    public ContextChooseDialog(android.app.Fragment fragment) {
        this(new FragmentWrapper(fragment));
    }

    private ContextChooseDialog(FragmentWrapper fragmentWrapper) {
        super(fragmentWrapper, h);
    }
}
