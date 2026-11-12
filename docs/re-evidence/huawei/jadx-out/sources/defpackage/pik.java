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

/* JADX INFO: loaded from: classes3.dex */
public class pik {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Object f45440c = new Object();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Object f45439b = new Object();

    public static String b(Context context, String str) {
        ByteArrayOutputStream byteArrayOutputStream;
        RandomAccessFile randomAccessFile;
        LogUtil.a("EzPluginManagerUtil", "enter readFileToData: filePath = ", str);
        if (TextUtils.isEmpty(str) || context == null) {
            return "";
        }
        String strE = CommonUtil.e(str);
        if (TextUtils.isEmpty(strE)) {
            LogUtil.j("EzPluginManagerUtil", "readFileToData legalPath is empty");
            return "";
        }
        RandomAccessFile randomAccessFile2 = null;
        FileLock fileLockTryLock = null;
        ByteArrayOutputStream byteArrayOutputStream2 = null;
        try {
            byteArrayOutputStream = new ByteArrayOutputStream();
            try {
                randomAccessFile = new RandomAccessFile(strE, "rw");
                try {
                    FileChannel channel = randomAccessFile.getChannel();
                    for (int i = 0; i < 3; i++) {
                        try {
                            fileLockTryLock = channel.tryLock();
                        } catch (OverlappingFileLockException unused) {
                            c();
                        }
                        if (fileLockTryLock != null) {
                            break;
                        }
                        c();
                    }
                    if (fileLockTryLock == null) {
                        LogUtil.j("EzPluginManagerUtil", "lock Valid");
                        IoUtils.c(randomAccessFile);
                        IoUtils.c(byteArrayOutputStream);
                        return "";
                    }
                    byte[] bArr = new byte[1024];
                    for (int i2 = randomAccessFile.read(bArr); i2 != -1; i2 = randomAccessFile.read(bArr)) {
                        byteArrayOutputStream.write(bArr, 0, i2);
                    }
                    fileLockTryLock.release();
                    channel.close();
                    IoUtils.c(randomAccessFile);
                    IoUtils.c(byteArrayOutputStream);
                    try {
                        return new String(byteArrayOutputStream.toByteArray(), "UTF-8");
                    } catch (UnsupportedEncodingException unused2) {
                        return "";
                    }
                } catch (IOException unused3) {
                    byteArrayOutputStream2 = byteArrayOutputStream;
                    try {
                        LogUtil.e("EzPluginManagerUtil", "readFileToData IOException");
                        IoUtils.c(randomAccessFile);
                        byteArrayOutputStream = byteArrayOutputStream2;
                    } catch (Throwable th) {
                        th = th;
                        byteArrayOutputStream = byteArrayOutputStream2;
                        randomAccessFile2 = randomAccessFile;
                        IoUtils.c(randomAccessFile2);
                        IoUtils.c(byteArrayOutputStream);
                        throw th;
                    }
                } catch (Throwable th2) {
                    th = th2;
                    randomAccessFile2 = randomAccessFile;
                    IoUtils.c(randomAccessFile2);
                    IoUtils.c(byteArrayOutputStream);
                    throw th;
                }
            } catch (IOException unused4) {
                randomAccessFile = null;
            } catch (Throwable th3) {
                th = th3;
                randomAccessFile = null;
                byteArrayOutputStream2 = byteArrayOutputStream;
                byteArrayOutputStream = byteArrayOutputStream2;
                randomAccessFile2 = randomAccessFile;
                IoUtils.c(randomAccessFile2);
                IoUtils.c(byteArrayOutputStream);
                throw th;
            }
        } catch (IOException unused5) {
            randomAccessFile = null;
        } catch (Throwable th4) {
            th = th4;
            byteArrayOutputStream = null;
            IoUtils.c(randomAccessFile2);
            IoUtils.c(byteArrayOutputStream);
            throw th;
        }
    }

    private static void c() {
        try {
            Thread.sleep(10L);
        } catch (InterruptedException unused) {
            LogUtil.e("EzPluginManagerUtil", "sleep Exception");
        }
    }

    public static boolean e(String str) {
        return new File(phs.d + str + File.separator + "description.json").exists();
    }

    public static void e(List<pic> list) {
        synchronized (f45439b) {
            if (list != null) {
                LogUtil.a("EzPluginManagerUtil", "clearPluginInfoList");
                list.clear();
            }
        }
    }

    public static pic c(Context context, String str) {
        String str2 = phs.d + str + File.separator + "description.json";
        if (!new File(str2).exists()) {
            return null;
        }
        String strB = b(context, str2);
        LogUtil.d("EzPluginManagerUtil", "getPluginInfo descriptionJson = ", strB);
        return phw.a(strB);
    }

