package com.huami.sleepassistant.apilib.utils;

import android.content.Context;
import android.os.AsyncTask;
import android.os.PowerManager;
import com.baidu.ocr.sdk.utils.LogUtil;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.google.firebase.perf.network.FirebasePerfOkHttpClient;
import com.huami.tools.analytics.DbUtils;
import com.huami.tools.log.HMLog;
import com.huami.watch.wififtp.FileManagerFragment;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.util.Arrays;
import java.util.Objects;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.ResponseBody;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\b\n\u0002\u0010\u0011\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 $2\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00020\u0001:\u0001$B'\u0012\u0006\u0010\u001c\u001a\u00020\u0019\u0012\u0006\u0010\u0011\u001a\u00020\u0002\u0012\u0006\u0010\u0015\u001a\u00020\u0012\u0012\u0006\u0010\u0018\u001a\u00020\u0003¢\u0006\u0004\b\"\u0010#J%\u0010\u0006\u001a\u0004\u0018\u00010\u00022\u0012\u0010\u0005\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00020\u0004\"\u00020\u0002H\u0014¢\u0006\u0004\b\u0006\u0010\u0007J\b\u0010\t\u001a\u00020\bH\u0014J'\u0010\u000b\u001a\u00020\b2\u0016\u0010\n\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00030\u0004\"\u0004\u0018\u00010\u0003H\u0014¢\u0006\u0004\b\u000b\u0010\fJ\u0012\u0010\u000e\u001a\u00020\b2\b\u0010\r\u001a\u0004\u0018\u00010\u0002H\u0014R\u0016\u0010\u0011\u001a\u00020\u00028\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0016\u0010\u0015\u001a\u00020\u00128\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0018\u001a\u00020\u00038\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0016\u0010\u001c\u001a\u00020\u00198\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u001c\u0010!\u001a\b\u0018\u00010\u001dR\u00020\u001e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001f\u0010 ¨\u0006%"}, d2 = {"Lcom/huami/sleepassistant/apilib/utils/DownloadResourceTask;", "Landroid/os/AsyncTask;", "", "", "", "sUrl", "doInBackground", "([Ljava/lang/String;)Ljava/lang/String;", "", "onPreExecute", "progress", "onProgressUpdate", "([Ljava/lang/Integer;)V", "result", "onPostExecute", "a", "Ljava/lang/String;", "baseDirSleepAssistantPath", "Lcom/huami/sleepassistant/apilib/utils/OnDownLoadResourceStatusCallBack;", "b", "Lcom/huami/sleepassistant/apilib/utils/OnDownLoadResourceStatusCallBack;", "mOnDownLoadStatusCallBack", "c", LogUtil.I, "position", "Landroid/content/Context;", GoogleApiAvailabilityLight.a, "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "Landroid/os/PowerManager$WakeLock;", "Landroid/os/PowerManager;", "e", "Landroid/os/PowerManager$WakeLock;", "mWakeLock", "<init>", "(Landroid/content/Context;Ljava/lang/String;Lcom/huami/sleepassistant/apilib/utils/OnDownLoadResourceStatusCallBack;I)V", "Companion", "apilib_release"}, k = 1, mv = {1, 5, 1})
public final class DownloadResourceTask extends AsyncTask<String, Integer, String> {

    @NotNull
    private static final String f = "DownloadResourceTask";

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final String baseDirSleepAssistantPath;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final OnDownLoadResourceStatusCallBack mOnDownLoadStatusCallBack;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final int position;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    private final Context context;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @Nullable
    private PowerManager.WakeLock mWakeLock;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function0<String> {
        public static final a a = new a();

        public a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "创建文件失败";
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class b extends Lambda implements Function0<String> {
        public static final b a = new b();

        public b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "下载失败";
        }
    }

    public DownloadResourceTask(@NotNull Context context, @NotNull String str, @NotNull OnDownLoadResourceStatusCallBack onDownLoadResourceStatusCallBack, int i) {
        this.baseDirSleepAssistantPath = str;
        this.mOnDownLoadStatusCallBack = onDownLoadResourceStatusCallBack;
        this.position = i;
        this.context = context.getApplicationContext();
        File file = new File(str);
        File file2 = new File(MediaFileUtils.INSTANCE.getBaseDirSleepAssistantPath());
        if (!file2.exists()) {
            file2.mkdirs();
        }
        if (file.exists()) {
            return;
        }
        try {
            file.createNewFile();
        } catch (IOException e) {
            e.printStackTrace();
            HMLog.error$default(f, null, e, a.a, 2, null);
        }
    }

    @Override // android.os.AsyncTask
    public void onPreExecute() {
        super.onPreExecute();
        Object systemService = this.context.getSystemService("power");
        Objects.requireNonNull(systemService, "null cannot be cast to non-null type android.os.PowerManager");
        PowerManager.WakeLock wakeLockNewWakeLock = ((PowerManager) systemService).newWakeLock(1, DownloadResourceTask.class.getName());
        this.mWakeLock = wakeLockNewWakeLock;
        wakeLockNewWakeLock.acquire();
        this.mOnDownLoadStatusCallBack.startDown();
    }

    /* JADX WARN: Code duplicated, block: B:105:0x0143 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:124:? A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:75:0x012b  */
    /* JADX WARN: Code duplicated, block: B:76:0x012c A[Catch: IOException -> 0x0130, TRY_LEAVE, TryCatch #4 {IOException -> 0x0130, blocks: (B:73:0x0126, B:76:0x012c), top: B:103:0x0126 }] */
    /* JADX WARN: Code duplicated, block: B:90:0x0146 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:91:0x0148  */
    /* JADX WARN: Code duplicated, block: B:92:0x0149 A[Catch: IOException -> 0x014d, TRY_LEAVE, TryCatch #5 {IOException -> 0x014d, blocks: (B:89:0x0143, B:92:0x0149), top: B:105:0x0143 }] */
    /* JADX WARN: Code duplicated, block: B:96:0x0150  */
    @Override // android.os.AsyncTask
    @Nullable
    public String doInBackground(@NotNull String... sUrl) throws Throwable {
        Response responseExecute;
        InputStream inputStreamByteStream;
        ResponseBody responseBodyBody;
        ResponseBody responseBodyBody2;
        FileOutputStream fileOutputStream = null;
        String str = null;
        fileOutputStream = null;
        fileOutputStream = null;
        fileOutputStream = null;
        fileOutputStream = null;
        fileOutputStream = null;
        try {
            responseExecute = FirebasePerfOkHttpClient.execute(new OkHttpClient.Builder().followRedirects(true).build().newCall(new Request.Builder().url(new URL(sUrl[0])).build()));
            try {
                if (responseExecute.isSuccessful()) {
                    ResponseBody responseBodyBody3 = responseExecute.body();
                    long j = 0;
                    long jContentLength = responseBodyBody3 == null ? 0L : responseBodyBody3.contentLength();
                    ResponseBody responseBodyBody4 = responseExecute.body();
                    inputStreamByteStream = responseBodyBody4 == null ? null : responseBodyBody4.byteStream();
                    try {
                        FileOutputStream fileOutputStream2 = new FileOutputStream(this.baseDirSleepAssistantPath + sUrl[1] + FileManagerFragment.FILE_TYPE_MUSIC);
                        try {
                            byte[] bArr = new byte[4096];
                            int i = inputStreamByteStream.read(bArr);
                            long j2 = 0;
                            while (i != -1) {
                                if (isCancelled()) {
                                    inputStreamByteStream.close();
                                    try {
                                        fileOutputStream2.close();
                                        inputStreamByteStream.close();
                                    } catch (IOException unused) {
                                    }
                                    ResponseBody responseBodyBody5 = responseExecute.body();
                                    if (responseBodyBody5 != null) {
                                        responseBodyBody5.close();
                                    }
                                    return str;
                                }
                                j2 += (long) i;
                                if (jContentLength > j) {
                                    publishProgress(Integer.valueOf((int) ((((long) 100) * j2) / jContentLength)), Integer.valueOf(this.position));
                                }
                                fileOutputStream2.write(bArr, 0, i);
                                i = inputStreamByteStream.read(bArr);
                                str = null;
                                j = 0;
                            }
                            try {
                                fileOutputStream2.close();
                                inputStreamByteStream.close();
                            } catch (IOException unused2) {
                            }
                            ResponseBody responseBodyBody6 = responseExecute.body();
                            if (responseBodyBody6 == null) {
                                return null;
                            }
                            responseBodyBody6.close();
                            return null;
                        } catch (Exception e) {
                            e = e;
                            fileOutputStream = fileOutputStream2;
                        } catch (Throwable th) {
                            th = th;
                            fileOutputStream = fileOutputStream2;
                            if (fileOutputStream != null) {
                                fileOutputStream.close();
                                if (inputStreamByteStream == null) {
                                    inputStreamByteStream.close();
                                }
                            } else if (inputStreamByteStream == null) {
                                inputStreamByteStream.close();
                            }
                            if (responseExecute != null) {
                                throw th;
                            }
                            throw th;
                        }
                    } catch (Exception e2) {
                        e = e2;
                    } catch (Throwable th2) {
                        th = th2;
                    }
                } else {
                    try {
                        String strStringPlus = Intrinsics.stringPlus("Server returned HTTP ", responseExecute.message());
                        ResponseBody responseBodyBody7 = responseExecute.body();
                        if (responseBodyBody7 != null) {
                            responseBodyBody7.close();
                        }
                        return strStringPlus;
                    } catch (Exception e3) {
                        e = e3;
                    } catch (Throwable th3) {
                        th = th3;
                        inputStreamByteStream = null;
                        if (fileOutputStream != null) {
                            try {
                                fileOutputStream.close();
                                if (inputStreamByteStream == null) {
                                    inputStreamByteStream.close();
                                }
                            } catch (IOException unused3) {
                                if (responseExecute != null || (responseBodyBody = responseExecute.body()) == null) {
                                    throw th;
                                }
                                responseBodyBody.close();
                                throw th;
                            }
                        } else if (inputStreamByteStream == null) {
                            inputStreamByteStream.close();
                        }
                        if (responseExecute != null) {
                            throw th;
                        }
                        throw th;
                    }
                }
            } catch (Exception e4) {
                e = e4;
            } catch (Throwable th4) {
                th = th4;
            }
            inputStreamByteStream = null;
        } catch (Exception e5) {
            e = e5;
            responseExecute = null;
            inputStreamByteStream = null;
        } catch (Throwable th5) {
            th = th5;
            responseExecute = null;
            inputStreamByteStream = null;
        }
        try {
            HMLog.error$default(f, null, e, b.a, 2, null);
            e.toString();
            e.printStackTrace();
            String str2 = sUrl[1];
            if (fileOutputStream != null) {
                try {
                    fileOutputStream.close();
                    if (inputStreamByteStream == null) {
                        inputStreamByteStream.close();
                    }
                } catch (IOException unused4) {
                }
            } else if (inputStreamByteStream == null) {
                inputStreamByteStream.close();
            }
            if (responseExecute != null && (responseBodyBody2 = responseExecute.body()) != null) {
                responseBodyBody2.close();
            }
            return str2;
        } catch (Throwable th6) {
            th = th6;
            if (fileOutputStream != null) {
                fileOutputStream.close();
                if (inputStreamByteStream == null) {
                    inputStreamByteStream.close();
                }
            } else if (inputStreamByteStream == null) {
                inputStreamByteStream.close();
            }
            if (responseExecute != null) {
                throw th;
            }
            throw th;
        }
    }

    @Override // android.os.AsyncTask
    public void onPostExecute(@Nullable String result) {
        this.mOnDownLoadStatusCallBack.endDown();
        this.mWakeLock.release();
        if (result == null) {
            this.mOnDownLoadStatusCallBack.callback("1");
            return;
        }
        new File(this.baseDirSleepAssistantPath + ((Object) result) + FileManagerFragment.FILE_TYPE_MUSIC).delete();
        this.mOnDownLoadStatusCallBack.downFail();
    }

    @Override // android.os.AsyncTask
    public void onProgressUpdate(@NotNull Integer... progress) {
        super.onProgressUpdate(Arrays.copyOf(progress, progress.length));
        synchronized (DownloadResourceTask.class) {
            this.mOnDownLoadStatusCallBack.downProgress((Integer[]) Arrays.copyOf(progress, progress.length));
            Unit unit = Unit.INSTANCE;
        }
    }
}
