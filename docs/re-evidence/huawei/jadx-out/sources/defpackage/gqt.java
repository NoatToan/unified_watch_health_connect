package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import android.location.Location;
import android.location.LocationManager;
import android.text.TextUtils;
import androidx.core.app.ActivityCompat;
import com.amap.api.services.geocoder.GeocodeSearch;
import com.huawei.hms.network.embedded.j;
import com.huawei.phoneservice.feedbackcommon.network.FeedbackWebConstants;
import com.huawei.ui.main.stories.recommendcloud.constants.RecommendConstants;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CountDownLatch;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;
import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.MediaType;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes8.dex */
public class gqt {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static gqs f35916c = new gqs();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Location f35918b;
    private Context d;
    private SharedPreferences f;
    private StringBuffer h;
    private long e = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private boolean f35917a = false;

    /* JADX WARN: Code duplicated, block: B:33:0x0111  */
    /* JADX WARN: Instruction removed from duplicated block: B:33:0x0111, please report this as an issue */
    public void c(Context context, Map<String, gqq> map, String str) throws Throwable {
        if (map.isEmpty()) {
            grn.d("AAR,Track_DownloadUtil", "downloadRoadDataOfCity: map is empty");
            return;
        }
        List<gqq> listE = e(str + "cityadmin.txt");
        if (listE.isEmpty()) {
            grn.d("AAR,Track_DownloadUtil", "downloadRoadDataOfCity: readFile list is null");
            return;
        }
        Location locationC = c(context);
        if (locationC == null) {
            grn.d("AAR,Track_DownloadUtil", "downloadRoadDataOfCity: no location last");
            return;
        }
        List<String> listB = b(listE, locationC.getLatitude(), locationC.getLongitude());
        if (listB.isEmpty()) {
            grn.d("AAR,Track_DownloadUtil", "downloadRoadDataOfCity: no road data of the city");
            return;
        }
        for (Map.Entry<String, gqq> entry : map.entrySet()) {
            for (int i = 0; i < listB.size(); i++) {
                if (listB.get(i).equals(entry.getKey())) {
                    String strD = entry.getValue().d();
                    String strJ = entry.getValue().j();
                    String strB = entry.getValue().b();
                    String string = this.f.getString(strB, null);
                    grn.d("AAR,Track_DownloadUtil", "downloadRoadDataOfCity: fileId " + strB + " sVersion " + strJ);
                    if (string != null && string.equals(strJ)) {
                        if (new File(str + "dat/" + strB).exists()) {
                            grn.d("AAR,Track_DownloadUtil", strB + " ver same ,stop download");
                        } else {
                            a(strD, map, strB, strJ, str + "dat/");
                        }
                    } else {
                        a(strD, map, strB, strJ, str + "dat/");
                    }
                }
            }
        }
    }

