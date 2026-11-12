package com.huawei.agconnect.https;

import java.io.IOException;
import okhttp3.Request;
import okhttp3.RequestBody;

/* JADX INFO: loaded from: classes3.dex */
public abstract class Method<HttpsRequest> {
    HttpsRequest httpsRequest;

    public abstract Request.Builder create();

    public static class Post<HttpsRequest> extends Method {
        Adapter.Factory factory;

        public Request.Builder createBody(Request.Builder builder, RequestBody requestBody) {
            builder.post(requestBody);
            return builder;
        }

        @Override // com.huawei.agconnect.https.Method
        public Request.Builder create() {
            Request.Builder builderA = RequestFactory.a(this.httpsRequest).a();
            try {
                if (this.factory.requestBodyAdapter() != null) {
                    return createBody(builderA, (RequestBody) this.factory.requestBodyAdapter().adapter(this.httpsRequest));
                }
                throw new IllegalArgumentException("RequestBodyAdapter should not be null.");
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }

        private void init(HttpsRequest httpsrequest, Adapter.Factory factory) {
            this.httpsRequest = httpsrequest;
            this.factory = factory;
        }

        public Post(HttpsRequest httpsrequest, Adapter.Factory factory) {
            init(httpsrequest, factory);
        }
    }

    /* JADX INFO: loaded from: classes22.dex */
    public static final class Delete<HttpsRequest> extends Method {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Adapter.Factory f5020a;

        @Override // com.huawei.agconnect.https.Method
        public Request.Builder create() {
            Request.Builder builderA = RequestFactory.a(this.httpsRequest).a();
            Adapter.Factory factory = this.f5020a;
            if (factory == null || factory.requestBodyAdapter() == null) {
                builderA.delete();
                return builderA;
            }
            try {
                builderA.delete((RequestBody) this.f5020a.requestBodyAdapter().adapter(this.httpsRequest));
                return builderA;
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }

        public Delete(HttpsRequest httpsrequest, Adapter.Factory factory) {
            this.httpsRequest = httpsrequest;
            this.f5020a = factory;
        }

        public Delete(HttpsRequest httpsrequest) {
            this.httpsRequest = httpsrequest;
        }
    }

    public static class Get<HttpsRequest> extends Method {
        @Override // com.huawei.agconnect.https.Method
        public Request.Builder create() {
            return RequestFactory.a(this.httpsRequest).a();
        }

        public Get(HttpsRequest httpsrequest) {
            this.httpsRequest = httpsrequest;
        }
    }

    public static class Put<HttpsRequest> extends Post {
        @Override // com.huawei.agconnect.https.Method.Post
        public Request.Builder createBody(Request.Builder builder, RequestBody requestBody) {
            builder.put(requestBody);
            return builder;
        }

        public Put(HttpsRequest httpsrequest, Adapter.Factory factory) {
            super(httpsrequest, factory);
        }
    }
}
