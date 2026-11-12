package com.ReactNativeBlobUtil;

import android.app.Activity;
import android.app.DownloadManager;
import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.net.Uri;
import android.util.SparseArray;
import androidx.annotation.RequiresApi;
import androidx.core.content.FileProvider;
import com.facebook.react.bridge.ActivityEventListener;
import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.LifecycleEventListener;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.xiaomi.smarthome.framework.plugin.rn.utils.MediaStoreUtil;
import defpackage.f7h;
import defpackage.kk4;
import defpackage.l1a;
import defpackage.nl9;
import defpackage.qdj;
import java.io.File;
import java.util.Map;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import okhttp3.JavaNetCookieJar;
import okhttp3.OkHttpClient;

/* JADX INFO: loaded from: classes.dex */
public class ReactNativeBlobUtil extends ReactContextBaseJavaModule {
    private static boolean ActionViewVisible;
    static ReactApplicationContext RCTContext;
    static LinkedBlockingQueue<Runnable> fsTaskQueue;
    private static final ThreadPoolExecutor fsThreadPool;
    private static final SparseArray<Promise> promiseTable;
    private static final LinkedBlockingQueue<Runnable> taskQueue;
    private static final ThreadPoolExecutor threadPool;
    private final OkHttpClient mClient;

    public class a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ String f5608a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ String f5609b;
        public final /* synthetic */ Promise c;

        public a(String str, String str2, Promise promise) {
            this.f5608a = str;
            this.f5609b = str2;
            this.c = promise;
        }

