package health.compact.a;

import android.content.ContentValues;
import android.content.SharedPreferences;
import android.database.Cursor;
import android.database.sqlite.SQLiteException;
import android.net.Uri;
import android.os.Process;
import android.text.TextUtils;
import androidx.media3.extractor.ts.PsExtractor;
import com.huawei.haf.common.exception.ExceptionUtils;
import com.huawei.haf.common.os.FileUtils;
import com.huawei.haf.common.utils.AppInfoUtils;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.operation.utils.Constants;
import com.huawei.utils.FoundationCommonUtil;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.channels.FileLock;
import java.nio.charset.StandardCharsets;
import java.security.GeneralSecurityException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.KeyGenerator;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* JADX INFO: loaded from: classes.dex */
public class KeyManager {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final List<String> f36585a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final byte[] f36586b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final Uri f36587c;
    private static final Uri d;
    private static final String e;
    private static String f;
    private static Map<Integer, byte[]> g;
    private static boolean i;

    static {
        String str = "content://" + BaseApplication.getAppPackage() + ".data.backup.provider/";
        e = str;
        d = Uri.parse(str + "backupCp");
        f36587c = Uri.parse(DbManager.e + "module_1009_backup_table");
        f36586b = new byte[1];
        ArrayList arrayList = new ArrayList(10);
        f36585a = arrayList;
        i = true;
        g = new HashMap();
        arrayList.add("com_huawei_health1.db");
        arrayList.add("com_huawei_health7.db");
        arrayList.add("com_huawei_health10.db");
        arrayList.add("com_huawei_health22.db");
        arrayList.add("com_huawei_health32.db");
        arrayList.add("com_huawei_health1020.db");
        arrayList.add("com_huawei_health10004.db");
        arrayList.add("com_huawei_health10031.db");
        arrayList.add("com_huawei_health10033.db");
        arrayList.add("com_huawei_health10034.db");
        arrayList.add("com_huawei_health20003.db");
        arrayList.add("com_huawei_health20004.db");
        arrayList.add("com_huawei_health20005.db");
        arrayList.add("com_huawei_health20008.db");
        arrayList.add("com_huawei_health100007.db");
        arrayList.add("com_huawei_health101010.db");
        arrayList.add("hihealth_003.db");
        arrayList.add("com_huawei_health_UdsDevicesDatas.db");
        arrayList.add("contact_sync_data.db");
        arrayList.add("calendar_sync_data.db");
    }

    private KeyManager() {
    }

    public static void e() {
        if (KeyStoreUtils.f36589b) {
            return;
        }
        synchronized (f36586b) {
            f = null;
            i = false;
        }
    }

    public static byte[] a(int i2) {
        return e(i2);
    }

    static byte[] e(int i2) {
        byte[] bArrC;
        synchronized (f36586b) {
            try {
                if (KeyStoreUtils.f36589b) {
                    bArrC = b(i2 + 1000);
                } else {
                    bArrC = c(i2, true);
                }
            } catch (Exception unused) {
                com.huawei.hwlogsmodel.LogUtil.e("KeyManager", "getWorkKey Exception");
                bArrC = null;
            }
        }
        return bArrC;
    }

    private static byte[] b(int i2) {
        byte[] bArr = g.get(Integer.valueOf(i2));
        if (bArr != null && bArr.length != 0) {
            return bArr;
        }
        byte[] bArrF = f(i2);
        if (bArrF != null && bArrF.length > 0) {
            g.put(Integer.valueOf(i2), bArrF);
        }
        return bArrF;
    }

    private static byte[] f(int i2) {
        String strM = m(i2);
        if (TextUtils.isEmpty(strM) || strM.length() < 88) {
            return i(i2);
        }
        return KeyStoreUtils.b(strM.substring(0, 88));
    }

    private static byte[] c(int i2, boolean z) {
        byte[] bArr = g.get(Integer.valueOf(i2));
        if (bArr != null && bArr.length != 0) {
            return bArr;
        }
        byte[] bArrB = b(i2, z);
        if (bArrB != null && bArrB.length > 0) {
            g.put(Integer.valueOf(i2), bArrB);
        }
        return bArrB;
    }

