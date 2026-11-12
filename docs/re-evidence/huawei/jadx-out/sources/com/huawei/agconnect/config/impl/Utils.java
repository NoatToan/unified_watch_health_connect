package com.huawei.agconnect.config.impl;

import android.util.Log;
import com.huawei.agconnect.AGCRoutePolicy;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.io.Reader;
import java.io.StringWriter;
import java.io.Writer;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class Utils {
    private static final int BUFF_SIZE = 4096;
    public static final String DEFAULT_NAME = "DEFAULT_INSTANCE";
    private static final String TAG = "Utils";

    public static String toString(InputStream inputStream, String str) throws IOException {
        StringWriter stringWriter = new StringWriter();
        copy(new java.io.InputStreamReader(inputStream, str), stringWriter);
        return stringWriter.toString();
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0046  */
    public static AGCRoutePolicy getRoutePolicyFromJson(String str, String str2) {
        byte b2;
        if (str == null) {
            if (str2 != null) {
                if (str2.contains("connect-drcn")) {
                    return AGCRoutePolicy.CHINA;
                }
                if (str2.contains("connect-dre")) {
                    return AGCRoutePolicy.GERMANY;
                }
                if (str2.contains("connect-drru")) {
                    return AGCRoutePolicy.RUSSIA;
                }
                if (str2.contains("connect-dra")) {
                    return AGCRoutePolicy.SINGAPORE;
                }
            }
            return AGCRoutePolicy.UNKNOWN;
        }
        str.hashCode();
        int iHashCode = str.hashCode();
        if (iHashCode != 2155) {
            if (iHashCode != 2177) {
                if (iHashCode != 2627) {
                    if (iHashCode == 2644 && str.equals("SG")) {
                        b2 = 3;
                    } else {
                        b2 = -1;
                    }
                } else if (str.equals("RU")) {
                    b2 = 2;
                } else {
                    b2 = -1;
                }
            } else if (str.equals("DE")) {
                b2 = 1;
            } else {
                b2 = -1;
            }
        } else if (str.equals("CN")) {
            b2 = 0;
        } else {
            b2 = -1;
        }
        if (b2 == 0) {
            return AGCRoutePolicy.CHINA;
        }
        if (b2 == 1) {
            return AGCRoutePolicy.GERMANY;
        }
        if (b2 != 2) {
            return b2 != 3 ? AGCRoutePolicy.UNKNOWN : AGCRoutePolicy.SINGAPORE;
        }
        return AGCRoutePolicy.RUSSIA;
    }

    public static String fixPath(String str) {
        int i = 0;
        if (str.length() > 0) {
            while (str.charAt(i) == '/') {
                i++;
            }
        }
        return "/" + str.substring(i);
    }

    public static Map<String, String> fixKeyPathMap(Map<String, String> map) {
        HashMap map2 = new HashMap();
        for (Map.Entry<String, String> entry : map.entrySet()) {
            map2.put(fixPath(entry.getKey()), entry.getValue());
        }
        return map2;
    }

    public static void copy(Reader reader, Writer writer, char[] cArr) throws IOException {
        while (true) {
            int i = reader.read(cArr);
            if (-1 == i) {
                return;
            } else {
                writer.write(cArr, 0, i);
            }
        }
    }

    public static void copy(Reader reader, Writer writer) throws IOException {
        copy(reader, writer, new char[4096]);
    }

    public static void closeQuietly(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException unused) {
                Log.e("Utils", "Exception when closing the 'Closeable'.");
            }
        }
    }
}
