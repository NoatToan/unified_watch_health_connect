package com.facebook.react.modules.image;

import android.net.Uri;
import android.os.AsyncTask;
import android.util.SparseArray;
import com.facebook.imagepipeline.request.ImageRequestBuilder;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.GuardedAsyncTask;
import com.facebook.react.bridge.LifecycleEventListener;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.WritableMap;
import defpackage.aej;
import defpackage.apa;
import defpackage.cp5;
import defpackage.fb3;
import defpackage.j5d;
import defpackage.n62;
import defpackage.ndj;
import defpackage.u14;
import defpackage.v5d;
import defpackage.w14;

/* JADX INFO: loaded from: classes4.dex */
@ndj(name = ImageLoaderModule.NAME)
public class ImageLoaderModule extends ReactContextBaseJavaModule implements LifecycleEventListener {
    private static final String ERROR_GET_SIZE_FAILURE = "E_GET_SIZE_FAILURE";
    private static final String ERROR_INVALID_URI = "E_INVALID_URI";
    private static final String ERROR_PREFETCH_FAILURE = "E_PREFETCH_FAILURE";
    public static final String NAME = "ImageLoader";
    private final Object mCallerContext;
    private final Object mEnqueuedRequestMonitor;
    private final SparseArray<cp5<Void>> mEnqueuedRequests;

    public class a extends n62<w14<u14>> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Promise f7414a;

        public a(Promise promise) {
            this.f7414a = promise;
        }

        @Override // defpackage.n62
        public void onFailureImpl(cp5<w14<u14>> cp5Var) {
            this.f7414a.reject(ImageLoaderModule.ERROR_GET_SIZE_FAILURE, cp5Var.b());
        }

