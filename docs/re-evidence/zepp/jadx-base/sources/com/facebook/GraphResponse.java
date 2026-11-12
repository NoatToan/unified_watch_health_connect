package com.facebook;

import android.util.Log;
import com.alipay.sdk.m.u.i;
import com.facebook.internal.Logger;
import com.facebook.internal.Utility;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.google.android.material.timepicker.TimeModel;
import com.huami.watch.companion.esim.AbsEsimOperation;
import com.xiaomi.ai.core.AivsConfig;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.json.JSONTokener;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u000e\u0018\u0000 62\u00020\u0001:\u000267BC\b\u0000\u0012\u0006\u0010\u001a\u001a\u00020\b\u0012\b\u0010 \u001a\u0004\u0018\u00010\u001b\u0012\b\u0010%\u001a\u0004\u0018\u00010\n\u0012\b\u0010'\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010)\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010/\u001a\u0004\u0018\u00010*¢\u0006\u0004\b0\u00101B-\b\u0016\u0012\u0006\u0010\u001a\u001a\u00020\b\u0012\b\u0010 \u001a\u0004\u0018\u00010\u001b\u0012\u0006\u0010%\u001a\u00020\n\u0012\b\u0010'\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b0\u00102B+\b\u0016\u0012\u0006\u0010\u001a\u001a\u00020\b\u0012\b\u0010 \u001a\u0004\u0018\u00010\u001b\u0012\u0006\u0010%\u001a\u00020\n\u0012\u0006\u00103\u001a\u00020\u0004¢\u0006\u0004\b0\u00104B#\b\u0016\u0012\u0006\u0010\u001a\u001a\u00020\b\u0012\b\u0010 \u001a\u0004\u0018\u00010\u001b\u0012\u0006\u0010/\u001a\u00020*¢\u0006\u0004\b0\u00105J\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002J\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004J\u0010\u0010\t\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0007\u001a\u00020\u0006J\b\u0010\u000b\u001a\u00020\nH\u0016R\u001b\u0010\u0010\u001a\u0004\u0018\u00010\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u001b\u0010\u0015\u001a\u0004\u0018\u00010\u00048\u0006@\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u0019\u0010\u001a\u001a\u00020\b8\u0006@\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u001b\u0010 \u001a\u0004\u0018\u00010\u001b8\u0006@\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u001b\u0010%\u001a\u0004\u0018\u00010\n8\u0006@\u0006¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$R\u0018\u0010'\u001a\u0004\u0018\u00010\u00028\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010\rR\u0018\u0010)\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010\u0012R\u001b\u0010/\u001a\u0004\u0018\u00010*8\u0006@\u0006¢\u0006\f\n\u0004\b+\u0010,\u001a\u0004\b-\u0010.¨\u00068"}, d2 = {"Lcom/facebook/GraphResponse;", "", "Lorg/json/JSONObject;", "getJSONObject", "Lorg/json/JSONArray;", "getJSONArray", "Lcom/facebook/GraphResponse$PagingDirection;", "direction", "Lcom/facebook/GraphRequest;", "getRequestForPagedResults", "", "toString", "a", "Lorg/json/JSONObject;", "getJsonObject", "()Lorg/json/JSONObject;", "jsonObject", "b", "Lorg/json/JSONArray;", "getJsonArray", "()Lorg/json/JSONArray;", "jsonArray", "c", "Lcom/facebook/GraphRequest;", "getRequest", "()Lcom/facebook/GraphRequest;", "request", "Ljava/net/HttpURLConnection;", GoogleApiAvailabilityLight.a, "Ljava/net/HttpURLConnection;", "getConnection", "()Ljava/net/HttpURLConnection;", AbsEsimOperation.HEADER_CONNECTION, "e", "Ljava/lang/String;", "getRawResponse", "()Ljava/lang/String;", "rawResponse", "f", "graphObject", "g", "graphObjectArray", "Lcom/facebook/FacebookRequestError;", "h", "Lcom/facebook/FacebookRequestError;", "getError", "()Lcom/facebook/FacebookRequestError;", "error", "<init>", "(Lcom/facebook/GraphRequest;Ljava/net/HttpURLConnection;Ljava/lang/String;Lorg/json/JSONObject;Lorg/json/JSONArray;Lcom/facebook/FacebookRequestError;)V", "(Lcom/facebook/GraphRequest;Ljava/net/HttpURLConnection;Ljava/lang/String;Lorg/json/JSONObject;)V", "graphObjects", "(Lcom/facebook/GraphRequest;Ljava/net/HttpURLConnection;Ljava/lang/String;Lorg/json/JSONArray;)V", "(Lcom/facebook/GraphRequest;Ljava/net/HttpURLConnection;Lcom/facebook/FacebookRequestError;)V", "Companion", "PagingDirection", "facebook-core_release"}, k = 1, mv = {1, 5, 1})
public final class GraphResponse {