        @Override // java.lang.Runnable
        public void run() {
            com.ReactNativeBlobUtil.b.n(this.f5608a, this.f5609b, this.c);
        }
    }

    public class b implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ ReactApplicationContext f5610a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ String f5611b;
        public final /* synthetic */ String c;
        public final /* synthetic */ int d;
        public final /* synthetic */ int e;
        public final /* synthetic */ String f;

        public b(ReactApplicationContext reactApplicationContext, String str, String str2, int i, int i2, String str3) {
            this.f5610a = reactApplicationContext;
            this.f5611b = str;
            this.c = str2;
            this.d = i;
            this.e = i2;
            this.f = str3;
        }

        @Override // java.lang.Runnable
        public void run() {
            new com.ReactNativeBlobUtil.d(this.f5610a).e(this.f5611b, this.c, this.d, this.e, this.f);
        }
    }

    public class c implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Callback f5612a;

        public c(Callback callback) {
            this.f5612a = callback;
        }

        @Override // java.lang.Runnable
        public void run() {
            com.ReactNativeBlobUtil.b.e(this.f5612a, ReactNativeBlobUtil.this.getReactApplicationContext());
        }
    }

    public class d implements ActivityEventListener {
        public d() {
        }

        @Override // com.facebook.react.bridge.ActivityEventListener
        public void onActivityResult(Activity activity, int i, int i2, Intent intent) {
            Integer num = qdj.f31413a;
            if (i == num.intValue() && i2 == -1) {
                ((Promise) ReactNativeBlobUtil.promiseTable.get(num.intValue())).resolve(intent.getData().toString());
                ReactNativeBlobUtil.promiseTable.remove(num.intValue());
            }
        }

        @Override // com.facebook.react.bridge.ActivityEventListener
        public void onNewIntent(Intent intent) {
        }
    }

    public class e implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ String f5615a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ String f5616b;
        public final /* synthetic */ String c;
        public final /* synthetic */ Promise d;

        public e(String str, String str2, String str3, Promise promise) {
            this.f5615a = str;
            this.f5616b = str2;
            this.c = str3;
            this.d = promise;
        }

        @Override // java.lang.Runnable
        public void run() {
            com.ReactNativeBlobUtil.b.b(this.f5615a, this.f5616b, this.c, this.d);
        }
    }

    public class f implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ String f5617a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ ReadableArray f5618b;
        public final /* synthetic */ Promise c;

        public f(String str, ReadableArray readableArray, Promise promise) {
            this.f5617a = str;
            this.f5618b = readableArray;
            this.c = promise;
        }

        @Override // java.lang.Runnable
        public void run() {
            com.ReactNativeBlobUtil.b.c(this.f5617a, this.f5618b, this.c);
        }
    }

    public class g implements LifecycleEventListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Promise f5619a;

        public g(Promise promise) {
            this.f5619a = promise;
        }

        @Override // com.facebook.react.bridge.LifecycleEventListener
        public void onHostDestroy() {
        }

        @Override // com.facebook.react.bridge.LifecycleEventListener
        public void onHostPause() {
        }

        @Override // com.facebook.react.bridge.LifecycleEventListener
        public void onHostResume() {
            if (ReactNativeBlobUtil.ActionViewVisible) {
                this.f5619a.resolve(null);
            }
            ReactNativeBlobUtil.RCTContext.removeLifecycleEventListener(this);
        }
    }

    public class h implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ String f5621a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ String f5622b;
        public final /* synthetic */ Callback c;

        public h(String str, String str2, Callback callback) {
            this.f5621a = str;
            this.f5622b = str2;
            this.c = callback;
        }

        @Override // java.lang.Runnable
        public void run() {
            com.ReactNativeBlobUtil.b.a(this.f5621a, this.f5622b, this.c);
        }
    }

    public class i implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ String f5623a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ String f5624b;
        public final /* synthetic */ boolean c;
        public final /* synthetic */ Promise d;

        public i(String str, String str2, boolean z, Promise promise) {
            this.f5623a = str;
            this.f5624b = str2;
            this.c = z;
            this.d = promise;
        }

        @Override // java.lang.Runnable
        public void run() {
            com.ReactNativeBlobUtil.b.v(this.f5623a, this.f5624b, this.c, this.d);
        }
    }

    public class j implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ String f5625a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ ReadableArray f5626b;
        public final /* synthetic */ boolean c;
        public final /* synthetic */ Promise d;

        public j(String str, ReadableArray readableArray, boolean z, Promise promise) {
            this.f5625a = str;
            this.f5626b = readableArray;
            this.c = z;
            this.d = promise;
        }

        @Override // java.lang.Runnable
        public void run() {
            com.ReactNativeBlobUtil.b.C(this.f5625a, this.f5626b, this.c, this.d);
        }
    }

    public class k implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ String f5627a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ String f5628b;
        public final /* synthetic */ String c;
        public final /* synthetic */ boolean d;
        public final /* synthetic */ boolean e;
        public final /* synthetic */ Promise f;

        public k(String str, String str2, String str3, boolean z, boolean z2, Promise promise) {
            this.f5627a = str;
            this.f5628b = str2;
            this.c = str3;
            this.d = z;
            this.e = z2;
            this.f = promise;
        }

        @Override // java.lang.Runnable
        public void run() {
            com.ReactNativeBlobUtil.b.D(this.f5627a, this.f5628b, this.c, this.d, this.e, this.f);
        }
    }

    public class l implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ ReadableArray f5629a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ ReactApplicationContext f5630b;
        public final /* synthetic */ Callback c;

        public l(ReadableArray readableArray, ReactApplicationContext reactApplicationContext, Callback callback) {
            this.f5629a = readableArray;
            this.f5630b = reactApplicationContext;
            this.c = callback;
        }

        @Override // java.lang.Runnable
        public void run() {
            int size = this.f5629a.size();
            String[] strArr = new String[size];
            String[] strArr2 = new String[size];
            for (int i = 0; i < size; i++) {
                ReadableMap map = this.f5629a.getMap(i);
                if (map.hasKey("path")) {
                    strArr[i] = map.getString("path");
                    if (map.hasKey("mime")) {
                        strArr2[i] = map.getString("mime");
                    } else {
                        strArr2[i] = null;
                    }
                }
            }
            new com.ReactNativeBlobUtil.b(this.f5630b).x(strArr, strArr2, this.c);
        }
    }

    static {
        LinkedBlockingQueue<Runnable> linkedBlockingQueue = new LinkedBlockingQueue<>();
        taskQueue = linkedBlockingQueue;
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        threadPool = new ThreadPoolExecutor(5, 10, 5000L, timeUnit, linkedBlockingQueue);
        fsTaskQueue = new LinkedBlockingQueue<>();
        fsThreadPool = new ThreadPoolExecutor(2, 10, 5000L, timeUnit, linkedBlockingQueue);
        ActionViewVisible = false;
        promiseTable = new SparseArray<>();
    }

    public ReactNativeBlobUtil(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
        OkHttpClient okHttpClientG = f7h.g();
        this.mClient = okHttpClientG;
        ((kk4) okHttpClientG.cookieJar()).b(new JavaNetCookieJar(new l1a(reactApplicationContext)));
        RCTContext = reactApplicationContext;
        reactApplicationContext.addActivityEventListener(new d());
    }

    @ReactMethod
    public void actionViewIntent(String str, String str2, String str3, Promise promise) {
        Uri uriForFile;
        try {
            if (com.ReactNativeBlobUtil.e.e(str)) {
                uriForFile = Uri.parse(str);
            } else {
                uriForFile = FileProvider.getUriForFile(getReactApplicationContext(), getReactApplicationContext().getPackageName() + ".provider", new File(str));
            }
            Intent intent = new Intent("android.intent.action.VIEW");
            intent.setDataAndType(uriForFile, str2);
            intent.setFlags(1);
            intent.addFlags(268435456);
            if (str3 != null) {
                intent = Intent.createChooser(intent, str3);
            }
            try {
                getReactApplicationContext().startActivity(intent);
                promise.resolve(Boolean.TRUE);
            } catch (ActivityNotFoundException unused) {
                promise.reject("ENOAPP", "No app installed for " + str2);
            }
            ActionViewVisible = true;
            RCTContext.addLifecycleEventListener(new g(promise));
        } catch (Exception e2) {
            promise.reject("EUNSPECIFIED", e2.getLocalizedMessage());
        }
    }

    @ReactMethod
    public void addCompleteDownload(ReadableMap readableMap, Promise promise) {
        DownloadManager downloadManager = (DownloadManager) RCTContext.getSystemService("download");
        if (readableMap == null || !readableMap.hasKey("path")) {
            promise.reject("EINVAL", "ReactNativeBlobUtil.addCompleteDownload config or path missing.");
            return;
        }
        String strF = com.ReactNativeBlobUtil.e.f(readableMap.getString("path"));
        if (strF == null) {
            promise.reject("EINVAL", "ReactNativeBlobUtil.addCompleteDownload can not resolve URI:" + readableMap.getString("path"));
            return;
        }
        try {
            downloadManager.addCompletedDownload(readableMap.hasKey("title") ? readableMap.getString("title") : "", readableMap.hasKey("description") ? readableMap.getString("description") : "", true, readableMap.hasKey("mime") ? readableMap.getString("mime") : null, strF, Long.valueOf(com.ReactNativeBlobUtil.b.A(strF).getString(MediaStoreUtil.MediaInfo.SIZE)).longValue(), readableMap.hasKey("showNotification") && readableMap.getBoolean("showNotification"));
            promise.resolve(null);
        } catch (Exception e2) {
            promise.reject("EUNSPECIFIED", e2.getLocalizedMessage());
        }
    }

    @ReactMethod
    public void cancelRequest(String str, Callback callback) {
        try {
            ReactNativeBlobUtilReq.c(str);
            callback.invoke(null, str);
        } catch (Exception e2) {
            callback.invoke(e2.getLocalizedMessage(), null);
        }
    }

    @ReactMethod
    public void closeStream(String str, Callback callback) {
        com.ReactNativeBlobUtil.d.a(str, callback);
    }

    @ReactMethod
    @RequiresApi(api = 29)
    public void copyToInternal(String str, String str2, Promise promise) {
        ReactNativeBlobUtilMediaCollection.a(Uri.parse(str), str2, promise);
    }

    @ReactMethod
    public void copyToMediaStore(ReadableMap readableMap, String str, String str2, Promise promise) {
        if (!readableMap.hasKey("name") || !readableMap.hasKey("parentFolder") || !readableMap.hasKey("mimeType")) {
            promise.reject("ReactNativeBlobUtil.createMediaFile", "invalid filedata: " + readableMap.toString());
            return;
        }
        if (str == null) {
            promise.reject("ReactNativeBlobUtil.createMediaFile", "invalid mediatype");
            return;
        }
        if (str2 == null) {
            promise.reject("ReactNativeBlobUtil.createMediaFile", "invalid path");
            return;
        }
        Uri uriB = ReactNativeBlobUtilMediaCollection.b(new nl9(readableMap.getString("name"), readableMap.getString("mimeType"), readableMap.getString("parentFolder")), ReactNativeBlobUtilMediaCollection.MediaType.valueOf(str), getReactApplicationContext());
        if (uriB == null) {
            promise.reject("ReactNativeBlobUtil.createMediaFile", "File could not be created");
        } else if (ReactNativeBlobUtilMediaCollection.f(uriB, str2, false, promise)) {
            promise.resolve(uriB.toString());
        }
    }

    @ReactMethod
    public void cp(String str, String str2, Callback callback) {
        threadPool.execute(new h(str, str2, callback));
    }

    @ReactMethod
    public void createFile(String str, String str2, String str3, Promise promise) {
        threadPool.execute(new e(str, str2, str3, promise));
    }

    @ReactMethod
    public void createFileASCII(String str, ReadableArray readableArray, Promise promise) {
        threadPool.execute(new f(str, readableArray, promise));
    }

    @ReactMethod
    public void createMediaFile(ReadableMap readableMap, String str, Promise promise) {
        if (!readableMap.hasKey("name") || !readableMap.hasKey("parentFolder") || !readableMap.hasKey("mimeType")) {
            promise.reject("ReactNativeBlobUtil.createMediaFile", "invalid filedata: " + readableMap.toString());
            return;
        }
        if (str == null) {
            promise.reject("ReactNativeBlobUtil.createMediaFile", "invalid mediatype");
        }
        Uri uriB = ReactNativeBlobUtilMediaCollection.b(new nl9(readableMap.getString("name"), readableMap.getString("mimeType"), readableMap.getString("parentFolder")), ReactNativeBlobUtilMediaCollection.MediaType.valueOf(str), getReactApplicationContext());
        if (uriB != null) {
            promise.resolve(uriB.toString());
        } else {
            promise.reject("ReactNativeBlobUtil.createMediaFile", "File could not be created");
        }
    }

    @ReactMethod
    public void df(Callback callback) {
        fsThreadPool.execute(new c(callback));
    }

    @ReactMethod
    public void enableProgressReport(String str, int i2, int i3) {
        ReactNativeBlobUtilReq.v.put(str, new com.ReactNativeBlobUtil.c(true, i2, i3, com.ReactNativeBlobUtil.c.a.Download));
    }

    @ReactMethod
    public void enableUploadProgressReport(String str, int i2, int i3) {
        ReactNativeBlobUtilReq.w.put(str, new com.ReactNativeBlobUtil.c(true, i2, i3, com.ReactNativeBlobUtil.c.a.Upload));
    }

    @ReactMethod
    public void exists(String str, Callback callback) {
        com.ReactNativeBlobUtil.b.f(str, callback);
    }

    @ReactMethod
    public void fetchBlob(ReadableMap readableMap, String str, String str2, String str3, ReadableMap readableMap2, String str4, Callback callback) {
        new ReactNativeBlobUtilReq(readableMap, str, str2, str3, readableMap2, str4, null, this.mClient, callback).run();
    }

    @ReactMethod
    public void fetchBlobForm(ReadableMap readableMap, String str, String str2, String str3, ReadableMap readableMap2, ReadableArray readableArray, Callback callback) {
        new ReactNativeBlobUtilReq(readableMap, str, str2, str3, readableMap2, null, readableArray, this.mClient, callback).run();
    }

    @ReactMethod
    @RequiresApi(api = 29)
    public void getBlob(String str, String str2, Promise promise) {
        ReactNativeBlobUtilMediaCollection.c(Uri.parse(str), str2, promise);
    }

    @Override // com.facebook.react.bridge.BaseJavaModule
    public Map<String, Object> getConstants() {
        return com.ReactNativeBlobUtil.b.l(getReactApplicationContext());
    }

    @ReactMethod
    public void getContentIntent(String str, Promise promise) {
        Intent intent = new Intent("android.intent.action.GET_CONTENT");
        if (str != null) {
            intent.setType(str);
        } else {
            intent.setType("*/*");
        }
        SparseArray<Promise> sparseArray = promiseTable;
        Integer num = qdj.f31413a;
        sparseArray.put(num.intValue(), promise);
        getReactApplicationContext().startActivityForResult(intent, num.intValue(), null);
    }

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return "ReactNativeBlobUtil";
    }

    @ReactMethod
    public void getSDCardApplicationDir(Promise promise) {
        com.ReactNativeBlobUtil.b.j(getReactApplicationContext(), promise);
    }

    @ReactMethod
    public void getSDCardDir(Promise promise) {
        com.ReactNativeBlobUtil.b.k(getReactApplicationContext(), promise);
    }

    @ReactMethod
    public void hash(String str, String str2, Promise promise) {
        threadPool.execute(new a(str, str2, promise));
    }

    @ReactMethod
    public void ls(String str, Promise promise) {
        com.ReactNativeBlobUtil.b.r(str, promise);
    }

    @ReactMethod
    public void lstat(String str, Callback callback) {
        com.ReactNativeBlobUtil.b.s(str, callback);
    }

    @ReactMethod
    public void mkdir(String str, Promise promise) {
        com.ReactNativeBlobUtil.b.t(str, promise);
    }

    @ReactMethod
    public void mv(String str, String str2, Callback callback) {
        com.ReactNativeBlobUtil.b.u(str, str2, callback);
    }

    @ReactMethod
    public void readFile(String str, String str2, boolean z, Promise promise) {
        threadPool.execute(new i(str, str2, z, promise));
    }

    @ReactMethod
    public void readStream(String str, String str2, int i2, int i3, String str3) {
        fsThreadPool.execute(new b(getReactApplicationContext(), str, str2, i2, i3, str3));
    }

    @ReactMethod
    public void removeSession(ReadableArray readableArray, Callback callback) {
        com.ReactNativeBlobUtil.b.w(readableArray, callback);
    }

    @ReactMethod
    public void scanFile(ReadableArray readableArray, Callback callback) {
        threadPool.execute(new l(readableArray, getReactApplicationContext(), callback));
    }

    @ReactMethod
    public void slice(String str, String str2, int i2, int i3, Promise promise) {
        com.ReactNativeBlobUtil.b.y(str, str2, i2, i3, "", promise);
    }

    @ReactMethod
    public void stat(String str, Callback callback) {
        com.ReactNativeBlobUtil.b.z(str, callback);
    }

    @ReactMethod
    public void unlink(String str, Callback callback) {
        com.ReactNativeBlobUtil.b.B(str, callback);
    }

    @ReactMethod
    public void writeArrayChunk(String str, ReadableArray readableArray, Callback callback) {
        com.ReactNativeBlobUtil.d.f(str, readableArray, callback);
    }

    @ReactMethod
    public void writeChunk(String str, String str2, Callback callback) {
        com.ReactNativeBlobUtil.d.g(str, str2, callback);
    }

    @ReactMethod
    public void writeFile(String str, String str2, String str3, boolean z, boolean z2, Promise promise) {
        threadPool.execute(new k(str, str2, str3, z, z2, promise));
    }

    @ReactMethod
    public void writeFileArray(String str, ReadableArray readableArray, boolean z, Promise promise) {
        threadPool.execute(new j(str, readableArray, z, promise));
    }

    @ReactMethod
    public void writeStream(String str, String str2, boolean z, Callback callback) {
        new com.ReactNativeBlobUtil.d(getReactApplicationContext()).h(str, str2, z, callback);
    }

    @ReactMethod
    public void writeToMediaFile(String str, String str2, boolean z, Promise promise) {
        if (ReactNativeBlobUtilMediaCollection.f(Uri.parse(str), str2, z, promise)) {
            promise.resolve("Success");
        }
    }
}
