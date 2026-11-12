package defpackage;

import android.os.Environment;
import android.text.TextUtils;
import com.google.gson.JsonSyntaxException;
import com.huawei.haf.application.BaseApplication;
import com.huawei.haf.common.exception.ExceptionUtils;
import com.huawei.haf.common.security.SecurityUtils;
import com.huawei.haf.common.utils.HexUtils;
import com.huawei.networkclient.cache.ICacheStrategy;
import com.huawei.networkclient.repository.DataConverterRepository;
import health.compact.a.HealthWhiteBoxManager;
import health.compact.a.LogUtil;
import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import okio.BufferedSink;
import okio.BufferedSource;
import okio.Okio;

/* JADX INFO: loaded from: classes3.dex */
public class ofj {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private volatile ofi f44287a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private DataConverterRepository f44288b;
    private boolean d = false;

    public static boolean b(int i) {
        return (i & 4) != 0;
    }

    public static boolean d(int i) {
        return (i & 2) != 0;
    }

    public static boolean e(int i) {
        return (i & 1) != 0;
    }

    public static File d(String str) {
        File file;
        try {
            if (!"mounted".equals(Environment.getExternalStorageState())) {
                LogUtil.d("CacheCommon", "getDiskCacheDir externalStorage not available");
                file = null;
            } else {
                file = new File(Environment.getExternalStorageDirectory() + "/Android/data/" + BaseApplication.b().getPackageName() + "/cache");
                if (!file.exists() && !file.mkdirs()) {
                    file = BaseApplication.b().getExternalCacheDir();
                }
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            LogUtil.d("CacheCommon", "getDiskCacheDir exception=", ExceptionUtils.c(e));
        }
        if (file == null) {
            LogUtil.d("CacheCommon", "getDiskCacheDir cacheFile is null");
            file = new File(BaseApplication.b().getDataDir(), "cache");
            if (!file.exists()) {
                file = BaseApplication.b().getCacheDir();
            }
        }
        File file2 = new File(file.getPath() + File.separator + str);
        if (!file2.exists() && !file2.mkdirs()) {
            LogUtil.e("CacheCommon", "getDiskCacheDir ", "mkdirs error");
        }
        return file2;
    }

    public static String d(String str, String str2, String str3) {
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(str2);
        if (!TextUtils.isEmpty(str3)) {
            sb.append(str3);
        }
        return HexUtils.c(SecurityUtils.a(sb.toString())).toLowerCase();
    }

    public ofj(String str, DataConverterRepository dataConverterRepository) {
        this.f44287a = ofi.c(ofk.b(), d(str), BaseApplication.c(), 2, 10485760L);
        this.f44288b = dataConverterRepository;
    }

    public boolean a(String str, ICacheStrategy iCacheStrategy, String str2) {
        boolean z;
        synchronized (this) {
            try {
                if (c(str, iCacheStrategy)) {
                    return false;
                }
                LogUtil.b("CacheCommon", "start saveDiskCache");
                long millis = iCacheStrategy.getDiskTimeUnit().toMillis(iCacheStrategy.getDiskTimeOut().longValue());
                long jCurrentTimeMillis = System.currentTimeMillis();
                if (this.f44287a.c()) {
                    LogUtil.b("CacheCommon", "saveDiskCache: healthDiskLruCache is closed, no need to save..");
                    return false;
                }
                ofi.d dVar = null;
                try {
                    try {
                        ofi.d dVarA = this.f44287a.a(str);
                        if (dVarA == null) {
                            LogUtil.d("CacheCommon", "healthDiskLruCache not ready for edit");
                            if (dVarA != null) {
                                try {
                                    dVarA.c();
                                } catch (IOException e) {
                                    LogUtil.d("CacheCommon", "commit or flush fail:", ExceptionUtils.c(e));
                                }
                            }
                            this.f44287a.flush();
                            return false;
                        }
                        BufferedSink bufferedSinkBuffer = Okio.buffer(dVarA.c(1));
                        bufferedSinkBuffer.writeLong(millis + jCurrentTimeMillis);
                        bufferedSinkBuffer.flush();
                        BufferedSink bufferedSinkBuffer2 = Okio.buffer(dVarA.c(0));
                        if (iCacheStrategy.needEncrypt()) {
                            bufferedSinkBuffer2.writeString(new String(HealthWhiteBoxManager.c(BaseApplication.b()).d(str2), StandardCharsets.UTF_8), StandardCharsets.UTF_8);
                        } else {
                            bufferedSinkBuffer2.writeString(str2, StandardCharsets.UTF_8);
                        }
                        bufferedSinkBuffer2.flush();
                        if (dVarA != null) {
                            try {
                                dVarA.c();
                            } catch (IOException e2) {
                                LogUtil.d("CacheCommon", "commit or flush fail:", ExceptionUtils.c(e2));
                                z = false;
                            }
                        }
                        this.f44287a.flush();
                        z = true;
                        LogUtil.d("CacheCommon", "end saveDiskCache");
                        return z;
                    } catch (Throwable th) {
                        if (0 != 0) {
                            try {
                                dVar.c();
                            } catch (IOException e3) {
                                LogUtil.d("CacheCommon", "commit or flush fail:", ExceptionUtils.c(e3));
                                throw th;
                            }
                        }
                        this.f44287a.flush();
                        throw th;
                    }
                } catch (IOException e4) {
                    LogUtil.d("CacheCommon", "saveDiskCache fail:", ExceptionUtils.c(e4));
                    if (0 != 0) {
                        try {
                            dVar.c();
                        } catch (IOException e5) {
                            LogUtil.d("CacheCommon", "commit or flush fail:", ExceptionUtils.c(e5));
                            z = false;
                        }
                    }
                    this.f44287a.flush();
                }
                throw th;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    private boolean c(String str, ICacheStrategy iCacheStrategy) {
        if (this.d) {
            LogUtil.d("CacheCommon", "cache dir is deleted, saveDiskCache fail");
            return true;
        }
        if (TextUtils.isEmpty(str)) {
            LogUtil.d("CacheCommon", "saveDiskCache key is null");
            return true;
        }
        if (iCacheStrategy.getDiskTimeOut() != null && iCacheStrategy.getDiskTimeUnit() != null) {
            return false;
        }
        LogUtil.d("CacheCommon", "empty disk timeout, fail to save to disk");
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:44:0x00ca A[PHI: r1 r5
      0x00ca: PHI (r1v3 java.lang.AutoCloseable) = (r1v0 java.lang.AutoCloseable), (r1v0 java.lang.AutoCloseable), (r1v5 java.lang.AutoCloseable) binds: [B:43:0x00c8, B:39:0x00b6, B:27:0x009a] A[DONT_GENERATE, DONT_INLINE]
      0x00ca: PHI (r5v5 ofi$e) = (r5v3 ofi$e), (r5v4 ofi$e), (r5v7 ofi$e) binds: [B:43:0x00c8, B:39:0x00b6, B:27:0x009a] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:50:0x00db  */
    /* JADX WARN: Not initialized variable reg: 5, insn: 0x00d8: MOVE (r1 I:??[OBJECT, ARRAY]) = (r5 I:??[OBJECT, ARRAY]), block:B:48:0x00d8 */
    public <Data> Data d(String str, Class<Data> cls, ICacheStrategy iCacheStrategy) {
        ofi.e eVarB;
        AutoCloseable autoCloseable;
        AutoCloseable autoCloseable2 = (Data) null;
        if (e(str)) {
            return null;
        }
        LogUtil.b("CacheCommon", "start getDiskCache");
        try {
            try {
                eVarB = this.f44287a.b(str);
                try {
                    if (eVarB == null) {
                        LogUtil.e("CacheCommon", "no hitDiskCache");
                        if (eVarB != null) {
                            eVarB.close();
                        }
                        return null;
                    }
                    if (Okio.buffer(eVarB.e(1)).readLong() >= System.currentTimeMillis()) {
                        BufferedSource bufferedSourceBuffer = Okio.buffer(eVarB.e(0));
                        autoCloseable2 = (Data) this.f44288b.d(cls).convert(iCacheStrategy.needEncrypt() ? new String(HealthWhiteBoxManager.c(BaseApplication.b()).a(bufferedSourceBuffer.readByteArray()), StandardCharsets.UTF_8) : bufferedSourceBuffer.readUtf8(), cls);
                        if (eVarB != null) {
                            eVarB.close();
                        }
                        LogUtil.b("CacheCommon", "end getDiskCache");
                        return (Data) autoCloseable2;
                    }
                    LogUtil.e("CacheCommon", "hit timeout diskCache");
                    if (eVarB != null) {
                        eVarB.close();
                    }
                    try {
                        this.f44287a.c(str);
                        return null;
                    } catch (IOException e) {
                        LogUtil.d("CacheCommon", "remove expired data fail:", ExceptionUtils.c(e));
                        return null;
                    }
                } catch (JsonSyntaxException e2) {
                    e = e2;
                    LogUtil.d("CacheCommon", "getDiskCache Json fail:", ExceptionUtils.c(e));
                    if (eVarB != null) {
                        eVarB.close();
                    }
                } catch (IOException e3) {
                    e = e3;
                    LogUtil.d("CacheCommon", "getDiskCache IO fail:", ExceptionUtils.c(e));
                    if (eVarB != null) {
                        eVarB.close();
                    }
                }
            } catch (Throwable th) {
                th = th;
                autoCloseable2 = autoCloseable;
                if (autoCloseable2 != null) {
                    autoCloseable2.close();
                }
                throw th;
            }
        } catch (JsonSyntaxException e4) {
            e = e4;
            eVarB = null;
        } catch (IOException e5) {
            e = e5;
            eVarB = null;
        } catch (Throwable th2) {
            th = th2;
            if (autoCloseable2 != null) {
                autoCloseable2.close();
            }
            throw th;
        }
    }

    private boolean e(String str) {
        if (this.d) {
            LogUtil.d("CacheCommon", "cache dir is deleted, getDiskCache fail");
            return true;
        }
        if (!TextUtils.isEmpty(str)) {
            return false;
        }
        LogUtil.d("CacheCommon", "getDiskCache key is null");
        return true;
    }

    public void b() {
        synchronized (this) {
            this.d = true;
            if (this.f44287a == null) {
                LogUtil.e("CacheCommon", "clearCache healthDiskLruCache is null");
                return;
            }
            try {
                this.f44287a.e();
            } catch (IOException e) {
                LogUtil.d("CacheCommon", "clearCache fail:", ExceptionUtils.c(e));
            }
            this.f44287a = null;
        }
    }
}
