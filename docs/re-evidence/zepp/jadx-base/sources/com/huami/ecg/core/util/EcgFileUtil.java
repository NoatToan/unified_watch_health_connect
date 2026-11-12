package com.huami.ecg.core.util;

import android.content.Context;
import android.text.TextUtils;
import androidx.multidex.MultiDexExtractor;
import com.huami.ecg.core.EcgCore;
import com.huami.tools.analytics.DbUtils;
import com.huami.tools.log.HMLog;
import com.huami.watch.companion.ecg.analytics.EcgAnalyticsManagerKt;
import java.io.BufferedReader;
import java.io.File;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0006\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u0018\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0002J\u0018\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0002J\u0018\u0010\b\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0002J\u0014\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00020\u000b2\u0006\u0010\n\u001a\u00020\tJ\u0016\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0003\u001a\u00020\u0002J\u0016\u0010\u0011\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0003\u001a\u00020\u0002J\u001e\u0010\u0012\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004J\u001e\u0010\u0013\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004J\u001e\u0010\u0014\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004J\u000e\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0015\u001a\u00020\u0002R\u0016\u0010\u0019\u001a\u00020\u00028\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0018¨\u0006\u001c"}, d2 = {"Lcom/huami/ecg/core/util/EcgFileUtil;", "", "", "userId", "", "timestamp", "a", "c", "b", "Ljava/io/InputStream;", "is", "", "readFileData", "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "Ljava/io/File;", "getEcgDir", "getEcgTempDir", "getEcgFile", "getPpgFile", "getEcgZipFile", "filePath", "", "fileExists", "Ljava/lang/String;", "TAG", "<init>", "()V", "ecg-core_release"}, k = 1, mv = {1, 4, 0})
public final class EcgFileUtil {
    public static final EcgFileUtil INSTANCE = new EcgFileUtil();

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private static final String TAG = "Ecg-FileUtil";

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0003\u0010\u0003\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "invoke", "()Ljava/lang/String;", "<anonymous>"}, k = 3, mv = {1, 4, 0})
    public static final class a extends Lambda implements Function0<String> {
        public final /* synthetic */ Exception a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Exception exc) {
            super(0);
            this.a = exc;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return this.a.getMessage();
        }
    }

    private EcgFileUtil() {
    }

    private final String a(String userId, long timestamp) {
        return userId + '-' + timestamp + "-ecg.txt";
    }

    private final String b(String userId, long timestamp) {
        return userId + '-' + timestamp + MultiDexExtractor.EXTRACTED_SUFFIX;
    }

    private final String c(String userId, long timestamp) {
        return userId + '-' + timestamp + "-ppg.txt";
    }

    public final boolean fileExists(@NotNull String filePath) {
        if (TextUtils.isEmpty(filePath)) {
            return false;
        }
        MediaStoreUtils mediaStoreUtils = MediaStoreUtils.INSTANCE;
        if (mediaStoreUtils.isNeedMediastore(filePath)) {
            return mediaStoreUtils.isFileExsits(EcgCore.INSTANCE.getContext(), filePath);
        }
        try {
            File file = new File(filePath);
            return file.isFile() && file.exists();
        } catch (Exception unused) {
            return false;
        }
    }

    @NotNull
    public final File getEcgDir(@NotNull Context context, @NotNull String userId) {
        File file = new File(context.getFilesDir(), EcgAnalyticsManagerKt.ECG);
        if (!file.exists()) {
            file.mkdirs();
        }
        File file2 = new File(file, userId);
        if (!file2.exists()) {
            file2.mkdirs();
        }
        return file2;
    }

    @NotNull
    public final File getEcgFile(@NotNull Context context, @NotNull String userId, long timestamp) {
        return new File(getEcgDir(context, userId), a(userId, timestamp));
    }

    @NotNull
    public final File getEcgTempDir(@NotNull Context context, @NotNull String userId) {
        File file = new File(getEcgDir(context, userId), "temp");
        if (!file.exists()) {
            file.mkdirs();
        }
        return file;
    }

    @NotNull
    public final File getEcgZipFile(@NotNull Context context, @NotNull String userId, long timestamp) {
        return new File(getEcgDir(context, userId), b(userId, timestamp));
    }

    @NotNull
    public final File getPpgFile(@NotNull Context context, @NotNull String userId, long timestamp) {
        return new File(getEcgDir(context, userId), c(userId, timestamp));
    }

    /* JADX WARN: Code duplicated, block: B:105:? A[Catch: all -> 0x009b, SYNTHETIC, TRY_LEAVE, TryCatch #12 {, blocks: (B:3:0x0001, B:17:0x002c, B:21:0x0034, B:25:0x003c, B:28:0x0041, B:24:0x0039, B:20:0x0031, B:41:0x0060, B:46:0x006a, B:51:0x0074, B:49:0x006f, B:44:0x0065, B:59:0x007e, B:64:0x0088, B:69:0x0092, B:73:0x009a, B:72:0x0097, B:67:0x008d, B:62:0x0083), top: B:93:0x0001, inners: #0, #1, #2, #6, #7, #13, #15 }] */
    /* JADX WARN: Code duplicated, block: B:68:0x0090 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:81:0x0088 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:87:0x0092 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @NotNull
    public final synchronized List<String> readFileData(@NotNull InputStream is) {
        ArrayList arrayList;
        BufferedReader bufferedReader;
        Exception e;
        InputStreamReader inputStreamReader;
        arrayList = new ArrayList();
        InputStreamReader inputStreamReader2 = null;
        try {
            inputStreamReader = new InputStreamReader(is, "UTF-8");
            try {
                bufferedReader = new BufferedReader(inputStreamReader);
                try {
                    try {
                        for (String line = bufferedReader.readLine(); line != null; line = bufferedReader.readLine()) {
                            if (line.length() > 0) {
                                arrayList.add(line);
                            }
                        }
                        try {
                            is.close();
                        } catch (Exception e2) {
                            e2.printStackTrace();
                        }
                        try {
                            inputStreamReader.close();
                        } catch (Exception e3) {
                            e3.printStackTrace();
                        }
                        try {
                            bufferedReader.close();
                        } catch (Exception e4) {
                            e = e4;
                            e.printStackTrace();
                        }
                    } catch (Exception e5) {
                        e = e5;
                        HMLog.warn(TAG, e, new a(e));
                        try {
                            is.close();
                        } catch (Exception e6) {
                            e6.printStackTrace();
                        }
                        if (inputStreamReader != null) {
                            try {
                                inputStreamReader.close();
                            } catch (Exception e7) {
                                e7.printStackTrace();
                            }
                        }
                        if (bufferedReader != null) {
                            try {
                                bufferedReader.close();
                            } catch (Exception e8) {
                                e = e8;
                                e.printStackTrace();
                            }
                        }
                    }
                } catch (Throwable th) {
                    th = th;
                    inputStreamReader2 = inputStreamReader;
                    try {
                        is.close();
                    } catch (Exception e9) {
                        e9.printStackTrace();
                    }
                    if (inputStreamReader2 == null) {
                        if (bufferedReader != null) {
                            throw th;
                        }
                        bufferedReader.close();
                        throw th;
                    }
                    try {
                        inputStreamReader2.close();
                    } catch (Exception e10) {
                        e10.printStackTrace();
                    }
                    if (bufferedReader != null) {
                        throw th;
                    }
                    try {
                        bufferedReader.close();
                        throw th;
                    } catch (Exception e11) {
                        e11.printStackTrace();
                        throw th;
                    }
                    throw th;
                }
            } catch (Exception e12) {
                bufferedReader = null;
                e = e12;
            } catch (Throwable th2) {
                th = th2;
                bufferedReader = null;
                inputStreamReader2 = inputStreamReader;
                is.close();
                if (inputStreamReader2 == null) {
                    if (bufferedReader != null) {
                        throw th;
                    }
                    bufferedReader.close();
                    throw th;
                }
                inputStreamReader2.close();
                if (bufferedReader != null) {
                    throw th;
                }
                bufferedReader.close();
                throw th;
                throw th;
            }
        } catch (Exception e13) {
            bufferedReader = null;
            e = e13;
            inputStreamReader = null;
        } catch (Throwable th3) {
            th = th3;
            bufferedReader = null;
            is.close();
            if (inputStreamReader2 == null) {
                if (bufferedReader != null) {
                    throw th;
                }
                bufferedReader.close();
                throw th;
            }
            inputStreamReader2.close();
            if (bufferedReader != null) {
                throw th;
            }
            bufferedReader.close();
            throw th;
            throw th;
        }
        return arrayList;
    }
}
