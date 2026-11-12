package defpackage;

import android.os.StatFs;
import android.text.TextUtils;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwdevice.mainprocess.mgr.hwmywatchfacemgr.constant.WatchFaceConstant;
import com.huawei.hwlogsmodel.LogUtil;
import health.compact.a.CommonUtil;
import health.compact.a.LanguageUtil;
import health.compact.a.LogAnonymous;
import health.compact.a.SharedPreferenceManager;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import org.apache.commons.io.FileUtils;

/* JADX INFO: loaded from: classes2.dex */
public class xkf {
    private static String h;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final String f53145b = CommonUtil.f(BaseApplication.getContext()).getAbsolutePath() + "/Android/data/";
    private static final String d = CommonUtil.f(BaseApplication.getContext()).getAbsolutePath() + "/Huawei/Health/";
    private static final File e = BaseApplication.getContext().getFilesDir();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final String[] f53144a = {"videos", "audios", "audiosBase", "baseXML", "subtitles"};

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final String[] f53146c = {"videosEn", "audiosEn", "audiosBaseEn", "baseXML", "subtitles"};

    public static String f() {
        return ac();
    }

    public static String[] g() {
        return new String[]{z(), ab()};
    }

    public static String[] e() {
        if (!TextUtils.isEmpty(h)) {
            List<String> listAe = ae();
            if (LanguageUtil.o(BaseApplication.getContext())) {
                listAe.addAll(Arrays.asList(f53144a));
                return (String[]) ((String[]) listAe.toArray(new String[listAe.size()])).clone();
            }
            listAe.addAll(Arrays.asList(f53146c));
            return (String[]) ((String[]) listAe.toArray(new String[listAe.size()])).clone();
        }
        if (LanguageUtil.o(BaseApplication.getContext())) {
            return (String[]) f53144a.clone();
        }
        return (String[]) f53146c.clone();
    }

    private static String ab() {
        return f53145b + xkd.e() + "/files";
    }

    private static String al() {
        return ab() + p();
    }

    private static String u() {
        return ab() + n();
    }

    private static String r() {
        return ab() + o();
    }

    private static String aa() {
        if (!TextUtils.isEmpty(h)) {
            String str = "/baseXML" + h + "/";
            y("/baseXML" + h);
            return ab() + str;
        }
        return ab() + "/baseXML/";
    }

    private static String z() {
        return d + "/fitfiles";
    }

    private static String am() {
        return z() + p();
    }

    private static String v() {
        return z() + n();
    }

    private static String t() {
        return z() + o();
    }

    private static String x() {
        if (!TextUtils.isEmpty(h)) {
            String str = "/baseXML" + h + "/";
            y("/baseXML" + h);
            return z() + str;
        }
        return z() + "/baseXML/";
    }

    private static String ac() {
        if (CommonUtil.ca()) {
            return "suggestion/files";
        }
        return e(e) + "/fitness";
    }

    private static String ag() {
        return ac() + p();
    }

    private static String w() {
        return ac() + n();
    }

    private static String q() {
        return ac() + o();
    }

    private static String af() {
        return e(e) + "/suggestion/files_runcourse" + n();
    }

    private static String e(File file) {
        try {
            return file.getCanonicalPath();
        } catch (IOException e2) {
            LogUtil.j("Suggestion_FileConfig", "getFileCanonicalPath", LogAnonymous.b(e2));
            return "";
        }
    }

    private static String ad() {
        return e(e) + "/suggestion/files_runcourse" + o();
    }

    private static String y() {
        if (!TextUtils.isEmpty(h)) {
            String str = "/baseXML" + h + "/";
            y("/baseXML" + h);
            return ac() + str;
        }
        return ac() + "/baseXML/";
    }

    public static String b(String str, String str2, String str3, String str4) {
        String str5 = q() + str + str3 + str2 + str4;
        if (!w(str5)) {
            if (CommonUtil.ca()) {
                String str6 = ad() + str + str3 + str2 + str4;
                if (w(str6)) {
                    return str6;
                }
            }
            if (!ak()) {
                String str7 = t() + str + str3 + str2 + str4;
                if (w(str7)) {
                    return str7;
                }
                String str8 = r() + str + str3 + str2 + str4;
                if (w(str8)) {
                    return str8;
                }
            }
        }
        return str5;
    }

    public static String l(String str) {
        String strT = t(str);
        String str2 = ag() + strT;
        if (!w(str2) && !ak()) {
            String str3 = am() + strT;
            if (w(str3)) {
                return str3;
            }
            String str4 = al() + strT;
            if (w(str4)) {
                return str4;
            }
        }
        return str2;
    }

    public static String n(String str) {
        String strT = t(str);
        String str2 = ah() + strT;
        if (!w(str2) && !ak()) {
            String str3 = ai() + strT;
            if (w(str3)) {
                return str3;
            }
            String str4 = s() + strT;
            if (w(str4)) {
                return str4;
            }
        }
        return str2;
    }

