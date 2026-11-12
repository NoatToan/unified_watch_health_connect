package com.facebook.gamingservices;

import android.app.Activity;
import android.app.Fragment;
import android.content.Intent;
import android.net.Uri;
import com.facebook.AccessToken;
import com.facebook.FacebookCallback;
import com.facebook.FacebookException;
import com.facebook.FacebookRequestError;
import com.facebook.GraphResponse;
import com.facebook.gamingservices.cloudgaming.CloudGameLoginHandler;
import com.facebook.gamingservices.cloudgaming.DaemonRequest;
import com.facebook.gamingservices.cloudgaming.internal.SDKConstants;
import com.facebook.gamingservices.cloudgaming.internal.SDKMessageEnum;
import com.facebook.internal.AppCall;
import com.facebook.internal.CallbackManagerImpl;
import com.facebook.internal.FacebookDialogBase;
import com.facebook.internal.FragmentWrapper;
import com.facebook.internal.instrument.crashshield.AutoHandleExceptions;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
@AutoHandleExceptions
public class FriendFinderDialog extends FacebookDialogBase<Void, Result> {
    private static final int h = CallbackManagerImpl.RequestCodeOffset.GamingFriendFinder.toRequestCode();
    private FacebookCallback g;

    public static class Result {
    }

    public class a implements DaemonRequest.Callback {
        public a() {
        }

        @Override // com.facebook.gamingservices.cloudgaming.DaemonRequest.Callback
        public void onCompleted(GraphResponse graphResponse) {
            if (FriendFinderDialog.this.g != null) {
                if (graphResponse.getError() != null) {
                    FriendFinderDialog.this.g.onError(new FacebookException(graphResponse.getError().getErrorMessage()));
                } else {
                    FriendFinderDialog.this.g.onSuccess(new Result());
                }
            }
        }
    }

    public class b implements CallbackManagerImpl.Callback {
        public final /* synthetic */ FacebookCallback a;

        public b(FacebookCallback facebookCallback) {
            this.a = facebookCallback;
        }

        @Override // com.facebook.internal.CallbackManagerImpl.Callback
        public boolean onActivityResult(int i, Intent intent) {
            if (intent == null || !intent.hasExtra("error")) {
                this.a.onSuccess(new Result());
                return true;
            }
            this.a.onError(((FacebookRequestError) intent.getParcelableExtra("error")).getIo.flutter.plugins.firebase.crashlytics.Constants.EXCEPTION java.lang.String());
            return true;
        }
    }

    public FriendFinderDialog(Activity activity) {
        super(activity, h);
    }

    @Override // com.facebook.internal.FacebookDialogBase
    public AppCall createBaseAppCall() {
        return null;
    }

    @Override // com.facebook.internal.FacebookDialogBase
    public List<FacebookDialogBase<Void, Result>.ModeHandler> getOrderedModeHandlers() {
        return null;
    }

    @Override // com.facebook.internal.FacebookDialogBase
    public void registerCallbackImpl(CallbackManagerImpl callbackManagerImpl, FacebookCallback<Result> facebookCallback) {
        this.g = facebookCallback;
        callbackManagerImpl.registerCallback(getRequestCodeField(), new b(facebookCallback));
    }

    public void showImpl() {
        AccessToken currentAccessToken = AccessToken.getCurrentAccessToken();
        if (currentAccessToken == null || currentAccessToken.isExpired()) {
            throw new FacebookException("Attempted to open GamingServices FriendFinder with an invalid access token");
        }
        String applicationId = currentAccessToken.getApplicationId();
        if (!CloudGameLoginHandler.isRunningInCloud()) {
            startActivityForResult(new Intent("android.intent.action.VIEW", Uri.parse("https://fb.gg/me/friendfinder/" + applicationId)), getRequestCodeField());
            return;
        }
        Activity activityContext = getActivityContext();
        a aVar = new a();
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("id", applicationId);
            jSONObject.put(SDKConstants.PARAM_DEEP_LINK, "FRIEND_FINDER");
            DaemonRequest.executeAsync(activityContext, jSONObject, aVar, SDKMessageEnum.OPEN_GAMING_SERVICES_DEEP_LINK);
        } catch (JSONException unused) {
            FacebookCallback facebookCallback = this.g;
            if (facebookCallback != null) {
                facebookCallback.onError(new FacebookException("Couldn't prepare Friend Finder Dialog"));
            }
        }
    }

    public FriendFinderDialog(Fragment fragment) {
        super(new FragmentWrapper(fragment), h);
    }

    public void show() {
        showImpl();
    }

    public FriendFinderDialog(androidx.fragment.app.Fragment fragment) {
        super(new FragmentWrapper(fragment), h);
    }

    @Override // com.facebook.internal.FacebookDialogBase, com.facebook.FacebookDialog
    public void show(Void r1) {
        showImpl();
    }
}
