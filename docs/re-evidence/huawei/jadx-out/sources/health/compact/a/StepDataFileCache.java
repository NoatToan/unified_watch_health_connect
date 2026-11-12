package health.compact.a;

import android.content.Context;
import android.text.TextUtils;
import android.util.SparseArray;
import androidx.health.connect.client.records.CervicalMucusRecord;
import com.huawei.health.manager.util.TimeUtil;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;

/* JADX INFO: loaded from: classes2.dex */
public class StepDataFileCache {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f36643a = "tmpFileName";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Context f36644b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f36645c;

    public StepDataFileCache(Context context, String str) {
        this.f36644b = null;
        this.f36645c = "defaultFileName";
        if (context == null || str == null) {
            com.huawei.hwlogsmodel.LogUtil.d("Step_DataFileCache", "(context == null) && (name == null)");
            return;
        }
        this.f36644b = context;
        this.f36645c = str;
        b();
        File fileStreamPath = context.getFileStreamPath(this.f36645c);
        if (fileStreamPath == null || !fileStreamPath.exists()) {
            com.huawei.hwlogsmodel.LogUtil.d("Step_DataFileCache", "fileUsed not exists");
        }
    }

    private void b() {
        if (d()) {
            a();
        }
    }

    private boolean a() {
        File fileStreamPath;
        String str;
        Context context = this.f36644b;
        if (context != null && (str = this.f36645c) != null) {
            fileStreamPath = context.getFileStreamPath(str);
        } else {
            com.huawei.hwlogsmodel.LogUtil.d("Step_DataFileCache", "(mContext == null) || (mFileName == null)");
            fileStreamPath = null;
        }
        if (fileStreamPath == null || !fileStreamPath.exists()) {
            com.huawei.hwlogsmodel.LogUtil.d("Step_DataFileCache", "isFileSizeValid no file,do not need check");
            return true;
        }
        long length = fileStreamPath.length();
        if (length > 512000) {
            com.huawei.hwlogsmodel.LogUtil.j("Step_DataFileCache", "fileSize invalidate:", Long.valueOf(length));
            if (!fileStreamPath.delete()) {
                com.huawei.hwlogsmodel.LogUtil.j("Step_DataFileCache", "fileSize invalidate,delete failed");
                return false;
            }
        }
        return true;
    }

    private boolean d() {
        File fileStreamPath;
        File fileStreamPath2;
        Context context = this.f36644b;
        if (context != null && this.f36645c != null) {
            fileStreamPath = context.getFileStreamPath(this.f36643a);
            fileStreamPath2 = this.f36644b.getFileStreamPath(this.f36645c);
        } else {
            com.huawei.hwlogsmodel.LogUtil.d("Step_DataFileCache", "(mContext == null) || (mFileName == null)");
            fileStreamPath = null;
            fileStreamPath2 = null;
        }
        boolean z = fileStreamPath != null && fileStreamPath.exists();
        boolean z2 = fileStreamPath2 != null && fileStreamPath2.exists();
        if (z2 && z) {
            com.huawei.hwlogsmodel.LogUtil.a("Step_DataFileCache", "crash occur double file");
            if (!fileStreamPath.delete()) {
                com.huawei.hwlogsmodel.LogUtil.j("Step_DataFileCache", "delete fileTmp failed");
                return false;
            }
        } else if (!z2 && z) {
            com.huawei.hwlogsmodel.LogUtil.a("Step_DataFileCache", "crash occur only tmp file exists");
            if (fileStreamPath2 != null && !fileStreamPath.renameTo(fileStreamPath2)) {
                com.huawei.hwlogsmodel.LogUtil.j("Step_DataFileCache", "rename failed");
                return false;
            }
        } else {
            com.huawei.hwlogsmodel.LogUtil.a("Step_DataFileCache", "crash occur only other file exists");
        }
        return true;
    }

    public int c(Context context, SparseArray<OneMinuteStepData> sparseArray) {
        if (sparseArray == null || sparseArray.size() <= 0) {
            com.huawei.hwlogsmodel.LogUtil.a("Step_DataFileCache", "(cache == null) || (cache.size() <= 0)");
            return 0;
        }
        d(context, sparseArray);
        return 0;
    }

