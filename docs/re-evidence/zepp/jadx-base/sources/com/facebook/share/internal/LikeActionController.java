package com.facebook.share.internal;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import androidx.localbroadcastmanager.content.LocalBroadcastManager;
import com.facebook.AccessToken;
import com.facebook.AccessTokenTracker;
import com.facebook.FacebookCallback;
import com.facebook.FacebookException;
import com.facebook.FacebookOperationCanceledException;
import com.facebook.FacebookRequestError;
import com.facebook.FacebookSdk;
import com.facebook.GraphRequest;
import com.facebook.GraphRequestBatch;
import com.facebook.GraphResponse;
import com.facebook.HttpMethod;
import com.facebook.LoggingBehavior;
import com.facebook.appevents.InternalAppEventsLogger;
import com.facebook.internal.AnalyticsEvents;
import com.facebook.internal.AppCall;
import com.facebook.internal.BundleJSONConverter;
import com.facebook.internal.CallbackManagerImpl;
import com.facebook.internal.FileLruCache;
import com.facebook.internal.FragmentWrapper;
import com.facebook.internal.Logger;
import com.facebook.internal.NativeProtocol;
import com.facebook.internal.PlatformServiceClient;
import com.facebook.internal.Utility;
import com.facebook.internal.WorkQueue;
import com.facebook.internal.instrument.crashshield.CrashShieldHandler;
import com.facebook.share.widget.LikeView;
import com.google.android.exoplayer2.util.MimeTypes;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Locale;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
@Deprecated
public class LikeActionController {
    private static final String A = "social_sentence_with_like";

    @Deprecated
    public static final String ACTION_LIKE_ACTION_CONTROLLER_DID_ERROR = "com.facebook.sdk.LikeActionController.DID_ERROR";

    @Deprecated
    public static final String ACTION_LIKE_ACTION_CONTROLLER_DID_RESET = "com.facebook.sdk.LikeActionController.DID_RESET";

    @Deprecated
    public static final String ACTION_LIKE_ACTION_CONTROLLER_UPDATED = "com.facebook.sdk.LikeActionController.UPDATED";

    @Deprecated
    public static final String ACTION_OBJECT_ID_KEY = "com.facebook.sdk.LikeActionController.OBJECT_ID";
    private static final String B = "social_sentence_without_like";
    private static final String C = "is_object_liked";
    private static final String D = "unlike_token";
    private static final String E = "facebook_dialog_analytics_bundle";

    @Deprecated
    public static final String ERROR_INVALID_OBJECT_ID = "Invalid Object Id";

    @Deprecated
    public static final String ERROR_PUBLISH_ERROR = "Unable to publish the like/unlike action";
    private static final String F = "object_is_liked";
    private static final String G = "like_count_string";
    private static final String H = "social_sentence";
    private static final String I = "unlike_token";
    private static final int J = 3501;
    private static FileLruCache K = null;
    private static final ConcurrentHashMap<String, LikeActionController> L = new ConcurrentHashMap<>();
    private static WorkQueue M = new WorkQueue(1);
    private static WorkQueue N = new WorkQueue(1);
    private static Handler O = null;
    private static String P = null;
    private static boolean Q = false;
    private static volatile int R = 0;
    private static AccessTokenTracker S = null;
    private static final String o = "LikeActionController";
    private static final int p = 3;
    private static final int q = 128;
    private static final int r = 1000;
    private static final String s = "com.facebook.LikeActionController.CONTROLLER_STORE_KEY";
    private static final String t = "PENDING_CONTROLLER_KEY";
    private static final String u = "OBJECT_SUFFIX";
    private static final String v = "com.facebook.share.internal.LikeActionController.version";
    private static final String w = "object_id";
    private static final String x = "object_type";
    private static final String y = "like_count_string_with_like";
    private static final String z = "like_count_string_without_like";
    private String a;
    private LikeView.ObjectType b;
    private boolean c;
    private String d;
    private String e;
    private String f;
    private String g;
    private String h;
    private String i;
    private boolean j;
    private boolean k;
    private boolean l;
    private Bundle m;
    private InternalAppEventsLogger n;

    @Deprecated
    public interface CreationCallback {
        void onComplete(LikeActionController likeActionController, FacebookException facebookException);
    }

    public class a implements PlatformServiceClient.CompletedListener {
        public a() {
        }

        @Override // com.facebook.internal.PlatformServiceClient.CompletedListener
        public void completed(Bundle bundle) {
            if (bundle == null || !bundle.containsKey(ShareConstants.EXTRA_OBJECT_IS_LIKED)) {
                return;
            }
            LikeActionController.this.m0(bundle.getBoolean(ShareConstants.EXTRA_OBJECT_IS_LIKED), bundle.containsKey(ShareConstants.EXTRA_LIKE_COUNT_STRING_WITH_LIKE) ? bundle.getString(ShareConstants.EXTRA_LIKE_COUNT_STRING_WITH_LIKE) : LikeActionController.this.d, bundle.containsKey(ShareConstants.EXTRA_LIKE_COUNT_STRING_WITHOUT_LIKE) ? bundle.getString(ShareConstants.EXTRA_LIKE_COUNT_STRING_WITHOUT_LIKE) : LikeActionController.this.e, bundle.containsKey(ShareConstants.EXTRA_SOCIAL_SENTENCE_WITH_LIKE) ? bundle.getString(ShareConstants.EXTRA_SOCIAL_SENTENCE_WITH_LIKE) : LikeActionController.this.f, bundle.containsKey(ShareConstants.EXTRA_SOCIAL_SENTENCE_WITHOUT_LIKE) ? bundle.getString(ShareConstants.EXTRA_SOCIAL_SENTENCE_WITHOUT_LIKE) : LikeActionController.this.g, bundle.containsKey(ShareConstants.EXTRA_UNLIKE_TOKEN) ? bundle.getString(ShareConstants.EXTRA_UNLIKE_TOKEN) : LikeActionController.this.h);
        }
    }

