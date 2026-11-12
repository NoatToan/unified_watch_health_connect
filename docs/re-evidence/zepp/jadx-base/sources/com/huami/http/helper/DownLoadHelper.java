package com.huami.http.helper;

import androidx.core.app.NotificationCompat;
import com.baidu.ocr.sdk.utils.LogUtil;
import com.google.firebase.perf.network.FirebasePerfOkHttpClient;
import com.huami.http.listener.DownLoadListener;
import com.huami.watch.companion.watchface.cloud.WatchFaceApi;
import io.flutter.embedding.android.FlutterActivityLaunchConfigs;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.TypeCastException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.Response;
import okhttp3.ResponseBody;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\u0018\u0000 \u00042\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/huami/http/helper/DownLoadHelper;", "", "<init>", "()V", "Companion", "httpkit_release"}, k = 1, mv = {1, 5, 1})
public final class DownLoadHelper {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    private static final int a = 2048;
    private static final int b = 100;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ(\u0010\b\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0016\u0010\u0007\u001a\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u0005\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0004H\u0002J<\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u000e0\r2\u0017\u0010\u000b\u001a\u0013\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00060\u0004¢\u0006\u0002\b\n2\u0006\u0010\f\u001a\u00020\u0005H\u0000¢\u0006\u0004\b\u000f\u0010\u0010J7\u0010\u0017\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0012\u001a\u00020\t2\u0006\u0010\u0013\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u00052\u0006\u0010\u0014\u001a\u00020\u0005H\u0000¢\u0006\u0004\b\u0015\u0010\u0016R\u0016\u0010\u0019\u001a\u00020\u00188\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0016\u0010\u001b\u001a\u00020\u00188\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001b\u0010\u001a¨\u0006\u001e"}, d2 = {"Lcom/huami/http/helper/DownLoadHelper$Companion;", "", "Lokhttp3/Call;", NotificationCompat.CATEGORY_CALL, "Lkotlin/Function1;", "", "", "onDownloadEnd", "a", "Lcom/huami/http/listener/DownLoadListener;", "Lkotlin/ExtensionFunctionType;", WatchFaceApi.SORT_DOWNLOAD, "savePath", "Lkotlin/Pair;", "Ljava/io/File;", "initDownload$httpkit_release", "(Lkotlin/jvm/functions/Function1;Ljava/lang/String;)Lkotlin/Pair;", "initDownload", "downloadListener", "file", "url", "downLoadTaskEnqueue$httpkit_release", "(Lokhttp3/Call;Lcom/huami/http/listener/DownLoadListener;Ljava/io/File;Ljava/lang/String;Ljava/lang/String;)V", "downLoadTaskEnqueue", "", "byteArraySize", LogUtil.I, "hundred", "<init>", "()V", "httpkit_release"}, k = 1, mv = {1, 5, 1})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void a(Call call, Function1<? super String, Unit> onDownloadEnd) {
            if (onDownloadEnd != null) {
                onDownloadEnd.invoke(null);
            }
            call.cancel();
        }

