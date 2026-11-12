package defpackage;

import android.content.Context;
import android.os.Environment;
import android.os.StatFs;
import android.support.v4.media.session.PlaybackStateCompat;
import android.text.TextUtils;
import com.amap.api.maps.offlinemap.OfflineMapCity;
import com.amap.api.maps.offlinemap.OfflineMapProvince;
import com.xiaomi.smarthome.framework.plugin.rn.utils.MediaStoreUtil;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.zip.GZIPInputStream;
import okhttp3.HttpUrl;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
public final class bes {
    public static long a() {
        if (!Environment.getExternalStorageState().equals("mounted")) {
            return 0L;
        }
        StatFs statFs = new StatFs(Environment.getExternalStorageDirectory().getPath());
        return ((long) statFs.getFreeBlocks()) * ((long) statFs.getBlockSize());
    }

    public static long b(File file) {
        if (!file.isDirectory()) {
            return file.length();
        }
        File[] fileArrListFiles = file.listFiles();
        long jB = 0;
        if (fileArrListFiles == null) {
            return 0L;
        }
        for (File file2 : fileArrListFiles) {
            jB += file2.isDirectory() ? b(file2) : file2.length();
        }
        return jB;
    }

    public static OfflineMapProvince c(JSONObject jSONObject) throws JSONException {
        if (jSONObject == null) {
            return null;
        }
        OfflineMapProvince offlineMapProvince = new OfflineMapProvince();
        offlineMapProvince.setUrl(e(jSONObject, "url"));
        offlineMapProvince.setProvinceName(e(jSONObject, "name"));
        offlineMapProvince.setJianpin(e(jSONObject, "jianpin"));
        offlineMapProvince.setPinyin(e(jSONObject, "pinyin"));
        offlineMapProvince.setProvinceCode(o(e(jSONObject, "adcode")));
        offlineMapProvince.setVersion(e(jSONObject, "version"));
        offlineMapProvince.setSize(Long.parseLong(e(jSONObject, MediaStoreUtil.MediaInfo.SIZE)));
        offlineMapProvince.setCityList(j(jSONObject));
        return offlineMapProvince;
    }

    public static String d(Context context, String str) {
        try {
            return zns.x(new GZIPInputStream(zls.b(context).open(str)));
        } catch (Throwable th) {
            m2t.r(th, "MapDownloadManager", "readOfflineAsset");
            th.printStackTrace();
            return null;
        }
    }

    public static String e(JSONObject jSONObject, String str) throws JSONException {
        return (jSONObject == null || !jSONObject.has(str) || HttpUrl.PATH_SEGMENT_ENCODE_SET_URI.equals(jSONObject.getString(str))) ? "" : jSONObject.optString(str).trim();
    }

    public static List<OfflineMapProvince> f(String str, Context context) throws JSONException {
        return (str == null || "".equals(str)) ? new ArrayList() : g(new JSONObject(str), context);
    }

    public static List<OfflineMapProvince> g(JSONObject jSONObject, Context context) throws Throwable {
        JSONObject jSONObjectOptJSONObject;
        JSONObject jSONObjectOptJSONObject2;
        ArrayList arrayList = new ArrayList();
        if (jSONObject.has("result")) {
            jSONObjectOptJSONObject = jSONObject.optJSONObject("result");
        } else {
            JSONObject jSONObject2 = new JSONObject();
            try {
                jSONObject2.put("result", new JSONObject().put("offlinemap_with_province_vfour", jSONObject));
                p(jSONObject2.toString(), context);
                jSONObjectOptJSONObject = jSONObject2.optJSONObject("result");
            } catch (JSONException e) {
                JSONObject jSONObjectOptJSONObject3 = jSONObject.optJSONObject("result");
                m2t.r(e, "Utility", "parseJson");
                e.printStackTrace();
                jSONObjectOptJSONObject = jSONObjectOptJSONObject3;
            }
        }
        if (jSONObjectOptJSONObject != null) {
            JSONObject jSONObjectOptJSONObject4 = jSONObjectOptJSONObject.optJSONObject("offlinemap_with_province_vfour");
            if (jSONObjectOptJSONObject4 == null) {
                return arrayList;
            }
            jSONObjectOptJSONObject2 = jSONObjectOptJSONObject4.optJSONObject("offlinemapinfo_with_province");
        } else {
            jSONObjectOptJSONObject2 = jSONObject.optJSONObject("offlinemapinfo_with_province");
        }
        if (jSONObjectOptJSONObject2 == null) {
            return arrayList;
        }
        if (jSONObjectOptJSONObject2.has("version")) {
            zas.f41085r = e(jSONObjectOptJSONObject2, "version");
        }
        JSONArray jSONArrayOptJSONArray = jSONObjectOptJSONObject2.optJSONArray("provinces");
        if (jSONArrayOptJSONArray == null) {
            return arrayList;
        }
        for (int i = 0; i < jSONArrayOptJSONArray.length(); i++) {
            JSONObject jSONObjectOptJSONObject5 = jSONArrayOptJSONArray.optJSONObject(i);
            if (jSONObjectOptJSONObject5 != null) {
                arrayList.add(c(jSONObjectOptJSONObject5));
            }
        }
        JSONArray jSONArrayOptJSONArray2 = jSONObjectOptJSONObject2.optJSONArray("others");
        JSONObject jSONObject3 = (jSONArrayOptJSONArray2 == null || jSONArrayOptJSONArray2.length() <= 0) ? null : jSONArrayOptJSONArray2.getJSONObject(0);
        if (jSONObject3 == null) {
            return arrayList;
        }
        arrayList.add(c(jSONObject3));
        return arrayList;
    }

