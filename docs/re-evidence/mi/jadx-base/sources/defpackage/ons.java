package defpackage;

import android.content.Context;
import android.text.TextUtils;
import com.xiaomi.smarthome.plugin.update.PluginPackageConstant;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.channels.FileLock;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public class ons {
    public static rqh a(rqh rqhVar, String str) {
        long[] jArrI;
        if (rqhVar == null || (jArrI = i(str)) == null) {
            return null;
        }
        rqhVar.i = jArrI[0];
        rqhVar.j = jArrI[1];
        return rqhVar;
    }

    public static rqh b(String str) {
        rqh rqhVarE = null;
        try {
            String[] strArrJ = j(str);
            if (strArrJ == null || strArrJ.length < 4 || TextUtils.isEmpty(strArrJ[0]) || TextUtils.isEmpty(strArrJ[1]) || TextUtils.isEmpty(strArrJ[2]) || TextUtils.isEmpty(strArrJ[3])) {
                return null;
            }
            rqhVarE = rqh.e();
            rqhVarE.f18566a = Integer.parseInt(strArrJ[0]);
            rqhVarE.f18567b = strArrJ[1];
            rqhVarE.c = Integer.parseInt(strArrJ[2]);
            rqhVarE.h = Integer.parseInt(strArrJ[3]);
            return rqhVarE;
        } catch (Exception unused) {
            x9s.B("parse per key error");
            return rqhVarE;
        }
    }

    public static String c(rqh rqhVar) {
        return rqhVar.f18566a + PluginPackageConstant.RN_SDK_TIMESTAMP_PREFIX + rqhVar.f18567b + PluginPackageConstant.RN_SDK_TIMESTAMP_PREFIX + rqhVar.c + PluginPackageConstant.RN_SDK_TIMESTAMP_PREFIX + rqhVar.h;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v12, types: [int] */
    /* JADX WARN: Type inference failed for: r1v13 */
    /* JADX WARN: Type inference failed for: r1v14 */
    /* JADX WARN: Type inference failed for: r1v15, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v17 */
    /* JADX WARN: Type inference failed for: r1v18 */
    /* JADX WARN: Type inference failed for: r1v19 */
    /* JADX WARN: Type inference failed for: r1v20 */
    /* JADX WARN: Type inference failed for: r1v3 */
    /* JADX WARN: Type inference failed for: r1v4 */
    /* JADX WARN: Type inference failed for: r1v5, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r1v7 */
    /* JADX WARN: Type inference failed for: r1v8 */
    /* JADX WARN: Type inference failed for: r1v9 */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.CharSequence] */
    /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.CharSequence] */
    /* JADX WARN: Type inference failed for: r5v8, types: [java.lang.String[]] */
    /* JADX WARN: Type inference failed for: r5v9, types: [java.lang.Object] */
    public static HashMap<String, String> d(String str) throws Throwable {
        HashMap map = new HashMap();
        if (TextUtils.isEmpty(str) || !new File(str).exists()) {
            return map;
        }
        ?? r1 = 0;
        ?? length = 0;
        BufferedReader bufferedReader = null;
        try {
            try {
                BufferedReader bufferedReader2 = new BufferedReader(new FileReader(str));
                while (true) {
                    try {
                        String line = bufferedReader2.readLine();
                        if (line == null) {
                            break;
                        }
                        ?? Split = line.split("%%%");
                        length = Split.length;
                        if (length >= 2) {
                            length = 0;
                            length = 0;
                            if (!TextUtils.isEmpty(Split[0]) && !TextUtils.isEmpty(Split[1])) {
                                length = Split[0];
                                map.put(length, Split[1]);
                            }
                        }
                    } catch (Exception e) {
                        e = e;
                        bufferedReader = bufferedReader2;
                        x9s.s(e);
                        mgt.b(bufferedReader);
                        r1 = bufferedReader;
                    } catch (Throwable th) {
                        th = th;
                        r1 = bufferedReader2;
                        mgt.b(r1);
                        throw th;
                    }
                }
                mgt.b(bufferedReader2);
                r1 = length;
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (Exception e2) {
            e = e2;
        }
        return map;
    }

    /* JADX WARN: Code duplicated, block: B:111:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:70:0x00e1  */
    /* JADX WARN: Code duplicated, block: B:78:0x00f7  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v10, types: [java.io.BufferedReader, java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r4v11 */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r4v3, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r4v4 */
    /* JADX WARN: Type inference failed for: r4v5 */
    /* JADX WARN: Type inference failed for: r4v6 */
    /* JADX WARN: Type inference failed for: r4v7 */
    /* JADX WARN: Type inference failed for: r4v8 */
    /* JADX WARN: Type inference failed for: r4v9 */
    public static List<String> e(Context context, String str) throws Throwable {
        File file;
        RandomAccessFile randomAccessFile;
        ?? bufferedReader;
        rqh rqhVarA;
        ArrayList arrayList = new ArrayList();
        if (TextUtils.isEmpty(str) || !new File(str).exists()) {
            return arrayList;
        }
        FileLock fileLock = null;
        try {
            file = new File(str + ".lock");
            try {
                mgt.f(file);
                randomAccessFile = new RandomAccessFile(file, "rw");
                try {
                    FileLock fileLockLock = randomAccessFile.getChannel().lock();
                    try {
                        bufferedReader = new BufferedReader(new FileReader(str));
                        while (true) {
                            try {
                                String line = bufferedReader.readLine();
                                if (line == null) {
                                    break;
                                }
                                String[] strArrSplit = line.split("%%%");
                                if (strArrSplit.length >= 2 && !TextUtils.isEmpty(strArrSplit[0]) && !TextUtils.isEmpty(strArrSplit[1]) && (rqhVarA = a(b(strArrSplit[0]), strArrSplit[1])) != null) {
                                    arrayList.add(rqhVarA.d());
                                }
                            } catch (Exception e) {
                                e = e;
                                fileLock = fileLockLock;
                                bufferedReader = bufferedReader;
                                try {
                                    x9s.s(e);
                                    if (fileLock != null && fileLock.isValid()) {
                                        try {
                                            fileLock.release();
                                        } catch (IOException e2) {
                                            x9s.s(e2);
                                        }
                                    }
                                    mgt.b(randomAccessFile);
                                    mgt.b(bufferedReader);
                                    if (file != null) {
                                    }
                                    return arrayList;
                                } catch (Throwable th) {
                                    th = th;
                                    if (fileLock != null && fileLock.isValid()) {
                                        try {
                                            fileLock.release();
                                        } catch (IOException e3) {
                                            x9s.s(e3);
                                        }
                                    }
                                    mgt.b(randomAccessFile);
                                    mgt.b(bufferedReader);
                                    if (file == null) {
                                        throw th;
                                    }
                                    file.delete();
                                    throw th;
                                }
                            } catch (Throwable th2) {
                                th = th2;
                                fileLock = fileLockLock;
                                if (fileLock != null) {
                                    fileLock.release();
                                }
                                mgt.b(randomAccessFile);
                                mgt.b(bufferedReader);
                                if (file == null) {
                                    throw th;
                                }
                                file.delete();
                                throw th;
                            }
                        }
                        if (fileLockLock != null && fileLockLock.isValid()) {
                            try {
                                fileLockLock.release();
                            } catch (IOException e4) {
                                x9s.s(e4);
                            }
                        }
                        mgt.b(randomAccessFile);
                        mgt.b(bufferedReader);
                    } catch (Exception e5) {
                        e = e5;
                        bufferedReader = 0;
                    } catch (Throwable th3) {
                        th = th3;
                        bufferedReader = 0;
                    }
                } catch (Exception e6) {
                    e = e6;
                    bufferedReader = 0;
                } catch (Throwable th4) {
                    th = th4;
                    bufferedReader = 0;
                }
            } catch (Exception e7) {
                e = e7;
                randomAccessFile = null;
                bufferedReader = randomAccessFile;
                x9s.s(e);
                if (fileLock != null) {
                    fileLock.release();
                }
                mgt.b(randomAccessFile);
                mgt.b(bufferedReader);
                if (file != null) {
                    file.delete();
                }
                return arrayList;
            } catch (Throwable th5) {
                th = th5;
                randomAccessFile = null;
                bufferedReader = randomAccessFile;
                if (fileLock != null) {
                    fileLock.release();
                }
                mgt.b(randomAccessFile);
                mgt.b(bufferedReader);
                if (file == null) {
                    throw th;
                }
                file.delete();
                throw th;
            }
        } catch (Exception e8) {
            e = e8;
            file = null;
            randomAccessFile = null;
        } catch (Throwable th6) {
            th = th6;
            file = null;
            randomAccessFile = null;
        }
        file.delete();
        return arrayList;
    }

    public static void f(String str, HashMap<String, String> map) throws Throwable {
        BufferedWriter bufferedWriter;
        Throwable th;
        Exception e;
        if (TextUtils.isEmpty(str) || map == null || map.size() == 0) {
            return;
        }
        File file = new File(str);
        if (file.exists()) {
            file.delete();
        }
        try {
            bufferedWriter = new BufferedWriter(new FileWriter(file));
            try {
                try {
                    for (String str2 : map.keySet()) {
                        bufferedWriter.write(str2 + "%%%" + map.get(str2));
                        bufferedWriter.newLine();
                    }
                } catch (Exception e2) {
                    e = e2;
                    x9s.s(e);
                }
            } catch (Throwable th2) {
                th = th2;
                mgt.b(bufferedWriter);
                throw th;
            }
        } catch (Exception e3) {
            bufferedWriter = null;
            e = e3;
        } catch (Throwable th3) {
            bufferedWriter = null;
            th = th3;
            mgt.b(bufferedWriter);
            throw th;
        }
        mgt.b(bufferedWriter);
    }

    public static void g(String str, g3s[] g3sVarArr) {
        RandomAccessFile randomAccessFile;
        boolean zIsValid;
        if (g3sVarArr == null || g3sVarArr.length <= 0 || TextUtils.isEmpty(str)) {
            return;
        }
        FileLock fileLockLock = null;
        try {
            File file = new File(str + ".lock");
            mgt.f(file);
            randomAccessFile = new RandomAccessFile(file, "rw");
            try {
                fileLockLock = randomAccessFile.getChannel().lock();
                HashMap<String, String> mapD = d(str);
                for (g3s g3sVar : g3sVarArr) {
                    if (g3sVar != null) {
                        String strC = c((rqh) g3sVar);
                        long j = ((rqh) g3sVar).i;
                        long j2 = ((rqh) g3sVar).j;
                        if (!TextUtils.isEmpty(strC) && j > 0 && j2 >= 0) {
                            h(mapD, strC, j, j2);
                        }
                    }
                }
                f(str, mapD);
                if (fileLockLock != null && fileLockLock.isValid()) {
                    try {
                        fileLockLock.release();
                    } catch (IOException e) {
                        e = e;
                        x9s.s(e);
                    }
                }
            } catch (Throwable unused) {
                try {
                    x9s.B("failed to write perf to file ");
                    if (fileLockLock != null) {
                        if (zIsValid) {
                            try {
                            } catch (IOException e2) {
                                e = e2;
                                x9s.s(e);
                            }
                        }
                    }
                } finally {
                    if (fileLockLock != null && fileLockLock.isValid()) {
                        try {
                            fileLockLock.release();
                        } catch (IOException e3) {
                            x9s.s(e3);
                        }
                    }
                    mgt.b(randomAccessFile);
                }
            }
        } catch (Throwable unused2) {
            randomAccessFile = null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0050  */
    /* JADX WARN: Instruction removed from duplicated block: B:13:0x0050, please report this as an issue */
    public static void h(HashMap<String, String> map, String str, long j, long j2) {
        String str2;
        String str3 = map.get(str);
        if (TextUtils.isEmpty(str3)) {
            map.put(str, j + PluginPackageConstant.RN_SDK_TIMESTAMP_PREFIX + j2);
            return;
        }
        long[] jArrI = i(str3);
        if (jArrI != null) {
            long j3 = jArrI[0];
            if (j3 > 0) {
                long j4 = jArrI[1];
                if (j4 < 0) {
                    str2 = j + PluginPackageConstant.RN_SDK_TIMESTAMP_PREFIX + j2;
                } else {
                    str2 = (j + j3) + PluginPackageConstant.RN_SDK_TIMESTAMP_PREFIX + (j2 + j4);
                }
            } else {
                str2 = j + PluginPackageConstant.RN_SDK_TIMESTAMP_PREFIX + j2;
            }
        } else {
            str2 = j + PluginPackageConstant.RN_SDK_TIMESTAMP_PREFIX + j2;
        }
        map.put(str, str2);
    }

    public static long[] i(String str) {
        long[] jArr = new long[2];
        try {
            String[] strArrSplit = str.split(PluginPackageConstant.RN_SDK_TIMESTAMP_PREFIX);
            if (strArrSplit.length >= 2) {
                jArr[0] = Long.parseLong(strArrSplit[0].trim());
                jArr[1] = Long.parseLong(strArrSplit[1].trim());
            }
            return jArr;
        } catch (Exception e) {
            x9s.s(e);
            return null;
        }
    }

    public static String[] j(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        return str.split(PluginPackageConstant.RN_SDK_TIMESTAMP_PREFIX);
    }
}
