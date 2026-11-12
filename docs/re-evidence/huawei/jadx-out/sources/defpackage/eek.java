package defpackage;

import android.content.res.Resources;
import android.os.Build;
import android.text.TextUtils;
import com.google.android.material.timepicker.TimeModel;
import com.huawei.hms.mlsdk.asr.MLAsrConstants;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.pluginmgr.hwwear.bean.DeviceDownloadSourceInfo;
import health.compact.a.CommonUtil;
import health.compact.a.IoUtils;
import health.compact.a.UnitUtil;
import health.compact.a.util.LogUtil;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.regex.Pattern;
import org.apache.commons.io.FileUtils;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes7.dex */
public class eek {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static String[] f32850a = {"sr-Latn", "jv-Latn"};

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static HashMap<String, String> f32851c = new HashMap() { // from class: eek.1
        private static final long serialVersionUID = 1212859686823339267L;

        {
            put("sr-Latn", "b+sr+Latn");
            put("jv-Latn", "b+jv+Latn");
        }
    };

    public static List<String> e(String str, JSONObject jSONObject, JSONObject jSONObject2) {
        Locale locale = BaseApplication.getContext().getResources().getConfiguration().locale;
        ArrayList arrayList = new ArrayList(16);
        List<String> listD = d(str, jSONObject, jSONObject2);
        if (listD.size() == 0) {
            return arrayList;
        }
        List<String> listD2 = d(str + "_fromat", jSONObject, jSONObject2);
        int i = 0;
        String strReplace = listD.get(0);
        if (listD2.size() == 0) {
            arrayList.add(strReplace);
            return arrayList;
        }
        List<Object> listA = a(listD2);
        while (i < listA.size()) {
            i++;
            String str2 = "%" + i + "$s";
            strReplace = strReplace.replace("%" + i + "$f", str2).replace(TimeModel.NUMBER_FORMAT, str2).replace("%s", str2).replace("%f", str2).replace("%" + i + "$d", str2);
        }
        arrayList.add(String.format(Locale.ROOT, strReplace, listA.toArray()));
        return arrayList;
    }

    private static List<Object> a(List<String> list) {
        ArrayList arrayList = new ArrayList(16);
        for (String strE : list) {
            if (i(strE)) {
                String strE2 = UnitUtil.e(Long.parseLong(strE), 1, 0);
                LogUtil.e("DeviceDataDealUtils", "isNumber formatValue:", strE2);
                arrayList.add(strE2);
            } else {
                try {
                    String[] strArrSplit = strE.split("\\.");
                    if (strArrSplit.length > 1) {
                        strE = UnitUtil.e(Double.valueOf(strE).doubleValue(), 1, strArrSplit[1].length());
                    }
                } catch (NumberFormatException unused) {
                }
                LogUtil.e("DeviceDataDealUtils", "string formatValue:", strE);
                arrayList.add(strE);
            }
        }
        return arrayList;
    }

    private static boolean i(String str) {
        return Pattern.compile("[0-9]+").matcher(str).matches();
    }

    private static List<String> d(String str, JSONObject jSONObject, JSONObject jSONObject2) {
        ArrayList arrayList = new ArrayList(10);
        if (jSONObject == null) {
            LogUtil.d("DeviceDataDealUtils", "loadStringForWear jsonFile == null.");
            return arrayList;
        }
        try {
            JSONObject jSONObjectB = b(str, jSONObject, jSONObject2);
            if (jSONObjectB != null) {
                Object obj = jSONObjectB.get(str);
                if (obj instanceof String) {
                    arrayList.add((String) obj);
                    return arrayList;
                }
                if (obj instanceof JSONArray) {
                    JSONArray jSONArray = (JSONArray) obj;
                    int length = jSONArray.length();
                    for (int i = 0; i < length; i++) {
                        arrayList.add(jSONArray.getString(i));
                    }
                }
            }
        } catch (JSONException unused) {
            LogUtil.c("DeviceDataDealUtils", "loadStringForWear JSONException");
        }
        return arrayList;
    }

    private static JSONObject b(String str, JSONObject jSONObject, JSONObject jSONObject2) {
        if (jSONObject.has(str)) {
            return jSONObject;
        }
        if (jSONObject2 == null) {
            return null;
        }
        if (jSONObject2.has(str)) {
            return jSONObject2;
        }
        LogUtil.d("DeviceDataDealUtils", "loadStringForWear jsonObject not has key: ", str);
        return null;
    }

