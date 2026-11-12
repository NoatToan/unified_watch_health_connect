package health.compact.a;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import android.provider.Settings;
import android.text.TextUtils;
import com.alipay.sdk.m.s.e;
import com.huawei.haf.common.exception.ExceptionUtils;
import com.huawei.hms.network.embedded.k;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.login.ui.login.LoginInit;
import com.huawei.openalliance.ad.beans.inner.CountryCodeBean;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class Utils {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final Charset f36673c = Charset.forName("UTF-8");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static int f36672b = 3;
    private static int d = 3;
    private static int e = 1;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static String f36671a = "";
    private static long i = 0;

    private Utils() {
    }

    public static void b(int i2) {
        f36672b = i2;
    }

    public static int e() {
        return f36672b;
    }

    public static int a() {
        return d;
    }

    public static int d() {
        return e;
    }

    public static void a(int i2) {
        e = i2;
    }

    public static String d(byte[] bArr) {
        if (bArr == null) {
            return null;
        }
        return new String(bArr, f36673c);
    }

    public static String e(Context context) {
        File file = new File(context.getFilesDir() + File.separator + "photos" + File.separator + "avater");
        if (!file.exists() && !file.mkdirs()) {
            com.huawei.hwlogsmodel.LogUtil.d(com.huawei.hianalytics.core.transport.Utils.TAG, "getHeadPhotosPath Creat mkdirs failure");
        }
        try {
            return file.getCanonicalPath();
        } catch (IOException unused) {
            com.huawei.hwlogsmodel.LogUtil.e(com.huawei.hianalytics.core.transport.Utils.TAG, "getHeadPhotosPath IOException");
            return "";
        }
    }

    public static boolean i() {
        Boolean boolValueOf;
        Boolean boolV = EnvironmentUtils.d() ? CommonUtil.v() : null;
        if (boolV != null) {
            com.huawei.hwlogsmodel.LogUtil.d(com.huawei.hianalytics.core.transport.Utils.TAG, "isBrowseMode, isBrowseMode = ", boolV);
            return boolV.booleanValue();
        }
        Context context = BaseApplication.getContext();
        String strC = KeyValDbManager.d(context).c("is_browse_mode_or_not");
        if (!TextUtils.isEmpty(strC)) {
            boolValueOf = Boolean.valueOf(Boolean.parseBoolean(strC));
        } else {
            boolean zIsEmpty = TextUtils.isEmpty(KeyValDbManager.d(context).c("user_id"));
            Boolean boolValueOf2 = Boolean.valueOf(zIsEmpty);
            LoginInit loginInit = LoginInit.getInstance(BaseApplication.getContext());
            boolValueOf2.getClass();
            loginInit.setIsBrowseModeToPd(context, zIsEmpty);
            boolValueOf = boolValueOf2;
        }
        com.huawei.hwlogsmodel.LogUtil.d(com.huawei.hianalytics.core.transport.Utils.TAG, "isBrowseMode(), isBrowseMode = ", boolValueOf);
        return boolValueOf.booleanValue();
    }

    @Deprecated
    public static boolean m() {
        return CloudUtils.d();
    }

    public static boolean o() {
        return CloudUtils.c();
    }

    public static boolean h() {
        return CloudUtils.a();
    }

    public static boolean r() {
        String accountInfo;
        if (h()) {
            accountInfo = LoginInit.getInstance(BaseApplication.getContext()).getAccountInfo(1010);
            com.huawei.hwlogsmodel.LogUtil.a(com.huawei.hianalytics.core.transport.Utils.TAG, "Account country :", accountInfo);
        } else {
            accountInfo = null;
        }
        if ("TW".equalsIgnoreCase(accountInfo)) {
            return true;
        }
        String country = Locale.getDefault().getCountry();
        com.huawei.hwlogsmodel.LogUtil.a(com.huawei.hianalytics.core.transport.Utils.TAG, "Locale country :", country);
        return "TW".equalsIgnoreCase(country);
    }

    public static int c() {
        return CommonUtil.j(LoginInit.getInstance(BaseApplication.getContext()).getAccountInfo(1009));
    }

    public static boolean f() {
        return c() != -1;
    }

    public static boolean k() {
        return o() && !h();
    }

    public static boolean d(Context context) {
        int i2;
        com.huawei.hwlogsmodel.LogUtil.a(com.huawei.hianalytics.core.transport.Utils.TAG, "isHmsUsableVersion");
        if (context == null) {
            return false;
        }
        if (CommonUtil.bg()) {
            com.huawei.hwlogsmodel.LogUtil.a(com.huawei.hianalytics.core.transport.Utils.TAG, "isHmsUsableVersion isEmui");
            return true;
        }
        if (Build.VERSION.SDK_INT < 29) {
            com.huawei.hwlogsmodel.LogUtil.a(com.huawei.hianalytics.core.transport.Utils.TAG, "isHmsUsableVersion Build.VERSION_CODES.Q");
            return true;
        }
        if (!CommonUtil.h(context, "com.android.vending")) {
            com.huawei.hwlogsmodel.LogUtil.a(com.huawei.hianalytics.core.transport.Utils.TAG, "isHmsUsableVersion no google play");
            return true;
        }
        try {
            PackageInfo packageInfo = context.getPackageManager().getPackageInfo(CommonUtil.x(), 0);
            com.huawei.hwlogsmodel.LogUtil.a(com.huawei.hianalytics.core.transport.Utils.TAG, "isHmsUsableVersion packageInfo=", packageInfo);
            i2 = packageInfo.versionCode;
            try {
                com.huawei.hwlogsmodel.LogUtil.a(com.huawei.hianalytics.core.transport.Utils.TAG, "isHmsUsableVersion versionCode=", Integer.valueOf(i2));
            } catch (PackageManager.NameNotFoundException unused) {
                com.huawei.hwlogsmodel.LogUtil.e(com.huawei.hianalytics.core.transport.Utils.TAG, "isHmsUsableVersion NameNotFoundException");
            }
        } catch (PackageManager.NameNotFoundException unused2) {
            i2 = 0;
        }
        if (i2 > 30003300) {
            return true;
        }
        if (i2 != 0 || h()) {
            return false;
        }
        com.huawei.hwlogsmodel.LogUtil.a(com.huawei.hianalytics.core.transport.Utils.TAG, "isHmsUsableVersion no cloud");
        return true;
    }

    public static boolean b(Context context, String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        try {
            return context.getPackageManager().getPackageInfo(str, 0) != null;
        } catch (PackageManager.NameNotFoundException e2) {
            com.huawei.hwlogsmodel.LogUtil.e(com.huawei.hianalytics.core.transport.Utils.TAG, "isApplicationInstalled exception ", e2);
        }
    }

    public static boolean e(File file) {
        if (file == null || !file.exists()) {
            com.huawei.hwlogsmodel.LogUtil.j(com.huawei.hianalytics.core.transport.Utils.TAG, "deleteFolder folder is null or not exist");
            return false;
        }
        if (file.isFile()) {
            return file.delete();
        }
        if (!file.isDirectory()) {
            com.huawei.hwlogsmodel.LogUtil.j(com.huawei.hianalytics.core.transport.Utils.TAG, "deleteFolder folder is other type");
        } else {
            File[] fileArrListFiles = file.listFiles();
            if (fileArrListFiles != null && fileArrListFiles.length > 0) {
                for (File file2 : fileArrListFiles) {
                    e(file2);
                }
            }
        }
        return file.delete();
    }

    public static void d(String str, String str2) {
        File file = new File(str);
        if (!CommonUtil.e(file)) {
            com.huawei.hwlogsmodel.LogUtil.j(com.huawei.hianalytics.core.transport.Utils.TAG, "moveFiles source file path invalid");
            return;
        }
        File[] fileArrListFiles = file.listFiles();
        if (fileArrListFiles == null || fileArrListFiles.length == 0) {
            return;
        }
        File file2 = new File(str2);
        if (!file2.exists()) {
            com.huawei.hwlogsmodel.LogUtil.d(com.huawei.hianalytics.core.transport.Utils.TAG, "moveFiles mkdir results:", Boolean.valueOf(file2.mkdirs()));
        }
        boolean zDelete = true;
        for (File file3 : fileArrListFiles) {
            if (file3.isDirectory()) {
                d(file3.getPath(), str2 + File.separator + file3.getName());
            }
            if (file3.isFile()) {
                zDelete &= file3.renameTo(new File(str2 + File.separator + file3.getName()));
            }
            zDelete &= file3.delete();
        }
        com.huawei.hwlogsmodel.LogUtil.a(com.huawei.hianalytics.core.transport.Utils.TAG, "sourceFile isDelete", Boolean.valueOf(file.delete() & zDelete));
    }

    public static List<String> e(String str) {
        ArrayList arrayList = new ArrayList(16);
        File[] fileArrListFiles = new File(str).listFiles();
        if (fileArrListFiles != null && fileArrListFiles.length != 0) {
            for (File file : fileArrListFiles) {
                if (file.isFile() && file.getName().lastIndexOf(".") != -1) {
                    arrayList.add(file.getName().substring(0, file.getName().lastIndexOf(".")));
                }
            }
        }
        return arrayList;
    }

    public static String c(String str) throws Throwable {
        InputStreamReader inputStreamReader;
        IOException iOException;
        InputStreamReader inputStreamReader2;
        Throwable th;
        if (TextUtils.isEmpty(str)) {
            com.huawei.hwlogsmodel.LogUtil.j(com.huawei.hianalytics.core.transport.Utils.TAG, "readJson path is empty");
            return "";
        }
        FileInputStream fileInputStream = null;
        try {
            FileInputStream fileInputStream2 = new FileInputStream(new File(str));
            try {
                inputStreamReader2 = new InputStreamReader(fileInputStream2, StandardCharsets.UTF_8);
                try {
                    StringBuilder sb = new StringBuilder(16);
                    while (true) {
                        int i2 = inputStreamReader2.read();
                        if (i2 != -1) {
                            sb.append((char) i2);
                        } else {
                            String string = sb.toString();
                            IoUtils.c(fileInputStream2);
                            IoUtils.c(inputStreamReader2);
                            return string;
                        }
                    }
                } catch (IOException e2) {
                    iOException = e2;
                    fileInputStream = fileInputStream2;
                    try {
                        com.huawei.hwlogsmodel.LogUtil.e(com.huawei.hianalytics.core.transport.Utils.TAG, "readJson ioException is ", ExceptionUtils.c(iOException));
                        IoUtils.c(fileInputStream);
                        IoUtils.c(inputStreamReader2);
                        return "";
                    } catch (Throwable th2) {
                        fileInputStream2 = fileInputStream;
                        th = th2;
                        inputStreamReader = inputStreamReader2;
                        th = th;
                        fileInputStream = fileInputStream2;
                        IoUtils.c(fileInputStream);
                        IoUtils.c(inputStreamReader);
                        throw th;
                    }
                } catch (Throwable th3) {
                    th = th3;
                    inputStreamReader = inputStreamReader2;
                    th = th;
                    fileInputStream = fileInputStream2;
                    IoUtils.c(fileInputStream);
                    IoUtils.c(inputStreamReader);
                    throw th;
                }
            } catch (IOException e3) {
                iOException = e3;
                inputStreamReader2 = null;
            } catch (Throwable th4) {
                th = th4;
                inputStreamReader = null;
                fileInputStream = fileInputStream2;
                IoUtils.c(fileInputStream);
                IoUtils.c(inputStreamReader);
                throw th;
            }
        } catch (IOException e4) {
            iOException = e4;
            inputStreamReader2 = null;
        } catch (Throwable th5) {
            th = th5;
            inputStreamReader = null;
            IoUtils.c(fileInputStream);
            IoUtils.c(inputStreamReader);
            throw th;
        }
    }

    @Deprecated
    public static boolean b(Context context) {
        return LoginInit.getInstance(BaseApplication.getContext()).isRussiaCountry();
    }

    @Deprecated
    public static boolean c(Context context) {
        return LoginInit.getInstance(BaseApplication.getContext()).isJapanCountry();
    }

    @Deprecated
    public static boolean a(Context context) {
        return LoginInit.getInstance(BaseApplication.getContext()).isKoreaCountry();
    }

    public static boolean l() {
        return CompileParameterUtil.c("SUPPORT_HEALTH_MODEL", false) && !CompileParameterUtil.c("GOOGLE_PLAY_OEM_BETTERME", false);
    }

    public static boolean j() {
        return LanguageUtil.l(BaseApplication.getContext()) && !o();
    }

    public static String b() {
        if (System.currentTimeMillis() - i > 3600000 || TextUtils.isEmpty(f36671a)) {
            f36671a = GRSManager.c(BaseApplication.getContext()).getUrl("healthCloudUrl");
        }
        return f36671a;
    }

    public static boolean n() {
        String strD = SystemProperties.d(CountryCodeBean.VENDOR_SYSTEMPROP, "");
        String strD2 = SystemProperties.d(CountryCodeBean.VENDORCOUNTRY_SYSTEMPROP, "");
        boolean z = !TextUtils.isEmpty(strD) && "demo".equalsIgnoreCase(strD);
        boolean z2 = !TextUtils.isEmpty(strD) && "demo".equalsIgnoreCase(strD2);
        String string = Settings.Secure.getString(BaseApplication.getContext().getContentResolver(), "DemoVersion");
        com.huawei.hwlogsmodel.LogUtil.a(com.huawei.hianalytics.core.transport.Utils.TAG, "vendor: ", strD, " country: ", strD2, " installedString: ", string);
        return z || z2 || (!TextUtils.isEmpty(string) && string.equals("true"));
    }

    public static boolean g() {
        String strE = SharedPreferenceManager.e(BaseApplication.getContext(), "30004", "ai-apms-001");
        ReleaseLogUtil.c("R_Utils", "checkIfEnableApms isConfigSupportApms config:", strE);
        boolean zB = b(strE);
        ReleaseLogUtil.d("R_Utils", "checkIfEnableApms isConfigSupportApms result ", Boolean.valueOf(zB));
        return zB;
    }

    private static boolean b(String str) {
        if (TextUtils.isEmpty(str)) {
            return true;
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            if (jSONObject.has(e.n) && jSONObject.has(k.g)) {
                JSONObject jSONObject2 = jSONObject.getJSONObject(e.n);
                if (!jSONObject.getBoolean(k.g)) {
                    return true;
                }
                if (!o() && jSONObject2.has("cn")) {
                    return a(jSONObject2.getString("cn"));
                }
                if (o() && jSONObject2.has("oversea")) {
                    return a(jSONObject2.getString("oversea"));
                }
                return true;
            }
            return true;
        } catch (JSONException unused) {
            ReleaseLogUtil.b("R_Utils", "checkIfEnableApms evaluateApmConfig JSONException");
        }
    }

    private static boolean a(String str) {
        ReleaseLogUtil.c("R_Utils", "checkIfEnableApms isSupportState state ", str);
        if (TextUtils.isEmpty(str)) {
            return true;
        }
        return d(str);
    }

    private static boolean d(String str) {
        if (str.contains("1") && CommonUtil.cl()) {
            return true;
        }
        if (str.contains("2") && CommonUtil.ao()) {
            return true;
        }
        if (str.contains("3") && CommonUtil.ap()) {
            return true;
        }
        return str.contains("4") && CommonUtil.bu();
    }
}