        @Override // defpackage.n62
        public void onNewResultImpl(cp5<w14<u14>> cp5Var) {
            if (cp5Var.a()) {
                w14<u14> result = cp5Var.getResult();
                try {
                    if (result == null) {
                        this.f7414a.reject(ImageLoaderModule.ERROR_GET_SIZE_FAILURE);
                        return;
                    }
                    try {
                        u14 u14VarN = result.n();
                        WritableMap writableMapCreateMap = Arguments.createMap();
                        writableMapCreateMap.putInt("width", u14VarN.getWidth());
                        writableMapCreateMap.putInt("height", u14VarN.getHeight());
                        this.f7414a.resolve(writableMapCreateMap);
                    } catch (Exception e) {
                        this.f7414a.reject(ImageLoaderModule.ERROR_GET_SIZE_FAILURE, e);
                    }
                } finally {
                    w14.l(result);
                }
            }
        }
    }

    public class b extends n62<w14<u14>> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Promise f7416a;

        public b(Promise promise) {
            this.f7416a = promise;
        }

        @Override // defpackage.n62
        public void onFailureImpl(cp5<w14<u14>> cp5Var) {
            this.f7416a.reject(ImageLoaderModule.ERROR_GET_SIZE_FAILURE, cp5Var.b());
        }

        @Override // defpackage.n62
        public void onNewResultImpl(cp5<w14<u14>> cp5Var) {
            if (cp5Var.a()) {
                w14<u14> result = cp5Var.getResult();
                try {
                    if (result == null) {
                        this.f7416a.reject(ImageLoaderModule.ERROR_GET_SIZE_FAILURE);
                        return;
                    }
                    try {
                        u14 u14VarN = result.n();
                        WritableMap writableMapCreateMap = Arguments.createMap();
                        writableMapCreateMap.putInt("width", u14VarN.getWidth());
                        writableMapCreateMap.putInt("height", u14VarN.getHeight());
                        this.f7416a.resolve(writableMapCreateMap);
                    } catch (Exception e) {
                        this.f7416a.reject(ImageLoaderModule.ERROR_GET_SIZE_FAILURE, e);
                    }
                } finally {
                    w14.l(result);
                }
            }
        }
    }

    public class c extends n62<Void> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ int f7418a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Promise f7419b;

        public c(int i, Promise promise) {
            this.f7418a = i;
            this.f7419b = promise;
        }

        @Override // defpackage.n62
        public void onFailureImpl(cp5<Void> cp5Var) {
            try {
                ImageLoaderModule.this.removeRequest(this.f7418a);
                this.f7419b.reject(ImageLoaderModule.ERROR_PREFETCH_FAILURE, cp5Var.b());
            } finally {
                cp5Var.close();
            }
        }

        @Override // defpackage.n62
        public void onNewResultImpl(cp5<Void> cp5Var) {
            if (cp5Var.a()) {
                try {
                    ImageLoaderModule.this.removeRequest(this.f7418a);
                    this.f7419b.resolve(Boolean.TRUE);
                } finally {
                    cp5Var.close();
                }
            }
        }
    }

    public class d extends GuardedAsyncTask<Void, Void> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ ReadableArray f7420a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Promise f7421b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(ReactContext reactContext, ReadableArray readableArray, Promise promise) {
            super(reactContext);
            this.f7420a = readableArray;
            this.f7421b = promise;
        }

        @Override // com.facebook.react.bridge.GuardedAsyncTask
        public void doInBackgroundGuarded(Void... voidArr) {
            WritableMap writableMapCreateMap = Arguments.createMap();
            j5d j5dVarA = apa.a();
            for (int i = 0; i < this.f7420a.size(); i++) {
                String string = this.f7420a.getString(i);
                Uri uri = Uri.parse(string);
                if (j5dVarA.l(uri)) {
                    writableMapCreateMap.putString(string, "memory");
                } else if (j5dVarA.n(uri)) {
                    writableMapCreateMap.putString(string, "disk");
                }
            }
            this.f7421b.resolve(writableMapCreateMap);
        }
    }

    public ImageLoaderModule(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
        this.mEnqueuedRequestMonitor = new Object();
        this.mEnqueuedRequests = new SparseArray<>();
        this.mCallerContext = this;
    }

    private void registerRequest(int i, cp5<Void> cp5Var) {
        synchronized (this.mEnqueuedRequestMonitor) {
            this.mEnqueuedRequests.put(i, cp5Var);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public cp5<Void> removeRequest(int i) {
        cp5<Void> cp5Var;
        synchronized (this.mEnqueuedRequestMonitor) {
            cp5Var = this.mEnqueuedRequests.get(i);
            this.mEnqueuedRequests.remove(i);
        }
        return cp5Var;
    }

    @ReactMethod
    public void abortRequest(int i) {
        cp5<Void> cp5VarRemoveRequest = removeRequest(i);
        if (cp5VarRemoveRequest != null) {
            cp5VarRemoveRequest.close();
        }
    }

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return NAME;
    }

    @ReactMethod
    public void getSize(String str, Promise promise) {
        if (str == null || str.isEmpty()) {
            promise.reject(ERROR_INVALID_URI, "Cannot get the size of an image for an empty URI");
        } else {
            apa.a().d(ImageRequestBuilder.r(new v5d(getReactApplicationContext(), str).e()).a(), this.mCallerContext).c(new a(promise), fb3.a());
        }
    }

    @ReactMethod
    public void getSizeWithHeaders(String str, ReadableMap readableMap, Promise promise) {
        if (str == null || str.isEmpty()) {
            promise.reject(ERROR_INVALID_URI, "Cannot get the size of an image for an empty URI");
        } else {
            apa.a().d(aej.w(ImageRequestBuilder.r(new v5d(getReactApplicationContext(), str).e()), readableMap), this.mCallerContext).c(new b(promise), fb3.a());
        }
    }

    @Override // com.facebook.react.bridge.LifecycleEventListener
    public void onHostDestroy() {
        synchronized (this.mEnqueuedRequestMonitor) {
            try {
                int size = this.mEnqueuedRequests.size();
                for (int i = 0; i < size; i++) {
                    cp5<Void> cp5VarValueAt = this.mEnqueuedRequests.valueAt(i);
                    if (cp5VarValueAt != null) {
                        cp5VarValueAt.close();
                    }
                }
                this.mEnqueuedRequests.clear();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.facebook.react.bridge.LifecycleEventListener
    public void onHostPause() {
    }

    @Override // com.facebook.react.bridge.LifecycleEventListener
    public void onHostResume() {
    }

    @ReactMethod
    public void prefetchImage(String str, int i, Promise promise) {
        if (str == null || str.isEmpty()) {
            promise.reject(ERROR_INVALID_URI, "Cannot prefetch an image for an empty URI");
            return;
        }
        cp5<Void> cp5VarR = apa.a().r(ImageRequestBuilder.r(Uri.parse(str)).a(), this.mCallerContext);
        c cVar = new c(i, promise);
        registerRequest(i, cp5VarR);
        cp5VarR.c(cVar, fb3.a());
    }

    @ReactMethod
    public void queryCache(ReadableArray readableArray, Promise promise) {
        new d(getReactApplicationContext(), readableArray, promise).executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new Void[0]);
    }

    public ImageLoaderModule(ReactApplicationContext reactApplicationContext, Object obj) {
        super(reactApplicationContext);
        this.mEnqueuedRequestMonitor = new Object();
        this.mEnqueuedRequests = new SparseArray<>();
        this.mCallerContext = obj;
    }
}