        public final void downLoadTaskEnqueue$httpkit_release(@NotNull Call call, @NotNull final DownLoadListener downloadListener, @NotNull final File file, @NotNull final String savePath, @NotNull final String url) {
            FirebasePerfOkHttpClient.enqueue(call, new Callback() { // from class: com.huami.http.helper.DownLoadHelper$Companion$downLoadTaskEnqueue$1
                @Override // okhttp3.Callback
                public void onFailure(@NotNull Call call2, @NotNull IOException e) {
                    Function1<Throwable, Unit> failed$httpkit_release = downloadListener.getFailed$httpkit_release();
                    if (failed$httpkit_release == null) {
                        return;
                    }
                    failed$httpkit_release.invoke(e);
                }

                /* JADX WARN: Code duplicated, block: B:58:0x0109  */
                /* JADX WARN: Code duplicated, block: B:61:0x0110  */
                /* JADX WARN: Code duplicated, block: B:65:0x0121  */
                /* JADX WARN: Code duplicated, block: B:68:0x0127  */
                /* JADX WARN: Code duplicated, block: B:82:? A[RETURN, SYNTHETIC] */
                @Override // okhttp3.Callback
                public void onResponse(@NotNull Call call2, @NotNull Response response) throws IOException {
                    FileOutputStream fileOutputStream;
                    InputStream inputStreamByteStream;
                    Object objM3845constructorimpl;
                    FileOutputStream fileOutputStream2;
                    DownLoadListener downLoadListener;
                    Throwable thM3848exceptionOrNullimpl;
                    Function1<Throwable, Unit> failed$httpkit_release;
                    Unit unit;
                    Function1<Integer, Unit> progress$httpkit_release;
                    if (!response.isSuccessful()) {
                        IllegalStateException illegalStateException = new IllegalStateException("Response状态码异常：" + response.code() + "，非[200-300]");
                        Function1<Throwable, Unit> failed$httpkit_release2 = downloadListener.getFailed$httpkit_release();
                        if (failed$httpkit_release2 == null) {
                            return;
                        }
                        failed$httpkit_release2.invoke(illegalStateException);
                        return;
                    }
                    byte[] bArr = new byte[2048];
                    File file2 = file;
                    String str = savePath;
                    String str2 = url;
                    DownLoadListener downLoadListener2 = downloadListener;
                    try {
                        Result.Companion companion = Result.Companion;
                        if (!file2.mkdir()) {
                            file2.createNewFile();
                        }
                        ResponseBody responseBodyBody = response.body();
                        if (responseBodyBody == null) {
                            Intrinsics.throwNpe();
                        }
                        inputStreamByteStream = responseBodyBody.byteStream();
                        try {
                            ResponseBody responseBodyBody2 = response.body();
                            if (responseBodyBody2 == null) {
                                Intrinsics.throwNpe();
                            }
                            long jContentLength = responseBodyBody2.contentLength();
                            int iLastIndexOf$default = StringsKt__StringsKt.lastIndexOf$default((CharSequence) str2, FlutterActivityLaunchConfigs.DEFAULT_INITIAL_ROUTE, 0, false, 6, (Object) null) + 1;
                            if (str2 == null) {
                                throw new TypeCastException("null cannot be cast to non-null type java.lang.String");
                            }
                            File file3 = new File(str, str2.substring(iLastIndexOf$default));
                            long j = 0;
                            ResponseBody responseBodyBody3 = response.body();
                            if (responseBodyBody3 == null) {
                                Intrinsics.throwNpe();
                            }
                            InputStream inputStreamByteStream2 = responseBodyBody3.byteStream();
                            try {
                                fileOutputStream2 = new FileOutputStream(file3);
                                int i = 0;
                                while (true) {
                                    if (inputStreamByteStream2 == null) {
                                        try {
                                            Intrinsics.throwNpe();
                                        } catch (Throwable th) {
                                            th = th;
                                            inputStreamByteStream = inputStreamByteStream2;
                                            fileOutputStream = fileOutputStream2;
                                            Result.Companion companion2 = Result.Companion;
                                            objM3845constructorimpl = Result.m3845constructorimpl(ResultKt.createFailure(th));
                                            fileOutputStream2 = fileOutputStream;
                                            inputStreamByteStream2 = inputStreamByteStream;
                                        }
                                    }
                                    int i2 = inputStreamByteStream2.read(bArr);
                                    if (i2 == -1) {
                                        break;
                                    }
                                    fileOutputStream2.write(bArr, 0, i2);
                                    j += (long) i2;
                                    int i3 = (int) (((j * 1.0f) / jContentLength) * 100);
                                    if (i3 != i && (progress$httpkit_release = downLoadListener2.getProgress$httpkit_release()) != null) {
                                        progress$httpkit_release.invoke(Integer.valueOf(i3));
                                    }
                                    i = i3;
                                }
                                fileOutputStream2.flush();
                                Function1<String, Unit> completed$httpkit_release = downLoadListener2.getCompleted$httpkit_release();
                                if (completed$httpkit_release == null) {
                                    unit = null;
                                } else {
                                    completed$httpkit_release.invoke(file2.getAbsolutePath());
                                    unit = Unit.INSTANCE;
                                }
                                objM3845constructorimpl = Result.m3845constructorimpl(unit);
                            } catch (Throwable th2) {
                                th = th2;
                                inputStreamByteStream = inputStreamByteStream2;
                                fileOutputStream = null;
                                Result.Companion companion3 = Result.Companion;
                                objM3845constructorimpl = Result.m3845constructorimpl(ResultKt.createFailure(th));
                                fileOutputStream2 = fileOutputStream;
                                inputStreamByteStream2 = inputStreamByteStream;
                                downLoadListener = downloadListener;
                                thM3848exceptionOrNullimpl = Result.m3848exceptionOrNullimpl(objM3845constructorimpl);
                                if (thM3848exceptionOrNullimpl != null) {
                                    failed$httpkit_release = downLoadListener.getFailed$httpkit_release();
                                    if (failed$httpkit_release != null) {
                                        failed$httpkit_release.invoke(thM3848exceptionOrNullimpl);
                                    }
                                    DownLoadHelper.INSTANCE.a(call2, downLoadListener.getCompleted$httpkit_release());
                                }
                                if (inputStreamByteStream2 != null) {
                                    inputStreamByteStream2.close();
                                }
                                if (fileOutputStream2 == null) {
                                    return;
                                }
                                fileOutputStream2.close();
                            }
                            downLoadListener = downloadListener;
                            thM3848exceptionOrNullimpl = Result.m3848exceptionOrNullimpl(objM3845constructorimpl);
                            if (thM3848exceptionOrNullimpl != null) {
                                failed$httpkit_release = downLoadListener.getFailed$httpkit_release();
                                if (failed$httpkit_release != null) {
                                    failed$httpkit_release.invoke(thM3848exceptionOrNullimpl);
                                }
                                DownLoadHelper.INSTANCE.a(call2, downLoadListener.getCompleted$httpkit_release());
                            }
                            if (inputStreamByteStream2 != null) {
                                inputStreamByteStream2.close();
                            }
                            if (fileOutputStream2 == null) {
                                return;
                            }
                            fileOutputStream2.close();
                        } catch (Throwable th3) {
                            th = th3;
                        }
                    } catch (Throwable th4) {
                        th = th4;
                        fileOutputStream = null;
                        inputStreamByteStream = null;
                    }
                }
            });
        }

        @NotNull
        public final Pair<DownLoadListener, File> initDownload$httpkit_release(@NotNull Function1<? super DownLoadListener, Unit> download, @NotNull String savePath) {
            DownLoadListener downLoadListener = new DownLoadListener();
            download.invoke(downLoadListener);
            File file = new File(savePath);
            Function0<Unit> started$httpkit_release = downLoadListener.getStarted$httpkit_release();
            if (started$httpkit_release != null) {
                started$httpkit_release.invoke();
            }
            return new Pair<>(downLoadListener, file);
        }
    }
}
