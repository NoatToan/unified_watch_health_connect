package com.xiaomi.fitness.watch.face.helper;

import android.os.Handler;
import android.os.Looper;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.net.TLSCompatSocketFactory;
import com.xiaomi.fitness.watch.face.helper.FaceDownloadHelper;
import defpackage.tgc;
import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.io.CloseableKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.RangesKt___RangesKt;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.ResponseBody;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000f\u0010\u0010J%\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\b\u0010\tR\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u0014\u0010\r\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\r\u0010\u000e¨\u0006\u0011"}, d2 = {"Lcom/xiaomi/fitness/watch/face/helper/FaceDownloadHelper;", "", "", "url", "path", "Ltgc;", "callback", "", "downloadFile", "(Ljava/lang/String;Ljava/lang/String;Ltgc;)V", "Landroid/os/Handler;", "mHandler", "Landroid/os/Handler;", "TAG", "Ljava/lang/String;", "<init>", "()V", "watch-face_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
@SourceDebugExtension({"SMAP\nFaceDownloadHelper.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FaceDownloadHelper.kt\ncom/xiaomi/fitness/watch/face/helper/FaceDownloadHelper\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,95:1\n1#2:96\n*E\n"})
public final class FaceDownloadHelper {

    @NotNull
    private static final String TAG = "FaceDownloadHelper";

    @NotNull
    public static final FaceDownloadHelper INSTANCE = new FaceDownloadHelper();

    @NotNull
    private static final Handler mHandler = new Handler(Looper.getMainLooper());

