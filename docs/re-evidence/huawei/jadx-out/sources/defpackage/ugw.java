package defpackage;

import android.text.TextUtils;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwdevice.mainprocess.mgr.hwmywatchfacemgr.constant.WatchFaceConstant;
import com.huawei.hwlogsmodel.LogUtil;
import health.compact.a.CommonUtil;
import java.io.File;
import java.io.IOException;

/* JADX INFO: loaded from: classes43.dex */
public class ugw {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final File f50074b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static String f50075c = "";
    private static String d = "";

    static {
        try {
            d = CommonUtil.f(BaseApplication.getContext()).getCanonicalPath() + "/Android/data/";
            f50075c = CommonUtil.f(BaseApplication.getContext()).getCanonicalPath() + "/Huawei/Health/";
        } catch (IOException unused) {
            LogUtil.e("FileConfig", "IOException");
        }
        f50074b = BaseApplication.getContext().getFilesDir();
    }

    private static String i() {
        return d + xkd.e() + "/files";
    }

    private static String e() {
        return i() + "/audiosBase/";
    }

    private static String h() {
        return i() + "/baseXML/";
    }

    private static String g() {
        return f50075c + "/fitfiles";
    }

    private static String a() {
        return g() + "/audiosBase/";
    }

    private static String f() {
        return g() + "/baseXML/";
    }

    private static String j() {
        String canonicalPath;
        try {
            canonicalPath = f50074b.getCanonicalPath();
        } catch (IOException e) {
            LogUtil.e("FileConfig", e.getMessage());
            canonicalPath = "";
        }
        return canonicalPath + "/stress";
    }

    private static String c() {
        return j() + "/audiosBase/";
    }

    public static String b() {
        return j() + "/baseXML/";
    }

    private static String g(String str) {
        String strF = f(str);
        String str2 = c() + strF;
        if (!e(str2) && !k()) {
            String str3 = a() + strF;
            if (e(str3)) {
                return str3;
            }
            String str4 = e() + strF;
            if (e(str4)) {
                return str4;
            }
        }
        return str2;
    }

    public static String d(String str) {
        return c() + f(str);
    }

    public static String a(String str) {
        if (TextUtils.isEmpty(str)) {
            String str2 = b() + "filesServer_old.xml";
            if (!e(str2) && !k()) {
                String str3 = f() + "filesServer_old.xml";
                if (e(str3)) {
                    return str3;
                }
                String str4 = h() + "filesServer_old.xml";
                if (e(str4)) {
                    return str4;
                }
            }
            return str2;
        }
        String str5 = "filesServer_old_" + str + WatchFaceConstant.XML_SUFFIX;
        String str6 = b() + str5;
        if (!e(str6) && !k()) {
            String str7 = f() + str5;
            if (e(str7)) {
                return str7;
            }
            String str8 = h() + str5;
            if (e(str8)) {
                return str8;
            }
        }
        return str6;
    }

    private static boolean e(String str) {
        return new File(str).exists();
    }

    public static boolean a(String str, long j, String str2) {
        if (!d(str, str2)) {
            return false;
        }
        File file = new File(g(str));
        if (file.exists()) {
            return b(file, j);
        }
        return false;
    }

    private static boolean d(String str, String str2) {
        String strJ = j("fit_mp3_id_" + str);
        if (strJ != null && strJ.equals(str2)) {
            return true;
        }
        File file = new File(g(str));
        if (file.exists() && file.delete()) {
            LogUtil.j("FileConfig", str + ":isVaildFileUrl:delete");
        }
        b("fit_mp3_id_" + str, str2);
        return false;
    }

    public static String c(String str) {
        return f(str);
    }

    public static boolean b(File file, long j) {
        boolean z = file.lastModified() == j;
        if (!z) {
            String name = file.getName();
            LogUtil.j("FileConfig", name + ":is valid");
            if (file.delete()) {
                LogUtil.j("FileConfig", name + ":delete");
            }
        }
        return z;
    }

    private static String f(String str) {
        if (str == null) {
            LogUtil.j("FileConfig", "getFileName url is null");
            return "";
        }
        int iLastIndexOf = str.lastIndexOf("/");
        int iLastIndexOf2 = str.lastIndexOf("?");
        if (iLastIndexOf < 0) {
            iLastIndexOf = -1;
        }
        if (iLastIndexOf2 <= iLastIndexOf) {
            iLastIndexOf2 = str.length();
        }
        return str.substring(iLastIndexOf + 1, iLastIndexOf2);
    }

    public static boolean d() {
        return xkd.d().h();
    }

    private static boolean k() {
        return !d();
    }

    public static long b(String str) {
        return BaseApplication.getContext().getApplicationContext().getSharedPreferences("stress_sp", 0).getLong(str, 0L);
    }

    private static void b(String str, String str2) {
        BaseApplication.getContext().getApplicationContext().getSharedPreferences("stress_xml_sp", 0).edit().putString(str, str2).commit();
    }

    private static String j(String str) {
        return BaseApplication.getContext().getApplicationContext().getSharedPreferences("stress_xml_sp", 0).getString(str, null);
    }
}