    public class b implements GraphRequestBatch.Callback {
        public final /* synthetic */ p a;
        public final /* synthetic */ r b;
        public final /* synthetic */ x c;

        public b(p pVar, r rVar, x xVar) {
            this.a = pVar;
            this.b = rVar;
            this.c = xVar;
        }

        @Override // com.facebook.GraphRequestBatch.Callback
        public void onBatchCompleted(GraphRequestBatch graphRequestBatch) {
            LikeActionController.this.i = this.a.f;
            if (Utility.isNullOrEmpty(LikeActionController.this.i)) {
                LikeActionController.this.i = this.b.f;
                LikeActionController.this.j = this.b.g;
            }
            if (Utility.isNullOrEmpty(LikeActionController.this.i)) {
                Logger.log(LoggingBehavior.DEVELOPER_ERRORS, LikeActionController.o, "Unable to verify the FB id for '%s'. Verify that it is a valid FB object or page", LikeActionController.this.a);
                LikeActionController.this.T("get_verified_id", this.b.getError() != null ? this.b.getError() : this.a.getError());
            }
            x xVar = this.c;
            if (xVar != null) {
                xVar.onComplete();
            }
        }
    }

    public static /* synthetic */ class c {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[LikeView.ObjectType.values().length];
            a = iArr;
            try {
                iArr[LikeView.ObjectType.PAGE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
        }
    }

    public static class d implements CreationCallback {
        public final /* synthetic */ int a;
        public final /* synthetic */ int b;
        public final /* synthetic */ Intent c;

        public d(int i, int i2, Intent intent) {
            this.a = i;
            this.b = i2;
            this.c = intent;
        }

        @Override // com.facebook.share.internal.LikeActionController.CreationCallback
        public void onComplete(LikeActionController likeActionController, FacebookException facebookException) {
            if (facebookException == null) {
                likeActionController.U(this.a, this.b, this.c);
            } else {
                Utility.logd(LikeActionController.o, facebookException);
            }
        }
    }

    public static class e implements Runnable {
        public e() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (CrashShieldHandler.isObjectCrashing(this)) {
                return;
            }
            try {
                LikeActionController.this.d0();
            } catch (Throwable th) {
                CrashShieldHandler.handleThrowable(th, this);
            }
        }
    }

    public static class f implements CallbackManagerImpl.Callback {
        @Override // com.facebook.internal.CallbackManagerImpl.Callback
        public boolean onActivityResult(int i, Intent intent) {
            return LikeActionController.handleOnActivityResult(CallbackManagerImpl.RequestCodeOffset.Like.toRequestCode(), i, intent);
        }
    }

    public static class g implements Runnable {
        public final /* synthetic */ CreationCallback a;
        public final /* synthetic */ LikeActionController b;
        public final /* synthetic */ FacebookException c;

        public g(CreationCallback creationCallback, LikeActionController likeActionController, FacebookException facebookException) {
            this.a = creationCallback;
            this.b = likeActionController;
            this.c = facebookException;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (CrashShieldHandler.isObjectCrashing(this)) {
                return;
            }
            try {
                this.a.onComplete(this.b, this.c);
            } catch (Throwable th) {
                CrashShieldHandler.handleThrowable(th, this);
            }
        }
    }

    public static class h extends AccessTokenTracker {
        @Override // com.facebook.AccessTokenTracker
        public void onCurrentAccessTokenChanged(AccessToken accessToken, AccessToken accessToken2) {
            Context applicationContext = FacebookSdk.getApplicationContext();
            if (accessToken2 == null) {
                int unused = LikeActionController.R = (LikeActionController.R + 1) % 1000;
                applicationContext.getSharedPreferences(LikeActionController.s, 0).edit().putInt(LikeActionController.u, LikeActionController.R).apply();
                LikeActionController.L.clear();
                LikeActionController.K.clearCache();
            }
            LikeActionController.F(null, LikeActionController.ACTION_LIKE_ACTION_CONTROLLER_DID_RESET);
        }
    }

    public class i extends ResultProcessor {
        public final /* synthetic */ Bundle b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(FacebookCallback facebookCallback, Bundle bundle) {
            super(facebookCallback);
            this.b = bundle;
        }

        @Override // com.facebook.share.internal.ResultProcessor
        public void onCancel(AppCall appCall) {
            onError(appCall, new FacebookOperationCanceledException());
        }

        @Override // com.facebook.share.internal.ResultProcessor
        public void onError(AppCall appCall, FacebookException facebookException) {
            Logger.log(LoggingBehavior.REQUESTS, LikeActionController.o, "Like Dialog failed with error : %s", facebookException);
            Bundle bundle = this.b;
            if (bundle == null) {
                bundle = new Bundle();
            }
            bundle.putString(AnalyticsEvents.PARAMETER_CALL_ID, appCall.getCallId().toString());
            LikeActionController.this.S("present_dialog", bundle);
            LikeActionController.G(LikeActionController.this, LikeActionController.ACTION_LIKE_ACTION_CONTROLLER_DID_ERROR, NativeProtocol.createBundleForException(facebookException));
        }

        @Override // com.facebook.share.internal.ResultProcessor
        public void onSuccess(AppCall appCall, Bundle bundle) {
            String string;
            String str;
            String string2;
            String str2;
            if (bundle == null || !bundle.containsKey(LikeActionController.F)) {
                return;
            }
            boolean z = bundle.getBoolean(LikeActionController.F);
            String str3 = LikeActionController.this.d;
            String str4 = LikeActionController.this.e;
            if (bundle.containsKey(LikeActionController.G)) {
                string = bundle.getString(LikeActionController.G);
                str = string;
            } else {
                string = str3;
                str = str4;
            }
            String str5 = LikeActionController.this.f;
            String str6 = LikeActionController.this.g;
            if (bundle.containsKey(LikeActionController.H)) {
                string2 = bundle.getString(LikeActionController.H);
                str2 = string2;
            } else {
                string2 = str5;
                str2 = str6;
            }
            String string3 = bundle.containsKey(LikeActionController.F) ? bundle.getString("unlike_token") : LikeActionController.this.h;
            Bundle bundle2 = this.b;
            if (bundle2 == null) {
                bundle2 = new Bundle();
            }
            bundle2.putString(AnalyticsEvents.PARAMETER_CALL_ID, appCall.getCallId().toString());
            LikeActionController.this.N().logEventImplicitly(AnalyticsEvents.EVENT_LIKE_VIEW_DIALOG_DID_SUCCEED, bundle2);
            LikeActionController.this.m0(z, string, str, string2, str2, string3);
        }
    }

