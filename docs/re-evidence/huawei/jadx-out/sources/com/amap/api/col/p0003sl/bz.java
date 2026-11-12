package com.amap.api.col.p0003sl;

import android.content.Context;
import android.os.Environment;
import android.os.StatFs;
import android.text.TextUtils;
import com.amap.api.maps.offlinemap.OfflineMapCity;
import com.amap.api.maps.offlinemap.OfflineMapProvince;
import com.huawei.hwsmartinteractmgr.data.SmartMsgConstant;
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
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
public final class bz {
    public static long a() {
        if (!Environment.getExternalStorageState().equals("mounted")) {
            return 0L;
        }
        StatFs statFs = new StatFs(Environment.getExternalStorageDirectory().getPath());
        return ((long) statFs.getFreeBlocks()) * ((long) statFs.getBlockSize());
    }

    public static List<OfflineMapProvince> a(String str, Context context) throws JSONException {
        if (str == null || "".equals(str)) {
            return new ArrayList();
        }
        return a(new JSONObject(str), context);
    }

    public static List<OfflineMapProvince> a(JSONObject jSONObject, Context context) throws Throwable {
        JSONObject jSONObjectOptJSONObject;
        JSONObject jSONObjectOptJSONObject2;
        ArrayList arrayList = new ArrayList();
        if (!jSONObject.has("result")) {
            JSONObject jSONObject2 = new JSONObject();
            try {
                jSONObject2.put("result", new JSONObject().put("offlinemap_with_province_vfour", jSONObject));
                c(jSONObject2.toString(), context);
                jSONObjectOptJSONObject = jSONObject2.optJSONObject("result");
            } catch (JSONException e) {
                JSONObject jSONObjectOptJSONObject3 = jSONObject.optJSONObject("result");
                jv.c(e, "Utility", "parseJson");
                e.printStackTrace();
                jSONObjectOptJSONObject = jSONObjectOptJSONObject3;
            }
        } else {
            jSONObjectOptJSONObject = jSONObject.optJSONObject("result");
        }
        if (jSONObjectOptJSONObject != null) {
            JSONObject jSONObjectOptJSONObject4 = jSONObjectOptJSONObject.optJSONObject("offlinemap_with_province_vfour");
            if (jSONObjectOptJSONObject4 != null) {
                jSONObjectOptJSONObject2 = jSONObjectOptJSONObject4.optJSONObject("offlinemapinfo_with_province");
            }
            return arrayList;
        }
        jSONObjectOptJSONObject2 = jSONObject.optJSONObject("offlinemapinfo_with_province");
        if (jSONObjectOptJSONObject2 != null) {
            if (jSONObjectOptJSONObject2.has("version")) {
                bc.d = a(jSONObjectOptJSONObject2, "version");
            }
            JSONArray jSONArrayOptJSONArray = jSONObjectOptJSONObject2.optJSONArray("provinces");
            if (jSONArrayOptJSONArray != null) {
                for (int i = 0; i < jSONArrayOptJSONArray.length(); i++) {
                    JSONObject jSONObjectOptJSONObject5 = jSONArrayOptJSONArray.optJSONObject(i);
                    if (jSONObjectOptJSONObject5 != null) {
                        arrayList.add(a(jSONObjectOptJSONObject5));
                    }
                }
                JSONArray jSONArrayOptJSONArray2 = jSONObjectOptJSONObject2.optJSONArray("others");
                JSONObject jSONObject3 = (jSONArrayOptJSONArray2 == null || jSONArrayOptJSONArray2.length() <= 0) ? null : jSONArrayOptJSONArray2.getJSONObject(0);
                if (jSONObject3 != null) {
                    arrayList.add(a(jSONObject3));
                    return arrayList;
                }
            }
        }
        return arrayList;
    }

    private static OfflineMapProvince a(JSONObject jSONObject) throws JSONException {
        if (jSONObject == null) {
            return null;
        }
        OfflineMapProvince offlineMapProvince = new OfflineMapProvince();
        offlineMapProvince.setUrl(a(jSONObject, "url"));
        offlineMapProvince.setProvinceName(a(jSONObject, "name"));
        offlineMapProvince.setJianpin(a(jSONObject, "jianpin"));
        offlineMapProvince.setPinyin(a(jSONObject, "pinyin"));
        offlineMapProvince.setProvinceCode(c(a(jSONObject, "adcode")));
        offlineMapProvince.setVersion(a(jSONObject, "version"));
        offlineMapProvince.setSize(Long.parseLong(a(jSONObject, "size")));
        offlineMapProvince.setCityList(b(jSONObject));
        return offlineMapProvince;
    }

