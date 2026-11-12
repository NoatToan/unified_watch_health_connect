package com.facebook.internal;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import androidx.annotation.VisibleForTesting;
import com.airoha.android.lib.RaceCommand.constant.RaceId;
import com.baidu.ocr.sdk.utils.LogUtil;
import com.facebook.FacebookException;
import com.facebook.internal.instrument.crashshield.CrashShieldHandler;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.google.firebase.perf.network.FirebasePerfUrlConnection;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.HashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.JvmStatic;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010%\n\u0002\b\u0007\bÆ\u0002\u0018\u00002\u00020\u0001:\u0004\u001c\r23B\t\b\u0002¢\u0006\u0004\b0\u00101J\u0012\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0007J\u0010\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H\u0007J\u0010\u0010\b\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007J\b\u0010\t\u001a\u00020\u0004H\u0007J \u0010\r\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u0006H\u0002J\u0018\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0002J(\u0010\u0013\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0002J2\u0010\u001a\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\n2\u000e\u0010\u0016\u001a\n\u0018\u00010\u0014j\u0004\u0018\u0001`\u00152\b\u0010\u0018\u001a\u0004\u0018\u00010\u00172\u0006\u0010\u0019\u001a\u00020\u0006H\u0002J\u0018\u0010\u001b\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u0006H\u0002J\u0010\u0010\u001c\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\nH\u0002J\u0012\u0010\u001e\u001a\u0004\u0018\u00010\u001d2\u0006\u0010\u000b\u001a\u00020\nH\u0002J\u0014\u0010 \u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u001d0\u001fH\u0007R\u0016\u0010#\u001a\u00020!8\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001c\u0010\"R\u0016\u0010$\u001a\u00020!8\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\r\u0010\"R\u001e\u0010)\u001a\u0004\u0018\u00010%8B@\u0002X\u0082\u000e¢\u0006\f\n\u0004\b\u000e\u0010&\u001a\u0004\b'\u0010(R\u0016\u0010+\u001a\u00020\u000f8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010*R\u0016\u0010,\u001a\u00020\u000f8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010*R\"\u0010/\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u001d0-8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010.¨\u00064"}, d2 = {"Lcom/facebook/internal/ImageDownloader;", "", "Lcom/facebook/internal/ImageRequest;", "request", "", "downloadAsync", "", "cancelRequest", "prioritizeRequest", "clearCache", "Lcom/facebook/internal/ImageDownloader$RequestKey;", "key", "allowCachedRedirects", "b", "c", "Lcom/facebook/internal/WorkQueue;", "workQueue", "Ljava/lang/Runnable;", "workItem", GoogleApiAvailabilityLight.a, "Ljava/lang/Exception;", "Lkotlin/Exception;", "error", "Landroid/graphics/Bitmap;", "bitmap", "isCachedRedirect", "f", "g", "a", "Lcom/facebook/internal/ImageDownloader$DownloaderContext;", "h", "", "getPendingRequests", "", LogUtil.I, "DOWNLOAD_QUEUE_MAX_CONCURRENT", "CACHE_READ_QUEUE_MAX_CONCURRENT", "Landroid/os/Handler;", "Landroid/os/Handler;", "e", "()Landroid/os/Handler;", "handler", "Lcom/facebook/internal/WorkQueue;", "downloadQueue", "cacheReadQueue", "", "Ljava/util/Map;", "pendingRequests", "<init>", "()V", "DownloaderContext", "RequestKey", "facebook-core_release"}, k = 1, mv = {1, 5, 1})
public final class ImageDownloader {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private static final int DOWNLOAD_QUEUE_MAX_CONCURRENT = 8;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private static final int CACHE_READ_QUEUE_MAX_CONCURRENT = 2;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private static Handler handler;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private static final WorkQueue downloadQueue;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private static final WorkQueue cacheReadQueue;

    @NotNull
    public static final ImageDownloader INSTANCE = new ImageDownloader();

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private static final Map<RequestKey, DownloaderContext> pendingRequests = new HashMap();

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u00002\u00020\u0001B\u0011\b\u0000\u0012\u0006\u0010\u0018\u001a\u00020\u0011¢\u0006\u0004\b\u0019\u0010\u0017R$\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\"\u0010\r\u001a\u00020\n8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\"\u0010\u0018\u001a\u00020\u00118\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017¨\u0006\u001a"}, d2 = {"Lcom/facebook/internal/ImageDownloader$DownloaderContext;", "", "Lcom/facebook/internal/WorkQueue$WorkItem;", "a", "Lcom/facebook/internal/WorkQueue$WorkItem;", "getWorkItem", "()Lcom/facebook/internal/WorkQueue$WorkItem;", "setWorkItem", "(Lcom/facebook/internal/WorkQueue$WorkItem;)V", "workItem", "", "b", "Z", "isCancelled", "()Z", "setCancelled", "(Z)V", "Lcom/facebook/internal/ImageRequest;", "c", "Lcom/facebook/internal/ImageRequest;", "getRequest", "()Lcom/facebook/internal/ImageRequest;", "setRequest", "(Lcom/facebook/internal/ImageRequest;)V", "request", "<init>", "facebook-core_release"}, k = 1, mv = {1, 5, 1})
    @VisibleForTesting(otherwise = 2)
    public static final class DownloaderContext {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        @Nullable
        private WorkQueue.WorkItem workItem;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private boolean isCancelled;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        @NotNull
        private ImageRequest request;

        public DownloaderContext(@NotNull ImageRequest imageRequest) {
            this.request = imageRequest;
        }

        @NotNull
        public final ImageRequest getRequest() {
            return this.request;
        }

        @Nullable
        public final WorkQueue.WorkItem getWorkItem() {
            return this.workItem;
        }

        /* JADX INFO: renamed from: isCancelled, reason: from getter */
        public final boolean getIsCancelled() {
            return this.isCancelled;
        }

        public final void setCancelled(boolean z) {
            this.isCancelled = z;
        }

        public final void setRequest(@NotNull ImageRequest imageRequest) {
            this.request = imageRequest;
        }

        public final void setWorkItem(@Nullable WorkQueue.WorkItem workItem) {
            this.workItem = workItem;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0012\b\u0007\u0018\u0000 \u00182\u00020\u0001:\u0001\u0018B\u0017\u0012\u0006\u0010\u000e\u001a\u00020\u0007\u0012\u0006\u0010\u0015\u001a\u00020\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\u0013\u0010\u0006\u001a\u00020\u00052\b\u0010\u0004\u001a\u0004\u0018\u00010\u0001H\u0096\u0002R\"\u0010\u000e\u001a\u00020\u00078\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\"\u0010\u0015\u001a\u00020\u00018\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014¨\u0006\u0019"}, d2 = {"Lcom/facebook/internal/ImageDownloader$RequestKey;", "", "", "hashCode", "o", "", "equals", "Landroid/net/Uri;", "a", "Landroid/net/Uri;", "getUri", "()Landroid/net/Uri;", "setUri", "(Landroid/net/Uri;)V", "uri", "b", "Ljava/lang/Object;", "getTag", "()Ljava/lang/Object;", "setTag", "(Ljava/lang/Object;)V", "tag", "<init>", "(Landroid/net/Uri;Ljava/lang/Object;)V", "Companion", "facebook-core_release"}, k = 1, mv = {1, 5, 1})
    @VisibleForTesting(otherwise = 2)
    public static final class RequestKey {
        private static final int c = 29;
        private static final int d = 37;

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        @NotNull
        private Uri uri;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        @NotNull
        private Object tag;

        public RequestKey(@NotNull Uri uri, @NotNull Object obj) {
            this.uri = uri;
            this.tag = obj;
        }

        public boolean equals(@Nullable Object o) {
            if (o == null || !(o instanceof RequestKey)) {
                return false;
            }
            RequestKey requestKey = (RequestKey) o;
            return requestKey.uri == this.uri && requestKey.tag == this.tag;
        }

        @NotNull
        public final Object getTag() {
            return this.tag;
        }

        @NotNull
        public final Uri getUri() {
            return this.uri;
        }

        public int hashCode() {
            return ((RaceId.RACE_STORAGE_GET_PARTITION_SHA256 + this.uri.hashCode()) * 37) + this.tag.hashCode();
        }

        public final void setTag(@NotNull Object obj) {
            this.tag = obj;
        }

        public final void setUri(@NotNull Uri uri) {
            this.uri = uri;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0002\u0018\u00002\u00020\u0001B\u0019\b\u0000\u0012\u0006\u0010\u0007\u001a\u00020\u0004\u0012\u0006\u0010\u000b\u001a\u00020\b¢\u0006\u0004\b\f\u0010\rJ\b\u0010\u0003\u001a\u00020\u0002H\u0016R\u0016\u0010\u0007\u001a\u00020\u00048\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0016\u0010\u000b\u001a\u00020\b8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\n¨\u0006\u000e"}, d2 = {"com/facebook/internal/ImageDownloader$a", "Ljava/lang/Runnable;", "", "run", "Lcom/facebook/internal/ImageDownloader$RequestKey;", "a", "Lcom/facebook/internal/ImageDownloader$RequestKey;", "key", "", "b", "Z", "allowCachedRedirects", "<init>", "(Lcom/facebook/internal/ImageDownloader$RequestKey;Z)V", "facebook-core_release"}, k = 1, mv = {1, 5, 1})
    public static final class a implements Runnable {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final RequestKey key;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final boolean allowCachedRedirects;

        public a(@NotNull RequestKey requestKey, boolean z) {
            this.key = requestKey;
            this.allowCachedRedirects = z;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (CrashShieldHandler.isObjectCrashing(this)) {
                return;
            }
            try {
                ImageDownloader.INSTANCE.g(this.key, this.allowCachedRedirects);
            } catch (Throwable th) {
                CrashShieldHandler.handleThrowable(th, this);
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0002\u0018\u00002\u00020\u0001B\u0011\b\u0000\u0012\u0006\u0010\u0007\u001a\u00020\u0004¢\u0006\u0004\b\b\u0010\tJ\b\u0010\u0003\u001a\u00020\u0002H\u0016R\u0016\u0010\u0007\u001a\u00020\u00048\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\n"}, d2 = {"com/facebook/internal/ImageDownloader$b", "Ljava/lang/Runnable;", "", "run", "Lcom/facebook/internal/ImageDownloader$RequestKey;", "a", "Lcom/facebook/internal/ImageDownloader$RequestKey;", "key", "<init>", "(Lcom/facebook/internal/ImageDownloader$RequestKey;)V", "facebook-core_release"}, k = 1, mv = {1, 5, 1})
    public static final class b implements Runnable {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final RequestKey key;

        public b(@NotNull RequestKey requestKey) {
            this.key = requestKey;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (CrashShieldHandler.isObjectCrashing(this)) {
                return;
            }
            try {
                ImageDownloader.INSTANCE.a(this.key);
            } catch (Throwable th) {
                CrashShieldHandler.handleThrowable(th, this);
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "run", "()V", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class c implements Runnable {
        public final /* synthetic */ ImageRequest a;
        public final /* synthetic */ Exception b;
        public final /* synthetic */ boolean c;
        public final /* synthetic */ Bitmap d;
        public final /* synthetic */ ImageRequest.Callback e;

        public c(ImageRequest imageRequest, Exception exc, boolean z, Bitmap bitmap, ImageRequest.Callback callback) {
            this.a = imageRequest;
            this.b = exc;
            this.c = z;
            this.d = bitmap;
            this.e = callback;
        }

        @Override // java.lang.Runnable
        public final void run() {
            if (CrashShieldHandler.isObjectCrashing(this)) {
                return;
            }
            try {
                this.e.onCompleted(new ImageResponse(this.a, this.b, this.c, this.d));
            } catch (Throwable th) {
                CrashShieldHandler.handleThrowable(th, this);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    static {
        int i = 2;
        downloadQueue = new WorkQueue(8, null, i, 0 == true ? 1 : 0);
        cacheReadQueue = new WorkQueue(i, 0 == true ? 1 : 0, i, 0 == true ? 1 : 0);
    }

    private ImageDownloader() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:56:0x00d7  */
    /* JADX WARN: Code duplicated, block: B:64:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0 */
    /* JADX WARN: Type inference failed for: r0v1, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r0v3 */
    /* JADX WARN: Type inference failed for: r0v8 */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r4v5 */
    /* JADX WARN: Type inference failed for: r4v6, types: [int] */
    /* JADX WARN: Type inference failed for: r4v9 */
    public final void a(RequestKey key) throws Throwable {
        HttpURLConnection httpURLConnection;
        ?? responseCode;
        Exception facebookException;
        InputStream inputStreamInterceptAndCacheImageStream;
        Bitmap bitmapDecodeStream;
        ?? r0 = 0;
        InputStream inputStream = null;
        r0 = 0;
        Bitmap bitmap = null;
        boolean z = true;
        try {
            URLConnection uRLConnection = (URLConnection) FirebasePerfUrlConnection.instrument(new URL(key.getUri().toString()).openConnection());
            if (uRLConnection == null) {
                throw new NullPointerException("null cannot be cast to non-null type java.net.HttpURLConnection");
            }
            httpURLConnection = (HttpURLConnection) uRLConnection;
            try {
                try {
                    httpURLConnection.setInstanceFollowRedirects(false);
                    responseCode = httpURLConnection.getResponseCode();
                    try {
                        if (responseCode != 200) {
                            if (responseCode == 301 || responseCode == 302) {
                                try {
                                    String headerField = httpURLConnection.getHeaderField("location");
                                    if (!Utility.isNullOrEmpty(headerField)) {
                                        Uri uri = Uri.parse(headerField);
                                        UrlRedirectCache.cacheUriRedirect(key.getUri(), uri);
                                        DownloaderContext downloaderContextH = h(key);
                                        if (downloaderContextH != null && !downloaderContextH.getIsCancelled()) {
                                            b(downloaderContextH.getRequest(), new RequestKey(uri, key.getTag()), false);
                                        }
                                    }
                                    bitmapDecodeStream = null;
                                    facebookException = null;
                                    z = false;
                                } catch (IOException e) {
                                    e = e;
                                    responseCode = 0;
                                    z = false;
                                    Utility.closeQuietly(responseCode);
                                    Utility.disconnectQuietly(httpURLConnection);
                                    facebookException = e;
                                }
                            } else {
                                inputStreamInterceptAndCacheImageStream = httpURLConnection.getErrorStream();
                                StringBuilder sb = new StringBuilder();
                                if (inputStreamInterceptAndCacheImageStream != null) {
                                    InputStreamReader inputStreamReader = new InputStreamReader(inputStreamInterceptAndCacheImageStream);
                                    char[] cArr = new char[128];
                                    while (true) {
                                        int i = inputStreamReader.read(cArr, 0, 128);
                                        if (i <= 0) {
                                            break;
                                        } else {
                                            sb.append(cArr, 0, i);
                                        }
                                    }
                                    Utility.closeQuietly(inputStreamReader);
                                } else {
                                    sb.append("Unexpected error while downloading an image.");
                                }
                                facebookException = new FacebookException(sb.toString());
                                bitmapDecodeStream = null;
                            }
                            Utility.closeQuietly(inputStream);
                            Utility.disconnectQuietly(httpURLConnection);
                            bitmap = bitmapDecodeStream;
                            if (z) {
                                f(key, facebookException, bitmap, false);
                            }
                        }
                        inputStreamInterceptAndCacheImageStream = ImageResponseCache.interceptAndCacheImageStream(httpURLConnection);
                        bitmapDecodeStream = BitmapFactory.decodeStream(inputStreamInterceptAndCacheImageStream);
                        facebookException = null;
                        inputStream = inputStreamInterceptAndCacheImageStream;
                        Utility.closeQuietly(inputStream);
                        Utility.disconnectQuietly(httpURLConnection);
                        bitmap = bitmapDecodeStream;
                    } catch (IOException e2) {
                        e = e2;
                    } catch (Throwable th) {
                        th = th;
                        r0 = responseCode;
                        Utility.closeQuietly(r0);
                        Utility.disconnectQuietly(httpURLConnection);
                        throw th;
                    }
                } catch (IOException e3) {
                    e = e3;
                    responseCode = 0;
                }
                if (z) {
                    f(key, facebookException, bitmap, false);
                }
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (IOException e4) {
            e = e4;
            httpURLConnection = null;
            responseCode = 0;
        } catch (Throwable th3) {
            th = th3;
            httpURLConnection = null;
        }
    }

    private final void b(ImageRequest request, RequestKey key, boolean allowCachedRedirects) {
        d(request, key, cacheReadQueue, new a(key, allowCachedRedirects));
    }

    private final void c(ImageRequest request, RequestKey key) {
        d(request, key, downloadQueue, new b(key));
    }

    @JvmStatic
    public static final boolean cancelRequest(@NotNull ImageRequest request) {
        boolean z;
        RequestKey requestKey = new RequestKey(request.getImageUri(), request.getCallerTag());
        Map<RequestKey, DownloaderContext> map = pendingRequests;
        synchronized (map) {
            DownloaderContext downloaderContext = map.get(requestKey);
            z = true;
            if (downloaderContext != null) {
                WorkQueue.WorkItem workItem = downloaderContext.getWorkItem();
                if (workItem == null || !workItem.cancel()) {
                    downloaderContext.setCancelled(true);
                } else {
                    map.remove(requestKey);
                }
            } else {
                z = false;
            }
            Unit unit = Unit.INSTANCE;
        }
        return z;
    }

    @JvmStatic
    public static final void clearCache() {
        ImageResponseCache.clearCache();
        UrlRedirectCache.clearCache();
    }

    private final void d(ImageRequest request, RequestKey key, WorkQueue workQueue, Runnable workItem) {
        Map<RequestKey, DownloaderContext> map = pendingRequests;
        synchronized (map) {
            DownloaderContext downloaderContext = new DownloaderContext(request);
            map.put(key, downloaderContext);
            downloaderContext.setWorkItem(WorkQueue.addActiveWorkItem$default(workQueue, workItem, false, 2, null));
            Unit unit = Unit.INSTANCE;
        }
    }

    @JvmStatic
    public static final void downloadAsync(@Nullable ImageRequest request) {
        if (request == null) {
            return;
        }
        RequestKey requestKey = new RequestKey(request.getImageUri(), request.getCallerTag());
        Map<RequestKey, DownloaderContext> map = pendingRequests;
        synchronized (map) {
            DownloaderContext downloaderContext = map.get(requestKey);
            if (downloaderContext != null) {
                downloaderContext.setRequest(request);
                downloaderContext.setCancelled(false);
                WorkQueue.WorkItem workItem = downloaderContext.getWorkItem();
                if (workItem != null) {
                    workItem.moveToFront();
                    Unit unit = Unit.INSTANCE;
                }
            } else {
                INSTANCE.b(request, requestKey, request.isCachedRedirectAllowed());
                Unit unit2 = Unit.INSTANCE;
            }
        }
    }

    private final synchronized Handler e() {
        if (handler == null) {
            handler = new Handler(Looper.getMainLooper());
        }
        return handler;
    }

    private final void f(RequestKey key, Exception error, Bitmap bitmap, boolean isCachedRedirect) {
        Handler handlerE;
        DownloaderContext downloaderContextH = h(key);
        if (downloaderContextH == null || downloaderContextH.getIsCancelled()) {
            return;
        }
        ImageRequest request = downloaderContextH.getRequest();
        ImageRequest.Callback callback = request != null ? request.getCallback() : null;
        if (callback == null || (handlerE = e()) == null) {
            return;
        }
        handlerE.post(new c(request, error, isCachedRedirect, bitmap, callback));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void g(RequestKey key, boolean allowCachedRedirects) {
        InputStream cachedImageStream;
        Uri redirectedUri;
        boolean z = false;
        if (!allowCachedRedirects || (redirectedUri = UrlRedirectCache.getRedirectedUri(key.getUri())) == null) {
            cachedImageStream = null;
        } else {
            cachedImageStream = ImageResponseCache.getCachedImageStream(redirectedUri);
            if (cachedImageStream != null) {
                z = true;
            }
        }
        if (!z) {
            cachedImageStream = ImageResponseCache.getCachedImageStream(key.getUri());
        }
        if (cachedImageStream != null) {
            Bitmap bitmapDecodeStream = BitmapFactory.decodeStream(cachedImageStream);
            Utility.closeQuietly(cachedImageStream);
            f(key, null, bitmapDecodeStream, z);
            return;
        }
        DownloaderContext downloaderContextH = h(key);
        ImageRequest request = downloaderContextH != null ? downloaderContextH.getRequest() : null;
        if (downloaderContextH == null || downloaderContextH.getIsCancelled() || request == null) {
            return;
        }
        c(request, key);
    }

    private final DownloaderContext h(RequestKey key) {
        DownloaderContext downloaderContextRemove;
        Map<RequestKey, DownloaderContext> map = pendingRequests;
        synchronized (map) {
            downloaderContextRemove = map.remove(key);
        }
        return downloaderContextRemove;
    }

    @JvmStatic
    public static final void prioritizeRequest(@NotNull ImageRequest request) {
        WorkQueue.WorkItem workItem;
        RequestKey requestKey = new RequestKey(request.getImageUri(), request.getCallerTag());
        Map<RequestKey, DownloaderContext> map = pendingRequests;
        synchronized (map) {
            DownloaderContext downloaderContext = map.get(requestKey);
            if (downloaderContext != null && (workItem = downloaderContext.getWorkItem()) != null) {
                workItem.moveToFront();
            }
            Unit unit = Unit.INSTANCE;
        }
    }

    @VisibleForTesting(otherwise = 2)
    @NotNull
    public final Map<RequestKey, DownloaderContext> getPendingRequests() {
        return pendingRequests;
    }
}