    public class j implements x {
        public final /* synthetic */ Bundle a;

        public class a implements GraphRequestBatch.Callback {
            public final /* synthetic */ v a;

            public a(v vVar) {
                this.a = vVar;
            }

            @Override // com.facebook.GraphRequestBatch.Callback
            public void onBatchCompleted(GraphRequestBatch graphRequestBatch) {
                LikeActionController.this.l = false;
                if (this.a.getError() != null) {
                    LikeActionController.this.Y(false);
                    return;
                }
                LikeActionController.this.h = Utility.coerceValueIfNullOrEmpty(this.a.f, null);
                LikeActionController.this.k = true;
                LikeActionController.this.N().logEventImplicitly(AnalyticsEvents.EVENT_LIKE_VIEW_DID_LIKE, null, j.this.a);
                j jVar = j.this;
                LikeActionController.this.X(jVar.a);
            }
        }

        public j(Bundle bundle) {
            this.a = bundle;
        }

        @Override // com.facebook.share.internal.LikeActionController.x
        public void onComplete() {
            if (Utility.isNullOrEmpty(LikeActionController.this.i)) {
                Bundle bundle = new Bundle();
                bundle.putString(NativeProtocol.STATUS_ERROR_DESCRIPTION, LikeActionController.ERROR_INVALID_OBJECT_ID);
                LikeActionController.G(LikeActionController.this, LikeActionController.ACTION_LIKE_ACTION_CONTROLLER_DID_ERROR, bundle);
            } else {
                GraphRequestBatch graphRequestBatch = new GraphRequestBatch();
                LikeActionController likeActionController = LikeActionController.this;
                v vVar = likeActionController.new v(likeActionController.i, LikeActionController.this.b);
                vVar.a(graphRequestBatch);
                graphRequestBatch.addCallback(new a(vVar));
                graphRequestBatch.executeAsync();
            }
        }
    }

    public class k implements GraphRequestBatch.Callback {
        public final /* synthetic */ w a;
        public final /* synthetic */ Bundle b;

        public k(w wVar, Bundle bundle) {
            this.a = wVar;
            this.b = bundle;
        }

        @Override // com.facebook.GraphRequestBatch.Callback
        public void onBatchCompleted(GraphRequestBatch graphRequestBatch) {
            LikeActionController.this.l = false;
            if (this.a.getError() != null) {
                LikeActionController.this.Y(true);
                return;
            }
            LikeActionController.this.h = null;
            LikeActionController.this.k = false;
            LikeActionController.this.N().logEventImplicitly(AnalyticsEvents.EVENT_LIKE_VIEW_DID_UNLIKE, null, this.b);
            LikeActionController.this.X(this.b);
        }
    }

    public class l implements x {

        public class a implements GraphRequestBatch.Callback {
            public final /* synthetic */ t a;
            public final /* synthetic */ o b;

            public a(t tVar, o oVar) {
                this.a = tVar;
                this.b = oVar;
            }

            @Override // com.facebook.GraphRequestBatch.Callback
            public void onBatchCompleted(GraphRequestBatch graphRequestBatch) {
                if (this.a.getError() != null || this.b.getError() != null) {
                    Logger.log(LoggingBehavior.REQUESTS, LikeActionController.o, "Unable to refresh like state for id: '%s'", LikeActionController.this.a);
                    return;
                }
                LikeActionController likeActionController = LikeActionController.this;
                boolean zC = this.a.c();
                o oVar = this.b;
                likeActionController.m0(zC, oVar.f, oVar.g, oVar.h, oVar.i, this.a.b());
            }
        }

        public l() {
        }

        @Override // com.facebook.share.internal.LikeActionController.x
        public void onComplete() {
            t sVar;
            if (c.a[LikeActionController.this.b.ordinal()] != 1) {
                LikeActionController likeActionController = LikeActionController.this;
                sVar = likeActionController.new q(likeActionController.i, LikeActionController.this.b);
            } else {
                LikeActionController likeActionController2 = LikeActionController.this;
                sVar = likeActionController2.new s(likeActionController2.i);
            }
            LikeActionController likeActionController3 = LikeActionController.this;
            o oVar = likeActionController3.new o(likeActionController3.i, LikeActionController.this.b);
            GraphRequestBatch graphRequestBatch = new GraphRequestBatch();
            sVar.a(graphRequestBatch);
            oVar.a(graphRequestBatch);
            graphRequestBatch.addCallback(new a(sVar, oVar));
            graphRequestBatch.executeAsync();
        }
    }

    public abstract class m implements y {
        private GraphRequest a;
        public String b;
        public LikeView.ObjectType c;
        public FacebookRequestError d;

        public class a implements GraphRequest.Callback {
            public a() {
            }

            @Override // com.facebook.GraphRequest.Callback
            public void onCompleted(GraphResponse graphResponse) {
                m.this.d = graphResponse.getError();
                m mVar = m.this;
                FacebookRequestError facebookRequestError = mVar.d;
                if (facebookRequestError != null) {
                    mVar.d(facebookRequestError);
                } else {
                    mVar.e(graphResponse);
                }
            }
        }

        public m(String str, LikeView.ObjectType objectType) {
            this.b = str;
            this.c = objectType;
        }

        @Override // com.facebook.share.internal.LikeActionController.y
        public void a(GraphRequestBatch graphRequestBatch) {
            graphRequestBatch.add(this.a);
        }