    /* JADX WARN: Code duplicated, block: B:56:0x0114  */
    private boolean e(Context context, SparseArray<OneMinuteStepData> sparseArray) {
        if (!e(context)) {
            com.huawei.hwlogsmodel.LogUtil.j("Step_DataFileCache", "isClearTempCacheFile in generateTmpCacheFile failed,exit");
            return false;
        }
        FileOutputStream fileOutputStream = null;
        try {
            try {
                try {
                    FileOutputStream fileOutputStreamOpenFileOutput = context.openFileOutput(this.f36643a, 0);
                    if (fileOutputStreamOpenFileOutput == null) {
                        com.huawei.hwlogsmodel.LogUtil.d("Step_DataFileCache", "FAILED TO CREATE TMP FILE");
                        if (fileOutputStreamOpenFileOutput != null) {
                            try {
                                fileOutputStreamOpenFileOutput.close();
                                return false;
                            } catch (FileNotFoundException unused) {
                                com.huawei.hwlogsmodel.LogUtil.j("Step_DataFileCache", "parseCacheFile outputStream.close() FileNotFoundException.");
                            } catch (IOException e) {
                                com.huawei.hwlogsmodel.LogUtil.j("Step_DataFileCache", e.getMessage());
                            }
                        }
                        return false;
                    }
                    StringBuffer stringBuffer = new StringBuffer(16);
                    for (int i = 0; i < sparseArray.size(); i++) {
                        stringBuffer.append(sparseArray.valueAt(i).toString()).append("#");
                    }
                    fileOutputStreamOpenFileOutput.write(stringBuffer.toString().getBytes("UTF-8"));
                    if (fileOutputStreamOpenFileOutput != null) {
                        try {
                            fileOutputStreamOpenFileOutput.close();
                            return true;
                        } catch (FileNotFoundException unused2) {
                            com.huawei.hwlogsmodel.LogUtil.j("Step_DataFileCache", "parseCacheFile outputStream.close() FileNotFoundException.");
                        } catch (IOException e2) {
                            com.huawei.hwlogsmodel.LogUtil.j("Step_DataFileCache", e2.getMessage());
                        }
                    }
                    return true;
                } catch (UnsupportedEncodingException e3) {
                    com.huawei.hwlogsmodel.LogUtil.j("Step_DataFileCache", e3.getMessage());
                    if (0 != 0) {
                        try {
                            fileOutputStream.close();
                        } catch (FileNotFoundException unused3) {
                            com.huawei.hwlogsmodel.LogUtil.j("Step_DataFileCache", "parseCacheFile outputStream.close() FileNotFoundException.");
                        } catch (IOException e4) {
                            com.huawei.hwlogsmodel.LogUtil.j("Step_DataFileCache", e4.getMessage());
                        }
                    }
                    com.huawei.hwlogsmodel.LogUtil.j("Step_DataFileCache", "generate Tmp Cache failed,clearing");
                    if (!e(context)) {
                        com.huawei.hwlogsmodel.LogUtil.j("Step_DataFileCache", "generate Tmp Cache failed,clearing error!!!");
                    }
                    return false;
                }
            } catch (FileNotFoundException unused4) {
                com.huawei.hwlogsmodel.LogUtil.j("Step_DataFileCache", "parseCacheFile FileNotFoundException");
                if (0 != 0) {
                    try {
                        fileOutputStream.close();
                    } catch (FileNotFoundException unused5) {
                        com.huawei.hwlogsmodel.LogUtil.j("Step_DataFileCache", "parseCacheFile outputStream.close() FileNotFoundException.");
                    } catch (IOException e5) {
                        com.huawei.hwlogsmodel.LogUtil.j("Step_DataFileCache", e5.getMessage());
                    }
                }
                com.huawei.hwlogsmodel.LogUtil.j("Step_DataFileCache", "generate Tmp Cache failed,clearing");
                if (!e(context)) {
                    com.huawei.hwlogsmodel.LogUtil.j("Step_DataFileCache", "generate Tmp Cache failed,clearing error!!!");
                }
                return false;
            } catch (IOException e6) {
                com.huawei.hwlogsmodel.LogUtil.j("Step_DataFileCache", e6.getMessage());
                if (0 != 0) {
                    try {
                        fileOutputStream.close();
                    } catch (FileNotFoundException unused6) {
                        com.huawei.hwlogsmodel.LogUtil.j("Step_DataFileCache", "parseCacheFile outputStream.close() FileNotFoundException.");
                    } catch (IOException e7) {
                        com.huawei.hwlogsmodel.LogUtil.j("Step_DataFileCache", e7.getMessage());
                    }
                }
                com.huawei.hwlogsmodel.LogUtil.j("Step_DataFileCache", "generate Tmp Cache failed,clearing");
                if (!e(context)) {
                    com.huawei.hwlogsmodel.LogUtil.j("Step_DataFileCache", "generate Tmp Cache failed,clearing error!!!");
                }
                return false;
            }
        } catch (Throwable th) {
            if (0 != 0) {
                try {
                    fileOutputStream.close();
                } catch (FileNotFoundException unused7) {
                    com.huawei.hwlogsmodel.LogUtil.j("Step_DataFileCache", "parseCacheFile outputStream.close() FileNotFoundException.");
                } catch (IOException e8) {
                    com.huawei.hwlogsmodel.LogUtil.j("Step_DataFileCache", e8.getMessage());
                }
            }
            throw th;
        }
    }

