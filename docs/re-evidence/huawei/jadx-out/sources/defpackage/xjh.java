package defpackage;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.text.TextUtils;
import com.google.gson.Gson;
import com.huawei.health.h5pro.utils.GeneralUtil;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.pluginachievement.manager.model.ParsedFieldTag;
import health.compact.a.Utils;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes20.dex */
public class xjh {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final String f53110a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final String f53111c;
    public static final String d;
    public static final String e;

    static {
        String str = BaseApplication.getContext().getFilesDir() + File.separator + "medalziptemp";
        e = str;
        f53111c = BaseApplication.getContext().getFilesDir() + File.separator + "medallocal";
        d = BaseApplication.getContext().getFilesDir() + File.separator + "medallocal250" + File.separator;
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(File.separator);
        sb.append("medalConfig.json");
        f53110a = sb.toString();
    }

    public static String b(ouq ouqVar, String str) throws Throwable {
        String strC;
        if (ouqVar != null && !TextUtils.isEmpty(ouqVar.c()) && !TextUtils.isEmpty(str)) {
            String strC2 = ouqVar.c();
            String str2 = e;
            File file = new File(str2);
            if (!file.exists()) {
                LogUtil.a("MedalZipUtil", "createMedalZipById isMkdir == ", Boolean.valueOf(file.mkdir()));
            }
            String strA = pax.a(strC2, ParsedFieldTag.LIGHT_LIST_STYLE);
            boolean zExists = new File(strA).exists();
            if (Utils.o() && pax.j(strC2)) {
                if (!zExists) {
                    strA = g(strC2);
                }
                if (TextUtils.isEmpty(strA)) {
                    LogUtil.j("MedalZipUtil", "local medalId ", strC2, " isPngExists false!");
                    return "";
                }
                strC = osz.c(strC2);
            } else {
                if (!zExists) {
                    LogUtil.j("MedalZipUtil", "medalId ", strC2, " isPngExists ", Boolean.valueOf(zExists));
                    return "";
                }
                strC = osz.c(strC2);
                if (TextUtils.isEmpty(strC) || !ouk.a(BaseApplication.getContext(), strC2)) {
                    LogUtil.j("MedalZipUtil", "medal3d ", strC2, " is3dExists not downing!");
                } else if (!new File(strC).exists()) {
                    LogUtil.j("MedalZipUtil", "medalId ", strC2, " is3dExists false");
                    return "";
                }
            }
            LogUtil.a("MedalZipUtil", "createMedalZipById: medalPngLength -> " + new File(strA).length() + ", medal3dLength -> " + new File(strC).length());
            String strD = d(ouqVar);
            String str3 = f53110a;
            LogUtil.a("MedalZipUtil", "createMedalZipById isSaveJsonSuccess == ", Boolean.valueOf(c(str3, strD)));
            String str4 = str2 + File.separator + str + "_medal_" + strC2 + ".zip";
            boolean zB = new xjd(str4).b(strA, strC, str3);
            i(str3);
            return zB ? str4 : "";
        }
        return "";
    }

    private static String g(String str) {
        String str2 = f53111c + File.separator + str + "_lightListStyle.png";
        return new File(str2).exists() ? str2 : "";
    }

    private static void i(String str) {
        if (d(str)) {
            LogUtil.a("MedalZipUtil", "deleteMedalConfigFile success");
        }
    }

    public static String c(String str, int i, ArrayList<our> arrayList, String str2) throws Throwable {
        String str3;
        if (njy.e(arrayList)) {
            LogUtil.j("MedalZipUtil", "createMedalGainZipById gainList isEmpty.");
            return "";
        }
        File file = new File(str);
        if (!file.exists()) {
            LogUtil.a("MedalZipUtil", "createMedalGainZipById isMkdir == ", Boolean.valueOf(file.mkdir()));
        }
        if (i == 1) {
            str3 = str + File.separator + str2 + "_medal_light_list.json";
        } else if (i != 2) {
            str3 = "";
        } else {
            str3 = str + File.separator + str2 + "_medal_light.json";
        }
        String json = new Gson().toJson(arrayList);
        boolean zC = c(str3, json);
        LogUtil.a("MedalZipUtil", "createMedalGainZipById jsonStr == ", json, " isSaveJsonSuccess == ", Boolean.valueOf(zC));
        return zC ? str3 : "";
    }

    private static String d(ouq ouqVar) {
        String json = new Gson().toJson(ouqVar);
        LogUtil.a("MedalZipUtil", "medalList2Json medalListJson ==", json);
        return json;
    }