        public void d(FacebookRequestError facebookRequestError) {
            Logger.log(LoggingBehavior.REQUESTS, LikeActionController.o, "Error running request for object '%s' with type '%s' : %s", this.b, this.c, facebookRequestError);
        }

        public abstract void e(GraphResponse graphResponse);

        public void f(GraphRequest graphRequest) {
            this.a = graphRequest;
            graphRequest.setVersion(FacebookSdk.getGraphApiVersion());
            graphRequest.setCallback(new a());
        }

        @Override // com.facebook.share.internal.LikeActionController.y
        public FacebookRequestError getError() {
            return this.d;
        }
    }

    public static class n implements Runnable {
        private String a;
        private LikeView.ObjectType b;
        private CreationCallback c;

        public n(String str, LikeView.ObjectType objectType, CreationCallback creationCallback) {
            this.a = str;
            this.b = objectType;
            this.c = creationCallback;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (CrashShieldHandler.isObjectCrashing(this)) {
                return;
            }
            try {
                LikeActionController.J(this.a, this.b, this.c);
            } catch (Throwable th) {
                CrashShieldHandler.handleThrowable(th, this);
            }
        }
    }

    public class o extends m {
        public String f;
        public String g;
        public String h;
        public String i;

        public o(String str, LikeView.ObjectType objectType) {
            super(str, objectType);
            this.f = LikeActionController.this.d;
            this.g = LikeActionController.this.e;
            this.h = LikeActionController.this.f;
            this.i = LikeActionController.this.g;
            Bundle bundle = new Bundle();
            bundle.putString(GraphRequest.FIELDS_PARAM, "engagement.fields(count_string_with_like,count_string_without_like,social_sentence_with_like,social_sentence_without_like)");
            bundle.putString("locale", Locale.getDefault().toString());
            f(new GraphRequest(AccessToken.getCurrentAccessToken(), str, bundle, HttpMethod.GET));
        }

        @Override // com.facebook.share.internal.LikeActionController.m
        public void d(FacebookRequestError facebookRequestError) {
            Logger.log(LoggingBehavior.REQUESTS, LikeActionController.o, "Error fetching engagement for object '%s' with type '%s' : %s", this.b, this.c, facebookRequestError);
            LikeActionController.this.T("get_engagement", facebookRequestError);
        }

        @Override // com.facebook.share.internal.LikeActionController.m
        public void e(GraphResponse graphResponse) {
            JSONObject jSONObjectTryGetJSONObjectFromResponse = Utility.tryGetJSONObjectFromResponse(graphResponse.getGraphObject(), "engagement");
            if (jSONObjectTryGetJSONObjectFromResponse != null) {
                this.f = jSONObjectTryGetJSONObjectFromResponse.optString("count_string_with_like", this.f);
                this.g = jSONObjectTryGetJSONObjectFromResponse.optString("count_string_without_like", this.g);
                this.h = jSONObjectTryGetJSONObjectFromResponse.optString(LikeActionController.A, this.h);
                this.i = jSONObjectTryGetJSONObjectFromResponse.optString(LikeActionController.B, this.i);
            }
        }
    }

    public class p extends m {
        public String f;

        public p(String str, LikeView.ObjectType objectType) {
            super(str, objectType);
            Bundle bundle = new Bundle();
            bundle.putString(GraphRequest.FIELDS_PARAM, "og_object.fields(id)");
            bundle.putString("ids", str);
            f(new GraphRequest(AccessToken.getCurrentAccessToken(), "", bundle, HttpMethod.GET));
        }

        @Override // com.facebook.share.internal.LikeActionController.m
        public void d(FacebookRequestError facebookRequestError) {
            if (facebookRequestError.getErrorMessage().contains("og_object")) {
                this.d = null;
            } else {
                Logger.log(LoggingBehavior.REQUESTS, LikeActionController.o, "Error getting the FB id for object '%s' with type '%s' : %s", this.b, this.c, facebookRequestError);
            }
        }

        @Override // com.facebook.share.internal.LikeActionController.m
        public void e(GraphResponse graphResponse) {
            JSONObject jSONObjectOptJSONObject;
            JSONObject jSONObjectTryGetJSONObjectFromResponse = Utility.tryGetJSONObjectFromResponse(graphResponse.getGraphObject(), this.b);
            if (jSONObjectTryGetJSONObjectFromResponse == null || (jSONObjectOptJSONObject = jSONObjectTryGetJSONObjectFromResponse.optJSONObject("og_object")) == null) {
                return;
            }
            this.f = jSONObjectOptJSONObject.optString("id");
        }
    }

    public class q extends m implements t {
        private boolean f;
        private String g;
        private final String h;
        private final LikeView.ObjectType i;

        public q(String str, LikeView.ObjectType objectType) {
            super(str, objectType);
            this.f = LikeActionController.this.c;
            this.h = str;
            this.i = objectType;
            Bundle bundle = new Bundle();
            bundle.putString(GraphRequest.FIELDS_PARAM, "id,application");
            bundle.putString("object", str);
            f(new GraphRequest(AccessToken.getCurrentAccessToken(), "me/og.likes", bundle, HttpMethod.GET));
        }

        @Override // com.facebook.share.internal.LikeActionController.t
        public String b() {
            return this.g;
        }

        @Override // com.facebook.share.internal.LikeActionController.t
        public boolean c() {
            return this.f;
        }

        @Override // com.facebook.share.internal.LikeActionController.m
        public void d(FacebookRequestError facebookRequestError) {
            Logger.log(LoggingBehavior.REQUESTS, LikeActionController.o, "Error fetching like status for object '%s' with type '%s' : %s", this.h, this.i, facebookRequestError);
            LikeActionController.this.T("get_og_object_like", facebookRequestError);
        }

