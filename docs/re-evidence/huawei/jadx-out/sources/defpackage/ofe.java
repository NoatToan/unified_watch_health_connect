package defpackage;

import android.text.TextUtils;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.LongSerializationPolicy;
import com.google.gson.ToNumberPolicy;
import com.google.gson.reflect.TypeToken;
import com.google.json.JsonSanitizer;
import com.huawei.haf.common.exception.ExceptionUtils;
import com.huawei.haf.common.os.FileUtils;
import health.compact.a.LogUtil;
import health.compact.a.ReleaseLogUtil;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.zip.GZIPOutputStream;

/* JADX INFO: loaded from: classes12.dex */
public class ofe {
    private static GsonBuilder d;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static GsonBuilder f44273b = new GsonBuilder().disableHtmlEscaping().setLongSerializationPolicy(LongSerializationPolicy.STRING);
    private static int e = 1;

    public static Gson c() {
        return f44273b.create();
    }

    private static Gson a() {
        GsonBuilder objectToNumberStrategy = d;
        if (objectToNumberStrategy == null) {
            objectToNumberStrategy = new GsonBuilder().disableHtmlEscaping().setLongSerializationPolicy(LongSerializationPolicy.STRING).setObjectToNumberStrategy(ToNumberPolicy.LAZILY_PARSED_NUMBER);
            d = objectToNumberStrategy;
        }
        return objectToNumberStrategy.create();
    }

    public static Map<String, Object> a(Object obj) {
        return e(c(), obj);
    }

    public static Map<String, Object> d(Object obj) {
        return e(a(), obj);
    }

    private static Map<String, Object> e(Gson gson, Object obj) {
        String json = gson.toJson(obj);
        try {
            return (Map) gson.fromJson(TextUtils.isEmpty(json) ? "" : JsonSanitizer.sanitize(json), new TypeToken<HashMap<String, Object>>() { // from class: com.huawei.networkclient.RequestHelper$1
            }.getType());
        } catch (Exception e2) {
            ReleaseLogUtil.c("RequestHelper", "Exception is ", ExceptionUtils.c(e2));
            return new HashMap();
        }
    }

    public static String c(Object obj) {
        try {
            return c().toJson(obj);
        } catch (Exception e2) {
            ReleaseLogUtil.c("RequestHelper", "Exception is ", ExceptionUtils.c(e2));
            return "";
        }
    }

    public static String c(Map<String, String> map) {
        StringBuilder sb = new StringBuilder();
        boolean z = false;
        for (Map.Entry<String, String> entry : map.entrySet()) {
            if (z) {
                sb.append("&");
            }
            sb.append(entry.getKey());
            sb.append("=");
            sb.append(entry.getValue());
            z = true;
        }
        return sb.toString();
    }

    public static byte[] e(byte[] bArr) throws Throwable {
        GZIPOutputStream gZIPOutputStream;
        if (bArr == null) {
            return new byte[0];
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream((int) (((double) bArr.length) * 0.8d));
        GZIPOutputStream gZIPOutputStream2 = null;
        GZIPOutputStream gZIPOutputStream3 = null;
        try {
            try {
                gZIPOutputStream = new GZIPOutputStream(byteArrayOutputStream, bArr.length);
                try {
                    int length = bArr.length;
                    gZIPOutputStream.write(bArr, 0, length);
                    gZIPOutputStream.flush();
                    FileUtils.a(gZIPOutputStream);
                    gZIPOutputStream2 = length;
                } catch (IOException e2) {
                    e = e2;
                    gZIPOutputStream3 = gZIPOutputStream;
                    LogUtil.d("RequestHelper", "gzip error!", e.getMessage());
                    FileUtils.a(gZIPOutputStream3);
                    gZIPOutputStream2 = gZIPOutputStream3;
                } catch (Throwable th) {
                    th = th;
                    FileUtils.a(gZIPOutputStream);
                    byteArrayOutputStream.toByteArray();
                    FileUtils.a(byteArrayOutputStream);
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
                gZIPOutputStream = gZIPOutputStream2;
            }
        } catch (IOException e3) {
            e = e3;
        }
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        FileUtils.a(byteArrayOutputStream);
        return byteArray;
    }

    public static int d() {
        return e;
    }
}