    private static boolean c(String str, String str2) throws Throwable {
        FileOutputStream fileOutputStream;
        if (!GeneralUtil.isSafePath(str)) {
            LogUtil.j("MedalZipUtil", "saveJsonStrToFile: untrusted -> " + str);
            return false;
        }
        if (TextUtils.isEmpty(str2)) {
            LogUtil.j("MedalZipUtil", "saveJsonStrToFile: medalsStr is empty");
            return false;
        }
        FileOutputStream fileOutputStream2 = null;
        try {
            try {
                if (!new File(str).exists()) {
                    LogUtil.j("MedalZipUtil", "saveJsonStrToFile isNewFile == ", Boolean.valueOf(new File(str).createNewFile()));
                }
                fileOutputStream = new FileOutputStream(str);
                try {
                    fileOutputStream.write(str2.getBytes("UTF-8"));
                    d(fileOutputStream);
                    return true;
                } catch (IOException unused) {
                    fileOutputStream2 = fileOutputStream;
                    LogUtil.e("MedalZipUtil", "saveJsonStrToFile IOException.");
                    d(fileOutputStream2);
                    return false;
                } catch (Throwable th) {
                    th = th;
                    d(fileOutputStream);
                    throw th;
                }
            } catch (IOException unused2) {
            }
        } catch (Throwable th2) {
            th = th2;
            fileOutputStream = fileOutputStream2;
        }
    }

    private static void d(FileOutputStream fileOutputStream) {
        if (fileOutputStream != null) {
            try {
                fileOutputStream.flush();
                fileOutputStream.close();
            } catch (IOException unused) {
                LogUtil.e("MedalZipUtil", "saveJsonStrToFile IOException.");
            }
        }
    }

    public static boolean d(String str) {
        if (TextUtils.isEmpty(str)) {
            LogUtil.e("MedalZipUtil", "deleteMedalFile fail path == ", str);
            return false;
        }
        File file = new File(str);
        if (file.exists()) {
            return file.delete();
        }
        return false;
    }

    public static boolean a(String str) {
        File file = new File(str);
        if (!file.exists()) {
            return false;
        }
        if (file.isFile()) {
            return b(str);
        }
        return e(str);
    }

    private static boolean b(String str) {
        if (!GeneralUtil.isSafePath(str)) {
            LogUtil.j("MedalZipUtil", "deleteFile: untrusted -> " + str);
            return false;
        }
        File file = new File(str);
        if (file.isFile() && file.exists()) {
            return file.delete();
        }
        return false;
    }

    private static boolean e(String str) {
        File[] fileArrListFiles;
        String canonicalPath;
        if (!str.endsWith(File.separator)) {
            str = str + File.separator;
        }
        if (!GeneralUtil.isSafePath(str)) {
            LogUtil.j("MedalZipUtil", "deleteDirectory: untrusted -> " + str);
            return false;
        }
        File file = new File(str);
        if (!file.exists() || !file.isDirectory() || (fileArrListFiles = file.listFiles()) == null) {
            return false;
        }
        boolean zE = true;
        for (File file2 : fileArrListFiles) {
            try {
                canonicalPath = file2.getCanonicalPath();
            } catch (IOException e2) {
                LogUtil.e("MedalZipUtil", "getCanonicalPath suffix invalid,error:", e2.getMessage());
                canonicalPath = "";
            }
            if (TextUtils.isEmpty(canonicalPath)) {
                break;
            }
            if (file2.isFile()) {
                zE = b(canonicalPath);
                if (!zE) {
                    break;
                }
            } else {
                zE = e(canonicalPath);
                if (!zE) {
                    break;
                }
            }
        }
        if (zE) {
            return file.delete();
        }
        return false;
    }

    public static Bitmap e(String str, String str2) {
        Bitmap bitmapDecodeFile = null;
        if (!GeneralUtil.isSafePath(str)) {
            LogUtil.j("MedalZipUtil", "loadImage: untrusted -> " + str);
            return null;
        }
        if (new File(str).exists()) {
            BitmapFactory.Options options = new BitmapFactory.Options();
            options.inPreferredConfig = Bitmap.Config.RGB_565;
            try {
                bitmapDecodeFile = BitmapFactory.decodeFile(str, options);
            } catch (OutOfMemoryError unused) {
                LogUtil.e("MedalZipUtil", "loadImage:OutOfMemoryError");
            }
        }
        if (bitmapDecodeFile == null) {
            LogUtil.j("MedalZipUtil", "showMedalBitmap loadImage is null! medal ", str2);
        }
        return bitmapDecodeFile;
    }