    private boolean e(Context context) {
        if (context == null) {
            com.huawei.hwlogsmodel.LogUtil.j("Step_DataFileCache", "clearTempCacheFile context == null");
            return false;
        }
        File fileStreamPath = context.getFileStreamPath(this.f36643a);
        if (!fileStreamPath.exists()) {
            com.huawei.hwlogsmodel.LogUtil.d("Step_DataFileCache", "isClearTempCacheFile no file exist");
            return true;
        }
        com.huawei.hwlogsmodel.LogUtil.d("Step_DataFileCache", "isClearTempCacheFile delete excute");
        return fileStreamPath.delete();
    }

    private void d(Context context, SparseArray<OneMinuteStepData> sparseArray) {
        com.huawei.hwlogsmodel.LogUtil.d("Step_DataFileCache", "flushDataFromCacheToFile");
        if (sparseArray == null || context == null) {
            com.huawei.hwlogsmodel.LogUtil.a("Step_DataFileCache", "flushDataFromCacheToFile,cache == null || context == null");
            return;
        }
        if (!e(context, sparseArray)) {
            com.huawei.hwlogsmodel.LogUtil.j("Step_DataFileCache", "generateTmpCacheFile failed,exit");
            return;
        }
        if (!b(context)) {
            com.huawei.hwlogsmodel.LogUtil.j("Step_DataFileCache", "deleteCacheFile failed,exit");
            return;
        }
        File fileStreamPath = context.getFileStreamPath(this.f36643a);
        String str = this.f36645c;
        if (str != null) {
            if (!fileStreamPath.renameTo(context.getFileStreamPath(str))) {
                com.huawei.hwlogsmodel.LogUtil.j("Step_DataFileCache", "failed to rename from tmpFile to cache");
                return;
            } else {
                com.huawei.hwlogsmodel.LogUtil.d("Step_DataFileCache", "success to rename");
                return;
            }
        }
        com.huawei.hwlogsmodel.LogUtil.a("Step_DataFileCache", "mFileName == null");
    }

    public void e(Context context, StepDataCache stepDataCache, long j, long j2) throws Throwable {
        String str;
        com.huawei.hwlogsmodel.LogUtil.d("Step_DataFileCache", "initMemoryFromFile");
        if (context != null && (str = this.f36645c) != null) {
            File fileStreamPath = context.getFileStreamPath(str);
            if (fileStreamPath == null || !fileStreamPath.exists()) {
                com.huawei.hwlogsmodel.LogUtil.j("Step_DataFileCache", "file not exists");
                return;
            }
            long jE = TimeUtil.e(j);
            long jE2 = TimeUtil.e(j2);
            String[] strArrC = c(context);
            if (strArrC == null || strArrC.length <= 0) {
                return;
            }
            e(stepDataCache, jE, jE2, strArrC);
            return;
        }
        com.huawei.hwlogsmodel.LogUtil.j("Step_DataFileCache", "(context == null) || (mFileName == null)");
    }