    @NotNull
    public static final String NON_JSON_RESPONSE_PROPERTY = "FACEBOOK_NON_JSON_RESULT";

    @NotNull
    public static final String SUCCESS_KEY = "success";
    private static final String j = "code";
    private static final String k = "body";
    private static final String l = "Response";

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @Nullable
    private final JSONObject jsonObject;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @Nullable
    private final JSONArray jsonArray;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    private final GraphRequest request;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @Nullable
    private final HttpURLConnection connection;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @Nullable
    private final String rawResponse;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final JSONObject graphObject;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private final JSONArray graphObjectArray;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    @Nullable
    private final FacebookRequestError error;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    private static final String i = GraphResponse.class.getCanonicalName();

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\f\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b%\u0010&J.\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0007\u001a\u00020\u0001H\u0002J*\u0010\f\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u00052\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0007\u001a\u00020\u00012\u0006\u0010\u000b\u001a\u00020\u0001H\u0002J%\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\b0\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\rH\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ1\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\b0\u00042\b\u0010\u0012\u001a\u0004\u0018\u00010\u00112\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0006\u001a\u00020\rH\u0001¢\u0006\u0004\b\u0013\u0010\u0014J/\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\b0\u00042\u0006\u0010\u0017\u001a\u00020\u00162\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0006\u001a\u00020\rH\u0001¢\u0006\u0004\b\u0018\u0010\u0019J0\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\b0\u00042\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\u0010\u001c\u001a\u0004\u0018\u00010\u001bH\u0007R\u0016\u0010\u001e\u001a\u00020\u00168\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0016\u0010 \u001a\u00020\u00168\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b \u0010\u001fR\u0016\u0010!\u001a\u00020\u00168\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b!\u0010\u001fR\u0016\u0010\"\u001a\u00020\u00168\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\"\u0010\u001fR\u0016\u0010#\u001a\u00020\u00168\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b#\u0010\u001fR\u0018\u0010$\u001a\u0004\u0018\u00010\u00168\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010\u001f¨\u0006'"}, d2 = {"Lcom/facebook/GraphResponse$Companion;", "", "Ljava/net/HttpURLConnection;", AbsEsimOperation.HEADER_CONNECTION, "", "Lcom/facebook/GraphRequest;", "requests", "sourceObject", "Lcom/facebook/GraphResponse;", "b", "request", "originalResult", "a", "Lcom/facebook/GraphRequestBatch;", "fromHttpConnection$facebook_core_release", "(Ljava/net/HttpURLConnection;Lcom/facebook/GraphRequestBatch;)Ljava/util/List;", "fromHttpConnection", "Ljava/io/InputStream;", AivsConfig.Tts.AUDIO_TYPE_STREAM, "createResponsesFromStream$facebook_core_release", "(Ljava/io/InputStream;Ljava/net/HttpURLConnection;Lcom/facebook/GraphRequestBatch;)Ljava/util/List;", "createResponsesFromStream", "", "responseString", "createResponsesFromString$facebook_core_release", "(Ljava/lang/String;Ljava/net/HttpURLConnection;Lcom/facebook/GraphRequestBatch;)Ljava/util/List;", "createResponsesFromString", "Lcom/facebook/FacebookException;", "error", "constructErrorResponses", "BODY_KEY", "Ljava/lang/String;", "CODE_KEY", "NON_JSON_RESPONSE_PROPERTY", "RESPONSE_LOG_TAG", "SUCCESS_KEY", "TAG", "<init>", "()V", "facebook-core_release"}, k = 1, mv = {1, 5, 1})
    public static final class Companion {
        private Companion() {
        }

        private final GraphResponse a(GraphRequest request, HttpURLConnection connection, Object sourceObject, Object originalResult) throws JSONException {
            if (sourceObject instanceof JSONObject) {
                JSONObject jSONObject = (JSONObject) sourceObject;
                FacebookRequestError facebookRequestErrorCheckResponseAndCreateError = FacebookRequestError.INSTANCE.checkResponseAndCreateError(jSONObject, originalResult, connection);
                if (facebookRequestErrorCheckResponseAndCreateError != null) {
                    Log.e(GraphResponse.i, facebookRequestErrorCheckResponseAndCreateError.toString());
                    if (facebookRequestErrorCheckResponseAndCreateError.getErrorCode() == 190 && Utility.isCurrentAccessToken(request.getAccessToken())) {
                        if (facebookRequestErrorCheckResponseAndCreateError.getSubErrorCode() != 493) {
                            AccessToken.INSTANCE.setCurrentAccessToken(null);
                        } else {
                            AccessToken.Companion companion = AccessToken.INSTANCE;
                            AccessToken currentAccessToken = companion.getCurrentAccessToken();
                            if (currentAccessToken != null && !currentAccessToken.isExpired()) {
                                companion.expireCurrentAccessToken();
                            }
                        }
                    }
                    return new GraphResponse(request, connection, facebookRequestErrorCheckResponseAndCreateError);
                }
                Object stringPropertyAsJSON = Utility.getStringPropertyAsJSON(jSONObject, "body", GraphResponse.NON_JSON_RESPONSE_PROPERTY);
                if (stringPropertyAsJSON instanceof JSONObject) {
                    return new GraphResponse(request, connection, stringPropertyAsJSON.toString(), (JSONObject) stringPropertyAsJSON);
                }
                if (stringPropertyAsJSON instanceof JSONArray) {
                    return new GraphResponse(request, connection, stringPropertyAsJSON.toString(), (JSONArray) stringPropertyAsJSON);
                }
                sourceObject = JSONObject.NULL;
            }
            if (sourceObject == JSONObject.NULL) {
                return new GraphResponse(request, connection, sourceObject.toString(), (JSONObject) null);
            }
            throw new FacebookException("Got unexpected object type in response, class: " + sourceObject.getClass().getSimpleName());
        }

        private final List<GraphResponse> b(HttpURLConnection connection, List<GraphRequest> requests, Object sourceObject) throws JSONException, FacebookException {
            Object obj;
            int size = requests.size();
            ArrayList arrayList = new ArrayList(size);
            if (size == 1) {
                GraphRequest graphRequest = requests.get(0);
                try {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("body", sourceObject);
                    jSONObject.put("code", connection != null ? connection.getResponseCode() : 200);
                    JSONArray jSONArray = new JSONArray();
                    jSONArray.put(jSONObject);
                    obj = jSONArray;
                } catch (IOException e) {
                    arrayList.add(new GraphResponse(graphRequest, connection, new FacebookRequestError(connection, e)));
                    obj = sourceObject;
                } catch (JSONException e2) {
                    arrayList.add(new GraphResponse(graphRequest, connection, new FacebookRequestError(connection, e2)));
                    obj = sourceObject;
                }
            } else {
                obj = sourceObject;
            }
            if (obj instanceof JSONArray) {
                JSONArray jSONArray2 = (JSONArray) obj;
                if (jSONArray2.length() == size) {
                    int length = jSONArray2.length();
                    for (int i = 0; i < length; i++) {
                        GraphRequest graphRequest2 = requests.get(i);
                        try {
                            arrayList.add(a(graphRequest2, connection, ((JSONArray) obj).get(i), sourceObject));
                        } catch (FacebookException e3) {
                            arrayList.add(new GraphResponse(graphRequest2, connection, new FacebookRequestError(connection, e3)));
                        } catch (JSONException e4) {
                            arrayList.add(new GraphResponse(graphRequest2, connection, new FacebookRequestError(connection, e4)));
                        }
                    }
                    return arrayList;
                }
            }
            throw new FacebookException("Unexpected number of results");
        }

        @JvmStatic
        @NotNull
        public final List<GraphResponse> constructErrorResponses(@NotNull List<GraphRequest> requests, @Nullable HttpURLConnection connection, @Nullable FacebookException error) {
            ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(requests, 10));
            Iterator<T> it2 = requests.iterator();
            while (it2.hasNext()) {
                arrayList.add(new GraphResponse((GraphRequest) it2.next(), connection, new FacebookRequestError(connection, error)));
            }
            return arrayList;
        }

        @JvmStatic
        @NotNull
        public final List<GraphResponse> createResponsesFromStream$facebook_core_release(@Nullable InputStream stream, @Nullable HttpURLConnection connection, @NotNull GraphRequestBatch requests) throws JSONException, FacebookException, IOException {
            String streamToString = Utility.readStreamToString(stream);
            Logger.INSTANCE.log(LoggingBehavior.INCLUDE_RAW_RESPONSES, "Response", "Response (raw)\n  Size: %d\n  Response:\n%s\n", Integer.valueOf(streamToString.length()), streamToString);
            return createResponsesFromString$facebook_core_release(streamToString, connection, requests);
        }

        @JvmStatic
        @NotNull
        public final List<GraphResponse> createResponsesFromString$facebook_core_release(@NotNull String responseString, @Nullable HttpURLConnection connection, @NotNull GraphRequestBatch requests) throws JSONException, FacebookException, IOException {
            List<GraphResponse> listB = b(connection, requests, new JSONTokener(responseString).nextValue());
            Logger.INSTANCE.log(LoggingBehavior.REQUESTS, "Response", "Response\n  Id: %s\n  Size: %d\n  Responses:\n%s\n", requests.getId(), Integer.valueOf(responseString.length()), listB);
            return listB;
        }

        @JvmStatic
        @NotNull
        public final List<GraphResponse> fromHttpConnection$facebook_core_release(@NotNull HttpURLConnection connection, @NotNull GraphRequestBatch requests) {
            List<GraphResponse> listConstructErrorResponses;
            InputStream errorStream = null;
            try {
                try {
                    if (!FacebookSdk.isFullyInitialized()) {
                        Log.e(GraphResponse.i, "GraphRequest can't be used when Facebook SDK isn't fully initialized");
                        throw new FacebookException("GraphRequest can't be used when Facebook SDK isn't fully initialized");
                    }
                    errorStream = connection.getResponseCode() >= 400 ? connection.getErrorStream() : connection.getInputStream();
                    listConstructErrorResponses = createResponsesFromStream$facebook_core_release(errorStream, connection, requests);
                    Utility.closeQuietly(errorStream);
                    return listConstructErrorResponses;
                } catch (FacebookException e) {
                    Logger.INSTANCE.log(LoggingBehavior.REQUESTS, "Response", "Response <Error>: %s", e);
                    listConstructErrorResponses = constructErrorResponses(requests, connection, e);
                } catch (Exception e2) {
                    Logger.INSTANCE.log(LoggingBehavior.REQUESTS, "Response", "Response <Error>: %s", e2);
                    listConstructErrorResponses = constructErrorResponses(requests, connection, new FacebookException(e2));
                }
            } catch (Throwable th) {
                Utility.closeQuietly(null);
                throw th;
            }
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lcom/facebook/GraphResponse$PagingDirection;", "", "<init>", "(Ljava/lang/String;I)V", "NEXT", "PREVIOUS", "facebook-core_release"}, k = 1, mv = {1, 5, 1})
    public enum PagingDirection {
        NEXT,
        PREVIOUS
    }

    public GraphResponse(@NotNull GraphRequest graphRequest, @Nullable HttpURLConnection httpURLConnection, @Nullable String str, @Nullable JSONObject jSONObject, @Nullable JSONArray jSONArray, @Nullable FacebookRequestError facebookRequestError) {
        this.request = graphRequest;
        this.connection = httpURLConnection;
        this.rawResponse = str;
        this.graphObject = jSONObject;
        this.graphObjectArray = jSONArray;
        this.error = facebookRequestError;
        this.jsonObject = jSONObject;
        this.jsonArray = jSONArray;
    }

    @JvmStatic
    @NotNull
    public static final List<GraphResponse> constructErrorResponses(@NotNull List<GraphRequest> list, @Nullable HttpURLConnection httpURLConnection, @Nullable FacebookException facebookException) {
        return INSTANCE.constructErrorResponses(list, httpURLConnection, facebookException);
    }

    @Nullable
    public final HttpURLConnection getConnection() {
        return this.connection;
    }

    @Nullable
    public final FacebookRequestError getError() {
        return this.error;
    }

    @Nullable
    /* JADX INFO: renamed from: getJSONArray, reason: from getter */
    public final JSONArray getGraphObjectArray() {
        return this.graphObjectArray;
    }

    @Nullable
    /* JADX INFO: renamed from: getJSONObject, reason: from getter */
    public final JSONObject getGraphObject() {
        return this.graphObject;
    }

    @Nullable
    public final JSONArray getJsonArray() {
        return this.jsonArray;
    }

    @Nullable
    public final JSONObject getJsonObject() {
        return this.jsonObject;
    }

    @Nullable
    public final String getRawResponse() {
        return this.rawResponse;
    }

    @NotNull
    public final GraphRequest getRequest() {
        return this.request;
    }

    @Nullable
    public final GraphRequest getRequestForPagedResults(@NotNull PagingDirection direction) {
        String strOptString;
        JSONObject jSONObjectOptJSONObject;
        JSONObject jSONObject = this.graphObject;
        if (jSONObject == null || (jSONObjectOptJSONObject = jSONObject.optJSONObject("paging")) == null) {
            strOptString = null;
        } else {
            strOptString = direction == PagingDirection.NEXT ? jSONObjectOptJSONObject.optString("next") : jSONObjectOptJSONObject.optString("previous");
        }
        if (Utility.isNullOrEmpty(strOptString)) {
            return null;
        }
        if (strOptString != null && Intrinsics.areEqual(strOptString, this.request.getUrlForSingleRequest())) {
            return null;
        }
        try {
            return new GraphRequest(this.request.getAccessToken(), new URL(strOptString));
        } catch (MalformedURLException unused) {
            return null;
        }
    }

    @NotNull
    public String toString() {
        String str;
        try {
            StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
            Locale locale = Locale.US;
            Object[] objArr = new Object[1];
            HttpURLConnection httpURLConnection = this.connection;
            objArr[0] = Integer.valueOf(httpURLConnection != null ? httpURLConnection.getResponseCode() : 200);
            str = String.format(locale, TimeModel.NUMBER_FORMAT, Arrays.copyOf(objArr, 1));
        } catch (IOException unused) {
            str = "unknown";
        }
        return "{Response:  responseCode: " + str + ", graphObject: " + this.graphObject + ", error: " + this.error + i.d;
    }

    public GraphResponse(@NotNull GraphRequest graphRequest, @Nullable HttpURLConnection httpURLConnection, @NotNull String str, @Nullable JSONObject jSONObject) {
        this(graphRequest, httpURLConnection, str, jSONObject, null, null);
    }

    public GraphResponse(@NotNull GraphRequest graphRequest, @Nullable HttpURLConnection httpURLConnection, @NotNull String str, @NotNull JSONArray jSONArray) {
        this(graphRequest, httpURLConnection, str, null, jSONArray, null);
    }

    public GraphResponse(@NotNull GraphRequest graphRequest, @Nullable HttpURLConnection httpURLConnection, @NotNull FacebookRequestError facebookRequestError) {
        this(graphRequest, httpURLConnection, null, null, null, facebookRequestError);
    }
}
