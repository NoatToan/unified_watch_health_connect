package com.facebook.gamingservices.cloudgaming;

import android.content.Context;
import android.content.Intent;
import androidx.annotation.Nullable;
import com.facebook.FacebookRequestError;
import com.facebook.GraphResponse;
import com.facebook.gamingservices.cloudgaming.internal.SDKConstants;
import com.facebook.gamingservices.cloudgaming.internal.SDKLogger;
import com.facebook.gamingservices.cloudgaming.internal.SDKMessageEnum;
import java.util.Iterator;
import java.util.UUID;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.function.Consumer;
import java.util.function.Supplier;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class DaemonRequest {
    private Context a;
    private JSONObject b;
    private Callback c;
    private ConcurrentHashMap<String, CompletableFuture<GraphResponse>> d;
    private SDKLogger e;

    public interface Callback {
        void onCompleted(GraphResponse graphResponse);
    }

    public class a implements Consumer<GraphResponse> {
        public a() {
        }

        @Override // java.util.function.Consumer
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void accept(GraphResponse graphResponse) {
            if (DaemonRequest.this.c != null) {
                DaemonRequest.this.c.onCompleted(graphResponse);
            }
        }
    }

    public class b implements Supplier<GraphResponse> {
        public b() {
        }

        @Override // java.util.function.Supplier
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public GraphResponse get() {
            String string = UUID.randomUUID().toString();
            try {
                DaemonRequest.this.b.put(SDKConstants.REQUEST_ID, string);
                Intent intent = new Intent();
                String string2 = DaemonRequest.this.b.getString("type");
                DaemonRequest.this.e.logPreparingRequest(string2, string, DaemonRequest.this.b);
                if (!string2.equals(SDKMessageEnum.GET_ACCESS_TOKEN.toString()) && !string2.equals(SDKMessageEnum.IS_ENV_READY.toString())) {
                    String string3 = DaemonRequest.this.a.getSharedPreferences(SDKConstants.PREF_DAEMON_PACKAGE_NAME, 0).getString(SDKConstants.PARAM_DAEMON_PACKAGE_NAME, null);
                    if (string3 == null) {
                        return DaemonReceiver.d(new FacebookRequestError(-1, "DAEMON_REQUEST_EXECUTE_ASYNC_FAILED", "Unable to correctly create the request with a secure connection"), string);
                    }
                    intent.setPackage(string3);
                }
                intent.setAction(SDKConstants.REQUEST_ACTION);
                Iterator<String> itKeys = DaemonRequest.this.b.keys();
                while (itKeys.hasNext()) {
                    String next = itKeys.next();
                    intent.putExtra(next, DaemonRequest.this.b.getString(next));
                }
                CompletableFuture completableFuture = new CompletableFuture();
                DaemonRequest.this.d.put(string, completableFuture);
                DaemonRequest.this.a.sendBroadcast(intent);
                DaemonRequest.this.e.logSentRequest(string2, string, DaemonRequest.this.b);
                return (GraphResponse) completableFuture.get();
            } catch (InterruptedException | ExecutionException | JSONException unused) {
                return DaemonReceiver.d(new FacebookRequestError(-1, "DAEMON_REQUEST_EXECUTE_ASYNC_FAILED", "Unable to correctly create the request or obtain response"), string);
            }
        }
    }

    public DaemonRequest(Context context, JSONObject jSONObject, Callback callback) {
        this.a = context;
        this.b = jSONObject;
        this.c = callback;
        this.d = DaemonReceiver.g(context).h();
        this.e = SDKLogger.getInstance(context);
    }

    public static GraphResponse executeAndWait(Context context, @Nullable JSONObject jSONObject, SDKMessageEnum sDKMessageEnum) {
        try {
            return new DaemonRequest(context, jSONObject == null ? new JSONObject().put("type", sDKMessageEnum.toString()) : jSONObject.put("type", sDKMessageEnum.toString()), null).g();
        } catch (InterruptedException | ExecutionException | JSONException unused) {
            return DaemonReceiver.d(new FacebookRequestError(-1, "DAEMON_REQUEST_EXECUTE_ASYNC_FAILED", "Unable to correctly create the request or obtain response"), null);
        }
    }

    public static void executeAsync(Context context, @Nullable JSONObject jSONObject, Callback callback, SDKMessageEnum sDKMessageEnum) {
        try {
            new DaemonRequest(context, jSONObject == null ? new JSONObject().put("type", sDKMessageEnum.toString()) : jSONObject.put("type", sDKMessageEnum.toString()), callback).i();
        } catch (InterruptedException | ExecutionException | JSONException unused) {
            if (callback != null) {
                callback.onCompleted(DaemonReceiver.d(new FacebookRequestError(-1, "DAEMON_REQUEST_EXECUTE_ASYNC_FAILED", "Unable to correctly create the request or obtain response"), null));
            }
        }
    }

    private CompletableFuture<GraphResponse> f() {
        return CompletableFuture.supplyAsync(new b());
    }

    private GraphResponse g() throws ExecutionException, InterruptedException {
        return f().get();
    }

    private GraphResponse h(int i) throws ExecutionException, InterruptedException, TimeoutException {
        return f().get(i, TimeUnit.SECONDS);
    }

    private void i() throws ExecutionException, InterruptedException {
        f().thenAccept((Consumer<? super GraphResponse>) new a());
    }

    public static GraphResponse executeAndWait(Context context, @Nullable JSONObject jSONObject, SDKMessageEnum sDKMessageEnum, int i) {
        JSONObject jSONObjectPut;
        try {
            if (jSONObject == null) {
                jSONObjectPut = new JSONObject().put("type", sDKMessageEnum.toString());
            } else {
                jSONObjectPut = jSONObject.put("type", sDKMessageEnum.toString());
            }
            return new DaemonRequest(context, jSONObjectPut, null).h(i);
        } catch (InterruptedException | ExecutionException | TimeoutException | JSONException unused) {
            return DaemonReceiver.d(new FacebookRequestError(-1, "DAEMON_REQUEST_EXECUTE_ASYNC_FAILED", "Unable to correctly create the request or obtain response"), null);
        }
    }

    public static void executeAsync(Context context, @Nullable JSONObject jSONObject, Callback callback, String str) {
        JSONObject jSONObjectPut;
        try {
            if (jSONObject == null) {
                jSONObjectPut = new JSONObject().put("type", str);
            } else {
                jSONObjectPut = jSONObject.put("type", str);
            }
            new DaemonRequest(context, jSONObjectPut, callback).i();
        } catch (InterruptedException | ExecutionException | JSONException unused) {
            if (callback != null) {
                callback.onCompleted(DaemonReceiver.d(new FacebookRequestError(-1, "DAEMON_REQUEST_EXECUTE_ASYNC_FAILED", "Unable to correctly create the request or obtain response"), null));
            }
        }
    }
}
