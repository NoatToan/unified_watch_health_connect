package com.loopj.android.http;

import android.util.Log;
import org.apache.http.Header;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.json.JSONTokener;

/* JADX INFO: loaded from: classes18.dex */
public class JsonHttpResponseHandler extends TextHttpResponseHandler {
    private static final String LOG_TAG = "JsonHttpResponseHandler";

    public JsonHttpResponseHandler() {
        super("UTF-8");
    }

    @Override // com.loopj.android.http.TextHttpResponseHandler
    public void onFailure(int i, Header[] headerArr, String str, Throwable th) {
    }

    public void onFailure(int i, Header[] headerArr, Throwable th, JSONArray jSONArray) {
    }

    public void onFailure(int i, Header[] headerArr, Throwable th, JSONObject jSONObject) {
    }

    @Override // com.loopj.android.http.TextHttpResponseHandler, com.loopj.android.http.AsyncHttpResponseHandler
    public final void onFailure(final int i, final Header[] headerArr, final byte[] bArr, final Throwable th) {
        if (bArr == null) {
            Log.v(LOG_TAG, "response body is null, calling onFailure(Throwable, JSONObject)");
            onFailure(i, headerArr, th, (JSONObject) null);
            return;
        }
        Runnable runnable = new Runnable() { // from class: com.loopj.android.http.JsonHttpResponseHandler.2
            @Override // java.lang.Runnable
            public void run() {
                try {
                    final Object response = JsonHttpResponseHandler.this.parseResponse(bArr);
                    JsonHttpResponseHandler.this.postRunnable(new Runnable() { // from class: com.loopj.android.http.JsonHttpResponseHandler.2.1
                        @Override // java.lang.Runnable
                        public void run() {
                            Object obj = response;
                            if (obj instanceof JSONObject) {
                                AnonymousClass2 anonymousClass2 = AnonymousClass2.this;
                                JsonHttpResponseHandler.this.onFailure(i, headerArr, th, (JSONObject) obj);
                                return;
                            }
                            if (obj instanceof JSONArray) {
                                AnonymousClass2 anonymousClass3 = AnonymousClass2.this;
                                JsonHttpResponseHandler.this.onFailure(i, headerArr, th, (JSONArray) obj);
                                return;
                            }
                            if (obj instanceof String) {
                                AnonymousClass2 anonymousClass4 = AnonymousClass2.this;
                                JsonHttpResponseHandler.this.onFailure(i, headerArr, (String) obj, th);
                                return;
                            }
                            AnonymousClass2 anonymousClass5 = AnonymousClass2.this;
                            JsonHttpResponseHandler.this.onFailure(i, headerArr, new JSONException("Unexpected response type " + response.getClass().getName()), (JSONObject) null);
                        }
                    });
                } catch (JSONException e) {
                    JsonHttpResponseHandler.this.postRunnable(new Runnable() { // from class: com.loopj.android.http.JsonHttpResponseHandler.2.2
                        @Override // java.lang.Runnable
                        public void run() {
                            AnonymousClass2 anonymousClass2 = AnonymousClass2.this;
                            JsonHttpResponseHandler.this.onFailure(i, headerArr, e, (JSONObject) null);
                        }
                    });
                }
            }
        };
        if (getUseSynchronousMode()) {
            runnable.run();
        } else {
            new Thread(runnable).start();
        }
    }

    @Override // com.loopj.android.http.TextHttpResponseHandler
    public void onSuccess(int i, Header[] headerArr, String str) {
    }

    public void onSuccess(int i, Header[] headerArr, JSONArray jSONArray) {
    }

    public void onSuccess(int i, Header[] headerArr, JSONObject jSONObject) {
    }

    @Override // com.loopj.android.http.TextHttpResponseHandler, com.loopj.android.http.AsyncHttpResponseHandler
    public final void onSuccess(final int i, final Header[] headerArr, final byte[] bArr) {
        if (i == 204) {
            onSuccess(i, headerArr, new JSONObject());
            return;
        }
        Runnable runnable = new Runnable() { // from class: com.loopj.android.http.JsonHttpResponseHandler.1
            @Override // java.lang.Runnable
            public void run() {
                try {
                    final Object response = JsonHttpResponseHandler.this.parseResponse(bArr);
                    JsonHttpResponseHandler.this.postRunnable(new Runnable() { // from class: com.loopj.android.http.JsonHttpResponseHandler.1.1
                        @Override // java.lang.Runnable
                        public void run() {
                            Object obj = response;
                            if (obj instanceof JSONObject) {
                                AnonymousClass1 anonymousClass1 = AnonymousClass1.this;
                                JsonHttpResponseHandler.this.onSuccess(i, headerArr, (JSONObject) obj);
                                return;
                            }
                            if (obj instanceof JSONArray) {
                                AnonymousClass1 anonymousClass2 = AnonymousClass1.this;
                                JsonHttpResponseHandler.this.onSuccess(i, headerArr, (JSONArray) obj);
                                return;
                            }
                            if (obj instanceof String) {
                                AnonymousClass1 anonymousClass3 = AnonymousClass1.this;
                                JsonHttpResponseHandler.this.onFailure(i, headerArr, (String) obj, new JSONException("Response cannot be parsed as JSON data"));
                                return;
                            }
                            AnonymousClass1 anonymousClass4 = AnonymousClass1.this;
                            JsonHttpResponseHandler.this.onFailure(i, headerArr, new JSONException("Unexpected response type " + response.getClass().getName()), (JSONObject) null);
                        }
                    });
                } catch (JSONException e) {
                    JsonHttpResponseHandler.this.postRunnable(new Runnable() { // from class: com.loopj.android.http.JsonHttpResponseHandler.1.2
                        @Override // java.lang.Runnable
                        public void run() {
                            AnonymousClass1 anonymousClass1 = AnonymousClass1.this;
                            JsonHttpResponseHandler.this.onFailure(i, headerArr, e, (JSONObject) null);
                        }
                    });
                }
            }
        };
        if (getUseSynchronousMode()) {
            runnable.run();
        } else {
            new Thread(runnable).start();
        }
    }

    public Object parseResponse(byte[] bArr) throws JSONException {
        Object objNextValue = null;
        if (bArr == null) {
            return null;
        }
        String responseString = TextHttpResponseHandler.getResponseString(bArr, getCharset());
        if (responseString != null) {
            responseString = responseString.trim();
            if (responseString.startsWith("{") || responseString.startsWith("[")) {
                objNextValue = new JSONTokener(responseString).nextValue();
            }
        }
        return objNextValue == null ? responseString : objNextValue;
    }

    public JsonHttpResponseHandler(String str) {
        super(str);
    }
}