    private static String c(String str) {
        return "000001".equals(str) ? SmartMsgConstant.SHOW_METHOD_SMART_CARD : str;
    }

    private static ArrayList<OfflineMapCity> b(JSONObject jSONObject) throws JSONException {
        JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("cities");
        ArrayList<OfflineMapCity> arrayList = new ArrayList<>();
        if (jSONArrayOptJSONArray != null) {
            if (jSONArrayOptJSONArray.length() == 0) {
                arrayList.add(c(jSONObject));
            }
            for (int i = 0; i < jSONArrayOptJSONArray.length(); i++) {
                JSONObject jSONObjectOptJSONObject = jSONArrayOptJSONArray.optJSONObject(i);
                if (jSONObjectOptJSONObject != null) {
                    arrayList.add(c(jSONObjectOptJSONObject));
                }
            }
        }
        return arrayList;
    }

    private static OfflineMapCity c(JSONObject jSONObject) throws JSONException {
        OfflineMapCity offlineMapCity = new OfflineMapCity();
        offlineMapCity.setAdcode(c(a(jSONObject, "adcode")));
        offlineMapCity.setUrl(a(jSONObject, "url"));
        offlineMapCity.setCity(a(jSONObject, "name"));
        offlineMapCity.setCode(a(jSONObject, "citycode"));
        offlineMapCity.setPinyin(a(jSONObject, "pinyin"));
        offlineMapCity.setJianpin(a(jSONObject, "jianpin"));
        offlineMapCity.setVersion(a(jSONObject, "version"));
        offlineMapCity.setSize(Long.parseLong(a(jSONObject, "size")));
        return offlineMapCity;
    }

    public static long a(File file) {
        long length;
        if (!file.isDirectory()) {
            return file.length();
        }
        File[] fileArrListFiles = file.listFiles();
        long j = 0;
        if (fileArrListFiles == null) {
            return 0L;
        }
        for (File file2 : fileArrListFiles) {
            if (file2.isDirectory()) {
                length = a(file2);
            } else {
                length = file2.length();
            }
            j += length;
        }
        return j;
    }