    private FaceDownloadHelper() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void downloadFile$lambda$7$lambda$0(tgc callback) {
        Intrinsics.checkNotNullParameter(callback, "$callback");
        callback.onError("downloadFile: resp error");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void downloadFile$lambda$7$lambda$1(tgc callback) {
        Intrinsics.checkNotNullParameter(callback, "$callback");
        callback.onError("downloadFile: file delete error");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void downloadFile$lambda$7$lambda$2(tgc callback) {
        Intrinsics.checkNotNullParameter(callback, "$callback");
        callback.onError("downloadFile: file new error");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void downloadFile$lambda$7$lambda$4(tgc callback, int i) {
        Intrinsics.checkNotNullParameter(callback, "$callback");
        callback.onProgress(i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void downloadFile$lambda$7$lambda$5(tgc callback) {
        Intrinsics.checkNotNullParameter(callback, "$callback");
        callback.onComplete();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void downloadFile$lambda$7$lambda$6(tgc callback, Exception e) {
        Intrinsics.checkNotNullParameter(callback, "$callback");
        Intrinsics.checkNotNullParameter(e, "$e");
        callback.onError(e.getMessage());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void downloadFile$lambda$8(tgc callback, Exception e) {
        Intrinsics.checkNotNullParameter(callback, "$callback");
        Intrinsics.checkNotNullParameter(e, "$e");
        callback.onError(e.getMessage());
    }

    public final void downloadFile(@NotNull String url, @NotNull String path, @NotNull final tgc callback) {
        InputStream inputStreamByteStream;
        InputStream inputStreamByteStream2;
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(path, "path");
        Intrinsics.checkNotNullParameter(callback, "callback");
        Logger.i(TAG, "downloading: " + url + " to " + path);
        try {
            File file = new File(path);
            OkHttpClient.Builder builder = new OkHttpClient.Builder();
            TLSCompatSocketFactory.Companion companion = TLSCompatSocketFactory.INSTANCE;
            OkHttpClient.Builder builderSslSocketFactory = builder.sslSocketFactory(companion.sslSocketFactory(), companion.trustManager());
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            Response responseExecute = builderSslSocketFactory.connectTimeout(10000L, timeUnit).writeTimeout(10000L, timeUnit).readTimeout(10000L, timeUnit).build().newCall(new Request.Builder().url(url).build()).execute();
            try {
                if (responseExecute.isSuccessful() && responseExecute.body() != null) {
                    if (!file.exists()) {
                        File parentFile = file.getParentFile();
                        if (parentFile != null) {
                            if (!parentFile.exists() && !parentFile.mkdirs()) {
                            }
                        }
                        Logger.i(TAG, "downloadFile callback error: file new error");
                        mHandler.post(new Runnable() { // from class: sr8
                            @Override // java.lang.Runnable
                            public final void run() {
                                FaceDownloadHelper.downloadFile$lambda$7$lambda$2(callback);
                            }
                        });
                        CloseableKt.closeFinally(responseExecute, null);
                        return;
                    }
                    if (!file.delete()) {
                        Logger.i(TAG, "downloadFile callback error: file delete error");
                        mHandler.post(new Runnable() { // from class: rr8
                            @Override // java.lang.Runnable
                            public final void run() {
                                FaceDownloadHelper.downloadFile$lambda$7$lambda$1(callback);
                            }
                        });
                        CloseableKt.closeFinally(responseExecute, null);
                        return;
                    }
                    ResponseBody responseBodyBody = responseExecute.body();
                    Intrinsics.checkNotNull(responseBodyBody);
                    long j = responseBodyBody.getContentLength();
                    byte[] bArr = new byte[1024];
                    FileOutputStream fileOutputStream = new FileOutputStream(file, false);
                    int i = 0;
                    while (true) {
                        try {
                            try {
                                int i2 = responseBodyBody.byteStream().read(bArr);
                                if (i2 == -1) {
                                    break;
                                }
                                fileOutputStream.write(bArr, 0, i2);
                                i += i2;
                                final int iCoerceAtMost = (int) RangesKt___RangesKt.coerceAtMost(99.0f, (i * 100.0f) / j);
                                mHandler.post(new Runnable() { // from class: tr8
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        FaceDownloadHelper.downloadFile$lambda$7$lambda$4(callback, iCoerceAtMost);
                                    }
                                });
                            } catch (Throwable th) {
                                fileOutputStream.close();
                                ResponseBody responseBodyBody2 = responseExecute.body();
                                if (responseBodyBody2 != null && (inputStreamByteStream2 = responseBodyBody2.byteStream()) != null) {
                                    inputStreamByteStream2.close();
                                }
                                throw th;
                            }
                        } catch (Exception e) {
                            Logger.i(TAG, "downloadFile callback error: " + e);
                            mHandler.post(new Runnable() { // from class: vr8
                                @Override // java.lang.Runnable
                                public final void run() {
                                    FaceDownloadHelper.downloadFile$lambda$7$lambda$6(callback, e);
                                }
                            });
                            e.printStackTrace();
                            Unit unit = Unit.INSTANCE;
                            fileOutputStream.close();
                            ResponseBody responseBodyBody3 = responseExecute.body();
                            if (responseBodyBody3 != null && (inputStreamByteStream = responseBodyBody3.byteStream()) != null) {
                            }
                        }
                    }
                    Logger.i(TAG, "downloadFile callback complete");
                    mHandler.post(new Runnable() { // from class: ur8
                        @Override // java.lang.Runnable
                        public final void run() {
                            FaceDownloadHelper.downloadFile$lambda$7$lambda$5(callback);
                        }
                    });
                    fileOutputStream.close();
                    ResponseBody responseBodyBody4 = responseExecute.body();
                    if (responseBodyBody4 != null && (inputStreamByteStream = responseBodyBody4.byteStream()) != null) {
                        inputStreamByteStream.close();
                    }
                    CloseableKt.closeFinally(responseExecute, null);
                    return;
                }
                Logger.i(TAG, "downloadFile: resp error");
                mHandler.post(new Runnable() { // from class: qr8
                    @Override // java.lang.Runnable
                    public final void run() {
                        FaceDownloadHelper.downloadFile$lambda$7$lambda$0(callback);
                    }
                });
                CloseableKt.closeFinally(responseExecute, null);
            } catch (Throwable th2) {
                try {
                    throw th2;
                } catch (Throwable th3) {
                    CloseableKt.closeFinally(responseExecute, th2);
                    throw th3;
                }
            }
        } catch (Exception e2) {
            Logger.i(TAG, "downloadFile callback error: " + e2);
            mHandler.post(new Runnable() { // from class: wr8
                @Override // java.lang.Runnable
                public final void run() {
                    FaceDownloadHelper.downloadFile$lambda$8(callback, e2);
                }
            });
            e2.printStackTrace();
        }
    }
}