    public static void h(String str) {
        File[] fileArrListFiles;
        File file = new File(str);
        if (file.exists() && file.isDirectory() && (fileArrListFiles = file.listFiles()) != null) {
            for (File file2 : fileArrListFiles) {
                if (file2.exists() && file2.isDirectory()) {
                    String[] list = file2.list();
                    if (list == null) {
                        file2.delete();
                    } else if (list.length == 0) {
                        file2.delete();
                    }
                }
            }
        }
    }

    public static String i(String str) {
        try {
            if (TextUtils.isEmpty(str)) {
                return null;
            }
            return str.substring(str.lastIndexOf("/") + 1, str.indexOf(".zip"));
        } catch (Throwable th) {
            m2t.r(th, "Utility", "getZipFileNameFromUrl");
            return null;
        }
    }

    public static ArrayList<OfflineMapCity> j(JSONObject jSONObject) throws JSONException {
        JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("cities");
        ArrayList<OfflineMapCity> arrayList = new ArrayList<>();
        if (jSONArrayOptJSONArray == null) {
            return arrayList;
        }
        if (jSONArrayOptJSONArray.length() == 0) {
            arrayList.add(m(jSONObject));
        }
        for (int i = 0; i < jSONArrayOptJSONArray.length(); i++) {
            JSONObject jSONObjectOptJSONObject = jSONArrayOptJSONArray.optJSONObject(i);
            if (jSONObjectOptJSONObject != null) {
                arrayList.add(m(jSONObjectOptJSONObject));
            }
        }
        return arrayList;
    }

    public static void k(String str, Context context) throws Exception {
        File[] fileArrListFiles = new File(zns.h0(context)).listFiles();
        if (fileArrListFiles == null) {
            return;
        }
        for (File file : fileArrListFiles) {
            if (file.exists() && file.getName().contains(str)) {
                l(file);
            }
        }
        h(zns.h0(context));
    }

    public static boolean l(File file) throws Exception {
        if (file == null || !file.exists()) {
            return false;
        }
        File[] fileArrListFiles = file.listFiles();
        if (fileArrListFiles != null) {
            for (int i = 0; i < fileArrListFiles.length; i++) {
                if (fileArrListFiles[i].isFile()) {
                    if (!fileArrListFiles[i].delete()) {
                        return false;
                    }
                } else if (!l(fileArrListFiles[i])) {
                    return false;
                }
            }
        }
        return file.delete();
    }