    public static boolean b(File file) throws Exception {
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
                } else if (!b(fileArrListFiles[i])) {
                    return false;
                }
            }
        }
        return file.delete();
    }

    public static String a(Context context, String str) {
        try {
            return eb.a(new GZIPInputStream(dv.a(context).open(str)));
        } catch (Throwable th) {
            jv.c(th, "MapDownloadManager", "readOfflineAsset");
            th.printStackTrace();
            return null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:76:0x007d A[EXC_TOP_SPLITTER, PHI: r3
      0x007d: PHI (r3v7 java.io.FileInputStream) = (r3v6 java.io.FileInputStream), (r3v8 java.io.FileInputStream) binds: [B:38:0x0061, B:48:0x007b] A[DONT_GENERATE, DONT_INLINE], SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Not initialized variable reg: 3, insn: 0x0087: MOVE (r2 I:??[OBJECT, ARRAY]) = (r3 I:??[OBJECT, ARRAY]), block:B:55:0x0087 */
    /* JADX WARN: Type inference failed for: r2v0 */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r2v3, types: [java.io.BufferedReader] */
    /* JADX WARN: Type inference failed for: r2v4 */
    public static String c(File file) {
        FileInputStream fileInputStream;
        IOException e;
        BufferedReader bufferedReader;
        FileNotFoundException e2;
        FileInputStream fileInputStream2;
        StringBuffer stringBuffer = new StringBuffer();
        ?? r2 = 0;
        r2 = 0;
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
                        } catch (FileNotFoundException e3) {
                            e2 = e3;
                            jv.c(e2, "MapDownloadManager", "readOfflineSD filenotfound");
                            e2.printStackTrace();
                            if (bufferedReader != null) {
                                try {
                                    bufferedReader.close();
                                } catch (IOException e4) {
                                    e4.printStackTrace();
                                }
                            }
                            if (fileInputStream != null) {
                                try {
                                    fileInputStream.close();
                                } catch (IOException e5) {
                                    e5.printStackTrace();
                                }
                            }
                            return null;
                        } catch (IOException e6) {
                            e = e6;
                            jv.c(e, "MapDownloadManager", "readOfflineSD io");
                            e.printStackTrace();
                            if (bufferedReader != null) {
                                try {
                                    bufferedReader.close();
                                } catch (IOException e7) {
                                    e7.printStackTrace();
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
                    } catch (IOException e8) {
                        e8.printStackTrace();
                    }
                    try {
                        fileInputStream.close();
                    } catch (IOException e9) {
                        e9.printStackTrace();
                    }
                    return string;
                } catch (FileNotFoundException e10) {
                    e2 = e10;
                    bufferedReader = null;
                } catch (IOException e11) {
                    e = e11;
                    bufferedReader = null;
                } catch (Throwable th) {
                    th = th;
                    if (r2 != 0) {
                        try {
                            r2.close();
                        } catch (IOException e12) {
                            e12.printStackTrace();
                        }
                    }
                    if (fileInputStream == null) {
                        throw th;
                    }
                    try {
                        fileInputStream.close();
                        throw th;
                    } catch (IOException e13) {
                        e13.printStackTrace();
                        throw th;
                    }
                }
            } catch (Throwable th2) {
                fileInputStream = fileInputStream2;
                r2 = file;
                th = th2;
            }
        } catch (FileNotFoundException e14) {
            e2 = e14;
            bufferedReader = null;
            fileInputStream = null;
        } catch (IOException e15) {
            e = e15;
            bufferedReader = null;
            fileInputStream = null;
        } catch (Throwable th3) {
            th = th3;
            fileInputStream = null;
        }
    }

    public static void b(String str, Context context) throws Exception {
        File[] fileArrListFiles = new File(eb.c(context)).listFiles();
        if (fileArrListFiles == null) {
            return;
        }
        for (File file : fileArrListFiles) {
            if (file.exists() && file.getName().contains(str)) {
                b(file);
            }
        }
        a(eb.c(context));
    }

    public static void a(String str) {
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

    private static String a(JSONObject jSONObject, String str) throws JSONException {
        if (jSONObject == null || !jSONObject.has(str) || "[]".equals(jSONObject.getString(str))) {
            return "";
        }
        return jSONObject.optString(str).trim();
    }

    public static void c(String str, Context context) throws Throwable {
        FileOutputStream fileOutputStream;
        if ("".equals(eb.c(context))) {
            return;
        }
        File file = new File(eb.c(context) + "offlinemapv4.png");
        if (!file.exists()) {
            try {
                file.createNewFile();
            } catch (IOException e) {
                jv.c(e, "OfflineUpdateCityHandlerAbstract", "writeSD dirCreate");
                e.printStackTrace();
            }
        }
        if (a() > 1048576) {
            FileOutputStream fileOutputStream2 = null;
            try {
                try {
                    fileOutputStream = new FileOutputStream(file);
                    try {
                        fileOutputStream.write(str.getBytes("utf-8"));
                        try {
                            fileOutputStream.close();
                        } catch (IOException e2) {
                            e2.printStackTrace();
                        }
                    } catch (FileNotFoundException e3) {
                        e = e3;
                        fileOutputStream2 = fileOutputStream;
                        jv.c(e, "OfflineUpdateCityHandlerAbstract", "writeSD filenotfound");
                        e.printStackTrace();
                        if (fileOutputStream2 != null) {
                            try {
                                fileOutputStream2.close();
                            } catch (IOException e4) {
                                e4.printStackTrace();
                            }
                        }
                    } catch (IOException e5) {
                        e = e5;
                        fileOutputStream2 = fileOutputStream;
                        jv.c(e, "OfflineUpdateCityHandlerAbstract", "writeSD io");
                        e.printStackTrace();
                        if (fileOutputStream2 != null) {
                            try {
                                fileOutputStream2.close();
                            } catch (IOException e6) {
                                e6.printStackTrace();
                            }
                        }
                    } catch (Throwable th) {
                        th = th;
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
                    fileOutputStream = fileOutputStream2;
                }
            } catch (FileNotFoundException e8) {
                e = e8;
            } catch (IOException e9) {
                e = e9;
            }
        }
    }

    public static String b(String str) {
        try {
            if (TextUtils.isEmpty(str)) {
                return null;
            }
            return str.substring(str.lastIndexOf("/") + 1, str.indexOf(".zip"));
        } catch (Throwable th) {
            jv.c(th, "Utility", "getZipFileNameFromUrl");
            return null;
        }
    }
}
