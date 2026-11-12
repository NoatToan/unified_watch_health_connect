package com.ximalaya.ting.android.opensdk.httputil.logging;

import android.text.TextUtils;
import com.huami.identity.auth.alexa.ConstantsKt;
import com.huami.view.basetitle.IdGetter;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;
import okhttp3.Headers;
import okhttp3.Interceptor;
import okhttp3.MediaType;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.ResponseBody;

/* JADX INFO: loaded from: classes22.dex */
public class LoggingInterceptor implements Interceptor {
    private Builder builder;
    private boolean isDebug;

    public static class Builder {
        private static String TAG = "LoggingI";
        private boolean isDebug;
        private Logger logger;
        private String requestTag;
        private String responseTag;
        private int type = 4;
        private Level level = Level.BASIC;
        private Headers.Builder builder = new Headers.Builder();

        public Builder addHeader(String str, String str2) {
            this.builder.set(str, str2);
            return this;
        }

        public LoggingInterceptor build() {
            return new LoggingInterceptor(this);
        }

        public Headers getHeaders() {
            return this.builder.build();
        }

        public Level getLevel() {
            return this.level;
        }

        public Logger getLogger() {
            return this.logger;
        }

        public String getTag(boolean z) {
            if (z) {
                return TextUtils.isEmpty(this.requestTag) ? TAG : this.requestTag;
            }
            return TextUtils.isEmpty(this.responseTag) ? TAG : this.responseTag;
        }

        public int getType() {
            return this.type;
        }

        public Builder log(int i) {
            this.type = i;
            return this;
        }

        public Builder loggable(boolean z) {
            this.isDebug = z;
            return this;
        }

        public Builder logger(Logger logger) {
            this.logger = logger;
            return this;
        }

        public Builder request(String str) {
            this.requestTag = str;
            return this;
        }

        public Builder response(String str) {
            this.responseTag = str;
            return this;
        }

        public Builder setLevel(Level level) {
            this.level = level;
            return this;
        }

        public Builder tag(String str) {
            TAG = str;
            return this;
        }
    }

    @Override // okhttp3.Interceptor
    public Response intercept(Interceptor.Chain chain) throws IOException {
        Request request = chain.request();
        if (this.builder.getHeaders().size() > 0) {
            Headers headers = request.headers();
            Request.Builder builderNewBuilder = request.newBuilder();
            builderNewBuilder.headers(this.builder.getHeaders());
            for (String str : headers.names()) {
                builderNewBuilder.addHeader(str, headers.get(str));
            }
            request = builderNewBuilder.build();
        }
        if (!this.isDebug || this.builder.getLevel() == Level.NONE) {
            return chain.proceed(request);
        }
        MediaType mediaTypeContentType = request.body() != null ? request.body().contentType() : null;
        String strSubtype = mediaTypeContentType != null ? mediaTypeContentType.subtype() : null;
        if (strSubtype == null || !(strSubtype.contains("json") || strSubtype.contains(IdGetter.xml) || strSubtype.contains(ConstantsKt.PLAIN) || strSubtype.contains("html"))) {
            Printer.printFileRequest(this.builder, request);
        } else {
            Printer.printJsonRequest(this.builder, request);
        }
        long jNanoTime = System.nanoTime();
        Response responseProceed = chain.proceed(request);
        List<String> listEncodedPathSegments = request.url().encodedPathSegments();
        long millis = TimeUnit.NANOSECONDS.toMillis(System.nanoTime() - jNanoTime);
        String string = responseProceed.headers().toString();
        int iCode = responseProceed.code();
        boolean zIsSuccessful = responseProceed.isSuccessful();
        ResponseBody responseBodyBody = responseProceed.body();
        MediaType mediaTypeContentType2 = responseBodyBody.contentType();
        String strSubtype2 = mediaTypeContentType2 != null ? mediaTypeContentType2.subtype() : null;
        if (strSubtype2 == null || !(strSubtype2.contains("json") || strSubtype2.contains(IdGetter.xml) || strSubtype2.contains(ConstantsKt.PLAIN) || strSubtype2.contains("html"))) {
            Printer.printFileResponse(this.builder, millis, zIsSuccessful, iCode, string, listEncodedPathSegments);
            return responseProceed;
        }
        String strString = responseBodyBody.string();
        Printer.printJsonResponse(this.builder, millis, zIsSuccessful, iCode, string, Printer.getJsonString(strString), listEncodedPathSegments);
        return responseProceed.newBuilder().body(ResponseBody.create(mediaTypeContentType2, strString)).build();
    }

    private LoggingInterceptor(Builder builder) {
        this.builder = builder;
        this.isDebug = builder.isDebug;
    }
}