    private static byte[] b(int i2, boolean z) {
        byte[] bArrG;
        synchronized (f36586b) {
            try {
                try {
                    try {
                        byte[] bytes = l().getBytes(StandardCharsets.UTF_8);
                        String strD = d(i2);
                        com.huawei.hwlogsmodel.LogUtil.d("KeyManager", "getWorkKeyByContentProvider get work key xxx", e(strD));
                        if (TextUtils.isEmpty(strD) && z) {
                            for (int i3 = 0; i3 <= 30; i3++) {
                                try {
                                    f36586b.wait(300L);
                                } catch (InterruptedException unused) {
                                    com.huawei.hwlogsmodel.LogUtil.d("KeyManager", "getWorkKeyByContentProvider sleep 1000");
                                }
                                strD = d(i2);
                                if (!"".equals(strD)) {
                                    com.huawei.hwlogsmodel.LogUtil.d("KeyManager", "getWorkKeyByContentProvider retry work sleep==ok ");
                                    break;
                                }
                            }
                        }
                        if (!TextUtils.isEmpty(strD) && strD.length() >= 24) {
                            String strSubstring = strD.substring(0, 24);
                            String strSubstring2 = strD.substring(24);
                            com.huawei.hwlogsmodel.LogUtil.d("KeyManager", "getWorkKeyByContentProvider get work key iv ", strSubstring, "key ", strSubstring2);
                            try {
                                bArrG = c(Base64.b(strSubstring2), bytes, Base64.b(strSubstring));
                            } catch (GeneralSecurityException unused2) {
                                com.huawei.hwlogsmodel.LogUtil.e("KeyManager", "getWorkKeyByContentProvider desEncryptByte Exception");
                                bArrG = g(i2);
                            }
                            if (com.huawei.hwlogsmodel.common.LogConfig.a()) {
                                com.huawei.hwlogsmodel.LogUtil.d("KeyManager", "getWorkKeyByContentProvider finish dec,secret is:", HEXUtils.a(bArrG));
                            }
                            return bArrG;
                        }
                        com.huawei.hwlogsmodel.LogUtil.d("KeyManager", "getWorkKeyByContentProvider secretInfo is null");
                        return a(i2, bytes);
                    } catch (RuntimeException e2) {
                        throw e2;
                    }
                } catch (Exception unused3) {
                    com.huawei.hwlogsmodel.LogUtil.e("KeyManager", "getWorkKeyByContentProvider Exception");
                    return null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private static byte[] g(int i2) {
        synchronized (f36586b) {
            f = null;
        }
        return a(i2, l().getBytes(StandardCharsets.UTF_8));
    }

    private static String l() {
        synchronized (f36586b) {
            if (i && !TextUtils.isEmpty(f)) {
                return f;
            }
            com.huawei.hwlogsmodel.LogUtil.d("KeyManager", "getRootKeyByContentProvider");
            String strJ = j(1);
            com.huawei.hwlogsmodel.LogUtil.d("KeyManager", "getRootKeyByContentProvider oldFirstStringAll:", e(strJ));
            String strSubstring = strJ.substring(2);
            com.huawei.hwlogsmodel.LogUtil.d("KeyManager", "getRootKeyByContentProvider oldFirstString:", e(strSubstring));
            String strJ2 = j(2);
            com.huawei.hwlogsmodel.LogUtil.d("KeyManager", "getRootKeyByContentProvider oldSecondString:", e(strJ2));
            String strJ3 = j(3);
            com.huawei.hwlogsmodel.LogUtil.d("KeyManager", "getRootKeyByContentProvider oldThirdString:", e(strJ3));
            String strA = a(strSubstring, strJ2, strJ3);
            if (i) {
                f = strA;
            }
            return strA;
        }
    }

    static String d(int i2) {
        String strM;
        synchronized (f36586b) {
            strM = m(i2);
        }
        return strM;
    }

    private static String m(int i2) {
        return e(String.valueOf(i2), f36587c);
    }

    private static String d(String str) {
        return e(str, f36587c);
    }

    private static String f(String str) {
        return BaseApplication.getContext().getSharedPreferences(str, 0).getString("id", "");
    }

    private static void s() {
        com.huawei.hwlogsmodel.LogUtil.d("KeyManager", "moveAllRootToContentProvider begin");
        String strF = f("encrypt_sharedpreferences_name4");
        if (TextUtils.isEmpty(strF)) {
            return;
        }
        com.huawei.hwlogsmodel.LogUtil.d("KeyManager", "moveAllRootToContentProvider c1 save to Cp", e(strF));
        d("key_1", strF);
        String strF2 = f("encrypt_sharedpreferences_name2");
        com.huawei.hwlogsmodel.LogUtil.d("KeyManager", "moveAllRootToContentProvider c2 save to Cp", e(strF2));
        d("key_2", strF2);
        String strF3 = f("encrypt_sharedpreferences_name3");
        com.huawei.hwlogsmodel.LogUtil.d("KeyManager", "moveAllRootToContentProvider c3 save to Cp", e(strF3));
        d("key_3", strF3);
    }

    private static String k(int i2) {
        return BaseApplication.getContext().getSharedPreferences("encrypt_sharedpreferences_name1", 0).getString(String.valueOf(i2), "");
    }

    private static void r(int i2) {
        com.huawei.hwlogsmodel.LogUtil.d("KeyManager", "moveWorkKeyToContentProvider begin", Integer.valueOf(i2));
        String strK = k(i2);
        com.huawei.hwlogsmodel.LogUtil.d("KeyManager", "moveWorkKeyToContentProvider key ", e(strK));
        if (TextUtils.isEmpty(strK)) {
            return;
        }
        com.huawei.hwlogsmodel.LogUtil.d("KeyManager", "moveWorkKeyToContentProvider save to Cp");
        d(String.valueOf(i2), strK);
    }

    private static String j(int i2) {
        String strD = d("key_" + i2);
        WhiteBoxManager whiteBoxManagerB = WhiteBoxManager.b();
        if (TextUtils.isEmpty(strD)) {
            for (int i3 = 0; i3 <= 30; i3++) {
                try {
                    f36586b.wait(300L);
                } catch (Exception unused) {
                    com.huawei.hwlogsmodel.LogUtil.d("KeyManager", "getByContentProvider retry sleep ");
                }
                strD = d("key_" + i2);
                if (!TextUtils.isEmpty(strD)) {
                    com.huawei.hwlogsmodel.LogUtil.d("KeyManager", "getByContentProvider retry sleep ok break for Cp", Integer.valueOf(i2));
                    break;
                }
            }
        }
        if (TextUtils.isEmpty(strD)) {
            com.huawei.hwlogsmodel.LogUtil.d("KeyManager", "getByContentProvider get always is null for C", Integer.valueOf(i2));
            return c(i2);
        }
        try {
            String str = new String(whiteBoxManagerB.a(Base64.b(strD)), StandardCharsets.UTF_8);
            if (!TextUtils.isEmpty(str)) {
                return str;
            }
            com.huawei.hwlogsmodel.LogUtil.e("KeyManager", "getByContentProvider getError for C", Integer.valueOf(i2));
            return c(i2);
        } catch (Exception unused2) {
            com.huawei.hwlogsmodel.LogUtil.e("KeyManager", "getByContentProvider Exception");
            return c(i2);
        }
    }

    private static byte[] m() {
        try {
            SecureRandom secureRandom = new SecureRandom();
            KeyGenerator keyGenerator = KeyGenerator.getInstance("AES");
            keyGenerator.init(256, secureRandom);
            return keyGenerator.generateKey().getEncoded();
        } catch (RuntimeException unused) {
            return new byte[0];
        } catch (Exception unused2) {
            return new byte[0];
        }
    }

    static byte[] b() {
        try {
            SecureRandom secureRandom = new SecureRandom();
            KeyGenerator keyGenerator = KeyGenerator.getInstance("AES");
            keyGenerator.init(128, secureRandom);
            return keyGenerator.generateKey().getEncoded();
        } catch (RuntimeException unused) {
            return new byte[0];
        } catch (Exception unused2) {
            return new byte[0];
        }
    }

    private static byte[] n() {
        try {
            SecureRandom secureRandom = new SecureRandom();
            KeyGenerator keyGenerator = KeyGenerator.getInstance("AES");
            keyGenerator.init(PsExtractor.AUDIO_STREAM, secureRandom);
            return keyGenerator.generateKey().getEncoded();
        } catch (RuntimeException unused) {
            return new byte[0];
        } catch (Exception unused2) {
            return new byte[0];
        }
    }

    private static String e(byte[] bArr, byte[] bArr2, byte[] bArr3) {
        String strSubstring = Base64.b(bArr).substring(0, 32);
        String strSubstring2 = Base64.b(bArr2).substring(0, 32);
        String strSubstring3 = Base64.b(bArr3).substring(0, 32);
        char[] charArray = strSubstring.toCharArray();
        char[] charArray2 = strSubstring2.toCharArray();
        char[] charArray3 = strSubstring3.toCharArray();
        int length = charArray.length;
        char[] cArr = new char[length];
        for (int i2 = 0; i2 < length; i2++) {
            cArr[i2] = (char) ((((charArray[i2] << 4) ^ charArray2[i2]) >> 6) ^ charArray3[i2]);
        }
        return String.valueOf(cArr);
    }

    private static void d(String str, byte[] bArr, byte[] bArr2) {
        String str2 = Base64.b(bArr2) + Base64.b(bArr);
        com.huawei.hwlogsmodel.LogUtil.d("KeyManager", "saveWorkKeyToContentProvider, ok; dataType:", str);
        d(str, str2);
    }

    private static byte[] a(byte[] bArr, byte[] bArr2, byte[] bArr3) throws Exception {
        Cipher cipher = Cipher.getInstance("AES/CBC/PKCS7Padding");
        cipher.init(1, new SecretKeySpec(bArr2, "AES"), new IvParameterSpec(bArr3));
        return cipher.doFinal(bArr);
    }

    static byte[] c(byte[] bArr, byte[] bArr2, byte[] bArr3) throws GeneralSecurityException {
        if (com.huawei.hwlogsmodel.common.LogConfig.a()) {
            com.huawei.hwlogsmodel.LogUtil.d("KeyManager", "desEncryptByte data is:", e(HEXUtils.a(bArr)), ";secret is:", e(HEXUtils.a(bArr2)), ";iv is:", e(HEXUtils.a(bArr3)));
        }
        Cipher cipher = Cipher.getInstance("AES/CBC/PKCS7Padding");
        cipher.init(2, new SecretKeySpec(bArr2, "AES"), new IvParameterSpec(bArr3));
        return cipher.doFinal(bArr);
    }

    private static String a(String str, String str2, String str3) {
        char[] charArray = str.toCharArray();
        char[] charArray2 = str2.toCharArray();
        char[] charArray3 = str3.toCharArray();
        int length = charArray.length;
        char[] cArr = new char[length];
        for (int i2 = 0; i2 < length; i2++) {
            cArr[i2] = (char) ((((charArray[i2] << 4) ^ charArray2[i2]) >> 6) ^ charArray3[i2]);
        }
        return String.valueOf(cArr);
    }

    private static void d(String str, String str2) {
        b(str, str2, false);
    }

    private static void b(String str, String str2, boolean z) {
        synchronized (f36586b) {
            com.huawei.hwlogsmodel.LogUtil.d("KeyManager", "backUpSecretKey, key: ", str + ", value: " + str2 + ", updateIfExist: " + z);
            e(str, str2);
            DbManager.a(BaseApplication.getContext(), String.valueOf(1009), "backup_table", 2, "backupKey varchar primary key ,backupValue varchar");
            ContentValues contentValues = new ContentValues();
            contentValues.put("backupKey", str);
            contentValues.put("backupValue", str2);
            if (!b(str, f36587c)) {
                DbManager.c(BaseApplication.getContext(), String.valueOf(1009), "backup_table", 2, contentValues);
            } else if (z) {
                DbManager.d dVar = new DbManager.d();
                dVar.b(BaseApplication.getContext());
                dVar.c(String.valueOf(1009));
                dVar.b("backup_table");
                dVar.e(2);
                DbManager.d(dVar, contentValues, "backupKey like ?", new String[]{str});
            }
            d(str, str2, z);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v24 */
    /* JADX WARN: Type inference failed for: r5v3 */
    /* JADX WARN: Type inference failed for: r5v4, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r5v5, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r5v8 */
    /* JADX WARN: Type inference failed for: r7v3, types: [java.lang.StringBuilder] */
    public static void c() {
        ?? canonicalPath;
        RandomAccessFile randomAccessFile;
        synchronized (f36586b) {
            com.huawei.hwlogsmodel.LogUtil.d("KeyManager", "initAllKey begin");
            FileLock fileLockLock = null;
            try {
                canonicalPath = BaseApplication.getContext().getFilesDir().getCanonicalPath();
            } catch (IOException e2) {
                com.huawei.hwlogsmodel.LogUtil.e("KeyManager", "initAllKey(),", e2.getMessage());
                canonicalPath = 0;
            }
            try {
                File file = new File(canonicalPath + "/lock.xml");
                try {
                    if (!file.exists()) {
                        com.huawei.hwlogsmodel.LogUtil.d("KeyManager", "initAllKey create file result: ", Boolean.valueOf(file.createNewFile()));
                    }
                    randomAccessFile = new RandomAccessFile(file, "rw");
                    while (fileLockLock == null) {
                        try {
                            try {
                                try {
                                    fileLockLock = randomAccessFile.getChannel().lock();
                                } catch (Exception unused) {
                                    com.huawei.hwlogsmodel.LogUtil.e("KeyManager", "initAllKey lock get Exception");
                                }
                            } catch (Exception unused2) {
                                com.huawei.hwlogsmodel.LogUtil.e("KeyManager", "initAllKey Exception");
                                if (fileLockLock != null) {
                                    try {
                                        com.huawei.hwlogsmodel.LogUtil.d("KeyManager", "initAllKey release");
                                        fileLockLock.release();
                                    } catch (IOException unused3) {
                                        com.huawei.hwlogsmodel.LogUtil.e("KeyManager", "initAllKey IOException");
                                    }
                                }
                                IoUtils.c(randomAccessFile);
                            }
                        } catch (FileNotFoundException unused4) {
                            com.huawei.hwlogsmodel.LogUtil.e("KeyManager", "initAllKey FileNotFoundException");
                            if (fileLockLock != null) {
                                try {
                                    com.huawei.hwlogsmodel.LogUtil.d("KeyManager", "initAllKey release");
                                    fileLockLock.release();
                                } catch (IOException unused5) {
                                    com.huawei.hwlogsmodel.LogUtil.e("KeyManager", "initAllKey IOException");
                                }
                            }
                            IoUtils.c(randomAccessFile);
                        } catch (IOException unused6) {
                            com.huawei.hwlogsmodel.LogUtil.e("KeyManager", "initAllKey IOException ");
                            if (fileLockLock != null) {
                                try {
                                    com.huawei.hwlogsmodel.LogUtil.d("KeyManager", "initAllKey release");
                                    fileLockLock.release();
                                } catch (IOException unused7) {
                                    com.huawei.hwlogsmodel.LogUtil.e("KeyManager", "initAllKey IOException");
                                }
                            }
                            IoUtils.c(randomAccessFile);
                        }
                    }
                    b(!KeyStoreUtils.f36589b);
                    n(14);
                    n(13);
                    n(1);
                    n(2);
                    if (fileLockLock != null) {
                        try {
                            com.huawei.hwlogsmodel.LogUtil.d("KeyManager", "initAllKey release");
                            fileLockLock.release();
                        } catch (IOException unused8) {
                            com.huawei.hwlogsmodel.LogUtil.e("KeyManager", "initAllKey IOException");
                        }
                    }
                } catch (FileNotFoundException unused9) {
                    randomAccessFile = null;
                } catch (IOException unused10) {
                    randomAccessFile = null;
                } catch (Exception unused11) {
                    randomAccessFile = null;
                } catch (Throwable th) {
                    th = th;
                    canonicalPath = 0;
                    if (0 != 0) {
                        try {
                            com.huawei.hwlogsmodel.LogUtil.d("KeyManager", "initAllKey release");
                            fileLockLock.release();
                        } catch (IOException unused12) {
                            com.huawei.hwlogsmodel.LogUtil.e("KeyManager", "initAllKey IOException");
                        }
                    }
                    IoUtils.c(canonicalPath);
                    throw th;
                }
                IoUtils.c(randomAccessFile);
            } catch (Throwable th2) {
                th = th2;
            }
        }
    }

    private static void b(boolean z) {
        if (z) {
            k();
            o();
            r();
        }
    }

    private static void k() {
        synchronized (f36586b) {
            String str = new SimpleDateFormat("MM").format(new Date(System.currentTimeMillis()));
            String strD = d("key_1");
            WhiteBoxManager whiteBoxManagerB = WhiteBoxManager.b();
            if (TextUtils.isEmpty(strD)) {
                s();
                strD = d("key_1");
                com.huawei.hwlogsmodel.LogUtil.d("KeyManager", "initFirstByContentProvider retry c1 ", strD);
            }
            if (TextUtils.isEmpty(strD)) {
                d("key_1", Base64.b(whiteBoxManagerB.e(str + Base64.b(n()))));
            } else {
                try {
                    a("key_1", strD);
                } catch (Exception unused) {
                    com.huawei.hwlogsmodel.LogUtil.e("KeyManager", "initFirstByContentProvider Exception");
                }
            }
        }
    }

    private static void o() {
        synchronized (f36586b) {
            String strD = d("key_2");
            WhiteBoxManager whiteBoxManagerB = WhiteBoxManager.b();
            if ("".equals(strD)) {
                d("key_2", Base64.b(whiteBoxManagerB.e(Base64.b(n()))));
            } else {
                try {
                    a("key_2", strD);
                } catch (Exception unused) {
                    com.huawei.hwlogsmodel.LogUtil.e("KeyManager", "initSecondByContentProvider Exception");
                }
            }
        }
    }

    private static void r() {
        synchronized (f36586b) {
            String strD = d("key_3");
            WhiteBoxManager whiteBoxManagerB = WhiteBoxManager.b();
            if ("".equals(strD)) {
                d("key_3", Base64.b(whiteBoxManagerB.e(Base64.b(n()))));
            } else {
                try {
                    a("key_3", strD);
                } catch (Exception unused) {
                    com.huawei.hwlogsmodel.LogUtil.e("KeyManager", "initThirdByContentProvider Exception");
                }
            }
        }
    }

    private static void n(int i2) throws Throwable {
        if (!KeyStoreUtils.f36589b) {
            if (b(String.valueOf(i2 + 1000), f36587c)) {
                a(true);
                return;
            } else {
                l(i2);
                return;
            }
        }
        try {
            o(i2);
        } catch (Exception e2) {
            health.compact.a.hwlogsmodel.ReleaseLogUtil.a("HiH_KeyManager", "initSecurityKeyNew Exception:", ExceptionUtils.c(e2));
        }
    }

    private static void o(int i2) throws Throwable {
        health.compact.a.hwlogsmodel.ReleaseLogUtil.d("HiH_KeyManager", "initSecurityKeyForKeyStore dataType:", Integer.valueOf(i2));
        int i3 = i2 + 1000;
        String strM = m(i3);
        if (!TextUtils.isEmpty(strM)) {
            String androidId = FoundationCommonUtil.getAndroidId(BaseApplication.getContext());
            if (TextUtils.isEmpty(androidId)) {
                a(String.valueOf(i3), strM);
                return;
            }
            String strSubstring = strM.length() >= 88 ? strM.substring(88) : null;
            if (TextUtils.isEmpty(strSubstring)) {
                strSubstring = b(androidId);
            }
            com.huawei.hwlogsmodel.LogUtil.d("KeyManager", "initSecurityKeyForKeyStore, newAndroidID: ", androidId, ", oldAndroidID: ", strSubstring);
            if (androidId.equals(strSubstring)) {
                a(String.valueOf(i3), strM);
                return;
            } else {
                health.compact.a.hwlogsmodel.ReleaseLogUtil.d("HiH_KeyManager", "androidId not consistent, do clean...");
                if (f()) {
                    return;
                }
            }
        }
        com.huawei.hwlogsmodel.LogUtil.a("KeyManager", "secret key is empty, creating new secure key... dataType: ", Integer.valueOf(i2));
        a(i2, i3);
    }

    private static boolean f() {
        health.compact.a.hwlogsmodel.ReleaseLogUtil.d("HiH_KeyManager", "clearApplicationData begin");
        String strC = KeyValDbManager.d(BaseApplication.getContext()).c("user_id");
        Uri uri = f36587c;
        Uri uri2 = d;
        a(1014, uri, uri2);
        a(1013, uri, uri2);
        a(1001, uri, uri2);
        a(1002, uri, uri2);
        FileUtils.e(AppInfoUtils.b(null), false);
        health.compact.a.hwlogsmodel.ReleaseLogUtil.d("HiH_KeyManager", "deleteDirectory end");
        SharedPreferences.Editor editorEdit = BaseApplication.getContext().getSharedPreferences("is_clone", 0).edit();
        editorEdit.putBoolean("is_clone", true);
        editorEdit.putString("clone_user_id", strC);
        editorEdit.commit();
        health.compact.a.hwlogsmodel.ReleaseLogUtil.d("HiH_KeyManager", "clean clone data end, exit by app kill self");
        Process.killProcess(Process.myPid());
        return true;
    }

    public static boolean a(boolean z) {
        String strC;
        health.compact.a.hwlogsmodel.ReleaseLogUtil.d("HiH_KeyManager", "cleanCloneData begin isClone=", Boolean.valueOf(z));
        j();
        Uri uri = f36587c;
        Uri uri2 = d;
        a(1014, uri, uri2);
        a(1013, uri, uri2);
        a(1001, uri, uri2);
        a(1002, uri, uri2);
        if (z) {
            SharedPreferences.Editor editorEdit = BaseApplication.getContext().getSharedPreferences("is_clone", 0).edit();
            editorEdit.putBoolean("is_clone", true);
            if (!"1".equalsIgnoreCase(VersionDbManager.b(BaseApplication.getContext()).d("allow_login_or_not"))) {
                strC = "";
            } else {
                strC = KeyValDbManager.d(BaseApplication.getContext()).c("user_id");
            }
            editorEdit.putString("clone_user_id", strC);
            editorEdit.commit();
        }
        health.compact.a.hwlogsmodel.ReleaseLogUtil.d("HiH_KeyManager", "clean clone data end, exit by app kill self");
        Process.killProcess(Process.myPid());
        return true;
    }

    public static boolean g() {
        return BaseApplication.getContext().getSharedPreferences("is_clone", 0).getBoolean("is_clone", false);
    }

    public static String d() {
        String string = BaseApplication.getContext().getSharedPreferences("is_clone", 0).getString("clone_user_id", "");
        com.huawei.hwlogsmodel.LogUtil.d("KeyManager", "getCloneUserId cloneUserId = ", string);
        return string;
    }

    public static void a() {
        com.huawei.hwlogsmodel.LogUtil.a("KeyManager", "clearCloneFlag enter");
        SharedPreferences.Editor editorEdit = BaseApplication.getContext().getSharedPreferences("is_clone", 0).edit();
        editorEdit.putBoolean("is_clone", false);
        editorEdit.putString("clone_user_id", "");
        editorEdit.commit();
    }

    private static byte[] h(int i2) {
        if (KeyStoreUtils.f36589b && i2 == 14) {
            b(true);
        }
        byte[] bArrB = b(i2, false);
        if (bArrB != null || TextUtils.isEmpty(k(i2))) {
            return bArrB;
        }
        l(i2);
        byte[] bArrB2 = b(i2, false);
        if (bArrB2 != null) {
            com.huawei.hwlogsmodel.LogUtil.a("KeyManager", "initSecurityKey has 2.0 move");
        }
        return bArrB2;
    }

    private static void a(int i2, int i3) {
        String str;
        health.compact.a.hwlogsmodel.ReleaseLogUtil.d("HiH_KeyManager", "createNewSecureKey, dataType: " + i2);
        byte[] bArrH = h(i2);
        if (bArrH == null) {
            str = i();
        } else {
            str = new String(bArrH, StandardCharsets.UTF_8);
        }
        b(String.valueOf(i3), KeyStoreUtils.d(str), true);
        if (bArrH != null) {
            a(i2, f36587c, d);
        }
        health.compact.a.hwlogsmodel.ReleaseLogUtil.d("HiH_KeyManager", "createNewSecureKey end dataType:", Integer.valueOf(i2));
    }

    private static void l(int i2) {
        synchronized (f36586b) {
            int iMyPid = Process.myPid();
            com.huawei.hwlogsmodel.LogUtil.d("KeyManager", "initSecurityKey dataType:", Integer.valueOf(i2), ";process id:", Integer.valueOf(iMyPid), ";process name:", CommonUtil.b(iMyPid), "; main process:", BaseApplication.getAppPackage());
            try {
                com.huawei.hwlogsmodel.LogUtil.d("KeyManager", "initSecurityKey begin");
                String strD = d(i2);
                com.huawei.hwlogsmodel.LogUtil.d("KeyManager", "initSecurityKey get work key xxx", e(strD));
                if (TextUtils.isEmpty(strD)) {
                    r(i2);
                    strD = d(i2);
                    com.huawei.hwlogsmodel.LogUtil.d("KeyManager", "initSecurityKey retry workKey", e(strD));
                }
                if (TextUtils.isEmpty(strD)) {
                    byte[] bArrB = b();
                    byte[] bytes = i().getBytes(StandardCharsets.UTF_8);
                    if (com.huawei.hwlogsmodel.common.LogConfig.a()) {
                        com.huawei.hwlogsmodel.LogUtil.d("KeyManager", "initSecurityKey get work key secret is ", e(HEXUtils.a(bytes)));
                    }
                    byte[] bytes2 = l().getBytes(StandardCharsets.UTF_8);
                    byte[] bArrA = a(bytes, bytes2, bArrB);
                    com.huawei.hwlogsmodel.LogUtil.a("KeyManager", "initSecurityKey dT:", Integer.valueOf(i2), "; iv:", Integer.valueOf(bArrB.length), "; kB:", Integer.valueOf(bytes2.length), "; eK:", Integer.valueOf(bArrA.length));
                    if (com.huawei.hwlogsmodel.common.LogConfig.a()) {
                        com.huawei.hwlogsmodel.LogUtil.d("KeyManager", "initSecurity encryptKeys work key:", e(HEXUtils.a(bArrA)));
                    }
                    com.huawei.hwlogsmodel.LogUtil.d("KeyManager", "initSecurityKey clearSharedPreferences1, ok: dataType:", Integer.valueOf(i2));
                    d(String.valueOf(i2), bArrA, bArrB);
                    com.huawei.hwlogsmodel.LogUtil.d("KeyManager", "initSecurityKey completed");
                } else {
                    try {
                        a(String.valueOf(i2), strD);
                    } catch (Exception unused) {
                        com.huawei.hwlogsmodel.LogUtil.e("KeyManager", "initSecurityKey backUpSecretKeyRetry Exception");
                    }
                    com.huawei.hwlogsmodel.LogUtil.d("KeyManager", "initSecurityKey get work key2");
                }
            } catch (Exception unused2) {
                com.huawei.hwlogsmodel.LogUtil.e("KeyManager", "initSecurityKey Exception");
            }
        }
    }

    private static String i() {
        com.huawei.hwlogsmodel.LogUtil.d("KeyManager", "createInitWorkKey");
        return e(m(), m(), m());
    }

    private static String c(int i2) {
        com.huawei.hwlogsmodel.LogUtil.d("KeyManager", "getByBackupContentProvider begin C", Integer.valueOf(i2));
        String strC = c("key_" + i2);
        WhiteBoxManager whiteBoxManagerB = WhiteBoxManager.b();
        if (TextUtils.isEmpty(strC)) {
            com.huawei.hwlogsmodel.LogUtil.d("KeyManager", "getByBackupContentProvider is null, in Cp", Integer.valueOf(i2));
            return "";
        }
        try {
            String str = new String(whiteBoxManagerB.a(Base64.b(strC)), StandardCharsets.UTF_8);
            c("key_" + i2, strC);
            return str;
        } catch (Exception unused) {
            com.huawei.hwlogsmodel.LogUtil.e("KeyManager", "getByBackupContentProvider Cp", Integer.valueOf(i2), " Exception");
            return "";
        }
    }

    private static byte[] i(int i2) {
        String strValueOf = String.valueOf(i2);
        String strC = c(strValueOf);
        if (TextUtils.isEmpty(strC) || strC.length() < 88) {
            com.huawei.hwlogsmodel.LogUtil.e("KeyManager", " getNewWorkKeyBackup length error");
            return null;
        }
        byte[] bArrB = KeyStoreUtils.b(strC.substring(0, 88));
        if (bArrB != null) {
            c(strValueOf, strC);
        }
        return bArrB;
    }

    private static byte[] a(int i2, byte[] bArr) {
        com.huawei.hwlogsmodel.LogUtil.d("KeyManager", "getWorkKeyByBackupContentProvider begin");
        String strValueOf = String.valueOf(i2);
        String strC = c(strValueOf);
        if (TextUtils.isEmpty(strC) || strC.length() < 24) {
            com.huawei.hwlogsmodel.LogUtil.d("KeyManager", "getWorkKeyByBackupContentProvider key length error");
            return null;
        }
        String strSubstring = strC.substring(0, 24);
        String strSubstring2 = strC.substring(24);
        com.huawei.hwlogsmodel.LogUtil.d("KeyManager", "getWorkKeyByBackupContentProvider get work key2, iv is:", e(strSubstring2));
        try {
            byte[] bArrC = c(Base64.b(strSubstring2), bArr, Base64.b(strSubstring));
            c(strValueOf, strC);
            return bArrC;
        } catch (Exception unused) {
            com.huawei.hwlogsmodel.LogUtil.e("KeyManager", "getWorkKeyByBackupContentProvider work key iv is:", e(strSubstring2));
            return null;
        }
    }

    private static String c(String str) {
        return e(str, d);
    }

    private static void a(String str, String str2) {
        if (EnvironmentUtils.b()) {
            d(str, str2, false);
        }
    }

    private static void d(String str, String str2, boolean z) {
        synchronized (f36586b) {
            com.huawei.hwlogsmodel.LogUtil.d("KeyManager", "backUpSecretKeyRetry, key: ", str + ", value: " + str2 + ", updateIfExist: " + z);
            ContentValues contentValues = new ContentValues();
            contentValues.put("backupKey", str);
            contentValues.put("backupValue", str2);
            Uri uri = d;
            if (!b(str, uri)) {
                BaseApplication.getContext().getContentResolver().insert(uri, contentValues);
            } else if (z) {
                BaseApplication.getContext().getContentResolver().update(uri, contentValues, "backupKey like ?", new String[]{str});
            }
        }
    }

    private static void c(String str, String str2) {
        synchronized (f36586b) {
            com.huawei.hwlogsmodel.LogUtil.d("KeyManager", "updateSecretKey:", str);
            e(str, str2);
            DbManager.a(BaseApplication.getContext(), String.valueOf(1009), "backup_table", 2, "backupKey varchar primary key ,backupValue varchar");
            ContentValues contentValues = new ContentValues();
            contentValues.put("backupKey", str);
            contentValues.put("backupValue", str2);
            Uri uri = f36587c;
            if (b(str, uri)) {
                try {
                    BaseApplication.getContext().getContentResolver().update(uri, contentValues, "backupKey like ?", new String[]{str});
                } catch (SQLiteException unused) {
                    com.huawei.hwlogsmodel.LogUtil.e("KeyManager", "updateSecretKey SQLiteException");
                }
            }
        }
    }

    public static boolean a(String str) {
        return f36585a.contains(str);
    }

    private static void j() {
        Iterator<String> it = f36585a.iterator();
        while (it.hasNext()) {
            BaseApplication.getContext().deleteDatabase(it.next());
        }
        BaseApplication.getContext().deleteDatabase(FileSensitiveProtectUtil.d("hihealth_sensitive.db"));
    }

    private static void a(int i2, Uri uri, Uri uri2) {
        com.huawei.hwlogsmodel.LogUtil.a("KeyManager", "deleteSecretKey:", Integer.valueOf(i2));
        String[] strArr = {String.valueOf(i2)};
        if (uri != null) {
            try {
                SharedPreferenceManager.b("preference_save_module", String.valueOf(i2));
                BaseApplication.getContext().getContentResolver().delete(uri, "backupKey like ?", strArr);
            } catch (SQLiteException e2) {
                com.huawei.hwlogsmodel.LogUtil.e("KeyManager", "deleteSecretKey uri, ", e2.getClass().getSimpleName());
            }
        }
        if (uri2 != null) {
            try {
                BaseApplication.getContext().getContentResolver().delete(uri2, "backupKey like ?", strArr);
            } catch (SQLiteException e3) {
                com.huawei.hwlogsmodel.LogUtil.e("KeyManager", "deleteSecretKey backupUri, ", e3.getClass().getSimpleName());
            }
        }
    }

    private static String e(String str, Uri uri) {
        String strI = i(str);
        if (!TextUtils.isEmpty(strI)) {
            return strI;
        }
        String string = "";
        Cursor cursorQuery = null;
        try {
            try {
                cursorQuery = BaseApplication.getContext().getContentResolver().query(uri, null, "backupKey like ?", new String[]{str}, null);
                if (cursorQuery != null && cursorQuery.moveToNext()) {
                    string = cursorQuery.getString(cursorQuery.getColumnIndex("backupValue"));
                }
            } catch (SQLiteException e2) {
                health.compact.a.hwlogsmodel.ReleaseLogUtil.a("HiH_KeyManager", "getSecretKey, ", e2.getClass().getSimpleName());
            }
            e(cursorQuery);
            health.compact.a.hwlogsmodel.ReleaseLogUtil.d("KeyManager", "key: ", str, " save to MMKV");
            e(str, string);
            com.huawei.hwlogsmodel.LogUtil.d("KeyManager", "getSecretKey, key:", str, ";value is:", e(string));
            return string;
        } catch (Throwable th) {
            e(cursorQuery);
            throw th;
        }
    }

    private static boolean b(String str, Uri uri) {
        if (!TextUtils.isEmpty(i(str))) {
            return true;
        }
        String[] strArr = {str};
        Cursor cursorQuery = null;
        boolean z = false;
        try {
            try {
                cursorQuery = BaseApplication.getContext().getContentResolver().query(uri, null, "backupKey like ?", strArr, null);
                boolean z2 = cursorQuery != null && cursorQuery.getCount() > 0;
                e(cursorQuery);
                z = z2;
            } catch (SQLiteException e2) {
                com.huawei.hwlogsmodel.LogUtil.e("KeyManager", "isHaveSecretKey, ", e2.getClass().getSimpleName());
                e(cursorQuery);
            }
            com.huawei.hwlogsmodel.LogUtil.d("KeyManager", "isHaveSecretKey:", Boolean.valueOf(z));
            return z;
        } catch (Throwable th) {
            e(cursorQuery);
            throw th;
        }
    }

    private static void e(Cursor cursor) {
        if (cursor != null) {
            cursor.close();
        }
    }

    private static String e(String str) {
        if (TextUtils.isEmpty(str)) {
            return Constants.NULL;
        }
        if (!com.huawei.hwlogsmodel.common.LogConfig.a()) {
            return "";
        }
        if (str.length() <= 5) {
            return str;
        }
        return str.substring(0, 5) + "...";
    }

    private static String i(String str) {
        return SharedPreferenceManager.b("preference_save_module", str, "");
    }

    private static void e(String str, String str2) {
        SharedPreferenceManager.c("preference_save_module", str, str2);
    }

    private static String b(String str) throws Throwable {
        StorageParams storageParams = new StorageParams(1);
        KeyValDbManager keyValDbManagerD = KeyValDbManager.d(BaseApplication.getContext());
        String strB = keyValDbManagerD.b("AndroidId", storageParams);
        if (!TextUtils.isEmpty(strB)) {
            return strB;
        }
        keyValDbManagerD.b("AndroidId", str, storageParams);
        return str;
    }

    public static void h() {
        int iC = SharedPreferenceManager.c(Integer.toString(10000), "health_app_last_password_set_day", 0);
        int iD = HiDateUtil.d(System.currentTimeMillis());
        if (iD == iC) {
            return;
        }
        byte[] bArrA = a(13);
        if (bArrA == null) {
            health.compact.a.hwlogsmodel.ReleaseLogUtil.e("HiH_KeyManager", "setDbPasswordToKeystore securityKey is null.");
            return;
        }
        try {
            Cipher cipher = Cipher.getInstance("AES/GCM/NoPadding");
            cipher.init(1, KeyStoreUtils.c("ui_navigation_cache_alias"));
            byte[] iv = cipher.getIV();
            byte[] bArrDoFinal = cipher.doFinal(bArrA);
            String strEncodeToString = android.util.Base64.encodeToString(iv, 0);
            String strEncodeToString2 = android.util.Base64.encodeToString(bArrDoFinal, 0);
            int length = strEncodeToString.length() / 3;
            int length2 = strEncodeToString2.length() / 3;
            String strSubstring = strEncodeToString.substring(0, length);
            int i2 = length * 2;
            String strSubstring2 = strEncodeToString.substring(length, i2);
            String strSubstring3 = strEncodeToString.substring(i2);
            String strSubstring4 = strEncodeToString2.substring(0, length2);
            int i3 = length2 * 2;
            String strSubstring5 = strEncodeToString2.substring(length2, i3);
            BaseApplication.getContext().getSharedPreferences("health_theme_settings_prefs", 0).edit().putString("iv1", strSubstring2).putString("iv2", strSubstring).putString("iv3", strSubstring3).putString("pw1", strSubstring5).putString("pw2", strSubstring4).putString("pw3", strEncodeToString2.substring(i3)).apply();
            SharedPreferenceManager.d(Integer.toString(10000), "health_app_last_password_set_day", iD);
        } catch (IllegalArgumentException e2) {
            e = e2;
            health.compact.a.hwlogsmodel.ReleaseLogUtil.a("HiH_KeyManager", "setDbPasswordToKeystore error", e.getMessage(), "cause:", e.getCause());
        } catch (InvalidKeyException e3) {
            e = e3;
            health.compact.a.hwlogsmodel.ReleaseLogUtil.a("HiH_KeyManager", "setDbPasswordToKeystore error", e.getMessage(), "cause:", e.getCause());
        } catch (NoSuchAlgorithmException e4) {
            e = e4;
            health.compact.a.hwlogsmodel.ReleaseLogUtil.a("HiH_KeyManager", "setDbPasswordToKeystore error", e.getMessage(), "cause:", e.getCause());
        } catch (BadPaddingException e5) {
            e = e5;
            health.compact.a.hwlogsmodel.ReleaseLogUtil.a("HiH_KeyManager", "setDbPasswordToKeystore error", e.getMessage(), "cause:", e.getCause());
        } catch (IllegalBlockSizeException e6) {
            e = e6;
            health.compact.a.hwlogsmodel.ReleaseLogUtil.a("HiH_KeyManager", "setDbPasswordToKeystore error", e.getMessage(), "cause:", e.getCause());
        } catch (NoSuchPaddingException e7) {
            e = e7;
            health.compact.a.hwlogsmodel.ReleaseLogUtil.a("HiH_KeyManager", "setDbPasswordToKeystore error", e.getMessage(), "cause:", e.getCause());
        } catch (Exception e8) {
            health.compact.a.hwlogsmodel.ReleaseLogUtil.a("HiH_KeyManager", "setDbPasswordToKeystore Exception:", e8.getMessage());
        }
    }
}