    public static pic e(pio pioVar, List<pic> list, String str) {
        synchronized (f45439b) {
            pic picVarA = null;
            if (list != null) {
                if (!TextUtils.isEmpty(str)) {
                    for (pic picVar : list) {
                        if (picVar != null && str.equals(picVar.b())) {
                            picVarA = a(picVar, pioVar, list);
                            break;
                        }
                    }
                    return picVarA;
                }
            }
            return null;
        }
    }

    private static pic a(pic picVar, pio pioVar, List<pic> list) {
        if (pioVar != null && pioVar.c() != null && picVar != null) {
            String strG = picVar.g();
            String strB = picVar.b();
            if (!TextUtils.isEmpty(strG) && !TextUtils.isEmpty(strB)) {
                synchronized (f45439b) {
                    for (phz phzVar : pioVar.c()) {
                        String strA = phzVar.a();
                        if (!TextUtils.isEmpty(strA) && strA.equals(strB)) {
                            String strG2 = phzVar.g();
                            if (strG2 != null && strG2.equals(strG)) {
                                return picVar;
                            }
                            if (list == null) {
                                return null;
                            }
                            LogUtil.a("EzPluginManagerUtil", "getCachePluin remove cachePluin pluginInfoVersion: ", strG);
                            list.remove(picVar);
                            return null;
                        }
                    }
                    return null;
                }
            }
        }
        return null;
    }

    public static void a(List<pic> list, pic picVar, String str) {
        synchronized (f45439b) {
            if (!TextUtils.isEmpty(str) && list != null && picVar != null) {
                for (int i = 0; i < list.size(); i++) {
                    if (list.get(i).b().equals(str)) {
                        list.remove(i);
                        break;
                    }
                }
                phv phvVarH = picVar.h();
                if (str.equals(picVar.b()) && phvVarH != null) {
                    if (!phvVarH.f()) {
                        list.add(picVar);
                    }
                    if (!TextUtils.isEmpty(phvVarH.c())) {
                        list.add(picVar);
                    }
                }
            }
        }
    }

    public static String e() {
        String strB = phu.b(phs.f45392a, "MD5");
        return phs.d + "index" + File.separator + (strB != null ? strB.toLowerCase(Locale.ENGLISH) : null) + ".json";
    }

    public static String a(String str) {
        return c(pip.f45447a.get(str));
    }

    public static String c(String str) {
        return phs.d + "index" + File.separator + str + ".json";
    }

    public static boolean d(String str, boolean z) {
        if (z) {
            return false;
        }
        String str2 = pig.c().e(str) + File.separator + "done";
        String str3 = phs.d + str + File.separator + "description.json";
        LogUtil.d("EzPluginManagerUtil", "isPluginAvaiable donePath is = ", str2, " descriptionPath is = ", str3);
        boolean zExists = new File(str2).exists();
        LogUtil.d("EzPluginManagerUtil", "isPluginAvaiable isHavedoneFile is = ", Boolean.valueOf(zExists));
        if (!zExists) {
            return false;
        }
        boolean zExists2 = new File(str3).exists();
        LogUtil.d("EzPluginManagerUtil", "isPluginAvaiable isHaveDesFile is = ", Boolean.valueOf(zExists2));
        return zExists2;
    }

    public static boolean a(String str, String str2) {
        return TextUtils.isEmpty(str) || TextUtils.isEmpty(str2) || !str.equals(str2);
    }

    public static boolean b(Context context, String str, String str2) {
        LogUtil.a("EzPluginManagerUtil", "compareIndexVersion minIndexVersion is :", str, " indexVersion is : ", str2);
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2) || str.equals(str2)) {
            return true;
        }
        String[] strArrSplit = str.split("\\.");
        String[] strArrSplit2 = str2.split("\\.");
        LogUtil.a("EzPluginManagerUtil", "compareIndexVersion minIndexVersionArray length is ", Integer.valueOf(strArrSplit.length), " indexVersionArray length is ", Integer.valueOf(strArrSplit2.length));
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

    public static boolean c(String str, phz phzVar) {
        if (phzVar == null) {
            LogUtil.j("EzPluginManagerUtil", "isDeprecated this uuid is not exists");
            return false;
        }
        if (!phzVar.g().equalsIgnoreCase("Deprecated")) {
            return false;
        }
        LogUtil.a("EzPluginManagerUtil", "isDeprecated this plugin is deprecated ");
        d(str);
        return true;
    }

    private static void d(String str) {
        String str2 = phs.d + str + File.separator;
        String str3 = str2 + "done";
        File file = new File(str3);
        File file2 = new File(str2 + "description.json");
        if (file.exists()) {
            LogUtil.d("EzPluginManagerUtil", "deletePlugin isDeleteDone is = ", Boolean.valueOf(file.delete()));
        }
        if (file2.exists()) {
            LogUtil.d("EzPluginManagerUtil", "deletePlugin isDeleteDescription is = ", Boolean.valueOf(file2.delete()));
        }
    }
}