    public static String a(String str, String str2) throws Throwable {
        FileOutputStream fileOutputStream;
        String strC = c(str2);
        if (TextUtils.isEmpty(strC)) {
            LogUtil.j("MedalZipUtil", "compressMedalPng png not download!");
            return d(str2, strC);
        }
        Bitmap bitmapC = qqf.c(e(strC, str2), 250, 250);
        if (bitmapC == null) {
            return d(str2, strC);
        }
        StringBuilder sb = new StringBuilder();
        String str3 = d;
        sb.append(str3);
        sb.append(str);
        sb.append("_medal_");
        sb.append(str2);
        sb.append(".png");
        String string = sb.toString();
        if (!GeneralUtil.isSafePath(string)) {
            LogUtil.j("MedalZipUtil", "compressMedalPng: untrusted -> " + string);
            return "";
        }
        File file = new File(str3);
        if (!file.exists()) {
            LogUtil.a("MedalZipUtil", "createMedalZipById isMkdir == ", Boolean.valueOf(file.mkdir()));
        }
        File file2 = new File(string);
        FileOutputStream fileOutputStream2 = null;
        try {
            try {
                if (!file2.createNewFile()) {
                    LogUtil.j("MedalZipUtil", "File ", file2.getPath(), " already exists");
                    String strD = d(str2, string);
                    a((FileOutputStream) null);
                    return strD;
                }
                fileOutputStream = new FileOutputStream(file2);
                try {
                    bitmapC.compress(Bitmap.CompressFormat.PNG, 100, fileOutputStream);
                    fileOutputStream.flush();
                    a(fileOutputStream);
                } catch (FileNotFoundException unused) {
                    fileOutputStream2 = fileOutputStream;
                    LogUtil.e("MedalZipUtil", "saveImage FileNotFoundException");
                    a(fileOutputStream2);
                } catch (IOException unused2) {
                    fileOutputStream2 = fileOutputStream;
                    LogUtil.e("MedalZipUtil", "saveImage IOException");
                    a(fileOutputStream2);
                } catch (Throwable th) {
                    th = th;
                    a(fileOutputStream);
                    throw th;
                }
                return d(str2, string);
            } catch (Throwable th2) {
                th = th2;
                fileOutputStream = null;
            }
        } catch (FileNotFoundException unused3) {
        } catch (IOException unused4) {
        }
    }

    public static String c(String str) {
        String strA = pax.a(str, ParsedFieldTag.LIGHT_LIST_STYLE);
        boolean zExists = new File(strA).exists();
        LogUtil.a("MedalZipUtil", "getMedalPngPath isPngExists ", Boolean.valueOf(zExists));
        return (!zExists && Utils.o() && pax.j(str)) ? g(str) : strA;
    }

    private static String d(String str, String str2) {
        boolean zExists = new File(str2).exists();
        if (zExists) {
            LogUtil.j("MedalZipUtil", "checkMedalPath medalId ", str, " isPngExists ", Boolean.valueOf(zExists));
            return str2;
        }
        return "";
    }

    private static void a(FileOutputStream fileOutputStream) {
        if (fileOutputStream != null) {
            try {
                fileOutputStream.close();
            } catch (IOException unused) {
                LogUtil.e("MedalZipUtil", "closeStream, IOException");
            }
        }
    }

    public static String b(String str, String str2) {
        String strC;
        if (!TextUtils.isEmpty(str2) && !TextUtils.isEmpty(str)) {
            String str3 = d;
            File file = new File(str3);
            if (!file.exists()) {
                LogUtil.a("MedalZipUtil", "createMedalZipById isMkdir == ", Boolean.valueOf(file.mkdir()));
            }
            String strA = pax.a(str2, ParsedFieldTag.LIGHT_LIST_STYLE);
            boolean zExists = new File(strA).exists();
            if (Utils.o() && pax.j(str2)) {
                if (!zExists) {
                    strA = g(str2);
                }
                if (TextUtils.isEmpty(strA)) {
                    LogUtil.j("MedalZipUtil", "local medalId ", str2, " isPngExists false!");
                    return "";
                }
                strC = osz.c(str2);
            } else {
                if (!zExists) {
                    LogUtil.j("MedalZipUtil", "medalId ", str2, " isPngExists false");
                    return "";
                }
                strC = osz.c(str2);
                if (TextUtils.isEmpty(strC) || !ouk.a(BaseApplication.getContext(), str2)) {
                    LogUtil.j("MedalZipUtil", "medal3d ", str2, " is3dExists not downing!");
                } else if (!new File(strC).exists()) {
                    LogUtil.j("MedalZipUtil", "medalId ", str2, " is3dExists false");
                    return "";
                }
            }
            LogUtil.a("MedalZipUtil", "compressMedalZip: medalPngLength -> " + new File(strA).length() + ", medal3dLength -> " + new File(strC).length());
            String str4 = str3 + str + "_medal_" + str2 + ".zip";
            return new xjd(str4).b(strA, strC, f53110a) ? str4 : "";
        }
        return "";
    }
}
