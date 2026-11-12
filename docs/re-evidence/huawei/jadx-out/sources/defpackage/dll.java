package defpackage;

import android.content.Context;
import android.text.TextUtils;
import com.huawei.hwlogsmodel.LogUtil;
import health.compact.a.CommonUtil;
import health.compact.a.IoUtils;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.io.UnsupportedEncodingException;
import java.nio.channels.FileChannel;
import java.nio.channels.FileLock;
import java.nio.channels.OverlappingFileLockException;
import java.util.List;
import java.util.Locale;

/* JADX INFO: loaded from: classes26.dex */
class dll {
    public static final Object e = new Object();
    private static final Object d = new Object();

    public static String a(Context context, String str) {
        LogUtil.a("ResourceHandleManagerUtil", "enter readFileToData: filePath = ", str);
        if (TextUtils.isEmpty(str) || context == null) {
            return "";
        }
        String strE = CommonUtil.e(str);
        if (TextUtils.isEmpty(strE)) {
            LogUtil.j("ResourceHandleManagerUtil", "readFileToData legalPath is empty");
            return "";
        }
        return c(strE);
    }

    private static String c(String str) throws Throwable {
        ByteArrayOutputStream byteArrayOutputStream;
        RandomAccessFile randomAccessFile = null;
        FileLock fileLockTryLock = null;
        randomAccessFile = null;
        randomAccessFile = null;
        RandomAccessFile randomAccessFile2 = null;
        try {
            byteArrayOutputStream = new ByteArrayOutputStream();
            try {
                try {
                    RandomAccessFile randomAccessFile3 = new RandomAccessFile(str, "rw");
                    try {
                        FileChannel channel = randomAccessFile3.getChannel();
                        for (int i = 0; i < 3; i++) {
                            try {
                                fileLockTryLock = channel.tryLock();
                            } catch (OverlappingFileLockException unused) {
                                e();
                            }
                            if (fileLockTryLock != null) {
                                break;
                            }
                            e();
                        }
                        if (fileLockTryLock == null) {
                            LogUtil.j("ResourceHandleManagerUtil", "lock Valid");
                            IoUtils.c(randomAccessFile3);
                            IoUtils.c(byteArrayOutputStream);
                            return "";
                        }
                        byte[] bArr = new byte[1024];
                        for (int i2 = randomAccessFile3.read(bArr); i2 != -1; i2 = randomAccessFile3.read(bArr)) {
                            byteArrayOutputStream.write(bArr, 0, i2);
                        }
                        fileLockTryLock.release();
                        channel.close();
                        IoUtils.c(randomAccessFile3);
                        IoUtils.c(byteArrayOutputStream);
                        try {
                            return new String(byteArrayOutputStream.toByteArray(), "UTF-8");
                        } catch (UnsupportedEncodingException unused2) {
                            return "";
                        }
                    } catch (IOException unused3) {
                        randomAccessFile2 = randomAccessFile3;
                        LogUtil.e("ResourceHandleManagerUtil", "readFileToData IOException");
                        IoUtils.c(randomAccessFile2);
                    } catch (Throwable th) {
                        th = th;
                        randomAccessFile = randomAccessFile3;
                        IoUtils.c(randomAccessFile);
                        IoUtils.c(byteArrayOutputStream);
                        throw th;
                    }
                } catch (IOException unused4) {
                }
            } catch (Throwable th2) {
                th = th2;
                byteArrayOutputStream = byteArrayOutputStream;
                randomAccessFile = randomAccessFile2;
            }
        } catch (IOException unused5) {
            byteArrayOutputStream = null;
        } catch (Throwable th3) {
            th = th3;
            byteArrayOutputStream = null;
        }
    }

    private static void e() {
        try {
            Thread.sleep(10L);
        } catch (InterruptedException unused) {
            LogUtil.e("ResourceHandleManagerUtil", "sleep Exception");
        }
    }

    public static boolean b(String str) {
        return new File(edf.f32777a + str + File.separator + "description.json").exists();
    }

    public static void a(List<edl> list) {
        synchronized (d) {
            if (list != null) {
                LogUtil.a("ResourceHandleManagerUtil", "clearPluginInfoList");
                list.clear();
            }
        }
    }

    public static edl c(Context context, String str) {
        String str2 = edf.f32777a + str + File.separator + "description.json";
        if (!new File(str2).exists()) {
            return null;
        }
        String strA = a(context, str2);
        LogUtil.d("ResourceHandleManagerUtil", "getPluginInfo descriptionJson = ", strA);
        return dlb.b(strA);
    }

    public static edl a(dkw dkwVar, List<edl> list, String str) {
        synchronized (d) {
            edl edlVarC = null;
            if (list != null) {
                if (!TextUtils.isEmpty(str)) {
                    for (edl edlVar : list) {
                        if (edlVar != null && str.equals(edlVar.c())) {
                            edlVarC = c(edlVar, dkwVar, list);
                            break;
                        }
                    }
                    return edlVarC;
                }
            }
            return null;
        }
    }

