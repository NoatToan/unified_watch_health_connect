package com.xiaomi.fitness.feedback.util;

import com.miui.tsmclient.util.Constants;
import com.smarthome.core.modelconfig.PluginDeviceInfo;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.common.utils.FileUtils;
import com.xiaomi.fitness.feedback.util.UploadFileUtil;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.io.Writer;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u00052\b\u0010\u000b\u001a\u0004\u0018\u00010\u0005J\u0010\u0010\u000e\u001a\u00020\f2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010J\u0010\u0010\u0011\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0012\u001a\u00020\u0013J0\u0010\u0016\u001a\u00020\f2\u0006\u0010\u0017\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\u00052\u0006\u0010\u0019\u001a\u00020\u00052\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bJ(\u0010\u001c\u001a\u00020\f2\u0006\u0010\u0018\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\u00052\u0006\u0010\u0019\u001a\u00020\u00052\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bR\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\u00020\u0005X\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\t\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\bR\u000e\u0010\u0014\u001a\u00020\u0015X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u001d"}, d2 = {"Lcom/xiaomi/fitness/feedback/util/UploadFileUtil;", "", "<init>", "()V", "TAG", "", "LOG_DIR", "getLOG_DIR", "()Ljava/lang/String;", "feedBackDestDir", "getFeedBackDestDir", "uploadFile", "", "uploadUrl", Constants.EXTRA_CLOSE_TAI, "closeable", "Ljava/io/Closeable;", "getThrowableString", PluginDeviceInfo.FICONOFFLINE, "", "isZipUpLoading", "", "uploadLogFile", "isUploadFile", "objName", "logPath", "extraFile", "Ljava/io/File;", "zipLogAndUpload", "feedback_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nUploadFileUtil.kt\nKotlin\n*S Kotlin\n*F\n+ 1 UploadFileUtil.kt\ncom/xiaomi/fitness/feedback/util/UploadFileUtil\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,151:1\n1#2:152\n*E\n"})
public final class UploadFileUtil {

    @NotNull
    public static final String TAG = "UploadFileUtil";
    private static volatile boolean isZipUpLoading;

    @NotNull
    public static final UploadFileUtil INSTANCE = new UploadFileUtil();

    @NotNull
    private static final String LOG_DIR = "log";

    @NotNull
    private static final String feedBackDestDir = FileUtils.INSTANCE.getExternalFilesDirPath("log") + File.separator + "feedback";

    private UploadFileUtil() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void zipLogAndUpload$lambda$1(String logPath, String str, File file, String uploadUrl) throws Throwable {
        boolean zZipFolder;
        Intrinsics.checkNotNullParameter(logPath, "$logPath");
        Intrinsics.checkNotNullParameter(uploadUrl, "$uploadUrl");
        isZipUpLoading = true;
        try {
            zZipFolder = FeedbackFileUtils.INSTANCE.zipFolder(logPath, str, file);
            try {
                FileUtils.INSTANCE.deleteFileDir(feedBackDestDir);
            } catch (Exception e) {
                e = e;
                Logger.i(TAG, "zip log file exception " + e);
                e.printStackTrace();
            }
        } catch (Exception e2) {
            e = e2;
            zZipFolder = false;
        }
        if (zZipFolder) {
            Logger.i(TAG, "zip log file success");
            INSTANCE.uploadFile(uploadUrl, str);
            if (str != null) {
                FileUtils.INSTANCE.deleteFile(str);
            }
        } else {
            Logger.i(TAG, "zip log file error");
        }
        isZipUpLoading = false;
    }

    public final void close(@Nullable Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    @NotNull
    public final String getFeedBackDestDir() {
        return feedBackDestDir;
    }

    @NotNull
    public final String getLOG_DIR() {
        return LOG_DIR;
    }

    @Nullable
    public final String getThrowableString(@NotNull Throwable e) {
        Intrinsics.checkNotNullParameter(e, "e");
        try {
            StringWriter stringWriter = new StringWriter();
            PrintWriter printWriter = new PrintWriter((Writer) stringWriter, true);
            e.printStackTrace(printWriter);
            printWriter.flush();
            stringWriter.flush();
            return stringWriter.toString();
        } catch (Exception e2) {
            return e2.getMessage();
        }
    }

    public final void uploadFile(@Nullable String uploadUrl, @Nullable String uploadFile) throws Throwable {
        BufferedOutputStream bufferedOutputStream;
        BufferedOutputStream bufferedOutputStream2;
        URLConnection uRLConnection;
        URLConnection uRLConnectionOpenConnection;
        StringBuilder sb;
        StringBuilder sb2 = new StringBuilder("start upload file: ");
        sb2.append("uploadUrl:");
        sb2.append(uploadUrl);
        sb2.append("\n");
        sb2.append("uploadFile:");
        sb2.append(uploadFile);
        sb2.append("\n");
        Closeable closeable = null;
        try {
            try {
                File file = new File(uploadFile);
                Logger.i(TAG, "upload file is exists:" + file.exists());
                uRLConnectionOpenConnection = new URL(uploadUrl).openConnection();
                try {
                    uRLConnectionOpenConnection.setDoOutput(true);
                    uRLConnectionOpenConnection.setDoInput(true);
                    if (uRLConnectionOpenConnection instanceof HttpURLConnection) {
                        ((HttpURLConnection) uRLConnectionOpenConnection).setRequestMethod("PUT");
                        ((HttpURLConnection) uRLConnectionOpenConnection).setRequestProperty("Content-Type", "");
                        ((HttpURLConnection) uRLConnectionOpenConnection).connect();
                    }
                    bufferedOutputStream = new BufferedOutputStream(uRLConnectionOpenConnection.getOutputStream());
                    try {
                        BufferedInputStream bufferedInputStream = new BufferedInputStream(new FileInputStream(file));
                        try {
                            byte[] bArr = new byte[1024];
                            while (true) {
                                int i = bufferedInputStream.read(bArr);
                                if (i == -1) {
                                    break;
                                } else {
                                    bufferedOutputStream.write(bArr, 0, i);
                                }
                            }
                            bufferedOutputStream.flush();
                            HttpURLConnection httpURLConnection = (HttpURLConnection) uRLConnectionOpenConnection;
                            Intrinsics.checkNotNull(httpURLConnection);
                            String responseMessage = httpURLConnection.getResponseMessage();
                            sb2.append("response msg:");
                            sb2.append(responseMessage);
                            sb2.append("\n");
                            close(bufferedInputStream);
                            close(bufferedOutputStream);
                        } catch (Exception e) {
                            e = e;
                            closeable = bufferedInputStream;
                            Exception exc = e;
                            uRLConnection = uRLConnectionOpenConnection;
                            bufferedOutputStream2 = bufferedOutputStream;
                            e = exc;
                            try {
                                Logger.i(TAG, "uploadFile exception " + e);
                                e.printStackTrace();
                                close(closeable);
                                close(bufferedOutputStream2);
                                uRLConnectionOpenConnection = uRLConnection;
                            } catch (Throwable th) {
                                bufferedOutputStream = bufferedOutputStream2;
                                th = th;
                                close(closeable);
                                close(bufferedOutputStream);
                                throw th;
                            }
                        } catch (Throwable th2) {
                            th = th2;
                            closeable = bufferedInputStream;
                            close(closeable);
                            close(bufferedOutputStream);
                            throw th;
                        }
                    } catch (Exception e2) {
                        e = e2;
                    } catch (Throwable th3) {
                        th = th3;
                    }
                } catch (Exception e3) {
                    e = e3;
                    uRLConnection = uRLConnectionOpenConnection;
                    bufferedOutputStream2 = null;
                }
            } catch (Exception e4) {
                e = e4;
                bufferedOutputStream2 = null;
                uRLConnection = null;
            }
            try {
                HttpURLConnection httpURLConnection2 = (HttpURLConnection) uRLConnectionOpenConnection;
                Intrinsics.checkNotNull(httpURLConnection2);
                int responseCode = httpURLConnection2.getResponseCode();
                sb2.append("response code:");
                sb2.append(responseCode);
                Intrinsics.checkNotNull(uRLConnectionOpenConnection);
                ((HttpURLConnection) uRLConnectionOpenConnection).disconnect();
                sb = new StringBuilder();
            } catch (IOException e5) {
                e5.printStackTrace();
                sb2.append(getThrowableString(e5));
                sb = new StringBuilder();
            } finally {
                Logger.i(TAG, "uploadFile " + ((Object) sb2));
            }
            sb.append("uploadFile ");
            sb.append((Object) sb2);
            String string = sb.toString();
        } catch (Throwable th4) {
            th = th4;
            bufferedOutputStream = null;
        }
    }

    public final void uploadLogFile(boolean isUploadFile, @NotNull String objName, @NotNull String uploadUrl, @NotNull String logPath, @Nullable File extraFile) {
        Intrinsics.checkNotNullParameter(objName, "objName");
        Intrinsics.checkNotNullParameter(uploadUrl, "uploadUrl");
        Intrinsics.checkNotNullParameter(logPath, "logPath");
        boolean z = isZipUpLoading;
        String str = feedBackDestDir;
        Logger.i(TAG, "uploadLogFile isZipUpLoading " + z + ";isUploadFile " + isUploadFile + ";logPath " + logPath + ";feedBackDestDir " + str);
        if (isZipUpLoading) {
            return;
        }
        if (isUploadFile) {
            zipLogAndUpload(objName, uploadUrl, logPath, extraFile);
        } else if (str.length() > 0) {
            zipLogAndUpload(objName, uploadUrl, str, extraFile);
        }
    }

    public final void zipLogAndUpload(@NotNull String objName, @NotNull final String uploadUrl, @NotNull final String logPath, @Nullable final File extraFile) {
        Intrinsics.checkNotNullParameter(objName, "objName");
        Intrinsics.checkNotNullParameter(uploadUrl, "uploadUrl");
        Intrinsics.checkNotNullParameter(logPath, "logPath");
        final String externalFilesFile = FileUtils.INSTANCE.getExternalFilesFile(objName);
        Logger.i(TAG, "zipLogAndUpload logPath " + logPath + ";zipFilePath " + externalFilesFile + ";extraFile " + extraFile);
        ExecutorService executorServiceNewSingleThreadExecutor = Executors.newSingleThreadExecutor();
        Intrinsics.checkNotNull(executorServiceNewSingleThreadExecutor);
        executorServiceNewSingleThreadExecutor.execute(new Runnable() { // from class: xcq
            @Override // java.lang.Runnable
            public final void run() throws Throwable {
                UploadFileUtil.zipLogAndUpload$lambda$1(logPath, externalFilesFile, extraFile, uploadUrl);
            }
        });
    }
}