    public static File e(String str) {
        File[] fileArrListFiles;
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        File file = new File(str);
        if (file.exists() && file.isDirectory() && (fileArrListFiles = file.listFiles()) != null) {
            return d("en.json", fileArrListFiles);
        }
        return null;
    }

    private static File d(String str, File[] fileArr) {
        File file = null;
        for (File file2 : fileArr) {
            if (str.equals(file2.getName())) {
                file = file2;
            }
        }
        return file;
    }

    public static File c(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        Locale locale = Resources.getSystem().getConfiguration().locale;
        return d(locale.getLanguage(), locale.getCountry(), locale.toLanguageTag(), str);
    }

    private static File d(String str, String str2, String str3, String str4) {
        String str5;
        if (TextUtils.isEmpty(str)) {
            LogUtil.d("DeviceDataDealUtils", " getTargetJsonFile TextUtils.isEmpty(language).");
            return null;
        }
        if (TextUtils.isEmpty(str2)) {
            str5 = str + ".json";
        } else {
            str5 = str + "-r" + str2 + ".json";
        }
        File file = new File(str4);
        if (file.exists() && file.isDirectory()) {
            return d(file.listFiles(), str3, str5, str);
        }
        LogUtil.a("DeviceDataDealUtils", "getFormatString4,jsonDir is not exit");
        return null;
    }

