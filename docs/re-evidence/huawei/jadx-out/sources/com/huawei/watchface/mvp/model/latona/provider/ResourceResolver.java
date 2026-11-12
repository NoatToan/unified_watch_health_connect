package com.huawei.watchface.mvp.model.latona.provider;

import android.text.TextUtils;
import com.huawei.watchface.c0;
import com.huawei.watchface.mvp.model.latona.LatonaWatchFace;
import com.huawei.watchface.utils.CommonUtils;
import com.huawei.watchface.utils.FileHelper;
import com.huawei.watchface.utils.HwLog;
import com.huawei.watchface.utils.callback.IPackageNamePathCallback;
import com.huawei.watchface.y4;
import com.huawei.watchface.z4;
import java.io.BufferedWriter;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.UnsupportedEncodingException;

/* JADX INFO: loaded from: classes45.dex */
public class ResourceResolver {
    private static final int CODE_UNZIP_FAILED = 0;
    private static final String TAG = "ResourceResolver";
    private static final String UTF_8 = "utf-8";
    private static final String WATCHFACE_CONFIG_NAME = "watch_face_config.xml";
    private static final String ZIPENTRY_SUFFIX = ".zip";
    private IPackageNamePathCallback mPathCallback;
    private String mWatchFacePackageName;
    private String mWatchFaceParsingPath;
    private String mWatchFacePath;

    public ResourceResolver(String str, String str2, String str3, IPackageNamePathCallback iPackageNamePathCallback) {
        this.mWatchFacePath = str;
        this.mWatchFacePackageName = str2;
        this.mWatchFaceParsingPath = str3;
        this.mPathCallback = iPackageNamePathCallback;
    }

