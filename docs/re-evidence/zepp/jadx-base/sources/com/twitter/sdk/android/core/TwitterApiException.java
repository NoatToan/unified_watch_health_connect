package com.twitter.sdk.android.core;

import android.text.TextUtils;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonSyntaxException;
import com.twitter.sdk.android.core.models.ApiError;
import com.twitter.sdk.android.core.models.ApiErrors;
import com.twitter.sdk.android.core.models.SafeListAdapter;
import com.twitter.sdk.android.core.models.SafeMapAdapter;
import retrofit2.Response;

/* JADX INFO: loaded from: classes18.dex */
public class TwitterApiException extends TwitterException {
    public static final int DEFAULT_ERROR_CODE = 0;
    private final ApiError a;
    private final TwitterRateLimit b;
    private final int c;
    private final Response d;

    public TwitterApiException(Response response) {
        this(response, readApiError(response), readApiRateLimit(response), response.code());
    }

    public static String a(int i) {
        return "HTTP request failed, Status: " + i;
    }

    public static ApiError b(String str) {
        try {
            ApiErrors apiErrors = (ApiErrors) new GsonBuilder().registerTypeAdapterFactory(new SafeListAdapter()).registerTypeAdapterFactory(new SafeMapAdapter()).create().fromJson(str, ApiErrors.class);
            if (apiErrors.errors.isEmpty()) {
                return null;
            }
            return apiErrors.errors.get(0);
        } catch (JsonSyntaxException e) {
            Twitter.getLogger().e("Twitter", "Invalid json: " + str, e);
            return null;
        }
    }

    public static ApiError readApiError(Response response) {
        try {
            String utf8 = response.errorBody().source().buffer().clone().readUtf8();
            if (TextUtils.isEmpty(utf8)) {
                return null;
            }
            return b(utf8);
        } catch (Exception e) {
            Twitter.getLogger().e("Twitter", "Unexpected response", e);
            return null;
        }
    }

    public static TwitterRateLimit readApiRateLimit(Response response) {
        return new TwitterRateLimit(response.headers());
    }

    public int getErrorCode() {
        ApiError apiError = this.a;
        if (apiError == null) {
            return 0;
        }
        return apiError.code;
    }

    public String getErrorMessage() {
        ApiError apiError = this.a;
        if (apiError == null) {
            return null;
        }
        return apiError.message;
    }

    public Response getResponse() {
        return this.d;
    }

    public int getStatusCode() {
        return this.c;
    }

    public TwitterRateLimit getTwitterRateLimit() {
        return this.b;
    }

    public TwitterApiException(Response response, ApiError apiError, TwitterRateLimit twitterRateLimit, int i) {
        super(a(i));
        this.a = apiError;
        this.b = twitterRateLimit;
        this.c = i;
        this.d = response;
    }
}
