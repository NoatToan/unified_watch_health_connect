package defpackage;

import android.os.Build;
import com.xiaomi.accountsdk.utils.AccountLogger;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes2.dex */
public class ku3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static String f24293a = "ku3";

    public static synchronized boolean a() {
        try {
            try {
                AccountLogger.log(f24293a, "to write /data");
                if (i("/data/su_test", "test_ok").booleanValue()) {
                    AccountLogger.log(f24293a, "write ok");
                } else {
                    AccountLogger.log(f24293a, "write failed");
                }
                AccountLogger.log(f24293a, "to read /data");
                String strH = h("/data/su_test");
                AccountLogger.log(f24293a, "strRead=" + strH);
                return "test_ok".equals(strH);
            } catch (Exception e) {
                AccountLogger.log(f24293a, "Unexpected error - Here is what I know: " + e.getMessage());
                return false;
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public static boolean b() {
        String str = Build.TAGS;
        if (str == null || !str.contains("test-keys")) {
            return false;
        }
        AccountLogger.log(f24293a, "buildTags=" + str);
        return true;
    }

    public static boolean c() {
        String[] strArr = {"/system/bin/", "/system/xbin/", "/system/sbin/", "/sbin/", "/vendor/bin/"};
        for (int i = 0; i < 5; i++) {
            try {
                if (new File(strArr[i] + "su").exists()) {
                    AccountLogger.log(f24293a, "find su in : " + strArr[i]);
                    return true;
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return false;
    }

    public static boolean d() {
        ArrayList<String> arrayListF = f(new String[]{"/system/xbin/which", "su"});
        if (arrayListF == null) {
            AccountLogger.log(f24293a, "execResult=null");
            return false;
        }
        AccountLogger.log(f24293a, "execResult=" + arrayListF.toString());
        return true;
    }

    public static boolean e() {
        try {
            if (!new File("/system/app/Superuser.apk").exists()) {
                return false;
            }
            AccountLogger.log(f24293a, "/system/app/Superuser.apk exist");
            return true;
        } catch (Exception unused) {
            return false;
        }
    }

    public static ArrayList<String> f(String[] strArr) {
        ArrayList<String> arrayList = new ArrayList<>();
        try {
            AccountLogger.log(f24293a, "to shell exec which for find su :");
            Process processExec = Runtime.getRuntime().exec(strArr);
            new BufferedWriter(new OutputStreamWriter(processExec.getOutputStream()));
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(processExec.getInputStream()));
            while (true) {
                try {
                    String line = bufferedReader.readLine();
                    if (line == null) {
                        break;
                    }
                    AccountLogger.log(f24293a, "–> Line received: " + line);
                    arrayList.add(line);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
            AccountLogger.log(f24293a, "–> Full response was: " + arrayList);
            return arrayList;
        } catch (Exception unused) {
            return null;
        }
    }

    public static boolean g() {
        return b() || e() || c() || d() || a();
    }

    public static String h(String str) {
        try {
            FileInputStream fileInputStream = new FileInputStream(new File(str));
            byte[] bArr = new byte[1024];
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            while (true) {
                int i = fileInputStream.read(bArr);
                if (i <= 0) {
                    String str2 = new String(byteArrayOutputStream.toByteArray());
                    AccountLogger.log(f24293a, str2);
                    return str2;
                }
                byteArrayOutputStream.write(bArr, 0, i);
            }
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public static Boolean i(String str, String str2) {
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(str);
            fileOutputStream.write(str2.getBytes());
            fileOutputStream.close();
            return Boolean.TRUE;
        } catch (Exception e) {
            e.printStackTrace();
            return Boolean.FALSE;
        }
    }
}
