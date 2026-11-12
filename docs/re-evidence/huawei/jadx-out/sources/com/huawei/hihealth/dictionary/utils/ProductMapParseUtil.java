package com.huawei.hihealth.dictionary.utils;

import android.content.Context;
import android.text.TextUtils;
import androidx.media3.datasource.cache.CacheDataSink;
import com.huawei.hihealth.dictionary.constants.ProductMap;
import com.huawei.hihealth.dictionary.constants.ProductMapInfo;
import com.huawei.hihealth.util.ReleaseLogUtil;
import com.huawei.profile.coordinator.ProfileRequestConstants;
import health.compact.a.HiCommonUtil;
import health.compact.a.util.LogUtil;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class ProductMapParseUtil {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final String f12299b = File.separator + "productmap" + File.separator + "product_map.json";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static boolean f12298a = false;

    private ProductMapParseUtil() {
    }

    public static boolean a(Context context) {
        if (f12298a) {
            return true;
        }
        try {
            boolean zC = c(context, context.getFilesDir().getCanonicalPath() + f12299b);
            if (HiCommonUtil.c(context)) {
                f12298a = zC;
            }
            LogUtil.a("HiH_ProductMapParseUtil", "loadProductMapConfig isParseSuccess = ", Boolean.valueOf(zC));
            return zC;
        } catch (IOException unused) {
            ReleaseLogUtil.e("HiH_ProductMapParseUtil", "loadProductMapConfig getCanonicalPath IOException");
            return false;
        }
    }

    public static boolean c(Context context, String str) {
        JSONArray jSONArray;
        LogUtil.a("HiH_ProductMapParseUtil", "use HiLib parseJsonFile ProductMapParseUtil to parse filePath");
        if (TextUtils.isEmpty(str)) {
            ReleaseLogUtil.b("HiH_ProductMapParseUtil", "parseJsonFile filePath is empty");
            return false;
        }
        String strE = e(context, new File(str));
        if (TextUtils.isEmpty(strE)) {
            ReleaseLogUtil.b("HiH_ProductMapParseUtil", "parseJsonFile urlJsonString is empty");
            return false;
        }
        try {
            JSONArray jSONArray2 = new JSONArray(strE);
            for (int i = 0; i < jSONArray2.length(); i++) {
                JSONObject jSONObject = jSONArray2.getJSONObject(i);
                if (jSONObject.has("productList") && (jSONArray = jSONObject.getJSONArray("productList")) != null && jSONArray.length() != 0) {
                    d(jSONArray);
                }
            }
            LogUtil.a("HiH_HiH_ProductMapParseUtil", "parse productMap jsonFile success");
            return true;
        } catch (JSONException unused) {
            ReleaseLogUtil.e("HiH_ProductMapParseUtil", "parseJsonFile JSONException");
            return false;
        }
    }

    private static void d(JSONArray jSONArray) {
        JSONObject jSONObject;
        for (int i = 0; i < jSONArray.length(); i++) {
            try {
                if ((jSONArray.get(i) instanceof JSONObject) && (jSONObject = (JSONObject) jSONArray.get(i)) != null) {
                    String string = jSONObject.getString("deviceType");
                    String string2 = jSONObject.getString("smartProductId");
                    String string3 = jSONObject.getString("productId");
                    if (!TextUtils.isEmpty(string) && !TextUtils.isEmpty(string2)) {
                        ProductMapInfo productMapInfo = new ProductMapInfo(string, string2, string3, jSONObject.getString("modelName"), jSONObject.getString("manufacturerId"), jSONObject.has("marketingName") ? jSONObject.getString("marketingName") : null, jSONObject.getInt("deviceId"));
                        if (jSONObject.has("skuConfigs")) {
                            c(jSONObject, productMapInfo);
                        }
                        if (jSONObject.has("optionalFileds")) {
                            JSONObject jSONObject2 = jSONObject.getJSONObject("optionalFileds");
                            if (jSONObject2.has("deviceName")) {
                                String string4 = jSONObject2.getString("deviceName");
                                ProductMapInfo.OptionalFileds optionalFileds = new ProductMapInfo.OptionalFileds();
                                optionalFileds.b(string4);
                                productMapInfo.c(optionalFileds);
                            }
                        }
                        ProductMap.b(productMapInfo);
                    }
                }
            } catch (JSONException unused) {
                ReleaseLogUtil.e("HiH_ProductMapParseUtil", "handleProduct JSONException");
            }
        }
    }

    private static void c(JSONObject jSONObject, ProductMapInfo productMapInfo) throws JSONException {
        JSONArray jSONArray = jSONObject.getJSONArray("skuConfigs");
        if (jSONArray.length() > 0) {
            HashMap map = new HashMap();
            for (int i = 0; i < jSONArray.length(); i++) {
                JSONObject jSONObject2 = jSONArray.getJSONObject(i);
                map.put(jSONObject2.getString(ProfileRequestConstants.SUB_PROD_ID), jSONObject2.getString("marketingName"));
            }
            productMapInfo.b(map);
        }
    }

    private static String e(Context context, File file) {
        if (file == null) {
            ReleaseLogUtil.b("HiH_ProductMapParseUtil", "readFileToData, file == null");
            return null;
        }
        LogUtil.a("HiH_ProductMapParseUtil", "enter readFileToData: fileName = ", file.getName());
        if (!file.exists() || b(context, file)) {
            ReleaseLogUtil.b("HiH_ProductMapParseUtil", "readFileToData, file not exist or presetVersionHigher");
            return d("product_map.json", context);
        }
        return d(file);
    }

    private static boolean b(Context context, File file) throws Throwable {
        String strD = d(file);
        String strD2 = d("product_map.json", context);
        if (TextUtils.isEmpty(strD)) {
            LogUtil.a("HiH_ProductMapParseUtil", "presetVersionHigher, localProductMapData is empty");
            return true;
        }
        int iC = c(strD);
        int iC2 = c(strD2);
        ReleaseLogUtil.c("HiH_ProductMapParseUtil", "localVersion, ", Integer.valueOf(iC), ", presetVersion,", Integer.valueOf(iC2));
        return iC < iC2;
    }

    private static int c(String str) {
        if (!TextUtils.isEmpty(str)) {
            try {
                JSONObject jSONObject = new JSONArray(str).getJSONObject(0);
                if (!jSONObject.has("version")) {
                    ReleaseLogUtil.c("HiH_ProductMapParseUtil", "getVersion, has not version");
                    return 0;
                }
                return Integer.parseInt(jSONObject.getString("version"));
            } catch (NumberFormatException | JSONException unused) {
                ReleaseLogUtil.e("HiH_ProductMapParseUtil", "parseJsonFile JSONException or NumberFormatException");
            }
        }
        return 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:?, code lost:
    
        continue;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static String d(File file) {
        long length = file.length();
        if (length > CacheDataSink.DEFAULT_FRAGMENT_SIZE) {
            ReleaseLogUtil.b("HiH_ProductMapParseUtil", "readFileToData, file too length, length=", Long.valueOf(length));
            return "";
        }
        StringBuilder sb = new StringBuilder(2048);
        byte[] bArr = new byte[1024];
        loop0: for (int i = 0; i < 3; i++) {
            sb.delete(0, sb.length());
            try {
                FileInputStream fileInputStream = new FileInputStream(file);
                do {
                    try {
                        continue;
                        int i2 = fileInputStream.read(bArr);
                        if (i2 == -1) {
                            break loop0;
                        }
                        sb.append(new String(bArr, 0, i2, "UTF-8"));
                    } catch (Throwable th) {
                        try {
                            continue;
                            fileInputStream.close();
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                        }
                        throw th;
                    }
                } while (sb.length() <= 5242880);
                fileInputStream.close();
                break loop0;
            } catch (IOException unused) {
                ReleaseLogUtil.e("HiH_ProductMapParseUtil", "readFileToData num=", Integer.valueOf(i), ", dataLen=", Integer.valueOf(sb.length()));
            }
        }
        if (sb.length() > 5242880) {
            ReleaseLogUtil.b("HiH_ProductMapParseUtil", "readFileToData, buffer too length, length=", Integer.valueOf(sb.length()));
            return "";
        }
        return sb.toString();
    }

    private static String d(String str, Context context) throws Throwable {
        BufferedReader bufferedReader;
        StringBuilder sb = new StringBuilder();
        BufferedReader bufferedReader2 = null;
        try {
            try {
                bufferedReader = new BufferedReader(new InputStreamReader(context.getAssets().open(str)));
                while (true) {
                    try {
                        String line = bufferedReader.readLine();
                        if (line != null) {
                            sb.append(line);
                        } else {
                            try {
                                break;
                            } catch (IOException unused) {
                                ReleaseLogUtil.e("HiH_ProductMapParseUtil", "bufferedReader IOException");
                            }
                        }
                    } catch (IOException unused2) {
                        bufferedReader2 = bufferedReader;
                        ReleaseLogUtil.e("HiH_ProductMapParseUtil", "handleProduct IOException");
                        if (bufferedReader2 != null) {
                            try {
                                bufferedReader2.close();
                            } catch (IOException unused3) {
                                ReleaseLogUtil.e("HiH_ProductMapParseUtil", "bufferedReader IOException");
                            }
                        }
                    } catch (Throwable th) {
                        th = th;
                        if (bufferedReader != null) {
                            try {
                                bufferedReader.close();
                            } catch (IOException unused4) {
                                ReleaseLogUtil.e("HiH_ProductMapParseUtil", "bufferedReader IOException");
                            }
                        }
                        throw th;
                    }
                }
                bufferedReader.close();
            } catch (IOException unused5) {
            }
            return sb.toString();
        } catch (Throwable th2) {
            th = th2;
            bufferedReader = bufferedReader2;
        }
    }
}