    private InputStream getInputStreamFromCache(File file, String str) {
        if (file == null || !file.exists() || !file.isDirectory() || TextUtils.isEmpty(str)) {
            return null;
        }
        File file2 = new File(file, str);
        if (file2.exists() && file2.isFile()) {
            try {
                return new FileInputStream(new File(CommonUtils.filterFilePath(file2.getCanonicalPath())));
            } catch (FileNotFoundException unused) {
                HwLog.e(TAG, "getInputStream, FileNotFoundException");
            } catch (IOException unused2) {
                HwLog.e(TAG, "getInputStream, IOException");
            }
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v10 */
    /* JADX WARN: Type inference failed for: r3v0 */
    /* JADX WARN: Type inference failed for: r3v10 */
    /* JADX WARN: Type inference failed for: r3v3 */
    /* JADX WARN: Type inference failed for: r3v6, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r3v8 */
    /* JADX WARN: Type inference failed for: r3v9 */
    private <T> T parserXml(InputStream inputStream, Class<T> cls) throws Throwable {
        InputStreamReader inputStreamReader;
        Closeable closeable = (T) null;
        if (inputStream == null) {
            HwLog.i(TAG, "parserXml inputStream is null");
            return null;
        }
        z4 z4Var = new z4();
        ?? r3 = 1;
        z4Var.a(true);
        y4 y4VarA = z4Var.a();
        try {
            try {
                inputStreamReader = new InputStreamReader(inputStream, UTF_8);
                try {
                    closeable = (T) y4VarA.a(cls, inputStreamReader);
                    r3 = inputStreamReader;
                } catch (UnsupportedEncodingException unused) {
                    HwLog.e(TAG, "inputStreamReader encode failed");
                    r3 = inputStreamReader;
                } catch (Exception e) {
                    e = e;
                    HwLog.e(TAG, "inputStreamReader Exception:" + HwLog.printException(e));
                    r3 = inputStreamReader;
                }
            } catch (Throwable th) {
                th = th;
                closeable = (T) r3;
                c0.a(inputStream);
                c0.a(closeable);
                throw th;
            }
        } catch (UnsupportedEncodingException unused2) {
            inputStreamReader = null;
        } catch (Exception e2) {
            e = e2;
            inputStreamReader = null;
        } catch (Throwable th2) {
            th = th2;
            c0.a(inputStream);
            c0.a(closeable);
            throw th;
        }
        c0.a(inputStream);
        c0.a(r3);
        return (T) closeable;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r5v2 */
    public WatchFaceThemeProviders parseConfigFile() throws Throwable {
        InputStream inputStreamFromCache;
        HwLog.i(TAG, "parserConfigFile");
        File file = new File(this.mWatchFacePath);
        ?? r5 = 0;
        if (!file.exists() && !file.mkdir()) {
            return null;
        }
        File file2 = new File(file, this.mWatchFacePackageName);
        File file3 = new File(CommonUtils.filterFilePath(this.mWatchFaceParsingPath));
        if (!file3.exists()) {
            HwLog.i(TAG, "parserConfigFile, isParsingFileMkdir:" + file3.mkdir());
        }
        File file4 = new File(file3, this.mWatchFacePackageName);
        try {
            try {
                String canonicalPath = file4.getCanonicalPath();
                String str = canonicalPath + ".zip";
                FileHelper.copyFileToParsingDir(CommonUtils.filterFilePath(file2.getCanonicalPath()), CommonUtils.filterFilePath(str));
                if (FileHelper.b(CommonUtils.filterFilePath(str), CommonUtils.filterFilePath(canonicalPath)) > 0) {
                    inputStreamFromCache = getInputStreamFromCache(file4, WATCHFACE_CONFIG_NAME);
                    if (inputStreamFromCache == null) {
                        try {
                            HwLog.i(TAG, "parserConfigFile, inputStream is null, try new format.");
                            inputStreamFromCache = getInputStreamFromCache(new File(CommonUtils.filterFilePath(canonicalPath) + "/watchface"), WATCHFACE_CONFIG_NAME);
                            if (this.mPathCallback != null) {
                                this.mWatchFacePackageName += "/watchface";
                                this.mPathCallback.notifyPathChanged();
                            }
                        } catch (IOException unused) {
                            HwLog.e(TAG, "parseConfigFile unzipFailed");
                            c0.a(inputStreamFromCache);
                        } catch (Exception unused2) {
                            HwLog.e(TAG, "parseConfigFile exception");
                            c0.a(inputStreamFromCache);
                        }
                    }
                    WatchFaceThemeProviders watchFaceThemeProviders = (WatchFaceThemeProviders) parserXml(inputStreamFromCache, WatchFaceThemeProviders.class);
                    if (watchFaceThemeProviders != null) {
                        c0.a(inputStreamFromCache);
                        return watchFaceThemeProviders;
                    }
                } else {
                    inputStreamFromCache = null;
                }
                c0.a(inputStreamFromCache);
            } catch (Throwable th) {
                th = th;
                r5 = file2;
                c0.a(r5);
                throw th;
            }
        } catch (IOException unused3) {
            inputStreamFromCache = null;
        } catch (Exception unused4) {
            inputStreamFromCache = null;
        } catch (Throwable th2) {
            th = th2;
            c0.a(r5);
            throw th;
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:48:0x00d7 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v0 */
    /* JADX WARN: Type inference failed for: r6v1, types: [java.io.InputStream] */
    /* JADX WARN: Type inference failed for: r6v2 */
    public LatonaWatchFace parserLetonaConfigFile() throws Throwable {
        InputStream inputStreamFromCache;
        HwLog.i(TAG, "parserLetonaConfigFile()");
        File file = new File(this.mWatchFacePath);
        ?? r6 = 0;
        if (!file.exists() && !file.mkdir()) {
            return null;
        }
        File file2 = new File(file, this.mWatchFacePackageName);
        try {
            try {
                String canonicalPath = file2.getCanonicalPath();
                String str = canonicalPath + ".zip";
                FileHelper.copyFileToParsingDir(canonicalPath, str);
                File file3 = new File(canonicalPath);
                if (file3.exists()) {
                    HwLog.i(TAG, "delete：" + file3.delete());
                }
                if (FileHelper.b(str, canonicalPath) > 0) {
                    HwLog.i(TAG, "parserLetonaConfigFile() > 0");
                    inputStreamFromCache = getInputStreamFromCache(file2, WATCHFACE_CONFIG_NAME);
                    if (inputStreamFromCache == null) {
                        try {
                            HwLog.i(TAG, "parserLetonaConfigFile, inputStream is null, try new format.");
                            inputStreamFromCache = getInputStreamFromCache(new File(CommonUtils.filterFilePath(canonicalPath) + "/watchface"), WATCHFACE_CONFIG_NAME);
                            if (this.mPathCallback != null) {
                                this.mWatchFacePackageName += "/watchface";
                                this.mPathCallback.notifyPathChanged();
                            }
                        } catch (IOException unused) {
                            HwLog.i(TAG, "unzipFailed");
                            if (inputStreamFromCache != null) {
                                try {
                                    inputStreamFromCache.close();
                                } catch (IOException unused2) {
                                    HwLog.e(TAG, "inputStream closeFailed");
                                }
                            }
                            return null;
                        }
                    }
                    LatonaWatchFace latonaWatchFace = (LatonaWatchFace) parserXml(inputStreamFromCache, LatonaWatchFace.class);
                    if (inputStreamFromCache != null) {
                        try {
                            inputStreamFromCache.close();
                            return latonaWatchFace;
                        } catch (IOException unused3) {
                            HwLog.e(TAG, "inputStream closeFailed");
                        }
                    }
                    return latonaWatchFace;
                }
            } catch (Throwable th) {
                th = th;
                r6 = file2;
                if (r6 != 0) {
                    try {
                        r6.close();
                    } catch (IOException unused4) {
                        HwLog.e(TAG, "inputStream closeFailed");
                    }
                }
                throw th;
            }
        } catch (IOException unused5) {
            inputStreamFromCache = null;
        } catch (Throwable th2) {
            th = th2;
            if (r6 != 0) {
                r6.close();
            }
            throw th;
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:30:0x0085 A[Catch: IOException -> 0x008e, TryCatch #9 {IOException -> 0x008e, blocks: (B:28:0x0080, B:30:0x0085, B:32:0x008a), top: B:55:0x0080 }] */
    /* JADX WARN: Code duplicated, block: B:32:0x008a A[Catch: IOException -> 0x008e, TRY_LEAVE, TryCatch #9 {IOException -> 0x008e, blocks: (B:28:0x0080, B:30:0x0085, B:32:0x008a), top: B:55:0x0080 }] */
    /* JADX WARN: Code duplicated, block: B:40:0x0099 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:41:0x009b A[Catch: IOException -> 0x00a4, TryCatch #4 {IOException -> 0x00a4, blocks: (B:39:0x0096, B:41:0x009b, B:43:0x00a0), top: B:50:0x0096 }] */
    /* JADX WARN: Code duplicated, block: B:43:0x00a0 A[Catch: IOException -> 0x00a4, TRY_LEAVE, TryCatch #4 {IOException -> 0x00a4, blocks: (B:39:0x0096, B:41:0x009b, B:43:0x00a0), top: B:50:0x0096 }] */
    /* JADX WARN: Code duplicated, block: B:50:0x0096 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    public boolean writeBackConfigFile(WatchFaceThemeProviders watchFaceThemeProviders) throws Throwable {
        OutputStreamWriter outputStreamWriter;
        FileOutputStream fileOutputStream;
        BufferedWriter bufferedWriter;
        File file = new File(this.mWatchFaceParsingPath + File.separator + this.mWatchFacePackageName, WATCHFACE_CONFIG_NAME);
        if (!file.exists()) {
            HwLog.i(TAG, "writeBackConfigFile failed, configFile doesn't exist");
            return false;
        }
        BufferedWriter bufferedWriter2 = null;
        bufferedWriter2 = null;
        bufferedWriter2 = null;
        bufferedWriter2 = null;
        OutputStreamWriter outputStreamWriter2 = null;
        bufferedWriter2 = null;
        try {
            z4 z4Var = new z4();
            z4Var.a(true);
            fileOutputStream = new FileOutputStream(CommonUtils.filterFilePath(file.getCanonicalPath()));
            try {
                outputStreamWriter = new OutputStreamWriter(fileOutputStream, UTF_8);
                try {
                    try {
                        bufferedWriter = new BufferedWriter(outputStreamWriter);
                        try {
                            z4Var.a().a(bufferedWriter, watchFaceThemeProviders);
                            try {
                                outputStreamWriter.close();
                                bufferedWriter.close();
                                fileOutputStream.close();
                            } catch (IOException unused) {
                                HwLog.e(TAG, "writeBackConfigFile, stream or buffer close exception");
                            }
                            return true;
                        } catch (IOException unused2) {
                            bufferedWriter2 = bufferedWriter;
                            HwLog.e(TAG, "writeBackConfigFile error");
                            if (outputStreamWriter != null) {
                                try {
                                    outputStreamWriter.close();
                                    if (bufferedWriter2 != null) {
                                        bufferedWriter2.close();
                                    }
                                    if (fileOutputStream != null) {
                                        fileOutputStream.close();
                                    }
                                } catch (IOException unused3) {
                                    HwLog.e(TAG, "writeBackConfigFile, stream or buffer close exception");
                                    return false;
                                }
                            } else {
                                if (bufferedWriter2 != null) {
                                    bufferedWriter2.close();
                                }
                                if (fileOutputStream != null) {
                                    fileOutputStream.close();
                                }
                            }
                            return false;
                        } catch (Throwable th) {
                            th = th;
                            outputStreamWriter2 = outputStreamWriter;
                            if (outputStreamWriter2 != null) {
                                try {
                                    outputStreamWriter2.close();
                                    if (bufferedWriter != null) {
                                        bufferedWriter.close();
                                    }
                                    if (fileOutputStream != null) {
                                        fileOutputStream.close();
                                    }
                                } catch (IOException unused4) {
                                    HwLog.e(TAG, "writeBackConfigFile, stream or buffer close exception");
                                    throw th;
                                }
                            } else {
                                if (bufferedWriter != null) {
                                    bufferedWriter.close();
                                }
                                if (fileOutputStream != null) {
                                    fileOutputStream.close();
                                }
                            }
                            throw th;
                        }
                    } catch (IOException unused5) {
                    }
                } catch (Throwable th2) {
                    th = th2;
                    bufferedWriter = bufferedWriter2;
                    outputStreamWriter2 = outputStreamWriter;
                    if (outputStreamWriter2 != null) {
                        outputStreamWriter2.close();
                        if (bufferedWriter != null) {
                            bufferedWriter.close();
                        }
                        if (fileOutputStream != null) {
                            fileOutputStream.close();
                        }
                    } else {
                        if (bufferedWriter != null) {
                            bufferedWriter.close();
                        }
                        if (fileOutputStream != null) {
                            fileOutputStream.close();
                        }
                    }
                    throw th;
                }
            } catch (IOException unused6) {
                outputStreamWriter = null;
            } catch (Throwable th3) {
                th = th3;
                bufferedWriter = null;
                if (outputStreamWriter2 != null) {
                    outputStreamWriter2.close();
                    if (bufferedWriter != null) {
                        bufferedWriter.close();
                    }
                    if (fileOutputStream != null) {
                        fileOutputStream.close();
                    }
                } else {
                    if (bufferedWriter != null) {
                        bufferedWriter.close();
                    }
                    if (fileOutputStream != null) {
                        fileOutputStream.close();
                    }
                }
                throw th;
            }
        } catch (IOException unused7) {
            outputStreamWriter = null;
            fileOutputStream = null;
        } catch (Throwable th4) {
            th = th4;
            outputStreamWriter = null;
            fileOutputStream = null;
            bufferedWriter = bufferedWriter2;
            outputStreamWriter2 = outputStreamWriter;
            if (outputStreamWriter2 != null) {
                outputStreamWriter2.close();
                if (bufferedWriter != null) {
                    bufferedWriter.close();
                }
                if (fileOutputStream != null) {
                    fileOutputStream.close();
                }
            } else {
                if (bufferedWriter != null) {
                    bufferedWriter.close();
                }
                if (fileOutputStream != null) {
                    fileOutputStream.close();
                }
            }
            throw th;
        }
    }
}