    public List<String> b(List<gqq> list, double d, double d2) {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < list.size(); i++) {
            gqq gqqVar = list.get(i);
            if (gqqVar.i() < d2 && d2 < gqqVar.c() && gqqVar.a() < d && d < gqqVar.e()) {
                arrayList.add(gqqVar.b());
                grn.d("AAR,Track_DownloadUtil", "getCurrentCityCode: " + gqqVar.b());
            }
        }
        return arrayList;
    }

    private void b(FileInputStream fileInputStream, InputStreamReader inputStreamReader, BufferedReader bufferedReader) {
        if (bufferedReader != null) {
            try {
                bufferedReader.close();
            } catch (IOException unused) {
                grn.c("AAR,Track_DownloadUtil", "readFile: inputStream close");
            }
        }
        if (inputStreamReader != null) {
            try {
                inputStreamReader.close();
            } catch (IOException unused2) {
                grn.c("AAR,Track_DownloadUtil", "onResponse: streamReader close");
            }
        }
        if (fileInputStream != null) {
            try {
                fileInputStream.close();
            } catch (IOException unused3) {
                grn.c("AAR,Track_DownloadUtil", "onResponse: streamReader close");
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v0, types: [gqt] */
    /* JADX WARN: Type inference failed for: r12v0, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r12v10, types: [java.io.InputStreamReader] */
    /* JADX WARN: Type inference failed for: r12v15 */
    /* JADX WARN: Type inference failed for: r12v2 */
    /* JADX WARN: Type inference failed for: r12v20 */
    /* JADX WARN: Type inference failed for: r12v21 */
    /* JADX WARN: Type inference failed for: r12v22 */
    /* JADX WARN: Type inference failed for: r12v6 */
    /* JADX WARN: Type inference failed for: r12v7, types: [java.io.InputStreamReader] */
    public List<gqq> e(String str) throws Throwable {
        Throwable th;
        BufferedReader bufferedReader;
        InputStreamReader inputStreamReader;
        InputStreamReader inputStreamReader2;
        InputStreamReader inputStreamReader3;
        ArrayList arrayList = new ArrayList();
        FileInputStream fileInputStream = null;
        InputStreamReader inputStreamReader4 = null;
        InputStreamReader inputStreamReader5 = null;
        InputStreamReader inputStreamReader6 = null;
        InputStreamReader inputStreamReader7 = null;
        fileInputStream = null;
        fileInputStream = null;
        fileInputStream = null;
        fileInputStream = null;
        try {
            try {
                File file = new File(gqu.a(str));
                if (!file.exists()) {
                    grn.d("AAR,Track_DownloadUtil", "readFile: file is null");
                    b(null, null, null);
                    return arrayList;
                }
                FileInputStream fileInputStream2 = new FileInputStream(file);
                try {
                    InputStreamReader inputStreamReader8 = new InputStreamReader(fileInputStream2, "UTF-8");
                    try {
                        bufferedReader = new BufferedReader(inputStreamReader8);
                        while (true) {
                            try {
                                String line = bufferedReader.readLine();
                                if (line != null) {
                                    String[] strArrSplit = line.split("\\,");
                                    if (strArrSplit.length == 9) {
                                        gqq gqqVar = new gqq();
                                        gqqVar.c(strArrSplit[0]);
                                        gqqVar.a(strArrSplit[1]);
                                        gqqVar.d(strArrSplit[2]);
                                        gqqVar.b(Double.parseDouble(strArrSplit[3]));
                                        gqqVar.c(Double.parseDouble(strArrSplit[4]));
                                        gqqVar.d(Double.parseDouble(strArrSplit[5]));
                                        gqqVar.a(Double.parseDouble(strArrSplit[6]));
                                        arrayList.add(gqqVar);
                                    }
                                } else {
                                    b(fileInputStream2, inputStreamReader8, bufferedReader);
                                    return arrayList;
                                }
                            } catch (FileNotFoundException unused) {
                                inputStreamReader4 = inputStreamReader8;
                                InputStreamReader inputStreamReader9 = inputStreamReader4;
                                fileInputStream = fileInputStream2;
                                inputStreamReader3 = inputStreamReader9;
                                grn.c("AAR,Track_DownloadUtil", "readFile: FileNotFoundException");
                                str = inputStreamReader3;
                                b(fileInputStream, str, bufferedReader);
                                return arrayList;
                            } catch (IOException unused2) {
                                inputStreamReader5 = inputStreamReader8;
                                InputStreamReader inputStreamReader10 = inputStreamReader5;
                                fileInputStream = fileInputStream2;
                                inputStreamReader2 = inputStreamReader10;
                                grn.c("AAR,Track_DownloadUtil", "readFile: IOException");
                                str = inputStreamReader2;
                                b(fileInputStream, str, bufferedReader);
                                return arrayList;
                            } catch (NumberFormatException unused3) {
                                inputStreamReader6 = inputStreamReader8;
                                InputStreamReader inputStreamReader11 = inputStreamReader6;
                                fileInputStream = fileInputStream2;
                                inputStreamReader = inputStreamReader11;
                                grn.c("AAR,Track_DownloadUtil", "readFile: NumberFormatException ");
                                str = inputStreamReader;
                                b(fileInputStream, str, bufferedReader);
                                return arrayList;
                            } catch (Throwable th2) {
                                th = th2;
                                inputStreamReader7 = inputStreamReader8;
                                InputStreamReader inputStreamReader12 = inputStreamReader7;
                                fileInputStream = fileInputStream2;
                                str = inputStreamReader12;
                                b(fileInputStream, str, bufferedReader);
                                throw th;
                            }
                        }
                    } catch (FileNotFoundException unused4) {
                        bufferedReader = null;
                    } catch (IOException unused5) {
                        bufferedReader = null;
                    } catch (NumberFormatException unused6) {
                        bufferedReader = null;
                    } catch (Throwable th3) {
                        th = th3;
                        bufferedReader = null;
                    }
                } catch (FileNotFoundException unused7) {
                    bufferedReader = null;
                } catch (IOException unused8) {
                    bufferedReader = null;
                } catch (NumberFormatException unused9) {
                    bufferedReader = null;
                } catch (Throwable th4) {
                    th = th4;
                    bufferedReader = null;
                }
            } catch (Throwable th5) {
                th = th5;
            }
        } catch (FileNotFoundException unused10) {
            inputStreamReader3 = null;
            bufferedReader = null;
        } catch (IOException unused11) {
            inputStreamReader2 = null;
            bufferedReader = null;
        } catch (NumberFormatException unused12) {
            inputStreamReader = null;
            bufferedReader = null;
        } catch (Throwable th6) {
            th = th6;
            str = 0;
            bufferedReader = null;
        }
    }

    public Location c(Context context) {
        LocationManager locationManager = (LocationManager) context.getSystemService("location");
        if (ActivityCompat.checkSelfPermission(context, "android.permission.ACCESS_FINE_LOCATION") != 0 && ActivityCompat.checkSelfPermission(context, "android.permission.ACCESS_COARSE_LOCATION") != 0) {
            grn.d("AAR,Track_DownloadUtil", "no gps permissions");
            return null;
        }
        Location lastKnownLocation = locationManager.getLastKnownLocation("network");
        this.f35918b = lastKnownLocation;
        if (lastKnownLocation == null) {
            this.f35918b = locationManager.getLastKnownLocation(GeocodeSearch.GPS);
        }
        return this.f35918b;
    }

    public boolean a(final Context context, final String str, final String str2) {
        if (context == null) {
            grn.d("AAR,Track_DownloadUtil", "requestCloud: context is null, break");
            return false;
        }
        this.d = context;
        this.f = context.getSharedPreferences("road_data", 0);
        if (!c(str2)) {
            grn.d("AAR,Track_DownloadUtil", "requestCloud: don't need request cloud this time");
            return false;
        }
        new Thread(new Runnable() { // from class: gqt.5
            @Override // java.lang.Runnable
            public void run() {
                Call callNewCall = new OkHttpClient().newCall(new Request.Builder().url(str).header("x-version", "1.0").addHeader("traceId", "download_roadData").post(RequestBody.create(MediaType.parse("application/json; charset=utf-8"), "{\"source\": 1,\"ts\":" + System.currentTimeMillis() + ",\"configId\":\"com.huawei.health_pluginLocation_aarConfig_new\",\"matchRules\":{\"RoadData\":\"32\"}}")).build());
                gqy.d().d(context);
                callNewCall.enqueue(new Callback() { // from class: gqt.5.5
                    @Override // okhttp3.Callback
                    public void onFailure(Call call, IOException iOException) {
                        grn.d("AAR,Track_DownloadUtil", "request cloud fail");
                        LinkedHashMap<String, String> linkedHashMap = new LinkedHashMap<>();
                        gqt.this.h = gqt.this.b();
                        linkedHashMap.put("time", new Date(System.currentTimeMillis()).toString());
                        linkedHashMap.put(j.m, gqt.this.h.toString());
                        gqy.d().b(1, gqy.e(), linkedHashMap);
                    }

                    @Override // okhttp3.Callback
                    public void onResponse(Call call, Response response) throws Throwable {
                        grn.d("AAR,Track_DownloadUtil", "request cloud success");
                        LinkedHashMap<String, String> linkedHashMap = new LinkedHashMap<>();
                        gqt.this.h = gqt.this.d(response);
                        linkedHashMap.put("time", new Date(System.currentTimeMillis()).toString());
                        linkedHashMap.put(j.m, gqt.this.h.toString());
                        gqy.d().b(1, gqy.e(), linkedHashMap);
                        String strString = response.body().string();
                        grn.d("AAR,Track_DownloadUtil", "body is" + strString);
                        try {
                            if (strString.contains("resultCode") && new JSONObject(strString).getInt("resultCode") == 0) {
                                Map<String, gqq> mapD = gqt.this.d(strString);
                                if (mapD.isEmpty()) {
                                    grn.d("AAR,Track_DownloadUtil", "requestCloud map is Empty");
                                } else if (gqt.this.c(mapD, str2)) {
                                    gqt.this.c(gqt.this.d, mapD, str2);
                                } else {
                                    gqt.this.d(mapD, str2);
                                }
                            }
                        } catch (JSONException unused) {
                            grn.c("AAR,Track_DownloadUtil", "requestCloud JSONException");
                        }
                    }
                });
            }
        }).start();
        return true;
    }

    public boolean c(Map<String, gqq> map, String str) {
        String strJ = map.get("cityAdmin_config").j();
        String string = this.f.getString("cityAdmin_config", null);
        if (string == null || !string.equals(strJ)) {
            return false;
        }
        if (!new File(str + "cityadmin.txt").exists()) {
            return false;
        }
        grn.d("AAR,Track_DownloadUtil", "checkAdminVerSame: stop admin download");
        return true;
    }

    public Map<String, gqq> d(String str) {
        HashMap map = new HashMap();
        try {
            if (str == null) {
                grn.d("AAR,Track_DownloadUtil", "parseJSON: jsonString is null");
                return map;
            }
            JSONArray jSONArray = new JSONObject(str).getJSONArray("fileList");
            for (int i = 0; i < jSONArray.length(); i++) {
                JSONObject jSONObject = jSONArray.getJSONObject(i);
                gqq gqqVar = new gqq();
                gqqVar.c(jSONObject.getString(RecommendConstants.FILE_ID));
                gqqVar.e(jSONObject.getString(RecommendConstants.VER));
                gqqVar.b(jSONObject.getString(RecommendConstants.DOWNLOAD_URL));
                map.put(jSONObject.getString(RecommendConstants.FILE_ID), gqqVar);
            }
            return map;
        } catch (JSONException unused) {
            grn.c("AAR,Track_DownloadUtil", "parseJSON Exception");
        }
    }

    public void d(Map<String, gqq> map, String str) {
        grn.d("AAR,Track_DownloadUtil", "downloadCityAdmin");
        for (Map.Entry<String, gqq> entry : map.entrySet()) {
            if ("cityAdmin_config".equals(entry.getKey())) {
                a(entry.getValue().d(), map, entry.getValue().b(), entry.getValue().j(), str);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(String str, File file, Map<String, gqq> map, String str2, String str3, Response response, String str4) throws Throwable {
        if (str2.equalsIgnoreCase("cityAdmin_config")) {
            grn.d("AAR,Track_DownloadUtil", "cityadmin download success " + file.renameTo(new File(gqu.a(str4), "cityadmin.txt")));
            this.f.edit().putString("cityAdmin_config", str3).apply();
            LinkedHashMap<String, String> linkedHashMap = new LinkedHashMap<>();
            this.h = d(response, str, map);
            linkedHashMap.put("time", new Date(System.currentTimeMillis()).toString());
            linkedHashMap.put("Dloadcityadmin", this.h.toString());
            gqy.d().b(1, gqy.e(), linkedHashMap);
            c(this.d, map, str4);
            return;
        }
        if (str2.endsWith("PetalMaps_blackList")) {
            grn.d("AAR,Track_DownloadUtil", "blacklist download success " + file.renameTo(new File(gqu.a(str4), "blacklist.txt")));
            this.f.edit().putString("PetalMaps_blackList", str3).apply();
            return;
        }
        e(file, str4);
        this.f.edit().putLong("last_download_time", System.currentTimeMillis()).apply();
        LinkedHashMap<String, String> linkedHashMap2 = new LinkedHashMap<>();
        this.f.edit().putString(str2, str3).apply();
        grn.d("AAR,Track_DownloadUtil", "dealResult:dat download success fileId " + str2 + " version " + str3);
        this.h = e(response, str2, str, str3);
        linkedHashMap2.put("time", new Date(System.currentTimeMillis()).toString());
        linkedHashMap2.put("downloads", this.h.toString());
        gqy.d().b(1, gqy.e(), linkedHashMap2);
    }

    public File d(String str, String str2) {
        File file = new File(gqu.a(str));
        if (!file.exists() || file.isDirectory()) {
            grn.d("AAR,Track_DownloadUtil", "createFile create dir " + file.mkdirs());
        }
        File file2 = new File(gqu.a(file + "/" + str2));
        if (file2.exists()) {
            grn.d("AAR,Track_DownloadUtil", "file.deleteOnExit();");
            boolean zDelete = file2.delete();
            if (zDelete) {
                grn.d("AAR,Track_DownloadUtil", "createFile delete File" + zDelete);
            } else {
                grn.e("AAR,Track_DownloadUtil", "createFile delete Fail");
            }
        }
        if (!file2.exists()) {
            try {
                if (file2.createNewFile()) {
                    grn.d("AAR,Track_DownloadUtil", "create File");
                    return file2;
                }
                grn.e("AAR,Track_DownloadUtil", "create fail");
                return file2;
            } catch (IOException unused) {
                grn.c("AAR,Track_DownloadUtil", "createFile: IOException");
            }
        }
        return file2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(FileOutputStream fileOutputStream, InputStream inputStream) {
        if (fileOutputStream != null) {
            try {
                fileOutputStream.close();
            } catch (IOException unused) {
                grn.c("AAR,Track_DownloadUtil", "onResponse: fileOutputStream close");
            }
        }
        if (inputStream != null) {
            try {
                inputStream.close();
            } catch (IOException unused2) {
                grn.c("AAR,Track_DownloadUtil", "onResponse: inputStream close");
            }
        }
    }

    public boolean a(final String str, final Map<String, gqq> map, final String str2, final String str3, final String str4) {
        new Thread(new Runnable() { // from class: gqt.2
            @Override // java.lang.Runnable
            public void run() {
                grn.a("AAR,Track_DownloadUtil", "startDownloadFile " + str);
                new OkHttpClient().newCall(new Request.Builder().get().url(str).build()).enqueue(new Callback() { // from class: gqt.2.5
                    @Override // okhttp3.Callback
                    public void onFailure(Call call, IOException iOException) {
                        gqt.this.f35917a = false;
                        if (gqt.this.c()) {
                            gqt.this.d(map, str4);
                        }
                        grn.a("AAR,Track_DownloadUtil", "startDownloadFile onFailure");
                    }

                    @Override // okhttp3.Callback
                    public void onResponse(Call call, Response response) throws Throwable {
                        FileOutputStream fileOutputStream;
                        InputStream inputStreamByteStream = response.body().byteStream();
                        byte[] bArr = new byte[4096];
                        if (str4.equals("")) {
                            return;
                        }
                        File fileD = gqt.this.d(str4, gqt.this.a(str));
                        FileOutputStream fileOutputStream2 = null;
                        try {
                            try {
                                fileOutputStream = new FileOutputStream(fileD);
                                while (true) {
                                    try {
                                        int i = inputStreamByteStream.read(bArr);
                                        if (i != -1) {
                                            fileOutputStream.write(bArr, 0, i);
                                        } else {
                                            fileOutputStream.flush();
                                            gqt.this.a(str, fileD, map, str2, str3, response, str4);
                                            gqt.this.f35917a = true;
                                            gqt.this.b(fileOutputStream, inputStreamByteStream);
                                            return;
                                        }
                                    } catch (FileNotFoundException unused) {
                                        fileOutputStream2 = fileOutputStream;
                                        grn.c("AAR,Track_DownloadUtil", "onResponse: FileNotFoundException");
                                        gqt.this.b(fileOutputStream2, inputStreamByteStream);
                                        return;
                                    } catch (IOException unused2) {
                                        fileOutputStream2 = fileOutputStream;
                                        grn.c("AAR,Track_DownloadUtil", "onResponse: fileOutputStream IOException");
                                        gqt.this.b(fileOutputStream2, inputStreamByteStream);
                                        return;
                                    } catch (Throwable th) {
                                        th = th;
                                        gqt.this.b(fileOutputStream, inputStreamByteStream);
                                        throw th;
                                    }
                                }
                            } catch (Throwable th2) {
                                th = th2;
                                fileOutputStream = null;
                            }
                        } catch (FileNotFoundException unused3) {
                        } catch (IOException unused4) {
                        }
                    }
                });
            }
        }).start();
        return this.f35917a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public String a(String str) {
        StringBuffer stringBuffer = new StringBuffer("");
        String[] strArrSplit = str.split("/");
        stringBuffer.append(strArrSplit[strArrSplit.length - 1]);
        return String.valueOf(stringBuffer);
    }

    public void e(File file, String str) throws Throwable {
        ZipFile zipFile;
        BufferedOutputStream bufferedOutputStream;
        BufferedOutputStream bufferedOutputStream2;
        BufferedInputStream bufferedInputStream = null;
        try {
            zipFile = new ZipFile(file);
            try {
                Enumeration<? extends ZipEntry> enumerationEntries = zipFile.entries();
                byte[] bArr = new byte[1024];
                bufferedOutputStream2 = null;
                int i = 0;
                while (enumerationEntries.hasMoreElements()) {
                    try {
                        try {
                            ZipEntry zipEntryNextElement = enumerationEntries.nextElement();
                            if (zipEntryNextElement.isDirectory()) {
                                String strC = c(zipEntryNextElement.getName(), str);
                                if (TextUtils.isEmpty(strC)) {
                                    grn.d("AAR,Track_DownloadUtil", "upZipFile: dirstr is null");
                                    a(bufferedInputStream, bufferedOutputStream2, zipFile);
                                    return;
                                } else {
                                    File file2 = new File(gqu.a(new String(strC.getBytes("8859_1"), "GB2312")));
                                    if (!file2.exists() && !file2.mkdirs()) {
                                        a(bufferedInputStream, bufferedOutputStream2, zipFile);
                                        return;
                                    }
                                }
                            } else {
                                String strC2 = c(zipEntryNextElement.getName(), str);
                                if (TextUtils.isEmpty(strC2)) {
                                    grn.d("AAR,Track_DownloadUtil", "upZipFile: dirstr is null");
                                    a(bufferedInputStream, bufferedOutputStream2, zipFile);
                                    return;
                                }
                                File file3 = new File(gqu.a(strC2));
                                if (file3.exists() && !file3.delete()) {
                                    a(bufferedInputStream, bufferedOutputStream2, zipFile);
                                    return;
                                }
                                if (!file3.exists() && !file3.createNewFile()) {
                                    a(bufferedInputStream, bufferedOutputStream2, zipFile);
                                    return;
                                }
                                if (zipEntryNextElement.getName().contains(FeedbackWebConstants.INVALID_FILE_NAME_PRE)) {
                                    break;
                                }
                                File fileB = b(str, zipEntryNextElement.getName());
                                if (fileB == null) {
                                    a(bufferedInputStream, bufferedOutputStream2, zipFile);
                                    return;
                                }
                                bufferedOutputStream = new BufferedOutputStream(new FileOutputStream(fileB));
                                try {
                                    BufferedInputStream bufferedInputStream2 = new BufferedInputStream(zipFile.getInputStream(zipEntryNextElement));
                                    while (i + 512 <= 104857600) {
                                        try {
                                            int i2 = bufferedInputStream2.read(bArr, 0, 1024);
                                            if (i2 == -1) {
                                                break;
                                            }
                                            bufferedOutputStream.write(bArr, 0, i2);
                                            bufferedOutputStream.flush();
                                            i += i2;
                                        } catch (IOException e) {
                                            e = e;
                                            bufferedInputStream = bufferedInputStream2;
                                            bufferedOutputStream2 = bufferedOutputStream;
                                            e.printStackTrace();
                                            a(bufferedInputStream, bufferedOutputStream2, zipFile);
                                            return;
                                        } catch (Throwable th) {
                                            th = th;
                                            bufferedInputStream = bufferedInputStream2;
                                            a(bufferedInputStream, bufferedOutputStream, zipFile);
                                            throw th;
                                        }
                                    }
                                    bufferedInputStream = bufferedInputStream2;
                                    bufferedOutputStream2 = bufferedOutputStream;
                                } catch (IOException e2) {
                                    e = e2;
                                } catch (Throwable th2) {
                                    th = th2;
                                }
                            }
                        } catch (IOException e3) {
                            e = e3;
                        }
                    } catch (Throwable th3) {
                        th = th3;
                        bufferedOutputStream = bufferedOutputStream2;
                        bufferedInputStream = bufferedInputStream;
                    }
                }
                if (!file.exists() || file.delete()) {
                    a(bufferedInputStream, bufferedOutputStream2, zipFile);
                } else {
                    a(bufferedInputStream, bufferedOutputStream2, zipFile);
                }
            } catch (IOException e4) {
                e = e4;
                bufferedOutputStream2 = null;
            } catch (Throwable th4) {
                th = th4;
                bufferedOutputStream = null;
            }
        } catch (IOException e5) {
            e = e5;
            zipFile = null;
            bufferedOutputStream2 = null;
        } catch (Throwable th5) {
            th = th5;
            zipFile = null;
            bufferedOutputStream = null;
        }
    }

    public static File b(String str, String str2) {
        String[] strArrSplit = str2.split("/");
        if (strArrSplit.length > 1) {
            StringBuffer stringBuffer = new StringBuffer(str);
            for (int i = 0; i < strArrSplit.length - 1; i++) {
                stringBuffer.append(strArrSplit[i]).append("/");
                File file = new File(gqu.a(String.valueOf(stringBuffer)));
                if (!file.exists() && !file.mkdirs()) {
                    return null;
                }
            }
            return new File(gqu.a(String.valueOf(stringBuffer)), gqu.a(strArrSplit[strArrSplit.length - 1]));
        }
        return new File(gqu.a(str), gqu.a(str2));
    }

    public StringBuffer b() {
        this.h = new StringBuffer();
        this.h.append("{\"startTime\": \"").append(String.valueOf(new Date(System.currentTimeMillis()))).append("\",");
        this.h.append(" \"configureId\": \"healthApp_locationPlugin_roadData\",");
        this.h.append(" \"methodType\": \"post\",");
        this.h.append(" \"interface\": \"/commonAbility/configCenter/getUrl\",");
        this.h.append(" \"resultCode\": \"0\",");
        this.h.append(" \"httpCode\": \"\",");
        this.h.append(" \"errorMsg\": \"onFailure\"");
        this.h.append("}");
        return this.h;
    }

    public StringBuffer d(Response response) {
        this.h = new StringBuffer();
        String strValueOf = String.valueOf(new Date(response.sentRequestAtMillis()));
        String strValueOf2 = String.valueOf(new Date(response.receivedResponseAtMillis()));
        this.h.append("{\"startTime\": \"").append(strValueOf).append("\",");
        this.h.append("\"endTime\": \"").append(strValueOf2).append("\",");
        this.h.append(" \"configureId\": \"healthApp_locationPlugin_roadData\",");
        this.h.append(" \"methodType\": \"post\",");
        this.h.append(" \"interface\": \"/commonAbility/configCenter/getUrl\",");
        this.h.append(" \"resultCode\": \"1\"");
        int iCode = response.code();
        if (iCode != 200) {
            return this.h;
        }
        this.h.append(" \"httpCode\": \"").append(iCode).append("\",");
        this.h.append(" \"errorMsg\": \"\"");
        this.h.append("}");
        return this.h;
    }

    public StringBuffer d(Response response, String str, Map<String, gqq> map) {
        this.h = new StringBuffer();
        String strValueOf = String.valueOf(new Date(response.sentRequestAtMillis()));
        String strValueOf2 = String.valueOf(new Date(response.receivedResponseAtMillis()));
        this.h.append("{\"startTime\": \"").append(strValueOf).append("\",");
        this.h.append("\"endTime\": \"").append(strValueOf2).append("\",");
        this.h.append(" \"fileId\": \"cityadmin\",");
        this.h.append(" \"ver\": \"").append(map.get("cityAdmin_config").j()).append("\",");
        this.h.append(" \"url\": \"").append(str).append("\",");
        this.h.append(" \"httpCode\": \"").append(response.code()).append("\"");
        this.h.append("}");
        return this.h;
    }

    public StringBuffer e(Response response, String str, String str2, String str3) {
        this.h = new StringBuffer();
        String strValueOf = String.valueOf(new Date(response.sentRequestAtMillis()));
        String strValueOf2 = String.valueOf(new Date(response.receivedResponseAtMillis()));
        this.h.append("{\"startTime\": \"").append(strValueOf).append("\",");
        this.h.append(" \"endTime\": \"").append(strValueOf2).append("\",");
        this.h.append(" \"fileId\": \"").append(str).append("\",");
        this.h.append(" \"ver\": \"").append(str3).append("\",");
        this.h.append(" \"url\": \"").append(str2).append("\",");
        this.h.append(" \"httpCode\": \"").append(response.code()).append("\"");
        this.h.append("}");
        return this.h;
    }

    public boolean c(String str) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        this.e = this.f.getLong("last_download_time", 0L);
        boolean zB = gqz.b(this.d);
        boolean zA = gqz.a(this.d);
        grn.d("AAR,Track_DownloadUtil", "isNeedRequestCloud:  isWifi " + zB + ", notWifi " + zA + ", lastTime " + this.e);
        long j = this.e;
        if (j == 0) {
            return true;
        }
        if (zB && jCurrentTimeMillis - j > 86400000) {
            grn.d("AAR,Track_DownloadUtil", "isNeedDownLoad: wifi retry per 1 day to update");
            return true;
        }
        if (zA && jCurrentTimeMillis - j > 604800000) {
            grn.d("AAR,Track_DownloadUtil", "isNeedDownLoad: notwifi wifi retry per 7 day to update");
            return true;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append("cityadmin.txt");
        return !new File(sb.toString()).exists();
    }

    public boolean c() {
        int i = this.f.getInt("count", 0);
        int i2 = Calendar.getInstance().get(6);
        int i3 = this.f.getInt("lastDay", 0);
        if (i2 != i3) {
            this.f.edit().putInt("count", 1).apply();
            this.f.edit().putInt("lastDay", i2).apply();
            this.f.edit().putLong("last_retry_time", System.currentTimeMillis()).apply();
            grn.d("AAR,Track_DownloadUtil", "retryLater: not one day, retry first");
            return true;
        }
        if (i > 3 || System.currentTimeMillis() - this.f.getLong("last_retry_time", 0L) <= 3600000) {
            if (i > 3) {
                grn.d("AAR,Track_DownloadUtil", "retryLater: more than three times today");
            } else {
                grn.d("AAR,Track_DownloadUtil", "retryLater: less than an hour since the last retry");
            }
            return false;
        }
        grn.d("AAR,Track_DownloadUtil", "retryLater: retry times is " + i);
        this.f.edit().putInt("count", i + 1).apply();
        this.f.edit().putInt("lastDay", i3).apply();
        this.f.edit().putLong("last_retry_time", System.currentTimeMillis()).apply();
        return true;
    }

    public String c(String str, String str2) throws IOException {
        String canonicalPath = new File(gqu.a(str2), gqu.a(str)).getCanonicalPath();
        if (canonicalPath.startsWith(new File(gqu.a(str2)).getCanonicalPath())) {
            return canonicalPath;
        }
        grn.a("AAR,Track_DownloadUtil", "File is outside extraction target directory.");
        return null;
    }

    private void a(InputStream inputStream, OutputStream outputStream, ZipFile zipFile) {
        if (inputStream != null) {
            try {
                inputStream.close();
            } catch (IOException e) {
                grn.c("AAR,Track_DownloadUtil", "upZipFile: InputStream close exception ", e);
            }
        }
        if (outputStream != null) {
            try {
                outputStream.close();
            } catch (IOException e2) {
                grn.c("AAR,Track_DownloadUtil", "upZipFile: OutputStream close exception ", e2);
            }
        }
        if (zipFile != null) {
            try {
                zipFile.close();
            } catch (IOException e3) {
                grn.c("AAR,Track_DownloadUtil", "upZipFile: zfile close exception ", e3);
            }
        }
    }

    public void b(final Context context, final String str, final String str2, List<String> list, final String str3) {
        this.d = context;
        if (!gqu.b(str2)) {
            grn.c("AAR,Track_DownloadUtil", "[startDownLoad], failed to create savePath");
            return;
        }
        final CountDownLatch countDownLatch = new CountDownLatch(list.size());
        for (final String str4 : list) {
            new Thread(new Runnable() { // from class: gqt.4
                @Override // java.lang.Runnable
                public void run() {
                    try {
                        String strE = gqt.f35916c.e(context, str4, str3);
                        if (TextUtils.isEmpty(strE)) {
                            grn.c("AAR,Track_DownloadUtil", "[startDownLoad], auth is null, tile = " + str4);
                            countDownLatch.countDown();
                            return;
                        }
                        gqt.this.b(str, strE, str2, str4, countDownLatch);
                    } catch (Exception e) {
                        grn.c("AAR,Track_DownloadUtil", "[startDownLoad] Unexpected error: " + e.getMessage());
                        countDownLatch.countDown();
                    }
                }
            }).start();
        }
        try {
            countDownLatch.await();
            grn.d("AAR,Track_DownloadUtil", "[startDownLoad], all file download success");
        } catch (InterruptedException unused) {
            grn.c("AAR,Track_DownloadUtil", "[startDownLoad], waiting for downloads interrupted");
        }
    }

    public void b(String str, String str2, final String str3, final String str4, final CountDownLatch countDownLatch) {
        String str5 = "{\"type\": \"VDM_V2\", \"fileId\": \"" + str4 + "\"}";
        grn.d("AAR,Track_DownloadUtil", "[downloadFromCloud] requesting URL: " + str + ", payload=" + str5);
        final OkHttpClient okHttpClient = new OkHttpClient();
        okHttpClient.newCall(new Request.Builder().url(str).header("authorization", str2).post(RequestBody.create(MediaType.parse("application/json; charset=utf-8"), str5)).build()).enqueue(new Callback() { // from class: gqt.1
            @Override // okhttp3.Callback
            public void onFailure(Call call, IOException iOException) {
                grn.c("AAR,Track_DownloadUtil", "[downloadFromCloud] Error request tile " + str4 + ", error msg:" + iOException.getMessage());
                countDownLatch.countDown();
            }

            @Override // okhttp3.Callback
            public void onResponse(Call call, Response response) throws IOException {
                String strString = response.body().string();
                grn.d("AAR,Track_DownloadUtil", "[downloadFromCloud], response = " + strString);
                Map<String, String> mapB = gqt.this.b(strString);
                if (Integer.parseInt(mapB.get("status")) != 0) {
                    grn.c("AAR,Track_DownloadUtil", "[downloadFromCloud] response status is not 0.");
                    countDownLatch.countDown();
                    return;
                }
                final long j = Long.parseLong(mapB.get("version"));
                String string = mapB.get("url").toString();
                final String str6 = str4 + "_version";
                final String str7 = str3 + str4;
                if (j <= grc.e(str6, 0L, gqt.this.d) && new File(str7).exists()) {
                    grn.e("AAR,Track_DownloadUtil", "[downloadFromCloud] " + str7 + " is already the latest version");
                    countDownLatch.countDown();
                    return;
                }
                okHttpClient.newCall(new Request.Builder().get().url(string).build()).enqueue(new Callback() { // from class: gqt.1.1
                    @Override // okhttp3.Callback
                    public void onFailure(Call call2, IOException iOException) {
                        grn.c("AAR,Track_DownloadUtil", "[downloadFromCloud] Error download tile " + str4 + ", error msg:" + iOException.getMessage());
                        countDownLatch.countDown();
                    }

                    @Override // okhttp3.Callback
                    public void onResponse(Call call2, Response response2) throws Throwable {
                        FileOutputStream fileOutputStream;
                        InputStream inputStreamByteStream = response2.body().byteStream();
                        byte[] bArr = new byte[4096];
                        FileOutputStream fileOutputStream2 = null;
                        try {
                            try {
                                fileOutputStream = new FileOutputStream(gqt.this.d(str3, str4));
                                while (true) {
                                    try {
                                        int i = inputStreamByteStream.read(bArr);
                                        if (i == -1) {
                                            break;
                                        } else {
                                            fileOutputStream.write(bArr, 0, i);
                                        }
                                    } catch (FileNotFoundException unused) {
                                        fileOutputStream2 = fileOutputStream;
                                        grn.c("AAR,Track_DownloadUtil", "[downloadFromCloud] onResponse: FileNotFoundException");
                                        gqt.this.b(fileOutputStream2, inputStreamByteStream);
                                    } catch (IOException unused2) {
                                        fileOutputStream2 = fileOutputStream;
                                        grn.c("AAR,Track_DownloadUtil", "[downloadFromCloud] onResponse: fileOutputStream IOException");
                                        gqt.this.b(fileOutputStream2, inputStreamByteStream);
                                    } catch (Throwable th) {
                                        th = th;
                                        gqt.this.b(fileOutputStream, inputStreamByteStream);
                                        countDownLatch.countDown();
                                        throw th;
                                    }
                                }
                                fileOutputStream.flush();
                                grn.d("AAR,Track_DownloadUtil", "[downloadFromCloud] File downloaded successfully: " + str7);
                                grc.d(str6, j, gqt.this.d);
                                grc.d("download_time", System.currentTimeMillis(), gqt.this.d);
                                gqt.this.b(fileOutputStream, inputStreamByteStream);
                            } catch (Throwable th2) {
                                th = th2;
                                fileOutputStream = null;
                            }
                        } catch (FileNotFoundException unused3) {
                        } catch (IOException unused4) {
                        }
                        countDownLatch.countDown();
                    }
                });
            }
        });
    }

    public Map<String, String> b(String str) {
        HashMap map = new HashMap();
        try {
            JSONObject jSONObject = new JSONObject(str);
            map.put("status", jSONObject.has("status") ? jSONObject.getString("status") : "-1");
            map.put("version", jSONObject.getString("version"));
            JSONArray jSONArray = jSONObject.getJSONArray("fileList");
            if (jSONArray.length() > 0) {
                JSONObject jSONObject2 = jSONArray.getJSONObject(0);
                map.put("url", jSONObject2.getString("url"));
                map.put("name", jSONObject2.getString("name"));
                return map;
            }
        } catch (JSONException unused) {
            map.put("status", "-1");
            grn.c("AAR,Track_DownloadUtil", "[parseResponseJSON], parese exception");
        }
        return map;
    }

    public boolean c(final Context context, final String str, final String str2) {
        if (context == null) {
            grn.d("AAR,Track_DownloadUtil", "requestCloudForBlackList: context is null, break");
            return false;
        }
        this.d = context;
        this.f = context.getSharedPreferences("road_data", 0);
        if (!c(str2)) {
            grn.d("AAR,Track_DownloadUtil", "requestCloudForBlackList: don't need request cloud this time");
            return false;
        }
        new Thread(new Runnable() { // from class: gqt.3
            @Override // java.lang.Runnable
            public void run() {
                Call callNewCall = new OkHttpClient().newCall(new Request.Builder().url(str).header("x-version", "1.0").addHeader("traceId", "download_blackList").post(RequestBody.create(MediaType.parse("application/json; charset=utf-8"), "{\"source\": 1,\"ts\":" + System.currentTimeMillis() + ",\"configId\":\"com.huawei.health_pluginLocation_aarConfig_new\",\"matchRules\":{\"BlackList\":\"32\"}}")).build());
                gqy.d().d(context);
                callNewCall.enqueue(new Callback() { // from class: gqt.3.4
                    @Override // okhttp3.Callback
                    public void onFailure(Call call, IOException iOException) {
                        grn.d("AAR,Track_DownloadUtil", "requestCloudForBlackList fail");
                        LinkedHashMap<String, String> linkedHashMap = new LinkedHashMap<>();
                        gqt.this.h = gqt.this.b();
                        linkedHashMap.put("time", new Date(System.currentTimeMillis()).toString());
                        linkedHashMap.put(j.m, gqt.this.h.toString());
                        gqy.d().b(1, gqy.e(), linkedHashMap);
                    }

                    @Override // okhttp3.Callback
                    public void onResponse(Call call, Response response) throws IOException {
                        grn.d("AAR,Track_DownloadUtil", "requestCloudForBlackList success");
                        LinkedHashMap<String, String> linkedHashMap = new LinkedHashMap<>();
                        gqt.this.h = gqt.this.d(response);
                        linkedHashMap.put("time", new Date(System.currentTimeMillis()).toString());
                        linkedHashMap.put(j.m, gqt.this.h.toString());
                        gqy.d().b(1, gqy.e(), linkedHashMap);
                        String strString = response.body().string();
                        grn.d("AAR,Track_DownloadUtil", "body is" + strString);
                        try {
                            if (strString.contains("resultCode") && new JSONObject(strString).getInt("resultCode") == 0) {
                                Map<String, gqq> mapD = gqt.this.d(strString);
                                if (mapD.isEmpty()) {
                                    grn.d("AAR,Track_DownloadUtil", "requestCloudForBlackList map is Empty");
                                } else {
                                    if (gqt.this.e(mapD, str2)) {
                                        return;
                                    }
                                    gqt.this.b(mapD, str2);
                                }
                            }
                        } catch (JSONException unused) {
                            grn.c("AAR,Track_DownloadUtil", "requestCloudForBlackList JSONException");
                        }
                    }
                });
            }
        }).start();
        return true;
    }

    public void b(Map<String, gqq> map, String str) {
        grn.d("AAR,Track_DownloadUtil", "downloadBlackList");
        for (Map.Entry<String, gqq> entry : map.entrySet()) {
            if ("PetalMaps_blackList".equals(entry.getKey())) {
                a(entry.getValue().d(), map, entry.getValue().b(), entry.getValue().j(), str);
            }
        }
    }

    public boolean e(Map<String, gqq> map, String str) {
        String strJ = map.get("PetalMaps_blackList").j();
        String string = this.f.getString("PetalMaps_blackList", null);
        if (string == null || !string.equals(strJ)) {
            return false;
        }
        if (!new File(str + "blacklist.txt").exists()) {
            return false;
        }
        grn.d("AAR,Track_DownloadUtil", "checkBlackListVerSame: stop blackList download");
        return true;
    }
}
