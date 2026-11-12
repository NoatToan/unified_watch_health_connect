package com.xiaomi.ai.edge.persist;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import defpackage.aqe;
import defpackage.qpe;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.Reader;
import java.util.zip.GZIPInputStream;
import java.util.zip.GZIPOutputStream;

/* JADX INFO: loaded from: classes7.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final qpe f11035a = aqe.f(a.class);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static int f11036b = 8192;

    public static Gson a() {
        return new GsonBuilder().excludeFieldsWithModifiers(new int[0]).create();
    }

    public static EdgePersistData b(InputStream inputStream) {
        if (inputStream == null) {
            return null;
        }
        try {
            GZIPInputStream gZIPInputStream = new GZIPInputStream(inputStream, f11036b);
            EdgePersistData edgePersistData = (EdgePersistData) a().fromJson((Reader) new InputStreamReader(gZIPInputStream), EdgePersistData.class);
            gZIPInputStream.close();
            if (edgePersistData == null || !"1.0.135".equals(edgePersistData.version)) {
                return null;
            }
            return edgePersistData;
        } catch (Exception e) {
            f11035a.info("occur exception when deserialize: ", (Throwable) e);
            return null;
        }
    }

    public static boolean c(EdgePersistData edgePersistData, OutputStream outputStream) {
        if (edgePersistData != null && outputStream != null) {
            try {
                long jCurrentTimeMillis = System.currentTimeMillis();
                String json = a().toJson(edgePersistData);
                qpe qpeVar = f11035a;
                qpeVar.info("[serializeData] convert into json str cost: " + (System.currentTimeMillis() - jCurrentTimeMillis));
                long jCurrentTimeMillis2 = System.currentTimeMillis();
                d(json, outputStream);
                qpeVar.info("[serializeData] write to file cost: " + (System.currentTimeMillis() - jCurrentTimeMillis2));
                return true;
            } catch (Exception e) {
                f11035a.info("occur exception when serialize: ", (Throwable) e);
            }
        }
        return false;
    }

    public static void d(String str, OutputStream outputStream) throws IOException {
        GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(outputStream, f11036b);
        try {
            try {
                gZIPOutputStream.write(str.getBytes());
                gZIPOutputStream.close();
            } catch (IOException e) {
                throw e;
            }
        } catch (Throwable th) {
            gZIPOutputStream.close();
            throw th;
        }
    }
}
