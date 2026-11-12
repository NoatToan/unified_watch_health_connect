package com.xiaomi.hm.health.device.earbud.service;

import com.google.firebase.perf.network.FirebasePerfUrlConnection;
import com.huami.devicex.funapi.DeviceXFunctionsKt;
import com.huami.tools.log.HMLog;
import com.xiaomi.hm.health.baseutil.MD5Util;
import java.io.File;
import java.io.FileOutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import kotlin.Metadata;
import kotlin.io.ByteStreamsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0007\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\r\u0010\u000eJ\b\u0010\u0003\u001a\u00020\u0002H\u0002J\u0010\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0002J\u0010\u0010\u0007\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0005\u001a\u00020\u0004J\u0017\u0010\t\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\t\u0010\nR\u0016\u0010\f\u001a\u00020\u00048\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u000b¨\u0006\u000f"}, d2 = {"Lcom/xiaomi/hm/health/device/earbud/service/MusicFileUtil;", "", "Ljava/io/File;", "a", "", "url", "b", "getDestFile", "", "getDestFileSize", "(Ljava/lang/String;)Ljava/lang/Integer;", "Ljava/lang/String;", "TAG", "<init>", "()V", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
public final class MusicFileUtil {

    @NotNull
    public static final MusicFileUtil INSTANCE = new MusicFileUtil();

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private static final String TAG = "MusicFileUtil";

    private MusicFileUtil() {
    }

    private final File a() {
        return new File(DeviceXFunctionsKt.getContext().getFilesDir(), "earbudMusic");
    }

    private final File b(String url) {
        String mD5String = MD5Util.getMD5String(url);
        return new File(a(), mD5String + ".temp");
    }

    /* JADX WARN: Code duplicated, block: B:60:0x00af A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Nullable
    public final File getDestFile(@NotNull String url) throws Throwable {
        FileOutputStream fileOutputStream;
        File file = new File(a(), MD5Util.getMD5String(url));
        if (file.exists()) {
            return file;
        }
        FileOutputStream fileOutputStream2 = null;
        try {
            File fileA = a();
            if (!fileA.exists()) {
                fileA.mkdirs();
            }
            File fileB = b(url);
            if (fileB.exists()) {
                fileB.delete();
                fileB.createNewFile();
            }
            HttpURLConnection httpURLConnection = (HttpURLConnection) ((URLConnection) FirebasePerfUrlConnection.instrument(new URL(url).openConnection()));
            if (httpURLConnection != null) {
                fileOutputStream = new FileOutputStream(fileB);
                try {
                    try {
                        httpURLConnection.setConnectTimeout(5000);
                        httpURLConnection.setDoInput(true);
                        if (200 == httpURLConnection.getResponseCode()) {
                            ByteStreamsKt.copyTo$default(httpURLConnection.getInputStream(), fileOutputStream, 0, 2, null);
                            fileB.renameTo(file);
                        } else {
                            file = null;
                        }
                        fileOutputStream2 = fileOutputStream;
                    } catch (Exception e) {
                        e = e;
                        HMLog.e(TAG, "download " + url + " error", e);
                        if (fileOutputStream == null) {
                            return null;
                        }
                        try {
                            fileOutputStream.close();
                            return null;
                        } catch (Exception e2) {
                            e2.printStackTrace();
                            return null;
                        }
                    }
                } catch (Throwable th) {
                    th = th;
                    fileOutputStream2 = fileOutputStream;
                    if (fileOutputStream2 != null) {
                        try {
                            fileOutputStream2.close();
                        } catch (Exception e3) {
                            e3.printStackTrace();
                        }
                    }
                    throw th;
                }
            } else {
                file = null;
            }
            if (fileOutputStream2 != null) {
                try {
                    fileOutputStream2.close();
                } catch (Exception e4) {
                    e4.printStackTrace();
                }
            }
            return file;
        } catch (Exception e5) {
            e = e5;
            fileOutputStream = null;
        } catch (Throwable th2) {
            th = th2;
            if (fileOutputStream2 != null) {
                fileOutputStream2.close();
            }
            throw th;
        }
    }

    @Nullable
    public final Integer getDestFileSize(@NotNull String url) throws Throwable {
        File destFile = getDestFile(url);
        if (destFile == null) {
            return null;
        }
        return Integer.valueOf((int) (destFile.length() / ((long) 1024)));
    }
}