    private static File d(File[] fileArr, String str, String str2, String str3) {
        String strG;
        if (fileArr == null || fileArr.length == 0) {
            LogUtil.d("DeviceDataDealUtils", "getFileByName wrong dir.no file. can not find target file, return null.");
            return null;
        }
        if (str != null && (strG = g(str)) != null) {
            File fileA = a(fileArr, f32851c.get(strG) + ".json");
            if (fileA != null && fileA.length() > 0) {
                LogUtil.a("DeviceDataDealUtils", "getFileByName file is ok");
                return fileA;
            }
            File fileA2 = a(fileArr, "en.json");
            if (fileA2 != null && fileA2.length() > 0) {
                LogUtil.a("DeviceDataDealUtils", "getFileByName en file is ok");
                return fileA2;
            }
        }
        for (File file : fileArr) {
            if (str2.equals(file.getName())) {
                return file;
            }
        }
        if (str2.contains("-r")) {
            String str4 = a(str3) + ".json";
            for (File file2 : fileArr) {
                if (str4.equals(file2.getName())) {
                    return file2;
                }
            }
        }
        for (File file3 : fileArr) {
            if ("en.json".equals(file3.getName())) {
                return file3;
            }
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:37:0x0073  */
    public static String a(String str) {
        byte b2;
        Locale locale = Resources.getSystem().getConfiguration().locale;
        String script = locale.getScript();
        str.hashCode();
        int iHashCode = str.hashCode();
        if (iHashCode != 3149) {
            if (iHashCode != 3241) {
                if (iHashCode != 3325) {
                    if (iHashCode != 3355) {
                        if (iHashCode != 3500) {
                            if (iHashCode == 3886 && str.equals(MLAsrConstants.LAN_ZH)) {
                                b2 = 5;
                            } else {
                                b2 = -1;
                            }
                        } else if (str.equals("my")) {
                            b2 = 4;
                        } else {
                            b2 = -1;
                        }
                    } else if (str.equals("id")) {
                        b2 = 3;
                    } else {
                        b2 = -1;
                    }
                } else if (str.equals("he")) {
                    b2 = 2;
                } else {
                    b2 = -1;
                }
            } else if (str.equals("en")) {
                b2 = 1;
            } else {
                b2 = -1;
            }
        } else if (str.equals("bo")) {
            b2 = 0;
        } else {
            b2 = -1;
        }
        if (b2 == 0) {
            return "bo-rCN";
        }
        if (b2 == 1) {
            return "Qaag".equals(script) ? "en-rGB" : str;
        }
        if (b2 == 2) {
            return Build.VERSION.SDK_INT > 35 ? "iw" : str;
        }
        if (b2 == 3) {
            return Build.VERSION.SDK_INT > 35 ? "in" : str;
        }
        if (b2 == 4) {
            return "Qaag".equals(script) ? "my-rZG" : "my";
        }
        if (b2 != 5) {
            return str;
        }
        if (locale.toString().endsWith("#Hans")) {
            return "zh-rCN";
        }
        return "zh-rTW";
    }

    private static String g(String str) {
        for (String str2 : f32850a) {
            if (str.startsWith(str2)) {
                LogUtil.e("DeviceDataDealUtils", "changeTag is ", str, " after changeTag is ", str2);
                return str2;
            }
        }
        str2 = null;
        LogUtil.e("DeviceDataDealUtils", "changeTag is ", str, " after changeTag is ", str2);
        return str2;
    }

    private static File a(File[] fileArr, String str) {
        for (File file : fileArr) {
            if (str.equals(file.getName())) {
                return file;
            }
        }
        return null;
    }

    public static void e(File file) {
        if (file == null || !file.exists() || !file.isDirectory()) {
            LogUtil.d("DeviceDataDealUtils", "deleteDirWithFile deleteFile is not exist");
            return;
        }
        File[] fileArrListFiles = file.listFiles();
        if (fileArrListFiles == null) {
            LogUtil.d("DeviceDataDealUtils", "deleteDirWithFile files is null");
            return;
        }
        for (File file2 : fileArrListFiles) {
            a(file2);
        }
        if (file.delete()) {
            LogUtil.a("DeviceDataDealUtils", "delete file success");
        }
    }

    private static void a(File file) {
        if (file != null) {
            if (file.isFile()) {
                LogUtil.e("DeviceDataDealUtils", "deleteDirWithFile result=", Boolean.valueOf(file.delete()));
            } else if (file.isDirectory()) {
                e(file);
            } else {
                LogUtil.e("DeviceDataDealUtils", "file type error");
            }
        }
    }

    public static String e() {
        return edf.f32777a + "index_all" + File.separator + "done";
    }

    public static String a() {
        return edf.f32777a + "index_all" + File.separator + "index_all.json";
    }

    public static String d() {
        return edf.f32777a + "img_index_all" + File.separator;
    }

    public static String c() {
        return edf.f32777a + "lang_index_all" + File.separator;
    }

    public static String d(String str) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        return edf.f32777a + str + File.separator;
    }

    public static void b(String str) {
        if (TextUtils.isEmpty(str)) {
            LogUtil.d("DeviceDataDealUtils", "createDoneMarkFile, path is empty");
            return;
        }
        FileOutputStream fileOutputStreamOpenOutputStream = null;
        try {
            File file = new File(str);
            if (file.getParentFile() == null) {
                return;
            }
            if (!file.getParentFile().exists()) {
                LogUtil.a("DeviceDataDealUtils", "createDoneMarkFile isDirMade is ", Boolean.valueOf(file.mkdir()));
            }
            if (!file.exists()) {
                LogUtil.a("DeviceDataDealUtils", "createDoneMarkFile isNewFileCreated is ", Boolean.valueOf(file.createNewFile()));
            }
            String strValueOf = String.valueOf(new Date().getTime() / 1000);
            LogUtil.a("DeviceDataDealUtils", "createDoneMarkFile timestamp is =", strValueOf);
            fileOutputStreamOpenOutputStream = FileUtils.openOutputStream(file);
            byte[] bytes = strValueOf.getBytes("UTF-8");
            fileOutputStreamOpenOutputStream.write(bytes, 0, bytes.length);
            fileOutputStreamOpenOutputStream.flush();
        } catch (IOException unused) {
            LogUtil.c("DeviceDataDealUtils", "createDoneMarkFile createDoneFile IOException");
        } finally {
            IoUtils.c(fileOutputStreamOpenOutputStream);
        }
    }

    /* JADX WARN: Code duplicated, block: B:42:0x00ad  */
    /* JADX WARN: Code duplicated, block: B:46:0x00bc  */
    public static JSONObject b(File file) throws Throwable {
        FileInputStream fileInputStream;
        String str;
        try {
            try {
                String strC = CommonUtil.c(file.getCanonicalPath());
                if (TextUtils.isEmpty(strC)) {
                    LogUtil.d("DeviceDataDealUtils", "getJsonObjectFromFile safePath is empty");
                    if (!TextUtils.isEmpty(null)) {
                        LogUtil.c("DeviceDataDealUtils", null);
                    }
                    IoUtils.c(null);
                    return null;
                }
                fileInputStream = new FileInputStream(strC);
                try {
                    StringBuilder sb = new StringBuilder(16);
                    long length = file.length();
                    if (length <= 0) {
                        if (!TextUtils.isEmpty(null)) {
                            LogUtil.c("DeviceDataDealUtils", null);
                        }
                        IoUtils.c(fileInputStream);
                        return null;
                    }
                    byte[] bArr = new byte[(int) length];
                    while (true) {
                        int i = fileInputStream.read(bArr);
                        if (i == -1) {
                            break;
                        }
                        sb.append(new String(bArr, 0, i, StandardCharsets.UTF_8));
                    }
                    JSONObject jSONObject = new JSONObject(sb.toString());
                    if (!TextUtils.isEmpty(null)) {
                        LogUtil.c("DeviceDataDealUtils", null);
                    }
                    IoUtils.c(fileInputStream);
                    return jSONObject;
                } catch (FileNotFoundException unused) {
                    if (!TextUtils.isEmpty("getJsonObjectFromFile FileNotFoundException")) {
                        LogUtil.c("DeviceDataDealUtils", "getJsonObjectFromFile FileNotFoundException");
                    }
                    IoUtils.c(fileInputStream);
                    return null;
                } catch (UnsupportedEncodingException unused2) {
                    if (!TextUtils.isEmpty("getJsonObjectFromFile UnsupportedEncodingException")) {
                        LogUtil.c("DeviceDataDealUtils", "getJsonObjectFromFile UnsupportedEncodingException");
                    }
                    IoUtils.c(fileInputStream);
                    return null;
                } catch (IOException e) {
                    e = e;
                    str = "getJsonObjectFromFile " + e.getClass().getSimpleName();
                    if (!TextUtils.isEmpty(str)) {
                        LogUtil.c("DeviceDataDealUtils", str);
                    }
                    IoUtils.c(fileInputStream);
                    return null;
                } catch (JSONException e2) {
                    e = e2;
                    str = "getJsonObjectFromFile " + e.getClass().getSimpleName();
                    if (!TextUtils.isEmpty(str)) {
                        LogUtil.c("DeviceDataDealUtils", str);
                    }
                    IoUtils.c(fileInputStream);
                    return null;
                }
            } catch (Throwable th) {
                th = th;
                if (!TextUtils.isEmpty(null)) {
                    LogUtil.c("DeviceDataDealUtils", null);
                }
                IoUtils.c(null);
                throw th;
            }
        } catch (FileNotFoundException unused3) {
            fileInputStream = null;
        } catch (UnsupportedEncodingException unused4) {
            fileInputStream = null;
        } catch (IOException e3) {
            e = e3;
            fileInputStream = null;
            str = "getJsonObjectFromFile " + e.getClass().getSimpleName();
            if (!TextUtils.isEmpty(str)) {
                LogUtil.c("DeviceDataDealUtils", str);
            }
            IoUtils.c(fileInputStream);
            return null;
        } catch (JSONException e4) {
            e = e4;
            fileInputStream = null;
            str = "getJsonObjectFromFile " + e.getClass().getSimpleName();
            if (!TextUtils.isEmpty(str)) {
                LogUtil.c("DeviceDataDealUtils", str);
            }
            IoUtils.c(fileInputStream);
            return null;
        } catch (Throwable th2) {
            th = th2;
            if (!TextUtils.isEmpty(null)) {
                LogUtil.c("DeviceDataDealUtils", null);
            }
            IoUtils.c(null);
            throw th;
        }
    }

    public static DeviceDownloadSourceInfo d(com.huawei.health.devicemgr.business.entity.downloadresouce.DeviceDownloadSourceInfo deviceDownloadSourceInfo) {
        if (deviceDownloadSourceInfo == null) {
            return null;
        }
        DeviceDownloadSourceInfo deviceDownloadSourceInfo2 = new DeviceDownloadSourceInfo(null);
        deviceDownloadSourceInfo2.setConfigurationPoint(deviceDownloadSourceInfo.getConfigurationPoint());
        deviceDownloadSourceInfo2.setIndexName(deviceDownloadSourceInfo.getIndexName());
        deviceDownloadSourceInfo2.setSite(deviceDownloadSourceInfo.getSite());
        return deviceDownloadSourceInfo2;
    }
}