        @Override // com.facebook.share.internal.LikeActionController.m
        public void e(GraphResponse graphResponse) {
            JSONArray jSONArrayTryGetJSONArrayFromResponse = Utility.tryGetJSONArrayFromResponse(graphResponse.getGraphObject(), "data");
            if (jSONArrayTryGetJSONArrayFromResponse != null) {
                for (int i = 0; i < jSONArrayTryGetJSONArrayFromResponse.length(); i++) {
                    JSONObject jSONObjectOptJSONObject = jSONArrayTryGetJSONArrayFromResponse.optJSONObject(i);
                    if (jSONObjectOptJSONObject != null) {
                        this.f = true;
                        JSONObject jSONObjectOptJSONObject2 = jSONObjectOptJSONObject.optJSONObject(MimeTypes.BASE_TYPE_APPLICATION);
                        AccessToken currentAccessToken = AccessToken.getCurrentAccessToken();
                        if (jSONObjectOptJSONObject2 != null && AccessToken.isCurrentAccessTokenActive() && Utility.areObjectsEqual(currentAccessToken.getApplicationId(), jSONObjectOptJSONObject2.optString("id"))) {
                            this.g = jSONObjectOptJSONObject.optString("id");
                        }
                    }
                }
            }
        }
    }

    public class r extends m {
        public String f;
        public boolean g;

        public r(String str, LikeView.ObjectType objectType) {
            super(str, objectType);
            Bundle bundle = new Bundle();
            bundle.putString(GraphRequest.FIELDS_PARAM, "id");
            bundle.putString("ids", str);
            f(new GraphRequest(AccessToken.getCurrentAccessToken(), "", bundle, HttpMethod.GET));
        }

        @Override // com.facebook.share.internal.LikeActionController.m
        public void d(FacebookRequestError facebookRequestError) {
            Logger.log(LoggingBehavior.REQUESTS, LikeActionController.o, "Error getting the FB id for object '%s' with type '%s' : %s", this.b, this.c, facebookRequestError);
        }

        @Override // com.facebook.share.internal.LikeActionController.m
        public void e(GraphResponse graphResponse) {
            JSONObject jSONObjectTryGetJSONObjectFromResponse = Utility.tryGetJSONObjectFromResponse(graphResponse.getGraphObject(), this.b);
            if (jSONObjectTryGetJSONObjectFromResponse != null) {
                String strOptString = jSONObjectTryGetJSONObjectFromResponse.optString("id");
                this.f = strOptString;
                this.g = !Utility.isNullOrEmpty(strOptString);
            }
        }
    }

    public class s extends m implements t {
        private boolean f;
        private String g;

        public s(String str) {
            super(str, LikeView.ObjectType.PAGE);
            this.f = LikeActionController.this.c;
            this.g = str;
            Bundle bundle = new Bundle();
            bundle.putString(GraphRequest.FIELDS_PARAM, "id");
            f(new GraphRequest(AccessToken.getCurrentAccessToken(), "me/likes/" + str, bundle, HttpMethod.GET));
        }

        @Override // com.facebook.share.internal.LikeActionController.t
        public String b() {
            return null;
        }

        @Override // com.facebook.share.internal.LikeActionController.t
        public boolean c() {
            return this.f;
        }

        @Override // com.facebook.share.internal.LikeActionController.m
        public void d(FacebookRequestError facebookRequestError) {
            Logger.log(LoggingBehavior.REQUESTS, LikeActionController.o, "Error fetching like status for page id '%s': %s", this.g, facebookRequestError);
            LikeActionController.this.T("get_page_like", facebookRequestError);
        }

        @Override // com.facebook.share.internal.LikeActionController.m
        public void e(GraphResponse graphResponse) {
            JSONArray jSONArrayTryGetJSONArrayFromResponse = Utility.tryGetJSONArrayFromResponse(graphResponse.getGraphObject(), "data");
            if (jSONArrayTryGetJSONArrayFromResponse == null || jSONArrayTryGetJSONArrayFromResponse.length() <= 0) {
                return;
            }
            this.f = true;
        }
    }

    public interface t extends y {
        String b();

        boolean c();
    }

    public static class u implements Runnable {
        private static ArrayList<String> c = new ArrayList<>();
        private String a;
        private boolean b;

        public u(String str, boolean z) {
            this.a = str;
            this.b = z;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (CrashShieldHandler.isObjectCrashing(this)) {
                return;
            }
            try {
                String str = this.a;
                if (str != null) {
                    c.remove(str);
                    c.add(0, this.a);
                }
                if (!this.b || c.size() < 128) {
                    return;
                }
                while (64 < c.size()) {
                    ArrayList<String> arrayList = c;
                    LikeActionController.L.remove(arrayList.remove(arrayList.size() - 1));
                }
            } catch (Throwable th) {
                CrashShieldHandler.handleThrowable(th, this);
            }
        }
    }

    public class v extends m {
        public String f;

        public v(String str, LikeView.ObjectType objectType) {
            super(str, objectType);
            Bundle bundle = new Bundle();
            bundle.putString("object", str);
            f(new GraphRequest(AccessToken.getCurrentAccessToken(), "me/og.likes", bundle, HttpMethod.POST));
        }

        @Override // com.facebook.share.internal.LikeActionController.m
        public void d(FacebookRequestError facebookRequestError) {
            if (facebookRequestError.getErrorCode() == LikeActionController.J) {
                this.d = null;
            } else {
                Logger.log(LoggingBehavior.REQUESTS, LikeActionController.o, "Error liking object '%s' with type '%s' : %s", this.b, this.c, facebookRequestError);
                LikeActionController.this.T("publish_like", facebookRequestError);
            }
        }

        @Override // com.facebook.share.internal.LikeActionController.m
        public void e(GraphResponse graphResponse) {
            this.f = Utility.safeGetStringFromResponse(graphResponse.getGraphObject(), "id");
        }
    }

    public class w extends m {
        private String f;

        public w(String str) {
            super(null, null);
            this.f = str;
            f(new GraphRequest(AccessToken.getCurrentAccessToken(), str, null, HttpMethod.DELETE));
        }