    private void e(StepDataCache stepDataCache, long j, long j2, String[] strArr) {
        String[] strArrSplit;
        long j3;
        for (String str : strArr) {
            if (str != null && (strArrSplit = str.split(",")) != null && strArrSplit.length == 5) {
                String strTrim = strArrSplit[0].trim();
                if (TextUtils.isEmpty(strTrim)) {
                    j3 = 0;
                } else {
                    try {
                        j3 = Long.parseLong(strTrim);
                    } catch (NumberFormatException unused) {
                        com.huawei.hwlogsmodel.LogUtil.a("Step_DataFileCache", "NumberFormatException");
                        return;
                    }
                }
                if (j3 >= j && j3 <= j2) {
                    try {
                        stepDataCache.b(Integer.parseInt(strArrSplit[1].trim()), j3 * 60000, Integer.parseInt(strArrSplit[2].trim()), Integer.parseInt(strArrSplit[3].trim()), Integer.parseInt(strArrSplit[4].trim()));
                    } catch (NumberFormatException e) {
                        com.huawei.hwlogsmodel.LogUtil.e("Step_DataFileCache", "NumberFormatException = ", LogAnonymous.b(e));
                    }
                }
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Not initialized variable reg: 6, insn: 0x00d7: MOVE (r4 I:??[OBJECT, ARRAY]) = (r6 I:??[OBJECT, ARRAY]), block:B:61:0x00d7 */
    /* JADX WARN: Type inference failed for: r11v0, types: [health.compact.a.StepDataFileCache] */
    /* JADX WARN: Type inference failed for: r12v0, types: [android.content.Context] */
    /* JADX WARN: Type inference failed for: r12v10 */
    /* JADX WARN: Type inference failed for: r12v11 */
    /* JADX WARN: Type inference failed for: r12v12 */
    /* JADX WARN: Type inference failed for: r12v13 */
    /* JADX WARN: Type inference failed for: r12v14, types: [java.io.FileInputStream] */
    /* JADX WARN: Type inference failed for: r12v15 */
    /* JADX WARN: Type inference failed for: r12v16 */
    /* JADX WARN: Type inference failed for: r12v17 */
    /* JADX WARN: Type inference failed for: r12v18, types: [java.io.FileInputStream] */
    /* JADX WARN: Type inference failed for: r12v19 */
    /* JADX WARN: Type inference failed for: r12v2 */
    /* JADX WARN: Type inference failed for: r12v21 */
    /* JADX WARN: Type inference failed for: r12v22, types: [java.io.FileInputStream, java.io.InputStream] */
    /* JADX WARN: Type inference failed for: r12v24 */
    /* JADX WARN: Type inference failed for: r12v25 */
    /* JADX WARN: Type inference failed for: r12v26 */
    /* JADX WARN: Type inference failed for: r12v27 */
    /* JADX WARN: Type inference failed for: r12v28 */
    /* JADX WARN: Type inference failed for: r12v29 */
    /* JADX WARN: Type inference failed for: r12v30 */
    /* JADX WARN: Type inference failed for: r12v31 */
    /* JADX WARN: Type inference failed for: r12v4 */
    /* JADX WARN: Type inference failed for: r12v6 */
    /* JADX WARN: Type inference failed for: r12v8 */
    /* JADX WARN: Type inference failed for: r12v9 */
    private String[] c(Context context) throws Throwable {
        Throwable th;
        InputStreamReader inputStreamReader;
        UnsupportedOperationException e;
        IndexOutOfBoundsException e2;
        IOException e3;
        BufferedReader bufferedReader;
        BufferedReader bufferedReader2;
        ?? r12;
        com.huawei.hwlogsmodel.LogUtil.d("Step_DataFileCache", "parseCacheFile enter...");
        BufferedReader bufferedReader3 = null;
        bufferedReader3 = null;
        bufferedReader3 = null;
        try {
            try {
                String str = this.f36645c;
                if (str != null) {
                    context = context.openFileInput(str);
                } else {
                    com.huawei.hwlogsmodel.LogUtil.a("Step_DataFileCache", "mFileName == null");
                    context = 0;
                }
                try {
                    if (context == 0) {
                        com.huawei.hwlogsmodel.LogUtil.a("Step_DataFileCache", "fileInputStream == null");
                        b(null, context, null);
                        return null;
                    }
                    inputStreamReader = new InputStreamReader((InputStream) context, "UTF-8");
                    try {
                        bufferedReader2 = new BufferedReader(inputStreamReader);
                        try {
                            StringBuffer stringBuffer = new StringBuffer(16);
                            char[] cArr = new char[1024];
                            while (true) {
                                int i = bufferedReader2.read(cArr);
                                if (i == -1) {
                                    break;
                                }
                                stringBuffer.append(cArr, 0, i);
                            }
                            String strTrim = stringBuffer.toString().trim();
                            String[] strArrSplit = strTrim != null ? strTrim.split("#") : null;
                            b(bufferedReader2, context, inputStreamReader);
                            return strArrSplit;
                        } catch (FileNotFoundException unused) {
                            com.huawei.hwlogsmodel.LogUtil.e("Step_DataFileCache", "parseCacheFile FileNotFoundException");
                            r12 = context;
                            b(bufferedReader2, r12, inputStreamReader);
                            return null;
                        } catch (IOException e4) {
                            e3 = e4;
                            com.huawei.hwlogsmodel.LogUtil.e("Step_DataFileCache", "parseCacheFile IOException", LogAnonymous.b(e3));
                            r12 = context;
                            b(bufferedReader2, r12, inputStreamReader);
                            return null;
                        } catch (IndexOutOfBoundsException e5) {
                            e2 = e5;
                            com.huawei.hwlogsmodel.LogUtil.e("Step_DataFileCache", "parseCacheFile IndexOutOfBoundsException", e2.getMessage());
                            r12 = context;
                            b(bufferedReader2, r12, inputStreamReader);
                            return null;
                        } catch (UnsupportedOperationException e6) {
                            e = e6;
                            com.huawei.hwlogsmodel.LogUtil.e("Step_DataFileCache", "parseCacheFile UnsupportedOperationException", e.getMessage());
                            r12 = context;
                            b(bufferedReader2, r12, inputStreamReader);
                            return null;
                        }
                    } catch (FileNotFoundException unused2) {
                        bufferedReader2 = null;
                    } catch (IOException e7) {
                        e3 = e7;
                        bufferedReader2 = null;
                    } catch (IndexOutOfBoundsException e8) {
                        e2 = e8;
                        bufferedReader2 = null;
                    } catch (UnsupportedOperationException e9) {
                        e = e9;
                        bufferedReader2 = null;
                    } catch (Throwable th2) {
                        th = th2;
                        b(bufferedReader3, context, inputStreamReader);
                        throw th;
                    }
                } catch (FileNotFoundException unused3) {
                    inputStreamReader = null;
                    bufferedReader2 = null;
                    com.huawei.hwlogsmodel.LogUtil.e("Step_DataFileCache", "parseCacheFile FileNotFoundException");
                    r12 = context;
                    b(bufferedReader2, r12, inputStreamReader);
                    return null;
                } catch (IOException e10) {
                    e3 = e10;
                    context = context;
                    inputStreamReader = null;
                    bufferedReader2 = null;
                    com.huawei.hwlogsmodel.LogUtil.e("Step_DataFileCache", "parseCacheFile IOException", LogAnonymous.b(e3));
                    r12 = context;
                    b(bufferedReader2, r12, inputStreamReader);
                    return null;
                } catch (IndexOutOfBoundsException e11) {
                    e2 = e11;
                    context = context;
                    inputStreamReader = null;
                    bufferedReader2 = null;
                    com.huawei.hwlogsmodel.LogUtil.e("Step_DataFileCache", "parseCacheFile IndexOutOfBoundsException", e2.getMessage());
                    r12 = context;
                    b(bufferedReader2, r12, inputStreamReader);
                    return null;
                } catch (UnsupportedOperationException e12) {
                    e = e12;
                    context = context;
                    inputStreamReader = null;
                    bufferedReader2 = null;
                    com.huawei.hwlogsmodel.LogUtil.e("Step_DataFileCache", "parseCacheFile UnsupportedOperationException", e.getMessage());
                    r12 = context;
                    b(bufferedReader2, r12, inputStreamReader);
                    return null;
                } catch (Throwable th3) {
                    th = th3;
                    inputStreamReader = null;
                }
            } catch (Throwable th4) {
                th = th4;
                bufferedReader3 = bufferedReader;
            }
        } catch (FileNotFoundException unused4) {
            context = 0;
        } catch (IOException e13) {
            e3 = e13;
            context = 0;
        } catch (IndexOutOfBoundsException e14) {
            e2 = e14;
            context = 0;
        } catch (UnsupportedOperationException e15) {
            e = e15;
            context = 0;
        } catch (Throwable th5) {
            th = th5;
            context = 0;
            inputStreamReader = null;
        }
    }

    private void b(BufferedReader bufferedReader, FileInputStream fileInputStream, InputStreamReader inputStreamReader) {
        if (bufferedReader != null) {
            try {
                bufferedReader.close();
            } catch (FileNotFoundException unused) {
                com.huawei.hwlogsmodel.LogUtil.e("Step_DataFileCache", "parseCacheFile reader.close() fileNotFoundException");
            } catch (IOException e) {
                com.huawei.hwlogsmodel.LogUtil.e("Step_DataFileCache", LogAnonymous.b(e));
            }
        }
        if (fileInputStream != null) {
            try {
                fileInputStream.close();
            } catch (FileNotFoundException unused2) {
                com.huawei.hwlogsmodel.LogUtil.e("Step_DataFileCache", "parseCacheFile fileInputStream.close() fileNotFoundException");
            } catch (IOException e2) {
                com.huawei.hwlogsmodel.LogUtil.e("Step_DataFileCache", LogAnonymous.b(e2));
            }
        }
        if (inputStreamReader != null) {
            try {
                inputStreamReader.close();
            } catch (FileNotFoundException unused3) {
                com.huawei.hwlogsmodel.LogUtil.e("Step_DataFileCache", "parseCacheFile inputStreamReader.close() fileNotFoundException");
            } catch (IOException e3) {
                com.huawei.hwlogsmodel.LogUtil.e("Step_DataFileCache", LogAnonymous.b(e3));
            }
        }
    }

    private boolean b(Context context) {
        File fileStreamPath;
        String str;
        com.huawei.hwlogsmodel.LogUtil.d("Step_DataFileCache", "clearFileCache");
        if (context != null && (str = this.f36645c) != null) {
            fileStreamPath = context.getFileStreamPath(str);
        } else {
            com.huawei.hwlogsmodel.LogUtil.j("Step_DataFileCache", "(context == null) || (mFileName == null)");
            fileStreamPath = null;
        }
        if (fileStreamPath == null || !fileStreamPath.exists()) {
            com.huawei.hwlogsmodel.LogUtil.d("Step_DataFileCache", "clearFileCache file not exists");
            return true;
        }
        boolean zDelete = fileStreamPath.delete();
        com.huawei.hwlogsmodel.LogUtil.d("Step_DataFileCache", "clearFileCache delete!", Boolean.valueOf(zDelete));
        return zDelete;
    }

    public boolean a(Context context) {
        com.huawei.hwlogsmodel.LogUtil.d("Step_DataFileCache", CervicalMucusRecord.Appearance.CLEAR);
        if (!e(context)) {
            com.huawei.hwlogsmodel.LogUtil.j("Step_DataFileCache", "isClearTempCacheFile in clear failed,exit");
            return false;
        }
        if (b(context)) {
            return true;
        }
        com.huawei.hwlogsmodel.LogUtil.j("Step_DataFileCache", "clearCacheFile in clear failed,exit");
        return false;
    }
}