    private static edl c(edl edlVar, dkw dkwVar, List<edl> list) {
        if (dkwVar != null && dkwVar.b() != null && edlVar != null) {
            String strB = edlVar.b();
            String strC = edlVar.c();
            if (!TextUtils.isEmpty(strB) && !TextUtils.isEmpty(strC)) {
                synchronized (d) {
                    for (edx edxVar : dkwVar.b()) {
                        String strB2 = edxVar.b();
                        if (!TextUtils.isEmpty(strB2) && strB2.equals(strC)) {
                            String strE = edxVar.e();
                            if (strE != null && strE.equals(strB)) {
                                return edlVar;
                            }
                            if (list == null) {
                                return null;
                            }
                            LogUtil.a("ResourceHandleManagerUtil", "getCachePluin remove cachePluin pluginInfoVersion: ", strB);
                            list.remove(edlVar);
                            return null;
                        }
                    }
                    return null;
                }
            }
        }
        return null;
    }

    public static void a(List<edl> list, edl edlVar, String str) {
        synchronized (d) {
            if (!TextUtils.isEmpty(str) && list != null && edlVar != null) {
                for (int i = 0; i < list.size(); i++) {
                    if (list.get(i).c().equals(str)) {
                        list.remove(i);
                        break;
                    }
                }
                edz edzVarI = edlVar.i();
                if (str.equals(edlVar.c()) && edzVarI != null) {
                    if (!edzVarI.bs()) {
                        list.add(edlVar);
                    }
                    if (!TextUtils.isEmpty(edzVarI.ah())) {
                        list.add(edlVar);
                    }
                }
            }
        }
    }

    public static String d() {
        String strE = dlk.e(edf.d, "MD5");
        return edf.f32777a + "index" + File.separator + (strE != null ? strE.toLowerCase(Locale.ENGLISH) : null) + ".json";
    }

    public static String c() {
        String strD = d();
        if (CommonUtil.bu() || new File(strD).exists()) {
            return strD;
        }
        return edf.f32777a + "index" + File.separator + "3eaffc90df3744d7a82fda381355dc1e.json";
    }

    public static String e(String str) {
        return a(pip.f45447a.get(str));
    }

    public static String a(String str) {
        return edf.f32777a + "index" + File.separator + str + ".json";
    }

    public static boolean b(String str, boolean z) {
        if (z) {
            return false;
        }
        String str2 = dli.c().d(str) + File.separator + "done";
        String str3 = edf.f32777a + str + File.separator + "description.json";
        LogUtil.d("ResourceHandleManagerUtil", "isPluginAvaiable donePath is = ", str2, " descriptionPath is = ", str3);
        boolean zExists = new File(str2).exists();
        LogUtil.d("ResourceHandleManagerUtil", "isPluginAvaiable isHavedoneFile is = ", Boolean.valueOf(zExists));
        if (!zExists) {
            return false;
        }
        boolean zExists2 = new File(str3).exists();
        LogUtil.d("ResourceHandleManagerUtil", "isPluginAvaiable isHaveDesFile is = ", Boolean.valueOf(zExists2));
        return zExists2;
    }

    public static boolean e(String str, String str2) {
        return TextUtils.isEmpty(str) || TextUtils.isEmpty(str2) || !str.equals(str2);
    }

    public static boolean d(Context context, String str, String str2) {
        LogUtil.a("ResourceHandleManagerUtil", "compareIndexVersion minIndexVersion is :", str, " indexVersion is : ", str2);
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2) || str.equals(str2)) {
            return true;
        }
        String[] strArrSplit = str.split("\\.");
        String[] strArrSplit2 = str2.split("\\.");
        LogUtil.a("ResourceHandleManagerUtil", "compareIndexVersion minIndexVersionArray length is ", Integer.valueOf(strArrSplit.length), " indexVersionArray length is ", Integer.valueOf(strArrSplit2.length));
        int iMin = Math.min(strArrSplit.length, strArrSplit2.length);
        for (int i = 0; i < iMin; i++) {
            int iN = CommonUtil.n(context, strArrSplit2[i]) - CommonUtil.n(context, strArrSplit[i]);
            if (iN > 0) {
                return true;
            }
            if (iN < 0) {
                return false;
            }
        }
        return true;
    }

    public static boolean a(String str, edx edxVar) {
        if (edxVar == null) {
            LogUtil.j("ResourceHandleManagerUtil", "isDeprecated this uuid is not exists");
            return false;
        }
        if (!edxVar.e().equalsIgnoreCase("Deprecated")) {
            return false;
        }
        LogUtil.a("ResourceHandleManagerUtil", "isDeprecated this plugin is deprecated ");
        d(str);
        return true;
    }

    private static void d(String str) {
        String str2 = edf.f32777a + str + File.separator;
        String str3 = str2 + "done";
        File file = new File(str3);
        File file2 = new File(str2 + "description.json");
        if (file.exists()) {
            LogUtil.d("ResourceHandleManagerUtil", "deletePlugin isDeleteDone is = ", Boolean.valueOf(file.delete()));
        }
        if (file2.exists()) {
            LogUtil.d("ResourceHandleManagerUtil", "deletePlugin isDeleteDescription is = ", Boolean.valueOf(file2.delete()));
        }
    }
}