    private static String ah() {
        return ac() + "/subtitles/";
    }

    private static String ai() {
        return z() + "/subtitles/";
    }

    private static String s() {
        return ab() + "/subtitles/";
    }

    public static String o(String str) {
        return ag() + t(str);
    }

    public static String c(String str) {
        String strT = t(str);
        String str2 = w() + strT;
        if (!w(str2)) {
            if (CommonUtil.ca()) {
                String str3 = af() + strT;
                if (w(str3)) {
                    return str3;
                }
            }
            if (!ak()) {
                String str4 = v() + strT;
                if (w(str4)) {
                    return str4;
                }
                String str5 = u() + strT;
                if (w(str5)) {
                    return str5;
                }
            }
        }
        return str2;
    }

    public static String b(String str) {
        return w() + t(str);
    }

    public static String d(String str) {
        String strT = t(str);
        String str2 = q() + strT;
        if (!w(str2) && !ak()) {
            String str3 = t() + strT;
            if (w(str3)) {
                return str3;
            }
            String str4 = r() + strT;
            if (w(str4)) {
                return str4;
            }
        }
        return str2;
    }

    public static String e(String str) {
        return q() + t(str);
    }

    public static String i(String str) {
        if (TextUtils.isEmpty(str)) {
            return y() + a() + WatchFaceConstant.XML_SUFFIX;
        }
        return y() + a() + "_" + str + WatchFaceConstant.XML_SUFFIX;
    }

    public static String g(String str) {
        if (TextUtils.isEmpty(str)) {
            String str2 = a() + WatchFaceConstant.XML_SUFFIX;
            String str3 = y() + str2;
            if (!w(str3) && !ak()) {
                String str4 = x() + str2;
                if (w(str4)) {
                    return str4;
                }
                String str5 = aa() + str2;
                if (w(str5)) {
                    return str5;
                }
            }
            return str3;
        }
        String str6 = a() + "_" + str + WatchFaceConstant.XML_SUFFIX;
        String str7 = y() + str6;
        if (!w(str7) && !ak()) {
            String str8 = x() + str6;
            if (w(str8)) {
                return str8;
            }
            String str9 = aa() + str6;
            if (w(str9)) {
                return str9;
            }
        }
        return str7;
    }

    private static boolean w(String str) {
        return new File(str).exists();
    }

    public static boolean s(String str) {
        return new File(l(str)).exists();
    }

    public static boolean p(String str) {
        return new File(c(str)).exists();
    }

    public static boolean d(String str, long j) {
        File file = new File(c(str));
        if (file.exists()) {
            return b(file, j);
        }
        return false;
    }

    public static boolean b(String str, long j, String str2) {
        if (!b(str, str2)) {
            return false;
        }
        File file = new File(d(str));
        if (file.exists()) {
            return b(file, j);
        }
        return false;
    }

    private static boolean b(String str, String str2) {
        String str3;
        if (!TextUtils.isEmpty(h)) {
            str3 = "fit_mp3_id_" + h + str;
        } else {
            str3 = "fit_mp3_id_" + str;
        }
        String strH = h(str3);
        if (strH != null && strH.equals(str2)) {
            return true;
        }
        File file = new File(d(str));
        if (file.exists() && file.delete()) {
            LogUtil.j("Suggestion_FileConfig", str, ":isValidFileUrl:", "delete");
        }
        e(str3, str2);
        return false;
    }

    public static boolean c(String str, String str2) {
        File file = FileUtils.getFile(c(str));
        if (file == null || !file.exists()) {
            return false;
        }
        return d(file, str2);
    }

    public static String a(String str) {
        return t(str);
    }

    public static boolean b(String str, long j) {
        File file = new File(l(str));
        if (file.exists()) {
            return b(file, j);
        }
        return false;
    }

    public static boolean a(String str, String str2) {
        File file = FileUtils.getFile(l(str));
        if (file == null || !file.exists()) {
            return false;
        }
        return d(file, str2);
    }

    public static boolean b(File file, long j) {
        long jLastModified = file.lastModified();
        boolean z = jLastModified / 1000 == j / 1000;
        if (!z) {
            String name = file.getName();
            ReleaseLogUtil.e("Suggestion_FileConfig", name, ":", "is valid, inputModify=", Long.valueOf(j), ", recModify=", Long.valueOf(jLastModified));
            if (file.delete()) {
                ReleaseLogUtil.e("Suggestion_FileConfig", name, ":", "delete");
            }
        }
        return z;
    }

