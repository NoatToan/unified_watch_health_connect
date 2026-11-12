package com.huami.sleepassistant.apilib.utils;

import android.content.Context;
import android.os.AsyncTask;
import android.os.PowerManager;
import com.facebook.appevents.UserDataStore;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.google.firebase.perf.network.FirebasePerfOkHttpClient;
import com.huami.sleepassistant.apilib.db.SleepAssistantDb;
import com.huami.sleepassistant.apilib.db.po.Music;
import com.huami.sleepassistant.apilib.utils.ext.VoToPoExKt;
import com.huami.sleepassistant.apilib.vo.MusicVo;
import com.huami.tools.analytics.DbUtils;
import com.huami.tools.log.HMLog;
import com.huami.watch.wififtp.FileManagerFragment;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.util.Objects;
import kotlin.Metadata;
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
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\b\n\u0002\u0010\u0011\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 &2\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00020\u0001:\u0001&B/\u0012\u0006\u0010\u001e\u001a\u00020\u001b\u0012\u0006\u0010\u000f\u001a\u00020\f\u0012\u0006\u0010\u0012\u001a\u00020\u0002\u0012\u0006\u0010\u0016\u001a\u00020\u0013\u0012\u0006\u0010\u001a\u001a\u00020\u0017¢\u0006\u0004\b$\u0010%J%\u0010\u0006\u001a\u0004\u0018\u00010\u00022\u0012\u0010\u0005\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00020\u0004\"\u00020\u0002H\u0014¢\u0006\u0004\b\u0006\u0010\u0007J\b\u0010\t\u001a\u00020\bH\u0014J\u0012\u0010\u000b\u001a\u00020\b2\b\u0010\n\u001a\u0004\u0018\u00010\u0002H\u0014R\u0016\u0010\u000f\u001a\u00020\f8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0016\u0010\u0012\u001a\u00020\u00028\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0016\u0010\u0016\u001a\u00020\u00138\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0016\u0010\u001a\u001a\u00020\u00178\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0016\u0010\u001e\u001a\u00020\u001b8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u001c\u0010#\u001a\b\u0018\u00010\u001fR\u00020 8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b!\u0010\"¨\u0006'"}, d2 = {"Lcom/huami/sleepassistant/apilib/utils/DownloadTask;", "Landroid/os/AsyncTask;", "", "", "", "sUrl", "doInBackground", "([Ljava/lang/String;)Ljava/lang/String;", "", "onPreExecute", "result", "onPostExecute", "Lcom/huami/sleepassistant/apilib/db/SleepAssistantDb;", "a", "Lcom/huami/sleepassistant/apilib/db/SleepAssistantDb;", UserDataStore.DATE_OF_BIRTH, "b", "Ljava/lang/String;", "baseDirSleepAssistantPath", "Lcom/huami/sleepassistant/apilib/vo/MusicVo;", "c", "Lcom/huami/sleepassistant/apilib/vo/MusicVo;", "item", "Lcom/huami/sleepassistant/apilib/utils/OnDownLoadStatusCallBack;", GoogleApiAvailabilityLight.a, "Lcom/huami/sleepassistant/apilib/utils/OnDownLoadStatusCallBack;", "mOnDownLoadStatusCallBack", "Landroid/content/Context;", "e", "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "Landroid/os/PowerManager$WakeLock;", "Landroid/os/PowerManager;", "f", "Landroid/os/PowerManager$WakeLock;", "mWakeLock", "<init>", "(Landroid/content/Context;Lcom/huami/sleepassistant/apilib/db/SleepAssistantDb;Ljava/lang/String;Lcom/huami/sleepassistant/apilib/vo/MusicVo;Lcom/huami/sleepassistant/apilib/utils/OnDownLoadStatusCallBack;)V", "Companion", "apilib_release"}, k = 1, mv = {1, 5, 1})
public final class DownloadTask extends AsyncTask<String, Integer, String> {

    @NotNull
    private static final String g = "DownloadTask";

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final SleepAssistantDb db;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final String baseDirSleepAssistantPath;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    private final MusicVo item;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    private final OnDownLoadStatusCallBack mOnDownLoadStatusCallBack;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @NotNull
    private final Context context;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
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

    public DownloadTask(@NotNull Context context, @NotNull SleepAssistantDb sleepAssistantDb, @NotNull String str, @NotNull MusicVo musicVo, @NotNull OnDownLoadStatusCallBack onDownLoadStatusCallBack) {
        this.db = sleepAssistantDb;
        this.baseDirSleepAssistantPath = str;
        this.item = musicVo;
        this.mOnDownLoadStatusCallBack = onDownLoadStatusCallBack;
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
            HMLog.error$default(g, null, e, a.a, 2, null);
        }
    }

    @Override // android.os.AsyncTask
    public void onPreExecute() {
        super.onPreExecute();
        Object systemService = this.context.getSystemService("power");
        Objects.requireNonNull(systemService, "null cannot be cast to non-null type android.os.PowerManager");
        PowerManager.WakeLock wakeLockNewWakeLock = ((PowerManager) systemService).newWakeLock(1, DownloadTask.class.getName());
        this.mWakeLock = wakeLockNewWakeLock;
        wakeLockNewWakeLock.acquire();
        this.mOnDownLoadStatusCallBack.startDown();
    }

    /* JADX WARN: Code duplicated, block: B:65:0x0116  */
    /* JADX WARN: Code duplicated, block: B:66:0x0117 A[Catch: IOException -> 0x011b, TRY_LEAVE, TryCatch #9 {IOException -> 0x011b, blocks: (B:63:0x0111, B:66:0x0117), top: B:102:0x0111 }] */
    /* JADX WARN: Code duplicated, block: B:81:0x0133  */
    /* JADX WARN: Code duplicated, block: B:82:0x0134 A[Catch: IOException -> 0x0138, TRY_LEAVE, TryCatch #1 {IOException -> 0x0138, blocks: (B:79:0x012e, B:82:0x0134), top: B:95:0x012e }] */
    @Override // android.os.AsyncTask
    @Nullable
    public String doInBackground(@NotNull String... sUrl) throws Throwable {
        Response responseExecute;
        InputStream inputStreamByteStream;
        Exception exc;
        ResponseBody responseBodyBody;
        ResponseBody responseBodyBody2;
        FileOutputStream fileOutputStream = null;
        try {
            responseExecute = FirebasePerfOkHttpClient.execute(new OkHttpClient.Builder().followRedirects(true).build().newCall(new Request.Builder().url(new URL(sUrl[0])).build()));
            try {
                if (!responseExecute.isSuccessful()) {
                    String strStringPlus = Intrinsics.stringPlus("Server returned HTTP ", responseExecute.message());
                    ResponseBody responseBodyBody3 = responseExecute.body();
                    if (responseBodyBody3 != null) {
                        responseBodyBody3.close();
                    }
                    return strStringPlus;
                }
                ResponseBody responseBodyBody4 = responseExecute.body();
                long j = 0;
                long jContentLength = responseBodyBody4 == null ? 0L : responseBodyBody4.contentLength();
                ResponseBody responseBodyBody5 = responseExecute.body();
                inputStreamByteStream = responseBodyBody5 == null ? null : responseBodyBody5.byteStream();
                try {
                    try {
                        FileOutputStream fileOutputStream2 = new FileOutputStream(this.baseDirSleepAssistantPath + this.item.getId() + FileManagerFragment.FILE_TYPE_MUSIC);
                        try {
                            byte[] bArr = new byte[4096];
                            int i = inputStreamByteStream.read(bArr);
                            long j2 = 0;
                            while (-1 != i) {
                                if (isCancelled()) {
                                    inputStreamByteStream.close();
                                    try {
                                        fileOutputStream2.close();
                                        inputStreamByteStream.close();
                                    } catch (IOException unused) {
                                    }
                                    ResponseBody responseBodyBody6 = responseExecute.body();
                                    if (responseBodyBody6 != null) {
                                        responseBodyBody6.close();
                                    }
                                    return null;
                                }
                                j2 += (long) i;
                                if (jContentLength > j) {
                                    Music music = VoToPoExKt.toMusic(this.item);
                                    music.setProgress((int) ((((long) 100) * j2) / jContentLength));
                                    this.db.sleepAssistantDao().updateMusicItem(music);
                                }
                                fileOutputStream2.write(bArr, 0, i);
                                i = inputStreamByteStream.read(bArr);
                                j = 0;
                            }
                            try {
                                fileOutputStream2.close();
                                inputStreamByteStream.close();
                            } catch (IOException unused2) {
                            }
                            ResponseBody responseBodyBody7 = responseExecute.body();
                            if (responseBodyBody7 != null) {
                                responseBodyBody7.close();
                            }
                            return null;
                        } catch (Exception e) {
                            exc = e;
                            fileOutputStream = fileOutputStream2;
                            HMLog.error$default(g, null, exc, b.a, 2, null);
                            String id = this.item.getId();
                            if (fileOutputStream != null) {
                                try {
                                    fileOutputStream.close();
                                    if (inputStreamByteStream == null) {
                                        inputStreamByteStream.close();
                                    }
                                } catch (IOException unused3) {
                                    if (responseExecute != null && (responseBodyBody2 = responseExecute.body()) != null) {
                                        responseBodyBody2.close();
                                    }
                                    return id;
                                }
                            } else if (inputStreamByteStream == null) {
                                inputStreamByteStream.close();
                            }
                            if (responseExecute != null) {
                                responseBodyBody2.close();
                            }
                            return id;
                        } catch (Throwable th) {
                            th = th;
                            fileOutputStream = fileOutputStream2;
                            if (fileOutputStream != null) {
                                try {
                                    fileOutputStream.close();
                                    if (inputStreamByteStream == null) {
                                        inputStreamByteStream.close();
                                    }
                                } catch (IOException unused4) {
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
                    } catch (Exception e2) {
                        exc = e2;
                    }
                } catch (Throwable th2) {
                    th = th2;
                }
            } catch (Exception e3) {
                exc = e3;
                inputStreamByteStream = null;
            } catch (Throwable th3) {
                th = th3;
                inputStreamByteStream = null;
            }
        } catch (Exception e4) {
            exc = e4;
            responseExecute = null;
            inputStreamByteStream = null;
        } catch (Throwable th4) {
            th = th4;
            responseExecute = null;
            inputStreamByteStream = null;
        }
    }

    @Override // android.os.AsyncTask
    public void onPostExecute(@Nullable String result) {
        this.mOnDownLoadStatusCallBack.endDown();
        this.mWakeLock.release();
        if (result != null) {
            new File(this.baseDirSleepAssistantPath + this.item.getId() + FileManagerFragment.FILE_TYPE_MUSIC).delete();
            this.mOnDownLoadStatusCallBack.downFail();
            return;
        }
        this.item.setPlayAddress(this.baseDirSleepAssistantPath + this.item.getId() + FileManagerFragment.FILE_TYPE_MUSIC);
        this.mOnDownLoadStatusCallBack.callback(this.item);
    }
}
