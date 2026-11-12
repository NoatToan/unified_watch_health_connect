package com.facebook.referrals;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import androidx.fragment.app.Fragment;
import com.facebook.CallbackManager;
import com.facebook.FacebookActivity;
import com.facebook.FacebookCallback;
import com.facebook.FacebookException;
import com.facebook.FacebookSdk;
import com.facebook.internal.CallbackManagerImpl;
import com.facebook.internal.FragmentWrapper;
import com.facebook.internal.Utility;
import com.facebook.internal.Validate;
import org.json.JSONArray;
import org.json.JSONException;

/* JADX INFO: loaded from: classes2.dex */
@Deprecated
public class ReferralManager {
    private static volatile ReferralManager b;
    private ReferralLogger a;

    public class a implements CallbackManagerImpl.Callback {
        public final /* synthetic */ FacebookCallback a;

        public a(FacebookCallback facebookCallback) {
            this.a = facebookCallback;
        }

        @Override // com.facebook.internal.CallbackManagerImpl.Callback
        public boolean onActivityResult(int i, Intent intent) {
            return ReferralManager.this.b(i, intent, this.a);
        }
    }

    public static class b implements com.facebook.referrals.b {
        private final Activity a;

        public b(Activity activity) {
            Validate.notNull(activity, "activity");
            this.a = activity;
        }

        @Override // com.facebook.referrals.b
        public Activity a() {
            return this.a;
        }

        @Override // com.facebook.referrals.b
        public void startActivityForResult(Intent intent, int i) {
            this.a.startActivityForResult(intent, i);
        }
    }

    public static class c implements com.facebook.referrals.b {
        private final FragmentWrapper a;

        public c(FragmentWrapper fragmentWrapper) {
            Validate.notNull(fragmentWrapper, "fragment");
            this.a = fragmentWrapper;
        }

        @Override // com.facebook.referrals.b
        public Activity a() {
            return this.a.getActivity();
        }

        @Override // com.facebook.referrals.b
        public void startActivityForResult(Intent intent, int i) {
            this.a.startActivityForResult(intent, i);
        }
    }

    public ReferralManager() {
        Validate.sdkInitialized();
    }

    private ReferralLogger a(Context context) {
        if (context == null) {
            context = FacebookSdk.getApplicationContext();
        }
        if (context == null) {
            return null;
        }
        if (this.a == null) {
            this.a = new ReferralLogger(context, FacebookSdk.getApplicationId());
        }
        return this.a;
    }

    private static boolean c(Intent intent) {
        return FacebookSdk.getApplicationContext().getPackageManager().resolveActivity(intent, 0) != null;
    }

    private void d(com.facebook.referrals.b bVar) {
        ReferralLogger referralLoggerA = a(bVar.a());
        if (referralLoggerA != null) {
            referralLoggerA.logStartReferral();
        }
        if (e(bVar)) {
            return;
        }
        FacebookException facebookException = new FacebookException("Failed to open Referral dialog: FacebookActivity could not be started. Please make sure you added FacebookActivity to the AndroidManifest.");
        if (referralLoggerA == null) {
            throw facebookException;
        }
        referralLoggerA.logError(facebookException);
        throw facebookException;
    }

    private boolean e(com.facebook.referrals.b bVar) {
        Intent intent = new Intent();
        intent.setClass(FacebookSdk.getApplicationContext(), FacebookActivity.class);
        intent.setAction(ReferralFragment.TAG);
        if (!c(intent)) {
            return false;
        }
        try {
            bVar.startActivityForResult(intent, CallbackManagerImpl.RequestCodeOffset.Referral.toRequestCode());
            return true;
        } catch (ActivityNotFoundException unused) {
            return false;
        }
    }

    public static ReferralManager getInstance() {
        if (b == null) {
            synchronized (ReferralManager.class) {
                if (b == null) {
                    b = new ReferralManager();
                }
            }
        }
        return b;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0032 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:11:0x0034  */
    /* JADX WARN: Code duplicated, block: B:18:0x0057 A[Catch: JSONException -> 0x0060, TRY_LEAVE, TryCatch #0 {JSONException -> 0x0060, blocks: (B:5:0x000a, B:7:0x0010, B:9:0x001a, B:12:0x0036, B:14:0x003c, B:16:0x0046, B:18:0x0057), top: B:36:0x000a }] */
    public boolean b(int i, Intent intent, FacebookCallback<ReferralResult> facebookCallback) {
        FacebookException facebookException;
        FacebookException facebookException2;
        ReferralResult referralResult;
        if (i != -1 || intent == null) {
            if (i != 0) {
                facebookException = new FacebookException("Unexpected call to ReferralManager.onActivityResult");
            } else if (intent == null && intent.getExtras() != null && intent.getExtras().containsKey("error_message")) {
                facebookException = new FacebookException(intent.getExtras().getString("error_message"));
            } else {
                facebookException2 = null;
                referralResult = null;
            }
            facebookException2 = facebookException;
            referralResult = null;
        } else {
            try {
                if (intent.getExtras() == null || !intent.getExtras().containsKey(com.facebook.referrals.a.d)) {
                    if (i != 0) {
                        if (intent == null) {
                        }
                        facebookException2 = null;
                        referralResult = null;
                    } else {
                        facebookException = new FacebookException("Unexpected call to ReferralManager.onActivityResult");
                    }
                    facebookException2 = facebookException;
                    referralResult = null;
                } else {
                    referralResult = new ReferralResult(Utility.convertJSONArrayToList(new JSONArray(intent.getExtras().getString(com.facebook.referrals.a.d))));
                    facebookException2 = null;
                }
            } catch (JSONException unused) {
                facebookException2 = new FacebookException("Unable to parse referral codes from response");
            }
        }
        ReferralLogger referralLoggerA = a(null);
        if (referralLoggerA != null) {
            if (referralResult != null) {
                referralLoggerA.logSuccess();
            } else if (facebookException2 != null) {
                referralLoggerA.logError(facebookException2);
            } else {
                referralLoggerA.logCancel();
            }
        }
        if (referralResult != null) {
            facebookCallback.onSuccess(referralResult);
            return true;
        }
        if (facebookException2 != null) {
            facebookCallback.onError(facebookException2);
            return true;
        }
        facebookCallback.onCancel();
        return true;
    }

    public void registerCallback(CallbackManager callbackManager, FacebookCallback<ReferralResult> facebookCallback) {
        if (!(callbackManager instanceof CallbackManagerImpl)) {
            throw new FacebookException("Unexpected CallbackManager, please use the provided Factory.");
        }
        ((CallbackManagerImpl) callbackManager).registerCallback(com.facebook.referrals.a.e(), new a(facebookCallback));
    }

    public void startReferral(Activity activity) {
        d(new b(activity));
    }

    public void startReferral(Fragment fragment) {
        d(new c(new FragmentWrapper(fragment)));
    }

    public void startReferral(android.app.Fragment fragment) {
        d(new c(new FragmentWrapper(fragment)));
    }

    public void startReferral(FragmentWrapper fragmentWrapper) {
        d(new c(fragmentWrapper));
    }
}