    private static boolean d(File file) {
        if (file == null) {
            return false;
        }
        try {
            String canonicalPath = file.getCanonicalPath();
            return canonicalPath.equals(CommonUtil.e(canonicalPath));
        } catch (IOException e2) {
            LogUtil.j("Suggestion_FileConfig", "isFilePathValid ", LogAnonymous.b(e2));
            return false;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v11 */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.io.FileInputStream] */
    /* JADX WARN: Type inference failed for: r4v3 */
    /* JADX WARN: Type inference failed for: r4v4 */
    /* JADX WARN: Type inference failed for: r4v6 */
    /* JADX WARN: Type inference failed for: r4v7 */
    /* JADX WARN: Type inference failed for: r4v8 */
    /* JADX WARN: Type inference failed for: r4v9 */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1, types: [java.io.FileInputStream] */
    /* JADX WARN: Type inference failed for: r5v2, types: [java.io.FileInputStream, java.io.InputStream] */
    private static boolean d(File file, String str) throws Throwable {
        ?? fileInputStream;
        if (!d(file)) {
            LogUtil.j("Suggestion_FileConfig", "file path is not valid");
            return false;
        }
        String name = file.getName();
        ?? r4 = 0;
        ?? r5 = 0;
        try {
            try {
                fileInputStream = new FileInputStream(file);
                try {
                    r4 = 1;
                    r4 = 1;
                    if (pef.c(fileInputStream).equals(str)) {
                        c(name, file.lastModified());
                        try {
                            fileInputStream.close();
                            return true;
                        } catch (IOException e2) {
                            LogUtil.j("Suggestion_FileConfig", LogAnonymous.b(e2));
                            return true;
                        }
                    }
                    LogUtil.j("Suggestion_FileConfig", name, ":", "is valid");
                    if (file.delete()) {
                        LogUtil.j("Suggestion_FileConfig", name, ":", "delete");
                    }
                    try {
                        fileInputStream.close();
                    } catch (IOException e3) {
                        LogUtil.j("Suggestion_FileConfig", LogAnonymous.b(e3));
                    }
                    return false;
                } catch (FileNotFoundException e4) {
                    e = e4;
                    r5 = fileInputStream;
                    LogUtil.j("Suggestion_FileConfig", LogAnonymous.b(e));
                    r4 = r5;
                    if (r5 != 0) {
                        try {
                            r5.close();
                            r4 = r5;
                        } catch (IOException e5) {
                            LogUtil.j("Suggestion_FileConfig", LogAnonymous.b(e5));
                            r4 = r5;
                        }
                    }
                } catch (Throwable th) {
                    th = th;
                    if (fileInputStream != 0) {
                        try {
                            fileInputStream.close();
                        } catch (IOException e6) {
                            LogUtil.j("Suggestion_FileConfig", LogAnonymous.b(e6));
                        }
                    }
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
                fileInputStream = r4;
            }
        } catch (FileNotFoundException e7) {
            e = e7;
        }
    }

    private static String t(String str) {
        if (str == null) {
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

    public static String f(String str) {
        String strA;
        if (TextUtils.isEmpty(str)) {
            strA = a();
        } else {
            strA = a() + "_" + str;
        }
        if (TextUtils.isEmpty(h)) {
            return strA;
        }
        return strA + "_" + h;
    }

    private static String d(String str, String str2) {
        if (TextUtils.isEmpty(str2)) {
            return str;
        }
        return str + "_" + str2;
    }

    public static boolean m() {
        return xkd.d().h();
    }

    private static boolean ak() {
        return !m() || h() || i();
    }

    public static boolean i() {
        String strE = buh.e("IS_CP_COMPLETE_SD_KEY_MOVE_SERVICE");
        return strE != null && "1".equals(strE);
    }

    public static void l() {
        buh.d("IS_CP_COMPLETE_SD_KEY_MOVE_SERVICE", "1");
        LogUtil.d("Suggestion_FileConfig", "setCopyCompletePref()");
    }

    public static boolean h() {
        String strE = buh.e("IS_DEL_COMPLETE_SD_KEY_MOVE_SERVICE");
        return strE != null && "1".equals(strE);
    }

    public static void k() {
        buh.d("IS_DEL_COMPLETE_SD_KEY_MOVE_SERVICE", "1");
        LogUtil.d("Suggestion_FileConfig", "setDeleteCompletePref()");
    }

    public static void c(String str, long j) {
        BaseApplication.getContext().getApplicationContext().getSharedPreferences("file_fit_workout", 0).edit().putLong(str, j).commit();
    }

    public static long m(String str) {
        return BaseApplication.getContext().getApplicationContext().getSharedPreferences("file_fit_workout", 0).getLong(str, 0L);
    }

    public static void e(String str, String str2) {
        BaseApplication.getContext().getApplicationContext().getSharedPreferences("MULTI_LANGUAGE", 0).edit().putString(str, str2).commit();
    }

    public static void d(String str, String str2, String str3) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str3)) {
            LogUtil.j("Suggestion_FileConfig", "setMultiLanguageUrl() langName or url is null");
        } else {
            e(d(str, str2), str3);
        }
    }

    public static String h(String str) {
        return BaseApplication.getContext().getApplicationContext().getSharedPreferences("MULTI_LANGUAGE", 0).getString(str, null);
    }

    public static void c(String str, boolean z) {
        BaseApplication.getContext().getApplicationContext().getSharedPreferences("MULTI_LANGUAGE", 0).edit().putBoolean(str, z).commit();
    }

    public static boolean j(String str) {
        return BaseApplication.getContext().getApplicationContext().getSharedPreferences("MULTI_LANGUAGE", 0).getBoolean(str, false);
    }

    public static void a(String str, long j) {
        BaseApplication.getContext().getApplicationContext().getSharedPreferences("MULTI_LANGUAGE", 0).edit().putLong(str, j).commit();
    }

    public static long k(String str) {
        return BaseApplication.getContext().getApplicationContext().getSharedPreferences("MULTI_LANGUAGE", 0).getLong(str, 0L);
    }

    public static long b() {
        File file = new File(ac());
        if (!file.exists() && !file.mkdirs()) {
            LogUtil.e("Suggestion_FileConfig", "file.mkdirs() fail");
        }
        StatFs statFs = new StatFs(e(file));
        return statFs.getAvailableBlocksLong() * statFs.getBlockSizeLong();
    }

    public static long j() {
        String strAc = ac();
        long jC = 0;
        for (String str : e()) {
            jC += c(new File(strAc + "/" + str));
        }
        return jC;
    }

    private static long c(File file) {
        long jC;
        File[] fileArrListFiles = file.listFiles();
        long j = 0;
        if (fileArrListFiles == null) {
            return 0L;
        }
        for (File file2 : fileArrListFiles) {
            if (file2 != null && file2.isFile()) {
                jC = file2.length();
            } else {
                jC = c(file2);
            }
            j += jC;
        }
        return j;
    }

    public static String d() {
        if (LanguageUtil.o(BaseApplication.getContext())) {
            return "BPF001_CN_F_VERSION";
        }
        return "BPF001_EN_F_VERSION";
    }

    public static String a() {
        return SharedPreferenceManager.b("MMKV_SUGGEST_MODULE_TAG", "MATCH_MULTI_LANGUAGE_AUDIO_TAG", "BPF001_EN");
    }

    public static String c() {
        if (LanguageUtil.o(BaseApplication.getContext())) {
            return "BPF001_CN";
        }
        return "BPF001_" + LanguageUtil.b(BaseApplication.getContext()).toUpperCase(Locale.ROOT);
    }

    private static String p() {
        if (LanguageUtil.o(BaseApplication.getContext())) {
            return "/videos/";
        }
        return "/videosEn/";
    }

    private static String n() {
        if (LanguageUtil.o(BaseApplication.getContext())) {
            return "/audios/";
        }
        return "/audiosEn/";
    }

    private static String o() {
        if (!TextUtils.isEmpty(h)) {
            String str = "/audiosBase" + h + "/";
            y("/audiosBase" + h);
            return str;
        }
        if (LanguageUtil.o(BaseApplication.getContext())) {
            return "/audiosBase/";
        }
        return "/audiosBaseEn/";
    }

    private static void y(String str) {
        if (TextUtils.isEmpty(str)) {
            LogUtil.j("Suggestion_FileConfig", "saveTimbreFileName() fileName is null!");
            return;
        }
        List<String> listAe = ae();
        if (!listAe.isEmpty() && listAe.contains(str)) {
            LogUtil.j("Suggestion_FileConfig", "saveTimbreFileName() fileName already exists !");
        } else {
            listAe.add(str);
            SharedPreferenceManager.e(BaseApplication.getContext().getApplicationContext(), "FILE_NAME_MORE_TIMBRE", "FILE_NAME_MORE_TIMBRE_KEY", qqt.b(listAe), null);
        }
    }

    private static List<String> ae() {
        ArrayList arrayList = new ArrayList(16);
        String[] strArr = (String[]) qqt.e(SharedPreferenceManager.e(BaseApplication.getContext().getApplicationContext(), "FILE_NAME_MORE_TIMBRE", "FILE_NAME_MORE_TIMBRE_KEY"), String[].class);
        if (strArr != null) {
            arrayList.addAll(Arrays.asList(strArr));
        }
        return arrayList;
    }

    public static void r(String str) {
        LogUtil.a("Suggestion_FileConfig", "setTimbre() timbre:", str);
        if (TextUtils.equals(str, "0")) {
            h = "";
        } else {
            h = str;
        }
    }

    public static void q(String str) {
        SharedPreferenceManager.c("MMKV_SUGGEST_MODULE_TAG", "MATCH_MULTI_LANGUAGE_AUDIO_TAG", str);
    }
}