        @Override // com.facebook.share.internal.LikeActionController.m
        public void d(FacebookRequestError facebookRequestError) {
            Logger.log(LoggingBehavior.REQUESTS, LikeActionController.o, "Error unliking object with unlike token '%s' : %s", this.f, facebookRequestError);
            LikeActionController.this.T("publish_unlike", facebookRequestError);
        }

        @Override // com.facebook.share.internal.LikeActionController.m
        public void e(GraphResponse graphResponse) {
        }
    }

    public interface x {
        void onComplete();
    }

    public interface y {
        void a(GraphRequestBatch graphRequestBatch);

        FacebookRequestError getError();
    }

    public static class z implements Runnable {
        private String a;
        private String b;

        public z(String str, String str2) {
            this.a = str;
            this.b = str2;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (CrashShieldHandler.isObjectCrashing(this)) {
                return;
            }
            try {
                LikeActionController.i0(this.a, this.b);
            } catch (Throwable th) {
                CrashShieldHandler.handleThrowable(th, this);
            }
        }
    }

    private LikeActionController(String str, LikeView.ObjectType objectType) {
        this.a = str;
        this.b = objectType;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void F(LikeActionController likeActionController, String str) {
        G(likeActionController, str, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void G(LikeActionController likeActionController, String str, Bundle bundle) {
        Intent intent = new Intent(str);
        if (likeActionController != null) {
            if (bundle == null) {
                bundle = new Bundle();
            }
            bundle.putString(ACTION_OBJECT_ID_KEY, likeActionController.getObjectId());
        }
        if (bundle != null) {
            intent.putExtras(bundle);
        }
        LocalBroadcastManager.getInstance(FacebookSdk.getApplicationContext()).sendBroadcast(intent);
    }

    private boolean H() {
        AccessToken currentAccessToken = AccessToken.getCurrentAccessToken();
        return (this.j || this.i == null || !AccessToken.isCurrentAccessTokenActive() || currentAccessToken.getPermissions() == null || !currentAccessToken.getPermissions().contains("publish_actions")) ? false : true;
    }

    private void I() {
        this.m = null;
        k0(null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void J(String str, LikeView.ObjectType objectType, CreationCallback creationCallback) throws Throwable {
        LikeActionController likeActionControllerP = P(str);
        if (likeActionControllerP != null) {
            n0(likeActionControllerP, objectType, creationCallback);
            return;
        }
        LikeActionController likeActionControllerK = K(str);
        if (likeActionControllerK == null) {
            likeActionControllerK = new LikeActionController(str, objectType);
            h0(likeActionControllerK);
        }
        c0(str, likeActionControllerK);
        O.post(likeActionControllerK.new e());
        R(creationCallback, likeActionControllerK, null);
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0039  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v4, types: [java.io.Closeable] */
    private static LikeActionController K(String str) throws Throwable {
        Throwable th;
        InputStream inputStream;
        LikeActionController likeActionControllerL = null;
        try {
            try {
                inputStream = K.get(O(str));
                if (inputStream != null) {
                    try {
                        String streamToString = Utility.readStreamToString(inputStream);
                        if (!Utility.isNullOrEmpty(streamToString)) {
                            likeActionControllerL = L(streamToString);
                        }
                    } catch (IOException e2) {
                        e = e2;
                        Log.e(o, "Unable to deserialize controller from disk", e);
                        if (inputStream != null) {
                        }
                        return likeActionControllerL;
                    }
                }
                if (inputStream != null) {
                    Utility.closeQuietly(inputStream);
                }
            } catch (Throwable th2) {
                th = th2;
                if (str != 0) {
                    Utility.closeQuietly(str);
                }
                throw th;
            }
        } catch (IOException e3) {
            e = e3;
            inputStream = null;
        } catch (Throwable th3) {
            th = th3;
            str = 0;
            if (str != 0) {
                Utility.closeQuietly(str);
            }
            throw th;
        }
        return likeActionControllerL;
    }

    private static LikeActionController L(String str) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            if (jSONObject.optInt(v, -1) != 3) {
                return null;
            }
            LikeActionController likeActionController = new LikeActionController(jSONObject.getString("object_id"), LikeView.ObjectType.fromInt(jSONObject.optInt("object_type", LikeView.ObjectType.UNKNOWN.getValue())));
            likeActionController.d = jSONObject.optString(y, null);
            likeActionController.e = jSONObject.optString(z, null);
            likeActionController.f = jSONObject.optString(A, null);
            likeActionController.g = jSONObject.optString(B, null);
            likeActionController.c = jSONObject.optBoolean(C);
            likeActionController.h = jSONObject.optString("unlike_token", null);
            JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject(E);
            if (jSONObjectOptJSONObject != null) {
                likeActionController.m = BundleJSONConverter.convertToBundle(jSONObjectOptJSONObject);
            }
            return likeActionController;
        } catch (JSONException e2) {
            Log.e(o, "Unable to deserialize controller from JSON", e2);
            return null;
        }
    }

    private void M(x xVar) {
        if (!Utility.isNullOrEmpty(this.i)) {
            if (xVar != null) {
                xVar.onComplete();
                return;
            }
            return;
        }
        p pVar = new p(this.a, this.b);
        r rVar = new r(this.a, this.b);
        GraphRequestBatch graphRequestBatch = new GraphRequestBatch();
        pVar.a(graphRequestBatch);
        rVar.a(graphRequestBatch);
        graphRequestBatch.addCallback(new b(pVar, rVar, xVar));
        graphRequestBatch.executeAsync();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public InternalAppEventsLogger N() {
        if (this.n == null) {
            this.n = new InternalAppEventsLogger(FacebookSdk.getApplicationContext());
        }
        return this.n;
    }

    private static String O(String str) {
        String token = AccessToken.isCurrentAccessTokenActive() ? AccessToken.getCurrentAccessToken().getToken() : null;
        if (token != null) {
            token = Utility.md5hash(token);
        }
        return String.format(Locale.ROOT, "%s|%s|com.fb.sdk.like|%d", str, Utility.coerceValueIfNullOrEmpty(token, ""), Integer.valueOf(R));
    }

    private static LikeActionController P(String str) {
        String strO = O(str);
        LikeActionController likeActionController = L.get(strO);
        if (likeActionController != null) {
            M.addActiveWorkItem(new u(strO, false));
        }
        return likeActionController;
    }

    private ResultProcessor Q(Bundle bundle) {
        return new i(null, bundle);
    }

    private static void R(CreationCallback creationCallback, LikeActionController likeActionController, FacebookException facebookException) {
        if (creationCallback == null) {
            return;
        }
        O.post(new g(creationCallback, likeActionController, facebookException));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void S(String str, Bundle bundle) {
        Bundle bundle2 = new Bundle(bundle);
        bundle2.putString("object_id", this.a);
        bundle2.putString("object_type", this.b.toString());
        bundle2.putString(AnalyticsEvents.PARAMETER_LIKE_VIEW_CURRENT_ACTION, str);
        N().logEventImplicitly(AnalyticsEvents.EVENT_LIKE_VIEW_ERROR, null, bundle2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void T(String str, FacebookRequestError facebookRequestError) {
        JSONObject requestResult;
        Bundle bundle = new Bundle();
        if (facebookRequestError != null && (requestResult = facebookRequestError.getRequestResult()) != null) {
            bundle.putString("error", requestResult.toString());
        }
        S(str, bundle);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void U(int i2, int i3, Intent intent) {
        ShareInternalUtility.handleActivityResult(i2, i3, intent, Q(this.m));
        I();
    }

    private static synchronized void V() {
        if (Q) {
            return;
        }
        O = new Handler(Looper.getMainLooper());
        R = FacebookSdk.getApplicationContext().getSharedPreferences(s, 0).getInt(u, 1);
        K = new FileLruCache(o, new FileLruCache.Limits());
        f0();
        CallbackManagerImpl.registerStaticCallback(CallbackManagerImpl.RequestCodeOffset.Like.toRequestCode(), new f());
        Q = true;
    }

    private void W(Activity activity, FragmentWrapper fragmentWrapper, Bundle bundle) {
        String str = null;
        if (LikeDialog.canShowNativeDialog()) {
            str = AnalyticsEvents.EVENT_LIKE_VIEW_DID_PRESENT_DIALOG;
        } else if (LikeDialog.canShowWebFallback()) {
            str = AnalyticsEvents.EVENT_LIKE_VIEW_DID_PRESENT_FALLBACK;
        } else {
            S("present_dialog", bundle);
            Utility.logd(o, "Cannot show the Like Dialog on this device.");
            F(null, ACTION_LIKE_ACTION_CONTROLLER_UPDATED);
        }
        if (str != null) {
            LikeView.ObjectType objectType = this.b;
            LikeContent likeContentBuild = new LikeContent.Builder().setObjectId(this.a).setObjectType(objectType != null ? objectType.toString() : LikeView.ObjectType.UNKNOWN.toString()).build();
            if (fragmentWrapper != null) {
                new LikeDialog(fragmentWrapper).show(likeContentBuild);
            } else {
                new LikeDialog(activity).show(likeContentBuild);
            }
            g0(bundle);
            N().logEventImplicitly(AnalyticsEvents.EVENT_LIKE_VIEW_DID_PRESENT_DIALOG, bundle);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void X(Bundle bundle) {
        boolean z2 = this.c;
        if (z2 == this.k || a0(z2, bundle)) {
            return;
        }
        Y(!this.c);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Y(boolean z2) {
        l0(z2);
        Bundle bundle = new Bundle();
        bundle.putString(NativeProtocol.STATUS_ERROR_DESCRIPTION, ERROR_PUBLISH_ERROR);
        G(this, ACTION_LIKE_ACTION_CONTROLLER_DID_ERROR, bundle);
    }

    private void Z(Bundle bundle) {
        this.l = true;
        M(new j(bundle));
    }

    private boolean a0(boolean z2, Bundle bundle) {
        if (H()) {
            if (z2) {
                Z(bundle);
                return true;
            }
            if (!Utility.isNullOrEmpty(this.h)) {
                b0(bundle);
                return true;
            }
        }
        return false;
    }

    private void b0(Bundle bundle) {
        this.l = true;
        GraphRequestBatch graphRequestBatch = new GraphRequestBatch();
        w wVar = new w(this.h);
        wVar.a(graphRequestBatch);
        graphRequestBatch.addCallback(new k(wVar, bundle));
        graphRequestBatch.executeAsync();
    }

    private static void c0(String str, LikeActionController likeActionController) {
        String strO = O(str);
        M.addActiveWorkItem(new u(strO, true));
        L.put(strO, likeActionController);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d0() {
        if (AccessToken.isCurrentAccessTokenActive()) {
            M(new l());
        } else {
            e0();
        }
    }

    private void e0() {
        LikeStatusClient likeStatusClient = new LikeStatusClient(FacebookSdk.getApplicationContext(), FacebookSdk.getApplicationId(), this.a);
        if (likeStatusClient.start()) {
            likeStatusClient.setCompletedListener(new a());
        }
    }

    private static void f0() {
        S = new h();
    }

    private void g0(Bundle bundle) {
        k0(this.a);
        this.m = bundle;
        h0(this);
    }

    @Deprecated
    public static void getControllerForObjectId(String str, LikeView.ObjectType objectType, CreationCallback creationCallback) {
        if (!Q) {
            V();
        }
        LikeActionController likeActionControllerP = P(str);
        if (likeActionControllerP != null) {
            n0(likeActionControllerP, objectType, creationCallback);
        } else {
            N.addActiveWorkItem(new n(str, objectType, creationCallback));
        }
    }

    private static void h0(LikeActionController likeActionController) {
        String strJ0 = j0(likeActionController);
        String strO = O(likeActionController.a);
        if (Utility.isNullOrEmpty(strJ0) || Utility.isNullOrEmpty(strO)) {
            return;
        }
        N.addActiveWorkItem(new z(strO, strJ0));
    }

    @Deprecated
    public static boolean handleOnActivityResult(int i2, int i3, Intent intent) {
        if (Utility.isNullOrEmpty(P)) {
            P = FacebookSdk.getApplicationContext().getSharedPreferences(s, 0).getString(t, null);
        }
        if (Utility.isNullOrEmpty(P)) {
            return false;
        }
        getControllerForObjectId(P, LikeView.ObjectType.UNKNOWN, new d(i2, i3, intent));
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void i0(String str, String str2) {
        OutputStream outputStreamOpenPutStream = null;
        try {
            try {
                outputStreamOpenPutStream = K.openPutStream(str);
                outputStreamOpenPutStream.write(str2.getBytes());
            } catch (IOException e2) {
                Log.e(o, "Unable to serialize controller to disk", e2);
                if (outputStreamOpenPutStream == null) {
                    return;
                }
            }
            Utility.closeQuietly(outputStreamOpenPutStream);
        } catch (Throwable th) {
            if (outputStreamOpenPutStream != null) {
                Utility.closeQuietly(outputStreamOpenPutStream);
            }
            throw th;
        }
    }

    private static String j0(LikeActionController likeActionController) {
        JSONObject jSONObjectConvertToJSON;
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(v, 3);
            jSONObject.put("object_id", likeActionController.a);
            jSONObject.put("object_type", likeActionController.b.getValue());
            jSONObject.put(y, likeActionController.d);
            jSONObject.put(z, likeActionController.e);
            jSONObject.put(A, likeActionController.f);
            jSONObject.put(B, likeActionController.g);
            jSONObject.put(C, likeActionController.c);
            jSONObject.put("unlike_token", likeActionController.h);
            Bundle bundle = likeActionController.m;
            if (bundle != null && (jSONObjectConvertToJSON = BundleJSONConverter.convertToJSON(bundle)) != null) {
                jSONObject.put(E, jSONObjectConvertToJSON);
            }
            return jSONObject.toString();
        } catch (JSONException e2) {
            Log.e(o, "Unable to serialize controller to JSON", e2);
            return null;
        }
    }

    private static void k0(String str) {
        P = str;
        FacebookSdk.getApplicationContext().getSharedPreferences(s, 0).edit().putString(t, P).apply();
    }

    private void l0(boolean z2) {
        m0(z2, this.d, this.e, this.f, this.g, this.h);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void m0(boolean z2, String str, String str2, String str3, String str4, String str5) {
        String strCoerceValueIfNullOrEmpty = Utility.coerceValueIfNullOrEmpty(str, null);
        String strCoerceValueIfNullOrEmpty2 = Utility.coerceValueIfNullOrEmpty(str2, null);
        String strCoerceValueIfNullOrEmpty3 = Utility.coerceValueIfNullOrEmpty(str3, null);
        String strCoerceValueIfNullOrEmpty4 = Utility.coerceValueIfNullOrEmpty(str4, null);
        String strCoerceValueIfNullOrEmpty5 = Utility.coerceValueIfNullOrEmpty(str5, null);
        if ((z2 == this.c && Utility.areObjectsEqual(strCoerceValueIfNullOrEmpty, this.d) && Utility.areObjectsEqual(strCoerceValueIfNullOrEmpty2, this.e) && Utility.areObjectsEqual(strCoerceValueIfNullOrEmpty3, this.f) && Utility.areObjectsEqual(strCoerceValueIfNullOrEmpty4, this.g) && Utility.areObjectsEqual(strCoerceValueIfNullOrEmpty5, this.h)) ? false : true) {
            this.c = z2;
            this.d = strCoerceValueIfNullOrEmpty;
            this.e = strCoerceValueIfNullOrEmpty2;
            this.f = strCoerceValueIfNullOrEmpty3;
            this.g = strCoerceValueIfNullOrEmpty4;
            this.h = strCoerceValueIfNullOrEmpty5;
            h0(this);
            F(this, ACTION_LIKE_ACTION_CONTROLLER_UPDATED);
        }
    }

    private static void n0(LikeActionController likeActionController, LikeView.ObjectType objectType, CreationCallback creationCallback) {
        LikeView.ObjectType mostSpecificObjectType = ShareInternalUtility.getMostSpecificObjectType(objectType, likeActionController.b);
        FacebookException facebookException = null;
        if (mostSpecificObjectType == null) {
            Object[] objArr = {likeActionController.a, likeActionController.b.toString(), objectType.toString()};
            likeActionController = null;
            facebookException = new FacebookException("Object with id:\"%s\" is already marked as type:\"%s\". Cannot change the type to:\"%s\"", objArr);
        } else {
            likeActionController.b = mostSpecificObjectType;
        }
        R(creationCallback, likeActionController, facebookException);
    }

    @Deprecated
    public String getLikeCountString() {
        return this.c ? this.d : this.e;
    }

    @Deprecated
    public String getObjectId() {
        return this.a;
    }

    @Deprecated
    public String getSocialSentence() {
        return this.c ? this.f : this.g;
    }

    @Deprecated
    public boolean isObjectLiked() {
        return this.c;
    }

    @Deprecated
    public boolean shouldEnableView() {
        return false;
    }

    @Deprecated
    public void toggleLike(Activity activity, FragmentWrapper fragmentWrapper, Bundle bundle) {
        boolean z2 = !this.c;
        if (!H()) {
            W(activity, fragmentWrapper, bundle);
            return;
        }
        l0(z2);
        if (this.l) {
            N().logEventImplicitly(AnalyticsEvents.EVENT_LIKE_VIEW_DID_UNDO_QUICKLY, bundle);
        } else {
            if (a0(z2, bundle)) {
                return;
            }
            l0(!z2);
            W(activity, fragmentWrapper, bundle);
        }
    }
}