    public static OfflineMapCity m(JSONObject jSONObject) throws JSONException {
        OfflineMapCity offlineMapCity = new OfflineMapCity();
        offlineMapCity.setAdcode(o(e(jSONObject, "adcode")));
        offlineMapCity.setUrl(e(jSONObject, "url"));
        offlineMapCity.setCity(e(jSONObject, "name"));
        offlineMapCity.setCode(e(jSONObject, "citycode"));
        offlineMapCity.setPinyin(e(jSONObject, "pinyin"));
        offlineMapCity.setJianpin(e(jSONObject, "jianpin"));
        offlineMapCity.setVersion(e(jSONObject, "version"));
        offlineMapCity.setSize(Long.parseLong(e(jSONObject, MediaStoreUtil.MediaInfo.SIZE)));
        return offlineMapCity;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0 */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.io.BufferedReader] */
    /* JADX WARN: Type inference failed for: r2v3 */
    public static String n(File file) throws Throwable {
        FileInputStream fileInputStream;
        BufferedReader bufferedReader;
        StringBuffer stringBuffer = new StringBuffer();
        ?? r2 = 0;
        r2 = 0;
        try {
            try {
                try {
                    fileInputStream = new FileInputStream(file);
                    try {
                        bufferedReader = new BufferedReader(new InputStreamReader(fileInputStream, "utf-8"));
                        while (true) {
                            try {
                                String line = bufferedReader.readLine();
                                if (line == null) {
                                    break;
                                }
                                stringBuffer.append(line);
                            } catch (FileNotFoundException e) {
                                e = e;
                                m2t.r(e, "MapDownloadManager", "readOfflineSD filenotfound");
                                e.printStackTrace();
                                if (bufferedReader != null) {
                                    try {
                                        bufferedReader.close();
                                    } catch (IOException e2) {
                                        e2.printStackTrace();
                                    }
                                }
                                if (fileInputStream != null) {
                                    fileInputStream.close();
                                }
                                return null;
                            } catch (IOException e3) {
                                e = e3;
                                m2t.r(e, "MapDownloadManager", "readOfflineSD io");
                                e.printStackTrace();
                                if (bufferedReader != null) {
                                    try {
                                        bufferedReader.close();
                                    } catch (IOException e4) {
                                        e4.printStackTrace();
                                    }
                                }
                                if (fileInputStream != null) {
                                    fileInputStream.close();
                                }
                                return null;
                            }
                        }
                        String string = stringBuffer.toString();
                        try {
                            bufferedReader.close();
                        } catch (IOException e5) {
                            e5.printStackTrace();
                        }
                        try {
                            fileInputStream.close();
                        } catch (IOException e6) {
                            e6.printStackTrace();
                        }
                        return string;
                    } catch (FileNotFoundException e7) {
                        e = e7;
                        bufferedReader = null;
                    } catch (IOException e8) {
                        e = e8;
                        bufferedReader = null;
                    } catch (Throwable th) {
                        th = th;
                        if (r2 != 0) {
                            try {
                                r2.close();
                            } catch (IOException e9) {
                                e9.printStackTrace();
                            }
                        }
                        if (fileInputStream == null) {
                            throw th;
                        }
                        try {
                            fileInputStream.close();
                            throw th;
                        } catch (IOException e10) {
                            e10.printStackTrace();
                            throw th;
                        }
                    }
                } catch (Throwable th2) {
                    th = th2;
                    r2 = file;
                }
            } catch (FileNotFoundException e11) {
                e = e11;
                bufferedReader = null;
                fileInputStream = null;
            } catch (IOException e12) {
                e = e12;
                bufferedReader = null;
                fileInputStream = null;
            } catch (Throwable th3) {
                th = th3;
                fileInputStream = null;
            }
        } catch (IOException e13) {
            e13.printStackTrace();
        }
    }

    public static String o(String str) {
        return "000001".equals(str) ? "100000" : str;
    }

    public static void p(String str, Context context) throws Throwable {
        if ("".equals(zns.h0(context))) {
            return;
        }
        File file = new File(zns.h0(context) + "offlinemapv4.png");
        if (!file.exists()) {
            try {
                file.createNewFile();
            } catch (IOException e) {
                m2t.r(e, "OfflineUpdateCityHandlerAbstract", "writeSD dirCreate");
                e.printStackTrace();
            }
        }
        if (a() <= PlaybackStateCompat.ACTION_SET_CAPTIONING_ENABLED) {
            return;
        }
        FileOutputStream fileOutputStream = null;
        try {
            try {
                FileOutputStream fileOutputStream2 = new FileOutputStream(file);
                try {
                    fileOutputStream2.write(str.getBytes("utf-8"));
                    try {
                        fileOutputStream2.close();
                    } catch (IOException e2) {
                        e2.printStackTrace();
                    }
                } catch (FileNotFoundException e3) {
                    e = e3;
                    fileOutputStream = fileOutputStream2;
                    m2t.r(e, "OfflineUpdateCityHandlerAbstract", "writeSD filenotfound");
                    e.printStackTrace();
                    if (fileOutputStream != null) {
                        try {
                            fileOutputStream.close();
                        } catch (IOException e4) {
                            e4.printStackTrace();
                        }
                    }
                } catch (IOException e5) {
                    e = e5;
                    fileOutputStream = fileOutputStream2;
                    m2t.r(e, "OfflineUpdateCityHandlerAbstract", "writeSD io");
                    e.printStackTrace();
                    if (fileOutputStream != null) {
                        try {
                            fileOutputStream.close();
                        } catch (IOException e6) {
                            e6.printStackTrace();
                        }
                    }
                } catch (Throwable th) {
                    th = th;
                    fileOutputStream = fileOutputStream2;
                    if (fileOutputStream != null) {
                        try {
                            fileOutputStream.close();
                        } catch (IOException e7) {
                            e7.printStackTrace();
                        }
                    }
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (FileNotFoundException e8) {
            e = e8;
        } catch (IOException e9) {
            e = e9;
        }
    }
}
